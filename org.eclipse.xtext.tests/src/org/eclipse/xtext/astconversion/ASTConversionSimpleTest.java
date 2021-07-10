package org.eclipse.xtext.astconversion;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.xtext.astconversion.ast.ASTAutoClass;
import org.eclipse.xtext.astconversion.ast.ASTAutoExplicitClass;
import org.eclipse.xtext.astconversion.ast.ASTCustomClass;
import org.eclipse.xtext.astconversion.ast.ASTEntry;
import org.eclipse.xtext.astconversion.ast.ASTManualClass;
import org.eclipse.xtext.astconversion.ast.ASTOther;
import org.eclipse.xtext.astconversion.ast.ASTProgram;
import org.eclipse.xtext.astconversion.ast.ASTReference;
import org.eclipse.xtext.astconversion.astConversionSimple.Entry;
import org.eclipse.xtext.parser.IParseResult;
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

	String programCorrect = "auto t1 x; manual t2 y; auto-explicit t3 z; custom t4 u; custom-copy t5 v; other o auto t2 x;";

	@Test
	public void testGeneratedASTClass() throws Exception {
		assertClass(ASTAutoClass.class,
				toMap(new Object[][] { { "ref", ASTReference.class }, { "name", String.class } }));
		assertClass(ASTAutoExplicitClass.class, toMap(new Object[][] { { "name", String.class } }));

		// Ensure that Xtext has hoisted fields in the CST
		assertTrue(Entry.class.getMethod("getName") != null);
		assertTrue(ASTEntry.class.isInterface());

		assertClass(ASTManualClass.class,
				toMap(new Object[][] { { "ref", ASTReference.class }, { "value", String.class } }));
		assertClass(ASTOther.class, toMap(new Object[][] { { "name", String.class }, { "content", Object.class } }));

		assertClass(ASTProgram.class, toMap(new Object[][] { { "entries", List.class } }));
		assertClass(ASTReference.class, toMap(new Object[][] { { "name", String.class } }));
	}

	@Test
	public void testBasicASTConversion() throws Exception {
		IParseResult result = getResourceFor(getAsStream(programCorrect)).getParseResult();
		assertFalse(result.hasSyntaxErrors());
		ASTProgram root = (ASTProgram) result.getRootASTElementConverted();

		assertEquals(6, root.entries.size());

		int i = 0;
		ASTAutoClass a = ((ASTAutoClass) root.entries.get(i));
		assertEquals("x", a.name);
		assertEquals("t1", a.ref.name);

		i++;
		ASTManualClass b = ((ASTManualClass) root.entries.get(i));
		assertEquals("y", b.value);
		assertEquals("t2", b.ref.name);

		i++;
		ASTAutoExplicitClass c = ((ASTAutoExplicitClass) root.entries.get(i));
		assertEquals("z", c.name);

		i++;
		ASTCustomClass d = ((ASTCustomClass) root.entries.get(i));
		assertEquals("u", d.name);
		assertEquals("t4", d.type);

		i++;
		ASTCustomClass e = ((ASTCustomClass) root.entries.get(i));
		assertEquals("v", e.name);
		assertEquals("t5", e.type);

		i++;
		assertTrue(root.entries.get(i) instanceof ASTOther);
		ASTAutoClass f = (ASTAutoClass) ((ASTOther) root.entries.get(i)).content;
		assertEquals("x", f.name);
		assertEquals("t2", f.ref.name);
	}

	private void assertClass(Class<?> clazz, Map<String, Class<?>> expectedFields) {
		Field[] actualFields = clazz.getDeclaredFields();
		assertEquals(expectedFields.size(), actualFields.length);

		for (Field f : actualFields) {
			assertEquals(expectedFields.get(f.getName()), f.getType());
		}
	}

	@SuppressWarnings("unchecked")
	private <U, V> Map<U, V> toMap(Object[][] entries) {
		return (Map<U, V>) Stream.of(entries).collect(Collectors.toMap(data -> data[0], data -> data[1]));
	}
}
