package org.eclipse.xtext.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.services.XtextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXtextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_JAVA_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?'", "'*'", "'+'", "'='", "'+='", "'false'", "'true'", "'?='", "'grammar'", "'with'", "','", "'('", "')'", "'.'", "'generate'", "'as'", "'import'", "'@'", "':'", "';'", "'returns'", "'becomes'", "'<'", "'>'", "'::'", "'|'", "'&'", "'{'", "'}'", "'current'", "'!'", "'['", "']'", "'terminal'", "'->'", "'EOF'", "'..'", "'enum'", "'hidden'", "'fragment'", "'=>'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_JAVA_STRING=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalXtextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXtextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXtextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXtext.g"; }


    	private XtextGrammarAccess grammarAccess;

    	public void setGrammarAccess(XtextGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGrammar"
    // InternalXtext.g:53:1: entryRuleGrammar : ruleGrammar EOF ;
    public final void entryRuleGrammar() throws RecognitionException {
        try {
            // InternalXtext.g:54:1: ( ruleGrammar EOF )
            // InternalXtext.g:55:1: ruleGrammar EOF
            {
             before(grammarAccess.getGrammarRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGrammar();

            state._fsp--;

             after(grammarAccess.getGrammarRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // InternalXtext.g:62:1: ruleGrammar : ( ( rule__Grammar__Group__0 ) ) ;
    public final void ruleGrammar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:66:2: ( ( ( rule__Grammar__Group__0 ) ) )
            // InternalXtext.g:67:2: ( ( rule__Grammar__Group__0 ) )
            {
            // InternalXtext.g:67:2: ( ( rule__Grammar__Group__0 ) )
            // InternalXtext.g:68:3: ( rule__Grammar__Group__0 )
            {
             before(grammarAccess.getGrammarAccess().getGroup()); 
            // InternalXtext.g:69:3: ( rule__Grammar__Group__0 )
            // InternalXtext.g:69:4: rule__Grammar__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleGrammarID"
    // InternalXtext.g:78:1: entryRuleGrammarID : ruleGrammarID EOF ;
    public final void entryRuleGrammarID() throws RecognitionException {
        try {
            // InternalXtext.g:79:1: ( ruleGrammarID EOF )
            // InternalXtext.g:80:1: ruleGrammarID EOF
            {
             before(grammarAccess.getGrammarIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGrammarID();

            state._fsp--;

             after(grammarAccess.getGrammarIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrammarID"


    // $ANTLR start "ruleGrammarID"
    // InternalXtext.g:87:1: ruleGrammarID : ( ( rule__GrammarID__Group__0 ) ) ;
    public final void ruleGrammarID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:91:2: ( ( ( rule__GrammarID__Group__0 ) ) )
            // InternalXtext.g:92:2: ( ( rule__GrammarID__Group__0 ) )
            {
            // InternalXtext.g:92:2: ( ( rule__GrammarID__Group__0 ) )
            // InternalXtext.g:93:3: ( rule__GrammarID__Group__0 )
            {
             before(grammarAccess.getGrammarIDAccess().getGroup()); 
            // InternalXtext.g:94:3: ( rule__GrammarID__Group__0 )
            // InternalXtext.g:94:4: rule__GrammarID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GrammarID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrammarIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrammarID"


    // $ANTLR start "entryRuleAbstractRule"
    // InternalXtext.g:103:1: entryRuleAbstractRule : ruleAbstractRule EOF ;
    public final void entryRuleAbstractRule() throws RecognitionException {
        try {
            // InternalXtext.g:104:1: ( ruleAbstractRule EOF )
            // InternalXtext.g:105:1: ruleAbstractRule EOF
            {
             before(grammarAccess.getAbstractRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractRule();

            state._fsp--;

             after(grammarAccess.getAbstractRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractRule"


    // $ANTLR start "ruleAbstractRule"
    // InternalXtext.g:112:1: ruleAbstractRule : ( ( rule__AbstractRule__Alternatives ) ) ;
    public final void ruleAbstractRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:116:2: ( ( ( rule__AbstractRule__Alternatives ) ) )
            // InternalXtext.g:117:2: ( ( rule__AbstractRule__Alternatives ) )
            {
            // InternalXtext.g:117:2: ( ( rule__AbstractRule__Alternatives ) )
            // InternalXtext.g:118:3: ( rule__AbstractRule__Alternatives )
            {
             before(grammarAccess.getAbstractRuleAccess().getAlternatives()); 
            // InternalXtext.g:119:3: ( rule__AbstractRule__Alternatives )
            // InternalXtext.g:119:4: rule__AbstractRule__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractRule"


    // $ANTLR start "entryRuleAbstractMetamodelDeclaration"
    // InternalXtext.g:128:1: entryRuleAbstractMetamodelDeclaration : ruleAbstractMetamodelDeclaration EOF ;
    public final void entryRuleAbstractMetamodelDeclaration() throws RecognitionException {
        try {
            // InternalXtext.g:129:1: ( ruleAbstractMetamodelDeclaration EOF )
            // InternalXtext.g:130:1: ruleAbstractMetamodelDeclaration EOF
            {
             before(grammarAccess.getAbstractMetamodelDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractMetamodelDeclaration();

            state._fsp--;

             after(grammarAccess.getAbstractMetamodelDeclarationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractMetamodelDeclaration"


    // $ANTLR start "ruleAbstractMetamodelDeclaration"
    // InternalXtext.g:137:1: ruleAbstractMetamodelDeclaration : ( ( rule__AbstractMetamodelDeclaration__Alternatives ) ) ;
    public final void ruleAbstractMetamodelDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:141:2: ( ( ( rule__AbstractMetamodelDeclaration__Alternatives ) ) )
            // InternalXtext.g:142:2: ( ( rule__AbstractMetamodelDeclaration__Alternatives ) )
            {
            // InternalXtext.g:142:2: ( ( rule__AbstractMetamodelDeclaration__Alternatives ) )
            // InternalXtext.g:143:3: ( rule__AbstractMetamodelDeclaration__Alternatives )
            {
             before(grammarAccess.getAbstractMetamodelDeclarationAccess().getAlternatives()); 
            // InternalXtext.g:144:3: ( rule__AbstractMetamodelDeclaration__Alternatives )
            // InternalXtext.g:144:4: rule__AbstractMetamodelDeclaration__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractMetamodelDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractMetamodelDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractMetamodelDeclaration"


    // $ANTLR start "entryRuleGeneratedMetamodel"
    // InternalXtext.g:153:1: entryRuleGeneratedMetamodel : ruleGeneratedMetamodel EOF ;
    public final void entryRuleGeneratedMetamodel() throws RecognitionException {
        try {
            // InternalXtext.g:154:1: ( ruleGeneratedMetamodel EOF )
            // InternalXtext.g:155:1: ruleGeneratedMetamodel EOF
            {
             before(grammarAccess.getGeneratedMetamodelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGeneratedMetamodel();

            state._fsp--;

             after(grammarAccess.getGeneratedMetamodelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneratedMetamodel"


    // $ANTLR start "ruleGeneratedMetamodel"
    // InternalXtext.g:162:1: ruleGeneratedMetamodel : ( ( rule__GeneratedMetamodel__Group__0 ) ) ;
    public final void ruleGeneratedMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:166:2: ( ( ( rule__GeneratedMetamodel__Group__0 ) ) )
            // InternalXtext.g:167:2: ( ( rule__GeneratedMetamodel__Group__0 ) )
            {
            // InternalXtext.g:167:2: ( ( rule__GeneratedMetamodel__Group__0 ) )
            // InternalXtext.g:168:3: ( rule__GeneratedMetamodel__Group__0 )
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getGroup()); 
            // InternalXtext.g:169:3: ( rule__GeneratedMetamodel__Group__0 )
            // InternalXtext.g:169:4: rule__GeneratedMetamodel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratedMetamodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneratedMetamodel"


    // $ANTLR start "entryRuleReferencedMetamodel"
    // InternalXtext.g:178:1: entryRuleReferencedMetamodel : ruleReferencedMetamodel EOF ;
    public final void entryRuleReferencedMetamodel() throws RecognitionException {
        try {
            // InternalXtext.g:179:1: ( ruleReferencedMetamodel EOF )
            // InternalXtext.g:180:1: ruleReferencedMetamodel EOF
            {
             before(grammarAccess.getReferencedMetamodelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleReferencedMetamodel();

            state._fsp--;

             after(grammarAccess.getReferencedMetamodelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReferencedMetamodel"


    // $ANTLR start "ruleReferencedMetamodel"
    // InternalXtext.g:187:1: ruleReferencedMetamodel : ( ( rule__ReferencedMetamodel__Group__0 ) ) ;
    public final void ruleReferencedMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:191:2: ( ( ( rule__ReferencedMetamodel__Group__0 ) ) )
            // InternalXtext.g:192:2: ( ( rule__ReferencedMetamodel__Group__0 ) )
            {
            // InternalXtext.g:192:2: ( ( rule__ReferencedMetamodel__Group__0 ) )
            // InternalXtext.g:193:3: ( rule__ReferencedMetamodel__Group__0 )
            {
             before(grammarAccess.getReferencedMetamodelAccess().getGroup()); 
            // InternalXtext.g:194:3: ( rule__ReferencedMetamodel__Group__0 )
            // InternalXtext.g:194:4: rule__ReferencedMetamodel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferencedMetamodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferencedMetamodel"


    // $ANTLR start "entryRuleAnnotation"
    // InternalXtext.g:203:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalXtext.g:204:1: ( ruleAnnotation EOF )
            // InternalXtext.g:205:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalXtext.g:212:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:216:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalXtext.g:217:2: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalXtext.g:217:2: ( ( rule__Annotation__Group__0 ) )
            // InternalXtext.g:218:3: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // InternalXtext.g:219:3: ( rule__Annotation__Group__0 )
            // InternalXtext.g:219:4: rule__Annotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Annotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleParserRule"
    // InternalXtext.g:228:1: entryRuleParserRule : ruleParserRule EOF ;
    public final void entryRuleParserRule() throws RecognitionException {
        try {
            // InternalXtext.g:229:1: ( ruleParserRule EOF )
            // InternalXtext.g:230:1: ruleParserRule EOF
            {
             before(grammarAccess.getParserRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParserRule();

            state._fsp--;

             after(grammarAccess.getParserRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParserRule"


    // $ANTLR start "ruleParserRule"
    // InternalXtext.g:237:1: ruleParserRule : ( ( rule__ParserRule__Group__0 ) ) ;
    public final void ruleParserRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:241:2: ( ( ( rule__ParserRule__Group__0 ) ) )
            // InternalXtext.g:242:2: ( ( rule__ParserRule__Group__0 ) )
            {
            // InternalXtext.g:242:2: ( ( rule__ParserRule__Group__0 ) )
            // InternalXtext.g:243:3: ( rule__ParserRule__Group__0 )
            {
             before(grammarAccess.getParserRuleAccess().getGroup()); 
            // InternalXtext.g:244:3: ( rule__ParserRule__Group__0 )
            // InternalXtext.g:244:4: rule__ParserRule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParserRule"


    // $ANTLR start "entryRuleBecomesDecl"
    // InternalXtext.g:253:1: entryRuleBecomesDecl : ruleBecomesDecl EOF ;
    public final void entryRuleBecomesDecl() throws RecognitionException {
        try {
            // InternalXtext.g:254:1: ( ruleBecomesDecl EOF )
            // InternalXtext.g:255:1: ruleBecomesDecl EOF
            {
             before(grammarAccess.getBecomesDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBecomesDecl();

            state._fsp--;

             after(grammarAccess.getBecomesDeclRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBecomesDecl"


    // $ANTLR start "ruleBecomesDecl"
    // InternalXtext.g:262:1: ruleBecomesDecl : ( ( rule__BecomesDecl__Group__0 ) ) ;
    public final void ruleBecomesDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:266:2: ( ( ( rule__BecomesDecl__Group__0 ) ) )
            // InternalXtext.g:267:2: ( ( rule__BecomesDecl__Group__0 ) )
            {
            // InternalXtext.g:267:2: ( ( rule__BecomesDecl__Group__0 ) )
            // InternalXtext.g:268:3: ( rule__BecomesDecl__Group__0 )
            {
             before(grammarAccess.getBecomesDeclAccess().getGroup()); 
            // InternalXtext.g:269:3: ( rule__BecomesDecl__Group__0 )
            // InternalXtext.g:269:4: rule__BecomesDecl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BecomesDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBecomesDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBecomesDecl"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXtext.g:278:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalXtext.g:279:1: ( ruleQualifiedName EOF )
            // InternalXtext.g:280:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalXtext.g:287:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:291:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalXtext.g:292:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalXtext.g:292:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalXtext.g:293:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalXtext.g:294:3: ( rule__QualifiedName__Group__0 )
            // InternalXtext.g:294:4: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleRuleNameAndParams"
    // InternalXtext.g:304:1: ruleRuleNameAndParams : ( ( rule__RuleNameAndParams__Group__0 ) ) ;
    public final void ruleRuleNameAndParams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:308:2: ( ( ( rule__RuleNameAndParams__Group__0 ) ) )
            // InternalXtext.g:309:2: ( ( rule__RuleNameAndParams__Group__0 ) )
            {
            // InternalXtext.g:309:2: ( ( rule__RuleNameAndParams__Group__0 ) )
            // InternalXtext.g:310:3: ( rule__RuleNameAndParams__Group__0 )
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getGroup()); 
            // InternalXtext.g:311:3: ( rule__RuleNameAndParams__Group__0 )
            // InternalXtext.g:311:4: rule__RuleNameAndParams__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleNameAndParamsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleNameAndParams"


    // $ANTLR start "entryRuleParameter"
    // InternalXtext.g:320:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalXtext.g:321:1: ( ruleParameter EOF )
            // InternalXtext.g:322:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalXtext.g:329:1: ruleParameter : ( ( rule__Parameter__NameAssignment ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:333:2: ( ( ( rule__Parameter__NameAssignment ) ) )
            // InternalXtext.g:334:2: ( ( rule__Parameter__NameAssignment ) )
            {
            // InternalXtext.g:334:2: ( ( rule__Parameter__NameAssignment ) )
            // InternalXtext.g:335:3: ( rule__Parameter__NameAssignment )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment()); 
            // InternalXtext.g:336:3: ( rule__Parameter__NameAssignment )
            // InternalXtext.g:336:4: rule__Parameter__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTypeRef"
    // InternalXtext.g:345:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // InternalXtext.g:346:1: ( ruleTypeRef EOF )
            // InternalXtext.g:347:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // InternalXtext.g:354:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:358:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // InternalXtext.g:359:2: ( ( rule__TypeRef__Group__0 ) )
            {
            // InternalXtext.g:359:2: ( ( rule__TypeRef__Group__0 ) )
            // InternalXtext.g:360:3: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // InternalXtext.g:361:3: ( rule__TypeRef__Group__0 )
            // InternalXtext.g:361:4: rule__TypeRef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleAlternatives"
    // InternalXtext.g:370:1: entryRuleAlternatives : ruleAlternatives EOF ;
    public final void entryRuleAlternatives() throws RecognitionException {
        try {
            // InternalXtext.g:371:1: ( ruleAlternatives EOF )
            // InternalXtext.g:372:1: ruleAlternatives EOF
            {
             before(grammarAccess.getAlternativesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getAlternativesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // InternalXtext.g:379:1: ruleAlternatives : ( ( rule__Alternatives__Group__0 ) ) ;
    public final void ruleAlternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:383:2: ( ( ( rule__Alternatives__Group__0 ) ) )
            // InternalXtext.g:384:2: ( ( rule__Alternatives__Group__0 ) )
            {
            // InternalXtext.g:384:2: ( ( rule__Alternatives__Group__0 ) )
            // InternalXtext.g:385:3: ( rule__Alternatives__Group__0 )
            {
             before(grammarAccess.getAlternativesAccess().getGroup()); 
            // InternalXtext.g:386:3: ( rule__Alternatives__Group__0 )
            // InternalXtext.g:386:4: rule__Alternatives__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleConditionalBranch"
    // InternalXtext.g:395:1: entryRuleConditionalBranch : ruleConditionalBranch EOF ;
    public final void entryRuleConditionalBranch() throws RecognitionException {
        try {
            // InternalXtext.g:396:1: ( ruleConditionalBranch EOF )
            // InternalXtext.g:397:1: ruleConditionalBranch EOF
            {
             before(grammarAccess.getConditionalBranchRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConditionalBranch();

            state._fsp--;

             after(grammarAccess.getConditionalBranchRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionalBranch"


    // $ANTLR start "ruleConditionalBranch"
    // InternalXtext.g:404:1: ruleConditionalBranch : ( ( rule__ConditionalBranch__Alternatives ) ) ;
    public final void ruleConditionalBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:408:2: ( ( ( rule__ConditionalBranch__Alternatives ) ) )
            // InternalXtext.g:409:2: ( ( rule__ConditionalBranch__Alternatives ) )
            {
            // InternalXtext.g:409:2: ( ( rule__ConditionalBranch__Alternatives ) )
            // InternalXtext.g:410:3: ( rule__ConditionalBranch__Alternatives )
            {
             before(grammarAccess.getConditionalBranchAccess().getAlternatives()); 
            // InternalXtext.g:411:3: ( rule__ConditionalBranch__Alternatives )
            // InternalXtext.g:411:4: rule__ConditionalBranch__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConditionalBranch__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionalBranchAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalBranch"


    // $ANTLR start "entryRuleUnorderedGroup"
    // InternalXtext.g:420:1: entryRuleUnorderedGroup : ruleUnorderedGroup EOF ;
    public final void entryRuleUnorderedGroup() throws RecognitionException {
        try {
            // InternalXtext.g:421:1: ( ruleUnorderedGroup EOF )
            // InternalXtext.g:422:1: ruleUnorderedGroup EOF
            {
             before(grammarAccess.getUnorderedGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnorderedGroup();

            state._fsp--;

             after(grammarAccess.getUnorderedGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnorderedGroup"


    // $ANTLR start "ruleUnorderedGroup"
    // InternalXtext.g:429:1: ruleUnorderedGroup : ( ( rule__UnorderedGroup__Group__0 ) ) ;
    public final void ruleUnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:433:2: ( ( ( rule__UnorderedGroup__Group__0 ) ) )
            // InternalXtext.g:434:2: ( ( rule__UnorderedGroup__Group__0 ) )
            {
            // InternalXtext.g:434:2: ( ( rule__UnorderedGroup__Group__0 ) )
            // InternalXtext.g:435:3: ( rule__UnorderedGroup__Group__0 )
            {
             before(grammarAccess.getUnorderedGroupAccess().getGroup()); 
            // InternalXtext.g:436:3: ( rule__UnorderedGroup__Group__0 )
            // InternalXtext.g:436:4: rule__UnorderedGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnorderedGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnorderedGroup"


    // $ANTLR start "entryRuleGroup"
    // InternalXtext.g:445:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalXtext.g:446:1: ( ruleGroup EOF )
            // InternalXtext.g:447:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalXtext.g:454:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:458:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalXtext.g:459:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalXtext.g:459:2: ( ( rule__Group__Group__0 ) )
            // InternalXtext.g:460:3: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalXtext.g:461:3: ( rule__Group__Group__0 )
            // InternalXtext.g:461:4: rule__Group__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleAbstractToken"
    // InternalXtext.g:470:1: entryRuleAbstractToken : ruleAbstractToken EOF ;
    public final void entryRuleAbstractToken() throws RecognitionException {
        try {
            // InternalXtext.g:471:1: ( ruleAbstractToken EOF )
            // InternalXtext.g:472:1: ruleAbstractToken EOF
            {
             before(grammarAccess.getAbstractTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractToken();

            state._fsp--;

             after(grammarAccess.getAbstractTokenRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractToken"


    // $ANTLR start "ruleAbstractToken"
    // InternalXtext.g:479:1: ruleAbstractToken : ( ( rule__AbstractToken__Alternatives ) ) ;
    public final void ruleAbstractToken() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:483:2: ( ( ( rule__AbstractToken__Alternatives ) ) )
            // InternalXtext.g:484:2: ( ( rule__AbstractToken__Alternatives ) )
            {
            // InternalXtext.g:484:2: ( ( rule__AbstractToken__Alternatives ) )
            // InternalXtext.g:485:3: ( rule__AbstractToken__Alternatives )
            {
             before(grammarAccess.getAbstractTokenAccess().getAlternatives()); 
            // InternalXtext.g:486:3: ( rule__AbstractToken__Alternatives )
            // InternalXtext.g:486:4: rule__AbstractToken__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractToken__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTokenAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractToken"


    // $ANTLR start "entryRuleAbstractTokenWithCardinality"
    // InternalXtext.g:495:1: entryRuleAbstractTokenWithCardinality : ruleAbstractTokenWithCardinality EOF ;
    public final void entryRuleAbstractTokenWithCardinality() throws RecognitionException {
        try {
            // InternalXtext.g:496:1: ( ruleAbstractTokenWithCardinality EOF )
            // InternalXtext.g:497:1: ruleAbstractTokenWithCardinality EOF
            {
             before(grammarAccess.getAbstractTokenWithCardinalityRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractTokenWithCardinality();

            state._fsp--;

             after(grammarAccess.getAbstractTokenWithCardinalityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractTokenWithCardinality"


    // $ANTLR start "ruleAbstractTokenWithCardinality"
    // InternalXtext.g:504:1: ruleAbstractTokenWithCardinality : ( ( rule__AbstractTokenWithCardinality__Group__0 ) ) ;
    public final void ruleAbstractTokenWithCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:508:2: ( ( ( rule__AbstractTokenWithCardinality__Group__0 ) ) )
            // InternalXtext.g:509:2: ( ( rule__AbstractTokenWithCardinality__Group__0 ) )
            {
            // InternalXtext.g:509:2: ( ( rule__AbstractTokenWithCardinality__Group__0 ) )
            // InternalXtext.g:510:3: ( rule__AbstractTokenWithCardinality__Group__0 )
            {
             before(grammarAccess.getAbstractTokenWithCardinalityAccess().getGroup()); 
            // InternalXtext.g:511:3: ( rule__AbstractTokenWithCardinality__Group__0 )
            // InternalXtext.g:511:4: rule__AbstractTokenWithCardinality__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractTokenWithCardinality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTokenWithCardinalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractTokenWithCardinality"


    // $ANTLR start "entryRuleAction"
    // InternalXtext.g:520:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalXtext.g:521:1: ( ruleAction EOF )
            // InternalXtext.g:522:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalXtext.g:529:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:533:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalXtext.g:534:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalXtext.g:534:2: ( ( rule__Action__Group__0 ) )
            // InternalXtext.g:535:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalXtext.g:536:3: ( rule__Action__Group__0 )
            // InternalXtext.g:536:4: rule__Action__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAbstractTerminal"
    // InternalXtext.g:545:1: entryRuleAbstractTerminal : ruleAbstractTerminal EOF ;
    public final void entryRuleAbstractTerminal() throws RecognitionException {
        try {
            // InternalXtext.g:546:1: ( ruleAbstractTerminal EOF )
            // InternalXtext.g:547:1: ruleAbstractTerminal EOF
            {
             before(grammarAccess.getAbstractTerminalRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractTerminal();

            state._fsp--;

             after(grammarAccess.getAbstractTerminalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractTerminal"


    // $ANTLR start "ruleAbstractTerminal"
    // InternalXtext.g:554:1: ruleAbstractTerminal : ( ( rule__AbstractTerminal__Alternatives ) ) ;
    public final void ruleAbstractTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:558:2: ( ( ( rule__AbstractTerminal__Alternatives ) ) )
            // InternalXtext.g:559:2: ( ( rule__AbstractTerminal__Alternatives ) )
            {
            // InternalXtext.g:559:2: ( ( rule__AbstractTerminal__Alternatives ) )
            // InternalXtext.g:560:3: ( rule__AbstractTerminal__Alternatives )
            {
             before(grammarAccess.getAbstractTerminalAccess().getAlternatives()); 
            // InternalXtext.g:561:3: ( rule__AbstractTerminal__Alternatives )
            // InternalXtext.g:561:4: rule__AbstractTerminal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractTerminal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTerminalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractTerminal"


    // $ANTLR start "entryRuleKeyword"
    // InternalXtext.g:570:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // InternalXtext.g:571:1: ( ruleKeyword EOF )
            // InternalXtext.g:572:1: ruleKeyword EOF
            {
             before(grammarAccess.getKeywordRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getKeywordRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // InternalXtext.g:579:1: ruleKeyword : ( ( rule__Keyword__ValueAssignment ) ) ;
    public final void ruleKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:583:2: ( ( ( rule__Keyword__ValueAssignment ) ) )
            // InternalXtext.g:584:2: ( ( rule__Keyword__ValueAssignment ) )
            {
            // InternalXtext.g:584:2: ( ( rule__Keyword__ValueAssignment ) )
            // InternalXtext.g:585:3: ( rule__Keyword__ValueAssignment )
            {
             before(grammarAccess.getKeywordAccess().getValueAssignment()); 
            // InternalXtext.g:586:3: ( rule__Keyword__ValueAssignment )
            // InternalXtext.g:586:4: rule__Keyword__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Keyword__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getKeywordAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleRuleCall"
    // InternalXtext.g:595:1: entryRuleRuleCall : ruleRuleCall EOF ;
    public final void entryRuleRuleCall() throws RecognitionException {
        try {
            // InternalXtext.g:596:1: ( ruleRuleCall EOF )
            // InternalXtext.g:597:1: ruleRuleCall EOF
            {
             before(grammarAccess.getRuleCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRuleCall();

            state._fsp--;

             after(grammarAccess.getRuleCallRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleCall"


    // $ANTLR start "ruleRuleCall"
    // InternalXtext.g:604:1: ruleRuleCall : ( ( rule__RuleCall__Group__0 ) ) ;
    public final void ruleRuleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:608:2: ( ( ( rule__RuleCall__Group__0 ) ) )
            // InternalXtext.g:609:2: ( ( rule__RuleCall__Group__0 ) )
            {
            // InternalXtext.g:609:2: ( ( rule__RuleCall__Group__0 ) )
            // InternalXtext.g:610:3: ( rule__RuleCall__Group__0 )
            {
             before(grammarAccess.getRuleCallAccess().getGroup()); 
            // InternalXtext.g:611:3: ( rule__RuleCall__Group__0 )
            // InternalXtext.g:611:4: rule__RuleCall__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleCall"


    // $ANTLR start "entryRuleNamedArgument"
    // InternalXtext.g:620:1: entryRuleNamedArgument : ruleNamedArgument EOF ;
    public final void entryRuleNamedArgument() throws RecognitionException {
        try {
            // InternalXtext.g:621:1: ( ruleNamedArgument EOF )
            // InternalXtext.g:622:1: ruleNamedArgument EOF
            {
             before(grammarAccess.getNamedArgumentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNamedArgument();

            state._fsp--;

             after(grammarAccess.getNamedArgumentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedArgument"


    // $ANTLR start "ruleNamedArgument"
    // InternalXtext.g:629:1: ruleNamedArgument : ( ( rule__NamedArgument__Group__0 ) ) ;
    public final void ruleNamedArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:633:2: ( ( ( rule__NamedArgument__Group__0 ) ) )
            // InternalXtext.g:634:2: ( ( rule__NamedArgument__Group__0 ) )
            {
            // InternalXtext.g:634:2: ( ( rule__NamedArgument__Group__0 ) )
            // InternalXtext.g:635:3: ( rule__NamedArgument__Group__0 )
            {
             before(grammarAccess.getNamedArgumentAccess().getGroup()); 
            // InternalXtext.g:636:3: ( rule__NamedArgument__Group__0 )
            // InternalXtext.g:636:4: rule__NamedArgument__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedArgument"


    // $ANTLR start "entryRuleLiteralCondition"
    // InternalXtext.g:645:1: entryRuleLiteralCondition : ruleLiteralCondition EOF ;
    public final void entryRuleLiteralCondition() throws RecognitionException {
        try {
            // InternalXtext.g:646:1: ( ruleLiteralCondition EOF )
            // InternalXtext.g:647:1: ruleLiteralCondition EOF
            {
             before(grammarAccess.getLiteralConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLiteralCondition();

            state._fsp--;

             after(grammarAccess.getLiteralConditionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralCondition"


    // $ANTLR start "ruleLiteralCondition"
    // InternalXtext.g:654:1: ruleLiteralCondition : ( ( rule__LiteralCondition__Group__0 ) ) ;
    public final void ruleLiteralCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:658:2: ( ( ( rule__LiteralCondition__Group__0 ) ) )
            // InternalXtext.g:659:2: ( ( rule__LiteralCondition__Group__0 ) )
            {
            // InternalXtext.g:659:2: ( ( rule__LiteralCondition__Group__0 ) )
            // InternalXtext.g:660:3: ( rule__LiteralCondition__Group__0 )
            {
             before(grammarAccess.getLiteralConditionAccess().getGroup()); 
            // InternalXtext.g:661:3: ( rule__LiteralCondition__Group__0 )
            // InternalXtext.g:661:4: rule__LiteralCondition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralCondition"


    // $ANTLR start "entryRuleDisjunction"
    // InternalXtext.g:670:1: entryRuleDisjunction : ruleDisjunction EOF ;
    public final void entryRuleDisjunction() throws RecognitionException {
        try {
            // InternalXtext.g:671:1: ( ruleDisjunction EOF )
            // InternalXtext.g:672:1: ruleDisjunction EOF
            {
             before(grammarAccess.getDisjunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDisjunction();

            state._fsp--;

             after(grammarAccess.getDisjunctionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // InternalXtext.g:679:1: ruleDisjunction : ( ( rule__Disjunction__Group__0 ) ) ;
    public final void ruleDisjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:683:2: ( ( ( rule__Disjunction__Group__0 ) ) )
            // InternalXtext.g:684:2: ( ( rule__Disjunction__Group__0 ) )
            {
            // InternalXtext.g:684:2: ( ( rule__Disjunction__Group__0 ) )
            // InternalXtext.g:685:3: ( rule__Disjunction__Group__0 )
            {
             before(grammarAccess.getDisjunctionAccess().getGroup()); 
            // InternalXtext.g:686:3: ( rule__Disjunction__Group__0 )
            // InternalXtext.g:686:4: rule__Disjunction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Disjunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisjunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // InternalXtext.g:695:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // InternalXtext.g:696:1: ( ruleConjunction EOF )
            // InternalXtext.g:697:1: ruleConjunction EOF
            {
             before(grammarAccess.getConjunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getConjunctionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // InternalXtext.g:704:1: ruleConjunction : ( ( rule__Conjunction__Group__0 ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:708:2: ( ( ( rule__Conjunction__Group__0 ) ) )
            // InternalXtext.g:709:2: ( ( rule__Conjunction__Group__0 ) )
            {
            // InternalXtext.g:709:2: ( ( rule__Conjunction__Group__0 ) )
            // InternalXtext.g:710:3: ( rule__Conjunction__Group__0 )
            {
             before(grammarAccess.getConjunctionAccess().getGroup()); 
            // InternalXtext.g:711:3: ( rule__Conjunction__Group__0 )
            // InternalXtext.g:711:4: rule__Conjunction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Conjunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleNegation"
    // InternalXtext.g:720:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // InternalXtext.g:721:1: ( ruleNegation EOF )
            // InternalXtext.g:722:1: ruleNegation EOF
            {
             before(grammarAccess.getNegationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalXtext.g:729:1: ruleNegation : ( ( rule__Negation__Alternatives ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:733:2: ( ( ( rule__Negation__Alternatives ) ) )
            // InternalXtext.g:734:2: ( ( rule__Negation__Alternatives ) )
            {
            // InternalXtext.g:734:2: ( ( rule__Negation__Alternatives ) )
            // InternalXtext.g:735:3: ( rule__Negation__Alternatives )
            {
             before(grammarAccess.getNegationAccess().getAlternatives()); 
            // InternalXtext.g:736:3: ( rule__Negation__Alternatives )
            // InternalXtext.g:736:4: rule__Negation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Negation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleAtom"
    // InternalXtext.g:745:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalXtext.g:746:1: ( ruleAtom EOF )
            // InternalXtext.g:747:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalXtext.g:754:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:758:2: ( ( ( rule__Atom__Alternatives ) ) )
            // InternalXtext.g:759:2: ( ( rule__Atom__Alternatives ) )
            {
            // InternalXtext.g:759:2: ( ( rule__Atom__Alternatives ) )
            // InternalXtext.g:760:3: ( rule__Atom__Alternatives )
            {
             before(grammarAccess.getAtomAccess().getAlternatives()); 
            // InternalXtext.g:761:3: ( rule__Atom__Alternatives )
            // InternalXtext.g:761:4: rule__Atom__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Atom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleParenthesizedCondition"
    // InternalXtext.g:770:1: entryRuleParenthesizedCondition : ruleParenthesizedCondition EOF ;
    public final void entryRuleParenthesizedCondition() throws RecognitionException {
        try {
            // InternalXtext.g:771:1: ( ruleParenthesizedCondition EOF )
            // InternalXtext.g:772:1: ruleParenthesizedCondition EOF
            {
             before(grammarAccess.getParenthesizedConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesizedCondition();

            state._fsp--;

             after(grammarAccess.getParenthesizedConditionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesizedCondition"


    // $ANTLR start "ruleParenthesizedCondition"
    // InternalXtext.g:779:1: ruleParenthesizedCondition : ( ( rule__ParenthesizedCondition__Group__0 ) ) ;
    public final void ruleParenthesizedCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:783:2: ( ( ( rule__ParenthesizedCondition__Group__0 ) ) )
            // InternalXtext.g:784:2: ( ( rule__ParenthesizedCondition__Group__0 ) )
            {
            // InternalXtext.g:784:2: ( ( rule__ParenthesizedCondition__Group__0 ) )
            // InternalXtext.g:785:3: ( rule__ParenthesizedCondition__Group__0 )
            {
             before(grammarAccess.getParenthesizedConditionAccess().getGroup()); 
            // InternalXtext.g:786:3: ( rule__ParenthesizedCondition__Group__0 )
            // InternalXtext.g:786:4: rule__ParenthesizedCondition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesizedConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesizedCondition"


    // $ANTLR start "entryRuleParameterReference"
    // InternalXtext.g:795:1: entryRuleParameterReference : ruleParameterReference EOF ;
    public final void entryRuleParameterReference() throws RecognitionException {
        try {
            // InternalXtext.g:796:1: ( ruleParameterReference EOF )
            // InternalXtext.g:797:1: ruleParameterReference EOF
            {
             before(grammarAccess.getParameterReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParameterReference();

            state._fsp--;

             after(grammarAccess.getParameterReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterReference"


    // $ANTLR start "ruleParameterReference"
    // InternalXtext.g:804:1: ruleParameterReference : ( ( rule__ParameterReference__ParameterAssignment ) ) ;
    public final void ruleParameterReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:808:2: ( ( ( rule__ParameterReference__ParameterAssignment ) ) )
            // InternalXtext.g:809:2: ( ( rule__ParameterReference__ParameterAssignment ) )
            {
            // InternalXtext.g:809:2: ( ( rule__ParameterReference__ParameterAssignment ) )
            // InternalXtext.g:810:3: ( rule__ParameterReference__ParameterAssignment )
            {
             before(grammarAccess.getParameterReferenceAccess().getParameterAssignment()); 
            // InternalXtext.g:811:3: ( rule__ParameterReference__ParameterAssignment )
            // InternalXtext.g:811:4: rule__ParameterReference__ParameterAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParameterReference__ParameterAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterReferenceAccess().getParameterAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterReference"


    // $ANTLR start "entryRuleTerminalRuleCall"
    // InternalXtext.g:820:1: entryRuleTerminalRuleCall : ruleTerminalRuleCall EOF ;
    public final void entryRuleTerminalRuleCall() throws RecognitionException {
        try {
            // InternalXtext.g:821:1: ( ruleTerminalRuleCall EOF )
            // InternalXtext.g:822:1: ruleTerminalRuleCall EOF
            {
             before(grammarAccess.getTerminalRuleCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalRuleCall();

            state._fsp--;

             after(grammarAccess.getTerminalRuleCallRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalRuleCall"


    // $ANTLR start "ruleTerminalRuleCall"
    // InternalXtext.g:829:1: ruleTerminalRuleCall : ( ( rule__TerminalRuleCall__RuleAssignment ) ) ;
    public final void ruleTerminalRuleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:833:2: ( ( ( rule__TerminalRuleCall__RuleAssignment ) ) )
            // InternalXtext.g:834:2: ( ( rule__TerminalRuleCall__RuleAssignment ) )
            {
            // InternalXtext.g:834:2: ( ( rule__TerminalRuleCall__RuleAssignment ) )
            // InternalXtext.g:835:3: ( rule__TerminalRuleCall__RuleAssignment )
            {
             before(grammarAccess.getTerminalRuleCallAccess().getRuleAssignment()); 
            // InternalXtext.g:836:3: ( rule__TerminalRuleCall__RuleAssignment )
            // InternalXtext.g:836:4: rule__TerminalRuleCall__RuleAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRuleCall__RuleAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleCallAccess().getRuleAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalRuleCall"


    // $ANTLR start "entryRuleRuleID"
    // InternalXtext.g:845:1: entryRuleRuleID : ruleRuleID EOF ;
    public final void entryRuleRuleID() throws RecognitionException {
        try {
            // InternalXtext.g:846:1: ( ruleRuleID EOF )
            // InternalXtext.g:847:1: ruleRuleID EOF
            {
             before(grammarAccess.getRuleIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getRuleIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleID"


    // $ANTLR start "ruleRuleID"
    // InternalXtext.g:854:1: ruleRuleID : ( ( rule__RuleID__Group__0 ) ) ;
    public final void ruleRuleID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:858:2: ( ( ( rule__RuleID__Group__0 ) ) )
            // InternalXtext.g:859:2: ( ( rule__RuleID__Group__0 ) )
            {
            // InternalXtext.g:859:2: ( ( rule__RuleID__Group__0 ) )
            // InternalXtext.g:860:3: ( rule__RuleID__Group__0 )
            {
             before(grammarAccess.getRuleIDAccess().getGroup()); 
            // InternalXtext.g:861:3: ( rule__RuleID__Group__0 )
            // InternalXtext.g:861:4: rule__RuleID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleID"


    // $ANTLR start "entryRuleValidID"
    // InternalXtext.g:870:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalXtext.g:871:1: ( ruleValidID EOF )
            // InternalXtext.g:872:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalXtext.g:879:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:883:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // InternalXtext.g:884:2: ( ( rule__ValidID__Alternatives ) )
            {
            // InternalXtext.g:884:2: ( ( rule__ValidID__Alternatives ) )
            // InternalXtext.g:885:3: ( rule__ValidID__Alternatives )
            {
             before(grammarAccess.getValidIDAccess().getAlternatives()); 
            // InternalXtext.g:886:3: ( rule__ValidID__Alternatives )
            // InternalXtext.g:886:4: rule__ValidID__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValidID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidIDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRulePredicatedKeyword"
    // InternalXtext.g:895:1: entryRulePredicatedKeyword : rulePredicatedKeyword EOF ;
    public final void entryRulePredicatedKeyword() throws RecognitionException {
        try {
            // InternalXtext.g:896:1: ( rulePredicatedKeyword EOF )
            // InternalXtext.g:897:1: rulePredicatedKeyword EOF
            {
             before(grammarAccess.getPredicatedKeywordRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePredicatedKeyword();

            state._fsp--;

             after(grammarAccess.getPredicatedKeywordRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicatedKeyword"


    // $ANTLR start "rulePredicatedKeyword"
    // InternalXtext.g:904:1: rulePredicatedKeyword : ( ( rule__PredicatedKeyword__Group__0 ) ) ;
    public final void rulePredicatedKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:908:2: ( ( ( rule__PredicatedKeyword__Group__0 ) ) )
            // InternalXtext.g:909:2: ( ( rule__PredicatedKeyword__Group__0 ) )
            {
            // InternalXtext.g:909:2: ( ( rule__PredicatedKeyword__Group__0 ) )
            // InternalXtext.g:910:3: ( rule__PredicatedKeyword__Group__0 )
            {
             before(grammarAccess.getPredicatedKeywordAccess().getGroup()); 
            // InternalXtext.g:911:3: ( rule__PredicatedKeyword__Group__0 )
            // InternalXtext.g:911:4: rule__PredicatedKeyword__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedKeyword__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedKeywordAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicatedKeyword"


    // $ANTLR start "entryRulePredicatedRuleCall"
    // InternalXtext.g:920:1: entryRulePredicatedRuleCall : rulePredicatedRuleCall EOF ;
    public final void entryRulePredicatedRuleCall() throws RecognitionException {
        try {
            // InternalXtext.g:921:1: ( rulePredicatedRuleCall EOF )
            // InternalXtext.g:922:1: rulePredicatedRuleCall EOF
            {
             before(grammarAccess.getPredicatedRuleCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePredicatedRuleCall();

            state._fsp--;

             after(grammarAccess.getPredicatedRuleCallRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicatedRuleCall"


    // $ANTLR start "rulePredicatedRuleCall"
    // InternalXtext.g:929:1: rulePredicatedRuleCall : ( ( rule__PredicatedRuleCall__Group__0 ) ) ;
    public final void rulePredicatedRuleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:933:2: ( ( ( rule__PredicatedRuleCall__Group__0 ) ) )
            // InternalXtext.g:934:2: ( ( rule__PredicatedRuleCall__Group__0 ) )
            {
            // InternalXtext.g:934:2: ( ( rule__PredicatedRuleCall__Group__0 ) )
            // InternalXtext.g:935:3: ( rule__PredicatedRuleCall__Group__0 )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getGroup()); 
            // InternalXtext.g:936:3: ( rule__PredicatedRuleCall__Group__0 )
            // InternalXtext.g:936:4: rule__PredicatedRuleCall__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedRuleCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicatedRuleCall"


    // $ANTLR start "entryRuleAssignment"
    // InternalXtext.g:945:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalXtext.g:946:1: ( ruleAssignment EOF )
            // InternalXtext.g:947:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalXtext.g:954:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:958:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalXtext.g:959:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalXtext.g:959:2: ( ( rule__Assignment__Group__0 ) )
            // InternalXtext.g:960:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalXtext.g:961:3: ( rule__Assignment__Group__0 )
            // InternalXtext.g:961:4: rule__Assignment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssignableTerminal"
    // InternalXtext.g:970:1: entryRuleAssignableTerminal : ruleAssignableTerminal EOF ;
    public final void entryRuleAssignableTerminal() throws RecognitionException {
        try {
            // InternalXtext.g:971:1: ( ruleAssignableTerminal EOF )
            // InternalXtext.g:972:1: ruleAssignableTerminal EOF
            {
             before(grammarAccess.getAssignableTerminalRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAssignableTerminal();

            state._fsp--;

             after(grammarAccess.getAssignableTerminalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignableTerminal"


    // $ANTLR start "ruleAssignableTerminal"
    // InternalXtext.g:979:1: ruleAssignableTerminal : ( ( rule__AssignableTerminal__Alternatives ) ) ;
    public final void ruleAssignableTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:983:2: ( ( ( rule__AssignableTerminal__Alternatives ) ) )
            // InternalXtext.g:984:2: ( ( rule__AssignableTerminal__Alternatives ) )
            {
            // InternalXtext.g:984:2: ( ( rule__AssignableTerminal__Alternatives ) )
            // InternalXtext.g:985:3: ( rule__AssignableTerminal__Alternatives )
            {
             before(grammarAccess.getAssignableTerminalAccess().getAlternatives()); 
            // InternalXtext.g:986:3: ( rule__AssignableTerminal__Alternatives )
            // InternalXtext.g:986:4: rule__AssignableTerminal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableTerminal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssignableTerminalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignableTerminal"


    // $ANTLR start "entryRuleParenthesizedAssignableElement"
    // InternalXtext.g:995:1: entryRuleParenthesizedAssignableElement : ruleParenthesizedAssignableElement EOF ;
    public final void entryRuleParenthesizedAssignableElement() throws RecognitionException {
        try {
            // InternalXtext.g:996:1: ( ruleParenthesizedAssignableElement EOF )
            // InternalXtext.g:997:1: ruleParenthesizedAssignableElement EOF
            {
             before(grammarAccess.getParenthesizedAssignableElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesizedAssignableElement();

            state._fsp--;

             after(grammarAccess.getParenthesizedAssignableElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesizedAssignableElement"


    // $ANTLR start "ruleParenthesizedAssignableElement"
    // InternalXtext.g:1004:1: ruleParenthesizedAssignableElement : ( ( rule__ParenthesizedAssignableElement__Group__0 ) ) ;
    public final void ruleParenthesizedAssignableElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1008:2: ( ( ( rule__ParenthesizedAssignableElement__Group__0 ) ) )
            // InternalXtext.g:1009:2: ( ( rule__ParenthesizedAssignableElement__Group__0 ) )
            {
            // InternalXtext.g:1009:2: ( ( rule__ParenthesizedAssignableElement__Group__0 ) )
            // InternalXtext.g:1010:3: ( rule__ParenthesizedAssignableElement__Group__0 )
            {
             before(grammarAccess.getParenthesizedAssignableElementAccess().getGroup()); 
            // InternalXtext.g:1011:3: ( rule__ParenthesizedAssignableElement__Group__0 )
            // InternalXtext.g:1011:4: rule__ParenthesizedAssignableElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedAssignableElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesizedAssignableElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesizedAssignableElement"


    // $ANTLR start "entryRuleAssignableAlternatives"
    // InternalXtext.g:1020:1: entryRuleAssignableAlternatives : ruleAssignableAlternatives EOF ;
    public final void entryRuleAssignableAlternatives() throws RecognitionException {
        try {
            // InternalXtext.g:1021:1: ( ruleAssignableAlternatives EOF )
            // InternalXtext.g:1022:1: ruleAssignableAlternatives EOF
            {
             before(grammarAccess.getAssignableAlternativesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAssignableAlternatives();

            state._fsp--;

             after(grammarAccess.getAssignableAlternativesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignableAlternatives"


    // $ANTLR start "ruleAssignableAlternatives"
    // InternalXtext.g:1029:1: ruleAssignableAlternatives : ( ( rule__AssignableAlternatives__Group__0 ) ) ;
    public final void ruleAssignableAlternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1033:2: ( ( ( rule__AssignableAlternatives__Group__0 ) ) )
            // InternalXtext.g:1034:2: ( ( rule__AssignableAlternatives__Group__0 ) )
            {
            // InternalXtext.g:1034:2: ( ( rule__AssignableAlternatives__Group__0 ) )
            // InternalXtext.g:1035:3: ( rule__AssignableAlternatives__Group__0 )
            {
             before(grammarAccess.getAssignableAlternativesAccess().getGroup()); 
            // InternalXtext.g:1036:3: ( rule__AssignableAlternatives__Group__0 )
            // InternalXtext.g:1036:4: rule__AssignableAlternatives__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignableAlternativesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignableAlternatives"


    // $ANTLR start "entryRuleCrossReference"
    // InternalXtext.g:1045:1: entryRuleCrossReference : ruleCrossReference EOF ;
    public final void entryRuleCrossReference() throws RecognitionException {
        try {
            // InternalXtext.g:1046:1: ( ruleCrossReference EOF )
            // InternalXtext.g:1047:1: ruleCrossReference EOF
            {
             before(grammarAccess.getCrossReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCrossReference();

            state._fsp--;

             after(grammarAccess.getCrossReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCrossReference"


    // $ANTLR start "ruleCrossReference"
    // InternalXtext.g:1054:1: ruleCrossReference : ( ( rule__CrossReference__Group__0 ) ) ;
    public final void ruleCrossReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1058:2: ( ( ( rule__CrossReference__Group__0 ) ) )
            // InternalXtext.g:1059:2: ( ( rule__CrossReference__Group__0 ) )
            {
            // InternalXtext.g:1059:2: ( ( rule__CrossReference__Group__0 ) )
            // InternalXtext.g:1060:3: ( rule__CrossReference__Group__0 )
            {
             before(grammarAccess.getCrossReferenceAccess().getGroup()); 
            // InternalXtext.g:1061:3: ( rule__CrossReference__Group__0 )
            // InternalXtext.g:1061:4: rule__CrossReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCrossReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCrossReference"


    // $ANTLR start "entryRuleCrossReferenceableTerminal"
    // InternalXtext.g:1070:1: entryRuleCrossReferenceableTerminal : ruleCrossReferenceableTerminal EOF ;
    public final void entryRuleCrossReferenceableTerminal() throws RecognitionException {
        try {
            // InternalXtext.g:1071:1: ( ruleCrossReferenceableTerminal EOF )
            // InternalXtext.g:1072:1: ruleCrossReferenceableTerminal EOF
            {
             before(grammarAccess.getCrossReferenceableTerminalRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCrossReferenceableTerminal();

            state._fsp--;

             after(grammarAccess.getCrossReferenceableTerminalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCrossReferenceableTerminal"


    // $ANTLR start "ruleCrossReferenceableTerminal"
    // InternalXtext.g:1079:1: ruleCrossReferenceableTerminal : ( ( rule__CrossReferenceableTerminal__Alternatives ) ) ;
    public final void ruleCrossReferenceableTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1083:2: ( ( ( rule__CrossReferenceableTerminal__Alternatives ) ) )
            // InternalXtext.g:1084:2: ( ( rule__CrossReferenceableTerminal__Alternatives ) )
            {
            // InternalXtext.g:1084:2: ( ( rule__CrossReferenceableTerminal__Alternatives ) )
            // InternalXtext.g:1085:3: ( rule__CrossReferenceableTerminal__Alternatives )
            {
             before(grammarAccess.getCrossReferenceableTerminalAccess().getAlternatives()); 
            // InternalXtext.g:1086:3: ( rule__CrossReferenceableTerminal__Alternatives )
            // InternalXtext.g:1086:4: rule__CrossReferenceableTerminal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReferenceableTerminal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCrossReferenceableTerminalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCrossReferenceableTerminal"


    // $ANTLR start "entryRuleParenthesizedElement"
    // InternalXtext.g:1095:1: entryRuleParenthesizedElement : ruleParenthesizedElement EOF ;
    public final void entryRuleParenthesizedElement() throws RecognitionException {
        try {
            // InternalXtext.g:1096:1: ( ruleParenthesizedElement EOF )
            // InternalXtext.g:1097:1: ruleParenthesizedElement EOF
            {
             before(grammarAccess.getParenthesizedElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesizedElement();

            state._fsp--;

             after(grammarAccess.getParenthesizedElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesizedElement"


    // $ANTLR start "ruleParenthesizedElement"
    // InternalXtext.g:1104:1: ruleParenthesizedElement : ( ( rule__ParenthesizedElement__Group__0 ) ) ;
    public final void ruleParenthesizedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1108:2: ( ( ( rule__ParenthesizedElement__Group__0 ) ) )
            // InternalXtext.g:1109:2: ( ( rule__ParenthesizedElement__Group__0 ) )
            {
            // InternalXtext.g:1109:2: ( ( rule__ParenthesizedElement__Group__0 ) )
            // InternalXtext.g:1110:3: ( rule__ParenthesizedElement__Group__0 )
            {
             before(grammarAccess.getParenthesizedElementAccess().getGroup()); 
            // InternalXtext.g:1111:3: ( rule__ParenthesizedElement__Group__0 )
            // InternalXtext.g:1111:4: rule__ParenthesizedElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesizedElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesizedElement"


    // $ANTLR start "entryRulePredicatedGroup"
    // InternalXtext.g:1120:1: entryRulePredicatedGroup : rulePredicatedGroup EOF ;
    public final void entryRulePredicatedGroup() throws RecognitionException {
        try {
            // InternalXtext.g:1121:1: ( rulePredicatedGroup EOF )
            // InternalXtext.g:1122:1: rulePredicatedGroup EOF
            {
             before(grammarAccess.getPredicatedGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePredicatedGroup();

            state._fsp--;

             after(grammarAccess.getPredicatedGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicatedGroup"


    // $ANTLR start "rulePredicatedGroup"
    // InternalXtext.g:1129:1: rulePredicatedGroup : ( ( rule__PredicatedGroup__Group__0 ) ) ;
    public final void rulePredicatedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1133:2: ( ( ( rule__PredicatedGroup__Group__0 ) ) )
            // InternalXtext.g:1134:2: ( ( rule__PredicatedGroup__Group__0 ) )
            {
            // InternalXtext.g:1134:2: ( ( rule__PredicatedGroup__Group__0 ) )
            // InternalXtext.g:1135:3: ( rule__PredicatedGroup__Group__0 )
            {
             before(grammarAccess.getPredicatedGroupAccess().getGroup()); 
            // InternalXtext.g:1136:3: ( rule__PredicatedGroup__Group__0 )
            // InternalXtext.g:1136:4: rule__PredicatedGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicatedGroup"


    // $ANTLR start "entryRuleTerminalRule"
    // InternalXtext.g:1145:1: entryRuleTerminalRule : ruleTerminalRule EOF ;
    public final void entryRuleTerminalRule() throws RecognitionException {
        try {
            // InternalXtext.g:1146:1: ( ruleTerminalRule EOF )
            // InternalXtext.g:1147:1: ruleTerminalRule EOF
            {
             before(grammarAccess.getTerminalRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalRule();

            state._fsp--;

             after(grammarAccess.getTerminalRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalRule"


    // $ANTLR start "ruleTerminalRule"
    // InternalXtext.g:1154:1: ruleTerminalRule : ( ( rule__TerminalRule__Group__0 ) ) ;
    public final void ruleTerminalRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1158:2: ( ( ( rule__TerminalRule__Group__0 ) ) )
            // InternalXtext.g:1159:2: ( ( rule__TerminalRule__Group__0 ) )
            {
            // InternalXtext.g:1159:2: ( ( rule__TerminalRule__Group__0 ) )
            // InternalXtext.g:1160:3: ( rule__TerminalRule__Group__0 )
            {
             before(grammarAccess.getTerminalRuleAccess().getGroup()); 
            // InternalXtext.g:1161:3: ( rule__TerminalRule__Group__0 )
            // InternalXtext.g:1161:4: rule__TerminalRule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalRule"


    // $ANTLR start "entryRuleTerminalAlternatives"
    // InternalXtext.g:1170:1: entryRuleTerminalAlternatives : ruleTerminalAlternatives EOF ;
    public final void entryRuleTerminalAlternatives() throws RecognitionException {
        try {
            // InternalXtext.g:1171:1: ( ruleTerminalAlternatives EOF )
            // InternalXtext.g:1172:1: ruleTerminalAlternatives EOF
            {
             before(grammarAccess.getTerminalAlternativesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalAlternatives();

            state._fsp--;

             after(grammarAccess.getTerminalAlternativesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalAlternatives"


    // $ANTLR start "ruleTerminalAlternatives"
    // InternalXtext.g:1179:1: ruleTerminalAlternatives : ( ( rule__TerminalAlternatives__Group__0 ) ) ;
    public final void ruleTerminalAlternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1183:2: ( ( ( rule__TerminalAlternatives__Group__0 ) ) )
            // InternalXtext.g:1184:2: ( ( rule__TerminalAlternatives__Group__0 ) )
            {
            // InternalXtext.g:1184:2: ( ( rule__TerminalAlternatives__Group__0 ) )
            // InternalXtext.g:1185:3: ( rule__TerminalAlternatives__Group__0 )
            {
             before(grammarAccess.getTerminalAlternativesAccess().getGroup()); 
            // InternalXtext.g:1186:3: ( rule__TerminalAlternatives__Group__0 )
            // InternalXtext.g:1186:4: rule__TerminalAlternatives__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAlternativesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalAlternatives"


    // $ANTLR start "entryRuleTerminalGroup"
    // InternalXtext.g:1195:1: entryRuleTerminalGroup : ruleTerminalGroup EOF ;
    public final void entryRuleTerminalGroup() throws RecognitionException {
        try {
            // InternalXtext.g:1196:1: ( ruleTerminalGroup EOF )
            // InternalXtext.g:1197:1: ruleTerminalGroup EOF
            {
             before(grammarAccess.getTerminalGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalGroup();

            state._fsp--;

             after(grammarAccess.getTerminalGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalGroup"


    // $ANTLR start "ruleTerminalGroup"
    // InternalXtext.g:1204:1: ruleTerminalGroup : ( ( rule__TerminalGroup__Group__0 ) ) ;
    public final void ruleTerminalGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1208:2: ( ( ( rule__TerminalGroup__Group__0 ) ) )
            // InternalXtext.g:1209:2: ( ( rule__TerminalGroup__Group__0 ) )
            {
            // InternalXtext.g:1209:2: ( ( rule__TerminalGroup__Group__0 ) )
            // InternalXtext.g:1210:3: ( rule__TerminalGroup__Group__0 )
            {
             before(grammarAccess.getTerminalGroupAccess().getGroup()); 
            // InternalXtext.g:1211:3: ( rule__TerminalGroup__Group__0 )
            // InternalXtext.g:1211:4: rule__TerminalGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalGroup"


    // $ANTLR start "entryRuleTerminalToken"
    // InternalXtext.g:1220:1: entryRuleTerminalToken : ruleTerminalToken EOF ;
    public final void entryRuleTerminalToken() throws RecognitionException {
        try {
            // InternalXtext.g:1221:1: ( ruleTerminalToken EOF )
            // InternalXtext.g:1222:1: ruleTerminalToken EOF
            {
             before(grammarAccess.getTerminalTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalToken();

            state._fsp--;

             after(grammarAccess.getTerminalTokenRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalToken"


    // $ANTLR start "ruleTerminalToken"
    // InternalXtext.g:1229:1: ruleTerminalToken : ( ( rule__TerminalToken__Group__0 ) ) ;
    public final void ruleTerminalToken() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1233:2: ( ( ( rule__TerminalToken__Group__0 ) ) )
            // InternalXtext.g:1234:2: ( ( rule__TerminalToken__Group__0 ) )
            {
            // InternalXtext.g:1234:2: ( ( rule__TerminalToken__Group__0 ) )
            // InternalXtext.g:1235:3: ( rule__TerminalToken__Group__0 )
            {
             before(grammarAccess.getTerminalTokenAccess().getGroup()); 
            // InternalXtext.g:1236:3: ( rule__TerminalToken__Group__0 )
            // InternalXtext.g:1236:4: rule__TerminalToken__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalToken__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalTokenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalToken"


    // $ANTLR start "entryRuleTerminalTokenElement"
    // InternalXtext.g:1245:1: entryRuleTerminalTokenElement : ruleTerminalTokenElement EOF ;
    public final void entryRuleTerminalTokenElement() throws RecognitionException {
        try {
            // InternalXtext.g:1246:1: ( ruleTerminalTokenElement EOF )
            // InternalXtext.g:1247:1: ruleTerminalTokenElement EOF
            {
             before(grammarAccess.getTerminalTokenElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalTokenElement();

            state._fsp--;

             after(grammarAccess.getTerminalTokenElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalTokenElement"


    // $ANTLR start "ruleTerminalTokenElement"
    // InternalXtext.g:1254:1: ruleTerminalTokenElement : ( ( rule__TerminalTokenElement__Alternatives ) ) ;
    public final void ruleTerminalTokenElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1258:2: ( ( ( rule__TerminalTokenElement__Alternatives ) ) )
            // InternalXtext.g:1259:2: ( ( rule__TerminalTokenElement__Alternatives ) )
            {
            // InternalXtext.g:1259:2: ( ( rule__TerminalTokenElement__Alternatives ) )
            // InternalXtext.g:1260:3: ( rule__TerminalTokenElement__Alternatives )
            {
             before(grammarAccess.getTerminalTokenElementAccess().getAlternatives()); 
            // InternalXtext.g:1261:3: ( rule__TerminalTokenElement__Alternatives )
            // InternalXtext.g:1261:4: rule__TerminalTokenElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalTokenElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalTokenElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalTokenElement"


    // $ANTLR start "entryRuleParenthesizedTerminalElement"
    // InternalXtext.g:1270:1: entryRuleParenthesizedTerminalElement : ruleParenthesizedTerminalElement EOF ;
    public final void entryRuleParenthesizedTerminalElement() throws RecognitionException {
        try {
            // InternalXtext.g:1271:1: ( ruleParenthesizedTerminalElement EOF )
            // InternalXtext.g:1272:1: ruleParenthesizedTerminalElement EOF
            {
             before(grammarAccess.getParenthesizedTerminalElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesizedTerminalElement();

            state._fsp--;

             after(grammarAccess.getParenthesizedTerminalElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesizedTerminalElement"


    // $ANTLR start "ruleParenthesizedTerminalElement"
    // InternalXtext.g:1279:1: ruleParenthesizedTerminalElement : ( ( rule__ParenthesizedTerminalElement__Group__0 ) ) ;
    public final void ruleParenthesizedTerminalElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1283:2: ( ( ( rule__ParenthesizedTerminalElement__Group__0 ) ) )
            // InternalXtext.g:1284:2: ( ( rule__ParenthesizedTerminalElement__Group__0 ) )
            {
            // InternalXtext.g:1284:2: ( ( rule__ParenthesizedTerminalElement__Group__0 ) )
            // InternalXtext.g:1285:3: ( rule__ParenthesizedTerminalElement__Group__0 )
            {
             before(grammarAccess.getParenthesizedTerminalElementAccess().getGroup()); 
            // InternalXtext.g:1286:3: ( rule__ParenthesizedTerminalElement__Group__0 )
            // InternalXtext.g:1286:4: rule__ParenthesizedTerminalElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedTerminalElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesizedTerminalElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesizedTerminalElement"


    // $ANTLR start "entryRuleAbstractNegatedToken"
    // InternalXtext.g:1295:1: entryRuleAbstractNegatedToken : ruleAbstractNegatedToken EOF ;
    public final void entryRuleAbstractNegatedToken() throws RecognitionException {
        try {
            // InternalXtext.g:1296:1: ( ruleAbstractNegatedToken EOF )
            // InternalXtext.g:1297:1: ruleAbstractNegatedToken EOF
            {
             before(grammarAccess.getAbstractNegatedTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractNegatedToken();

            state._fsp--;

             after(grammarAccess.getAbstractNegatedTokenRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractNegatedToken"


    // $ANTLR start "ruleAbstractNegatedToken"
    // InternalXtext.g:1304:1: ruleAbstractNegatedToken : ( ( rule__AbstractNegatedToken__Alternatives ) ) ;
    public final void ruleAbstractNegatedToken() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1308:2: ( ( ( rule__AbstractNegatedToken__Alternatives ) ) )
            // InternalXtext.g:1309:2: ( ( rule__AbstractNegatedToken__Alternatives ) )
            {
            // InternalXtext.g:1309:2: ( ( rule__AbstractNegatedToken__Alternatives ) )
            // InternalXtext.g:1310:3: ( rule__AbstractNegatedToken__Alternatives )
            {
             before(grammarAccess.getAbstractNegatedTokenAccess().getAlternatives()); 
            // InternalXtext.g:1311:3: ( rule__AbstractNegatedToken__Alternatives )
            // InternalXtext.g:1311:4: rule__AbstractNegatedToken__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractNegatedToken__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractNegatedTokenAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractNegatedToken"


    // $ANTLR start "entryRuleNegatedToken"
    // InternalXtext.g:1320:1: entryRuleNegatedToken : ruleNegatedToken EOF ;
    public final void entryRuleNegatedToken() throws RecognitionException {
        try {
            // InternalXtext.g:1321:1: ( ruleNegatedToken EOF )
            // InternalXtext.g:1322:1: ruleNegatedToken EOF
            {
             before(grammarAccess.getNegatedTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNegatedToken();

            state._fsp--;

             after(grammarAccess.getNegatedTokenRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegatedToken"


    // $ANTLR start "ruleNegatedToken"
    // InternalXtext.g:1329:1: ruleNegatedToken : ( ( rule__NegatedToken__Group__0 ) ) ;
    public final void ruleNegatedToken() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1333:2: ( ( ( rule__NegatedToken__Group__0 ) ) )
            // InternalXtext.g:1334:2: ( ( rule__NegatedToken__Group__0 ) )
            {
            // InternalXtext.g:1334:2: ( ( rule__NegatedToken__Group__0 ) )
            // InternalXtext.g:1335:3: ( rule__NegatedToken__Group__0 )
            {
             before(grammarAccess.getNegatedTokenAccess().getGroup()); 
            // InternalXtext.g:1336:3: ( rule__NegatedToken__Group__0 )
            // InternalXtext.g:1336:4: rule__NegatedToken__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegatedToken__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegatedTokenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegatedToken"


    // $ANTLR start "entryRuleUntilToken"
    // InternalXtext.g:1345:1: entryRuleUntilToken : ruleUntilToken EOF ;
    public final void entryRuleUntilToken() throws RecognitionException {
        try {
            // InternalXtext.g:1346:1: ( ruleUntilToken EOF )
            // InternalXtext.g:1347:1: ruleUntilToken EOF
            {
             before(grammarAccess.getUntilTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUntilToken();

            state._fsp--;

             after(grammarAccess.getUntilTokenRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUntilToken"


    // $ANTLR start "ruleUntilToken"
    // InternalXtext.g:1354:1: ruleUntilToken : ( ( rule__UntilToken__Group__0 ) ) ;
    public final void ruleUntilToken() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1358:2: ( ( ( rule__UntilToken__Group__0 ) ) )
            // InternalXtext.g:1359:2: ( ( rule__UntilToken__Group__0 ) )
            {
            // InternalXtext.g:1359:2: ( ( rule__UntilToken__Group__0 ) )
            // InternalXtext.g:1360:3: ( rule__UntilToken__Group__0 )
            {
             before(grammarAccess.getUntilTokenAccess().getGroup()); 
            // InternalXtext.g:1361:3: ( rule__UntilToken__Group__0 )
            // InternalXtext.g:1361:4: rule__UntilToken__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UntilToken__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUntilTokenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUntilToken"


    // $ANTLR start "entryRuleWildcard"
    // InternalXtext.g:1370:1: entryRuleWildcard : ruleWildcard EOF ;
    public final void entryRuleWildcard() throws RecognitionException {
        try {
            // InternalXtext.g:1371:1: ( ruleWildcard EOF )
            // InternalXtext.g:1372:1: ruleWildcard EOF
            {
             before(grammarAccess.getWildcardRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleWildcard();

            state._fsp--;

             after(grammarAccess.getWildcardRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // InternalXtext.g:1379:1: ruleWildcard : ( ( rule__Wildcard__Group__0 ) ) ;
    public final void ruleWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1383:2: ( ( ( rule__Wildcard__Group__0 ) ) )
            // InternalXtext.g:1384:2: ( ( rule__Wildcard__Group__0 ) )
            {
            // InternalXtext.g:1384:2: ( ( rule__Wildcard__Group__0 ) )
            // InternalXtext.g:1385:3: ( rule__Wildcard__Group__0 )
            {
             before(grammarAccess.getWildcardAccess().getGroup()); 
            // InternalXtext.g:1386:3: ( rule__Wildcard__Group__0 )
            // InternalXtext.g:1386:4: rule__Wildcard__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Wildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleEOF"
    // InternalXtext.g:1395:1: entryRuleEOF : ruleEOF EOF ;
    public final void entryRuleEOF() throws RecognitionException {
        try {
            // InternalXtext.g:1396:1: ( ruleEOF EOF )
            // InternalXtext.g:1397:1: ruleEOF EOF
            {
             before(grammarAccess.getEOFRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEOF();

            state._fsp--;

             after(grammarAccess.getEOFRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEOF"


    // $ANTLR start "ruleEOF"
    // InternalXtext.g:1404:1: ruleEOF : ( ( rule__EOF__Group__0 ) ) ;
    public final void ruleEOF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1408:2: ( ( ( rule__EOF__Group__0 ) ) )
            // InternalXtext.g:1409:2: ( ( rule__EOF__Group__0 ) )
            {
            // InternalXtext.g:1409:2: ( ( rule__EOF__Group__0 ) )
            // InternalXtext.g:1410:3: ( rule__EOF__Group__0 )
            {
             before(grammarAccess.getEOFAccess().getGroup()); 
            // InternalXtext.g:1411:3: ( rule__EOF__Group__0 )
            // InternalXtext.g:1411:4: rule__EOF__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EOF__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEOFAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEOF"


    // $ANTLR start "entryRuleCharacterRange"
    // InternalXtext.g:1420:1: entryRuleCharacterRange : ruleCharacterRange EOF ;
    public final void entryRuleCharacterRange() throws RecognitionException {
        try {
            // InternalXtext.g:1421:1: ( ruleCharacterRange EOF )
            // InternalXtext.g:1422:1: ruleCharacterRange EOF
            {
             before(grammarAccess.getCharacterRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCharacterRange();

            state._fsp--;

             after(grammarAccess.getCharacterRangeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharacterRange"


    // $ANTLR start "ruleCharacterRange"
    // InternalXtext.g:1429:1: ruleCharacterRange : ( ( rule__CharacterRange__Group__0 ) ) ;
    public final void ruleCharacterRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1433:2: ( ( ( rule__CharacterRange__Group__0 ) ) )
            // InternalXtext.g:1434:2: ( ( rule__CharacterRange__Group__0 ) )
            {
            // InternalXtext.g:1434:2: ( ( rule__CharacterRange__Group__0 ) )
            // InternalXtext.g:1435:3: ( rule__CharacterRange__Group__0 )
            {
             before(grammarAccess.getCharacterRangeAccess().getGroup()); 
            // InternalXtext.g:1436:3: ( rule__CharacterRange__Group__0 )
            // InternalXtext.g:1436:4: rule__CharacterRange__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CharacterRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacterRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacterRange"


    // $ANTLR start "entryRuleEnumRule"
    // InternalXtext.g:1445:1: entryRuleEnumRule : ruleEnumRule EOF ;
    public final void entryRuleEnumRule() throws RecognitionException {
        try {
            // InternalXtext.g:1446:1: ( ruleEnumRule EOF )
            // InternalXtext.g:1447:1: ruleEnumRule EOF
            {
             before(grammarAccess.getEnumRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnumRule();

            state._fsp--;

             after(grammarAccess.getEnumRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumRule"


    // $ANTLR start "ruleEnumRule"
    // InternalXtext.g:1454:1: ruleEnumRule : ( ( rule__EnumRule__Group__0 ) ) ;
    public final void ruleEnumRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1458:2: ( ( ( rule__EnumRule__Group__0 ) ) )
            // InternalXtext.g:1459:2: ( ( rule__EnumRule__Group__0 ) )
            {
            // InternalXtext.g:1459:2: ( ( rule__EnumRule__Group__0 ) )
            // InternalXtext.g:1460:3: ( rule__EnumRule__Group__0 )
            {
             before(grammarAccess.getEnumRuleAccess().getGroup()); 
            // InternalXtext.g:1461:3: ( rule__EnumRule__Group__0 )
            // InternalXtext.g:1461:4: rule__EnumRule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumRule"


    // $ANTLR start "entryRuleEnumLiterals"
    // InternalXtext.g:1470:1: entryRuleEnumLiterals : ruleEnumLiterals EOF ;
    public final void entryRuleEnumLiterals() throws RecognitionException {
        try {
            // InternalXtext.g:1471:1: ( ruleEnumLiterals EOF )
            // InternalXtext.g:1472:1: ruleEnumLiterals EOF
            {
             before(grammarAccess.getEnumLiteralsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnumLiterals();

            state._fsp--;

             after(grammarAccess.getEnumLiteralsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumLiterals"


    // $ANTLR start "ruleEnumLiterals"
    // InternalXtext.g:1479:1: ruleEnumLiterals : ( ( rule__EnumLiterals__Group__0 ) ) ;
    public final void ruleEnumLiterals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1483:2: ( ( ( rule__EnumLiterals__Group__0 ) ) )
            // InternalXtext.g:1484:2: ( ( rule__EnumLiterals__Group__0 ) )
            {
            // InternalXtext.g:1484:2: ( ( rule__EnumLiterals__Group__0 ) )
            // InternalXtext.g:1485:3: ( rule__EnumLiterals__Group__0 )
            {
             before(grammarAccess.getEnumLiteralsAccess().getGroup()); 
            // InternalXtext.g:1486:3: ( rule__EnumLiterals__Group__0 )
            // InternalXtext.g:1486:4: rule__EnumLiterals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumLiterals"


    // $ANTLR start "entryRuleEnumLiteralDeclaration"
    // InternalXtext.g:1495:1: entryRuleEnumLiteralDeclaration : ruleEnumLiteralDeclaration EOF ;
    public final void entryRuleEnumLiteralDeclaration() throws RecognitionException {
        try {
            // InternalXtext.g:1496:1: ( ruleEnumLiteralDeclaration EOF )
            // InternalXtext.g:1497:1: ruleEnumLiteralDeclaration EOF
            {
             before(grammarAccess.getEnumLiteralDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnumLiteralDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumLiteralDeclarationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumLiteralDeclaration"


    // $ANTLR start "ruleEnumLiteralDeclaration"
    // InternalXtext.g:1504:1: ruleEnumLiteralDeclaration : ( ( rule__EnumLiteralDeclaration__Group__0 ) ) ;
    public final void ruleEnumLiteralDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1508:2: ( ( ( rule__EnumLiteralDeclaration__Group__0 ) ) )
            // InternalXtext.g:1509:2: ( ( rule__EnumLiteralDeclaration__Group__0 ) )
            {
            // InternalXtext.g:1509:2: ( ( rule__EnumLiteralDeclaration__Group__0 ) )
            // InternalXtext.g:1510:3: ( rule__EnumLiteralDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getGroup()); 
            // InternalXtext.g:1511:3: ( rule__EnumLiteralDeclaration__Group__0 )
            // InternalXtext.g:1511:4: rule__EnumLiteralDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiteralDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumLiteralDeclaration"


    // $ANTLR start "rule__AbstractRule__Alternatives"
    // InternalXtext.g:1519:1: rule__AbstractRule__Alternatives : ( ( ruleParserRule ) | ( ruleTerminalRule ) | ( ruleEnumRule ) );
    public final void rule__AbstractRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1523:1: ( ( ruleParserRule ) | ( ruleTerminalRule ) | ( ruleEnumRule ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalXtext.g:1524:2: ( ruleParserRule )
                    {
                    // InternalXtext.g:1524:2: ( ruleParserRule )
                    // InternalXtext.g:1525:3: ruleParserRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getParserRuleParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParserRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getParserRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1530:2: ( ruleTerminalRule )
                    {
                    // InternalXtext.g:1530:2: ( ruleTerminalRule )
                    // InternalXtext.g:1531:3: ruleTerminalRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getTerminalRuleParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTerminalRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getTerminalRuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:1536:2: ( ruleEnumRule )
                    {
                    // InternalXtext.g:1536:2: ( ruleEnumRule )
                    // InternalXtext.g:1537:3: ruleEnumRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getEnumRuleParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEnumRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getEnumRuleParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractRule__Alternatives"


    // $ANTLR start "rule__AbstractMetamodelDeclaration__Alternatives"
    // InternalXtext.g:1546:1: rule__AbstractMetamodelDeclaration__Alternatives : ( ( ruleGeneratedMetamodel ) | ( ruleReferencedMetamodel ) );
    public final void rule__AbstractMetamodelDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1550:1: ( ( ruleGeneratedMetamodel ) | ( ruleReferencedMetamodel ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXtext.g:1551:2: ( ruleGeneratedMetamodel )
                    {
                    // InternalXtext.g:1551:2: ( ruleGeneratedMetamodel )
                    // InternalXtext.g:1552:3: ruleGeneratedMetamodel
                    {
                     before(grammarAccess.getAbstractMetamodelDeclarationAccess().getGeneratedMetamodelParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGeneratedMetamodel();

                    state._fsp--;

                     after(grammarAccess.getAbstractMetamodelDeclarationAccess().getGeneratedMetamodelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1557:2: ( ruleReferencedMetamodel )
                    {
                    // InternalXtext.g:1557:2: ( ruleReferencedMetamodel )
                    // InternalXtext.g:1558:3: ruleReferencedMetamodel
                    {
                     before(grammarAccess.getAbstractMetamodelDeclarationAccess().getReferencedMetamodelParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleReferencedMetamodel();

                    state._fsp--;

                     after(grammarAccess.getAbstractMetamodelDeclarationAccess().getReferencedMetamodelParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractMetamodelDeclaration__Alternatives"


    // $ANTLR start "rule__ParserRule__Alternatives_1"
    // InternalXtext.g:1567:1: rule__ParserRule__Alternatives_1 : ( ( ( rule__ParserRule__Group_1_0__0 ) ) | ( ( rule__ParserRule__Group_1_1__0 ) ) );
    public final void rule__ParserRule__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1571:1: ( ( ( rule__ParserRule__Group_1_0__0 ) ) | ( ( rule__ParserRule__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==51) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||(LA3_0>=17 && LA3_0<=18)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXtext.g:1572:2: ( ( rule__ParserRule__Group_1_0__0 ) )
                    {
                    // InternalXtext.g:1572:2: ( ( rule__ParserRule__Group_1_0__0 ) )
                    // InternalXtext.g:1573:3: ( rule__ParserRule__Group_1_0__0 )
                    {
                     before(grammarAccess.getParserRuleAccess().getGroup_1_0()); 
                    // InternalXtext.g:1574:3: ( rule__ParserRule__Group_1_0__0 )
                    // InternalXtext.g:1574:4: rule__ParserRule__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ParserRule__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserRuleAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1578:2: ( ( rule__ParserRule__Group_1_1__0 ) )
                    {
                    // InternalXtext.g:1578:2: ( ( rule__ParserRule__Group_1_1__0 ) )
                    // InternalXtext.g:1579:3: ( rule__ParserRule__Group_1_1__0 )
                    {
                     before(grammarAccess.getParserRuleAccess().getGroup_1_1()); 
                    // InternalXtext.g:1580:3: ( rule__ParserRule__Group_1_1__0 )
                    // InternalXtext.g:1580:4: rule__ParserRule__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ParserRule__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserRuleAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Alternatives_1"


    // $ANTLR start "rule__ParserRule__Alternatives_1_0_2"
    // InternalXtext.g:1588:1: rule__ParserRule__Alternatives_1_0_2 : ( ( ( rule__ParserRule__WildcardAssignment_1_0_2_0 ) ) | ( ( rule__ParserRule__Group_1_0_2_1__0 )? ) );
    public final void rule__ParserRule__Alternatives_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1592:1: ( ( ( rule__ParserRule__WildcardAssignment_1_0_2_0 ) ) | ( ( rule__ParserRule__Group_1_0_2_1__0 )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==30||LA5_0==32||LA5_0==50) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXtext.g:1593:2: ( ( rule__ParserRule__WildcardAssignment_1_0_2_0 ) )
                    {
                    // InternalXtext.g:1593:2: ( ( rule__ParserRule__WildcardAssignment_1_0_2_0 ) )
                    // InternalXtext.g:1594:3: ( rule__ParserRule__WildcardAssignment_1_0_2_0 )
                    {
                     before(grammarAccess.getParserRuleAccess().getWildcardAssignment_1_0_2_0()); 
                    // InternalXtext.g:1595:3: ( rule__ParserRule__WildcardAssignment_1_0_2_0 )
                    // InternalXtext.g:1595:4: rule__ParserRule__WildcardAssignment_1_0_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ParserRule__WildcardAssignment_1_0_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserRuleAccess().getWildcardAssignment_1_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1599:2: ( ( rule__ParserRule__Group_1_0_2_1__0 )? )
                    {
                    // InternalXtext.g:1599:2: ( ( rule__ParserRule__Group_1_0_2_1__0 )? )
                    // InternalXtext.g:1600:3: ( rule__ParserRule__Group_1_0_2_1__0 )?
                    {
                     before(grammarAccess.getParserRuleAccess().getGroup_1_0_2_1()); 
                    // InternalXtext.g:1601:3: ( rule__ParserRule__Group_1_0_2_1__0 )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==32) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalXtext.g:1601:4: rule__ParserRule__Group_1_0_2_1__0
                            {
                            pushFollow(FollowSets000.FOLLOW_2);
                            rule__ParserRule__Group_1_0_2_1__0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getParserRuleAccess().getGroup_1_0_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Alternatives_1_0_2"


    // $ANTLR start "rule__ConditionalBranch__Alternatives"
    // InternalXtext.g:1609:1: rule__ConditionalBranch__Alternatives : ( ( ruleUnorderedGroup ) | ( ( rule__ConditionalBranch__Group_1__0 ) ) );
    public final void rule__ConditionalBranch__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1613:1: ( ( ruleUnorderedGroup ) | ( ( rule__ConditionalBranch__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||(LA6_0>=17 && LA6_0<=18)||LA6_0==23||LA6_0==39||LA6_0==46||LA6_0==52) ) {
                alt6=1;
            }
            else if ( (LA6_0==34) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXtext.g:1614:2: ( ruleUnorderedGroup )
                    {
                    // InternalXtext.g:1614:2: ( ruleUnorderedGroup )
                    // InternalXtext.g:1615:3: ruleUnorderedGroup
                    {
                     before(grammarAccess.getConditionalBranchAccess().getUnorderedGroupParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnorderedGroup();

                    state._fsp--;

                     after(grammarAccess.getConditionalBranchAccess().getUnorderedGroupParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1620:2: ( ( rule__ConditionalBranch__Group_1__0 ) )
                    {
                    // InternalXtext.g:1620:2: ( ( rule__ConditionalBranch__Group_1__0 ) )
                    // InternalXtext.g:1621:3: ( rule__ConditionalBranch__Group_1__0 )
                    {
                     before(grammarAccess.getConditionalBranchAccess().getGroup_1()); 
                    // InternalXtext.g:1622:3: ( rule__ConditionalBranch__Group_1__0 )
                    // InternalXtext.g:1622:4: rule__ConditionalBranch__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ConditionalBranch__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionalBranchAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Alternatives"


    // $ANTLR start "rule__AbstractToken__Alternatives"
    // InternalXtext.g:1630:1: rule__AbstractToken__Alternatives : ( ( ruleAbstractTokenWithCardinality ) | ( ruleAction ) );
    public final void rule__AbstractToken__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1634:1: ( ( ruleAbstractTokenWithCardinality ) | ( ruleAction ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||(LA7_0>=17 && LA7_0<=18)||LA7_0==23||LA7_0==46||LA7_0==52) ) {
                alt7=1;
            }
            else if ( (LA7_0==39) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalXtext.g:1635:2: ( ruleAbstractTokenWithCardinality )
                    {
                    // InternalXtext.g:1635:2: ( ruleAbstractTokenWithCardinality )
                    // InternalXtext.g:1636:3: ruleAbstractTokenWithCardinality
                    {
                     before(grammarAccess.getAbstractTokenAccess().getAbstractTokenWithCardinalityParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAbstractTokenWithCardinality();

                    state._fsp--;

                     after(grammarAccess.getAbstractTokenAccess().getAbstractTokenWithCardinalityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1641:2: ( ruleAction )
                    {
                    // InternalXtext.g:1641:2: ( ruleAction )
                    // InternalXtext.g:1642:3: ruleAction
                    {
                     before(grammarAccess.getAbstractTokenAccess().getActionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAction();

                    state._fsp--;

                     after(grammarAccess.getAbstractTokenAccess().getActionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractToken__Alternatives"


    // $ANTLR start "rule__AbstractTokenWithCardinality__Alternatives_0"
    // InternalXtext.g:1651:1: rule__AbstractTokenWithCardinality__Alternatives_0 : ( ( ruleAssignment ) | ( ruleAbstractTerminal ) );
    public final void rule__AbstractTokenWithCardinality__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1655:1: ( ( ruleAssignment ) | ( ruleAbstractTerminal ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalXtext.g:1656:2: ( ruleAssignment )
                    {
                    // InternalXtext.g:1656:2: ( ruleAssignment )
                    // InternalXtext.g:1657:3: ruleAssignment
                    {
                     before(grammarAccess.getAbstractTokenWithCardinalityAccess().getAssignmentParserRuleCall_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getAbstractTokenWithCardinalityAccess().getAssignmentParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1662:2: ( ruleAbstractTerminal )
                    {
                    // InternalXtext.g:1662:2: ( ruleAbstractTerminal )
                    // InternalXtext.g:1663:3: ruleAbstractTerminal
                    {
                     before(grammarAccess.getAbstractTokenWithCardinalityAccess().getAbstractTerminalParserRuleCall_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAbstractTerminal();

                    state._fsp--;

                     after(grammarAccess.getAbstractTokenWithCardinalityAccess().getAbstractTerminalParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTokenWithCardinality__Alternatives_0"


    // $ANTLR start "rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0"
    // InternalXtext.g:1672:1: rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0 : ( ( '?' ) | ( '*' ) | ( '+' ) );
    public final void rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1676:1: ( ( '?' ) | ( '*' ) | ( '+' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt9=1;
                }
                break;
            case 13:
                {
                alt9=2;
                }
                break;
            case 14:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalXtext.g:1677:2: ( '?' )
                    {
                    // InternalXtext.g:1677:2: ( '?' )
                    // InternalXtext.g:1678:3: '?'
                    {
                     before(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityQuestionMarkKeyword_1_0_0()); 
                    match(input,12,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityQuestionMarkKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1683:2: ( '*' )
                    {
                    // InternalXtext.g:1683:2: ( '*' )
                    // InternalXtext.g:1684:3: '*'
                    {
                     before(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAsteriskKeyword_1_0_1()); 
                    match(input,13,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAsteriskKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:1689:2: ( '+' )
                    {
                    // InternalXtext.g:1689:2: ( '+' )
                    // InternalXtext.g:1690:3: '+'
                    {
                     before(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityPlusSignKeyword_1_0_2()); 
                    match(input,14,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityPlusSignKeyword_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0"


    // $ANTLR start "rule__Action__OperatorAlternatives_2_2_0"
    // InternalXtext.g:1699:1: rule__Action__OperatorAlternatives_2_2_0 : ( ( '=' ) | ( '+=' ) );
    public final void rule__Action__OperatorAlternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1703:1: ( ( '=' ) | ( '+=' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            else if ( (LA10_0==16) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXtext.g:1704:2: ( '=' )
                    {
                    // InternalXtext.g:1704:2: ( '=' )
                    // InternalXtext.g:1705:3: '='
                    {
                     before(grammarAccess.getActionAccess().getOperatorEqualsSignKeyword_2_2_0_0()); 
                    match(input,15,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getOperatorEqualsSignKeyword_2_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1710:2: ( '+=' )
                    {
                    // InternalXtext.g:1710:2: ( '+=' )
                    // InternalXtext.g:1711:3: '+='
                    {
                     before(grammarAccess.getActionAccess().getOperatorPlusSignEqualsSignKeyword_2_2_0_1()); 
                    match(input,16,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getOperatorPlusSignEqualsSignKeyword_2_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__OperatorAlternatives_2_2_0"


    // $ANTLR start "rule__AbstractTerminal__Alternatives"
    // InternalXtext.g:1720:1: rule__AbstractTerminal__Alternatives : ( ( ruleKeyword ) | ( ruleRuleCall ) | ( ruleParenthesizedElement ) | ( rulePredicatedKeyword ) | ( rulePredicatedRuleCall ) | ( rulePredicatedGroup ) );
    public final void rule__AbstractTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1724:1: ( ( ruleKeyword ) | ( ruleRuleCall ) | ( ruleParenthesizedElement ) | ( rulePredicatedKeyword ) | ( rulePredicatedRuleCall ) | ( rulePredicatedGroup ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
            case 17:
            case 18:
                {
                alt11=2;
                }
                break;
            case 23:
                {
                alt11=3;
                }
                break;
            case 52:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    alt11=4;
                    }
                    break;
                case 23:
                    {
                    alt11=6;
                    }
                    break;
                case RULE_ID:
                case 17:
                case 18:
                    {
                    alt11=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;
                }

                }
                break;
            case 46:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    alt11=4;
                    }
                    break;
                case 23:
                    {
                    alt11=6;
                    }
                    break;
                case RULE_ID:
                case 17:
                case 18:
                    {
                    alt11=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 5, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalXtext.g:1725:2: ( ruleKeyword )
                    {
                    // InternalXtext.g:1725:2: ( ruleKeyword )
                    // InternalXtext.g:1726:3: ruleKeyword
                    {
                     before(grammarAccess.getAbstractTerminalAccess().getKeywordParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyword();

                    state._fsp--;

                     after(grammarAccess.getAbstractTerminalAccess().getKeywordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1731:2: ( ruleRuleCall )
                    {
                    // InternalXtext.g:1731:2: ( ruleRuleCall )
                    // InternalXtext.g:1732:3: ruleRuleCall
                    {
                     before(grammarAccess.getAbstractTerminalAccess().getRuleCallParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleRuleCall();

                    state._fsp--;

                     after(grammarAccess.getAbstractTerminalAccess().getRuleCallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:1737:2: ( ruleParenthesizedElement )
                    {
                    // InternalXtext.g:1737:2: ( ruleParenthesizedElement )
                    // InternalXtext.g:1738:3: ruleParenthesizedElement
                    {
                     before(grammarAccess.getAbstractTerminalAccess().getParenthesizedElementParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesizedElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractTerminalAccess().getParenthesizedElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXtext.g:1743:2: ( rulePredicatedKeyword )
                    {
                    // InternalXtext.g:1743:2: ( rulePredicatedKeyword )
                    // InternalXtext.g:1744:3: rulePredicatedKeyword
                    {
                     before(grammarAccess.getAbstractTerminalAccess().getPredicatedKeywordParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePredicatedKeyword();

                    state._fsp--;

                     after(grammarAccess.getAbstractTerminalAccess().getPredicatedKeywordParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXtext.g:1749:2: ( rulePredicatedRuleCall )
                    {
                    // InternalXtext.g:1749:2: ( rulePredicatedRuleCall )
                    // InternalXtext.g:1750:3: rulePredicatedRuleCall
                    {
                     before(grammarAccess.getAbstractTerminalAccess().getPredicatedRuleCallParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePredicatedRuleCall();

                    state._fsp--;

                     after(grammarAccess.getAbstractTerminalAccess().getPredicatedRuleCallParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXtext.g:1755:2: ( rulePredicatedGroup )
                    {
                    // InternalXtext.g:1755:2: ( rulePredicatedGroup )
                    // InternalXtext.g:1756:3: rulePredicatedGroup
                    {
                     before(grammarAccess.getAbstractTerminalAccess().getPredicatedGroupParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePredicatedGroup();

                    state._fsp--;

                     after(grammarAccess.getAbstractTerminalAccess().getPredicatedGroupParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTerminal__Alternatives"


    // $ANTLR start "rule__LiteralCondition__Alternatives_1"
    // InternalXtext.g:1765:1: rule__LiteralCondition__Alternatives_1 : ( ( ( rule__LiteralCondition__TrueAssignment_1_0 ) ) | ( 'false' ) );
    public final void rule__LiteralCondition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1769:1: ( ( ( rule__LiteralCondition__TrueAssignment_1_0 ) ) | ( 'false' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==17) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalXtext.g:1770:2: ( ( rule__LiteralCondition__TrueAssignment_1_0 ) )
                    {
                    // InternalXtext.g:1770:2: ( ( rule__LiteralCondition__TrueAssignment_1_0 ) )
                    // InternalXtext.g:1771:3: ( rule__LiteralCondition__TrueAssignment_1_0 )
                    {
                     before(grammarAccess.getLiteralConditionAccess().getTrueAssignment_1_0()); 
                    // InternalXtext.g:1772:3: ( rule__LiteralCondition__TrueAssignment_1_0 )
                    // InternalXtext.g:1772:4: rule__LiteralCondition__TrueAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LiteralCondition__TrueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralConditionAccess().getTrueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1776:2: ( 'false' )
                    {
                    // InternalXtext.g:1776:2: ( 'false' )
                    // InternalXtext.g:1777:3: 'false'
                    {
                     before(grammarAccess.getLiteralConditionAccess().getFalseKeyword_1_1()); 
                    match(input,17,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralConditionAccess().getFalseKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralCondition__Alternatives_1"


    // $ANTLR start "rule__Negation__Alternatives"
    // InternalXtext.g:1786:1: rule__Negation__Alternatives : ( ( ruleAtom ) | ( ( rule__Negation__Group_1__0 ) ) );
    public final void rule__Negation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1790:1: ( ( ruleAtom ) | ( ( rule__Negation__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=17 && LA13_0<=18)||LA13_0==23) ) {
                alt13=1;
            }
            else if ( (LA13_0==42) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalXtext.g:1791:2: ( ruleAtom )
                    {
                    // InternalXtext.g:1791:2: ( ruleAtom )
                    // InternalXtext.g:1792:3: ruleAtom
                    {
                     before(grammarAccess.getNegationAccess().getAtomParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAtom();

                    state._fsp--;

                     after(grammarAccess.getNegationAccess().getAtomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1797:2: ( ( rule__Negation__Group_1__0 ) )
                    {
                    // InternalXtext.g:1797:2: ( ( rule__Negation__Group_1__0 ) )
                    // InternalXtext.g:1798:3: ( rule__Negation__Group_1__0 )
                    {
                     before(grammarAccess.getNegationAccess().getGroup_1()); 
                    // InternalXtext.g:1799:3: ( rule__Negation__Group_1__0 )
                    // InternalXtext.g:1799:4: rule__Negation__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Negation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNegationAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Alternatives"


    // $ANTLR start "rule__Atom__Alternatives"
    // InternalXtext.g:1807:1: rule__Atom__Alternatives : ( ( ruleParameterReference ) | ( ruleParenthesizedCondition ) | ( ruleLiteralCondition ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1811:1: ( ( ruleParameterReference ) | ( ruleParenthesizedCondition ) | ( ruleLiteralCondition ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case 23:
                {
                alt14=2;
                }
                break;
            case 17:
            case 18:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalXtext.g:1812:2: ( ruleParameterReference )
                    {
                    // InternalXtext.g:1812:2: ( ruleParameterReference )
                    // InternalXtext.g:1813:3: ruleParameterReference
                    {
                     before(grammarAccess.getAtomAccess().getParameterReferenceParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParameterReference();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getParameterReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1818:2: ( ruleParenthesizedCondition )
                    {
                    // InternalXtext.g:1818:2: ( ruleParenthesizedCondition )
                    // InternalXtext.g:1819:3: ruleParenthesizedCondition
                    {
                     before(grammarAccess.getAtomAccess().getParenthesizedConditionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesizedCondition();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getParenthesizedConditionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:1824:2: ( ruleLiteralCondition )
                    {
                    // InternalXtext.g:1824:2: ( ruleLiteralCondition )
                    // InternalXtext.g:1825:3: ruleLiteralCondition
                    {
                     before(grammarAccess.getAtomAccess().getLiteralConditionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLiteralCondition();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getLiteralConditionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__ValidID__Alternatives"
    // InternalXtext.g:1834:1: rule__ValidID__Alternatives : ( ( RULE_ID ) | ( 'true' ) | ( 'false' ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1838:1: ( ( RULE_ID ) | ( 'true' ) | ( 'false' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt15=1;
                }
                break;
            case 18:
                {
                alt15=2;
                }
                break;
            case 17:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalXtext.g:1839:2: ( RULE_ID )
                    {
                    // InternalXtext.g:1839:2: ( RULE_ID )
                    // InternalXtext.g:1840:3: RULE_ID
                    {
                     before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1845:2: ( 'true' )
                    {
                    // InternalXtext.g:1845:2: ( 'true' )
                    // InternalXtext.g:1846:3: 'true'
                    {
                     before(grammarAccess.getValidIDAccess().getTrueKeyword_1()); 
                    match(input,18,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getTrueKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:1851:2: ( 'false' )
                    {
                    // InternalXtext.g:1851:2: ( 'false' )
                    // InternalXtext.g:1852:3: 'false'
                    {
                     before(grammarAccess.getValidIDAccess().getFalseKeyword_2()); 
                    match(input,17,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getFalseKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidID__Alternatives"


    // $ANTLR start "rule__PredicatedKeyword__Alternatives_0"
    // InternalXtext.g:1861:1: rule__PredicatedKeyword__Alternatives_0 : ( ( ( rule__PredicatedKeyword__PredicatedAssignment_0_0 ) ) | ( ( rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1 ) ) );
    public final void rule__PredicatedKeyword__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1865:1: ( ( ( rule__PredicatedKeyword__PredicatedAssignment_0_0 ) ) | ( ( rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==52) ) {
                alt16=1;
            }
            else if ( (LA16_0==46) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalXtext.g:1866:2: ( ( rule__PredicatedKeyword__PredicatedAssignment_0_0 ) )
                    {
                    // InternalXtext.g:1866:2: ( ( rule__PredicatedKeyword__PredicatedAssignment_0_0 ) )
                    // InternalXtext.g:1867:3: ( rule__PredicatedKeyword__PredicatedAssignment_0_0 )
                    {
                     before(grammarAccess.getPredicatedKeywordAccess().getPredicatedAssignment_0_0()); 
                    // InternalXtext.g:1868:3: ( rule__PredicatedKeyword__PredicatedAssignment_0_0 )
                    // InternalXtext.g:1868:4: rule__PredicatedKeyword__PredicatedAssignment_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PredicatedKeyword__PredicatedAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicatedKeywordAccess().getPredicatedAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1872:2: ( ( rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1 ) )
                    {
                    // InternalXtext.g:1872:2: ( ( rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1 ) )
                    // InternalXtext.g:1873:3: ( rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1 )
                    {
                     before(grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedAssignment_0_1()); 
                    // InternalXtext.g:1874:3: ( rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1 )
                    // InternalXtext.g:1874:4: rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedKeyword__Alternatives_0"


    // $ANTLR start "rule__PredicatedRuleCall__Alternatives_0"
    // InternalXtext.g:1882:1: rule__PredicatedRuleCall__Alternatives_0 : ( ( ( rule__PredicatedRuleCall__PredicatedAssignment_0_0 ) ) | ( ( rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1 ) ) );
    public final void rule__PredicatedRuleCall__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1886:1: ( ( ( rule__PredicatedRuleCall__PredicatedAssignment_0_0 ) ) | ( ( rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            else if ( (LA17_0==46) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalXtext.g:1887:2: ( ( rule__PredicatedRuleCall__PredicatedAssignment_0_0 ) )
                    {
                    // InternalXtext.g:1887:2: ( ( rule__PredicatedRuleCall__PredicatedAssignment_0_0 ) )
                    // InternalXtext.g:1888:3: ( rule__PredicatedRuleCall__PredicatedAssignment_0_0 )
                    {
                     before(grammarAccess.getPredicatedRuleCallAccess().getPredicatedAssignment_0_0()); 
                    // InternalXtext.g:1889:3: ( rule__PredicatedRuleCall__PredicatedAssignment_0_0 )
                    // InternalXtext.g:1889:4: rule__PredicatedRuleCall__PredicatedAssignment_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PredicatedRuleCall__PredicatedAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicatedRuleCallAccess().getPredicatedAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1893:2: ( ( rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1 ) )
                    {
                    // InternalXtext.g:1893:2: ( ( rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1 ) )
                    // InternalXtext.g:1894:3: ( rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1 )
                    {
                     before(grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedAssignment_0_1()); 
                    // InternalXtext.g:1895:3: ( rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1 )
                    // InternalXtext.g:1895:4: rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Alternatives_0"


    // $ANTLR start "rule__Assignment__Alternatives_0"
    // InternalXtext.g:1903:1: rule__Assignment__Alternatives_0 : ( ( ( rule__Assignment__PredicatedAssignment_0_0 ) ) | ( ( rule__Assignment__FirstSetPredicatedAssignment_0_1 ) ) );
    public final void rule__Assignment__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1907:1: ( ( ( rule__Assignment__PredicatedAssignment_0_0 ) ) | ( ( rule__Assignment__FirstSetPredicatedAssignment_0_1 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==52) ) {
                alt18=1;
            }
            else if ( (LA18_0==46) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalXtext.g:1908:2: ( ( rule__Assignment__PredicatedAssignment_0_0 ) )
                    {
                    // InternalXtext.g:1908:2: ( ( rule__Assignment__PredicatedAssignment_0_0 ) )
                    // InternalXtext.g:1909:3: ( rule__Assignment__PredicatedAssignment_0_0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getPredicatedAssignment_0_0()); 
                    // InternalXtext.g:1910:3: ( rule__Assignment__PredicatedAssignment_0_0 )
                    // InternalXtext.g:1910:4: rule__Assignment__PredicatedAssignment_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Assignment__PredicatedAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getPredicatedAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1914:2: ( ( rule__Assignment__FirstSetPredicatedAssignment_0_1 ) )
                    {
                    // InternalXtext.g:1914:2: ( ( rule__Assignment__FirstSetPredicatedAssignment_0_1 ) )
                    // InternalXtext.g:1915:3: ( rule__Assignment__FirstSetPredicatedAssignment_0_1 )
                    {
                     before(grammarAccess.getAssignmentAccess().getFirstSetPredicatedAssignment_0_1()); 
                    // InternalXtext.g:1916:3: ( rule__Assignment__FirstSetPredicatedAssignment_0_1 )
                    // InternalXtext.g:1916:4: rule__Assignment__FirstSetPredicatedAssignment_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Assignment__FirstSetPredicatedAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getFirstSetPredicatedAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Alternatives_0"


    // $ANTLR start "rule__Assignment__OperatorAlternatives_2_0"
    // InternalXtext.g:1924:1: rule__Assignment__OperatorAlternatives_2_0 : ( ( '+=' ) | ( '=' ) | ( '?=' ) );
    public final void rule__Assignment__OperatorAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1928:1: ( ( '+=' ) | ( '=' ) | ( '?=' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt19=1;
                }
                break;
            case 15:
                {
                alt19=2;
                }
                break;
            case 19:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalXtext.g:1929:2: ( '+=' )
                    {
                    // InternalXtext.g:1929:2: ( '+=' )
                    // InternalXtext.g:1930:3: '+='
                    {
                     before(grammarAccess.getAssignmentAccess().getOperatorPlusSignEqualsSignKeyword_2_0_0()); 
                    match(input,16,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAssignmentAccess().getOperatorPlusSignEqualsSignKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1935:2: ( '=' )
                    {
                    // InternalXtext.g:1935:2: ( '=' )
                    // InternalXtext.g:1936:3: '='
                    {
                     before(grammarAccess.getAssignmentAccess().getOperatorEqualsSignKeyword_2_0_1()); 
                    match(input,15,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAssignmentAccess().getOperatorEqualsSignKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:1941:2: ( '?=' )
                    {
                    // InternalXtext.g:1941:2: ( '?=' )
                    // InternalXtext.g:1942:3: '?='
                    {
                     before(grammarAccess.getAssignmentAccess().getOperatorQuestionMarkEqualsSignKeyword_2_0_2()); 
                    match(input,19,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAssignmentAccess().getOperatorQuestionMarkEqualsSignKeyword_2_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__OperatorAlternatives_2_0"


    // $ANTLR start "rule__AssignableTerminal__Alternatives"
    // InternalXtext.g:1951:1: rule__AssignableTerminal__Alternatives : ( ( ruleKeyword ) | ( ruleRuleCall ) | ( ruleParenthesizedAssignableElement ) | ( ruleCrossReference ) );
    public final void rule__AssignableTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1955:1: ( ( ruleKeyword ) | ( ruleRuleCall ) | ( ruleParenthesizedAssignableElement ) | ( ruleCrossReference ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
            case 17:
            case 18:
                {
                alt20=2;
                }
                break;
            case 23:
                {
                alt20=3;
                }
                break;
            case 43:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalXtext.g:1956:2: ( ruleKeyword )
                    {
                    // InternalXtext.g:1956:2: ( ruleKeyword )
                    // InternalXtext.g:1957:3: ruleKeyword
                    {
                     before(grammarAccess.getAssignableTerminalAccess().getKeywordParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyword();

                    state._fsp--;

                     after(grammarAccess.getAssignableTerminalAccess().getKeywordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1962:2: ( ruleRuleCall )
                    {
                    // InternalXtext.g:1962:2: ( ruleRuleCall )
                    // InternalXtext.g:1963:3: ruleRuleCall
                    {
                     before(grammarAccess.getAssignableTerminalAccess().getRuleCallParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleRuleCall();

                    state._fsp--;

                     after(grammarAccess.getAssignableTerminalAccess().getRuleCallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:1968:2: ( ruleParenthesizedAssignableElement )
                    {
                    // InternalXtext.g:1968:2: ( ruleParenthesizedAssignableElement )
                    // InternalXtext.g:1969:3: ruleParenthesizedAssignableElement
                    {
                     before(grammarAccess.getAssignableTerminalAccess().getParenthesizedAssignableElementParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesizedAssignableElement();

                    state._fsp--;

                     after(grammarAccess.getAssignableTerminalAccess().getParenthesizedAssignableElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXtext.g:1974:2: ( ruleCrossReference )
                    {
                    // InternalXtext.g:1974:2: ( ruleCrossReference )
                    // InternalXtext.g:1975:3: ruleCrossReference
                    {
                     before(grammarAccess.getAssignableTerminalAccess().getCrossReferenceParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCrossReference();

                    state._fsp--;

                     after(grammarAccess.getAssignableTerminalAccess().getCrossReferenceParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableTerminal__Alternatives"


    // $ANTLR start "rule__CrossReferenceableTerminal__Alternatives"
    // InternalXtext.g:1984:1: rule__CrossReferenceableTerminal__Alternatives : ( ( ruleKeyword ) | ( ruleRuleCall ) );
    public final void rule__CrossReferenceableTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:1988:1: ( ( ruleKeyword ) | ( ruleRuleCall ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID||(LA21_0>=17 && LA21_0<=18)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalXtext.g:1989:2: ( ruleKeyword )
                    {
                    // InternalXtext.g:1989:2: ( ruleKeyword )
                    // InternalXtext.g:1990:3: ruleKeyword
                    {
                     before(grammarAccess.getCrossReferenceableTerminalAccess().getKeywordParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyword();

                    state._fsp--;

                     after(grammarAccess.getCrossReferenceableTerminalAccess().getKeywordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1995:2: ( ruleRuleCall )
                    {
                    // InternalXtext.g:1995:2: ( ruleRuleCall )
                    // InternalXtext.g:1996:3: ruleRuleCall
                    {
                     before(grammarAccess.getCrossReferenceableTerminalAccess().getRuleCallParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleRuleCall();

                    state._fsp--;

                     after(grammarAccess.getCrossReferenceableTerminalAccess().getRuleCallParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReferenceableTerminal__Alternatives"


    // $ANTLR start "rule__PredicatedGroup__Alternatives_0"
    // InternalXtext.g:2005:1: rule__PredicatedGroup__Alternatives_0 : ( ( ( rule__PredicatedGroup__PredicatedAssignment_0_0 ) ) | ( ( rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1 ) ) );
    public final void rule__PredicatedGroup__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2009:1: ( ( ( rule__PredicatedGroup__PredicatedAssignment_0_0 ) ) | ( ( rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==52) ) {
                alt22=1;
            }
            else if ( (LA22_0==46) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalXtext.g:2010:2: ( ( rule__PredicatedGroup__PredicatedAssignment_0_0 ) )
                    {
                    // InternalXtext.g:2010:2: ( ( rule__PredicatedGroup__PredicatedAssignment_0_0 ) )
                    // InternalXtext.g:2011:3: ( rule__PredicatedGroup__PredicatedAssignment_0_0 )
                    {
                     before(grammarAccess.getPredicatedGroupAccess().getPredicatedAssignment_0_0()); 
                    // InternalXtext.g:2012:3: ( rule__PredicatedGroup__PredicatedAssignment_0_0 )
                    // InternalXtext.g:2012:4: rule__PredicatedGroup__PredicatedAssignment_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PredicatedGroup__PredicatedAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicatedGroupAccess().getPredicatedAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2016:2: ( ( rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1 ) )
                    {
                    // InternalXtext.g:2016:2: ( ( rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1 ) )
                    // InternalXtext.g:2017:3: ( rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1 )
                    {
                     before(grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedAssignment_0_1()); 
                    // InternalXtext.g:2018:3: ( rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1 )
                    // InternalXtext.g:2018:4: rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Alternatives_0"


    // $ANTLR start "rule__TerminalRule__Alternatives_2"
    // InternalXtext.g:2026:1: rule__TerminalRule__Alternatives_2 : ( ( ( rule__TerminalRule__Group_2_0__0 ) ) | ( ( rule__TerminalRule__Group_2_1__0 ) ) );
    public final void rule__TerminalRule__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2030:1: ( ( ( rule__TerminalRule__Group_2_0__0 ) ) | ( ( rule__TerminalRule__Group_2_1__0 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==51) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID||(LA23_0>=17 && LA23_0<=18)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalXtext.g:2031:2: ( ( rule__TerminalRule__Group_2_0__0 ) )
                    {
                    // InternalXtext.g:2031:2: ( ( rule__TerminalRule__Group_2_0__0 ) )
                    // InternalXtext.g:2032:3: ( rule__TerminalRule__Group_2_0__0 )
                    {
                     before(grammarAccess.getTerminalRuleAccess().getGroup_2_0()); 
                    // InternalXtext.g:2033:3: ( rule__TerminalRule__Group_2_0__0 )
                    // InternalXtext.g:2033:4: rule__TerminalRule__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TerminalRule__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalRuleAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2037:2: ( ( rule__TerminalRule__Group_2_1__0 ) )
                    {
                    // InternalXtext.g:2037:2: ( ( rule__TerminalRule__Group_2_1__0 ) )
                    // InternalXtext.g:2038:3: ( rule__TerminalRule__Group_2_1__0 )
                    {
                     before(grammarAccess.getTerminalRuleAccess().getGroup_2_1()); 
                    // InternalXtext.g:2039:3: ( rule__TerminalRule__Group_2_1__0 )
                    // InternalXtext.g:2039:4: rule__TerminalRule__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TerminalRule__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalRuleAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Alternatives_2"


    // $ANTLR start "rule__TerminalToken__CardinalityAlternatives_1_0"
    // InternalXtext.g:2047:1: rule__TerminalToken__CardinalityAlternatives_1_0 : ( ( '?' ) | ( '*' ) | ( '+' ) );
    public final void rule__TerminalToken__CardinalityAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2051:1: ( ( '?' ) | ( '*' ) | ( '+' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt24=1;
                }
                break;
            case 13:
                {
                alt24=2;
                }
                break;
            case 14:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalXtext.g:2052:2: ( '?' )
                    {
                    // InternalXtext.g:2052:2: ( '?' )
                    // InternalXtext.g:2053:3: '?'
                    {
                     before(grammarAccess.getTerminalTokenAccess().getCardinalityQuestionMarkKeyword_1_0_0()); 
                    match(input,12,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTerminalTokenAccess().getCardinalityQuestionMarkKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2058:2: ( '*' )
                    {
                    // InternalXtext.g:2058:2: ( '*' )
                    // InternalXtext.g:2059:3: '*'
                    {
                     before(grammarAccess.getTerminalTokenAccess().getCardinalityAsteriskKeyword_1_0_1()); 
                    match(input,13,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTerminalTokenAccess().getCardinalityAsteriskKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:2064:2: ( '+' )
                    {
                    // InternalXtext.g:2064:2: ( '+' )
                    // InternalXtext.g:2065:3: '+'
                    {
                     before(grammarAccess.getTerminalTokenAccess().getCardinalityPlusSignKeyword_1_0_2()); 
                    match(input,14,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTerminalTokenAccess().getCardinalityPlusSignKeyword_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalToken__CardinalityAlternatives_1_0"


    // $ANTLR start "rule__TerminalTokenElement__Alternatives"
    // InternalXtext.g:2074:1: rule__TerminalTokenElement__Alternatives : ( ( ruleCharacterRange ) | ( ruleTerminalRuleCall ) | ( ruleParenthesizedTerminalElement ) | ( ruleAbstractNegatedToken ) | ( ruleWildcard ) | ( ruleEOF ) );
    public final void rule__TerminalTokenElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2078:1: ( ( ruleCharacterRange ) | ( ruleTerminalRuleCall ) | ( ruleParenthesizedTerminalElement ) | ( ruleAbstractNegatedToken ) | ( ruleWildcard ) | ( ruleEOF ) )
            int alt25=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt25=1;
                }
                break;
            case RULE_ID:
            case 17:
            case 18:
                {
                alt25=2;
                }
                break;
            case 23:
                {
                alt25=3;
                }
                break;
            case 42:
            case 46:
                {
                alt25=4;
                }
                break;
            case 25:
                {
                alt25=5;
                }
                break;
            case 47:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalXtext.g:2079:2: ( ruleCharacterRange )
                    {
                    // InternalXtext.g:2079:2: ( ruleCharacterRange )
                    // InternalXtext.g:2080:3: ruleCharacterRange
                    {
                     before(grammarAccess.getTerminalTokenElementAccess().getCharacterRangeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCharacterRange();

                    state._fsp--;

                     after(grammarAccess.getTerminalTokenElementAccess().getCharacterRangeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2085:2: ( ruleTerminalRuleCall )
                    {
                    // InternalXtext.g:2085:2: ( ruleTerminalRuleCall )
                    // InternalXtext.g:2086:3: ruleTerminalRuleCall
                    {
                     before(grammarAccess.getTerminalTokenElementAccess().getTerminalRuleCallParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTerminalRuleCall();

                    state._fsp--;

                     after(grammarAccess.getTerminalTokenElementAccess().getTerminalRuleCallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:2091:2: ( ruleParenthesizedTerminalElement )
                    {
                    // InternalXtext.g:2091:2: ( ruleParenthesizedTerminalElement )
                    // InternalXtext.g:2092:3: ruleParenthesizedTerminalElement
                    {
                     before(grammarAccess.getTerminalTokenElementAccess().getParenthesizedTerminalElementParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesizedTerminalElement();

                    state._fsp--;

                     after(grammarAccess.getTerminalTokenElementAccess().getParenthesizedTerminalElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXtext.g:2097:2: ( ruleAbstractNegatedToken )
                    {
                    // InternalXtext.g:2097:2: ( ruleAbstractNegatedToken )
                    // InternalXtext.g:2098:3: ruleAbstractNegatedToken
                    {
                     before(grammarAccess.getTerminalTokenElementAccess().getAbstractNegatedTokenParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAbstractNegatedToken();

                    state._fsp--;

                     after(grammarAccess.getTerminalTokenElementAccess().getAbstractNegatedTokenParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXtext.g:2103:2: ( ruleWildcard )
                    {
                    // InternalXtext.g:2103:2: ( ruleWildcard )
                    // InternalXtext.g:2104:3: ruleWildcard
                    {
                     before(grammarAccess.getTerminalTokenElementAccess().getWildcardParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleWildcard();

                    state._fsp--;

                     after(grammarAccess.getTerminalTokenElementAccess().getWildcardParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXtext.g:2109:2: ( ruleEOF )
                    {
                    // InternalXtext.g:2109:2: ( ruleEOF )
                    // InternalXtext.g:2110:3: ruleEOF
                    {
                     before(grammarAccess.getTerminalTokenElementAccess().getEOFParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEOF();

                    state._fsp--;

                     after(grammarAccess.getTerminalTokenElementAccess().getEOFParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalTokenElement__Alternatives"


    // $ANTLR start "rule__AbstractNegatedToken__Alternatives"
    // InternalXtext.g:2119:1: rule__AbstractNegatedToken__Alternatives : ( ( ruleNegatedToken ) | ( ruleUntilToken ) );
    public final void rule__AbstractNegatedToken__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2123:1: ( ( ruleNegatedToken ) | ( ruleUntilToken ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            else if ( (LA26_0==46) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalXtext.g:2124:2: ( ruleNegatedToken )
                    {
                    // InternalXtext.g:2124:2: ( ruleNegatedToken )
                    // InternalXtext.g:2125:3: ruleNegatedToken
                    {
                     before(grammarAccess.getAbstractNegatedTokenAccess().getNegatedTokenParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNegatedToken();

                    state._fsp--;

                     after(grammarAccess.getAbstractNegatedTokenAccess().getNegatedTokenParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2130:2: ( ruleUntilToken )
                    {
                    // InternalXtext.g:2130:2: ( ruleUntilToken )
                    // InternalXtext.g:2131:3: ruleUntilToken
                    {
                     before(grammarAccess.getAbstractNegatedTokenAccess().getUntilTokenParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUntilToken();

                    state._fsp--;

                     after(grammarAccess.getAbstractNegatedTokenAccess().getUntilTokenParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractNegatedToken__Alternatives"


    // $ANTLR start "rule__Grammar__Group__0"
    // InternalXtext.g:2140:1: rule__Grammar__Group__0 : rule__Grammar__Group__0__Impl rule__Grammar__Group__1 ;
    public final void rule__Grammar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2144:1: ( rule__Grammar__Group__0__Impl rule__Grammar__Group__1 )
            // InternalXtext.g:2145:2: rule__Grammar__Group__0__Impl rule__Grammar__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Grammar__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__0"


    // $ANTLR start "rule__Grammar__Group__0__Impl"
    // InternalXtext.g:2152:1: rule__Grammar__Group__0__Impl : ( 'grammar' ) ;
    public final void rule__Grammar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2156:1: ( ( 'grammar' ) )
            // InternalXtext.g:2157:1: ( 'grammar' )
            {
            // InternalXtext.g:2157:1: ( 'grammar' )
            // InternalXtext.g:2158:2: 'grammar'
            {
             before(grammarAccess.getGrammarAccess().getGrammarKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarAccess().getGrammarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__0__Impl"


    // $ANTLR start "rule__Grammar__Group__1"
    // InternalXtext.g:2167:1: rule__Grammar__Group__1 : rule__Grammar__Group__1__Impl rule__Grammar__Group__2 ;
    public final void rule__Grammar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2171:1: ( rule__Grammar__Group__1__Impl rule__Grammar__Group__2 )
            // InternalXtext.g:2172:2: rule__Grammar__Group__1__Impl rule__Grammar__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Grammar__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__1"


    // $ANTLR start "rule__Grammar__Group__1__Impl"
    // InternalXtext.g:2179:1: rule__Grammar__Group__1__Impl : ( ( rule__Grammar__NameAssignment_1 ) ) ;
    public final void rule__Grammar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2183:1: ( ( ( rule__Grammar__NameAssignment_1 ) ) )
            // InternalXtext.g:2184:1: ( ( rule__Grammar__NameAssignment_1 ) )
            {
            // InternalXtext.g:2184:1: ( ( rule__Grammar__NameAssignment_1 ) )
            // InternalXtext.g:2185:2: ( rule__Grammar__NameAssignment_1 )
            {
             before(grammarAccess.getGrammarAccess().getNameAssignment_1()); 
            // InternalXtext.g:2186:2: ( rule__Grammar__NameAssignment_1 )
            // InternalXtext.g:2186:3: rule__Grammar__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__1__Impl"


    // $ANTLR start "rule__Grammar__Group__2"
    // InternalXtext.g:2194:1: rule__Grammar__Group__2 : rule__Grammar__Group__2__Impl rule__Grammar__Group__3 ;
    public final void rule__Grammar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2198:1: ( rule__Grammar__Group__2__Impl rule__Grammar__Group__3 )
            // InternalXtext.g:2199:2: rule__Grammar__Group__2__Impl rule__Grammar__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Grammar__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__2"


    // $ANTLR start "rule__Grammar__Group__2__Impl"
    // InternalXtext.g:2206:1: rule__Grammar__Group__2__Impl : ( ( rule__Grammar__Group_2__0 )? ) ;
    public final void rule__Grammar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2210:1: ( ( ( rule__Grammar__Group_2__0 )? ) )
            // InternalXtext.g:2211:1: ( ( rule__Grammar__Group_2__0 )? )
            {
            // InternalXtext.g:2211:1: ( ( rule__Grammar__Group_2__0 )? )
            // InternalXtext.g:2212:2: ( rule__Grammar__Group_2__0 )?
            {
             before(grammarAccess.getGrammarAccess().getGroup_2()); 
            // InternalXtext.g:2213:2: ( rule__Grammar__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXtext.g:2213:3: rule__Grammar__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Grammar__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrammarAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__2__Impl"


    // $ANTLR start "rule__Grammar__Group__3"
    // InternalXtext.g:2221:1: rule__Grammar__Group__3 : rule__Grammar__Group__3__Impl rule__Grammar__Group__4 ;
    public final void rule__Grammar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2225:1: ( rule__Grammar__Group__3__Impl rule__Grammar__Group__4 )
            // InternalXtext.g:2226:2: rule__Grammar__Group__3__Impl rule__Grammar__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Grammar__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__3"


    // $ANTLR start "rule__Grammar__Group__3__Impl"
    // InternalXtext.g:2233:1: rule__Grammar__Group__3__Impl : ( ( rule__Grammar__Group_3__0 )? ) ;
    public final void rule__Grammar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2237:1: ( ( ( rule__Grammar__Group_3__0 )? ) )
            // InternalXtext.g:2238:1: ( ( rule__Grammar__Group_3__0 )? )
            {
            // InternalXtext.g:2238:1: ( ( rule__Grammar__Group_3__0 )? )
            // InternalXtext.g:2239:2: ( rule__Grammar__Group_3__0 )?
            {
             before(grammarAccess.getGrammarAccess().getGroup_3()); 
            // InternalXtext.g:2240:2: ( rule__Grammar__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==50) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXtext.g:2240:3: rule__Grammar__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Grammar__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrammarAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__3__Impl"


    // $ANTLR start "rule__Grammar__Group__4"
    // InternalXtext.g:2248:1: rule__Grammar__Group__4 : rule__Grammar__Group__4__Impl rule__Grammar__Group__5 ;
    public final void rule__Grammar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2252:1: ( rule__Grammar__Group__4__Impl rule__Grammar__Group__5 )
            // InternalXtext.g:2253:2: rule__Grammar__Group__4__Impl rule__Grammar__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Grammar__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__4"


    // $ANTLR start "rule__Grammar__Group__4__Impl"
    // InternalXtext.g:2260:1: rule__Grammar__Group__4__Impl : ( ( rule__Grammar__MetamodelDeclarationsAssignment_4 )* ) ;
    public final void rule__Grammar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2264:1: ( ( ( rule__Grammar__MetamodelDeclarationsAssignment_4 )* ) )
            // InternalXtext.g:2265:1: ( ( rule__Grammar__MetamodelDeclarationsAssignment_4 )* )
            {
            // InternalXtext.g:2265:1: ( ( rule__Grammar__MetamodelDeclarationsAssignment_4 )* )
            // InternalXtext.g:2266:2: ( rule__Grammar__MetamodelDeclarationsAssignment_4 )*
            {
             before(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAssignment_4()); 
            // InternalXtext.g:2267:2: ( rule__Grammar__MetamodelDeclarationsAssignment_4 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==26||LA29_0==28) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalXtext.g:2267:3: rule__Grammar__MetamodelDeclarationsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    rule__Grammar__MetamodelDeclarationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__4__Impl"


    // $ANTLR start "rule__Grammar__Group__5"
    // InternalXtext.g:2275:1: rule__Grammar__Group__5 : rule__Grammar__Group__5__Impl ;
    public final void rule__Grammar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2279:1: ( rule__Grammar__Group__5__Impl )
            // InternalXtext.g:2280:2: rule__Grammar__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__5"


    // $ANTLR start "rule__Grammar__Group__5__Impl"
    // InternalXtext.g:2286:1: rule__Grammar__Group__5__Impl : ( ( ( rule__Grammar__RulesAssignment_5 ) ) ( ( rule__Grammar__RulesAssignment_5 )* ) ) ;
    public final void rule__Grammar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2290:1: ( ( ( ( rule__Grammar__RulesAssignment_5 ) ) ( ( rule__Grammar__RulesAssignment_5 )* ) ) )
            // InternalXtext.g:2291:1: ( ( ( rule__Grammar__RulesAssignment_5 ) ) ( ( rule__Grammar__RulesAssignment_5 )* ) )
            {
            // InternalXtext.g:2291:1: ( ( ( rule__Grammar__RulesAssignment_5 ) ) ( ( rule__Grammar__RulesAssignment_5 )* ) )
            // InternalXtext.g:2292:2: ( ( rule__Grammar__RulesAssignment_5 ) ) ( ( rule__Grammar__RulesAssignment_5 )* )
            {
            // InternalXtext.g:2292:2: ( ( rule__Grammar__RulesAssignment_5 ) )
            // InternalXtext.g:2293:3: ( rule__Grammar__RulesAssignment_5 )
            {
             before(grammarAccess.getGrammarAccess().getRulesAssignment_5()); 
            // InternalXtext.g:2294:3: ( rule__Grammar__RulesAssignment_5 )
            // InternalXtext.g:2294:4: rule__Grammar__RulesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Grammar__RulesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getRulesAssignment_5()); 

            }

            // InternalXtext.g:2297:2: ( ( rule__Grammar__RulesAssignment_5 )* )
            // InternalXtext.g:2298:3: ( rule__Grammar__RulesAssignment_5 )*
            {
             before(grammarAccess.getGrammarAccess().getRulesAssignment_5()); 
            // InternalXtext.g:2299:3: ( rule__Grammar__RulesAssignment_5 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=17 && LA30_0<=18)||LA30_0==29||LA30_0==45||LA30_0==49||LA30_0==51) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalXtext.g:2299:4: rule__Grammar__RulesAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__Grammar__RulesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getGrammarAccess().getRulesAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__5__Impl"


    // $ANTLR start "rule__Grammar__Group_2__0"
    // InternalXtext.g:2309:1: rule__Grammar__Group_2__0 : rule__Grammar__Group_2__0__Impl rule__Grammar__Group_2__1 ;
    public final void rule__Grammar__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2313:1: ( rule__Grammar__Group_2__0__Impl rule__Grammar__Group_2__1 )
            // InternalXtext.g:2314:2: rule__Grammar__Group_2__0__Impl rule__Grammar__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Grammar__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2__0"


    // $ANTLR start "rule__Grammar__Group_2__0__Impl"
    // InternalXtext.g:2321:1: rule__Grammar__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__Grammar__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2325:1: ( ( 'with' ) )
            // InternalXtext.g:2326:1: ( 'with' )
            {
            // InternalXtext.g:2326:1: ( 'with' )
            // InternalXtext.g:2327:2: 'with'
            {
             before(grammarAccess.getGrammarAccess().getWithKeyword_2_0()); 
            match(input,21,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarAccess().getWithKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2__0__Impl"


    // $ANTLR start "rule__Grammar__Group_2__1"
    // InternalXtext.g:2336:1: rule__Grammar__Group_2__1 : rule__Grammar__Group_2__1__Impl rule__Grammar__Group_2__2 ;
    public final void rule__Grammar__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2340:1: ( rule__Grammar__Group_2__1__Impl rule__Grammar__Group_2__2 )
            // InternalXtext.g:2341:2: rule__Grammar__Group_2__1__Impl rule__Grammar__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Grammar__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2__1"


    // $ANTLR start "rule__Grammar__Group_2__1__Impl"
    // InternalXtext.g:2348:1: rule__Grammar__Group_2__1__Impl : ( ( rule__Grammar__UsedGrammarsAssignment_2_1 ) ) ;
    public final void rule__Grammar__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2352:1: ( ( ( rule__Grammar__UsedGrammarsAssignment_2_1 ) ) )
            // InternalXtext.g:2353:1: ( ( rule__Grammar__UsedGrammarsAssignment_2_1 ) )
            {
            // InternalXtext.g:2353:1: ( ( rule__Grammar__UsedGrammarsAssignment_2_1 ) )
            // InternalXtext.g:2354:2: ( rule__Grammar__UsedGrammarsAssignment_2_1 )
            {
             before(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_1()); 
            // InternalXtext.g:2355:2: ( rule__Grammar__UsedGrammarsAssignment_2_1 )
            // InternalXtext.g:2355:3: rule__Grammar__UsedGrammarsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__UsedGrammarsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2__1__Impl"


    // $ANTLR start "rule__Grammar__Group_2__2"
    // InternalXtext.g:2363:1: rule__Grammar__Group_2__2 : rule__Grammar__Group_2__2__Impl ;
    public final void rule__Grammar__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2367:1: ( rule__Grammar__Group_2__2__Impl )
            // InternalXtext.g:2368:2: rule__Grammar__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2__2"


    // $ANTLR start "rule__Grammar__Group_2__2__Impl"
    // InternalXtext.g:2374:1: rule__Grammar__Group_2__2__Impl : ( ( rule__Grammar__Group_2_2__0 )* ) ;
    public final void rule__Grammar__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2378:1: ( ( ( rule__Grammar__Group_2_2__0 )* ) )
            // InternalXtext.g:2379:1: ( ( rule__Grammar__Group_2_2__0 )* )
            {
            // InternalXtext.g:2379:1: ( ( rule__Grammar__Group_2_2__0 )* )
            // InternalXtext.g:2380:2: ( rule__Grammar__Group_2_2__0 )*
            {
             before(grammarAccess.getGrammarAccess().getGroup_2_2()); 
            // InternalXtext.g:2381:2: ( rule__Grammar__Group_2_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==22) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalXtext.g:2381:3: rule__Grammar__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__Grammar__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getGrammarAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2__2__Impl"


    // $ANTLR start "rule__Grammar__Group_2_2__0"
    // InternalXtext.g:2390:1: rule__Grammar__Group_2_2__0 : rule__Grammar__Group_2_2__0__Impl rule__Grammar__Group_2_2__1 ;
    public final void rule__Grammar__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2394:1: ( rule__Grammar__Group_2_2__0__Impl rule__Grammar__Group_2_2__1 )
            // InternalXtext.g:2395:2: rule__Grammar__Group_2_2__0__Impl rule__Grammar__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Grammar__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2_2__0"


    // $ANTLR start "rule__Grammar__Group_2_2__0__Impl"
    // InternalXtext.g:2402:1: rule__Grammar__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Grammar__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2406:1: ( ( ',' ) )
            // InternalXtext.g:2407:1: ( ',' )
            {
            // InternalXtext.g:2407:1: ( ',' )
            // InternalXtext.g:2408:2: ','
            {
             before(grammarAccess.getGrammarAccess().getCommaKeyword_2_2_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2_2__0__Impl"


    // $ANTLR start "rule__Grammar__Group_2_2__1"
    // InternalXtext.g:2417:1: rule__Grammar__Group_2_2__1 : rule__Grammar__Group_2_2__1__Impl ;
    public final void rule__Grammar__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2421:1: ( rule__Grammar__Group_2_2__1__Impl )
            // InternalXtext.g:2422:2: rule__Grammar__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2_2__1"


    // $ANTLR start "rule__Grammar__Group_2_2__1__Impl"
    // InternalXtext.g:2428:1: rule__Grammar__Group_2_2__1__Impl : ( ( rule__Grammar__UsedGrammarsAssignment_2_2_1 ) ) ;
    public final void rule__Grammar__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2432:1: ( ( ( rule__Grammar__UsedGrammarsAssignment_2_2_1 ) ) )
            // InternalXtext.g:2433:1: ( ( rule__Grammar__UsedGrammarsAssignment_2_2_1 ) )
            {
            // InternalXtext.g:2433:1: ( ( rule__Grammar__UsedGrammarsAssignment_2_2_1 ) )
            // InternalXtext.g:2434:2: ( rule__Grammar__UsedGrammarsAssignment_2_2_1 )
            {
             before(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_2_1()); 
            // InternalXtext.g:2435:2: ( rule__Grammar__UsedGrammarsAssignment_2_2_1 )
            // InternalXtext.g:2435:3: rule__Grammar__UsedGrammarsAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__UsedGrammarsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2_2__1__Impl"


    // $ANTLR start "rule__Grammar__Group_3__0"
    // InternalXtext.g:2444:1: rule__Grammar__Group_3__0 : rule__Grammar__Group_3__0__Impl rule__Grammar__Group_3__1 ;
    public final void rule__Grammar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2448:1: ( rule__Grammar__Group_3__0__Impl rule__Grammar__Group_3__1 )
            // InternalXtext.g:2449:2: rule__Grammar__Group_3__0__Impl rule__Grammar__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Grammar__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__0"


    // $ANTLR start "rule__Grammar__Group_3__0__Impl"
    // InternalXtext.g:2456:1: rule__Grammar__Group_3__0__Impl : ( ( rule__Grammar__DefinesHiddenTokensAssignment_3_0 ) ) ;
    public final void rule__Grammar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2460:1: ( ( ( rule__Grammar__DefinesHiddenTokensAssignment_3_0 ) ) )
            // InternalXtext.g:2461:1: ( ( rule__Grammar__DefinesHiddenTokensAssignment_3_0 ) )
            {
            // InternalXtext.g:2461:1: ( ( rule__Grammar__DefinesHiddenTokensAssignment_3_0 ) )
            // InternalXtext.g:2462:2: ( rule__Grammar__DefinesHiddenTokensAssignment_3_0 )
            {
             before(grammarAccess.getGrammarAccess().getDefinesHiddenTokensAssignment_3_0()); 
            // InternalXtext.g:2463:2: ( rule__Grammar__DefinesHiddenTokensAssignment_3_0 )
            // InternalXtext.g:2463:3: rule__Grammar__DefinesHiddenTokensAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__DefinesHiddenTokensAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getDefinesHiddenTokensAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__0__Impl"


    // $ANTLR start "rule__Grammar__Group_3__1"
    // InternalXtext.g:2471:1: rule__Grammar__Group_3__1 : rule__Grammar__Group_3__1__Impl rule__Grammar__Group_3__2 ;
    public final void rule__Grammar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2475:1: ( rule__Grammar__Group_3__1__Impl rule__Grammar__Group_3__2 )
            // InternalXtext.g:2476:2: rule__Grammar__Group_3__1__Impl rule__Grammar__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Grammar__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__1"


    // $ANTLR start "rule__Grammar__Group_3__1__Impl"
    // InternalXtext.g:2483:1: rule__Grammar__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Grammar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2487:1: ( ( '(' ) )
            // InternalXtext.g:2488:1: ( '(' )
            {
            // InternalXtext.g:2488:1: ( '(' )
            // InternalXtext.g:2489:2: '('
            {
             before(grammarAccess.getGrammarAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__1__Impl"


    // $ANTLR start "rule__Grammar__Group_3__2"
    // InternalXtext.g:2498:1: rule__Grammar__Group_3__2 : rule__Grammar__Group_3__2__Impl rule__Grammar__Group_3__3 ;
    public final void rule__Grammar__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2502:1: ( rule__Grammar__Group_3__2__Impl rule__Grammar__Group_3__3 )
            // InternalXtext.g:2503:2: rule__Grammar__Group_3__2__Impl rule__Grammar__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Grammar__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__2"


    // $ANTLR start "rule__Grammar__Group_3__2__Impl"
    // InternalXtext.g:2510:1: rule__Grammar__Group_3__2__Impl : ( ( rule__Grammar__Group_3_2__0 )? ) ;
    public final void rule__Grammar__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2514:1: ( ( ( rule__Grammar__Group_3_2__0 )? ) )
            // InternalXtext.g:2515:1: ( ( rule__Grammar__Group_3_2__0 )? )
            {
            // InternalXtext.g:2515:1: ( ( rule__Grammar__Group_3_2__0 )? )
            // InternalXtext.g:2516:2: ( rule__Grammar__Group_3_2__0 )?
            {
             before(grammarAccess.getGrammarAccess().getGroup_3_2()); 
            // InternalXtext.g:2517:2: ( rule__Grammar__Group_3_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||(LA32_0>=17 && LA32_0<=18)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXtext.g:2517:3: rule__Grammar__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Grammar__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrammarAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__2__Impl"


    // $ANTLR start "rule__Grammar__Group_3__3"
    // InternalXtext.g:2525:1: rule__Grammar__Group_3__3 : rule__Grammar__Group_3__3__Impl ;
    public final void rule__Grammar__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2529:1: ( rule__Grammar__Group_3__3__Impl )
            // InternalXtext.g:2530:2: rule__Grammar__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__3"


    // $ANTLR start "rule__Grammar__Group_3__3__Impl"
    // InternalXtext.g:2536:1: rule__Grammar__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Grammar__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2540:1: ( ( ')' ) )
            // InternalXtext.g:2541:1: ( ')' )
            {
            // InternalXtext.g:2541:1: ( ')' )
            // InternalXtext.g:2542:2: ')'
            {
             before(grammarAccess.getGrammarAccess().getRightParenthesisKeyword_3_3()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__3__Impl"


    // $ANTLR start "rule__Grammar__Group_3_2__0"
    // InternalXtext.g:2552:1: rule__Grammar__Group_3_2__0 : rule__Grammar__Group_3_2__0__Impl rule__Grammar__Group_3_2__1 ;
    public final void rule__Grammar__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2556:1: ( rule__Grammar__Group_3_2__0__Impl rule__Grammar__Group_3_2__1 )
            // InternalXtext.g:2557:2: rule__Grammar__Group_3_2__0__Impl rule__Grammar__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Grammar__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2__0"


    // $ANTLR start "rule__Grammar__Group_3_2__0__Impl"
    // InternalXtext.g:2564:1: rule__Grammar__Group_3_2__0__Impl : ( ( rule__Grammar__HiddenTokensAssignment_3_2_0 ) ) ;
    public final void rule__Grammar__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2568:1: ( ( ( rule__Grammar__HiddenTokensAssignment_3_2_0 ) ) )
            // InternalXtext.g:2569:1: ( ( rule__Grammar__HiddenTokensAssignment_3_2_0 ) )
            {
            // InternalXtext.g:2569:1: ( ( rule__Grammar__HiddenTokensAssignment_3_2_0 ) )
            // InternalXtext.g:2570:2: ( rule__Grammar__HiddenTokensAssignment_3_2_0 )
            {
             before(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_0()); 
            // InternalXtext.g:2571:2: ( rule__Grammar__HiddenTokensAssignment_3_2_0 )
            // InternalXtext.g:2571:3: rule__Grammar__HiddenTokensAssignment_3_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__HiddenTokensAssignment_3_2_0();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2__0__Impl"


    // $ANTLR start "rule__Grammar__Group_3_2__1"
    // InternalXtext.g:2579:1: rule__Grammar__Group_3_2__1 : rule__Grammar__Group_3_2__1__Impl ;
    public final void rule__Grammar__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2583:1: ( rule__Grammar__Group_3_2__1__Impl )
            // InternalXtext.g:2584:2: rule__Grammar__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2__1"


    // $ANTLR start "rule__Grammar__Group_3_2__1__Impl"
    // InternalXtext.g:2590:1: rule__Grammar__Group_3_2__1__Impl : ( ( rule__Grammar__Group_3_2_1__0 )* ) ;
    public final void rule__Grammar__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2594:1: ( ( ( rule__Grammar__Group_3_2_1__0 )* ) )
            // InternalXtext.g:2595:1: ( ( rule__Grammar__Group_3_2_1__0 )* )
            {
            // InternalXtext.g:2595:1: ( ( rule__Grammar__Group_3_2_1__0 )* )
            // InternalXtext.g:2596:2: ( rule__Grammar__Group_3_2_1__0 )*
            {
             before(grammarAccess.getGrammarAccess().getGroup_3_2_1()); 
            // InternalXtext.g:2597:2: ( rule__Grammar__Group_3_2_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==22) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXtext.g:2597:3: rule__Grammar__Group_3_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__Grammar__Group_3_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getGrammarAccess().getGroup_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2__1__Impl"


    // $ANTLR start "rule__Grammar__Group_3_2_1__0"
    // InternalXtext.g:2606:1: rule__Grammar__Group_3_2_1__0 : rule__Grammar__Group_3_2_1__0__Impl rule__Grammar__Group_3_2_1__1 ;
    public final void rule__Grammar__Group_3_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2610:1: ( rule__Grammar__Group_3_2_1__0__Impl rule__Grammar__Group_3_2_1__1 )
            // InternalXtext.g:2611:2: rule__Grammar__Group_3_2_1__0__Impl rule__Grammar__Group_3_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Grammar__Group_3_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2_1__0"


    // $ANTLR start "rule__Grammar__Group_3_2_1__0__Impl"
    // InternalXtext.g:2618:1: rule__Grammar__Group_3_2_1__0__Impl : ( ',' ) ;
    public final void rule__Grammar__Group_3_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2622:1: ( ( ',' ) )
            // InternalXtext.g:2623:1: ( ',' )
            {
            // InternalXtext.g:2623:1: ( ',' )
            // InternalXtext.g:2624:2: ','
            {
             before(grammarAccess.getGrammarAccess().getCommaKeyword_3_2_1_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarAccess().getCommaKeyword_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2_1__0__Impl"


    // $ANTLR start "rule__Grammar__Group_3_2_1__1"
    // InternalXtext.g:2633:1: rule__Grammar__Group_3_2_1__1 : rule__Grammar__Group_3_2_1__1__Impl ;
    public final void rule__Grammar__Group_3_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2637:1: ( rule__Grammar__Group_3_2_1__1__Impl )
            // InternalXtext.g:2638:2: rule__Grammar__Group_3_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2_1__1"


    // $ANTLR start "rule__Grammar__Group_3_2_1__1__Impl"
    // InternalXtext.g:2644:1: rule__Grammar__Group_3_2_1__1__Impl : ( ( rule__Grammar__HiddenTokensAssignment_3_2_1_1 ) ) ;
    public final void rule__Grammar__Group_3_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2648:1: ( ( ( rule__Grammar__HiddenTokensAssignment_3_2_1_1 ) ) )
            // InternalXtext.g:2649:1: ( ( rule__Grammar__HiddenTokensAssignment_3_2_1_1 ) )
            {
            // InternalXtext.g:2649:1: ( ( rule__Grammar__HiddenTokensAssignment_3_2_1_1 ) )
            // InternalXtext.g:2650:2: ( rule__Grammar__HiddenTokensAssignment_3_2_1_1 )
            {
             before(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_1_1()); 
            // InternalXtext.g:2651:2: ( rule__Grammar__HiddenTokensAssignment_3_2_1_1 )
            // InternalXtext.g:2651:3: rule__Grammar__HiddenTokensAssignment_3_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__HiddenTokensAssignment_3_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2_1__1__Impl"


    // $ANTLR start "rule__GrammarID__Group__0"
    // InternalXtext.g:2660:1: rule__GrammarID__Group__0 : rule__GrammarID__Group__0__Impl rule__GrammarID__Group__1 ;
    public final void rule__GrammarID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2664:1: ( rule__GrammarID__Group__0__Impl rule__GrammarID__Group__1 )
            // InternalXtext.g:2665:2: rule__GrammarID__Group__0__Impl rule__GrammarID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GrammarID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__GrammarID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group__0"


    // $ANTLR start "rule__GrammarID__Group__0__Impl"
    // InternalXtext.g:2672:1: rule__GrammarID__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__GrammarID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2676:1: ( ( ruleValidID ) )
            // InternalXtext.g:2677:1: ( ruleValidID )
            {
            // InternalXtext.g:2677:1: ( ruleValidID )
            // InternalXtext.g:2678:2: ruleValidID
            {
             before(grammarAccess.getGrammarIDAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getGrammarIDAccess().getValidIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group__0__Impl"


    // $ANTLR start "rule__GrammarID__Group__1"
    // InternalXtext.g:2687:1: rule__GrammarID__Group__1 : rule__GrammarID__Group__1__Impl ;
    public final void rule__GrammarID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2691:1: ( rule__GrammarID__Group__1__Impl )
            // InternalXtext.g:2692:2: rule__GrammarID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GrammarID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group__1"


    // $ANTLR start "rule__GrammarID__Group__1__Impl"
    // InternalXtext.g:2698:1: rule__GrammarID__Group__1__Impl : ( ( rule__GrammarID__Group_1__0 )* ) ;
    public final void rule__GrammarID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2702:1: ( ( ( rule__GrammarID__Group_1__0 )* ) )
            // InternalXtext.g:2703:1: ( ( rule__GrammarID__Group_1__0 )* )
            {
            // InternalXtext.g:2703:1: ( ( rule__GrammarID__Group_1__0 )* )
            // InternalXtext.g:2704:2: ( rule__GrammarID__Group_1__0 )*
            {
             before(grammarAccess.getGrammarIDAccess().getGroup_1()); 
            // InternalXtext.g:2705:2: ( rule__GrammarID__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==25) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalXtext.g:2705:3: rule__GrammarID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__GrammarID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getGrammarIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group__1__Impl"


    // $ANTLR start "rule__GrammarID__Group_1__0"
    // InternalXtext.g:2714:1: rule__GrammarID__Group_1__0 : rule__GrammarID__Group_1__0__Impl rule__GrammarID__Group_1__1 ;
    public final void rule__GrammarID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2718:1: ( rule__GrammarID__Group_1__0__Impl rule__GrammarID__Group_1__1 )
            // InternalXtext.g:2719:2: rule__GrammarID__Group_1__0__Impl rule__GrammarID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GrammarID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__GrammarID__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group_1__0"


    // $ANTLR start "rule__GrammarID__Group_1__0__Impl"
    // InternalXtext.g:2726:1: rule__GrammarID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__GrammarID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2730:1: ( ( '.' ) )
            // InternalXtext.g:2731:1: ( '.' )
            {
            // InternalXtext.g:2731:1: ( '.' )
            // InternalXtext.g:2732:2: '.'
            {
             before(grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group_1__0__Impl"


    // $ANTLR start "rule__GrammarID__Group_1__1"
    // InternalXtext.g:2741:1: rule__GrammarID__Group_1__1 : rule__GrammarID__Group_1__1__Impl ;
    public final void rule__GrammarID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2745:1: ( rule__GrammarID__Group_1__1__Impl )
            // InternalXtext.g:2746:2: rule__GrammarID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GrammarID__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group_1__1"


    // $ANTLR start "rule__GrammarID__Group_1__1__Impl"
    // InternalXtext.g:2752:1: rule__GrammarID__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__GrammarID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2756:1: ( ( ruleValidID ) )
            // InternalXtext.g:2757:1: ( ruleValidID )
            {
            // InternalXtext.g:2757:1: ( ruleValidID )
            // InternalXtext.g:2758:2: ruleValidID
            {
             before(grammarAccess.getGrammarIDAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getGrammarIDAccess().getValidIDParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group_1__1__Impl"


    // $ANTLR start "rule__GeneratedMetamodel__Group__0"
    // InternalXtext.g:2768:1: rule__GeneratedMetamodel__Group__0 : rule__GeneratedMetamodel__Group__0__Impl rule__GeneratedMetamodel__Group__1 ;
    public final void rule__GeneratedMetamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2772:1: ( rule__GeneratedMetamodel__Group__0__Impl rule__GeneratedMetamodel__Group__1 )
            // InternalXtext.g:2773:2: rule__GeneratedMetamodel__Group__0__Impl rule__GeneratedMetamodel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GeneratedMetamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__0"


    // $ANTLR start "rule__GeneratedMetamodel__Group__0__Impl"
    // InternalXtext.g:2780:1: rule__GeneratedMetamodel__Group__0__Impl : ( 'generate' ) ;
    public final void rule__GeneratedMetamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2784:1: ( ( 'generate' ) )
            // InternalXtext.g:2785:1: ( 'generate' )
            {
            // InternalXtext.g:2785:1: ( 'generate' )
            // InternalXtext.g:2786:2: 'generate'
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getGenerateKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGeneratedMetamodelAccess().getGenerateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__0__Impl"


    // $ANTLR start "rule__GeneratedMetamodel__Group__1"
    // InternalXtext.g:2795:1: rule__GeneratedMetamodel__Group__1 : rule__GeneratedMetamodel__Group__1__Impl rule__GeneratedMetamodel__Group__2 ;
    public final void rule__GeneratedMetamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2799:1: ( rule__GeneratedMetamodel__Group__1__Impl rule__GeneratedMetamodel__Group__2 )
            // InternalXtext.g:2800:2: rule__GeneratedMetamodel__Group__1__Impl rule__GeneratedMetamodel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__GeneratedMetamodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__1"


    // $ANTLR start "rule__GeneratedMetamodel__Group__1__Impl"
    // InternalXtext.g:2807:1: rule__GeneratedMetamodel__Group__1__Impl : ( ( rule__GeneratedMetamodel__NameAssignment_1 ) ) ;
    public final void rule__GeneratedMetamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2811:1: ( ( ( rule__GeneratedMetamodel__NameAssignment_1 ) ) )
            // InternalXtext.g:2812:1: ( ( rule__GeneratedMetamodel__NameAssignment_1 ) )
            {
            // InternalXtext.g:2812:1: ( ( rule__GeneratedMetamodel__NameAssignment_1 ) )
            // InternalXtext.g:2813:2: ( rule__GeneratedMetamodel__NameAssignment_1 )
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getNameAssignment_1()); 
            // InternalXtext.g:2814:2: ( rule__GeneratedMetamodel__NameAssignment_1 )
            // InternalXtext.g:2814:3: rule__GeneratedMetamodel__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneratedMetamodelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__1__Impl"


    // $ANTLR start "rule__GeneratedMetamodel__Group__2"
    // InternalXtext.g:2822:1: rule__GeneratedMetamodel__Group__2 : rule__GeneratedMetamodel__Group__2__Impl rule__GeneratedMetamodel__Group__3 ;
    public final void rule__GeneratedMetamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2826:1: ( rule__GeneratedMetamodel__Group__2__Impl rule__GeneratedMetamodel__Group__3 )
            // InternalXtext.g:2827:2: rule__GeneratedMetamodel__Group__2__Impl rule__GeneratedMetamodel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GeneratedMetamodel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__2"


    // $ANTLR start "rule__GeneratedMetamodel__Group__2__Impl"
    // InternalXtext.g:2834:1: rule__GeneratedMetamodel__Group__2__Impl : ( ( rule__GeneratedMetamodel__EPackageAssignment_2 ) ) ;
    public final void rule__GeneratedMetamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2838:1: ( ( ( rule__GeneratedMetamodel__EPackageAssignment_2 ) ) )
            // InternalXtext.g:2839:1: ( ( rule__GeneratedMetamodel__EPackageAssignment_2 ) )
            {
            // InternalXtext.g:2839:1: ( ( rule__GeneratedMetamodel__EPackageAssignment_2 ) )
            // InternalXtext.g:2840:2: ( rule__GeneratedMetamodel__EPackageAssignment_2 )
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getEPackageAssignment_2()); 
            // InternalXtext.g:2841:2: ( rule__GeneratedMetamodel__EPackageAssignment_2 )
            // InternalXtext.g:2841:3: rule__GeneratedMetamodel__EPackageAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__EPackageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGeneratedMetamodelAccess().getEPackageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__2__Impl"


    // $ANTLR start "rule__GeneratedMetamodel__Group__3"
    // InternalXtext.g:2849:1: rule__GeneratedMetamodel__Group__3 : rule__GeneratedMetamodel__Group__3__Impl ;
    public final void rule__GeneratedMetamodel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2853:1: ( rule__GeneratedMetamodel__Group__3__Impl )
            // InternalXtext.g:2854:2: rule__GeneratedMetamodel__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__3"


    // $ANTLR start "rule__GeneratedMetamodel__Group__3__Impl"
    // InternalXtext.g:2860:1: rule__GeneratedMetamodel__Group__3__Impl : ( ( rule__GeneratedMetamodel__Group_3__0 )? ) ;
    public final void rule__GeneratedMetamodel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2864:1: ( ( ( rule__GeneratedMetamodel__Group_3__0 )? ) )
            // InternalXtext.g:2865:1: ( ( rule__GeneratedMetamodel__Group_3__0 )? )
            {
            // InternalXtext.g:2865:1: ( ( rule__GeneratedMetamodel__Group_3__0 )? )
            // InternalXtext.g:2866:2: ( rule__GeneratedMetamodel__Group_3__0 )?
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getGroup_3()); 
            // InternalXtext.g:2867:2: ( rule__GeneratedMetamodel__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==27) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXtext.g:2867:3: rule__GeneratedMetamodel__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GeneratedMetamodel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneratedMetamodelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__3__Impl"


    // $ANTLR start "rule__GeneratedMetamodel__Group_3__0"
    // InternalXtext.g:2876:1: rule__GeneratedMetamodel__Group_3__0 : rule__GeneratedMetamodel__Group_3__0__Impl rule__GeneratedMetamodel__Group_3__1 ;
    public final void rule__GeneratedMetamodel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2880:1: ( rule__GeneratedMetamodel__Group_3__0__Impl rule__GeneratedMetamodel__Group_3__1 )
            // InternalXtext.g:2881:2: rule__GeneratedMetamodel__Group_3__0__Impl rule__GeneratedMetamodel__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GeneratedMetamodel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group_3__0"


    // $ANTLR start "rule__GeneratedMetamodel__Group_3__0__Impl"
    // InternalXtext.g:2888:1: rule__GeneratedMetamodel__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__GeneratedMetamodel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2892:1: ( ( 'as' ) )
            // InternalXtext.g:2893:1: ( 'as' )
            {
            // InternalXtext.g:2893:1: ( 'as' )
            // InternalXtext.g:2894:2: 'as'
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getAsKeyword_3_0()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGeneratedMetamodelAccess().getAsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group_3__0__Impl"


    // $ANTLR start "rule__GeneratedMetamodel__Group_3__1"
    // InternalXtext.g:2903:1: rule__GeneratedMetamodel__Group_3__1 : rule__GeneratedMetamodel__Group_3__1__Impl ;
    public final void rule__GeneratedMetamodel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2907:1: ( rule__GeneratedMetamodel__Group_3__1__Impl )
            // InternalXtext.g:2908:2: rule__GeneratedMetamodel__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group_3__1"


    // $ANTLR start "rule__GeneratedMetamodel__Group_3__1__Impl"
    // InternalXtext.g:2914:1: rule__GeneratedMetamodel__Group_3__1__Impl : ( ( rule__GeneratedMetamodel__AliasAssignment_3_1 ) ) ;
    public final void rule__GeneratedMetamodel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2918:1: ( ( ( rule__GeneratedMetamodel__AliasAssignment_3_1 ) ) )
            // InternalXtext.g:2919:1: ( ( rule__GeneratedMetamodel__AliasAssignment_3_1 ) )
            {
            // InternalXtext.g:2919:1: ( ( rule__GeneratedMetamodel__AliasAssignment_3_1 ) )
            // InternalXtext.g:2920:2: ( rule__GeneratedMetamodel__AliasAssignment_3_1 )
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getAliasAssignment_3_1()); 
            // InternalXtext.g:2921:2: ( rule__GeneratedMetamodel__AliasAssignment_3_1 )
            // InternalXtext.g:2921:3: rule__GeneratedMetamodel__AliasAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__AliasAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneratedMetamodelAccess().getAliasAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group_3__1__Impl"


    // $ANTLR start "rule__ReferencedMetamodel__Group__0"
    // InternalXtext.g:2930:1: rule__ReferencedMetamodel__Group__0 : rule__ReferencedMetamodel__Group__0__Impl rule__ReferencedMetamodel__Group__1 ;
    public final void rule__ReferencedMetamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2934:1: ( rule__ReferencedMetamodel__Group__0__Impl rule__ReferencedMetamodel__Group__1 )
            // InternalXtext.g:2935:2: rule__ReferencedMetamodel__Group__0__Impl rule__ReferencedMetamodel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__ReferencedMetamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group__0"


    // $ANTLR start "rule__ReferencedMetamodel__Group__0__Impl"
    // InternalXtext.g:2942:1: rule__ReferencedMetamodel__Group__0__Impl : ( 'import' ) ;
    public final void rule__ReferencedMetamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2946:1: ( ( 'import' ) )
            // InternalXtext.g:2947:1: ( 'import' )
            {
            // InternalXtext.g:2947:1: ( 'import' )
            // InternalXtext.g:2948:2: 'import'
            {
             before(grammarAccess.getReferencedMetamodelAccess().getImportKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getReferencedMetamodelAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group__0__Impl"


    // $ANTLR start "rule__ReferencedMetamodel__Group__1"
    // InternalXtext.g:2957:1: rule__ReferencedMetamodel__Group__1 : rule__ReferencedMetamodel__Group__1__Impl rule__ReferencedMetamodel__Group__2 ;
    public final void rule__ReferencedMetamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2961:1: ( rule__ReferencedMetamodel__Group__1__Impl rule__ReferencedMetamodel__Group__2 )
            // InternalXtext.g:2962:2: rule__ReferencedMetamodel__Group__1__Impl rule__ReferencedMetamodel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__ReferencedMetamodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group__1"


    // $ANTLR start "rule__ReferencedMetamodel__Group__1__Impl"
    // InternalXtext.g:2969:1: rule__ReferencedMetamodel__Group__1__Impl : ( ( rule__ReferencedMetamodel__EPackageAssignment_1 ) ) ;
    public final void rule__ReferencedMetamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2973:1: ( ( ( rule__ReferencedMetamodel__EPackageAssignment_1 ) ) )
            // InternalXtext.g:2974:1: ( ( rule__ReferencedMetamodel__EPackageAssignment_1 ) )
            {
            // InternalXtext.g:2974:1: ( ( rule__ReferencedMetamodel__EPackageAssignment_1 ) )
            // InternalXtext.g:2975:2: ( rule__ReferencedMetamodel__EPackageAssignment_1 )
            {
             before(grammarAccess.getReferencedMetamodelAccess().getEPackageAssignment_1()); 
            // InternalXtext.g:2976:2: ( rule__ReferencedMetamodel__EPackageAssignment_1 )
            // InternalXtext.g:2976:3: rule__ReferencedMetamodel__EPackageAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__EPackageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferencedMetamodelAccess().getEPackageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group__1__Impl"


    // $ANTLR start "rule__ReferencedMetamodel__Group__2"
    // InternalXtext.g:2984:1: rule__ReferencedMetamodel__Group__2 : rule__ReferencedMetamodel__Group__2__Impl ;
    public final void rule__ReferencedMetamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2988:1: ( rule__ReferencedMetamodel__Group__2__Impl )
            // InternalXtext.g:2989:2: rule__ReferencedMetamodel__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group__2"


    // $ANTLR start "rule__ReferencedMetamodel__Group__2__Impl"
    // InternalXtext.g:2995:1: rule__ReferencedMetamodel__Group__2__Impl : ( ( rule__ReferencedMetamodel__Group_2__0 )? ) ;
    public final void rule__ReferencedMetamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:2999:1: ( ( ( rule__ReferencedMetamodel__Group_2__0 )? ) )
            // InternalXtext.g:3000:1: ( ( rule__ReferencedMetamodel__Group_2__0 )? )
            {
            // InternalXtext.g:3000:1: ( ( rule__ReferencedMetamodel__Group_2__0 )? )
            // InternalXtext.g:3001:2: ( rule__ReferencedMetamodel__Group_2__0 )?
            {
             before(grammarAccess.getReferencedMetamodelAccess().getGroup_2()); 
            // InternalXtext.g:3002:2: ( rule__ReferencedMetamodel__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXtext.g:3002:3: rule__ReferencedMetamodel__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ReferencedMetamodel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferencedMetamodelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group__2__Impl"


    // $ANTLR start "rule__ReferencedMetamodel__Group_2__0"
    // InternalXtext.g:3011:1: rule__ReferencedMetamodel__Group_2__0 : rule__ReferencedMetamodel__Group_2__0__Impl rule__ReferencedMetamodel__Group_2__1 ;
    public final void rule__ReferencedMetamodel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3015:1: ( rule__ReferencedMetamodel__Group_2__0__Impl rule__ReferencedMetamodel__Group_2__1 )
            // InternalXtext.g:3016:2: rule__ReferencedMetamodel__Group_2__0__Impl rule__ReferencedMetamodel__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ReferencedMetamodel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group_2__0"


    // $ANTLR start "rule__ReferencedMetamodel__Group_2__0__Impl"
    // InternalXtext.g:3023:1: rule__ReferencedMetamodel__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__ReferencedMetamodel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3027:1: ( ( 'as' ) )
            // InternalXtext.g:3028:1: ( 'as' )
            {
            // InternalXtext.g:3028:1: ( 'as' )
            // InternalXtext.g:3029:2: 'as'
            {
             before(grammarAccess.getReferencedMetamodelAccess().getAsKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getReferencedMetamodelAccess().getAsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group_2__0__Impl"


    // $ANTLR start "rule__ReferencedMetamodel__Group_2__1"
    // InternalXtext.g:3038:1: rule__ReferencedMetamodel__Group_2__1 : rule__ReferencedMetamodel__Group_2__1__Impl ;
    public final void rule__ReferencedMetamodel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3042:1: ( rule__ReferencedMetamodel__Group_2__1__Impl )
            // InternalXtext.g:3043:2: rule__ReferencedMetamodel__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group_2__1"


    // $ANTLR start "rule__ReferencedMetamodel__Group_2__1__Impl"
    // InternalXtext.g:3049:1: rule__ReferencedMetamodel__Group_2__1__Impl : ( ( rule__ReferencedMetamodel__AliasAssignment_2_1 ) ) ;
    public final void rule__ReferencedMetamodel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3053:1: ( ( ( rule__ReferencedMetamodel__AliasAssignment_2_1 ) ) )
            // InternalXtext.g:3054:1: ( ( rule__ReferencedMetamodel__AliasAssignment_2_1 ) )
            {
            // InternalXtext.g:3054:1: ( ( rule__ReferencedMetamodel__AliasAssignment_2_1 ) )
            // InternalXtext.g:3055:2: ( rule__ReferencedMetamodel__AliasAssignment_2_1 )
            {
             before(grammarAccess.getReferencedMetamodelAccess().getAliasAssignment_2_1()); 
            // InternalXtext.g:3056:2: ( rule__ReferencedMetamodel__AliasAssignment_2_1 )
            // InternalXtext.g:3056:3: rule__ReferencedMetamodel__AliasAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__AliasAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getReferencedMetamodelAccess().getAliasAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group_2__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalXtext.g:3065:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3069:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalXtext.g:3070:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Annotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // InternalXtext.g:3077:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3081:1: ( ( '@' ) )
            // InternalXtext.g:3082:1: ( '@' )
            {
            // InternalXtext.g:3082:1: ( '@' )
            // InternalXtext.g:3083:2: '@'
            {
             before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // InternalXtext.g:3092:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3096:1: ( rule__Annotation__Group__1__Impl )
            // InternalXtext.g:3097:2: rule__Annotation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Annotation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // InternalXtext.g:3103:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3107:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // InternalXtext.g:3108:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // InternalXtext.g:3108:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // InternalXtext.g:3109:2: ( rule__Annotation__NameAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            // InternalXtext.g:3110:2: ( rule__Annotation__NameAssignment_1 )
            // InternalXtext.g:3110:3: rule__Annotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Annotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__ParserRule__Group__0"
    // InternalXtext.g:3119:1: rule__ParserRule__Group__0 : rule__ParserRule__Group__0__Impl rule__ParserRule__Group__1 ;
    public final void rule__ParserRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3123:1: ( rule__ParserRule__Group__0__Impl rule__ParserRule__Group__1 )
            // InternalXtext.g:3124:2: rule__ParserRule__Group__0__Impl rule__ParserRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__ParserRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__0"


    // $ANTLR start "rule__ParserRule__Group__0__Impl"
    // InternalXtext.g:3131:1: rule__ParserRule__Group__0__Impl : ( ( rule__ParserRule__AnnotationsAssignment_0 )* ) ;
    public final void rule__ParserRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3135:1: ( ( ( rule__ParserRule__AnnotationsAssignment_0 )* ) )
            // InternalXtext.g:3136:1: ( ( rule__ParserRule__AnnotationsAssignment_0 )* )
            {
            // InternalXtext.g:3136:1: ( ( rule__ParserRule__AnnotationsAssignment_0 )* )
            // InternalXtext.g:3137:2: ( rule__ParserRule__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getParserRuleAccess().getAnnotationsAssignment_0()); 
            // InternalXtext.g:3138:2: ( rule__ParserRule__AnnotationsAssignment_0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==29) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXtext.g:3138:3: rule__ParserRule__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__ParserRule__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getParserRuleAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__0__Impl"


    // $ANTLR start "rule__ParserRule__Group__1"
    // InternalXtext.g:3146:1: rule__ParserRule__Group__1 : rule__ParserRule__Group__1__Impl rule__ParserRule__Group__2 ;
    public final void rule__ParserRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3150:1: ( rule__ParserRule__Group__1__Impl rule__ParserRule__Group__2 )
            // InternalXtext.g:3151:2: rule__ParserRule__Group__1__Impl rule__ParserRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ParserRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__1"


    // $ANTLR start "rule__ParserRule__Group__1__Impl"
    // InternalXtext.g:3158:1: rule__ParserRule__Group__1__Impl : ( ( rule__ParserRule__Alternatives_1 ) ) ;
    public final void rule__ParserRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3162:1: ( ( ( rule__ParserRule__Alternatives_1 ) ) )
            // InternalXtext.g:3163:1: ( ( rule__ParserRule__Alternatives_1 ) )
            {
            // InternalXtext.g:3163:1: ( ( rule__ParserRule__Alternatives_1 ) )
            // InternalXtext.g:3164:2: ( rule__ParserRule__Alternatives_1 )
            {
             before(grammarAccess.getParserRuleAccess().getAlternatives_1()); 
            // InternalXtext.g:3165:2: ( rule__ParserRule__Alternatives_1 )
            // InternalXtext.g:3165:3: rule__ParserRule__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__1__Impl"


    // $ANTLR start "rule__ParserRule__Group__2"
    // InternalXtext.g:3173:1: rule__ParserRule__Group__2 : rule__ParserRule__Group__2__Impl rule__ParserRule__Group__3 ;
    public final void rule__ParserRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3177:1: ( rule__ParserRule__Group__2__Impl rule__ParserRule__Group__3 )
            // InternalXtext.g:3178:2: rule__ParserRule__Group__2__Impl rule__ParserRule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ParserRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__2"


    // $ANTLR start "rule__ParserRule__Group__2__Impl"
    // InternalXtext.g:3185:1: rule__ParserRule__Group__2__Impl : ( ( rule__ParserRule__Group_2__0 )? ) ;
    public final void rule__ParserRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3189:1: ( ( ( rule__ParserRule__Group_2__0 )? ) )
            // InternalXtext.g:3190:1: ( ( rule__ParserRule__Group_2__0 )? )
            {
            // InternalXtext.g:3190:1: ( ( rule__ParserRule__Group_2__0 )? )
            // InternalXtext.g:3191:2: ( rule__ParserRule__Group_2__0 )?
            {
             before(grammarAccess.getParserRuleAccess().getGroup_2()); 
            // InternalXtext.g:3192:2: ( rule__ParserRule__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXtext.g:3192:3: rule__ParserRule__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ParserRule__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParserRuleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__2__Impl"


    // $ANTLR start "rule__ParserRule__Group__3"
    // InternalXtext.g:3200:1: rule__ParserRule__Group__3 : rule__ParserRule__Group__3__Impl rule__ParserRule__Group__4 ;
    public final void rule__ParserRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3204:1: ( rule__ParserRule__Group__3__Impl rule__ParserRule__Group__4 )
            // InternalXtext.g:3205:2: rule__ParserRule__Group__3__Impl rule__ParserRule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__ParserRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__3"


    // $ANTLR start "rule__ParserRule__Group__3__Impl"
    // InternalXtext.g:3212:1: rule__ParserRule__Group__3__Impl : ( ':' ) ;
    public final void rule__ParserRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3216:1: ( ( ':' ) )
            // InternalXtext.g:3217:1: ( ':' )
            {
            // InternalXtext.g:3217:1: ( ':' )
            // InternalXtext.g:3218:2: ':'
            {
             before(grammarAccess.getParserRuleAccess().getColonKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__3__Impl"


    // $ANTLR start "rule__ParserRule__Group__4"
    // InternalXtext.g:3227:1: rule__ParserRule__Group__4 : rule__ParserRule__Group__4__Impl rule__ParserRule__Group__5 ;
    public final void rule__ParserRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3231:1: ( rule__ParserRule__Group__4__Impl rule__ParserRule__Group__5 )
            // InternalXtext.g:3232:2: rule__ParserRule__Group__4__Impl rule__ParserRule__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__ParserRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__4"


    // $ANTLR start "rule__ParserRule__Group__4__Impl"
    // InternalXtext.g:3239:1: rule__ParserRule__Group__4__Impl : ( ( rule__ParserRule__AlternativesAssignment_4 ) ) ;
    public final void rule__ParserRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3243:1: ( ( ( rule__ParserRule__AlternativesAssignment_4 ) ) )
            // InternalXtext.g:3244:1: ( ( rule__ParserRule__AlternativesAssignment_4 ) )
            {
            // InternalXtext.g:3244:1: ( ( rule__ParserRule__AlternativesAssignment_4 ) )
            // InternalXtext.g:3245:2: ( rule__ParserRule__AlternativesAssignment_4 )
            {
             before(grammarAccess.getParserRuleAccess().getAlternativesAssignment_4()); 
            // InternalXtext.g:3246:2: ( rule__ParserRule__AlternativesAssignment_4 )
            // InternalXtext.g:3246:3: rule__ParserRule__AlternativesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__AlternativesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getAlternativesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__4__Impl"


    // $ANTLR start "rule__ParserRule__Group__5"
    // InternalXtext.g:3254:1: rule__ParserRule__Group__5 : rule__ParserRule__Group__5__Impl ;
    public final void rule__ParserRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3258:1: ( rule__ParserRule__Group__5__Impl )
            // InternalXtext.g:3259:2: rule__ParserRule__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__5"


    // $ANTLR start "rule__ParserRule__Group__5__Impl"
    // InternalXtext.g:3265:1: rule__ParserRule__Group__5__Impl : ( ';' ) ;
    public final void rule__ParserRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3269:1: ( ( ';' ) )
            // InternalXtext.g:3270:1: ( ';' )
            {
            // InternalXtext.g:3270:1: ( ';' )
            // InternalXtext.g:3271:2: ';'
            {
             before(grammarAccess.getParserRuleAccess().getSemicolonKeyword_5()); 
            match(input,31,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__5__Impl"


    // $ANTLR start "rule__ParserRule__Group_1_0__0"
    // InternalXtext.g:3281:1: rule__ParserRule__Group_1_0__0 : rule__ParserRule__Group_1_0__0__Impl rule__ParserRule__Group_1_0__1 ;
    public final void rule__ParserRule__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3285:1: ( rule__ParserRule__Group_1_0__0__Impl rule__ParserRule__Group_1_0__1 )
            // InternalXtext.g:3286:2: rule__ParserRule__Group_1_0__0__Impl rule__ParserRule__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__ParserRule__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_0__0"


    // $ANTLR start "rule__ParserRule__Group_1_0__0__Impl"
    // InternalXtext.g:3293:1: rule__ParserRule__Group_1_0__0__Impl : ( ( rule__ParserRule__FragmentAssignment_1_0_0 ) ) ;
    public final void rule__ParserRule__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3297:1: ( ( ( rule__ParserRule__FragmentAssignment_1_0_0 ) ) )
            // InternalXtext.g:3298:1: ( ( rule__ParserRule__FragmentAssignment_1_0_0 ) )
            {
            // InternalXtext.g:3298:1: ( ( rule__ParserRule__FragmentAssignment_1_0_0 ) )
            // InternalXtext.g:3299:2: ( rule__ParserRule__FragmentAssignment_1_0_0 )
            {
             before(grammarAccess.getParserRuleAccess().getFragmentAssignment_1_0_0()); 
            // InternalXtext.g:3300:2: ( rule__ParserRule__FragmentAssignment_1_0_0 )
            // InternalXtext.g:3300:3: rule__ParserRule__FragmentAssignment_1_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__FragmentAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getFragmentAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_0__0__Impl"


    // $ANTLR start "rule__ParserRule__Group_1_0__1"
    // InternalXtext.g:3308:1: rule__ParserRule__Group_1_0__1 : rule__ParserRule__Group_1_0__1__Impl rule__ParserRule__Group_1_0__2 ;
    public final void rule__ParserRule__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3312:1: ( rule__ParserRule__Group_1_0__1__Impl rule__ParserRule__Group_1_0__2 )
            // InternalXtext.g:3313:2: rule__ParserRule__Group_1_0__1__Impl rule__ParserRule__Group_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__ParserRule__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_0__1"


    // $ANTLR start "rule__ParserRule__Group_1_0__1__Impl"
    // InternalXtext.g:3320:1: rule__ParserRule__Group_1_0__1__Impl : ( ruleRuleNameAndParams ) ;
    public final void rule__ParserRule__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3324:1: ( ( ruleRuleNameAndParams ) )
            // InternalXtext.g:3325:1: ( ruleRuleNameAndParams )
            {
            // InternalXtext.g:3325:1: ( ruleRuleNameAndParams )
            // InternalXtext.g:3326:2: ruleRuleNameAndParams
            {
             before(grammarAccess.getParserRuleAccess().getRuleNameAndParamsParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleNameAndParams();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getRuleNameAndParamsParserRuleCall_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_0__1__Impl"


    // $ANTLR start "rule__ParserRule__Group_1_0__2"
    // InternalXtext.g:3335:1: rule__ParserRule__Group_1_0__2 : rule__ParserRule__Group_1_0__2__Impl ;
    public final void rule__ParserRule__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3339:1: ( rule__ParserRule__Group_1_0__2__Impl )
            // InternalXtext.g:3340:2: rule__ParserRule__Group_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_0__2"


    // $ANTLR start "rule__ParserRule__Group_1_0__2__Impl"
    // InternalXtext.g:3346:1: rule__ParserRule__Group_1_0__2__Impl : ( ( rule__ParserRule__Alternatives_1_0_2 ) ) ;
    public final void rule__ParserRule__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3350:1: ( ( ( rule__ParserRule__Alternatives_1_0_2 ) ) )
            // InternalXtext.g:3351:1: ( ( rule__ParserRule__Alternatives_1_0_2 ) )
            {
            // InternalXtext.g:3351:1: ( ( rule__ParserRule__Alternatives_1_0_2 ) )
            // InternalXtext.g:3352:2: ( rule__ParserRule__Alternatives_1_0_2 )
            {
             before(grammarAccess.getParserRuleAccess().getAlternatives_1_0_2()); 
            // InternalXtext.g:3353:2: ( rule__ParserRule__Alternatives_1_0_2 )
            // InternalXtext.g:3353:3: rule__ParserRule__Alternatives_1_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Alternatives_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getAlternatives_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_0__2__Impl"


    // $ANTLR start "rule__ParserRule__Group_1_0_2_1__0"
    // InternalXtext.g:3362:1: rule__ParserRule__Group_1_0_2_1__0 : rule__ParserRule__Group_1_0_2_1__0__Impl rule__ParserRule__Group_1_0_2_1__1 ;
    public final void rule__ParserRule__Group_1_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3366:1: ( rule__ParserRule__Group_1_0_2_1__0__Impl rule__ParserRule__Group_1_0_2_1__1 )
            // InternalXtext.g:3367:2: rule__ParserRule__Group_1_0_2_1__0__Impl rule__ParserRule__Group_1_0_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__ParserRule__Group_1_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_1_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_0_2_1__0"


    // $ANTLR start "rule__ParserRule__Group_1_0_2_1__0__Impl"
    // InternalXtext.g:3374:1: rule__ParserRule__Group_1_0_2_1__0__Impl : ( 'returns' ) ;
    public final void rule__ParserRule__Group_1_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3378:1: ( ( 'returns' ) )
            // InternalXtext.g:3379:1: ( 'returns' )
            {
            // InternalXtext.g:3379:1: ( 'returns' )
            // InternalXtext.g:3380:2: 'returns'
            {
             before(grammarAccess.getParserRuleAccess().getReturnsKeyword_1_0_2_1_0()); 
            match(input,32,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getReturnsKeyword_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_0_2_1__0__Impl"


    // $ANTLR start "rule__ParserRule__Group_1_0_2_1__1"
    // InternalXtext.g:3389:1: rule__ParserRule__Group_1_0_2_1__1 : rule__ParserRule__Group_1_0_2_1__1__Impl ;
    public final void rule__ParserRule__Group_1_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3393:1: ( rule__ParserRule__Group_1_0_2_1__1__Impl )
            // InternalXtext.g:3394:2: rule__ParserRule__Group_1_0_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_1_0_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_0_2_1__1"


    // $ANTLR start "rule__ParserRule__Group_1_0_2_1__1__Impl"
    // InternalXtext.g:3400:1: rule__ParserRule__Group_1_0_2_1__1__Impl : ( ( rule__ParserRule__TypeAssignment_1_0_2_1_1 ) ) ;
    public final void rule__ParserRule__Group_1_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3404:1: ( ( ( rule__ParserRule__TypeAssignment_1_0_2_1_1 ) ) )
            // InternalXtext.g:3405:1: ( ( rule__ParserRule__TypeAssignment_1_0_2_1_1 ) )
            {
            // InternalXtext.g:3405:1: ( ( rule__ParserRule__TypeAssignment_1_0_2_1_1 ) )
            // InternalXtext.g:3406:2: ( rule__ParserRule__TypeAssignment_1_0_2_1_1 )
            {
             before(grammarAccess.getParserRuleAccess().getTypeAssignment_1_0_2_1_1()); 
            // InternalXtext.g:3407:2: ( rule__ParserRule__TypeAssignment_1_0_2_1_1 )
            // InternalXtext.g:3407:3: rule__ParserRule__TypeAssignment_1_0_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__TypeAssignment_1_0_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getTypeAssignment_1_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_0_2_1__1__Impl"


    // $ANTLR start "rule__ParserRule__Group_1_1__0"
    // InternalXtext.g:3416:1: rule__ParserRule__Group_1_1__0 : rule__ParserRule__Group_1_1__0__Impl rule__ParserRule__Group_1_1__1 ;
    public final void rule__ParserRule__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3420:1: ( rule__ParserRule__Group_1_1__0__Impl rule__ParserRule__Group_1_1__1 )
            // InternalXtext.g:3421:2: rule__ParserRule__Group_1_1__0__Impl rule__ParserRule__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__ParserRule__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_1__0"


    // $ANTLR start "rule__ParserRule__Group_1_1__0__Impl"
    // InternalXtext.g:3428:1: rule__ParserRule__Group_1_1__0__Impl : ( ruleRuleNameAndParams ) ;
    public final void rule__ParserRule__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3432:1: ( ( ruleRuleNameAndParams ) )
            // InternalXtext.g:3433:1: ( ruleRuleNameAndParams )
            {
            // InternalXtext.g:3433:1: ( ruleRuleNameAndParams )
            // InternalXtext.g:3434:2: ruleRuleNameAndParams
            {
             before(grammarAccess.getParserRuleAccess().getRuleNameAndParamsParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleNameAndParams();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getRuleNameAndParamsParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_1__0__Impl"


    // $ANTLR start "rule__ParserRule__Group_1_1__1"
    // InternalXtext.g:3443:1: rule__ParserRule__Group_1_1__1 : rule__ParserRule__Group_1_1__1__Impl rule__ParserRule__Group_1_1__2 ;
    public final void rule__ParserRule__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3447:1: ( rule__ParserRule__Group_1_1__1__Impl rule__ParserRule__Group_1_1__2 )
            // InternalXtext.g:3448:2: rule__ParserRule__Group_1_1__1__Impl rule__ParserRule__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__ParserRule__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_1__1"


    // $ANTLR start "rule__ParserRule__Group_1_1__1__Impl"
    // InternalXtext.g:3455:1: rule__ParserRule__Group_1_1__1__Impl : ( ( rule__ParserRule__Group_1_1_1__0 )? ) ;
    public final void rule__ParserRule__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3459:1: ( ( ( rule__ParserRule__Group_1_1_1__0 )? ) )
            // InternalXtext.g:3460:1: ( ( rule__ParserRule__Group_1_1_1__0 )? )
            {
            // InternalXtext.g:3460:1: ( ( rule__ParserRule__Group_1_1_1__0 )? )
            // InternalXtext.g:3461:2: ( rule__ParserRule__Group_1_1_1__0 )?
            {
             before(grammarAccess.getParserRuleAccess().getGroup_1_1_1()); 
            // InternalXtext.g:3462:2: ( rule__ParserRule__Group_1_1_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXtext.g:3462:3: rule__ParserRule__Group_1_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ParserRule__Group_1_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParserRuleAccess().getGroup_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_1__1__Impl"


    // $ANTLR start "rule__ParserRule__Group_1_1__2"
    // InternalXtext.g:3470:1: rule__ParserRule__Group_1_1__2 : rule__ParserRule__Group_1_1__2__Impl ;
    public final void rule__ParserRule__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3474:1: ( rule__ParserRule__Group_1_1__2__Impl )
            // InternalXtext.g:3475:2: rule__ParserRule__Group_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_1__2"


    // $ANTLR start "rule__ParserRule__Group_1_1__2__Impl"
    // InternalXtext.g:3481:1: rule__ParserRule__Group_1_1__2__Impl : ( ( rule__ParserRule__Group_1_1_2__0 )? ) ;
    public final void rule__ParserRule__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3485:1: ( ( ( rule__ParserRule__Group_1_1_2__0 )? ) )
            // InternalXtext.g:3486:1: ( ( rule__ParserRule__Group_1_1_2__0 )? )
            {
            // InternalXtext.g:3486:1: ( ( rule__ParserRule__Group_1_1_2__0 )? )
            // InternalXtext.g:3487:2: ( rule__ParserRule__Group_1_1_2__0 )?
            {
             before(grammarAccess.getParserRuleAccess().getGroup_1_1_2()); 
            // InternalXtext.g:3488:2: ( rule__ParserRule__Group_1_1_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==33) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXtext.g:3488:3: rule__ParserRule__Group_1_1_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ParserRule__Group_1_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParserRuleAccess().getGroup_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_1__2__Impl"


    // $ANTLR start "rule__ParserRule__Group_1_1_1__0"
    // InternalXtext.g:3497:1: rule__ParserRule__Group_1_1_1__0 : rule__ParserRule__Group_1_1_1__0__Impl rule__ParserRule__Group_1_1_1__1 ;
    public final void rule__ParserRule__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3501:1: ( rule__ParserRule__Group_1_1_1__0__Impl rule__ParserRule__Group_1_1_1__1 )
            // InternalXtext.g:3502:2: rule__ParserRule__Group_1_1_1__0__Impl rule__ParserRule__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__ParserRule__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_1_1__0"


    // $ANTLR start "rule__ParserRule__Group_1_1_1__0__Impl"
    // InternalXtext.g:3509:1: rule__ParserRule__Group_1_1_1__0__Impl : ( 'returns' ) ;
    public final void rule__ParserRule__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3513:1: ( ( 'returns' ) )
            // InternalXtext.g:3514:1: ( 'returns' )
            {
            // InternalXtext.g:3514:1: ( 'returns' )
            // InternalXtext.g:3515:2: 'returns'
            {
             before(grammarAccess.getParserRuleAccess().getReturnsKeyword_1_1_1_0()); 
            match(input,32,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getReturnsKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__ParserRule__Group_1_1_1__1"
    // InternalXtext.g:3524:1: rule__ParserRule__Group_1_1_1__1 : rule__ParserRule__Group_1_1_1__1__Impl ;
    public final void rule__ParserRule__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3528:1: ( rule__ParserRule__Group_1_1_1__1__Impl )
            // InternalXtext.g:3529:2: rule__ParserRule__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_1_1__1"


    // $ANTLR start "rule__ParserRule__Group_1_1_1__1__Impl"
    // InternalXtext.g:3535:1: rule__ParserRule__Group_1_1_1__1__Impl : ( ( rule__ParserRule__TypeAssignment_1_1_1_1 ) ) ;
    public final void rule__ParserRule__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3539:1: ( ( ( rule__ParserRule__TypeAssignment_1_1_1_1 ) ) )
            // InternalXtext.g:3540:1: ( ( rule__ParserRule__TypeAssignment_1_1_1_1 ) )
            {
            // InternalXtext.g:3540:1: ( ( rule__ParserRule__TypeAssignment_1_1_1_1 ) )
            // InternalXtext.g:3541:2: ( rule__ParserRule__TypeAssignment_1_1_1_1 )
            {
             before(grammarAccess.getParserRuleAccess().getTypeAssignment_1_1_1_1()); 
            // InternalXtext.g:3542:2: ( rule__ParserRule__TypeAssignment_1_1_1_1 )
            // InternalXtext.g:3542:3: rule__ParserRule__TypeAssignment_1_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__TypeAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getTypeAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__ParserRule__Group_1_1_2__0"
    // InternalXtext.g:3551:1: rule__ParserRule__Group_1_1_2__0 : rule__ParserRule__Group_1_1_2__0__Impl rule__ParserRule__Group_1_1_2__1 ;
    public final void rule__ParserRule__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3555:1: ( rule__ParserRule__Group_1_1_2__0__Impl rule__ParserRule__Group_1_1_2__1 )
            // InternalXtext.g:3556:2: rule__ParserRule__Group_1_1_2__0__Impl rule__ParserRule__Group_1_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__ParserRule__Group_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_1_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_1_2__0"


    // $ANTLR start "rule__ParserRule__Group_1_1_2__0__Impl"
    // InternalXtext.g:3563:1: rule__ParserRule__Group_1_1_2__0__Impl : ( 'becomes' ) ;
    public final void rule__ParserRule__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3567:1: ( ( 'becomes' ) )
            // InternalXtext.g:3568:1: ( 'becomes' )
            {
            // InternalXtext.g:3568:1: ( 'becomes' )
            // InternalXtext.g:3569:2: 'becomes'
            {
             before(grammarAccess.getParserRuleAccess().getBecomesKeyword_1_1_2_0()); 
            match(input,33,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getBecomesKeyword_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__ParserRule__Group_1_1_2__1"
    // InternalXtext.g:3578:1: rule__ParserRule__Group_1_1_2__1 : rule__ParserRule__Group_1_1_2__1__Impl ;
    public final void rule__ParserRule__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3582:1: ( rule__ParserRule__Group_1_1_2__1__Impl )
            // InternalXtext.g:3583:2: rule__ParserRule__Group_1_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_1_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_1_2__1"


    // $ANTLR start "rule__ParserRule__Group_1_1_2__1__Impl"
    // InternalXtext.g:3589:1: rule__ParserRule__Group_1_1_2__1__Impl : ( ( rule__ParserRule__BecomesAssignment_1_1_2_1 ) ) ;
    public final void rule__ParserRule__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3593:1: ( ( ( rule__ParserRule__BecomesAssignment_1_1_2_1 ) ) )
            // InternalXtext.g:3594:1: ( ( rule__ParserRule__BecomesAssignment_1_1_2_1 ) )
            {
            // InternalXtext.g:3594:1: ( ( rule__ParserRule__BecomesAssignment_1_1_2_1 ) )
            // InternalXtext.g:3595:2: ( rule__ParserRule__BecomesAssignment_1_1_2_1 )
            {
             before(grammarAccess.getParserRuleAccess().getBecomesAssignment_1_1_2_1()); 
            // InternalXtext.g:3596:2: ( rule__ParserRule__BecomesAssignment_1_1_2_1 )
            // InternalXtext.g:3596:3: rule__ParserRule__BecomesAssignment_1_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__BecomesAssignment_1_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getBecomesAssignment_1_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__ParserRule__Group_2__0"
    // InternalXtext.g:3605:1: rule__ParserRule__Group_2__0 : rule__ParserRule__Group_2__0__Impl rule__ParserRule__Group_2__1 ;
    public final void rule__ParserRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3609:1: ( rule__ParserRule__Group_2__0__Impl rule__ParserRule__Group_2__1 )
            // InternalXtext.g:3610:2: rule__ParserRule__Group_2__0__Impl rule__ParserRule__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__ParserRule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__0"


    // $ANTLR start "rule__ParserRule__Group_2__0__Impl"
    // InternalXtext.g:3617:1: rule__ParserRule__Group_2__0__Impl : ( ( rule__ParserRule__DefinesHiddenTokensAssignment_2_0 ) ) ;
    public final void rule__ParserRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3621:1: ( ( ( rule__ParserRule__DefinesHiddenTokensAssignment_2_0 ) ) )
            // InternalXtext.g:3622:1: ( ( rule__ParserRule__DefinesHiddenTokensAssignment_2_0 ) )
            {
            // InternalXtext.g:3622:1: ( ( rule__ParserRule__DefinesHiddenTokensAssignment_2_0 ) )
            // InternalXtext.g:3623:2: ( rule__ParserRule__DefinesHiddenTokensAssignment_2_0 )
            {
             before(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensAssignment_2_0()); 
            // InternalXtext.g:3624:2: ( rule__ParserRule__DefinesHiddenTokensAssignment_2_0 )
            // InternalXtext.g:3624:3: rule__ParserRule__DefinesHiddenTokensAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__DefinesHiddenTokensAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__0__Impl"


    // $ANTLR start "rule__ParserRule__Group_2__1"
    // InternalXtext.g:3632:1: rule__ParserRule__Group_2__1 : rule__ParserRule__Group_2__1__Impl rule__ParserRule__Group_2__2 ;
    public final void rule__ParserRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3636:1: ( rule__ParserRule__Group_2__1__Impl rule__ParserRule__Group_2__2 )
            // InternalXtext.g:3637:2: rule__ParserRule__Group_2__1__Impl rule__ParserRule__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__ParserRule__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__1"


    // $ANTLR start "rule__ParserRule__Group_2__1__Impl"
    // InternalXtext.g:3644:1: rule__ParserRule__Group_2__1__Impl : ( '(' ) ;
    public final void rule__ParserRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3648:1: ( ( '(' ) )
            // InternalXtext.g:3649:1: ( '(' )
            {
            // InternalXtext.g:3649:1: ( '(' )
            // InternalXtext.g:3650:2: '('
            {
             before(grammarAccess.getParserRuleAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__1__Impl"


    // $ANTLR start "rule__ParserRule__Group_2__2"
    // InternalXtext.g:3659:1: rule__ParserRule__Group_2__2 : rule__ParserRule__Group_2__2__Impl rule__ParserRule__Group_2__3 ;
    public final void rule__ParserRule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3663:1: ( rule__ParserRule__Group_2__2__Impl rule__ParserRule__Group_2__3 )
            // InternalXtext.g:3664:2: rule__ParserRule__Group_2__2__Impl rule__ParserRule__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__ParserRule__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__2"


    // $ANTLR start "rule__ParserRule__Group_2__2__Impl"
    // InternalXtext.g:3671:1: rule__ParserRule__Group_2__2__Impl : ( ( rule__ParserRule__Group_2_2__0 )? ) ;
    public final void rule__ParserRule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3675:1: ( ( ( rule__ParserRule__Group_2_2__0 )? ) )
            // InternalXtext.g:3676:1: ( ( rule__ParserRule__Group_2_2__0 )? )
            {
            // InternalXtext.g:3676:1: ( ( rule__ParserRule__Group_2_2__0 )? )
            // InternalXtext.g:3677:2: ( rule__ParserRule__Group_2_2__0 )?
            {
             before(grammarAccess.getParserRuleAccess().getGroup_2_2()); 
            // InternalXtext.g:3678:2: ( rule__ParserRule__Group_2_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||(LA41_0>=17 && LA41_0<=18)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXtext.g:3678:3: rule__ParserRule__Group_2_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ParserRule__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParserRuleAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__2__Impl"


    // $ANTLR start "rule__ParserRule__Group_2__3"
    // InternalXtext.g:3686:1: rule__ParserRule__Group_2__3 : rule__ParserRule__Group_2__3__Impl ;
    public final void rule__ParserRule__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3690:1: ( rule__ParserRule__Group_2__3__Impl )
            // InternalXtext.g:3691:2: rule__ParserRule__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__3"


    // $ANTLR start "rule__ParserRule__Group_2__3__Impl"
    // InternalXtext.g:3697:1: rule__ParserRule__Group_2__3__Impl : ( ')' ) ;
    public final void rule__ParserRule__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3701:1: ( ( ')' ) )
            // InternalXtext.g:3702:1: ( ')' )
            {
            // InternalXtext.g:3702:1: ( ')' )
            // InternalXtext.g:3703:2: ')'
            {
             before(grammarAccess.getParserRuleAccess().getRightParenthesisKeyword_2_3()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__3__Impl"


    // $ANTLR start "rule__ParserRule__Group_2_2__0"
    // InternalXtext.g:3713:1: rule__ParserRule__Group_2_2__0 : rule__ParserRule__Group_2_2__0__Impl rule__ParserRule__Group_2_2__1 ;
    public final void rule__ParserRule__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3717:1: ( rule__ParserRule__Group_2_2__0__Impl rule__ParserRule__Group_2_2__1 )
            // InternalXtext.g:3718:2: rule__ParserRule__Group_2_2__0__Impl rule__ParserRule__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__ParserRule__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2__0"


    // $ANTLR start "rule__ParserRule__Group_2_2__0__Impl"
    // InternalXtext.g:3725:1: rule__ParserRule__Group_2_2__0__Impl : ( ( rule__ParserRule__HiddenTokensAssignment_2_2_0 ) ) ;
    public final void rule__ParserRule__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3729:1: ( ( ( rule__ParserRule__HiddenTokensAssignment_2_2_0 ) ) )
            // InternalXtext.g:3730:1: ( ( rule__ParserRule__HiddenTokensAssignment_2_2_0 ) )
            {
            // InternalXtext.g:3730:1: ( ( rule__ParserRule__HiddenTokensAssignment_2_2_0 ) )
            // InternalXtext.g:3731:2: ( rule__ParserRule__HiddenTokensAssignment_2_2_0 )
            {
             before(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_0()); 
            // InternalXtext.g:3732:2: ( rule__ParserRule__HiddenTokensAssignment_2_2_0 )
            // InternalXtext.g:3732:3: rule__ParserRule__HiddenTokensAssignment_2_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__HiddenTokensAssignment_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2__0__Impl"


    // $ANTLR start "rule__ParserRule__Group_2_2__1"
    // InternalXtext.g:3740:1: rule__ParserRule__Group_2_2__1 : rule__ParserRule__Group_2_2__1__Impl ;
    public final void rule__ParserRule__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3744:1: ( rule__ParserRule__Group_2_2__1__Impl )
            // InternalXtext.g:3745:2: rule__ParserRule__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2__1"


    // $ANTLR start "rule__ParserRule__Group_2_2__1__Impl"
    // InternalXtext.g:3751:1: rule__ParserRule__Group_2_2__1__Impl : ( ( rule__ParserRule__Group_2_2_1__0 )* ) ;
    public final void rule__ParserRule__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3755:1: ( ( ( rule__ParserRule__Group_2_2_1__0 )* ) )
            // InternalXtext.g:3756:1: ( ( rule__ParserRule__Group_2_2_1__0 )* )
            {
            // InternalXtext.g:3756:1: ( ( rule__ParserRule__Group_2_2_1__0 )* )
            // InternalXtext.g:3757:2: ( rule__ParserRule__Group_2_2_1__0 )*
            {
             before(grammarAccess.getParserRuleAccess().getGroup_2_2_1()); 
            // InternalXtext.g:3758:2: ( rule__ParserRule__Group_2_2_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==22) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalXtext.g:3758:3: rule__ParserRule__Group_2_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__ParserRule__Group_2_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getParserRuleAccess().getGroup_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2__1__Impl"


    // $ANTLR start "rule__ParserRule__Group_2_2_1__0"
    // InternalXtext.g:3767:1: rule__ParserRule__Group_2_2_1__0 : rule__ParserRule__Group_2_2_1__0__Impl rule__ParserRule__Group_2_2_1__1 ;
    public final void rule__ParserRule__Group_2_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3771:1: ( rule__ParserRule__Group_2_2_1__0__Impl rule__ParserRule__Group_2_2_1__1 )
            // InternalXtext.g:3772:2: rule__ParserRule__Group_2_2_1__0__Impl rule__ParserRule__Group_2_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ParserRule__Group_2_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2_1__0"


    // $ANTLR start "rule__ParserRule__Group_2_2_1__0__Impl"
    // InternalXtext.g:3779:1: rule__ParserRule__Group_2_2_1__0__Impl : ( ',' ) ;
    public final void rule__ParserRule__Group_2_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3783:1: ( ( ',' ) )
            // InternalXtext.g:3784:1: ( ',' )
            {
            // InternalXtext.g:3784:1: ( ',' )
            // InternalXtext.g:3785:2: ','
            {
             before(grammarAccess.getParserRuleAccess().getCommaKeyword_2_2_1_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getCommaKeyword_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2_1__0__Impl"


    // $ANTLR start "rule__ParserRule__Group_2_2_1__1"
    // InternalXtext.g:3794:1: rule__ParserRule__Group_2_2_1__1 : rule__ParserRule__Group_2_2_1__1__Impl ;
    public final void rule__ParserRule__Group_2_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3798:1: ( rule__ParserRule__Group_2_2_1__1__Impl )
            // InternalXtext.g:3799:2: rule__ParserRule__Group_2_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2_1__1"


    // $ANTLR start "rule__ParserRule__Group_2_2_1__1__Impl"
    // InternalXtext.g:3805:1: rule__ParserRule__Group_2_2_1__1__Impl : ( ( rule__ParserRule__HiddenTokensAssignment_2_2_1_1 ) ) ;
    public final void rule__ParserRule__Group_2_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3809:1: ( ( ( rule__ParserRule__HiddenTokensAssignment_2_2_1_1 ) ) )
            // InternalXtext.g:3810:1: ( ( rule__ParserRule__HiddenTokensAssignment_2_2_1_1 ) )
            {
            // InternalXtext.g:3810:1: ( ( rule__ParserRule__HiddenTokensAssignment_2_2_1_1 ) )
            // InternalXtext.g:3811:2: ( rule__ParserRule__HiddenTokensAssignment_2_2_1_1 )
            {
             before(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_1_1()); 
            // InternalXtext.g:3812:2: ( rule__ParserRule__HiddenTokensAssignment_2_2_1_1 )
            // InternalXtext.g:3812:3: rule__ParserRule__HiddenTokensAssignment_2_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__HiddenTokensAssignment_2_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2_1__1__Impl"


    // $ANTLR start "rule__BecomesDecl__Group__0"
    // InternalXtext.g:3821:1: rule__BecomesDecl__Group__0 : rule__BecomesDecl__Group__0__Impl rule__BecomesDecl__Group__1 ;
    public final void rule__BecomesDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3825:1: ( rule__BecomesDecl__Group__0__Impl rule__BecomesDecl__Group__1 )
            // InternalXtext.g:3826:2: rule__BecomesDecl__Group__0__Impl rule__BecomesDecl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__BecomesDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__BecomesDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BecomesDecl__Group__0"


    // $ANTLR start "rule__BecomesDecl__Group__0__Impl"
    // InternalXtext.g:3833:1: rule__BecomesDecl__Group__0__Impl : ( ( rule__BecomesDecl__TypeAssignment_0 ) ) ;
    public final void rule__BecomesDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3837:1: ( ( ( rule__BecomesDecl__TypeAssignment_0 ) ) )
            // InternalXtext.g:3838:1: ( ( rule__BecomesDecl__TypeAssignment_0 ) )
            {
            // InternalXtext.g:3838:1: ( ( rule__BecomesDecl__TypeAssignment_0 ) )
            // InternalXtext.g:3839:2: ( rule__BecomesDecl__TypeAssignment_0 )
            {
             before(grammarAccess.getBecomesDeclAccess().getTypeAssignment_0()); 
            // InternalXtext.g:3840:2: ( rule__BecomesDecl__TypeAssignment_0 )
            // InternalXtext.g:3840:3: rule__BecomesDecl__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BecomesDecl__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBecomesDeclAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BecomesDecl__Group__0__Impl"


    // $ANTLR start "rule__BecomesDecl__Group__1"
    // InternalXtext.g:3848:1: rule__BecomesDecl__Group__1 : rule__BecomesDecl__Group__1__Impl ;
    public final void rule__BecomesDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3852:1: ( rule__BecomesDecl__Group__1__Impl )
            // InternalXtext.g:3853:2: rule__BecomesDecl__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BecomesDecl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BecomesDecl__Group__1"


    // $ANTLR start "rule__BecomesDecl__Group__1__Impl"
    // InternalXtext.g:3859:1: rule__BecomesDecl__Group__1__Impl : ( ( rule__BecomesDecl__CodeAssignment_1 ) ) ;
    public final void rule__BecomesDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3863:1: ( ( ( rule__BecomesDecl__CodeAssignment_1 ) ) )
            // InternalXtext.g:3864:1: ( ( rule__BecomesDecl__CodeAssignment_1 ) )
            {
            // InternalXtext.g:3864:1: ( ( rule__BecomesDecl__CodeAssignment_1 ) )
            // InternalXtext.g:3865:2: ( rule__BecomesDecl__CodeAssignment_1 )
            {
             before(grammarAccess.getBecomesDeclAccess().getCodeAssignment_1()); 
            // InternalXtext.g:3866:2: ( rule__BecomesDecl__CodeAssignment_1 )
            // InternalXtext.g:3866:3: rule__BecomesDecl__CodeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BecomesDecl__CodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBecomesDeclAccess().getCodeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BecomesDecl__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalXtext.g:3875:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3879:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXtext.g:3880:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalXtext.g:3887:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3891:1: ( ( RULE_ID ) )
            // InternalXtext.g:3892:1: ( RULE_ID )
            {
            // InternalXtext.g:3892:1: ( RULE_ID )
            // InternalXtext.g:3893:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalXtext.g:3902:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3906:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXtext.g:3907:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalXtext.g:3913:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3917:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalXtext.g:3918:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalXtext.g:3918:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalXtext.g:3919:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXtext.g:3920:2: ( rule__QualifiedName__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==25) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalXtext.g:3920:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalXtext.g:3929:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3933:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXtext.g:3934:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalXtext.g:3941:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3945:1: ( ( '.' ) )
            // InternalXtext.g:3946:1: ( '.' )
            {
            // InternalXtext.g:3946:1: ( '.' )
            // InternalXtext.g:3947:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalXtext.g:3956:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3960:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXtext.g:3961:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalXtext.g:3967:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3971:1: ( ( RULE_ID ) )
            // InternalXtext.g:3972:1: ( RULE_ID )
            {
            // InternalXtext.g:3972:1: ( RULE_ID )
            // InternalXtext.g:3973:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group__0"
    // InternalXtext.g:3983:1: rule__RuleNameAndParams__Group__0 : rule__RuleNameAndParams__Group__0__Impl rule__RuleNameAndParams__Group__1 ;
    public final void rule__RuleNameAndParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3987:1: ( rule__RuleNameAndParams__Group__0__Impl rule__RuleNameAndParams__Group__1 )
            // InternalXtext.g:3988:2: rule__RuleNameAndParams__Group__0__Impl rule__RuleNameAndParams__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__RuleNameAndParams__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group__0"


    // $ANTLR start "rule__RuleNameAndParams__Group__0__Impl"
    // InternalXtext.g:3995:1: rule__RuleNameAndParams__Group__0__Impl : ( ( rule__RuleNameAndParams__NameAssignment_0 ) ) ;
    public final void rule__RuleNameAndParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:3999:1: ( ( ( rule__RuleNameAndParams__NameAssignment_0 ) ) )
            // InternalXtext.g:4000:1: ( ( rule__RuleNameAndParams__NameAssignment_0 ) )
            {
            // InternalXtext.g:4000:1: ( ( rule__RuleNameAndParams__NameAssignment_0 ) )
            // InternalXtext.g:4001:2: ( rule__RuleNameAndParams__NameAssignment_0 )
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getNameAssignment_0()); 
            // InternalXtext.g:4002:2: ( rule__RuleNameAndParams__NameAssignment_0 )
            // InternalXtext.g:4002:3: rule__RuleNameAndParams__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleNameAndParamsAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group__0__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group__1"
    // InternalXtext.g:4010:1: rule__RuleNameAndParams__Group__1 : rule__RuleNameAndParams__Group__1__Impl ;
    public final void rule__RuleNameAndParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4014:1: ( rule__RuleNameAndParams__Group__1__Impl )
            // InternalXtext.g:4015:2: rule__RuleNameAndParams__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group__1"


    // $ANTLR start "rule__RuleNameAndParams__Group__1__Impl"
    // InternalXtext.g:4021:1: rule__RuleNameAndParams__Group__1__Impl : ( ( rule__RuleNameAndParams__Group_1__0 )? ) ;
    public final void rule__RuleNameAndParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4025:1: ( ( ( rule__RuleNameAndParams__Group_1__0 )? ) )
            // InternalXtext.g:4026:1: ( ( rule__RuleNameAndParams__Group_1__0 )? )
            {
            // InternalXtext.g:4026:1: ( ( rule__RuleNameAndParams__Group_1__0 )? )
            // InternalXtext.g:4027:2: ( rule__RuleNameAndParams__Group_1__0 )?
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getGroup_1()); 
            // InternalXtext.g:4028:2: ( rule__RuleNameAndParams__Group_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==34) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXtext.g:4028:3: rule__RuleNameAndParams__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__RuleNameAndParams__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleNameAndParamsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group__1__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group_1__0"
    // InternalXtext.g:4037:1: rule__RuleNameAndParams__Group_1__0 : rule__RuleNameAndParams__Group_1__0__Impl rule__RuleNameAndParams__Group_1__1 ;
    public final void rule__RuleNameAndParams__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4041:1: ( rule__RuleNameAndParams__Group_1__0__Impl rule__RuleNameAndParams__Group_1__1 )
            // InternalXtext.g:4042:2: rule__RuleNameAndParams__Group_1__0__Impl rule__RuleNameAndParams__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__RuleNameAndParams__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1__0"


    // $ANTLR start "rule__RuleNameAndParams__Group_1__0__Impl"
    // InternalXtext.g:4049:1: rule__RuleNameAndParams__Group_1__0__Impl : ( '<' ) ;
    public final void rule__RuleNameAndParams__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4053:1: ( ( '<' ) )
            // InternalXtext.g:4054:1: ( '<' )
            {
            // InternalXtext.g:4054:1: ( '<' )
            // InternalXtext.g:4055:2: '<'
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getLessThanSignKeyword_1_0()); 
            match(input,34,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRuleNameAndParamsAccess().getLessThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1__0__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group_1__1"
    // InternalXtext.g:4064:1: rule__RuleNameAndParams__Group_1__1 : rule__RuleNameAndParams__Group_1__1__Impl rule__RuleNameAndParams__Group_1__2 ;
    public final void rule__RuleNameAndParams__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4068:1: ( rule__RuleNameAndParams__Group_1__1__Impl rule__RuleNameAndParams__Group_1__2 )
            // InternalXtext.g:4069:2: rule__RuleNameAndParams__Group_1__1__Impl rule__RuleNameAndParams__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__RuleNameAndParams__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1__1"


    // $ANTLR start "rule__RuleNameAndParams__Group_1__1__Impl"
    // InternalXtext.g:4076:1: rule__RuleNameAndParams__Group_1__1__Impl : ( ( rule__RuleNameAndParams__Group_1_1__0 )? ) ;
    public final void rule__RuleNameAndParams__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4080:1: ( ( ( rule__RuleNameAndParams__Group_1_1__0 )? ) )
            // InternalXtext.g:4081:1: ( ( rule__RuleNameAndParams__Group_1_1__0 )? )
            {
            // InternalXtext.g:4081:1: ( ( rule__RuleNameAndParams__Group_1_1__0 )? )
            // InternalXtext.g:4082:2: ( rule__RuleNameAndParams__Group_1_1__0 )?
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getGroup_1_1()); 
            // InternalXtext.g:4083:2: ( rule__RuleNameAndParams__Group_1_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXtext.g:4083:3: rule__RuleNameAndParams__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__RuleNameAndParams__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleNameAndParamsAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1__1__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group_1__2"
    // InternalXtext.g:4091:1: rule__RuleNameAndParams__Group_1__2 : rule__RuleNameAndParams__Group_1__2__Impl ;
    public final void rule__RuleNameAndParams__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4095:1: ( rule__RuleNameAndParams__Group_1__2__Impl )
            // InternalXtext.g:4096:2: rule__RuleNameAndParams__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1__2"


    // $ANTLR start "rule__RuleNameAndParams__Group_1__2__Impl"
    // InternalXtext.g:4102:1: rule__RuleNameAndParams__Group_1__2__Impl : ( '>' ) ;
    public final void rule__RuleNameAndParams__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4106:1: ( ( '>' ) )
            // InternalXtext.g:4107:1: ( '>' )
            {
            // InternalXtext.g:4107:1: ( '>' )
            // InternalXtext.g:4108:2: '>'
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getGreaterThanSignKeyword_1_2()); 
            match(input,35,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRuleNameAndParamsAccess().getGreaterThanSignKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1__2__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1__0"
    // InternalXtext.g:4118:1: rule__RuleNameAndParams__Group_1_1__0 : rule__RuleNameAndParams__Group_1_1__0__Impl rule__RuleNameAndParams__Group_1_1__1 ;
    public final void rule__RuleNameAndParams__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4122:1: ( rule__RuleNameAndParams__Group_1_1__0__Impl rule__RuleNameAndParams__Group_1_1__1 )
            // InternalXtext.g:4123:2: rule__RuleNameAndParams__Group_1_1__0__Impl rule__RuleNameAndParams__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__RuleNameAndParams__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1__0"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1__0__Impl"
    // InternalXtext.g:4130:1: rule__RuleNameAndParams__Group_1_1__0__Impl : ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_0 ) ) ;
    public final void rule__RuleNameAndParams__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4134:1: ( ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_0 ) ) )
            // InternalXtext.g:4135:1: ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_0 ) )
            {
            // InternalXtext.g:4135:1: ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_0 ) )
            // InternalXtext.g:4136:2: ( rule__RuleNameAndParams__ParametersAssignment_1_1_0 )
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getParametersAssignment_1_1_0()); 
            // InternalXtext.g:4137:2: ( rule__RuleNameAndParams__ParametersAssignment_1_1_0 )
            // InternalXtext.g:4137:3: rule__RuleNameAndParams__ParametersAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__ParametersAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleNameAndParamsAccess().getParametersAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1__0__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1__1"
    // InternalXtext.g:4145:1: rule__RuleNameAndParams__Group_1_1__1 : rule__RuleNameAndParams__Group_1_1__1__Impl ;
    public final void rule__RuleNameAndParams__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4149:1: ( rule__RuleNameAndParams__Group_1_1__1__Impl )
            // InternalXtext.g:4150:2: rule__RuleNameAndParams__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1__1"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1__1__Impl"
    // InternalXtext.g:4156:1: rule__RuleNameAndParams__Group_1_1__1__Impl : ( ( rule__RuleNameAndParams__Group_1_1_1__0 )* ) ;
    public final void rule__RuleNameAndParams__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4160:1: ( ( ( rule__RuleNameAndParams__Group_1_1_1__0 )* ) )
            // InternalXtext.g:4161:1: ( ( rule__RuleNameAndParams__Group_1_1_1__0 )* )
            {
            // InternalXtext.g:4161:1: ( ( rule__RuleNameAndParams__Group_1_1_1__0 )* )
            // InternalXtext.g:4162:2: ( rule__RuleNameAndParams__Group_1_1_1__0 )*
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getGroup_1_1_1()); 
            // InternalXtext.g:4163:2: ( rule__RuleNameAndParams__Group_1_1_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==22) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalXtext.g:4163:3: rule__RuleNameAndParams__Group_1_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__RuleNameAndParams__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getRuleNameAndParamsAccess().getGroup_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1__1__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1_1__0"
    // InternalXtext.g:4172:1: rule__RuleNameAndParams__Group_1_1_1__0 : rule__RuleNameAndParams__Group_1_1_1__0__Impl rule__RuleNameAndParams__Group_1_1_1__1 ;
    public final void rule__RuleNameAndParams__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4176:1: ( rule__RuleNameAndParams__Group_1_1_1__0__Impl rule__RuleNameAndParams__Group_1_1_1__1 )
            // InternalXtext.g:4177:2: rule__RuleNameAndParams__Group_1_1_1__0__Impl rule__RuleNameAndParams__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__RuleNameAndParams__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1_1__0"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1_1__0__Impl"
    // InternalXtext.g:4184:1: rule__RuleNameAndParams__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__RuleNameAndParams__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4188:1: ( ( ',' ) )
            // InternalXtext.g:4189:1: ( ',' )
            {
            // InternalXtext.g:4189:1: ( ',' )
            // InternalXtext.g:4190:2: ','
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getCommaKeyword_1_1_1_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRuleNameAndParamsAccess().getCommaKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1_1__1"
    // InternalXtext.g:4199:1: rule__RuleNameAndParams__Group_1_1_1__1 : rule__RuleNameAndParams__Group_1_1_1__1__Impl ;
    public final void rule__RuleNameAndParams__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4203:1: ( rule__RuleNameAndParams__Group_1_1_1__1__Impl )
            // InternalXtext.g:4204:2: rule__RuleNameAndParams__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1_1__1"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1_1__1__Impl"
    // InternalXtext.g:4210:1: rule__RuleNameAndParams__Group_1_1_1__1__Impl : ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_1_1 ) ) ;
    public final void rule__RuleNameAndParams__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4214:1: ( ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_1_1 ) ) )
            // InternalXtext.g:4215:1: ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_1_1 ) )
            {
            // InternalXtext.g:4215:1: ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_1_1 ) )
            // InternalXtext.g:4216:2: ( rule__RuleNameAndParams__ParametersAssignment_1_1_1_1 )
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getParametersAssignment_1_1_1_1()); 
            // InternalXtext.g:4217:2: ( rule__RuleNameAndParams__ParametersAssignment_1_1_1_1 )
            // InternalXtext.g:4217:3: rule__RuleNameAndParams__ParametersAssignment_1_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__ParametersAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleNameAndParamsAccess().getParametersAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__TypeRef__Group__0"
    // InternalXtext.g:4226:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4230:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // InternalXtext.g:4231:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__0"


    // $ANTLR start "rule__TypeRef__Group__0__Impl"
    // InternalXtext.g:4238:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__Group_0__0 )? ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4242:1: ( ( ( rule__TypeRef__Group_0__0 )? ) )
            // InternalXtext.g:4243:1: ( ( rule__TypeRef__Group_0__0 )? )
            {
            // InternalXtext.g:4243:1: ( ( rule__TypeRef__Group_0__0 )? )
            // InternalXtext.g:4244:2: ( rule__TypeRef__Group_0__0 )?
            {
             before(grammarAccess.getTypeRefAccess().getGroup_0()); 
            // InternalXtext.g:4245:2: ( rule__TypeRef__Group_0__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==36) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // InternalXtext.g:4245:3: rule__TypeRef__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TypeRef__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeRefAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__0__Impl"


    // $ANTLR start "rule__TypeRef__Group__1"
    // InternalXtext.g:4253:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4257:1: ( rule__TypeRef__Group__1__Impl )
            // InternalXtext.g:4258:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__1"


    // $ANTLR start "rule__TypeRef__Group__1__Impl"
    // InternalXtext.g:4264:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__ClassifierAssignment_1 ) ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4268:1: ( ( ( rule__TypeRef__ClassifierAssignment_1 ) ) )
            // InternalXtext.g:4269:1: ( ( rule__TypeRef__ClassifierAssignment_1 ) )
            {
            // InternalXtext.g:4269:1: ( ( rule__TypeRef__ClassifierAssignment_1 ) )
            // InternalXtext.g:4270:2: ( rule__TypeRef__ClassifierAssignment_1 )
            {
             before(grammarAccess.getTypeRefAccess().getClassifierAssignment_1()); 
            // InternalXtext.g:4271:2: ( rule__TypeRef__ClassifierAssignment_1 )
            // InternalXtext.g:4271:3: rule__TypeRef__ClassifierAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeRef__ClassifierAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getClassifierAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__1__Impl"


    // $ANTLR start "rule__TypeRef__Group_0__0"
    // InternalXtext.g:4280:1: rule__TypeRef__Group_0__0 : rule__TypeRef__Group_0__0__Impl rule__TypeRef__Group_0__1 ;
    public final void rule__TypeRef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4284:1: ( rule__TypeRef__Group_0__0__Impl rule__TypeRef__Group_0__1 )
            // InternalXtext.g:4285:2: rule__TypeRef__Group_0__0__Impl rule__TypeRef__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__TypeRef__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeRef__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0__0"


    // $ANTLR start "rule__TypeRef__Group_0__0__Impl"
    // InternalXtext.g:4292:1: rule__TypeRef__Group_0__0__Impl : ( ( rule__TypeRef__MetamodelAssignment_0_0 ) ) ;
    public final void rule__TypeRef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4296:1: ( ( ( rule__TypeRef__MetamodelAssignment_0_0 ) ) )
            // InternalXtext.g:4297:1: ( ( rule__TypeRef__MetamodelAssignment_0_0 ) )
            {
            // InternalXtext.g:4297:1: ( ( rule__TypeRef__MetamodelAssignment_0_0 ) )
            // InternalXtext.g:4298:2: ( rule__TypeRef__MetamodelAssignment_0_0 )
            {
             before(grammarAccess.getTypeRefAccess().getMetamodelAssignment_0_0()); 
            // InternalXtext.g:4299:2: ( rule__TypeRef__MetamodelAssignment_0_0 )
            // InternalXtext.g:4299:3: rule__TypeRef__MetamodelAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeRef__MetamodelAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getMetamodelAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0__0__Impl"


    // $ANTLR start "rule__TypeRef__Group_0__1"
    // InternalXtext.g:4307:1: rule__TypeRef__Group_0__1 : rule__TypeRef__Group_0__1__Impl ;
    public final void rule__TypeRef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4311:1: ( rule__TypeRef__Group_0__1__Impl )
            // InternalXtext.g:4312:2: rule__TypeRef__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeRef__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0__1"


    // $ANTLR start "rule__TypeRef__Group_0__1__Impl"
    // InternalXtext.g:4318:1: rule__TypeRef__Group_0__1__Impl : ( '::' ) ;
    public final void rule__TypeRef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4322:1: ( ( '::' ) )
            // InternalXtext.g:4323:1: ( '::' )
            {
            // InternalXtext.g:4323:1: ( '::' )
            // InternalXtext.g:4324:2: '::'
            {
             before(grammarAccess.getTypeRefAccess().getColonColonKeyword_0_1()); 
            match(input,36,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypeRefAccess().getColonColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0__1__Impl"


    // $ANTLR start "rule__Alternatives__Group__0"
    // InternalXtext.g:4334:1: rule__Alternatives__Group__0 : rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 ;
    public final void rule__Alternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4338:1: ( rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 )
            // InternalXtext.g:4339:2: rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__Alternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__0"


    // $ANTLR start "rule__Alternatives__Group__0__Impl"
    // InternalXtext.g:4346:1: rule__Alternatives__Group__0__Impl : ( ruleConditionalBranch ) ;
    public final void rule__Alternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4350:1: ( ( ruleConditionalBranch ) )
            // InternalXtext.g:4351:1: ( ruleConditionalBranch )
            {
            // InternalXtext.g:4351:1: ( ruleConditionalBranch )
            // InternalXtext.g:4352:2: ruleConditionalBranch
            {
             before(grammarAccess.getAlternativesAccess().getConditionalBranchParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConditionalBranch();

            state._fsp--;

             after(grammarAccess.getAlternativesAccess().getConditionalBranchParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__0__Impl"


    // $ANTLR start "rule__Alternatives__Group__1"
    // InternalXtext.g:4361:1: rule__Alternatives__Group__1 : rule__Alternatives__Group__1__Impl ;
    public final void rule__Alternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4365:1: ( rule__Alternatives__Group__1__Impl )
            // InternalXtext.g:4366:2: rule__Alternatives__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__1"


    // $ANTLR start "rule__Alternatives__Group__1__Impl"
    // InternalXtext.g:4372:1: rule__Alternatives__Group__1__Impl : ( ( rule__Alternatives__Group_1__0 )? ) ;
    public final void rule__Alternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4376:1: ( ( ( rule__Alternatives__Group_1__0 )? ) )
            // InternalXtext.g:4377:1: ( ( rule__Alternatives__Group_1__0 )? )
            {
            // InternalXtext.g:4377:1: ( ( rule__Alternatives__Group_1__0 )? )
            // InternalXtext.g:4378:2: ( rule__Alternatives__Group_1__0 )?
            {
             before(grammarAccess.getAlternativesAccess().getGroup_1()); 
            // InternalXtext.g:4379:2: ( rule__Alternatives__Group_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==37) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXtext.g:4379:3: rule__Alternatives__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Alternatives__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlternativesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__1__Impl"


    // $ANTLR start "rule__Alternatives__Group_1__0"
    // InternalXtext.g:4388:1: rule__Alternatives__Group_1__0 : rule__Alternatives__Group_1__0__Impl rule__Alternatives__Group_1__1 ;
    public final void rule__Alternatives__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4392:1: ( rule__Alternatives__Group_1__0__Impl rule__Alternatives__Group_1__1 )
            // InternalXtext.g:4393:2: rule__Alternatives__Group_1__0__Impl rule__Alternatives__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__Alternatives__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1__0"


    // $ANTLR start "rule__Alternatives__Group_1__0__Impl"
    // InternalXtext.g:4400:1: rule__Alternatives__Group_1__0__Impl : ( () ) ;
    public final void rule__Alternatives__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4404:1: ( ( () ) )
            // InternalXtext.g:4405:1: ( () )
            {
            // InternalXtext.g:4405:1: ( () )
            // InternalXtext.g:4406:2: ()
            {
             before(grammarAccess.getAlternativesAccess().getAlternativesElementsAction_1_0()); 
            // InternalXtext.g:4407:2: ()
            // InternalXtext.g:4407:3: 
            {
            }

             after(grammarAccess.getAlternativesAccess().getAlternativesElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1__0__Impl"


    // $ANTLR start "rule__Alternatives__Group_1__1"
    // InternalXtext.g:4415:1: rule__Alternatives__Group_1__1 : rule__Alternatives__Group_1__1__Impl ;
    public final void rule__Alternatives__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4419:1: ( rule__Alternatives__Group_1__1__Impl )
            // InternalXtext.g:4420:2: rule__Alternatives__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1__1"


    // $ANTLR start "rule__Alternatives__Group_1__1__Impl"
    // InternalXtext.g:4426:1: rule__Alternatives__Group_1__1__Impl : ( ( ( rule__Alternatives__Group_1_1__0 ) ) ( ( rule__Alternatives__Group_1_1__0 )* ) ) ;
    public final void rule__Alternatives__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4430:1: ( ( ( ( rule__Alternatives__Group_1_1__0 ) ) ( ( rule__Alternatives__Group_1_1__0 )* ) ) )
            // InternalXtext.g:4431:1: ( ( ( rule__Alternatives__Group_1_1__0 ) ) ( ( rule__Alternatives__Group_1_1__0 )* ) )
            {
            // InternalXtext.g:4431:1: ( ( ( rule__Alternatives__Group_1_1__0 ) ) ( ( rule__Alternatives__Group_1_1__0 )* ) )
            // InternalXtext.g:4432:2: ( ( rule__Alternatives__Group_1_1__0 ) ) ( ( rule__Alternatives__Group_1_1__0 )* )
            {
            // InternalXtext.g:4432:2: ( ( rule__Alternatives__Group_1_1__0 ) )
            // InternalXtext.g:4433:3: ( rule__Alternatives__Group_1_1__0 )
            {
             before(grammarAccess.getAlternativesAccess().getGroup_1_1()); 
            // InternalXtext.g:4434:3: ( rule__Alternatives__Group_1_1__0 )
            // InternalXtext.g:4434:4: rule__Alternatives__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__Alternatives__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getGroup_1_1()); 

            }

            // InternalXtext.g:4437:2: ( ( rule__Alternatives__Group_1_1__0 )* )
            // InternalXtext.g:4438:3: ( rule__Alternatives__Group_1_1__0 )*
            {
             before(grammarAccess.getAlternativesAccess().getGroup_1_1()); 
            // InternalXtext.g:4439:3: ( rule__Alternatives__Group_1_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==37) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalXtext.g:4439:4: rule__Alternatives__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__Alternatives__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getAlternativesAccess().getGroup_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1__1__Impl"


    // $ANTLR start "rule__Alternatives__Group_1_1__0"
    // InternalXtext.g:4449:1: rule__Alternatives__Group_1_1__0 : rule__Alternatives__Group_1_1__0__Impl rule__Alternatives__Group_1_1__1 ;
    public final void rule__Alternatives__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4453:1: ( rule__Alternatives__Group_1_1__0__Impl rule__Alternatives__Group_1_1__1 )
            // InternalXtext.g:4454:2: rule__Alternatives__Group_1_1__0__Impl rule__Alternatives__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Alternatives__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1_1__0"


    // $ANTLR start "rule__Alternatives__Group_1_1__0__Impl"
    // InternalXtext.g:4461:1: rule__Alternatives__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__Alternatives__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4465:1: ( ( '|' ) )
            // InternalXtext.g:4466:1: ( '|' )
            {
            // InternalXtext.g:4466:1: ( '|' )
            // InternalXtext.g:4467:2: '|'
            {
             before(grammarAccess.getAlternativesAccess().getVerticalLineKeyword_1_1_0()); 
            match(input,37,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAlternativesAccess().getVerticalLineKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1_1__0__Impl"


    // $ANTLR start "rule__Alternatives__Group_1_1__1"
    // InternalXtext.g:4476:1: rule__Alternatives__Group_1_1__1 : rule__Alternatives__Group_1_1__1__Impl ;
    public final void rule__Alternatives__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4480:1: ( rule__Alternatives__Group_1_1__1__Impl )
            // InternalXtext.g:4481:2: rule__Alternatives__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1_1__1"


    // $ANTLR start "rule__Alternatives__Group_1_1__1__Impl"
    // InternalXtext.g:4487:1: rule__Alternatives__Group_1_1__1__Impl : ( ( rule__Alternatives__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__Alternatives__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4491:1: ( ( ( rule__Alternatives__ElementsAssignment_1_1_1 ) ) )
            // InternalXtext.g:4492:1: ( ( rule__Alternatives__ElementsAssignment_1_1_1 ) )
            {
            // InternalXtext.g:4492:1: ( ( rule__Alternatives__ElementsAssignment_1_1_1 ) )
            // InternalXtext.g:4493:2: ( rule__Alternatives__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getAlternativesAccess().getElementsAssignment_1_1_1()); 
            // InternalXtext.g:4494:2: ( rule__Alternatives__ElementsAssignment_1_1_1 )
            // InternalXtext.g:4494:3: rule__Alternatives__ElementsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getElementsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1_1__1__Impl"


    // $ANTLR start "rule__ConditionalBranch__Group_1__0"
    // InternalXtext.g:4503:1: rule__ConditionalBranch__Group_1__0 : rule__ConditionalBranch__Group_1__0__Impl rule__ConditionalBranch__Group_1__1 ;
    public final void rule__ConditionalBranch__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4507:1: ( rule__ConditionalBranch__Group_1__0__Impl rule__ConditionalBranch__Group_1__1 )
            // InternalXtext.g:4508:2: rule__ConditionalBranch__Group_1__0__Impl rule__ConditionalBranch__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__ConditionalBranch__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConditionalBranch__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__0"


    // $ANTLR start "rule__ConditionalBranch__Group_1__0__Impl"
    // InternalXtext.g:4515:1: rule__ConditionalBranch__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionalBranch__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4519:1: ( ( () ) )
            // InternalXtext.g:4520:1: ( () )
            {
            // InternalXtext.g:4520:1: ( () )
            // InternalXtext.g:4521:2: ()
            {
             before(grammarAccess.getConditionalBranchAccess().getGroupAction_1_0()); 
            // InternalXtext.g:4522:2: ()
            // InternalXtext.g:4522:3: 
            {
            }

             after(grammarAccess.getConditionalBranchAccess().getGroupAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__0__Impl"


    // $ANTLR start "rule__ConditionalBranch__Group_1__1"
    // InternalXtext.g:4530:1: rule__ConditionalBranch__Group_1__1 : rule__ConditionalBranch__Group_1__1__Impl rule__ConditionalBranch__Group_1__2 ;
    public final void rule__ConditionalBranch__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4534:1: ( rule__ConditionalBranch__Group_1__1__Impl rule__ConditionalBranch__Group_1__2 )
            // InternalXtext.g:4535:2: rule__ConditionalBranch__Group_1__1__Impl rule__ConditionalBranch__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__ConditionalBranch__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConditionalBranch__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__1"


    // $ANTLR start "rule__ConditionalBranch__Group_1__1__Impl"
    // InternalXtext.g:4542:1: rule__ConditionalBranch__Group_1__1__Impl : ( '<' ) ;
    public final void rule__ConditionalBranch__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4546:1: ( ( '<' ) )
            // InternalXtext.g:4547:1: ( '<' )
            {
            // InternalXtext.g:4547:1: ( '<' )
            // InternalXtext.g:4548:2: '<'
            {
             before(grammarAccess.getConditionalBranchAccess().getLessThanSignKeyword_1_1()); 
            match(input,34,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getConditionalBranchAccess().getLessThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__1__Impl"


    // $ANTLR start "rule__ConditionalBranch__Group_1__2"
    // InternalXtext.g:4557:1: rule__ConditionalBranch__Group_1__2 : rule__ConditionalBranch__Group_1__2__Impl rule__ConditionalBranch__Group_1__3 ;
    public final void rule__ConditionalBranch__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4561:1: ( rule__ConditionalBranch__Group_1__2__Impl rule__ConditionalBranch__Group_1__3 )
            // InternalXtext.g:4562:2: rule__ConditionalBranch__Group_1__2__Impl rule__ConditionalBranch__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__ConditionalBranch__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConditionalBranch__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__2"


    // $ANTLR start "rule__ConditionalBranch__Group_1__2__Impl"
    // InternalXtext.g:4569:1: rule__ConditionalBranch__Group_1__2__Impl : ( ( rule__ConditionalBranch__GuardConditionAssignment_1_2 ) ) ;
    public final void rule__ConditionalBranch__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4573:1: ( ( ( rule__ConditionalBranch__GuardConditionAssignment_1_2 ) ) )
            // InternalXtext.g:4574:1: ( ( rule__ConditionalBranch__GuardConditionAssignment_1_2 ) )
            {
            // InternalXtext.g:4574:1: ( ( rule__ConditionalBranch__GuardConditionAssignment_1_2 ) )
            // InternalXtext.g:4575:2: ( rule__ConditionalBranch__GuardConditionAssignment_1_2 )
            {
             before(grammarAccess.getConditionalBranchAccess().getGuardConditionAssignment_1_2()); 
            // InternalXtext.g:4576:2: ( rule__ConditionalBranch__GuardConditionAssignment_1_2 )
            // InternalXtext.g:4576:3: rule__ConditionalBranch__GuardConditionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConditionalBranch__GuardConditionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalBranchAccess().getGuardConditionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__2__Impl"


    // $ANTLR start "rule__ConditionalBranch__Group_1__3"
    // InternalXtext.g:4584:1: rule__ConditionalBranch__Group_1__3 : rule__ConditionalBranch__Group_1__3__Impl rule__ConditionalBranch__Group_1__4 ;
    public final void rule__ConditionalBranch__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4588:1: ( rule__ConditionalBranch__Group_1__3__Impl rule__ConditionalBranch__Group_1__4 )
            // InternalXtext.g:4589:2: rule__ConditionalBranch__Group_1__3__Impl rule__ConditionalBranch__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__ConditionalBranch__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConditionalBranch__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__3"


    // $ANTLR start "rule__ConditionalBranch__Group_1__3__Impl"
    // InternalXtext.g:4596:1: rule__ConditionalBranch__Group_1__3__Impl : ( '>' ) ;
    public final void rule__ConditionalBranch__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4600:1: ( ( '>' ) )
            // InternalXtext.g:4601:1: ( '>' )
            {
            // InternalXtext.g:4601:1: ( '>' )
            // InternalXtext.g:4602:2: '>'
            {
             before(grammarAccess.getConditionalBranchAccess().getGreaterThanSignKeyword_1_3()); 
            match(input,35,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getConditionalBranchAccess().getGreaterThanSignKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__3__Impl"


    // $ANTLR start "rule__ConditionalBranch__Group_1__4"
    // InternalXtext.g:4611:1: rule__ConditionalBranch__Group_1__4 : rule__ConditionalBranch__Group_1__4__Impl ;
    public final void rule__ConditionalBranch__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4615:1: ( rule__ConditionalBranch__Group_1__4__Impl )
            // InternalXtext.g:4616:2: rule__ConditionalBranch__Group_1__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConditionalBranch__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__4"


    // $ANTLR start "rule__ConditionalBranch__Group_1__4__Impl"
    // InternalXtext.g:4622:1: rule__ConditionalBranch__Group_1__4__Impl : ( ( ( rule__ConditionalBranch__ElementsAssignment_1_4 ) ) ( ( rule__ConditionalBranch__ElementsAssignment_1_4 )* ) ) ;
    public final void rule__ConditionalBranch__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4626:1: ( ( ( ( rule__ConditionalBranch__ElementsAssignment_1_4 ) ) ( ( rule__ConditionalBranch__ElementsAssignment_1_4 )* ) ) )
            // InternalXtext.g:4627:1: ( ( ( rule__ConditionalBranch__ElementsAssignment_1_4 ) ) ( ( rule__ConditionalBranch__ElementsAssignment_1_4 )* ) )
            {
            // InternalXtext.g:4627:1: ( ( ( rule__ConditionalBranch__ElementsAssignment_1_4 ) ) ( ( rule__ConditionalBranch__ElementsAssignment_1_4 )* ) )
            // InternalXtext.g:4628:2: ( ( rule__ConditionalBranch__ElementsAssignment_1_4 ) ) ( ( rule__ConditionalBranch__ElementsAssignment_1_4 )* )
            {
            // InternalXtext.g:4628:2: ( ( rule__ConditionalBranch__ElementsAssignment_1_4 ) )
            // InternalXtext.g:4629:3: ( rule__ConditionalBranch__ElementsAssignment_1_4 )
            {
             before(grammarAccess.getConditionalBranchAccess().getElementsAssignment_1_4()); 
            // InternalXtext.g:4630:3: ( rule__ConditionalBranch__ElementsAssignment_1_4 )
            // InternalXtext.g:4630:4: rule__ConditionalBranch__ElementsAssignment_1_4
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__ConditionalBranch__ElementsAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionalBranchAccess().getElementsAssignment_1_4()); 

            }

            // InternalXtext.g:4633:2: ( ( rule__ConditionalBranch__ElementsAssignment_1_4 )* )
            // InternalXtext.g:4634:3: ( rule__ConditionalBranch__ElementsAssignment_1_4 )*
            {
             before(grammarAccess.getConditionalBranchAccess().getElementsAssignment_1_4()); 
            // InternalXtext.g:4635:3: ( rule__ConditionalBranch__ElementsAssignment_1_4 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_STRING)||(LA50_0>=17 && LA50_0<=18)||LA50_0==23||LA50_0==39||LA50_0==46||LA50_0==52) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalXtext.g:4635:4: rule__ConditionalBranch__ElementsAssignment_1_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    rule__ConditionalBranch__ElementsAssignment_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getConditionalBranchAccess().getElementsAssignment_1_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__4__Impl"


    // $ANTLR start "rule__UnorderedGroup__Group__0"
    // InternalXtext.g:4645:1: rule__UnorderedGroup__Group__0 : rule__UnorderedGroup__Group__0__Impl rule__UnorderedGroup__Group__1 ;
    public final void rule__UnorderedGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4649:1: ( rule__UnorderedGroup__Group__0__Impl rule__UnorderedGroup__Group__1 )
            // InternalXtext.g:4650:2: rule__UnorderedGroup__Group__0__Impl rule__UnorderedGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__UnorderedGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group__0"


    // $ANTLR start "rule__UnorderedGroup__Group__0__Impl"
    // InternalXtext.g:4657:1: rule__UnorderedGroup__Group__0__Impl : ( ruleGroup ) ;
    public final void rule__UnorderedGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4661:1: ( ( ruleGroup ) )
            // InternalXtext.g:4662:1: ( ruleGroup )
            {
            // InternalXtext.g:4662:1: ( ruleGroup )
            // InternalXtext.g:4663:2: ruleGroup
            {
             before(grammarAccess.getUnorderedGroupAccess().getGroupParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getUnorderedGroupAccess().getGroupParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group__0__Impl"


    // $ANTLR start "rule__UnorderedGroup__Group__1"
    // InternalXtext.g:4672:1: rule__UnorderedGroup__Group__1 : rule__UnorderedGroup__Group__1__Impl ;
    public final void rule__UnorderedGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4676:1: ( rule__UnorderedGroup__Group__1__Impl )
            // InternalXtext.g:4677:2: rule__UnorderedGroup__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group__1"


    // $ANTLR start "rule__UnorderedGroup__Group__1__Impl"
    // InternalXtext.g:4683:1: rule__UnorderedGroup__Group__1__Impl : ( ( rule__UnorderedGroup__Group_1__0 )? ) ;
    public final void rule__UnorderedGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4687:1: ( ( ( rule__UnorderedGroup__Group_1__0 )? ) )
            // InternalXtext.g:4688:1: ( ( rule__UnorderedGroup__Group_1__0 )? )
            {
            // InternalXtext.g:4688:1: ( ( rule__UnorderedGroup__Group_1__0 )? )
            // InternalXtext.g:4689:2: ( rule__UnorderedGroup__Group_1__0 )?
            {
             before(grammarAccess.getUnorderedGroupAccess().getGroup_1()); 
            // InternalXtext.g:4690:2: ( rule__UnorderedGroup__Group_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==38) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalXtext.g:4690:3: rule__UnorderedGroup__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__UnorderedGroup__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnorderedGroupAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group__1__Impl"


    // $ANTLR start "rule__UnorderedGroup__Group_1__0"
    // InternalXtext.g:4699:1: rule__UnorderedGroup__Group_1__0 : rule__UnorderedGroup__Group_1__0__Impl rule__UnorderedGroup__Group_1__1 ;
    public final void rule__UnorderedGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4703:1: ( rule__UnorderedGroup__Group_1__0__Impl rule__UnorderedGroup__Group_1__1 )
            // InternalXtext.g:4704:2: rule__UnorderedGroup__Group_1__0__Impl rule__UnorderedGroup__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__UnorderedGroup__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group_1__0"


    // $ANTLR start "rule__UnorderedGroup__Group_1__0__Impl"
    // InternalXtext.g:4711:1: rule__UnorderedGroup__Group_1__0__Impl : ( () ) ;
    public final void rule__UnorderedGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4715:1: ( ( () ) )
            // InternalXtext.g:4716:1: ( () )
            {
            // InternalXtext.g:4716:1: ( () )
            // InternalXtext.g:4717:2: ()
            {
             before(grammarAccess.getUnorderedGroupAccess().getUnorderedGroupElementsAction_1_0()); 
            // InternalXtext.g:4718:2: ()
            // InternalXtext.g:4718:3: 
            {
            }

             after(grammarAccess.getUnorderedGroupAccess().getUnorderedGroupElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group_1__0__Impl"


    // $ANTLR start "rule__UnorderedGroup__Group_1__1"
    // InternalXtext.g:4726:1: rule__UnorderedGroup__Group_1__1 : rule__UnorderedGroup__Group_1__1__Impl ;
    public final void rule__UnorderedGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4730:1: ( rule__UnorderedGroup__Group_1__1__Impl )
            // InternalXtext.g:4731:2: rule__UnorderedGroup__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group_1__1"


    // $ANTLR start "rule__UnorderedGroup__Group_1__1__Impl"
    // InternalXtext.g:4737:1: rule__UnorderedGroup__Group_1__1__Impl : ( ( ( rule__UnorderedGroup__Group_1_1__0 ) ) ( ( rule__UnorderedGroup__Group_1_1__0 )* ) ) ;
    public final void rule__UnorderedGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4741:1: ( ( ( ( rule__UnorderedGroup__Group_1_1__0 ) ) ( ( rule__UnorderedGroup__Group_1_1__0 )* ) ) )
            // InternalXtext.g:4742:1: ( ( ( rule__UnorderedGroup__Group_1_1__0 ) ) ( ( rule__UnorderedGroup__Group_1_1__0 )* ) )
            {
            // InternalXtext.g:4742:1: ( ( ( rule__UnorderedGroup__Group_1_1__0 ) ) ( ( rule__UnorderedGroup__Group_1_1__0 )* ) )
            // InternalXtext.g:4743:2: ( ( rule__UnorderedGroup__Group_1_1__0 ) ) ( ( rule__UnorderedGroup__Group_1_1__0 )* )
            {
            // InternalXtext.g:4743:2: ( ( rule__UnorderedGroup__Group_1_1__0 ) )
            // InternalXtext.g:4744:3: ( rule__UnorderedGroup__Group_1_1__0 )
            {
             before(grammarAccess.getUnorderedGroupAccess().getGroup_1_1()); 
            // InternalXtext.g:4745:3: ( rule__UnorderedGroup__Group_1_1__0 )
            // InternalXtext.g:4745:4: rule__UnorderedGroup__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__UnorderedGroup__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getUnorderedGroupAccess().getGroup_1_1()); 

            }

            // InternalXtext.g:4748:2: ( ( rule__UnorderedGroup__Group_1_1__0 )* )
            // InternalXtext.g:4749:3: ( rule__UnorderedGroup__Group_1_1__0 )*
            {
             before(grammarAccess.getUnorderedGroupAccess().getGroup_1_1()); 
            // InternalXtext.g:4750:3: ( rule__UnorderedGroup__Group_1_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==38) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalXtext.g:4750:4: rule__UnorderedGroup__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_34);
            	    rule__UnorderedGroup__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getUnorderedGroupAccess().getGroup_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group_1__1__Impl"


    // $ANTLR start "rule__UnorderedGroup__Group_1_1__0"
    // InternalXtext.g:4760:1: rule__UnorderedGroup__Group_1_1__0 : rule__UnorderedGroup__Group_1_1__0__Impl rule__UnorderedGroup__Group_1_1__1 ;
    public final void rule__UnorderedGroup__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4764:1: ( rule__UnorderedGroup__Group_1_1__0__Impl rule__UnorderedGroup__Group_1_1__1 )
            // InternalXtext.g:4765:2: rule__UnorderedGroup__Group_1_1__0__Impl rule__UnorderedGroup__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__UnorderedGroup__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group_1_1__0"


    // $ANTLR start "rule__UnorderedGroup__Group_1_1__0__Impl"
    // InternalXtext.g:4772:1: rule__UnorderedGroup__Group_1_1__0__Impl : ( '&' ) ;
    public final void rule__UnorderedGroup__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4776:1: ( ( '&' ) )
            // InternalXtext.g:4777:1: ( '&' )
            {
            // InternalXtext.g:4777:1: ( '&' )
            // InternalXtext.g:4778:2: '&'
            {
             before(grammarAccess.getUnorderedGroupAccess().getAmpersandKeyword_1_1_0()); 
            match(input,38,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getUnorderedGroupAccess().getAmpersandKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group_1_1__0__Impl"


    // $ANTLR start "rule__UnorderedGroup__Group_1_1__1"
    // InternalXtext.g:4787:1: rule__UnorderedGroup__Group_1_1__1 : rule__UnorderedGroup__Group_1_1__1__Impl ;
    public final void rule__UnorderedGroup__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4791:1: ( rule__UnorderedGroup__Group_1_1__1__Impl )
            // InternalXtext.g:4792:2: rule__UnorderedGroup__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group_1_1__1"


    // $ANTLR start "rule__UnorderedGroup__Group_1_1__1__Impl"
    // InternalXtext.g:4798:1: rule__UnorderedGroup__Group_1_1__1__Impl : ( ( rule__UnorderedGroup__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__UnorderedGroup__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4802:1: ( ( ( rule__UnorderedGroup__ElementsAssignment_1_1_1 ) ) )
            // InternalXtext.g:4803:1: ( ( rule__UnorderedGroup__ElementsAssignment_1_1_1 ) )
            {
            // InternalXtext.g:4803:1: ( ( rule__UnorderedGroup__ElementsAssignment_1_1_1 ) )
            // InternalXtext.g:4804:2: ( rule__UnorderedGroup__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getUnorderedGroupAccess().getElementsAssignment_1_1_1()); 
            // InternalXtext.g:4805:2: ( rule__UnorderedGroup__ElementsAssignment_1_1_1 )
            // InternalXtext.g:4805:3: rule__UnorderedGroup__ElementsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnorderedGroupAccess().getElementsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group_1_1__1__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // InternalXtext.g:4814:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4818:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalXtext.g:4819:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // InternalXtext.g:4826:1: rule__Group__Group__0__Impl : ( ruleAbstractToken ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4830:1: ( ( ruleAbstractToken ) )
            // InternalXtext.g:4831:1: ( ruleAbstractToken )
            {
            // InternalXtext.g:4831:1: ( ruleAbstractToken )
            // InternalXtext.g:4832:2: ruleAbstractToken
            {
             before(grammarAccess.getGroupAccess().getAbstractTokenParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractToken();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getAbstractTokenParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // InternalXtext.g:4841:1: rule__Group__Group__1 : rule__Group__Group__1__Impl ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4845:1: ( rule__Group__Group__1__Impl )
            // InternalXtext.g:4846:2: rule__Group__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Group__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // InternalXtext.g:4852:1: rule__Group__Group__1__Impl : ( ( rule__Group__Group_1__0 )? ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4856:1: ( ( ( rule__Group__Group_1__0 )? ) )
            // InternalXtext.g:4857:1: ( ( rule__Group__Group_1__0 )? )
            {
            // InternalXtext.g:4857:1: ( ( rule__Group__Group_1__0 )? )
            // InternalXtext.g:4858:2: ( rule__Group__Group_1__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_1()); 
            // InternalXtext.g:4859:2: ( rule__Group__Group_1__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_STRING)||(LA53_0>=17 && LA53_0<=18)||LA53_0==23||LA53_0==39||LA53_0==46||LA53_0==52) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalXtext.g:4859:3: rule__Group__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Group__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group_1__0"
    // InternalXtext.g:4868:1: rule__Group__Group_1__0 : rule__Group__Group_1__0__Impl rule__Group__Group_1__1 ;
    public final void rule__Group__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4872:1: ( rule__Group__Group_1__0__Impl rule__Group__Group_1__1 )
            // InternalXtext.g:4873:2: rule__Group__Group_1__0__Impl rule__Group__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__Group__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Group__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_1__0"


    // $ANTLR start "rule__Group__Group_1__0__Impl"
    // InternalXtext.g:4880:1: rule__Group__Group_1__0__Impl : ( () ) ;
    public final void rule__Group__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4884:1: ( ( () ) )
            // InternalXtext.g:4885:1: ( () )
            {
            // InternalXtext.g:4885:1: ( () )
            // InternalXtext.g:4886:2: ()
            {
             before(grammarAccess.getGroupAccess().getGroupElementsAction_1_0()); 
            // InternalXtext.g:4887:2: ()
            // InternalXtext.g:4887:3: 
            {
            }

             after(grammarAccess.getGroupAccess().getGroupElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_1__0__Impl"


    // $ANTLR start "rule__Group__Group_1__1"
    // InternalXtext.g:4895:1: rule__Group__Group_1__1 : rule__Group__Group_1__1__Impl ;
    public final void rule__Group__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4899:1: ( rule__Group__Group_1__1__Impl )
            // InternalXtext.g:4900:2: rule__Group__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Group__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_1__1"


    // $ANTLR start "rule__Group__Group_1__1__Impl"
    // InternalXtext.g:4906:1: rule__Group__Group_1__1__Impl : ( ( ( rule__Group__ElementsAssignment_1_1 ) ) ( ( rule__Group__ElementsAssignment_1_1 )* ) ) ;
    public final void rule__Group__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4910:1: ( ( ( ( rule__Group__ElementsAssignment_1_1 ) ) ( ( rule__Group__ElementsAssignment_1_1 )* ) ) )
            // InternalXtext.g:4911:1: ( ( ( rule__Group__ElementsAssignment_1_1 ) ) ( ( rule__Group__ElementsAssignment_1_1 )* ) )
            {
            // InternalXtext.g:4911:1: ( ( ( rule__Group__ElementsAssignment_1_1 ) ) ( ( rule__Group__ElementsAssignment_1_1 )* ) )
            // InternalXtext.g:4912:2: ( ( rule__Group__ElementsAssignment_1_1 ) ) ( ( rule__Group__ElementsAssignment_1_1 )* )
            {
            // InternalXtext.g:4912:2: ( ( rule__Group__ElementsAssignment_1_1 ) )
            // InternalXtext.g:4913:3: ( rule__Group__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getGroupAccess().getElementsAssignment_1_1()); 
            // InternalXtext.g:4914:3: ( rule__Group__ElementsAssignment_1_1 )
            // InternalXtext.g:4914:4: rule__Group__ElementsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__Group__ElementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getElementsAssignment_1_1()); 

            }

            // InternalXtext.g:4917:2: ( ( rule__Group__ElementsAssignment_1_1 )* )
            // InternalXtext.g:4918:3: ( rule__Group__ElementsAssignment_1_1 )*
            {
             before(grammarAccess.getGroupAccess().getElementsAssignment_1_1()); 
            // InternalXtext.g:4919:3: ( rule__Group__ElementsAssignment_1_1 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_STRING)||(LA54_0>=17 && LA54_0<=18)||LA54_0==23||LA54_0==39||LA54_0==46||LA54_0==52) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalXtext.g:4919:4: rule__Group__ElementsAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    rule__Group__ElementsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getElementsAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_1__1__Impl"


    // $ANTLR start "rule__AbstractTokenWithCardinality__Group__0"
    // InternalXtext.g:4929:1: rule__AbstractTokenWithCardinality__Group__0 : rule__AbstractTokenWithCardinality__Group__0__Impl rule__AbstractTokenWithCardinality__Group__1 ;
    public final void rule__AbstractTokenWithCardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4933:1: ( rule__AbstractTokenWithCardinality__Group__0__Impl rule__AbstractTokenWithCardinality__Group__1 )
            // InternalXtext.g:4934:2: rule__AbstractTokenWithCardinality__Group__0__Impl rule__AbstractTokenWithCardinality__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__AbstractTokenWithCardinality__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractTokenWithCardinality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTokenWithCardinality__Group__0"


    // $ANTLR start "rule__AbstractTokenWithCardinality__Group__0__Impl"
    // InternalXtext.g:4941:1: rule__AbstractTokenWithCardinality__Group__0__Impl : ( ( rule__AbstractTokenWithCardinality__Alternatives_0 ) ) ;
    public final void rule__AbstractTokenWithCardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4945:1: ( ( ( rule__AbstractTokenWithCardinality__Alternatives_0 ) ) )
            // InternalXtext.g:4946:1: ( ( rule__AbstractTokenWithCardinality__Alternatives_0 ) )
            {
            // InternalXtext.g:4946:1: ( ( rule__AbstractTokenWithCardinality__Alternatives_0 ) )
            // InternalXtext.g:4947:2: ( rule__AbstractTokenWithCardinality__Alternatives_0 )
            {
             before(grammarAccess.getAbstractTokenWithCardinalityAccess().getAlternatives_0()); 
            // InternalXtext.g:4948:2: ( rule__AbstractTokenWithCardinality__Alternatives_0 )
            // InternalXtext.g:4948:3: rule__AbstractTokenWithCardinality__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractTokenWithCardinality__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTokenWithCardinalityAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTokenWithCardinality__Group__0__Impl"


    // $ANTLR start "rule__AbstractTokenWithCardinality__Group__1"
    // InternalXtext.g:4956:1: rule__AbstractTokenWithCardinality__Group__1 : rule__AbstractTokenWithCardinality__Group__1__Impl ;
    public final void rule__AbstractTokenWithCardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4960:1: ( rule__AbstractTokenWithCardinality__Group__1__Impl )
            // InternalXtext.g:4961:2: rule__AbstractTokenWithCardinality__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractTokenWithCardinality__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTokenWithCardinality__Group__1"


    // $ANTLR start "rule__AbstractTokenWithCardinality__Group__1__Impl"
    // InternalXtext.g:4967:1: rule__AbstractTokenWithCardinality__Group__1__Impl : ( ( rule__AbstractTokenWithCardinality__CardinalityAssignment_1 )? ) ;
    public final void rule__AbstractTokenWithCardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4971:1: ( ( ( rule__AbstractTokenWithCardinality__CardinalityAssignment_1 )? ) )
            // InternalXtext.g:4972:1: ( ( rule__AbstractTokenWithCardinality__CardinalityAssignment_1 )? )
            {
            // InternalXtext.g:4972:1: ( ( rule__AbstractTokenWithCardinality__CardinalityAssignment_1 )? )
            // InternalXtext.g:4973:2: ( rule__AbstractTokenWithCardinality__CardinalityAssignment_1 )?
            {
             before(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAssignment_1()); 
            // InternalXtext.g:4974:2: ( rule__AbstractTokenWithCardinality__CardinalityAssignment_1 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=12 && LA55_0<=14)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalXtext.g:4974:3: rule__AbstractTokenWithCardinality__CardinalityAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AbstractTokenWithCardinality__CardinalityAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTokenWithCardinality__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalXtext.g:4983:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4987:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalXtext.g:4988:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalXtext.g:4995:1: rule__Action__Group__0__Impl : ( '{' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:4999:1: ( ( '{' ) )
            // InternalXtext.g:5000:1: ( '{' )
            {
            // InternalXtext.g:5000:1: ( '{' )
            // InternalXtext.g:5001:2: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,39,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalXtext.g:5010:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5014:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalXtext.g:5015:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalXtext.g:5022:1: rule__Action__Group__1__Impl : ( ( rule__Action__TypeAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5026:1: ( ( ( rule__Action__TypeAssignment_1 ) ) )
            // InternalXtext.g:5027:1: ( ( rule__Action__TypeAssignment_1 ) )
            {
            // InternalXtext.g:5027:1: ( ( rule__Action__TypeAssignment_1 ) )
            // InternalXtext.g:5028:2: ( rule__Action__TypeAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getTypeAssignment_1()); 
            // InternalXtext.g:5029:2: ( rule__Action__TypeAssignment_1 )
            // InternalXtext.g:5029:3: rule__Action__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalXtext.g:5037:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5041:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalXtext.g:5042:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalXtext.g:5049:1: rule__Action__Group__2__Impl : ( ( rule__Action__Group_2__0 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5053:1: ( ( ( rule__Action__Group_2__0 )? ) )
            // InternalXtext.g:5054:1: ( ( rule__Action__Group_2__0 )? )
            {
            // InternalXtext.g:5054:1: ( ( rule__Action__Group_2__0 )? )
            // InternalXtext.g:5055:2: ( rule__Action__Group_2__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_2()); 
            // InternalXtext.g:5056:2: ( rule__Action__Group_2__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==25) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalXtext.g:5056:3: rule__Action__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Action__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalXtext.g:5064:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5068:1: ( rule__Action__Group__3__Impl )
            // InternalXtext.g:5069:2: rule__Action__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalXtext.g:5075:1: rule__Action__Group__3__Impl : ( '}' ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5079:1: ( ( '}' ) )
            // InternalXtext.g:5080:1: ( '}' )
            {
            // InternalXtext.g:5080:1: ( '}' )
            // InternalXtext.g:5081:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,40,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group_2__0"
    // InternalXtext.g:5091:1: rule__Action__Group_2__0 : rule__Action__Group_2__0__Impl rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5095:1: ( rule__Action__Group_2__0__Impl rule__Action__Group_2__1 )
            // InternalXtext.g:5096:2: rule__Action__Group_2__0__Impl rule__Action__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Action__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__0"


    // $ANTLR start "rule__Action__Group_2__0__Impl"
    // InternalXtext.g:5103:1: rule__Action__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Action__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5107:1: ( ( '.' ) )
            // InternalXtext.g:5108:1: ( '.' )
            {
            // InternalXtext.g:5108:1: ( '.' )
            // InternalXtext.g:5109:2: '.'
            {
             before(grammarAccess.getActionAccess().getFullStopKeyword_2_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getActionAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__0__Impl"


    // $ANTLR start "rule__Action__Group_2__1"
    // InternalXtext.g:5118:1: rule__Action__Group_2__1 : rule__Action__Group_2__1__Impl rule__Action__Group_2__2 ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5122:1: ( rule__Action__Group_2__1__Impl rule__Action__Group_2__2 )
            // InternalXtext.g:5123:2: rule__Action__Group_2__1__Impl rule__Action__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__Action__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__1"


    // $ANTLR start "rule__Action__Group_2__1__Impl"
    // InternalXtext.g:5130:1: rule__Action__Group_2__1__Impl : ( ( rule__Action__FeatureAssignment_2_1 ) ) ;
    public final void rule__Action__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5134:1: ( ( ( rule__Action__FeatureAssignment_2_1 ) ) )
            // InternalXtext.g:5135:1: ( ( rule__Action__FeatureAssignment_2_1 ) )
            {
            // InternalXtext.g:5135:1: ( ( rule__Action__FeatureAssignment_2_1 ) )
            // InternalXtext.g:5136:2: ( rule__Action__FeatureAssignment_2_1 )
            {
             before(grammarAccess.getActionAccess().getFeatureAssignment_2_1()); 
            // InternalXtext.g:5137:2: ( rule__Action__FeatureAssignment_2_1 )
            // InternalXtext.g:5137:3: rule__Action__FeatureAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__FeatureAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getFeatureAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__1__Impl"


    // $ANTLR start "rule__Action__Group_2__2"
    // InternalXtext.g:5145:1: rule__Action__Group_2__2 : rule__Action__Group_2__2__Impl rule__Action__Group_2__3 ;
    public final void rule__Action__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5149:1: ( rule__Action__Group_2__2__Impl rule__Action__Group_2__3 )
            // InternalXtext.g:5150:2: rule__Action__Group_2__2__Impl rule__Action__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__Action__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__2"


    // $ANTLR start "rule__Action__Group_2__2__Impl"
    // InternalXtext.g:5157:1: rule__Action__Group_2__2__Impl : ( ( rule__Action__OperatorAssignment_2_2 ) ) ;
    public final void rule__Action__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5161:1: ( ( ( rule__Action__OperatorAssignment_2_2 ) ) )
            // InternalXtext.g:5162:1: ( ( rule__Action__OperatorAssignment_2_2 ) )
            {
            // InternalXtext.g:5162:1: ( ( rule__Action__OperatorAssignment_2_2 ) )
            // InternalXtext.g:5163:2: ( rule__Action__OperatorAssignment_2_2 )
            {
             before(grammarAccess.getActionAccess().getOperatorAssignment_2_2()); 
            // InternalXtext.g:5164:2: ( rule__Action__OperatorAssignment_2_2 )
            // InternalXtext.g:5164:3: rule__Action__OperatorAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__OperatorAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getOperatorAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__2__Impl"


    // $ANTLR start "rule__Action__Group_2__3"
    // InternalXtext.g:5172:1: rule__Action__Group_2__3 : rule__Action__Group_2__3__Impl ;
    public final void rule__Action__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5176:1: ( rule__Action__Group_2__3__Impl )
            // InternalXtext.g:5177:2: rule__Action__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__3"


    // $ANTLR start "rule__Action__Group_2__3__Impl"
    // InternalXtext.g:5183:1: rule__Action__Group_2__3__Impl : ( 'current' ) ;
    public final void rule__Action__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5187:1: ( ( 'current' ) )
            // InternalXtext.g:5188:1: ( 'current' )
            {
            // InternalXtext.g:5188:1: ( 'current' )
            // InternalXtext.g:5189:2: 'current'
            {
             before(grammarAccess.getActionAccess().getCurrentKeyword_2_3()); 
            match(input,41,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getActionAccess().getCurrentKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__3__Impl"


    // $ANTLR start "rule__RuleCall__Group__0"
    // InternalXtext.g:5199:1: rule__RuleCall__Group__0 : rule__RuleCall__Group__0__Impl rule__RuleCall__Group__1 ;
    public final void rule__RuleCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5203:1: ( rule__RuleCall__Group__0__Impl rule__RuleCall__Group__1 )
            // InternalXtext.g:5204:2: rule__RuleCall__Group__0__Impl rule__RuleCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__RuleCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group__0"


    // $ANTLR start "rule__RuleCall__Group__0__Impl"
    // InternalXtext.g:5211:1: rule__RuleCall__Group__0__Impl : ( ( rule__RuleCall__RuleAssignment_0 ) ) ;
    public final void rule__RuleCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5215:1: ( ( ( rule__RuleCall__RuleAssignment_0 ) ) )
            // InternalXtext.g:5216:1: ( ( rule__RuleCall__RuleAssignment_0 ) )
            {
            // InternalXtext.g:5216:1: ( ( rule__RuleCall__RuleAssignment_0 ) )
            // InternalXtext.g:5217:2: ( rule__RuleCall__RuleAssignment_0 )
            {
             before(grammarAccess.getRuleCallAccess().getRuleAssignment_0()); 
            // InternalXtext.g:5218:2: ( rule__RuleCall__RuleAssignment_0 )
            // InternalXtext.g:5218:3: rule__RuleCall__RuleAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__RuleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleCallAccess().getRuleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group__0__Impl"


    // $ANTLR start "rule__RuleCall__Group__1"
    // InternalXtext.g:5226:1: rule__RuleCall__Group__1 : rule__RuleCall__Group__1__Impl ;
    public final void rule__RuleCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5230:1: ( rule__RuleCall__Group__1__Impl )
            // InternalXtext.g:5231:2: rule__RuleCall__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group__1"


    // $ANTLR start "rule__RuleCall__Group__1__Impl"
    // InternalXtext.g:5237:1: rule__RuleCall__Group__1__Impl : ( ( rule__RuleCall__Group_1__0 )? ) ;
    public final void rule__RuleCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5241:1: ( ( ( rule__RuleCall__Group_1__0 )? ) )
            // InternalXtext.g:5242:1: ( ( rule__RuleCall__Group_1__0 )? )
            {
            // InternalXtext.g:5242:1: ( ( rule__RuleCall__Group_1__0 )? )
            // InternalXtext.g:5243:2: ( rule__RuleCall__Group_1__0 )?
            {
             before(grammarAccess.getRuleCallAccess().getGroup_1()); 
            // InternalXtext.g:5244:2: ( rule__RuleCall__Group_1__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==34) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalXtext.g:5244:3: rule__RuleCall__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__RuleCall__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleCallAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group__1__Impl"


    // $ANTLR start "rule__RuleCall__Group_1__0"
    // InternalXtext.g:5253:1: rule__RuleCall__Group_1__0 : rule__RuleCall__Group_1__0__Impl rule__RuleCall__Group_1__1 ;
    public final void rule__RuleCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5257:1: ( rule__RuleCall__Group_1__0__Impl rule__RuleCall__Group_1__1 )
            // InternalXtext.g:5258:2: rule__RuleCall__Group_1__0__Impl rule__RuleCall__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__RuleCall__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__0"


    // $ANTLR start "rule__RuleCall__Group_1__0__Impl"
    // InternalXtext.g:5265:1: rule__RuleCall__Group_1__0__Impl : ( '<' ) ;
    public final void rule__RuleCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5269:1: ( ( '<' ) )
            // InternalXtext.g:5270:1: ( '<' )
            {
            // InternalXtext.g:5270:1: ( '<' )
            // InternalXtext.g:5271:2: '<'
            {
             before(grammarAccess.getRuleCallAccess().getLessThanSignKeyword_1_0()); 
            match(input,34,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRuleCallAccess().getLessThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__0__Impl"


    // $ANTLR start "rule__RuleCall__Group_1__1"
    // InternalXtext.g:5280:1: rule__RuleCall__Group_1__1 : rule__RuleCall__Group_1__1__Impl rule__RuleCall__Group_1__2 ;
    public final void rule__RuleCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5284:1: ( rule__RuleCall__Group_1__1__Impl rule__RuleCall__Group_1__2 )
            // InternalXtext.g:5285:2: rule__RuleCall__Group_1__1__Impl rule__RuleCall__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__RuleCall__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__1"


    // $ANTLR start "rule__RuleCall__Group_1__1__Impl"
    // InternalXtext.g:5292:1: rule__RuleCall__Group_1__1__Impl : ( ( rule__RuleCall__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__RuleCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5296:1: ( ( ( rule__RuleCall__ArgumentsAssignment_1_1 ) ) )
            // InternalXtext.g:5297:1: ( ( rule__RuleCall__ArgumentsAssignment_1_1 ) )
            {
            // InternalXtext.g:5297:1: ( ( rule__RuleCall__ArgumentsAssignment_1_1 ) )
            // InternalXtext.g:5298:2: ( rule__RuleCall__ArgumentsAssignment_1_1 )
            {
             before(grammarAccess.getRuleCallAccess().getArgumentsAssignment_1_1()); 
            // InternalXtext.g:5299:2: ( rule__RuleCall__ArgumentsAssignment_1_1 )
            // InternalXtext.g:5299:3: rule__RuleCall__ArgumentsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__ArgumentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleCallAccess().getArgumentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__1__Impl"


    // $ANTLR start "rule__RuleCall__Group_1__2"
    // InternalXtext.g:5307:1: rule__RuleCall__Group_1__2 : rule__RuleCall__Group_1__2__Impl rule__RuleCall__Group_1__3 ;
    public final void rule__RuleCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5311:1: ( rule__RuleCall__Group_1__2__Impl rule__RuleCall__Group_1__3 )
            // InternalXtext.g:5312:2: rule__RuleCall__Group_1__2__Impl rule__RuleCall__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__RuleCall__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__2"


    // $ANTLR start "rule__RuleCall__Group_1__2__Impl"
    // InternalXtext.g:5319:1: rule__RuleCall__Group_1__2__Impl : ( ( rule__RuleCall__Group_1_2__0 )* ) ;
    public final void rule__RuleCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5323:1: ( ( ( rule__RuleCall__Group_1_2__0 )* ) )
            // InternalXtext.g:5324:1: ( ( rule__RuleCall__Group_1_2__0 )* )
            {
            // InternalXtext.g:5324:1: ( ( rule__RuleCall__Group_1_2__0 )* )
            // InternalXtext.g:5325:2: ( rule__RuleCall__Group_1_2__0 )*
            {
             before(grammarAccess.getRuleCallAccess().getGroup_1_2()); 
            // InternalXtext.g:5326:2: ( rule__RuleCall__Group_1_2__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==22) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalXtext.g:5326:3: rule__RuleCall__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__RuleCall__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getRuleCallAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__2__Impl"


    // $ANTLR start "rule__RuleCall__Group_1__3"
    // InternalXtext.g:5334:1: rule__RuleCall__Group_1__3 : rule__RuleCall__Group_1__3__Impl ;
    public final void rule__RuleCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5338:1: ( rule__RuleCall__Group_1__3__Impl )
            // InternalXtext.g:5339:2: rule__RuleCall__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__3"


    // $ANTLR start "rule__RuleCall__Group_1__3__Impl"
    // InternalXtext.g:5345:1: rule__RuleCall__Group_1__3__Impl : ( '>' ) ;
    public final void rule__RuleCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5349:1: ( ( '>' ) )
            // InternalXtext.g:5350:1: ( '>' )
            {
            // InternalXtext.g:5350:1: ( '>' )
            // InternalXtext.g:5351:2: '>'
            {
             before(grammarAccess.getRuleCallAccess().getGreaterThanSignKeyword_1_3()); 
            match(input,35,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRuleCallAccess().getGreaterThanSignKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__3__Impl"


    // $ANTLR start "rule__RuleCall__Group_1_2__0"
    // InternalXtext.g:5361:1: rule__RuleCall__Group_1_2__0 : rule__RuleCall__Group_1_2__0__Impl rule__RuleCall__Group_1_2__1 ;
    public final void rule__RuleCall__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5365:1: ( rule__RuleCall__Group_1_2__0__Impl rule__RuleCall__Group_1_2__1 )
            // InternalXtext.g:5366:2: rule__RuleCall__Group_1_2__0__Impl rule__RuleCall__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__RuleCall__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1_2__0"


    // $ANTLR start "rule__RuleCall__Group_1_2__0__Impl"
    // InternalXtext.g:5373:1: rule__RuleCall__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__RuleCall__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5377:1: ( ( ',' ) )
            // InternalXtext.g:5378:1: ( ',' )
            {
            // InternalXtext.g:5378:1: ( ',' )
            // InternalXtext.g:5379:2: ','
            {
             before(grammarAccess.getRuleCallAccess().getCommaKeyword_1_2_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRuleCallAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1_2__0__Impl"


    // $ANTLR start "rule__RuleCall__Group_1_2__1"
    // InternalXtext.g:5388:1: rule__RuleCall__Group_1_2__1 : rule__RuleCall__Group_1_2__1__Impl ;
    public final void rule__RuleCall__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5392:1: ( rule__RuleCall__Group_1_2__1__Impl )
            // InternalXtext.g:5393:2: rule__RuleCall__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1_2__1"


    // $ANTLR start "rule__RuleCall__Group_1_2__1__Impl"
    // InternalXtext.g:5399:1: rule__RuleCall__Group_1_2__1__Impl : ( ( rule__RuleCall__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__RuleCall__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5403:1: ( ( ( rule__RuleCall__ArgumentsAssignment_1_2_1 ) ) )
            // InternalXtext.g:5404:1: ( ( rule__RuleCall__ArgumentsAssignment_1_2_1 ) )
            {
            // InternalXtext.g:5404:1: ( ( rule__RuleCall__ArgumentsAssignment_1_2_1 ) )
            // InternalXtext.g:5405:2: ( rule__RuleCall__ArgumentsAssignment_1_2_1 )
            {
             before(grammarAccess.getRuleCallAccess().getArgumentsAssignment_1_2_1()); 
            // InternalXtext.g:5406:2: ( rule__RuleCall__ArgumentsAssignment_1_2_1 )
            // InternalXtext.g:5406:3: rule__RuleCall__ArgumentsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__ArgumentsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleCallAccess().getArgumentsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1_2__1__Impl"


    // $ANTLR start "rule__NamedArgument__Group__0"
    // InternalXtext.g:5415:1: rule__NamedArgument__Group__0 : rule__NamedArgument__Group__0__Impl rule__NamedArgument__Group__1 ;
    public final void rule__NamedArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5419:1: ( rule__NamedArgument__Group__0__Impl rule__NamedArgument__Group__1 )
            // InternalXtext.g:5420:2: rule__NamedArgument__Group__0__Impl rule__NamedArgument__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__NamedArgument__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group__0"


    // $ANTLR start "rule__NamedArgument__Group__0__Impl"
    // InternalXtext.g:5427:1: rule__NamedArgument__Group__0__Impl : ( ( rule__NamedArgument__Group_0__0 )? ) ;
    public final void rule__NamedArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5431:1: ( ( ( rule__NamedArgument__Group_0__0 )? ) )
            // InternalXtext.g:5432:1: ( ( rule__NamedArgument__Group_0__0 )? )
            {
            // InternalXtext.g:5432:1: ( ( rule__NamedArgument__Group_0__0 )? )
            // InternalXtext.g:5433:2: ( rule__NamedArgument__Group_0__0 )?
            {
             before(grammarAccess.getNamedArgumentAccess().getGroup_0()); 
            // InternalXtext.g:5434:2: ( rule__NamedArgument__Group_0__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==15) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // InternalXtext.g:5434:3: rule__NamedArgument__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__NamedArgument__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedArgumentAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group__0__Impl"


    // $ANTLR start "rule__NamedArgument__Group__1"
    // InternalXtext.g:5442:1: rule__NamedArgument__Group__1 : rule__NamedArgument__Group__1__Impl ;
    public final void rule__NamedArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5446:1: ( rule__NamedArgument__Group__1__Impl )
            // InternalXtext.g:5447:2: rule__NamedArgument__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group__1"


    // $ANTLR start "rule__NamedArgument__Group__1__Impl"
    // InternalXtext.g:5453:1: rule__NamedArgument__Group__1__Impl : ( ( rule__NamedArgument__ValueAssignment_1 ) ) ;
    public final void rule__NamedArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5457:1: ( ( ( rule__NamedArgument__ValueAssignment_1 ) ) )
            // InternalXtext.g:5458:1: ( ( rule__NamedArgument__ValueAssignment_1 ) )
            {
            // InternalXtext.g:5458:1: ( ( rule__NamedArgument__ValueAssignment_1 ) )
            // InternalXtext.g:5459:2: ( rule__NamedArgument__ValueAssignment_1 )
            {
             before(grammarAccess.getNamedArgumentAccess().getValueAssignment_1()); 
            // InternalXtext.g:5460:2: ( rule__NamedArgument__ValueAssignment_1 )
            // InternalXtext.g:5460:3: rule__NamedArgument__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedArgumentAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group__1__Impl"


    // $ANTLR start "rule__NamedArgument__Group_0__0"
    // InternalXtext.g:5469:1: rule__NamedArgument__Group_0__0 : rule__NamedArgument__Group_0__0__Impl rule__NamedArgument__Group_0__1 ;
    public final void rule__NamedArgument__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5473:1: ( rule__NamedArgument__Group_0__0__Impl rule__NamedArgument__Group_0__1 )
            // InternalXtext.g:5474:2: rule__NamedArgument__Group_0__0__Impl rule__NamedArgument__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__NamedArgument__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group_0__0"


    // $ANTLR start "rule__NamedArgument__Group_0__0__Impl"
    // InternalXtext.g:5481:1: rule__NamedArgument__Group_0__0__Impl : ( ( rule__NamedArgument__ParameterAssignment_0_0 ) ) ;
    public final void rule__NamedArgument__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5485:1: ( ( ( rule__NamedArgument__ParameterAssignment_0_0 ) ) )
            // InternalXtext.g:5486:1: ( ( rule__NamedArgument__ParameterAssignment_0_0 ) )
            {
            // InternalXtext.g:5486:1: ( ( rule__NamedArgument__ParameterAssignment_0_0 ) )
            // InternalXtext.g:5487:2: ( rule__NamedArgument__ParameterAssignment_0_0 )
            {
             before(grammarAccess.getNamedArgumentAccess().getParameterAssignment_0_0()); 
            // InternalXtext.g:5488:2: ( rule__NamedArgument__ParameterAssignment_0_0 )
            // InternalXtext.g:5488:3: rule__NamedArgument__ParameterAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__ParameterAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNamedArgumentAccess().getParameterAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group_0__0__Impl"


    // $ANTLR start "rule__NamedArgument__Group_0__1"
    // InternalXtext.g:5496:1: rule__NamedArgument__Group_0__1 : rule__NamedArgument__Group_0__1__Impl ;
    public final void rule__NamedArgument__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5500:1: ( rule__NamedArgument__Group_0__1__Impl )
            // InternalXtext.g:5501:2: rule__NamedArgument__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group_0__1"


    // $ANTLR start "rule__NamedArgument__Group_0__1__Impl"
    // InternalXtext.g:5507:1: rule__NamedArgument__Group_0__1__Impl : ( ( rule__NamedArgument__CalledByNameAssignment_0_1 ) ) ;
    public final void rule__NamedArgument__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5511:1: ( ( ( rule__NamedArgument__CalledByNameAssignment_0_1 ) ) )
            // InternalXtext.g:5512:1: ( ( rule__NamedArgument__CalledByNameAssignment_0_1 ) )
            {
            // InternalXtext.g:5512:1: ( ( rule__NamedArgument__CalledByNameAssignment_0_1 ) )
            // InternalXtext.g:5513:2: ( rule__NamedArgument__CalledByNameAssignment_0_1 )
            {
             before(grammarAccess.getNamedArgumentAccess().getCalledByNameAssignment_0_1()); 
            // InternalXtext.g:5514:2: ( rule__NamedArgument__CalledByNameAssignment_0_1 )
            // InternalXtext.g:5514:3: rule__NamedArgument__CalledByNameAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__CalledByNameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedArgumentAccess().getCalledByNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group_0__1__Impl"


    // $ANTLR start "rule__LiteralCondition__Group__0"
    // InternalXtext.g:5523:1: rule__LiteralCondition__Group__0 : rule__LiteralCondition__Group__0__Impl rule__LiteralCondition__Group__1 ;
    public final void rule__LiteralCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5527:1: ( rule__LiteralCondition__Group__0__Impl rule__LiteralCondition__Group__1 )
            // InternalXtext.g:5528:2: rule__LiteralCondition__Group__0__Impl rule__LiteralCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__LiteralCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralCondition__Group__0"


    // $ANTLR start "rule__LiteralCondition__Group__0__Impl"
    // InternalXtext.g:5535:1: rule__LiteralCondition__Group__0__Impl : ( () ) ;
    public final void rule__LiteralCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5539:1: ( ( () ) )
            // InternalXtext.g:5540:1: ( () )
            {
            // InternalXtext.g:5540:1: ( () )
            // InternalXtext.g:5541:2: ()
            {
             before(grammarAccess.getLiteralConditionAccess().getLiteralConditionAction_0()); 
            // InternalXtext.g:5542:2: ()
            // InternalXtext.g:5542:3: 
            {
            }

             after(grammarAccess.getLiteralConditionAccess().getLiteralConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralCondition__Group__0__Impl"


    // $ANTLR start "rule__LiteralCondition__Group__1"
    // InternalXtext.g:5550:1: rule__LiteralCondition__Group__1 : rule__LiteralCondition__Group__1__Impl ;
    public final void rule__LiteralCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5554:1: ( rule__LiteralCondition__Group__1__Impl )
            // InternalXtext.g:5555:2: rule__LiteralCondition__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralCondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralCondition__Group__1"


    // $ANTLR start "rule__LiteralCondition__Group__1__Impl"
    // InternalXtext.g:5561:1: rule__LiteralCondition__Group__1__Impl : ( ( rule__LiteralCondition__Alternatives_1 ) ) ;
    public final void rule__LiteralCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5565:1: ( ( ( rule__LiteralCondition__Alternatives_1 ) ) )
            // InternalXtext.g:5566:1: ( ( rule__LiteralCondition__Alternatives_1 ) )
            {
            // InternalXtext.g:5566:1: ( ( rule__LiteralCondition__Alternatives_1 ) )
            // InternalXtext.g:5567:2: ( rule__LiteralCondition__Alternatives_1 )
            {
             before(grammarAccess.getLiteralConditionAccess().getAlternatives_1()); 
            // InternalXtext.g:5568:2: ( rule__LiteralCondition__Alternatives_1 )
            // InternalXtext.g:5568:3: rule__LiteralCondition__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralCondition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralConditionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralCondition__Group__1__Impl"


    // $ANTLR start "rule__Disjunction__Group__0"
    // InternalXtext.g:5577:1: rule__Disjunction__Group__0 : rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 ;
    public final void rule__Disjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5581:1: ( rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 )
            // InternalXtext.g:5582:2: rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__Disjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Disjunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__0"


    // $ANTLR start "rule__Disjunction__Group__0__Impl"
    // InternalXtext.g:5589:1: rule__Disjunction__Group__0__Impl : ( ruleConjunction ) ;
    public final void rule__Disjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5593:1: ( ( ruleConjunction ) )
            // InternalXtext.g:5594:1: ( ruleConjunction )
            {
            // InternalXtext.g:5594:1: ( ruleConjunction )
            // InternalXtext.g:5595:2: ruleConjunction
            {
             before(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__0__Impl"


    // $ANTLR start "rule__Disjunction__Group__1"
    // InternalXtext.g:5604:1: rule__Disjunction__Group__1 : rule__Disjunction__Group__1__Impl ;
    public final void rule__Disjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5608:1: ( rule__Disjunction__Group__1__Impl )
            // InternalXtext.g:5609:2: rule__Disjunction__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Disjunction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__1"


    // $ANTLR start "rule__Disjunction__Group__1__Impl"
    // InternalXtext.g:5615:1: rule__Disjunction__Group__1__Impl : ( ( rule__Disjunction__Group_1__0 )* ) ;
    public final void rule__Disjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5619:1: ( ( ( rule__Disjunction__Group_1__0 )* ) )
            // InternalXtext.g:5620:1: ( ( rule__Disjunction__Group_1__0 )* )
            {
            // InternalXtext.g:5620:1: ( ( rule__Disjunction__Group_1__0 )* )
            // InternalXtext.g:5621:2: ( rule__Disjunction__Group_1__0 )*
            {
             before(grammarAccess.getDisjunctionAccess().getGroup_1()); 
            // InternalXtext.g:5622:2: ( rule__Disjunction__Group_1__0 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==37) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalXtext.g:5622:3: rule__Disjunction__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__Disjunction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             after(grammarAccess.getDisjunctionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_1__0"
    // InternalXtext.g:5631:1: rule__Disjunction__Group_1__0 : rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1 ;
    public final void rule__Disjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5635:1: ( rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1 )
            // InternalXtext.g:5636:2: rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__Disjunction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Disjunction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__0"


    // $ANTLR start "rule__Disjunction__Group_1__0__Impl"
    // InternalXtext.g:5643:1: rule__Disjunction__Group_1__0__Impl : ( () ) ;
    public final void rule__Disjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5647:1: ( ( () ) )
            // InternalXtext.g:5648:1: ( () )
            {
            // InternalXtext.g:5648:1: ( () )
            // InternalXtext.g:5649:2: ()
            {
             before(grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0()); 
            // InternalXtext.g:5650:2: ()
            // InternalXtext.g:5650:3: 
            {
            }

             after(grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__0__Impl"


    // $ANTLR start "rule__Disjunction__Group_1__1"
    // InternalXtext.g:5658:1: rule__Disjunction__Group_1__1 : rule__Disjunction__Group_1__1__Impl rule__Disjunction__Group_1__2 ;
    public final void rule__Disjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5662:1: ( rule__Disjunction__Group_1__1__Impl rule__Disjunction__Group_1__2 )
            // InternalXtext.g:5663:2: rule__Disjunction__Group_1__1__Impl rule__Disjunction__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__Disjunction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Disjunction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__1"


    // $ANTLR start "rule__Disjunction__Group_1__1__Impl"
    // InternalXtext.g:5670:1: rule__Disjunction__Group_1__1__Impl : ( '|' ) ;
    public final void rule__Disjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5674:1: ( ( '|' ) )
            // InternalXtext.g:5675:1: ( '|' )
            {
            // InternalXtext.g:5675:1: ( '|' )
            // InternalXtext.g:5676:2: '|'
            {
             before(grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_1_1()); 
            match(input,37,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_1__2"
    // InternalXtext.g:5685:1: rule__Disjunction__Group_1__2 : rule__Disjunction__Group_1__2__Impl ;
    public final void rule__Disjunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5689:1: ( rule__Disjunction__Group_1__2__Impl )
            // InternalXtext.g:5690:2: rule__Disjunction__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Disjunction__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__2"


    // $ANTLR start "rule__Disjunction__Group_1__2__Impl"
    // InternalXtext.g:5696:1: rule__Disjunction__Group_1__2__Impl : ( ( rule__Disjunction__RightAssignment_1_2 ) ) ;
    public final void rule__Disjunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5700:1: ( ( ( rule__Disjunction__RightAssignment_1_2 ) ) )
            // InternalXtext.g:5701:1: ( ( rule__Disjunction__RightAssignment_1_2 ) )
            {
            // InternalXtext.g:5701:1: ( ( rule__Disjunction__RightAssignment_1_2 ) )
            // InternalXtext.g:5702:2: ( rule__Disjunction__RightAssignment_1_2 )
            {
             before(grammarAccess.getDisjunctionAccess().getRightAssignment_1_2()); 
            // InternalXtext.g:5703:2: ( rule__Disjunction__RightAssignment_1_2 )
            // InternalXtext.g:5703:3: rule__Disjunction__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Disjunction__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDisjunctionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__2__Impl"


    // $ANTLR start "rule__Conjunction__Group__0"
    // InternalXtext.g:5712:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5716:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // InternalXtext.g:5717:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__Conjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Conjunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__0"


    // $ANTLR start "rule__Conjunction__Group__0__Impl"
    // InternalXtext.g:5724:1: rule__Conjunction__Group__0__Impl : ( ruleNegation ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5728:1: ( ( ruleNegation ) )
            // InternalXtext.g:5729:1: ( ruleNegation )
            {
            // InternalXtext.g:5729:1: ( ruleNegation )
            // InternalXtext.g:5730:2: ruleNegation
            {
             before(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__0__Impl"


    // $ANTLR start "rule__Conjunction__Group__1"
    // InternalXtext.g:5739:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5743:1: ( rule__Conjunction__Group__1__Impl )
            // InternalXtext.g:5744:2: rule__Conjunction__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Conjunction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__1"


    // $ANTLR start "rule__Conjunction__Group__1__Impl"
    // InternalXtext.g:5750:1: rule__Conjunction__Group__1__Impl : ( ( rule__Conjunction__Group_1__0 )* ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5754:1: ( ( ( rule__Conjunction__Group_1__0 )* ) )
            // InternalXtext.g:5755:1: ( ( rule__Conjunction__Group_1__0 )* )
            {
            // InternalXtext.g:5755:1: ( ( rule__Conjunction__Group_1__0 )* )
            // InternalXtext.g:5756:2: ( rule__Conjunction__Group_1__0 )*
            {
             before(grammarAccess.getConjunctionAccess().getGroup_1()); 
            // InternalXtext.g:5757:2: ( rule__Conjunction__Group_1__0 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==38) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalXtext.g:5757:3: rule__Conjunction__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_34);
            	    rule__Conjunction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getConjunctionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__1__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__0"
    // InternalXtext.g:5766:1: rule__Conjunction__Group_1__0 : rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 ;
    public final void rule__Conjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5770:1: ( rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 )
            // InternalXtext.g:5771:2: rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__Conjunction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Conjunction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__0"


    // $ANTLR start "rule__Conjunction__Group_1__0__Impl"
    // InternalXtext.g:5778:1: rule__Conjunction__Group_1__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5782:1: ( ( () ) )
            // InternalXtext.g:5783:1: ( () )
            {
            // InternalXtext.g:5783:1: ( () )
            // InternalXtext.g:5784:2: ()
            {
             before(grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0()); 
            // InternalXtext.g:5785:2: ()
            // InternalXtext.g:5785:3: 
            {
            }

             after(grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__0__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__1"
    // InternalXtext.g:5793:1: rule__Conjunction__Group_1__1 : rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 ;
    public final void rule__Conjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5797:1: ( rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 )
            // InternalXtext.g:5798:2: rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__Conjunction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Conjunction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__1"


    // $ANTLR start "rule__Conjunction__Group_1__1__Impl"
    // InternalXtext.g:5805:1: rule__Conjunction__Group_1__1__Impl : ( '&' ) ;
    public final void rule__Conjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5809:1: ( ( '&' ) )
            // InternalXtext.g:5810:1: ( '&' )
            {
            // InternalXtext.g:5810:1: ( '&' )
            // InternalXtext.g:5811:2: '&'
            {
             before(grammarAccess.getConjunctionAccess().getAmpersandKeyword_1_1()); 
            match(input,38,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getConjunctionAccess().getAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__1__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__2"
    // InternalXtext.g:5820:1: rule__Conjunction__Group_1__2 : rule__Conjunction__Group_1__2__Impl ;
    public final void rule__Conjunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5824:1: ( rule__Conjunction__Group_1__2__Impl )
            // InternalXtext.g:5825:2: rule__Conjunction__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Conjunction__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__2"


    // $ANTLR start "rule__Conjunction__Group_1__2__Impl"
    // InternalXtext.g:5831:1: rule__Conjunction__Group_1__2__Impl : ( ( rule__Conjunction__RightAssignment_1_2 ) ) ;
    public final void rule__Conjunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5835:1: ( ( ( rule__Conjunction__RightAssignment_1_2 ) ) )
            // InternalXtext.g:5836:1: ( ( rule__Conjunction__RightAssignment_1_2 ) )
            {
            // InternalXtext.g:5836:1: ( ( rule__Conjunction__RightAssignment_1_2 ) )
            // InternalXtext.g:5837:2: ( rule__Conjunction__RightAssignment_1_2 )
            {
             before(grammarAccess.getConjunctionAccess().getRightAssignment_1_2()); 
            // InternalXtext.g:5838:2: ( rule__Conjunction__RightAssignment_1_2 )
            // InternalXtext.g:5838:3: rule__Conjunction__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Conjunction__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__2__Impl"


    // $ANTLR start "rule__Negation__Group_1__0"
    // InternalXtext.g:5847:1: rule__Negation__Group_1__0 : rule__Negation__Group_1__0__Impl rule__Negation__Group_1__1 ;
    public final void rule__Negation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5851:1: ( rule__Negation__Group_1__0__Impl rule__Negation__Group_1__1 )
            // InternalXtext.g:5852:2: rule__Negation__Group_1__0__Impl rule__Negation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__Negation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Negation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_1__0"


    // $ANTLR start "rule__Negation__Group_1__0__Impl"
    // InternalXtext.g:5859:1: rule__Negation__Group_1__0__Impl : ( () ) ;
    public final void rule__Negation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5863:1: ( ( () ) )
            // InternalXtext.g:5864:1: ( () )
            {
            // InternalXtext.g:5864:1: ( () )
            // InternalXtext.g:5865:2: ()
            {
             before(grammarAccess.getNegationAccess().getNegationAction_1_0()); 
            // InternalXtext.g:5866:2: ()
            // InternalXtext.g:5866:3: 
            {
            }

             after(grammarAccess.getNegationAccess().getNegationAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_1__0__Impl"


    // $ANTLR start "rule__Negation__Group_1__1"
    // InternalXtext.g:5874:1: rule__Negation__Group_1__1 : rule__Negation__Group_1__1__Impl rule__Negation__Group_1__2 ;
    public final void rule__Negation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5878:1: ( rule__Negation__Group_1__1__Impl rule__Negation__Group_1__2 )
            // InternalXtext.g:5879:2: rule__Negation__Group_1__1__Impl rule__Negation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__Negation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Negation__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_1__1"


    // $ANTLR start "rule__Negation__Group_1__1__Impl"
    // InternalXtext.g:5886:1: rule__Negation__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Negation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5890:1: ( ( '!' ) )
            // InternalXtext.g:5891:1: ( '!' )
            {
            // InternalXtext.g:5891:1: ( '!' )
            // InternalXtext.g:5892:2: '!'
            {
             before(grammarAccess.getNegationAccess().getExclamationMarkKeyword_1_1()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getNegationAccess().getExclamationMarkKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_1__1__Impl"


    // $ANTLR start "rule__Negation__Group_1__2"
    // InternalXtext.g:5901:1: rule__Negation__Group_1__2 : rule__Negation__Group_1__2__Impl ;
    public final void rule__Negation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5905:1: ( rule__Negation__Group_1__2__Impl )
            // InternalXtext.g:5906:2: rule__Negation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Negation__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_1__2"


    // $ANTLR start "rule__Negation__Group_1__2__Impl"
    // InternalXtext.g:5912:1: rule__Negation__Group_1__2__Impl : ( ( rule__Negation__ValueAssignment_1_2 ) ) ;
    public final void rule__Negation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5916:1: ( ( ( rule__Negation__ValueAssignment_1_2 ) ) )
            // InternalXtext.g:5917:1: ( ( rule__Negation__ValueAssignment_1_2 ) )
            {
            // InternalXtext.g:5917:1: ( ( rule__Negation__ValueAssignment_1_2 ) )
            // InternalXtext.g:5918:2: ( rule__Negation__ValueAssignment_1_2 )
            {
             before(grammarAccess.getNegationAccess().getValueAssignment_1_2()); 
            // InternalXtext.g:5919:2: ( rule__Negation__ValueAssignment_1_2 )
            // InternalXtext.g:5919:3: rule__Negation__ValueAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Negation__ValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getValueAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_1__2__Impl"


    // $ANTLR start "rule__ParenthesizedCondition__Group__0"
    // InternalXtext.g:5928:1: rule__ParenthesizedCondition__Group__0 : rule__ParenthesizedCondition__Group__0__Impl rule__ParenthesizedCondition__Group__1 ;
    public final void rule__ParenthesizedCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5932:1: ( rule__ParenthesizedCondition__Group__0__Impl rule__ParenthesizedCondition__Group__1 )
            // InternalXtext.g:5933:2: rule__ParenthesizedCondition__Group__0__Impl rule__ParenthesizedCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__ParenthesizedCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedCondition__Group__0"


    // $ANTLR start "rule__ParenthesizedCondition__Group__0__Impl"
    // InternalXtext.g:5940:1: rule__ParenthesizedCondition__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5944:1: ( ( '(' ) )
            // InternalXtext.g:5945:1: ( '(' )
            {
            // InternalXtext.g:5945:1: ( '(' )
            // InternalXtext.g:5946:2: '('
            {
             before(grammarAccess.getParenthesizedConditionAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedConditionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedCondition__Group__0__Impl"


    // $ANTLR start "rule__ParenthesizedCondition__Group__1"
    // InternalXtext.g:5955:1: rule__ParenthesizedCondition__Group__1 : rule__ParenthesizedCondition__Group__1__Impl rule__ParenthesizedCondition__Group__2 ;
    public final void rule__ParenthesizedCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5959:1: ( rule__ParenthesizedCondition__Group__1__Impl rule__ParenthesizedCondition__Group__2 )
            // InternalXtext.g:5960:2: rule__ParenthesizedCondition__Group__1__Impl rule__ParenthesizedCondition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__ParenthesizedCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedCondition__Group__1"


    // $ANTLR start "rule__ParenthesizedCondition__Group__1__Impl"
    // InternalXtext.g:5967:1: rule__ParenthesizedCondition__Group__1__Impl : ( ruleDisjunction ) ;
    public final void rule__ParenthesizedCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5971:1: ( ( ruleDisjunction ) )
            // InternalXtext.g:5972:1: ( ruleDisjunction )
            {
            // InternalXtext.g:5972:1: ( ruleDisjunction )
            // InternalXtext.g:5973:2: ruleDisjunction
            {
             before(grammarAccess.getParenthesizedConditionAccess().getDisjunctionParserRuleCall_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunction();

            state._fsp--;

             after(grammarAccess.getParenthesizedConditionAccess().getDisjunctionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedCondition__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedCondition__Group__2"
    // InternalXtext.g:5982:1: rule__ParenthesizedCondition__Group__2 : rule__ParenthesizedCondition__Group__2__Impl ;
    public final void rule__ParenthesizedCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5986:1: ( rule__ParenthesizedCondition__Group__2__Impl )
            // InternalXtext.g:5987:2: rule__ParenthesizedCondition__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedCondition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedCondition__Group__2"


    // $ANTLR start "rule__ParenthesizedCondition__Group__2__Impl"
    // InternalXtext.g:5993:1: rule__ParenthesizedCondition__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:5997:1: ( ( ')' ) )
            // InternalXtext.g:5998:1: ( ')' )
            {
            // InternalXtext.g:5998:1: ( ')' )
            // InternalXtext.g:5999:2: ')'
            {
             before(grammarAccess.getParenthesizedConditionAccess().getRightParenthesisKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedConditionAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedCondition__Group__2__Impl"


    // $ANTLR start "rule__RuleID__Group__0"
    // InternalXtext.g:6009:1: rule__RuleID__Group__0 : rule__RuleID__Group__0__Impl rule__RuleID__Group__1 ;
    public final void rule__RuleID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6013:1: ( rule__RuleID__Group__0__Impl rule__RuleID__Group__1 )
            // InternalXtext.g:6014:2: rule__RuleID__Group__0__Impl rule__RuleID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__RuleID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group__0"


    // $ANTLR start "rule__RuleID__Group__0__Impl"
    // InternalXtext.g:6021:1: rule__RuleID__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__RuleID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6025:1: ( ( ruleValidID ) )
            // InternalXtext.g:6026:1: ( ruleValidID )
            {
            // InternalXtext.g:6026:1: ( ruleValidID )
            // InternalXtext.g:6027:2: ruleValidID
            {
             before(grammarAccess.getRuleIDAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getRuleIDAccess().getValidIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group__0__Impl"


    // $ANTLR start "rule__RuleID__Group__1"
    // InternalXtext.g:6036:1: rule__RuleID__Group__1 : rule__RuleID__Group__1__Impl ;
    public final void rule__RuleID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6040:1: ( rule__RuleID__Group__1__Impl )
            // InternalXtext.g:6041:2: rule__RuleID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group__1"


    // $ANTLR start "rule__RuleID__Group__1__Impl"
    // InternalXtext.g:6047:1: rule__RuleID__Group__1__Impl : ( ( rule__RuleID__Group_1__0 )* ) ;
    public final void rule__RuleID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6051:1: ( ( ( rule__RuleID__Group_1__0 )* ) )
            // InternalXtext.g:6052:1: ( ( rule__RuleID__Group_1__0 )* )
            {
            // InternalXtext.g:6052:1: ( ( rule__RuleID__Group_1__0 )* )
            // InternalXtext.g:6053:2: ( rule__RuleID__Group_1__0 )*
            {
             before(grammarAccess.getRuleIDAccess().getGroup_1()); 
            // InternalXtext.g:6054:2: ( rule__RuleID__Group_1__0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==36) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalXtext.g:6054:3: rule__RuleID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_43);
            	    rule__RuleID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

             after(grammarAccess.getRuleIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group__1__Impl"


    // $ANTLR start "rule__RuleID__Group_1__0"
    // InternalXtext.g:6063:1: rule__RuleID__Group_1__0 : rule__RuleID__Group_1__0__Impl rule__RuleID__Group_1__1 ;
    public final void rule__RuleID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6067:1: ( rule__RuleID__Group_1__0__Impl rule__RuleID__Group_1__1 )
            // InternalXtext.g:6068:2: rule__RuleID__Group_1__0__Impl rule__RuleID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__RuleID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleID__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group_1__0"


    // $ANTLR start "rule__RuleID__Group_1__0__Impl"
    // InternalXtext.g:6075:1: rule__RuleID__Group_1__0__Impl : ( '::' ) ;
    public final void rule__RuleID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6079:1: ( ( '::' ) )
            // InternalXtext.g:6080:1: ( '::' )
            {
            // InternalXtext.g:6080:1: ( '::' )
            // InternalXtext.g:6081:2: '::'
            {
             before(grammarAccess.getRuleIDAccess().getColonColonKeyword_1_0()); 
            match(input,36,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRuleIDAccess().getColonColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group_1__0__Impl"


    // $ANTLR start "rule__RuleID__Group_1__1"
    // InternalXtext.g:6090:1: rule__RuleID__Group_1__1 : rule__RuleID__Group_1__1__Impl ;
    public final void rule__RuleID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6094:1: ( rule__RuleID__Group_1__1__Impl )
            // InternalXtext.g:6095:2: rule__RuleID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleID__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group_1__1"


    // $ANTLR start "rule__RuleID__Group_1__1__Impl"
    // InternalXtext.g:6101:1: rule__RuleID__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__RuleID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6105:1: ( ( ruleValidID ) )
            // InternalXtext.g:6106:1: ( ruleValidID )
            {
            // InternalXtext.g:6106:1: ( ruleValidID )
            // InternalXtext.g:6107:2: ruleValidID
            {
             before(grammarAccess.getRuleIDAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getRuleIDAccess().getValidIDParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group_1__1__Impl"


    // $ANTLR start "rule__PredicatedKeyword__Group__0"
    // InternalXtext.g:6117:1: rule__PredicatedKeyword__Group__0 : rule__PredicatedKeyword__Group__0__Impl rule__PredicatedKeyword__Group__1 ;
    public final void rule__PredicatedKeyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6121:1: ( rule__PredicatedKeyword__Group__0__Impl rule__PredicatedKeyword__Group__1 )
            // InternalXtext.g:6122:2: rule__PredicatedKeyword__Group__0__Impl rule__PredicatedKeyword__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__PredicatedKeyword__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedKeyword__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedKeyword__Group__0"


    // $ANTLR start "rule__PredicatedKeyword__Group__0__Impl"
    // InternalXtext.g:6129:1: rule__PredicatedKeyword__Group__0__Impl : ( ( rule__PredicatedKeyword__Alternatives_0 ) ) ;
    public final void rule__PredicatedKeyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6133:1: ( ( ( rule__PredicatedKeyword__Alternatives_0 ) ) )
            // InternalXtext.g:6134:1: ( ( rule__PredicatedKeyword__Alternatives_0 ) )
            {
            // InternalXtext.g:6134:1: ( ( rule__PredicatedKeyword__Alternatives_0 ) )
            // InternalXtext.g:6135:2: ( rule__PredicatedKeyword__Alternatives_0 )
            {
             before(grammarAccess.getPredicatedKeywordAccess().getAlternatives_0()); 
            // InternalXtext.g:6136:2: ( rule__PredicatedKeyword__Alternatives_0 )
            // InternalXtext.g:6136:3: rule__PredicatedKeyword__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedKeyword__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedKeywordAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedKeyword__Group__0__Impl"


    // $ANTLR start "rule__PredicatedKeyword__Group__1"
    // InternalXtext.g:6144:1: rule__PredicatedKeyword__Group__1 : rule__PredicatedKeyword__Group__1__Impl ;
    public final void rule__PredicatedKeyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6148:1: ( rule__PredicatedKeyword__Group__1__Impl )
            // InternalXtext.g:6149:2: rule__PredicatedKeyword__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedKeyword__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedKeyword__Group__1"


    // $ANTLR start "rule__PredicatedKeyword__Group__1__Impl"
    // InternalXtext.g:6155:1: rule__PredicatedKeyword__Group__1__Impl : ( ( rule__PredicatedKeyword__ValueAssignment_1 ) ) ;
    public final void rule__PredicatedKeyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6159:1: ( ( ( rule__PredicatedKeyword__ValueAssignment_1 ) ) )
            // InternalXtext.g:6160:1: ( ( rule__PredicatedKeyword__ValueAssignment_1 ) )
            {
            // InternalXtext.g:6160:1: ( ( rule__PredicatedKeyword__ValueAssignment_1 ) )
            // InternalXtext.g:6161:2: ( rule__PredicatedKeyword__ValueAssignment_1 )
            {
             before(grammarAccess.getPredicatedKeywordAccess().getValueAssignment_1()); 
            // InternalXtext.g:6162:2: ( rule__PredicatedKeyword__ValueAssignment_1 )
            // InternalXtext.g:6162:3: rule__PredicatedKeyword__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedKeyword__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedKeywordAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedKeyword__Group__1__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group__0"
    // InternalXtext.g:6171:1: rule__PredicatedRuleCall__Group__0 : rule__PredicatedRuleCall__Group__0__Impl rule__PredicatedRuleCall__Group__1 ;
    public final void rule__PredicatedRuleCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6175:1: ( rule__PredicatedRuleCall__Group__0__Impl rule__PredicatedRuleCall__Group__1 )
            // InternalXtext.g:6176:2: rule__PredicatedRuleCall__Group__0__Impl rule__PredicatedRuleCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__PredicatedRuleCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group__0"


    // $ANTLR start "rule__PredicatedRuleCall__Group__0__Impl"
    // InternalXtext.g:6183:1: rule__PredicatedRuleCall__Group__0__Impl : ( ( rule__PredicatedRuleCall__Alternatives_0 ) ) ;
    public final void rule__PredicatedRuleCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6187:1: ( ( ( rule__PredicatedRuleCall__Alternatives_0 ) ) )
            // InternalXtext.g:6188:1: ( ( rule__PredicatedRuleCall__Alternatives_0 ) )
            {
            // InternalXtext.g:6188:1: ( ( rule__PredicatedRuleCall__Alternatives_0 ) )
            // InternalXtext.g:6189:2: ( rule__PredicatedRuleCall__Alternatives_0 )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getAlternatives_0()); 
            // InternalXtext.g:6190:2: ( rule__PredicatedRuleCall__Alternatives_0 )
            // InternalXtext.g:6190:3: rule__PredicatedRuleCall__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedRuleCallAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group__0__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group__1"
    // InternalXtext.g:6198:1: rule__PredicatedRuleCall__Group__1 : rule__PredicatedRuleCall__Group__1__Impl rule__PredicatedRuleCall__Group__2 ;
    public final void rule__PredicatedRuleCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6202:1: ( rule__PredicatedRuleCall__Group__1__Impl rule__PredicatedRuleCall__Group__2 )
            // InternalXtext.g:6203:2: rule__PredicatedRuleCall__Group__1__Impl rule__PredicatedRuleCall__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__PredicatedRuleCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group__1"


    // $ANTLR start "rule__PredicatedRuleCall__Group__1__Impl"
    // InternalXtext.g:6210:1: rule__PredicatedRuleCall__Group__1__Impl : ( ( rule__PredicatedRuleCall__RuleAssignment_1 ) ) ;
    public final void rule__PredicatedRuleCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6214:1: ( ( ( rule__PredicatedRuleCall__RuleAssignment_1 ) ) )
            // InternalXtext.g:6215:1: ( ( rule__PredicatedRuleCall__RuleAssignment_1 ) )
            {
            // InternalXtext.g:6215:1: ( ( rule__PredicatedRuleCall__RuleAssignment_1 ) )
            // InternalXtext.g:6216:2: ( rule__PredicatedRuleCall__RuleAssignment_1 )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getRuleAssignment_1()); 
            // InternalXtext.g:6217:2: ( rule__PredicatedRuleCall__RuleAssignment_1 )
            // InternalXtext.g:6217:3: rule__PredicatedRuleCall__RuleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__RuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedRuleCallAccess().getRuleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group__1__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group__2"
    // InternalXtext.g:6225:1: rule__PredicatedRuleCall__Group__2 : rule__PredicatedRuleCall__Group__2__Impl ;
    public final void rule__PredicatedRuleCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6229:1: ( rule__PredicatedRuleCall__Group__2__Impl )
            // InternalXtext.g:6230:2: rule__PredicatedRuleCall__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group__2"


    // $ANTLR start "rule__PredicatedRuleCall__Group__2__Impl"
    // InternalXtext.g:6236:1: rule__PredicatedRuleCall__Group__2__Impl : ( ( rule__PredicatedRuleCall__Group_2__0 )? ) ;
    public final void rule__PredicatedRuleCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6240:1: ( ( ( rule__PredicatedRuleCall__Group_2__0 )? ) )
            // InternalXtext.g:6241:1: ( ( rule__PredicatedRuleCall__Group_2__0 )? )
            {
            // InternalXtext.g:6241:1: ( ( rule__PredicatedRuleCall__Group_2__0 )? )
            // InternalXtext.g:6242:2: ( rule__PredicatedRuleCall__Group_2__0 )?
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getGroup_2()); 
            // InternalXtext.g:6243:2: ( rule__PredicatedRuleCall__Group_2__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==34) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalXtext.g:6243:3: rule__PredicatedRuleCall__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PredicatedRuleCall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPredicatedRuleCallAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group__2__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__0"
    // InternalXtext.g:6252:1: rule__PredicatedRuleCall__Group_2__0 : rule__PredicatedRuleCall__Group_2__0__Impl rule__PredicatedRuleCall__Group_2__1 ;
    public final void rule__PredicatedRuleCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6256:1: ( rule__PredicatedRuleCall__Group_2__0__Impl rule__PredicatedRuleCall__Group_2__1 )
            // InternalXtext.g:6257:2: rule__PredicatedRuleCall__Group_2__0__Impl rule__PredicatedRuleCall__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__PredicatedRuleCall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__0"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__0__Impl"
    // InternalXtext.g:6264:1: rule__PredicatedRuleCall__Group_2__0__Impl : ( '<' ) ;
    public final void rule__PredicatedRuleCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6268:1: ( ( '<' ) )
            // InternalXtext.g:6269:1: ( '<' )
            {
            // InternalXtext.g:6269:1: ( '<' )
            // InternalXtext.g:6270:2: '<'
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getLessThanSignKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedRuleCallAccess().getLessThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__0__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__1"
    // InternalXtext.g:6279:1: rule__PredicatedRuleCall__Group_2__1 : rule__PredicatedRuleCall__Group_2__1__Impl rule__PredicatedRuleCall__Group_2__2 ;
    public final void rule__PredicatedRuleCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6283:1: ( rule__PredicatedRuleCall__Group_2__1__Impl rule__PredicatedRuleCall__Group_2__2 )
            // InternalXtext.g:6284:2: rule__PredicatedRuleCall__Group_2__1__Impl rule__PredicatedRuleCall__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__PredicatedRuleCall__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__1"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__1__Impl"
    // InternalXtext.g:6291:1: rule__PredicatedRuleCall__Group_2__1__Impl : ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_1 ) ) ;
    public final void rule__PredicatedRuleCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6295:1: ( ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_1 ) ) )
            // InternalXtext.g:6296:1: ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_1 ) )
            {
            // InternalXtext.g:6296:1: ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_1 ) )
            // InternalXtext.g:6297:2: ( rule__PredicatedRuleCall__ArgumentsAssignment_2_1 )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getArgumentsAssignment_2_1()); 
            // InternalXtext.g:6298:2: ( rule__PredicatedRuleCall__ArgumentsAssignment_2_1 )
            // InternalXtext.g:6298:3: rule__PredicatedRuleCall__ArgumentsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__ArgumentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedRuleCallAccess().getArgumentsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__1__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__2"
    // InternalXtext.g:6306:1: rule__PredicatedRuleCall__Group_2__2 : rule__PredicatedRuleCall__Group_2__2__Impl rule__PredicatedRuleCall__Group_2__3 ;
    public final void rule__PredicatedRuleCall__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6310:1: ( rule__PredicatedRuleCall__Group_2__2__Impl rule__PredicatedRuleCall__Group_2__3 )
            // InternalXtext.g:6311:2: rule__PredicatedRuleCall__Group_2__2__Impl rule__PredicatedRuleCall__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__PredicatedRuleCall__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__2"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__2__Impl"
    // InternalXtext.g:6318:1: rule__PredicatedRuleCall__Group_2__2__Impl : ( ( rule__PredicatedRuleCall__Group_2_2__0 )* ) ;
    public final void rule__PredicatedRuleCall__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6322:1: ( ( ( rule__PredicatedRuleCall__Group_2_2__0 )* ) )
            // InternalXtext.g:6323:1: ( ( rule__PredicatedRuleCall__Group_2_2__0 )* )
            {
            // InternalXtext.g:6323:1: ( ( rule__PredicatedRuleCall__Group_2_2__0 )* )
            // InternalXtext.g:6324:2: ( rule__PredicatedRuleCall__Group_2_2__0 )*
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getGroup_2_2()); 
            // InternalXtext.g:6325:2: ( rule__PredicatedRuleCall__Group_2_2__0 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==22) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalXtext.g:6325:3: rule__PredicatedRuleCall__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__PredicatedRuleCall__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

             after(grammarAccess.getPredicatedRuleCallAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__2__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__3"
    // InternalXtext.g:6333:1: rule__PredicatedRuleCall__Group_2__3 : rule__PredicatedRuleCall__Group_2__3__Impl ;
    public final void rule__PredicatedRuleCall__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6337:1: ( rule__PredicatedRuleCall__Group_2__3__Impl )
            // InternalXtext.g:6338:2: rule__PredicatedRuleCall__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__3"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__3__Impl"
    // InternalXtext.g:6344:1: rule__PredicatedRuleCall__Group_2__3__Impl : ( '>' ) ;
    public final void rule__PredicatedRuleCall__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6348:1: ( ( '>' ) )
            // InternalXtext.g:6349:1: ( '>' )
            {
            // InternalXtext.g:6349:1: ( '>' )
            // InternalXtext.g:6350:2: '>'
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,35,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedRuleCallAccess().getGreaterThanSignKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__3__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2_2__0"
    // InternalXtext.g:6360:1: rule__PredicatedRuleCall__Group_2_2__0 : rule__PredicatedRuleCall__Group_2_2__0__Impl rule__PredicatedRuleCall__Group_2_2__1 ;
    public final void rule__PredicatedRuleCall__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6364:1: ( rule__PredicatedRuleCall__Group_2_2__0__Impl rule__PredicatedRuleCall__Group_2_2__1 )
            // InternalXtext.g:6365:2: rule__PredicatedRuleCall__Group_2_2__0__Impl rule__PredicatedRuleCall__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__PredicatedRuleCall__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2_2__0"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2_2__0__Impl"
    // InternalXtext.g:6372:1: rule__PredicatedRuleCall__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__PredicatedRuleCall__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6376:1: ( ( ',' ) )
            // InternalXtext.g:6377:1: ( ',' )
            {
            // InternalXtext.g:6377:1: ( ',' )
            // InternalXtext.g:6378:2: ','
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getCommaKeyword_2_2_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedRuleCallAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2_2__0__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2_2__1"
    // InternalXtext.g:6387:1: rule__PredicatedRuleCall__Group_2_2__1 : rule__PredicatedRuleCall__Group_2_2__1__Impl ;
    public final void rule__PredicatedRuleCall__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6391:1: ( rule__PredicatedRuleCall__Group_2_2__1__Impl )
            // InternalXtext.g:6392:2: rule__PredicatedRuleCall__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2_2__1"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2_2__1__Impl"
    // InternalXtext.g:6398:1: rule__PredicatedRuleCall__Group_2_2__1__Impl : ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1 ) ) ;
    public final void rule__PredicatedRuleCall__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6402:1: ( ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1 ) ) )
            // InternalXtext.g:6403:1: ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1 ) )
            {
            // InternalXtext.g:6403:1: ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1 ) )
            // InternalXtext.g:6404:2: ( rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1 )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getArgumentsAssignment_2_2_1()); 
            // InternalXtext.g:6405:2: ( rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1 )
            // InternalXtext.g:6405:3: rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedRuleCallAccess().getArgumentsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2_2__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalXtext.g:6414:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6418:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalXtext.g:6419:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalXtext.g:6426:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__Alternatives_0 )? ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6430:1: ( ( ( rule__Assignment__Alternatives_0 )? ) )
            // InternalXtext.g:6431:1: ( ( rule__Assignment__Alternatives_0 )? )
            {
            // InternalXtext.g:6431:1: ( ( rule__Assignment__Alternatives_0 )? )
            // InternalXtext.g:6432:2: ( rule__Assignment__Alternatives_0 )?
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives_0()); 
            // InternalXtext.g:6433:2: ( rule__Assignment__Alternatives_0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==46||LA65_0==52) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalXtext.g:6433:3: rule__Assignment__Alternatives_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Assignment__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssignmentAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalXtext.g:6441:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6445:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalXtext.g:6446:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_45);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalXtext.g:6453:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__FeatureAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6457:1: ( ( ( rule__Assignment__FeatureAssignment_1 ) ) )
            // InternalXtext.g:6458:1: ( ( rule__Assignment__FeatureAssignment_1 ) )
            {
            // InternalXtext.g:6458:1: ( ( rule__Assignment__FeatureAssignment_1 ) )
            // InternalXtext.g:6459:2: ( rule__Assignment__FeatureAssignment_1 )
            {
             before(grammarAccess.getAssignmentAccess().getFeatureAssignment_1()); 
            // InternalXtext.g:6460:2: ( rule__Assignment__FeatureAssignment_1 )
            // InternalXtext.g:6460:3: rule__Assignment__FeatureAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalXtext.g:6468:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6472:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalXtext.g:6473:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__Assignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalXtext.g:6480:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__OperatorAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6484:1: ( ( ( rule__Assignment__OperatorAssignment_2 ) ) )
            // InternalXtext.g:6485:1: ( ( rule__Assignment__OperatorAssignment_2 ) )
            {
            // InternalXtext.g:6485:1: ( ( rule__Assignment__OperatorAssignment_2 ) )
            // InternalXtext.g:6486:2: ( rule__Assignment__OperatorAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getOperatorAssignment_2()); 
            // InternalXtext.g:6487:2: ( rule__Assignment__OperatorAssignment_2 )
            // InternalXtext.g:6487:3: rule__Assignment__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // InternalXtext.g:6495:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6499:1: ( rule__Assignment__Group__3__Impl )
            // InternalXtext.g:6500:2: rule__Assignment__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // InternalXtext.g:6506:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__TerminalAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6510:1: ( ( ( rule__Assignment__TerminalAssignment_3 ) ) )
            // InternalXtext.g:6511:1: ( ( rule__Assignment__TerminalAssignment_3 ) )
            {
            // InternalXtext.g:6511:1: ( ( rule__Assignment__TerminalAssignment_3 ) )
            // InternalXtext.g:6512:2: ( rule__Assignment__TerminalAssignment_3 )
            {
             before(grammarAccess.getAssignmentAccess().getTerminalAssignment_3()); 
            // InternalXtext.g:6513:2: ( rule__Assignment__TerminalAssignment_3 )
            // InternalXtext.g:6513:3: rule__Assignment__TerminalAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__TerminalAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getTerminalAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__ParenthesizedAssignableElement__Group__0"
    // InternalXtext.g:6522:1: rule__ParenthesizedAssignableElement__Group__0 : rule__ParenthesizedAssignableElement__Group__0__Impl rule__ParenthesizedAssignableElement__Group__1 ;
    public final void rule__ParenthesizedAssignableElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6526:1: ( rule__ParenthesizedAssignableElement__Group__0__Impl rule__ParenthesizedAssignableElement__Group__1 )
            // InternalXtext.g:6527:2: rule__ParenthesizedAssignableElement__Group__0__Impl rule__ParenthesizedAssignableElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__ParenthesizedAssignableElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedAssignableElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedAssignableElement__Group__0"


    // $ANTLR start "rule__ParenthesizedAssignableElement__Group__0__Impl"
    // InternalXtext.g:6534:1: rule__ParenthesizedAssignableElement__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedAssignableElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6538:1: ( ( '(' ) )
            // InternalXtext.g:6539:1: ( '(' )
            {
            // InternalXtext.g:6539:1: ( '(' )
            // InternalXtext.g:6540:2: '('
            {
             before(grammarAccess.getParenthesizedAssignableElementAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedAssignableElementAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedAssignableElement__Group__0__Impl"


    // $ANTLR start "rule__ParenthesizedAssignableElement__Group__1"
    // InternalXtext.g:6549:1: rule__ParenthesizedAssignableElement__Group__1 : rule__ParenthesizedAssignableElement__Group__1__Impl rule__ParenthesizedAssignableElement__Group__2 ;
    public final void rule__ParenthesizedAssignableElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6553:1: ( rule__ParenthesizedAssignableElement__Group__1__Impl rule__ParenthesizedAssignableElement__Group__2 )
            // InternalXtext.g:6554:2: rule__ParenthesizedAssignableElement__Group__1__Impl rule__ParenthesizedAssignableElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__ParenthesizedAssignableElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedAssignableElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedAssignableElement__Group__1"


    // $ANTLR start "rule__ParenthesizedAssignableElement__Group__1__Impl"
    // InternalXtext.g:6561:1: rule__ParenthesizedAssignableElement__Group__1__Impl : ( ruleAssignableAlternatives ) ;
    public final void rule__ParenthesizedAssignableElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6565:1: ( ( ruleAssignableAlternatives ) )
            // InternalXtext.g:6566:1: ( ruleAssignableAlternatives )
            {
            // InternalXtext.g:6566:1: ( ruleAssignableAlternatives )
            // InternalXtext.g:6567:2: ruleAssignableAlternatives
            {
             before(grammarAccess.getParenthesizedAssignableElementAccess().getAssignableAlternativesParserRuleCall_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignableAlternatives();

            state._fsp--;

             after(grammarAccess.getParenthesizedAssignableElementAccess().getAssignableAlternativesParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedAssignableElement__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedAssignableElement__Group__2"
    // InternalXtext.g:6576:1: rule__ParenthesizedAssignableElement__Group__2 : rule__ParenthesizedAssignableElement__Group__2__Impl ;
    public final void rule__ParenthesizedAssignableElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6580:1: ( rule__ParenthesizedAssignableElement__Group__2__Impl )
            // InternalXtext.g:6581:2: rule__ParenthesizedAssignableElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedAssignableElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedAssignableElement__Group__2"


    // $ANTLR start "rule__ParenthesizedAssignableElement__Group__2__Impl"
    // InternalXtext.g:6587:1: rule__ParenthesizedAssignableElement__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedAssignableElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6591:1: ( ( ')' ) )
            // InternalXtext.g:6592:1: ( ')' )
            {
            // InternalXtext.g:6592:1: ( ')' )
            // InternalXtext.g:6593:2: ')'
            {
             before(grammarAccess.getParenthesizedAssignableElementAccess().getRightParenthesisKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedAssignableElementAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedAssignableElement__Group__2__Impl"


    // $ANTLR start "rule__AssignableAlternatives__Group__0"
    // InternalXtext.g:6603:1: rule__AssignableAlternatives__Group__0 : rule__AssignableAlternatives__Group__0__Impl rule__AssignableAlternatives__Group__1 ;
    public final void rule__AssignableAlternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6607:1: ( rule__AssignableAlternatives__Group__0__Impl rule__AssignableAlternatives__Group__1 )
            // InternalXtext.g:6608:2: rule__AssignableAlternatives__Group__0__Impl rule__AssignableAlternatives__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__AssignableAlternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group__0"


    // $ANTLR start "rule__AssignableAlternatives__Group__0__Impl"
    // InternalXtext.g:6615:1: rule__AssignableAlternatives__Group__0__Impl : ( ruleAssignableTerminal ) ;
    public final void rule__AssignableAlternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6619:1: ( ( ruleAssignableTerminal ) )
            // InternalXtext.g:6620:1: ( ruleAssignableTerminal )
            {
            // InternalXtext.g:6620:1: ( ruleAssignableTerminal )
            // InternalXtext.g:6621:2: ruleAssignableTerminal
            {
             before(grammarAccess.getAssignableAlternativesAccess().getAssignableTerminalParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignableTerminal();

            state._fsp--;

             after(grammarAccess.getAssignableAlternativesAccess().getAssignableTerminalParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group__0__Impl"


    // $ANTLR start "rule__AssignableAlternatives__Group__1"
    // InternalXtext.g:6630:1: rule__AssignableAlternatives__Group__1 : rule__AssignableAlternatives__Group__1__Impl ;
    public final void rule__AssignableAlternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6634:1: ( rule__AssignableAlternatives__Group__1__Impl )
            // InternalXtext.g:6635:2: rule__AssignableAlternatives__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group__1"


    // $ANTLR start "rule__AssignableAlternatives__Group__1__Impl"
    // InternalXtext.g:6641:1: rule__AssignableAlternatives__Group__1__Impl : ( ( rule__AssignableAlternatives__Group_1__0 )? ) ;
    public final void rule__AssignableAlternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6645:1: ( ( ( rule__AssignableAlternatives__Group_1__0 )? ) )
            // InternalXtext.g:6646:1: ( ( rule__AssignableAlternatives__Group_1__0 )? )
            {
            // InternalXtext.g:6646:1: ( ( rule__AssignableAlternatives__Group_1__0 )? )
            // InternalXtext.g:6647:2: ( rule__AssignableAlternatives__Group_1__0 )?
            {
             before(grammarAccess.getAssignableAlternativesAccess().getGroup_1()); 
            // InternalXtext.g:6648:2: ( rule__AssignableAlternatives__Group_1__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==37) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalXtext.g:6648:3: rule__AssignableAlternatives__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AssignableAlternatives__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssignableAlternativesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group__1__Impl"


    // $ANTLR start "rule__AssignableAlternatives__Group_1__0"
    // InternalXtext.g:6657:1: rule__AssignableAlternatives__Group_1__0 : rule__AssignableAlternatives__Group_1__0__Impl rule__AssignableAlternatives__Group_1__1 ;
    public final void rule__AssignableAlternatives__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6661:1: ( rule__AssignableAlternatives__Group_1__0__Impl rule__AssignableAlternatives__Group_1__1 )
            // InternalXtext.g:6662:2: rule__AssignableAlternatives__Group_1__0__Impl rule__AssignableAlternatives__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__AssignableAlternatives__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group_1__0"


    // $ANTLR start "rule__AssignableAlternatives__Group_1__0__Impl"
    // InternalXtext.g:6669:1: rule__AssignableAlternatives__Group_1__0__Impl : ( () ) ;
    public final void rule__AssignableAlternatives__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6673:1: ( ( () ) )
            // InternalXtext.g:6674:1: ( () )
            {
            // InternalXtext.g:6674:1: ( () )
            // InternalXtext.g:6675:2: ()
            {
             before(grammarAccess.getAssignableAlternativesAccess().getAlternativesElementsAction_1_0()); 
            // InternalXtext.g:6676:2: ()
            // InternalXtext.g:6676:3: 
            {
            }

             after(grammarAccess.getAssignableAlternativesAccess().getAlternativesElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group_1__0__Impl"


    // $ANTLR start "rule__AssignableAlternatives__Group_1__1"
    // InternalXtext.g:6684:1: rule__AssignableAlternatives__Group_1__1 : rule__AssignableAlternatives__Group_1__1__Impl ;
    public final void rule__AssignableAlternatives__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6688:1: ( rule__AssignableAlternatives__Group_1__1__Impl )
            // InternalXtext.g:6689:2: rule__AssignableAlternatives__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group_1__1"


    // $ANTLR start "rule__AssignableAlternatives__Group_1__1__Impl"
    // InternalXtext.g:6695:1: rule__AssignableAlternatives__Group_1__1__Impl : ( ( ( rule__AssignableAlternatives__Group_1_1__0 ) ) ( ( rule__AssignableAlternatives__Group_1_1__0 )* ) ) ;
    public final void rule__AssignableAlternatives__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6699:1: ( ( ( ( rule__AssignableAlternatives__Group_1_1__0 ) ) ( ( rule__AssignableAlternatives__Group_1_1__0 )* ) ) )
            // InternalXtext.g:6700:1: ( ( ( rule__AssignableAlternatives__Group_1_1__0 ) ) ( ( rule__AssignableAlternatives__Group_1_1__0 )* ) )
            {
            // InternalXtext.g:6700:1: ( ( ( rule__AssignableAlternatives__Group_1_1__0 ) ) ( ( rule__AssignableAlternatives__Group_1_1__0 )* ) )
            // InternalXtext.g:6701:2: ( ( rule__AssignableAlternatives__Group_1_1__0 ) ) ( ( rule__AssignableAlternatives__Group_1_1__0 )* )
            {
            // InternalXtext.g:6701:2: ( ( rule__AssignableAlternatives__Group_1_1__0 ) )
            // InternalXtext.g:6702:3: ( rule__AssignableAlternatives__Group_1_1__0 )
            {
             before(grammarAccess.getAssignableAlternativesAccess().getGroup_1_1()); 
            // InternalXtext.g:6703:3: ( rule__AssignableAlternatives__Group_1_1__0 )
            // InternalXtext.g:6703:4: rule__AssignableAlternatives__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__AssignableAlternatives__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignableAlternativesAccess().getGroup_1_1()); 

            }

            // InternalXtext.g:6706:2: ( ( rule__AssignableAlternatives__Group_1_1__0 )* )
            // InternalXtext.g:6707:3: ( rule__AssignableAlternatives__Group_1_1__0 )*
            {
             before(grammarAccess.getAssignableAlternativesAccess().getGroup_1_1()); 
            // InternalXtext.g:6708:3: ( rule__AssignableAlternatives__Group_1_1__0 )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==37) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalXtext.g:6708:4: rule__AssignableAlternatives__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__AssignableAlternatives__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

             after(grammarAccess.getAssignableAlternativesAccess().getGroup_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group_1__1__Impl"


    // $ANTLR start "rule__AssignableAlternatives__Group_1_1__0"
    // InternalXtext.g:6718:1: rule__AssignableAlternatives__Group_1_1__0 : rule__AssignableAlternatives__Group_1_1__0__Impl rule__AssignableAlternatives__Group_1_1__1 ;
    public final void rule__AssignableAlternatives__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6722:1: ( rule__AssignableAlternatives__Group_1_1__0__Impl rule__AssignableAlternatives__Group_1_1__1 )
            // InternalXtext.g:6723:2: rule__AssignableAlternatives__Group_1_1__0__Impl rule__AssignableAlternatives__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__AssignableAlternatives__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group_1_1__0"


    // $ANTLR start "rule__AssignableAlternatives__Group_1_1__0__Impl"
    // InternalXtext.g:6730:1: rule__AssignableAlternatives__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__AssignableAlternatives__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6734:1: ( ( '|' ) )
            // InternalXtext.g:6735:1: ( '|' )
            {
            // InternalXtext.g:6735:1: ( '|' )
            // InternalXtext.g:6736:2: '|'
            {
             before(grammarAccess.getAssignableAlternativesAccess().getVerticalLineKeyword_1_1_0()); 
            match(input,37,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssignableAlternativesAccess().getVerticalLineKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group_1_1__0__Impl"


    // $ANTLR start "rule__AssignableAlternatives__Group_1_1__1"
    // InternalXtext.g:6745:1: rule__AssignableAlternatives__Group_1_1__1 : rule__AssignableAlternatives__Group_1_1__1__Impl ;
    public final void rule__AssignableAlternatives__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6749:1: ( rule__AssignableAlternatives__Group_1_1__1__Impl )
            // InternalXtext.g:6750:2: rule__AssignableAlternatives__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group_1_1__1"


    // $ANTLR start "rule__AssignableAlternatives__Group_1_1__1__Impl"
    // InternalXtext.g:6756:1: rule__AssignableAlternatives__Group_1_1__1__Impl : ( ( rule__AssignableAlternatives__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__AssignableAlternatives__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6760:1: ( ( ( rule__AssignableAlternatives__ElementsAssignment_1_1_1 ) ) )
            // InternalXtext.g:6761:1: ( ( rule__AssignableAlternatives__ElementsAssignment_1_1_1 ) )
            {
            // InternalXtext.g:6761:1: ( ( rule__AssignableAlternatives__ElementsAssignment_1_1_1 ) )
            // InternalXtext.g:6762:2: ( rule__AssignableAlternatives__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getAssignableAlternativesAccess().getElementsAssignment_1_1_1()); 
            // InternalXtext.g:6763:2: ( rule__AssignableAlternatives__ElementsAssignment_1_1_1 )
            // InternalXtext.g:6763:3: rule__AssignableAlternatives__ElementsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignableAlternativesAccess().getElementsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group_1_1__1__Impl"


    // $ANTLR start "rule__CrossReference__Group__0"
    // InternalXtext.g:6772:1: rule__CrossReference__Group__0 : rule__CrossReference__Group__0__Impl rule__CrossReference__Group__1 ;
    public final void rule__CrossReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6776:1: ( rule__CrossReference__Group__0__Impl rule__CrossReference__Group__1 )
            // InternalXtext.g:6777:2: rule__CrossReference__Group__0__Impl rule__CrossReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__CrossReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__0"


    // $ANTLR start "rule__CrossReference__Group__0__Impl"
    // InternalXtext.g:6784:1: rule__CrossReference__Group__0__Impl : ( '[' ) ;
    public final void rule__CrossReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6788:1: ( ( '[' ) )
            // InternalXtext.g:6789:1: ( '[' )
            {
            // InternalXtext.g:6789:1: ( '[' )
            // InternalXtext.g:6790:2: '['
            {
             before(grammarAccess.getCrossReferenceAccess().getLeftSquareBracketKeyword_0()); 
            match(input,43,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCrossReferenceAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__0__Impl"


    // $ANTLR start "rule__CrossReference__Group__1"
    // InternalXtext.g:6799:1: rule__CrossReference__Group__1 : rule__CrossReference__Group__1__Impl rule__CrossReference__Group__2 ;
    public final void rule__CrossReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6803:1: ( rule__CrossReference__Group__1__Impl rule__CrossReference__Group__2 )
            // InternalXtext.g:6804:2: rule__CrossReference__Group__1__Impl rule__CrossReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_47);
            rule__CrossReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__1"


    // $ANTLR start "rule__CrossReference__Group__1__Impl"
    // InternalXtext.g:6811:1: rule__CrossReference__Group__1__Impl : ( ( rule__CrossReference__TypeAssignment_1 ) ) ;
    public final void rule__CrossReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6815:1: ( ( ( rule__CrossReference__TypeAssignment_1 ) ) )
            // InternalXtext.g:6816:1: ( ( rule__CrossReference__TypeAssignment_1 ) )
            {
            // InternalXtext.g:6816:1: ( ( rule__CrossReference__TypeAssignment_1 ) )
            // InternalXtext.g:6817:2: ( rule__CrossReference__TypeAssignment_1 )
            {
             before(grammarAccess.getCrossReferenceAccess().getTypeAssignment_1()); 
            // InternalXtext.g:6818:2: ( rule__CrossReference__TypeAssignment_1 )
            // InternalXtext.g:6818:3: rule__CrossReference__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCrossReferenceAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__1__Impl"


    // $ANTLR start "rule__CrossReference__Group__2"
    // InternalXtext.g:6826:1: rule__CrossReference__Group__2 : rule__CrossReference__Group__2__Impl rule__CrossReference__Group__3 ;
    public final void rule__CrossReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6830:1: ( rule__CrossReference__Group__2__Impl rule__CrossReference__Group__3 )
            // InternalXtext.g:6831:2: rule__CrossReference__Group__2__Impl rule__CrossReference__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_47);
            rule__CrossReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__2"


    // $ANTLR start "rule__CrossReference__Group__2__Impl"
    // InternalXtext.g:6838:1: rule__CrossReference__Group__2__Impl : ( ( rule__CrossReference__Group_2__0 )? ) ;
    public final void rule__CrossReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6842:1: ( ( ( rule__CrossReference__Group_2__0 )? ) )
            // InternalXtext.g:6843:1: ( ( rule__CrossReference__Group_2__0 )? )
            {
            // InternalXtext.g:6843:1: ( ( rule__CrossReference__Group_2__0 )? )
            // InternalXtext.g:6844:2: ( rule__CrossReference__Group_2__0 )?
            {
             before(grammarAccess.getCrossReferenceAccess().getGroup_2()); 
            // InternalXtext.g:6845:2: ( rule__CrossReference__Group_2__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==37) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalXtext.g:6845:3: rule__CrossReference__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__CrossReference__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCrossReferenceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__2__Impl"


    // $ANTLR start "rule__CrossReference__Group__3"
    // InternalXtext.g:6853:1: rule__CrossReference__Group__3 : rule__CrossReference__Group__3__Impl ;
    public final void rule__CrossReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6857:1: ( rule__CrossReference__Group__3__Impl )
            // InternalXtext.g:6858:2: rule__CrossReference__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__3"


    // $ANTLR start "rule__CrossReference__Group__3__Impl"
    // InternalXtext.g:6864:1: rule__CrossReference__Group__3__Impl : ( ']' ) ;
    public final void rule__CrossReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6868:1: ( ( ']' ) )
            // InternalXtext.g:6869:1: ( ']' )
            {
            // InternalXtext.g:6869:1: ( ']' )
            // InternalXtext.g:6870:2: ']'
            {
             before(grammarAccess.getCrossReferenceAccess().getRightSquareBracketKeyword_3()); 
            match(input,44,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCrossReferenceAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__3__Impl"


    // $ANTLR start "rule__CrossReference__Group_2__0"
    // InternalXtext.g:6880:1: rule__CrossReference__Group_2__0 : rule__CrossReference__Group_2__0__Impl rule__CrossReference__Group_2__1 ;
    public final void rule__CrossReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6884:1: ( rule__CrossReference__Group_2__0__Impl rule__CrossReference__Group_2__1 )
            // InternalXtext.g:6885:2: rule__CrossReference__Group_2__0__Impl rule__CrossReference__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_48);
            rule__CrossReference__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group_2__0"


    // $ANTLR start "rule__CrossReference__Group_2__0__Impl"
    // InternalXtext.g:6892:1: rule__CrossReference__Group_2__0__Impl : ( '|' ) ;
    public final void rule__CrossReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6896:1: ( ( '|' ) )
            // InternalXtext.g:6897:1: ( '|' )
            {
            // InternalXtext.g:6897:1: ( '|' )
            // InternalXtext.g:6898:2: '|'
            {
             before(grammarAccess.getCrossReferenceAccess().getVerticalLineKeyword_2_0()); 
            match(input,37,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCrossReferenceAccess().getVerticalLineKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group_2__0__Impl"


    // $ANTLR start "rule__CrossReference__Group_2__1"
    // InternalXtext.g:6907:1: rule__CrossReference__Group_2__1 : rule__CrossReference__Group_2__1__Impl ;
    public final void rule__CrossReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6911:1: ( rule__CrossReference__Group_2__1__Impl )
            // InternalXtext.g:6912:2: rule__CrossReference__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group_2__1"


    // $ANTLR start "rule__CrossReference__Group_2__1__Impl"
    // InternalXtext.g:6918:1: rule__CrossReference__Group_2__1__Impl : ( ( rule__CrossReference__TerminalAssignment_2_1 ) ) ;
    public final void rule__CrossReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6922:1: ( ( ( rule__CrossReference__TerminalAssignment_2_1 ) ) )
            // InternalXtext.g:6923:1: ( ( rule__CrossReference__TerminalAssignment_2_1 ) )
            {
            // InternalXtext.g:6923:1: ( ( rule__CrossReference__TerminalAssignment_2_1 ) )
            // InternalXtext.g:6924:2: ( rule__CrossReference__TerminalAssignment_2_1 )
            {
             before(grammarAccess.getCrossReferenceAccess().getTerminalAssignment_2_1()); 
            // InternalXtext.g:6925:2: ( rule__CrossReference__TerminalAssignment_2_1 )
            // InternalXtext.g:6925:3: rule__CrossReference__TerminalAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__TerminalAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCrossReferenceAccess().getTerminalAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group_2__1__Impl"


    // $ANTLR start "rule__ParenthesizedElement__Group__0"
    // InternalXtext.g:6934:1: rule__ParenthesizedElement__Group__0 : rule__ParenthesizedElement__Group__0__Impl rule__ParenthesizedElement__Group__1 ;
    public final void rule__ParenthesizedElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6938:1: ( rule__ParenthesizedElement__Group__0__Impl rule__ParenthesizedElement__Group__1 )
            // InternalXtext.g:6939:2: rule__ParenthesizedElement__Group__0__Impl rule__ParenthesizedElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__ParenthesizedElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__0"


    // $ANTLR start "rule__ParenthesizedElement__Group__0__Impl"
    // InternalXtext.g:6946:1: rule__ParenthesizedElement__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6950:1: ( ( '(' ) )
            // InternalXtext.g:6951:1: ( '(' )
            {
            // InternalXtext.g:6951:1: ( '(' )
            // InternalXtext.g:6952:2: '('
            {
             before(grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__0__Impl"


    // $ANTLR start "rule__ParenthesizedElement__Group__1"
    // InternalXtext.g:6961:1: rule__ParenthesizedElement__Group__1 : rule__ParenthesizedElement__Group__1__Impl rule__ParenthesizedElement__Group__2 ;
    public final void rule__ParenthesizedElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6965:1: ( rule__ParenthesizedElement__Group__1__Impl rule__ParenthesizedElement__Group__2 )
            // InternalXtext.g:6966:2: rule__ParenthesizedElement__Group__1__Impl rule__ParenthesizedElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__ParenthesizedElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__1"


    // $ANTLR start "rule__ParenthesizedElement__Group__1__Impl"
    // InternalXtext.g:6973:1: rule__ParenthesizedElement__Group__1__Impl : ( ruleAlternatives ) ;
    public final void rule__ParenthesizedElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6977:1: ( ( ruleAlternatives ) )
            // InternalXtext.g:6978:1: ( ruleAlternatives )
            {
            // InternalXtext.g:6978:1: ( ruleAlternatives )
            // InternalXtext.g:6979:2: ruleAlternatives
            {
             before(grammarAccess.getParenthesizedElementAccess().getAlternativesParserRuleCall_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getParenthesizedElementAccess().getAlternativesParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedElement__Group__2"
    // InternalXtext.g:6988:1: rule__ParenthesizedElement__Group__2 : rule__ParenthesizedElement__Group__2__Impl ;
    public final void rule__ParenthesizedElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:6992:1: ( rule__ParenthesizedElement__Group__2__Impl )
            // InternalXtext.g:6993:2: rule__ParenthesizedElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__2"


    // $ANTLR start "rule__ParenthesizedElement__Group__2__Impl"
    // InternalXtext.g:6999:1: rule__ParenthesizedElement__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7003:1: ( ( ')' ) )
            // InternalXtext.g:7004:1: ( ')' )
            {
            // InternalXtext.g:7004:1: ( ')' )
            // InternalXtext.g:7005:2: ')'
            {
             before(grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__2__Impl"


    // $ANTLR start "rule__PredicatedGroup__Group__0"
    // InternalXtext.g:7015:1: rule__PredicatedGroup__Group__0 : rule__PredicatedGroup__Group__0__Impl rule__PredicatedGroup__Group__1 ;
    public final void rule__PredicatedGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7019:1: ( rule__PredicatedGroup__Group__0__Impl rule__PredicatedGroup__Group__1 )
            // InternalXtext.g:7020:2: rule__PredicatedGroup__Group__0__Impl rule__PredicatedGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__PredicatedGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__0"


    // $ANTLR start "rule__PredicatedGroup__Group__0__Impl"
    // InternalXtext.g:7027:1: rule__PredicatedGroup__Group__0__Impl : ( ( rule__PredicatedGroup__Alternatives_0 ) ) ;
    public final void rule__PredicatedGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7031:1: ( ( ( rule__PredicatedGroup__Alternatives_0 ) ) )
            // InternalXtext.g:7032:1: ( ( rule__PredicatedGroup__Alternatives_0 ) )
            {
            // InternalXtext.g:7032:1: ( ( rule__PredicatedGroup__Alternatives_0 ) )
            // InternalXtext.g:7033:2: ( rule__PredicatedGroup__Alternatives_0 )
            {
             before(grammarAccess.getPredicatedGroupAccess().getAlternatives_0()); 
            // InternalXtext.g:7034:2: ( rule__PredicatedGroup__Alternatives_0 )
            // InternalXtext.g:7034:3: rule__PredicatedGroup__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedGroup__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedGroupAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__0__Impl"


    // $ANTLR start "rule__PredicatedGroup__Group__1"
    // InternalXtext.g:7042:1: rule__PredicatedGroup__Group__1 : rule__PredicatedGroup__Group__1__Impl rule__PredicatedGroup__Group__2 ;
    public final void rule__PredicatedGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7046:1: ( rule__PredicatedGroup__Group__1__Impl rule__PredicatedGroup__Group__2 )
            // InternalXtext.g:7047:2: rule__PredicatedGroup__Group__1__Impl rule__PredicatedGroup__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__PredicatedGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__1"


    // $ANTLR start "rule__PredicatedGroup__Group__1__Impl"
    // InternalXtext.g:7054:1: rule__PredicatedGroup__Group__1__Impl : ( '(' ) ;
    public final void rule__PredicatedGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7058:1: ( ( '(' ) )
            // InternalXtext.g:7059:1: ( '(' )
            {
            // InternalXtext.g:7059:1: ( '(' )
            // InternalXtext.g:7060:2: '('
            {
             before(grammarAccess.getPredicatedGroupAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedGroupAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__1__Impl"


    // $ANTLR start "rule__PredicatedGroup__Group__2"
    // InternalXtext.g:7069:1: rule__PredicatedGroup__Group__2 : rule__PredicatedGroup__Group__2__Impl rule__PredicatedGroup__Group__3 ;
    public final void rule__PredicatedGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7073:1: ( rule__PredicatedGroup__Group__2__Impl rule__PredicatedGroup__Group__3 )
            // InternalXtext.g:7074:2: rule__PredicatedGroup__Group__2__Impl rule__PredicatedGroup__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__PredicatedGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__2"


    // $ANTLR start "rule__PredicatedGroup__Group__2__Impl"
    // InternalXtext.g:7081:1: rule__PredicatedGroup__Group__2__Impl : ( ( rule__PredicatedGroup__ElementsAssignment_2 ) ) ;
    public final void rule__PredicatedGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7085:1: ( ( ( rule__PredicatedGroup__ElementsAssignment_2 ) ) )
            // InternalXtext.g:7086:1: ( ( rule__PredicatedGroup__ElementsAssignment_2 ) )
            {
            // InternalXtext.g:7086:1: ( ( rule__PredicatedGroup__ElementsAssignment_2 ) )
            // InternalXtext.g:7087:2: ( rule__PredicatedGroup__ElementsAssignment_2 )
            {
             before(grammarAccess.getPredicatedGroupAccess().getElementsAssignment_2()); 
            // InternalXtext.g:7088:2: ( rule__PredicatedGroup__ElementsAssignment_2 )
            // InternalXtext.g:7088:3: rule__PredicatedGroup__ElementsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedGroup__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedGroupAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__2__Impl"


    // $ANTLR start "rule__PredicatedGroup__Group__3"
    // InternalXtext.g:7096:1: rule__PredicatedGroup__Group__3 : rule__PredicatedGroup__Group__3__Impl ;
    public final void rule__PredicatedGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7100:1: ( rule__PredicatedGroup__Group__3__Impl )
            // InternalXtext.g:7101:2: rule__PredicatedGroup__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedGroup__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__3"


    // $ANTLR start "rule__PredicatedGroup__Group__3__Impl"
    // InternalXtext.g:7107:1: rule__PredicatedGroup__Group__3__Impl : ( ')' ) ;
    public final void rule__PredicatedGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7111:1: ( ( ')' ) )
            // InternalXtext.g:7112:1: ( ')' )
            {
            // InternalXtext.g:7112:1: ( ')' )
            // InternalXtext.g:7113:2: ')'
            {
             before(grammarAccess.getPredicatedGroupAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedGroupAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__3__Impl"


    // $ANTLR start "rule__TerminalRule__Group__0"
    // InternalXtext.g:7123:1: rule__TerminalRule__Group__0 : rule__TerminalRule__Group__0__Impl rule__TerminalRule__Group__1 ;
    public final void rule__TerminalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7127:1: ( rule__TerminalRule__Group__0__Impl rule__TerminalRule__Group__1 )
            // InternalXtext.g:7128:2: rule__TerminalRule__Group__0__Impl rule__TerminalRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_49);
            rule__TerminalRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__0"


    // $ANTLR start "rule__TerminalRule__Group__0__Impl"
    // InternalXtext.g:7135:1: rule__TerminalRule__Group__0__Impl : ( ( rule__TerminalRule__AnnotationsAssignment_0 )* ) ;
    public final void rule__TerminalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7139:1: ( ( ( rule__TerminalRule__AnnotationsAssignment_0 )* ) )
            // InternalXtext.g:7140:1: ( ( rule__TerminalRule__AnnotationsAssignment_0 )* )
            {
            // InternalXtext.g:7140:1: ( ( rule__TerminalRule__AnnotationsAssignment_0 )* )
            // InternalXtext.g:7141:2: ( rule__TerminalRule__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getTerminalRuleAccess().getAnnotationsAssignment_0()); 
            // InternalXtext.g:7142:2: ( rule__TerminalRule__AnnotationsAssignment_0 )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==29) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalXtext.g:7142:3: rule__TerminalRule__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__TerminalRule__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

             after(grammarAccess.getTerminalRuleAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__0__Impl"


    // $ANTLR start "rule__TerminalRule__Group__1"
    // InternalXtext.g:7150:1: rule__TerminalRule__Group__1 : rule__TerminalRule__Group__1__Impl rule__TerminalRule__Group__2 ;
    public final void rule__TerminalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7154:1: ( rule__TerminalRule__Group__1__Impl rule__TerminalRule__Group__2 )
            // InternalXtext.g:7155:2: rule__TerminalRule__Group__1__Impl rule__TerminalRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_50);
            rule__TerminalRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__1"


    // $ANTLR start "rule__TerminalRule__Group__1__Impl"
    // InternalXtext.g:7162:1: rule__TerminalRule__Group__1__Impl : ( 'terminal' ) ;
    public final void rule__TerminalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7166:1: ( ( 'terminal' ) )
            // InternalXtext.g:7167:1: ( 'terminal' )
            {
            // InternalXtext.g:7167:1: ( 'terminal' )
            // InternalXtext.g:7168:2: 'terminal'
            {
             before(grammarAccess.getTerminalRuleAccess().getTerminalKeyword_1()); 
            match(input,45,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTerminalRuleAccess().getTerminalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__1__Impl"


    // $ANTLR start "rule__TerminalRule__Group__2"
    // InternalXtext.g:7177:1: rule__TerminalRule__Group__2 : rule__TerminalRule__Group__2__Impl rule__TerminalRule__Group__3 ;
    public final void rule__TerminalRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7181:1: ( rule__TerminalRule__Group__2__Impl rule__TerminalRule__Group__3 )
            // InternalXtext.g:7182:2: rule__TerminalRule__Group__2__Impl rule__TerminalRule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_51);
            rule__TerminalRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__2"


    // $ANTLR start "rule__TerminalRule__Group__2__Impl"
    // InternalXtext.g:7189:1: rule__TerminalRule__Group__2__Impl : ( ( rule__TerminalRule__Alternatives_2 ) ) ;
    public final void rule__TerminalRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7193:1: ( ( ( rule__TerminalRule__Alternatives_2 ) ) )
            // InternalXtext.g:7194:1: ( ( rule__TerminalRule__Alternatives_2 ) )
            {
            // InternalXtext.g:7194:1: ( ( rule__TerminalRule__Alternatives_2 ) )
            // InternalXtext.g:7195:2: ( rule__TerminalRule__Alternatives_2 )
            {
             before(grammarAccess.getTerminalRuleAccess().getAlternatives_2()); 
            // InternalXtext.g:7196:2: ( rule__TerminalRule__Alternatives_2 )
            // InternalXtext.g:7196:3: rule__TerminalRule__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__2__Impl"


    // $ANTLR start "rule__TerminalRule__Group__3"
    // InternalXtext.g:7204:1: rule__TerminalRule__Group__3 : rule__TerminalRule__Group__3__Impl rule__TerminalRule__Group__4 ;
    public final void rule__TerminalRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7208:1: ( rule__TerminalRule__Group__3__Impl rule__TerminalRule__Group__4 )
            // InternalXtext.g:7209:2: rule__TerminalRule__Group__3__Impl rule__TerminalRule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__TerminalRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__3"


    // $ANTLR start "rule__TerminalRule__Group__3__Impl"
    // InternalXtext.g:7216:1: rule__TerminalRule__Group__3__Impl : ( ':' ) ;
    public final void rule__TerminalRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7220:1: ( ( ':' ) )
            // InternalXtext.g:7221:1: ( ':' )
            {
            // InternalXtext.g:7221:1: ( ':' )
            // InternalXtext.g:7222:2: ':'
            {
             before(grammarAccess.getTerminalRuleAccess().getColonKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTerminalRuleAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__3__Impl"


    // $ANTLR start "rule__TerminalRule__Group__4"
    // InternalXtext.g:7231:1: rule__TerminalRule__Group__4 : rule__TerminalRule__Group__4__Impl rule__TerminalRule__Group__5 ;
    public final void rule__TerminalRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7235:1: ( rule__TerminalRule__Group__4__Impl rule__TerminalRule__Group__5 )
            // InternalXtext.g:7236:2: rule__TerminalRule__Group__4__Impl rule__TerminalRule__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__TerminalRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__4"


    // $ANTLR start "rule__TerminalRule__Group__4__Impl"
    // InternalXtext.g:7243:1: rule__TerminalRule__Group__4__Impl : ( ( rule__TerminalRule__AlternativesAssignment_4 ) ) ;
    public final void rule__TerminalRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7247:1: ( ( ( rule__TerminalRule__AlternativesAssignment_4 ) ) )
            // InternalXtext.g:7248:1: ( ( rule__TerminalRule__AlternativesAssignment_4 ) )
            {
            // InternalXtext.g:7248:1: ( ( rule__TerminalRule__AlternativesAssignment_4 ) )
            // InternalXtext.g:7249:2: ( rule__TerminalRule__AlternativesAssignment_4 )
            {
             before(grammarAccess.getTerminalRuleAccess().getAlternativesAssignment_4()); 
            // InternalXtext.g:7250:2: ( rule__TerminalRule__AlternativesAssignment_4 )
            // InternalXtext.g:7250:3: rule__TerminalRule__AlternativesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__AlternativesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleAccess().getAlternativesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__4__Impl"


    // $ANTLR start "rule__TerminalRule__Group__5"
    // InternalXtext.g:7258:1: rule__TerminalRule__Group__5 : rule__TerminalRule__Group__5__Impl ;
    public final void rule__TerminalRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7262:1: ( rule__TerminalRule__Group__5__Impl )
            // InternalXtext.g:7263:2: rule__TerminalRule__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__5"


    // $ANTLR start "rule__TerminalRule__Group__5__Impl"
    // InternalXtext.g:7269:1: rule__TerminalRule__Group__5__Impl : ( ';' ) ;
    public final void rule__TerminalRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7273:1: ( ( ';' ) )
            // InternalXtext.g:7274:1: ( ';' )
            {
            // InternalXtext.g:7274:1: ( ';' )
            // InternalXtext.g:7275:2: ';'
            {
             before(grammarAccess.getTerminalRuleAccess().getSemicolonKeyword_5()); 
            match(input,31,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTerminalRuleAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__5__Impl"


    // $ANTLR start "rule__TerminalRule__Group_2_0__0"
    // InternalXtext.g:7285:1: rule__TerminalRule__Group_2_0__0 : rule__TerminalRule__Group_2_0__0__Impl rule__TerminalRule__Group_2_0__1 ;
    public final void rule__TerminalRule__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7289:1: ( rule__TerminalRule__Group_2_0__0__Impl rule__TerminalRule__Group_2_0__1 )
            // InternalXtext.g:7290:2: rule__TerminalRule__Group_2_0__0__Impl rule__TerminalRule__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__TerminalRule__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_2_0__0"


    // $ANTLR start "rule__TerminalRule__Group_2_0__0__Impl"
    // InternalXtext.g:7297:1: rule__TerminalRule__Group_2_0__0__Impl : ( ( rule__TerminalRule__FragmentAssignment_2_0_0 ) ) ;
    public final void rule__TerminalRule__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7301:1: ( ( ( rule__TerminalRule__FragmentAssignment_2_0_0 ) ) )
            // InternalXtext.g:7302:1: ( ( rule__TerminalRule__FragmentAssignment_2_0_0 ) )
            {
            // InternalXtext.g:7302:1: ( ( rule__TerminalRule__FragmentAssignment_2_0_0 ) )
            // InternalXtext.g:7303:2: ( rule__TerminalRule__FragmentAssignment_2_0_0 )
            {
             before(grammarAccess.getTerminalRuleAccess().getFragmentAssignment_2_0_0()); 
            // InternalXtext.g:7304:2: ( rule__TerminalRule__FragmentAssignment_2_0_0 )
            // InternalXtext.g:7304:3: rule__TerminalRule__FragmentAssignment_2_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__FragmentAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleAccess().getFragmentAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_2_0__0__Impl"


    // $ANTLR start "rule__TerminalRule__Group_2_0__1"
    // InternalXtext.g:7312:1: rule__TerminalRule__Group_2_0__1 : rule__TerminalRule__Group_2_0__1__Impl ;
    public final void rule__TerminalRule__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7316:1: ( rule__TerminalRule__Group_2_0__1__Impl )
            // InternalXtext.g:7317:2: rule__TerminalRule__Group_2_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_2_0__1"


    // $ANTLR start "rule__TerminalRule__Group_2_0__1__Impl"
    // InternalXtext.g:7323:1: rule__TerminalRule__Group_2_0__1__Impl : ( ( rule__TerminalRule__NameAssignment_2_0_1 ) ) ;
    public final void rule__TerminalRule__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7327:1: ( ( ( rule__TerminalRule__NameAssignment_2_0_1 ) ) )
            // InternalXtext.g:7328:1: ( ( rule__TerminalRule__NameAssignment_2_0_1 ) )
            {
            // InternalXtext.g:7328:1: ( ( rule__TerminalRule__NameAssignment_2_0_1 ) )
            // InternalXtext.g:7329:2: ( rule__TerminalRule__NameAssignment_2_0_1 )
            {
             before(grammarAccess.getTerminalRuleAccess().getNameAssignment_2_0_1()); 
            // InternalXtext.g:7330:2: ( rule__TerminalRule__NameAssignment_2_0_1 )
            // InternalXtext.g:7330:3: rule__TerminalRule__NameAssignment_2_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__NameAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleAccess().getNameAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_2_0__1__Impl"


    // $ANTLR start "rule__TerminalRule__Group_2_1__0"
    // InternalXtext.g:7339:1: rule__TerminalRule__Group_2_1__0 : rule__TerminalRule__Group_2_1__0__Impl rule__TerminalRule__Group_2_1__1 ;
    public final void rule__TerminalRule__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7343:1: ( rule__TerminalRule__Group_2_1__0__Impl rule__TerminalRule__Group_2_1__1 )
            // InternalXtext.g:7344:2: rule__TerminalRule__Group_2_1__0__Impl rule__TerminalRule__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_53);
            rule__TerminalRule__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_2_1__0"


    // $ANTLR start "rule__TerminalRule__Group_2_1__0__Impl"
    // InternalXtext.g:7351:1: rule__TerminalRule__Group_2_1__0__Impl : ( ( rule__TerminalRule__NameAssignment_2_1_0 ) ) ;
    public final void rule__TerminalRule__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7355:1: ( ( ( rule__TerminalRule__NameAssignment_2_1_0 ) ) )
            // InternalXtext.g:7356:1: ( ( rule__TerminalRule__NameAssignment_2_1_0 ) )
            {
            // InternalXtext.g:7356:1: ( ( rule__TerminalRule__NameAssignment_2_1_0 ) )
            // InternalXtext.g:7357:2: ( rule__TerminalRule__NameAssignment_2_1_0 )
            {
             before(grammarAccess.getTerminalRuleAccess().getNameAssignment_2_1_0()); 
            // InternalXtext.g:7358:2: ( rule__TerminalRule__NameAssignment_2_1_0 )
            // InternalXtext.g:7358:3: rule__TerminalRule__NameAssignment_2_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__NameAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleAccess().getNameAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_2_1__0__Impl"


    // $ANTLR start "rule__TerminalRule__Group_2_1__1"
    // InternalXtext.g:7366:1: rule__TerminalRule__Group_2_1__1 : rule__TerminalRule__Group_2_1__1__Impl ;
    public final void rule__TerminalRule__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7370:1: ( rule__TerminalRule__Group_2_1__1__Impl )
            // InternalXtext.g:7371:2: rule__TerminalRule__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_2_1__1"


    // $ANTLR start "rule__TerminalRule__Group_2_1__1__Impl"
    // InternalXtext.g:7377:1: rule__TerminalRule__Group_2_1__1__Impl : ( ( rule__TerminalRule__Group_2_1_1__0 )? ) ;
    public final void rule__TerminalRule__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7381:1: ( ( ( rule__TerminalRule__Group_2_1_1__0 )? ) )
            // InternalXtext.g:7382:1: ( ( rule__TerminalRule__Group_2_1_1__0 )? )
            {
            // InternalXtext.g:7382:1: ( ( rule__TerminalRule__Group_2_1_1__0 )? )
            // InternalXtext.g:7383:2: ( rule__TerminalRule__Group_2_1_1__0 )?
            {
             before(grammarAccess.getTerminalRuleAccess().getGroup_2_1_1()); 
            // InternalXtext.g:7384:2: ( rule__TerminalRule__Group_2_1_1__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==32) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalXtext.g:7384:3: rule__TerminalRule__Group_2_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TerminalRule__Group_2_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminalRuleAccess().getGroup_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_2_1__1__Impl"


    // $ANTLR start "rule__TerminalRule__Group_2_1_1__0"
    // InternalXtext.g:7393:1: rule__TerminalRule__Group_2_1_1__0 : rule__TerminalRule__Group_2_1_1__0__Impl rule__TerminalRule__Group_2_1_1__1 ;
    public final void rule__TerminalRule__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7397:1: ( rule__TerminalRule__Group_2_1_1__0__Impl rule__TerminalRule__Group_2_1_1__1 )
            // InternalXtext.g:7398:2: rule__TerminalRule__Group_2_1_1__0__Impl rule__TerminalRule__Group_2_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__TerminalRule__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_2_1_1__0"


    // $ANTLR start "rule__TerminalRule__Group_2_1_1__0__Impl"
    // InternalXtext.g:7405:1: rule__TerminalRule__Group_2_1_1__0__Impl : ( 'returns' ) ;
    public final void rule__TerminalRule__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7409:1: ( ( 'returns' ) )
            // InternalXtext.g:7410:1: ( 'returns' )
            {
            // InternalXtext.g:7410:1: ( 'returns' )
            // InternalXtext.g:7411:2: 'returns'
            {
             before(grammarAccess.getTerminalRuleAccess().getReturnsKeyword_2_1_1_0()); 
            match(input,32,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTerminalRuleAccess().getReturnsKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__TerminalRule__Group_2_1_1__1"
    // InternalXtext.g:7420:1: rule__TerminalRule__Group_2_1_1__1 : rule__TerminalRule__Group_2_1_1__1__Impl ;
    public final void rule__TerminalRule__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7424:1: ( rule__TerminalRule__Group_2_1_1__1__Impl )
            // InternalXtext.g:7425:2: rule__TerminalRule__Group_2_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group_2_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_2_1_1__1"


    // $ANTLR start "rule__TerminalRule__Group_2_1_1__1__Impl"
    // InternalXtext.g:7431:1: rule__TerminalRule__Group_2_1_1__1__Impl : ( ( rule__TerminalRule__TypeAssignment_2_1_1_1 ) ) ;
    public final void rule__TerminalRule__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7435:1: ( ( ( rule__TerminalRule__TypeAssignment_2_1_1_1 ) ) )
            // InternalXtext.g:7436:1: ( ( rule__TerminalRule__TypeAssignment_2_1_1_1 ) )
            {
            // InternalXtext.g:7436:1: ( ( rule__TerminalRule__TypeAssignment_2_1_1_1 ) )
            // InternalXtext.g:7437:2: ( rule__TerminalRule__TypeAssignment_2_1_1_1 )
            {
             before(grammarAccess.getTerminalRuleAccess().getTypeAssignment_2_1_1_1()); 
            // InternalXtext.g:7438:2: ( rule__TerminalRule__TypeAssignment_2_1_1_1 )
            // InternalXtext.g:7438:3: rule__TerminalRule__TypeAssignment_2_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__TypeAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleAccess().getTypeAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__TerminalAlternatives__Group__0"
    // InternalXtext.g:7447:1: rule__TerminalAlternatives__Group__0 : rule__TerminalAlternatives__Group__0__Impl rule__TerminalAlternatives__Group__1 ;
    public final void rule__TerminalAlternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7451:1: ( rule__TerminalAlternatives__Group__0__Impl rule__TerminalAlternatives__Group__1 )
            // InternalXtext.g:7452:2: rule__TerminalAlternatives__Group__0__Impl rule__TerminalAlternatives__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__TerminalAlternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group__0"


    // $ANTLR start "rule__TerminalAlternatives__Group__0__Impl"
    // InternalXtext.g:7459:1: rule__TerminalAlternatives__Group__0__Impl : ( ruleTerminalGroup ) ;
    public final void rule__TerminalAlternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7463:1: ( ( ruleTerminalGroup ) )
            // InternalXtext.g:7464:1: ( ruleTerminalGroup )
            {
            // InternalXtext.g:7464:1: ( ruleTerminalGroup )
            // InternalXtext.g:7465:2: ruleTerminalGroup
            {
             before(grammarAccess.getTerminalAlternativesAccess().getTerminalGroupParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalGroup();

            state._fsp--;

             after(grammarAccess.getTerminalAlternativesAccess().getTerminalGroupParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group__0__Impl"


    // $ANTLR start "rule__TerminalAlternatives__Group__1"
    // InternalXtext.g:7474:1: rule__TerminalAlternatives__Group__1 : rule__TerminalAlternatives__Group__1__Impl ;
    public final void rule__TerminalAlternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7478:1: ( rule__TerminalAlternatives__Group__1__Impl )
            // InternalXtext.g:7479:2: rule__TerminalAlternatives__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group__1"


    // $ANTLR start "rule__TerminalAlternatives__Group__1__Impl"
    // InternalXtext.g:7485:1: rule__TerminalAlternatives__Group__1__Impl : ( ( rule__TerminalAlternatives__Group_1__0 )? ) ;
    public final void rule__TerminalAlternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7489:1: ( ( ( rule__TerminalAlternatives__Group_1__0 )? ) )
            // InternalXtext.g:7490:1: ( ( rule__TerminalAlternatives__Group_1__0 )? )
            {
            // InternalXtext.g:7490:1: ( ( rule__TerminalAlternatives__Group_1__0 )? )
            // InternalXtext.g:7491:2: ( rule__TerminalAlternatives__Group_1__0 )?
            {
             before(grammarAccess.getTerminalAlternativesAccess().getGroup_1()); 
            // InternalXtext.g:7492:2: ( rule__TerminalAlternatives__Group_1__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==37) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalXtext.g:7492:3: rule__TerminalAlternatives__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TerminalAlternatives__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminalAlternativesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group__1__Impl"


    // $ANTLR start "rule__TerminalAlternatives__Group_1__0"
    // InternalXtext.g:7501:1: rule__TerminalAlternatives__Group_1__0 : rule__TerminalAlternatives__Group_1__0__Impl rule__TerminalAlternatives__Group_1__1 ;
    public final void rule__TerminalAlternatives__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7505:1: ( rule__TerminalAlternatives__Group_1__0__Impl rule__TerminalAlternatives__Group_1__1 )
            // InternalXtext.g:7506:2: rule__TerminalAlternatives__Group_1__0__Impl rule__TerminalAlternatives__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__TerminalAlternatives__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group_1__0"


    // $ANTLR start "rule__TerminalAlternatives__Group_1__0__Impl"
    // InternalXtext.g:7513:1: rule__TerminalAlternatives__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalAlternatives__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7517:1: ( ( () ) )
            // InternalXtext.g:7518:1: ( () )
            {
            // InternalXtext.g:7518:1: ( () )
            // InternalXtext.g:7519:2: ()
            {
             before(grammarAccess.getTerminalAlternativesAccess().getAlternativesElementsAction_1_0()); 
            // InternalXtext.g:7520:2: ()
            // InternalXtext.g:7520:3: 
            {
            }

             after(grammarAccess.getTerminalAlternativesAccess().getAlternativesElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group_1__0__Impl"


    // $ANTLR start "rule__TerminalAlternatives__Group_1__1"
    // InternalXtext.g:7528:1: rule__TerminalAlternatives__Group_1__1 : rule__TerminalAlternatives__Group_1__1__Impl ;
    public final void rule__TerminalAlternatives__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7532:1: ( rule__TerminalAlternatives__Group_1__1__Impl )
            // InternalXtext.g:7533:2: rule__TerminalAlternatives__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group_1__1"


    // $ANTLR start "rule__TerminalAlternatives__Group_1__1__Impl"
    // InternalXtext.g:7539:1: rule__TerminalAlternatives__Group_1__1__Impl : ( ( ( rule__TerminalAlternatives__Group_1_1__0 ) ) ( ( rule__TerminalAlternatives__Group_1_1__0 )* ) ) ;
    public final void rule__TerminalAlternatives__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7543:1: ( ( ( ( rule__TerminalAlternatives__Group_1_1__0 ) ) ( ( rule__TerminalAlternatives__Group_1_1__0 )* ) ) )
            // InternalXtext.g:7544:1: ( ( ( rule__TerminalAlternatives__Group_1_1__0 ) ) ( ( rule__TerminalAlternatives__Group_1_1__0 )* ) )
            {
            // InternalXtext.g:7544:1: ( ( ( rule__TerminalAlternatives__Group_1_1__0 ) ) ( ( rule__TerminalAlternatives__Group_1_1__0 )* ) )
            // InternalXtext.g:7545:2: ( ( rule__TerminalAlternatives__Group_1_1__0 ) ) ( ( rule__TerminalAlternatives__Group_1_1__0 )* )
            {
            // InternalXtext.g:7545:2: ( ( rule__TerminalAlternatives__Group_1_1__0 ) )
            // InternalXtext.g:7546:3: ( rule__TerminalAlternatives__Group_1_1__0 )
            {
             before(grammarAccess.getTerminalAlternativesAccess().getGroup_1_1()); 
            // InternalXtext.g:7547:3: ( rule__TerminalAlternatives__Group_1_1__0 )
            // InternalXtext.g:7547:4: rule__TerminalAlternatives__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__TerminalAlternatives__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAlternativesAccess().getGroup_1_1()); 

            }

            // InternalXtext.g:7550:2: ( ( rule__TerminalAlternatives__Group_1_1__0 )* )
            // InternalXtext.g:7551:3: ( rule__TerminalAlternatives__Group_1_1__0 )*
            {
             before(grammarAccess.getTerminalAlternativesAccess().getGroup_1_1()); 
            // InternalXtext.g:7552:3: ( rule__TerminalAlternatives__Group_1_1__0 )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==37) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalXtext.g:7552:4: rule__TerminalAlternatives__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__TerminalAlternatives__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

             after(grammarAccess.getTerminalAlternativesAccess().getGroup_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalAlternatives__Group_1_1__0"
    // InternalXtext.g:7562:1: rule__TerminalAlternatives__Group_1_1__0 : rule__TerminalAlternatives__Group_1_1__0__Impl rule__TerminalAlternatives__Group_1_1__1 ;
    public final void rule__TerminalAlternatives__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7566:1: ( rule__TerminalAlternatives__Group_1_1__0__Impl rule__TerminalAlternatives__Group_1_1__1 )
            // InternalXtext.g:7567:2: rule__TerminalAlternatives__Group_1_1__0__Impl rule__TerminalAlternatives__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__TerminalAlternatives__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group_1_1__0"


    // $ANTLR start "rule__TerminalAlternatives__Group_1_1__0__Impl"
    // InternalXtext.g:7574:1: rule__TerminalAlternatives__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__TerminalAlternatives__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7578:1: ( ( '|' ) )
            // InternalXtext.g:7579:1: ( '|' )
            {
            // InternalXtext.g:7579:1: ( '|' )
            // InternalXtext.g:7580:2: '|'
            {
             before(grammarAccess.getTerminalAlternativesAccess().getVerticalLineKeyword_1_1_0()); 
            match(input,37,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTerminalAlternativesAccess().getVerticalLineKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group_1_1__0__Impl"


    // $ANTLR start "rule__TerminalAlternatives__Group_1_1__1"
    // InternalXtext.g:7589:1: rule__TerminalAlternatives__Group_1_1__1 : rule__TerminalAlternatives__Group_1_1__1__Impl ;
    public final void rule__TerminalAlternatives__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7593:1: ( rule__TerminalAlternatives__Group_1_1__1__Impl )
            // InternalXtext.g:7594:2: rule__TerminalAlternatives__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group_1_1__1"


    // $ANTLR start "rule__TerminalAlternatives__Group_1_1__1__Impl"
    // InternalXtext.g:7600:1: rule__TerminalAlternatives__Group_1_1__1__Impl : ( ( rule__TerminalAlternatives__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__TerminalAlternatives__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7604:1: ( ( ( rule__TerminalAlternatives__ElementsAssignment_1_1_1 ) ) )
            // InternalXtext.g:7605:1: ( ( rule__TerminalAlternatives__ElementsAssignment_1_1_1 ) )
            {
            // InternalXtext.g:7605:1: ( ( rule__TerminalAlternatives__ElementsAssignment_1_1_1 ) )
            // InternalXtext.g:7606:2: ( rule__TerminalAlternatives__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getTerminalAlternativesAccess().getElementsAssignment_1_1_1()); 
            // InternalXtext.g:7607:2: ( rule__TerminalAlternatives__ElementsAssignment_1_1_1 )
            // InternalXtext.g:7607:3: rule__TerminalAlternatives__ElementsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAlternativesAccess().getElementsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group_1_1__1__Impl"


    // $ANTLR start "rule__TerminalGroup__Group__0"
    // InternalXtext.g:7616:1: rule__TerminalGroup__Group__0 : rule__TerminalGroup__Group__0__Impl rule__TerminalGroup__Group__1 ;
    public final void rule__TerminalGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7620:1: ( rule__TerminalGroup__Group__0__Impl rule__TerminalGroup__Group__1 )
            // InternalXtext.g:7621:2: rule__TerminalGroup__Group__0__Impl rule__TerminalGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__TerminalGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__Group__0"


    // $ANTLR start "rule__TerminalGroup__Group__0__Impl"
    // InternalXtext.g:7628:1: rule__TerminalGroup__Group__0__Impl : ( ruleTerminalToken ) ;
    public final void rule__TerminalGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7632:1: ( ( ruleTerminalToken ) )
            // InternalXtext.g:7633:1: ( ruleTerminalToken )
            {
            // InternalXtext.g:7633:1: ( ruleTerminalToken )
            // InternalXtext.g:7634:2: ruleTerminalToken
            {
             before(grammarAccess.getTerminalGroupAccess().getTerminalTokenParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalToken();

            state._fsp--;

             after(grammarAccess.getTerminalGroupAccess().getTerminalTokenParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__Group__0__Impl"


    // $ANTLR start "rule__TerminalGroup__Group__1"
    // InternalXtext.g:7643:1: rule__TerminalGroup__Group__1 : rule__TerminalGroup__Group__1__Impl ;
    public final void rule__TerminalGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7647:1: ( rule__TerminalGroup__Group__1__Impl )
            // InternalXtext.g:7648:2: rule__TerminalGroup__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalGroup__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__Group__1"


    // $ANTLR start "rule__TerminalGroup__Group__1__Impl"
    // InternalXtext.g:7654:1: rule__TerminalGroup__Group__1__Impl : ( ( rule__TerminalGroup__Group_1__0 )? ) ;
    public final void rule__TerminalGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7658:1: ( ( ( rule__TerminalGroup__Group_1__0 )? ) )
            // InternalXtext.g:7659:1: ( ( rule__TerminalGroup__Group_1__0 )? )
            {
            // InternalXtext.g:7659:1: ( ( rule__TerminalGroup__Group_1__0 )? )
            // InternalXtext.g:7660:2: ( rule__TerminalGroup__Group_1__0 )?
            {
             before(grammarAccess.getTerminalGroupAccess().getGroup_1()); 
            // InternalXtext.g:7661:2: ( rule__TerminalGroup__Group_1__0 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=RULE_ID && LA73_0<=RULE_STRING)||(LA73_0>=17 && LA73_0<=18)||LA73_0==23||LA73_0==25||LA73_0==42||(LA73_0>=46 && LA73_0<=47)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalXtext.g:7661:3: rule__TerminalGroup__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TerminalGroup__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminalGroupAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__Group__1__Impl"


    // $ANTLR start "rule__TerminalGroup__Group_1__0"
    // InternalXtext.g:7670:1: rule__TerminalGroup__Group_1__0 : rule__TerminalGroup__Group_1__0__Impl rule__TerminalGroup__Group_1__1 ;
    public final void rule__TerminalGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7674:1: ( rule__TerminalGroup__Group_1__0__Impl rule__TerminalGroup__Group_1__1 )
            // InternalXtext.g:7675:2: rule__TerminalGroup__Group_1__0__Impl rule__TerminalGroup__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__TerminalGroup__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalGroup__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__Group_1__0"


    // $ANTLR start "rule__TerminalGroup__Group_1__0__Impl"
    // InternalXtext.g:7682:1: rule__TerminalGroup__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7686:1: ( ( () ) )
            // InternalXtext.g:7687:1: ( () )
            {
            // InternalXtext.g:7687:1: ( () )
            // InternalXtext.g:7688:2: ()
            {
             before(grammarAccess.getTerminalGroupAccess().getGroupElementsAction_1_0()); 
            // InternalXtext.g:7689:2: ()
            // InternalXtext.g:7689:3: 
            {
            }

             after(grammarAccess.getTerminalGroupAccess().getGroupElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__Group_1__0__Impl"


    // $ANTLR start "rule__TerminalGroup__Group_1__1"
    // InternalXtext.g:7697:1: rule__TerminalGroup__Group_1__1 : rule__TerminalGroup__Group_1__1__Impl ;
    public final void rule__TerminalGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7701:1: ( rule__TerminalGroup__Group_1__1__Impl )
            // InternalXtext.g:7702:2: rule__TerminalGroup__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalGroup__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__Group_1__1"


    // $ANTLR start "rule__TerminalGroup__Group_1__1__Impl"
    // InternalXtext.g:7708:1: rule__TerminalGroup__Group_1__1__Impl : ( ( ( rule__TerminalGroup__ElementsAssignment_1_1 ) ) ( ( rule__TerminalGroup__ElementsAssignment_1_1 )* ) ) ;
    public final void rule__TerminalGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7712:1: ( ( ( ( rule__TerminalGroup__ElementsAssignment_1_1 ) ) ( ( rule__TerminalGroup__ElementsAssignment_1_1 )* ) ) )
            // InternalXtext.g:7713:1: ( ( ( rule__TerminalGroup__ElementsAssignment_1_1 ) ) ( ( rule__TerminalGroup__ElementsAssignment_1_1 )* ) )
            {
            // InternalXtext.g:7713:1: ( ( ( rule__TerminalGroup__ElementsAssignment_1_1 ) ) ( ( rule__TerminalGroup__ElementsAssignment_1_1 )* ) )
            // InternalXtext.g:7714:2: ( ( rule__TerminalGroup__ElementsAssignment_1_1 ) ) ( ( rule__TerminalGroup__ElementsAssignment_1_1 )* )
            {
            // InternalXtext.g:7714:2: ( ( rule__TerminalGroup__ElementsAssignment_1_1 ) )
            // InternalXtext.g:7715:3: ( rule__TerminalGroup__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getTerminalGroupAccess().getElementsAssignment_1_1()); 
            // InternalXtext.g:7716:3: ( rule__TerminalGroup__ElementsAssignment_1_1 )
            // InternalXtext.g:7716:4: rule__TerminalGroup__ElementsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_54);
            rule__TerminalGroup__ElementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalGroupAccess().getElementsAssignment_1_1()); 

            }

            // InternalXtext.g:7719:2: ( ( rule__TerminalGroup__ElementsAssignment_1_1 )* )
            // InternalXtext.g:7720:3: ( rule__TerminalGroup__ElementsAssignment_1_1 )*
            {
             before(grammarAccess.getTerminalGroupAccess().getElementsAssignment_1_1()); 
            // InternalXtext.g:7721:3: ( rule__TerminalGroup__ElementsAssignment_1_1 )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=RULE_ID && LA74_0<=RULE_STRING)||(LA74_0>=17 && LA74_0<=18)||LA74_0==23||LA74_0==25||LA74_0==42||(LA74_0>=46 && LA74_0<=47)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalXtext.g:7721:4: rule__TerminalGroup__ElementsAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_54);
            	    rule__TerminalGroup__ElementsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

             after(grammarAccess.getTerminalGroupAccess().getElementsAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalToken__Group__0"
    // InternalXtext.g:7731:1: rule__TerminalToken__Group__0 : rule__TerminalToken__Group__0__Impl rule__TerminalToken__Group__1 ;
    public final void rule__TerminalToken__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7735:1: ( rule__TerminalToken__Group__0__Impl rule__TerminalToken__Group__1 )
            // InternalXtext.g:7736:2: rule__TerminalToken__Group__0__Impl rule__TerminalToken__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__TerminalToken__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalToken__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalToken__Group__0"


    // $ANTLR start "rule__TerminalToken__Group__0__Impl"
    // InternalXtext.g:7743:1: rule__TerminalToken__Group__0__Impl : ( ruleTerminalTokenElement ) ;
    public final void rule__TerminalToken__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7747:1: ( ( ruleTerminalTokenElement ) )
            // InternalXtext.g:7748:1: ( ruleTerminalTokenElement )
            {
            // InternalXtext.g:7748:1: ( ruleTerminalTokenElement )
            // InternalXtext.g:7749:2: ruleTerminalTokenElement
            {
             before(grammarAccess.getTerminalTokenAccess().getTerminalTokenElementParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalTokenElement();

            state._fsp--;

             after(grammarAccess.getTerminalTokenAccess().getTerminalTokenElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalToken__Group__0__Impl"


    // $ANTLR start "rule__TerminalToken__Group__1"
    // InternalXtext.g:7758:1: rule__TerminalToken__Group__1 : rule__TerminalToken__Group__1__Impl ;
    public final void rule__TerminalToken__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7762:1: ( rule__TerminalToken__Group__1__Impl )
            // InternalXtext.g:7763:2: rule__TerminalToken__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalToken__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalToken__Group__1"


    // $ANTLR start "rule__TerminalToken__Group__1__Impl"
    // InternalXtext.g:7769:1: rule__TerminalToken__Group__1__Impl : ( ( rule__TerminalToken__CardinalityAssignment_1 )? ) ;
    public final void rule__TerminalToken__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7773:1: ( ( ( rule__TerminalToken__CardinalityAssignment_1 )? ) )
            // InternalXtext.g:7774:1: ( ( rule__TerminalToken__CardinalityAssignment_1 )? )
            {
            // InternalXtext.g:7774:1: ( ( rule__TerminalToken__CardinalityAssignment_1 )? )
            // InternalXtext.g:7775:2: ( rule__TerminalToken__CardinalityAssignment_1 )?
            {
             before(grammarAccess.getTerminalTokenAccess().getCardinalityAssignment_1()); 
            // InternalXtext.g:7776:2: ( rule__TerminalToken__CardinalityAssignment_1 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=12 && LA75_0<=14)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalXtext.g:7776:3: rule__TerminalToken__CardinalityAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TerminalToken__CardinalityAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminalTokenAccess().getCardinalityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalToken__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedTerminalElement__Group__0"
    // InternalXtext.g:7785:1: rule__ParenthesizedTerminalElement__Group__0 : rule__ParenthesizedTerminalElement__Group__0__Impl rule__ParenthesizedTerminalElement__Group__1 ;
    public final void rule__ParenthesizedTerminalElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7789:1: ( rule__ParenthesizedTerminalElement__Group__0__Impl rule__ParenthesizedTerminalElement__Group__1 )
            // InternalXtext.g:7790:2: rule__ParenthesizedTerminalElement__Group__0__Impl rule__ParenthesizedTerminalElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__ParenthesizedTerminalElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedTerminalElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedTerminalElement__Group__0"


    // $ANTLR start "rule__ParenthesizedTerminalElement__Group__0__Impl"
    // InternalXtext.g:7797:1: rule__ParenthesizedTerminalElement__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedTerminalElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7801:1: ( ( '(' ) )
            // InternalXtext.g:7802:1: ( '(' )
            {
            // InternalXtext.g:7802:1: ( '(' )
            // InternalXtext.g:7803:2: '('
            {
             before(grammarAccess.getParenthesizedTerminalElementAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedTerminalElementAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedTerminalElement__Group__0__Impl"


    // $ANTLR start "rule__ParenthesizedTerminalElement__Group__1"
    // InternalXtext.g:7812:1: rule__ParenthesizedTerminalElement__Group__1 : rule__ParenthesizedTerminalElement__Group__1__Impl rule__ParenthesizedTerminalElement__Group__2 ;
    public final void rule__ParenthesizedTerminalElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7816:1: ( rule__ParenthesizedTerminalElement__Group__1__Impl rule__ParenthesizedTerminalElement__Group__2 )
            // InternalXtext.g:7817:2: rule__ParenthesizedTerminalElement__Group__1__Impl rule__ParenthesizedTerminalElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__ParenthesizedTerminalElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedTerminalElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedTerminalElement__Group__1"


    // $ANTLR start "rule__ParenthesizedTerminalElement__Group__1__Impl"
    // InternalXtext.g:7824:1: rule__ParenthesizedTerminalElement__Group__1__Impl : ( ruleTerminalAlternatives ) ;
    public final void rule__ParenthesizedTerminalElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7828:1: ( ( ruleTerminalAlternatives ) )
            // InternalXtext.g:7829:1: ( ruleTerminalAlternatives )
            {
            // InternalXtext.g:7829:1: ( ruleTerminalAlternatives )
            // InternalXtext.g:7830:2: ruleTerminalAlternatives
            {
             before(grammarAccess.getParenthesizedTerminalElementAccess().getTerminalAlternativesParserRuleCall_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalAlternatives();

            state._fsp--;

             after(grammarAccess.getParenthesizedTerminalElementAccess().getTerminalAlternativesParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedTerminalElement__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedTerminalElement__Group__2"
    // InternalXtext.g:7839:1: rule__ParenthesizedTerminalElement__Group__2 : rule__ParenthesizedTerminalElement__Group__2__Impl ;
    public final void rule__ParenthesizedTerminalElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7843:1: ( rule__ParenthesizedTerminalElement__Group__2__Impl )
            // InternalXtext.g:7844:2: rule__ParenthesizedTerminalElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedTerminalElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedTerminalElement__Group__2"


    // $ANTLR start "rule__ParenthesizedTerminalElement__Group__2__Impl"
    // InternalXtext.g:7850:1: rule__ParenthesizedTerminalElement__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedTerminalElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7854:1: ( ( ')' ) )
            // InternalXtext.g:7855:1: ( ')' )
            {
            // InternalXtext.g:7855:1: ( ')' )
            // InternalXtext.g:7856:2: ')'
            {
             before(grammarAccess.getParenthesizedTerminalElementAccess().getRightParenthesisKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedTerminalElementAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedTerminalElement__Group__2__Impl"


    // $ANTLR start "rule__NegatedToken__Group__0"
    // InternalXtext.g:7866:1: rule__NegatedToken__Group__0 : rule__NegatedToken__Group__0__Impl rule__NegatedToken__Group__1 ;
    public final void rule__NegatedToken__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7870:1: ( rule__NegatedToken__Group__0__Impl rule__NegatedToken__Group__1 )
            // InternalXtext.g:7871:2: rule__NegatedToken__Group__0__Impl rule__NegatedToken__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__NegatedToken__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegatedToken__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedToken__Group__0"


    // $ANTLR start "rule__NegatedToken__Group__0__Impl"
    // InternalXtext.g:7878:1: rule__NegatedToken__Group__0__Impl : ( '!' ) ;
    public final void rule__NegatedToken__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7882:1: ( ( '!' ) )
            // InternalXtext.g:7883:1: ( '!' )
            {
            // InternalXtext.g:7883:1: ( '!' )
            // InternalXtext.g:7884:2: '!'
            {
             before(grammarAccess.getNegatedTokenAccess().getExclamationMarkKeyword_0()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getNegatedTokenAccess().getExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedToken__Group__0__Impl"


    // $ANTLR start "rule__NegatedToken__Group__1"
    // InternalXtext.g:7893:1: rule__NegatedToken__Group__1 : rule__NegatedToken__Group__1__Impl ;
    public final void rule__NegatedToken__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7897:1: ( rule__NegatedToken__Group__1__Impl )
            // InternalXtext.g:7898:2: rule__NegatedToken__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegatedToken__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedToken__Group__1"


    // $ANTLR start "rule__NegatedToken__Group__1__Impl"
    // InternalXtext.g:7904:1: rule__NegatedToken__Group__1__Impl : ( ( rule__NegatedToken__TerminalAssignment_1 ) ) ;
    public final void rule__NegatedToken__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7908:1: ( ( ( rule__NegatedToken__TerminalAssignment_1 ) ) )
            // InternalXtext.g:7909:1: ( ( rule__NegatedToken__TerminalAssignment_1 ) )
            {
            // InternalXtext.g:7909:1: ( ( rule__NegatedToken__TerminalAssignment_1 ) )
            // InternalXtext.g:7910:2: ( rule__NegatedToken__TerminalAssignment_1 )
            {
             before(grammarAccess.getNegatedTokenAccess().getTerminalAssignment_1()); 
            // InternalXtext.g:7911:2: ( rule__NegatedToken__TerminalAssignment_1 )
            // InternalXtext.g:7911:3: rule__NegatedToken__TerminalAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegatedToken__TerminalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNegatedTokenAccess().getTerminalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedToken__Group__1__Impl"


    // $ANTLR start "rule__UntilToken__Group__0"
    // InternalXtext.g:7920:1: rule__UntilToken__Group__0 : rule__UntilToken__Group__0__Impl rule__UntilToken__Group__1 ;
    public final void rule__UntilToken__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7924:1: ( rule__UntilToken__Group__0__Impl rule__UntilToken__Group__1 )
            // InternalXtext.g:7925:2: rule__UntilToken__Group__0__Impl rule__UntilToken__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__UntilToken__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UntilToken__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntilToken__Group__0"


    // $ANTLR start "rule__UntilToken__Group__0__Impl"
    // InternalXtext.g:7932:1: rule__UntilToken__Group__0__Impl : ( '->' ) ;
    public final void rule__UntilToken__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7936:1: ( ( '->' ) )
            // InternalXtext.g:7937:1: ( '->' )
            {
            // InternalXtext.g:7937:1: ( '->' )
            // InternalXtext.g:7938:2: '->'
            {
             before(grammarAccess.getUntilTokenAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,46,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getUntilTokenAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntilToken__Group__0__Impl"


    // $ANTLR start "rule__UntilToken__Group__1"
    // InternalXtext.g:7947:1: rule__UntilToken__Group__1 : rule__UntilToken__Group__1__Impl ;
    public final void rule__UntilToken__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7951:1: ( rule__UntilToken__Group__1__Impl )
            // InternalXtext.g:7952:2: rule__UntilToken__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UntilToken__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntilToken__Group__1"


    // $ANTLR start "rule__UntilToken__Group__1__Impl"
    // InternalXtext.g:7958:1: rule__UntilToken__Group__1__Impl : ( ( rule__UntilToken__TerminalAssignment_1 ) ) ;
    public final void rule__UntilToken__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7962:1: ( ( ( rule__UntilToken__TerminalAssignment_1 ) ) )
            // InternalXtext.g:7963:1: ( ( rule__UntilToken__TerminalAssignment_1 ) )
            {
            // InternalXtext.g:7963:1: ( ( rule__UntilToken__TerminalAssignment_1 ) )
            // InternalXtext.g:7964:2: ( rule__UntilToken__TerminalAssignment_1 )
            {
             before(grammarAccess.getUntilTokenAccess().getTerminalAssignment_1()); 
            // InternalXtext.g:7965:2: ( rule__UntilToken__TerminalAssignment_1 )
            // InternalXtext.g:7965:3: rule__UntilToken__TerminalAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UntilToken__TerminalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUntilTokenAccess().getTerminalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntilToken__Group__1__Impl"


    // $ANTLR start "rule__Wildcard__Group__0"
    // InternalXtext.g:7974:1: rule__Wildcard__Group__0 : rule__Wildcard__Group__0__Impl rule__Wildcard__Group__1 ;
    public final void rule__Wildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7978:1: ( rule__Wildcard__Group__0__Impl rule__Wildcard__Group__1 )
            // InternalXtext.g:7979:2: rule__Wildcard__Group__0__Impl rule__Wildcard__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Wildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Wildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wildcard__Group__0"


    // $ANTLR start "rule__Wildcard__Group__0__Impl"
    // InternalXtext.g:7986:1: rule__Wildcard__Group__0__Impl : ( () ) ;
    public final void rule__Wildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:7990:1: ( ( () ) )
            // InternalXtext.g:7991:1: ( () )
            {
            // InternalXtext.g:7991:1: ( () )
            // InternalXtext.g:7992:2: ()
            {
             before(grammarAccess.getWildcardAccess().getWildcardAction_0()); 
            // InternalXtext.g:7993:2: ()
            // InternalXtext.g:7993:3: 
            {
            }

             after(grammarAccess.getWildcardAccess().getWildcardAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wildcard__Group__0__Impl"


    // $ANTLR start "rule__Wildcard__Group__1"
    // InternalXtext.g:8001:1: rule__Wildcard__Group__1 : rule__Wildcard__Group__1__Impl ;
    public final void rule__Wildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8005:1: ( rule__Wildcard__Group__1__Impl )
            // InternalXtext.g:8006:2: rule__Wildcard__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Wildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wildcard__Group__1"


    // $ANTLR start "rule__Wildcard__Group__1__Impl"
    // InternalXtext.g:8012:1: rule__Wildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__Wildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8016:1: ( ( '.' ) )
            // InternalXtext.g:8017:1: ( '.' )
            {
            // InternalXtext.g:8017:1: ( '.' )
            // InternalXtext.g:8018:2: '.'
            {
             before(grammarAccess.getWildcardAccess().getFullStopKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getWildcardAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wildcard__Group__1__Impl"


    // $ANTLR start "rule__EOF__Group__0"
    // InternalXtext.g:8028:1: rule__EOF__Group__0 : rule__EOF__Group__0__Impl rule__EOF__Group__1 ;
    public final void rule__EOF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8032:1: ( rule__EOF__Group__0__Impl rule__EOF__Group__1 )
            // InternalXtext.g:8033:2: rule__EOF__Group__0__Impl rule__EOF__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__EOF__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EOF__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EOF__Group__0"


    // $ANTLR start "rule__EOF__Group__0__Impl"
    // InternalXtext.g:8040:1: rule__EOF__Group__0__Impl : ( () ) ;
    public final void rule__EOF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8044:1: ( ( () ) )
            // InternalXtext.g:8045:1: ( () )
            {
            // InternalXtext.g:8045:1: ( () )
            // InternalXtext.g:8046:2: ()
            {
             before(grammarAccess.getEOFAccess().getEOFAction_0()); 
            // InternalXtext.g:8047:2: ()
            // InternalXtext.g:8047:3: 
            {
            }

             after(grammarAccess.getEOFAccess().getEOFAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EOF__Group__0__Impl"


    // $ANTLR start "rule__EOF__Group__1"
    // InternalXtext.g:8055:1: rule__EOF__Group__1 : rule__EOF__Group__1__Impl ;
    public final void rule__EOF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8059:1: ( rule__EOF__Group__1__Impl )
            // InternalXtext.g:8060:2: rule__EOF__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EOF__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EOF__Group__1"


    // $ANTLR start "rule__EOF__Group__1__Impl"
    // InternalXtext.g:8066:1: rule__EOF__Group__1__Impl : ( 'EOF' ) ;
    public final void rule__EOF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8070:1: ( ( 'EOF' ) )
            // InternalXtext.g:8071:1: ( 'EOF' )
            {
            // InternalXtext.g:8071:1: ( 'EOF' )
            // InternalXtext.g:8072:2: 'EOF'
            {
             before(grammarAccess.getEOFAccess().getEOFKeyword_1()); 
            match(input,47,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEOFAccess().getEOFKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EOF__Group__1__Impl"


    // $ANTLR start "rule__CharacterRange__Group__0"
    // InternalXtext.g:8082:1: rule__CharacterRange__Group__0 : rule__CharacterRange__Group__0__Impl rule__CharacterRange__Group__1 ;
    public final void rule__CharacterRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8086:1: ( rule__CharacterRange__Group__0__Impl rule__CharacterRange__Group__1 )
            // InternalXtext.g:8087:2: rule__CharacterRange__Group__0__Impl rule__CharacterRange__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_55);
            rule__CharacterRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__CharacterRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group__0"


    // $ANTLR start "rule__CharacterRange__Group__0__Impl"
    // InternalXtext.g:8094:1: rule__CharacterRange__Group__0__Impl : ( ruleKeyword ) ;
    public final void rule__CharacterRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8098:1: ( ( ruleKeyword ) )
            // InternalXtext.g:8099:1: ( ruleKeyword )
            {
            // InternalXtext.g:8099:1: ( ruleKeyword )
            // InternalXtext.g:8100:2: ruleKeyword
            {
             before(grammarAccess.getCharacterRangeAccess().getKeywordParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getCharacterRangeAccess().getKeywordParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group__0__Impl"


    // $ANTLR start "rule__CharacterRange__Group__1"
    // InternalXtext.g:8109:1: rule__CharacterRange__Group__1 : rule__CharacterRange__Group__1__Impl ;
    public final void rule__CharacterRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8113:1: ( rule__CharacterRange__Group__1__Impl )
            // InternalXtext.g:8114:2: rule__CharacterRange__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CharacterRange__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group__1"


    // $ANTLR start "rule__CharacterRange__Group__1__Impl"
    // InternalXtext.g:8120:1: rule__CharacterRange__Group__1__Impl : ( ( rule__CharacterRange__Group_1__0 )? ) ;
    public final void rule__CharacterRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8124:1: ( ( ( rule__CharacterRange__Group_1__0 )? ) )
            // InternalXtext.g:8125:1: ( ( rule__CharacterRange__Group_1__0 )? )
            {
            // InternalXtext.g:8125:1: ( ( rule__CharacterRange__Group_1__0 )? )
            // InternalXtext.g:8126:2: ( rule__CharacterRange__Group_1__0 )?
            {
             before(grammarAccess.getCharacterRangeAccess().getGroup_1()); 
            // InternalXtext.g:8127:2: ( rule__CharacterRange__Group_1__0 )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==48) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalXtext.g:8127:3: rule__CharacterRange__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__CharacterRange__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacterRangeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group__1__Impl"


    // $ANTLR start "rule__CharacterRange__Group_1__0"
    // InternalXtext.g:8136:1: rule__CharacterRange__Group_1__0 : rule__CharacterRange__Group_1__0__Impl rule__CharacterRange__Group_1__1 ;
    public final void rule__CharacterRange__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8140:1: ( rule__CharacterRange__Group_1__0__Impl rule__CharacterRange__Group_1__1 )
            // InternalXtext.g:8141:2: rule__CharacterRange__Group_1__0__Impl rule__CharacterRange__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_55);
            rule__CharacterRange__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__CharacterRange__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group_1__0"


    // $ANTLR start "rule__CharacterRange__Group_1__0__Impl"
    // InternalXtext.g:8148:1: rule__CharacterRange__Group_1__0__Impl : ( () ) ;
    public final void rule__CharacterRange__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8152:1: ( ( () ) )
            // InternalXtext.g:8153:1: ( () )
            {
            // InternalXtext.g:8153:1: ( () )
            // InternalXtext.g:8154:2: ()
            {
             before(grammarAccess.getCharacterRangeAccess().getCharacterRangeLeftAction_1_0()); 
            // InternalXtext.g:8155:2: ()
            // InternalXtext.g:8155:3: 
            {
            }

             after(grammarAccess.getCharacterRangeAccess().getCharacterRangeLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group_1__0__Impl"


    // $ANTLR start "rule__CharacterRange__Group_1__1"
    // InternalXtext.g:8163:1: rule__CharacterRange__Group_1__1 : rule__CharacterRange__Group_1__1__Impl rule__CharacterRange__Group_1__2 ;
    public final void rule__CharacterRange__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8167:1: ( rule__CharacterRange__Group_1__1__Impl rule__CharacterRange__Group_1__2 )
            // InternalXtext.g:8168:2: rule__CharacterRange__Group_1__1__Impl rule__CharacterRange__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__CharacterRange__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__CharacterRange__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group_1__1"


    // $ANTLR start "rule__CharacterRange__Group_1__1__Impl"
    // InternalXtext.g:8175:1: rule__CharacterRange__Group_1__1__Impl : ( '..' ) ;
    public final void rule__CharacterRange__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8179:1: ( ( '..' ) )
            // InternalXtext.g:8180:1: ( '..' )
            {
            // InternalXtext.g:8180:1: ( '..' )
            // InternalXtext.g:8181:2: '..'
            {
             before(grammarAccess.getCharacterRangeAccess().getFullStopFullStopKeyword_1_1()); 
            match(input,48,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCharacterRangeAccess().getFullStopFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group_1__1__Impl"


    // $ANTLR start "rule__CharacterRange__Group_1__2"
    // InternalXtext.g:8190:1: rule__CharacterRange__Group_1__2 : rule__CharacterRange__Group_1__2__Impl ;
    public final void rule__CharacterRange__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8194:1: ( rule__CharacterRange__Group_1__2__Impl )
            // InternalXtext.g:8195:2: rule__CharacterRange__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CharacterRange__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group_1__2"


    // $ANTLR start "rule__CharacterRange__Group_1__2__Impl"
    // InternalXtext.g:8201:1: rule__CharacterRange__Group_1__2__Impl : ( ( rule__CharacterRange__RightAssignment_1_2 ) ) ;
    public final void rule__CharacterRange__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8205:1: ( ( ( rule__CharacterRange__RightAssignment_1_2 ) ) )
            // InternalXtext.g:8206:1: ( ( rule__CharacterRange__RightAssignment_1_2 ) )
            {
            // InternalXtext.g:8206:1: ( ( rule__CharacterRange__RightAssignment_1_2 ) )
            // InternalXtext.g:8207:2: ( rule__CharacterRange__RightAssignment_1_2 )
            {
             before(grammarAccess.getCharacterRangeAccess().getRightAssignment_1_2()); 
            // InternalXtext.g:8208:2: ( rule__CharacterRange__RightAssignment_1_2 )
            // InternalXtext.g:8208:3: rule__CharacterRange__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CharacterRange__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCharacterRangeAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group_1__2__Impl"


    // $ANTLR start "rule__EnumRule__Group__0"
    // InternalXtext.g:8217:1: rule__EnumRule__Group__0 : rule__EnumRule__Group__0__Impl rule__EnumRule__Group__1 ;
    public final void rule__EnumRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8221:1: ( rule__EnumRule__Group__0__Impl rule__EnumRule__Group__1 )
            // InternalXtext.g:8222:2: rule__EnumRule__Group__0__Impl rule__EnumRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__EnumRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__0"


    // $ANTLR start "rule__EnumRule__Group__0__Impl"
    // InternalXtext.g:8229:1: rule__EnumRule__Group__0__Impl : ( ( rule__EnumRule__AnnotationsAssignment_0 )* ) ;
    public final void rule__EnumRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8233:1: ( ( ( rule__EnumRule__AnnotationsAssignment_0 )* ) )
            // InternalXtext.g:8234:1: ( ( rule__EnumRule__AnnotationsAssignment_0 )* )
            {
            // InternalXtext.g:8234:1: ( ( rule__EnumRule__AnnotationsAssignment_0 )* )
            // InternalXtext.g:8235:2: ( rule__EnumRule__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getEnumRuleAccess().getAnnotationsAssignment_0()); 
            // InternalXtext.g:8236:2: ( rule__EnumRule__AnnotationsAssignment_0 )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==29) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalXtext.g:8236:3: rule__EnumRule__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__EnumRule__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

             after(grammarAccess.getEnumRuleAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__0__Impl"


    // $ANTLR start "rule__EnumRule__Group__1"
    // InternalXtext.g:8244:1: rule__EnumRule__Group__1 : rule__EnumRule__Group__1__Impl rule__EnumRule__Group__2 ;
    public final void rule__EnumRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8248:1: ( rule__EnumRule__Group__1__Impl rule__EnumRule__Group__2 )
            // InternalXtext.g:8249:2: rule__EnumRule__Group__1__Impl rule__EnumRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__EnumRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__1"


    // $ANTLR start "rule__EnumRule__Group__1__Impl"
    // InternalXtext.g:8256:1: rule__EnumRule__Group__1__Impl : ( 'enum' ) ;
    public final void rule__EnumRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8260:1: ( ( 'enum' ) )
            // InternalXtext.g:8261:1: ( 'enum' )
            {
            // InternalXtext.g:8261:1: ( 'enum' )
            // InternalXtext.g:8262:2: 'enum'
            {
             before(grammarAccess.getEnumRuleAccess().getEnumKeyword_1()); 
            match(input,49,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumRuleAccess().getEnumKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__1__Impl"


    // $ANTLR start "rule__EnumRule__Group__2"
    // InternalXtext.g:8271:1: rule__EnumRule__Group__2 : rule__EnumRule__Group__2__Impl rule__EnumRule__Group__3 ;
    public final void rule__EnumRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8275:1: ( rule__EnumRule__Group__2__Impl rule__EnumRule__Group__3 )
            // InternalXtext.g:8276:2: rule__EnumRule__Group__2__Impl rule__EnumRule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_56);
            rule__EnumRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__2"


    // $ANTLR start "rule__EnumRule__Group__2__Impl"
    // InternalXtext.g:8283:1: rule__EnumRule__Group__2__Impl : ( ( rule__EnumRule__NameAssignment_2 ) ) ;
    public final void rule__EnumRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8287:1: ( ( ( rule__EnumRule__NameAssignment_2 ) ) )
            // InternalXtext.g:8288:1: ( ( rule__EnumRule__NameAssignment_2 ) )
            {
            // InternalXtext.g:8288:1: ( ( rule__EnumRule__NameAssignment_2 ) )
            // InternalXtext.g:8289:2: ( rule__EnumRule__NameAssignment_2 )
            {
             before(grammarAccess.getEnumRuleAccess().getNameAssignment_2()); 
            // InternalXtext.g:8290:2: ( rule__EnumRule__NameAssignment_2 )
            // InternalXtext.g:8290:3: rule__EnumRule__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__2__Impl"


    // $ANTLR start "rule__EnumRule__Group__3"
    // InternalXtext.g:8298:1: rule__EnumRule__Group__3 : rule__EnumRule__Group__3__Impl rule__EnumRule__Group__4 ;
    public final void rule__EnumRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8302:1: ( rule__EnumRule__Group__3__Impl rule__EnumRule__Group__4 )
            // InternalXtext.g:8303:2: rule__EnumRule__Group__3__Impl rule__EnumRule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_56);
            rule__EnumRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__3"


    // $ANTLR start "rule__EnumRule__Group__3__Impl"
    // InternalXtext.g:8310:1: rule__EnumRule__Group__3__Impl : ( ( rule__EnumRule__Group_3__0 )? ) ;
    public final void rule__EnumRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8314:1: ( ( ( rule__EnumRule__Group_3__0 )? ) )
            // InternalXtext.g:8315:1: ( ( rule__EnumRule__Group_3__0 )? )
            {
            // InternalXtext.g:8315:1: ( ( rule__EnumRule__Group_3__0 )? )
            // InternalXtext.g:8316:2: ( rule__EnumRule__Group_3__0 )?
            {
             before(grammarAccess.getEnumRuleAccess().getGroup_3()); 
            // InternalXtext.g:8317:2: ( rule__EnumRule__Group_3__0 )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==32) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalXtext.g:8317:3: rule__EnumRule__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EnumRule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumRuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__3__Impl"


    // $ANTLR start "rule__EnumRule__Group__4"
    // InternalXtext.g:8325:1: rule__EnumRule__Group__4 : rule__EnumRule__Group__4__Impl rule__EnumRule__Group__5 ;
    public final void rule__EnumRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8329:1: ( rule__EnumRule__Group__4__Impl rule__EnumRule__Group__5 )
            // InternalXtext.g:8330:2: rule__EnumRule__Group__4__Impl rule__EnumRule__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__EnumRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__4"


    // $ANTLR start "rule__EnumRule__Group__4__Impl"
    // InternalXtext.g:8337:1: rule__EnumRule__Group__4__Impl : ( ':' ) ;
    public final void rule__EnumRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8341:1: ( ( ':' ) )
            // InternalXtext.g:8342:1: ( ':' )
            {
            // InternalXtext.g:8342:1: ( ':' )
            // InternalXtext.g:8343:2: ':'
            {
             before(grammarAccess.getEnumRuleAccess().getColonKeyword_4()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumRuleAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__4__Impl"


    // $ANTLR start "rule__EnumRule__Group__5"
    // InternalXtext.g:8352:1: rule__EnumRule__Group__5 : rule__EnumRule__Group__5__Impl rule__EnumRule__Group__6 ;
    public final void rule__EnumRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8356:1: ( rule__EnumRule__Group__5__Impl rule__EnumRule__Group__6 )
            // InternalXtext.g:8357:2: rule__EnumRule__Group__5__Impl rule__EnumRule__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__EnumRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__5"


    // $ANTLR start "rule__EnumRule__Group__5__Impl"
    // InternalXtext.g:8364:1: rule__EnumRule__Group__5__Impl : ( ( rule__EnumRule__AlternativesAssignment_5 ) ) ;
    public final void rule__EnumRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8368:1: ( ( ( rule__EnumRule__AlternativesAssignment_5 ) ) )
            // InternalXtext.g:8369:1: ( ( rule__EnumRule__AlternativesAssignment_5 ) )
            {
            // InternalXtext.g:8369:1: ( ( rule__EnumRule__AlternativesAssignment_5 ) )
            // InternalXtext.g:8370:2: ( rule__EnumRule__AlternativesAssignment_5 )
            {
             before(grammarAccess.getEnumRuleAccess().getAlternativesAssignment_5()); 
            // InternalXtext.g:8371:2: ( rule__EnumRule__AlternativesAssignment_5 )
            // InternalXtext.g:8371:3: rule__EnumRule__AlternativesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__AlternativesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEnumRuleAccess().getAlternativesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__5__Impl"


    // $ANTLR start "rule__EnumRule__Group__6"
    // InternalXtext.g:8379:1: rule__EnumRule__Group__6 : rule__EnumRule__Group__6__Impl ;
    public final void rule__EnumRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8383:1: ( rule__EnumRule__Group__6__Impl )
            // InternalXtext.g:8384:2: rule__EnumRule__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__6"


    // $ANTLR start "rule__EnumRule__Group__6__Impl"
    // InternalXtext.g:8390:1: rule__EnumRule__Group__6__Impl : ( ';' ) ;
    public final void rule__EnumRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8394:1: ( ( ';' ) )
            // InternalXtext.g:8395:1: ( ';' )
            {
            // InternalXtext.g:8395:1: ( ';' )
            // InternalXtext.g:8396:2: ';'
            {
             before(grammarAccess.getEnumRuleAccess().getSemicolonKeyword_6()); 
            match(input,31,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumRuleAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__6__Impl"


    // $ANTLR start "rule__EnumRule__Group_3__0"
    // InternalXtext.g:8406:1: rule__EnumRule__Group_3__0 : rule__EnumRule__Group_3__0__Impl rule__EnumRule__Group_3__1 ;
    public final void rule__EnumRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8410:1: ( rule__EnumRule__Group_3__0__Impl rule__EnumRule__Group_3__1 )
            // InternalXtext.g:8411:2: rule__EnumRule__Group_3__0__Impl rule__EnumRule__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__EnumRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group_3__0"


    // $ANTLR start "rule__EnumRule__Group_3__0__Impl"
    // InternalXtext.g:8418:1: rule__EnumRule__Group_3__0__Impl : ( 'returns' ) ;
    public final void rule__EnumRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8422:1: ( ( 'returns' ) )
            // InternalXtext.g:8423:1: ( 'returns' )
            {
            // InternalXtext.g:8423:1: ( 'returns' )
            // InternalXtext.g:8424:2: 'returns'
            {
             before(grammarAccess.getEnumRuleAccess().getReturnsKeyword_3_0()); 
            match(input,32,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumRuleAccess().getReturnsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group_3__0__Impl"


    // $ANTLR start "rule__EnumRule__Group_3__1"
    // InternalXtext.g:8433:1: rule__EnumRule__Group_3__1 : rule__EnumRule__Group_3__1__Impl ;
    public final void rule__EnumRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8437:1: ( rule__EnumRule__Group_3__1__Impl )
            // InternalXtext.g:8438:2: rule__EnumRule__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group_3__1"


    // $ANTLR start "rule__EnumRule__Group_3__1__Impl"
    // InternalXtext.g:8444:1: rule__EnumRule__Group_3__1__Impl : ( ( rule__EnumRule__TypeAssignment_3_1 ) ) ;
    public final void rule__EnumRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8448:1: ( ( ( rule__EnumRule__TypeAssignment_3_1 ) ) )
            // InternalXtext.g:8449:1: ( ( rule__EnumRule__TypeAssignment_3_1 ) )
            {
            // InternalXtext.g:8449:1: ( ( rule__EnumRule__TypeAssignment_3_1 ) )
            // InternalXtext.g:8450:2: ( rule__EnumRule__TypeAssignment_3_1 )
            {
             before(grammarAccess.getEnumRuleAccess().getTypeAssignment_3_1()); 
            // InternalXtext.g:8451:2: ( rule__EnumRule__TypeAssignment_3_1 )
            // InternalXtext.g:8451:3: rule__EnumRule__TypeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumRuleAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group_3__1__Impl"


    // $ANTLR start "rule__EnumLiterals__Group__0"
    // InternalXtext.g:8460:1: rule__EnumLiterals__Group__0 : rule__EnumLiterals__Group__0__Impl rule__EnumLiterals__Group__1 ;
    public final void rule__EnumLiterals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8464:1: ( rule__EnumLiterals__Group__0__Impl rule__EnumLiterals__Group__1 )
            // InternalXtext.g:8465:2: rule__EnumLiterals__Group__0__Impl rule__EnumLiterals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__EnumLiterals__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group__0"


    // $ANTLR start "rule__EnumLiterals__Group__0__Impl"
    // InternalXtext.g:8472:1: rule__EnumLiterals__Group__0__Impl : ( ruleEnumLiteralDeclaration ) ;
    public final void rule__EnumLiterals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8476:1: ( ( ruleEnumLiteralDeclaration ) )
            // InternalXtext.g:8477:1: ( ruleEnumLiteralDeclaration )
            {
            // InternalXtext.g:8477:1: ( ruleEnumLiteralDeclaration )
            // InternalXtext.g:8478:2: ruleEnumLiteralDeclaration
            {
             before(grammarAccess.getEnumLiteralsAccess().getEnumLiteralDeclarationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEnumLiteralDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumLiteralsAccess().getEnumLiteralDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group__0__Impl"


    // $ANTLR start "rule__EnumLiterals__Group__1"
    // InternalXtext.g:8487:1: rule__EnumLiterals__Group__1 : rule__EnumLiterals__Group__1__Impl ;
    public final void rule__EnumLiterals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8491:1: ( rule__EnumLiterals__Group__1__Impl )
            // InternalXtext.g:8492:2: rule__EnumLiterals__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group__1"


    // $ANTLR start "rule__EnumLiterals__Group__1__Impl"
    // InternalXtext.g:8498:1: rule__EnumLiterals__Group__1__Impl : ( ( rule__EnumLiterals__Group_1__0 )? ) ;
    public final void rule__EnumLiterals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8502:1: ( ( ( rule__EnumLiterals__Group_1__0 )? ) )
            // InternalXtext.g:8503:1: ( ( rule__EnumLiterals__Group_1__0 )? )
            {
            // InternalXtext.g:8503:1: ( ( rule__EnumLiterals__Group_1__0 )? )
            // InternalXtext.g:8504:2: ( rule__EnumLiterals__Group_1__0 )?
            {
             before(grammarAccess.getEnumLiteralsAccess().getGroup_1()); 
            // InternalXtext.g:8505:2: ( rule__EnumLiterals__Group_1__0 )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==37) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalXtext.g:8505:3: rule__EnumLiterals__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EnumLiterals__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumLiteralsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group__1__Impl"


    // $ANTLR start "rule__EnumLiterals__Group_1__0"
    // InternalXtext.g:8514:1: rule__EnumLiterals__Group_1__0 : rule__EnumLiterals__Group_1__0__Impl rule__EnumLiterals__Group_1__1 ;
    public final void rule__EnumLiterals__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8518:1: ( rule__EnumLiterals__Group_1__0__Impl rule__EnumLiterals__Group_1__1 )
            // InternalXtext.g:8519:2: rule__EnumLiterals__Group_1__0__Impl rule__EnumLiterals__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__EnumLiterals__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group_1__0"


    // $ANTLR start "rule__EnumLiterals__Group_1__0__Impl"
    // InternalXtext.g:8526:1: rule__EnumLiterals__Group_1__0__Impl : ( () ) ;
    public final void rule__EnumLiterals__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8530:1: ( ( () ) )
            // InternalXtext.g:8531:1: ( () )
            {
            // InternalXtext.g:8531:1: ( () )
            // InternalXtext.g:8532:2: ()
            {
             before(grammarAccess.getEnumLiteralsAccess().getAlternativesElementsAction_1_0()); 
            // InternalXtext.g:8533:2: ()
            // InternalXtext.g:8533:3: 
            {
            }

             after(grammarAccess.getEnumLiteralsAccess().getAlternativesElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group_1__0__Impl"


    // $ANTLR start "rule__EnumLiterals__Group_1__1"
    // InternalXtext.g:8541:1: rule__EnumLiterals__Group_1__1 : rule__EnumLiterals__Group_1__1__Impl ;
    public final void rule__EnumLiterals__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8545:1: ( rule__EnumLiterals__Group_1__1__Impl )
            // InternalXtext.g:8546:2: rule__EnumLiterals__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group_1__1"


    // $ANTLR start "rule__EnumLiterals__Group_1__1__Impl"
    // InternalXtext.g:8552:1: rule__EnumLiterals__Group_1__1__Impl : ( ( ( rule__EnumLiterals__Group_1_1__0 ) ) ( ( rule__EnumLiterals__Group_1_1__0 )* ) ) ;
    public final void rule__EnumLiterals__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8556:1: ( ( ( ( rule__EnumLiterals__Group_1_1__0 ) ) ( ( rule__EnumLiterals__Group_1_1__0 )* ) ) )
            // InternalXtext.g:8557:1: ( ( ( rule__EnumLiterals__Group_1_1__0 ) ) ( ( rule__EnumLiterals__Group_1_1__0 )* ) )
            {
            // InternalXtext.g:8557:1: ( ( ( rule__EnumLiterals__Group_1_1__0 ) ) ( ( rule__EnumLiterals__Group_1_1__0 )* ) )
            // InternalXtext.g:8558:2: ( ( rule__EnumLiterals__Group_1_1__0 ) ) ( ( rule__EnumLiterals__Group_1_1__0 )* )
            {
            // InternalXtext.g:8558:2: ( ( rule__EnumLiterals__Group_1_1__0 ) )
            // InternalXtext.g:8559:3: ( rule__EnumLiterals__Group_1_1__0 )
            {
             before(grammarAccess.getEnumLiteralsAccess().getGroup_1_1()); 
            // InternalXtext.g:8560:3: ( rule__EnumLiterals__Group_1_1__0 )
            // InternalXtext.g:8560:4: rule__EnumLiterals__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__EnumLiterals__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralsAccess().getGroup_1_1()); 

            }

            // InternalXtext.g:8563:2: ( ( rule__EnumLiterals__Group_1_1__0 )* )
            // InternalXtext.g:8564:3: ( rule__EnumLiterals__Group_1_1__0 )*
            {
             before(grammarAccess.getEnumLiteralsAccess().getGroup_1_1()); 
            // InternalXtext.g:8565:3: ( rule__EnumLiterals__Group_1_1__0 )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==37) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalXtext.g:8565:4: rule__EnumLiterals__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__EnumLiterals__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

             after(grammarAccess.getEnumLiteralsAccess().getGroup_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group_1__1__Impl"


    // $ANTLR start "rule__EnumLiterals__Group_1_1__0"
    // InternalXtext.g:8575:1: rule__EnumLiterals__Group_1_1__0 : rule__EnumLiterals__Group_1_1__0__Impl rule__EnumLiterals__Group_1_1__1 ;
    public final void rule__EnumLiterals__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8579:1: ( rule__EnumLiterals__Group_1_1__0__Impl rule__EnumLiterals__Group_1_1__1 )
            // InternalXtext.g:8580:2: rule__EnumLiterals__Group_1_1__0__Impl rule__EnumLiterals__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__EnumLiterals__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group_1_1__0"


    // $ANTLR start "rule__EnumLiterals__Group_1_1__0__Impl"
    // InternalXtext.g:8587:1: rule__EnumLiterals__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__EnumLiterals__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8591:1: ( ( '|' ) )
            // InternalXtext.g:8592:1: ( '|' )
            {
            // InternalXtext.g:8592:1: ( '|' )
            // InternalXtext.g:8593:2: '|'
            {
             before(grammarAccess.getEnumLiteralsAccess().getVerticalLineKeyword_1_1_0()); 
            match(input,37,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumLiteralsAccess().getVerticalLineKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group_1_1__0__Impl"


    // $ANTLR start "rule__EnumLiterals__Group_1_1__1"
    // InternalXtext.g:8602:1: rule__EnumLiterals__Group_1_1__1 : rule__EnumLiterals__Group_1_1__1__Impl ;
    public final void rule__EnumLiterals__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8606:1: ( rule__EnumLiterals__Group_1_1__1__Impl )
            // InternalXtext.g:8607:2: rule__EnumLiterals__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group_1_1__1"


    // $ANTLR start "rule__EnumLiterals__Group_1_1__1__Impl"
    // InternalXtext.g:8613:1: rule__EnumLiterals__Group_1_1__1__Impl : ( ( rule__EnumLiterals__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__EnumLiterals__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8617:1: ( ( ( rule__EnumLiterals__ElementsAssignment_1_1_1 ) ) )
            // InternalXtext.g:8618:1: ( ( rule__EnumLiterals__ElementsAssignment_1_1_1 ) )
            {
            // InternalXtext.g:8618:1: ( ( rule__EnumLiterals__ElementsAssignment_1_1_1 ) )
            // InternalXtext.g:8619:2: ( rule__EnumLiterals__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getEnumLiteralsAccess().getElementsAssignment_1_1_1()); 
            // InternalXtext.g:8620:2: ( rule__EnumLiterals__ElementsAssignment_1_1_1 )
            // InternalXtext.g:8620:3: rule__EnumLiterals__ElementsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralsAccess().getElementsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group_1_1__1__Impl"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group__0"
    // InternalXtext.g:8629:1: rule__EnumLiteralDeclaration__Group__0 : rule__EnumLiteralDeclaration__Group__0__Impl rule__EnumLiteralDeclaration__Group__1 ;
    public final void rule__EnumLiteralDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8633:1: ( rule__EnumLiteralDeclaration__Group__0__Impl rule__EnumLiteralDeclaration__Group__1 )
            // InternalXtext.g:8634:2: rule__EnumLiteralDeclaration__Group__0__Impl rule__EnumLiteralDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__EnumLiteralDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiteralDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group__0"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group__0__Impl"
    // InternalXtext.g:8641:1: rule__EnumLiteralDeclaration__Group__0__Impl : ( ( rule__EnumLiteralDeclaration__EnumLiteralAssignment_0 ) ) ;
    public final void rule__EnumLiteralDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8645:1: ( ( ( rule__EnumLiteralDeclaration__EnumLiteralAssignment_0 ) ) )
            // InternalXtext.g:8646:1: ( ( rule__EnumLiteralDeclaration__EnumLiteralAssignment_0 ) )
            {
            // InternalXtext.g:8646:1: ( ( rule__EnumLiteralDeclaration__EnumLiteralAssignment_0 ) )
            // InternalXtext.g:8647:2: ( rule__EnumLiteralDeclaration__EnumLiteralAssignment_0 )
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralAssignment_0()); 
            // InternalXtext.g:8648:2: ( rule__EnumLiteralDeclaration__EnumLiteralAssignment_0 )
            // InternalXtext.g:8648:3: rule__EnumLiteralDeclaration__EnumLiteralAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiteralDeclaration__EnumLiteralAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group__0__Impl"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group__1"
    // InternalXtext.g:8656:1: rule__EnumLiteralDeclaration__Group__1 : rule__EnumLiteralDeclaration__Group__1__Impl ;
    public final void rule__EnumLiteralDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8660:1: ( rule__EnumLiteralDeclaration__Group__1__Impl )
            // InternalXtext.g:8661:2: rule__EnumLiteralDeclaration__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiteralDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group__1"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group__1__Impl"
    // InternalXtext.g:8667:1: rule__EnumLiteralDeclaration__Group__1__Impl : ( ( rule__EnumLiteralDeclaration__Group_1__0 )? ) ;
    public final void rule__EnumLiteralDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8671:1: ( ( ( rule__EnumLiteralDeclaration__Group_1__0 )? ) )
            // InternalXtext.g:8672:1: ( ( rule__EnumLiteralDeclaration__Group_1__0 )? )
            {
            // InternalXtext.g:8672:1: ( ( rule__EnumLiteralDeclaration__Group_1__0 )? )
            // InternalXtext.g:8673:2: ( rule__EnumLiteralDeclaration__Group_1__0 )?
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getGroup_1()); 
            // InternalXtext.g:8674:2: ( rule__EnumLiteralDeclaration__Group_1__0 )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==15) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalXtext.g:8674:3: rule__EnumLiteralDeclaration__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EnumLiteralDeclaration__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumLiteralDeclarationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group__1__Impl"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group_1__0"
    // InternalXtext.g:8683:1: rule__EnumLiteralDeclaration__Group_1__0 : rule__EnumLiteralDeclaration__Group_1__0__Impl rule__EnumLiteralDeclaration__Group_1__1 ;
    public final void rule__EnumLiteralDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8687:1: ( rule__EnumLiteralDeclaration__Group_1__0__Impl rule__EnumLiteralDeclaration__Group_1__1 )
            // InternalXtext.g:8688:2: rule__EnumLiteralDeclaration__Group_1__0__Impl rule__EnumLiteralDeclaration__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__EnumLiteralDeclaration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiteralDeclaration__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group_1__0"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group_1__0__Impl"
    // InternalXtext.g:8695:1: rule__EnumLiteralDeclaration__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumLiteralDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8699:1: ( ( '=' ) )
            // InternalXtext.g:8700:1: ( '=' )
            {
            // InternalXtext.g:8700:1: ( '=' )
            // InternalXtext.g:8701:2: '='
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getEqualsSignKeyword_1_0()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumLiteralDeclarationAccess().getEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group_1__1"
    // InternalXtext.g:8710:1: rule__EnumLiteralDeclaration__Group_1__1 : rule__EnumLiteralDeclaration__Group_1__1__Impl ;
    public final void rule__EnumLiteralDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8714:1: ( rule__EnumLiteralDeclaration__Group_1__1__Impl )
            // InternalXtext.g:8715:2: rule__EnumLiteralDeclaration__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiteralDeclaration__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group_1__1"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group_1__1__Impl"
    // InternalXtext.g:8721:1: rule__EnumLiteralDeclaration__Group_1__1__Impl : ( ( rule__EnumLiteralDeclaration__LiteralAssignment_1_1 ) ) ;
    public final void rule__EnumLiteralDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8725:1: ( ( ( rule__EnumLiteralDeclaration__LiteralAssignment_1_1 ) ) )
            // InternalXtext.g:8726:1: ( ( rule__EnumLiteralDeclaration__LiteralAssignment_1_1 ) )
            {
            // InternalXtext.g:8726:1: ( ( rule__EnumLiteralDeclaration__LiteralAssignment_1_1 ) )
            // InternalXtext.g:8727:2: ( rule__EnumLiteralDeclaration__LiteralAssignment_1_1 )
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralAssignment_1_1()); 
            // InternalXtext.g:8728:2: ( rule__EnumLiteralDeclaration__LiteralAssignment_1_1 )
            // InternalXtext.g:8728:3: rule__EnumLiteralDeclaration__LiteralAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiteralDeclaration__LiteralAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__Grammar__NameAssignment_1"
    // InternalXtext.g:8737:1: rule__Grammar__NameAssignment_1 : ( ruleGrammarID ) ;
    public final void rule__Grammar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8741:1: ( ( ruleGrammarID ) )
            // InternalXtext.g:8742:2: ( ruleGrammarID )
            {
            // InternalXtext.g:8742:2: ( ruleGrammarID )
            // InternalXtext.g:8743:3: ruleGrammarID
            {
             before(grammarAccess.getGrammarAccess().getNameGrammarIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGrammarID();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getNameGrammarIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__NameAssignment_1"


    // $ANTLR start "rule__Grammar__UsedGrammarsAssignment_2_1"
    // InternalXtext.g:8752:1: rule__Grammar__UsedGrammarsAssignment_2_1 : ( ( ruleGrammarID ) ) ;
    public final void rule__Grammar__UsedGrammarsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8756:1: ( ( ( ruleGrammarID ) ) )
            // InternalXtext.g:8757:2: ( ( ruleGrammarID ) )
            {
            // InternalXtext.g:8757:2: ( ( ruleGrammarID ) )
            // InternalXtext.g:8758:3: ( ruleGrammarID )
            {
             before(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_1_0()); 
            // InternalXtext.g:8759:3: ( ruleGrammarID )
            // InternalXtext.g:8760:4: ruleGrammarID
            {
             before(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarGrammarIDParserRuleCall_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGrammarID();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarGrammarIDParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__UsedGrammarsAssignment_2_1"


    // $ANTLR start "rule__Grammar__UsedGrammarsAssignment_2_2_1"
    // InternalXtext.g:8771:1: rule__Grammar__UsedGrammarsAssignment_2_2_1 : ( ( ruleGrammarID ) ) ;
    public final void rule__Grammar__UsedGrammarsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8775:1: ( ( ( ruleGrammarID ) ) )
            // InternalXtext.g:8776:2: ( ( ruleGrammarID ) )
            {
            // InternalXtext.g:8776:2: ( ( ruleGrammarID ) )
            // InternalXtext.g:8777:3: ( ruleGrammarID )
            {
             before(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_2_1_0()); 
            // InternalXtext.g:8778:3: ( ruleGrammarID )
            // InternalXtext.g:8779:4: ruleGrammarID
            {
             before(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarGrammarIDParserRuleCall_2_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGrammarID();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarGrammarIDParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__UsedGrammarsAssignment_2_2_1"


    // $ANTLR start "rule__Grammar__DefinesHiddenTokensAssignment_3_0"
    // InternalXtext.g:8790:1: rule__Grammar__DefinesHiddenTokensAssignment_3_0 : ( ( 'hidden' ) ) ;
    public final void rule__Grammar__DefinesHiddenTokensAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8794:1: ( ( ( 'hidden' ) ) )
            // InternalXtext.g:8795:2: ( ( 'hidden' ) )
            {
            // InternalXtext.g:8795:2: ( ( 'hidden' ) )
            // InternalXtext.g:8796:3: ( 'hidden' )
            {
             before(grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0()); 
            // InternalXtext.g:8797:3: ( 'hidden' )
            // InternalXtext.g:8798:4: 'hidden'
            {
             before(grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0()); 
            match(input,50,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0()); 

            }

             after(grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__DefinesHiddenTokensAssignment_3_0"


    // $ANTLR start "rule__Grammar__HiddenTokensAssignment_3_2_0"
    // InternalXtext.g:8809:1: rule__Grammar__HiddenTokensAssignment_3_2_0 : ( ( ruleRuleID ) ) ;
    public final void rule__Grammar__HiddenTokensAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8813:1: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:8814:2: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:8814:2: ( ( ruleRuleID ) )
            // InternalXtext.g:8815:3: ( ruleRuleID )
            {
             before(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_0_0()); 
            // InternalXtext.g:8816:3: ( ruleRuleID )
            // InternalXtext.g:8817:4: ruleRuleID
            {
             before(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_3_2_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_3_2_0_0_1()); 

            }

             after(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__HiddenTokensAssignment_3_2_0"


    // $ANTLR start "rule__Grammar__HiddenTokensAssignment_3_2_1_1"
    // InternalXtext.g:8828:1: rule__Grammar__HiddenTokensAssignment_3_2_1_1 : ( ( ruleRuleID ) ) ;
    public final void rule__Grammar__HiddenTokensAssignment_3_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8832:1: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:8833:2: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:8833:2: ( ( ruleRuleID ) )
            // InternalXtext.g:8834:3: ( ruleRuleID )
            {
             before(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_1_1_0()); 
            // InternalXtext.g:8835:3: ( ruleRuleID )
            // InternalXtext.g:8836:4: ruleRuleID
            {
             before(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_3_2_1_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_3_2_1_1_0_1()); 

            }

             after(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__HiddenTokensAssignment_3_2_1_1"


    // $ANTLR start "rule__Grammar__MetamodelDeclarationsAssignment_4"
    // InternalXtext.g:8847:1: rule__Grammar__MetamodelDeclarationsAssignment_4 : ( ruleAbstractMetamodelDeclaration ) ;
    public final void rule__Grammar__MetamodelDeclarationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8851:1: ( ( ruleAbstractMetamodelDeclaration ) )
            // InternalXtext.g:8852:2: ( ruleAbstractMetamodelDeclaration )
            {
            // InternalXtext.g:8852:2: ( ruleAbstractMetamodelDeclaration )
            // InternalXtext.g:8853:3: ruleAbstractMetamodelDeclaration
            {
             before(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractMetamodelDeclaration();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__MetamodelDeclarationsAssignment_4"


    // $ANTLR start "rule__Grammar__RulesAssignment_5"
    // InternalXtext.g:8862:1: rule__Grammar__RulesAssignment_5 : ( ruleAbstractRule ) ;
    public final void rule__Grammar__RulesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8866:1: ( ( ruleAbstractRule ) )
            // InternalXtext.g:8867:2: ( ruleAbstractRule )
            {
            // InternalXtext.g:8867:2: ( ruleAbstractRule )
            // InternalXtext.g:8868:3: ruleAbstractRule
            {
             before(grammarAccess.getGrammarAccess().getRulesAbstractRuleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractRule();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getRulesAbstractRuleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__RulesAssignment_5"


    // $ANTLR start "rule__GeneratedMetamodel__NameAssignment_1"
    // InternalXtext.g:8877:1: rule__GeneratedMetamodel__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__GeneratedMetamodel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8881:1: ( ( ruleValidID ) )
            // InternalXtext.g:8882:2: ( ruleValidID )
            {
            // InternalXtext.g:8882:2: ( ruleValidID )
            // InternalXtext.g:8883:3: ruleValidID
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getNameValidIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getGeneratedMetamodelAccess().getNameValidIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__NameAssignment_1"


    // $ANTLR start "rule__GeneratedMetamodel__EPackageAssignment_2"
    // InternalXtext.g:8892:1: rule__GeneratedMetamodel__EPackageAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GeneratedMetamodel__EPackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8896:1: ( ( ( RULE_STRING ) ) )
            // InternalXtext.g:8897:2: ( ( RULE_STRING ) )
            {
            // InternalXtext.g:8897:2: ( ( RULE_STRING ) )
            // InternalXtext.g:8898:3: ( RULE_STRING )
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageCrossReference_2_0()); 
            // InternalXtext.g:8899:3: ( RULE_STRING )
            // InternalXtext.g:8900:4: RULE_STRING
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__EPackageAssignment_2"


    // $ANTLR start "rule__GeneratedMetamodel__AliasAssignment_3_1"
    // InternalXtext.g:8911:1: rule__GeneratedMetamodel__AliasAssignment_3_1 : ( ruleValidID ) ;
    public final void rule__GeneratedMetamodel__AliasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8915:1: ( ( ruleValidID ) )
            // InternalXtext.g:8916:2: ( ruleValidID )
            {
            // InternalXtext.g:8916:2: ( ruleValidID )
            // InternalXtext.g:8917:3: ruleValidID
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getAliasValidIDParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getGeneratedMetamodelAccess().getAliasValidIDParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__AliasAssignment_3_1"


    // $ANTLR start "rule__ReferencedMetamodel__EPackageAssignment_1"
    // InternalXtext.g:8926:1: rule__ReferencedMetamodel__EPackageAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ReferencedMetamodel__EPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8930:1: ( ( ( RULE_STRING ) ) )
            // InternalXtext.g:8931:2: ( ( RULE_STRING ) )
            {
            // InternalXtext.g:8931:2: ( ( RULE_STRING ) )
            // InternalXtext.g:8932:3: ( RULE_STRING )
            {
             before(grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageCrossReference_1_0()); 
            // InternalXtext.g:8933:3: ( RULE_STRING )
            // InternalXtext.g:8934:4: RULE_STRING
            {
             before(grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__EPackageAssignment_1"


    // $ANTLR start "rule__ReferencedMetamodel__AliasAssignment_2_1"
    // InternalXtext.g:8945:1: rule__ReferencedMetamodel__AliasAssignment_2_1 : ( ruleValidID ) ;
    public final void rule__ReferencedMetamodel__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8949:1: ( ( ruleValidID ) )
            // InternalXtext.g:8950:2: ( ruleValidID )
            {
            // InternalXtext.g:8950:2: ( ruleValidID )
            // InternalXtext.g:8951:3: ruleValidID
            {
             before(grammarAccess.getReferencedMetamodelAccess().getAliasValidIDParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getReferencedMetamodelAccess().getAliasValidIDParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__AliasAssignment_2_1"


    // $ANTLR start "rule__Annotation__NameAssignment_1"
    // InternalXtext.g:8960:1: rule__Annotation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8964:1: ( ( RULE_ID ) )
            // InternalXtext.g:8965:2: ( RULE_ID )
            {
            // InternalXtext.g:8965:2: ( RULE_ID )
            // InternalXtext.g:8966:3: RULE_ID
            {
             before(grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__NameAssignment_1"


    // $ANTLR start "rule__ParserRule__AnnotationsAssignment_0"
    // InternalXtext.g:8975:1: rule__ParserRule__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__ParserRule__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8979:1: ( ( ruleAnnotation ) )
            // InternalXtext.g:8980:2: ( ruleAnnotation )
            {
            // InternalXtext.g:8980:2: ( ruleAnnotation )
            // InternalXtext.g:8981:3: ruleAnnotation
            {
             before(grammarAccess.getParserRuleAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__AnnotationsAssignment_0"


    // $ANTLR start "rule__ParserRule__FragmentAssignment_1_0_0"
    // InternalXtext.g:8990:1: rule__ParserRule__FragmentAssignment_1_0_0 : ( ( 'fragment' ) ) ;
    public final void rule__ParserRule__FragmentAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:8994:1: ( ( ( 'fragment' ) ) )
            // InternalXtext.g:8995:2: ( ( 'fragment' ) )
            {
            // InternalXtext.g:8995:2: ( ( 'fragment' ) )
            // InternalXtext.g:8996:3: ( 'fragment' )
            {
             before(grammarAccess.getParserRuleAccess().getFragmentFragmentKeyword_1_0_0_0()); 
            // InternalXtext.g:8997:3: ( 'fragment' )
            // InternalXtext.g:8998:4: 'fragment'
            {
             before(grammarAccess.getParserRuleAccess().getFragmentFragmentKeyword_1_0_0_0()); 
            match(input,51,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getFragmentFragmentKeyword_1_0_0_0()); 

            }

             after(grammarAccess.getParserRuleAccess().getFragmentFragmentKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__FragmentAssignment_1_0_0"


    // $ANTLR start "rule__ParserRule__WildcardAssignment_1_0_2_0"
    // InternalXtext.g:9009:1: rule__ParserRule__WildcardAssignment_1_0_2_0 : ( ( '*' ) ) ;
    public final void rule__ParserRule__WildcardAssignment_1_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9013:1: ( ( ( '*' ) ) )
            // InternalXtext.g:9014:2: ( ( '*' ) )
            {
            // InternalXtext.g:9014:2: ( ( '*' ) )
            // InternalXtext.g:9015:3: ( '*' )
            {
             before(grammarAccess.getParserRuleAccess().getWildcardAsteriskKeyword_1_0_2_0_0()); 
            // InternalXtext.g:9016:3: ( '*' )
            // InternalXtext.g:9017:4: '*'
            {
             before(grammarAccess.getParserRuleAccess().getWildcardAsteriskKeyword_1_0_2_0_0()); 
            match(input,13,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getWildcardAsteriskKeyword_1_0_2_0_0()); 

            }

             after(grammarAccess.getParserRuleAccess().getWildcardAsteriskKeyword_1_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__WildcardAssignment_1_0_2_0"


    // $ANTLR start "rule__ParserRule__TypeAssignment_1_0_2_1_1"
    // InternalXtext.g:9028:1: rule__ParserRule__TypeAssignment_1_0_2_1_1 : ( ruleTypeRef ) ;
    public final void rule__ParserRule__TypeAssignment_1_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9032:1: ( ( ruleTypeRef ) )
            // InternalXtext.g:9033:2: ( ruleTypeRef )
            {
            // InternalXtext.g:9033:2: ( ruleTypeRef )
            // InternalXtext.g:9034:3: ruleTypeRef
            {
             before(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_1_0_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_1_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__TypeAssignment_1_0_2_1_1"


    // $ANTLR start "rule__ParserRule__TypeAssignment_1_1_1_1"
    // InternalXtext.g:9043:1: rule__ParserRule__TypeAssignment_1_1_1_1 : ( ruleTypeRef ) ;
    public final void rule__ParserRule__TypeAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9047:1: ( ( ruleTypeRef ) )
            // InternalXtext.g:9048:2: ( ruleTypeRef )
            {
            // InternalXtext.g:9048:2: ( ruleTypeRef )
            // InternalXtext.g:9049:3: ruleTypeRef
            {
             before(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_1_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__TypeAssignment_1_1_1_1"


    // $ANTLR start "rule__ParserRule__BecomesAssignment_1_1_2_1"
    // InternalXtext.g:9058:1: rule__ParserRule__BecomesAssignment_1_1_2_1 : ( ruleBecomesDecl ) ;
    public final void rule__ParserRule__BecomesAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9062:1: ( ( ruleBecomesDecl ) )
            // InternalXtext.g:9063:2: ( ruleBecomesDecl )
            {
            // InternalXtext.g:9063:2: ( ruleBecomesDecl )
            // InternalXtext.g:9064:3: ruleBecomesDecl
            {
             before(grammarAccess.getParserRuleAccess().getBecomesBecomesDeclParserRuleCall_1_1_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBecomesDecl();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getBecomesBecomesDeclParserRuleCall_1_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__BecomesAssignment_1_1_2_1"


    // $ANTLR start "rule__ParserRule__DefinesHiddenTokensAssignment_2_0"
    // InternalXtext.g:9073:1: rule__ParserRule__DefinesHiddenTokensAssignment_2_0 : ( ( 'hidden' ) ) ;
    public final void rule__ParserRule__DefinesHiddenTokensAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9077:1: ( ( ( 'hidden' ) ) )
            // InternalXtext.g:9078:2: ( ( 'hidden' ) )
            {
            // InternalXtext.g:9078:2: ( ( 'hidden' ) )
            // InternalXtext.g:9079:3: ( 'hidden' )
            {
             before(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_2_0_0()); 
            // InternalXtext.g:9080:3: ( 'hidden' )
            // InternalXtext.g:9081:4: 'hidden'
            {
             before(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_2_0_0()); 
            match(input,50,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_2_0_0()); 

            }

             after(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__DefinesHiddenTokensAssignment_2_0"


    // $ANTLR start "rule__ParserRule__HiddenTokensAssignment_2_2_0"
    // InternalXtext.g:9092:1: rule__ParserRule__HiddenTokensAssignment_2_2_0 : ( ( ruleRuleID ) ) ;
    public final void rule__ParserRule__HiddenTokensAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9096:1: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:9097:2: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:9097:2: ( ( ruleRuleID ) )
            // InternalXtext.g:9098:3: ( ruleRuleID )
            {
             before(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_0_0()); 
            // InternalXtext.g:9099:3: ( ruleRuleID )
            // InternalXtext.g:9100:4: ruleRuleID
            {
             before(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_2_2_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_2_2_0_0_1()); 

            }

             after(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__HiddenTokensAssignment_2_2_0"


    // $ANTLR start "rule__ParserRule__HiddenTokensAssignment_2_2_1_1"
    // InternalXtext.g:9111:1: rule__ParserRule__HiddenTokensAssignment_2_2_1_1 : ( ( ruleRuleID ) ) ;
    public final void rule__ParserRule__HiddenTokensAssignment_2_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9115:1: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:9116:2: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:9116:2: ( ( ruleRuleID ) )
            // InternalXtext.g:9117:3: ( ruleRuleID )
            {
             before(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_1_1_0()); 
            // InternalXtext.g:9118:3: ( ruleRuleID )
            // InternalXtext.g:9119:4: ruleRuleID
            {
             before(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_2_2_1_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_2_2_1_1_0_1()); 

            }

             after(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__HiddenTokensAssignment_2_2_1_1"


    // $ANTLR start "rule__ParserRule__AlternativesAssignment_4"
    // InternalXtext.g:9130:1: rule__ParserRule__AlternativesAssignment_4 : ( ruleAlternatives ) ;
    public final void rule__ParserRule__AlternativesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9134:1: ( ( ruleAlternatives ) )
            // InternalXtext.g:9135:2: ( ruleAlternatives )
            {
            // InternalXtext.g:9135:2: ( ruleAlternatives )
            // InternalXtext.g:9136:3: ruleAlternatives
            {
             before(grammarAccess.getParserRuleAccess().getAlternativesAlternativesParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getAlternativesAlternativesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__AlternativesAssignment_4"


    // $ANTLR start "rule__BecomesDecl__TypeAssignment_0"
    // InternalXtext.g:9145:1: rule__BecomesDecl__TypeAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__BecomesDecl__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9149:1: ( ( ruleQualifiedName ) )
            // InternalXtext.g:9150:2: ( ruleQualifiedName )
            {
            // InternalXtext.g:9150:2: ( ruleQualifiedName )
            // InternalXtext.g:9151:3: ruleQualifiedName
            {
             before(grammarAccess.getBecomesDeclAccess().getTypeQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBecomesDeclAccess().getTypeQualifiedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BecomesDecl__TypeAssignment_0"


    // $ANTLR start "rule__BecomesDecl__CodeAssignment_1"
    // InternalXtext.g:9160:1: rule__BecomesDecl__CodeAssignment_1 : ( RULE_JAVA_STRING ) ;
    public final void rule__BecomesDecl__CodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9164:1: ( ( RULE_JAVA_STRING ) )
            // InternalXtext.g:9165:2: ( RULE_JAVA_STRING )
            {
            // InternalXtext.g:9165:2: ( RULE_JAVA_STRING )
            // InternalXtext.g:9166:3: RULE_JAVA_STRING
            {
             before(grammarAccess.getBecomesDeclAccess().getCodeJAVA_STRINGTerminalRuleCall_1_0()); 
            match(input,RULE_JAVA_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getBecomesDeclAccess().getCodeJAVA_STRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BecomesDecl__CodeAssignment_1"


    // $ANTLR start "rule__RuleNameAndParams__NameAssignment_0"
    // InternalXtext.g:9175:1: rule__RuleNameAndParams__NameAssignment_0 : ( ruleValidID ) ;
    public final void rule__RuleNameAndParams__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9179:1: ( ( ruleValidID ) )
            // InternalXtext.g:9180:2: ( ruleValidID )
            {
            // InternalXtext.g:9180:2: ( ruleValidID )
            // InternalXtext.g:9181:3: ruleValidID
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getNameValidIDParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getRuleNameAndParamsAccess().getNameValidIDParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__NameAssignment_0"


    // $ANTLR start "rule__RuleNameAndParams__ParametersAssignment_1_1_0"
    // InternalXtext.g:9190:1: rule__RuleNameAndParams__ParametersAssignment_1_1_0 : ( ruleParameter ) ;
    public final void rule__RuleNameAndParams__ParametersAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9194:1: ( ( ruleParameter ) )
            // InternalXtext.g:9195:2: ( ruleParameter )
            {
            // InternalXtext.g:9195:2: ( ruleParameter )
            // InternalXtext.g:9196:3: ruleParameter
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getParametersParameterParserRuleCall_1_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRuleNameAndParamsAccess().getParametersParameterParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__ParametersAssignment_1_1_0"


    // $ANTLR start "rule__RuleNameAndParams__ParametersAssignment_1_1_1_1"
    // InternalXtext.g:9205:1: rule__RuleNameAndParams__ParametersAssignment_1_1_1_1 : ( ruleParameter ) ;
    public final void rule__RuleNameAndParams__ParametersAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9209:1: ( ( ruleParameter ) )
            // InternalXtext.g:9210:2: ( ruleParameter )
            {
            // InternalXtext.g:9210:2: ( ruleParameter )
            // InternalXtext.g:9211:3: ruleParameter
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getParametersParameterParserRuleCall_1_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRuleNameAndParamsAccess().getParametersParameterParserRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__ParametersAssignment_1_1_1_1"


    // $ANTLR start "rule__Parameter__NameAssignment"
    // InternalXtext.g:9220:1: rule__Parameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9224:1: ( ( RULE_ID ) )
            // InternalXtext.g:9225:2: ( RULE_ID )
            {
            // InternalXtext.g:9225:2: ( RULE_ID )
            // InternalXtext.g:9226:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment"


    // $ANTLR start "rule__TypeRef__MetamodelAssignment_0_0"
    // InternalXtext.g:9235:1: rule__TypeRef__MetamodelAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeRef__MetamodelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9239:1: ( ( ( RULE_ID ) ) )
            // InternalXtext.g:9240:2: ( ( RULE_ID ) )
            {
            // InternalXtext.g:9240:2: ( ( RULE_ID ) )
            // InternalXtext.g:9241:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0()); 
            // InternalXtext.g:9242:3: ( RULE_ID )
            // InternalXtext.g:9243:4: RULE_ID
            {
             before(grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__MetamodelAssignment_0_0"


    // $ANTLR start "rule__TypeRef__ClassifierAssignment_1"
    // InternalXtext.g:9254:1: rule__TypeRef__ClassifierAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeRef__ClassifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9258:1: ( ( ( RULE_ID ) ) )
            // InternalXtext.g:9259:2: ( ( RULE_ID ) )
            {
            // InternalXtext.g:9259:2: ( ( RULE_ID ) )
            // InternalXtext.g:9260:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeRefAccess().getClassifierEClassifierCrossReference_1_0()); 
            // InternalXtext.g:9261:3: ( RULE_ID )
            // InternalXtext.g:9262:4: RULE_ID
            {
             before(grammarAccess.getTypeRefAccess().getClassifierEClassifierIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypeRefAccess().getClassifierEClassifierIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTypeRefAccess().getClassifierEClassifierCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__ClassifierAssignment_1"


    // $ANTLR start "rule__Alternatives__ElementsAssignment_1_1_1"
    // InternalXtext.g:9273:1: rule__Alternatives__ElementsAssignment_1_1_1 : ( ruleConditionalBranch ) ;
    public final void rule__Alternatives__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9277:1: ( ( ruleConditionalBranch ) )
            // InternalXtext.g:9278:2: ( ruleConditionalBranch )
            {
            // InternalXtext.g:9278:2: ( ruleConditionalBranch )
            // InternalXtext.g:9279:3: ruleConditionalBranch
            {
             before(grammarAccess.getAlternativesAccess().getElementsConditionalBranchParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConditionalBranch();

            state._fsp--;

             after(grammarAccess.getAlternativesAccess().getElementsConditionalBranchParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__ElementsAssignment_1_1_1"


    // $ANTLR start "rule__ConditionalBranch__GuardConditionAssignment_1_2"
    // InternalXtext.g:9288:1: rule__ConditionalBranch__GuardConditionAssignment_1_2 : ( ruleDisjunction ) ;
    public final void rule__ConditionalBranch__GuardConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9292:1: ( ( ruleDisjunction ) )
            // InternalXtext.g:9293:2: ( ruleDisjunction )
            {
            // InternalXtext.g:9293:2: ( ruleDisjunction )
            // InternalXtext.g:9294:3: ruleDisjunction
            {
             before(grammarAccess.getConditionalBranchAccess().getGuardConditionDisjunctionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunction();

            state._fsp--;

             after(grammarAccess.getConditionalBranchAccess().getGuardConditionDisjunctionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__GuardConditionAssignment_1_2"


    // $ANTLR start "rule__ConditionalBranch__ElementsAssignment_1_4"
    // InternalXtext.g:9303:1: rule__ConditionalBranch__ElementsAssignment_1_4 : ( ruleAbstractToken ) ;
    public final void rule__ConditionalBranch__ElementsAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9307:1: ( ( ruleAbstractToken ) )
            // InternalXtext.g:9308:2: ( ruleAbstractToken )
            {
            // InternalXtext.g:9308:2: ( ruleAbstractToken )
            // InternalXtext.g:9309:3: ruleAbstractToken
            {
             before(grammarAccess.getConditionalBranchAccess().getElementsAbstractTokenParserRuleCall_1_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractToken();

            state._fsp--;

             after(grammarAccess.getConditionalBranchAccess().getElementsAbstractTokenParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__ElementsAssignment_1_4"


    // $ANTLR start "rule__UnorderedGroup__ElementsAssignment_1_1_1"
    // InternalXtext.g:9318:1: rule__UnorderedGroup__ElementsAssignment_1_1_1 : ( ruleGroup ) ;
    public final void rule__UnorderedGroup__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9322:1: ( ( ruleGroup ) )
            // InternalXtext.g:9323:2: ( ruleGroup )
            {
            // InternalXtext.g:9323:2: ( ruleGroup )
            // InternalXtext.g:9324:3: ruleGroup
            {
             before(grammarAccess.getUnorderedGroupAccess().getElementsGroupParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getUnorderedGroupAccess().getElementsGroupParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__ElementsAssignment_1_1_1"


    // $ANTLR start "rule__Group__ElementsAssignment_1_1"
    // InternalXtext.g:9333:1: rule__Group__ElementsAssignment_1_1 : ( ruleAbstractToken ) ;
    public final void rule__Group__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9337:1: ( ( ruleAbstractToken ) )
            // InternalXtext.g:9338:2: ( ruleAbstractToken )
            {
            // InternalXtext.g:9338:2: ( ruleAbstractToken )
            // InternalXtext.g:9339:3: ruleAbstractToken
            {
             before(grammarAccess.getGroupAccess().getElementsAbstractTokenParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractToken();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getElementsAbstractTokenParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__ElementsAssignment_1_1"


    // $ANTLR start "rule__AbstractTokenWithCardinality__CardinalityAssignment_1"
    // InternalXtext.g:9348:1: rule__AbstractTokenWithCardinality__CardinalityAssignment_1 : ( ( rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0 ) ) ;
    public final void rule__AbstractTokenWithCardinality__CardinalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9352:1: ( ( ( rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0 ) ) )
            // InternalXtext.g:9353:2: ( ( rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0 ) )
            {
            // InternalXtext.g:9353:2: ( ( rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0 ) )
            // InternalXtext.g:9354:3: ( rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0 )
            {
             before(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAlternatives_1_0()); 
            // InternalXtext.g:9355:3: ( rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0 )
            // InternalXtext.g:9355:4: rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTokenWithCardinality__CardinalityAssignment_1"


    // $ANTLR start "rule__Action__TypeAssignment_1"
    // InternalXtext.g:9363:1: rule__Action__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Action__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9367:1: ( ( ruleTypeRef ) )
            // InternalXtext.g:9368:2: ( ruleTypeRef )
            {
            // InternalXtext.g:9368:2: ( ruleTypeRef )
            // InternalXtext.g:9369:3: ruleTypeRef
            {
             before(grammarAccess.getActionAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getActionAccess().getTypeTypeRefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__TypeAssignment_1"


    // $ANTLR start "rule__Action__FeatureAssignment_2_1"
    // InternalXtext.g:9378:1: rule__Action__FeatureAssignment_2_1 : ( ruleValidID ) ;
    public final void rule__Action__FeatureAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9382:1: ( ( ruleValidID ) )
            // InternalXtext.g:9383:2: ( ruleValidID )
            {
            // InternalXtext.g:9383:2: ( ruleValidID )
            // InternalXtext.g:9384:3: ruleValidID
            {
             before(grammarAccess.getActionAccess().getFeatureValidIDParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getActionAccess().getFeatureValidIDParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__FeatureAssignment_2_1"


    // $ANTLR start "rule__Action__OperatorAssignment_2_2"
    // InternalXtext.g:9393:1: rule__Action__OperatorAssignment_2_2 : ( ( rule__Action__OperatorAlternatives_2_2_0 ) ) ;
    public final void rule__Action__OperatorAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9397:1: ( ( ( rule__Action__OperatorAlternatives_2_2_0 ) ) )
            // InternalXtext.g:9398:2: ( ( rule__Action__OperatorAlternatives_2_2_0 ) )
            {
            // InternalXtext.g:9398:2: ( ( rule__Action__OperatorAlternatives_2_2_0 ) )
            // InternalXtext.g:9399:3: ( rule__Action__OperatorAlternatives_2_2_0 )
            {
             before(grammarAccess.getActionAccess().getOperatorAlternatives_2_2_0()); 
            // InternalXtext.g:9400:3: ( rule__Action__OperatorAlternatives_2_2_0 )
            // InternalXtext.g:9400:4: rule__Action__OperatorAlternatives_2_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__OperatorAlternatives_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getOperatorAlternatives_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__OperatorAssignment_2_2"


    // $ANTLR start "rule__Keyword__ValueAssignment"
    // InternalXtext.g:9408:1: rule__Keyword__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Keyword__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9412:1: ( ( RULE_STRING ) )
            // InternalXtext.g:9413:2: ( RULE_STRING )
            {
            // InternalXtext.g:9413:2: ( RULE_STRING )
            // InternalXtext.g:9414:3: RULE_STRING
            {
             before(grammarAccess.getKeywordAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getKeywordAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keyword__ValueAssignment"


    // $ANTLR start "rule__RuleCall__RuleAssignment_0"
    // InternalXtext.g:9423:1: rule__RuleCall__RuleAssignment_0 : ( ( ruleRuleID ) ) ;
    public final void rule__RuleCall__RuleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9427:1: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:9428:2: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:9428:2: ( ( ruleRuleID ) )
            // InternalXtext.g:9429:3: ( ruleRuleID )
            {
             before(grammarAccess.getRuleCallAccess().getRuleAbstractRuleCrossReference_0_0()); 
            // InternalXtext.g:9430:3: ( ruleRuleID )
            // InternalXtext.g:9431:4: ruleRuleID
            {
             before(grammarAccess.getRuleCallAccess().getRuleAbstractRuleRuleIDParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getRuleCallAccess().getRuleAbstractRuleRuleIDParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRuleCallAccess().getRuleAbstractRuleCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__RuleAssignment_0"


    // $ANTLR start "rule__RuleCall__ArgumentsAssignment_1_1"
    // InternalXtext.g:9442:1: rule__RuleCall__ArgumentsAssignment_1_1 : ( ruleNamedArgument ) ;
    public final void rule__RuleCall__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9446:1: ( ( ruleNamedArgument ) )
            // InternalXtext.g:9447:2: ( ruleNamedArgument )
            {
            // InternalXtext.g:9447:2: ( ruleNamedArgument )
            // InternalXtext.g:9448:3: ruleNamedArgument
            {
             before(grammarAccess.getRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNamedArgument();

            state._fsp--;

             after(grammarAccess.getRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__RuleCall__ArgumentsAssignment_1_2_1"
    // InternalXtext.g:9457:1: rule__RuleCall__ArgumentsAssignment_1_2_1 : ( ruleNamedArgument ) ;
    public final void rule__RuleCall__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9461:1: ( ( ruleNamedArgument ) )
            // InternalXtext.g:9462:2: ( ruleNamedArgument )
            {
            // InternalXtext.g:9462:2: ( ruleNamedArgument )
            // InternalXtext.g:9463:3: ruleNamedArgument
            {
             before(grammarAccess.getRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_1_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNamedArgument();

            state._fsp--;

             after(grammarAccess.getRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__ArgumentsAssignment_1_2_1"


    // $ANTLR start "rule__NamedArgument__ParameterAssignment_0_0"
    // InternalXtext.g:9472:1: rule__NamedArgument__ParameterAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__NamedArgument__ParameterAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9476:1: ( ( ( RULE_ID ) ) )
            // InternalXtext.g:9477:2: ( ( RULE_ID ) )
            {
            // InternalXtext.g:9477:2: ( ( RULE_ID ) )
            // InternalXtext.g:9478:3: ( RULE_ID )
            {
             before(grammarAccess.getNamedArgumentAccess().getParameterParameterCrossReference_0_0_0()); 
            // InternalXtext.g:9479:3: ( RULE_ID )
            // InternalXtext.g:9480:4: RULE_ID
            {
             before(grammarAccess.getNamedArgumentAccess().getParameterParameterIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getNamedArgumentAccess().getParameterParameterIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getNamedArgumentAccess().getParameterParameterCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__ParameterAssignment_0_0"


    // $ANTLR start "rule__NamedArgument__CalledByNameAssignment_0_1"
    // InternalXtext.g:9491:1: rule__NamedArgument__CalledByNameAssignment_0_1 : ( ( '=' ) ) ;
    public final void rule__NamedArgument__CalledByNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9495:1: ( ( ( '=' ) ) )
            // InternalXtext.g:9496:2: ( ( '=' ) )
            {
            // InternalXtext.g:9496:2: ( ( '=' ) )
            // InternalXtext.g:9497:3: ( '=' )
            {
             before(grammarAccess.getNamedArgumentAccess().getCalledByNameEqualsSignKeyword_0_1_0()); 
            // InternalXtext.g:9498:3: ( '=' )
            // InternalXtext.g:9499:4: '='
            {
             before(grammarAccess.getNamedArgumentAccess().getCalledByNameEqualsSignKeyword_0_1_0()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getNamedArgumentAccess().getCalledByNameEqualsSignKeyword_0_1_0()); 

            }

             after(grammarAccess.getNamedArgumentAccess().getCalledByNameEqualsSignKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__CalledByNameAssignment_0_1"


    // $ANTLR start "rule__NamedArgument__ValueAssignment_1"
    // InternalXtext.g:9510:1: rule__NamedArgument__ValueAssignment_1 : ( ruleDisjunction ) ;
    public final void rule__NamedArgument__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9514:1: ( ( ruleDisjunction ) )
            // InternalXtext.g:9515:2: ( ruleDisjunction )
            {
            // InternalXtext.g:9515:2: ( ruleDisjunction )
            // InternalXtext.g:9516:3: ruleDisjunction
            {
             before(grammarAccess.getNamedArgumentAccess().getValueDisjunctionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunction();

            state._fsp--;

             after(grammarAccess.getNamedArgumentAccess().getValueDisjunctionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__ValueAssignment_1"


    // $ANTLR start "rule__LiteralCondition__TrueAssignment_1_0"
    // InternalXtext.g:9525:1: rule__LiteralCondition__TrueAssignment_1_0 : ( ( 'true' ) ) ;
    public final void rule__LiteralCondition__TrueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9529:1: ( ( ( 'true' ) ) )
            // InternalXtext.g:9530:2: ( ( 'true' ) )
            {
            // InternalXtext.g:9530:2: ( ( 'true' ) )
            // InternalXtext.g:9531:3: ( 'true' )
            {
             before(grammarAccess.getLiteralConditionAccess().getTrueTrueKeyword_1_0_0()); 
            // InternalXtext.g:9532:3: ( 'true' )
            // InternalXtext.g:9533:4: 'true'
            {
             before(grammarAccess.getLiteralConditionAccess().getTrueTrueKeyword_1_0_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLiteralConditionAccess().getTrueTrueKeyword_1_0_0()); 

            }

             after(grammarAccess.getLiteralConditionAccess().getTrueTrueKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralCondition__TrueAssignment_1_0"


    // $ANTLR start "rule__Disjunction__RightAssignment_1_2"
    // InternalXtext.g:9544:1: rule__Disjunction__RightAssignment_1_2 : ( ruleConjunction ) ;
    public final void rule__Disjunction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9548:1: ( ( ruleConjunction ) )
            // InternalXtext.g:9549:2: ( ruleConjunction )
            {
            // InternalXtext.g:9549:2: ( ruleConjunction )
            // InternalXtext.g:9550:3: ruleConjunction
            {
             before(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__RightAssignment_1_2"


    // $ANTLR start "rule__Conjunction__RightAssignment_1_2"
    // InternalXtext.g:9559:1: rule__Conjunction__RightAssignment_1_2 : ( ruleNegation ) ;
    public final void rule__Conjunction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9563:1: ( ( ruleNegation ) )
            // InternalXtext.g:9564:2: ( ruleNegation )
            {
            // InternalXtext.g:9564:2: ( ruleNegation )
            // InternalXtext.g:9565:3: ruleNegation
            {
             before(grammarAccess.getConjunctionAccess().getRightNegationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getRightNegationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__RightAssignment_1_2"


    // $ANTLR start "rule__Negation__ValueAssignment_1_2"
    // InternalXtext.g:9574:1: rule__Negation__ValueAssignment_1_2 : ( ruleNegation ) ;
    public final void rule__Negation__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9578:1: ( ( ruleNegation ) )
            // InternalXtext.g:9579:2: ( ruleNegation )
            {
            // InternalXtext.g:9579:2: ( ruleNegation )
            // InternalXtext.g:9580:3: ruleNegation
            {
             before(grammarAccess.getNegationAccess().getValueNegationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationAccess().getValueNegationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__ValueAssignment_1_2"


    // $ANTLR start "rule__ParameterReference__ParameterAssignment"
    // InternalXtext.g:9589:1: rule__ParameterReference__ParameterAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ParameterReference__ParameterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9593:1: ( ( ( RULE_ID ) ) )
            // InternalXtext.g:9594:2: ( ( RULE_ID ) )
            {
            // InternalXtext.g:9594:2: ( ( RULE_ID ) )
            // InternalXtext.g:9595:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterReferenceAccess().getParameterParameterCrossReference_0()); 
            // InternalXtext.g:9596:3: ( RULE_ID )
            // InternalXtext.g:9597:4: RULE_ID
            {
             before(grammarAccess.getParameterReferenceAccess().getParameterParameterIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParameterReferenceAccess().getParameterParameterIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getParameterReferenceAccess().getParameterParameterCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterReference__ParameterAssignment"


    // $ANTLR start "rule__TerminalRuleCall__RuleAssignment"
    // InternalXtext.g:9608:1: rule__TerminalRuleCall__RuleAssignment : ( ( ruleRuleID ) ) ;
    public final void rule__TerminalRuleCall__RuleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9612:1: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:9613:2: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:9613:2: ( ( ruleRuleID ) )
            // InternalXtext.g:9614:3: ( ruleRuleID )
            {
             before(grammarAccess.getTerminalRuleCallAccess().getRuleAbstractRuleCrossReference_0()); 
            // InternalXtext.g:9615:3: ( ruleRuleID )
            // InternalXtext.g:9616:4: ruleRuleID
            {
             before(grammarAccess.getTerminalRuleCallAccess().getRuleAbstractRuleRuleIDParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getTerminalRuleCallAccess().getRuleAbstractRuleRuleIDParserRuleCall_0_1()); 

            }

             after(grammarAccess.getTerminalRuleCallAccess().getRuleAbstractRuleCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRuleCall__RuleAssignment"


    // $ANTLR start "rule__PredicatedKeyword__PredicatedAssignment_0_0"
    // InternalXtext.g:9627:1: rule__PredicatedKeyword__PredicatedAssignment_0_0 : ( ( '=>' ) ) ;
    public final void rule__PredicatedKeyword__PredicatedAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9631:1: ( ( ( '=>' ) ) )
            // InternalXtext.g:9632:2: ( ( '=>' ) )
            {
            // InternalXtext.g:9632:2: ( ( '=>' ) )
            // InternalXtext.g:9633:3: ( '=>' )
            {
             before(grammarAccess.getPredicatedKeywordAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            // InternalXtext.g:9634:3: ( '=>' )
            // InternalXtext.g:9635:4: '=>'
            {
             before(grammarAccess.getPredicatedKeywordAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            match(input,52,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedKeywordAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }

             after(grammarAccess.getPredicatedKeywordAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedKeyword__PredicatedAssignment_0_0"


    // $ANTLR start "rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1"
    // InternalXtext.g:9646:1: rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1 : ( ( '->' ) ) ;
    public final void rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9650:1: ( ( ( '->' ) ) )
            // InternalXtext.g:9651:2: ( ( '->' ) )
            {
            // InternalXtext.g:9651:2: ( ( '->' ) )
            // InternalXtext.g:9652:3: ( '->' )
            {
             before(grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            // InternalXtext.g:9653:3: ( '->' )
            // InternalXtext.g:9654:4: '->'
            {
             before(grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            match(input,46,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }

             after(grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1"


    // $ANTLR start "rule__PredicatedKeyword__ValueAssignment_1"
    // InternalXtext.g:9665:1: rule__PredicatedKeyword__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PredicatedKeyword__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9669:1: ( ( RULE_STRING ) )
            // InternalXtext.g:9670:2: ( RULE_STRING )
            {
            // InternalXtext.g:9670:2: ( RULE_STRING )
            // InternalXtext.g:9671:3: RULE_STRING
            {
             before(grammarAccess.getPredicatedKeywordAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedKeywordAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedKeyword__ValueAssignment_1"


    // $ANTLR start "rule__PredicatedRuleCall__PredicatedAssignment_0_0"
    // InternalXtext.g:9680:1: rule__PredicatedRuleCall__PredicatedAssignment_0_0 : ( ( '=>' ) ) ;
    public final void rule__PredicatedRuleCall__PredicatedAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9684:1: ( ( ( '=>' ) ) )
            // InternalXtext.g:9685:2: ( ( '=>' ) )
            {
            // InternalXtext.g:9685:2: ( ( '=>' ) )
            // InternalXtext.g:9686:3: ( '=>' )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            // InternalXtext.g:9687:3: ( '=>' )
            // InternalXtext.g:9688:4: '=>'
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            match(input,52,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedRuleCallAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }

             after(grammarAccess.getPredicatedRuleCallAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__PredicatedAssignment_0_0"


    // $ANTLR start "rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1"
    // InternalXtext.g:9699:1: rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1 : ( ( '->' ) ) ;
    public final void rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9703:1: ( ( ( '->' ) ) )
            // InternalXtext.g:9704:2: ( ( '->' ) )
            {
            // InternalXtext.g:9704:2: ( ( '->' ) )
            // InternalXtext.g:9705:3: ( '->' )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            // InternalXtext.g:9706:3: ( '->' )
            // InternalXtext.g:9707:4: '->'
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            match(input,46,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }

             after(grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1"


    // $ANTLR start "rule__PredicatedRuleCall__RuleAssignment_1"
    // InternalXtext.g:9718:1: rule__PredicatedRuleCall__RuleAssignment_1 : ( ( ruleRuleID ) ) ;
    public final void rule__PredicatedRuleCall__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9722:1: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:9723:2: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:9723:2: ( ( ruleRuleID ) )
            // InternalXtext.g:9724:3: ( ruleRuleID )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getRuleAbstractRuleCrossReference_1_0()); 
            // InternalXtext.g:9725:3: ( ruleRuleID )
            // InternalXtext.g:9726:4: ruleRuleID
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getRuleAbstractRuleRuleIDParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getPredicatedRuleCallAccess().getRuleAbstractRuleRuleIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPredicatedRuleCallAccess().getRuleAbstractRuleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__RuleAssignment_1"


    // $ANTLR start "rule__PredicatedRuleCall__ArgumentsAssignment_2_1"
    // InternalXtext.g:9737:1: rule__PredicatedRuleCall__ArgumentsAssignment_2_1 : ( ruleNamedArgument ) ;
    public final void rule__PredicatedRuleCall__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9741:1: ( ( ruleNamedArgument ) )
            // InternalXtext.g:9742:2: ( ruleNamedArgument )
            {
            // InternalXtext.g:9742:2: ( ruleNamedArgument )
            // InternalXtext.g:9743:3: ruleNamedArgument
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNamedArgument();

            state._fsp--;

             after(grammarAccess.getPredicatedRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__ArgumentsAssignment_2_1"


    // $ANTLR start "rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1"
    // InternalXtext.g:9752:1: rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1 : ( ruleNamedArgument ) ;
    public final void rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9756:1: ( ( ruleNamedArgument ) )
            // InternalXtext.g:9757:2: ( ruleNamedArgument )
            {
            // InternalXtext.g:9757:2: ( ruleNamedArgument )
            // InternalXtext.g:9758:3: ruleNamedArgument
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_2_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNamedArgument();

            state._fsp--;

             after(grammarAccess.getPredicatedRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1"


    // $ANTLR start "rule__Assignment__PredicatedAssignment_0_0"
    // InternalXtext.g:9767:1: rule__Assignment__PredicatedAssignment_0_0 : ( ( '=>' ) ) ;
    public final void rule__Assignment__PredicatedAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9771:1: ( ( ( '=>' ) ) )
            // InternalXtext.g:9772:2: ( ( '=>' ) )
            {
            // InternalXtext.g:9772:2: ( ( '=>' ) )
            // InternalXtext.g:9773:3: ( '=>' )
            {
             before(grammarAccess.getAssignmentAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            // InternalXtext.g:9774:3: ( '=>' )
            // InternalXtext.g:9775:4: '=>'
            {
             before(grammarAccess.getAssignmentAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            match(input,52,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }

             after(grammarAccess.getAssignmentAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__PredicatedAssignment_0_0"


    // $ANTLR start "rule__Assignment__FirstSetPredicatedAssignment_0_1"
    // InternalXtext.g:9786:1: rule__Assignment__FirstSetPredicatedAssignment_0_1 : ( ( '->' ) ) ;
    public final void rule__Assignment__FirstSetPredicatedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9790:1: ( ( ( '->' ) ) )
            // InternalXtext.g:9791:2: ( ( '->' ) )
            {
            // InternalXtext.g:9791:2: ( ( '->' ) )
            // InternalXtext.g:9792:3: ( '->' )
            {
             before(grammarAccess.getAssignmentAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            // InternalXtext.g:9793:3: ( '->' )
            // InternalXtext.g:9794:4: '->'
            {
             before(grammarAccess.getAssignmentAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            match(input,46,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }

             after(grammarAccess.getAssignmentAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__FirstSetPredicatedAssignment_0_1"


    // $ANTLR start "rule__Assignment__FeatureAssignment_1"
    // InternalXtext.g:9805:1: rule__Assignment__FeatureAssignment_1 : ( ruleValidID ) ;
    public final void rule__Assignment__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9809:1: ( ( ruleValidID ) )
            // InternalXtext.g:9810:2: ( ruleValidID )
            {
            // InternalXtext.g:9810:2: ( ruleValidID )
            // InternalXtext.g:9811:3: ruleValidID
            {
             before(grammarAccess.getAssignmentAccess().getFeatureValidIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getFeatureValidIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__FeatureAssignment_1"


    // $ANTLR start "rule__Assignment__OperatorAssignment_2"
    // InternalXtext.g:9820:1: rule__Assignment__OperatorAssignment_2 : ( ( rule__Assignment__OperatorAlternatives_2_0 ) ) ;
    public final void rule__Assignment__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9824:1: ( ( ( rule__Assignment__OperatorAlternatives_2_0 ) ) )
            // InternalXtext.g:9825:2: ( ( rule__Assignment__OperatorAlternatives_2_0 ) )
            {
            // InternalXtext.g:9825:2: ( ( rule__Assignment__OperatorAlternatives_2_0 ) )
            // InternalXtext.g:9826:3: ( rule__Assignment__OperatorAlternatives_2_0 )
            {
             before(grammarAccess.getAssignmentAccess().getOperatorAlternatives_2_0()); 
            // InternalXtext.g:9827:3: ( rule__Assignment__OperatorAlternatives_2_0 )
            // InternalXtext.g:9827:4: rule__Assignment__OperatorAlternatives_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__OperatorAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getOperatorAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__OperatorAssignment_2"


    // $ANTLR start "rule__Assignment__TerminalAssignment_3"
    // InternalXtext.g:9835:1: rule__Assignment__TerminalAssignment_3 : ( ruleAssignableTerminal ) ;
    public final void rule__Assignment__TerminalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9839:1: ( ( ruleAssignableTerminal ) )
            // InternalXtext.g:9840:2: ( ruleAssignableTerminal )
            {
            // InternalXtext.g:9840:2: ( ruleAssignableTerminal )
            // InternalXtext.g:9841:3: ruleAssignableTerminal
            {
             before(grammarAccess.getAssignmentAccess().getTerminalAssignableTerminalParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignableTerminal();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getTerminalAssignableTerminalParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__TerminalAssignment_3"


    // $ANTLR start "rule__AssignableAlternatives__ElementsAssignment_1_1_1"
    // InternalXtext.g:9850:1: rule__AssignableAlternatives__ElementsAssignment_1_1_1 : ( ruleAssignableTerminal ) ;
    public final void rule__AssignableAlternatives__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9854:1: ( ( ruleAssignableTerminal ) )
            // InternalXtext.g:9855:2: ( ruleAssignableTerminal )
            {
            // InternalXtext.g:9855:2: ( ruleAssignableTerminal )
            // InternalXtext.g:9856:3: ruleAssignableTerminal
            {
             before(grammarAccess.getAssignableAlternativesAccess().getElementsAssignableTerminalParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignableTerminal();

            state._fsp--;

             after(grammarAccess.getAssignableAlternativesAccess().getElementsAssignableTerminalParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__ElementsAssignment_1_1_1"


    // $ANTLR start "rule__CrossReference__TypeAssignment_1"
    // InternalXtext.g:9865:1: rule__CrossReference__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__CrossReference__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9869:1: ( ( ruleTypeRef ) )
            // InternalXtext.g:9870:2: ( ruleTypeRef )
            {
            // InternalXtext.g:9870:2: ( ruleTypeRef )
            // InternalXtext.g:9871:3: ruleTypeRef
            {
             before(grammarAccess.getCrossReferenceAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getCrossReferenceAccess().getTypeTypeRefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__TypeAssignment_1"


    // $ANTLR start "rule__CrossReference__TerminalAssignment_2_1"
    // InternalXtext.g:9880:1: rule__CrossReference__TerminalAssignment_2_1 : ( ruleCrossReferenceableTerminal ) ;
    public final void rule__CrossReference__TerminalAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9884:1: ( ( ruleCrossReferenceableTerminal ) )
            // InternalXtext.g:9885:2: ( ruleCrossReferenceableTerminal )
            {
            // InternalXtext.g:9885:2: ( ruleCrossReferenceableTerminal )
            // InternalXtext.g:9886:3: ruleCrossReferenceableTerminal
            {
             before(grammarAccess.getCrossReferenceAccess().getTerminalCrossReferenceableTerminalParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCrossReferenceableTerminal();

            state._fsp--;

             after(grammarAccess.getCrossReferenceAccess().getTerminalCrossReferenceableTerminalParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__TerminalAssignment_2_1"


    // $ANTLR start "rule__PredicatedGroup__PredicatedAssignment_0_0"
    // InternalXtext.g:9895:1: rule__PredicatedGroup__PredicatedAssignment_0_0 : ( ( '=>' ) ) ;
    public final void rule__PredicatedGroup__PredicatedAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9899:1: ( ( ( '=>' ) ) )
            // InternalXtext.g:9900:2: ( ( '=>' ) )
            {
            // InternalXtext.g:9900:2: ( ( '=>' ) )
            // InternalXtext.g:9901:3: ( '=>' )
            {
             before(grammarAccess.getPredicatedGroupAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            // InternalXtext.g:9902:3: ( '=>' )
            // InternalXtext.g:9903:4: '=>'
            {
             before(grammarAccess.getPredicatedGroupAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            match(input,52,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedGroupAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }

             after(grammarAccess.getPredicatedGroupAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__PredicatedAssignment_0_0"


    // $ANTLR start "rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1"
    // InternalXtext.g:9914:1: rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1 : ( ( '->' ) ) ;
    public final void rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9918:1: ( ( ( '->' ) ) )
            // InternalXtext.g:9919:2: ( ( '->' ) )
            {
            // InternalXtext.g:9919:2: ( ( '->' ) )
            // InternalXtext.g:9920:3: ( '->' )
            {
             before(grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            // InternalXtext.g:9921:3: ( '->' )
            // InternalXtext.g:9922:4: '->'
            {
             before(grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            match(input,46,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }

             after(grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1"


    // $ANTLR start "rule__PredicatedGroup__ElementsAssignment_2"
    // InternalXtext.g:9933:1: rule__PredicatedGroup__ElementsAssignment_2 : ( ruleAlternatives ) ;
    public final void rule__PredicatedGroup__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9937:1: ( ( ruleAlternatives ) )
            // InternalXtext.g:9938:2: ( ruleAlternatives )
            {
            // InternalXtext.g:9938:2: ( ruleAlternatives )
            // InternalXtext.g:9939:3: ruleAlternatives
            {
             before(grammarAccess.getPredicatedGroupAccess().getElementsAlternativesParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getPredicatedGroupAccess().getElementsAlternativesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__ElementsAssignment_2"


    // $ANTLR start "rule__TerminalRule__AnnotationsAssignment_0"
    // InternalXtext.g:9948:1: rule__TerminalRule__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__TerminalRule__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9952:1: ( ( ruleAnnotation ) )
            // InternalXtext.g:9953:2: ( ruleAnnotation )
            {
            // InternalXtext.g:9953:2: ( ruleAnnotation )
            // InternalXtext.g:9954:3: ruleAnnotation
            {
             before(grammarAccess.getTerminalRuleAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getTerminalRuleAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__AnnotationsAssignment_0"


    // $ANTLR start "rule__TerminalRule__FragmentAssignment_2_0_0"
    // InternalXtext.g:9963:1: rule__TerminalRule__FragmentAssignment_2_0_0 : ( ( 'fragment' ) ) ;
    public final void rule__TerminalRule__FragmentAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9967:1: ( ( ( 'fragment' ) ) )
            // InternalXtext.g:9968:2: ( ( 'fragment' ) )
            {
            // InternalXtext.g:9968:2: ( ( 'fragment' ) )
            // InternalXtext.g:9969:3: ( 'fragment' )
            {
             before(grammarAccess.getTerminalRuleAccess().getFragmentFragmentKeyword_2_0_0_0()); 
            // InternalXtext.g:9970:3: ( 'fragment' )
            // InternalXtext.g:9971:4: 'fragment'
            {
             before(grammarAccess.getTerminalRuleAccess().getFragmentFragmentKeyword_2_0_0_0()); 
            match(input,51,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTerminalRuleAccess().getFragmentFragmentKeyword_2_0_0_0()); 

            }

             after(grammarAccess.getTerminalRuleAccess().getFragmentFragmentKeyword_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__FragmentAssignment_2_0_0"


    // $ANTLR start "rule__TerminalRule__NameAssignment_2_0_1"
    // InternalXtext.g:9982:1: rule__TerminalRule__NameAssignment_2_0_1 : ( ruleValidID ) ;
    public final void rule__TerminalRule__NameAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:9986:1: ( ( ruleValidID ) )
            // InternalXtext.g:9987:2: ( ruleValidID )
            {
            // InternalXtext.g:9987:2: ( ruleValidID )
            // InternalXtext.g:9988:3: ruleValidID
            {
             before(grammarAccess.getTerminalRuleAccess().getNameValidIDParserRuleCall_2_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getTerminalRuleAccess().getNameValidIDParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__NameAssignment_2_0_1"


    // $ANTLR start "rule__TerminalRule__NameAssignment_2_1_0"
    // InternalXtext.g:9997:1: rule__TerminalRule__NameAssignment_2_1_0 : ( ruleValidID ) ;
    public final void rule__TerminalRule__NameAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10001:1: ( ( ruleValidID ) )
            // InternalXtext.g:10002:2: ( ruleValidID )
            {
            // InternalXtext.g:10002:2: ( ruleValidID )
            // InternalXtext.g:10003:3: ruleValidID
            {
             before(grammarAccess.getTerminalRuleAccess().getNameValidIDParserRuleCall_2_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getTerminalRuleAccess().getNameValidIDParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__NameAssignment_2_1_0"


    // $ANTLR start "rule__TerminalRule__TypeAssignment_2_1_1_1"
    // InternalXtext.g:10012:1: rule__TerminalRule__TypeAssignment_2_1_1_1 : ( ruleTypeRef ) ;
    public final void rule__TerminalRule__TypeAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10016:1: ( ( ruleTypeRef ) )
            // InternalXtext.g:10017:2: ( ruleTypeRef )
            {
            // InternalXtext.g:10017:2: ( ruleTypeRef )
            // InternalXtext.g:10018:3: ruleTypeRef
            {
             before(grammarAccess.getTerminalRuleAccess().getTypeTypeRefParserRuleCall_2_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTerminalRuleAccess().getTypeTypeRefParserRuleCall_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__TypeAssignment_2_1_1_1"


    // $ANTLR start "rule__TerminalRule__AlternativesAssignment_4"
    // InternalXtext.g:10027:1: rule__TerminalRule__AlternativesAssignment_4 : ( ruleTerminalAlternatives ) ;
    public final void rule__TerminalRule__AlternativesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10031:1: ( ( ruleTerminalAlternatives ) )
            // InternalXtext.g:10032:2: ( ruleTerminalAlternatives )
            {
            // InternalXtext.g:10032:2: ( ruleTerminalAlternatives )
            // InternalXtext.g:10033:3: ruleTerminalAlternatives
            {
             before(grammarAccess.getTerminalRuleAccess().getAlternativesTerminalAlternativesParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalAlternatives();

            state._fsp--;

             after(grammarAccess.getTerminalRuleAccess().getAlternativesTerminalAlternativesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__AlternativesAssignment_4"


    // $ANTLR start "rule__TerminalAlternatives__ElementsAssignment_1_1_1"
    // InternalXtext.g:10042:1: rule__TerminalAlternatives__ElementsAssignment_1_1_1 : ( ruleTerminalGroup ) ;
    public final void rule__TerminalAlternatives__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10046:1: ( ( ruleTerminalGroup ) )
            // InternalXtext.g:10047:2: ( ruleTerminalGroup )
            {
            // InternalXtext.g:10047:2: ( ruleTerminalGroup )
            // InternalXtext.g:10048:3: ruleTerminalGroup
            {
             before(grammarAccess.getTerminalAlternativesAccess().getElementsTerminalGroupParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalGroup();

            state._fsp--;

             after(grammarAccess.getTerminalAlternativesAccess().getElementsTerminalGroupParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__ElementsAssignment_1_1_1"


    // $ANTLR start "rule__TerminalGroup__ElementsAssignment_1_1"
    // InternalXtext.g:10057:1: rule__TerminalGroup__ElementsAssignment_1_1 : ( ruleTerminalToken ) ;
    public final void rule__TerminalGroup__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10061:1: ( ( ruleTerminalToken ) )
            // InternalXtext.g:10062:2: ( ruleTerminalToken )
            {
            // InternalXtext.g:10062:2: ( ruleTerminalToken )
            // InternalXtext.g:10063:3: ruleTerminalToken
            {
             before(grammarAccess.getTerminalGroupAccess().getElementsTerminalTokenParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalToken();

            state._fsp--;

             after(grammarAccess.getTerminalGroupAccess().getElementsTerminalTokenParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__ElementsAssignment_1_1"


    // $ANTLR start "rule__TerminalToken__CardinalityAssignment_1"
    // InternalXtext.g:10072:1: rule__TerminalToken__CardinalityAssignment_1 : ( ( rule__TerminalToken__CardinalityAlternatives_1_0 ) ) ;
    public final void rule__TerminalToken__CardinalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10076:1: ( ( ( rule__TerminalToken__CardinalityAlternatives_1_0 ) ) )
            // InternalXtext.g:10077:2: ( ( rule__TerminalToken__CardinalityAlternatives_1_0 ) )
            {
            // InternalXtext.g:10077:2: ( ( rule__TerminalToken__CardinalityAlternatives_1_0 ) )
            // InternalXtext.g:10078:3: ( rule__TerminalToken__CardinalityAlternatives_1_0 )
            {
             before(grammarAccess.getTerminalTokenAccess().getCardinalityAlternatives_1_0()); 
            // InternalXtext.g:10079:3: ( rule__TerminalToken__CardinalityAlternatives_1_0 )
            // InternalXtext.g:10079:4: rule__TerminalToken__CardinalityAlternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalToken__CardinalityAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalTokenAccess().getCardinalityAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalToken__CardinalityAssignment_1"


    // $ANTLR start "rule__NegatedToken__TerminalAssignment_1"
    // InternalXtext.g:10087:1: rule__NegatedToken__TerminalAssignment_1 : ( ruleTerminalTokenElement ) ;
    public final void rule__NegatedToken__TerminalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10091:1: ( ( ruleTerminalTokenElement ) )
            // InternalXtext.g:10092:2: ( ruleTerminalTokenElement )
            {
            // InternalXtext.g:10092:2: ( ruleTerminalTokenElement )
            // InternalXtext.g:10093:3: ruleTerminalTokenElement
            {
             before(grammarAccess.getNegatedTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalTokenElement();

            state._fsp--;

             after(grammarAccess.getNegatedTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedToken__TerminalAssignment_1"


    // $ANTLR start "rule__UntilToken__TerminalAssignment_1"
    // InternalXtext.g:10102:1: rule__UntilToken__TerminalAssignment_1 : ( ruleTerminalTokenElement ) ;
    public final void rule__UntilToken__TerminalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10106:1: ( ( ruleTerminalTokenElement ) )
            // InternalXtext.g:10107:2: ( ruleTerminalTokenElement )
            {
            // InternalXtext.g:10107:2: ( ruleTerminalTokenElement )
            // InternalXtext.g:10108:3: ruleTerminalTokenElement
            {
             before(grammarAccess.getUntilTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalTokenElement();

            state._fsp--;

             after(grammarAccess.getUntilTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntilToken__TerminalAssignment_1"


    // $ANTLR start "rule__CharacterRange__RightAssignment_1_2"
    // InternalXtext.g:10117:1: rule__CharacterRange__RightAssignment_1_2 : ( ruleKeyword ) ;
    public final void rule__CharacterRange__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10121:1: ( ( ruleKeyword ) )
            // InternalXtext.g:10122:2: ( ruleKeyword )
            {
            // InternalXtext.g:10122:2: ( ruleKeyword )
            // InternalXtext.g:10123:3: ruleKeyword
            {
             before(grammarAccess.getCharacterRangeAccess().getRightKeywordParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getCharacterRangeAccess().getRightKeywordParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__RightAssignment_1_2"


    // $ANTLR start "rule__EnumRule__AnnotationsAssignment_0"
    // InternalXtext.g:10132:1: rule__EnumRule__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__EnumRule__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10136:1: ( ( ruleAnnotation ) )
            // InternalXtext.g:10137:2: ( ruleAnnotation )
            {
            // InternalXtext.g:10137:2: ( ruleAnnotation )
            // InternalXtext.g:10138:3: ruleAnnotation
            {
             before(grammarAccess.getEnumRuleAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getEnumRuleAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__AnnotationsAssignment_0"


    // $ANTLR start "rule__EnumRule__NameAssignment_2"
    // InternalXtext.g:10147:1: rule__EnumRule__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__EnumRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10151:1: ( ( ruleValidID ) )
            // InternalXtext.g:10152:2: ( ruleValidID )
            {
            // InternalXtext.g:10152:2: ( ruleValidID )
            // InternalXtext.g:10153:3: ruleValidID
            {
             before(grammarAccess.getEnumRuleAccess().getNameValidIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getEnumRuleAccess().getNameValidIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__NameAssignment_2"


    // $ANTLR start "rule__EnumRule__TypeAssignment_3_1"
    // InternalXtext.g:10162:1: rule__EnumRule__TypeAssignment_3_1 : ( ruleTypeRef ) ;
    public final void rule__EnumRule__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10166:1: ( ( ruleTypeRef ) )
            // InternalXtext.g:10167:2: ( ruleTypeRef )
            {
            // InternalXtext.g:10167:2: ( ruleTypeRef )
            // InternalXtext.g:10168:3: ruleTypeRef
            {
             before(grammarAccess.getEnumRuleAccess().getTypeTypeRefParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getEnumRuleAccess().getTypeTypeRefParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__TypeAssignment_3_1"


    // $ANTLR start "rule__EnumRule__AlternativesAssignment_5"
    // InternalXtext.g:10177:1: rule__EnumRule__AlternativesAssignment_5 : ( ruleEnumLiterals ) ;
    public final void rule__EnumRule__AlternativesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10181:1: ( ( ruleEnumLiterals ) )
            // InternalXtext.g:10182:2: ( ruleEnumLiterals )
            {
            // InternalXtext.g:10182:2: ( ruleEnumLiterals )
            // InternalXtext.g:10183:3: ruleEnumLiterals
            {
             before(grammarAccess.getEnumRuleAccess().getAlternativesEnumLiteralsParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEnumLiterals();

            state._fsp--;

             after(grammarAccess.getEnumRuleAccess().getAlternativesEnumLiteralsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__AlternativesAssignment_5"


    // $ANTLR start "rule__EnumLiterals__ElementsAssignment_1_1_1"
    // InternalXtext.g:10192:1: rule__EnumLiterals__ElementsAssignment_1_1_1 : ( ruleEnumLiteralDeclaration ) ;
    public final void rule__EnumLiterals__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10196:1: ( ( ruleEnumLiteralDeclaration ) )
            // InternalXtext.g:10197:2: ( ruleEnumLiteralDeclaration )
            {
            // InternalXtext.g:10197:2: ( ruleEnumLiteralDeclaration )
            // InternalXtext.g:10198:3: ruleEnumLiteralDeclaration
            {
             before(grammarAccess.getEnumLiteralsAccess().getElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEnumLiteralDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumLiteralsAccess().getElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__ElementsAssignment_1_1_1"


    // $ANTLR start "rule__EnumLiteralDeclaration__EnumLiteralAssignment_0"
    // InternalXtext.g:10207:1: rule__EnumLiteralDeclaration__EnumLiteralAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EnumLiteralDeclaration__EnumLiteralAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10211:1: ( ( ( RULE_ID ) ) )
            // InternalXtext.g:10212:2: ( ( RULE_ID ) )
            {
            // InternalXtext.g:10212:2: ( ( RULE_ID ) )
            // InternalXtext.g:10213:3: ( RULE_ID )
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralCrossReference_0_0()); 
            // InternalXtext.g:10214:3: ( RULE_ID )
            // InternalXtext.g:10215:4: RULE_ID
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__EnumLiteralAssignment_0"


    // $ANTLR start "rule__EnumLiteralDeclaration__LiteralAssignment_1_1"
    // InternalXtext.g:10226:1: rule__EnumLiteralDeclaration__LiteralAssignment_1_1 : ( ruleKeyword ) ;
    public final void rule__EnumLiteralDeclaration__LiteralAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtext.g:10230:1: ( ( ruleKeyword ) )
            // InternalXtext.g:10231:2: ( ruleKeyword )
            {
            // InternalXtext.g:10231:2: ( ruleKeyword )
            // InternalXtext.g:10232:3: ruleKeyword
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralKeywordParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralKeywordParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__LiteralAssignment_1_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\2\4\3\uffff\1\4";
    static final String dfa_3s = "\1\63\1\4\3\uffff\1\63";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\3\1\uffff";
    static final String dfa_5s = "\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\14\uffff\2\2\12\uffff\1\1\17\uffff\1\3\3\uffff\1\4\1\uffff\1\2",
            "\1\5",
            "",
            "",
            "",
            "\1\2\14\uffff\2\2\12\uffff\1\1\17\uffff\1\3\3\uffff\1\4\1\uffff\1\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1519:1: rule__AbstractRule__Alternatives : ( ( ruleParserRule ) | ( ruleTerminalRule ) | ( ruleEnumRule ) );";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\3\uffff\3\6\1\uffff\3\6\1\uffff";
    static final String dfa_9s = "\6\4\1\uffff\3\4\1\uffff";
    static final String dfa_10s = "\1\64\2\27\3\64\1\uffff\3\64\1\uffff";
    static final String dfa_11s = "\6\uffff\1\2\3\uffff\1\1";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\1\6\13\uffff\1\5\1\4\4\uffff\1\6\26\uffff\1\2\5\uffff\1\1",
            "\1\7\1\6\13\uffff\1\11\1\10\4\uffff\1\6",
            "\1\7\1\6\13\uffff\1\11\1\10\4\uffff\1\6",
            "\2\6\6\uffff\3\6\2\12\2\6\1\12\3\uffff\2\6\6\uffff\1\6\2\uffff\1\6\1\uffff\4\6\6\uffff\1\6\5\uffff\1\6",
            "\2\6\6\uffff\3\6\2\12\2\6\1\12\3\uffff\2\6\6\uffff\1\6\2\uffff\1\6\1\uffff\4\6\6\uffff\1\6\5\uffff\1\6",
            "\2\6\6\uffff\3\6\2\12\2\6\1\12\3\uffff\2\6\6\uffff\1\6\2\uffff\1\6\1\uffff\4\6\6\uffff\1\6\5\uffff\1\6",
            "",
            "\2\6\6\uffff\3\6\2\12\2\6\1\12\3\uffff\2\6\6\uffff\1\6\2\uffff\1\6\1\uffff\4\6\6\uffff\1\6\5\uffff\1\6",
            "\2\6\6\uffff\3\6\2\12\2\6\1\12\3\uffff\2\6\6\uffff\1\6\2\uffff\1\6\1\uffff\4\6\6\uffff\1\6\5\uffff\1\6",
            "\2\6\6\uffff\3\6\2\12\2\6\1\12\3\uffff\2\6\6\uffff\1\6\2\uffff\1\6\1\uffff\4\6\6\uffff\1\6\5\uffff\1\6",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1651:1: rule__AbstractTokenWithCardinality__Alternatives_0 : ( ( ruleAssignment ) | ( ruleAbstractTerminal ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000060010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000E200034260010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000014000002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000E200034260012L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001060010L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0008000020060010L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0004000040000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0010408400860030L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100002000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000010L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000860010L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010408000860030L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010408000860032L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010002000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800400000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000860010L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010400000060010L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000098000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000080000860030L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000102000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000060030L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200020000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000060010L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000C40002860030L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000C40002860032L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000140000000L});
    }


}