/*
 * generated by Xtext
 */
package org.eclipse.xtext.astconversion.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ASTConversionSimpleGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.astconversion.ASTConversionSimple.Program");
		private final Assignment cEntriesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cEntriesEntryParserRuleCall_0 = (RuleCall)cEntriesAssignment.eContents().get(0);
		
		//Program becomes:
		//	entries+=Entry+;
		@Override public ParserRule getRule() { return rule; }
		
		//entries+=Entry+
		public Assignment getEntriesAssignment() { return cEntriesAssignment; }
		
		//Entry
		public RuleCall getEntriesEntryParserRuleCall_0() { return cEntriesEntryParserRuleCall_0; }
	}
	public class EntryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.astconversion.ASTConversionSimple.Entry");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAutoClassParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAutoExplicitClassParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cManualClassParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cCustomASTClassParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cCustomCopyASTClassParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//Entry becomes:
		//	AutoClass | AutoExplicitClass | ManualClass | CustomASTClass | CustomCopyASTClass;
		@Override public ParserRule getRule() { return rule; }
		
		//AutoClass | AutoExplicitClass | ManualClass | CustomASTClass | CustomCopyASTClass
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AutoClass
		public RuleCall getAutoClassParserRuleCall_0() { return cAutoClassParserRuleCall_0; }
		
		//AutoExplicitClass
		public RuleCall getAutoExplicitClassParserRuleCall_1() { return cAutoExplicitClassParserRuleCall_1; }
		
		//ManualClass
		public RuleCall getManualClassParserRuleCall_2() { return cManualClassParserRuleCall_2; }
		
		//CustomASTClass
		public RuleCall getCustomASTClassParserRuleCall_3() { return cCustomASTClassParserRuleCall_3; }
		
		//CustomCopyASTClass
		public RuleCall getCustomCopyASTClassParserRuleCall_4() { return cCustomCopyASTClassParserRuleCall_4; }
	}
	public class AutoClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.astconversion.ASTConversionSimple.AutoClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAutoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRef1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRef1ReferenceParserRuleCall_1_0 = (RuleCall)cRef1Assignment_1.eContents().get(0);
		private final Assignment cName1Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cName1IDTerminalRuleCall_2_0 = (RuleCall)cName1Assignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//AutoClass becomes:
		//	"auto" ref1=Reference name1=ID ";";
		@Override public ParserRule getRule() { return rule; }
		
		//"auto" ref1=Reference name1=ID ";"
		public Group getGroup() { return cGroup; }
		
		//"auto"
		public Keyword getAutoKeyword_0() { return cAutoKeyword_0; }
		
		//ref1=Reference
		public Assignment getRef1Assignment_1() { return cRef1Assignment_1; }
		
		//Reference
		public RuleCall getRef1ReferenceParserRuleCall_1_0() { return cRef1ReferenceParserRuleCall_1_0; }
		
		//name1=ID
		public Assignment getName1Assignment_2() { return cName1Assignment_2; }
		
		//ID
		public RuleCall getName1IDTerminalRuleCall_2_0() { return cName1IDTerminalRuleCall_2_0; }
		
		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class AutoExplicitClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.astconversion.ASTConversionSimple.AutoExplicitClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAutoExplicitKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRef2Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRef2ReferenceParserRuleCall_1_0 = (RuleCall)cRef2Assignment_1.eContents().get(0);
		private final Assignment cName2Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cName2IDTerminalRuleCall_2_0 = (RuleCall)cName2Assignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//AutoExplicitClass becomes (name2):
		//	"auto-explicit" ref2=Reference name2=ID ";";
		@Override public ParserRule getRule() { return rule; }
		
		//"auto-explicit" ref2=Reference name2=ID ";"
		public Group getGroup() { return cGroup; }
		
		//"auto-explicit"
		public Keyword getAutoExplicitKeyword_0() { return cAutoExplicitKeyword_0; }
		
		//ref2=Reference
		public Assignment getRef2Assignment_1() { return cRef2Assignment_1; }
		
		//Reference
		public RuleCall getRef2ReferenceParserRuleCall_1_0() { return cRef2ReferenceParserRuleCall_1_0; }
		
		//name2=ID
		public Assignment getName2Assignment_2() { return cName2Assignment_2; }
		
		//ID
		public RuleCall getName2IDTerminalRuleCall_2_0() { return cName2IDTerminalRuleCall_2_0; }
		
		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class ManualClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.astconversion.ASTConversionSimple.ManualClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cManualKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRef3Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRef3ReferenceParserRuleCall_1_0 = (RuleCall)cRef3Assignment_1.eContents().get(0);
		private final Assignment cName3Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cName3IDTerminalRuleCall_2_0 = (RuleCall)cName3Assignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ManualClass becomes («ASTReference» ref, String value) $$
		//	this.ref = children.ref3;
		//	this.value = node.getName3();
		//$$:
		//	"manual" ref3=Reference name3=ID ";";
		@Override public ParserRule getRule() { return rule; }
		
		//"manual" ref3=Reference name3=ID ";"
		public Group getGroup() { return cGroup; }
		
		//"manual"
		public Keyword getManualKeyword_0() { return cManualKeyword_0; }
		
		//ref3=Reference
		public Assignment getRef3Assignment_1() { return cRef3Assignment_1; }
		
		//Reference
		public RuleCall getRef3ReferenceParserRuleCall_1_0() { return cRef3ReferenceParserRuleCall_1_0; }
		
		//name3=ID
		public Assignment getName3Assignment_2() { return cName3Assignment_2; }
		
		//ID
		public RuleCall getName3IDTerminalRuleCall_2_0() { return cName3IDTerminalRuleCall_2_0; }
		
		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class CustomASTClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.astconversion.ASTConversionSimple.CustomASTClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCustomKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRef4Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRef4ReferenceParserRuleCall_1_0 = (RuleCall)cRef4Assignment_1.eContents().get(0);
		private final Assignment cName4Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cName4IDTerminalRuleCall_2_0 = (RuleCall)cName4Assignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//CustomASTClass becomes ASTCustomClass $$
		//	this.type = children.ref4.name;
		//	this.name = node.getName4();
		//$$:
		//	"custom" ref4=Reference name4=ID ";";
		@Override public ParserRule getRule() { return rule; }
		
		//"custom" ref4=Reference name4=ID ";"
		public Group getGroup() { return cGroup; }
		
		//"custom"
		public Keyword getCustomKeyword_0() { return cCustomKeyword_0; }
		
		//ref4=Reference
		public Assignment getRef4Assignment_1() { return cRef4Assignment_1; }
		
		//Reference
		public RuleCall getRef4ReferenceParserRuleCall_1_0() { return cRef4ReferenceParserRuleCall_1_0; }
		
		//name4=ID
		public Assignment getName4Assignment_2() { return cName4Assignment_2; }
		
		//ID
		public RuleCall getName4IDTerminalRuleCall_2_0() { return cName4IDTerminalRuleCall_2_0; }
		
		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class CustomCopyASTClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.astconversion.ASTConversionSimple.CustomCopyASTClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCustomCopyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRef4Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRef4ReferenceParserRuleCall_1_0 = (RuleCall)cRef4Assignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//CustomCopyASTClass becomes ASTCustomClass (name) $$
		//	this.type = children.ref4.name;
		//$$:
		//	"custom-copy" ref4=Reference name=ID ";";
		@Override public ParserRule getRule() { return rule; }
		
		//"custom-copy" ref4=Reference name=ID ";"
		public Group getGroup() { return cGroup; }
		
		//"custom-copy"
		public Keyword getCustomCopyKeyword_0() { return cCustomCopyKeyword_0; }
		
		//ref4=Reference
		public Assignment getRef4Assignment_1() { return cRef4Assignment_1; }
		
		//Reference
		public RuleCall getRef4ReferenceParserRuleCall_1_0() { return cRef4ReferenceParserRuleCall_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.astconversion.ASTConversionSimple.Reference");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Reference becomes:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	
	private final ProgramElements pProgram;
	private final EntryElements pEntry;
	private final AutoClassElements pAutoClass;
	private final AutoExplicitClassElements pAutoExplicitClass;
	private final ManualClassElements pManualClass;
	private final CustomASTClassElements pCustomASTClass;
	private final CustomCopyASTClassElements pCustomCopyASTClass;
	private final ReferenceElements pReference;
	
	public static class ASTConversion {
		public ASTConversion() {}
		
		public static class ProgramChildren {
			public java.util.List<org.eclipse.xtext.astconversion.ast.ASTEntry> entries;
		}
		public Object convertProgram(org.eclipse.xtext.astconversion.astConversionSimple.Program node, ProgramChildren children){
			return new org.eclipse.xtext.astconversion.ast.ASTProgram() {
				org.eclipse.xtext.astconversion.ast.ASTProgram XTEXT_INIT() {
					this.entries = children.entries;
					return this;
				}
			}.XTEXT_INIT();
		}
		public static class AutoClassChildren {
			public org.eclipse.xtext.astconversion.ast.ASTReference ref1;
		}
		public Object convertAutoClass(org.eclipse.xtext.astconversion.astConversionSimple.AutoClass node, AutoClassChildren children){
			return new org.eclipse.xtext.astconversion.ast.ASTAutoClass() {
				org.eclipse.xtext.astconversion.ast.ASTAutoClass XTEXT_INIT() {
					this.ref1 = children.ref1;
					this.name1 = node.getName1();
					return this;
				}
			}.XTEXT_INIT();
		}
		public static class AutoExplicitClassChildren {
			public org.eclipse.xtext.astconversion.ast.ASTReference ref2;
		}
		public Object convertAutoExplicitClass(org.eclipse.xtext.astconversion.astConversionSimple.AutoExplicitClass node, AutoExplicitClassChildren children){
			return new org.eclipse.xtext.astconversion.ast.ASTAutoExplicitClass() {
				org.eclipse.xtext.astconversion.ast.ASTAutoExplicitClass XTEXT_INIT() {
					this.name2 = node.getName2();
					return this;
				}
			}.XTEXT_INIT();
		}
		public static class ReferenceChildren {
		}
		public Object convertReference(org.eclipse.xtext.astconversion.astConversionSimple.Reference node, ReferenceChildren children){
			return new org.eclipse.xtext.astconversion.ast.ASTReference() {
				org.eclipse.xtext.astconversion.ast.ASTReference XTEXT_INIT() {
					this.name = node.getName();
					return this;
				}
			}.XTEXT_INIT();
		}
		public static class CustomCopyASTClassChildren {
			public org.eclipse.xtext.astconversion.ast.ASTReference ref4;
		}
		public Object convertCustomCopyASTClass(org.eclipse.xtext.astconversion.astConversionSimple.CustomCopyASTClass node, CustomCopyASTClassChildren children){
			return new org.eclipse.xtext.astconversion.ast.ASTCustomClass() {
				org.eclipse.xtext.astconversion.ast.ASTCustomClass XTEXT_INIT() {
					this.name = node.getName();
						this.type = children.ref4.name;
					return this;
				}
			}.XTEXT_INIT();
		}
		public static class CustomASTClassChildren {
			public org.eclipse.xtext.astconversion.ast.ASTReference ref4;
		}
		public Object convertCustomASTClass(org.eclipse.xtext.astconversion.astConversionSimple.CustomASTClass node, CustomASTClassChildren children){
			return new org.eclipse.xtext.astconversion.ast.ASTCustomClass() {
				org.eclipse.xtext.astconversion.ast.ASTCustomClass XTEXT_INIT() {
						this.type = children.ref4.name;
						this.name = node.getName4();
					return this;
				}
			}.XTEXT_INIT();
		}
		public static class ManualClassChildren {
			public org.eclipse.xtext.astconversion.ast.ASTReference ref3;
		}
		public Object convertManualClass(org.eclipse.xtext.astconversion.astConversionSimple.ManualClass node, ManualClassChildren children){
			return new org.eclipse.xtext.astconversion.ast.ASTManualClass() {
				org.eclipse.xtext.astconversion.ast.ASTManualClass XTEXT_INIT() {
						this.ref = children.ref3;
						this.value = node.getName3();
					return this;
				}
			}.XTEXT_INIT();
		}
	}
	
	private final Grammar grammar;
	private final ASTConversion astConversion;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ASTConversionSimpleGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.astConversion = new ASTConversion();
		this.gaTerminals = gaTerminals;
		this.pProgram = new ProgramElements();
		this.pEntry = new EntryElements();
		this.pAutoClass = new AutoClassElements();
		this.pAutoExplicitClass = new AutoExplicitClassElements();
		this.pManualClass = new ManualClassElements();
		this.pCustomASTClass = new CustomASTClassElements();
		this.pCustomCopyASTClass = new CustomCopyASTClassElements();
		this.pReference = new ReferenceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.astconversion.ASTConversionSimple".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}

	@Override
	public ASTConversion getASTConversion() {
		return astConversion;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Program becomes:
	//	entries+=Entry+;
	public ProgramElements getProgramAccess() {
		return pProgram;
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}
	
	//Entry becomes:
	//	AutoClass | AutoExplicitClass | ManualClass | CustomASTClass | CustomCopyASTClass;
	public EntryElements getEntryAccess() {
		return pEntry;
	}
	
	public ParserRule getEntryRule() {
		return getEntryAccess().getRule();
	}
	
	//AutoClass becomes:
	//	"auto" ref1=Reference name1=ID ";";
	public AutoClassElements getAutoClassAccess() {
		return pAutoClass;
	}
	
	public ParserRule getAutoClassRule() {
		return getAutoClassAccess().getRule();
	}
	
	//AutoExplicitClass becomes (name2):
	//	"auto-explicit" ref2=Reference name2=ID ";";
	public AutoExplicitClassElements getAutoExplicitClassAccess() {
		return pAutoExplicitClass;
	}
	
	public ParserRule getAutoExplicitClassRule() {
		return getAutoExplicitClassAccess().getRule();
	}
	
	//ManualClass becomes («ASTReference» ref, String value) $$
	//	this.ref = children.ref3;
	//	this.value = node.getName3();
	//$$:
	//	"manual" ref3=Reference name3=ID ";";
	public ManualClassElements getManualClassAccess() {
		return pManualClass;
	}
	
	public ParserRule getManualClassRule() {
		return getManualClassAccess().getRule();
	}
	
	//CustomASTClass becomes ASTCustomClass $$
	//	this.type = children.ref4.name;
	//	this.name = node.getName4();
	//$$:
	//	"custom" ref4=Reference name4=ID ";";
	public CustomASTClassElements getCustomASTClassAccess() {
		return pCustomASTClass;
	}
	
	public ParserRule getCustomASTClassRule() {
		return getCustomASTClassAccess().getRule();
	}
	
	//CustomCopyASTClass becomes ASTCustomClass (name) $$
	//	this.type = children.ref4.name;
	//$$:
	//	"custom-copy" ref4=Reference name=ID ";";
	public CustomCopyASTClassElements getCustomCopyASTClassAccess() {
		return pCustomCopyASTClass;
	}
	
	public ParserRule getCustomCopyASTClassRule() {
		return getCustomCopyASTClassAccess().getRule();
	}
	
	//Reference becomes:
	//	name=ID;
	public ReferenceElements getReferenceAccess() {
		return pReference;
	}
	
	public ParserRule getReferenceRule() {
		return getReferenceAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
