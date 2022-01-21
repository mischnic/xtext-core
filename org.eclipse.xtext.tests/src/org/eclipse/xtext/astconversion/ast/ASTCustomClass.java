package org.eclipse.xtext.astconversion.ast;

/**
 * @author niklas - Initial contribution and API
 */
public class ASTCustomClass implements ASTEntry {
	public String name;
	public String type;

	public ASTCustomClass() {
	}

	public ASTCustomClass(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
}
