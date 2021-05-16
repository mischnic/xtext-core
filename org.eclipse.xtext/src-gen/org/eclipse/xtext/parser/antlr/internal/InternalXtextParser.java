package org.eclipse.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.services.XtextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXtextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_JAVA_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grammar'", "'with'", "','", "'hidden'", "'('", "')'", "'.'", "'generate'", "'as'", "'import'", "'@'", "'fragment'", "'*'", "'returns'", "'becomes'", "':'", "';'", "'['", "']'", "'<'", "'>'", "'::'", "'|'", "'&'", "'?'", "'+'", "'{'", "'='", "'+='", "'current'", "'}'", "'true'", "'false'", "'!'", "'=>'", "'->'", "'?='", "'terminal'", "'EOF'", "'..'", "'enum'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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

        public InternalXtextParser(TokenStream input, XtextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Grammar";
       	}

       	@Override
       	protected XtextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGrammar"
    // InternalXtext.g:64:1: entryRuleGrammar returns [EObject current=null] : iv_ruleGrammar= ruleGrammar EOF ;
    public final EObject entryRuleGrammar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammar = null;


        try {
            // InternalXtext.g:64:48: (iv_ruleGrammar= ruleGrammar EOF )
            // InternalXtext.g:65:2: iv_ruleGrammar= ruleGrammar EOF
            {
             newCompositeNode(grammarAccess.getGrammarRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGrammar=ruleGrammar();

            state._fsp--;

             current =iv_ruleGrammar; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // InternalXtext.g:71:1: ruleGrammar returns [EObject current=null] : (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ ) ;
    public final EObject ruleGrammar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_definesHiddenTokens_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_metamodelDeclarations_12_0 = null;

        EObject lv_rules_13_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:77:2: ( (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ ) )
            // InternalXtext.g:78:2: (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ )
            {
            // InternalXtext.g:78:2: (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ )
            // InternalXtext.g:79:3: otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGrammarAccess().getGrammarKeyword_0());
            		
            // InternalXtext.g:83:3: ( (lv_name_1_0= ruleGrammarID ) )
            // InternalXtext.g:84:4: (lv_name_1_0= ruleGrammarID )
            {
            // InternalXtext.g:84:4: (lv_name_1_0= ruleGrammarID )
            // InternalXtext.g:85:5: lv_name_1_0= ruleGrammarID
            {

            					newCompositeNode(grammarAccess.getGrammarAccess().getNameGrammarIDParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_4);
            lv_name_1_0=ruleGrammarID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGrammarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.Xtext.GrammarID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXtext.g:102:3: (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXtext.g:103:4: otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )*
                    {
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getGrammarAccess().getWithKeyword_2_0());
                    			
                    // InternalXtext.g:107:4: ( ( ruleGrammarID ) )
                    // InternalXtext.g:108:5: ( ruleGrammarID )
                    {
                    // InternalXtext.g:108:5: ( ruleGrammarID )
                    // InternalXtext.g:109:6: ruleGrammarID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGrammarRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_5);
                    ruleGrammarID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXtext.g:123:4: (otherlv_4= ',' ( ( ruleGrammarID ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalXtext.g:124:5: otherlv_4= ',' ( ( ruleGrammarID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getGrammarAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalXtext.g:128:5: ( ( ruleGrammarID ) )
                    	    // InternalXtext.g:129:6: ( ruleGrammarID )
                    	    {
                    	    // InternalXtext.g:129:6: ( ruleGrammarID )
                    	    // InternalXtext.g:130:7: ruleGrammarID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getGrammarRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_5);
                    	    ruleGrammarID();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalXtext.g:146:3: ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXtext.g:147:4: ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')'
                    {
                    // InternalXtext.g:147:4: ( (lv_definesHiddenTokens_6_0= 'hidden' ) )
                    // InternalXtext.g:148:5: (lv_definesHiddenTokens_6_0= 'hidden' )
                    {
                    // InternalXtext.g:148:5: (lv_definesHiddenTokens_6_0= 'hidden' )
                    // InternalXtext.g:149:6: lv_definesHiddenTokens_6_0= 'hidden'
                    {
                    lv_definesHiddenTokens_6_0=(Token)match(input,15,FollowSets000.FOLLOW_6); 

                    						newLeafNode(lv_definesHiddenTokens_6_0, grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGrammarRule());
                    						}
                    						setWithLastConsumed(current, "definesHiddenTokens", lv_definesHiddenTokens_6_0 != null, "hidden");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getGrammarAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalXtext.g:165:4: ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID||(LA4_0>=43 && LA4_0<=44)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalXtext.g:166:5: ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )*
                            {
                            // InternalXtext.g:166:5: ( ( ruleRuleID ) )
                            // InternalXtext.g:167:6: ( ruleRuleID )
                            {
                            // InternalXtext.g:167:6: ( ruleRuleID )
                            // InternalXtext.g:168:7: ruleRuleID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getGrammarRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_0_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_8);
                            ruleRuleID();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalXtext.g:182:5: (otherlv_9= ',' ( ( ruleRuleID ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==14) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalXtext.g:183:6: otherlv_9= ',' ( ( ruleRuleID ) )
                            	    {
                            	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_3); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getGrammarAccess().getCommaKeyword_3_2_1_0());
                            	    					
                            	    // InternalXtext.g:187:6: ( ( ruleRuleID ) )
                            	    // InternalXtext.g:188:7: ( ruleRuleID )
                            	    {
                            	    // InternalXtext.g:188:7: ( ruleRuleID )
                            	    // InternalXtext.g:189:8: ruleRuleID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getGrammarRule());
                            	    								}
                            	    							

                            	    								newCompositeNode(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_1_1_0());
                            	    							
                            	    pushFollow(FollowSets000.FOLLOW_8);
                            	    ruleRuleID();

                            	    state._fsp--;


                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getGrammarAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalXtext.g:210:3: ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19||LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalXtext.g:211:4: (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration )
            	    {
            	    // InternalXtext.g:211:4: (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration )
            	    // InternalXtext.g:212:5: lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_metamodelDeclarations_12_0=ruleAbstractMetamodelDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGrammarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metamodelDeclarations",
            	    						lv_metamodelDeclarations_12_0,
            	    						"org.eclipse.xtext.Xtext.AbstractMetamodelDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalXtext.g:229:3: ( (lv_rules_13_0= ruleAbstractRule ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=22 && LA7_0<=23)||(LA7_0>=43 && LA7_0<=44)||LA7_0==49||LA7_0==52) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXtext.g:230:4: (lv_rules_13_0= ruleAbstractRule )
            	    {
            	    // InternalXtext.g:230:4: (lv_rules_13_0= ruleAbstractRule )
            	    // InternalXtext.g:231:5: lv_rules_13_0= ruleAbstractRule
            	    {

            	    					newCompositeNode(grammarAccess.getGrammarAccess().getRulesAbstractRuleParserRuleCall_5_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_rules_13_0=ruleAbstractRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGrammarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_13_0,
            	    						"org.eclipse.xtext.Xtext.AbstractRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleGrammarID"
    // InternalXtext.g:252:1: entryRuleGrammarID returns [String current=null] : iv_ruleGrammarID= ruleGrammarID EOF ;
    public final String entryRuleGrammarID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGrammarID = null;


        try {
            // InternalXtext.g:252:49: (iv_ruleGrammarID= ruleGrammarID EOF )
            // InternalXtext.g:253:2: iv_ruleGrammarID= ruleGrammarID EOF
            {
             newCompositeNode(grammarAccess.getGrammarIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGrammarID=ruleGrammarID();

            state._fsp--;

             current =iv_ruleGrammarID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrammarID"


    // $ANTLR start "ruleGrammarID"
    // InternalXtext.g:259:1: ruleGrammarID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleGrammarID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalXtext.g:265:2: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // InternalXtext.g:266:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // InternalXtext.g:266:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // InternalXtext.g:267:3: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {

            			newCompositeNode(grammarAccess.getGrammarIDAccess().getValidIDParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_10);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            			current.merge(this_ValidID_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalXtext.g:277:3: (kw= '.' this_ValidID_2= ruleValidID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXtext.g:278:4: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,18,FollowSets000.FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getGrammarIDAccess().getValidIDParserRuleCall_1_1());
            	    			
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    				current.merge(this_ValidID_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrammarID"


    // $ANTLR start "entryRuleAbstractRule"
    // InternalXtext.g:298:1: entryRuleAbstractRule returns [EObject current=null] : iv_ruleAbstractRule= ruleAbstractRule EOF ;
    public final EObject entryRuleAbstractRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRule = null;


        try {
            // InternalXtext.g:298:53: (iv_ruleAbstractRule= ruleAbstractRule EOF )
            // InternalXtext.g:299:2: iv_ruleAbstractRule= ruleAbstractRule EOF
            {
             newCompositeNode(grammarAccess.getAbstractRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractRule=ruleAbstractRule();

            state._fsp--;

             current =iv_ruleAbstractRule; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractRule"


    // $ANTLR start "ruleAbstractRule"
    // InternalXtext.g:305:1: ruleAbstractRule returns [EObject current=null] : (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule ) ;
    public final EObject ruleAbstractRule() throws RecognitionException {
        EObject current = null;

        EObject this_ParserRule_0 = null;

        EObject this_TerminalRule_1 = null;

        EObject this_EnumRule_2 = null;



        	enterRule();

        try {
            // InternalXtext.g:311:2: ( (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule ) )
            // InternalXtext.g:312:2: (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule )
            {
            // InternalXtext.g:312:2: (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalXtext.g:313:3: this_ParserRule_0= ruleParserRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getParserRuleParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParserRule_0=ruleParserRule();

                    state._fsp--;


                    			current = this_ParserRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtext.g:322:3: this_TerminalRule_1= ruleTerminalRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getTerminalRuleParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TerminalRule_1=ruleTerminalRule();

                    state._fsp--;


                    			current = this_TerminalRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXtext.g:331:3: this_EnumRule_2= ruleEnumRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractRuleAccess().getEnumRuleParserRuleCall_2());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EnumRule_2=ruleEnumRule();

                    state._fsp--;


                    			current = this_EnumRule_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractRule"


    // $ANTLR start "entryRuleAbstractMetamodelDeclaration"
    // InternalXtext.g:343:1: entryRuleAbstractMetamodelDeclaration returns [EObject current=null] : iv_ruleAbstractMetamodelDeclaration= ruleAbstractMetamodelDeclaration EOF ;
    public final EObject entryRuleAbstractMetamodelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMetamodelDeclaration = null;


        try {
            // InternalXtext.g:343:69: (iv_ruleAbstractMetamodelDeclaration= ruleAbstractMetamodelDeclaration EOF )
            // InternalXtext.g:344:2: iv_ruleAbstractMetamodelDeclaration= ruleAbstractMetamodelDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAbstractMetamodelDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractMetamodelDeclaration=ruleAbstractMetamodelDeclaration();

            state._fsp--;

             current =iv_ruleAbstractMetamodelDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractMetamodelDeclaration"


    // $ANTLR start "ruleAbstractMetamodelDeclaration"
    // InternalXtext.g:350:1: ruleAbstractMetamodelDeclaration returns [EObject current=null] : (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel ) ;
    public final EObject ruleAbstractMetamodelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_GeneratedMetamodel_0 = null;

        EObject this_ReferencedMetamodel_1 = null;



        	enterRule();

        try {
            // InternalXtext.g:356:2: ( (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel ) )
            // InternalXtext.g:357:2: (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel )
            {
            // InternalXtext.g:357:2: (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXtext.g:358:3: this_GeneratedMetamodel_0= ruleGeneratedMetamodel
                    {

                    			newCompositeNode(grammarAccess.getAbstractMetamodelDeclarationAccess().getGeneratedMetamodelParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GeneratedMetamodel_0=ruleGeneratedMetamodel();

                    state._fsp--;


                    			current = this_GeneratedMetamodel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtext.g:367:3: this_ReferencedMetamodel_1= ruleReferencedMetamodel
                    {

                    			newCompositeNode(grammarAccess.getAbstractMetamodelDeclarationAccess().getReferencedMetamodelParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferencedMetamodel_1=ruleReferencedMetamodel();

                    state._fsp--;


                    			current = this_ReferencedMetamodel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractMetamodelDeclaration"


    // $ANTLR start "entryRuleGeneratedMetamodel"
    // InternalXtext.g:379:1: entryRuleGeneratedMetamodel returns [EObject current=null] : iv_ruleGeneratedMetamodel= ruleGeneratedMetamodel EOF ;
    public final EObject entryRuleGeneratedMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratedMetamodel = null;


        try {
            // InternalXtext.g:379:59: (iv_ruleGeneratedMetamodel= ruleGeneratedMetamodel EOF )
            // InternalXtext.g:380:2: iv_ruleGeneratedMetamodel= ruleGeneratedMetamodel EOF
            {
             newCompositeNode(grammarAccess.getGeneratedMetamodelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGeneratedMetamodel=ruleGeneratedMetamodel();

            state._fsp--;

             current =iv_ruleGeneratedMetamodel; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneratedMetamodel"


    // $ANTLR start "ruleGeneratedMetamodel"
    // InternalXtext.g:386:1: ruleGeneratedMetamodel returns [EObject current=null] : (otherlv_0= 'generate' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )? ) ;
    public final EObject ruleGeneratedMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_alias_4_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:392:2: ( (otherlv_0= 'generate' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )? ) )
            // InternalXtext.g:393:2: (otherlv_0= 'generate' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )? )
            {
            // InternalXtext.g:393:2: (otherlv_0= 'generate' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )? )
            // InternalXtext.g:394:3: otherlv_0= 'generate' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )?
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneratedMetamodelAccess().getGenerateKeyword_0());
            		
            // InternalXtext.g:398:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalXtext.g:399:4: (lv_name_1_0= ruleValidID )
            {
            // InternalXtext.g:399:4: (lv_name_1_0= ruleValidID )
            // InternalXtext.g:400:5: lv_name_1_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getGeneratedMetamodelAccess().getNameValidIDParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_11);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeneratedMetamodelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.Xtext.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXtext.g:417:3: ( (otherlv_2= RULE_STRING ) )
            // InternalXtext.g:418:4: (otherlv_2= RULE_STRING )
            {
            // InternalXtext.g:418:4: (otherlv_2= RULE_STRING )
            // InternalXtext.g:419:5: otherlv_2= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneratedMetamodelRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); 

            					newLeafNode(otherlv_2, grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageCrossReference_2_0());
            				

            }


            }

            // InternalXtext.g:430:3: (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXtext.g:431:4: otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) )
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGeneratedMetamodelAccess().getAsKeyword_3_0());
                    			
                    // InternalXtext.g:435:4: ( (lv_alias_4_0= ruleValidID ) )
                    // InternalXtext.g:436:5: (lv_alias_4_0= ruleValidID )
                    {
                    // InternalXtext.g:436:5: (lv_alias_4_0= ruleValidID )
                    // InternalXtext.g:437:6: lv_alias_4_0= ruleValidID
                    {

                    						newCompositeNode(grammarAccess.getGeneratedMetamodelAccess().getAliasValidIDParserRuleCall_3_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_alias_4_0=ruleValidID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeneratedMetamodelRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_4_0,
                    							"org.eclipse.xtext.Xtext.ValidID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneratedMetamodel"


    // $ANTLR start "entryRuleReferencedMetamodel"
    // InternalXtext.g:459:1: entryRuleReferencedMetamodel returns [EObject current=null] : iv_ruleReferencedMetamodel= ruleReferencedMetamodel EOF ;
    public final EObject entryRuleReferencedMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencedMetamodel = null;


        try {
            // InternalXtext.g:459:60: (iv_ruleReferencedMetamodel= ruleReferencedMetamodel EOF )
            // InternalXtext.g:460:2: iv_ruleReferencedMetamodel= ruleReferencedMetamodel EOF
            {
             newCompositeNode(grammarAccess.getReferencedMetamodelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferencedMetamodel=ruleReferencedMetamodel();

            state._fsp--;

             current =iv_ruleReferencedMetamodel; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferencedMetamodel"


    // $ANTLR start "ruleReferencedMetamodel"
    // InternalXtext.g:466:1: ruleReferencedMetamodel returns [EObject current=null] : (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? ) ;
    public final EObject ruleReferencedMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_alias_3_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:472:2: ( (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? ) )
            // InternalXtext.g:473:2: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? )
            {
            // InternalXtext.g:473:2: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? )
            // InternalXtext.g:474:3: otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )?
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getReferencedMetamodelAccess().getImportKeyword_0());
            		
            // InternalXtext.g:478:3: ( (otherlv_1= RULE_STRING ) )
            // InternalXtext.g:479:4: (otherlv_1= RULE_STRING )
            {
            // InternalXtext.g:479:4: (otherlv_1= RULE_STRING )
            // InternalXtext.g:480:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferencedMetamodelRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); 

            					newLeafNode(otherlv_1, grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageCrossReference_1_0());
            				

            }


            }

            // InternalXtext.g:491:3: (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXtext.g:492:4: otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) )
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getReferencedMetamodelAccess().getAsKeyword_2_0());
                    			
                    // InternalXtext.g:496:4: ( (lv_alias_3_0= ruleValidID ) )
                    // InternalXtext.g:497:5: (lv_alias_3_0= ruleValidID )
                    {
                    // InternalXtext.g:497:5: (lv_alias_3_0= ruleValidID )
                    // InternalXtext.g:498:6: lv_alias_3_0= ruleValidID
                    {

                    						newCompositeNode(grammarAccess.getReferencedMetamodelAccess().getAliasValidIDParserRuleCall_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_alias_3_0=ruleValidID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferencedMetamodelRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_3_0,
                    							"org.eclipse.xtext.Xtext.ValidID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferencedMetamodel"


    // $ANTLR start "entryRuleAnnotation"
    // InternalXtext.g:520:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalXtext.g:520:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalXtext.g:521:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalXtext.g:527:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXtext.g:533:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXtext.g:534:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXtext.g:534:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXtext.g:535:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
            		
            // InternalXtext.g:539:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXtext.g:540:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXtext.g:540:4: (lv_name_1_0= RULE_ID )
            // InternalXtext.g:541:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleParserRule"
    // InternalXtext.g:561:1: entryRuleParserRule returns [EObject current=null] : iv_ruleParserRule= ruleParserRule EOF ;
    public final EObject entryRuleParserRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParserRule = null;


        try {
            // InternalXtext.g:561:51: (iv_ruleParserRule= ruleParserRule EOF )
            // InternalXtext.g:562:2: iv_ruleParserRule= ruleParserRule EOF
            {
             newCompositeNode(grammarAccess.getParserRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParserRule=ruleParserRule();

            state._fsp--;

             current =iv_ruleParserRule; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParserRule"


    // $ANTLR start "ruleParserRule"
    // InternalXtext.g:568:1: ruleParserRule returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_fragment_1_0= 'fragment' ) ) this_RuleNameAndParams_2= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_3_0= '*' ) ) | (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) | (this_RuleNameAndParams_6= ruleRuleNameAndParams[$current] (otherlv_7= 'returns' ( (lv_type_8_0= ruleTypeRef ) ) )? (otherlv_9= 'becomes' ( (lv_becomes_10_0= ruleBecomesDecl ) ) )? ) ) ( ( (lv_definesHiddenTokens_11_0= 'hidden' ) ) otherlv_12= '(' ( ( ( ruleRuleID ) ) (otherlv_14= ',' ( ( ruleRuleID ) ) )* )? otherlv_16= ')' )? otherlv_17= ':' ( (lv_alternatives_18_0= ruleAlternatives ) ) otherlv_19= ';' ) ;
    public final EObject ruleParserRule() throws RecognitionException {
        EObject current = null;

        Token lv_fragment_1_0=null;
        Token lv_wildcard_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_definesHiddenTokens_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_annotations_0_0 = null;

        EObject this_RuleNameAndParams_2 = null;

        EObject lv_type_5_0 = null;

        EObject this_RuleNameAndParams_6 = null;

        EObject lv_type_8_0 = null;

        EObject lv_becomes_10_0 = null;

        EObject lv_alternatives_18_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:574:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_fragment_1_0= 'fragment' ) ) this_RuleNameAndParams_2= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_3_0= '*' ) ) | (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) | (this_RuleNameAndParams_6= ruleRuleNameAndParams[$current] (otherlv_7= 'returns' ( (lv_type_8_0= ruleTypeRef ) ) )? (otherlv_9= 'becomes' ( (lv_becomes_10_0= ruleBecomesDecl ) ) )? ) ) ( ( (lv_definesHiddenTokens_11_0= 'hidden' ) ) otherlv_12= '(' ( ( ( ruleRuleID ) ) (otherlv_14= ',' ( ( ruleRuleID ) ) )* )? otherlv_16= ')' )? otherlv_17= ':' ( (lv_alternatives_18_0= ruleAlternatives ) ) otherlv_19= ';' ) )
            // InternalXtext.g:575:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_fragment_1_0= 'fragment' ) ) this_RuleNameAndParams_2= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_3_0= '*' ) ) | (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) | (this_RuleNameAndParams_6= ruleRuleNameAndParams[$current] (otherlv_7= 'returns' ( (lv_type_8_0= ruleTypeRef ) ) )? (otherlv_9= 'becomes' ( (lv_becomes_10_0= ruleBecomesDecl ) ) )? ) ) ( ( (lv_definesHiddenTokens_11_0= 'hidden' ) ) otherlv_12= '(' ( ( ( ruleRuleID ) ) (otherlv_14= ',' ( ( ruleRuleID ) ) )* )? otherlv_16= ')' )? otherlv_17= ':' ( (lv_alternatives_18_0= ruleAlternatives ) ) otherlv_19= ';' )
            {
            // InternalXtext.g:575:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_fragment_1_0= 'fragment' ) ) this_RuleNameAndParams_2= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_3_0= '*' ) ) | (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) | (this_RuleNameAndParams_6= ruleRuleNameAndParams[$current] (otherlv_7= 'returns' ( (lv_type_8_0= ruleTypeRef ) ) )? (otherlv_9= 'becomes' ( (lv_becomes_10_0= ruleBecomesDecl ) ) )? ) ) ( ( (lv_definesHiddenTokens_11_0= 'hidden' ) ) otherlv_12= '(' ( ( ( ruleRuleID ) ) (otherlv_14= ',' ( ( ruleRuleID ) ) )* )? otherlv_16= ')' )? otherlv_17= ':' ( (lv_alternatives_18_0= ruleAlternatives ) ) otherlv_19= ';' )
            // InternalXtext.g:576:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_fragment_1_0= 'fragment' ) ) this_RuleNameAndParams_2= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_3_0= '*' ) ) | (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) | (this_RuleNameAndParams_6= ruleRuleNameAndParams[$current] (otherlv_7= 'returns' ( (lv_type_8_0= ruleTypeRef ) ) )? (otherlv_9= 'becomes' ( (lv_becomes_10_0= ruleBecomesDecl ) ) )? ) ) ( ( (lv_definesHiddenTokens_11_0= 'hidden' ) ) otherlv_12= '(' ( ( ( ruleRuleID ) ) (otherlv_14= ',' ( ( ruleRuleID ) ) )* )? otherlv_16= ')' )? otherlv_17= ':' ( (lv_alternatives_18_0= ruleAlternatives ) ) otherlv_19= ';'
            {
            // InternalXtext.g:576:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXtext.g:577:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalXtext.g:577:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalXtext.g:578:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getParserRuleAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParserRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_0_0,
            	    						"org.eclipse.xtext.Xtext.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalXtext.g:595:3: ( ( ( (lv_fragment_1_0= 'fragment' ) ) this_RuleNameAndParams_2= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_3_0= '*' ) ) | (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) | (this_RuleNameAndParams_6= ruleRuleNameAndParams[$current] (otherlv_7= 'returns' ( (lv_type_8_0= ruleTypeRef ) ) )? (otherlv_9= 'becomes' ( (lv_becomes_10_0= ruleBecomesDecl ) ) )? ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID||(LA18_0>=43 && LA18_0<=44)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalXtext.g:596:4: ( ( (lv_fragment_1_0= 'fragment' ) ) this_RuleNameAndParams_2= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_3_0= '*' ) ) | (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) )
                    {
                    // InternalXtext.g:596:4: ( ( (lv_fragment_1_0= 'fragment' ) ) this_RuleNameAndParams_2= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_3_0= '*' ) ) | (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) )
                    // InternalXtext.g:597:5: ( (lv_fragment_1_0= 'fragment' ) ) this_RuleNameAndParams_2= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_3_0= '*' ) ) | (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    {
                    // InternalXtext.g:597:5: ( (lv_fragment_1_0= 'fragment' ) )
                    // InternalXtext.g:598:6: (lv_fragment_1_0= 'fragment' )
                    {
                    // InternalXtext.g:598:6: (lv_fragment_1_0= 'fragment' )
                    // InternalXtext.g:599:7: lv_fragment_1_0= 'fragment'
                    {
                    lv_fragment_1_0=(Token)match(input,23,FollowSets000.FOLLOW_14); 

                    							newLeafNode(lv_fragment_1_0, grammarAccess.getParserRuleAccess().getFragmentFragmentKeyword_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getParserRuleRule());
                    							}
                    							setWithLastConsumed(current, "fragment", lv_fragment_1_0 != null, "fragment");
                    						

                    }


                    }


                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParserRuleRule());
                    					}
                    					newCompositeNode(grammarAccess.getParserRuleAccess().getRuleNameAndParamsParserRuleCall_1_0_1());
                    				
                    pushFollow(FollowSets000.FOLLOW_15);
                    this_RuleNameAndParams_2=ruleRuleNameAndParams(current);

                    state._fsp--;


                    					current = this_RuleNameAndParams_2;
                    					afterParserOrEnumRuleCall();
                    				
                    // InternalXtext.g:622:5: ( ( (lv_wildcard_3_0= '*' ) ) | (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==24) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==15||LA15_0==25||LA15_0==27) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalXtext.g:623:6: ( (lv_wildcard_3_0= '*' ) )
                            {
                            // InternalXtext.g:623:6: ( (lv_wildcard_3_0= '*' ) )
                            // InternalXtext.g:624:7: (lv_wildcard_3_0= '*' )
                            {
                            // InternalXtext.g:624:7: (lv_wildcard_3_0= '*' )
                            // InternalXtext.g:625:8: lv_wildcard_3_0= '*'
                            {
                            lv_wildcard_3_0=(Token)match(input,24,FollowSets000.FOLLOW_16); 

                            								newLeafNode(lv_wildcard_3_0, grammarAccess.getParserRuleAccess().getWildcardAsteriskKeyword_1_0_2_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getParserRuleRule());
                            								}
                            								setWithLastConsumed(current, "wildcard", lv_wildcard_3_0 != null, "*");
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalXtext.g:638:6: (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                            {
                            // InternalXtext.g:638:6: (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==25) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // InternalXtext.g:639:7: otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) )
                                    {
                                    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_13); 

                                    							newLeafNode(otherlv_4, grammarAccess.getParserRuleAccess().getReturnsKeyword_1_0_2_1_0());
                                    						
                                    // InternalXtext.g:643:7: ( (lv_type_5_0= ruleTypeRef ) )
                                    // InternalXtext.g:644:8: (lv_type_5_0= ruleTypeRef )
                                    {
                                    // InternalXtext.g:644:8: (lv_type_5_0= ruleTypeRef )
                                    // InternalXtext.g:645:9: lv_type_5_0= ruleTypeRef
                                    {

                                    									newCompositeNode(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_1_0_2_1_1_0());
                                    								
                                    pushFollow(FollowSets000.FOLLOW_16);
                                    lv_type_5_0=ruleTypeRef();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getParserRuleRule());
                                    									}
                                    									set(
                                    										current,
                                    										"type",
                                    										lv_type_5_0,
                                    										"org.eclipse.xtext.Xtext.TypeRef");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:666:4: (this_RuleNameAndParams_6= ruleRuleNameAndParams[$current] (otherlv_7= 'returns' ( (lv_type_8_0= ruleTypeRef ) ) )? (otherlv_9= 'becomes' ( (lv_becomes_10_0= ruleBecomesDecl ) ) )? )
                    {
                    // InternalXtext.g:666:4: (this_RuleNameAndParams_6= ruleRuleNameAndParams[$current] (otherlv_7= 'returns' ( (lv_type_8_0= ruleTypeRef ) ) )? (otherlv_9= 'becomes' ( (lv_becomes_10_0= ruleBecomesDecl ) ) )? )
                    // InternalXtext.g:667:5: this_RuleNameAndParams_6= ruleRuleNameAndParams[$current] (otherlv_7= 'returns' ( (lv_type_8_0= ruleTypeRef ) ) )? (otherlv_9= 'becomes' ( (lv_becomes_10_0= ruleBecomesDecl ) ) )?
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParserRuleRule());
                    					}
                    					newCompositeNode(grammarAccess.getParserRuleAccess().getRuleNameAndParamsParserRuleCall_1_1_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_17);
                    this_RuleNameAndParams_6=ruleRuleNameAndParams(current);

                    state._fsp--;


                    					current = this_RuleNameAndParams_6;
                    					afterParserOrEnumRuleCall();
                    				
                    // InternalXtext.g:678:5: (otherlv_7= 'returns' ( (lv_type_8_0= ruleTypeRef ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==25) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalXtext.g:679:6: otherlv_7= 'returns' ( (lv_type_8_0= ruleTypeRef ) )
                            {
                            otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_13); 

                            						newLeafNode(otherlv_7, grammarAccess.getParserRuleAccess().getReturnsKeyword_1_1_1_0());
                            					
                            // InternalXtext.g:683:6: ( (lv_type_8_0= ruleTypeRef ) )
                            // InternalXtext.g:684:7: (lv_type_8_0= ruleTypeRef )
                            {
                            // InternalXtext.g:684:7: (lv_type_8_0= ruleTypeRef )
                            // InternalXtext.g:685:8: lv_type_8_0= ruleTypeRef
                            {

                            								newCompositeNode(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_1_1_1_1_0());
                            							
                            pushFollow(FollowSets000.FOLLOW_18);
                            lv_type_8_0=ruleTypeRef();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getParserRuleRule());
                            								}
                            								set(
                            									current,
                            									"type",
                            									lv_type_8_0,
                            									"org.eclipse.xtext.Xtext.TypeRef");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalXtext.g:703:5: (otherlv_9= 'becomes' ( (lv_becomes_10_0= ruleBecomesDecl ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==26) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalXtext.g:704:6: otherlv_9= 'becomes' ( (lv_becomes_10_0= ruleBecomesDecl ) )
                            {
                            otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_19); 

                            						newLeafNode(otherlv_9, grammarAccess.getParserRuleAccess().getBecomesKeyword_1_1_2_0());
                            					
                            // InternalXtext.g:708:6: ( (lv_becomes_10_0= ruleBecomesDecl ) )
                            // InternalXtext.g:709:7: (lv_becomes_10_0= ruleBecomesDecl )
                            {
                            // InternalXtext.g:709:7: (lv_becomes_10_0= ruleBecomesDecl )
                            // InternalXtext.g:710:8: lv_becomes_10_0= ruleBecomesDecl
                            {

                            								newCompositeNode(grammarAccess.getParserRuleAccess().getBecomesBecomesDeclParserRuleCall_1_1_2_1_0());
                            							
                            pushFollow(FollowSets000.FOLLOW_16);
                            lv_becomes_10_0=ruleBecomesDecl();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getParserRuleRule());
                            								}
                            								set(
                            									current,
                            									"becomes",
                            									lv_becomes_10_0,
                            									"org.eclipse.xtext.Xtext.BecomesDecl");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalXtext.g:730:3: ( ( (lv_definesHiddenTokens_11_0= 'hidden' ) ) otherlv_12= '(' ( ( ( ruleRuleID ) ) (otherlv_14= ',' ( ( ruleRuleID ) ) )* )? otherlv_16= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXtext.g:731:4: ( (lv_definesHiddenTokens_11_0= 'hidden' ) ) otherlv_12= '(' ( ( ( ruleRuleID ) ) (otherlv_14= ',' ( ( ruleRuleID ) ) )* )? otherlv_16= ')'
                    {
                    // InternalXtext.g:731:4: ( (lv_definesHiddenTokens_11_0= 'hidden' ) )
                    // InternalXtext.g:732:5: (lv_definesHiddenTokens_11_0= 'hidden' )
                    {
                    // InternalXtext.g:732:5: (lv_definesHiddenTokens_11_0= 'hidden' )
                    // InternalXtext.g:733:6: lv_definesHiddenTokens_11_0= 'hidden'
                    {
                    lv_definesHiddenTokens_11_0=(Token)match(input,15,FollowSets000.FOLLOW_6); 

                    						newLeafNode(lv_definesHiddenTokens_11_0, grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParserRuleRule());
                    						}
                    						setWithLastConsumed(current, "definesHiddenTokens", lv_definesHiddenTokens_11_0 != null, "hidden");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getParserRuleAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalXtext.g:749:4: ( ( ( ruleRuleID ) ) (otherlv_14= ',' ( ( ruleRuleID ) ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID||(LA20_0>=43 && LA20_0<=44)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalXtext.g:750:5: ( ( ruleRuleID ) ) (otherlv_14= ',' ( ( ruleRuleID ) ) )*
                            {
                            // InternalXtext.g:750:5: ( ( ruleRuleID ) )
                            // InternalXtext.g:751:6: ( ruleRuleID )
                            {
                            // InternalXtext.g:751:6: ( ruleRuleID )
                            // InternalXtext.g:752:7: ruleRuleID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getParserRuleRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_0_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_8);
                            ruleRuleID();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalXtext.g:766:5: (otherlv_14= ',' ( ( ruleRuleID ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==14) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // InternalXtext.g:767:6: otherlv_14= ',' ( ( ruleRuleID ) )
                            	    {
                            	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_3); 

                            	    						newLeafNode(otherlv_14, grammarAccess.getParserRuleAccess().getCommaKeyword_2_2_1_0());
                            	    					
                            	    // InternalXtext.g:771:6: ( ( ruleRuleID ) )
                            	    // InternalXtext.g:772:7: ( ruleRuleID )
                            	    {
                            	    // InternalXtext.g:772:7: ( ruleRuleID )
                            	    // InternalXtext.g:773:8: ruleRuleID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getParserRuleRule());
                            	    								}
                            	    							

                            	    								newCompositeNode(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_1_1_0());
                            	    							
                            	    pushFollow(FollowSets000.FOLLOW_8);
                            	    ruleRuleID();

                            	    state._fsp--;


                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_20); 

                    				newLeafNode(otherlv_16, grammarAccess.getParserRuleAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,27,FollowSets000.FOLLOW_21); 

            			newLeafNode(otherlv_17, grammarAccess.getParserRuleAccess().getColonKeyword_3());
            		
            // InternalXtext.g:798:3: ( (lv_alternatives_18_0= ruleAlternatives ) )
            // InternalXtext.g:799:4: (lv_alternatives_18_0= ruleAlternatives )
            {
            // InternalXtext.g:799:4: (lv_alternatives_18_0= ruleAlternatives )
            // InternalXtext.g:800:5: lv_alternatives_18_0= ruleAlternatives
            {

            					newCompositeNode(grammarAccess.getParserRuleAccess().getAlternativesAlternativesParserRuleCall_4_0());
            				
            pushFollow(FollowSets000.FOLLOW_22);
            lv_alternatives_18_0=ruleAlternatives();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParserRuleRule());
            					}
            					set(
            						current,
            						"alternatives",
            						lv_alternatives_18_0,
            						"org.eclipse.xtext.Xtext.Alternatives");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,28,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getParserRuleAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParserRule"


    // $ANTLR start "entryRuleBecomesDecl"
    // InternalXtext.g:825:1: entryRuleBecomesDecl returns [EObject current=null] : iv_ruleBecomesDecl= ruleBecomesDecl EOF ;
    public final EObject entryRuleBecomesDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBecomesDecl = null;


        try {
            // InternalXtext.g:825:52: (iv_ruleBecomesDecl= ruleBecomesDecl EOF )
            // InternalXtext.g:826:2: iv_ruleBecomesDecl= ruleBecomesDecl EOF
            {
             newCompositeNode(grammarAccess.getBecomesDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBecomesDecl=ruleBecomesDecl();

            state._fsp--;

             current =iv_ruleBecomesDecl; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBecomesDecl"


    // $ANTLR start "ruleBecomesDecl"
    // InternalXtext.g:832:1: ruleBecomesDecl returns [EObject current=null] : ( ( ( (lv_list_0_0= '[' ) ) ( (lv_listType_1_0= ruleQualifiedName ) )? otherlv_2= ']' )? ( ( (lv_descriptor_3_1= ruleBecomesDeclGeneratedClass | lv_descriptor_3_2= ruleBecomesDeclManualClass ) ) ) ( (lv_code_4_0= RULE_JAVA_STRING ) )? ) ;
    public final EObject ruleBecomesDecl() throws RecognitionException {
        EObject current = null;

        Token lv_list_0_0=null;
        Token otherlv_2=null;
        Token lv_code_4_0=null;
        AntlrDatatypeRuleToken lv_listType_1_0 = null;

        EObject lv_descriptor_3_1 = null;

        EObject lv_descriptor_3_2 = null;



        	enterRule();

        try {
            // InternalXtext.g:838:2: ( ( ( ( (lv_list_0_0= '[' ) ) ( (lv_listType_1_0= ruleQualifiedName ) )? otherlv_2= ']' )? ( ( (lv_descriptor_3_1= ruleBecomesDeclGeneratedClass | lv_descriptor_3_2= ruleBecomesDeclManualClass ) ) ) ( (lv_code_4_0= RULE_JAVA_STRING ) )? ) )
            // InternalXtext.g:839:2: ( ( ( (lv_list_0_0= '[' ) ) ( (lv_listType_1_0= ruleQualifiedName ) )? otherlv_2= ']' )? ( ( (lv_descriptor_3_1= ruleBecomesDeclGeneratedClass | lv_descriptor_3_2= ruleBecomesDeclManualClass ) ) ) ( (lv_code_4_0= RULE_JAVA_STRING ) )? )
            {
            // InternalXtext.g:839:2: ( ( ( (lv_list_0_0= '[' ) ) ( (lv_listType_1_0= ruleQualifiedName ) )? otherlv_2= ']' )? ( ( (lv_descriptor_3_1= ruleBecomesDeclGeneratedClass | lv_descriptor_3_2= ruleBecomesDeclManualClass ) ) ) ( (lv_code_4_0= RULE_JAVA_STRING ) )? )
            // InternalXtext.g:840:3: ( ( (lv_list_0_0= '[' ) ) ( (lv_listType_1_0= ruleQualifiedName ) )? otherlv_2= ']' )? ( ( (lv_descriptor_3_1= ruleBecomesDeclGeneratedClass | lv_descriptor_3_2= ruleBecomesDeclManualClass ) ) ) ( (lv_code_4_0= RULE_JAVA_STRING ) )?
            {
            // InternalXtext.g:840:3: ( ( (lv_list_0_0= '[' ) ) ( (lv_listType_1_0= ruleQualifiedName ) )? otherlv_2= ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXtext.g:841:4: ( (lv_list_0_0= '[' ) ) ( (lv_listType_1_0= ruleQualifiedName ) )? otherlv_2= ']'
                    {
                    // InternalXtext.g:841:4: ( (lv_list_0_0= '[' ) )
                    // InternalXtext.g:842:5: (lv_list_0_0= '[' )
                    {
                    // InternalXtext.g:842:5: (lv_list_0_0= '[' )
                    // InternalXtext.g:843:6: lv_list_0_0= '['
                    {
                    lv_list_0_0=(Token)match(input,29,FollowSets000.FOLLOW_23); 

                    						newLeafNode(lv_list_0_0, grammarAccess.getBecomesDeclAccess().getListLeftSquareBracketKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBecomesDeclRule());
                    						}
                    						setWithLastConsumed(current, "list", lv_list_0_0 != null, "[");
                    					

                    }


                    }

                    // InternalXtext.g:855:4: ( (lv_listType_1_0= ruleQualifiedName ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalXtext.g:856:5: (lv_listType_1_0= ruleQualifiedName )
                            {
                            // InternalXtext.g:856:5: (lv_listType_1_0= ruleQualifiedName )
                            // InternalXtext.g:857:6: lv_listType_1_0= ruleQualifiedName
                            {

                            						newCompositeNode(grammarAccess.getBecomesDeclAccess().getListTypeQualifiedNameParserRuleCall_0_1_0());
                            					
                            pushFollow(FollowSets000.FOLLOW_24);
                            lv_listType_1_0=ruleQualifiedName();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getBecomesDeclRule());
                            						}
                            						set(
                            							current,
                            							"listType",
                            							lv_listType_1_0,
                            							"org.eclipse.xtext.Xtext.QualifiedName");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getBecomesDeclAccess().getRightSquareBracketKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalXtext.g:879:3: ( ( (lv_descriptor_3_1= ruleBecomesDeclGeneratedClass | lv_descriptor_3_2= ruleBecomesDeclManualClass ) ) )
            // InternalXtext.g:880:4: ( (lv_descriptor_3_1= ruleBecomesDeclGeneratedClass | lv_descriptor_3_2= ruleBecomesDeclManualClass ) )
            {
            // InternalXtext.g:880:4: ( (lv_descriptor_3_1= ruleBecomesDeclGeneratedClass | lv_descriptor_3_2= ruleBecomesDeclManualClass ) )
            // InternalXtext.g:881:5: (lv_descriptor_3_1= ruleBecomesDeclGeneratedClass | lv_descriptor_3_2= ruleBecomesDeclManualClass )
            {
            // InternalXtext.g:881:5: (lv_descriptor_3_1= ruleBecomesDeclGeneratedClass | lv_descriptor_3_2= ruleBecomesDeclManualClass )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==EOF||LA24_0==RULE_JAVA_STRING||(LA24_0>=15 && LA24_0<=16)||LA24_0==27) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalXtext.g:882:6: lv_descriptor_3_1= ruleBecomesDeclGeneratedClass
                    {

                    						newCompositeNode(grammarAccess.getBecomesDeclAccess().getDescriptorBecomesDeclGeneratedClassParserRuleCall_1_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_descriptor_3_1=ruleBecomesDeclGeneratedClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBecomesDeclRule());
                    						}
                    						set(
                    							current,
                    							"descriptor",
                    							lv_descriptor_3_1,
                    							"org.eclipse.xtext.Xtext.BecomesDeclGeneratedClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalXtext.g:898:6: lv_descriptor_3_2= ruleBecomesDeclManualClass
                    {

                    						newCompositeNode(grammarAccess.getBecomesDeclAccess().getDescriptorBecomesDeclManualClassParserRuleCall_1_0_1());
                    					
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_descriptor_3_2=ruleBecomesDeclManualClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBecomesDeclRule());
                    						}
                    						set(
                    							current,
                    							"descriptor",
                    							lv_descriptor_3_2,
                    							"org.eclipse.xtext.Xtext.BecomesDeclManualClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalXtext.g:916:3: ( (lv_code_4_0= RULE_JAVA_STRING ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_JAVA_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXtext.g:917:4: (lv_code_4_0= RULE_JAVA_STRING )
                    {
                    // InternalXtext.g:917:4: (lv_code_4_0= RULE_JAVA_STRING )
                    // InternalXtext.g:918:5: lv_code_4_0= RULE_JAVA_STRING
                    {
                    lv_code_4_0=(Token)match(input,RULE_JAVA_STRING,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_code_4_0, grammarAccess.getBecomesDeclAccess().getCodeJAVA_STRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBecomesDeclRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"code",
                    						lv_code_4_0,
                    						"org.eclipse.xtext.Xtext.JAVA_STRING");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBecomesDecl"


    // $ANTLR start "entryRuleBecomesDeclGeneratedClass"
    // InternalXtext.g:938:1: entryRuleBecomesDeclGeneratedClass returns [EObject current=null] : iv_ruleBecomesDeclGeneratedClass= ruleBecomesDeclGeneratedClass EOF ;
    public final EObject entryRuleBecomesDeclGeneratedClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBecomesDeclGeneratedClass = null;


        try {
            // InternalXtext.g:938:66: (iv_ruleBecomesDeclGeneratedClass= ruleBecomesDeclGeneratedClass EOF )
            // InternalXtext.g:939:2: iv_ruleBecomesDeclGeneratedClass= ruleBecomesDeclGeneratedClass EOF
            {
             newCompositeNode(grammarAccess.getBecomesDeclGeneratedClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBecomesDeclGeneratedClass=ruleBecomesDeclGeneratedClass();

            state._fsp--;

             current =iv_ruleBecomesDeclGeneratedClass; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBecomesDeclGeneratedClass"


    // $ANTLR start "ruleBecomesDeclGeneratedClass"
    // InternalXtext.g:945:1: ruleBecomesDeclGeneratedClass returns [EObject current=null] : ( () (otherlv_1= '(' ( ( (lv_attributes_2_1= ruleBecomesDeclCopyAttribute | lv_attributes_2_2= ruleBecomesDeclCustomAttribute ) ) ) (otherlv_3= ',' ( ( (lv_attributes_4_1= ruleBecomesDeclCopyAttribute | lv_attributes_4_2= ruleBecomesDeclCustomAttribute ) ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleBecomesDeclGeneratedClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_2_1 = null;

        EObject lv_attributes_2_2 = null;

        EObject lv_attributes_4_1 = null;

        EObject lv_attributes_4_2 = null;



        	enterRule();

        try {
            // InternalXtext.g:951:2: ( ( () (otherlv_1= '(' ( ( (lv_attributes_2_1= ruleBecomesDeclCopyAttribute | lv_attributes_2_2= ruleBecomesDeclCustomAttribute ) ) ) (otherlv_3= ',' ( ( (lv_attributes_4_1= ruleBecomesDeclCopyAttribute | lv_attributes_4_2= ruleBecomesDeclCustomAttribute ) ) ) )* otherlv_5= ')' )? ) )
            // InternalXtext.g:952:2: ( () (otherlv_1= '(' ( ( (lv_attributes_2_1= ruleBecomesDeclCopyAttribute | lv_attributes_2_2= ruleBecomesDeclCustomAttribute ) ) ) (otherlv_3= ',' ( ( (lv_attributes_4_1= ruleBecomesDeclCopyAttribute | lv_attributes_4_2= ruleBecomesDeclCustomAttribute ) ) ) )* otherlv_5= ')' )? )
            {
            // InternalXtext.g:952:2: ( () (otherlv_1= '(' ( ( (lv_attributes_2_1= ruleBecomesDeclCopyAttribute | lv_attributes_2_2= ruleBecomesDeclCustomAttribute ) ) ) (otherlv_3= ',' ( ( (lv_attributes_4_1= ruleBecomesDeclCopyAttribute | lv_attributes_4_2= ruleBecomesDeclCustomAttribute ) ) ) )* otherlv_5= ')' )? )
            // InternalXtext.g:953:3: () (otherlv_1= '(' ( ( (lv_attributes_2_1= ruleBecomesDeclCopyAttribute | lv_attributes_2_2= ruleBecomesDeclCustomAttribute ) ) ) (otherlv_3= ',' ( ( (lv_attributes_4_1= ruleBecomesDeclCopyAttribute | lv_attributes_4_2= ruleBecomesDeclCustomAttribute ) ) ) )* otherlv_5= ')' )?
            {
            // InternalXtext.g:953:3: ()
            // InternalXtext.g:954:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBecomesDeclGeneratedClassAccess().getBecomesDeclGeneratedClassAction_0(),
            					current);
            			

            }

            // InternalXtext.g:960:3: (otherlv_1= '(' ( ( (lv_attributes_2_1= ruleBecomesDeclCopyAttribute | lv_attributes_2_2= ruleBecomesDeclCustomAttribute ) ) ) (otherlv_3= ',' ( ( (lv_attributes_4_1= ruleBecomesDeclCopyAttribute | lv_attributes_4_2= ruleBecomesDeclCustomAttribute ) ) ) )* otherlv_5= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==16) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXtext.g:961:4: otherlv_1= '(' ( ( (lv_attributes_2_1= ruleBecomesDeclCopyAttribute | lv_attributes_2_2= ruleBecomesDeclCustomAttribute ) ) ) (otherlv_3= ',' ( ( (lv_attributes_4_1= ruleBecomesDeclCopyAttribute | lv_attributes_4_2= ruleBecomesDeclCustomAttribute ) ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getBecomesDeclGeneratedClassAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalXtext.g:965:4: ( ( (lv_attributes_2_1= ruleBecomesDeclCopyAttribute | lv_attributes_2_2= ruleBecomesDeclCustomAttribute ) ) )
                    // InternalXtext.g:966:5: ( (lv_attributes_2_1= ruleBecomesDeclCopyAttribute | lv_attributes_2_2= ruleBecomesDeclCustomAttribute ) )
                    {
                    // InternalXtext.g:966:5: ( (lv_attributes_2_1= ruleBecomesDeclCopyAttribute | lv_attributes_2_2= ruleBecomesDeclCustomAttribute ) )
                    // InternalXtext.g:967:6: (lv_attributes_2_1= ruleBecomesDeclCopyAttribute | lv_attributes_2_2= ruleBecomesDeclCustomAttribute )
                    {
                    // InternalXtext.g:967:6: (lv_attributes_2_1= ruleBecomesDeclCopyAttribute | lv_attributes_2_2= ruleBecomesDeclCustomAttribute )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_ID) ) {
                        int LA26_1 = input.LA(2);

                        if ( (LA26_1==RULE_ID) ) {
                            alt26=2;
                        }
                        else if ( (LA26_1==14||LA26_1==17) ) {
                            alt26=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalXtext.g:968:7: lv_attributes_2_1= ruleBecomesDeclCopyAttribute
                            {

                            							newCompositeNode(grammarAccess.getBecomesDeclGeneratedClassAccess().getAttributesBecomesDeclCopyAttributeParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_8);
                            lv_attributes_2_1=ruleBecomesDeclCopyAttribute();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBecomesDeclGeneratedClassRule());
                            							}
                            							add(
                            								current,
                            								"attributes",
                            								lv_attributes_2_1,
                            								"org.eclipse.xtext.Xtext.BecomesDeclCopyAttribute");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalXtext.g:984:7: lv_attributes_2_2= ruleBecomesDeclCustomAttribute
                            {

                            							newCompositeNode(grammarAccess.getBecomesDeclGeneratedClassAccess().getAttributesBecomesDeclCustomAttributeParserRuleCall_1_1_0_1());
                            						
                            pushFollow(FollowSets000.FOLLOW_8);
                            lv_attributes_2_2=ruleBecomesDeclCustomAttribute();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBecomesDeclGeneratedClassRule());
                            							}
                            							add(
                            								current,
                            								"attributes",
                            								lv_attributes_2_2,
                            								"org.eclipse.xtext.Xtext.BecomesDeclCustomAttribute");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalXtext.g:1002:4: (otherlv_3= ',' ( ( (lv_attributes_4_1= ruleBecomesDeclCopyAttribute | lv_attributes_4_2= ruleBecomesDeclCustomAttribute ) ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==14) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalXtext.g:1003:5: otherlv_3= ',' ( ( (lv_attributes_4_1= ruleBecomesDeclCopyAttribute | lv_attributes_4_2= ruleBecomesDeclCustomAttribute ) ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_13); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getBecomesDeclGeneratedClassAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalXtext.g:1007:5: ( ( (lv_attributes_4_1= ruleBecomesDeclCopyAttribute | lv_attributes_4_2= ruleBecomesDeclCustomAttribute ) ) )
                    	    // InternalXtext.g:1008:6: ( (lv_attributes_4_1= ruleBecomesDeclCopyAttribute | lv_attributes_4_2= ruleBecomesDeclCustomAttribute ) )
                    	    {
                    	    // InternalXtext.g:1008:6: ( (lv_attributes_4_1= ruleBecomesDeclCopyAttribute | lv_attributes_4_2= ruleBecomesDeclCustomAttribute ) )
                    	    // InternalXtext.g:1009:7: (lv_attributes_4_1= ruleBecomesDeclCopyAttribute | lv_attributes_4_2= ruleBecomesDeclCustomAttribute )
                    	    {
                    	    // InternalXtext.g:1009:7: (lv_attributes_4_1= ruleBecomesDeclCopyAttribute | lv_attributes_4_2= ruleBecomesDeclCustomAttribute )
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==RULE_ID) ) {
                    	        int LA27_1 = input.LA(2);

                    	        if ( (LA27_1==RULE_ID) ) {
                    	            alt27=2;
                    	        }
                    	        else if ( (LA27_1==14||LA27_1==17) ) {
                    	            alt27=1;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 27, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 27, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // InternalXtext.g:1010:8: lv_attributes_4_1= ruleBecomesDeclCopyAttribute
                    	            {

                    	            								newCompositeNode(grammarAccess.getBecomesDeclGeneratedClassAccess().getAttributesBecomesDeclCopyAttributeParserRuleCall_1_2_1_0_0());
                    	            							
                    	            pushFollow(FollowSets000.FOLLOW_8);
                    	            lv_attributes_4_1=ruleBecomesDeclCopyAttribute();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getBecomesDeclGeneratedClassRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"attributes",
                    	            									lv_attributes_4_1,
                    	            									"org.eclipse.xtext.Xtext.BecomesDeclCopyAttribute");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalXtext.g:1026:8: lv_attributes_4_2= ruleBecomesDeclCustomAttribute
                    	            {

                    	            								newCompositeNode(grammarAccess.getBecomesDeclGeneratedClassAccess().getAttributesBecomesDeclCustomAttributeParserRuleCall_1_2_1_0_1());
                    	            							
                    	            pushFollow(FollowSets000.FOLLOW_8);
                    	            lv_attributes_4_2=ruleBecomesDeclCustomAttribute();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getBecomesDeclGeneratedClassRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"attributes",
                    	            									lv_attributes_4_2,
                    	            									"org.eclipse.xtext.Xtext.BecomesDeclCustomAttribute");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getBecomesDeclGeneratedClassAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBecomesDeclGeneratedClass"


    // $ANTLR start "entryRuleBecomesDeclManualClass"
    // InternalXtext.g:1054:1: entryRuleBecomesDeclManualClass returns [EObject current=null] : iv_ruleBecomesDeclManualClass= ruleBecomesDeclManualClass EOF ;
    public final EObject entryRuleBecomesDeclManualClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBecomesDeclManualClass = null;


        try {
            // InternalXtext.g:1054:63: (iv_ruleBecomesDeclManualClass= ruleBecomesDeclManualClass EOF )
            // InternalXtext.g:1055:2: iv_ruleBecomesDeclManualClass= ruleBecomesDeclManualClass EOF
            {
             newCompositeNode(grammarAccess.getBecomesDeclManualClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBecomesDeclManualClass=ruleBecomesDeclManualClass();

            state._fsp--;

             current =iv_ruleBecomesDeclManualClass; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBecomesDeclManualClass"


    // $ANTLR start "ruleBecomesDeclManualClass"
    // InternalXtext.g:1061:1: ruleBecomesDeclManualClass returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_attributes_2_0= ruleBecomesDeclCopyAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleBecomesDeclCopyAttribute ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleBecomesDeclManualClass() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_2_0 = null;

        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:1067:2: ( ( ( (lv_type_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_attributes_2_0= ruleBecomesDeclCopyAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleBecomesDeclCopyAttribute ) ) )* otherlv_5= ')' )? ) )
            // InternalXtext.g:1068:2: ( ( (lv_type_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_attributes_2_0= ruleBecomesDeclCopyAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleBecomesDeclCopyAttribute ) ) )* otherlv_5= ')' )? )
            {
            // InternalXtext.g:1068:2: ( ( (lv_type_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_attributes_2_0= ruleBecomesDeclCopyAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleBecomesDeclCopyAttribute ) ) )* otherlv_5= ')' )? )
            // InternalXtext.g:1069:3: ( (lv_type_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_attributes_2_0= ruleBecomesDeclCopyAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleBecomesDeclCopyAttribute ) ) )* otherlv_5= ')' )?
            {
            // InternalXtext.g:1069:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalXtext.g:1070:4: (lv_type_0_0= RULE_ID )
            {
            // InternalXtext.g:1070:4: (lv_type_0_0= RULE_ID )
            // InternalXtext.g:1071:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

            					newLeafNode(lv_type_0_0, grammarAccess.getBecomesDeclManualClassAccess().getTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBecomesDeclManualClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXtext.g:1087:3: (otherlv_1= '(' ( (lv_attributes_2_0= ruleBecomesDeclCopyAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleBecomesDeclCopyAttribute ) ) )* otherlv_5= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==16) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXtext.g:1088:4: otherlv_1= '(' ( (lv_attributes_2_0= ruleBecomesDeclCopyAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleBecomesDeclCopyAttribute ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getBecomesDeclManualClassAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalXtext.g:1092:4: ( (lv_attributes_2_0= ruleBecomesDeclCopyAttribute ) )
                    // InternalXtext.g:1093:5: (lv_attributes_2_0= ruleBecomesDeclCopyAttribute )
                    {
                    // InternalXtext.g:1093:5: (lv_attributes_2_0= ruleBecomesDeclCopyAttribute )
                    // InternalXtext.g:1094:6: lv_attributes_2_0= ruleBecomesDeclCopyAttribute
                    {

                    						newCompositeNode(grammarAccess.getBecomesDeclManualClassAccess().getAttributesBecomesDeclCopyAttributeParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_attributes_2_0=ruleBecomesDeclCopyAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBecomesDeclManualClassRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_2_0,
                    							"org.eclipse.xtext.Xtext.BecomesDeclCopyAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXtext.g:1111:4: (otherlv_3= ',' ( (lv_attributes_4_0= ruleBecomesDeclCopyAttribute ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==14) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalXtext.g:1112:5: otherlv_3= ',' ( (lv_attributes_4_0= ruleBecomesDeclCopyAttribute ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_13); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getBecomesDeclManualClassAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalXtext.g:1116:5: ( (lv_attributes_4_0= ruleBecomesDeclCopyAttribute ) )
                    	    // InternalXtext.g:1117:6: (lv_attributes_4_0= ruleBecomesDeclCopyAttribute )
                    	    {
                    	    // InternalXtext.g:1117:6: (lv_attributes_4_0= ruleBecomesDeclCopyAttribute )
                    	    // InternalXtext.g:1118:7: lv_attributes_4_0= ruleBecomesDeclCopyAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getBecomesDeclManualClassAccess().getAttributesBecomesDeclCopyAttributeParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_8);
                    	    lv_attributes_4_0=ruleBecomesDeclCopyAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBecomesDeclManualClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_4_0,
                    	    								"org.eclipse.xtext.Xtext.BecomesDeclCopyAttribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getBecomesDeclManualClassAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBecomesDeclManualClass"


    // $ANTLR start "entryRuleBecomesDeclCopyAttribute"
    // InternalXtext.g:1145:1: entryRuleBecomesDeclCopyAttribute returns [EObject current=null] : iv_ruleBecomesDeclCopyAttribute= ruleBecomesDeclCopyAttribute EOF ;
    public final EObject entryRuleBecomesDeclCopyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBecomesDeclCopyAttribute = null;


        try {
            // InternalXtext.g:1145:65: (iv_ruleBecomesDeclCopyAttribute= ruleBecomesDeclCopyAttribute EOF )
            // InternalXtext.g:1146:2: iv_ruleBecomesDeclCopyAttribute= ruleBecomesDeclCopyAttribute EOF
            {
             newCompositeNode(grammarAccess.getBecomesDeclCopyAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBecomesDeclCopyAttribute=ruleBecomesDeclCopyAttribute();

            state._fsp--;

             current =iv_ruleBecomesDeclCopyAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBecomesDeclCopyAttribute"


    // $ANTLR start "ruleBecomesDeclCopyAttribute"
    // InternalXtext.g:1152:1: ruleBecomesDeclCopyAttribute returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBecomesDeclCopyAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalXtext.g:1158:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalXtext.g:1159:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalXtext.g:1159:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalXtext.g:1160:3: (lv_name_0_0= RULE_ID )
            {
            // InternalXtext.g:1160:3: (lv_name_0_0= RULE_ID )
            // InternalXtext.g:1161:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getBecomesDeclCopyAttributeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBecomesDeclCopyAttributeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBecomesDeclCopyAttribute"


    // $ANTLR start "entryRuleBecomesDeclCustomAttribute"
    // InternalXtext.g:1180:1: entryRuleBecomesDeclCustomAttribute returns [EObject current=null] : iv_ruleBecomesDeclCustomAttribute= ruleBecomesDeclCustomAttribute EOF ;
    public final EObject entryRuleBecomesDeclCustomAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBecomesDeclCustomAttribute = null;


        try {
            // InternalXtext.g:1180:67: (iv_ruleBecomesDeclCustomAttribute= ruleBecomesDeclCustomAttribute EOF )
            // InternalXtext.g:1181:2: iv_ruleBecomesDeclCustomAttribute= ruleBecomesDeclCustomAttribute EOF
            {
             newCompositeNode(grammarAccess.getBecomesDeclCustomAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBecomesDeclCustomAttribute=ruleBecomesDeclCustomAttribute();

            state._fsp--;

             current =iv_ruleBecomesDeclCustomAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBecomesDeclCustomAttribute"


    // $ANTLR start "ruleBecomesDeclCustomAttribute"
    // InternalXtext.g:1187:1: ruleBecomesDeclCustomAttribute returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBecomesDeclCustomAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXtext.g:1193:2: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXtext.g:1194:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXtext.g:1194:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXtext.g:1195:3: ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalXtext.g:1195:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalXtext.g:1196:4: (lv_type_0_0= RULE_ID )
            {
            // InternalXtext.g:1196:4: (lv_type_0_0= RULE_ID )
            // InternalXtext.g:1197:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); 

            					newLeafNode(lv_type_0_0, grammarAccess.getBecomesDeclCustomAttributeAccess().getTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBecomesDeclCustomAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXtext.g:1213:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXtext.g:1214:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXtext.g:1214:4: (lv_name_1_0= RULE_ID )
            // InternalXtext.g:1215:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBecomesDeclCustomAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBecomesDeclCustomAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBecomesDeclCustomAttribute"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXtext.g:1235:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXtext.g:1235:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXtext.g:1236:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalXtext.g:1242:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXtext.g:1248:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalXtext.g:1249:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalXtext.g:1249:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalXtext.g:1250:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXtext.g:1257:3: (kw= '.' this_ID_2= RULE_ID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==18) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalXtext.g:1258:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FollowSets000.FOLLOW_13); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleRuleNameAndParams"
    // InternalXtext.g:1276:1: ruleRuleNameAndParams[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )? ) ;
    public final EObject ruleRuleNameAndParams(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:1282:2: ( ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )? ) )
            // InternalXtext.g:1283:2: ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )? )
            {
            // InternalXtext.g:1283:2: ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )? )
            // InternalXtext.g:1284:3: ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )?
            {
            // InternalXtext.g:1284:3: ( (lv_name_0_0= ruleValidID ) )
            // InternalXtext.g:1285:4: (lv_name_0_0= ruleValidID )
            {
            // InternalXtext.g:1285:4: (lv_name_0_0= ruleValidID )
            // InternalXtext.g:1286:5: lv_name_0_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getRuleNameAndParamsAccess().getNameValidIDParserRuleCall_0_0());
            				
            pushFollow(FollowSets000.FOLLOW_27);
            lv_name_0_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleNameAndParamsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.Xtext.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXtext.g:1303:3: (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXtext.g:1304:4: otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getRuleNameAndParamsAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalXtext.g:1308:4: ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalXtext.g:1309:5: ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                            {
                            // InternalXtext.g:1309:5: ( (lv_parameters_2_0= ruleParameter ) )
                            // InternalXtext.g:1310:6: (lv_parameters_2_0= ruleParameter )
                            {
                            // InternalXtext.g:1310:6: (lv_parameters_2_0= ruleParameter )
                            // InternalXtext.g:1311:7: lv_parameters_2_0= ruleParameter
                            {

                            							newCompositeNode(grammarAccess.getRuleNameAndParamsAccess().getParametersParameterParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_29);
                            lv_parameters_2_0=ruleParameter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRuleNameAndParamsRule());
                            							}
                            							add(
                            								current,
                            								"parameters",
                            								lv_parameters_2_0,
                            								"org.eclipse.xtext.Xtext.Parameter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalXtext.g:1328:5: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==14) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // InternalXtext.g:1329:6: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_13); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getRuleNameAndParamsAccess().getCommaKeyword_1_1_1_0());
                            	    					
                            	    // InternalXtext.g:1333:6: ( (lv_parameters_4_0= ruleParameter ) )
                            	    // InternalXtext.g:1334:7: (lv_parameters_4_0= ruleParameter )
                            	    {
                            	    // InternalXtext.g:1334:7: (lv_parameters_4_0= ruleParameter )
                            	    // InternalXtext.g:1335:8: lv_parameters_4_0= ruleParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getRuleNameAndParamsAccess().getParametersParameterParserRuleCall_1_1_1_1_0());
                            	    							
                            	    pushFollow(FollowSets000.FOLLOW_29);
                            	    lv_parameters_4_0=ruleParameter();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getRuleNameAndParamsRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameters",
                            	    									lv_parameters_4_0,
                            	    									"org.eclipse.xtext.Xtext.Parameter");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getRuleNameAndParamsAccess().getGreaterThanSignKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleNameAndParams"


    // $ANTLR start "entryRuleParameter"
    // InternalXtext.g:1363:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalXtext.g:1363:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalXtext.g:1364:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalXtext.g:1370:1: ruleParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalXtext.g:1376:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalXtext.g:1377:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalXtext.g:1377:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalXtext.g:1378:3: (lv_name_0_0= RULE_ID )
            {
            // InternalXtext.g:1378:3: (lv_name_0_0= RULE_ID )
            // InternalXtext.g:1379:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParameterRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTypeRef"
    // InternalXtext.g:1398:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // InternalXtext.g:1398:48: (iv_ruleTypeRef= ruleTypeRef EOF )
            // InternalXtext.g:1399:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // InternalXtext.g:1405:1: ruleTypeRef returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalXtext.g:1411:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalXtext.g:1412:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalXtext.g:1412:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            // InternalXtext.g:1413:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) )
            {
            // InternalXtext.g:1413:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==33) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalXtext.g:1414:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // InternalXtext.g:1414:4: ( (otherlv_0= RULE_ID ) )
                    // InternalXtext.g:1415:5: (otherlv_0= RULE_ID )
                    {
                    // InternalXtext.g:1415:5: (otherlv_0= RULE_ID )
                    // InternalXtext.g:1416:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRefRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); 

                    						newLeafNode(otherlv_0, grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeRefAccess().getColonColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalXtext.g:1432:3: ( (otherlv_2= RULE_ID ) )
            // InternalXtext.g:1433:4: (otherlv_2= RULE_ID )
            {
            // InternalXtext.g:1433:4: (otherlv_2= RULE_ID )
            // InternalXtext.g:1434:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRefRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getTypeRefAccess().getClassifierEClassifierCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleAlternatives"
    // InternalXtext.g:1449:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // InternalXtext.g:1449:53: (iv_ruleAlternatives= ruleAlternatives EOF )
            // InternalXtext.g:1450:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // InternalXtext.g:1456:1: ruleAlternatives returns [EObject current=null] : (this_ConditionalBranch_0= ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ConditionalBranch_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:1462:2: ( (this_ConditionalBranch_0= ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? ) )
            // InternalXtext.g:1463:2: (this_ConditionalBranch_0= ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? )
            {
            // InternalXtext.g:1463:2: (this_ConditionalBranch_0= ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? )
            // InternalXtext.g:1464:3: this_ConditionalBranch_0= ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getAlternativesAccess().getConditionalBranchParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_31);
            this_ConditionalBranch_0=ruleConditionalBranch();

            state._fsp--;


            			current = this_ConditionalBranch_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtext.g:1472:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXtext.g:1473:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+
                    {
                    // InternalXtext.g:1473:4: ()
                    // InternalXtext.g:1474:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getAlternativesAccess().getAlternativesElementsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalXtext.g:1480:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==34) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalXtext.g:1481:5: otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) )
                    	    {
                    	    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_21); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getAlternativesAccess().getVerticalLineKeyword_1_1_0());
                    	    				
                    	    // InternalXtext.g:1485:5: ( (lv_elements_3_0= ruleConditionalBranch ) )
                    	    // InternalXtext.g:1486:6: (lv_elements_3_0= ruleConditionalBranch )
                    	    {
                    	    // InternalXtext.g:1486:6: (lv_elements_3_0= ruleConditionalBranch )
                    	    // InternalXtext.g:1487:7: lv_elements_3_0= ruleConditionalBranch
                    	    {

                    	    							newCompositeNode(grammarAccess.getAlternativesAccess().getElementsConditionalBranchParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_31);
                    	    lv_elements_3_0=ruleConditionalBranch();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAlternativesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_3_0,
                    	    								"org.eclipse.xtext.Xtext.ConditionalBranch");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleConditionalBranch"
    // InternalXtext.g:1510:1: entryRuleConditionalBranch returns [EObject current=null] : iv_ruleConditionalBranch= ruleConditionalBranch EOF ;
    public final EObject entryRuleConditionalBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalBranch = null;


        try {
            // InternalXtext.g:1510:58: (iv_ruleConditionalBranch= ruleConditionalBranch EOF )
            // InternalXtext.g:1511:2: iv_ruleConditionalBranch= ruleConditionalBranch EOF
            {
             newCompositeNode(grammarAccess.getConditionalBranchRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConditionalBranch=ruleConditionalBranch();

            state._fsp--;

             current =iv_ruleConditionalBranch; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalBranch"


    // $ANTLR start "ruleConditionalBranch"
    // InternalXtext.g:1517:1: ruleConditionalBranch returns [EObject current=null] : (this_UnorderedGroup_0= ruleUnorderedGroup | ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ ) ) ;
    public final EObject ruleConditionalBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UnorderedGroup_0 = null;

        EObject lv_guardCondition_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:1523:2: ( (this_UnorderedGroup_0= ruleUnorderedGroup | ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ ) ) )
            // InternalXtext.g:1524:2: (this_UnorderedGroup_0= ruleUnorderedGroup | ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ ) )
            {
            // InternalXtext.g:1524:2: (this_UnorderedGroup_0= ruleUnorderedGroup | ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)||LA40_0==16||LA40_0==38||(LA40_0>=43 && LA40_0<=44)||(LA40_0>=46 && LA40_0<=47)) ) {
                alt40=1;
            }
            else if ( (LA40_0==31) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalXtext.g:1525:3: this_UnorderedGroup_0= ruleUnorderedGroup
                    {

                    			newCompositeNode(grammarAccess.getConditionalBranchAccess().getUnorderedGroupParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UnorderedGroup_0=ruleUnorderedGroup();

                    state._fsp--;


                    			current = this_UnorderedGroup_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtext.g:1534:3: ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ )
                    {
                    // InternalXtext.g:1534:3: ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ )
                    // InternalXtext.g:1535:4: () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+
                    {
                    // InternalXtext.g:1535:4: ()
                    // InternalXtext.g:1536:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConditionalBranchAccess().getGroupAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_32); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionalBranchAccess().getLessThanSignKeyword_1_1());
                    			
                    // InternalXtext.g:1546:4: ( (lv_guardCondition_3_0= ruleDisjunction ) )
                    // InternalXtext.g:1547:5: (lv_guardCondition_3_0= ruleDisjunction )
                    {
                    // InternalXtext.g:1547:5: (lv_guardCondition_3_0= ruleDisjunction )
                    // InternalXtext.g:1548:6: lv_guardCondition_3_0= ruleDisjunction
                    {

                    						newCompositeNode(grammarAccess.getConditionalBranchAccess().getGuardConditionDisjunctionParserRuleCall_1_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_guardCondition_3_0=ruleDisjunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalBranchRule());
                    						}
                    						set(
                    							current,
                    							"guardCondition",
                    							lv_guardCondition_3_0,
                    							"org.eclipse.xtext.Xtext.Disjunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionalBranchAccess().getGreaterThanSignKeyword_1_3());
                    			
                    // InternalXtext.g:1569:4: ( (lv_elements_5_0= ruleAbstractToken ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)||LA39_0==16||LA39_0==38||(LA39_0>=43 && LA39_0<=44)||(LA39_0>=46 && LA39_0<=47)) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalXtext.g:1570:5: (lv_elements_5_0= ruleAbstractToken )
                    	    {
                    	    // InternalXtext.g:1570:5: (lv_elements_5_0= ruleAbstractToken )
                    	    // InternalXtext.g:1571:6: lv_elements_5_0= ruleAbstractToken
                    	    {

                    	    						newCompositeNode(grammarAccess.getConditionalBranchAccess().getElementsAbstractTokenParserRuleCall_1_4_0());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_35);
                    	    lv_elements_5_0=ruleAbstractToken();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getConditionalBranchRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elements",
                    	    							lv_elements_5_0,
                    	    							"org.eclipse.xtext.Xtext.AbstractToken");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalBranch"


    // $ANTLR start "entryRuleUnorderedGroup"
    // InternalXtext.g:1593:1: entryRuleUnorderedGroup returns [EObject current=null] : iv_ruleUnorderedGroup= ruleUnorderedGroup EOF ;
    public final EObject entryRuleUnorderedGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedGroup = null;


        try {
            // InternalXtext.g:1593:55: (iv_ruleUnorderedGroup= ruleUnorderedGroup EOF )
            // InternalXtext.g:1594:2: iv_ruleUnorderedGroup= ruleUnorderedGroup EOF
            {
             newCompositeNode(grammarAccess.getUnorderedGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnorderedGroup=ruleUnorderedGroup();

            state._fsp--;

             current =iv_ruleUnorderedGroup; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnorderedGroup"


    // $ANTLR start "ruleUnorderedGroup"
    // InternalXtext.g:1600:1: ruleUnorderedGroup returns [EObject current=null] : (this_Group_0= ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) ;
    public final EObject ruleUnorderedGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Group_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:1606:2: ( (this_Group_0= ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) )
            // InternalXtext.g:1607:2: (this_Group_0= ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            {
            // InternalXtext.g:1607:2: (this_Group_0= ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            // InternalXtext.g:1608:3: this_Group_0= ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getUnorderedGroupAccess().getGroupParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_36);
            this_Group_0=ruleGroup();

            state._fsp--;


            			current = this_Group_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtext.g:1616:3: ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==35) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXtext.g:1617:4: () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    {
                    // InternalXtext.g:1617:4: ()
                    // InternalXtext.g:1618:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getUnorderedGroupAccess().getUnorderedGroupElementsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalXtext.g:1624:4: (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==35) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalXtext.g:1625:5: otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) )
                    	    {
                    	    otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_34); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getUnorderedGroupAccess().getAmpersandKeyword_1_1_0());
                    	    				
                    	    // InternalXtext.g:1629:5: ( (lv_elements_3_0= ruleGroup ) )
                    	    // InternalXtext.g:1630:6: (lv_elements_3_0= ruleGroup )
                    	    {
                    	    // InternalXtext.g:1630:6: (lv_elements_3_0= ruleGroup )
                    	    // InternalXtext.g:1631:7: lv_elements_3_0= ruleGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnorderedGroupAccess().getElementsGroupParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_36);
                    	    lv_elements_3_0=ruleGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUnorderedGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_3_0,
                    	    								"org.eclipse.xtext.Xtext.Group");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnorderedGroup"


    // $ANTLR start "entryRuleGroup"
    // InternalXtext.g:1654:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalXtext.g:1654:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalXtext.g:1655:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalXtext.g:1661:1: ruleGroup returns [EObject current=null] : (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractToken_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:1667:2: ( (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) )
            // InternalXtext.g:1668:2: (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            {
            // InternalXtext.g:1668:2: (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            // InternalXtext.g:1669:3: this_AbstractToken_0= ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            {

            			newCompositeNode(grammarAccess.getGroupAccess().getAbstractTokenParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_35);
            this_AbstractToken_0=ruleAbstractToken();

            state._fsp--;


            			current = this_AbstractToken_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtext.g:1677:3: ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_ID)||LA44_0==16||LA44_0==38||(LA44_0>=43 && LA44_0<=44)||(LA44_0>=46 && LA44_0<=47)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXtext.g:1678:4: () ( (lv_elements_2_0= ruleAbstractToken ) )+
                    {
                    // InternalXtext.g:1678:4: ()
                    // InternalXtext.g:1679:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getGroupAccess().getGroupElementsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalXtext.g:1685:4: ( (lv_elements_2_0= ruleAbstractToken ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)||LA43_0==16||LA43_0==38||(LA43_0>=43 && LA43_0<=44)||(LA43_0>=46 && LA43_0<=47)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalXtext.g:1686:5: (lv_elements_2_0= ruleAbstractToken )
                    	    {
                    	    // InternalXtext.g:1686:5: (lv_elements_2_0= ruleAbstractToken )
                    	    // InternalXtext.g:1687:6: lv_elements_2_0= ruleAbstractToken
                    	    {

                    	    						newCompositeNode(grammarAccess.getGroupAccess().getElementsAbstractTokenParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_35);
                    	    lv_elements_2_0=ruleAbstractToken();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getGroupRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elements",
                    	    							lv_elements_2_0,
                    	    							"org.eclipse.xtext.Xtext.AbstractToken");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt43 >= 1 ) break loop43;
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleAbstractToken"
    // InternalXtext.g:1709:1: entryRuleAbstractToken returns [EObject current=null] : iv_ruleAbstractToken= ruleAbstractToken EOF ;
    public final EObject entryRuleAbstractToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractToken = null;


        try {
            // InternalXtext.g:1709:54: (iv_ruleAbstractToken= ruleAbstractToken EOF )
            // InternalXtext.g:1710:2: iv_ruleAbstractToken= ruleAbstractToken EOF
            {
             newCompositeNode(grammarAccess.getAbstractTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractToken=ruleAbstractToken();

            state._fsp--;

             current =iv_ruleAbstractToken; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractToken"


    // $ANTLR start "ruleAbstractToken"
    // InternalXtext.g:1716:1: ruleAbstractToken returns [EObject current=null] : (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality | this_Action_1= ruleAction ) ;
    public final EObject ruleAbstractToken() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractTokenWithCardinality_0 = null;

        EObject this_Action_1 = null;



        	enterRule();

        try {
            // InternalXtext.g:1722:2: ( (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality | this_Action_1= ruleAction ) )
            // InternalXtext.g:1723:2: (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality | this_Action_1= ruleAction )
            {
            // InternalXtext.g:1723:2: (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality | this_Action_1= ruleAction )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)||LA45_0==16||(LA45_0>=43 && LA45_0<=44)||(LA45_0>=46 && LA45_0<=47)) ) {
                alt45=1;
            }
            else if ( (LA45_0==38) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalXtext.g:1724:3: this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality
                    {

                    			newCompositeNode(grammarAccess.getAbstractTokenAccess().getAbstractTokenWithCardinalityParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AbstractTokenWithCardinality_0=ruleAbstractTokenWithCardinality();

                    state._fsp--;


                    			current = this_AbstractTokenWithCardinality_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtext.g:1733:3: this_Action_1= ruleAction
                    {

                    			newCompositeNode(grammarAccess.getAbstractTokenAccess().getActionParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Action_1=ruleAction();

                    state._fsp--;


                    			current = this_Action_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractToken"


    // $ANTLR start "entryRuleAbstractTokenWithCardinality"
    // InternalXtext.g:1745:1: entryRuleAbstractTokenWithCardinality returns [EObject current=null] : iv_ruleAbstractTokenWithCardinality= ruleAbstractTokenWithCardinality EOF ;
    public final EObject entryRuleAbstractTokenWithCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTokenWithCardinality = null;


        try {
            // InternalXtext.g:1745:69: (iv_ruleAbstractTokenWithCardinality= ruleAbstractTokenWithCardinality EOF )
            // InternalXtext.g:1746:2: iv_ruleAbstractTokenWithCardinality= ruleAbstractTokenWithCardinality EOF
            {
             newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractTokenWithCardinality=ruleAbstractTokenWithCardinality();

            state._fsp--;

             current =iv_ruleAbstractTokenWithCardinality; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractTokenWithCardinality"


    // $ANTLR start "ruleAbstractTokenWithCardinality"
    // InternalXtext.g:1752:1: ruleAbstractTokenWithCardinality returns [EObject current=null] : ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) ;
    public final EObject ruleAbstractTokenWithCardinality() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;
        EObject this_Assignment_0 = null;

        EObject this_AbstractTerminal_1 = null;



        	enterRule();

        try {
            // InternalXtext.g:1758:2: ( ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) )
            // InternalXtext.g:1759:2: ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            {
            // InternalXtext.g:1759:2: ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            // InternalXtext.g:1760:3: (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            {
            // InternalXtext.g:1760:3: (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal )
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalXtext.g:1761:4: this_Assignment_0= ruleAssignment
                    {

                    				newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityAccess().getAssignmentParserRuleCall_0_0());
                    			
                    pushFollow(FollowSets000.FOLLOW_37);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;


                    				current = this_Assignment_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalXtext.g:1770:4: this_AbstractTerminal_1= ruleAbstractTerminal
                    {

                    				newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityAccess().getAbstractTerminalParserRuleCall_0_1());
                    			
                    pushFollow(FollowSets000.FOLLOW_37);
                    this_AbstractTerminal_1=ruleAbstractTerminal();

                    state._fsp--;


                    				current = this_AbstractTerminal_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalXtext.g:1779:3: ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==24||(LA48_0>=36 && LA48_0<=37)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXtext.g:1780:4: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    {
                    // InternalXtext.g:1780:4: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    // InternalXtext.g:1781:5: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    {
                    // InternalXtext.g:1781:5: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    int alt47=3;
                    switch ( input.LA(1) ) {
                    case 36:
                        {
                        alt47=1;
                        }
                        break;
                    case 24:
                        {
                        alt47=2;
                        }
                        break;
                    case 37:
                        {
                        alt47=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }

                    switch (alt47) {
                        case 1 :
                            // InternalXtext.g:1782:6: lv_cardinality_2_1= '?'
                            {
                            lv_cardinality_2_1=(Token)match(input,36,FollowSets000.FOLLOW_2); 

                            						newLeafNode(lv_cardinality_2_1, grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityQuestionMarkKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAbstractTokenWithCardinalityRule());
                            						}
                            						setWithLastConsumed(current, "cardinality", lv_cardinality_2_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalXtext.g:1793:6: lv_cardinality_2_2= '*'
                            {
                            lv_cardinality_2_2=(Token)match(input,24,FollowSets000.FOLLOW_2); 

                            						newLeafNode(lv_cardinality_2_2, grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAsteriskKeyword_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAbstractTokenWithCardinalityRule());
                            						}
                            						setWithLastConsumed(current, "cardinality", lv_cardinality_2_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalXtext.g:1804:6: lv_cardinality_2_3= '+'
                            {
                            lv_cardinality_2_3=(Token)match(input,37,FollowSets000.FOLLOW_2); 

                            						newLeafNode(lv_cardinality_2_3, grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityPlusSignKeyword_1_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAbstractTokenWithCardinalityRule());
                            						}
                            						setWithLastConsumed(current, "cardinality", lv_cardinality_2_3, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractTokenWithCardinality"


    // $ANTLR start "entryRuleAction"
    // InternalXtext.g:1821:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalXtext.g:1821:47: (iv_ruleAction= ruleAction EOF )
            // InternalXtext.g:1822:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalXtext.g:1828:1: ruleAction returns [EObject current=null] : (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_operator_4_1=null;
        Token lv_operator_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_feature_3_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:1834:2: ( (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) )
            // InternalXtext.g:1835:2: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            {
            // InternalXtext.g:1835:2: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            // InternalXtext.g:1836:3: otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalXtext.g:1840:3: ( (lv_type_1_0= ruleTypeRef ) )
            // InternalXtext.g:1841:4: (lv_type_1_0= ruleTypeRef )
            {
            // InternalXtext.g:1841:4: (lv_type_1_0= ruleTypeRef )
            // InternalXtext.g:1842:5: lv_type_1_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getActionAccess().getTypeTypeRefParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_38);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.Xtext.TypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXtext.g:1859:3: (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==18) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalXtext.g:1860:4: otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current'
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getFullStopKeyword_2_0());
                    			
                    // InternalXtext.g:1864:4: ( (lv_feature_3_0= ruleValidID ) )
                    // InternalXtext.g:1865:5: (lv_feature_3_0= ruleValidID )
                    {
                    // InternalXtext.g:1865:5: (lv_feature_3_0= ruleValidID )
                    // InternalXtext.g:1866:6: lv_feature_3_0= ruleValidID
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getFeatureValidIDParserRuleCall_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_feature_3_0=ruleValidID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"feature",
                    							lv_feature_3_0,
                    							"org.eclipse.xtext.Xtext.ValidID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXtext.g:1883:4: ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) )
                    // InternalXtext.g:1884:5: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    {
                    // InternalXtext.g:1884:5: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    // InternalXtext.g:1885:6: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    {
                    // InternalXtext.g:1885:6: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==39) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==40) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalXtext.g:1886:7: lv_operator_4_1= '='
                            {
                            lv_operator_4_1=(Token)match(input,39,FollowSets000.FOLLOW_40); 

                            							newLeafNode(lv_operator_4_1, grammarAccess.getActionAccess().getOperatorEqualsSignKeyword_2_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getActionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_4_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalXtext.g:1897:7: lv_operator_4_2= '+='
                            {
                            lv_operator_4_2=(Token)match(input,40,FollowSets000.FOLLOW_40); 

                            							newLeafNode(lv_operator_4_2, grammarAccess.getActionAccess().getOperatorPlusSignEqualsSignKeyword_2_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getActionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_4_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_41); 

                    				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getCurrentKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAbstractTerminal"
    // InternalXtext.g:1923:1: entryRuleAbstractTerminal returns [EObject current=null] : iv_ruleAbstractTerminal= ruleAbstractTerminal EOF ;
    public final EObject entryRuleAbstractTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTerminal = null;


        try {
            // InternalXtext.g:1923:57: (iv_ruleAbstractTerminal= ruleAbstractTerminal EOF )
            // InternalXtext.g:1924:2: iv_ruleAbstractTerminal= ruleAbstractTerminal EOF
            {
             newCompositeNode(grammarAccess.getAbstractTerminalRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractTerminal=ruleAbstractTerminal();

            state._fsp--;

             current =iv_ruleAbstractTerminal; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractTerminal"


    // $ANTLR start "ruleAbstractTerminal"
    // InternalXtext.g:1930:1: ruleAbstractTerminal returns [EObject current=null] : (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement | this_PredicatedKeyword_3= rulePredicatedKeyword | this_PredicatedRuleCall_4= rulePredicatedRuleCall | this_PredicatedGroup_5= rulePredicatedGroup ) ;
    public final EObject ruleAbstractTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_Keyword_0 = null;

        EObject this_RuleCall_1 = null;

        EObject this_ParenthesizedElement_2 = null;

        EObject this_PredicatedKeyword_3 = null;

        EObject this_PredicatedRuleCall_4 = null;

        EObject this_PredicatedGroup_5 = null;



        	enterRule();

        try {
            // InternalXtext.g:1936:2: ( (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement | this_PredicatedKeyword_3= rulePredicatedKeyword | this_PredicatedRuleCall_4= rulePredicatedRuleCall | this_PredicatedGroup_5= rulePredicatedGroup ) )
            // InternalXtext.g:1937:2: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement | this_PredicatedKeyword_3= rulePredicatedKeyword | this_PredicatedRuleCall_4= rulePredicatedRuleCall | this_PredicatedGroup_5= rulePredicatedGroup )
            {
            // InternalXtext.g:1937:2: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement | this_PredicatedKeyword_3= rulePredicatedKeyword | this_PredicatedRuleCall_4= rulePredicatedRuleCall | this_PredicatedGroup_5= rulePredicatedGroup )
            int alt51=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt51=1;
                }
                break;
            case RULE_ID:
            case 43:
            case 44:
                {
                alt51=2;
                }
                break;
            case 16:
                {
                alt51=3;
                }
                break;
            case 46:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 43:
                case 44:
                    {
                    alt51=5;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt51=4;
                    }
                    break;
                case 16:
                    {
                    alt51=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 4, input);

                    throw nvae;
                }

                }
                break;
            case 47:
                {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    alt51=6;
                    }
                    break;
                case RULE_ID:
                case 43:
                case 44:
                    {
                    alt51=5;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt51=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 5, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalXtext.g:1938:3: this_Keyword_0= ruleKeyword
                    {

                    			newCompositeNode(grammarAccess.getAbstractTerminalAccess().getKeywordParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Keyword_0=ruleKeyword();

                    state._fsp--;


                    			current = this_Keyword_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtext.g:1947:3: this_RuleCall_1= ruleRuleCall
                    {

                    			newCompositeNode(grammarAccess.getAbstractTerminalAccess().getRuleCallParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RuleCall_1=ruleRuleCall();

                    state._fsp--;


                    			current = this_RuleCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXtext.g:1956:3: this_ParenthesizedElement_2= ruleParenthesizedElement
                    {

                    			newCompositeNode(grammarAccess.getAbstractTerminalAccess().getParenthesizedElementParserRuleCall_2());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParenthesizedElement_2=ruleParenthesizedElement();

                    state._fsp--;


                    			current = this_ParenthesizedElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXtext.g:1965:3: this_PredicatedKeyword_3= rulePredicatedKeyword
                    {

                    			newCompositeNode(grammarAccess.getAbstractTerminalAccess().getPredicatedKeywordParserRuleCall_3());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PredicatedKeyword_3=rulePredicatedKeyword();

                    state._fsp--;


                    			current = this_PredicatedKeyword_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXtext.g:1974:3: this_PredicatedRuleCall_4= rulePredicatedRuleCall
                    {

                    			newCompositeNode(grammarAccess.getAbstractTerminalAccess().getPredicatedRuleCallParserRuleCall_4());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PredicatedRuleCall_4=rulePredicatedRuleCall();

                    state._fsp--;


                    			current = this_PredicatedRuleCall_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXtext.g:1983:3: this_PredicatedGroup_5= rulePredicatedGroup
                    {

                    			newCompositeNode(grammarAccess.getAbstractTerminalAccess().getPredicatedGroupParserRuleCall_5());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PredicatedGroup_5=rulePredicatedGroup();

                    state._fsp--;


                    			current = this_PredicatedGroup_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractTerminal"


    // $ANTLR start "entryRuleKeyword"
    // InternalXtext.g:1995:1: entryRuleKeyword returns [EObject current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final EObject entryRuleKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyword = null;


        try {
            // InternalXtext.g:1995:48: (iv_ruleKeyword= ruleKeyword EOF )
            // InternalXtext.g:1996:2: iv_ruleKeyword= ruleKeyword EOF
            {
             newCompositeNode(grammarAccess.getKeywordRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKeyword=ruleKeyword();

            state._fsp--;

             current =iv_ruleKeyword; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // InternalXtext.g:2002:1: ruleKeyword returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalXtext.g:2008:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalXtext.g:2009:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalXtext.g:2009:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalXtext.g:2010:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalXtext.g:2010:3: (lv_value_0_0= RULE_STRING )
            // InternalXtext.g:2011:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getKeywordAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getKeywordRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleRuleCall"
    // InternalXtext.g:2030:1: entryRuleRuleCall returns [EObject current=null] : iv_ruleRuleCall= ruleRuleCall EOF ;
    public final EObject entryRuleRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleCall = null;


        try {
            // InternalXtext.g:2030:49: (iv_ruleRuleCall= ruleRuleCall EOF )
            // InternalXtext.g:2031:2: iv_ruleRuleCall= ruleRuleCall EOF
            {
             newCompositeNode(grammarAccess.getRuleCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRuleCall=ruleRuleCall();

            state._fsp--;

             current =iv_ruleRuleCall; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleCall"


    // $ANTLR start "ruleRuleCall"
    // InternalXtext.g:2037:1: ruleRuleCall returns [EObject current=null] : ( ( ( ruleRuleID ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleRuleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:2043:2: ( ( ( ( ruleRuleID ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )? ) )
            // InternalXtext.g:2044:2: ( ( ( ruleRuleID ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )? )
            {
            // InternalXtext.g:2044:2: ( ( ( ruleRuleID ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )? )
            // InternalXtext.g:2045:3: ( ( ruleRuleID ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )?
            {
            // InternalXtext.g:2045:3: ( ( ruleRuleID ) )
            // InternalXtext.g:2046:4: ( ruleRuleID )
            {
            // InternalXtext.g:2046:4: ( ruleRuleID )
            // InternalXtext.g:2047:5: ruleRuleID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRuleCallAccess().getRuleAbstractRuleCrossReference_0_0());
            				
            pushFollow(FollowSets000.FOLLOW_27);
            ruleRuleID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXtext.g:2061:3: (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==31) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalXtext.g:2062:4: otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_32); 

                    				newLeafNode(otherlv_1, grammarAccess.getRuleCallAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalXtext.g:2066:4: ( (lv_arguments_2_0= ruleNamedArgument ) )
                    // InternalXtext.g:2067:5: (lv_arguments_2_0= ruleNamedArgument )
                    {
                    // InternalXtext.g:2067:5: (lv_arguments_2_0= ruleNamedArgument )
                    // InternalXtext.g:2068:6: lv_arguments_2_0= ruleNamedArgument
                    {

                    						newCompositeNode(grammarAccess.getRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_arguments_2_0=ruleNamedArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleCallRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_0,
                    							"org.eclipse.xtext.Xtext.NamedArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXtext.g:2085:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==14) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalXtext.g:2086:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_32); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getRuleCallAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalXtext.g:2090:5: ( (lv_arguments_4_0= ruleNamedArgument ) )
                    	    // InternalXtext.g:2091:6: (lv_arguments_4_0= ruleNamedArgument )
                    	    {
                    	    // InternalXtext.g:2091:6: (lv_arguments_4_0= ruleNamedArgument )
                    	    // InternalXtext.g:2092:7: lv_arguments_4_0= ruleNamedArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_29);
                    	    lv_arguments_4_0=ruleNamedArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRuleCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_4_0,
                    	    								"org.eclipse.xtext.Xtext.NamedArgument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getRuleCallAccess().getGreaterThanSignKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleCall"


    // $ANTLR start "entryRuleNamedArgument"
    // InternalXtext.g:2119:1: entryRuleNamedArgument returns [EObject current=null] : iv_ruleNamedArgument= ruleNamedArgument EOF ;
    public final EObject entryRuleNamedArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedArgument = null;


        try {
            // InternalXtext.g:2119:54: (iv_ruleNamedArgument= ruleNamedArgument EOF )
            // InternalXtext.g:2120:2: iv_ruleNamedArgument= ruleNamedArgument EOF
            {
             newCompositeNode(grammarAccess.getNamedArgumentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNamedArgument=ruleNamedArgument();

            state._fsp--;

             current =iv_ruleNamedArgument; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedArgument"


    // $ANTLR start "ruleNamedArgument"
    // InternalXtext.g:2126:1: ruleNamedArgument returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )? ( (lv_value_2_0= ruleDisjunction ) ) ) ;
    public final EObject ruleNamedArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_calledByName_1_0=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:2132:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )? ( (lv_value_2_0= ruleDisjunction ) ) ) )
            // InternalXtext.g:2133:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )? ( (lv_value_2_0= ruleDisjunction ) ) )
            {
            // InternalXtext.g:2133:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )? ( (lv_value_2_0= ruleDisjunction ) ) )
            // InternalXtext.g:2134:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )? ( (lv_value_2_0= ruleDisjunction ) )
            {
            // InternalXtext.g:2134:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==39) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // InternalXtext.g:2135:4: ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) )
                    {
                    // InternalXtext.g:2135:4: ( (otherlv_0= RULE_ID ) )
                    // InternalXtext.g:2136:5: (otherlv_0= RULE_ID )
                    {
                    // InternalXtext.g:2136:5: (otherlv_0= RULE_ID )
                    // InternalXtext.g:2137:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedArgumentRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_42); 

                    						newLeafNode(otherlv_0, grammarAccess.getNamedArgumentAccess().getParameterParameterCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalXtext.g:2148:4: ( (lv_calledByName_1_0= '=' ) )
                    // InternalXtext.g:2149:5: (lv_calledByName_1_0= '=' )
                    {
                    // InternalXtext.g:2149:5: (lv_calledByName_1_0= '=' )
                    // InternalXtext.g:2150:6: lv_calledByName_1_0= '='
                    {
                    lv_calledByName_1_0=(Token)match(input,39,FollowSets000.FOLLOW_32); 

                    						newLeafNode(lv_calledByName_1_0, grammarAccess.getNamedArgumentAccess().getCalledByNameEqualsSignKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedArgumentRule());
                    						}
                    						setWithLastConsumed(current, "calledByName", lv_calledByName_1_0 != null, "=");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXtext.g:2163:3: ( (lv_value_2_0= ruleDisjunction ) )
            // InternalXtext.g:2164:4: (lv_value_2_0= ruleDisjunction )
            {
            // InternalXtext.g:2164:4: (lv_value_2_0= ruleDisjunction )
            // InternalXtext.g:2165:5: lv_value_2_0= ruleDisjunction
            {

            					newCompositeNode(grammarAccess.getNamedArgumentAccess().getValueDisjunctionParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleDisjunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedArgumentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.Xtext.Disjunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedArgument"


    // $ANTLR start "entryRuleLiteralCondition"
    // InternalXtext.g:2186:1: entryRuleLiteralCondition returns [EObject current=null] : iv_ruleLiteralCondition= ruleLiteralCondition EOF ;
    public final EObject entryRuleLiteralCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralCondition = null;


        try {
            // InternalXtext.g:2186:57: (iv_ruleLiteralCondition= ruleLiteralCondition EOF )
            // InternalXtext.g:2187:2: iv_ruleLiteralCondition= ruleLiteralCondition EOF
            {
             newCompositeNode(grammarAccess.getLiteralConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLiteralCondition=ruleLiteralCondition();

            state._fsp--;

             current =iv_ruleLiteralCondition; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralCondition"


    // $ANTLR start "ruleLiteralCondition"
    // InternalXtext.g:2193:1: ruleLiteralCondition returns [EObject current=null] : ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleLiteralCondition() throws RecognitionException {
        EObject current = null;

        Token lv_true_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalXtext.g:2199:2: ( ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalXtext.g:2200:2: ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalXtext.g:2200:2: ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalXtext.g:2201:3: () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalXtext.g:2201:3: ()
            // InternalXtext.g:2202:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLiteralConditionAccess().getLiteralConditionAction_0(),
            					current);
            			

            }

            // InternalXtext.g:2208:3: ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==43) ) {
                alt55=1;
            }
            else if ( (LA55_0==44) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalXtext.g:2209:4: ( (lv_true_1_0= 'true' ) )
                    {
                    // InternalXtext.g:2209:4: ( (lv_true_1_0= 'true' ) )
                    // InternalXtext.g:2210:5: (lv_true_1_0= 'true' )
                    {
                    // InternalXtext.g:2210:5: (lv_true_1_0= 'true' )
                    // InternalXtext.g:2211:6: lv_true_1_0= 'true'
                    {
                    lv_true_1_0=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                    						newLeafNode(lv_true_1_0, grammarAccess.getLiteralConditionAccess().getTrueTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralConditionRule());
                    						}
                    						setWithLastConsumed(current, "true", lv_true_1_0 != null, "true");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2224:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getLiteralConditionAccess().getFalseKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralCondition"


    // $ANTLR start "entryRuleDisjunction"
    // InternalXtext.g:2233:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // InternalXtext.g:2233:52: (iv_ruleDisjunction= ruleDisjunction EOF )
            // InternalXtext.g:2234:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
             newCompositeNode(grammarAccess.getDisjunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;

             current =iv_ruleDisjunction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // InternalXtext.g:2240:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Conjunction_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:2246:2: ( (this_Conjunction_0= ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // InternalXtext.g:2247:2: (this_Conjunction_0= ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // InternalXtext.g:2247:2: (this_Conjunction_0= ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )* )
            // InternalXtext.g:2248:3: this_Conjunction_0= ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )*
            {

            			newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_31);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;


            			current = this_Conjunction_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtext.g:2256:3: ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==34) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalXtext.g:2257:4: () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // InternalXtext.g:2257:4: ()
            	    // InternalXtext.g:2258:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_32); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_1_1());
            	    			
            	    // InternalXtext.g:2268:4: ( (lv_right_3_0= ruleConjunction ) )
            	    // InternalXtext.g:2269:5: (lv_right_3_0= ruleConjunction )
            	    {
            	    // InternalXtext.g:2269:5: (lv_right_3_0= ruleConjunction )
            	    // InternalXtext.g:2270:6: lv_right_3_0= ruleConjunction
            	    {

            	    						newCompositeNode(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    lv_right_3_0=ruleConjunction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDisjunctionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.eclipse.xtext.Xtext.Conjunction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // InternalXtext.g:2292:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // InternalXtext.g:2292:52: (iv_ruleConjunction= ruleConjunction EOF )
            // InternalXtext.g:2293:2: iv_ruleConjunction= ruleConjunction EOF
            {
             newCompositeNode(grammarAccess.getConjunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;

             current =iv_ruleConjunction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // InternalXtext.g:2299:1: ruleConjunction returns [EObject current=null] : (this_Negation_0= ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Negation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:2305:2: ( (this_Negation_0= ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )* ) )
            // InternalXtext.g:2306:2: (this_Negation_0= ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )* )
            {
            // InternalXtext.g:2306:2: (this_Negation_0= ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )* )
            // InternalXtext.g:2307:3: this_Negation_0= ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_36);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtext.g:2315:3: ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==35) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalXtext.g:2316:4: () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) )
            	    {
            	    // InternalXtext.g:2316:4: ()
            	    // InternalXtext.g:2317:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_32); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConjunctionAccess().getAmpersandKeyword_1_1());
            	    			
            	    // InternalXtext.g:2327:4: ( (lv_right_3_0= ruleNegation ) )
            	    // InternalXtext.g:2328:5: (lv_right_3_0= ruleNegation )
            	    {
            	    // InternalXtext.g:2328:5: (lv_right_3_0= ruleNegation )
            	    // InternalXtext.g:2329:6: lv_right_3_0= ruleNegation
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionAccess().getRightNegationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    lv_right_3_0=ruleNegation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConjunctionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.eclipse.xtext.Xtext.Negation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleNegation"
    // InternalXtext.g:2351:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalXtext.g:2351:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalXtext.g:2352:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalXtext.g:2358:1: ruleNegation returns [EObject current=null] : (this_Atom_0= ruleAtom | ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Atom_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:2364:2: ( (this_Atom_0= ruleAtom | ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) ) ) )
            // InternalXtext.g:2365:2: (this_Atom_0= ruleAtom | ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) ) )
            {
            // InternalXtext.g:2365:2: (this_Atom_0= ruleAtom | ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID||LA58_0==16||(LA58_0>=43 && LA58_0<=44)) ) {
                alt58=1;
            }
            else if ( (LA58_0==45) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalXtext.g:2366:3: this_Atom_0= ruleAtom
                    {

                    			newCompositeNode(grammarAccess.getNegationAccess().getAtomParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Atom_0=ruleAtom();

                    state._fsp--;


                    			current = this_Atom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtext.g:2375:3: ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) )
                    {
                    // InternalXtext.g:2375:3: ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) )
                    // InternalXtext.g:2376:4: () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) )
                    {
                    // InternalXtext.g:2376:4: ()
                    // InternalXtext.g:2377:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getNegationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_32); 

                    				newLeafNode(otherlv_2, grammarAccess.getNegationAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalXtext.g:2387:4: ( (lv_value_3_0= ruleNegation ) )
                    // InternalXtext.g:2388:5: (lv_value_3_0= ruleNegation )
                    {
                    // InternalXtext.g:2388:5: (lv_value_3_0= ruleNegation )
                    // InternalXtext.g:2389:6: lv_value_3_0= ruleNegation
                    {

                    						newCompositeNode(grammarAccess.getNegationAccess().getValueNegationParserRuleCall_1_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_3_0=ruleNegation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNegationRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.Xtext.Negation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleAtom"
    // InternalXtext.g:2411:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalXtext.g:2411:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalXtext.g:2412:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalXtext.g:2418:1: ruleAtom returns [EObject current=null] : (this_ParameterReference_0= ruleParameterReference | this_ParenthesizedCondition_1= ruleParenthesizedCondition | this_LiteralCondition_2= ruleLiteralCondition ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterReference_0 = null;

        EObject this_ParenthesizedCondition_1 = null;

        EObject this_LiteralCondition_2 = null;



        	enterRule();

        try {
            // InternalXtext.g:2424:2: ( (this_ParameterReference_0= ruleParameterReference | this_ParenthesizedCondition_1= ruleParenthesizedCondition | this_LiteralCondition_2= ruleLiteralCondition ) )
            // InternalXtext.g:2425:2: (this_ParameterReference_0= ruleParameterReference | this_ParenthesizedCondition_1= ruleParenthesizedCondition | this_LiteralCondition_2= ruleLiteralCondition )
            {
            // InternalXtext.g:2425:2: (this_ParameterReference_0= ruleParameterReference | this_ParenthesizedCondition_1= ruleParenthesizedCondition | this_LiteralCondition_2= ruleLiteralCondition )
            int alt59=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt59=1;
                }
                break;
            case 16:
                {
                alt59=2;
                }
                break;
            case 43:
            case 44:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalXtext.g:2426:3: this_ParameterReference_0= ruleParameterReference
                    {

                    			newCompositeNode(grammarAccess.getAtomAccess().getParameterReferenceParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParameterReference_0=ruleParameterReference();

                    state._fsp--;


                    			current = this_ParameterReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtext.g:2435:3: this_ParenthesizedCondition_1= ruleParenthesizedCondition
                    {

                    			newCompositeNode(grammarAccess.getAtomAccess().getParenthesizedConditionParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParenthesizedCondition_1=ruleParenthesizedCondition();

                    state._fsp--;


                    			current = this_ParenthesizedCondition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXtext.g:2444:3: this_LiteralCondition_2= ruleLiteralCondition
                    {

                    			newCompositeNode(grammarAccess.getAtomAccess().getLiteralConditionParserRuleCall_2());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LiteralCondition_2=ruleLiteralCondition();

                    state._fsp--;


                    			current = this_LiteralCondition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleParenthesizedCondition"
    // InternalXtext.g:2456:1: entryRuleParenthesizedCondition returns [EObject current=null] : iv_ruleParenthesizedCondition= ruleParenthesizedCondition EOF ;
    public final EObject entryRuleParenthesizedCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedCondition = null;


        try {
            // InternalXtext.g:2456:63: (iv_ruleParenthesizedCondition= ruleParenthesizedCondition EOF )
            // InternalXtext.g:2457:2: iv_ruleParenthesizedCondition= ruleParenthesizedCondition EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParenthesizedCondition=ruleParenthesizedCondition();

            state._fsp--;

             current =iv_ruleParenthesizedCondition; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedCondition"


    // $ANTLR start "ruleParenthesizedCondition"
    // InternalXtext.g:2463:1: ruleParenthesizedCondition returns [EObject current=null] : (otherlv_0= '(' this_Disjunction_1= ruleDisjunction otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Disjunction_1 = null;



        	enterRule();

        try {
            // InternalXtext.g:2469:2: ( (otherlv_0= '(' this_Disjunction_1= ruleDisjunction otherlv_2= ')' ) )
            // InternalXtext.g:2470:2: (otherlv_0= '(' this_Disjunction_1= ruleDisjunction otherlv_2= ')' )
            {
            // InternalXtext.g:2470:2: (otherlv_0= '(' this_Disjunction_1= ruleDisjunction otherlv_2= ')' )
            // InternalXtext.g:2471:3: otherlv_0= '(' this_Disjunction_1= ruleDisjunction otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesizedConditionAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesizedConditionAccess().getDisjunctionParserRuleCall_1());
            		
            pushFollow(FollowSets000.FOLLOW_43);
            this_Disjunction_1=ruleDisjunction();

            state._fsp--;


            			current = this_Disjunction_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesizedConditionAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesizedCondition"


    // $ANTLR start "entryRuleParameterReference"
    // InternalXtext.g:2491:1: entryRuleParameterReference returns [EObject current=null] : iv_ruleParameterReference= ruleParameterReference EOF ;
    public final EObject entryRuleParameterReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterReference = null;


        try {
            // InternalXtext.g:2491:59: (iv_ruleParameterReference= ruleParameterReference EOF )
            // InternalXtext.g:2492:2: iv_ruleParameterReference= ruleParameterReference EOF
            {
             newCompositeNode(grammarAccess.getParameterReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameterReference=ruleParameterReference();

            state._fsp--;

             current =iv_ruleParameterReference; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterReference"


    // $ANTLR start "ruleParameterReference"
    // InternalXtext.g:2498:1: ruleParameterReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParameterReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalXtext.g:2504:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalXtext.g:2505:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalXtext.g:2505:2: ( (otherlv_0= RULE_ID ) )
            // InternalXtext.g:2506:3: (otherlv_0= RULE_ID )
            {
            // InternalXtext.g:2506:3: (otherlv_0= RULE_ID )
            // InternalXtext.g:2507:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParameterReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getParameterReferenceAccess().getParameterParameterCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterReference"


    // $ANTLR start "entryRuleTerminalRuleCall"
    // InternalXtext.g:2521:1: entryRuleTerminalRuleCall returns [EObject current=null] : iv_ruleTerminalRuleCall= ruleTerminalRuleCall EOF ;
    public final EObject entryRuleTerminalRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalRuleCall = null;


        try {
            // InternalXtext.g:2521:57: (iv_ruleTerminalRuleCall= ruleTerminalRuleCall EOF )
            // InternalXtext.g:2522:2: iv_ruleTerminalRuleCall= ruleTerminalRuleCall EOF
            {
             newCompositeNode(grammarAccess.getTerminalRuleCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTerminalRuleCall=ruleTerminalRuleCall();

            state._fsp--;

             current =iv_ruleTerminalRuleCall; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalRuleCall"


    // $ANTLR start "ruleTerminalRuleCall"
    // InternalXtext.g:2528:1: ruleTerminalRuleCall returns [EObject current=null] : ( ( ruleRuleID ) ) ;
    public final EObject ruleTerminalRuleCall() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalXtext.g:2534:2: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:2535:2: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:2535:2: ( ( ruleRuleID ) )
            // InternalXtext.g:2536:3: ( ruleRuleID )
            {
            // InternalXtext.g:2536:3: ( ruleRuleID )
            // InternalXtext.g:2537:4: ruleRuleID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTerminalRuleCallRule());
            				}
            			

            				newCompositeNode(grammarAccess.getTerminalRuleCallAccess().getRuleAbstractRuleCrossReference_0());
            			
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalRuleCall"


    // $ANTLR start "entryRuleRuleID"
    // InternalXtext.g:2554:1: entryRuleRuleID returns [String current=null] : iv_ruleRuleID= ruleRuleID EOF ;
    public final String entryRuleRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleID = null;


        try {
            // InternalXtext.g:2554:46: (iv_ruleRuleID= ruleRuleID EOF )
            // InternalXtext.g:2555:2: iv_ruleRuleID= ruleRuleID EOF
            {
             newCompositeNode(grammarAccess.getRuleIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRuleID=ruleRuleID();

            state._fsp--;

             current =iv_ruleRuleID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleID"


    // $ANTLR start "ruleRuleID"
    // InternalXtext.g:2561:1: ruleRuleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '::' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleRuleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalXtext.g:2567:2: ( (this_ValidID_0= ruleValidID (kw= '::' this_ValidID_2= ruleValidID )* ) )
            // InternalXtext.g:2568:2: (this_ValidID_0= ruleValidID (kw= '::' this_ValidID_2= ruleValidID )* )
            {
            // InternalXtext.g:2568:2: (this_ValidID_0= ruleValidID (kw= '::' this_ValidID_2= ruleValidID )* )
            // InternalXtext.g:2569:3: this_ValidID_0= ruleValidID (kw= '::' this_ValidID_2= ruleValidID )*
            {

            			newCompositeNode(grammarAccess.getRuleIDAccess().getValidIDParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_44);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            			current.merge(this_ValidID_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalXtext.g:2579:3: (kw= '::' this_ValidID_2= ruleValidID )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==33) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalXtext.g:2580:4: kw= '::' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,33,FollowSets000.FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getRuleIDAccess().getColonColonKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getRuleIDAccess().getValidIDParserRuleCall_1_1());
            	    			
            	    pushFollow(FollowSets000.FOLLOW_44);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    				current.merge(this_ValidID_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleID"


    // $ANTLR start "entryRuleValidID"
    // InternalXtext.g:2600:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalXtext.g:2600:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalXtext.g:2601:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalXtext.g:2607:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalXtext.g:2613:2: ( (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' ) )
            // InternalXtext.g:2614:2: (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' )
            {
            // InternalXtext.g:2614:2: (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' )
            int alt61=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt61=1;
                }
                break;
            case 43:
                {
                alt61=2;
                }
                break;
            case 44:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalXtext.g:2615:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXtext.g:2623:3: kw= 'true'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getTrueKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXtext.g:2629:3: kw= 'false'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValidIDAccess().getFalseKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRulePredicatedKeyword"
    // InternalXtext.g:2638:1: entryRulePredicatedKeyword returns [EObject current=null] : iv_rulePredicatedKeyword= rulePredicatedKeyword EOF ;
    public final EObject entryRulePredicatedKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicatedKeyword = null;


        try {
            // InternalXtext.g:2638:58: (iv_rulePredicatedKeyword= rulePredicatedKeyword EOF )
            // InternalXtext.g:2639:2: iv_rulePredicatedKeyword= rulePredicatedKeyword EOF
            {
             newCompositeNode(grammarAccess.getPredicatedKeywordRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePredicatedKeyword=rulePredicatedKeyword();

            state._fsp--;

             current =iv_rulePredicatedKeyword; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicatedKeyword"


    // $ANTLR start "rulePredicatedKeyword"
    // InternalXtext.g:2645:1: rulePredicatedKeyword returns [EObject current=null] : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePredicatedKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalXtext.g:2651:2: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalXtext.g:2652:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalXtext.g:2652:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalXtext.g:2653:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalXtext.g:2653:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==46) ) {
                alt62=1;
            }
            else if ( (LA62_0==47) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalXtext.g:2654:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // InternalXtext.g:2654:4: ( (lv_predicated_0_0= '=>' ) )
                    // InternalXtext.g:2655:5: (lv_predicated_0_0= '=>' )
                    {
                    // InternalXtext.g:2655:5: (lv_predicated_0_0= '=>' )
                    // InternalXtext.g:2656:6: lv_predicated_0_0= '=>'
                    {
                    lv_predicated_0_0=(Token)match(input,46,FollowSets000.FOLLOW_11); 

                    						newLeafNode(lv_predicated_0_0, grammarAccess.getPredicatedKeywordAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredicatedKeywordRule());
                    						}
                    						setWithLastConsumed(current, "predicated", lv_predicated_0_0 != null, "=>");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2669:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // InternalXtext.g:2669:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // InternalXtext.g:2670:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // InternalXtext.g:2670:5: (lv_firstSetPredicated_1_0= '->' )
                    // InternalXtext.g:2671:6: lv_firstSetPredicated_1_0= '->'
                    {
                    lv_firstSetPredicated_1_0=(Token)match(input,47,FollowSets000.FOLLOW_11); 

                    						newLeafNode(lv_firstSetPredicated_1_0, grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredicatedKeywordRule());
                    						}
                    						setWithLastConsumed(current, "firstSetPredicated", lv_firstSetPredicated_1_0 != null, "->");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXtext.g:2684:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalXtext.g:2685:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalXtext.g:2685:4: (lv_value_2_0= RULE_STRING )
            // InternalXtext.g:2686:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getPredicatedKeywordAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredicatedKeywordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicatedKeyword"


    // $ANTLR start "entryRulePredicatedRuleCall"
    // InternalXtext.g:2706:1: entryRulePredicatedRuleCall returns [EObject current=null] : iv_rulePredicatedRuleCall= rulePredicatedRuleCall EOF ;
    public final EObject entryRulePredicatedRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicatedRuleCall = null;


        try {
            // InternalXtext.g:2706:59: (iv_rulePredicatedRuleCall= rulePredicatedRuleCall EOF )
            // InternalXtext.g:2707:2: iv_rulePredicatedRuleCall= rulePredicatedRuleCall EOF
            {
             newCompositeNode(grammarAccess.getPredicatedRuleCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePredicatedRuleCall=rulePredicatedRuleCall();

            state._fsp--;

             current =iv_rulePredicatedRuleCall; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicatedRuleCall"


    // $ANTLR start "rulePredicatedRuleCall"
    // InternalXtext.g:2713:1: rulePredicatedRuleCall returns [EObject current=null] : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( ( ruleRuleID ) ) (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )? ) ;
    public final EObject rulePredicatedRuleCall() throws RecognitionException {
        EObject current = null;

        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:2719:2: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( ( ruleRuleID ) ) (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )? ) )
            // InternalXtext.g:2720:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( ( ruleRuleID ) ) (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )? )
            {
            // InternalXtext.g:2720:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( ( ruleRuleID ) ) (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )? )
            // InternalXtext.g:2721:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( ( ruleRuleID ) ) (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )?
            {
            // InternalXtext.g:2721:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==46) ) {
                alt63=1;
            }
            else if ( (LA63_0==47) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalXtext.g:2722:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // InternalXtext.g:2722:4: ( (lv_predicated_0_0= '=>' ) )
                    // InternalXtext.g:2723:5: (lv_predicated_0_0= '=>' )
                    {
                    // InternalXtext.g:2723:5: (lv_predicated_0_0= '=>' )
                    // InternalXtext.g:2724:6: lv_predicated_0_0= '=>'
                    {
                    lv_predicated_0_0=(Token)match(input,46,FollowSets000.FOLLOW_3); 

                    						newLeafNode(lv_predicated_0_0, grammarAccess.getPredicatedRuleCallAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredicatedRuleCallRule());
                    						}
                    						setWithLastConsumed(current, "predicated", lv_predicated_0_0 != null, "=>");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2737:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // InternalXtext.g:2737:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // InternalXtext.g:2738:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // InternalXtext.g:2738:5: (lv_firstSetPredicated_1_0= '->' )
                    // InternalXtext.g:2739:6: lv_firstSetPredicated_1_0= '->'
                    {
                    lv_firstSetPredicated_1_0=(Token)match(input,47,FollowSets000.FOLLOW_3); 

                    						newLeafNode(lv_firstSetPredicated_1_0, grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredicatedRuleCallRule());
                    						}
                    						setWithLastConsumed(current, "firstSetPredicated", lv_firstSetPredicated_1_0 != null, "->");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXtext.g:2752:3: ( ( ruleRuleID ) )
            // InternalXtext.g:2753:4: ( ruleRuleID )
            {
            // InternalXtext.g:2753:4: ( ruleRuleID )
            // InternalXtext.g:2754:5: ruleRuleID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredicatedRuleCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPredicatedRuleCallAccess().getRuleAbstractRuleCrossReference_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_27);
            ruleRuleID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXtext.g:2768:3: (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==31) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalXtext.g:2769:4: otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_32); 

                    				newLeafNode(otherlv_3, grammarAccess.getPredicatedRuleCallAccess().getLessThanSignKeyword_2_0());
                    			
                    // InternalXtext.g:2773:4: ( (lv_arguments_4_0= ruleNamedArgument ) )
                    // InternalXtext.g:2774:5: (lv_arguments_4_0= ruleNamedArgument )
                    {
                    // InternalXtext.g:2774:5: (lv_arguments_4_0= ruleNamedArgument )
                    // InternalXtext.g:2775:6: lv_arguments_4_0= ruleNamedArgument
                    {

                    						newCompositeNode(grammarAccess.getPredicatedRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_arguments_4_0=ruleNamedArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPredicatedRuleCallRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_4_0,
                    							"org.eclipse.xtext.Xtext.NamedArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXtext.g:2792:4: (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==14) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalXtext.g:2793:5: otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_32); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getPredicatedRuleCallAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalXtext.g:2797:5: ( (lv_arguments_6_0= ruleNamedArgument ) )
                    	    // InternalXtext.g:2798:6: (lv_arguments_6_0= ruleNamedArgument )
                    	    {
                    	    // InternalXtext.g:2798:6: (lv_arguments_6_0= ruleNamedArgument )
                    	    // InternalXtext.g:2799:7: lv_arguments_6_0= ruleNamedArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getPredicatedRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_29);
                    	    lv_arguments_6_0=ruleNamedArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPredicatedRuleCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_6_0,
                    	    								"org.eclipse.xtext.Xtext.NamedArgument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getPredicatedRuleCallAccess().getGreaterThanSignKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicatedRuleCall"


    // $ANTLR start "entryRuleAssignment"
    // InternalXtext.g:2826:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalXtext.g:2826:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalXtext.g:2827:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalXtext.g:2833:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= ruleValidID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_operator_3_1=null;
        Token lv_operator_3_2=null;
        Token lv_operator_3_3=null;
        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_terminal_4_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:2839:2: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= ruleValidID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) )
            // InternalXtext.g:2840:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= ruleValidID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            {
            // InternalXtext.g:2840:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= ruleValidID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            // InternalXtext.g:2841:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= ruleValidID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            {
            // InternalXtext.g:2841:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )?
            int alt66=3;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==46) ) {
                alt66=1;
            }
            else if ( (LA66_0==47) ) {
                alt66=2;
            }
            switch (alt66) {
                case 1 :
                    // InternalXtext.g:2842:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // InternalXtext.g:2842:4: ( (lv_predicated_0_0= '=>' ) )
                    // InternalXtext.g:2843:5: (lv_predicated_0_0= '=>' )
                    {
                    // InternalXtext.g:2843:5: (lv_predicated_0_0= '=>' )
                    // InternalXtext.g:2844:6: lv_predicated_0_0= '=>'
                    {
                    lv_predicated_0_0=(Token)match(input,46,FollowSets000.FOLLOW_3); 

                    						newLeafNode(lv_predicated_0_0, grammarAccess.getAssignmentAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignmentRule());
                    						}
                    						setWithLastConsumed(current, "predicated", lv_predicated_0_0 != null, "=>");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2857:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // InternalXtext.g:2857:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // InternalXtext.g:2858:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // InternalXtext.g:2858:5: (lv_firstSetPredicated_1_0= '->' )
                    // InternalXtext.g:2859:6: lv_firstSetPredicated_1_0= '->'
                    {
                    lv_firstSetPredicated_1_0=(Token)match(input,47,FollowSets000.FOLLOW_3); 

                    						newLeafNode(lv_firstSetPredicated_1_0, grammarAccess.getAssignmentAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignmentRule());
                    						}
                    						setWithLastConsumed(current, "firstSetPredicated", lv_firstSetPredicated_1_0 != null, "->");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXtext.g:2872:3: ( (lv_feature_2_0= ruleValidID ) )
            // InternalXtext.g:2873:4: (lv_feature_2_0= ruleValidID )
            {
            // InternalXtext.g:2873:4: (lv_feature_2_0= ruleValidID )
            // InternalXtext.g:2874:5: lv_feature_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getFeatureValidIDParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_45);
            lv_feature_2_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"feature",
            						lv_feature_2_0,
            						"org.eclipse.xtext.Xtext.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXtext.g:2891:3: ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) )
            // InternalXtext.g:2892:4: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            {
            // InternalXtext.g:2892:4: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            // InternalXtext.g:2893:5: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            {
            // InternalXtext.g:2893:5: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt67=1;
                }
                break;
            case 39:
                {
                alt67=2;
                }
                break;
            case 48:
                {
                alt67=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalXtext.g:2894:6: lv_operator_3_1= '+='
                    {
                    lv_operator_3_1=(Token)match(input,40,FollowSets000.FOLLOW_46); 

                    						newLeafNode(lv_operator_3_1, grammarAccess.getAssignmentAccess().getOperatorPlusSignEqualsSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignmentRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalXtext.g:2905:6: lv_operator_3_2= '='
                    {
                    lv_operator_3_2=(Token)match(input,39,FollowSets000.FOLLOW_46); 

                    						newLeafNode(lv_operator_3_2, grammarAccess.getAssignmentAccess().getOperatorEqualsSignKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignmentRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalXtext.g:2916:6: lv_operator_3_3= '?='
                    {
                    lv_operator_3_3=(Token)match(input,48,FollowSets000.FOLLOW_46); 

                    						newLeafNode(lv_operator_3_3, grammarAccess.getAssignmentAccess().getOperatorQuestionMarkEqualsSignKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignmentRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_3_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalXtext.g:2929:3: ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            // InternalXtext.g:2930:4: (lv_terminal_4_0= ruleAssignableTerminal )
            {
            // InternalXtext.g:2930:4: (lv_terminal_4_0= ruleAssignableTerminal )
            // InternalXtext.g:2931:5: lv_terminal_4_0= ruleAssignableTerminal
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getTerminalAssignableTerminalParserRuleCall_3_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_terminal_4_0=ruleAssignableTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"terminal",
            						lv_terminal_4_0,
            						"org.eclipse.xtext.Xtext.AssignableTerminal");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssignableTerminal"
    // InternalXtext.g:2952:1: entryRuleAssignableTerminal returns [EObject current=null] : iv_ruleAssignableTerminal= ruleAssignableTerminal EOF ;
    public final EObject entryRuleAssignableTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignableTerminal = null;


        try {
            // InternalXtext.g:2952:59: (iv_ruleAssignableTerminal= ruleAssignableTerminal EOF )
            // InternalXtext.g:2953:2: iv_ruleAssignableTerminal= ruleAssignableTerminal EOF
            {
             newCompositeNode(grammarAccess.getAssignableTerminalRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssignableTerminal=ruleAssignableTerminal();

            state._fsp--;

             current =iv_ruleAssignableTerminal; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignableTerminal"


    // $ANTLR start "ruleAssignableTerminal"
    // InternalXtext.g:2959:1: ruleAssignableTerminal returns [EObject current=null] : (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference ) ;
    public final EObject ruleAssignableTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_Keyword_0 = null;

        EObject this_RuleCall_1 = null;

        EObject this_ParenthesizedAssignableElement_2 = null;

        EObject this_CrossReference_3 = null;



        	enterRule();

        try {
            // InternalXtext.g:2965:2: ( (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference ) )
            // InternalXtext.g:2966:2: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference )
            {
            // InternalXtext.g:2966:2: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference )
            int alt68=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt68=1;
                }
                break;
            case RULE_ID:
            case 43:
            case 44:
                {
                alt68=2;
                }
                break;
            case 16:
                {
                alt68=3;
                }
                break;
            case 29:
                {
                alt68=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalXtext.g:2967:3: this_Keyword_0= ruleKeyword
                    {

                    			newCompositeNode(grammarAccess.getAssignableTerminalAccess().getKeywordParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Keyword_0=ruleKeyword();

                    state._fsp--;


                    			current = this_Keyword_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtext.g:2976:3: this_RuleCall_1= ruleRuleCall
                    {

                    			newCompositeNode(grammarAccess.getAssignableTerminalAccess().getRuleCallParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RuleCall_1=ruleRuleCall();

                    state._fsp--;


                    			current = this_RuleCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXtext.g:2985:3: this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement
                    {

                    			newCompositeNode(grammarAccess.getAssignableTerminalAccess().getParenthesizedAssignableElementParserRuleCall_2());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParenthesizedAssignableElement_2=ruleParenthesizedAssignableElement();

                    state._fsp--;


                    			current = this_ParenthesizedAssignableElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXtext.g:2994:3: this_CrossReference_3= ruleCrossReference
                    {

                    			newCompositeNode(grammarAccess.getAssignableTerminalAccess().getCrossReferenceParserRuleCall_3());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CrossReference_3=ruleCrossReference();

                    state._fsp--;


                    			current = this_CrossReference_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignableTerminal"


    // $ANTLR start "entryRuleParenthesizedAssignableElement"
    // InternalXtext.g:3006:1: entryRuleParenthesizedAssignableElement returns [EObject current=null] : iv_ruleParenthesizedAssignableElement= ruleParenthesizedAssignableElement EOF ;
    public final EObject entryRuleParenthesizedAssignableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedAssignableElement = null;


        try {
            // InternalXtext.g:3006:71: (iv_ruleParenthesizedAssignableElement= ruleParenthesizedAssignableElement EOF )
            // InternalXtext.g:3007:2: iv_ruleParenthesizedAssignableElement= ruleParenthesizedAssignableElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedAssignableElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParenthesizedAssignableElement=ruleParenthesizedAssignableElement();

            state._fsp--;

             current =iv_ruleParenthesizedAssignableElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedAssignableElement"


    // $ANTLR start "ruleParenthesizedAssignableElement"
    // InternalXtext.g:3013:1: ruleParenthesizedAssignableElement returns [EObject current=null] : (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedAssignableElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AssignableAlternatives_1 = null;



        	enterRule();

        try {
            // InternalXtext.g:3019:2: ( (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' ) )
            // InternalXtext.g:3020:2: (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' )
            {
            // InternalXtext.g:3020:2: (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' )
            // InternalXtext.g:3021:3: otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesizedAssignableElementAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesizedAssignableElementAccess().getAssignableAlternativesParserRuleCall_1());
            		
            pushFollow(FollowSets000.FOLLOW_43);
            this_AssignableAlternatives_1=ruleAssignableAlternatives();

            state._fsp--;


            			current = this_AssignableAlternatives_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesizedAssignableElementAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesizedAssignableElement"


    // $ANTLR start "entryRuleAssignableAlternatives"
    // InternalXtext.g:3041:1: entryRuleAssignableAlternatives returns [EObject current=null] : iv_ruleAssignableAlternatives= ruleAssignableAlternatives EOF ;
    public final EObject entryRuleAssignableAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignableAlternatives = null;


        try {
            // InternalXtext.g:3041:63: (iv_ruleAssignableAlternatives= ruleAssignableAlternatives EOF )
            // InternalXtext.g:3042:2: iv_ruleAssignableAlternatives= ruleAssignableAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAssignableAlternativesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssignableAlternatives=ruleAssignableAlternatives();

            state._fsp--;

             current =iv_ruleAssignableAlternatives; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignableAlternatives"


    // $ANTLR start "ruleAssignableAlternatives"
    // InternalXtext.g:3048:1: ruleAssignableAlternatives returns [EObject current=null] : (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) ;
    public final EObject ruleAssignableAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AssignableTerminal_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:3054:2: ( (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) )
            // InternalXtext.g:3055:2: (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            {
            // InternalXtext.g:3055:2: (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            // InternalXtext.g:3056:3: this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getAssignableAlternativesAccess().getAssignableTerminalParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_31);
            this_AssignableTerminal_0=ruleAssignableTerminal();

            state._fsp--;


            			current = this_AssignableTerminal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtext.g:3064:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==34) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalXtext.g:3065:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    {
                    // InternalXtext.g:3065:4: ()
                    // InternalXtext.g:3066:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getAssignableAlternativesAccess().getAlternativesElementsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalXtext.g:3072:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==34) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalXtext.g:3073:5: otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    {
                    	    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_46); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getAssignableAlternativesAccess().getVerticalLineKeyword_1_1_0());
                    	    				
                    	    // InternalXtext.g:3077:5: ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    // InternalXtext.g:3078:6: (lv_elements_3_0= ruleAssignableTerminal )
                    	    {
                    	    // InternalXtext.g:3078:6: (lv_elements_3_0= ruleAssignableTerminal )
                    	    // InternalXtext.g:3079:7: lv_elements_3_0= ruleAssignableTerminal
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssignableAlternativesAccess().getElementsAssignableTerminalParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_31);
                    	    lv_elements_3_0=ruleAssignableTerminal();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssignableAlternativesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_3_0,
                    	    								"org.eclipse.xtext.Xtext.AssignableTerminal");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt69 >= 1 ) break loop69;
                                EarlyExitException eee =
                                    new EarlyExitException(69, input);
                                throw eee;
                        }
                        cnt69++;
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignableAlternatives"


    // $ANTLR start "entryRuleCrossReference"
    // InternalXtext.g:3102:1: entryRuleCrossReference returns [EObject current=null] : iv_ruleCrossReference= ruleCrossReference EOF ;
    public final EObject entryRuleCrossReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossReference = null;


        try {
            // InternalXtext.g:3102:55: (iv_ruleCrossReference= ruleCrossReference EOF )
            // InternalXtext.g:3103:2: iv_ruleCrossReference= ruleCrossReference EOF
            {
             newCompositeNode(grammarAccess.getCrossReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCrossReference=ruleCrossReference();

            state._fsp--;

             current =iv_ruleCrossReference; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCrossReference"


    // $ANTLR start "ruleCrossReference"
    // InternalXtext.g:3109:1: ruleCrossReference returns [EObject current=null] : (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleCrossReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_terminal_3_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:3115:2: ( (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) )
            // InternalXtext.g:3116:2: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            {
            // InternalXtext.g:3116:2: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            // InternalXtext.g:3117:3: otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getCrossReferenceAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalXtext.g:3121:3: ( (lv_type_1_0= ruleTypeRef ) )
            // InternalXtext.g:3122:4: (lv_type_1_0= ruleTypeRef )
            {
            // InternalXtext.g:3122:4: (lv_type_1_0= ruleTypeRef )
            // InternalXtext.g:3123:5: lv_type_1_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getCrossReferenceAccess().getTypeTypeRefParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_47);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCrossReferenceRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.Xtext.TypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXtext.g:3140:3: (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==34) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalXtext.g:3141:4: otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    {
                    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_48); 

                    				newLeafNode(otherlv_2, grammarAccess.getCrossReferenceAccess().getVerticalLineKeyword_2_0());
                    			
                    // InternalXtext.g:3145:4: ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    // InternalXtext.g:3146:5: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    {
                    // InternalXtext.g:3146:5: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    // InternalXtext.g:3147:6: lv_terminal_3_0= ruleCrossReferenceableTerminal
                    {

                    						newCompositeNode(grammarAccess.getCrossReferenceAccess().getTerminalCrossReferenceableTerminalParserRuleCall_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_terminal_3_0=ruleCrossReferenceableTerminal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCrossReferenceRule());
                    						}
                    						set(
                    							current,
                    							"terminal",
                    							lv_terminal_3_0,
                    							"org.eclipse.xtext.Xtext.CrossReferenceableTerminal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCrossReferenceAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrossReference"


    // $ANTLR start "entryRuleCrossReferenceableTerminal"
    // InternalXtext.g:3173:1: entryRuleCrossReferenceableTerminal returns [EObject current=null] : iv_ruleCrossReferenceableTerminal= ruleCrossReferenceableTerminal EOF ;
    public final EObject entryRuleCrossReferenceableTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossReferenceableTerminal = null;


        try {
            // InternalXtext.g:3173:67: (iv_ruleCrossReferenceableTerminal= ruleCrossReferenceableTerminal EOF )
            // InternalXtext.g:3174:2: iv_ruleCrossReferenceableTerminal= ruleCrossReferenceableTerminal EOF
            {
             newCompositeNode(grammarAccess.getCrossReferenceableTerminalRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCrossReferenceableTerminal=ruleCrossReferenceableTerminal();

            state._fsp--;

             current =iv_ruleCrossReferenceableTerminal; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCrossReferenceableTerminal"


    // $ANTLR start "ruleCrossReferenceableTerminal"
    // InternalXtext.g:3180:1: ruleCrossReferenceableTerminal returns [EObject current=null] : (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall ) ;
    public final EObject ruleCrossReferenceableTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_Keyword_0 = null;

        EObject this_RuleCall_1 = null;



        	enterRule();

        try {
            // InternalXtext.g:3186:2: ( (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall ) )
            // InternalXtext.g:3187:2: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall )
            {
            // InternalXtext.g:3187:2: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_STRING) ) {
                alt72=1;
            }
            else if ( (LA72_0==RULE_ID||(LA72_0>=43 && LA72_0<=44)) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalXtext.g:3188:3: this_Keyword_0= ruleKeyword
                    {

                    			newCompositeNode(grammarAccess.getCrossReferenceableTerminalAccess().getKeywordParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Keyword_0=ruleKeyword();

                    state._fsp--;


                    			current = this_Keyword_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtext.g:3197:3: this_RuleCall_1= ruleRuleCall
                    {

                    			newCompositeNode(grammarAccess.getCrossReferenceableTerminalAccess().getRuleCallParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RuleCall_1=ruleRuleCall();

                    state._fsp--;


                    			current = this_RuleCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrossReferenceableTerminal"


    // $ANTLR start "entryRuleParenthesizedElement"
    // InternalXtext.g:3209:1: entryRuleParenthesizedElement returns [EObject current=null] : iv_ruleParenthesizedElement= ruleParenthesizedElement EOF ;
    public final EObject entryRuleParenthesizedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedElement = null;


        try {
            // InternalXtext.g:3209:61: (iv_ruleParenthesizedElement= ruleParenthesizedElement EOF )
            // InternalXtext.g:3210:2: iv_ruleParenthesizedElement= ruleParenthesizedElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParenthesizedElement=ruleParenthesizedElement();

            state._fsp--;

             current =iv_ruleParenthesizedElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedElement"


    // $ANTLR start "ruleParenthesizedElement"
    // InternalXtext.g:3216:1: ruleParenthesizedElement returns [EObject current=null] : (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Alternatives_1 = null;



        	enterRule();

        try {
            // InternalXtext.g:3222:2: ( (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' ) )
            // InternalXtext.g:3223:2: (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' )
            {
            // InternalXtext.g:3223:2: (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' )
            // InternalXtext.g:3224:3: otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesizedElementAccess().getAlternativesParserRuleCall_1());
            		
            pushFollow(FollowSets000.FOLLOW_43);
            this_Alternatives_1=ruleAlternatives();

            state._fsp--;


            			current = this_Alternatives_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesizedElement"


    // $ANTLR start "entryRulePredicatedGroup"
    // InternalXtext.g:3244:1: entryRulePredicatedGroup returns [EObject current=null] : iv_rulePredicatedGroup= rulePredicatedGroup EOF ;
    public final EObject entryRulePredicatedGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicatedGroup = null;


        try {
            // InternalXtext.g:3244:56: (iv_rulePredicatedGroup= rulePredicatedGroup EOF )
            // InternalXtext.g:3245:2: iv_rulePredicatedGroup= rulePredicatedGroup EOF
            {
             newCompositeNode(grammarAccess.getPredicatedGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePredicatedGroup=rulePredicatedGroup();

            state._fsp--;

             current =iv_rulePredicatedGroup; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicatedGroup"


    // $ANTLR start "rulePredicatedGroup"
    // InternalXtext.g:3251:1: rulePredicatedGroup returns [EObject current=null] : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) ;
    public final EObject rulePredicatedGroup() throws RecognitionException {
        EObject current = null;

        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:3257:2: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) )
            // InternalXtext.g:3258:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            {
            // InternalXtext.g:3258:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            // InternalXtext.g:3259:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')'
            {
            // InternalXtext.g:3259:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==46) ) {
                alt73=1;
            }
            else if ( (LA73_0==47) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalXtext.g:3260:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // InternalXtext.g:3260:4: ( (lv_predicated_0_0= '=>' ) )
                    // InternalXtext.g:3261:5: (lv_predicated_0_0= '=>' )
                    {
                    // InternalXtext.g:3261:5: (lv_predicated_0_0= '=>' )
                    // InternalXtext.g:3262:6: lv_predicated_0_0= '=>'
                    {
                    lv_predicated_0_0=(Token)match(input,46,FollowSets000.FOLLOW_6); 

                    						newLeafNode(lv_predicated_0_0, grammarAccess.getPredicatedGroupAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredicatedGroupRule());
                    						}
                    						setWithLastConsumed(current, "predicated", lv_predicated_0_0 != null, "=>");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:3275:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // InternalXtext.g:3275:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // InternalXtext.g:3276:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // InternalXtext.g:3276:5: (lv_firstSetPredicated_1_0= '->' )
                    // InternalXtext.g:3277:6: lv_firstSetPredicated_1_0= '->'
                    {
                    lv_firstSetPredicated_1_0=(Token)match(input,47,FollowSets000.FOLLOW_6); 

                    						newLeafNode(lv_firstSetPredicated_1_0, grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredicatedGroupRule());
                    						}
                    						setWithLastConsumed(current, "firstSetPredicated", lv_firstSetPredicated_1_0 != null, "->");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getPredicatedGroupAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXtext.g:3294:3: ( (lv_elements_3_0= ruleAlternatives ) )
            // InternalXtext.g:3295:4: (lv_elements_3_0= ruleAlternatives )
            {
            // InternalXtext.g:3295:4: (lv_elements_3_0= ruleAlternatives )
            // InternalXtext.g:3296:5: lv_elements_3_0= ruleAlternatives
            {

            					newCompositeNode(grammarAccess.getPredicatedGroupAccess().getElementsAlternativesParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_43);
            lv_elements_3_0=ruleAlternatives();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicatedGroupRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"org.eclipse.xtext.Xtext.Alternatives");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPredicatedGroupAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicatedGroup"


    // $ANTLR start "entryRuleTerminalRule"
    // InternalXtext.g:3321:1: entryRuleTerminalRule returns [EObject current=null] : iv_ruleTerminalRule= ruleTerminalRule EOF ;
    public final EObject entryRuleTerminalRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalRule = null;


        try {
            // InternalXtext.g:3321:53: (iv_ruleTerminalRule= ruleTerminalRule EOF )
            // InternalXtext.g:3322:2: iv_ruleTerminalRule= ruleTerminalRule EOF
            {
             newCompositeNode(grammarAccess.getTerminalRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTerminalRule=ruleTerminalRule();

            state._fsp--;

             current =iv_ruleTerminalRule; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalRule"


    // $ANTLR start "ruleTerminalRule"
    // InternalXtext.g:3328:1: ruleTerminalRule returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'terminal' ( ( ( (lv_fragment_2_0= 'fragment' ) ) ( (lv_name_3_0= ruleValidID ) ) ) | ( ( (lv_name_4_0= ruleValidID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) otherlv_7= ':' ( (lv_alternatives_8_0= ruleTerminalAlternatives ) ) otherlv_9= ';' ) ;
    public final EObject ruleTerminalRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_fragment_2_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_type_6_0 = null;

        EObject lv_alternatives_8_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:3334:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'terminal' ( ( ( (lv_fragment_2_0= 'fragment' ) ) ( (lv_name_3_0= ruleValidID ) ) ) | ( ( (lv_name_4_0= ruleValidID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) otherlv_7= ':' ( (lv_alternatives_8_0= ruleTerminalAlternatives ) ) otherlv_9= ';' ) )
            // InternalXtext.g:3335:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'terminal' ( ( ( (lv_fragment_2_0= 'fragment' ) ) ( (lv_name_3_0= ruleValidID ) ) ) | ( ( (lv_name_4_0= ruleValidID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) otherlv_7= ':' ( (lv_alternatives_8_0= ruleTerminalAlternatives ) ) otherlv_9= ';' )
            {
            // InternalXtext.g:3335:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'terminal' ( ( ( (lv_fragment_2_0= 'fragment' ) ) ( (lv_name_3_0= ruleValidID ) ) ) | ( ( (lv_name_4_0= ruleValidID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) otherlv_7= ':' ( (lv_alternatives_8_0= ruleTerminalAlternatives ) ) otherlv_9= ';' )
            // InternalXtext.g:3336:3: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'terminal' ( ( ( (lv_fragment_2_0= 'fragment' ) ) ( (lv_name_3_0= ruleValidID ) ) ) | ( ( (lv_name_4_0= ruleValidID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) otherlv_7= ':' ( (lv_alternatives_8_0= ruleTerminalAlternatives ) ) otherlv_9= ';'
            {
            // InternalXtext.g:3336:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==22) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalXtext.g:3337:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalXtext.g:3337:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalXtext.g:3338:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getTerminalRuleAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_49);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTerminalRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_0_0,
            	    						"org.eclipse.xtext.Xtext.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getTerminalRuleAccess().getTerminalKeyword_1());
            		
            // InternalXtext.g:3359:3: ( ( ( (lv_fragment_2_0= 'fragment' ) ) ( (lv_name_3_0= ruleValidID ) ) ) | ( ( (lv_name_4_0= ruleValidID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==23) ) {
                alt76=1;
            }
            else if ( (LA76_0==RULE_ID||(LA76_0>=43 && LA76_0<=44)) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalXtext.g:3360:4: ( ( (lv_fragment_2_0= 'fragment' ) ) ( (lv_name_3_0= ruleValidID ) ) )
                    {
                    // InternalXtext.g:3360:4: ( ( (lv_fragment_2_0= 'fragment' ) ) ( (lv_name_3_0= ruleValidID ) ) )
                    // InternalXtext.g:3361:5: ( (lv_fragment_2_0= 'fragment' ) ) ( (lv_name_3_0= ruleValidID ) )
                    {
                    // InternalXtext.g:3361:5: ( (lv_fragment_2_0= 'fragment' ) )
                    // InternalXtext.g:3362:6: (lv_fragment_2_0= 'fragment' )
                    {
                    // InternalXtext.g:3362:6: (lv_fragment_2_0= 'fragment' )
                    // InternalXtext.g:3363:7: lv_fragment_2_0= 'fragment'
                    {
                    lv_fragment_2_0=(Token)match(input,23,FollowSets000.FOLLOW_3); 

                    							newLeafNode(lv_fragment_2_0, grammarAccess.getTerminalRuleAccess().getFragmentFragmentKeyword_2_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTerminalRuleRule());
                    							}
                    							setWithLastConsumed(current, "fragment", lv_fragment_2_0 != null, "fragment");
                    						

                    }


                    }

                    // InternalXtext.g:3375:5: ( (lv_name_3_0= ruleValidID ) )
                    // InternalXtext.g:3376:6: (lv_name_3_0= ruleValidID )
                    {
                    // InternalXtext.g:3376:6: (lv_name_3_0= ruleValidID )
                    // InternalXtext.g:3377:7: lv_name_3_0= ruleValidID
                    {

                    							newCompositeNode(grammarAccess.getTerminalRuleAccess().getNameValidIDParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FollowSets000.FOLLOW_20);
                    lv_name_3_0=ruleValidID();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTerminalRuleRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.eclipse.xtext.Xtext.ValidID");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:3396:4: ( ( (lv_name_4_0= ruleValidID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? )
                    {
                    // InternalXtext.g:3396:4: ( ( (lv_name_4_0= ruleValidID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? )
                    // InternalXtext.g:3397:5: ( (lv_name_4_0= ruleValidID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )?
                    {
                    // InternalXtext.g:3397:5: ( (lv_name_4_0= ruleValidID ) )
                    // InternalXtext.g:3398:6: (lv_name_4_0= ruleValidID )
                    {
                    // InternalXtext.g:3398:6: (lv_name_4_0= ruleValidID )
                    // InternalXtext.g:3399:7: lv_name_4_0= ruleValidID
                    {

                    							newCompositeNode(grammarAccess.getTerminalRuleAccess().getNameValidIDParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FollowSets000.FOLLOW_51);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTerminalRuleRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.eclipse.xtext.Xtext.ValidID");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalXtext.g:3416:5: (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==25) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalXtext.g:3417:6: otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) )
                            {
                            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_13); 

                            						newLeafNode(otherlv_5, grammarAccess.getTerminalRuleAccess().getReturnsKeyword_2_1_1_0());
                            					
                            // InternalXtext.g:3421:6: ( (lv_type_6_0= ruleTypeRef ) )
                            // InternalXtext.g:3422:7: (lv_type_6_0= ruleTypeRef )
                            {
                            // InternalXtext.g:3422:7: (lv_type_6_0= ruleTypeRef )
                            // InternalXtext.g:3423:8: lv_type_6_0= ruleTypeRef
                            {

                            								newCompositeNode(grammarAccess.getTerminalRuleAccess().getTypeTypeRefParserRuleCall_2_1_1_1_0());
                            							
                            pushFollow(FollowSets000.FOLLOW_20);
                            lv_type_6_0=ruleTypeRef();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTerminalRuleRule());
                            								}
                            								set(
                            									current,
                            									"type",
                            									lv_type_6_0,
                            									"org.eclipse.xtext.Xtext.TypeRef");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_52); 

            			newLeafNode(otherlv_7, grammarAccess.getTerminalRuleAccess().getColonKeyword_3());
            		
            // InternalXtext.g:3447:3: ( (lv_alternatives_8_0= ruleTerminalAlternatives ) )
            // InternalXtext.g:3448:4: (lv_alternatives_8_0= ruleTerminalAlternatives )
            {
            // InternalXtext.g:3448:4: (lv_alternatives_8_0= ruleTerminalAlternatives )
            // InternalXtext.g:3449:5: lv_alternatives_8_0= ruleTerminalAlternatives
            {

            					newCompositeNode(grammarAccess.getTerminalRuleAccess().getAlternativesTerminalAlternativesParserRuleCall_4_0());
            				
            pushFollow(FollowSets000.FOLLOW_22);
            lv_alternatives_8_0=ruleTerminalAlternatives();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerminalRuleRule());
            					}
            					set(
            						current,
            						"alternatives",
            						lv_alternatives_8_0,
            						"org.eclipse.xtext.Xtext.TerminalAlternatives");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTerminalRuleAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalRule"


    // $ANTLR start "entryRuleTerminalAlternatives"
    // InternalXtext.g:3474:1: entryRuleTerminalAlternatives returns [EObject current=null] : iv_ruleTerminalAlternatives= ruleTerminalAlternatives EOF ;
    public final EObject entryRuleTerminalAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalAlternatives = null;


        try {
            // InternalXtext.g:3474:61: (iv_ruleTerminalAlternatives= ruleTerminalAlternatives EOF )
            // InternalXtext.g:3475:2: iv_ruleTerminalAlternatives= ruleTerminalAlternatives EOF
            {
             newCompositeNode(grammarAccess.getTerminalAlternativesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTerminalAlternatives=ruleTerminalAlternatives();

            state._fsp--;

             current =iv_ruleTerminalAlternatives; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalAlternatives"


    // $ANTLR start "ruleTerminalAlternatives"
    // InternalXtext.g:3481:1: ruleTerminalAlternatives returns [EObject current=null] : (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) ;
    public final EObject ruleTerminalAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TerminalGroup_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:3487:2: ( (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) )
            // InternalXtext.g:3488:2: (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            {
            // InternalXtext.g:3488:2: (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            // InternalXtext.g:3489:3: this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getTerminalAlternativesAccess().getTerminalGroupParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_31);
            this_TerminalGroup_0=ruleTerminalGroup();

            state._fsp--;


            			current = this_TerminalGroup_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtext.g:3497:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==34) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalXtext.g:3498:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    {
                    // InternalXtext.g:3498:4: ()
                    // InternalXtext.g:3499:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getTerminalAlternativesAccess().getAlternativesElementsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalXtext.g:3505:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==34) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalXtext.g:3506:5: otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    {
                    	    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_52); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getTerminalAlternativesAccess().getVerticalLineKeyword_1_1_0());
                    	    				
                    	    // InternalXtext.g:3510:5: ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    // InternalXtext.g:3511:6: (lv_elements_3_0= ruleTerminalGroup )
                    	    {
                    	    // InternalXtext.g:3511:6: (lv_elements_3_0= ruleTerminalGroup )
                    	    // InternalXtext.g:3512:7: lv_elements_3_0= ruleTerminalGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getTerminalAlternativesAccess().getElementsTerminalGroupParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_31);
                    	    lv_elements_3_0=ruleTerminalGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTerminalAlternativesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_3_0,
                    	    								"org.eclipse.xtext.Xtext.TerminalGroup");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt77 >= 1 ) break loop77;
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalAlternatives"


    // $ANTLR start "entryRuleTerminalGroup"
    // InternalXtext.g:3535:1: entryRuleTerminalGroup returns [EObject current=null] : iv_ruleTerminalGroup= ruleTerminalGroup EOF ;
    public final EObject entryRuleTerminalGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalGroup = null;


        try {
            // InternalXtext.g:3535:54: (iv_ruleTerminalGroup= ruleTerminalGroup EOF )
            // InternalXtext.g:3536:2: iv_ruleTerminalGroup= ruleTerminalGroup EOF
            {
             newCompositeNode(grammarAccess.getTerminalGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTerminalGroup=ruleTerminalGroup();

            state._fsp--;

             current =iv_ruleTerminalGroup; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalGroup"


    // $ANTLR start "ruleTerminalGroup"
    // InternalXtext.g:3542:1: ruleTerminalGroup returns [EObject current=null] : (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) ;
    public final EObject ruleTerminalGroup() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalToken_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:3548:2: ( (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) )
            // InternalXtext.g:3549:2: (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            {
            // InternalXtext.g:3549:2: (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            // InternalXtext.g:3550:3: this_TerminalToken_0= ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            {

            			newCompositeNode(grammarAccess.getTerminalGroupAccess().getTerminalTokenParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_53);
            this_TerminalToken_0=ruleTerminalToken();

            state._fsp--;


            			current = this_TerminalToken_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtext.g:3558:3: ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=RULE_STRING && LA80_0<=RULE_ID)||LA80_0==16||LA80_0==18||(LA80_0>=43 && LA80_0<=45)||LA80_0==47||LA80_0==50) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalXtext.g:3559:4: () ( (lv_elements_2_0= ruleTerminalToken ) )+
                    {
                    // InternalXtext.g:3559:4: ()
                    // InternalXtext.g:3560:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getTerminalGroupAccess().getGroupElementsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalXtext.g:3566:4: ( (lv_elements_2_0= ruleTerminalToken ) )+
                    int cnt79=0;
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( ((LA79_0>=RULE_STRING && LA79_0<=RULE_ID)||LA79_0==16||LA79_0==18||(LA79_0>=43 && LA79_0<=45)||LA79_0==47||LA79_0==50) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalXtext.g:3567:5: (lv_elements_2_0= ruleTerminalToken )
                    	    {
                    	    // InternalXtext.g:3567:5: (lv_elements_2_0= ruleTerminalToken )
                    	    // InternalXtext.g:3568:6: lv_elements_2_0= ruleTerminalToken
                    	    {

                    	    						newCompositeNode(grammarAccess.getTerminalGroupAccess().getElementsTerminalTokenParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_53);
                    	    lv_elements_2_0=ruleTerminalToken();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTerminalGroupRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elements",
                    	    							lv_elements_2_0,
                    	    							"org.eclipse.xtext.Xtext.TerminalToken");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt79 >= 1 ) break loop79;
                                EarlyExitException eee =
                                    new EarlyExitException(79, input);
                                throw eee;
                        }
                        cnt79++;
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalGroup"


    // $ANTLR start "entryRuleTerminalToken"
    // InternalXtext.g:3590:1: entryRuleTerminalToken returns [EObject current=null] : iv_ruleTerminalToken= ruleTerminalToken EOF ;
    public final EObject entryRuleTerminalToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalToken = null;


        try {
            // InternalXtext.g:3590:54: (iv_ruleTerminalToken= ruleTerminalToken EOF )
            // InternalXtext.g:3591:2: iv_ruleTerminalToken= ruleTerminalToken EOF
            {
             newCompositeNode(grammarAccess.getTerminalTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTerminalToken=ruleTerminalToken();

            state._fsp--;

             current =iv_ruleTerminalToken; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalToken"


    // $ANTLR start "ruleTerminalToken"
    // InternalXtext.g:3597:1: ruleTerminalToken returns [EObject current=null] : (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) ;
    public final EObject ruleTerminalToken() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_1_1=null;
        Token lv_cardinality_1_2=null;
        Token lv_cardinality_1_3=null;
        EObject this_TerminalTokenElement_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:3603:2: ( (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) )
            // InternalXtext.g:3604:2: (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            {
            // InternalXtext.g:3604:2: (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            // InternalXtext.g:3605:3: this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            {

            			newCompositeNode(grammarAccess.getTerminalTokenAccess().getTerminalTokenElementParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_37);
            this_TerminalTokenElement_0=ruleTerminalTokenElement();

            state._fsp--;


            			current = this_TerminalTokenElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtext.g:3613:3: ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==24||(LA82_0>=36 && LA82_0<=37)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalXtext.g:3614:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    {
                    // InternalXtext.g:3614:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    // InternalXtext.g:3615:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    {
                    // InternalXtext.g:3615:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    int alt81=3;
                    switch ( input.LA(1) ) {
                    case 36:
                        {
                        alt81=1;
                        }
                        break;
                    case 24:
                        {
                        alt81=2;
                        }
                        break;
                    case 37:
                        {
                        alt81=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }

                    switch (alt81) {
                        case 1 :
                            // InternalXtext.g:3616:6: lv_cardinality_1_1= '?'
                            {
                            lv_cardinality_1_1=(Token)match(input,36,FollowSets000.FOLLOW_2); 

                            						newLeafNode(lv_cardinality_1_1, grammarAccess.getTerminalTokenAccess().getCardinalityQuestionMarkKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTerminalTokenRule());
                            						}
                            						setWithLastConsumed(current, "cardinality", lv_cardinality_1_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalXtext.g:3627:6: lv_cardinality_1_2= '*'
                            {
                            lv_cardinality_1_2=(Token)match(input,24,FollowSets000.FOLLOW_2); 

                            						newLeafNode(lv_cardinality_1_2, grammarAccess.getTerminalTokenAccess().getCardinalityAsteriskKeyword_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTerminalTokenRule());
                            						}
                            						setWithLastConsumed(current, "cardinality", lv_cardinality_1_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalXtext.g:3638:6: lv_cardinality_1_3= '+'
                            {
                            lv_cardinality_1_3=(Token)match(input,37,FollowSets000.FOLLOW_2); 

                            						newLeafNode(lv_cardinality_1_3, grammarAccess.getTerminalTokenAccess().getCardinalityPlusSignKeyword_1_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTerminalTokenRule());
                            						}
                            						setWithLastConsumed(current, "cardinality", lv_cardinality_1_3, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalToken"


    // $ANTLR start "entryRuleTerminalTokenElement"
    // InternalXtext.g:3655:1: entryRuleTerminalTokenElement returns [EObject current=null] : iv_ruleTerminalTokenElement= ruleTerminalTokenElement EOF ;
    public final EObject entryRuleTerminalTokenElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalTokenElement = null;


        try {
            // InternalXtext.g:3655:61: (iv_ruleTerminalTokenElement= ruleTerminalTokenElement EOF )
            // InternalXtext.g:3656:2: iv_ruleTerminalTokenElement= ruleTerminalTokenElement EOF
            {
             newCompositeNode(grammarAccess.getTerminalTokenElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTerminalTokenElement=ruleTerminalTokenElement();

            state._fsp--;

             current =iv_ruleTerminalTokenElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalTokenElement"


    // $ANTLR start "ruleTerminalTokenElement"
    // InternalXtext.g:3662:1: ruleTerminalTokenElement returns [EObject current=null] : (this_CharacterRange_0= ruleCharacterRange | this_TerminalRuleCall_1= ruleTerminalRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard | this_EOF_5= ruleEOF ) ;
    public final EObject ruleTerminalTokenElement() throws RecognitionException {
        EObject current = null;

        EObject this_CharacterRange_0 = null;

        EObject this_TerminalRuleCall_1 = null;

        EObject this_ParenthesizedTerminalElement_2 = null;

        EObject this_AbstractNegatedToken_3 = null;

        EObject this_Wildcard_4 = null;

        EObject this_EOF_5 = null;



        	enterRule();

        try {
            // InternalXtext.g:3668:2: ( (this_CharacterRange_0= ruleCharacterRange | this_TerminalRuleCall_1= ruleTerminalRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard | this_EOF_5= ruleEOF ) )
            // InternalXtext.g:3669:2: (this_CharacterRange_0= ruleCharacterRange | this_TerminalRuleCall_1= ruleTerminalRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard | this_EOF_5= ruleEOF )
            {
            // InternalXtext.g:3669:2: (this_CharacterRange_0= ruleCharacterRange | this_TerminalRuleCall_1= ruleTerminalRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard | this_EOF_5= ruleEOF )
            int alt83=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt83=1;
                }
                break;
            case RULE_ID:
            case 43:
            case 44:
                {
                alt83=2;
                }
                break;
            case 16:
                {
                alt83=3;
                }
                break;
            case 45:
            case 47:
                {
                alt83=4;
                }
                break;
            case 18:
                {
                alt83=5;
                }
                break;
            case 50:
                {
                alt83=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalXtext.g:3670:3: this_CharacterRange_0= ruleCharacterRange
                    {

                    			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getCharacterRangeParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CharacterRange_0=ruleCharacterRange();

                    state._fsp--;


                    			current = this_CharacterRange_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtext.g:3679:3: this_TerminalRuleCall_1= ruleTerminalRuleCall
                    {

                    			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getTerminalRuleCallParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TerminalRuleCall_1=ruleTerminalRuleCall();

                    state._fsp--;


                    			current = this_TerminalRuleCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXtext.g:3688:3: this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement
                    {

                    			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getParenthesizedTerminalElementParserRuleCall_2());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParenthesizedTerminalElement_2=ruleParenthesizedTerminalElement();

                    state._fsp--;


                    			current = this_ParenthesizedTerminalElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXtext.g:3697:3: this_AbstractNegatedToken_3= ruleAbstractNegatedToken
                    {

                    			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getAbstractNegatedTokenParserRuleCall_3());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AbstractNegatedToken_3=ruleAbstractNegatedToken();

                    state._fsp--;


                    			current = this_AbstractNegatedToken_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXtext.g:3706:3: this_Wildcard_4= ruleWildcard
                    {

                    			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getWildcardParserRuleCall_4());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Wildcard_4=ruleWildcard();

                    state._fsp--;


                    			current = this_Wildcard_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXtext.g:3715:3: this_EOF_5= ruleEOF
                    {

                    			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getEOFParserRuleCall_5());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EOF_5=ruleEOF();

                    state._fsp--;


                    			current = this_EOF_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalTokenElement"


    // $ANTLR start "entryRuleParenthesizedTerminalElement"
    // InternalXtext.g:3727:1: entryRuleParenthesizedTerminalElement returns [EObject current=null] : iv_ruleParenthesizedTerminalElement= ruleParenthesizedTerminalElement EOF ;
    public final EObject entryRuleParenthesizedTerminalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedTerminalElement = null;


        try {
            // InternalXtext.g:3727:69: (iv_ruleParenthesizedTerminalElement= ruleParenthesizedTerminalElement EOF )
            // InternalXtext.g:3728:2: iv_ruleParenthesizedTerminalElement= ruleParenthesizedTerminalElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedTerminalElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParenthesizedTerminalElement=ruleParenthesizedTerminalElement();

            state._fsp--;

             current =iv_ruleParenthesizedTerminalElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedTerminalElement"


    // $ANTLR start "ruleParenthesizedTerminalElement"
    // InternalXtext.g:3734:1: ruleParenthesizedTerminalElement returns [EObject current=null] : (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedTerminalElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_TerminalAlternatives_1 = null;



        	enterRule();

        try {
            // InternalXtext.g:3740:2: ( (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' ) )
            // InternalXtext.g:3741:2: (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' )
            {
            // InternalXtext.g:3741:2: (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' )
            // InternalXtext.g:3742:3: otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesizedTerminalElementAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesizedTerminalElementAccess().getTerminalAlternativesParserRuleCall_1());
            		
            pushFollow(FollowSets000.FOLLOW_43);
            this_TerminalAlternatives_1=ruleTerminalAlternatives();

            state._fsp--;


            			current = this_TerminalAlternatives_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesizedTerminalElementAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesizedTerminalElement"


    // $ANTLR start "entryRuleAbstractNegatedToken"
    // InternalXtext.g:3762:1: entryRuleAbstractNegatedToken returns [EObject current=null] : iv_ruleAbstractNegatedToken= ruleAbstractNegatedToken EOF ;
    public final EObject entryRuleAbstractNegatedToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNegatedToken = null;


        try {
            // InternalXtext.g:3762:61: (iv_ruleAbstractNegatedToken= ruleAbstractNegatedToken EOF )
            // InternalXtext.g:3763:2: iv_ruleAbstractNegatedToken= ruleAbstractNegatedToken EOF
            {
             newCompositeNode(grammarAccess.getAbstractNegatedTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractNegatedToken=ruleAbstractNegatedToken();

            state._fsp--;

             current =iv_ruleAbstractNegatedToken; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractNegatedToken"


    // $ANTLR start "ruleAbstractNegatedToken"
    // InternalXtext.g:3769:1: ruleAbstractNegatedToken returns [EObject current=null] : (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken ) ;
    public final EObject ruleAbstractNegatedToken() throws RecognitionException {
        EObject current = null;

        EObject this_NegatedToken_0 = null;

        EObject this_UntilToken_1 = null;



        	enterRule();

        try {
            // InternalXtext.g:3775:2: ( (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken ) )
            // InternalXtext.g:3776:2: (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken )
            {
            // InternalXtext.g:3776:2: (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==45) ) {
                alt84=1;
            }
            else if ( (LA84_0==47) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalXtext.g:3777:3: this_NegatedToken_0= ruleNegatedToken
                    {

                    			newCompositeNode(grammarAccess.getAbstractNegatedTokenAccess().getNegatedTokenParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NegatedToken_0=ruleNegatedToken();

                    state._fsp--;


                    			current = this_NegatedToken_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXtext.g:3786:3: this_UntilToken_1= ruleUntilToken
                    {

                    			newCompositeNode(grammarAccess.getAbstractNegatedTokenAccess().getUntilTokenParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UntilToken_1=ruleUntilToken();

                    state._fsp--;


                    			current = this_UntilToken_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractNegatedToken"


    // $ANTLR start "entryRuleNegatedToken"
    // InternalXtext.g:3798:1: entryRuleNegatedToken returns [EObject current=null] : iv_ruleNegatedToken= ruleNegatedToken EOF ;
    public final EObject entryRuleNegatedToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegatedToken = null;


        try {
            // InternalXtext.g:3798:53: (iv_ruleNegatedToken= ruleNegatedToken EOF )
            // InternalXtext.g:3799:2: iv_ruleNegatedToken= ruleNegatedToken EOF
            {
             newCompositeNode(grammarAccess.getNegatedTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNegatedToken=ruleNegatedToken();

            state._fsp--;

             current =iv_ruleNegatedToken; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegatedToken"


    // $ANTLR start "ruleNegatedToken"
    // InternalXtext.g:3805:1: ruleNegatedToken returns [EObject current=null] : (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final EObject ruleNegatedToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_terminal_1_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:3811:2: ( (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // InternalXtext.g:3812:2: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // InternalXtext.g:3812:2: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // InternalXtext.g:3813:3: otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getNegatedTokenAccess().getExclamationMarkKeyword_0());
            		
            // InternalXtext.g:3817:3: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // InternalXtext.g:3818:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // InternalXtext.g:3818:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            // InternalXtext.g:3819:5: lv_terminal_1_0= ruleTerminalTokenElement
            {

            					newCompositeNode(grammarAccess.getNegatedTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_terminal_1_0=ruleTerminalTokenElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegatedTokenRule());
            					}
            					set(
            						current,
            						"terminal",
            						lv_terminal_1_0,
            						"org.eclipse.xtext.Xtext.TerminalTokenElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegatedToken"


    // $ANTLR start "entryRuleUntilToken"
    // InternalXtext.g:3840:1: entryRuleUntilToken returns [EObject current=null] : iv_ruleUntilToken= ruleUntilToken EOF ;
    public final EObject entryRuleUntilToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntilToken = null;


        try {
            // InternalXtext.g:3840:51: (iv_ruleUntilToken= ruleUntilToken EOF )
            // InternalXtext.g:3841:2: iv_ruleUntilToken= ruleUntilToken EOF
            {
             newCompositeNode(grammarAccess.getUntilTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUntilToken=ruleUntilToken();

            state._fsp--;

             current =iv_ruleUntilToken; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUntilToken"


    // $ANTLR start "ruleUntilToken"
    // InternalXtext.g:3847:1: ruleUntilToken returns [EObject current=null] : (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final EObject ruleUntilToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_terminal_1_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:3853:2: ( (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // InternalXtext.g:3854:2: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // InternalXtext.g:3854:2: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // InternalXtext.g:3855:3: otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getUntilTokenAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalXtext.g:3859:3: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // InternalXtext.g:3860:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // InternalXtext.g:3860:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            // InternalXtext.g:3861:5: lv_terminal_1_0= ruleTerminalTokenElement
            {

            					newCompositeNode(grammarAccess.getUntilTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_terminal_1_0=ruleTerminalTokenElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUntilTokenRule());
            					}
            					set(
            						current,
            						"terminal",
            						lv_terminal_1_0,
            						"org.eclipse.xtext.Xtext.TerminalTokenElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUntilToken"


    // $ANTLR start "entryRuleWildcard"
    // InternalXtext.g:3882:1: entryRuleWildcard returns [EObject current=null] : iv_ruleWildcard= ruleWildcard EOF ;
    public final EObject entryRuleWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcard = null;


        try {
            // InternalXtext.g:3882:49: (iv_ruleWildcard= ruleWildcard EOF )
            // InternalXtext.g:3883:2: iv_ruleWildcard= ruleWildcard EOF
            {
             newCompositeNode(grammarAccess.getWildcardRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWildcard=ruleWildcard();

            state._fsp--;

             current =iv_ruleWildcard; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // InternalXtext.g:3889:1: ruleWildcard returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject ruleWildcard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalXtext.g:3895:2: ( ( () otherlv_1= '.' ) )
            // InternalXtext.g:3896:2: ( () otherlv_1= '.' )
            {
            // InternalXtext.g:3896:2: ( () otherlv_1= '.' )
            // InternalXtext.g:3897:3: () otherlv_1= '.'
            {
            // InternalXtext.g:3897:3: ()
            // InternalXtext.g:3898:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWildcardAccess().getWildcardAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getWildcardAccess().getFullStopKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleEOF"
    // InternalXtext.g:3912:1: entryRuleEOF returns [EObject current=null] : iv_ruleEOF= ruleEOF EOF ;
    public final EObject entryRuleEOF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOF = null;


        try {
            // InternalXtext.g:3912:44: (iv_ruleEOF= ruleEOF EOF )
            // InternalXtext.g:3913:2: iv_ruleEOF= ruleEOF EOF
            {
             newCompositeNode(grammarAccess.getEOFRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEOF=ruleEOF();

            state._fsp--;

             current =iv_ruleEOF; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOF"


    // $ANTLR start "ruleEOF"
    // InternalXtext.g:3919:1: ruleEOF returns [EObject current=null] : ( () otherlv_1= 'EOF' ) ;
    public final EObject ruleEOF() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalXtext.g:3925:2: ( ( () otherlv_1= 'EOF' ) )
            // InternalXtext.g:3926:2: ( () otherlv_1= 'EOF' )
            {
            // InternalXtext.g:3926:2: ( () otherlv_1= 'EOF' )
            // InternalXtext.g:3927:3: () otherlv_1= 'EOF'
            {
            // InternalXtext.g:3927:3: ()
            // InternalXtext.g:3928:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOFAccess().getEOFAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEOFAccess().getEOFKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOF"


    // $ANTLR start "entryRuleCharacterRange"
    // InternalXtext.g:3942:1: entryRuleCharacterRange returns [EObject current=null] : iv_ruleCharacterRange= ruleCharacterRange EOF ;
    public final EObject entryRuleCharacterRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterRange = null;


        try {
            // InternalXtext.g:3942:55: (iv_ruleCharacterRange= ruleCharacterRange EOF )
            // InternalXtext.g:3943:2: iv_ruleCharacterRange= ruleCharacterRange EOF
            {
             newCompositeNode(grammarAccess.getCharacterRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCharacterRange=ruleCharacterRange();

            state._fsp--;

             current =iv_ruleCharacterRange; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharacterRange"


    // $ANTLR start "ruleCharacterRange"
    // InternalXtext.g:3949:1: ruleCharacterRange returns [EObject current=null] : (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) ;
    public final EObject ruleCharacterRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Keyword_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:3955:2: ( (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) )
            // InternalXtext.g:3956:2: (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            {
            // InternalXtext.g:3956:2: (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            // InternalXtext.g:3957:3: this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            {

            			newCompositeNode(grammarAccess.getCharacterRangeAccess().getKeywordParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_54);
            this_Keyword_0=ruleKeyword();

            state._fsp--;


            			current = this_Keyword_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtext.g:3965:3: ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==51) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalXtext.g:3966:4: () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) )
                    {
                    // InternalXtext.g:3966:4: ()
                    // InternalXtext.g:3967:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getCharacterRangeAccess().getCharacterRangeLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,51,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getCharacterRangeAccess().getFullStopFullStopKeyword_1_1());
                    			
                    // InternalXtext.g:3977:4: ( (lv_right_3_0= ruleKeyword ) )
                    // InternalXtext.g:3978:5: (lv_right_3_0= ruleKeyword )
                    {
                    // InternalXtext.g:3978:5: (lv_right_3_0= ruleKeyword )
                    // InternalXtext.g:3979:6: lv_right_3_0= ruleKeyword
                    {

                    						newCompositeNode(grammarAccess.getCharacterRangeAccess().getRightKeywordParserRuleCall_1_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_3_0=ruleKeyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCharacterRangeRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.eclipse.xtext.Xtext.Keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharacterRange"


    // $ANTLR start "entryRuleEnumRule"
    // InternalXtext.g:4001:1: entryRuleEnumRule returns [EObject current=null] : iv_ruleEnumRule= ruleEnumRule EOF ;
    public final EObject entryRuleEnumRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumRule = null;


        try {
            // InternalXtext.g:4001:49: (iv_ruleEnumRule= ruleEnumRule EOF )
            // InternalXtext.g:4002:2: iv_ruleEnumRule= ruleEnumRule EOF
            {
             newCompositeNode(grammarAccess.getEnumRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnumRule=ruleEnumRule();

            state._fsp--;

             current =iv_ruleEnumRule; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumRule"


    // $ANTLR start "ruleEnumRule"
    // InternalXtext.g:4008:1: ruleEnumRule returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'enum' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? otherlv_5= ':' ( (lv_alternatives_6_0= ruleEnumLiterals ) ) otherlv_7= ';' ) ;
    public final EObject ruleEnumRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_alternatives_6_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:4014:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'enum' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? otherlv_5= ':' ( (lv_alternatives_6_0= ruleEnumLiterals ) ) otherlv_7= ';' ) )
            // InternalXtext.g:4015:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'enum' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? otherlv_5= ':' ( (lv_alternatives_6_0= ruleEnumLiterals ) ) otherlv_7= ';' )
            {
            // InternalXtext.g:4015:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'enum' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? otherlv_5= ':' ( (lv_alternatives_6_0= ruleEnumLiterals ) ) otherlv_7= ';' )
            // InternalXtext.g:4016:3: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'enum' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? otherlv_5= ':' ( (lv_alternatives_6_0= ruleEnumLiterals ) ) otherlv_7= ';'
            {
            // InternalXtext.g:4016:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==22) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalXtext.g:4017:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalXtext.g:4017:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalXtext.g:4018:5: lv_annotations_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getEnumRuleAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_0_0,
            	    						"org.eclipse.xtext.Xtext.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumRuleAccess().getEnumKeyword_1());
            		
            // InternalXtext.g:4039:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalXtext.g:4040:4: (lv_name_2_0= ruleValidID )
            {
            // InternalXtext.g:4040:4: (lv_name_2_0= ruleValidID )
            // InternalXtext.g:4041:5: lv_name_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getEnumRuleAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_51);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.Xtext.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXtext.g:4058:3: (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==25) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalXtext.g:4059:4: otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) )
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumRuleAccess().getReturnsKeyword_3_0());
                    			
                    // InternalXtext.g:4063:4: ( (lv_type_4_0= ruleTypeRef ) )
                    // InternalXtext.g:4064:5: (lv_type_4_0= ruleTypeRef )
                    {
                    // InternalXtext.g:4064:5: (lv_type_4_0= ruleTypeRef )
                    // InternalXtext.g:4065:6: lv_type_4_0= ruleTypeRef
                    {

                    						newCompositeNode(grammarAccess.getEnumRuleAccess().getTypeTypeRefParserRuleCall_3_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_20);
                    lv_type_4_0=ruleTypeRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumRuleRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.eclipse.xtext.Xtext.TypeRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getEnumRuleAccess().getColonKeyword_4());
            		
            // InternalXtext.g:4087:3: ( (lv_alternatives_6_0= ruleEnumLiterals ) )
            // InternalXtext.g:4088:4: (lv_alternatives_6_0= ruleEnumLiterals )
            {
            // InternalXtext.g:4088:4: (lv_alternatives_6_0= ruleEnumLiterals )
            // InternalXtext.g:4089:5: lv_alternatives_6_0= ruleEnumLiterals
            {

            					newCompositeNode(grammarAccess.getEnumRuleAccess().getAlternativesEnumLiteralsParserRuleCall_5_0());
            				
            pushFollow(FollowSets000.FOLLOW_22);
            lv_alternatives_6_0=ruleEnumLiterals();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumRuleRule());
            					}
            					set(
            						current,
            						"alternatives",
            						lv_alternatives_6_0,
            						"org.eclipse.xtext.Xtext.EnumLiterals");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,28,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumRuleAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumRule"


    // $ANTLR start "entryRuleEnumLiterals"
    // InternalXtext.g:4114:1: entryRuleEnumLiterals returns [EObject current=null] : iv_ruleEnumLiterals= ruleEnumLiterals EOF ;
    public final EObject entryRuleEnumLiterals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiterals = null;


        try {
            // InternalXtext.g:4114:53: (iv_ruleEnumLiterals= ruleEnumLiterals EOF )
            // InternalXtext.g:4115:2: iv_ruleEnumLiterals= ruleEnumLiterals EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnumLiterals=ruleEnumLiterals();

            state._fsp--;

             current =iv_ruleEnumLiterals; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumLiterals"


    // $ANTLR start "ruleEnumLiterals"
    // InternalXtext.g:4121:1: ruleEnumLiterals returns [EObject current=null] : (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) ;
    public final EObject ruleEnumLiterals() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EnumLiteralDeclaration_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:4127:2: ( (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) )
            // InternalXtext.g:4128:2: (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            {
            // InternalXtext.g:4128:2: (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            // InternalXtext.g:4129:3: this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getEnumLiteralsAccess().getEnumLiteralDeclarationParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_31);
            this_EnumLiteralDeclaration_0=ruleEnumLiteralDeclaration();

            state._fsp--;


            			current = this_EnumLiteralDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXtext.g:4137:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==34) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalXtext.g:4138:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    {
                    // InternalXtext.g:4138:4: ()
                    // InternalXtext.g:4139:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getEnumLiteralsAccess().getAlternativesElementsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalXtext.g:4145:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    int cnt88=0;
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==34) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalXtext.g:4146:5: otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    {
                    	    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_13); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getEnumLiteralsAccess().getVerticalLineKeyword_1_1_0());
                    	    				
                    	    // InternalXtext.g:4150:5: ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    // InternalXtext.g:4151:6: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    {
                    	    // InternalXtext.g:4151:6: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    // InternalXtext.g:4152:7: lv_elements_3_0= ruleEnumLiteralDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnumLiteralsAccess().getElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_31);
                    	    lv_elements_3_0=ruleEnumLiteralDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnumLiteralsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_3_0,
                    	    								"org.eclipse.xtext.Xtext.EnumLiteralDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt88 >= 1 ) break loop88;
                                EarlyExitException eee =
                                    new EarlyExitException(88, input);
                                throw eee;
                        }
                        cnt88++;
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumLiterals"


    // $ANTLR start "entryRuleEnumLiteralDeclaration"
    // InternalXtext.g:4175:1: entryRuleEnumLiteralDeclaration returns [EObject current=null] : iv_ruleEnumLiteralDeclaration= ruleEnumLiteralDeclaration EOF ;
    public final EObject entryRuleEnumLiteralDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralDeclaration = null;


        try {
            // InternalXtext.g:4175:63: (iv_ruleEnumLiteralDeclaration= ruleEnumLiteralDeclaration EOF )
            // InternalXtext.g:4176:2: iv_ruleEnumLiteralDeclaration= ruleEnumLiteralDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnumLiteralDeclaration=ruleEnumLiteralDeclaration();

            state._fsp--;

             current =iv_ruleEnumLiteralDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumLiteralDeclaration"


    // $ANTLR start "ruleEnumLiteralDeclaration"
    // InternalXtext.g:4182:1: ruleEnumLiteralDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) ;
    public final EObject ruleEnumLiteralDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_literal_2_0 = null;



        	enterRule();

        try {
            // InternalXtext.g:4188:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) )
            // InternalXtext.g:4189:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            {
            // InternalXtext.g:4189:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            // InternalXtext.g:4190:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            {
            // InternalXtext.g:4190:3: ( (otherlv_0= RULE_ID ) )
            // InternalXtext.g:4191:4: (otherlv_0= RULE_ID )
            {
            // InternalXtext.g:4191:4: (otherlv_0= RULE_ID )
            // InternalXtext.g:4192:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumLiteralDeclarationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_56); 

            					newLeafNode(otherlv_0, grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralCrossReference_0_0());
            				

            }


            }

            // InternalXtext.g:4203:3: (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==39) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalXtext.g:4204:4: otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) )
                    {
                    otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumLiteralDeclarationAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalXtext.g:4208:4: ( (lv_literal_2_0= ruleKeyword ) )
                    // InternalXtext.g:4209:5: (lv_literal_2_0= ruleKeyword )
                    {
                    // InternalXtext.g:4209:5: (lv_literal_2_0= ruleKeyword )
                    // InternalXtext.g:4210:6: lv_literal_2_0= ruleKeyword
                    {

                    						newCompositeNode(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralKeywordParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_literal_2_0=ruleKeyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumLiteralDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"literal",
                    							lv_literal_2_0,
                    							"org.eclipse.xtext.Xtext.Keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumLiteralDeclaration"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\2\5\3\uffff\1\5";
    static final String dfa_3s = "\1\64\1\5\3\uffff\1\64";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\3\1\uffff";
    static final String dfa_5s = "\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\20\uffff\1\1\1\2\23\uffff\2\2\4\uffff\1\3\2\uffff\1\4",
            "\1\5",
            "",
            "",
            "",
            "\1\2\20\uffff\1\1\1\2\23\uffff\2\2\4\uffff\1\3\2\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "312:2: (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\3\uffff\3\6\1\uffff\3\6\1\uffff";
    static final String dfa_9s = "\6\4\1\uffff\3\4\1\uffff";
    static final String dfa_10s = "\1\57\2\54\3\60\1\uffff\3\60\1\uffff";
    static final String dfa_11s = "\6\uffff\1\2\3\uffff\1\1";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\6\1\3\12\uffff\1\6\32\uffff\1\4\1\5\1\uffff\1\1\1\2",
            "\1\6\1\7\12\uffff\1\6\32\uffff\1\10\1\11",
            "\1\6\1\7\12\uffff\1\6\32\uffff\1\10\1\11",
            "\2\6\12\uffff\2\6\6\uffff\1\6\3\uffff\1\6\2\uffff\1\6\1\uffff\6\6\2\12\2\uffff\2\6\1\uffff\2\6\1\12",
            "\2\6\12\uffff\2\6\6\uffff\1\6\3\uffff\1\6\2\uffff\1\6\1\uffff\6\6\2\12\2\uffff\2\6\1\uffff\2\6\1\12",
            "\2\6\12\uffff\2\6\6\uffff\1\6\3\uffff\1\6\2\uffff\1\6\1\uffff\6\6\2\12\2\uffff\2\6\1\uffff\2\6\1\12",
            "",
            "\2\6\12\uffff\2\6\6\uffff\1\6\3\uffff\1\6\2\uffff\1\6\1\uffff\6\6\2\12\2\uffff\2\6\1\uffff\2\6\1\12",
            "\2\6\12\uffff\2\6\6\uffff\1\6\3\uffff\1\6\2\uffff\1\6\1\uffff\6\6\2\12\2\uffff\2\6\1\uffff\2\6\1\12",
            "\2\6\12\uffff\2\6\6\uffff\1\6\3\uffff\1\6\2\uffff\1\6\1\uffff\6\6\2\12\2\uffff\2\6\1\uffff\2\6\1\12",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1760:3: (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000180000000020L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0012180000E8A020L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0012180000E8E020L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000180000020020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0012180000E8A022L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000180000C00020L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000B008000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000E008000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C008000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020010060L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000D84080010030L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000020L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000020L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100004000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000380000010020L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000D84000010030L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000D84000010032L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000003001000002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000040000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000018000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001018000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000180020010030L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000440000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000180000000030L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000400000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000180000800020L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x000000000A000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0004B80000050030L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0004B80000050032L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000000400000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000008000000002L});
    }


}