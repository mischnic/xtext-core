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
import org.eclipse.xtext.astconversion.ast.ASTProgram;
import org.eclipse.xtext.astconversion.ast.ASTReference;
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
	public void testGeneratedASTClass() throws Exception {
		assertClass(ASTAutoClass.class,
				toMap(new Object[][] { { "ref1", ASTReference.class }, { "name1", String.class }, }));
		assertClass(ASTAutoExplicitClass.class, toMap(new Object[][] { { "name2", String.class }, }));
		assertTrue(ASTEntry.class.isInterface());
		assertClass(ASTManualClass.class,
				toMap(new Object[][] { { "ref", ASTReference.class }, { "value", String.class }, }));
		assertClass(ASTProgram.class, toMap(new Object[][] { { "entries", List.class } }));
		assertClass(ASTReference.class, toMap(new Object[][] { { "name", String.class }, }));
	}

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
