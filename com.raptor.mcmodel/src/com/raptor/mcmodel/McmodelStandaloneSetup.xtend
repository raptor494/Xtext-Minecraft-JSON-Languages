/*
 * generated by Xtext 2.21.0
 */
package com.raptor.mcmodel


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class McmodelStandaloneSetup extends McmodelStandaloneSetupGenerated {

	def static void doSetup() {
		new McmodelStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}