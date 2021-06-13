package org.eclipse.xtext.astconversion;

import org.eclipse.xtext.astconversion.ast.ASTAutoClass;
import org.eclipse.xtext.astconversion.ast.ASTAutoExplicitClass;
import org.eclipse.xtext.astconversion.ast.ASTCustomClass;
import org.eclipse.xtext.astconversion.ast.ASTManualClass;
import org.eclipse.xtext.astconversion.ast.ASTProgram;
import org.eclipse.xtext.tests.AbstractXtextTests;
import org.junit.Test;

/**
 * @author niklas - Initial contribution and API
 */
public class ASTConversionSimpleTest extends AbstractXtextTests {

	@Override
	public void setUp() throws Exception {
		super.setUp();
		with(ASTConversionSimpleStandaloneSetup.class);
	}

	String programCorrect = "auto t1 x; manual t2 y; auto-explicit t3 z; custom t4 u; custom-copy t5 v;";

	@Test
	public void testBasicASTConversion() throws Exception {
		ASTProgram root = (ASTProgram) getResourceFor(getAsStream(programCorrect)).getParseResult()
				.getRootASTElementConverted();

		assertEquals(5, root.entries.size());

		int i = 0;
		assertTrue(root.entries.get(i) instanceof ASTAutoClass);
		ASTAutoClass a = ((ASTAutoClass) root.entries.get(i));
		assertEquals("x", a.name1);
		assertEquals("t1", a.ref1.name);
		
		i++;
		assertTrue(root.entries.get(i) instanceof ASTManualClass);
		ASTManualClass b = ((ASTManualClass) root.entries.get(i));
		assertEquals("y", b.value);
		assertEquals("t2", b.ref.name);
		
		i++;
		assertTrue(root.entries.get(i) instanceof ASTAutoExplicitClass);
		ASTAutoExplicitClass c = ((ASTAutoExplicitClass) root.entries.get(i));
		assertEquals("z", c.name2);
		
		i++;
		assertTrue(root.entries.get(i) instanceof ASTCustomClass);
		ASTCustomClass d = ((ASTCustomClass) root.entries.get(i));
		assertEquals("u", d.name);
		assertEquals("t4", d.type);
		
		i++;
		assertTrue(root.entries.get(i) instanceof ASTCustomClass);
		ASTCustomClass e = ((ASTCustomClass) root.entries.get(i));
		assertEquals("v", e.name);
		assertEquals("t5", e.type);
	}
}