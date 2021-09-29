package org.eclipse.xtext.astconversion;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.xtext.astconversion.ast.ASTActionNew;
import org.eclipse.xtext.astconversion.ast.ASTActionNewX;
import org.eclipse.xtext.astconversion.ast.ASTAddition;
import org.eclipse.xtext.astconversion.ast.ASTAutoClass;
import org.eclipse.xtext.astconversion.ast.ASTAutoExplicitClass;
import org.eclipse.xtext.astconversion.ast.ASTChangeKind;
import org.eclipse.xtext.astconversion.ast.ASTCustomClass;
import org.eclipse.xtext.astconversion.ast.ASTElement;
import org.eclipse.xtext.astconversion.ast.ASTEntry;
import org.eclipse.xtext.astconversion.ast.ASTLists;
import org.eclipse.xtext.astconversion.ast.ASTManualClass;
import org.eclipse.xtext.astconversion.ast.ASTMapEntry;
import org.eclipse.xtext.astconversion.ast.ASTMapEntryCustom;
import org.eclipse.xtext.astconversion.ast.ASTOther;
import org.eclipse.xtext.astconversion.ast.ASTProgram;
import org.eclipse.xtext.astconversion.ast.ASTReference;
import org.eclipse.xtext.astconversion.ast.ASTReturnsNewX;
import org.eclipse.xtext.astconversion.ast.ASTSequence;
import org.eclipse.xtext.astconversion.ast.NodeList;
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

	@Test
	public void testGeneratedASTClass() throws Exception {
		assertClassFields(ASTAutoClass.class,
				toMap(new Object[][] { { "ref", ASTReference.class }, { "name", String.class } }));
		assertSuperTypes(ASTAutoClass.class, Object.class, ASTEntry.class);

		assertClassFields(ASTAutoExplicitClass.class, toMap(new Object[][] { { "name", String.class } }));
		assertSuperTypes(ASTAutoExplicitClass.class, Object.class, ASTEntry.class);

		// Ensure that Xtext has hoisted fields in the CST
		assertTrue(Entry.class.getMethod("getName") != null);
		assertTrue(ASTEntry.class.isInterface());
		assertSuperTypes(ASTEntry.class, null);

		assertClassFields(ASTManualClass.class,
				toMap(new Object[][] { { "ref", ASTReference.class }, { "value", String.class } }));
		assertSuperTypes(ASTManualClass.class, Object.class, ASTEntry.class);

		assertClassFields(ASTOther.class,
				toMap(new Object[][] { { "name", String.class }, { "content", Object.class } }));
		assertSuperTypes(ASTOther.class, Object.class, ASTEntry.class);

		assertClassFields(ASTProgram.class, toMap(
				new Object[][] { { "entries", List.class }, { "sequence", List.class }, { "list", ASTLists.class }, {"returnsNew", ASTReturnsNewX.class}, {"actionNew", ASTActionNew.class }}));
		assertSuperTypes(ASTProgram.class, Object.class);

		assertClassFields(ASTReference.class, toMap(new Object[][] { { "name", String.class } }));
		assertSuperTypes(ASTReference.class, Object.class);

		assertClassFields(ASTElement.class, toMap(
				new Object[][] { { "name", String.class }, { "type", ASTChangeKind.class }, { "value", List.class } }));
		assertSuperTypes(ASTElement.class, Object.class, ASTEntry.class);

		assertClassFields(ASTChangeKind.class, toMap(new Object[][] { { "ADD", ASTChangeKind.class },
				{ "REMOVE", ASTChangeKind.class }, { "MOVE", ASTChangeKind.class } }));
		assertTrue(ASTChangeKind.class.isEnum());
		assertSuperTypes(ASTChangeKind.class, Enum.class);

		assertClassFields(ASTSequence.class, toMap(new Object[][] { { "expressions", List.class } }));
		assertSuperTypes(ASTSequence.class, Object.class);

		assertClassFields(ASTAddition.class, toMap(new Object[][] { { "left", String.class }, { "right", String.class } }));
		assertSuperTypes(ASTAddition.class, ASTSequence.class);

		assertClassFields(ASTLists.class, toMap(
				new Object[][] { { "a", List.class }, { "b", NodeList.class }, { "c", List.class }, { "d", List.class } }));
		assertSuperTypes(ASTLists.class, Object.class);
		assertClassFields(ASTMapEntry.class, toMap(new Object[][] { { "x", String.class }, { "y", int.class } }));
		assertSuperTypes(ASTMapEntry.class, Object.class);
		assertClassFields(ASTMapEntryCustom.class,
				toMap(new Object[][] { { "x", String.class }, { "y", String.class } }));
		assertSuperTypes(ASTMapEntryCustom.class, Object.class);
		
		assertClassFields(ASTActionNew.class,
				toMap(new Object[][] { }));
		assertClassFields(ASTActionNewX.class,
				toMap(new Object[][] { { "value", String.class } }));
		assertSuperTypes(ASTActionNewX.class, ASTActionNew.class);
		
		assertClassFields(ASTReturnsNewX.class,
				toMap(new Object[][] { { "value", String.class } }));
		assertSuperTypes(ASTReturnsNewX.class, Object.class);
	}

	private static final String programCorrect = "auto t1 x; manual t2 y; auto-explicit t3 z; custom t4 u;"
			+ "custom-copy t5 v; other o auto t2 x; element x = add remove; element y remove = move;"
			+ "sequence a + b; sequence u + v w + x; returns-new a; action-new b;"
			+ "[a, b]: 4; [c, d]: e; [f, g, h]: 4 [i]: 6; [j, k]: l [m, n, o]: p;";

	@Test
	public void testBasicASTConversion() throws Exception {
		IParseResult result = getResourceFor(getAsStream(programCorrect)).getParseResult();
		assertFalse(result.hasSyntaxErrors());
		ASTProgram root = (ASTProgram) result.getRootASTElementConverted();

		int i = 0;
		{
			ASTAutoClass node = ((ASTAutoClass) root.entries.get(i));
			assertEquals("x", node.name);
			assertEquals("t1", node.ref.name);
		}

		i++;
		{
			ASTManualClass node = ((ASTManualClass) root.entries.get(i));
			assertEquals("y", node.value);
			assertEquals("t2", node.ref.name);
		}

		i++;
		{
			ASTAutoExplicitClass node = ((ASTAutoExplicitClass) root.entries.get(i));
			assertEquals("z", node.name);
		}

		i++;
		{
			ASTCustomClass node = ((ASTCustomClass) root.entries.get(i));
			assertEquals("u", node.name);
			assertEquals("t4", node.type);
		}

		i++;
		{
			ASTCustomClass node = ((ASTCustomClass) root.entries.get(i));
			assertEquals("v", node.name);
			assertEquals("t5", node.type);
		}

		i++;
		{
			ASTAutoClass node = (ASTAutoClass) ((ASTOther) root.entries.get(i)).content;
			assertEquals("x", node.name);
			assertEquals("t2", node.ref.name);
		}

		i++;
		{
			ASTElement node = (ASTElement) root.entries.get(i);
			assertEquals("x", node.name);
			assertEquals(ASTChangeKind.ADD, node.type);
			assertEquals(Arrays.asList(ASTChangeKind.ADD, ASTChangeKind.REMOVE), node.value);
		}

		i++;
		{
			ASTElement node = (ASTElement) root.entries.get(i);
			assertEquals("y", node.name);
			assertEquals(ASTChangeKind.REMOVE, node.type);
			assertEquals(Arrays.asList(ASTChangeKind.MOVE), node.value);
		}
		assertEquals(i + 1, root.entries.size());

		i = 0;
		{
			ASTAddition node = (ASTAddition) root.sequence.get(i);
			assertEquals("a", node.left);
			assertEquals("b", node.right);
		}

		i++;
		{
			ASTSequence node = root.sequence.get(i);
			assertEquals(2, node.expressions.size());
			ASTAddition a = (ASTAddition) node.expressions.get(0);
			ASTAddition b = (ASTAddition) node.expressions.get(1);
			assertEquals("u", a.left);
			assertEquals("v", a.right);
			assertEquals("w", b.left);
			assertEquals("x", b.right);
		}
		assertEquals(i + 1, root.sequence.size());
		
		ASTReturnsNewX returnsNew = root.returnsNew;
		assertEquals("a", returnsNew.value);
		
		ASTActionNewX actionNew = (ASTActionNewX) root.actionNew;
		assertEquals("b", actionNew.value);

		ASTLists lists = root.list;
		assertEquals(2, lists.a.size());
		assertEquals("a", lists.a.get(0).x);
		assertEquals(4, lists.a.get(0).y);
		assertEquals("b", lists.a.get(1).x);
		assertEquals(4, lists.a.get(1).y);

		assertEquals(2, lists.b.size());
		assertEquals("c", lists.b.get(0).x);
		assertEquals("e", lists.b.get(0).y);
		assertEquals("d", lists.b.get(1).x);
		assertEquals("e", lists.b.get(1).y);

		assertEquals(4, lists.c.size());
		assertEquals("f", lists.c.get(0).x);
		assertEquals(4, lists.c.get(0).y);
		assertEquals("g", lists.c.get(1).x);
		assertEquals(4, lists.c.get(1).y);
		assertEquals("h", lists.c.get(2).x);
		assertEquals(4, lists.c.get(2).y);
		assertEquals("i", lists.c.get(3).x);
		assertEquals(6, lists.c.get(3).y);

		assertEquals(5, lists.d.size());
		assertEquals("j", lists.d.get(0).x);
		assertEquals("l", lists.d.get(0).y);
		assertEquals("k", lists.d.get(1).x);
		assertEquals("l", lists.d.get(1).y);
		assertEquals("m", lists.d.get(2).x);
		assertEquals("p", lists.d.get(2).y);
		assertEquals("n", lists.d.get(3).x);
		assertEquals("p", lists.d.get(3).y);
		assertEquals("o", lists.d.get(4).x);
		assertEquals("p", lists.d.get(4).y);
	}

	private void assertClassFields(Class<?> clazz, Map<String, Class<?>> expectedFields) {
		Field[] actualFields = clazz.getDeclaredFields();
		List<Field> publicFields = new ArrayList<>();
		for (Field f : actualFields) {
			if (Modifier.isPublic(f.getModifiers())) {
				publicFields.add(f);
			}
		}

		assertEquals(expectedFields.size(), publicFields.size());
		for (Field f : publicFields) {
			assertEquals(expectedFields.get(f.getName()), f.getType());
		}
	}

	public void assertSuperTypes(Class<?> clazz, Class<?> expectedSuperclass, Class<?>... expectedInterfaces) {
		assertSame(expectedSuperclass, clazz.getSuperclass());

		Class<?>[] actualInterfaces = clazz.getInterfaces();

		assertEquals(expectedInterfaces.length, actualInterfaces.length);
		List<Class<?>> expectedInterfacesList = Arrays.asList(expectedInterfaces);
		for (Class<?> c : actualInterfaces) {
			assertTrue(expectedInterfacesList.contains(c));
		}
	}

	@SuppressWarnings("unchecked")
	private <U, V> Map<U, V> toMap(Object[][] entries) {
		return (Map<U, V>) Stream.of(entries).collect(Collectors.toMap(data -> data[0], data -> data[1]));
	}
}
