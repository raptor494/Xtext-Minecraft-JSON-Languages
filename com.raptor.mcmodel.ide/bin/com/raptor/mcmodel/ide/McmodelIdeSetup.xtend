/*
 * generated by Xtext 2.21.0
 */
package com.raptor.mcmodel.ide

import com.google.inject.Guice
import com.raptor.mcmodel.McmodelRuntimeModule
import com.raptor.mcmodel.McmodelStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class McmodelIdeSetup extends McmodelStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new McmodelRuntimeModule, new McmodelIdeModule))
	}
	
}
