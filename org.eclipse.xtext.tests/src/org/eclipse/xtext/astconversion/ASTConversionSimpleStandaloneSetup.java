package org.eclipse.xtext.astconversion;

/**
 * @author niklas - Initial contribution and API
 */
public class ASTConversionSimpleStandaloneSetup extends ASTConversionSimpleStandaloneSetupGenerated {
	public static void doSetup() {
		new ASTConversionSimpleStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
