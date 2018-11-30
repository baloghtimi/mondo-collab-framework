/*******************************************************************************
 * Copyright (c) 2010-2018, Gabor Bergmann, IncQuery Labs Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabor Bergmann - initial API and implementation
 *******************************************************************************/
package org.mondo.collaboration.security.lens.context;

import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.scope.QueryScope;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.scopes.SimpleLocalStorageBackend;
import org.eclipse.viatra.query.runtime.matchers.scopes.SimpleRuntimeContext;
import org.eclipse.viatra.query.runtime.matchers.scopes.tables.DisjointUnionTable;
import org.eclipse.viatra.query.runtime.matchers.scopes.tables.IIndexTable;
import org.eclipse.viatra.query.runtime.matchers.scopes.tables.SimpleBinaryTable;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.util.Direction;
import org.eclipse.viatra.query.runtime.tabular.TabularIndexHost;
import org.mondo.collaboration.security.lens.arbiter.LockArbiter;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter;
import org.mondo.collaboration.security.lens.context.keys.CollabLensModelInputKey;
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey;
import org.mondo.collaboration.security.lens.context.keys.WhichModel;
import org.mondo.collaboration.security.lens.context.manipulables.BaseKeyAwareManipulable;
import org.mondo.collaboration.security.lens.context.manipulables.DebuggableManipulableWrapper;
import org.mondo.collaboration.security.lens.context.manipulables.EObjectAttributeManipulator;
import org.mondo.collaboration.security.lens.context.manipulables.EObjectManipulator;
import org.mondo.collaboration.security.lens.context.manipulables.EObjectReferenceManipulator;
import org.mondo.collaboration.security.lens.context.manipulables.ResourceManipulator;
import org.mondo.collaboration.security.lens.context.manipulables.ResourceRootContentsManipulator;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence.UniqueIDScheme;
import org.mondo.collaboration.security.lens.emf.ModelFactInputKey;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;
import org.mondo.collaboration.security.lens.util.IManipulableRelation;

import com.google.common.collect.ImmutableMap;

/**
 * @author Gabor Bergmann
 *
 */
public class MondoLensHost extends TabularIndexHost {
    
    @Override
    protected boolean isQueryScopeEmulated(Class<? extends QueryScope> queryScopeClass) {
        return MondoLensScope.class.isAssignableFrom(queryScopeClass);
    }

    private SecurityArbiter arbiter;
    private LockArbiter lockArbiter;
    
    private Map<WhichModel, ModelIndexer> modelIndexers;


    public MondoLensHost(SecurityArbiter arbiter, LockArbiter lockArbiter, 
            ModelIndexer goldIndexer, ModelIndexer frontIndexer,
            UniqueIDScheme goldScheme, UniqueIDScheme frontScheme,
            boolean preinitCorrespondence) {
        super(new SimpleLocalStorageBackend(), new SimpleRuntimeContext(MondoLensMetaContext.INSTANCE));
        this.arbiter = arbiter;
        this.lockArbiter = lockArbiter;
        
        this.modelIndexers = new EnumMap<WhichModel, ModelIndexer>(ImmutableMap.of(
                WhichModel.FRONT, frontIndexer, 
                WhichModel.GOLD, goldIndexer));
        
        initTables();
        if (preinitCorrespondence) {
            Map<Object, Collection<EObject>> goldIndex = EObjectCorrespondence.applyObjectToUniqueIdentifier(goldIndexer, goldScheme);
            Map<Object, Collection<EObject>> frontIndex = EObjectCorrespondence.applyObjectToUniqueIdentifier(frontIndexer, frontScheme);
            EObjectCorrespondence.buildEObjectCorrespondenceTable(goldIndex, frontIndex, correspondenceTable);
        }
    }
    
    private Map<IInputKey, IIndexTable> queriables = new HashMap<IInputKey, IIndexTable>();
    private Map<IInputKey, IManipulableRelation> manipulables = new HashMap<IInputKey, IManipulableRelation>();
    private SimpleBinaryTable<EObject, EObject> correspondenceTable;

    private void initTables() {
        initQueriables();
        initManipulables();
    }
    
    private void initQueriables() {
        for (ModelFactInputKey factInputKey : ModelFactInputKey.values()) {
            for (WhichModel whichModel : WhichModel.values()) {
                initModelFactQueriable(factInputKey, whichModel);                
            }
        }
        correspondenceTable = 
                registerNewTable(new SimpleBinaryTable<>(CorrespondenceKey.EOBJECT, runtimeContext, true));
        queriables.put(CorrespondenceKey.EOBJECT, correspondenceTable);
    }

    protected void initModelFactQueriable(ModelFactInputKey factInputKey, WhichModel whichModel) {
        ModelIndexer modelIndexer = modelIndexers.get(whichModel);
        IIndexTable originalTable = modelIndexer.getLiveIndexRelations().get(factInputKey);

        CollabLensModelInputKey collabKey = new CollabLensModelInputKey(factInputKey, whichModel);
        DisjointUnionTable cloneTable = registerNewTable(new DisjointUnionTable(collabKey, runtimeContext));
        cloneTable.addChildTable(originalTable);
        
        queriables.put(collabKey, cloneTable);
    }
    
    

    private void initManipulables() {
        wrapForDebug(CorrespondenceKey.EOBJECT, 
                new IManipulableRelation() {
                    @Override
                    public Tuple assertTuple(Tuple seed) {
                        correspondenceTable.write(Direction.INSERT, (EObject) seed.get(0), (EObject) seed.get(1));
                        return seed;
                    }
                    @Override
                    public Tuple retractTuple(Tuple seed) {
                        correspondenceTable.write(Direction.DELETE, (EObject) seed.get(0), (EObject) seed.get(1));
                        return seed;
                    }
                }).putInto(manipulables);

        for (ModelFactInputKey modelFactKey : ModelFactInputKey.values()) {
            for (WhichModel whichModel : WhichModel.values()) {
                wrapForDebug(
                        new CollabLensModelInputKey(modelFactKey, whichModel), 
                        createManipulator(modelFactKey, modelIndexers.get(whichModel))
                ).putInto(manipulables);
            }
        }
    }

    
    

    private IManipulableRelation createManipulator(ModelFactInputKey modelFactKey, ModelIndexer model) {
        switch(modelFactKey) {
        case ATTRIBUTE_KEY:
            return new EObjectAttributeManipulator(model);
        case EOBJECT_KEY:
            return new EObjectManipulator(model);
        case REFERENCE_KEY:
            return new EObjectReferenceManipulator(model);
        case RESOURCE_KEY:
            return new ResourceManipulator(model);
        case RESOURCE_ROOT_CONTENTS_KEY:
            return new ResourceRootContentsManipulator(model);
        default:
            throw new IllegalArgumentException();
        }
    }


    private static BaseKeyAwareManipulable wrapForDebug(IInputKey key, IManipulableRelation wrapped) {
        return new DebuggableManipulableWrapper(wrapped, key);
    }

    public SecurityArbiter getArbiter() {
        return arbiter;
    }

    public LockArbiter getLockArbiter() {
        return lockArbiter;
    }

    public Map<WhichModel, ModelIndexer> getModelIndexers() {
        return modelIndexers;
    }

    public Map<IInputKey, IIndexTable> getQueriables() {
        return queriables;
    }

    public Map<IInputKey, IManipulableRelation> getManipulables() {
        return manipulables;
    }

    public SimpleBinaryTable<EObject, EObject> getCorrespondenceTable() {
        return correspondenceTable;
    }


    
}
