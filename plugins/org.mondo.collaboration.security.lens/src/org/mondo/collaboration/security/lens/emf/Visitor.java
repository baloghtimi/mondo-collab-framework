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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.base.comprehension.EMFVisitor;
import org.eclipse.viatra.query.runtime.matchers.scopes.tables.DefaultIndexTable;
import org.eclipse.viatra.query.runtime.matchers.scopes.tables.ITableWriterBinary;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.matchers.util.Direction;

class Visitor extends EMFVisitor {

	private final ModelIndexer modelIndexer;
	private final boolean isInsertion;
	private final Direction direction;
	private final boolean isNotification;

	public Visitor(ModelIndexer modelIndexer, boolean isInsertion, boolean isNotification) {
		super(true);
		this.modelIndexer = modelIndexer;
		this.isInsertion = isInsertion;
		this.isNotification = isNotification;
		
		this.direction = isInsertion ? Direction.INSERT : Direction.DELETE;
	}
	
	@Override
	public boolean pruneSubtrees(Resource source) {
		return true;
	}
	@Override
	public boolean pruneFeature(EStructuralFeature feature) {
		return false;
	}
	
	@Override
    public boolean avoidTransientContainmentLink(EObject source, EReference reference, EObject targetObject) {
	    return (!isNotification) && targetObject.eAdapters().contains(modelIndexer.adapter); 
    }
	
	@Override
	public void visitElement(EObject source) {
		Tuple t = Tuples.staticArityFlatTupleOf(source, source.eClass());
		updateIndex2(modelIndexer.indexedEObjects, t);
	}
	
	@Override
	public void visitResource(Resource resource) {
//		if (resource != modelIndexer.dummyResource)
//		{
			Tuple t = Tuples.staticArityFlatTupleOf(resource, modelIndexer.uriRelativiser.uriToRelativePath(resource.getURI()));
			updateIndex2(modelIndexer.indexedResources, t);
//		}
	}
	
	@Override
	public void visitTopElementInResource(Resource resource, EObject element) {
		if (element != null /*&& resource != modelIndexer.dummyResource*/)
		{
			Tuple t = Tuples.staticArityFlatTupleOf(resource, element);
			updateIndex2(modelIndexer.indexedResourceRootContents, t);
		}
	}

	@Override
	public void visitAttribute(EObject source, EAttribute feature, Object target) {
		updateFeature(modelIndexer.indexedEObjectAttributes, source, feature, target);
	}
	@Override
	public void visitInternalContainment(EObject source, EReference feature, EObject target) {
		updateFeature(modelIndexer.indexedEObjectReferences, source, feature, target);
	}
	@Override
	public void visitNonContainmentReference(EObject source, EReference feature, EObject target) {
		updateFeature(modelIndexer.indexedEObjectReferences, source, feature, target);
	}
	@Override
	public void visitProxyReference(EObject source, EReference reference, EObject targetObject, Integer position) {
		updateFeature(modelIndexer.indexedEObjectReferences, source, reference, targetObject);
	}
	
	public void updateFeature(EObject source, EStructuralFeature feature, Object target) {
		if (feature instanceof EAttribute)
			updateFeature(modelIndexer.indexedEObjectAttributes, source, feature, target);
		else if (feature instanceof EReference)
			updateFeature(modelIndexer.indexedEObjectReferences, source, feature, target);
	}
	private void updateFeature(DefaultIndexTable index, EObject source, EStructuralFeature feature, Object target) {
		if (
				target!=null && 
				!target.equals(feature.getDefaultValue()) && 
				feature.isChangeable() && 
				!feature.isDerived() && 
				(isNotification || source.eIsSet(feature))
		) {
			Tuple t = Tuples.staticArityFlatTupleOf(source, feature, target);
			index.write(direction, t);
		}
	}
	private <X,Y> void updateIndex2(final ITableWriterBinary<X,Y> index, Tuple t) {
		index.write(direction, (X) t.get(0), (Y) t.get(1));
	}
}