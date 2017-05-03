/*
 * generated by Xtext 2.11.0
 */
package org.mondo.collaboration.policy.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.mondo.collaboration.policy.RulesRuntimeModule
import org.mondo.collaboration.policy.RulesStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class RulesIdeSetup extends RulesStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new RulesRuntimeModule, new RulesIdeModule))
	}
	
}
