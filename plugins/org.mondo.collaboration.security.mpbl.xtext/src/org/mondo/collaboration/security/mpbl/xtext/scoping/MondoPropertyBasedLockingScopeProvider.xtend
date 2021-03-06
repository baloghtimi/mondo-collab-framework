/*
 * generated by Xtext 2.14.0
 */
package org.mondo.collaboration.security.mpbl.xtext.scoping

import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Binding
import org.eclipse.emf.ecore.EReference
import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Lock
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MondoPropertyBasedLockingScopeProvider extends AbstractMondoPropertyBasedLockingScopeProvider {

	def scope_Binding_param(Binding binding, EReference ref) {
		val lock = binding.eContainer as Lock
		return Scopes::scopeFor(lock.pattern.parameters)
	}
}
