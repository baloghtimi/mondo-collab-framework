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

package org.mondo.collaboration.security.lens.relational

import java.util.List
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples

/**
 * A tuple of variables associated with a manipulable base relation;
 * can be used both as precondition constraint and postcondition action (assert / retract).  
 */
@Data
public class ManipulableTemplate extends QueryTemplate {
		IInputKey key
		List<String> argumentVariables
		
		override getDeducedVariables() {
			argumentVariables
		}
		
		override apply(PBody body) {
			val Object[] valueArray = argumentVariables.map[body.getOrCreateVariableByName(it)]
			new TypeConstraint(body, Tuples.staticArityFlatTupleOf(valueArray), key)
		}
		
		def ActionStep asRetractAction() {
			return [performManipulation(key, argumentVariables, false)]
		}
		def ActionStep asAssertAction() {
			return [performManipulation(key, argumentVariables, true)]
		}
		
}