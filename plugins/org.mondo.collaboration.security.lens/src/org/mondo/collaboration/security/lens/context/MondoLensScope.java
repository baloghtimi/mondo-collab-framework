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

import org.eclipse.viatra.query.runtime.api.scope.QueryScope;

/**
 * Scope for the query engine driving the lens transformations.
 * 
 * @author Bergmann Gabor
 *
 */
public abstract class MondoLensScope extends QueryScope {
	
//	private SecurityArbiter arbiter;
//	private LockArbiter lockArbiter;
//	private ModelIndexer goldIndexer;
//	private ModelIndexer frontIndexer;
//	private Map<CorrespondenceKey, IIndexTable> correspondenceTables;
//
//
//	public MondoLensScope(SecurityArbiter arbiter, LockArbiter lockArbiter, ModelIndexer goldIndexer, ModelIndexer frontIndexer, Map<CorrespondenceKey, IIndexTable> correspondenceTables) {
//		this.arbiter = arbiter;
//		this.lockArbiter = lockArbiter;
//		this.goldIndexer = goldIndexer;
//		this.frontIndexer = frontIndexer;
//		this.correspondenceTables = correspondenceTables;
//	}
//	
//
//	@Override
//	protected IEngineContext createEngineContext(ViatraQueryEngine engine, IIndexingErrorListener errorListener, org.apache.log4j.Logger logger) {
//		return new MondoLensEngineContext(this, engine, errorListener, logger);
//	}


//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((arbiter == null) ? 0 : arbiter.hashCode());
//		result = prime * result + ((correspondenceTables == null) ? 0 : correspondenceTables.hashCode());
//		result = prime * result + ((frontIndexer == null) ? 0 : frontIndexer.hashCode());
//		result = prime * result + ((goldIndexer == null) ? 0 : goldIndexer.hashCode());
//		return result;
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (!(obj instanceof MondoLensScope))
//			return false;
//		MondoLensScope other = (MondoLensScope) obj;
//		if (arbiter == null) {
//			if (other.arbiter != null)
//				return false;
//		} else if (!arbiter.equals(other.arbiter))
//			return false;
//		if (correspondenceTables == null) {
//			if (other.correspondenceTables != null)
//				return false;
//		} else if (!correspondenceTables.equals(other.correspondenceTables))
//			return false;
//		if (frontIndexer == null) {
//			if (other.frontIndexer != null)
//				return false;
//		} else if (!frontIndexer.equals(other.frontIndexer))
//			return false;
//		if (goldIndexer == null) {
//			if (other.goldIndexer != null)
//				return false;
//		} else if (!goldIndexer.equals(other.goldIndexer))
//			return false;
//		return true;
//	}


//	public SecurityArbiter getArbiter() {
//		return arbiter;
//	}
//
//	public LockArbiter getLockArbiter() {
//		return lockArbiter;
//	}
//
//
//	public ModelIndexer getGoldIndexer() {
//		return goldIndexer;
//	}
//
//
//	public ModelIndexer getFrontIndexer() {
//		return frontIndexer;
//	}
//
//	
//
//	public Map<CorrespondenceKey, IIndexTable> getCorrespondenceTables() {
//		return correspondenceTables;
//	}
//	
//	
//	private Map<IInputKey, ? extends IIndexTable> queriables;
//	public Map<IInputKey, ? extends IIndexTable> getQueriables() {
//		if (queriables == null) {
//			queriables = 
//					createQueriables(getArbiter(), getGoldIndexer(), getFrontIndexer(), getCorrespondenceTables());
//		}
//		return queriables;
//	}
//	private Map<IInputKey, ? extends IManipulableRelation> manipulables;
//	public Map<IInputKey, ? extends IManipulableRelation> getManipulables() {
//		if (manipulables == null) {
//			manipulables = 
//					createManipulables(getArbiter(), getGoldIndexer(), getFrontIndexer(), getCorrespondenceTables());
//		}
//		return manipulables;
//	}
////	
//	private Map<IInputKey, ? extends IIndexTable> createQueriables(SecurityArbiter arbiter,
//			ModelIndexer goldIndexer, ModelIndexer frontIndexer,
//			Map<CorrespondenceKey, IIndexTable> correspondenceTables) 
//	{
//		Map<IInputKey, IIndexTable> liveRelations = new HashMap<IInputKey, IIndexTable>();
//		
//		liveRelations.putAll(correspondenceTables);
//		
//		for (ModelFactInputKey factInputKey : ModelFactInputKey.values()) {
//            liveRelations.put(new CollabLensModelInputKey(factInputKey, WhichModel.GOLD), 
//                    goldIndexer.getLiveIndexRelations().get(factInputKey));
//            liveRelations.put(new CollabLensModelInputKey(factInputKey, WhichModel.FRONT), 
//                    frontIndexer.getLiveIndexRelations().get(factInputKey));
//        }
//		
//		for (Class<? extends Asset> assetClass : Asset.getKinds()) {
//			for (OperationKind op : OperationKind.values()) {
//				IIndexTable liveRelation = arbiter.getResultsAsLiveRelation(op, assetClass);
//				final SecurityJudgementKey key = new SecurityJudgementKey(op, assetClass);
//				liveRelations.put(key, liveRelation);
//			}
//		}		
//		return liveRelations;
//	}
//	
//	private Map<IInputKey, ? extends IManipulableRelation> createManipulables(SecurityArbiter arbiter,
//			ModelIndexer goldIndexer, ModelIndexer frontIndexer,
//			Map<CorrespondenceKey, LiveTable> correspondenceTables) 
//	{
//		Map<IInputKey, IManipulableRelation> manipulables = new HashMap<IInputKey, IManipulableRelation>();
//		
//		for (Entry<CorrespondenceKey, LiveTable> entry : correspondenceTables.entrySet()) {
//			wrapForDebug(entry.getKey(), entry.getValue()).putInto(manipulables);
//		}
//		for (ModelFactInputKey modelFactKey : ModelFactInputKey.values()) {
//            wrapForDebug(
//                    new CollabLensModelInputKey(modelFactKey, WhichModel.GOLD), 
//                    createManipulator(modelFactKey, goldIndexer)
//            ).putInto(manipulables);
//            wrapForDebug(
//                    new CollabLensModelInputKey(modelFactKey, WhichModel.FRONT), 
//                    createManipulator(modelFactKey, frontIndexer)
//            ).putInto(manipulables);
//        }
//				
//		return manipulables;
//	}

}
