package org.mondo.collaboration.security.lens.test.ui.handlers;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.mondo.collaboration.security.lens.context.MondoLensRuntimeContext;
import org.mondo.collaboration.security.lens.context.MondoLensScope;

/**
 * @author Bergmann Gabor
 *
 */
public class LensContextTestHandler extends AbstractLensTestHandler {
    @Override
	protected void doTest(MondoLensScope scope, IFile policyFile, IFile goldFile, IFile frontFile,
			Resource policyResource, Resource goldResource, Resource frontResource) {
		MondoLensRuntimeContext runtimeContext = MondoLensRuntimeContext.create(null, scope);
		
		for (IInputKey key : runtimeContext.getInputKeys()) {
			System.out.println();
			System.out.println("-----------------");
			System.out.println("Tuples of key: " + key.getPrettyPrintableName());
			
			final Tuple nullSeed = Tuples.staticArityFlatTupleOf(new Object[key.getArity()]);
			for (Tuple tuple : runtimeContext.enumerateTuples(key, nullSeed)) {
				System.out.println("\t" + tuple);
			}
		}
	}
}
