/*
 * generated by Xtext 2.13.0
 */
package org.mondo.collaboration.policy.delegation


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DelegationStandaloneSetup extends DelegationStandaloneSetupGenerated {

	def static void doSetup() {
		new DelegationStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}