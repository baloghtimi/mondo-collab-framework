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

package org.mondo.collaboration.security.lens.context;

import java.util.Collection;

import org.eclipse.viatra.query.runtime.matchers.scopes.SimpleRuntimeContext;
import org.eclipse.viatra.query.runtime.matchers.scopes.tables.IIndexTable;

/**
 * @author Bergmann Gabor
 *
 */
public class MondoLensRuntimeContext extends SimpleRuntimeContext {

	private MondoLensEngineContext engineContext;

	private MondoLensRuntimeContext(MondoLensEngineContext engineContext, Collection<? extends IIndexTable> aggregatedTables) {
		super(MondoLensMetaContext.INSTANCE);
		this.engineContext = engineContext;
		
		for (IIndexTable table : aggregatedTables) {
			this.registerIndexTable(table);
		}
	}
	
	public static MondoLensRuntimeContext create(MondoLensEngineContext engineContext, MondoLensScope scope) {
		return new MondoLensRuntimeContext(engineContext, scope.getQueriables().values());
	}

//	@Override
//	public <V> V coalesceTraversals(Callable<V> callable) throws InvocationTargetException {
//		return engineContext.getBaseIndexInternal().coalesceTraversals(callable);
//	}
//
//	@Override
//	public boolean isCoalescing() {
//		return false;
//	}
//
//
//	@Override
//	public Object wrapElement(Object externalElement) {
//		return externalElement;
//	}
//
//	@Override
//	public Object unwrapElement(Object internalElement) {
//		return internalElement;
//	}
//
//	@Override
//	public Tuple wrapTuple(Tuple externalElements) {
//		return externalElements;
//	}
//
//	@Override
//	public Tuple unwrapTuple(Tuple internalElements) {
//		return internalElements;
//	}
//
//
//	public Set<IInputKey> getInputKeys() {
//		return this.aggregatedTables.keySet();
//	}
	
}
