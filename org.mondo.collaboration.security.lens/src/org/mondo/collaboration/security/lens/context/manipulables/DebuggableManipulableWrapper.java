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

package org.mondo.collaboration.security.lens.context.manipulables;

import org.eclipse.incquery.runtime.matchers.context.IInputKey;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.mondo.collaboration.security.lens.util.IManipulableRelation;

/**
 * Wrapper that logs manipulator activity.
 * @author Bergmann Gabor
 *
 */
public class DebuggableManipulableWrapper extends BaseKeyAwareManipulable {
	
	private IManipulableRelation wrappedManipulable;
	private IInputKey key;
	
	public DebuggableManipulableWrapper(IManipulableRelation wrappedManipulable, IInputKey key) {
		this.wrappedManipulable = wrappedManipulable;
		this.key = key;
	}
	
	@Override
	public Tuple retractTuple(Tuple seed) {
		final String seedString = seed.toString();
		final Tuple removedTuple = wrappedManipulable.retractTuple(seed);
		System.out.println(String.format("\t\t%25s\t\t-- %s --> %s", 
				getInputKey().getPrettyPrintableName(), 
				seedString, 
				removedTuple));
		return removedTuple;
	}

	@Override
	public Tuple assertTuple(Tuple seed) {
		final String seedString = seed.toString();
		Tuple insertedTuple = wrappedManipulable.assertTuple(seed);
		System.out.println(String.format("\t\t%25s\t\t++ %s --> %s", 
				getInputKey().getPrettyPrintableName(), 
				seedString, 
				insertedTuple));
		return insertedTuple;
	}

	@Override
	public IInputKey getInputKey() {
		return key;
	}

}
