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

package org.mondo.collaboration.security.lens.test.ui.handlers;

import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.mondo.collaboration.policy.rules.AccessControlModel;
import org.mondo.collaboration.policy.rules.Role;
import org.mondo.collaboration.policy.rules.User;
import org.mondo.collaboration.security.lens.arbiter.LockArbiter;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter;
import org.mondo.collaboration.security.lens.bx.RelationalLensXform;
import org.mondo.collaboration.security.lens.context.MondoLensScope;
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey;
import org.mondo.collaboration.security.lens.correspondence.DefaultEMFUniqueIDFunctions;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;
import org.mondo.collaboration.security.lens.util.LiveTable;

import com.google.inject.Injector;

/**
 * @author Bergmann Gabor
 *
 */
public abstract class AbstractLensTestHandler extends AbstractHandler {

	@Inject
	Injector injector;

	protected abstract void doTest(MondoLensScope scope, IFile policyFile, IFile goldFile, IFile frontFile, Resource policyResource, Resource goldResource,
			Resource frontResource) throws Exception;

	@Inject
	protected IResourceSetProvider resSetProvider;

	/**
	 * 
	 */
	public AbstractLensTestHandler() {
		super();
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
			List<? extends IAdaptable> selectionElements = ((IStructuredSelection) selection).toList();
			
			IFile policyFile = selectionElements.get(2).getAdapter(IFile.class);
			IFile goldFile = selectionElements.get(1).getAdapter(IFile.class);
			IFile frontFile = selectionElements.get(0).getAdapter(IFile.class);
			
			Resource policyResource = parseEMFResource(policyFile);
	        Resource goldResource = parseEMFResource(goldFile);
	        final ResourceSet goldResourceSet = goldResource.getResourceSet();
	        Resource frontResource = parseEMFResource(frontFile);
	        final ResourceSet frontResourceSet = frontResource.getResourceSet();
	        
	        User userFilter = null;
	
	        SecurityArbiter arbiter = SecurityArbiter.create(policyResource, goldResourceSet, userFilter);
	        LockArbiter lockArbiter = new LockArbiter(arbiter, null);
	        
	        // security container: parent folder of main resource?
	        final URI goldBaseURI = URI.createPlatformResourceURI(goldFile./*getParent().*/getFullPath().toString(), false);
			ModelIndexer goldIndexer = new ModelIndexer(
	        		goldBaseURI,
	        		goldResourceSet);
	        
			// security container: parent folder of main resource?
	        final URI frontBaseURI = URI.createPlatformResourceURI(frontFile./*getParent().*/getFullPath().toString(), false);
			ModelIndexer frontIndexer = new ModelIndexer(
	        		frontBaseURI,
	        		frontResourceSet);
	        
			Map<Object, Collection<EObject>> goldIDs = EObjectCorrespondence.applyObjectToUniqueIdentifier(goldIndexer, 
					DefaultEMFUniqueIDFunctions.forBaseURI(goldBaseURI));
			Map<Object, Collection<EObject>> frontIDs = EObjectCorrespondence.applyObjectToUniqueIdentifier(frontIndexer, 
					DefaultEMFUniqueIDFunctions.forBaseURI(frontBaseURI));
			LiveTable correspondenceTable = 
					EObjectCorrespondence.buildEObjectCorrespondenceTable(goldIDs, frontIDs);
	        Map<CorrespondenceKey, LiveTable> correspondenceTables = new EnumMap<CorrespondenceKey, LiveTable>(CorrespondenceKey.class);
	        correspondenceTables.put(CorrespondenceKey.EOBJECT, correspondenceTable);
	        //correspondenceTables.put(CorrespondenceKey.RESOURCE, new LiveTable());
	        
			MondoLensScope scope = new MondoLensScope(arbiter, lockArbiter, goldIndexer, frontIndexer, correspondenceTables);
			
			doTest(scope, policyFile, goldFile, frontFile, policyResource, goldResource, frontResource); 
		
		} catch (Exception ex) {
			throw new ExecutionException("Error in test handler", ex);
		}
		
		return null;
	}

	Resource parseEMFResource(IFile file) {
		ResourceSet resourceSet = resSetProvider.get(file.getProject());
	    URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), false);
	    return resourceSet.getResource(fileURI, true);
	}

	protected void printMatchSet(ViatraQueryMatcher<? extends IPatternMatch> matcher) {
		System.out.println("-----------------");
		System.out.println("Matches of query: " + matcher.getPatternName());
		for (IPatternMatch match : matcher.getAllMatches()) {
			System.out.println("\t" + match.prettyPrint());
		}
		System.out.println();
	}

	protected RelationalLensXform setupLensForBob(MondoLensScope scope, Resource policyResource) throws IllegalStateException {
		final AccessControlModel policyModel = (AccessControlModel) policyResource.getContents().get(0);
		User bobUser = null;
		for (Role role : policyModel.getRoles()) {
			if ("bob".equals(role.getName())) {
				bobUser = (User) role;
			}
		}
		if (bobUser == null) 
			throw new IllegalStateException("no bob found");
		
		RelationalLensXform lens = new RelationalLensXform(scope, bobUser, null);
		return lens;
	}

}