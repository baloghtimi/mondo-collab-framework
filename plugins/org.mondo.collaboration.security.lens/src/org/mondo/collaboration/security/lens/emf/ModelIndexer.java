/*******************************************************************************
 * Copyright (c) 2004-2015 Gabor Bergmann and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabor Bergmann - initial API and implementation
 *******************************************************************************/

package org.mondo.collaboration.security.lens.emf;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra.query.runtime.base.api.BaseIndexOptions;
import org.eclipse.viatra.query.runtime.base.api.IndexingLevel;
import org.eclipse.viatra.query.runtime.base.api.NavigationHelper;
import org.eclipse.viatra.query.runtime.base.comprehension.EMFModelComprehension;
import org.eclipse.viatra.query.runtime.matchers.scopes.tables.DefaultIndexTable;
import org.eclipse.viatra.query.runtime.matchers.scopes.tables.IIndexTable;
import org.eclipse.viatra.query.runtime.matchers.scopes.tables.ITableContext;
import org.eclipse.viatra.query.runtime.matchers.scopes.tables.ITableWriterBinary;
import org.eclipse.viatra.query.runtime.matchers.scopes.tables.SimpleBinaryTable;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.TupleMask;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.mondo.collaboration.security.lens.util.uri.URIRelativiser;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

/**
 * Indexes the contents of a given EMF model.
 * <p> The EMF model is indexed and exposed as {@link LiveTable}s.
 * 
 * @author Bergmann Gabor
 *
 */
public class ModelIndexer {
	private ResourceSet root;
	//private Resource unrootedElements = new XMIResourceImpl();
	private URI baseURI;
	NavigationHelper daisyChainedIndexer; // cheapMoveTo() is daisy-chained to this indexer
	
	EMFModelComprehension comprehension = new EMFModelComprehension(new BaseIndexOptions(false, IndexingLevel.FULL));
	URIRelativiser uriRelativiser;
	Set<EObject> unrootedObjects = new HashSet<>();
	
    ITableContext tableContext = new ITableContext() {
        
        @Override
        public void logError(String message) {
            System.err.println(message);
        }
    };

	
	
    ITableWriterBinary.Table<Resource, String> indexedResources = 
            new SimpleBinaryTable<>(ModelFactInputKey.RESOURCE_KEY, tableContext, true);
    ITableWriterBinary.Table<Resource, EObject>  indexedResourceRootContents = 
            new SimpleBinaryTable<>(ModelFactInputKey.RESOURCE_ROOT_CONTENTS_KEY, tableContext, true);
    ITableWriterBinary.Table<EObject, EClass>  indexedEObjects = 
            new SimpleBinaryTable<>(ModelFactInputKey.EOBJECT_KEY, tableContext, true); 
    DefaultIndexTable indexedEObjectReferences = 
	        new DefaultIndexTable(ModelFactInputKey.REFERENCE_KEY, tableContext, false);
	DefaultIndexTable indexedEObjectAttributes = 
            new DefaultIndexTable(ModelFactInputKey.ATTRIBUTE_KEY, tableContext, false);
	
	Map<ModelFactInputKey, IIndexTable> liveIndexTables = Maps.immutableEnumMap(ImmutableMap.of(
	        ModelFactInputKey.ATTRIBUTE_KEY,                  indexedEObjectAttributes,
            ModelFactInputKey.EOBJECT_KEY,                    indexedEObjects,
            ModelFactInputKey.REFERENCE_KEY,                  indexedEObjectReferences,
            ModelFactInputKey.RESOURCE_KEY,                   indexedResources,
            ModelFactInputKey.RESOURCE_ROOT_CONTENTS_KEY,     indexedResourceRootContents
	));
	Map<ModelFactInputKey, IIndexTable> liveIndexRelations = ImmutableMap.copyOf(liveIndexTables);
	
	
	
	public ModelIndexer(URI baseURI, ResourceSet root, NavigationHelper daisyChainedIndexer) {
		super();
		this.root = root;
		this.baseURI = baseURI;
		this.daisyChainedIndexer = daisyChainedIndexer;
		
		this.uriRelativiser = new URIRelativiser(baseURI);
		
		final EMFAdapter emfAdapter = new EMFAdapter(this);
		this.adapter = emfAdapter;
		
		emfAdapter.addAdapter(root);
		//emfAdapter.addAdapter(dummyResource);
	}
	public ModelIndexer(URI baseURI, ResourceSet root) {
		this(baseURI, root, null);
	}
	public URI getBaseURI() {
		return baseURI;
	}
	public URIRelativiser getUriRelativiser() {
		return uriRelativiser;
	}

	public ResourceSet getRoot() {
		return root;
	}
	
//	/**
//	 * A dummy resource that contains unrooted elements, 
//	 * 	i.e. model element created by a transformation but not yet placed in the actual containment hierarchy of the model, 
//	 * or elements removed from the containment hierarchy but not yet deleted.  
//	 */
//	public Resource getDummyResource() {
//		return dummyResource;
//	}
	
	public Map<ModelFactInputKey, IIndexTable> getLiveIndexTables() {
        return liveIndexTables;
    }
    public Map<ModelFactInputKey, IIndexTable> getLiveIndexRelations() {
        return liveIndexRelations;
    }



    EMFAdapter adapter;

	
    private static final TupleMask NONE_OF_TWO =    TupleMask.empty(2);
    private static final TupleMask NONE_OF_THREE =  TupleMask.empty(3);
    
	public Iterable<EObject> getAllEObjects() {
		Collection<EObject> objects = new HashSet<>();
		for (Tuple tuple : indexedEObjects.enumerateTuples(NONE_OF_TWO, Tuples.staticArityFlatTupleOf())) {
			objects.add((EObject) tuple.get(0));
		}
		for (Tuple tuple : indexedEObjectReferences.enumerateTuples(NONE_OF_THREE, Tuples.staticArityFlatTupleOf())) {
			objects.add((EObject) tuple.get(2));
		}
		return objects;
	}


	public void addUnrooted(EObject instance) {
		unrootedObjects.add(instance);
		adapter.addAdapter(instance);
	}

	public boolean removeUnrooted(EObject element) {
		boolean removed = unrootedObjects.remove(element);
		if (removed) {
			adapter.removeAdapter(element);
		} else { // not unrooted?
    		removeFromContainment(element);
		}
		return removed;
	}
	/**
	 * @param containedObject
	 */
	public void cheapUnroot(EObject element) {
    	if (element.eAdapters().contains(adapter)) {
     		adapter.ignoreInsertionAndDeletion = element;
	    	try {
	    		unrootedObjects.add(element);
	    		
	    		removeFromContainment(element);
//	    		if (daisyChainedIndexer == null)
//	    			targetContainmentReferenceList.add(element);
//	    		else 
//	    			daisyChainedIndexer.cheapMoveTo(element, targetContainmentReferenceList);
	    	} finally {
	        	adapter.ignoreInsertionAndDeletion = null;
	    	}
    	} else {
    		addUnrooted(element);
    	}
	}
	
	private void removeFromContainment(EObject element) {
		EObject eContainer = element.eContainer();
		if (eContainer != null) {
			EReference feature = element.eContainmentFeature();
			if (feature.isMany())
				((Collection<?>) eContainer.eGet(feature)).remove(element);
			else
				eContainer.eUnset(feature);
		}
		final Resource eResource = element.eResource();
		if (eResource != null) {
			eResource.getContents().remove(element);	    			
		}
	}

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public void cheapMoveTo(EObject element, Notifier parent, EList targetContainmentReferenceList) {
    	if (element.eAdapters().contains(adapter) && parent.eAdapters().contains(adapter)) {
     		adapter.ignoreInsertionAndDeletion = element;
	    	try {
	    		if (unrootedObjects.contains(element))
	    			unrootedObjects.remove(element);
	    		
	    		if (daisyChainedIndexer == null)
	    			targetContainmentReferenceList.add(element);
	    		else 
	    			daisyChainedIndexer.cheapMoveTo(element, targetContainmentReferenceList);
	    	} finally {
	        	adapter.ignoreInsertionAndDeletion = null;
	    	}
    	} else {
    		targetContainmentReferenceList.add(element);
    	}
    }
    
    @SuppressWarnings("rawtypes")
	public void cheapMoveTo(EObject element, EObject parent, EReference containmentFeature) {
    	if (containmentFeature.isMany())
    		cheapMoveTo(element, parent, (EList)parent.eGet(containmentFeature));
    	else if (element.eAdapters().contains(adapter) &&
    			parent.eAdapters().contains(adapter)) 
    	{
     		adapter.ignoreInsertionAndDeletion = element;
	    	try {
	    		if (unrootedObjects.contains(element))
	    			unrootedObjects.remove(element);
	    		
	    		if (daisyChainedIndexer == null)
	    			parent.eSet(containmentFeature, element);
	    		else 
	    			daisyChainedIndexer.cheapMoveTo(element, parent, containmentFeature);
	    	} finally {
	        	adapter.ignoreInsertionAndDeletion = null;
	    	}
		} else {
			parent.eSet(containmentFeature, element);
		}
    }

}
