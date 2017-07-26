package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOC_COMMENT", "RULE_INTERFACE", "RULE_ID", "RULE_EXTENDS", "RULE_R_CURLY_BRACE", "RULE_L_CURLY_BRACE", "RULE_LPAREN", "RULE_RPAREN", "RULE_MOD", "RULE_STATIC", "RULE_COLON", "RULE_NULL", "RULE_SUPER", "RULE_THIS", "RULE_INSTANCEOF", "RULE_INCREMENT", "RULE_DECREMENT", "RULE_PLUS_EQUAL", "RULE_MINUS_EQUAL", "RULE_MULTIPLY", "RULE_MULTIPLY_EQUAL", "RULE_DIVIDE", "RULE_DIVIDE_EQUAL", "RULE_MODULE", "RULE_MODULE_EQUAL", "RULE_BT", "RULE_ST", "RULE_BE", "RULE_SE", "RULE_DOUBLE_EQUAL", "RULE_DIFFERENT", "RULE_OR", "RULE_OR_EQUAL", "RULE_EXP", "RULE_EXP_EQUAL", "RULE_DOUBLE_OR_EQUAL", "RULE_WAT", "RULE_R_SHIFT_EQUAL", "RULE_L_SHIFT", "RULE_R_SHIFT", "RULE_SUPER_SHIFT", "RULE_OR_LOGIC", "RULE_AND", "RULE_AMPERSAND", "RULE_DECIMAL_DIGITS", "RULE_FLOAT_TYPE_SUFIX", "RULE_HEXA", "RULE_LONG", "RULE_STRING", "RULE_CHAR", "RULE_NEW", "RULE_NOT", "RULE_EXCLAMATION", "RULE_TRUE", "RULE_FALSE", "RULE_EXPONENTIAL", "RULE_INTEGER_TYPE_SUFFIX", "RULE_OCTAL_LITERAL", "RULE_EXPONENT", "RULE_FLOAT_TYPE_SUFFIX", "RULE_FLOATING_POINT_LITERAL", "RULE_ESCAPE_SEQUENCE", "RULE_CHARACTER_LITERAL", "RULE_OCTAL_ESCAPE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "','", "'class'", "'implements'", "'['", "']'", "'[]'", "'='", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'void'", "'synchronized('", "'return'", "'throw'", "'break'", "'continue'", "'for'", "'.'", "'+'", "'-'", "'switch'", "'case'", "'default'", "'while('", "'do'", "'while'", "'if'", "'else'", "'try'", "'catch'", "'finally'", "'import'", "'.*;'", "'package'"
    };
    public static final int RULE_EXP=37;
    public static final int RULE_FLOAT_TYPE_SUFFIX=63;
    public static final int RULE_MINUS_EQUAL=22;
    public static final int RULE_PLUS_EQUAL=21;
    public static final int RULE_OR=35;
    public static final int RULE_ID=6;
    public static final int RULE_MOD=12;
    public static final int RULE_R_CURLY_BRACE=8;
    public static final int RULE_THIS=17;
    public static final int RULE_DOUBLE_OR_EQUAL=39;
    public static final int RULE_HEXA=50;
    public static final int RULE_COLON=14;
    public static final int RULE_L_CURLY_BRACE=9;
    public static final int RULE_OCTAL_ESCAPE=67;
    public static final int RULE_ML_COMMENT=68;
    public static final int RULE_FALSE=58;
    public static final int RULE_WAT=40;
    public static final int RULE_DIVIDE=25;
    public static final int RULE_DECIMAL_DIGITS=48;
    public static final int RULE_CHARACTER_LITERAL=66;
    public static final int RULE_FLOAT_TYPE_SUFIX=49;
    public static final int RULE_STATIC=13;
    public static final int RULE_SUPER_SHIFT=44;
    public static final int RULE_EXCLAMATION=56;
    public static final int RULE_BT=29;
    public static final int RULE_SE=32;
    public static final int RULE_INSTANCEOF=18;
    public static final int RULE_MODULE_EQUAL=28;
    public static final int RULE_OR_LOGIC=45;
    public static final int RULE_AMPERSAND=47;
    public static final int RULE_OCTAL_LITERAL=61;
    public static final int RULE_EXPONENT=62;
    public static final int RULE_BE=31;
    public static final int RULE_DIFFERENT=34;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int RULE_FLOATING_POINT_LITERAL=64;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int RULE_NEW=54;
    public static final int T__90=90;
    public static final int RULE_INTEGER_TYPE_SUFFIX=60;
    public static final int RULE_LPAREN=10;
    public static final int T__99=99;
    public static final int RULE_CHAR=53;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int RULE_ST=30;
    public static final int T__98=98;
    public static final int RULE_INCREMENT=19;
    public static final int RULE_L_SHIFT=42;
    public static final int RULE_EXPONENTIAL=59;
    public static final int RULE_SUPER=16;
    public static final int RULE_EXTENDS=7;
    public static final int RULE_DOUBLE_EQUAL=33;
    public static final int RULE_INTERFACE=5;
    public static final int RULE_DOC_COMMENT=4;
    public static final int RULE_MULTIPLY=23;
    public static final int RULE_MULTIPLY_EQUAL=24;
    public static final int RULE_ESCAPE_SEQUENCE=65;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_R_SHIFT_EQUAL=41;
    public static final int RULE_R_SHIFT=43;
    public static final int RULE_EXP_EQUAL=38;
    public static final int RULE_STRING=52;
    public static final int RULE_NOT=55;
    public static final int RULE_NULL=15;
    public static final int RULE_AND=46;
    public static final int RULE_OR_EQUAL=36;
    public static final int RULE_SL_COMMENT=69;
    public static final int RULE_DIVIDE_EQUAL=26;
    public static final int T__77=77;
    public static final int RULE_TRUE=57;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int RULE_DECREMENT=20;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=70;
    public static final int RULE_RPAREN=11;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int RULE_LONG=51;
    public static final int T__109=109;
    public static final int RULE_MODULE=27;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:74:2: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:75:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:82:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleCompilation_unit ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:85:28: ( ( (lv_greetings_0_0= ruleCompilation_unit ) ) )
            // InternalMyDsl.g:86:1: ( (lv_greetings_0_0= ruleCompilation_unit ) )
            {
            // InternalMyDsl.g:86:1: ( (lv_greetings_0_0= ruleCompilation_unit ) )
            // InternalMyDsl.g:87:1: (lv_greetings_0_0= ruleCompilation_unit )
            {
            // InternalMyDsl.g:87:1: (lv_greetings_0_0= ruleCompilation_unit )
            // InternalMyDsl.g:88:3: lv_greetings_0_0= ruleCompilation_unit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsCompilation_unitParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_greetings_0_0=ruleCompilation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		add(
                     			current, 
                     			"greetings",
                      		lv_greetings_0_0, 
                      		"org.xtext.example.mydsl.MyDsl.Compilation_unit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCompilation_unit"
    // InternalMyDsl.g:112:1: entryRuleCompilation_unit returns [EObject current=null] : iv_ruleCompilation_unit= ruleCompilation_unit EOF ;
    public final EObject entryRuleCompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompilation_unit = null;


        try {
            // InternalMyDsl.g:113:2: (iv_ruleCompilation_unit= ruleCompilation_unit EOF )
            // InternalMyDsl.g:114:2: iv_ruleCompilation_unit= ruleCompilation_unit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompilation_unitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompilation_unit=ruleCompilation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompilation_unit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompilation_unit"


    // $ANTLR start "ruleCompilation_unit"
    // InternalMyDsl.g:121:1: ruleCompilation_unit returns [EObject current=null] : ( () ( (lv_name_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_typeDeclarations_3_0= ruleType_declaration ) )* ) ;
    public final EObject ruleCompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_typeDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:124:28: ( ( () ( (lv_name_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_typeDeclarations_3_0= ruleType_declaration ) )* ) )
            // InternalMyDsl.g:125:1: ( () ( (lv_name_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_typeDeclarations_3_0= ruleType_declaration ) )* )
            {
            // InternalMyDsl.g:125:1: ( () ( (lv_name_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_typeDeclarations_3_0= ruleType_declaration ) )* )
            // InternalMyDsl.g:125:2: () ( (lv_name_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_typeDeclarations_3_0= ruleType_declaration ) )*
            {
            // InternalMyDsl.g:125:2: ()
            // InternalMyDsl.g:126:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompilation_unitAccess().getCompilation_unitAction_0(),
                          current);
                  
            }

            }

            // InternalMyDsl.g:134:2: ( (lv_name_1_0= rulePackage_statement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==110) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:135:1: (lv_name_1_0= rulePackage_statement )
                    {
                    // InternalMyDsl.g:135:1: (lv_name_1_0= rulePackage_statement )
                    // InternalMyDsl.g:136:3: lv_name_1_0= rulePackage_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getNamePackage_statementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_3);
                    lv_name_1_0=rulePackage_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"org.xtext.example.mydsl.MyDsl.Package_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:152:3: ( (lv_imports_2_0= ruleImport_statement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==108) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:153:1: (lv_imports_2_0= ruleImport_statement )
            	    {
            	    // InternalMyDsl.g:153:1: (lv_imports_2_0= ruleImport_statement )
            	    // InternalMyDsl.g:154:3: lv_imports_2_0= ruleImport_statement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_2_0=ruleImport_statement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Import_statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:170:3: ( (lv_typeDeclarations_3_0= ruleType_declaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_DOC_COMMENT && LA3_0<=RULE_INTERFACE)||(LA3_0>=RULE_MOD && LA3_0<=RULE_STATIC)||LA3_0==73) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:171:1: (lv_typeDeclarations_3_0= ruleType_declaration )
            	    {
            	    // InternalMyDsl.g:171:1: (lv_typeDeclarations_3_0= ruleType_declaration )
            	    // InternalMyDsl.g:172:3: lv_typeDeclarations_3_0= ruleType_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getTypeDeclarationsType_declarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_typeDeclarations_3_0=ruleType_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"typeDeclarations",
            	              		lv_typeDeclarations_3_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Type_declaration");
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCompilation_unit"


    // $ANTLR start "entryRuleType_declaration"
    // InternalMyDsl.g:196:1: entryRuleType_declaration returns [EObject current=null] : iv_ruleType_declaration= ruleType_declaration EOF ;
    public final EObject entryRuleType_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_declaration = null;


        try {
            // InternalMyDsl.g:197:2: (iv_ruleType_declaration= ruleType_declaration EOF )
            // InternalMyDsl.g:198:2: iv_ruleType_declaration= ruleType_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType_declaration=ruleType_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_declaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType_declaration"


    // $ANTLR start "ruleType_declaration"
    // InternalMyDsl.g:205:1: ruleType_declaration returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleType_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token otherlv_3=null;
        EObject lv_classDec_1_0 = null;

        EObject lv_interfaceDec_2_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:208:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' ) )
            // InternalMyDsl.g:209:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' )
            {
            // InternalMyDsl.g:209:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' )
            // InternalMyDsl.g:209:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';'
            {
            // InternalMyDsl.g:209:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOC_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:210:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // InternalMyDsl.g:210:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // InternalMyDsl.g:211:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_comment_0_0, grammarAccess.getType_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getType_declarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"comment",
                              		lv_comment_0_0, 
                              		"org.xtext.example.mydsl.MyDsl.DOC_COMMENT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:227:3: ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:227:4: ( (lv_classDec_1_0= ruleClass_declaration ) )
                    {
                    // InternalMyDsl.g:227:4: ( (lv_classDec_1_0= ruleClass_declaration ) )
                    // InternalMyDsl.g:228:1: (lv_classDec_1_0= ruleClass_declaration )
                    {
                    // InternalMyDsl.g:228:1: (lv_classDec_1_0= ruleClass_declaration )
                    // InternalMyDsl.g:229:3: lv_classDec_1_0= ruleClass_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getClassDecClass_declarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_6);
                    lv_classDec_1_0=ruleClass_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getType_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"classDec",
                              		lv_classDec_1_0, 
                              		"org.xtext.example.mydsl.MyDsl.Class_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:246:6: ( (lv_interfaceDec_2_0= ruleInterface_declaration ) )
                    {
                    // InternalMyDsl.g:246:6: ( (lv_interfaceDec_2_0= ruleInterface_declaration ) )
                    // InternalMyDsl.g:247:1: (lv_interfaceDec_2_0= ruleInterface_declaration )
                    {
                    // InternalMyDsl.g:247:1: (lv_interfaceDec_2_0= ruleInterface_declaration )
                    // InternalMyDsl.g:248:3: lv_interfaceDec_2_0= ruleInterface_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getInterfaceDecInterface_declarationParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_6);
                    lv_interfaceDec_2_0=ruleInterface_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getType_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"interfaceDec",
                              		lv_interfaceDec_2_0, 
                              		"org.xtext.example.mydsl.MyDsl.Interface_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getType_declarationAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleType_declaration"


    // $ANTLR start "entryRuleInterface_declaration"
    // InternalMyDsl.g:276:1: entryRuleInterface_declaration returns [EObject current=null] : iv_ruleInterface_declaration= ruleInterface_declaration EOF ;
    public final EObject entryRuleInterface_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface_declaration = null;


        try {
            // InternalMyDsl.g:277:2: (iv_ruleInterface_declaration= ruleInterface_declaration EOF )
            // InternalMyDsl.g:278:2: iv_ruleInterface_declaration= ruleInterface_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterface_declaration=ruleInterface_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface_declaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterface_declaration"


    // $ANTLR start "ruleInterface_declaration"
    // InternalMyDsl.g:285:1: ruleInterface_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* this_INTERFACE_1= RULE_INTERFACE ( (lv_interfaceName_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_7= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_8_0= ruleField_declaration ) )* this_L_CURLY_BRACE_9= RULE_L_CURLY_BRACE ) ;
    public final EObject ruleInterface_declaration() throws RecognitionException {
        EObject current = null;

        Token this_INTERFACE_1=null;
        Token lv_interfaceName_2_0=null;
        Token this_EXTENDS_3=null;
        Token otherlv_5=null;
        Token this_R_CURLY_BRACE_7=null;
        Token this_L_CURLY_BRACE_9=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        AntlrDatatypeRuleToken lv_interfaceHerdada_4_0 = null;

        AntlrDatatypeRuleToken lv_interfacesHerdadas_6_0 = null;

        EObject lv_fieldsDeclaration_8_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:288:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* this_INTERFACE_1= RULE_INTERFACE ( (lv_interfaceName_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_7= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_8_0= ruleField_declaration ) )* this_L_CURLY_BRACE_9= RULE_L_CURLY_BRACE ) )
            // InternalMyDsl.g:289:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* this_INTERFACE_1= RULE_INTERFACE ( (lv_interfaceName_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_7= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_8_0= ruleField_declaration ) )* this_L_CURLY_BRACE_9= RULE_L_CURLY_BRACE )
            {
            // InternalMyDsl.g:289:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* this_INTERFACE_1= RULE_INTERFACE ( (lv_interfaceName_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_7= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_8_0= ruleField_declaration ) )* this_L_CURLY_BRACE_9= RULE_L_CURLY_BRACE )
            // InternalMyDsl.g:289:2: ( (lv_modifiers_0_0= ruleModifier ) )* this_INTERFACE_1= RULE_INTERFACE ( (lv_interfaceName_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_7= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_8_0= ruleField_declaration ) )* this_L_CURLY_BRACE_9= RULE_L_CURLY_BRACE
            {
            // InternalMyDsl.g:289:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_MOD && LA6_0<=RULE_STATIC)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:290:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // InternalMyDsl.g:290:1: (lv_modifiers_0_0= ruleModifier )
            	    // InternalMyDsl.g:291:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_0_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            this_INTERFACE_1=(Token)match(input,RULE_INTERFACE,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INTERFACE_1, grammarAccess.getInterface_declarationAccess().getINTERFACETerminalRuleCall_1()); 
                  
            }
            // InternalMyDsl.g:311:1: ( (lv_interfaceName_2_0= RULE_ID ) )
            // InternalMyDsl.g:312:1: (lv_interfaceName_2_0= RULE_ID )
            {
            // InternalMyDsl.g:312:1: (lv_interfaceName_2_0= RULE_ID )
            // InternalMyDsl.g:313:3: lv_interfaceName_2_0= RULE_ID
            {
            lv_interfaceName_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_interfaceName_2_0, grammarAccess.getInterface_declarationAccess().getInterfaceNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInterface_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"interfaceName",
                      		lv_interfaceName_2_0, 
                      		"org.xtext.example.mydsl.MyDsl.ID");
              	    
            }

            }


            }

            // InternalMyDsl.g:329:2: (this_EXTENDS_3= RULE_EXTENDS ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_EXTENDS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:329:3: this_EXTENDS_3= RULE_EXTENDS ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )*
                    {
                    this_EXTENDS_3=(Token)match(input,RULE_EXTENDS,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EXTENDS_3, grammarAccess.getInterface_declarationAccess().getEXTENDSTerminalRuleCall_3_0()); 
                          
                    }
                    // InternalMyDsl.g:333:1: ( (lv_interfaceHerdada_4_0= ruleInterface_name ) )
                    // InternalMyDsl.g:334:1: (lv_interfaceHerdada_4_0= ruleInterface_name )
                    {
                    // InternalMyDsl.g:334:1: (lv_interfaceHerdada_4_0= ruleInterface_name )
                    // InternalMyDsl.g:335:3: lv_interfaceHerdada_4_0= ruleInterface_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getInterfaceHerdadaInterface_nameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_10);
                    lv_interfaceHerdada_4_0=ruleInterface_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"interfaceHerdada",
                              		lv_interfaceHerdada_4_0, 
                              		"org.xtext.example.mydsl.MyDsl.Interface_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:351:2: (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==72) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:351:4: otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) )
                    	    {
                    	    otherlv_5=(Token)match(input,72,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalMyDsl.g:355:1: ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) )
                    	    // InternalMyDsl.g:356:1: (lv_interfacesHerdadas_6_0= ruleInterface_name )
                    	    {
                    	    // InternalMyDsl.g:356:1: (lv_interfacesHerdadas_6_0= ruleInterface_name )
                    	    // InternalMyDsl.g:357:3: lv_interfacesHerdadas_6_0= ruleInterface_name
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getInterfacesHerdadasInterface_nameParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_interfacesHerdadas_6_0=ruleInterface_name();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"interfacesHerdadas",
                    	              		lv_interfacesHerdadas_6_0, 
                    	              		"org.xtext.example.mydsl.MyDsl.Interface_name");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            this_R_CURLY_BRACE_7=(Token)match(input,RULE_R_CURLY_BRACE,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_R_CURLY_BRACE_7, grammarAccess.getInterface_declarationAccess().getR_CURLY_BRACETerminalRuleCall_4()); 
                  
            }
            // InternalMyDsl.g:377:1: ( (lv_fieldsDeclaration_8_0= ruleField_declaration ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_DOC_COMMENT||LA9_0==RULE_ID||(LA9_0>=RULE_MOD && LA9_0<=RULE_STATIC)||LA9_0==71||(LA9_0>=79 && LA9_0<=87)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:378:1: (lv_fieldsDeclaration_8_0= ruleField_declaration )
            	    {
            	    // InternalMyDsl.g:378:1: (lv_fieldsDeclaration_8_0= ruleField_declaration )
            	    // InternalMyDsl.g:379:3: lv_fieldsDeclaration_8_0= ruleField_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getFieldsDeclarationField_declarationParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_fieldsDeclaration_8_0=ruleField_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fieldsDeclaration",
            	              		lv_fieldsDeclaration_8_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Field_declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            this_L_CURLY_BRACE_9=(Token)match(input,RULE_L_CURLY_BRACE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_L_CURLY_BRACE_9, grammarAccess.getInterface_declarationAccess().getL_CURLY_BRACETerminalRuleCall_6()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInterface_declaration"


    // $ANTLR start "entryRuleClass_declaration"
    // InternalMyDsl.g:407:1: entryRuleClass_declaration returns [EObject current=null] : iv_ruleClass_declaration= ruleClass_declaration EOF ;
    public final EObject entryRuleClass_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass_declaration = null;


        try {
            // InternalMyDsl.g:408:2: (iv_ruleClass_declaration= ruleClass_declaration EOF )
            // InternalMyDsl.g:409:2: iv_ruleClass_declaration= ruleClass_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClass_declaration=ruleClass_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_declaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClass_declaration"


    // $ANTLR start "ruleClass_declaration"
    // InternalMyDsl.g:416:1: ruleClass_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_9= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* this_L_CURLY_BRACE_11= RULE_L_CURLY_BRACE ) ;
    public final EObject ruleClass_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_className_2_0=null;
        Token this_EXTENDS_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_R_CURLY_BRACE_9=null;
        Token this_L_CURLY_BRACE_11=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        AntlrDatatypeRuleToken lv_classHerdada_4_0 = null;

        AntlrDatatypeRuleToken lv_interfaceImplementada_6_0 = null;

        AntlrDatatypeRuleToken lv_interfacesImplementadas_8_0 = null;

        EObject lv_fieldsDeclaration_10_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:419:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_9= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* this_L_CURLY_BRACE_11= RULE_L_CURLY_BRACE ) )
            // InternalMyDsl.g:420:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_9= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* this_L_CURLY_BRACE_11= RULE_L_CURLY_BRACE )
            {
            // InternalMyDsl.g:420:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_9= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* this_L_CURLY_BRACE_11= RULE_L_CURLY_BRACE )
            // InternalMyDsl.g:420:2: ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_9= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* this_L_CURLY_BRACE_11= RULE_L_CURLY_BRACE
            {
            // InternalMyDsl.g:420:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_MOD && LA10_0<=RULE_STATIC)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:421:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // InternalMyDsl.g:421:1: (lv_modifiers_0_0= ruleModifier )
            	    // InternalMyDsl.g:422:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_0_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_1=(Token)match(input,73,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClass_declarationAccess().getClassKeyword_1());
                  
            }
            // InternalMyDsl.g:442:1: ( (lv_className_2_0= RULE_ID ) )
            // InternalMyDsl.g:443:1: (lv_className_2_0= RULE_ID )
            {
            // InternalMyDsl.g:443:1: (lv_className_2_0= RULE_ID )
            // InternalMyDsl.g:444:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_className_2_0, grammarAccess.getClass_declarationAccess().getClassNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClass_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"className",
                      		lv_className_2_0, 
                      		"org.xtext.example.mydsl.MyDsl.ID");
              	    
            }

            }


            }

            // InternalMyDsl.g:460:2: (this_EXTENDS_3= RULE_EXTENDS ( (lv_classHerdada_4_0= ruleClass_name ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_EXTENDS) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:460:3: this_EXTENDS_3= RULE_EXTENDS ( (lv_classHerdada_4_0= ruleClass_name ) )
                    {
                    this_EXTENDS_3=(Token)match(input,RULE_EXTENDS,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EXTENDS_3, grammarAccess.getClass_declarationAccess().getEXTENDSTerminalRuleCall_3_0()); 
                          
                    }
                    // InternalMyDsl.g:464:1: ( (lv_classHerdada_4_0= ruleClass_name ) )
                    // InternalMyDsl.g:465:1: (lv_classHerdada_4_0= ruleClass_name )
                    {
                    // InternalMyDsl.g:465:1: (lv_classHerdada_4_0= ruleClass_name )
                    // InternalMyDsl.g:466:3: lv_classHerdada_4_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getClassHerdadaClass_nameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_15);
                    lv_classHerdada_4_0=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"classHerdada",
                              		lv_classHerdada_4_0, 
                              		"org.xtext.example.mydsl.MyDsl.Class_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:482:4: (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==74) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:482:6: otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )*
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0());
                          
                    }
                    // InternalMyDsl.g:486:1: ( (lv_interfaceImplementada_6_0= ruleInterface_name ) )
                    // InternalMyDsl.g:487:1: (lv_interfaceImplementada_6_0= ruleInterface_name )
                    {
                    // InternalMyDsl.g:487:1: (lv_interfaceImplementada_6_0= ruleInterface_name )
                    // InternalMyDsl.g:488:3: lv_interfaceImplementada_6_0= ruleInterface_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getInterfaceImplementadaInterface_nameParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_10);
                    lv_interfaceImplementada_6_0=ruleInterface_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"interfaceImplementada",
                              		lv_interfaceImplementada_6_0, 
                              		"org.xtext.example.mydsl.MyDsl.Interface_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:504:2: (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==72) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:504:4: otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) )
                    	    {
                    	    otherlv_7=(Token)match(input,72,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // InternalMyDsl.g:508:1: ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) )
                    	    // InternalMyDsl.g:509:1: (lv_interfacesImplementadas_8_0= ruleInterface_name )
                    	    {
                    	    // InternalMyDsl.g:509:1: (lv_interfacesImplementadas_8_0= ruleInterface_name )
                    	    // InternalMyDsl.g:510:3: lv_interfacesImplementadas_8_0= ruleInterface_name
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getInterfacesImplementadasInterface_nameParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_interfacesImplementadas_8_0=ruleInterface_name();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"interfacesImplementadas",
                    	              		lv_interfacesImplementadas_8_0, 
                    	              		"org.xtext.example.mydsl.MyDsl.Interface_name");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            this_R_CURLY_BRACE_9=(Token)match(input,RULE_R_CURLY_BRACE,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_R_CURLY_BRACE_9, grammarAccess.getClass_declarationAccess().getR_CURLY_BRACETerminalRuleCall_5()); 
                  
            }
            // InternalMyDsl.g:530:1: ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_DOC_COMMENT||LA14_0==RULE_ID||(LA14_0>=RULE_MOD && LA14_0<=RULE_STATIC)||LA14_0==71||(LA14_0>=79 && LA14_0<=87)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:531:1: (lv_fieldsDeclaration_10_0= ruleField_declaration )
            	    {
            	    // InternalMyDsl.g:531:1: (lv_fieldsDeclaration_10_0= ruleField_declaration )
            	    // InternalMyDsl.g:532:3: lv_fieldsDeclaration_10_0= ruleField_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getFieldsDeclarationField_declarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_fieldsDeclaration_10_0=ruleField_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fieldsDeclaration",
            	              		lv_fieldsDeclaration_10_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Field_declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            this_L_CURLY_BRACE_11=(Token)match(input,RULE_L_CURLY_BRACE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_L_CURLY_BRACE_11, grammarAccess.getClass_declarationAccess().getL_CURLY_BRACETerminalRuleCall_7()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClass_declaration"


    // $ANTLR start "entryRuleField_declaration"
    // InternalMyDsl.g:560:1: entryRuleField_declaration returns [EObject current=null] : iv_ruleField_declaration= ruleField_declaration EOF ;
    public final EObject entryRuleField_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField_declaration = null;


        try {
            // InternalMyDsl.g:561:2: (iv_ruleField_declaration= ruleField_declaration EOF )
            // InternalMyDsl.g:562:2: iv_ruleField_declaration= ruleField_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleField_declaration=ruleField_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField_declaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleField_declaration"


    // $ANTLR start "ruleField_declaration"
    // InternalMyDsl.g:569:1: ruleField_declaration returns [EObject current=null] : ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | ( () otherlv_6= ';' ) ) ;
    public final EObject ruleField_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token otherlv_6=null;
        EObject lv_variableDeclaration_1_0 = null;

        EObject lv_contructorName_2_0 = null;

        EObject lv_methodName_3_0 = null;

        EObject lv_staticinitializer_4_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:572:28: ( ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | ( () otherlv_6= ';' ) ) )
            // InternalMyDsl.g:573:1: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | ( () otherlv_6= ';' ) )
            {
            // InternalMyDsl.g:573:1: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | ( () otherlv_6= ';' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_DOC_COMMENT:
            case RULE_ID:
            case RULE_MOD:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
                {
                alt17=1;
                }
                break;
            case RULE_STATIC:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==RULE_ID||(LA17_2>=RULE_MOD && LA17_2<=RULE_STATIC)||(LA17_2>=79 && LA17_2<=87)) ) {
                    alt17=1;
                }
                else if ( (LA17_2==RULE_R_CURLY_BRACE) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case 71:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:573:2: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) )
                    {
                    // InternalMyDsl.g:573:2: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) )
                    // InternalMyDsl.g:573:3: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) )
                    {
                    // InternalMyDsl.g:573:3: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_DOC_COMMENT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMyDsl.g:574:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                            {
                            // InternalMyDsl.g:574:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                            // InternalMyDsl.g:575:3: lv_comment_0_0= RULE_DOC_COMMENT
                            {
                            lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_comment_0_0, grammarAccess.getField_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getField_declarationRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"comment",
                                      		lv_comment_0_0, 
                                      		"org.xtext.example.mydsl.MyDsl.DOC_COMMENT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:591:3: ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) )
                    int alt16=3;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // InternalMyDsl.g:591:4: ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) )
                            {
                            // InternalMyDsl.g:591:4: ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) )
                            // InternalMyDsl.g:592:1: (lv_variableDeclaration_1_0= ruleVariable_declaration )
                            {
                            // InternalMyDsl.g:592:1: (lv_variableDeclaration_1_0= ruleVariable_declaration )
                            // InternalMyDsl.g:593:3: lv_variableDeclaration_1_0= ruleVariable_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getVariableDeclarationVariable_declarationParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_2);
                            lv_variableDeclaration_1_0=ruleVariable_declaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"variableDeclaration",
                                      		lv_variableDeclaration_1_0, 
                                      		"org.xtext.example.mydsl.MyDsl.Variable_declaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:610:6: ( (lv_contructorName_2_0= ruleConstructor_declaration ) )
                            {
                            // InternalMyDsl.g:610:6: ( (lv_contructorName_2_0= ruleConstructor_declaration ) )
                            // InternalMyDsl.g:611:1: (lv_contructorName_2_0= ruleConstructor_declaration )
                            {
                            // InternalMyDsl.g:611:1: (lv_contructorName_2_0= ruleConstructor_declaration )
                            // InternalMyDsl.g:612:3: lv_contructorName_2_0= ruleConstructor_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getContructorNameConstructor_declarationParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_2);
                            lv_contructorName_2_0=ruleConstructor_declaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"contructorName",
                                      		lv_contructorName_2_0, 
                                      		"org.xtext.example.mydsl.MyDsl.Constructor_declaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:629:6: ( (lv_methodName_3_0= ruleMethod_declaration ) )
                            {
                            // InternalMyDsl.g:629:6: ( (lv_methodName_3_0= ruleMethod_declaration ) )
                            // InternalMyDsl.g:630:1: (lv_methodName_3_0= ruleMethod_declaration )
                            {
                            // InternalMyDsl.g:630:1: (lv_methodName_3_0= ruleMethod_declaration )
                            // InternalMyDsl.g:631:3: lv_methodName_3_0= ruleMethod_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getMethodNameMethod_declarationParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_2);
                            lv_methodName_3_0=ruleMethod_declaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"methodName",
                                      		lv_methodName_3_0, 
                                      		"org.xtext.example.mydsl.MyDsl.Method_declaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:648:6: ( (lv_staticinitializer_4_0= ruleStatic_initializer ) )
                    {
                    // InternalMyDsl.g:648:6: ( (lv_staticinitializer_4_0= ruleStatic_initializer ) )
                    // InternalMyDsl.g:649:1: (lv_staticinitializer_4_0= ruleStatic_initializer )
                    {
                    // InternalMyDsl.g:649:1: (lv_staticinitializer_4_0= ruleStatic_initializer )
                    // InternalMyDsl.g:650:3: lv_staticinitializer_4_0= ruleStatic_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getField_declarationAccess().getStaticinitializerStatic_initializerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_staticinitializer_4_0=ruleStatic_initializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"staticinitializer",
                              		lv_staticinitializer_4_0, 
                              		"org.xtext.example.mydsl.MyDsl.Static_initializer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:667:6: ( () otherlv_6= ';' )
                    {
                    // InternalMyDsl.g:667:6: ( () otherlv_6= ';' )
                    // InternalMyDsl.g:667:7: () otherlv_6= ';'
                    {
                    // InternalMyDsl.g:667:7: ()
                    // InternalMyDsl.g:668:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getField_declarationAccess().getField_declarationAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getField_declarationAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleField_declaration"


    // $ANTLR start "entryRuleMethod_declaration"
    // InternalMyDsl.g:688:1: entryRuleMethod_declaration returns [EObject current=null] : iv_ruleMethod_declaration= ruleMethod_declaration EOF ;
    public final EObject entryRuleMethod_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod_declaration = null;


        try {
            // InternalMyDsl.g:689:2: (iv_ruleMethod_declaration= ruleMethod_declaration EOF )
            // InternalMyDsl.g:690:2: iv_ruleMethod_declaration= ruleMethod_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethod_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethod_declaration=ruleMethod_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod_declaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethod_declaration"


    // $ANTLR start "ruleMethod_declaration"
    // InternalMyDsl.g:697:1: ruleMethod_declaration returns [EObject current=null] : ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? ( (lv_rparent_5_0= RULE_RPAREN ) ) (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) ) ) ;
    public final EObject ruleMethod_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_nameMethod_2_0=null;
        Token lv_lParen_3_0=null;
        Token lv_rparent_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_debug_9_0=null;
        AntlrDatatypeRuleToken lv_modifiersMethod_0_0 = null;

        EObject lv_typeMethod_1_0 = null;

        EObject lv_parameterListMethod_4_0 = null;

        EObject lv_statementMethod_8_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:700:28: ( ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? ( (lv_rparent_5_0= RULE_RPAREN ) ) (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) ) ) )
            // InternalMyDsl.g:701:1: ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? ( (lv_rparent_5_0= RULE_RPAREN ) ) (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) ) )
            {
            // InternalMyDsl.g:701:1: ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? ( (lv_rparent_5_0= RULE_RPAREN ) ) (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) ) )
            // InternalMyDsl.g:701:2: ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? ( (lv_rparent_5_0= RULE_RPAREN ) ) (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) )
            {
            // InternalMyDsl.g:701:2: ( (lv_modifiersMethod_0_0= ruleModifier ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_MOD && LA18_0<=RULE_STATIC)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:702:1: (lv_modifiersMethod_0_0= ruleModifier )
            	    {
            	    // InternalMyDsl.g:702:1: (lv_modifiersMethod_0_0= ruleModifier )
            	    // InternalMyDsl.g:703:3: lv_modifiersMethod_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getModifiersMethodModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_modifiersMethod_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiersMethod",
            	              		lv_modifiersMethod_0_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalMyDsl.g:719:3: ( (lv_typeMethod_1_0= ruleType ) )
            // InternalMyDsl.g:720:1: (lv_typeMethod_1_0= ruleType )
            {
            // InternalMyDsl.g:720:1: (lv_typeMethod_1_0= ruleType )
            // InternalMyDsl.g:721:3: lv_typeMethod_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getTypeMethodTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_8);
            lv_typeMethod_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"typeMethod",
                      		lv_typeMethod_1_0, 
                      		"org.xtext.example.mydsl.MyDsl.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMyDsl.g:737:2: ( (lv_nameMethod_2_0= RULE_ID ) )
            // InternalMyDsl.g:738:1: (lv_nameMethod_2_0= RULE_ID )
            {
            // InternalMyDsl.g:738:1: (lv_nameMethod_2_0= RULE_ID )
            // InternalMyDsl.g:739:3: lv_nameMethod_2_0= RULE_ID
            {
            lv_nameMethod_2_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nameMethod_2_0, grammarAccess.getMethod_declarationAccess().getNameMethodIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethod_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nameMethod",
                      		lv_nameMethod_2_0, 
                      		"org.xtext.example.mydsl.MyDsl.ID");
              	    
            }

            }


            }

            // InternalMyDsl.g:755:2: ( (lv_lParen_3_0= RULE_LPAREN ) )
            // InternalMyDsl.g:756:1: (lv_lParen_3_0= RULE_LPAREN )
            {
            // InternalMyDsl.g:756:1: (lv_lParen_3_0= RULE_LPAREN )
            // InternalMyDsl.g:757:3: lv_lParen_3_0= RULE_LPAREN
            {
            lv_lParen_3_0=(Token)match(input,RULE_LPAREN,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_lParen_3_0, grammarAccess.getMethod_declarationAccess().getLParenLPARENTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethod_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"lParen",
                      		lv_lParen_3_0, 
                      		"org.xtext.example.mydsl.MyDsl.LPAREN");
              	    
            }

            }


            }

            // InternalMyDsl.g:773:2: ( (lv_parameterListMethod_4_0= ruleParameter_list ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||(LA19_0>=79 && LA19_0<=87)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:774:1: (lv_parameterListMethod_4_0= ruleParameter_list )
                    {
                    // InternalMyDsl.g:774:1: (lv_parameterListMethod_4_0= ruleParameter_list )
                    // InternalMyDsl.g:775:3: lv_parameterListMethod_4_0= ruleParameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getParameterListMethodParameter_listParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_19);
                    lv_parameterListMethod_4_0=ruleParameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterListMethod",
                              		lv_parameterListMethod_4_0, 
                              		"org.xtext.example.mydsl.MyDsl.Parameter_list");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:791:3: ( (lv_rparent_5_0= RULE_RPAREN ) )
            // InternalMyDsl.g:792:1: (lv_rparent_5_0= RULE_RPAREN )
            {
            // InternalMyDsl.g:792:1: (lv_rparent_5_0= RULE_RPAREN )
            // InternalMyDsl.g:793:3: lv_rparent_5_0= RULE_RPAREN
            {
            lv_rparent_5_0=(Token)match(input,RULE_RPAREN,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_5_0, grammarAccess.getMethod_declarationAccess().getRparentRPARENTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethod_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_5_0, 
                      		"org.xtext.example.mydsl.MyDsl.RPAREN");
              	    
            }

            }


            }

            // InternalMyDsl.g:809:2: (otherlv_6= '[' otherlv_7= ']' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==75) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:809:4: otherlv_6= '[' otherlv_7= ']'
            	    {
            	    otherlv_6=(Token)match(input,75,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketKeyword_6_0());
            	          
            	    }
            	    otherlv_7=(Token)match(input,76,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMethod_declarationAccess().getRightSquareBracketKeyword_6_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalMyDsl.g:817:3: ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_R_CURLY_BRACE) ) {
                alt21=1;
            }
            else if ( (LA21_0==71) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:817:4: ( (lv_statementMethod_8_0= ruleStatement_block ) )
                    {
                    // InternalMyDsl.g:817:4: ( (lv_statementMethod_8_0= ruleStatement_block ) )
                    // InternalMyDsl.g:818:1: (lv_statementMethod_8_0= ruleStatement_block )
                    {
                    // InternalMyDsl.g:818:1: (lv_statementMethod_8_0= ruleStatement_block )
                    // InternalMyDsl.g:819:3: lv_statementMethod_8_0= ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getStatementMethodStatement_blockParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_statementMethod_8_0=ruleStatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"statementMethod",
                              		lv_statementMethod_8_0, 
                              		"org.xtext.example.mydsl.MyDsl.Statement_block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:836:6: ( (lv_debug_9_0= ';' ) )
                    {
                    // InternalMyDsl.g:836:6: ( (lv_debug_9_0= ';' ) )
                    // InternalMyDsl.g:837:1: (lv_debug_9_0= ';' )
                    {
                    // InternalMyDsl.g:837:1: (lv_debug_9_0= ';' )
                    // InternalMyDsl.g:838:3: lv_debug_9_0= ';'
                    {
                    lv_debug_9_0=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_debug_9_0, grammarAccess.getMethod_declarationAccess().getDebugSemicolonKeyword_7_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethod_declarationRule());
                      	        }
                             		setWithLastConsumed(current, "debug", lv_debug_9_0, ";");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMethod_declaration"


    // $ANTLR start "entryRuleConstructor_declaration"
    // InternalMyDsl.g:859:1: entryRuleConstructor_declaration returns [EObject current=null] : iv_ruleConstructor_declaration= ruleConstructor_declaration EOF ;
    public final EObject entryRuleConstructor_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor_declaration = null;


        try {
            // InternalMyDsl.g:860:2: (iv_ruleConstructor_declaration= ruleConstructor_declaration EOF )
            // InternalMyDsl.g:861:2: iv_ruleConstructor_declaration= ruleConstructor_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructor_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstructor_declaration=ruleConstructor_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructor_declaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstructor_declaration"


    // $ANTLR start "ruleConstructor_declaration"
    // InternalMyDsl.g:868:1: ruleConstructor_declaration returns [EObject current=null] : ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? ( (lv_rparent_4_0= RULE_RPAREN ) ) ( (lv_statementConstructor_5_0= ruleStatement_block ) ) ) ;
    public final EObject ruleConstructor_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_nameConstructor_1_0=null;
        Token lv_lParen_2_0=null;
        Token lv_rparent_4_0=null;
        AntlrDatatypeRuleToken lv_modifiersConstructor_0_0 = null;

        EObject lv_parameterListConstructor_3_0 = null;

        EObject lv_statementConstructor_5_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:871:28: ( ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? ( (lv_rparent_4_0= RULE_RPAREN ) ) ( (lv_statementConstructor_5_0= ruleStatement_block ) ) ) )
            // InternalMyDsl.g:872:1: ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? ( (lv_rparent_4_0= RULE_RPAREN ) ) ( (lv_statementConstructor_5_0= ruleStatement_block ) ) )
            {
            // InternalMyDsl.g:872:1: ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? ( (lv_rparent_4_0= RULE_RPAREN ) ) ( (lv_statementConstructor_5_0= ruleStatement_block ) ) )
            // InternalMyDsl.g:872:2: ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? ( (lv_rparent_4_0= RULE_RPAREN ) ) ( (lv_statementConstructor_5_0= ruleStatement_block ) )
            {
            // InternalMyDsl.g:872:2: ( (lv_modifiersConstructor_0_0= ruleModifier ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_MOD && LA22_0<=RULE_STATIC)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:873:1: (lv_modifiersConstructor_0_0= ruleModifier )
            	    {
            	    // InternalMyDsl.g:873:1: (lv_modifiersConstructor_0_0= ruleModifier )
            	    // InternalMyDsl.g:874:3: lv_modifiersConstructor_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getModifiersConstructorModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_modifiersConstructor_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConstructor_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiersConstructor",
            	              		lv_modifiersConstructor_0_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalMyDsl.g:890:3: ( (lv_nameConstructor_1_0= RULE_ID ) )
            // InternalMyDsl.g:891:1: (lv_nameConstructor_1_0= RULE_ID )
            {
            // InternalMyDsl.g:891:1: (lv_nameConstructor_1_0= RULE_ID )
            // InternalMyDsl.g:892:3: lv_nameConstructor_1_0= RULE_ID
            {
            lv_nameConstructor_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nameConstructor_1_0, grammarAccess.getConstructor_declarationAccess().getNameConstructorIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstructor_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nameConstructor",
                      		lv_nameConstructor_1_0, 
                      		"org.xtext.example.mydsl.MyDsl.ID");
              	    
            }

            }


            }

            // InternalMyDsl.g:908:2: ( (lv_lParen_2_0= RULE_LPAREN ) )
            // InternalMyDsl.g:909:1: (lv_lParen_2_0= RULE_LPAREN )
            {
            // InternalMyDsl.g:909:1: (lv_lParen_2_0= RULE_LPAREN )
            // InternalMyDsl.g:910:3: lv_lParen_2_0= RULE_LPAREN
            {
            lv_lParen_2_0=(Token)match(input,RULE_LPAREN,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_lParen_2_0, grammarAccess.getConstructor_declarationAccess().getLParenLPARENTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstructor_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"lParen",
                      		lv_lParen_2_0, 
                      		"org.xtext.example.mydsl.MyDsl.LPAREN");
              	    
            }

            }


            }

            // InternalMyDsl.g:926:2: ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||(LA23_0>=79 && LA23_0<=87)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:927:1: (lv_parameterListConstructor_3_0= ruleParameter_list )
                    {
                    // InternalMyDsl.g:927:1: (lv_parameterListConstructor_3_0= ruleParameter_list )
                    // InternalMyDsl.g:928:3: lv_parameterListConstructor_3_0= ruleParameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getParameterListConstructorParameter_listParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_19);
                    lv_parameterListConstructor_3_0=ruleParameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstructor_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterListConstructor",
                              		lv_parameterListConstructor_3_0, 
                              		"org.xtext.example.mydsl.MyDsl.Parameter_list");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:944:3: ( (lv_rparent_4_0= RULE_RPAREN ) )
            // InternalMyDsl.g:945:1: (lv_rparent_4_0= RULE_RPAREN )
            {
            // InternalMyDsl.g:945:1: (lv_rparent_4_0= RULE_RPAREN )
            // InternalMyDsl.g:946:3: lv_rparent_4_0= RULE_RPAREN
            {
            lv_rparent_4_0=(Token)match(input,RULE_RPAREN,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_4_0, grammarAccess.getConstructor_declarationAccess().getRparentRPARENTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstructor_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_4_0, 
                      		"org.xtext.example.mydsl.MyDsl.RPAREN");
              	    
            }

            }


            }

            // InternalMyDsl.g:962:2: ( (lv_statementConstructor_5_0= ruleStatement_block ) )
            // InternalMyDsl.g:963:1: (lv_statementConstructor_5_0= ruleStatement_block )
            {
            // InternalMyDsl.g:963:1: (lv_statementConstructor_5_0= ruleStatement_block )
            // InternalMyDsl.g:964:3: lv_statementConstructor_5_0= ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getStatementConstructorStatement_blockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_statementConstructor_5_0=ruleStatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstructor_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"statementConstructor",
                      		lv_statementConstructor_5_0, 
                      		"org.xtext.example.mydsl.MyDsl.Statement_block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstructor_declaration"


    // $ANTLR start "entryRuleParameter_list"
    // InternalMyDsl.g:988:1: entryRuleParameter_list returns [EObject current=null] : iv_ruleParameter_list= ruleParameter_list EOF ;
    public final EObject entryRuleParameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter_list = null;


        try {
            // InternalMyDsl.g:989:2: (iv_ruleParameter_list= ruleParameter_list EOF )
            // InternalMyDsl.g:990:2: iv_ruleParameter_list= ruleParameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter_list=ruleParameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter_list; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter_list"


    // $ANTLR start "ruleParameter_list"
    // InternalMyDsl.g:997:1: ruleParameter_list returns [EObject current=null] : ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameter_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:1000:28: ( ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // InternalMyDsl.g:1001:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // InternalMyDsl.g:1001:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // InternalMyDsl.g:1001:2: ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            // InternalMyDsl.g:1001:2: ( (lv_parameter_0_0= ruleParameter ) )
            // InternalMyDsl.g:1002:1: (lv_parameter_0_0= ruleParameter )
            {
            // InternalMyDsl.g:1002:1: (lv_parameter_0_0= ruleParameter )
            // InternalMyDsl.g:1003:3: lv_parameter_0_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_24);
            lv_parameter_0_0=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameter_listRule());
              	        }
                     		set(
                     			current, 
                     			"parameter",
                      		lv_parameter_0_0, 
                      		"org.xtext.example.mydsl.MyDsl.Parameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMyDsl.g:1019:2: (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==72) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:1019:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,72,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalMyDsl.g:1023:1: ( (lv_parameters_2_0= ruleParameter ) )
            	    // InternalMyDsl.g:1024:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // InternalMyDsl.g:1024:1: (lv_parameters_2_0= ruleParameter )
            	    // InternalMyDsl.g:1025:3: lv_parameters_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParameter_listRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_2_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Parameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParameter_list"


    // $ANTLR start "entryRuleParameter"
    // InternalMyDsl.g:1049:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMyDsl.g:1050:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalMyDsl.g:1051:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMyDsl.g:1058:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_parameterName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:1061:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* ) )
            // InternalMyDsl.g:1062:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* )
            {
            // InternalMyDsl.g:1062:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* )
            // InternalMyDsl.g:1062:2: ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )*
            {
            // InternalMyDsl.g:1062:2: ( (lv_type_0_0= ruleType ) )
            // InternalMyDsl.g:1063:1: (lv_type_0_0= ruleType )
            {
            // InternalMyDsl.g:1063:1: (lv_type_0_0= ruleType )
            // InternalMyDsl.g:1064:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_8);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"org.xtext.example.mydsl.MyDsl.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMyDsl.g:1080:2: ( (lv_parameterName_1_0= RULE_ID ) )
            // InternalMyDsl.g:1081:1: (lv_parameterName_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1081:1: (lv_parameterName_1_0= RULE_ID )
            // InternalMyDsl.g:1082:3: lv_parameterName_1_0= RULE_ID
            {
            lv_parameterName_1_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_parameterName_1_0, grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"parameterName",
                      		lv_parameterName_1_0, 
                      		"org.xtext.example.mydsl.MyDsl.ID");
              	    
            }

            }


            }

            // InternalMyDsl.g:1098:2: ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==75) ) {
                    alt25=1;
                }
                else if ( (LA25_0==77) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:1098:3: (otherlv_2= '[' otherlv_3= ']' )
            	    {
            	    // InternalMyDsl.g:1098:3: (otherlv_2= '[' otherlv_3= ']' )
            	    // InternalMyDsl.g:1098:5: otherlv_2= '[' otherlv_3= ']'
            	    {
            	    otherlv_2=(Token)match(input,75,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_0_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,76,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:1107:7: otherlv_4= '[]'
            	    {
            	    otherlv_4=(Token)match(input,77,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleVariable_declaration"
    // InternalMyDsl.g:1119:1: entryRuleVariable_declaration returns [EObject current=null] : iv_ruleVariable_declaration= ruleVariable_declaration EOF ;
    public final EObject entryRuleVariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declaration = null;


        try {
            // InternalMyDsl.g:1120:2: (iv_ruleVariable_declaration= ruleVariable_declaration EOF )
            // InternalMyDsl.g:1121:2: iv_ruleVariable_declaration= ruleVariable_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable_declaration=ruleVariable_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_declaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable_declaration"


    // $ANTLR start "ruleVariable_declaration"
    // InternalMyDsl.g:1128:1: ruleVariable_declaration returns [EObject current=null] : ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleVariable_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_modifiersVariable_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_nameVariable_2_0 = null;

        EObject lv_names_4_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:1131:28: ( ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' ) )
            // InternalMyDsl.g:1132:1: ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' )
            {
            // InternalMyDsl.g:1132:1: ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' )
            // InternalMyDsl.g:1132:2: ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';'
            {
            // InternalMyDsl.g:1132:2: ( (lv_modifiersVariable_0_0= ruleModifier ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_MOD && LA26_0<=RULE_STATIC)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:1133:1: (lv_modifiersVariable_0_0= ruleModifier )
            	    {
            	    // InternalMyDsl.g:1133:1: (lv_modifiersVariable_0_0= ruleModifier )
            	    // InternalMyDsl.g:1134:3: lv_modifiersVariable_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getModifiersVariableModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_modifiersVariable_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiersVariable",
            	              		lv_modifiersVariable_0_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalMyDsl.g:1150:3: ( (lv_type_1_0= ruleType ) )
            // InternalMyDsl.g:1151:1: (lv_type_1_0= ruleType )
            {
            // InternalMyDsl.g:1151:1: (lv_type_1_0= ruleType )
            // InternalMyDsl.g:1152:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_8);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"org.xtext.example.mydsl.MyDsl.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMyDsl.g:1168:2: ( (lv_nameVariable_2_0= ruleVariable_declarator ) )
            // InternalMyDsl.g:1169:1: (lv_nameVariable_2_0= ruleVariable_declarator )
            {
            // InternalMyDsl.g:1169:1: (lv_nameVariable_2_0= ruleVariable_declarator )
            // InternalMyDsl.g:1170:3: lv_nameVariable_2_0= ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNameVariableVariable_declaratorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_26);
            lv_nameVariable_2_0=ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"nameVariable",
                      		lv_nameVariable_2_0, 
                      		"org.xtext.example.mydsl.MyDsl.Variable_declarator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMyDsl.g:1186:2: (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==72) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:1186:4: otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) )
            	    {
            	    otherlv_3=(Token)match(input,72,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalMyDsl.g:1190:1: ( (lv_names_4_0= ruleVariable_declarator ) )
            	    // InternalMyDsl.g:1191:1: (lv_names_4_0= ruleVariable_declarator )
            	    {
            	    // InternalMyDsl.g:1191:1: (lv_names_4_0= ruleVariable_declarator )
            	    // InternalMyDsl.g:1192:3: lv_names_4_0= ruleVariable_declarator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_names_4_0=ruleVariable_declarator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"names",
            	              		lv_names_4_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Variable_declarator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariable_declaration"


    // $ANTLR start "entryRuleVariable_declarator"
    // InternalMyDsl.g:1220:1: entryRuleVariable_declarator returns [EObject current=null] : iv_ruleVariable_declarator= ruleVariable_declarator EOF ;
    public final EObject entryRuleVariable_declarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declarator = null;


        try {
            // InternalMyDsl.g:1221:2: (iv_ruleVariable_declarator= ruleVariable_declarator EOF )
            // InternalMyDsl.g:1222:2: iv_ruleVariable_declarator= ruleVariable_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declaratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable_declarator=ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_declarator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable_declarator"


    // $ANTLR start "ruleVariable_declarator"
    // InternalMyDsl.g:1229:1: ruleVariable_declarator returns [EObject current=null] : ( ( (lv_nameVariable_0_0= RULE_ID ) ) ( ( ( (lv_lenVector_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_lenVector_3_0= '[]' ) ) )* (otherlv_4= '=' ( (lv_vari_5_0= ruleVariable_initializer ) ) )? ) ;
    public final EObject ruleVariable_declarator() throws RecognitionException {
        EObject current = null;

        Token lv_nameVariable_0_0=null;
        Token lv_lenVector_1_0=null;
        Token otherlv_2=null;
        Token lv_lenVector_3_0=null;
        Token otherlv_4=null;
        EObject lv_vari_5_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:1232:28: ( ( ( (lv_nameVariable_0_0= RULE_ID ) ) ( ( ( (lv_lenVector_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_lenVector_3_0= '[]' ) ) )* (otherlv_4= '=' ( (lv_vari_5_0= ruleVariable_initializer ) ) )? ) )
            // InternalMyDsl.g:1233:1: ( ( (lv_nameVariable_0_0= RULE_ID ) ) ( ( ( (lv_lenVector_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_lenVector_3_0= '[]' ) ) )* (otherlv_4= '=' ( (lv_vari_5_0= ruleVariable_initializer ) ) )? )
            {
            // InternalMyDsl.g:1233:1: ( ( (lv_nameVariable_0_0= RULE_ID ) ) ( ( ( (lv_lenVector_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_lenVector_3_0= '[]' ) ) )* (otherlv_4= '=' ( (lv_vari_5_0= ruleVariable_initializer ) ) )? )
            // InternalMyDsl.g:1233:2: ( (lv_nameVariable_0_0= RULE_ID ) ) ( ( ( (lv_lenVector_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_lenVector_3_0= '[]' ) ) )* (otherlv_4= '=' ( (lv_vari_5_0= ruleVariable_initializer ) ) )?
            {
            // InternalMyDsl.g:1233:2: ( (lv_nameVariable_0_0= RULE_ID ) )
            // InternalMyDsl.g:1234:1: (lv_nameVariable_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1234:1: (lv_nameVariable_0_0= RULE_ID )
            // InternalMyDsl.g:1235:3: lv_nameVariable_0_0= RULE_ID
            {
            lv_nameVariable_0_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nameVariable_0_0, grammarAccess.getVariable_declaratorAccess().getNameVariableIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariable_declaratorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nameVariable",
                      		lv_nameVariable_0_0, 
                      		"org.xtext.example.mydsl.MyDsl.ID");
              	    
            }

            }


            }

            // InternalMyDsl.g:1251:2: ( ( ( (lv_lenVector_1_0= '[' ) ) otherlv_2= ']' ) | ( (lv_lenVector_3_0= '[]' ) ) )*
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==75) ) {
                    alt28=1;
                }
                else if ( (LA28_0==77) ) {
                    alt28=2;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:1251:3: ( ( (lv_lenVector_1_0= '[' ) ) otherlv_2= ']' )
            	    {
            	    // InternalMyDsl.g:1251:3: ( ( (lv_lenVector_1_0= '[' ) ) otherlv_2= ']' )
            	    // InternalMyDsl.g:1251:4: ( (lv_lenVector_1_0= '[' ) ) otherlv_2= ']'
            	    {
            	    // InternalMyDsl.g:1251:4: ( (lv_lenVector_1_0= '[' ) )
            	    // InternalMyDsl.g:1252:1: (lv_lenVector_1_0= '[' )
            	    {
            	    // InternalMyDsl.g:1252:1: (lv_lenVector_1_0= '[' )
            	    // InternalMyDsl.g:1253:3: lv_lenVector_1_0= '['
            	    {
            	    lv_lenVector_1_0=(Token)match(input,75,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_lenVector_1_0, grammarAccess.getVariable_declaratorAccess().getLenVectorLeftSquareBracketKeyword_1_0_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVariable_declaratorRule());
            	      	        }
            	             		addWithLastConsumed(current, "lenVector", lv_lenVector_1_0, "[");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_2=(Token)match(input,76,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVariable_declaratorAccess().getRightSquareBracketKeyword_1_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:1271:6: ( (lv_lenVector_3_0= '[]' ) )
            	    {
            	    // InternalMyDsl.g:1271:6: ( (lv_lenVector_3_0= '[]' ) )
            	    // InternalMyDsl.g:1272:1: (lv_lenVector_3_0= '[]' )
            	    {
            	    // InternalMyDsl.g:1272:1: (lv_lenVector_3_0= '[]' )
            	    // InternalMyDsl.g:1273:3: lv_lenVector_3_0= '[]'
            	    {
            	    lv_lenVector_3_0=(Token)match(input,77,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_lenVector_3_0, grammarAccess.getVariable_declaratorAccess().getLenVectorLeftSquareBracketRightSquareBracketKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVariable_declaratorRule());
            	      	        }
            	             		addWithLastConsumed(current, "lenVector", lv_lenVector_3_0, "[]");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalMyDsl.g:1286:4: (otherlv_4= '=' ( (lv_vari_5_0= ruleVariable_initializer ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==78) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1286:6: otherlv_4= '=' ( (lv_vari_5_0= ruleVariable_initializer ) )
                    {
                    otherlv_4=(Token)match(input,78,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariable_declaratorAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // InternalMyDsl.g:1290:1: ( (lv_vari_5_0= ruleVariable_initializer ) )
                    // InternalMyDsl.g:1291:1: (lv_vari_5_0= ruleVariable_initializer )
                    {
                    // InternalMyDsl.g:1291:1: (lv_vari_5_0= ruleVariable_initializer )
                    // InternalMyDsl.g:1292:3: lv_vari_5_0= ruleVariable_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_declaratorAccess().getVariVariable_initializerParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_vari_5_0=ruleVariable_initializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariable_declaratorRule());
                      	        }
                             		set(
                             			current, 
                             			"vari",
                              		lv_vari_5_0, 
                              		"org.xtext.example.mydsl.MyDsl.Variable_initializer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariable_declarator"


    // $ANTLR start "entryRuleVariable_initializer"
    // InternalMyDsl.g:1316:1: entryRuleVariable_initializer returns [EObject current=null] : iv_ruleVariable_initializer= ruleVariable_initializer EOF ;
    public final EObject entryRuleVariable_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_initializer = null;


        try {
            // InternalMyDsl.g:1317:2: (iv_ruleVariable_initializer= ruleVariable_initializer EOF )
            // InternalMyDsl.g:1318:2: iv_ruleVariable_initializer= ruleVariable_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_initializerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable_initializer=ruleVariable_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_initializer; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable_initializer"


    // $ANTLR start "ruleVariable_initializer"
    // InternalMyDsl.g:1325:1: ruleVariable_initializer returns [EObject current=null] : ( ( (lv_array_init_0_0= ruleArray_initializer ) ) | ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable_initializer() throws RecognitionException {
        EObject current = null;

        EObject lv_array_init_0_0 = null;

        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:1328:28: ( ( ( (lv_array_init_0_0= ruleArray_initializer ) ) | ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:1329:1: ( ( (lv_array_init_0_0= ruleArray_initializer ) ) | ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:1329:1: ( ( (lv_array_init_0_0= ruleArray_initializer ) ) | ( (lv_expression_1_0= ruleExpression ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_R_CURLY_BRACE) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID||LA30_0==RULE_LPAREN||(LA30_0>=RULE_NULL && LA30_0<=RULE_THIS)||(LA30_0>=RULE_INCREMENT && LA30_0<=RULE_DECREMENT)||LA30_0==RULE_DECIMAL_DIGITS||LA30_0==RULE_HEXA||(LA30_0>=RULE_STRING && LA30_0<=RULE_FALSE)||LA30_0==96) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1329:2: ( (lv_array_init_0_0= ruleArray_initializer ) )
                    {
                    // InternalMyDsl.g:1329:2: ( (lv_array_init_0_0= ruleArray_initializer ) )
                    // InternalMyDsl.g:1330:1: (lv_array_init_0_0= ruleArray_initializer )
                    {
                    // InternalMyDsl.g:1330:1: (lv_array_init_0_0= ruleArray_initializer )
                    // InternalMyDsl.g:1331:3: lv_array_init_0_0= ruleArray_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getArray_initArray_initializerParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_array_init_0_0=ruleArray_initializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariable_initializerRule());
                      	        }
                             		set(
                             			current, 
                             			"array_init",
                              		lv_array_init_0_0, 
                              		"org.xtext.example.mydsl.MyDsl.Array_initializer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1348:6: ( (lv_expression_1_0= ruleExpression ) )
                    {
                    // InternalMyDsl.g:1348:6: ( (lv_expression_1_0= ruleExpression ) )
                    // InternalMyDsl.g:1349:1: (lv_expression_1_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1349:1: (lv_expression_1_0= ruleExpression )
                    // InternalMyDsl.g:1350:3: lv_expression_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getExpressionExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariable_initializerRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_1_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariable_initializer"


    // $ANTLR start "entryRuleArray_initializer"
    // InternalMyDsl.g:1374:1: entryRuleArray_initializer returns [EObject current=null] : iv_ruleArray_initializer= ruleArray_initializer EOF ;
    public final EObject entryRuleArray_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray_initializer = null;


        try {
            // InternalMyDsl.g:1375:2: (iv_ruleArray_initializer= ruleArray_initializer EOF )
            // InternalMyDsl.g:1376:2: iv_ruleArray_initializer= ruleArray_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArray_initializerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArray_initializer=ruleArray_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray_initializer; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArray_initializer"


    // $ANTLR start "ruleArray_initializer"
    // InternalMyDsl.g:1383:1: ruleArray_initializer returns [EObject current=null] : ( () this_R_CURLY_BRACE_1= RULE_R_CURLY_BRACE ( ( (lv_variableinitializer_2_0= ruleVariable_initializer ) ) (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )* (otherlv_5= ',' )? )? this_L_CURLY_BRACE_6= RULE_L_CURLY_BRACE ) ;
    public final EObject ruleArray_initializer() throws RecognitionException {
        EObject current = null;

        Token this_R_CURLY_BRACE_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_L_CURLY_BRACE_6=null;
        EObject lv_variableinitializer_2_0 = null;

        EObject lv_variableinitializer_4_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:1386:28: ( ( () this_R_CURLY_BRACE_1= RULE_R_CURLY_BRACE ( ( (lv_variableinitializer_2_0= ruleVariable_initializer ) ) (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )* (otherlv_5= ',' )? )? this_L_CURLY_BRACE_6= RULE_L_CURLY_BRACE ) )
            // InternalMyDsl.g:1387:1: ( () this_R_CURLY_BRACE_1= RULE_R_CURLY_BRACE ( ( (lv_variableinitializer_2_0= ruleVariable_initializer ) ) (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )* (otherlv_5= ',' )? )? this_L_CURLY_BRACE_6= RULE_L_CURLY_BRACE )
            {
            // InternalMyDsl.g:1387:1: ( () this_R_CURLY_BRACE_1= RULE_R_CURLY_BRACE ( ( (lv_variableinitializer_2_0= ruleVariable_initializer ) ) (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )* (otherlv_5= ',' )? )? this_L_CURLY_BRACE_6= RULE_L_CURLY_BRACE )
            // InternalMyDsl.g:1387:2: () this_R_CURLY_BRACE_1= RULE_R_CURLY_BRACE ( ( (lv_variableinitializer_2_0= ruleVariable_initializer ) ) (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )* (otherlv_5= ',' )? )? this_L_CURLY_BRACE_6= RULE_L_CURLY_BRACE
            {
            // InternalMyDsl.g:1387:2: ()
            // InternalMyDsl.g:1388:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArray_initializerAccess().getArray_initializerAction_0(),
                          current);
                  
            }

            }

            this_R_CURLY_BRACE_1=(Token)match(input,RULE_R_CURLY_BRACE,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_R_CURLY_BRACE_1, grammarAccess.getArray_initializerAccess().getR_CURLY_BRACETerminalRuleCall_1()); 
                  
            }
            // InternalMyDsl.g:1400:1: ( ( (lv_variableinitializer_2_0= ruleVariable_initializer ) ) (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )* (otherlv_5= ',' )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||LA33_0==RULE_R_CURLY_BRACE||LA33_0==RULE_LPAREN||(LA33_0>=RULE_NULL && LA33_0<=RULE_THIS)||(LA33_0>=RULE_INCREMENT && LA33_0<=RULE_DECREMENT)||LA33_0==RULE_DECIMAL_DIGITS||LA33_0==RULE_HEXA||(LA33_0>=RULE_STRING && LA33_0<=RULE_FALSE)||LA33_0==96) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1400:2: ( (lv_variableinitializer_2_0= ruleVariable_initializer ) ) (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )* (otherlv_5= ',' )?
                    {
                    // InternalMyDsl.g:1400:2: ( (lv_variableinitializer_2_0= ruleVariable_initializer ) )
                    // InternalMyDsl.g:1401:1: (lv_variableinitializer_2_0= ruleVariable_initializer )
                    {
                    // InternalMyDsl.g:1401:1: (lv_variableinitializer_2_0= ruleVariable_initializer )
                    // InternalMyDsl.g:1402:3: lv_variableinitializer_2_0= ruleVariable_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArray_initializerAccess().getVariableinitializerVariable_initializerParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_30);
                    lv_variableinitializer_2_0=ruleVariable_initializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArray_initializerRule());
                      	        }
                             		add(
                             			current, 
                             			"variableinitializer",
                              		lv_variableinitializer_2_0, 
                              		"org.xtext.example.mydsl.MyDsl.Variable_initializer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:1418:2: (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==72) ) {
                            int LA31_1 = input.LA(2);

                            if ( (LA31_1==RULE_ID||LA31_1==RULE_R_CURLY_BRACE||LA31_1==RULE_LPAREN||(LA31_1>=RULE_NULL && LA31_1<=RULE_THIS)||(LA31_1>=RULE_INCREMENT && LA31_1<=RULE_DECREMENT)||LA31_1==RULE_DECIMAL_DIGITS||LA31_1==RULE_HEXA||(LA31_1>=RULE_STRING && LA31_1<=RULE_FALSE)||LA31_1==96) ) {
                                alt31=1;
                            }


                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalMyDsl.g:1418:4: otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) )
                    	    {
                    	    otherlv_3=(Token)match(input,72,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getArray_initializerAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // InternalMyDsl.g:1422:1: ( (lv_variableinitializer_4_0= ruleVariable_initializer ) )
                    	    // InternalMyDsl.g:1423:1: (lv_variableinitializer_4_0= ruleVariable_initializer )
                    	    {
                    	    // InternalMyDsl.g:1423:1: (lv_variableinitializer_4_0= ruleVariable_initializer )
                    	    // InternalMyDsl.g:1424:3: lv_variableinitializer_4_0= ruleVariable_initializer
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArray_initializerAccess().getVariableinitializerVariable_initializerParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_variableinitializer_4_0=ruleVariable_initializer();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArray_initializerRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"variableinitializer",
                    	              		lv_variableinitializer_4_0, 
                    	              		"org.xtext.example.mydsl.MyDsl.Variable_initializer");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // InternalMyDsl.g:1440:4: (otherlv_5= ',' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==72) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalMyDsl.g:1440:6: otherlv_5= ','
                            {
                            otherlv_5=(Token)match(input,72,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getArray_initializerAccess().getCommaKeyword_2_2());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            this_L_CURLY_BRACE_6=(Token)match(input,RULE_L_CURLY_BRACE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_L_CURLY_BRACE_6, grammarAccess.getArray_initializerAccess().getL_CURLY_BRACETerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArray_initializer"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:1456:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:1457:2: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:1458:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:1465:1: ruleType returns [EObject current=null] : ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) ( (lv_typeVector_1_0= '[]' ) )* ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_typeVector_1_0=null;
        EObject lv_typeSpecifier_0_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:1468:28: ( ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) ( (lv_typeVector_1_0= '[]' ) )* ) )
            // InternalMyDsl.g:1469:1: ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) ( (lv_typeVector_1_0= '[]' ) )* )
            {
            // InternalMyDsl.g:1469:1: ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) ( (lv_typeVector_1_0= '[]' ) )* )
            // InternalMyDsl.g:1469:2: ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) ( (lv_typeVector_1_0= '[]' ) )*
            {
            // InternalMyDsl.g:1469:2: ( (lv_typeSpecifier_0_0= ruleType_specifier ) )
            // InternalMyDsl.g:1470:1: (lv_typeSpecifier_0_0= ruleType_specifier )
            {
            // InternalMyDsl.g:1470:1: (lv_typeSpecifier_0_0= ruleType_specifier )
            // InternalMyDsl.g:1471:3: lv_typeSpecifier_0_0= ruleType_specifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getTypeSpecifierType_specifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_32);
            lv_typeSpecifier_0_0=ruleType_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeRule());
              	        }
                     		set(
                     			current, 
                     			"typeSpecifier",
                      		lv_typeSpecifier_0_0, 
                      		"org.xtext.example.mydsl.MyDsl.Type_specifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMyDsl.g:1487:2: ( (lv_typeVector_1_0= '[]' ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==77) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:1488:1: (lv_typeVector_1_0= '[]' )
            	    {
            	    // InternalMyDsl.g:1488:1: (lv_typeVector_1_0= '[]' )
            	    // InternalMyDsl.g:1489:3: lv_typeVector_1_0= '[]'
            	    {
            	    lv_typeVector_1_0=(Token)match(input,77,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_typeVector_1_0, grammarAccess.getTypeAccess().getTypeVectorLeftSquareBracketRightSquareBracketKeyword_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTypeRule());
            	      	        }
            	             		addWithLastConsumed(current, "typeVector", lv_typeVector_1_0, "[]");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleType_specifier"
    // InternalMyDsl.g:1510:1: entryRuleType_specifier returns [EObject current=null] : iv_ruleType_specifier= ruleType_specifier EOF ;
    public final EObject entryRuleType_specifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_specifier = null;


        try {
            // InternalMyDsl.g:1511:2: (iv_ruleType_specifier= ruleType_specifier EOF )
            // InternalMyDsl.g:1512:2: iv_ruleType_specifier= ruleType_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType_specifier=ruleType_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_specifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType_specifier"


    // $ANTLR start "ruleType_specifier"
    // InternalMyDsl.g:1519:1: ruleType_specifier returns [EObject current=null] : ( ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'byte' | lv_primitiveType_0_3= 'char' | lv_primitiveType_0_4= 'short' | lv_primitiveType_0_5= 'int' | lv_primitiveType_0_6= 'float' | lv_primitiveType_0_7= 'long' | lv_primitiveType_0_8= 'double' | lv_primitiveType_0_9= 'void' ) ) ) | ( (lv_className_1_0= ruleClass_name ) ) ) ;
    public final EObject ruleType_specifier() throws RecognitionException {
        EObject current = null;

        Token lv_primitiveType_0_1=null;
        Token lv_primitiveType_0_2=null;
        Token lv_primitiveType_0_3=null;
        Token lv_primitiveType_0_4=null;
        Token lv_primitiveType_0_5=null;
        Token lv_primitiveType_0_6=null;
        Token lv_primitiveType_0_7=null;
        Token lv_primitiveType_0_8=null;
        Token lv_primitiveType_0_9=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:1522:28: ( ( ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'byte' | lv_primitiveType_0_3= 'char' | lv_primitiveType_0_4= 'short' | lv_primitiveType_0_5= 'int' | lv_primitiveType_0_6= 'float' | lv_primitiveType_0_7= 'long' | lv_primitiveType_0_8= 'double' | lv_primitiveType_0_9= 'void' ) ) ) | ( (lv_className_1_0= ruleClass_name ) ) ) )
            // InternalMyDsl.g:1523:1: ( ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'byte' | lv_primitiveType_0_3= 'char' | lv_primitiveType_0_4= 'short' | lv_primitiveType_0_5= 'int' | lv_primitiveType_0_6= 'float' | lv_primitiveType_0_7= 'long' | lv_primitiveType_0_8= 'double' | lv_primitiveType_0_9= 'void' ) ) ) | ( (lv_className_1_0= ruleClass_name ) ) )
            {
            // InternalMyDsl.g:1523:1: ( ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'byte' | lv_primitiveType_0_3= 'char' | lv_primitiveType_0_4= 'short' | lv_primitiveType_0_5= 'int' | lv_primitiveType_0_6= 'float' | lv_primitiveType_0_7= 'long' | lv_primitiveType_0_8= 'double' | lv_primitiveType_0_9= 'void' ) ) ) | ( (lv_className_1_0= ruleClass_name ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=79 && LA36_0<=87)) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1523:2: ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'byte' | lv_primitiveType_0_3= 'char' | lv_primitiveType_0_4= 'short' | lv_primitiveType_0_5= 'int' | lv_primitiveType_0_6= 'float' | lv_primitiveType_0_7= 'long' | lv_primitiveType_0_8= 'double' | lv_primitiveType_0_9= 'void' ) ) )
                    {
                    // InternalMyDsl.g:1523:2: ( ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'byte' | lv_primitiveType_0_3= 'char' | lv_primitiveType_0_4= 'short' | lv_primitiveType_0_5= 'int' | lv_primitiveType_0_6= 'float' | lv_primitiveType_0_7= 'long' | lv_primitiveType_0_8= 'double' | lv_primitiveType_0_9= 'void' ) ) )
                    // InternalMyDsl.g:1524:1: ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'byte' | lv_primitiveType_0_3= 'char' | lv_primitiveType_0_4= 'short' | lv_primitiveType_0_5= 'int' | lv_primitiveType_0_6= 'float' | lv_primitiveType_0_7= 'long' | lv_primitiveType_0_8= 'double' | lv_primitiveType_0_9= 'void' ) )
                    {
                    // InternalMyDsl.g:1524:1: ( (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'byte' | lv_primitiveType_0_3= 'char' | lv_primitiveType_0_4= 'short' | lv_primitiveType_0_5= 'int' | lv_primitiveType_0_6= 'float' | lv_primitiveType_0_7= 'long' | lv_primitiveType_0_8= 'double' | lv_primitiveType_0_9= 'void' ) )
                    // InternalMyDsl.g:1525:1: (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'byte' | lv_primitiveType_0_3= 'char' | lv_primitiveType_0_4= 'short' | lv_primitiveType_0_5= 'int' | lv_primitiveType_0_6= 'float' | lv_primitiveType_0_7= 'long' | lv_primitiveType_0_8= 'double' | lv_primitiveType_0_9= 'void' )
                    {
                    // InternalMyDsl.g:1525:1: (lv_primitiveType_0_1= 'boolean' | lv_primitiveType_0_2= 'byte' | lv_primitiveType_0_3= 'char' | lv_primitiveType_0_4= 'short' | lv_primitiveType_0_5= 'int' | lv_primitiveType_0_6= 'float' | lv_primitiveType_0_7= 'long' | lv_primitiveType_0_8= 'double' | lv_primitiveType_0_9= 'void' )
                    int alt35=9;
                    switch ( input.LA(1) ) {
                    case 79:
                        {
                        alt35=1;
                        }
                        break;
                    case 80:
                        {
                        alt35=2;
                        }
                        break;
                    case 81:
                        {
                        alt35=3;
                        }
                        break;
                    case 82:
                        {
                        alt35=4;
                        }
                        break;
                    case 83:
                        {
                        alt35=5;
                        }
                        break;
                    case 84:
                        {
                        alt35=6;
                        }
                        break;
                    case 85:
                        {
                        alt35=7;
                        }
                        break;
                    case 86:
                        {
                        alt35=8;
                        }
                        break;
                    case 87:
                        {
                        alt35=9;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }

                    switch (alt35) {
                        case 1 :
                            // InternalMyDsl.g:1526:3: lv_primitiveType_0_1= 'boolean'
                            {
                            lv_primitiveType_0_1=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_primitiveType_0_1, grammarAccess.getType_specifierAccess().getPrimitiveTypeBooleanKeyword_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getType_specifierRule());
                              	        }
                                     		setWithLastConsumed(current, "primitiveType", lv_primitiveType_0_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1538:8: lv_primitiveType_0_2= 'byte'
                            {
                            lv_primitiveType_0_2=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_primitiveType_0_2, grammarAccess.getType_specifierAccess().getPrimitiveTypeByteKeyword_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getType_specifierRule());
                              	        }
                                     		setWithLastConsumed(current, "primitiveType", lv_primitiveType_0_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:1550:8: lv_primitiveType_0_3= 'char'
                            {
                            lv_primitiveType_0_3=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_primitiveType_0_3, grammarAccess.getType_specifierAccess().getPrimitiveTypeCharKeyword_0_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getType_specifierRule());
                              	        }
                                     		setWithLastConsumed(current, "primitiveType", lv_primitiveType_0_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:1562:8: lv_primitiveType_0_4= 'short'
                            {
                            lv_primitiveType_0_4=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_primitiveType_0_4, grammarAccess.getType_specifierAccess().getPrimitiveTypeShortKeyword_0_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getType_specifierRule());
                              	        }
                                     		setWithLastConsumed(current, "primitiveType", lv_primitiveType_0_4, null);
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // InternalMyDsl.g:1574:8: lv_primitiveType_0_5= 'int'
                            {
                            lv_primitiveType_0_5=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_primitiveType_0_5, grammarAccess.getType_specifierAccess().getPrimitiveTypeIntKeyword_0_0_4());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getType_specifierRule());
                              	        }
                                     		setWithLastConsumed(current, "primitiveType", lv_primitiveType_0_5, null);
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // InternalMyDsl.g:1586:8: lv_primitiveType_0_6= 'float'
                            {
                            lv_primitiveType_0_6=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_primitiveType_0_6, grammarAccess.getType_specifierAccess().getPrimitiveTypeFloatKeyword_0_0_5());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getType_specifierRule());
                              	        }
                                     		setWithLastConsumed(current, "primitiveType", lv_primitiveType_0_6, null);
                              	    
                            }

                            }
                            break;
                        case 7 :
                            // InternalMyDsl.g:1598:8: lv_primitiveType_0_7= 'long'
                            {
                            lv_primitiveType_0_7=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_primitiveType_0_7, grammarAccess.getType_specifierAccess().getPrimitiveTypeLongKeyword_0_0_6());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getType_specifierRule());
                              	        }
                                     		setWithLastConsumed(current, "primitiveType", lv_primitiveType_0_7, null);
                              	    
                            }

                            }
                            break;
                        case 8 :
                            // InternalMyDsl.g:1610:8: lv_primitiveType_0_8= 'double'
                            {
                            lv_primitiveType_0_8=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_primitiveType_0_8, grammarAccess.getType_specifierAccess().getPrimitiveTypeDoubleKeyword_0_0_7());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getType_specifierRule());
                              	        }
                                     		setWithLastConsumed(current, "primitiveType", lv_primitiveType_0_8, null);
                              	    
                            }

                            }
                            break;
                        case 9 :
                            // InternalMyDsl.g:1622:8: lv_primitiveType_0_9= 'void'
                            {
                            lv_primitiveType_0_9=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_primitiveType_0_9, grammarAccess.getType_specifierAccess().getPrimitiveTypeVoidKeyword_0_0_8());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getType_specifierRule());
                              	        }
                                     		setWithLastConsumed(current, "primitiveType", lv_primitiveType_0_9, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1638:6: ( (lv_className_1_0= ruleClass_name ) )
                    {
                    // InternalMyDsl.g:1638:6: ( (lv_className_1_0= ruleClass_name ) )
                    // InternalMyDsl.g:1639:1: (lv_className_1_0= ruleClass_name )
                    {
                    // InternalMyDsl.g:1639:1: (lv_className_1_0= ruleClass_name )
                    // InternalMyDsl.g:1640:3: lv_className_1_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_specifierAccess().getClassNameClass_nameParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_className_1_0=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getType_specifierRule());
                      	        }
                             		set(
                             			current, 
                             			"className",
                              		lv_className_1_0, 
                              		"org.xtext.example.mydsl.MyDsl.Class_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleType_specifier"


    // $ANTLR start "entryRuleModifier"
    // InternalMyDsl.g:1664:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // InternalMyDsl.g:1665:2: (iv_ruleModifier= ruleModifier EOF )
            // InternalMyDsl.g:1666:2: iv_ruleModifier= ruleModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModifier=ruleModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // InternalMyDsl.g:1673:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MOD_0=null;
        Token this_STATIC_1=null;

         enterRule(); 
            
        try {
            // InternalMyDsl.g:1676:28: ( (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC ) )
            // InternalMyDsl.g:1677:1: (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC )
            {
            // InternalMyDsl.g:1677:1: (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_MOD) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_STATIC) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1677:6: this_MOD_0= RULE_MOD
                    {
                    this_MOD_0=(Token)match(input,RULE_MOD,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MOD_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MOD_0, grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1685:10: this_STATIC_1= RULE_STATIC
                    {
                    this_STATIC_1=(Token)match(input,RULE_STATIC,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STATIC_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STATIC_1, grammarAccess.getModifierAccess().getSTATICTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleStatic_initializer"
    // InternalMyDsl.g:1700:1: entryRuleStatic_initializer returns [EObject current=null] : iv_ruleStatic_initializer= ruleStatic_initializer EOF ;
    public final EObject entryRuleStatic_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatic_initializer = null;


        try {
            // InternalMyDsl.g:1701:2: (iv_ruleStatic_initializer= ruleStatic_initializer EOF )
            // InternalMyDsl.g:1702:2: iv_ruleStatic_initializer= ruleStatic_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatic_initializerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatic_initializer=ruleStatic_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatic_initializer; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatic_initializer"


    // $ANTLR start "ruleStatic_initializer"
    // InternalMyDsl.g:1709:1: ruleStatic_initializer returns [EObject current=null] : ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) ) ;
    public final EObject ruleStatic_initializer() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:1712:28: ( ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) ) )
            // InternalMyDsl.g:1713:1: ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) )
            {
            // InternalMyDsl.g:1713:1: ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) )
            // InternalMyDsl.g:1713:2: ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) )
            {
            // InternalMyDsl.g:1713:2: ( (lv_static_0_0= RULE_STATIC ) )
            // InternalMyDsl.g:1714:1: (lv_static_0_0= RULE_STATIC )
            {
            // InternalMyDsl.g:1714:1: (lv_static_0_0= RULE_STATIC )
            // InternalMyDsl.g:1715:3: lv_static_0_0= RULE_STATIC
            {
            lv_static_0_0=(Token)match(input,RULE_STATIC,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_static_0_0, grammarAccess.getStatic_initializerAccess().getStaticSTATICTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStatic_initializerRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"static",
                      		lv_static_0_0, 
                      		"org.xtext.example.mydsl.MyDsl.STATIC");
              	    
            }

            }


            }

            // InternalMyDsl.g:1731:2: ( (lv_name_1_0= ruleStatement_block ) )
            // InternalMyDsl.g:1732:1: (lv_name_1_0= ruleStatement_block )
            {
            // InternalMyDsl.g:1732:1: (lv_name_1_0= ruleStatement_block )
            // InternalMyDsl.g:1733:3: lv_name_1_0= ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleStatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatic_initializerRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.xtext.example.mydsl.MyDsl.Statement_block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatic_initializer"


    // $ANTLR start "entryRuleStatement_block"
    // InternalMyDsl.g:1757:1: entryRuleStatement_block returns [EObject current=null] : iv_ruleStatement_block= ruleStatement_block EOF ;
    public final EObject entryRuleStatement_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_block = null;


        try {
            // InternalMyDsl.g:1758:2: (iv_ruleStatement_block= ruleStatement_block EOF )
            // InternalMyDsl.g:1759:2: iv_ruleStatement_block= ruleStatement_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_blockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement_block=ruleStatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_block; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement_block"


    // $ANTLR start "ruleStatement_block"
    // InternalMyDsl.g:1766:1: ruleStatement_block returns [EObject current=null] : ( () ( (lv_rCurly_1_0= RULE_R_CURLY_BRACE ) ) ( (lv_statments_2_0= ruleStatement ) )* ( (lv_lCurly_3_0= RULE_L_CURLY_BRACE ) ) ) ;
    public final EObject ruleStatement_block() throws RecognitionException {
        EObject current = null;

        Token lv_rCurly_1_0=null;
        Token lv_lCurly_3_0=null;
        EObject lv_statments_2_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:1769:28: ( ( () ( (lv_rCurly_1_0= RULE_R_CURLY_BRACE ) ) ( (lv_statments_2_0= ruleStatement ) )* ( (lv_lCurly_3_0= RULE_L_CURLY_BRACE ) ) ) )
            // InternalMyDsl.g:1770:1: ( () ( (lv_rCurly_1_0= RULE_R_CURLY_BRACE ) ) ( (lv_statments_2_0= ruleStatement ) )* ( (lv_lCurly_3_0= RULE_L_CURLY_BRACE ) ) )
            {
            // InternalMyDsl.g:1770:1: ( () ( (lv_rCurly_1_0= RULE_R_CURLY_BRACE ) ) ( (lv_statments_2_0= ruleStatement ) )* ( (lv_lCurly_3_0= RULE_L_CURLY_BRACE ) ) )
            // InternalMyDsl.g:1770:2: () ( (lv_rCurly_1_0= RULE_R_CURLY_BRACE ) ) ( (lv_statments_2_0= ruleStatement ) )* ( (lv_lCurly_3_0= RULE_L_CURLY_BRACE ) )
            {
            // InternalMyDsl.g:1770:2: ()
            // InternalMyDsl.g:1771:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatement_blockAccess().getStatement_blockAction_0(),
                          current);
                  
            }

            }

            // InternalMyDsl.g:1779:2: ( (lv_rCurly_1_0= RULE_R_CURLY_BRACE ) )
            // InternalMyDsl.g:1780:1: (lv_rCurly_1_0= RULE_R_CURLY_BRACE )
            {
            // InternalMyDsl.g:1780:1: (lv_rCurly_1_0= RULE_R_CURLY_BRACE )
            // InternalMyDsl.g:1781:3: lv_rCurly_1_0= RULE_R_CURLY_BRACE
            {
            lv_rCurly_1_0=(Token)match(input,RULE_R_CURLY_BRACE,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rCurly_1_0, grammarAccess.getStatement_blockAccess().getRCurlyR_CURLY_BRACETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStatement_blockRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rCurly",
                      		lv_rCurly_1_0, 
                      		"org.xtext.example.mydsl.MyDsl.R_CURLY_BRACE");
              	    
            }

            }


            }

            // InternalMyDsl.g:1797:2: ( (lv_statments_2_0= ruleStatement ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==RULE_R_CURLY_BRACE||LA38_0==RULE_LPAREN||(LA38_0>=RULE_MOD && LA38_0<=RULE_STATIC)||(LA38_0>=RULE_NULL && LA38_0<=RULE_THIS)||(LA38_0>=RULE_INCREMENT && LA38_0<=RULE_DECREMENT)||LA38_0==RULE_DECIMAL_DIGITS||LA38_0==RULE_HEXA||(LA38_0>=RULE_STRING && LA38_0<=RULE_FALSE)||LA38_0==71||(LA38_0>=79 && LA38_0<=93)||(LA38_0>=96 && LA38_0<=97)||(LA38_0>=100 && LA38_0<=101)||LA38_0==103||LA38_0==105) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:1798:1: (lv_statments_2_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:1798:1: (lv_statments_2_0= ruleStatement )
            	    // InternalMyDsl.g:1799:3: lv_statments_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatement_blockAccess().getStatmentsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_statments_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatement_blockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statments",
            	              		lv_statments_2_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // InternalMyDsl.g:1815:3: ( (lv_lCurly_3_0= RULE_L_CURLY_BRACE ) )
            // InternalMyDsl.g:1816:1: (lv_lCurly_3_0= RULE_L_CURLY_BRACE )
            {
            // InternalMyDsl.g:1816:1: (lv_lCurly_3_0= RULE_L_CURLY_BRACE )
            // InternalMyDsl.g:1817:3: lv_lCurly_3_0= RULE_L_CURLY_BRACE
            {
            lv_lCurly_3_0=(Token)match(input,RULE_L_CURLY_BRACE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_lCurly_3_0, grammarAccess.getStatement_blockAccess().getLCurlyL_CURLY_BRACETerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStatement_blockRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"lCurly",
                      		lv_lCurly_3_0, 
                      		"org.xtext.example.mydsl.MyDsl.L_CURLY_BRACE");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement_block"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:1841:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:1842:2: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:1843:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:1850:1: ruleStatement returns [EObject current=null] : ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) | ( (lv_ifStatement_3_0= ruleIf_statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_statement ) ) | (otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) ) ) | ( () ( (lv_ret_13_0= 'return' ) ) ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';' ) | ( () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) | ( (lv_statementBlock_20_0= ruleStatement_block ) ) | ( (lv_tryStatement_21_0= ruleTry_statement ) ) | ( ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) ) ) | ( () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';' ) | ( () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';' ) | ( () otherlv_34= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_g_2_0=null;
        Token otherlv_8=null;
        Token lv_rparent_10_0=null;
        Token lv_ret_13_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_nameStatement_22_0=null;
        Token this_COLON_23=null;
        Token otherlv_26=null;
        Token lv_name_27_0=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token lv_name_31_0=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        EObject lv_variableDeclaration_0_0 = null;

        EObject lv_expressionStatement_1_0 = null;

        EObject lv_ifStatement_3_0 = null;

        EObject lv_doStatement_4_0 = null;

        EObject lv_whileStatement_5_0 = null;

        EObject lv_forStatement_6_0 = null;

        EObject lv_switchStatement_7_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_syncStatement_11_0 = null;

        EObject lv_expression_14_0 = null;

        EObject lv_expression_18_0 = null;

        EObject lv_statementBlock_20_0 = null;

        EObject lv_tryStatement_21_0 = null;

        EObject lv_statement_24_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:1853:28: ( ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) | ( (lv_ifStatement_3_0= ruleIf_statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_statement ) ) | (otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) ) ) | ( () ( (lv_ret_13_0= 'return' ) ) ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';' ) | ( () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) | ( (lv_statementBlock_20_0= ruleStatement_block ) ) | ( (lv_tryStatement_21_0= ruleTry_statement ) ) | ( ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) ) ) | ( () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';' ) | ( () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';' ) | ( () otherlv_34= ';' ) ) )
            // InternalMyDsl.g:1854:1: ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) | ( (lv_ifStatement_3_0= ruleIf_statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_statement ) ) | (otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) ) ) | ( () ( (lv_ret_13_0= 'return' ) ) ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';' ) | ( () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) | ( (lv_statementBlock_20_0= ruleStatement_block ) ) | ( (lv_tryStatement_21_0= ruleTry_statement ) ) | ( ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) ) ) | ( () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';' ) | ( () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';' ) | ( () otherlv_34= ';' ) )
            {
            // InternalMyDsl.g:1854:1: ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) | ( (lv_ifStatement_3_0= ruleIf_statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_statement ) ) | (otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) ) ) | ( () ( (lv_ret_13_0= 'return' ) ) ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';' ) | ( () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) | ( (lv_statementBlock_20_0= ruleStatement_block ) ) | ( (lv_tryStatement_21_0= ruleTry_statement ) ) | ( ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) ) ) | ( () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';' ) | ( () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';' ) | ( () otherlv_34= ';' ) )
            int alt43=16;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:1854:2: ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) )
                    {
                    // InternalMyDsl.g:1854:2: ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) )
                    // InternalMyDsl.g:1855:1: (lv_variableDeclaration_0_0= ruleVariable_declaration )
                    {
                    // InternalMyDsl.g:1855:1: (lv_variableDeclaration_0_0= ruleVariable_declaration )
                    // InternalMyDsl.g:1856:3: lv_variableDeclaration_0_0= ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationVariable_declarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_variableDeclaration_0_0=ruleVariable_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"variableDeclaration",
                              		lv_variableDeclaration_0_0, 
                              		"org.xtext.example.mydsl.MyDsl.Variable_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1873:6: ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) )
                    {
                    // InternalMyDsl.g:1873:6: ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) )
                    // InternalMyDsl.g:1873:7: ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) )
                    {
                    // InternalMyDsl.g:1873:7: ( (lv_expressionStatement_1_0= ruleExpression ) )
                    // InternalMyDsl.g:1874:1: (lv_expressionStatement_1_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1874:1: (lv_expressionStatement_1_0= ruleExpression )
                    // InternalMyDsl.g:1875:3: lv_expressionStatement_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionStatementExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_6);
                    lv_expressionStatement_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		add(
                             			current, 
                             			"expressionStatement",
                              		lv_expressionStatement_1_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:1891:2: ( (lv_g_2_0= ';' ) )
                    // InternalMyDsl.g:1892:1: (lv_g_2_0= ';' )
                    {
                    // InternalMyDsl.g:1892:1: (lv_g_2_0= ';' )
                    // InternalMyDsl.g:1893:3: lv_g_2_0= ';'
                    {
                    lv_g_2_0=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_g_2_0, grammarAccess.getStatementAccess().getGSemicolonKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatementRule());
                      	        }
                             		setWithLastConsumed(current, "g", lv_g_2_0, ";");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1907:6: ( (lv_ifStatement_3_0= ruleIf_statement ) )
                    {
                    // InternalMyDsl.g:1907:6: ( (lv_ifStatement_3_0= ruleIf_statement ) )
                    // InternalMyDsl.g:1908:1: (lv_ifStatement_3_0= ruleIf_statement )
                    {
                    // InternalMyDsl.g:1908:1: (lv_ifStatement_3_0= ruleIf_statement )
                    // InternalMyDsl.g:1909:3: lv_ifStatement_3_0= ruleIf_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getIfStatementIf_statementParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_ifStatement_3_0=ruleIf_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"ifStatement",
                              		lv_ifStatement_3_0, 
                              		"org.xtext.example.mydsl.MyDsl.If_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1926:6: ( (lv_doStatement_4_0= ruleDo_Statement ) )
                    {
                    // InternalMyDsl.g:1926:6: ( (lv_doStatement_4_0= ruleDo_Statement ) )
                    // InternalMyDsl.g:1927:1: (lv_doStatement_4_0= ruleDo_Statement )
                    {
                    // InternalMyDsl.g:1927:1: (lv_doStatement_4_0= ruleDo_Statement )
                    // InternalMyDsl.g:1928:3: lv_doStatement_4_0= ruleDo_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getDoStatementDo_StatementParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_doStatement_4_0=ruleDo_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"doStatement",
                              		lv_doStatement_4_0, 
                              		"org.xtext.example.mydsl.MyDsl.Do_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1945:6: ( (lv_whileStatement_5_0= ruleWhile_Statement ) )
                    {
                    // InternalMyDsl.g:1945:6: ( (lv_whileStatement_5_0= ruleWhile_Statement ) )
                    // InternalMyDsl.g:1946:1: (lv_whileStatement_5_0= ruleWhile_Statement )
                    {
                    // InternalMyDsl.g:1946:1: (lv_whileStatement_5_0= ruleWhile_Statement )
                    // InternalMyDsl.g:1947:3: lv_whileStatement_5_0= ruleWhile_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementWhile_StatementParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_whileStatement_5_0=ruleWhile_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"whileStatement",
                              		lv_whileStatement_5_0, 
                              		"org.xtext.example.mydsl.MyDsl.While_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1964:6: ( (lv_forStatement_6_0= ruleFor_Statement ) )
                    {
                    // InternalMyDsl.g:1964:6: ( (lv_forStatement_6_0= ruleFor_Statement ) )
                    // InternalMyDsl.g:1965:1: (lv_forStatement_6_0= ruleFor_Statement )
                    {
                    // InternalMyDsl.g:1965:1: (lv_forStatement_6_0= ruleFor_Statement )
                    // InternalMyDsl.g:1966:3: lv_forStatement_6_0= ruleFor_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getForStatementFor_StatementParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_forStatement_6_0=ruleFor_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"forStatement",
                              		lv_forStatement_6_0, 
                              		"org.xtext.example.mydsl.MyDsl.For_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1983:6: ( (lv_switchStatement_7_0= ruleSwitch_statement ) )
                    {
                    // InternalMyDsl.g:1983:6: ( (lv_switchStatement_7_0= ruleSwitch_statement ) )
                    // InternalMyDsl.g:1984:1: (lv_switchStatement_7_0= ruleSwitch_statement )
                    {
                    // InternalMyDsl.g:1984:1: (lv_switchStatement_7_0= ruleSwitch_statement )
                    // InternalMyDsl.g:1985:3: lv_switchStatement_7_0= ruleSwitch_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementSwitch_statementParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_switchStatement_7_0=ruleSwitch_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"switchStatement",
                              		lv_switchStatement_7_0, 
                              		"org.xtext.example.mydsl.MyDsl.Switch_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:2002:6: (otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) ) )
                    {
                    // InternalMyDsl.g:2002:6: (otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) ) )
                    // InternalMyDsl.g:2002:8: otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) )
                    {
                    otherlv_8=(Token)match(input,88,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getSynchronizedKeyword_7_0());
                          
                    }
                    // InternalMyDsl.g:2006:1: ( (lv_expression_9_0= ruleExpression ) )
                    // InternalMyDsl.g:2007:1: (lv_expression_9_0= ruleExpression )
                    {
                    // InternalMyDsl.g:2007:1: (lv_expression_9_0= ruleExpression )
                    // InternalMyDsl.g:2008:3: lv_expression_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_19);
                    lv_expression_9_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_9_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:2024:2: ( (lv_rparent_10_0= RULE_RPAREN ) )
                    // InternalMyDsl.g:2025:1: (lv_rparent_10_0= RULE_RPAREN )
                    {
                    // InternalMyDsl.g:2025:1: (lv_rparent_10_0= RULE_RPAREN )
                    // InternalMyDsl.g:2026:3: lv_rparent_10_0= RULE_RPAREN
                    {
                    lv_rparent_10_0=(Token)match(input,RULE_RPAREN,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_rparent_10_0, grammarAccess.getStatementAccess().getRparentRPARENTerminalRuleCall_7_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"rparent",
                              		lv_rparent_10_0, 
                              		"org.xtext.example.mydsl.MyDsl.RPAREN");
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:2042:2: ( (lv_syncStatement_11_0= ruleStatement ) )
                    // InternalMyDsl.g:2043:1: (lv_syncStatement_11_0= ruleStatement )
                    {
                    // InternalMyDsl.g:2043:1: (lv_syncStatement_11_0= ruleStatement )
                    // InternalMyDsl.g:2044:3: lv_syncStatement_11_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSyncStatementStatementParserRuleCall_7_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_syncStatement_11_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"syncStatement",
                              		lv_syncStatement_11_0, 
                              		"org.xtext.example.mydsl.MyDsl.Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:2061:6: ( () ( (lv_ret_13_0= 'return' ) ) ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';' )
                    {
                    // InternalMyDsl.g:2061:6: ( () ( (lv_ret_13_0= 'return' ) ) ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';' )
                    // InternalMyDsl.g:2061:7: () ( (lv_ret_13_0= 'return' ) ) ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';'
                    {
                    // InternalMyDsl.g:2061:7: ()
                    // InternalMyDsl.g:2062:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_8_0(),
                                  current);
                          
                    }

                    }

                    // InternalMyDsl.g:2070:2: ( (lv_ret_13_0= 'return' ) )
                    // InternalMyDsl.g:2071:1: (lv_ret_13_0= 'return' )
                    {
                    // InternalMyDsl.g:2071:1: (lv_ret_13_0= 'return' )
                    // InternalMyDsl.g:2072:3: lv_ret_13_0= 'return'
                    {
                    lv_ret_13_0=(Token)match(input,89,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_ret_13_0, grammarAccess.getStatementAccess().getRetReturnKeyword_8_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatementRule());
                      	        }
                             		setWithLastConsumed(current, "ret", lv_ret_13_0, "return");
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:2085:2: ( (lv_expression_14_0= ruleExpression ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID||LA39_0==RULE_LPAREN||(LA39_0>=RULE_NULL && LA39_0<=RULE_THIS)||(LA39_0>=RULE_INCREMENT && LA39_0<=RULE_DECREMENT)||LA39_0==RULE_DECIMAL_DIGITS||LA39_0==RULE_HEXA||(LA39_0>=RULE_STRING && LA39_0<=RULE_FALSE)||LA39_0==96) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalMyDsl.g:2086:1: (lv_expression_14_0= ruleExpression )
                            {
                            // InternalMyDsl.g:2086:1: (lv_expression_14_0= ruleExpression )
                            // InternalMyDsl.g:2087:3: lv_expression_14_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_8_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_6);
                            lv_expression_14_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"expression",
                                      		lv_expression_14_0, 
                                      		"org.xtext.example.mydsl.MyDsl.Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStatementAccess().getSemicolonKeyword_8_3());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:2108:6: ( () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';' )
                    {
                    // InternalMyDsl.g:2108:6: ( () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';' )
                    // InternalMyDsl.g:2108:7: () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';'
                    {
                    // InternalMyDsl.g:2108:7: ()
                    // InternalMyDsl.g:2109:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_17=(Token)match(input,90,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getStatementAccess().getThrowKeyword_9_1());
                          
                    }
                    // InternalMyDsl.g:2121:1: ( (lv_expression_18_0= ruleExpression ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID||LA40_0==RULE_LPAREN||(LA40_0>=RULE_NULL && LA40_0<=RULE_THIS)||(LA40_0>=RULE_INCREMENT && LA40_0<=RULE_DECREMENT)||LA40_0==RULE_DECIMAL_DIGITS||LA40_0==RULE_HEXA||(LA40_0>=RULE_STRING && LA40_0<=RULE_FALSE)||LA40_0==96) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalMyDsl.g:2122:1: (lv_expression_18_0= ruleExpression )
                            {
                            // InternalMyDsl.g:2122:1: (lv_expression_18_0= ruleExpression )
                            // InternalMyDsl.g:2123:3: lv_expression_18_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_9_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_6);
                            lv_expression_18_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"expression",
                                      		lv_expression_18_0, 
                                      		"org.xtext.example.mydsl.MyDsl.Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getStatementAccess().getSemicolonKeyword_9_3());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:2144:6: ( (lv_statementBlock_20_0= ruleStatement_block ) )
                    {
                    // InternalMyDsl.g:2144:6: ( (lv_statementBlock_20_0= ruleStatement_block ) )
                    // InternalMyDsl.g:2145:1: (lv_statementBlock_20_0= ruleStatement_block )
                    {
                    // InternalMyDsl.g:2145:1: (lv_statementBlock_20_0= ruleStatement_block )
                    // InternalMyDsl.g:2146:3: lv_statementBlock_20_0= ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getStatementBlockStatement_blockParserRuleCall_10_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_statementBlock_20_0=ruleStatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"statementBlock",
                              		lv_statementBlock_20_0, 
                              		"org.xtext.example.mydsl.MyDsl.Statement_block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:2163:6: ( (lv_tryStatement_21_0= ruleTry_statement ) )
                    {
                    // InternalMyDsl.g:2163:6: ( (lv_tryStatement_21_0= ruleTry_statement ) )
                    // InternalMyDsl.g:2164:1: (lv_tryStatement_21_0= ruleTry_statement )
                    {
                    // InternalMyDsl.g:2164:1: (lv_tryStatement_21_0= ruleTry_statement )
                    // InternalMyDsl.g:2165:3: lv_tryStatement_21_0= ruleTry_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getTryStatementTry_statementParserRuleCall_11_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_tryStatement_21_0=ruleTry_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"tryStatement",
                              		lv_tryStatement_21_0, 
                              		"org.xtext.example.mydsl.MyDsl.Try_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:2182:6: ( ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) ) )
                    {
                    // InternalMyDsl.g:2182:6: ( ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) ) )
                    // InternalMyDsl.g:2182:7: ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) )
                    {
                    // InternalMyDsl.g:2182:7: ( (lv_nameStatement_22_0= RULE_ID ) )
                    // InternalMyDsl.g:2183:1: (lv_nameStatement_22_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2183:1: (lv_nameStatement_22_0= RULE_ID )
                    // InternalMyDsl.g:2184:3: lv_nameStatement_22_0= RULE_ID
                    {
                    lv_nameStatement_22_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_nameStatement_22_0, grammarAccess.getStatementAccess().getNameStatementIDTerminalRuleCall_12_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"nameStatement",
                              		lv_nameStatement_22_0, 
                              		"org.xtext.example.mydsl.MyDsl.ID");
                      	    
                    }

                    }


                    }

                    this_COLON_23=(Token)match(input,RULE_COLON,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_23, grammarAccess.getStatementAccess().getCOLONTerminalRuleCall_12_1()); 
                          
                    }
                    // InternalMyDsl.g:2204:1: ( (lv_statement_24_0= ruleStatement ) )
                    // InternalMyDsl.g:2205:1: (lv_statement_24_0= ruleStatement )
                    {
                    // InternalMyDsl.g:2205:1: (lv_statement_24_0= ruleStatement )
                    // InternalMyDsl.g:2206:3: lv_statement_24_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_12_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_statement_24_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"statement",
                              		lv_statement_24_0, 
                              		"org.xtext.example.mydsl.MyDsl.Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:2223:6: ( () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';' )
                    {
                    // InternalMyDsl.g:2223:6: ( () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';' )
                    // InternalMyDsl.g:2223:7: () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';'
                    {
                    // InternalMyDsl.g:2223:7: ()
                    // InternalMyDsl.g:2224:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_13_0(),
                                  current);
                          
                    }

                    }

                    otherlv_26=(Token)match(input,91,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getStatementAccess().getBreakKeyword_13_1());
                          
                    }
                    // InternalMyDsl.g:2236:1: ( (lv_name_27_0= RULE_ID ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalMyDsl.g:2237:1: (lv_name_27_0= RULE_ID )
                            {
                            // InternalMyDsl.g:2237:1: (lv_name_27_0= RULE_ID )
                            // InternalMyDsl.g:2238:3: lv_name_27_0= RULE_ID
                            {
                            lv_name_27_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_27_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_13_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_27_0, 
                                      		"org.xtext.example.mydsl.MyDsl.ID");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_28=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getStatementAccess().getSemicolonKeyword_13_3());
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:2259:6: ( () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';' )
                    {
                    // InternalMyDsl.g:2259:6: ( () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';' )
                    // InternalMyDsl.g:2259:7: () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';'
                    {
                    // InternalMyDsl.g:2259:7: ()
                    // InternalMyDsl.g:2260:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_14_0(),
                                  current);
                          
                    }

                    }

                    otherlv_30=(Token)match(input,92,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getStatementAccess().getContinueKeyword_14_1());
                          
                    }
                    // InternalMyDsl.g:2272:1: ( (lv_name_31_0= RULE_ID ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalMyDsl.g:2273:1: (lv_name_31_0= RULE_ID )
                            {
                            // InternalMyDsl.g:2273:1: (lv_name_31_0= RULE_ID )
                            // InternalMyDsl.g:2274:3: lv_name_31_0= RULE_ID
                            {
                            lv_name_31_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_31_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_14_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_31_0, 
                                      		"org.xtext.example.mydsl.MyDsl.ID");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_32=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getStatementAccess().getSemicolonKeyword_14_3());
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalMyDsl.g:2295:6: ( () otherlv_34= ';' )
                    {
                    // InternalMyDsl.g:2295:6: ( () otherlv_34= ';' )
                    // InternalMyDsl.g:2295:7: () otherlv_34= ';'
                    {
                    // InternalMyDsl.g:2295:7: ()
                    // InternalMyDsl.g:2296:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_15_0(),
                                  current);
                          
                    }

                    }

                    otherlv_34=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_34, grammarAccess.getStatementAccess().getSemicolonKeyword_15_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleFor_Statement"
    // InternalMyDsl.g:2316:1: entryRuleFor_Statement returns [EObject current=null] : iv_ruleFor_Statement= ruleFor_Statement EOF ;
    public final EObject entryRuleFor_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor_Statement = null;


        try {
            // InternalMyDsl.g:2317:2: (iv_ruleFor_Statement= ruleFor_Statement EOF )
            // InternalMyDsl.g:2318:2: iv_ruleFor_Statement= ruleFor_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_StatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFor_Statement=ruleFor_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor_Statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFor_Statement"


    // $ANTLR start "ruleFor_Statement"
    // InternalMyDsl.g:2325:1: ruleFor_Statement returns [EObject current=null] : (otherlv_0= 'for' this_LPAREN_1= RULE_LPAREN ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | otherlv_3= ';' | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ( (lv_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_expression3_8_0= ruleExpression ) )? this_RPAREN_9= RULE_RPAREN ( (lv_statement_10_0= ruleStatement ) ) ) ;
    public final EObject ruleFor_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LPAREN_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_RPAREN_9=null;
        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_expression2_6_0 = null;

        EObject lv_expression3_8_0 = null;

        EObject lv_statement_10_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:2328:28: ( (otherlv_0= 'for' this_LPAREN_1= RULE_LPAREN ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | otherlv_3= ';' | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ( (lv_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_expression3_8_0= ruleExpression ) )? this_RPAREN_9= RULE_RPAREN ( (lv_statement_10_0= ruleStatement ) ) ) )
            // InternalMyDsl.g:2329:1: (otherlv_0= 'for' this_LPAREN_1= RULE_LPAREN ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | otherlv_3= ';' | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ( (lv_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_expression3_8_0= ruleExpression ) )? this_RPAREN_9= RULE_RPAREN ( (lv_statement_10_0= ruleStatement ) ) )
            {
            // InternalMyDsl.g:2329:1: (otherlv_0= 'for' this_LPAREN_1= RULE_LPAREN ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | otherlv_3= ';' | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ( (lv_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_expression3_8_0= ruleExpression ) )? this_RPAREN_9= RULE_RPAREN ( (lv_statement_10_0= ruleStatement ) ) )
            // InternalMyDsl.g:2329:3: otherlv_0= 'for' this_LPAREN_1= RULE_LPAREN ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | otherlv_3= ';' | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ( (lv_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_expression3_8_0= ruleExpression ) )? this_RPAREN_9= RULE_RPAREN ( (lv_statement_10_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,93,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFor_StatementAccess().getForKeyword_0());
                  
            }
            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getFor_StatementAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // InternalMyDsl.g:2337:1: ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | otherlv_3= ';' | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) )
            int alt44=3;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:2337:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
                    {
                    // InternalMyDsl.g:2337:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
                    // InternalMyDsl.g:2338:1: (lv_variable_2_0= ruleVariable_declaration )
                    {
                    // InternalMyDsl.g:2338:1: (lv_variable_2_0= ruleVariable_declaration )
                    // InternalMyDsl.g:2339:3: lv_variable_2_0= ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getVariableVariable_declarationParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_35);
                    lv_variable_2_0=ruleVariable_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"variable",
                              		lv_variable_2_0, 
                              		"org.xtext.example.mydsl.MyDsl.Variable_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2356:7: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,71,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2361:6: ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' )
                    {
                    // InternalMyDsl.g:2361:6: ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' )
                    // InternalMyDsl.g:2361:7: ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';'
                    {
                    // InternalMyDsl.g:2361:7: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalMyDsl.g:2362:1: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalMyDsl.g:2362:1: (lv_expression_4_0= ruleExpression )
                    // InternalMyDsl.g:2363:3: lv_expression_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getExpressionExpressionParserRuleCall_2_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_6);
                    lv_expression_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,71,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_2_2_1());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2383:3: ( (lv_expression2_6_0= ruleExpression ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==RULE_LPAREN||(LA45_0>=RULE_NULL && LA45_0<=RULE_THIS)||(LA45_0>=RULE_INCREMENT && LA45_0<=RULE_DECREMENT)||LA45_0==RULE_DECIMAL_DIGITS||LA45_0==RULE_HEXA||(LA45_0>=RULE_STRING && LA45_0<=RULE_FALSE)||LA45_0==96) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:2384:1: (lv_expression2_6_0= ruleExpression )
                    {
                    // InternalMyDsl.g:2384:1: (lv_expression2_6_0= ruleExpression )
                    // InternalMyDsl.g:2385:3: lv_expression2_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getExpression2ExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_6);
                    lv_expression2_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression2",
                              		lv_expression2_6_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,71,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_4());
                  
            }
            // InternalMyDsl.g:2405:1: ( (lv_expression3_8_0= ruleExpression ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==RULE_LPAREN||(LA46_0>=RULE_NULL && LA46_0<=RULE_THIS)||(LA46_0>=RULE_INCREMENT && LA46_0<=RULE_DECREMENT)||LA46_0==RULE_DECIMAL_DIGITS||LA46_0==RULE_HEXA||(LA46_0>=RULE_STRING && LA46_0<=RULE_FALSE)||LA46_0==96) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:2406:1: (lv_expression3_8_0= ruleExpression )
                    {
                    // InternalMyDsl.g:2406:1: (lv_expression3_8_0= ruleExpression )
                    // InternalMyDsl.g:2407:3: lv_expression3_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getExpression3ExpressionParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_19);
                    lv_expression3_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression3",
                              		lv_expression3_8_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            this_RPAREN_9=(Token)match(input,RULE_RPAREN,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_9, grammarAccess.getFor_StatementAccess().getRPARENTerminalRuleCall_6()); 
                  
            }
            // InternalMyDsl.g:2427:1: ( (lv_statement_10_0= ruleStatement ) )
            // InternalMyDsl.g:2428:1: (lv_statement_10_0= ruleStatement )
            {
            // InternalMyDsl.g:2428:1: (lv_statement_10_0= ruleStatement )
            // InternalMyDsl.g:2429:3: lv_statement_10_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFor_StatementAccess().getStatementStatementParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_statement_10_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_10_0, 
                      		"org.xtext.example.mydsl.MyDsl.Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFor_Statement"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:2453:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:2454:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:2455:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:2462:1: ruleExpression returns [EObject current=null] : ( ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_null_12_0=null;
        Token lv_super_14_0=null;
        Token lv_this_16_0=null;
        Token lv_name_18_0=null;
        EObject lv_numericExpression3_0_0 = null;

        EObject lv_aux_1_0 = null;

        EObject lv_logicalExpression_2_0 = null;

        EObject lv_aux_3_0 = null;

        EObject lv_bitExpression_4_0 = null;

        EObject lv_aux_5_0 = null;

        EObject lv_castExpression_6_0 = null;

        EObject lv_aux_7_0 = null;

        EObject lv_creatingExpression_8_0 = null;

        EObject lv_aux_9_0 = null;

        EObject lv_literalExpression_10_0 = null;

        EObject lv_aux_11_0 = null;

        EObject lv_aux_13_0 = null;

        EObject lv_aux_15_0 = null;

        EObject lv_aux_17_0 = null;

        EObject lv_aux_19_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:2465:28: ( ( ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) ) )
            // InternalMyDsl.g:2466:1: ( ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) )
            {
            // InternalMyDsl.g:2466:1: ( ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) )
            int alt47=10;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2466:2: ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:2466:2: ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:2466:3: ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:2466:3: ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) )
                    // InternalMyDsl.g:2466:4: ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) )
                    {
                    // InternalMyDsl.g:2470:5: ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) )
                    // InternalMyDsl.g:2471:1: (lv_numericExpression3_0_0= ruleNumeric_Expression_NR )
                    {
                    // InternalMyDsl.g:2471:1: (lv_numericExpression3_0_0= ruleNumeric_Expression_NR )
                    // InternalMyDsl.g:2472:3: lv_numericExpression3_0_0= ruleNumeric_Expression_NR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getNumericExpression3Numeric_Expression_NRParserRuleCall_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
                    lv_numericExpression3_0_0=ruleNumeric_Expression_NR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"numericExpression3",
                              		lv_numericExpression3_0_0, 
                              		"org.xtext.example.mydsl.MyDsl.Numeric_Expression_NR");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalMyDsl.g:2488:3: ( (lv_aux_1_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:2489:1: (lv_aux_1_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:2489:1: (lv_aux_1_0= ruleExpression_aux )
                    // InternalMyDsl.g:2490:3: lv_aux_1_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_1_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_1_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2507:6: ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:2507:6: ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:2507:7: ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:2507:7: ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) )
                    // InternalMyDsl.g:2508:1: (lv_logicalExpression_2_0= ruleLogical_Expression_NR )
                    {
                    // InternalMyDsl.g:2508:1: (lv_logicalExpression_2_0= ruleLogical_Expression_NR )
                    // InternalMyDsl.g:2509:3: lv_logicalExpression_2_0= ruleLogical_Expression_NR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getLogicalExpressionLogical_Expression_NRParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
                    lv_logicalExpression_2_0=ruleLogical_Expression_NR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"logicalExpression",
                              		lv_logicalExpression_2_0, 
                              		"org.xtext.example.mydsl.MyDsl.Logical_Expression_NR");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:2525:2: ( (lv_aux_3_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:2526:1: (lv_aux_3_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:2526:1: (lv_aux_3_0= ruleExpression_aux )
                    // InternalMyDsl.g:2527:3: lv_aux_3_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_3_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_3_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2544:6: ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:2544:6: ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:2544:7: ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:2544:7: ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) )
                    // InternalMyDsl.g:2545:1: (lv_bitExpression_4_0= ruleBit_Expression_NR )
                    {
                    // InternalMyDsl.g:2545:1: (lv_bitExpression_4_0= ruleBit_Expression_NR )
                    // InternalMyDsl.g:2546:3: lv_bitExpression_4_0= ruleBit_Expression_NR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getBitExpressionBit_Expression_NRParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
                    lv_bitExpression_4_0=ruleBit_Expression_NR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"bitExpression",
                              		lv_bitExpression_4_0, 
                              		"org.xtext.example.mydsl.MyDsl.Bit_Expression_NR");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:2562:2: ( (lv_aux_5_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:2563:1: (lv_aux_5_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:2563:1: (lv_aux_5_0= ruleExpression_aux )
                    // InternalMyDsl.g:2564:3: lv_aux_5_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_5_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_5_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2581:6: ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:2581:6: ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:2581:7: ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:2581:7: ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) )
                    // InternalMyDsl.g:2581:8: ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) )
                    {
                    // InternalMyDsl.g:2585:5: ( (lv_castExpression_6_0= ruleCast_Expression ) )
                    // InternalMyDsl.g:2586:1: (lv_castExpression_6_0= ruleCast_Expression )
                    {
                    // InternalMyDsl.g:2586:1: (lv_castExpression_6_0= ruleCast_Expression )
                    // InternalMyDsl.g:2587:3: lv_castExpression_6_0= ruleCast_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getCastExpressionCast_ExpressionParserRuleCall_3_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
                    lv_castExpression_6_0=ruleCast_Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"castExpression",
                              		lv_castExpression_6_0, 
                              		"org.xtext.example.mydsl.MyDsl.Cast_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalMyDsl.g:2603:3: ( (lv_aux_7_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:2604:1: (lv_aux_7_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:2604:1: (lv_aux_7_0= ruleExpression_aux )
                    // InternalMyDsl.g:2605:3: lv_aux_7_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_7_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_7_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2622:6: ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:2622:6: ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:2622:7: ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:2622:7: ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) )
                    // InternalMyDsl.g:2622:8: ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) )
                    {
                    // InternalMyDsl.g:2626:5: ( (lv_creatingExpression_8_0= ruleCreating_Expression ) )
                    // InternalMyDsl.g:2627:1: (lv_creatingExpression_8_0= ruleCreating_Expression )
                    {
                    // InternalMyDsl.g:2627:1: (lv_creatingExpression_8_0= ruleCreating_Expression )
                    // InternalMyDsl.g:2628:3: lv_creatingExpression_8_0= ruleCreating_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getCreatingExpressionCreating_ExpressionParserRuleCall_4_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
                    lv_creatingExpression_8_0=ruleCreating_Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"creatingExpression",
                              		lv_creatingExpression_8_0, 
                              		"org.xtext.example.mydsl.MyDsl.Creating_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalMyDsl.g:2644:3: ( (lv_aux_9_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:2645:1: (lv_aux_9_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:2645:1: (lv_aux_9_0= ruleExpression_aux )
                    // InternalMyDsl.g:2646:3: lv_aux_9_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_9_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_9_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2663:6: ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:2663:6: ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:2663:7: ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:2663:7: ( (lv_literalExpression_10_0= ruleLiteral_Expression ) )
                    // InternalMyDsl.g:2664:1: (lv_literalExpression_10_0= ruleLiteral_Expression )
                    {
                    // InternalMyDsl.g:2664:1: (lv_literalExpression_10_0= ruleLiteral_Expression )
                    // InternalMyDsl.g:2665:3: lv_literalExpression_10_0= ruleLiteral_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getLiteralExpressionLiteral_ExpressionParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
                    lv_literalExpression_10_0=ruleLiteral_Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"literalExpression",
                              		lv_literalExpression_10_0, 
                              		"org.xtext.example.mydsl.MyDsl.Literal_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:2681:2: ( (lv_aux_11_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:2682:1: (lv_aux_11_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:2682:1: (lv_aux_11_0= ruleExpression_aux )
                    // InternalMyDsl.g:2683:3: lv_aux_11_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_11_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_11_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:2700:6: ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:2700:6: ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:2700:7: ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:2700:7: ( (lv_null_12_0= RULE_NULL ) )
                    // InternalMyDsl.g:2701:1: (lv_null_12_0= RULE_NULL )
                    {
                    // InternalMyDsl.g:2701:1: (lv_null_12_0= RULE_NULL )
                    // InternalMyDsl.g:2702:3: lv_null_12_0= RULE_NULL
                    {
                    lv_null_12_0=(Token)match(input,RULE_NULL,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_null_12_0, grammarAccess.getExpressionAccess().getNullNULLTerminalRuleCall_6_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"null",
                              		lv_null_12_0, 
                              		"org.xtext.example.mydsl.MyDsl.NULL");
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:2718:2: ( (lv_aux_13_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:2719:1: (lv_aux_13_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:2719:1: (lv_aux_13_0= ruleExpression_aux )
                    // InternalMyDsl.g:2720:3: lv_aux_13_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_13_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_13_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:2737:6: ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:2737:6: ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:2737:7: ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:2737:7: ( (lv_super_14_0= RULE_SUPER ) )
                    // InternalMyDsl.g:2738:1: (lv_super_14_0= RULE_SUPER )
                    {
                    // InternalMyDsl.g:2738:1: (lv_super_14_0= RULE_SUPER )
                    // InternalMyDsl.g:2739:3: lv_super_14_0= RULE_SUPER
                    {
                    lv_super_14_0=(Token)match(input,RULE_SUPER,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_super_14_0, grammarAccess.getExpressionAccess().getSuperSUPERTerminalRuleCall_7_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"super",
                              		lv_super_14_0, 
                              		"org.xtext.example.mydsl.MyDsl.SUPER");
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:2755:2: ( (lv_aux_15_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:2756:1: (lv_aux_15_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:2756:1: (lv_aux_15_0= ruleExpression_aux )
                    // InternalMyDsl.g:2757:3: lv_aux_15_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_15_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_15_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:2774:6: ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:2774:6: ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:2774:7: ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:2774:7: ( (lv_this_16_0= RULE_THIS ) )
                    // InternalMyDsl.g:2775:1: (lv_this_16_0= RULE_THIS )
                    {
                    // InternalMyDsl.g:2775:1: (lv_this_16_0= RULE_THIS )
                    // InternalMyDsl.g:2776:3: lv_this_16_0= RULE_THIS
                    {
                    lv_this_16_0=(Token)match(input,RULE_THIS,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_this_16_0, grammarAccess.getExpressionAccess().getThisTHISTerminalRuleCall_8_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"this",
                              		lv_this_16_0, 
                              		"org.xtext.example.mydsl.MyDsl.THIS");
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:2792:2: ( (lv_aux_17_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:2793:1: (lv_aux_17_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:2793:1: (lv_aux_17_0= ruleExpression_aux )
                    // InternalMyDsl.g:2794:3: lv_aux_17_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_17_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_17_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:2811:6: ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:2811:6: ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:2811:7: ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:2811:7: ( (lv_name_18_0= RULE_ID ) )
                    // InternalMyDsl.g:2812:1: (lv_name_18_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2812:1: (lv_name_18_0= RULE_ID )
                    // InternalMyDsl.g:2813:3: lv_name_18_0= RULE_ID
                    {
                    lv_name_18_0=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_18_0, grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_9_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_18_0, 
                              		"org.xtext.example.mydsl.MyDsl.ID");
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:2829:2: ( (lv_aux_19_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:2830:1: (lv_aux_19_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:2830:1: (lv_aux_19_0= ruleExpression_aux )
                    // InternalMyDsl.g:2831:3: lv_aux_19_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_19_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_19_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpression_aux"
    // InternalMyDsl.g:2855:1: entryRuleExpression_aux returns [EObject current=null] : iv_ruleExpression_aux= ruleExpression_aux EOF ;
    public final EObject entryRuleExpression_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_aux = null;


        try {
            // InternalMyDsl.g:2856:2: (iv_ruleExpression_aux= ruleExpression_aux EOF )
            // InternalMyDsl.g:2857:2: iv_ruleExpression_aux= ruleExpression_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_auxRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression_aux=ruleExpression_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_aux; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_aux"


    // $ANTLR start "ruleExpression_aux"
    // InternalMyDsl.g:2864:1: ruleExpression_aux returns [EObject current=null] : ( ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) | ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) | ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) | ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) | ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) | ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) | (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) | ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) | ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) | ( ( ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) ) ) ( (lv_logicExp_41_0= ruleExpression ) ) ) | () ) ;
    public final EObject ruleExpression_aux() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_0=null;
        Token this_RPAREN_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token this_INSTANCEOF_14=null;
        Token lv_sgin_17_1=null;
        Token lv_sgin_17_2=null;
        Token lv_numericSign_19_1=null;
        Token lv_numericSign_19_2=null;
        Token lv_numericSign_19_3=null;
        Token lv_numericSign_19_4=null;
        Token lv_numericSign_19_5=null;
        Token lv_numericSign_19_6=null;
        Token lv_numericSign_19_7=null;
        Token lv_numericSign_19_8=null;
        Token lv_numericSign_19_9=null;
        Token lv_numericSign_19_10=null;
        Token lv_testingSign_22_1=null;
        Token lv_testingSign_22_2=null;
        Token lv_testingSign_22_3=null;
        Token lv_testingSign_22_4=null;
        Token lv_testingSign_22_5=null;
        Token lv_testingSign_22_6=null;
        Token lv_logicalSign_25_1=null;
        Token lv_logicalSign_25_2=null;
        Token lv_logicalSign_25_3=null;
        Token lv_logicalSign_25_4=null;
        Token lv_logicalSign_25_5=null;
        Token lv_logicalSign_25_6=null;
        Token lv_logicalSign_25_7=null;
        Token this_WAT_29=null;
        Token this_COLON_31=null;
        Token lv_stringSign_34_1=null;
        Token lv_stringSign_34_2=null;
        Token lv_bitSign_37_1=null;
        Token lv_bitSign_37_2=null;
        Token lv_bitSign_37_3=null;
        Token lv_bitSign_37_4=null;
        Token lv_logicOp_40_1=null;
        Token lv_logicOp_40_2=null;
        EObject lv_argList_1_0 = null;

        EObject lv_aux_3_0 = null;

        EObject lv_expression2_5_0 = null;

        EObject lv_aux_7_0 = null;

        EObject lv_expression2_9_0 = null;

        EObject lv_aux_10_0 = null;

        EObject lv_expressionComma_12_0 = null;

        EObject lv_aux_13_0 = null;

        AntlrDatatypeRuleToken lv_name_15_0 = null;

        EObject lv_aux_16_0 = null;

        EObject lv_aux_18_0 = null;

        EObject lv_exp2_20_0 = null;

        EObject lv_aux_21_0 = null;

        EObject lv_exp1_23_0 = null;

        EObject lv_aux_24_0 = null;

        EObject lv_ampersand_26_0 = null;

        EObject lv_exp1_27_0 = null;

        EObject lv_aux_28_0 = null;

        EObject lv_exp1_30_0 = null;

        EObject lv_exp2_32_0 = null;

        EObject lv_aux_33_0 = null;

        EObject lv_exp1_35_0 = null;

        EObject lv_aux_36_0 = null;

        EObject lv_expressionBit_38_0 = null;

        EObject lv_aux_39_0 = null;

        EObject lv_logicExp_41_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:2867:28: ( ( ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) | ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) | ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) | ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) | ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) | ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) | (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) | ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) | ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) | ( ( ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) ) ) ( (lv_logicExp_41_0= ruleExpression ) ) ) | () ) )
            // InternalMyDsl.g:2868:1: ( ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) | ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) | ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) | ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) | ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) | ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) | (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) | ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) | ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) | ( ( ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) ) ) ( (lv_logicExp_41_0= ruleExpression ) ) ) | () )
            {
            // InternalMyDsl.g:2868:1: ( ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) | ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) | ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) | ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) | ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) | ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) | (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) | ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) | ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) | ( ( ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) ) ) ( (lv_logicExp_41_0= ruleExpression ) ) ) | () )
            int alt57=14;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:2868:2: ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:2868:2: ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:2868:3: (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:2868:3: (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN )
                    // InternalMyDsl.g:2868:4: this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN
                    {
                    this_LPAREN_0=(Token)match(input,RULE_LPAREN,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_0, grammarAccess.getExpression_auxAccess().getLPARENTerminalRuleCall_0_0_0()); 
                          
                    }
                    // InternalMyDsl.g:2872:1: ( (lv_argList_1_0= ruleArg_List ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_ID||LA48_0==RULE_LPAREN||(LA48_0>=RULE_NULL && LA48_0<=RULE_THIS)||(LA48_0>=RULE_INCREMENT && LA48_0<=RULE_DECREMENT)||LA48_0==RULE_DECIMAL_DIGITS||LA48_0==RULE_HEXA||(LA48_0>=RULE_STRING && LA48_0<=RULE_FALSE)||LA48_0==96) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalMyDsl.g:2873:1: (lv_argList_1_0= ruleArg_List )
                            {
                            // InternalMyDsl.g:2873:1: (lv_argList_1_0= ruleArg_List )
                            // InternalMyDsl.g:2874:3: lv_argList_1_0= ruleArg_List
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpression_auxAccess().getArgListArg_ListParserRuleCall_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_19);
                            lv_argList_1_0=ruleArg_List();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"argList",
                                      		lv_argList_1_0, 
                                      		"org.xtext.example.mydsl.MyDsl.Arg_List");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    this_RPAREN_2=(Token)match(input,RULE_RPAREN,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_2, grammarAccess.getExpression_auxAccess().getRPARENTerminalRuleCall_0_0_2()); 
                          
                    }

                    }

                    // InternalMyDsl.g:2894:2: ( (lv_aux_3_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:2895:1: (lv_aux_3_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:2895:1: (lv_aux_3_0= ruleExpression_aux )
                    // InternalMyDsl.g:2896:3: lv_aux_3_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_3_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_3_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2913:6: ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:2913:6: ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:2913:7: (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:2913:7: (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' )
                    // InternalMyDsl.g:2913:9: otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getExpression_auxAccess().getLeftSquareBracketKeyword_1_0_0());
                          
                    }
                    // InternalMyDsl.g:2917:1: ( (lv_expression2_5_0= ruleExpression ) )
                    // InternalMyDsl.g:2918:1: (lv_expression2_5_0= ruleExpression )
                    {
                    // InternalMyDsl.g:2918:1: (lv_expression2_5_0= ruleExpression )
                    // InternalMyDsl.g:2919:3: lv_expression2_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_21);
                    lv_expression2_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expression2",
                              		lv_expression2_5_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,76,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getExpression_auxAccess().getRightSquareBracketKeyword_1_0_2());
                          
                    }

                    }

                    // InternalMyDsl.g:2939:2: ( (lv_aux_7_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:2940:1: (lv_aux_7_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:2940:1: (lv_aux_7_0= ruleExpression_aux )
                    // InternalMyDsl.g:2941:3: lv_aux_7_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_7_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_7_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2958:6: ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:2958:6: ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:2958:7: (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:2958:7: (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) )
                    // InternalMyDsl.g:2958:9: otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) )
                    {
                    otherlv_8=(Token)match(input,94,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getExpression_auxAccess().getFullStopKeyword_2_0_0());
                          
                    }
                    // InternalMyDsl.g:2962:1: ( (lv_expression2_9_0= ruleExpression ) )
                    // InternalMyDsl.g:2963:1: (lv_expression2_9_0= ruleExpression )
                    {
                    // InternalMyDsl.g:2963:1: (lv_expression2_9_0= ruleExpression )
                    // InternalMyDsl.g:2964:3: lv_expression2_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
                    lv_expression2_9_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expression2",
                              		lv_expression2_9_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalMyDsl.g:2980:3: ( (lv_aux_10_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:2981:1: (lv_aux_10_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:2981:1: (lv_aux_10_0= ruleExpression_aux )
                    // InternalMyDsl.g:2982:3: lv_aux_10_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_10_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_10_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2999:6: ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:2999:6: ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:2999:7: (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:2999:7: (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) )
                    // InternalMyDsl.g:2999:9: otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) )
                    {
                    otherlv_11=(Token)match(input,72,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getExpression_auxAccess().getCommaKeyword_3_0_0());
                          
                    }
                    // InternalMyDsl.g:3003:1: ( (lv_expressionComma_12_0= ruleExpression ) )
                    // InternalMyDsl.g:3004:1: (lv_expressionComma_12_0= ruleExpression )
                    {
                    // InternalMyDsl.g:3004:1: (lv_expressionComma_12_0= ruleExpression )
                    // InternalMyDsl.g:3005:3: lv_expressionComma_12_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionCommaExpressionParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
                    lv_expressionComma_12_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionComma",
                              		lv_expressionComma_12_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalMyDsl.g:3021:3: ( (lv_aux_13_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:3022:1: (lv_aux_13_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:3022:1: (lv_aux_13_0= ruleExpression_aux )
                    // InternalMyDsl.g:3023:3: lv_aux_13_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_13_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_13_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3040:6: ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:3040:6: ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:3040:7: (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:3040:7: (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) )
                    // InternalMyDsl.g:3040:8: this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) )
                    {
                    this_INSTANCEOF_14=(Token)match(input,RULE_INSTANCEOF,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INSTANCEOF_14, grammarAccess.getExpression_auxAccess().getINSTANCEOFTerminalRuleCall_4_0_0()); 
                          
                    }
                    // InternalMyDsl.g:3044:1: ( (lv_name_15_0= ruleClass_name ) )
                    // InternalMyDsl.g:3045:1: (lv_name_15_0= ruleClass_name )
                    {
                    // InternalMyDsl.g:3045:1: (lv_name_15_0= ruleClass_name )
                    // InternalMyDsl.g:3046:3: lv_name_15_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getNameClass_nameParserRuleCall_4_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
                    lv_name_15_0=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_15_0, 
                              		"org.xtext.example.mydsl.MyDsl.Class_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalMyDsl.g:3062:3: ( (lv_aux_16_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:3063:1: (lv_aux_16_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:3063:1: (lv_aux_16_0= ruleExpression_aux )
                    // InternalMyDsl.g:3064:3: lv_aux_16_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_16_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_16_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3081:6: ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:3081:6: ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:3081:7: ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:3081:7: ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) )
                    // InternalMyDsl.g:3082:1: ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) )
                    {
                    // InternalMyDsl.g:3082:1: ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) )
                    // InternalMyDsl.g:3083:1: (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT )
                    {
                    // InternalMyDsl.g:3083:1: (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_INCREMENT) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==RULE_DECREMENT) ) {
                        alt49=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalMyDsl.g:3084:3: lv_sgin_17_1= RULE_INCREMENT
                            {
                            lv_sgin_17_1=(Token)match(input,RULE_INCREMENT,FOLLOW_40); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_sgin_17_1, grammarAccess.getExpression_auxAccess().getSginINCREMENTTerminalRuleCall_5_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"sgin",
                                      		lv_sgin_17_1, 
                                      		"org.xtext.example.mydsl.MyDsl.INCREMENT");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:3099:8: lv_sgin_17_2= RULE_DECREMENT
                            {
                            lv_sgin_17_2=(Token)match(input,RULE_DECREMENT,FOLLOW_40); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_sgin_17_2, grammarAccess.getExpression_auxAccess().getSginDECREMENTTerminalRuleCall_5_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"sgin",
                                      		lv_sgin_17_2, 
                                      		"org.xtext.example.mydsl.MyDsl.DECREMENT");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalMyDsl.g:3117:2: ( (lv_aux_18_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:3118:1: (lv_aux_18_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:3118:1: (lv_aux_18_0= ruleExpression_aux )
                    // InternalMyDsl.g:3119:3: lv_aux_18_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_18_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_18_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:3136:6: ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:3136:6: ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:3136:7: ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:3136:7: ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) )
                    // InternalMyDsl.g:3137:1: ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) )
                    {
                    // InternalMyDsl.g:3137:1: ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) )
                    // InternalMyDsl.g:3138:1: (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL )
                    {
                    // InternalMyDsl.g:3138:1: (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL )
                    int alt50=10;
                    switch ( input.LA(1) ) {
                    case 95:
                        {
                        alt50=1;
                        }
                        break;
                    case RULE_PLUS_EQUAL:
                        {
                        alt50=2;
                        }
                        break;
                    case 96:
                        {
                        alt50=3;
                        }
                        break;
                    case RULE_MINUS_EQUAL:
                        {
                        alt50=4;
                        }
                        break;
                    case RULE_MULTIPLY:
                        {
                        alt50=5;
                        }
                        break;
                    case RULE_MULTIPLY_EQUAL:
                        {
                        alt50=6;
                        }
                        break;
                    case RULE_DIVIDE:
                        {
                        alt50=7;
                        }
                        break;
                    case RULE_DIVIDE_EQUAL:
                        {
                        alt50=8;
                        }
                        break;
                    case RULE_MODULE:
                        {
                        alt50=9;
                        }
                        break;
                    case RULE_MODULE_EQUAL:
                        {
                        alt50=10;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }

                    switch (alt50) {
                        case 1 :
                            // InternalMyDsl.g:3139:3: lv_numericSign_19_1= '+'
                            {
                            lv_numericSign_19_1=(Token)match(input,95,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_numericSign_19_1, grammarAccess.getExpression_auxAccess().getNumericSignPlusSignKeyword_6_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(current, "numericSign", lv_numericSign_19_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:3151:8: lv_numericSign_19_2= RULE_PLUS_EQUAL
                            {
                            lv_numericSign_19_2=(Token)match(input,RULE_PLUS_EQUAL,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_2, grammarAccess.getExpression_auxAccess().getNumericSignPLUS_EQUALTerminalRuleCall_6_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_2, 
                                      		"org.xtext.example.mydsl.MyDsl.PLUS_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:3166:8: lv_numericSign_19_3= '-'
                            {
                            lv_numericSign_19_3=(Token)match(input,96,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_numericSign_19_3, grammarAccess.getExpression_auxAccess().getNumericSignHyphenMinusKeyword_6_0_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(current, "numericSign", lv_numericSign_19_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:3178:8: lv_numericSign_19_4= RULE_MINUS_EQUAL
                            {
                            lv_numericSign_19_4=(Token)match(input,RULE_MINUS_EQUAL,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_4, grammarAccess.getExpression_auxAccess().getNumericSignMINUS_EQUALTerminalRuleCall_6_0_0_3()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_4, 
                                      		"org.xtext.example.mydsl.MyDsl.MINUS_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // InternalMyDsl.g:3193:8: lv_numericSign_19_5= RULE_MULTIPLY
                            {
                            lv_numericSign_19_5=(Token)match(input,RULE_MULTIPLY,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_5, grammarAccess.getExpression_auxAccess().getNumericSignMULTIPLYTerminalRuleCall_6_0_0_4()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_5, 
                                      		"org.xtext.example.mydsl.MyDsl.MULTIPLY");
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // InternalMyDsl.g:3208:8: lv_numericSign_19_6= RULE_MULTIPLY_EQUAL
                            {
                            lv_numericSign_19_6=(Token)match(input,RULE_MULTIPLY_EQUAL,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_6, grammarAccess.getExpression_auxAccess().getNumericSignMULTIPLY_EQUALTerminalRuleCall_6_0_0_5()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_6, 
                                      		"org.xtext.example.mydsl.MyDsl.MULTIPLY_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 7 :
                            // InternalMyDsl.g:3223:8: lv_numericSign_19_7= RULE_DIVIDE
                            {
                            lv_numericSign_19_7=(Token)match(input,RULE_DIVIDE,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_7, grammarAccess.getExpression_auxAccess().getNumericSignDIVIDETerminalRuleCall_6_0_0_6()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_7, 
                                      		"org.xtext.example.mydsl.MyDsl.DIVIDE");
                              	    
                            }

                            }
                            break;
                        case 8 :
                            // InternalMyDsl.g:3238:8: lv_numericSign_19_8= RULE_DIVIDE_EQUAL
                            {
                            lv_numericSign_19_8=(Token)match(input,RULE_DIVIDE_EQUAL,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_8, grammarAccess.getExpression_auxAccess().getNumericSignDIVIDE_EQUALTerminalRuleCall_6_0_0_7()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_8, 
                                      		"org.xtext.example.mydsl.MyDsl.DIVIDE_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 9 :
                            // InternalMyDsl.g:3253:8: lv_numericSign_19_9= RULE_MODULE
                            {
                            lv_numericSign_19_9=(Token)match(input,RULE_MODULE,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_9, grammarAccess.getExpression_auxAccess().getNumericSignMODULETerminalRuleCall_6_0_0_8()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_9, 
                                      		"org.xtext.example.mydsl.MyDsl.MODULE");
                              	    
                            }

                            }
                            break;
                        case 10 :
                            // InternalMyDsl.g:3268:8: lv_numericSign_19_10= RULE_MODULE_EQUAL
                            {
                            lv_numericSign_19_10=(Token)match(input,RULE_MODULE_EQUAL,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_10, grammarAccess.getExpression_auxAccess().getNumericSignMODULE_EQUALTerminalRuleCall_6_0_0_9()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_10, 
                                      		"org.xtext.example.mydsl.MyDsl.MODULE_EQUAL");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalMyDsl.g:3286:2: ( (lv_exp2_20_0= ruleExpression ) )
                    // InternalMyDsl.g:3287:1: (lv_exp2_20_0= ruleExpression )
                    {
                    // InternalMyDsl.g:3287:1: (lv_exp2_20_0= ruleExpression )
                    // InternalMyDsl.g:3288:3: lv_exp2_20_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp2ExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
                    lv_exp2_20_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp2",
                              		lv_exp2_20_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:3304:2: ( (lv_aux_21_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:3305:1: (lv_aux_21_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:3305:1: (lv_aux_21_0= ruleExpression_aux )
                    // InternalMyDsl.g:3306:3: lv_aux_21_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_21_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_21_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:3323:6: ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:3323:6: ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:3323:7: ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:3323:7: ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) )
                    // InternalMyDsl.g:3324:1: ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) )
                    {
                    // InternalMyDsl.g:3324:1: ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) )
                    // InternalMyDsl.g:3325:1: (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT )
                    {
                    // InternalMyDsl.g:3325:1: (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT )
                    int alt51=6;
                    switch ( input.LA(1) ) {
                    case RULE_BT:
                        {
                        alt51=1;
                        }
                        break;
                    case RULE_ST:
                        {
                        alt51=2;
                        }
                        break;
                    case RULE_BE:
                        {
                        alt51=3;
                        }
                        break;
                    case RULE_SE:
                        {
                        alt51=4;
                        }
                        break;
                    case RULE_DOUBLE_EQUAL:
                        {
                        alt51=5;
                        }
                        break;
                    case RULE_DIFFERENT:
                        {
                        alt51=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }

                    switch (alt51) {
                        case 1 :
                            // InternalMyDsl.g:3326:3: lv_testingSign_22_1= RULE_BT
                            {
                            lv_testingSign_22_1=(Token)match(input,RULE_BT,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_1, grammarAccess.getExpression_auxAccess().getTestingSignBTTerminalRuleCall_7_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_1, 
                                      		"org.xtext.example.mydsl.MyDsl.BT");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:3341:8: lv_testingSign_22_2= RULE_ST
                            {
                            lv_testingSign_22_2=(Token)match(input,RULE_ST,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_2, grammarAccess.getExpression_auxAccess().getTestingSignSTTerminalRuleCall_7_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_2, 
                                      		"org.xtext.example.mydsl.MyDsl.ST");
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:3356:8: lv_testingSign_22_3= RULE_BE
                            {
                            lv_testingSign_22_3=(Token)match(input,RULE_BE,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_3, grammarAccess.getExpression_auxAccess().getTestingSignBETerminalRuleCall_7_0_0_2()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_3, 
                                      		"org.xtext.example.mydsl.MyDsl.BE");
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:3371:8: lv_testingSign_22_4= RULE_SE
                            {
                            lv_testingSign_22_4=(Token)match(input,RULE_SE,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_4, grammarAccess.getExpression_auxAccess().getTestingSignSETerminalRuleCall_7_0_0_3()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_4, 
                                      		"org.xtext.example.mydsl.MyDsl.SE");
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // InternalMyDsl.g:3386:8: lv_testingSign_22_5= RULE_DOUBLE_EQUAL
                            {
                            lv_testingSign_22_5=(Token)match(input,RULE_DOUBLE_EQUAL,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_5, grammarAccess.getExpression_auxAccess().getTestingSignDOUBLE_EQUALTerminalRuleCall_7_0_0_4()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_5, 
                                      		"org.xtext.example.mydsl.MyDsl.DOUBLE_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // InternalMyDsl.g:3401:8: lv_testingSign_22_6= RULE_DIFFERENT
                            {
                            lv_testingSign_22_6=(Token)match(input,RULE_DIFFERENT,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_6, grammarAccess.getExpression_auxAccess().getTestingSignDIFFERENTTerminalRuleCall_7_0_0_5()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_6, 
                                      		"org.xtext.example.mydsl.MyDsl.DIFFERENT");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalMyDsl.g:3419:2: ( (lv_exp1_23_0= ruleExpression ) )
                    // InternalMyDsl.g:3420:1: (lv_exp1_23_0= ruleExpression )
                    {
                    // InternalMyDsl.g:3420:1: (lv_exp1_23_0= ruleExpression )
                    // InternalMyDsl.g:3421:3: lv_exp1_23_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
                    lv_exp1_23_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp1",
                              		lv_exp1_23_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:3437:2: ( (lv_aux_24_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:3438:1: (lv_aux_24_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:3438:1: (lv_aux_24_0= ruleExpression_aux )
                    // InternalMyDsl.g:3439:3: lv_aux_24_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_24_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_24_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:3456:6: ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:3456:6: ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:3456:7: ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:3456:7: ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( ((LA53_0>=RULE_MODULE && LA53_0<=RULE_MODULE_EQUAL)||(LA53_0>=RULE_OR && LA53_0<=RULE_DOUBLE_OR_EQUAL)) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==RULE_AMPERSAND) ) {
                        alt53=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalMyDsl.g:3456:8: ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) )
                            {
                            // InternalMyDsl.g:3456:8: ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) )
                            // InternalMyDsl.g:3457:1: ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) )
                            {
                            // InternalMyDsl.g:3457:1: ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) )
                            // InternalMyDsl.g:3458:1: (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL )
                            {
                            // InternalMyDsl.g:3458:1: (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL )
                            int alt52=7;
                            switch ( input.LA(1) ) {
                            case RULE_OR:
                                {
                                alt52=1;
                                }
                                break;
                            case RULE_OR_EQUAL:
                                {
                                alt52=2;
                                }
                                break;
                            case RULE_EXP:
                                {
                                alt52=3;
                                }
                                break;
                            case RULE_EXP_EQUAL:
                                {
                                alt52=4;
                                }
                                break;
                            case RULE_DOUBLE_OR_EQUAL:
                                {
                                alt52=5;
                                }
                                break;
                            case RULE_MODULE:
                                {
                                alt52=6;
                                }
                                break;
                            case RULE_MODULE_EQUAL:
                                {
                                alt52=7;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 52, 0, input);

                                throw nvae;
                            }

                            switch (alt52) {
                                case 1 :
                                    // InternalMyDsl.g:3459:3: lv_logicalSign_25_1= RULE_OR
                                    {
                                    lv_logicalSign_25_1=(Token)match(input,RULE_OR,FOLLOW_28); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_1, grammarAccess.getExpression_auxAccess().getLogicalSignORTerminalRuleCall_8_0_0_0_0()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_1, 
                                              		"org.xtext.example.mydsl.MyDsl.OR");
                                      	    
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalMyDsl.g:3474:8: lv_logicalSign_25_2= RULE_OR_EQUAL
                                    {
                                    lv_logicalSign_25_2=(Token)match(input,RULE_OR_EQUAL,FOLLOW_28); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_2, grammarAccess.getExpression_auxAccess().getLogicalSignOR_EQUALTerminalRuleCall_8_0_0_0_1()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_2, 
                                              		"org.xtext.example.mydsl.MyDsl.OR_EQUAL");
                                      	    
                                    }

                                    }
                                    break;
                                case 3 :
                                    // InternalMyDsl.g:3489:8: lv_logicalSign_25_3= RULE_EXP
                                    {
                                    lv_logicalSign_25_3=(Token)match(input,RULE_EXP,FOLLOW_28); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_3, grammarAccess.getExpression_auxAccess().getLogicalSignEXPTerminalRuleCall_8_0_0_0_2()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_3, 
                                              		"org.xtext.example.mydsl.MyDsl.EXP");
                                      	    
                                    }

                                    }
                                    break;
                                case 4 :
                                    // InternalMyDsl.g:3504:8: lv_logicalSign_25_4= RULE_EXP_EQUAL
                                    {
                                    lv_logicalSign_25_4=(Token)match(input,RULE_EXP_EQUAL,FOLLOW_28); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_4, grammarAccess.getExpression_auxAccess().getLogicalSignEXP_EQUALTerminalRuleCall_8_0_0_0_3()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_4, 
                                              		"org.xtext.example.mydsl.MyDsl.EXP_EQUAL");
                                      	    
                                    }

                                    }
                                    break;
                                case 5 :
                                    // InternalMyDsl.g:3519:8: lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL
                                    {
                                    lv_logicalSign_25_5=(Token)match(input,RULE_DOUBLE_OR_EQUAL,FOLLOW_28); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_5, grammarAccess.getExpression_auxAccess().getLogicalSignDOUBLE_OR_EQUALTerminalRuleCall_8_0_0_0_4()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_5, 
                                              		"org.xtext.example.mydsl.MyDsl.DOUBLE_OR_EQUAL");
                                      	    
                                    }

                                    }
                                    break;
                                case 6 :
                                    // InternalMyDsl.g:3534:8: lv_logicalSign_25_6= RULE_MODULE
                                    {
                                    lv_logicalSign_25_6=(Token)match(input,RULE_MODULE,FOLLOW_28); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_6, grammarAccess.getExpression_auxAccess().getLogicalSignMODULETerminalRuleCall_8_0_0_0_5()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_6, 
                                              		"org.xtext.example.mydsl.MyDsl.MODULE");
                                      	    
                                    }

                                    }
                                    break;
                                case 7 :
                                    // InternalMyDsl.g:3549:8: lv_logicalSign_25_7= RULE_MODULE_EQUAL
                                    {
                                    lv_logicalSign_25_7=(Token)match(input,RULE_MODULE_EQUAL,FOLLOW_28); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_7, grammarAccess.getExpression_auxAccess().getLogicalSignMODULE_EQUALTerminalRuleCall_8_0_0_0_6()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_7, 
                                              		"org.xtext.example.mydsl.MyDsl.MODULE_EQUAL");
                                      	    
                                    }

                                    }
                                    break;

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:3568:6: ( (lv_ampersand_26_0= ruleAmpersand_Rule ) )
                            {
                            // InternalMyDsl.g:3568:6: ( (lv_ampersand_26_0= ruleAmpersand_Rule ) )
                            // InternalMyDsl.g:3569:1: (lv_ampersand_26_0= ruleAmpersand_Rule )
                            {
                            // InternalMyDsl.g:3569:1: (lv_ampersand_26_0= ruleAmpersand_Rule )
                            // InternalMyDsl.g:3570:3: lv_ampersand_26_0= ruleAmpersand_Rule
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAmpersandAmpersand_RuleParserRuleCall_8_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_28);
                            lv_ampersand_26_0=ruleAmpersand_Rule();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ampersand",
                                      		lv_ampersand_26_0, 
                                      		"org.xtext.example.mydsl.MyDsl.Ampersand_Rule");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:3586:3: ( (lv_exp1_27_0= ruleExpression ) )
                    // InternalMyDsl.g:3587:1: (lv_exp1_27_0= ruleExpression )
                    {
                    // InternalMyDsl.g:3587:1: (lv_exp1_27_0= ruleExpression )
                    // InternalMyDsl.g:3588:3: lv_exp1_27_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
                    lv_exp1_27_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp1",
                              		lv_exp1_27_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:3604:2: ( (lv_aux_28_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:3605:1: (lv_aux_28_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:3605:1: (lv_aux_28_0= ruleExpression_aux )
                    // InternalMyDsl.g:3606:3: lv_aux_28_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_8_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_28_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_28_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:3623:6: (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:3623:6: (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:3623:7: this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) )
                    {
                    this_WAT_29=(Token)match(input,RULE_WAT,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WAT_29, grammarAccess.getExpression_auxAccess().getWATTerminalRuleCall_9_0()); 
                          
                    }
                    // InternalMyDsl.g:3627:1: ( (lv_exp1_30_0= ruleExpression ) )
                    // InternalMyDsl.g:3628:1: (lv_exp1_30_0= ruleExpression )
                    {
                    // InternalMyDsl.g:3628:1: (lv_exp1_30_0= ruleExpression )
                    // InternalMyDsl.g:3629:3: lv_exp1_30_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_36);
                    lv_exp1_30_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp1",
                              		lv_exp1_30_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_COLON_31=(Token)match(input,RULE_COLON,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_31, grammarAccess.getExpression_auxAccess().getCOLONTerminalRuleCall_9_2()); 
                          
                    }
                    // InternalMyDsl.g:3649:1: ( (lv_exp2_32_0= ruleExpression ) )
                    // InternalMyDsl.g:3650:1: (lv_exp2_32_0= ruleExpression )
                    {
                    // InternalMyDsl.g:3650:1: (lv_exp2_32_0= ruleExpression )
                    // InternalMyDsl.g:3651:3: lv_exp2_32_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp2ExpressionParserRuleCall_9_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
                    lv_exp2_32_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp2",
                              		lv_exp2_32_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:3667:2: ( (lv_aux_33_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:3668:1: (lv_aux_33_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:3668:1: (lv_aux_33_0= ruleExpression_aux )
                    // InternalMyDsl.g:3669:3: lv_aux_33_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_9_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_33_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_33_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:3686:6: ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:3686:6: ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:3686:7: ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:3686:7: ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) )
                    // InternalMyDsl.g:3687:1: ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) )
                    {
                    // InternalMyDsl.g:3687:1: ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) )
                    // InternalMyDsl.g:3688:1: (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL )
                    {
                    // InternalMyDsl.g:3688:1: (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==95) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==RULE_PLUS_EQUAL) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalMyDsl.g:3689:3: lv_stringSign_34_1= '+'
                            {
                            lv_stringSign_34_1=(Token)match(input,95,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_stringSign_34_1, grammarAccess.getExpression_auxAccess().getStringSignPlusSignKeyword_10_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(current, "stringSign", lv_stringSign_34_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:3701:8: lv_stringSign_34_2= RULE_PLUS_EQUAL
                            {
                            lv_stringSign_34_2=(Token)match(input,RULE_PLUS_EQUAL,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_stringSign_34_2, grammarAccess.getExpression_auxAccess().getStringSignPLUS_EQUALTerminalRuleCall_10_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"stringSign",
                                      		lv_stringSign_34_2, 
                                      		"org.xtext.example.mydsl.MyDsl.PLUS_EQUAL");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalMyDsl.g:3719:2: ( (lv_exp1_35_0= ruleExpression ) )
                    // InternalMyDsl.g:3720:1: (lv_exp1_35_0= ruleExpression )
                    {
                    // InternalMyDsl.g:3720:1: (lv_exp1_35_0= ruleExpression )
                    // InternalMyDsl.g:3721:3: lv_exp1_35_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
                    lv_exp1_35_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp1",
                              		lv_exp1_35_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:3737:2: ( (lv_aux_36_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:3738:1: (lv_aux_36_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:3738:1: (lv_aux_36_0= ruleExpression_aux )
                    // InternalMyDsl.g:3739:3: lv_aux_36_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_10_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_36_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_36_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:3756:6: ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) )
                    {
                    // InternalMyDsl.g:3756:6: ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) )
                    // InternalMyDsl.g:3756:7: ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) )
                    {
                    // InternalMyDsl.g:3756:7: ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) )
                    // InternalMyDsl.g:3757:1: ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) )
                    {
                    // InternalMyDsl.g:3757:1: ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) )
                    // InternalMyDsl.g:3758:1: (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT )
                    {
                    // InternalMyDsl.g:3758:1: (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT )
                    int alt55=4;
                    switch ( input.LA(1) ) {
                    case RULE_R_SHIFT_EQUAL:
                        {
                        alt55=1;
                        }
                        break;
                    case RULE_L_SHIFT:
                        {
                        alt55=2;
                        }
                        break;
                    case RULE_R_SHIFT:
                        {
                        alt55=3;
                        }
                        break;
                    case RULE_SUPER_SHIFT:
                        {
                        alt55=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }

                    switch (alt55) {
                        case 1 :
                            // InternalMyDsl.g:3759:3: lv_bitSign_37_1= RULE_R_SHIFT_EQUAL
                            {
                            lv_bitSign_37_1=(Token)match(input,RULE_R_SHIFT_EQUAL,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_bitSign_37_1, grammarAccess.getExpression_auxAccess().getBitSignR_SHIFT_EQUALTerminalRuleCall_11_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"bitSign",
                                      		lv_bitSign_37_1, 
                                      		"org.xtext.example.mydsl.MyDsl.R_SHIFT_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:3774:8: lv_bitSign_37_2= RULE_L_SHIFT
                            {
                            lv_bitSign_37_2=(Token)match(input,RULE_L_SHIFT,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_bitSign_37_2, grammarAccess.getExpression_auxAccess().getBitSignL_SHIFTTerminalRuleCall_11_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"bitSign",
                                      		lv_bitSign_37_2, 
                                      		"org.xtext.example.mydsl.MyDsl.L_SHIFT");
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:3789:8: lv_bitSign_37_3= RULE_R_SHIFT
                            {
                            lv_bitSign_37_3=(Token)match(input,RULE_R_SHIFT,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_bitSign_37_3, grammarAccess.getExpression_auxAccess().getBitSignR_SHIFTTerminalRuleCall_11_0_0_2()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"bitSign",
                                      		lv_bitSign_37_3, 
                                      		"org.xtext.example.mydsl.MyDsl.R_SHIFT");
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:3804:8: lv_bitSign_37_4= RULE_SUPER_SHIFT
                            {
                            lv_bitSign_37_4=(Token)match(input,RULE_SUPER_SHIFT,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_bitSign_37_4, grammarAccess.getExpression_auxAccess().getBitSignSUPER_SHIFTTerminalRuleCall_11_0_0_3()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"bitSign",
                                      		lv_bitSign_37_4, 
                                      		"org.xtext.example.mydsl.MyDsl.SUPER_SHIFT");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalMyDsl.g:3822:2: ( (lv_expressionBit_38_0= ruleExpression ) )
                    // InternalMyDsl.g:3823:1: (lv_expressionBit_38_0= ruleExpression )
                    {
                    // InternalMyDsl.g:3823:1: (lv_expressionBit_38_0= ruleExpression )
                    // InternalMyDsl.g:3824:3: lv_expressionBit_38_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionBitExpressionParserRuleCall_11_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
                    lv_expressionBit_38_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionBit",
                              		lv_expressionBit_38_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:3840:2: ( (lv_aux_39_0= ruleExpression_aux ) )
                    // InternalMyDsl.g:3841:1: (lv_aux_39_0= ruleExpression_aux )
                    {
                    // InternalMyDsl.g:3841:1: (lv_aux_39_0= ruleExpression_aux )
                    // InternalMyDsl.g:3842:3: lv_aux_39_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_11_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aux_39_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_39_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:3859:6: ( ( ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) ) ) ( (lv_logicExp_41_0= ruleExpression ) ) )
                    {
                    // InternalMyDsl.g:3859:6: ( ( ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) ) ) ( (lv_logicExp_41_0= ruleExpression ) ) )
                    // InternalMyDsl.g:3859:7: ( ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) ) ) ( (lv_logicExp_41_0= ruleExpression ) )
                    {
                    // InternalMyDsl.g:3859:7: ( ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) ) )
                    // InternalMyDsl.g:3860:1: ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) )
                    {
                    // InternalMyDsl.g:3860:1: ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) )
                    // InternalMyDsl.g:3861:1: (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND )
                    {
                    // InternalMyDsl.g:3861:1: (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_OR_LOGIC) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==RULE_AND) ) {
                        alt56=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalMyDsl.g:3862:3: lv_logicOp_40_1= RULE_OR_LOGIC
                            {
                            lv_logicOp_40_1=(Token)match(input,RULE_OR_LOGIC,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_logicOp_40_1, grammarAccess.getExpression_auxAccess().getLogicOpOR_LOGICTerminalRuleCall_12_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"logicOp",
                                      		lv_logicOp_40_1, 
                                      		"org.xtext.example.mydsl.MyDsl.OR_LOGIC");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:3877:8: lv_logicOp_40_2= RULE_AND
                            {
                            lv_logicOp_40_2=(Token)match(input,RULE_AND,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_logicOp_40_2, grammarAccess.getExpression_auxAccess().getLogicOpANDTerminalRuleCall_12_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"logicOp",
                                      		lv_logicOp_40_2, 
                                      		"org.xtext.example.mydsl.MyDsl.AND");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalMyDsl.g:3895:2: ( (lv_logicExp_41_0= ruleExpression ) )
                    // InternalMyDsl.g:3896:1: (lv_logicExp_41_0= ruleExpression )
                    {
                    // InternalMyDsl.g:3896:1: (lv_logicExp_41_0= ruleExpression )
                    // InternalMyDsl.g:3897:3: lv_logicExp_41_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getLogicExpExpressionParserRuleCall_12_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_logicExp_41_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"logicExp",
                              		lv_logicExp_41_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:3914:6: ()
                    {
                    // InternalMyDsl.g:3914:6: ()
                    // InternalMyDsl.g:3915:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpression_auxAccess().getExpression_auxAction_13(),
                                  current);
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_aux"


    // $ANTLR start "entryRuleAmpersand_Rule"
    // InternalMyDsl.g:3931:1: entryRuleAmpersand_Rule returns [EObject current=null] : iv_ruleAmpersand_Rule= ruleAmpersand_Rule EOF ;
    public final EObject entryRuleAmpersand_Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmpersand_Rule = null;


        try {
            // InternalMyDsl.g:3932:2: (iv_ruleAmpersand_Rule= ruleAmpersand_Rule EOF )
            // InternalMyDsl.g:3933:2: iv_ruleAmpersand_Rule= ruleAmpersand_Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAmpersand_RuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAmpersand_Rule=ruleAmpersand_Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAmpersand_Rule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAmpersand_Rule"


    // $ANTLR start "ruleAmpersand_Rule"
    // InternalMyDsl.g:3940:1: ruleAmpersand_Rule returns [EObject current=null] : ( ( (lv_a1_0_0= RULE_AMPERSAND ) ) ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | otherlv_2= '=' )? ) ;
    public final EObject ruleAmpersand_Rule() throws RecognitionException {
        EObject current = null;

        Token lv_a1_0_0=null;
        Token lv_a2_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalMyDsl.g:3943:28: ( ( ( (lv_a1_0_0= RULE_AMPERSAND ) ) ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | otherlv_2= '=' )? ) )
            // InternalMyDsl.g:3944:1: ( ( (lv_a1_0_0= RULE_AMPERSAND ) ) ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | otherlv_2= '=' )? )
            {
            // InternalMyDsl.g:3944:1: ( ( (lv_a1_0_0= RULE_AMPERSAND ) ) ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | otherlv_2= '=' )? )
            // InternalMyDsl.g:3944:2: ( (lv_a1_0_0= RULE_AMPERSAND ) ) ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | otherlv_2= '=' )?
            {
            // InternalMyDsl.g:3944:2: ( (lv_a1_0_0= RULE_AMPERSAND ) )
            // InternalMyDsl.g:3945:1: (lv_a1_0_0= RULE_AMPERSAND )
            {
            // InternalMyDsl.g:3945:1: (lv_a1_0_0= RULE_AMPERSAND )
            // InternalMyDsl.g:3946:3: lv_a1_0_0= RULE_AMPERSAND
            {
            lv_a1_0_0=(Token)match(input,RULE_AMPERSAND,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_a1_0_0, grammarAccess.getAmpersand_RuleAccess().getA1AMPERSANDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAmpersand_RuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"a1",
                      		lv_a1_0_0, 
                      		"org.xtext.example.mydsl.MyDsl.AMPERSAND");
              	    
            }

            }


            }

            // InternalMyDsl.g:3962:2: ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | otherlv_2= '=' )?
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_AMPERSAND) ) {
                alt58=1;
            }
            else if ( (LA58_0==78) ) {
                alt58=2;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:3962:3: ( (lv_a2_1_0= RULE_AMPERSAND ) )
                    {
                    // InternalMyDsl.g:3962:3: ( (lv_a2_1_0= RULE_AMPERSAND ) )
                    // InternalMyDsl.g:3963:1: (lv_a2_1_0= RULE_AMPERSAND )
                    {
                    // InternalMyDsl.g:3963:1: (lv_a2_1_0= RULE_AMPERSAND )
                    // InternalMyDsl.g:3964:3: lv_a2_1_0= RULE_AMPERSAND
                    {
                    lv_a2_1_0=(Token)match(input,RULE_AMPERSAND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_a2_1_0, grammarAccess.getAmpersand_RuleAccess().getA2AMPERSANDTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAmpersand_RuleRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"a2",
                              		lv_a2_1_0, 
                              		"org.xtext.example.mydsl.MyDsl.AMPERSAND");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3981:7: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAmpersand_RuleAccess().getEqualsSignKeyword_1_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAmpersand_Rule"


    // $ANTLR start "entryRuleFloat_Literal"
    // InternalMyDsl.g:3993:1: entryRuleFloat_Literal returns [EObject current=null] : iv_ruleFloat_Literal= ruleFloat_Literal EOF ;
    public final EObject entryRuleFloat_Literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat_Literal = null;


        try {
            // InternalMyDsl.g:3994:2: (iv_ruleFloat_Literal= ruleFloat_Literal EOF )
            // InternalMyDsl.g:3995:2: iv_ruleFloat_Literal= ruleFloat_Literal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloat_LiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFloat_Literal=ruleFloat_Literal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloat_Literal; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloat_Literal"


    // $ANTLR start "ruleFloat_Literal"
    // InternalMyDsl.g:4002:1: ruleFloat_Literal returns [EObject current=null] : ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= ruleEXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? ) ;
    public final EObject ruleFloat_Literal() throws RecognitionException {
        EObject current = null;

        Token lv_decimalDigits1_0_0=null;
        Token otherlv_1=null;
        Token lv_decimalDigits2_2_0=null;
        Token lv_floatTypeSufix_4_0=null;
        AntlrDatatypeRuleToken lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:4005:28: ( ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= ruleEXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? ) )
            // InternalMyDsl.g:4006:1: ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= ruleEXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? )
            {
            // InternalMyDsl.g:4006:1: ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= ruleEXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? )
            // InternalMyDsl.g:4006:2: ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= ruleEXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )?
            {
            // InternalMyDsl.g:4006:2: ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) )
            // InternalMyDsl.g:4007:1: (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS )
            {
            // InternalMyDsl.g:4007:1: (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS )
            // InternalMyDsl.g:4008:3: lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS
            {
            lv_decimalDigits1_0_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_decimalDigits1_0_0, grammarAccess.getFloat_LiteralAccess().getDecimalDigits1DECIMAL_DIGITSTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloat_LiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"decimalDigits1",
                      		lv_decimalDigits1_0_0, 
                      		"org.xtext.example.mydsl.MyDsl.DECIMAL_DIGITS");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,94,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFloat_LiteralAccess().getFullStopKeyword_1());
                  
            }
            // InternalMyDsl.g:4028:1: ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_DECIMAL_DIGITS) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:4029:1: (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS )
                    {
                    // InternalMyDsl.g:4029:1: (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS )
                    // InternalMyDsl.g:4030:3: lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS
                    {
                    lv_decimalDigits2_2_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_decimalDigits2_2_0, grammarAccess.getFloat_LiteralAccess().getDecimalDigits2DECIMAL_DIGITSTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFloat_LiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"decimalDigits2",
                              		lv_decimalDigits2_2_0, 
                              		"org.xtext.example.mydsl.MyDsl.DECIMAL_DIGITS");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:4046:3: ( (lv_exp_3_0= ruleEXPOENT_PART ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_EXPONENTIAL) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:4047:1: (lv_exp_3_0= ruleEXPOENT_PART )
                    {
                    // InternalMyDsl.g:4047:1: (lv_exp_3_0= ruleEXPOENT_PART )
                    // InternalMyDsl.g:4048:3: lv_exp_3_0= ruleEXPOENT_PART
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFloat_LiteralAccess().getExpEXPOENT_PARTParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_45);
                    lv_exp_3_0=ruleEXPOENT_PART();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFloat_LiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_3_0, 
                              		"org.xtext.example.mydsl.MyDsl.EXPOENT_PART");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:4064:3: ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_FLOAT_TYPE_SUFIX) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:4065:1: (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX )
                    {
                    // InternalMyDsl.g:4065:1: (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX )
                    // InternalMyDsl.g:4066:3: lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX
                    {
                    lv_floatTypeSufix_4_0=(Token)match(input,RULE_FLOAT_TYPE_SUFIX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_floatTypeSufix_4_0, grammarAccess.getFloat_LiteralAccess().getFloatTypeSufixFLOAT_TYPE_SUFIXTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFloat_LiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"floatTypeSufix",
                              		lv_floatTypeSufix_4_0, 
                              		"org.xtext.example.mydsl.MyDsl.FLOAT_TYPE_SUFIX");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFloat_Literal"


    // $ANTLR start "entryRuleLiteral_Expression"
    // InternalMyDsl.g:4090:1: entryRuleLiteral_Expression returns [EObject current=null] : iv_ruleLiteral_Expression= ruleLiteral_Expression EOF ;
    public final EObject entryRuleLiteral_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral_Expression = null;


        try {
            // InternalMyDsl.g:4091:2: (iv_ruleLiteral_Expression= ruleLiteral_Expression EOF )
            // InternalMyDsl.g:4092:2: iv_ruleLiteral_Expression= ruleLiteral_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteral_ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral_Expression=ruleLiteral_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral_Expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral_Expression"


    // $ANTLR start "ruleLiteral_Expression"
    // InternalMyDsl.g:4099:1: ruleLiteral_Expression returns [EObject current=null] : ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_charLit_6_0= RULE_CHAR ) ) ) ;
    public final EObject ruleLiteral_Expression() throws RecognitionException {
        EObject current = null;

        Token lv_exp_0_0=null;
        Token this_LONG_1=null;
        Token lv_exp1_2_0=null;
        Token this_LONG_3=null;
        Token lv_string_5_0=null;
        Token lv_charLit_6_0=null;
        EObject lv_exp2_4_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:4102:28: ( ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_charLit_6_0= RULE_CHAR ) ) ) )
            // InternalMyDsl.g:4103:1: ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_charLit_6_0= RULE_CHAR ) ) )
            {
            // InternalMyDsl.g:4103:1: ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_charLit_6_0= RULE_CHAR ) ) )
            int alt65=4;
            switch ( input.LA(1) ) {
            case RULE_HEXA:
                {
                alt65=1;
                }
                break;
            case RULE_DECIMAL_DIGITS:
                {
                int LA65_2 = input.LA(2);

                if ( (synpred134_InternalMyDsl()) ) {
                    alt65=1;
                }
                else if ( (synpred135_InternalMyDsl()) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt65=3;
                }
                break;
            case RULE_CHAR:
                {
                alt65=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalMyDsl.g:4103:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) )
                    {
                    // InternalMyDsl.g:4103:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_HEXA) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==RULE_DECIMAL_DIGITS) ) {
                        alt64=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalMyDsl.g:4103:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? )
                            {
                            // InternalMyDsl.g:4103:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? )
                            // InternalMyDsl.g:4103:4: ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )?
                            {
                            // InternalMyDsl.g:4103:4: ( (lv_exp_0_0= RULE_HEXA ) )
                            // InternalMyDsl.g:4104:1: (lv_exp_0_0= RULE_HEXA )
                            {
                            // InternalMyDsl.g:4104:1: (lv_exp_0_0= RULE_HEXA )
                            // InternalMyDsl.g:4105:3: lv_exp_0_0= RULE_HEXA
                            {
                            lv_exp_0_0=(Token)match(input,RULE_HEXA,FOLLOW_46); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_exp_0_0, grammarAccess.getLiteral_ExpressionAccess().getExpHEXATerminalRuleCall_0_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getLiteral_ExpressionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"exp",
                                      		lv_exp_0_0, 
                                      		"org.xtext.example.mydsl.MyDsl.HEXA");
                              	    
                            }

                            }


                            }

                            // InternalMyDsl.g:4121:2: (this_LONG_1= RULE_LONG )?
                            int alt62=2;
                            int LA62_0 = input.LA(1);

                            if ( (LA62_0==RULE_LONG) ) {
                                alt62=1;
                            }
                            switch (alt62) {
                                case 1 :
                                    // InternalMyDsl.g:4121:3: this_LONG_1= RULE_LONG
                                    {
                                    this_LONG_1=(Token)match(input,RULE_LONG,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_LONG_1, grammarAccess.getLiteral_ExpressionAccess().getLONGTerminalRuleCall_0_0_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:4126:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? )
                            {
                            // InternalMyDsl.g:4126:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? )
                            // InternalMyDsl.g:4126:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )?
                            {
                            // InternalMyDsl.g:4126:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) )
                            // InternalMyDsl.g:4127:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                            {
                            // InternalMyDsl.g:4127:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                            // InternalMyDsl.g:4128:3: lv_exp1_2_0= RULE_DECIMAL_DIGITS
                            {
                            lv_exp1_2_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_46); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_exp1_2_0, grammarAccess.getLiteral_ExpressionAccess().getExp1DECIMAL_DIGITSTerminalRuleCall_0_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getLiteral_ExpressionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"exp1",
                                      		lv_exp1_2_0, 
                                      		"org.xtext.example.mydsl.MyDsl.DECIMAL_DIGITS");
                              	    
                            }

                            }


                            }

                            // InternalMyDsl.g:4144:2: (this_LONG_3= RULE_LONG )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==RULE_LONG) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // InternalMyDsl.g:4144:3: this_LONG_3= RULE_LONG
                                    {
                                    this_LONG_3=(Token)match(input,RULE_LONG,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_LONG_3, grammarAccess.getLiteral_ExpressionAccess().getLONGTerminalRuleCall_0_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4149:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
                    {
                    // InternalMyDsl.g:4149:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
                    // InternalMyDsl.g:4150:1: (lv_exp2_4_0= ruleFloat_Literal )
                    {
                    // InternalMyDsl.g:4150:1: (lv_exp2_4_0= ruleFloat_Literal )
                    // InternalMyDsl.g:4151:3: lv_exp2_4_0= ruleFloat_Literal
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteral_ExpressionAccess().getExp2Float_LiteralParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp2_4_0=ruleFloat_Literal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteral_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"exp2",
                              		lv_exp2_4_0, 
                              		"org.xtext.example.mydsl.MyDsl.Float_Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:4168:6: ( (lv_string_5_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:4168:6: ( (lv_string_5_0= RULE_STRING ) )
                    // InternalMyDsl.g:4169:1: (lv_string_5_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:4169:1: (lv_string_5_0= RULE_STRING )
                    // InternalMyDsl.g:4170:3: lv_string_5_0= RULE_STRING
                    {
                    lv_string_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_string_5_0, grammarAccess.getLiteral_ExpressionAccess().getStringSTRINGTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteral_ExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"string",
                              		lv_string_5_0, 
                              		"org.xtext.example.mydsl.MyDsl.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:4187:6: ( (lv_charLit_6_0= RULE_CHAR ) )
                    {
                    // InternalMyDsl.g:4187:6: ( (lv_charLit_6_0= RULE_CHAR ) )
                    // InternalMyDsl.g:4188:1: (lv_charLit_6_0= RULE_CHAR )
                    {
                    // InternalMyDsl.g:4188:1: (lv_charLit_6_0= RULE_CHAR )
                    // InternalMyDsl.g:4189:3: lv_charLit_6_0= RULE_CHAR
                    {
                    lv_charLit_6_0=(Token)match(input,RULE_CHAR,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_charLit_6_0, grammarAccess.getLiteral_ExpressionAccess().getCharLitCHARTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteral_ExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"charLit",
                              		lv_charLit_6_0, 
                              		"org.xtext.example.mydsl.MyDsl.CHAR");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteral_Expression"


    // $ANTLR start "entryRuleCreating_Expression"
    // InternalMyDsl.g:4213:1: entryRuleCreating_Expression returns [EObject current=null] : iv_ruleCreating_Expression= ruleCreating_Expression EOF ;
    public final EObject entryRuleCreating_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreating_Expression = null;


        try {
            // InternalMyDsl.g:4214:2: (iv_ruleCreating_Expression= ruleCreating_Expression EOF )
            // InternalMyDsl.g:4215:2: iv_ruleCreating_Expression= ruleCreating_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreating_ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCreating_Expression=ruleCreating_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreating_Expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCreating_Expression"


    // $ANTLR start "ruleCreating_Expression"
    // InternalMyDsl.g:4222:1: ruleCreating_Expression returns [EObject current=null] : (this_NEW_0= RULE_NEW ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) | (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN ) ) ) ;
    public final EObject ruleCreating_Expression() throws RecognitionException {
        EObject current = null;

        Token this_NEW_0=null;
        Token this_LPAREN_2=null;
        Token this_RPAREN_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token this_LPAREN_13=null;
        Token this_RPAREN_15=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        EObject lv_argList_3_0 = null;

        EObject lv_typeSpecifier_5_0 = null;

        EObject lv_expression_7_0 = null;

        EObject lv_expression_14_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:4225:28: ( (this_NEW_0= RULE_NEW ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) | (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN ) ) ) )
            // InternalMyDsl.g:4226:1: (this_NEW_0= RULE_NEW ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) | (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN ) ) )
            {
            // InternalMyDsl.g:4226:1: (this_NEW_0= RULE_NEW ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) | (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN ) ) )
            // InternalMyDsl.g:4226:2: this_NEW_0= RULE_NEW ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) | (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN ) )
            {
            this_NEW_0=(Token)match(input,RULE_NEW,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NEW_0, grammarAccess.getCreating_ExpressionAccess().getNEWTerminalRuleCall_0()); 
                  
            }
            // InternalMyDsl.g:4230:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) | (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN ) )
            int alt68=3;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // InternalMyDsl.g:4230:2: ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN )
                    {
                    // InternalMyDsl.g:4230:2: ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN )
                    // InternalMyDsl.g:4230:3: ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN
                    {
                    // InternalMyDsl.g:4230:3: ( (lv_className_1_0= ruleClass_name ) )
                    // InternalMyDsl.g:4231:1: (lv_className_1_0= ruleClass_name )
                    {
                    // InternalMyDsl.g:4231:1: (lv_className_1_0= ruleClass_name )
                    // InternalMyDsl.g:4232:3: lv_className_1_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_17);
                    lv_className_1_0=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"className",
                              		lv_className_1_0, 
                              		"org.xtext.example.mydsl.MyDsl.Class_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LPAREN_2=(Token)match(input,RULE_LPAREN,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_2, grammarAccess.getCreating_ExpressionAccess().getLPARENTerminalRuleCall_1_0_1()); 
                          
                    }
                    // InternalMyDsl.g:4252:1: ( (lv_argList_3_0= ruleArg_List ) )
                    // InternalMyDsl.g:4253:1: (lv_argList_3_0= ruleArg_List )
                    {
                    // InternalMyDsl.g:4253:1: (lv_argList_3_0= ruleArg_List )
                    // InternalMyDsl.g:4254:3: lv_argList_3_0= ruleArg_List
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getArgListArg_ListParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_19);
                    lv_argList_3_0=ruleArg_List();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"argList",
                              		lv_argList_3_0, 
                              		"org.xtext.example.mydsl.MyDsl.Arg_List");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RPAREN_4=(Token)match(input,RULE_RPAREN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_4, grammarAccess.getCreating_ExpressionAccess().getRPARENTerminalRuleCall_1_0_3()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4275:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* )
                    {
                    // InternalMyDsl.g:4275:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* )
                    // InternalMyDsl.g:4275:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )*
                    {
                    // InternalMyDsl.g:4275:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) )
                    // InternalMyDsl.g:4276:1: (lv_typeSpecifier_5_0= ruleType_specifier )
                    {
                    // InternalMyDsl.g:4276:1: (lv_typeSpecifier_5_0= ruleType_specifier )
                    // InternalMyDsl.g:4277:3: lv_typeSpecifier_5_0= ruleType_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getTypeSpecifierType_specifierParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_25);
                    lv_typeSpecifier_5_0=ruleType_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"typeSpecifier",
                              		lv_typeSpecifier_5_0, 
                              		"org.xtext.example.mydsl.MyDsl.Type_specifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:4293:2: ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )?
                    int alt66=3;
                    alt66 = dfa66.predict(input);
                    switch (alt66) {
                        case 1 :
                            // InternalMyDsl.g:4293:3: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )
                            {
                            // InternalMyDsl.g:4293:3: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )
                            // InternalMyDsl.g:4293:5: otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']'
                            {
                            otherlv_6=(Token)match(input,75,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getCreating_ExpressionAccess().getLeftSquareBracketKeyword_1_1_1_0_0());
                                  
                            }
                            // InternalMyDsl.g:4297:1: ( (lv_expression_7_0= ruleExpression ) )
                            // InternalMyDsl.g:4298:1: (lv_expression_7_0= ruleExpression )
                            {
                            // InternalMyDsl.g:4298:1: (lv_expression_7_0= ruleExpression )
                            // InternalMyDsl.g:4299:3: lv_expression_7_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_1_1_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_21);
                            lv_expression_7_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCreating_ExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"expression",
                                      		lv_expression_7_0, 
                                      		"org.xtext.example.mydsl.MyDsl.Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,76,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getCreating_ExpressionAccess().getRightSquareBracketKeyword_1_1_1_0_2());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:4320:7: otherlv_9= '[]'
                            {
                            otherlv_9=(Token)match(input,77,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getCreating_ExpressionAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1_1_1());
                                  
                            }

                            }
                            break;

                    }

                    // InternalMyDsl.g:4324:3: ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )*
                    loop67:
                    do {
                        int alt67=3;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==75) ) {
                            int LA67_2 = input.LA(2);

                            if ( (LA67_2==76) ) {
                                alt67=1;
                            }


                        }
                        else if ( (LA67_0==77) ) {
                            alt67=2;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalMyDsl.g:4324:4: (otherlv_10= '[' otherlv_11= ']' )
                    	    {
                    	    // InternalMyDsl.g:4324:4: (otherlv_10= '[' otherlv_11= ']' )
                    	    // InternalMyDsl.g:4324:6: otherlv_10= '[' otherlv_11= ']'
                    	    {
                    	    otherlv_10=(Token)match(input,75,FOLLOW_21); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getCreating_ExpressionAccess().getLeftSquareBracketKeyword_1_1_2_0_0());
                    	          
                    	    }
                    	    otherlv_11=(Token)match(input,76,FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getCreating_ExpressionAccess().getRightSquareBracketKeyword_1_1_2_0_1());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:4333:7: otherlv_12= '[]'
                    	    {
                    	    otherlv_12=(Token)match(input,77,FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_12, grammarAccess.getCreating_ExpressionAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:4338:6: (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN )
                    {
                    // InternalMyDsl.g:4338:6: (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN )
                    // InternalMyDsl.g:4338:7: this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN
                    {
                    this_LPAREN_13=(Token)match(input,RULE_LPAREN,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_13, grammarAccess.getCreating_ExpressionAccess().getLPARENTerminalRuleCall_1_2_0()); 
                          
                    }
                    // InternalMyDsl.g:4342:1: ( (lv_expression_14_0= ruleExpression ) )
                    // InternalMyDsl.g:4343:1: (lv_expression_14_0= ruleExpression )
                    {
                    // InternalMyDsl.g:4343:1: (lv_expression_14_0= ruleExpression )
                    // InternalMyDsl.g:4344:3: lv_expression_14_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_19);
                    lv_expression_14_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_14_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RPAREN_15=(Token)match(input,RULE_RPAREN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_15, grammarAccess.getCreating_ExpressionAccess().getRPARENTerminalRuleCall_1_2_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCreating_Expression"


    // $ANTLR start "entryRuleCast_Expression"
    // InternalMyDsl.g:4372:1: entryRuleCast_Expression returns [EObject current=null] : iv_ruleCast_Expression= ruleCast_Expression EOF ;
    public final EObject entryRuleCast_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast_Expression = null;


        try {
            // InternalMyDsl.g:4373:2: (iv_ruleCast_Expression= ruleCast_Expression EOF )
            // InternalMyDsl.g:4374:2: iv_ruleCast_Expression= ruleCast_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCast_ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCast_Expression=ruleCast_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCast_Expression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCast_Expression"


    // $ANTLR start "ruleCast_Expression"
    // InternalMyDsl.g:4381:1: ruleCast_Expression returns [EObject current=null] : (this_LPAREN_0= RULE_LPAREN ( (lv_type_1_0= ruleType ) ) this_RPAREN_2= RULE_RPAREN ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleCast_Expression() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_0=null;
        Token this_RPAREN_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:4384:28: ( (this_LPAREN_0= RULE_LPAREN ( (lv_type_1_0= ruleType ) ) this_RPAREN_2= RULE_RPAREN ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:4385:1: (this_LPAREN_0= RULE_LPAREN ( (lv_type_1_0= ruleType ) ) this_RPAREN_2= RULE_RPAREN ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:4385:1: (this_LPAREN_0= RULE_LPAREN ( (lv_type_1_0= ruleType ) ) this_RPAREN_2= RULE_RPAREN ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalMyDsl.g:4385:2: this_LPAREN_0= RULE_LPAREN ( (lv_type_1_0= ruleType ) ) this_RPAREN_2= RULE_RPAREN ( (lv_expression_3_0= ruleExpression ) )
            {
            this_LPAREN_0=(Token)match(input,RULE_LPAREN,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_0, grammarAccess.getCast_ExpressionAccess().getLPARENTerminalRuleCall_0()); 
                  
            }
            // InternalMyDsl.g:4389:1: ( (lv_type_1_0= ruleType ) )
            // InternalMyDsl.g:4390:1: (lv_type_1_0= ruleType )
            {
            // InternalMyDsl.g:4390:1: (lv_type_1_0= ruleType )
            // InternalMyDsl.g:4391:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCast_ExpressionAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_19);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCast_ExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"org.xtext.example.mydsl.MyDsl.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RPAREN_2=(Token)match(input,RULE_RPAREN,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_2, grammarAccess.getCast_ExpressionAccess().getRPARENTerminalRuleCall_2()); 
                  
            }
            // InternalMyDsl.g:4411:1: ( (lv_expression_3_0= ruleExpression ) )
            // InternalMyDsl.g:4412:1: (lv_expression_3_0= ruleExpression )
            {
            // InternalMyDsl.g:4412:1: (lv_expression_3_0= ruleExpression )
            // InternalMyDsl.g:4413:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCast_ExpressionAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCast_ExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"org.xtext.example.mydsl.MyDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCast_Expression"


    // $ANTLR start "entryRuleBit_Expression_NR"
    // InternalMyDsl.g:4437:1: entryRuleBit_Expression_NR returns [EObject current=null] : iv_ruleBit_Expression_NR= ruleBit_Expression_NR EOF ;
    public final EObject entryRuleBit_Expression_NR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBit_Expression_NR = null;


        try {
            // InternalMyDsl.g:4438:2: (iv_ruleBit_Expression_NR= ruleBit_Expression_NR EOF )
            // InternalMyDsl.g:4439:2: iv_ruleBit_Expression_NR= ruleBit_Expression_NR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBit_Expression_NRRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBit_Expression_NR=ruleBit_Expression_NR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBit_Expression_NR; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBit_Expression_NR"


    // $ANTLR start "ruleBit_Expression_NR"
    // InternalMyDsl.g:4446:1: ruleBit_Expression_NR returns [EObject current=null] : (this_NOT_0= RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleBit_Expression_NR() throws RecognitionException {
        EObject current = null;

        Token this_NOT_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:4449:28: ( (this_NOT_0= RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:4450:1: (this_NOT_0= RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:4450:1: (this_NOT_0= RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalMyDsl.g:4450:2: this_NOT_0= RULE_NOT ( (lv_expression_1_0= ruleExpression ) )
            {
            this_NOT_0=(Token)match(input,RULE_NOT,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NOT_0, grammarAccess.getBit_Expression_NRAccess().getNOTTerminalRuleCall_0()); 
                  
            }
            // InternalMyDsl.g:4454:1: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMyDsl.g:4455:1: (lv_expression_1_0= ruleExpression )
            {
            // InternalMyDsl.g:4455:1: (lv_expression_1_0= ruleExpression )
            // InternalMyDsl.g:4456:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBit_Expression_NRAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBit_Expression_NRRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"org.xtext.example.mydsl.MyDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBit_Expression_NR"


    // $ANTLR start "entryRuleLogical_Expression_NR"
    // InternalMyDsl.g:4480:1: entryRuleLogical_Expression_NR returns [EObject current=null] : iv_ruleLogical_Expression_NR= ruleLogical_Expression_NR EOF ;
    public final EObject entryRuleLogical_Expression_NR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogical_Expression_NR = null;


        try {
            // InternalMyDsl.g:4481:2: (iv_ruleLogical_Expression_NR= ruleLogical_Expression_NR EOF )
            // InternalMyDsl.g:4482:2: iv_ruleLogical_Expression_NR= ruleLogical_Expression_NR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_Expression_NRRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogical_Expression_NR=ruleLogical_Expression_NR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogical_Expression_NR; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogical_Expression_NR"


    // $ANTLR start "ruleLogical_Expression_NR"
    // InternalMyDsl.g:4489:1: ruleLogical_Expression_NR returns [EObject current=null] : ( ( ( (lv_exclamation_0_0= RULE_EXCLAMATION ) ) ( ( (lv_expression_1_0= ruleExpression ) ) | (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN ) ) ) | (this_LPAREN_5= RULE_LPAREN ( (lv_expression_6_0= ruleExpression ) ) this_RPAREN_7= RULE_RPAREN ) | ( (lv_true_8_0= RULE_TRUE ) ) | ( (lv_false_9_0= RULE_FALSE ) ) ) ;
    public final EObject ruleLogical_Expression_NR() throws RecognitionException {
        EObject current = null;

        Token lv_exclamation_0_0=null;
        Token this_LPAREN_2=null;
        Token this_RPAREN_4=null;
        Token this_LPAREN_5=null;
        Token this_RPAREN_7=null;
        Token lv_true_8_0=null;
        Token lv_false_9_0=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:4492:28: ( ( ( ( (lv_exclamation_0_0= RULE_EXCLAMATION ) ) ( ( (lv_expression_1_0= ruleExpression ) ) | (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN ) ) ) | (this_LPAREN_5= RULE_LPAREN ( (lv_expression_6_0= ruleExpression ) ) this_RPAREN_7= RULE_RPAREN ) | ( (lv_true_8_0= RULE_TRUE ) ) | ( (lv_false_9_0= RULE_FALSE ) ) ) )
            // InternalMyDsl.g:4493:1: ( ( ( (lv_exclamation_0_0= RULE_EXCLAMATION ) ) ( ( (lv_expression_1_0= ruleExpression ) ) | (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN ) ) ) | (this_LPAREN_5= RULE_LPAREN ( (lv_expression_6_0= ruleExpression ) ) this_RPAREN_7= RULE_RPAREN ) | ( (lv_true_8_0= RULE_TRUE ) ) | ( (lv_false_9_0= RULE_FALSE ) ) )
            {
            // InternalMyDsl.g:4493:1: ( ( ( (lv_exclamation_0_0= RULE_EXCLAMATION ) ) ( ( (lv_expression_1_0= ruleExpression ) ) | (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN ) ) ) | (this_LPAREN_5= RULE_LPAREN ( (lv_expression_6_0= ruleExpression ) ) this_RPAREN_7= RULE_RPAREN ) | ( (lv_true_8_0= RULE_TRUE ) ) | ( (lv_false_9_0= RULE_FALSE ) ) )
            int alt70=4;
            switch ( input.LA(1) ) {
            case RULE_EXCLAMATION:
                {
                alt70=1;
                }
                break;
            case RULE_LPAREN:
                {
                alt70=2;
                }
                break;
            case RULE_TRUE:
                {
                alt70=3;
                }
                break;
            case RULE_FALSE:
                {
                alt70=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalMyDsl.g:4493:2: ( ( (lv_exclamation_0_0= RULE_EXCLAMATION ) ) ( ( (lv_expression_1_0= ruleExpression ) ) | (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN ) ) )
                    {
                    // InternalMyDsl.g:4493:2: ( ( (lv_exclamation_0_0= RULE_EXCLAMATION ) ) ( ( (lv_expression_1_0= ruleExpression ) ) | (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN ) ) )
                    // InternalMyDsl.g:4493:3: ( (lv_exclamation_0_0= RULE_EXCLAMATION ) ) ( ( (lv_expression_1_0= ruleExpression ) ) | (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN ) )
                    {
                    // InternalMyDsl.g:4493:3: ( (lv_exclamation_0_0= RULE_EXCLAMATION ) )
                    // InternalMyDsl.g:4494:1: (lv_exclamation_0_0= RULE_EXCLAMATION )
                    {
                    // InternalMyDsl.g:4494:1: (lv_exclamation_0_0= RULE_EXCLAMATION )
                    // InternalMyDsl.g:4495:3: lv_exclamation_0_0= RULE_EXCLAMATION
                    {
                    lv_exclamation_0_0=(Token)match(input,RULE_EXCLAMATION,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_exclamation_0_0, grammarAccess.getLogical_Expression_NRAccess().getExclamationEXCLAMATIONTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLogical_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"exclamation",
                              		lv_exclamation_0_0, 
                              		"org.xtext.example.mydsl.MyDsl.EXCLAMATION");
                      	    
                    }

                    }


                    }

                    // InternalMyDsl.g:4511:2: ( ( (lv_expression_1_0= ruleExpression ) ) | (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN ) )
                    int alt69=2;
                    alt69 = dfa69.predict(input);
                    switch (alt69) {
                        case 1 :
                            // InternalMyDsl.g:4511:3: ( (lv_expression_1_0= ruleExpression ) )
                            {
                            // InternalMyDsl.g:4511:3: ( (lv_expression_1_0= ruleExpression ) )
                            // InternalMyDsl.g:4512:1: (lv_expression_1_0= ruleExpression )
                            {
                            // InternalMyDsl.g:4512:1: (lv_expression_1_0= ruleExpression )
                            // InternalMyDsl.g:4513:3: lv_expression_1_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLogical_Expression_NRAccess().getExpressionExpressionParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_2);
                            lv_expression_1_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLogical_Expression_NRRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"expression",
                                      		lv_expression_1_0, 
                                      		"org.xtext.example.mydsl.MyDsl.Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:4530:6: (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN )
                            {
                            // InternalMyDsl.g:4530:6: (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN )
                            // InternalMyDsl.g:4530:7: this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN
                            {
                            this_LPAREN_2=(Token)match(input,RULE_LPAREN,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LPAREN_2, grammarAccess.getLogical_Expression_NRAccess().getLPARENTerminalRuleCall_0_1_1_0()); 
                                  
                            }
                            // InternalMyDsl.g:4534:1: ( (lv_expression_3_0= ruleExpression ) )
                            // InternalMyDsl.g:4535:1: (lv_expression_3_0= ruleExpression )
                            {
                            // InternalMyDsl.g:4535:1: (lv_expression_3_0= ruleExpression )
                            // InternalMyDsl.g:4536:3: lv_expression_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLogical_Expression_NRAccess().getExpressionExpressionParserRuleCall_0_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_19);
                            lv_expression_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLogical_Expression_NRRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"expression",
                                      		lv_expression_3_0, 
                                      		"org.xtext.example.mydsl.MyDsl.Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            this_RPAREN_4=(Token)match(input,RULE_RPAREN,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_RPAREN_4, grammarAccess.getLogical_Expression_NRAccess().getRPARENTerminalRuleCall_0_1_1_2()); 
                                  
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4557:6: (this_LPAREN_5= RULE_LPAREN ( (lv_expression_6_0= ruleExpression ) ) this_RPAREN_7= RULE_RPAREN )
                    {
                    // InternalMyDsl.g:4557:6: (this_LPAREN_5= RULE_LPAREN ( (lv_expression_6_0= ruleExpression ) ) this_RPAREN_7= RULE_RPAREN )
                    // InternalMyDsl.g:4557:7: this_LPAREN_5= RULE_LPAREN ( (lv_expression_6_0= ruleExpression ) ) this_RPAREN_7= RULE_RPAREN
                    {
                    this_LPAREN_5=(Token)match(input,RULE_LPAREN,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_5, grammarAccess.getLogical_Expression_NRAccess().getLPARENTerminalRuleCall_1_0()); 
                          
                    }
                    // InternalMyDsl.g:4561:1: ( (lv_expression_6_0= ruleExpression ) )
                    // InternalMyDsl.g:4562:1: (lv_expression_6_0= ruleExpression )
                    {
                    // InternalMyDsl.g:4562:1: (lv_expression_6_0= ruleExpression )
                    // InternalMyDsl.g:4563:3: lv_expression_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogical_Expression_NRAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_19);
                    lv_expression_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogical_Expression_NRRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_6_0, 
                              		"org.xtext.example.mydsl.MyDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RPAREN_7=(Token)match(input,RULE_RPAREN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_7, grammarAccess.getLogical_Expression_NRAccess().getRPARENTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:4584:6: ( (lv_true_8_0= RULE_TRUE ) )
                    {
                    // InternalMyDsl.g:4584:6: ( (lv_true_8_0= RULE_TRUE ) )
                    // InternalMyDsl.g:4585:1: (lv_true_8_0= RULE_TRUE )
                    {
                    // InternalMyDsl.g:4585:1: (lv_true_8_0= RULE_TRUE )
                    // InternalMyDsl.g:4586:3: lv_true_8_0= RULE_TRUE
                    {
                    lv_true_8_0=(Token)match(input,RULE_TRUE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_true_8_0, grammarAccess.getLogical_Expression_NRAccess().getTrueTRUETerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLogical_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"true",
                              		lv_true_8_0, 
                              		"org.xtext.example.mydsl.MyDsl.TRUE");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:4603:6: ( (lv_false_9_0= RULE_FALSE ) )
                    {
                    // InternalMyDsl.g:4603:6: ( (lv_false_9_0= RULE_FALSE ) )
                    // InternalMyDsl.g:4604:1: (lv_false_9_0= RULE_FALSE )
                    {
                    // InternalMyDsl.g:4604:1: (lv_false_9_0= RULE_FALSE )
                    // InternalMyDsl.g:4605:3: lv_false_9_0= RULE_FALSE
                    {
                    lv_false_9_0=(Token)match(input,RULE_FALSE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_false_9_0, grammarAccess.getLogical_Expression_NRAccess().getFalseFALSETerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLogical_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"false",
                              		lv_false_9_0, 
                              		"org.xtext.example.mydsl.MyDsl.FALSE");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLogical_Expression_NR"


    // $ANTLR start "entryRuleArg_List"
    // InternalMyDsl.g:4629:1: entryRuleArg_List returns [EObject current=null] : iv_ruleArg_List= ruleArg_List EOF ;
    public final EObject entryRuleArg_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArg_List = null;


        try {
            // InternalMyDsl.g:4630:2: (iv_ruleArg_List= ruleArg_List EOF )
            // InternalMyDsl.g:4631:2: iv_ruleArg_List= ruleArg_List EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArg_ListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArg_List=ruleArg_List();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArg_List; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArg_List"


    // $ANTLR start "ruleArg_List"
    // InternalMyDsl.g:4638:1: ruleArg_List returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleArg_List() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:4641:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) )
            // InternalMyDsl.g:4642:1: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            {
            // InternalMyDsl.g:4642:1: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            // InternalMyDsl.g:4642:2: ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            {
            // InternalMyDsl.g:4642:2: ( (lv_expression_0_0= ruleExpression ) )
            // InternalMyDsl.g:4643:1: (lv_expression_0_0= ruleExpression )
            {
            // InternalMyDsl.g:4643:1: (lv_expression_0_0= ruleExpression )
            // InternalMyDsl.g:4644:3: lv_expression_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArg_ListAccess().getExpressionExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_24);
            lv_expression_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArg_ListRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_0_0, 
                      		"org.xtext.example.mydsl.MyDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMyDsl.g:4660:2: (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==72) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalMyDsl.g:4660:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,72,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getArg_ListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalMyDsl.g:4664:1: ( (lv_expressions_2_0= ruleExpression ) )
            	    // InternalMyDsl.g:4665:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:4665:1: (lv_expressions_2_0= ruleExpression )
            	    // InternalMyDsl.g:4666:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArg_ListAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArg_ListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArg_List"


    // $ANTLR start "entryRuleNumeric_Expression_NR"
    // InternalMyDsl.g:4690:1: entryRuleNumeric_Expression_NR returns [EObject current=null] : iv_ruleNumeric_Expression_NR= ruleNumeric_Expression_NR EOF ;
    public final EObject entryRuleNumeric_Expression_NR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeric_Expression_NR = null;


        try {
            // InternalMyDsl.g:4691:2: (iv_ruleNumeric_Expression_NR= ruleNumeric_Expression_NR EOF )
            // InternalMyDsl.g:4692:2: iv_ruleNumeric_Expression_NR= ruleNumeric_Expression_NR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumeric_Expression_NRRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumeric_Expression_NR=ruleNumeric_Expression_NR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumeric_Expression_NR; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumeric_Expression_NR"


    // $ANTLR start "ruleNumeric_Expression_NR"
    // InternalMyDsl.g:4699:1: ruleNumeric_Expression_NR returns [EObject current=null] : ( ( ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleNumeric_Expression_NR() throws RecognitionException {
        EObject current = null;

        Token lv_sinal_numeric_0_1=null;
        Token lv_sinal_numeric_0_2=null;
        Token lv_sinal_numeric_0_3=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:4702:28: ( ( ( ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:4703:1: ( ( ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:4703:1: ( ( ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalMyDsl.g:4703:2: ( ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) )
            {
            // InternalMyDsl.g:4703:2: ( ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) )
            // InternalMyDsl.g:4704:1: ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) )
            {
            // InternalMyDsl.g:4704:1: ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) )
            // InternalMyDsl.g:4705:1: (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT )
            {
            // InternalMyDsl.g:4705:1: (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt72=1;
                }
                break;
            case RULE_INCREMENT:
                {
                alt72=2;
                }
                break;
            case RULE_DECREMENT:
                {
                alt72=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalMyDsl.g:4706:3: lv_sinal_numeric_0_1= '-'
                    {
                    lv_sinal_numeric_0_1=(Token)match(input,96,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_sinal_numeric_0_1, grammarAccess.getNumeric_Expression_NRAccess().getSinal_numericHyphenMinusKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumeric_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(current, "sinal_numeric", lv_sinal_numeric_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4718:8: lv_sinal_numeric_0_2= RULE_INCREMENT
                    {
                    lv_sinal_numeric_0_2=(Token)match(input,RULE_INCREMENT,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sinal_numeric_0_2, grammarAccess.getNumeric_Expression_NRAccess().getSinal_numericINCREMENTTerminalRuleCall_0_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumeric_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sinal_numeric",
                              		lv_sinal_numeric_0_2, 
                              		"org.xtext.example.mydsl.MyDsl.INCREMENT");
                      	    
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:4733:8: lv_sinal_numeric_0_3= RULE_DECREMENT
                    {
                    lv_sinal_numeric_0_3=(Token)match(input,RULE_DECREMENT,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sinal_numeric_0_3, grammarAccess.getNumeric_Expression_NRAccess().getSinal_numericDECREMENTTerminalRuleCall_0_0_2()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumeric_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sinal_numeric",
                              		lv_sinal_numeric_0_3, 
                              		"org.xtext.example.mydsl.MyDsl.DECREMENT");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:4751:2: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMyDsl.g:4752:1: (lv_expression_1_0= ruleExpression )
            {
            // InternalMyDsl.g:4752:1: (lv_expression_1_0= ruleExpression )
            // InternalMyDsl.g:4753:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumeric_Expression_NRAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumeric_Expression_NRRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"org.xtext.example.mydsl.MyDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNumeric_Expression_NR"


    // $ANTLR start "entryRuleSwitch_statement"
    // InternalMyDsl.g:4777:1: entryRuleSwitch_statement returns [EObject current=null] : iv_ruleSwitch_statement= ruleSwitch_statement EOF ;
    public final EObject entryRuleSwitch_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch_statement = null;


        try {
            // InternalMyDsl.g:4778:2: (iv_ruleSwitch_statement= ruleSwitch_statement EOF )
            // InternalMyDsl.g:4779:2: iv_ruleSwitch_statement= ruleSwitch_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitch_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitch_statement=ruleSwitch_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitch_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitch_statement"


    // $ANTLR start "ruleSwitch_statement"
    // InternalMyDsl.g:4786:1: ruleSwitch_statement returns [EObject current=null] : ( () otherlv_1= 'switch' ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) this_R_CURLY_BRACE_5= RULE_R_CURLY_BRACE ( (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (otherlv_9= 'default' this_COLON_10= RULE_COLON ) | ( (lv_switchStatements_11_0= ruleStatement ) ) )* this_L_CURLY_BRACE_12= RULE_L_CURLY_BRACE ) ;
    public final EObject ruleSwitch_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lParen_2_0=null;
        Token lv_rparent_4_0=null;
        Token this_R_CURLY_BRACE_5=null;
        Token otherlv_6=null;
        Token this_COLON_8=null;
        Token otherlv_9=null;
        Token this_COLON_10=null;
        Token this_L_CURLY_BRACE_12=null;
        EObject lv_expression_3_0 = null;

        EObject lv_expression2_7_0 = null;

        EObject lv_switchStatements_11_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:4789:28: ( ( () otherlv_1= 'switch' ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) this_R_CURLY_BRACE_5= RULE_R_CURLY_BRACE ( (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (otherlv_9= 'default' this_COLON_10= RULE_COLON ) | ( (lv_switchStatements_11_0= ruleStatement ) ) )* this_L_CURLY_BRACE_12= RULE_L_CURLY_BRACE ) )
            // InternalMyDsl.g:4790:1: ( () otherlv_1= 'switch' ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) this_R_CURLY_BRACE_5= RULE_R_CURLY_BRACE ( (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (otherlv_9= 'default' this_COLON_10= RULE_COLON ) | ( (lv_switchStatements_11_0= ruleStatement ) ) )* this_L_CURLY_BRACE_12= RULE_L_CURLY_BRACE )
            {
            // InternalMyDsl.g:4790:1: ( () otherlv_1= 'switch' ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) this_R_CURLY_BRACE_5= RULE_R_CURLY_BRACE ( (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (otherlv_9= 'default' this_COLON_10= RULE_COLON ) | ( (lv_switchStatements_11_0= ruleStatement ) ) )* this_L_CURLY_BRACE_12= RULE_L_CURLY_BRACE )
            // InternalMyDsl.g:4790:2: () otherlv_1= 'switch' ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) this_R_CURLY_BRACE_5= RULE_R_CURLY_BRACE ( (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (otherlv_9= 'default' this_COLON_10= RULE_COLON ) | ( (lv_switchStatements_11_0= ruleStatement ) ) )* this_L_CURLY_BRACE_12= RULE_L_CURLY_BRACE
            {
            // InternalMyDsl.g:4790:2: ()
            // InternalMyDsl.g:4791:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSwitch_statementAccess().getSwitch_statementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,97,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitch_statementAccess().getSwitchKeyword_1());
                  
            }
            // InternalMyDsl.g:4803:1: ( (lv_lParen_2_0= RULE_LPAREN ) )
            // InternalMyDsl.g:4804:1: (lv_lParen_2_0= RULE_LPAREN )
            {
            // InternalMyDsl.g:4804:1: (lv_lParen_2_0= RULE_LPAREN )
            // InternalMyDsl.g:4805:3: lv_lParen_2_0= RULE_LPAREN
            {
            lv_lParen_2_0=(Token)match(input,RULE_LPAREN,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_lParen_2_0, grammarAccess.getSwitch_statementAccess().getLParenLPARENTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSwitch_statementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"lParen",
                      		lv_lParen_2_0, 
                      		"org.xtext.example.mydsl.MyDsl.LPAREN");
              	    
            }

            }


            }

            // InternalMyDsl.g:4821:2: ( (lv_expression_3_0= ruleExpression ) )
            // InternalMyDsl.g:4822:1: (lv_expression_3_0= ruleExpression )
            {
            // InternalMyDsl.g:4822:1: (lv_expression_3_0= ruleExpression )
            // InternalMyDsl.g:4823:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_19);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitch_statementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"org.xtext.example.mydsl.MyDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMyDsl.g:4839:2: ( (lv_rparent_4_0= RULE_RPAREN ) )
            // InternalMyDsl.g:4840:1: (lv_rparent_4_0= RULE_RPAREN )
            {
            // InternalMyDsl.g:4840:1: (lv_rparent_4_0= RULE_RPAREN )
            // InternalMyDsl.g:4841:3: lv_rparent_4_0= RULE_RPAREN
            {
            lv_rparent_4_0=(Token)match(input,RULE_RPAREN,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_4_0, grammarAccess.getSwitch_statementAccess().getRparentRPARENTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSwitch_statementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_4_0, 
                      		"org.xtext.example.mydsl.MyDsl.RPAREN");
              	    
            }

            }


            }

            this_R_CURLY_BRACE_5=(Token)match(input,RULE_R_CURLY_BRACE,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_R_CURLY_BRACE_5, grammarAccess.getSwitch_statementAccess().getR_CURLY_BRACETerminalRuleCall_5()); 
                  
            }
            // InternalMyDsl.g:4861:1: ( (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (otherlv_9= 'default' this_COLON_10= RULE_COLON ) | ( (lv_switchStatements_11_0= ruleStatement ) ) )*
            loop73:
            do {
                int alt73=4;
                switch ( input.LA(1) ) {
                case 98:
                    {
                    alt73=1;
                    }
                    break;
                case 99:
                    {
                    alt73=2;
                    }
                    break;
                case RULE_ID:
                case RULE_R_CURLY_BRACE:
                case RULE_LPAREN:
                case RULE_MOD:
                case RULE_STATIC:
                case RULE_NULL:
                case RULE_SUPER:
                case RULE_THIS:
                case RULE_INCREMENT:
                case RULE_DECREMENT:
                case RULE_DECIMAL_DIGITS:
                case RULE_HEXA:
                case RULE_STRING:
                case RULE_CHAR:
                case RULE_NEW:
                case RULE_NOT:
                case RULE_EXCLAMATION:
                case RULE_TRUE:
                case RULE_FALSE:
                case 71:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 96:
                case 97:
                case 100:
                case 101:
                case 103:
                case 105:
                    {
                    alt73=3;
                    }
                    break;

                }

                switch (alt73) {
            	case 1 :
            	    // InternalMyDsl.g:4861:2: (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON )
            	    {
            	    // InternalMyDsl.g:4861:2: (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON )
            	    // InternalMyDsl.g:4861:4: otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON
            	    {
            	    otherlv_6=(Token)match(input,98,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getSwitch_statementAccess().getCaseKeyword_6_0_0());
            	          
            	    }
            	    // InternalMyDsl.g:4865:1: ( (lv_expression2_7_0= ruleExpression ) )
            	    // InternalMyDsl.g:4866:1: (lv_expression2_7_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:4866:1: (lv_expression2_7_0= ruleExpression )
            	    // InternalMyDsl.g:4867:3: lv_expression2_7_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getExpression2ExpressionParserRuleCall_6_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_expression2_7_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitch_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expression2",
            	              		lv_expression2_7_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    this_COLON_8=(Token)match(input,RULE_COLON,FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COLON_8, grammarAccess.getSwitch_statementAccess().getCOLONTerminalRuleCall_6_0_2()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:4888:6: (otherlv_9= 'default' this_COLON_10= RULE_COLON )
            	    {
            	    // InternalMyDsl.g:4888:6: (otherlv_9= 'default' this_COLON_10= RULE_COLON )
            	    // InternalMyDsl.g:4888:8: otherlv_9= 'default' this_COLON_10= RULE_COLON
            	    {
            	    otherlv_9=(Token)match(input,99,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getSwitch_statementAccess().getDefaultKeyword_6_1_0());
            	          
            	    }
            	    this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COLON_10, grammarAccess.getSwitch_statementAccess().getCOLONTerminalRuleCall_6_1_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:4897:6: ( (lv_switchStatements_11_0= ruleStatement ) )
            	    {
            	    // InternalMyDsl.g:4897:6: ( (lv_switchStatements_11_0= ruleStatement ) )
            	    // InternalMyDsl.g:4898:1: (lv_switchStatements_11_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:4898:1: (lv_switchStatements_11_0= ruleStatement )
            	    // InternalMyDsl.g:4899:3: lv_switchStatements_11_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getSwitchStatementsStatementParserRuleCall_6_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_switchStatements_11_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitch_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"switchStatements",
            	              		lv_switchStatements_11_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            this_L_CURLY_BRACE_12=(Token)match(input,RULE_L_CURLY_BRACE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_L_CURLY_BRACE_12, grammarAccess.getSwitch_statementAccess().getL_CURLY_BRACETerminalRuleCall_7()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSwitch_statement"


    // $ANTLR start "entryRuleWhile_Statement"
    // InternalMyDsl.g:4927:1: entryRuleWhile_Statement returns [EObject current=null] : iv_ruleWhile_Statement= ruleWhile_Statement EOF ;
    public final EObject entryRuleWhile_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile_Statement = null;


        try {
            // InternalMyDsl.g:4928:2: (iv_ruleWhile_Statement= ruleWhile_Statement EOF )
            // InternalMyDsl.g:4929:2: iv_ruleWhile_Statement= ruleWhile_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhile_StatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile_Statement=ruleWhile_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile_Statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhile_Statement"


    // $ANTLR start "ruleWhile_Statement"
    // InternalMyDsl.g:4936:1: ruleWhile_Statement returns [EObject current=null] : (otherlv_0= 'while(' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_rparent_2_0= RULE_RPAREN ) ) ( (lv_whileStatement_3_0= ruleStatement ) ) ) ;
    public final EObject ruleWhile_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_rparent_2_0=null;
        EObject lv_expression_1_0 = null;

        EObject lv_whileStatement_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:4939:28: ( (otherlv_0= 'while(' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_rparent_2_0= RULE_RPAREN ) ) ( (lv_whileStatement_3_0= ruleStatement ) ) ) )
            // InternalMyDsl.g:4940:1: (otherlv_0= 'while(' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_rparent_2_0= RULE_RPAREN ) ) ( (lv_whileStatement_3_0= ruleStatement ) ) )
            {
            // InternalMyDsl.g:4940:1: (otherlv_0= 'while(' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_rparent_2_0= RULE_RPAREN ) ) ( (lv_whileStatement_3_0= ruleStatement ) ) )
            // InternalMyDsl.g:4940:3: otherlv_0= 'while(' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_rparent_2_0= RULE_RPAREN ) ) ( (lv_whileStatement_3_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,100,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhile_StatementAccess().getWhileKeyword_0());
                  
            }
            // InternalMyDsl.g:4944:1: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMyDsl.g:4945:1: (lv_expression_1_0= ruleExpression )
            {
            // InternalMyDsl.g:4945:1: (lv_expression_1_0= ruleExpression )
            // InternalMyDsl.g:4946:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_StatementAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_19);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhile_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"org.xtext.example.mydsl.MyDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMyDsl.g:4962:2: ( (lv_rparent_2_0= RULE_RPAREN ) )
            // InternalMyDsl.g:4963:1: (lv_rparent_2_0= RULE_RPAREN )
            {
            // InternalMyDsl.g:4963:1: (lv_rparent_2_0= RULE_RPAREN )
            // InternalMyDsl.g:4964:3: lv_rparent_2_0= RULE_RPAREN
            {
            lv_rparent_2_0=(Token)match(input,RULE_RPAREN,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_2_0, grammarAccess.getWhile_StatementAccess().getRparentRPARENTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getWhile_StatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_2_0, 
                      		"org.xtext.example.mydsl.MyDsl.RPAREN");
              	    
            }

            }


            }

            // InternalMyDsl.g:4980:2: ( (lv_whileStatement_3_0= ruleStatement ) )
            // InternalMyDsl.g:4981:1: (lv_whileStatement_3_0= ruleStatement )
            {
            // InternalMyDsl.g:4981:1: (lv_whileStatement_3_0= ruleStatement )
            // InternalMyDsl.g:4982:3: lv_whileStatement_3_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_StatementAccess().getWhileStatementStatementParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_whileStatement_3_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhile_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"whileStatement",
                      		lv_whileStatement_3_0, 
                      		"org.xtext.example.mydsl.MyDsl.Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleWhile_Statement"


    // $ANTLR start "entryRuleDo_Statement"
    // InternalMyDsl.g:5006:1: entryRuleDo_Statement returns [EObject current=null] : iv_ruleDo_Statement= ruleDo_Statement EOF ;
    public final EObject entryRuleDo_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDo_Statement = null;


        try {
            // InternalMyDsl.g:5007:2: (iv_ruleDo_Statement= ruleDo_Statement EOF )
            // InternalMyDsl.g:5008:2: iv_ruleDo_Statement= ruleDo_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDo_StatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDo_Statement=ruleDo_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDo_Statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDo_Statement"


    // $ANTLR start "ruleDo_Statement"
    // InternalMyDsl.g:5015:1: ruleDo_Statement returns [EObject current=null] : (otherlv_0= 'do' ( (lv_doStatement_1_0= ruleStatement ) ) otherlv_2= 'while' ( (lv_lparent_3_0= RULE_LPAREN ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) otherlv_5= ';' ) ;
    public final EObject ruleDo_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_lparent_3_0=null;
        Token lv_rparent_4_0=null;
        Token otherlv_5=null;
        EObject lv_doStatement_1_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:5018:28: ( (otherlv_0= 'do' ( (lv_doStatement_1_0= ruleStatement ) ) otherlv_2= 'while' ( (lv_lparent_3_0= RULE_LPAREN ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) otherlv_5= ';' ) )
            // InternalMyDsl.g:5019:1: (otherlv_0= 'do' ( (lv_doStatement_1_0= ruleStatement ) ) otherlv_2= 'while' ( (lv_lparent_3_0= RULE_LPAREN ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) otherlv_5= ';' )
            {
            // InternalMyDsl.g:5019:1: (otherlv_0= 'do' ( (lv_doStatement_1_0= ruleStatement ) ) otherlv_2= 'while' ( (lv_lparent_3_0= RULE_LPAREN ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) otherlv_5= ';' )
            // InternalMyDsl.g:5019:3: otherlv_0= 'do' ( (lv_doStatement_1_0= ruleStatement ) ) otherlv_2= 'while' ( (lv_lparent_3_0= RULE_LPAREN ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,101,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDo_StatementAccess().getDoKeyword_0());
                  
            }
            // InternalMyDsl.g:5023:1: ( (lv_doStatement_1_0= ruleStatement ) )
            // InternalMyDsl.g:5024:1: (lv_doStatement_1_0= ruleStatement )
            {
            // InternalMyDsl.g:5024:1: (lv_doStatement_1_0= ruleStatement )
            // InternalMyDsl.g:5025:3: lv_doStatement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDo_StatementAccess().getDoStatementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_49);
            lv_doStatement_1_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDo_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"doStatement",
                      		lv_doStatement_1_0, 
                      		"org.xtext.example.mydsl.MyDsl.Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,102,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDo_StatementAccess().getWhileKeyword_2());
                  
            }
            // InternalMyDsl.g:5045:1: ( (lv_lparent_3_0= RULE_LPAREN ) )
            // InternalMyDsl.g:5046:1: (lv_lparent_3_0= RULE_LPAREN )
            {
            // InternalMyDsl.g:5046:1: (lv_lparent_3_0= RULE_LPAREN )
            // InternalMyDsl.g:5047:3: lv_lparent_3_0= RULE_LPAREN
            {
            lv_lparent_3_0=(Token)match(input,RULE_LPAREN,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_lparent_3_0, grammarAccess.getDo_StatementAccess().getLparentLPARENTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDo_StatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"lparent",
                      		lv_lparent_3_0, 
                      		"org.xtext.example.mydsl.MyDsl.LPAREN");
              	    
            }

            }


            }

            // InternalMyDsl.g:5063:2: ( (lv_rparent_4_0= RULE_RPAREN ) )
            // InternalMyDsl.g:5064:1: (lv_rparent_4_0= RULE_RPAREN )
            {
            // InternalMyDsl.g:5064:1: (lv_rparent_4_0= RULE_RPAREN )
            // InternalMyDsl.g:5065:3: lv_rparent_4_0= RULE_RPAREN
            {
            lv_rparent_4_0=(Token)match(input,RULE_RPAREN,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_4_0, grammarAccess.getDo_StatementAccess().getRparentRPARENTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDo_StatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_4_0, 
                      		"org.xtext.example.mydsl.MyDsl.RPAREN");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDo_StatementAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDo_Statement"


    // $ANTLR start "entryRuleIf_statement"
    // InternalMyDsl.g:5093:1: entryRuleIf_statement returns [EObject current=null] : iv_ruleIf_statement= ruleIf_statement EOF ;
    public final EObject entryRuleIf_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf_statement = null;


        try {
            // InternalMyDsl.g:5094:2: (iv_ruleIf_statement= ruleIf_statement EOF )
            // InternalMyDsl.g:5095:2: iv_ruleIf_statement= ruleIf_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIf_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf_statement=ruleIf_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIf_statement"


    // $ANTLR start "ruleIf_statement"
    // InternalMyDsl.g:5102:1: ruleIf_statement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_lparen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_idStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) ;
    public final EObject ruleIf_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lparen_1_0=null;
        Token lv_rparent_3_0=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_idStatement_4_0 = null;

        EObject lv_elseStatement_6_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:5105:28: ( (otherlv_0= 'if' ( (lv_lparen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_idStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) )
            // InternalMyDsl.g:5106:1: (otherlv_0= 'if' ( (lv_lparen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_idStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            {
            // InternalMyDsl.g:5106:1: (otherlv_0= 'if' ( (lv_lparen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_idStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            // InternalMyDsl.g:5106:3: otherlv_0= 'if' ( (lv_lparen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_idStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,103,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
                  
            }
            // InternalMyDsl.g:5110:1: ( (lv_lparen_1_0= RULE_LPAREN ) )
            // InternalMyDsl.g:5111:1: (lv_lparen_1_0= RULE_LPAREN )
            {
            // InternalMyDsl.g:5111:1: (lv_lparen_1_0= RULE_LPAREN )
            // InternalMyDsl.g:5112:3: lv_lparen_1_0= RULE_LPAREN
            {
            lv_lparen_1_0=(Token)match(input,RULE_LPAREN,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_lparen_1_0, grammarAccess.getIf_statementAccess().getLparenLPARENTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIf_statementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"lparen",
                      		lv_lparen_1_0, 
                      		"org.xtext.example.mydsl.MyDsl.LPAREN");
              	    
            }

            }


            }

            // InternalMyDsl.g:5128:2: ( (lv_expression_2_0= ruleExpression ) )
            // InternalMyDsl.g:5129:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalMyDsl.g:5129:1: (lv_expression_2_0= ruleExpression )
            // InternalMyDsl.g:5130:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_19);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"org.xtext.example.mydsl.MyDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMyDsl.g:5146:2: ( (lv_rparent_3_0= RULE_RPAREN ) )
            // InternalMyDsl.g:5147:1: (lv_rparent_3_0= RULE_RPAREN )
            {
            // InternalMyDsl.g:5147:1: (lv_rparent_3_0= RULE_RPAREN )
            // InternalMyDsl.g:5148:3: lv_rparent_3_0= RULE_RPAREN
            {
            lv_rparent_3_0=(Token)match(input,RULE_RPAREN,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_3_0, grammarAccess.getIf_statementAccess().getRparentRPARENTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIf_statementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_3_0, 
                      		"org.xtext.example.mydsl.MyDsl.RPAREN");
              	    
            }

            }


            }

            // InternalMyDsl.g:5164:2: ( (lv_idStatement_4_0= ruleStatement ) )
            // InternalMyDsl.g:5165:1: (lv_idStatement_4_0= ruleStatement )
            {
            // InternalMyDsl.g:5165:1: (lv_idStatement_4_0= ruleStatement )
            // InternalMyDsl.g:5166:3: lv_idStatement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_statementAccess().getIdStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_50);
            lv_idStatement_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
              	        }
                     		set(
                     			current, 
                     			"idStatement",
                      		lv_idStatement_4_0, 
                      		"org.xtext.example.mydsl.MyDsl.Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMyDsl.g:5182:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==104) ) {
                int LA74_1 = input.LA(2);

                if ( (synpred154_InternalMyDsl()) ) {
                    alt74=1;
                }
            }
            switch (alt74) {
                case 1 :
                    // InternalMyDsl.g:5182:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) )
                    {
                    // InternalMyDsl.g:5182:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalMyDsl.g:5182:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,104,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIf_statementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // InternalMyDsl.g:5187:2: ( (lv_elseStatement_6_0= ruleStatement ) )
                    // InternalMyDsl.g:5188:1: (lv_elseStatement_6_0= ruleStatement )
                    {
                    // InternalMyDsl.g:5188:1: (lv_elseStatement_6_0= ruleStatement )
                    // InternalMyDsl.g:5189:3: lv_elseStatement_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseStatement_6_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_6_0, 
                              		"org.xtext.example.mydsl.MyDsl.Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIf_statement"


    // $ANTLR start "entryRuleTry_statement"
    // InternalMyDsl.g:5213:1: entryRuleTry_statement returns [EObject current=null] : iv_ruleTry_statement= ruleTry_statement EOF ;
    public final EObject entryRuleTry_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTry_statement = null;


        try {
            // InternalMyDsl.g:5214:2: (iv_ruleTry_statement= ruleTry_statement EOF )
            // InternalMyDsl.g:5215:2: iv_ruleTry_statement= ruleTry_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTry_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTry_statement=ruleTry_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTry_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTry_statement"


    // $ANTLR start "ruleTry_statement"
    // InternalMyDsl.g:5222:1: ruleTry_statement returns [EObject current=null] : (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? ) ;
    public final EObject ruleTry_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_lParen_3_0=null;
        Token lv_rparent_5_0=null;
        Token otherlv_7=null;
        EObject lv_tryStatement_1_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_catchStatement_6_0 = null;

        EObject lv_finallyStatement_8_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:5225:28: ( (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? ) )
            // InternalMyDsl.g:5226:1: (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? )
            {
            // InternalMyDsl.g:5226:1: (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? )
            // InternalMyDsl.g:5226:3: otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,105,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTry_statementAccess().getTryKeyword_0());
                  
            }
            // InternalMyDsl.g:5230:1: ( (lv_tryStatement_1_0= ruleStatement ) )
            // InternalMyDsl.g:5231:1: (lv_tryStatement_1_0= ruleStatement )
            {
            // InternalMyDsl.g:5231:1: (lv_tryStatement_1_0= ruleStatement )
            // InternalMyDsl.g:5232:3: lv_tryStatement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTry_statementAccess().getTryStatementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_51);
            lv_tryStatement_1_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
              	        }
                     		set(
                     			current, 
                     			"tryStatement",
                      		lv_tryStatement_1_0, 
                      		"org.xtext.example.mydsl.MyDsl.Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalMyDsl.g:5248:2: ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==106) ) {
                    int LA75_2 = input.LA(2);

                    if ( (synpred156_InternalMyDsl()) ) {
                        alt75=1;
                    }


                }


                switch (alt75) {
            	case 1 :
            	    // InternalMyDsl.g:5248:3: ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) )
            	    {
            	    // InternalMyDsl.g:5248:3: ( ( 'catch' )=>otherlv_2= 'catch' )
            	    // InternalMyDsl.g:5248:4: ( 'catch' )=>otherlv_2= 'catch'
            	    {
            	    otherlv_2=(Token)match(input,106,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTry_statementAccess().getCatchKeyword_2_0());
            	          
            	    }

            	    }

            	    // InternalMyDsl.g:5253:2: ( (lv_lParen_3_0= RULE_LPAREN ) )
            	    // InternalMyDsl.g:5254:1: (lv_lParen_3_0= RULE_LPAREN )
            	    {
            	    // InternalMyDsl.g:5254:1: (lv_lParen_3_0= RULE_LPAREN )
            	    // InternalMyDsl.g:5255:3: lv_lParen_3_0= RULE_LPAREN
            	    {
            	    lv_lParen_3_0=(Token)match(input,RULE_LPAREN,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_lParen_3_0, grammarAccess.getTry_statementAccess().getLParenLPARENTerminalRuleCall_2_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTry_statementRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"lParen",
            	              		lv_lParen_3_0, 
            	              		"org.xtext.example.mydsl.MyDsl.LPAREN");
            	      	    
            	    }

            	    }


            	    }

            	    // InternalMyDsl.g:5271:2: ( (lv_parameters_4_0= ruleParameter ) )
            	    // InternalMyDsl.g:5272:1: (lv_parameters_4_0= ruleParameter )
            	    {
            	    // InternalMyDsl.g:5272:1: (lv_parameters_4_0= ruleParameter )
            	    // InternalMyDsl.g:5273:3: lv_parameters_4_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_parameters_4_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_4_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Parameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalMyDsl.g:5289:2: ( (lv_rparent_5_0= RULE_RPAREN ) )
            	    // InternalMyDsl.g:5290:1: (lv_rparent_5_0= RULE_RPAREN )
            	    {
            	    // InternalMyDsl.g:5290:1: (lv_rparent_5_0= RULE_RPAREN )
            	    // InternalMyDsl.g:5291:3: lv_rparent_5_0= RULE_RPAREN
            	    {
            	    lv_rparent_5_0=(Token)match(input,RULE_RPAREN,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_rparent_5_0, grammarAccess.getTry_statementAccess().getRparentRPARENTerminalRuleCall_2_3_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTry_statementRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"rparent",
            	              		lv_rparent_5_0, 
            	              		"org.xtext.example.mydsl.MyDsl.RPAREN");
            	      	    
            	    }

            	    }


            	    }

            	    // InternalMyDsl.g:5307:2: ( (lv_catchStatement_6_0= ruleStatement ) )
            	    // InternalMyDsl.g:5308:1: (lv_catchStatement_6_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:5308:1: (lv_catchStatement_6_0= ruleStatement )
            	    // InternalMyDsl.g:5309:3: lv_catchStatement_6_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getCatchStatementStatementParserRuleCall_2_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_catchStatement_6_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"catchStatement",
            	              		lv_catchStatement_6_0, 
            	              		"org.xtext.example.mydsl.MyDsl.Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            // InternalMyDsl.g:5325:4: ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==107) ) {
                int LA76_1 = input.LA(2);

                if ( (synpred158_InternalMyDsl()) ) {
                    alt76=1;
                }
            }
            switch (alt76) {
                case 1 :
                    // InternalMyDsl.g:5325:5: ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) )
                    {
                    // InternalMyDsl.g:5325:5: ( ( 'finally' )=>otherlv_7= 'finally' )
                    // InternalMyDsl.g:5325:6: ( 'finally' )=>otherlv_7= 'finally'
                    {
                    otherlv_7=(Token)match(input,107,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTry_statementAccess().getFinallyKeyword_3_0());
                          
                    }

                    }

                    // InternalMyDsl.g:5330:2: ( (lv_finallyStatement_8_0= ruleStatement ) )
                    // InternalMyDsl.g:5331:1: (lv_finallyStatement_8_0= ruleStatement )
                    {
                    // InternalMyDsl.g:5331:1: (lv_finallyStatement_8_0= ruleStatement )
                    // InternalMyDsl.g:5332:3: lv_finallyStatement_8_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTry_statementAccess().getFinallyStatementStatementParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_finallyStatement_8_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyStatement",
                              		lv_finallyStatement_8_0, 
                              		"org.xtext.example.mydsl.MyDsl.Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTry_statement"


    // $ANTLR start "entryRuleImport_statement"
    // InternalMyDsl.g:5356:1: entryRuleImport_statement returns [EObject current=null] : iv_ruleImport_statement= ruleImport_statement EOF ;
    public final EObject entryRuleImport_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport_statement = null;


        try {
            // InternalMyDsl.g:5357:2: (iv_ruleImport_statement= ruleImport_statement EOF )
            // InternalMyDsl.g:5358:2: iv_ruleImport_statement= ruleImport_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImport_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport_statement=ruleImport_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport_statement"


    // $ANTLR start "ruleImport_statement"
    // InternalMyDsl.g:5365:1: ruleImport_statement returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) ) ;
    public final EObject ruleImport_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        AntlrDatatypeRuleToken lv_pacName_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:5368:28: ( (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) ) )
            // InternalMyDsl.g:5369:1: (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) )
            {
            // InternalMyDsl.g:5369:1: (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) )
            // InternalMyDsl.g:5369:3: otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImport_statementAccess().getImportKeyword_0());
                  
            }
            // InternalMyDsl.g:5373:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) )
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // InternalMyDsl.g:5373:2: ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    {
                    // InternalMyDsl.g:5373:2: ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    // InternalMyDsl.g:5373:3: ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';'
                    {
                    // InternalMyDsl.g:5373:3: ( (lv_className_1_0= ruleClass_name ) )
                    // InternalMyDsl.g:5374:1: (lv_className_1_0= ruleClass_name )
                    {
                    // InternalMyDsl.g:5374:1: (lv_className_1_0= ruleClass_name )
                    // InternalMyDsl.g:5375:3: lv_className_1_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImport_statementAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_6);
                    lv_className_1_0=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImport_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"className",
                              		lv_className_1_0, 
                              		"org.xtext.example.mydsl.MyDsl.Class_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5396:6: ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' )
                    {
                    // InternalMyDsl.g:5396:6: ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' )
                    // InternalMyDsl.g:5396:7: ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;'
                    {
                    // InternalMyDsl.g:5396:7: ( (lv_pacName_3_0= rulePackage_name ) )
                    // InternalMyDsl.g:5397:1: (lv_pacName_3_0= rulePackage_name )
                    {
                    // InternalMyDsl.g:5397:1: (lv_pacName_3_0= rulePackage_name )
                    // InternalMyDsl.g:5398:3: lv_pacName_3_0= rulePackage_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImport_statementAccess().getPacNamePackage_nameParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_52);
                    lv_pacName_3_0=rulePackage_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImport_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"pacName",
                              		lv_pacName_3_0, 
                              		"org.xtext.example.mydsl.MyDsl.Package_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonKeyword_1_1_1());
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport_statement"


    // $ANTLR start "entryRuleClass_name"
    // InternalMyDsl.g:5426:1: entryRuleClass_name returns [String current=null] : iv_ruleClass_name= ruleClass_name EOF ;
    public final String entryRuleClass_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClass_name = null;


        try {
            // InternalMyDsl.g:5427:2: (iv_ruleClass_name= ruleClass_name EOF )
            // InternalMyDsl.g:5428:2: iv_ruleClass_name= ruleClass_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_nameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClass_name=ruleClass_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_name.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClass_name"


    // $ANTLR start "ruleClass_name"
    // InternalMyDsl.g:5435:1: ruleClass_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleClass_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:5438:28: (this_Package_name_0= rulePackage_name )
            // InternalMyDsl.g:5440:5: this_Package_name_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_Package_name_0=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Package_name_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClass_name"


    // $ANTLR start "entryRuleInterface_name"
    // InternalMyDsl.g:5458:1: entryRuleInterface_name returns [String current=null] : iv_ruleInterface_name= ruleInterface_name EOF ;
    public final String entryRuleInterface_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterface_name = null;


        try {
            // InternalMyDsl.g:5459:2: (iv_ruleInterface_name= ruleInterface_name EOF )
            // InternalMyDsl.g:5460:2: iv_ruleInterface_name= ruleInterface_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_nameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterface_name=ruleInterface_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface_name.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterface_name"


    // $ANTLR start "ruleInterface_name"
    // InternalMyDsl.g:5467:1: ruleInterface_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleInterface_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:5470:28: (this_Package_name_0= rulePackage_name )
            // InternalMyDsl.g:5472:5: this_Package_name_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_Package_name_0=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Package_name_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInterface_name"


    // $ANTLR start "entryRulePackage_statement"
    // InternalMyDsl.g:5490:1: entryRulePackage_statement returns [EObject current=null] : iv_rulePackage_statement= rulePackage_statement EOF ;
    public final EObject entryRulePackage_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_statement = null;


        try {
            // InternalMyDsl.g:5491:2: (iv_rulePackage_statement= rulePackage_statement EOF )
            // InternalMyDsl.g:5492:2: iv_rulePackage_statement= rulePackage_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackage_statement=rulePackage_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_statement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackage_statement"


    // $ANTLR start "rulePackage_statement"
    // InternalMyDsl.g:5499:1: rulePackage_statement returns [EObject current=null] : (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' ) ;
    public final EObject rulePackage_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_pacName_1_0 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:5502:28: ( (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:5503:1: (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:5503:1: (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' )
            // InternalMyDsl.g:5503:3: otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,110,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackage_statementAccess().getPackageKeyword_0());
                  
            }
            // InternalMyDsl.g:5507:1: ( (lv_pacName_1_0= rulePackage_name ) )
            // InternalMyDsl.g:5508:1: (lv_pacName_1_0= rulePackage_name )
            {
            // InternalMyDsl.g:5508:1: (lv_pacName_1_0= rulePackage_name )
            // InternalMyDsl.g:5509:3: lv_pacName_1_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackage_statementAccess().getPacNamePackage_nameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_6);
            lv_pacName_1_0=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackage_statementRule());
              	        }
                     		set(
                     			current, 
                     			"pacName",
                      		lv_pacName_1_0, 
                      		"org.xtext.example.mydsl.MyDsl.Package_name");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePackage_statement"


    // $ANTLR start "entryRulePackage_name"
    // InternalMyDsl.g:5537:1: entryRulePackage_name returns [String current=null] : iv_rulePackage_name= rulePackage_name EOF ;
    public final String entryRulePackage_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name = null;


        try {
            // InternalMyDsl.g:5538:2: (iv_rulePackage_name= rulePackage_name EOF )
            // InternalMyDsl.g:5539:2: iv_rulePackage_name= rulePackage_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_nameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackage_name=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_name.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackage_name"


    // $ANTLR start "rulePackage_name"
    // InternalMyDsl.g:5546:1: rulePackage_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line ) ;
    public final AntlrDatatypeRuleToken rulePackage_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Package_name_line_1 = null;


         enterRule(); 
            
        try {
            // InternalMyDsl.g:5549:28: ( (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line ) )
            // InternalMyDsl.g:5550:1: (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line )
            {
            // InternalMyDsl.g:5550:1: (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line )
            // InternalMyDsl.g:5550:6: this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPackage_nameAccess().getPackage_name_lineParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_Package_name_line_1=rulePackage_name_line();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Package_name_line_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePackage_name"


    // $ANTLR start "entryRulePackage_name_line"
    // InternalMyDsl.g:5576:1: entryRulePackage_name_line returns [String current=null] : iv_rulePackage_name_line= rulePackage_name_line EOF ;
    public final String entryRulePackage_name_line() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name_line = null;


        try {
            // InternalMyDsl.g:5577:2: (iv_rulePackage_name_line= rulePackage_name_line EOF )
            // InternalMyDsl.g:5578:2: iv_rulePackage_name_line= rulePackage_name_line EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_name_lineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackage_name_line=rulePackage_name_line();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_name_line.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackage_name_line"


    // $ANTLR start "rulePackage_name_line"
    // InternalMyDsl.g:5585:1: rulePackage_name_line returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken rulePackage_name_line() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalMyDsl.g:5588:28: ( (kw= '.' this_ID_1= RULE_ID )* )
            // InternalMyDsl.g:5589:1: (kw= '.' this_ID_1= RULE_ID )*
            {
            // InternalMyDsl.g:5589:1: (kw= '.' this_ID_1= RULE_ID )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==94) ) {
                    int LA78_2 = input.LA(2);

                    if ( (LA78_2==RULE_ID) ) {
                        int LA78_3 = input.LA(3);

                        if ( (synpred160_InternalMyDsl()) ) {
                            alt78=1;
                        }


                    }


                }


                switch (alt78) {
            	case 1 :
            	    // InternalMyDsl.g:5590:2: kw= '.' this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,94,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPackage_name_lineAccess().getFullStopKeyword_0()); 
            	          
            	    }
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_1, grammarAccess.getPackage_name_lineAccess().getIDTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePackage_name_line"


    // $ANTLR start "entryRuleEXPOENT_PART"
    // InternalMyDsl.g:5610:1: entryRuleEXPOENT_PART returns [String current=null] : iv_ruleEXPOENT_PART= ruleEXPOENT_PART EOF ;
    public final String entryRuleEXPOENT_PART() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXPOENT_PART = null;


        try {
            // InternalMyDsl.g:5611:2: (iv_ruleEXPOENT_PART= ruleEXPOENT_PART EOF )
            // InternalMyDsl.g:5612:2: iv_ruleEXPOENT_PART= ruleEXPOENT_PART EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPOENT_PARTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEXPOENT_PART=ruleEXPOENT_PART();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPOENT_PART.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEXPOENT_PART"


    // $ANTLR start "ruleEXPOENT_PART"
    // InternalMyDsl.g:5619:1: ruleEXPOENT_PART returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EXPONENTIAL_0= RULE_EXPONENTIAL this_DECIMAL_DIGITS_1= RULE_DECIMAL_DIGITS ) ;
    public final AntlrDatatypeRuleToken ruleEXPOENT_PART() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EXPONENTIAL_0=null;
        Token this_DECIMAL_DIGITS_1=null;

         enterRule(); 
            
        try {
            // InternalMyDsl.g:5622:28: ( (this_EXPONENTIAL_0= RULE_EXPONENTIAL this_DECIMAL_DIGITS_1= RULE_DECIMAL_DIGITS ) )
            // InternalMyDsl.g:5623:1: (this_EXPONENTIAL_0= RULE_EXPONENTIAL this_DECIMAL_DIGITS_1= RULE_DECIMAL_DIGITS )
            {
            // InternalMyDsl.g:5623:1: (this_EXPONENTIAL_0= RULE_EXPONENTIAL this_DECIMAL_DIGITS_1= RULE_DECIMAL_DIGITS )
            // InternalMyDsl.g:5623:6: this_EXPONENTIAL_0= RULE_EXPONENTIAL this_DECIMAL_DIGITS_1= RULE_DECIMAL_DIGITS
            {
            this_EXPONENTIAL_0=(Token)match(input,RULE_EXPONENTIAL,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EXPONENTIAL_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EXPONENTIAL_0, grammarAccess.getEXPOENT_PARTAccess().getEXPONENTIALTerminalRuleCall_0()); 
                  
            }
            this_DECIMAL_DIGITS_1=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DECIMAL_DIGITS_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DECIMAL_DIGITS_1, grammarAccess.getEXPOENT_PARTAccess().getDECIMAL_DIGITSTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEXPOENT_PART"

    // $ANTLR start synpred50_InternalMyDsl
    public final void synpred50_InternalMyDsl_fragment() throws RecognitionException {   
        EObject lv_variableDeclaration_0_0 = null;


        // InternalMyDsl.g:1854:2: ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) )
        // InternalMyDsl.g:1854:2: ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) )
        {
        // InternalMyDsl.g:1854:2: ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) )
        // InternalMyDsl.g:1855:1: (lv_variableDeclaration_0_0= ruleVariable_declaration )
        {
        // InternalMyDsl.g:1855:1: (lv_variableDeclaration_0_0= ruleVariable_declaration )
        // InternalMyDsl.g:1856:3: lv_variableDeclaration_0_0= ruleVariable_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationVariable_declarationParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_variableDeclaration_0_0=ruleVariable_declaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred50_InternalMyDsl

    // $ANTLR start synpred51_InternalMyDsl
    public final void synpred51_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_g_2_0=null;
        EObject lv_expressionStatement_1_0 = null;


        // InternalMyDsl.g:1873:6: ( ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) )
        // InternalMyDsl.g:1873:6: ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) )
        {
        // InternalMyDsl.g:1873:6: ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) )
        // InternalMyDsl.g:1873:7: ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) )
        {
        // InternalMyDsl.g:1873:7: ( (lv_expressionStatement_1_0= ruleExpression ) )
        // InternalMyDsl.g:1874:1: (lv_expressionStatement_1_0= ruleExpression )
        {
        // InternalMyDsl.g:1874:1: (lv_expressionStatement_1_0= ruleExpression )
        // InternalMyDsl.g:1875:3: lv_expressionStatement_1_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionStatementExpressionParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_6);
        lv_expressionStatement_1_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMyDsl.g:1891:2: ( (lv_g_2_0= ';' ) )
        // InternalMyDsl.g:1892:1: (lv_g_2_0= ';' )
        {
        // InternalMyDsl.g:1892:1: (lv_g_2_0= ';' )
        // InternalMyDsl.g:1893:3: lv_g_2_0= ';'
        {
        lv_g_2_0=(Token)match(input,71,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred51_InternalMyDsl

    // $ANTLR start synpred69_InternalMyDsl
    public final void synpred69_InternalMyDsl_fragment() throws RecognitionException {   
        EObject lv_variable_2_0 = null;


        // InternalMyDsl.g:2337:2: ( ( (lv_variable_2_0= ruleVariable_declaration ) ) )
        // InternalMyDsl.g:2337:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
        {
        // InternalMyDsl.g:2337:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
        // InternalMyDsl.g:2338:1: (lv_variable_2_0= ruleVariable_declaration )
        {
        // InternalMyDsl.g:2338:1: (lv_variable_2_0= ruleVariable_declaration )
        // InternalMyDsl.g:2339:3: lv_variable_2_0= ruleVariable_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getFor_StatementAccess().getVariableVariable_declarationParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_variable_2_0=ruleVariable_declaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred69_InternalMyDsl

    // $ANTLR start synpred75_InternalMyDsl
    public final void synpred75_InternalMyDsl_fragment() throws RecognitionException {   
        EObject lv_logicalExpression_2_0 = null;

        EObject lv_aux_3_0 = null;


        // InternalMyDsl.g:2507:6: ( ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) )
        // InternalMyDsl.g:2507:6: ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
        {
        // InternalMyDsl.g:2507:6: ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
        // InternalMyDsl.g:2507:7: ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) )
        {
        // InternalMyDsl.g:2507:7: ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) )
        // InternalMyDsl.g:2508:1: (lv_logicalExpression_2_0= ruleLogical_Expression_NR )
        {
        // InternalMyDsl.g:2508:1: (lv_logicalExpression_2_0= ruleLogical_Expression_NR )
        // InternalMyDsl.g:2509:3: lv_logicalExpression_2_0= ruleLogical_Expression_NR
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpressionAccess().getLogicalExpressionLogical_Expression_NRParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_40);
        lv_logicalExpression_2_0=ruleLogical_Expression_NR();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMyDsl.g:2525:2: ( (lv_aux_3_0= ruleExpression_aux ) )
        // InternalMyDsl.g:2526:1: (lv_aux_3_0= ruleExpression_aux )
        {
        // InternalMyDsl.g:2526:1: (lv_aux_3_0= ruleExpression_aux )
        // InternalMyDsl.g:2527:3: lv_aux_3_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_aux_3_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred75_InternalMyDsl

    // $ANTLR start synpred78_InternalMyDsl
    public final void synpred78_InternalMyDsl_fragment() throws RecognitionException {   
        EObject lv_castExpression_6_0 = null;

        EObject lv_aux_7_0 = null;


        // InternalMyDsl.g:2581:6: ( ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) )
        // InternalMyDsl.g:2581:6: ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
        {
        // InternalMyDsl.g:2581:6: ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
        // InternalMyDsl.g:2581:7: ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) )
        {
        // InternalMyDsl.g:2581:7: ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) )
        // InternalMyDsl.g:2581:8: ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) )
        {
        // InternalMyDsl.g:2585:5: ( (lv_castExpression_6_0= ruleCast_Expression ) )
        // InternalMyDsl.g:2586:1: (lv_castExpression_6_0= ruleCast_Expression )
        {
        // InternalMyDsl.g:2586:1: (lv_castExpression_6_0= ruleCast_Expression )
        // InternalMyDsl.g:2587:3: lv_castExpression_6_0= ruleCast_Expression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpressionAccess().getCastExpressionCast_ExpressionParserRuleCall_3_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_40);
        lv_castExpression_6_0=ruleCast_Expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalMyDsl.g:2603:3: ( (lv_aux_7_0= ruleExpression_aux ) )
        // InternalMyDsl.g:2604:1: (lv_aux_7_0= ruleExpression_aux )
        {
        // InternalMyDsl.g:2604:1: (lv_aux_7_0= ruleExpression_aux )
        // InternalMyDsl.g:2605:3: lv_aux_7_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_aux_7_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred78_InternalMyDsl

    // $ANTLR start synpred86_InternalMyDsl
    public final void synpred86_InternalMyDsl_fragment() throws RecognitionException {   
        Token this_LPAREN_0=null;
        Token this_RPAREN_2=null;
        EObject lv_argList_1_0 = null;

        EObject lv_aux_3_0 = null;


        // InternalMyDsl.g:2868:2: ( ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) )
        // InternalMyDsl.g:2868:2: ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
        {
        // InternalMyDsl.g:2868:2: ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
        // InternalMyDsl.g:2868:3: (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) )
        {
        // InternalMyDsl.g:2868:3: (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN )
        // InternalMyDsl.g:2868:4: this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN
        {
        this_LPAREN_0=(Token)match(input,RULE_LPAREN,FOLLOW_39); if (state.failed) return ;
        // InternalMyDsl.g:2872:1: ( (lv_argList_1_0= ruleArg_List ) )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==RULE_LPAREN||(LA90_0>=RULE_NULL && LA90_0<=RULE_THIS)||(LA90_0>=RULE_INCREMENT && LA90_0<=RULE_DECREMENT)||LA90_0==RULE_DECIMAL_DIGITS||LA90_0==RULE_HEXA||(LA90_0>=RULE_STRING && LA90_0<=RULE_FALSE)||LA90_0==96) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // InternalMyDsl.g:2873:1: (lv_argList_1_0= ruleArg_List )
                {
                // InternalMyDsl.g:2873:1: (lv_argList_1_0= ruleArg_List )
                // InternalMyDsl.g:2874:3: lv_argList_1_0= ruleArg_List
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getArgListArg_ListParserRuleCall_0_0_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_19);
                lv_argList_1_0=ruleArg_List();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        this_RPAREN_2=(Token)match(input,RULE_RPAREN,FOLLOW_40); if (state.failed) return ;

        }

        // InternalMyDsl.g:2894:2: ( (lv_aux_3_0= ruleExpression_aux ) )
        // InternalMyDsl.g:2895:1: (lv_aux_3_0= ruleExpression_aux )
        {
        // InternalMyDsl.g:2895:1: (lv_aux_3_0= ruleExpression_aux )
        // InternalMyDsl.g:2896:3: lv_aux_3_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_aux_3_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred86_InternalMyDsl

    // $ANTLR start synpred87_InternalMyDsl
    public final void synpred87_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression2_5_0 = null;

        EObject lv_aux_7_0 = null;


        // InternalMyDsl.g:2913:6: ( ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) )
        // InternalMyDsl.g:2913:6: ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
        {
        // InternalMyDsl.g:2913:6: ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
        // InternalMyDsl.g:2913:7: (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) )
        {
        // InternalMyDsl.g:2913:7: (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' )
        // InternalMyDsl.g:2913:9: otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']'
        {
        otherlv_4=(Token)match(input,75,FOLLOW_28); if (state.failed) return ;
        // InternalMyDsl.g:2917:1: ( (lv_expression2_5_0= ruleExpression ) )
        // InternalMyDsl.g:2918:1: (lv_expression2_5_0= ruleExpression )
        {
        // InternalMyDsl.g:2918:1: (lv_expression2_5_0= ruleExpression )
        // InternalMyDsl.g:2919:3: lv_expression2_5_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_21);
        lv_expression2_5_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,76,FOLLOW_40); if (state.failed) return ;

        }

        // InternalMyDsl.g:2939:2: ( (lv_aux_7_0= ruleExpression_aux ) )
        // InternalMyDsl.g:2940:1: (lv_aux_7_0= ruleExpression_aux )
        {
        // InternalMyDsl.g:2940:1: (lv_aux_7_0= ruleExpression_aux )
        // InternalMyDsl.g:2941:3: lv_aux_7_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_aux_7_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred87_InternalMyDsl

    // $ANTLR start synpred88_InternalMyDsl
    public final void synpred88_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        EObject lv_expression2_9_0 = null;

        EObject lv_aux_10_0 = null;


        // InternalMyDsl.g:2958:6: ( ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) )
        // InternalMyDsl.g:2958:6: ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) )
        {
        // InternalMyDsl.g:2958:6: ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) )
        // InternalMyDsl.g:2958:7: (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) )
        {
        // InternalMyDsl.g:2958:7: (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) )
        // InternalMyDsl.g:2958:9: otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) )
        {
        otherlv_8=(Token)match(input,94,FOLLOW_28); if (state.failed) return ;
        // InternalMyDsl.g:2962:1: ( (lv_expression2_9_0= ruleExpression ) )
        // InternalMyDsl.g:2963:1: (lv_expression2_9_0= ruleExpression )
        {
        // InternalMyDsl.g:2963:1: (lv_expression2_9_0= ruleExpression )
        // InternalMyDsl.g:2964:3: lv_expression2_9_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_2_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_40);
        lv_expression2_9_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalMyDsl.g:2980:3: ( (lv_aux_10_0= ruleExpression_aux ) )
        // InternalMyDsl.g:2981:1: (lv_aux_10_0= ruleExpression_aux )
        {
        // InternalMyDsl.g:2981:1: (lv_aux_10_0= ruleExpression_aux )
        // InternalMyDsl.g:2982:3: lv_aux_10_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_aux_10_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred88_InternalMyDsl

    // $ANTLR start synpred89_InternalMyDsl
    public final void synpred89_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        EObject lv_expressionComma_12_0 = null;

        EObject lv_aux_13_0 = null;


        // InternalMyDsl.g:2999:6: ( ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) )
        // InternalMyDsl.g:2999:6: ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
        {
        // InternalMyDsl.g:2999:6: ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
        // InternalMyDsl.g:2999:7: (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) )
        {
        // InternalMyDsl.g:2999:7: (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) )
        // InternalMyDsl.g:2999:9: otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) )
        {
        otherlv_11=(Token)match(input,72,FOLLOW_28); if (state.failed) return ;
        // InternalMyDsl.g:3003:1: ( (lv_expressionComma_12_0= ruleExpression ) )
        // InternalMyDsl.g:3004:1: (lv_expressionComma_12_0= ruleExpression )
        {
        // InternalMyDsl.g:3004:1: (lv_expressionComma_12_0= ruleExpression )
        // InternalMyDsl.g:3005:3: lv_expressionComma_12_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionCommaExpressionParserRuleCall_3_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_40);
        lv_expressionComma_12_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalMyDsl.g:3021:3: ( (lv_aux_13_0= ruleExpression_aux ) )
        // InternalMyDsl.g:3022:1: (lv_aux_13_0= ruleExpression_aux )
        {
        // InternalMyDsl.g:3022:1: (lv_aux_13_0= ruleExpression_aux )
        // InternalMyDsl.g:3023:3: lv_aux_13_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_aux_13_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred89_InternalMyDsl

    // $ANTLR start synpred90_InternalMyDsl
    public final void synpred90_InternalMyDsl_fragment() throws RecognitionException {   
        Token this_INSTANCEOF_14=null;
        AntlrDatatypeRuleToken lv_name_15_0 = null;

        EObject lv_aux_16_0 = null;


        // InternalMyDsl.g:3040:6: ( ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) )
        // InternalMyDsl.g:3040:6: ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) )
        {
        // InternalMyDsl.g:3040:6: ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) )
        // InternalMyDsl.g:3040:7: (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) )
        {
        // InternalMyDsl.g:3040:7: (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) )
        // InternalMyDsl.g:3040:8: this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) )
        {
        this_INSTANCEOF_14=(Token)match(input,RULE_INSTANCEOF,FOLLOW_14); if (state.failed) return ;
        // InternalMyDsl.g:3044:1: ( (lv_name_15_0= ruleClass_name ) )
        // InternalMyDsl.g:3045:1: (lv_name_15_0= ruleClass_name )
        {
        // InternalMyDsl.g:3045:1: (lv_name_15_0= ruleClass_name )
        // InternalMyDsl.g:3046:3: lv_name_15_0= ruleClass_name
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getNameClass_nameParserRuleCall_4_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_40);
        lv_name_15_0=ruleClass_name();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalMyDsl.g:3062:3: ( (lv_aux_16_0= ruleExpression_aux ) )
        // InternalMyDsl.g:3063:1: (lv_aux_16_0= ruleExpression_aux )
        {
        // InternalMyDsl.g:3063:1: (lv_aux_16_0= ruleExpression_aux )
        // InternalMyDsl.g:3064:3: lv_aux_16_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_4_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_aux_16_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred90_InternalMyDsl

    // $ANTLR start synpred92_InternalMyDsl
    public final void synpred92_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_sgin_17_1=null;
        Token lv_sgin_17_2=null;
        EObject lv_aux_18_0 = null;


        // InternalMyDsl.g:3081:6: ( ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) )
        // InternalMyDsl.g:3081:6: ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) )
        {
        // InternalMyDsl.g:3081:6: ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) )
        // InternalMyDsl.g:3081:7: ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) )
        {
        // InternalMyDsl.g:3081:7: ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) )
        // InternalMyDsl.g:3082:1: ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) )
        {
        // InternalMyDsl.g:3082:1: ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) )
        // InternalMyDsl.g:3083:1: (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT )
        {
        // InternalMyDsl.g:3083:1: (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT )
        int alt91=2;
        int LA91_0 = input.LA(1);

        if ( (LA91_0==RULE_INCREMENT) ) {
            alt91=1;
        }
        else if ( (LA91_0==RULE_DECREMENT) ) {
            alt91=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 91, 0, input);

            throw nvae;
        }
        switch (alt91) {
            case 1 :
                // InternalMyDsl.g:3084:3: lv_sgin_17_1= RULE_INCREMENT
                {
                lv_sgin_17_1=(Token)match(input,RULE_INCREMENT,FOLLOW_40); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalMyDsl.g:3099:8: lv_sgin_17_2= RULE_DECREMENT
                {
                lv_sgin_17_2=(Token)match(input,RULE_DECREMENT,FOLLOW_40); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalMyDsl.g:3117:2: ( (lv_aux_18_0= ruleExpression_aux ) )
        // InternalMyDsl.g:3118:1: (lv_aux_18_0= ruleExpression_aux )
        {
        // InternalMyDsl.g:3118:1: (lv_aux_18_0= ruleExpression_aux )
        // InternalMyDsl.g:3119:3: lv_aux_18_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_aux_18_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred92_InternalMyDsl

    // $ANTLR start synpred102_InternalMyDsl
    public final void synpred102_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_numericSign_19_1=null;
        Token lv_numericSign_19_2=null;
        Token lv_numericSign_19_3=null;
        Token lv_numericSign_19_4=null;
        Token lv_numericSign_19_5=null;
        Token lv_numericSign_19_6=null;
        Token lv_numericSign_19_7=null;
        Token lv_numericSign_19_8=null;
        Token lv_numericSign_19_9=null;
        Token lv_numericSign_19_10=null;
        EObject lv_exp2_20_0 = null;

        EObject lv_aux_21_0 = null;


        // InternalMyDsl.g:3136:6: ( ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) )
        // InternalMyDsl.g:3136:6: ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) )
        {
        // InternalMyDsl.g:3136:6: ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) )
        // InternalMyDsl.g:3136:7: ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) )
        {
        // InternalMyDsl.g:3136:7: ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) )
        // InternalMyDsl.g:3137:1: ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) )
        {
        // InternalMyDsl.g:3137:1: ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) )
        // InternalMyDsl.g:3138:1: (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL )
        {
        // InternalMyDsl.g:3138:1: (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL )
        int alt92=10;
        switch ( input.LA(1) ) {
        case 95:
            {
            alt92=1;
            }
            break;
        case RULE_PLUS_EQUAL:
            {
            alt92=2;
            }
            break;
        case 96:
            {
            alt92=3;
            }
            break;
        case RULE_MINUS_EQUAL:
            {
            alt92=4;
            }
            break;
        case RULE_MULTIPLY:
            {
            alt92=5;
            }
            break;
        case RULE_MULTIPLY_EQUAL:
            {
            alt92=6;
            }
            break;
        case RULE_DIVIDE:
            {
            alt92=7;
            }
            break;
        case RULE_DIVIDE_EQUAL:
            {
            alt92=8;
            }
            break;
        case RULE_MODULE:
            {
            alt92=9;
            }
            break;
        case RULE_MODULE_EQUAL:
            {
            alt92=10;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 92, 0, input);

            throw nvae;
        }

        switch (alt92) {
            case 1 :
                // InternalMyDsl.g:3139:3: lv_numericSign_19_1= '+'
                {
                lv_numericSign_19_1=(Token)match(input,95,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalMyDsl.g:3151:8: lv_numericSign_19_2= RULE_PLUS_EQUAL
                {
                lv_numericSign_19_2=(Token)match(input,RULE_PLUS_EQUAL,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalMyDsl.g:3166:8: lv_numericSign_19_3= '-'
                {
                lv_numericSign_19_3=(Token)match(input,96,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalMyDsl.g:3178:8: lv_numericSign_19_4= RULE_MINUS_EQUAL
                {
                lv_numericSign_19_4=(Token)match(input,RULE_MINUS_EQUAL,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 5 :
                // InternalMyDsl.g:3193:8: lv_numericSign_19_5= RULE_MULTIPLY
                {
                lv_numericSign_19_5=(Token)match(input,RULE_MULTIPLY,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 6 :
                // InternalMyDsl.g:3208:8: lv_numericSign_19_6= RULE_MULTIPLY_EQUAL
                {
                lv_numericSign_19_6=(Token)match(input,RULE_MULTIPLY_EQUAL,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 7 :
                // InternalMyDsl.g:3223:8: lv_numericSign_19_7= RULE_DIVIDE
                {
                lv_numericSign_19_7=(Token)match(input,RULE_DIVIDE,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 8 :
                // InternalMyDsl.g:3238:8: lv_numericSign_19_8= RULE_DIVIDE_EQUAL
                {
                lv_numericSign_19_8=(Token)match(input,RULE_DIVIDE_EQUAL,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 9 :
                // InternalMyDsl.g:3253:8: lv_numericSign_19_9= RULE_MODULE
                {
                lv_numericSign_19_9=(Token)match(input,RULE_MODULE,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 10 :
                // InternalMyDsl.g:3268:8: lv_numericSign_19_10= RULE_MODULE_EQUAL
                {
                lv_numericSign_19_10=(Token)match(input,RULE_MODULE_EQUAL,FOLLOW_28); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalMyDsl.g:3286:2: ( (lv_exp2_20_0= ruleExpression ) )
        // InternalMyDsl.g:3287:1: (lv_exp2_20_0= ruleExpression )
        {
        // InternalMyDsl.g:3287:1: (lv_exp2_20_0= ruleExpression )
        // InternalMyDsl.g:3288:3: lv_exp2_20_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp2ExpressionParserRuleCall_6_1_0()); 
          	    
        }
        pushFollow(FOLLOW_40);
        lv_exp2_20_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMyDsl.g:3304:2: ( (lv_aux_21_0= ruleExpression_aux ) )
        // InternalMyDsl.g:3305:1: (lv_aux_21_0= ruleExpression_aux )
        {
        // InternalMyDsl.g:3305:1: (lv_aux_21_0= ruleExpression_aux )
        // InternalMyDsl.g:3306:3: lv_aux_21_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_6_2_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_aux_21_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred102_InternalMyDsl

    // $ANTLR start synpred108_InternalMyDsl
    public final void synpred108_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_testingSign_22_1=null;
        Token lv_testingSign_22_2=null;
        Token lv_testingSign_22_3=null;
        Token lv_testingSign_22_4=null;
        Token lv_testingSign_22_5=null;
        Token lv_testingSign_22_6=null;
        EObject lv_exp1_23_0 = null;

        EObject lv_aux_24_0 = null;


        // InternalMyDsl.g:3323:6: ( ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) )
        // InternalMyDsl.g:3323:6: ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) )
        {
        // InternalMyDsl.g:3323:6: ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) )
        // InternalMyDsl.g:3323:7: ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) )
        {
        // InternalMyDsl.g:3323:7: ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) )
        // InternalMyDsl.g:3324:1: ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) )
        {
        // InternalMyDsl.g:3324:1: ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) )
        // InternalMyDsl.g:3325:1: (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT )
        {
        // InternalMyDsl.g:3325:1: (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT )
        int alt93=6;
        switch ( input.LA(1) ) {
        case RULE_BT:
            {
            alt93=1;
            }
            break;
        case RULE_ST:
            {
            alt93=2;
            }
            break;
        case RULE_BE:
            {
            alt93=3;
            }
            break;
        case RULE_SE:
            {
            alt93=4;
            }
            break;
        case RULE_DOUBLE_EQUAL:
            {
            alt93=5;
            }
            break;
        case RULE_DIFFERENT:
            {
            alt93=6;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 93, 0, input);

            throw nvae;
        }

        switch (alt93) {
            case 1 :
                // InternalMyDsl.g:3326:3: lv_testingSign_22_1= RULE_BT
                {
                lv_testingSign_22_1=(Token)match(input,RULE_BT,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalMyDsl.g:3341:8: lv_testingSign_22_2= RULE_ST
                {
                lv_testingSign_22_2=(Token)match(input,RULE_ST,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalMyDsl.g:3356:8: lv_testingSign_22_3= RULE_BE
                {
                lv_testingSign_22_3=(Token)match(input,RULE_BE,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalMyDsl.g:3371:8: lv_testingSign_22_4= RULE_SE
                {
                lv_testingSign_22_4=(Token)match(input,RULE_SE,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 5 :
                // InternalMyDsl.g:3386:8: lv_testingSign_22_5= RULE_DOUBLE_EQUAL
                {
                lv_testingSign_22_5=(Token)match(input,RULE_DOUBLE_EQUAL,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 6 :
                // InternalMyDsl.g:3401:8: lv_testingSign_22_6= RULE_DIFFERENT
                {
                lv_testingSign_22_6=(Token)match(input,RULE_DIFFERENT,FOLLOW_28); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalMyDsl.g:3419:2: ( (lv_exp1_23_0= ruleExpression ) )
        // InternalMyDsl.g:3420:1: (lv_exp1_23_0= ruleExpression )
        {
        // InternalMyDsl.g:3420:1: (lv_exp1_23_0= ruleExpression )
        // InternalMyDsl.g:3421:3: lv_exp1_23_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_7_1_0()); 
          	    
        }
        pushFollow(FOLLOW_40);
        lv_exp1_23_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMyDsl.g:3437:2: ( (lv_aux_24_0= ruleExpression_aux ) )
        // InternalMyDsl.g:3438:1: (lv_aux_24_0= ruleExpression_aux )
        {
        // InternalMyDsl.g:3438:1: (lv_aux_24_0= ruleExpression_aux )
        // InternalMyDsl.g:3439:3: lv_aux_24_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_7_2_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_aux_24_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred108_InternalMyDsl

    // $ANTLR start synpred116_InternalMyDsl
    public final void synpred116_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_logicalSign_25_1=null;
        Token lv_logicalSign_25_2=null;
        Token lv_logicalSign_25_3=null;
        Token lv_logicalSign_25_4=null;
        Token lv_logicalSign_25_5=null;
        Token lv_logicalSign_25_6=null;
        Token lv_logicalSign_25_7=null;
        EObject lv_ampersand_26_0 = null;

        EObject lv_exp1_27_0 = null;

        EObject lv_aux_28_0 = null;


        // InternalMyDsl.g:3456:6: ( ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) )
        // InternalMyDsl.g:3456:6: ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) )
        {
        // InternalMyDsl.g:3456:6: ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) )
        // InternalMyDsl.g:3456:7: ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) )
        {
        // InternalMyDsl.g:3456:7: ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) )
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( ((LA96_0>=RULE_MODULE && LA96_0<=RULE_MODULE_EQUAL)||(LA96_0>=RULE_OR && LA96_0<=RULE_DOUBLE_OR_EQUAL)) ) {
            alt96=1;
        }
        else if ( (LA96_0==RULE_AMPERSAND) ) {
            alt96=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 96, 0, input);

            throw nvae;
        }
        switch (alt96) {
            case 1 :
                // InternalMyDsl.g:3456:8: ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) )
                {
                // InternalMyDsl.g:3456:8: ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) )
                // InternalMyDsl.g:3457:1: ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) )
                {
                // InternalMyDsl.g:3457:1: ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) )
                // InternalMyDsl.g:3458:1: (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL )
                {
                // InternalMyDsl.g:3458:1: (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL )
                int alt95=7;
                switch ( input.LA(1) ) {
                case RULE_OR:
                    {
                    alt95=1;
                    }
                    break;
                case RULE_OR_EQUAL:
                    {
                    alt95=2;
                    }
                    break;
                case RULE_EXP:
                    {
                    alt95=3;
                    }
                    break;
                case RULE_EXP_EQUAL:
                    {
                    alt95=4;
                    }
                    break;
                case RULE_DOUBLE_OR_EQUAL:
                    {
                    alt95=5;
                    }
                    break;
                case RULE_MODULE:
                    {
                    alt95=6;
                    }
                    break;
                case RULE_MODULE_EQUAL:
                    {
                    alt95=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 0, input);

                    throw nvae;
                }

                switch (alt95) {
                    case 1 :
                        // InternalMyDsl.g:3459:3: lv_logicalSign_25_1= RULE_OR
                        {
                        lv_logicalSign_25_1=(Token)match(input,RULE_OR,FOLLOW_28); if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // InternalMyDsl.g:3474:8: lv_logicalSign_25_2= RULE_OR_EQUAL
                        {
                        lv_logicalSign_25_2=(Token)match(input,RULE_OR_EQUAL,FOLLOW_28); if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // InternalMyDsl.g:3489:8: lv_logicalSign_25_3= RULE_EXP
                        {
                        lv_logicalSign_25_3=(Token)match(input,RULE_EXP,FOLLOW_28); if (state.failed) return ;

                        }
                        break;
                    case 4 :
                        // InternalMyDsl.g:3504:8: lv_logicalSign_25_4= RULE_EXP_EQUAL
                        {
                        lv_logicalSign_25_4=(Token)match(input,RULE_EXP_EQUAL,FOLLOW_28); if (state.failed) return ;

                        }
                        break;
                    case 5 :
                        // InternalMyDsl.g:3519:8: lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL
                        {
                        lv_logicalSign_25_5=(Token)match(input,RULE_DOUBLE_OR_EQUAL,FOLLOW_28); if (state.failed) return ;

                        }
                        break;
                    case 6 :
                        // InternalMyDsl.g:3534:8: lv_logicalSign_25_6= RULE_MODULE
                        {
                        lv_logicalSign_25_6=(Token)match(input,RULE_MODULE,FOLLOW_28); if (state.failed) return ;

                        }
                        break;
                    case 7 :
                        // InternalMyDsl.g:3549:8: lv_logicalSign_25_7= RULE_MODULE_EQUAL
                        {
                        lv_logicalSign_25_7=(Token)match(input,RULE_MODULE_EQUAL,FOLLOW_28); if (state.failed) return ;

                        }
                        break;

                }


                }


                }


                }
                break;
            case 2 :
                // InternalMyDsl.g:3568:6: ( (lv_ampersand_26_0= ruleAmpersand_Rule ) )
                {
                // InternalMyDsl.g:3568:6: ( (lv_ampersand_26_0= ruleAmpersand_Rule ) )
                // InternalMyDsl.g:3569:1: (lv_ampersand_26_0= ruleAmpersand_Rule )
                {
                // InternalMyDsl.g:3569:1: (lv_ampersand_26_0= ruleAmpersand_Rule )
                // InternalMyDsl.g:3570:3: lv_ampersand_26_0= ruleAmpersand_Rule
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAmpersandAmpersand_RuleParserRuleCall_8_0_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_28);
                lv_ampersand_26_0=ruleAmpersand_Rule();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalMyDsl.g:3586:3: ( (lv_exp1_27_0= ruleExpression ) )
        // InternalMyDsl.g:3587:1: (lv_exp1_27_0= ruleExpression )
        {
        // InternalMyDsl.g:3587:1: (lv_exp1_27_0= ruleExpression )
        // InternalMyDsl.g:3588:3: lv_exp1_27_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_8_1_0()); 
          	    
        }
        pushFollow(FOLLOW_40);
        lv_exp1_27_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMyDsl.g:3604:2: ( (lv_aux_28_0= ruleExpression_aux ) )
        // InternalMyDsl.g:3605:1: (lv_aux_28_0= ruleExpression_aux )
        {
        // InternalMyDsl.g:3605:1: (lv_aux_28_0= ruleExpression_aux )
        // InternalMyDsl.g:3606:3: lv_aux_28_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_8_2_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_aux_28_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred116_InternalMyDsl

    // $ANTLR start synpred117_InternalMyDsl
    public final void synpred117_InternalMyDsl_fragment() throws RecognitionException {   
        Token this_WAT_29=null;
        Token this_COLON_31=null;
        EObject lv_exp1_30_0 = null;

        EObject lv_exp2_32_0 = null;

        EObject lv_aux_33_0 = null;


        // InternalMyDsl.g:3623:6: ( (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) )
        // InternalMyDsl.g:3623:6: (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) )
        {
        // InternalMyDsl.g:3623:6: (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) )
        // InternalMyDsl.g:3623:7: this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) )
        {
        this_WAT_29=(Token)match(input,RULE_WAT,FOLLOW_28); if (state.failed) return ;
        // InternalMyDsl.g:3627:1: ( (lv_exp1_30_0= ruleExpression ) )
        // InternalMyDsl.g:3628:1: (lv_exp1_30_0= ruleExpression )
        {
        // InternalMyDsl.g:3628:1: (lv_exp1_30_0= ruleExpression )
        // InternalMyDsl.g:3629:3: lv_exp1_30_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_9_1_0()); 
          	    
        }
        pushFollow(FOLLOW_36);
        lv_exp1_30_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_COLON_31=(Token)match(input,RULE_COLON,FOLLOW_28); if (state.failed) return ;
        // InternalMyDsl.g:3649:1: ( (lv_exp2_32_0= ruleExpression ) )
        // InternalMyDsl.g:3650:1: (lv_exp2_32_0= ruleExpression )
        {
        // InternalMyDsl.g:3650:1: (lv_exp2_32_0= ruleExpression )
        // InternalMyDsl.g:3651:3: lv_exp2_32_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp2ExpressionParserRuleCall_9_3_0()); 
          	    
        }
        pushFollow(FOLLOW_40);
        lv_exp2_32_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMyDsl.g:3667:2: ( (lv_aux_33_0= ruleExpression_aux ) )
        // InternalMyDsl.g:3668:1: (lv_aux_33_0= ruleExpression_aux )
        {
        // InternalMyDsl.g:3668:1: (lv_aux_33_0= ruleExpression_aux )
        // InternalMyDsl.g:3669:3: lv_aux_33_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_9_4_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_aux_33_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred117_InternalMyDsl

    // $ANTLR start synpred119_InternalMyDsl
    public final void synpred119_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_stringSign_34_1=null;
        Token lv_stringSign_34_2=null;
        EObject lv_exp1_35_0 = null;

        EObject lv_aux_36_0 = null;


        // InternalMyDsl.g:3686:6: ( ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) )
        // InternalMyDsl.g:3686:6: ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) )
        {
        // InternalMyDsl.g:3686:6: ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) )
        // InternalMyDsl.g:3686:7: ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) )
        {
        // InternalMyDsl.g:3686:7: ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) )
        // InternalMyDsl.g:3687:1: ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) )
        {
        // InternalMyDsl.g:3687:1: ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) )
        // InternalMyDsl.g:3688:1: (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL )
        {
        // InternalMyDsl.g:3688:1: (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL )
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==95) ) {
            alt97=1;
        }
        else if ( (LA97_0==RULE_PLUS_EQUAL) ) {
            alt97=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 97, 0, input);

            throw nvae;
        }
        switch (alt97) {
            case 1 :
                // InternalMyDsl.g:3689:3: lv_stringSign_34_1= '+'
                {
                lv_stringSign_34_1=(Token)match(input,95,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalMyDsl.g:3701:8: lv_stringSign_34_2= RULE_PLUS_EQUAL
                {
                lv_stringSign_34_2=(Token)match(input,RULE_PLUS_EQUAL,FOLLOW_28); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalMyDsl.g:3719:2: ( (lv_exp1_35_0= ruleExpression ) )
        // InternalMyDsl.g:3720:1: (lv_exp1_35_0= ruleExpression )
        {
        // InternalMyDsl.g:3720:1: (lv_exp1_35_0= ruleExpression )
        // InternalMyDsl.g:3721:3: lv_exp1_35_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_10_1_0()); 
          	    
        }
        pushFollow(FOLLOW_40);
        lv_exp1_35_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMyDsl.g:3737:2: ( (lv_aux_36_0= ruleExpression_aux ) )
        // InternalMyDsl.g:3738:1: (lv_aux_36_0= ruleExpression_aux )
        {
        // InternalMyDsl.g:3738:1: (lv_aux_36_0= ruleExpression_aux )
        // InternalMyDsl.g:3739:3: lv_aux_36_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_10_2_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_aux_36_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred119_InternalMyDsl

    // $ANTLR start synpred123_InternalMyDsl
    public final void synpred123_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_bitSign_37_1=null;
        Token lv_bitSign_37_2=null;
        Token lv_bitSign_37_3=null;
        Token lv_bitSign_37_4=null;
        EObject lv_expressionBit_38_0 = null;

        EObject lv_aux_39_0 = null;


        // InternalMyDsl.g:3756:6: ( ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) )
        // InternalMyDsl.g:3756:6: ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) )
        {
        // InternalMyDsl.g:3756:6: ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) )
        // InternalMyDsl.g:3756:7: ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) )
        {
        // InternalMyDsl.g:3756:7: ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) )
        // InternalMyDsl.g:3757:1: ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) )
        {
        // InternalMyDsl.g:3757:1: ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) )
        // InternalMyDsl.g:3758:1: (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT )
        {
        // InternalMyDsl.g:3758:1: (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT )
        int alt98=4;
        switch ( input.LA(1) ) {
        case RULE_R_SHIFT_EQUAL:
            {
            alt98=1;
            }
            break;
        case RULE_L_SHIFT:
            {
            alt98=2;
            }
            break;
        case RULE_R_SHIFT:
            {
            alt98=3;
            }
            break;
        case RULE_SUPER_SHIFT:
            {
            alt98=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 98, 0, input);

            throw nvae;
        }

        switch (alt98) {
            case 1 :
                // InternalMyDsl.g:3759:3: lv_bitSign_37_1= RULE_R_SHIFT_EQUAL
                {
                lv_bitSign_37_1=(Token)match(input,RULE_R_SHIFT_EQUAL,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalMyDsl.g:3774:8: lv_bitSign_37_2= RULE_L_SHIFT
                {
                lv_bitSign_37_2=(Token)match(input,RULE_L_SHIFT,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalMyDsl.g:3789:8: lv_bitSign_37_3= RULE_R_SHIFT
                {
                lv_bitSign_37_3=(Token)match(input,RULE_R_SHIFT,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalMyDsl.g:3804:8: lv_bitSign_37_4= RULE_SUPER_SHIFT
                {
                lv_bitSign_37_4=(Token)match(input,RULE_SUPER_SHIFT,FOLLOW_28); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalMyDsl.g:3822:2: ( (lv_expressionBit_38_0= ruleExpression ) )
        // InternalMyDsl.g:3823:1: (lv_expressionBit_38_0= ruleExpression )
        {
        // InternalMyDsl.g:3823:1: (lv_expressionBit_38_0= ruleExpression )
        // InternalMyDsl.g:3824:3: lv_expressionBit_38_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionBitExpressionParserRuleCall_11_1_0()); 
          	    
        }
        pushFollow(FOLLOW_40);
        lv_expressionBit_38_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMyDsl.g:3840:2: ( (lv_aux_39_0= ruleExpression_aux ) )
        // InternalMyDsl.g:3841:1: (lv_aux_39_0= ruleExpression_aux )
        {
        // InternalMyDsl.g:3841:1: (lv_aux_39_0= ruleExpression_aux )
        // InternalMyDsl.g:3842:3: lv_aux_39_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_11_2_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_aux_39_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred123_InternalMyDsl

    // $ANTLR start synpred125_InternalMyDsl
    public final void synpred125_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_logicOp_40_1=null;
        Token lv_logicOp_40_2=null;
        EObject lv_logicExp_41_0 = null;


        // InternalMyDsl.g:3859:6: ( ( ( ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) ) ) ( (lv_logicExp_41_0= ruleExpression ) ) ) )
        // InternalMyDsl.g:3859:6: ( ( ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) ) ) ( (lv_logicExp_41_0= ruleExpression ) ) )
        {
        // InternalMyDsl.g:3859:6: ( ( ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) ) ) ( (lv_logicExp_41_0= ruleExpression ) ) )
        // InternalMyDsl.g:3859:7: ( ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) ) ) ( (lv_logicExp_41_0= ruleExpression ) )
        {
        // InternalMyDsl.g:3859:7: ( ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) ) )
        // InternalMyDsl.g:3860:1: ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) )
        {
        // InternalMyDsl.g:3860:1: ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) )
        // InternalMyDsl.g:3861:1: (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND )
        {
        // InternalMyDsl.g:3861:1: (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND )
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_OR_LOGIC) ) {
            alt99=1;
        }
        else if ( (LA99_0==RULE_AND) ) {
            alt99=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 99, 0, input);

            throw nvae;
        }
        switch (alt99) {
            case 1 :
                // InternalMyDsl.g:3862:3: lv_logicOp_40_1= RULE_OR_LOGIC
                {
                lv_logicOp_40_1=(Token)match(input,RULE_OR_LOGIC,FOLLOW_28); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalMyDsl.g:3877:8: lv_logicOp_40_2= RULE_AND
                {
                lv_logicOp_40_2=(Token)match(input,RULE_AND,FOLLOW_28); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalMyDsl.g:3895:2: ( (lv_logicExp_41_0= ruleExpression ) )
        // InternalMyDsl.g:3896:1: (lv_logicExp_41_0= ruleExpression )
        {
        // InternalMyDsl.g:3896:1: (lv_logicExp_41_0= ruleExpression )
        // InternalMyDsl.g:3897:3: lv_logicExp_41_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getLogicExpExpressionParserRuleCall_12_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_logicExp_41_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred125_InternalMyDsl

    // $ANTLR start synpred134_InternalMyDsl
    public final void synpred134_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_exp_0_0=null;
        Token this_LONG_1=null;
        Token lv_exp1_2_0=null;
        Token this_LONG_3=null;

        // InternalMyDsl.g:4103:2: ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) ) )
        // InternalMyDsl.g:4103:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) )
        {
        // InternalMyDsl.g:4103:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) )
        int alt103=2;
        int LA103_0 = input.LA(1);

        if ( (LA103_0==RULE_HEXA) ) {
            alt103=1;
        }
        else if ( (LA103_0==RULE_DECIMAL_DIGITS) ) {
            alt103=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 103, 0, input);

            throw nvae;
        }
        switch (alt103) {
            case 1 :
                // InternalMyDsl.g:4103:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? )
                {
                // InternalMyDsl.g:4103:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? )
                // InternalMyDsl.g:4103:4: ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )?
                {
                // InternalMyDsl.g:4103:4: ( (lv_exp_0_0= RULE_HEXA ) )
                // InternalMyDsl.g:4104:1: (lv_exp_0_0= RULE_HEXA )
                {
                // InternalMyDsl.g:4104:1: (lv_exp_0_0= RULE_HEXA )
                // InternalMyDsl.g:4105:3: lv_exp_0_0= RULE_HEXA
                {
                lv_exp_0_0=(Token)match(input,RULE_HEXA,FOLLOW_46); if (state.failed) return ;

                }


                }

                // InternalMyDsl.g:4121:2: (this_LONG_1= RULE_LONG )?
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==RULE_LONG) ) {
                    alt101=1;
                }
                switch (alt101) {
                    case 1 :
                        // InternalMyDsl.g:4121:3: this_LONG_1= RULE_LONG
                        {
                        this_LONG_1=(Token)match(input,RULE_LONG,FOLLOW_2); if (state.failed) return ;

                        }
                        break;

                }


                }


                }
                break;
            case 2 :
                // InternalMyDsl.g:4126:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? )
                {
                // InternalMyDsl.g:4126:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? )
                // InternalMyDsl.g:4126:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )?
                {
                // InternalMyDsl.g:4126:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) )
                // InternalMyDsl.g:4127:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                {
                // InternalMyDsl.g:4127:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                // InternalMyDsl.g:4128:3: lv_exp1_2_0= RULE_DECIMAL_DIGITS
                {
                lv_exp1_2_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_46); if (state.failed) return ;

                }


                }

                // InternalMyDsl.g:4144:2: (this_LONG_3= RULE_LONG )?
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==RULE_LONG) ) {
                    alt102=1;
                }
                switch (alt102) {
                    case 1 :
                        // InternalMyDsl.g:4144:3: this_LONG_3= RULE_LONG
                        {
                        this_LONG_3=(Token)match(input,RULE_LONG,FOLLOW_2); if (state.failed) return ;

                        }
                        break;

                }


                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred134_InternalMyDsl

    // $ANTLR start synpred135_InternalMyDsl
    public final void synpred135_InternalMyDsl_fragment() throws RecognitionException {   
        EObject lv_exp2_4_0 = null;


        // InternalMyDsl.g:4149:6: ( ( (lv_exp2_4_0= ruleFloat_Literal ) ) )
        // InternalMyDsl.g:4149:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
        {
        // InternalMyDsl.g:4149:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
        // InternalMyDsl.g:4150:1: (lv_exp2_4_0= ruleFloat_Literal )
        {
        // InternalMyDsl.g:4150:1: (lv_exp2_4_0= ruleFloat_Literal )
        // InternalMyDsl.g:4151:3: lv_exp2_4_0= ruleFloat_Literal
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLiteral_ExpressionAccess().getExp2Float_LiteralParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_exp2_4_0=ruleFloat_Literal();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred135_InternalMyDsl

    // $ANTLR start synpred137_InternalMyDsl
    public final void synpred137_InternalMyDsl_fragment() throws RecognitionException {   
        Token this_LPAREN_2=null;
        Token this_RPAREN_4=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        EObject lv_argList_3_0 = null;


        // InternalMyDsl.g:4230:2: ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) )
        // InternalMyDsl.g:4230:2: ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN )
        {
        // InternalMyDsl.g:4230:2: ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN )
        // InternalMyDsl.g:4230:3: ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN
        {
        // InternalMyDsl.g:4230:3: ( (lv_className_1_0= ruleClass_name ) )
        // InternalMyDsl.g:4231:1: (lv_className_1_0= ruleClass_name )
        {
        // InternalMyDsl.g:4231:1: (lv_className_1_0= ruleClass_name )
        // InternalMyDsl.g:4232:3: lv_className_1_0= ruleClass_name
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_17);
        lv_className_1_0=ruleClass_name();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_LPAREN_2=(Token)match(input,RULE_LPAREN,FOLLOW_28); if (state.failed) return ;
        // InternalMyDsl.g:4252:1: ( (lv_argList_3_0= ruleArg_List ) )
        // InternalMyDsl.g:4253:1: (lv_argList_3_0= ruleArg_List )
        {
        // InternalMyDsl.g:4253:1: (lv_argList_3_0= ruleArg_List )
        // InternalMyDsl.g:4254:3: lv_argList_3_0= ruleArg_List
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getArgListArg_ListParserRuleCall_1_0_2_0()); 
          	    
        }
        pushFollow(FOLLOW_19);
        lv_argList_3_0=ruleArg_List();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_RPAREN_4=(Token)match(input,RULE_RPAREN,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred137_InternalMyDsl

    // $ANTLR start synpred138_InternalMyDsl
    public final void synpred138_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_expression_7_0 = null;


        // InternalMyDsl.g:4293:3: ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) )
        // InternalMyDsl.g:4293:3: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )
        {
        // InternalMyDsl.g:4293:3: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )
        // InternalMyDsl.g:4293:5: otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']'
        {
        otherlv_6=(Token)match(input,75,FOLLOW_28); if (state.failed) return ;
        // InternalMyDsl.g:4297:1: ( (lv_expression_7_0= ruleExpression ) )
        // InternalMyDsl.g:4298:1: (lv_expression_7_0= ruleExpression )
        {
        // InternalMyDsl.g:4298:1: (lv_expression_7_0= ruleExpression )
        // InternalMyDsl.g:4299:3: lv_expression_7_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_1_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_21);
        lv_expression_7_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_8=(Token)match(input,76,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred138_InternalMyDsl

    // $ANTLR start synpred139_InternalMyDsl
    public final void synpred139_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_9=null;

        // InternalMyDsl.g:4320:7: (otherlv_9= '[]' )
        // InternalMyDsl.g:4320:7: otherlv_9= '[]'
        {
        otherlv_9=(Token)match(input,77,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred139_InternalMyDsl

    // $ANTLR start synpred142_InternalMyDsl
    public final void synpred142_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_typeSpecifier_5_0 = null;

        EObject lv_expression_7_0 = null;


        // InternalMyDsl.g:4275:6: ( ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) )
        // InternalMyDsl.g:4275:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* )
        {
        // InternalMyDsl.g:4275:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* )
        // InternalMyDsl.g:4275:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )*
        {
        // InternalMyDsl.g:4275:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) )
        // InternalMyDsl.g:4276:1: (lv_typeSpecifier_5_0= ruleType_specifier )
        {
        // InternalMyDsl.g:4276:1: (lv_typeSpecifier_5_0= ruleType_specifier )
        // InternalMyDsl.g:4277:3: lv_typeSpecifier_5_0= ruleType_specifier
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getTypeSpecifierType_specifierParserRuleCall_1_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_25);
        lv_typeSpecifier_5_0=ruleType_specifier();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMyDsl.g:4293:2: ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )?
        int alt104=3;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==75) ) {
            int LA104_1 = input.LA(2);

            if ( (LA104_1==RULE_ID||LA104_1==RULE_LPAREN||(LA104_1>=RULE_NULL && LA104_1<=RULE_THIS)||(LA104_1>=RULE_INCREMENT && LA104_1<=RULE_DECREMENT)||LA104_1==RULE_DECIMAL_DIGITS||LA104_1==RULE_HEXA||(LA104_1>=RULE_STRING && LA104_1<=RULE_FALSE)||LA104_1==96) ) {
                alt104=1;
            }
        }
        else if ( (LA104_0==77) ) {
            int LA104_2 = input.LA(2);

            if ( (synpred139_InternalMyDsl()) ) {
                alt104=2;
            }
        }
        switch (alt104) {
            case 1 :
                // InternalMyDsl.g:4293:3: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )
                {
                // InternalMyDsl.g:4293:3: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )
                // InternalMyDsl.g:4293:5: otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']'
                {
                otherlv_6=(Token)match(input,75,FOLLOW_28); if (state.failed) return ;
                // InternalMyDsl.g:4297:1: ( (lv_expression_7_0= ruleExpression ) )
                // InternalMyDsl.g:4298:1: (lv_expression_7_0= ruleExpression )
                {
                // InternalMyDsl.g:4298:1: (lv_expression_7_0= ruleExpression )
                // InternalMyDsl.g:4299:3: lv_expression_7_0= ruleExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_1_1_0_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_21);
                lv_expression_7_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_8=(Token)match(input,76,FOLLOW_25); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalMyDsl.g:4320:7: otherlv_9= '[]'
                {
                otherlv_9=(Token)match(input,77,FOLLOW_25); if (state.failed) return ;

                }
                break;

        }

        // InternalMyDsl.g:4324:3: ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )*
        loop105:
        do {
            int alt105=3;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==75) ) {
                alt105=1;
            }
            else if ( (LA105_0==77) ) {
                alt105=2;
            }


            switch (alt105) {
        	case 1 :
        	    // InternalMyDsl.g:4324:4: (otherlv_10= '[' otherlv_11= ']' )
        	    {
        	    // InternalMyDsl.g:4324:4: (otherlv_10= '[' otherlv_11= ']' )
        	    // InternalMyDsl.g:4324:6: otherlv_10= '[' otherlv_11= ']'
        	    {
        	    otherlv_10=(Token)match(input,75,FOLLOW_21); if (state.failed) return ;
        	    otherlv_11=(Token)match(input,76,FOLLOW_25); if (state.failed) return ;

        	    }


        	    }
        	    break;
        	case 2 :
        	    // InternalMyDsl.g:4333:7: otherlv_12= '[]'
        	    {
        	    otherlv_12=(Token)match(input,77,FOLLOW_25); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop105;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred142_InternalMyDsl

    // $ANTLR start synpred143_InternalMyDsl
    public final void synpred143_InternalMyDsl_fragment() throws RecognitionException {   
        EObject lv_expression_1_0 = null;


        // InternalMyDsl.g:4511:3: ( ( (lv_expression_1_0= ruleExpression ) ) )
        // InternalMyDsl.g:4511:3: ( (lv_expression_1_0= ruleExpression ) )
        {
        // InternalMyDsl.g:4511:3: ( (lv_expression_1_0= ruleExpression ) )
        // InternalMyDsl.g:4512:1: (lv_expression_1_0= ruleExpression )
        {
        // InternalMyDsl.g:4512:1: (lv_expression_1_0= ruleExpression )
        // InternalMyDsl.g:4513:3: lv_expression_1_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLogical_Expression_NRAccess().getExpressionExpressionParserRuleCall_0_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_expression_1_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred143_InternalMyDsl

    // $ANTLR start synpred154_InternalMyDsl
    public final void synpred154_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_elseStatement_6_0 = null;


        // InternalMyDsl.g:5182:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )
        // InternalMyDsl.g:5182:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) )
        {
        // InternalMyDsl.g:5182:3: ( ( 'else' )=>otherlv_5= 'else' )
        // InternalMyDsl.g:5182:4: ( 'else' )=>otherlv_5= 'else'
        {
        otherlv_5=(Token)match(input,104,FOLLOW_34); if (state.failed) return ;

        }

        // InternalMyDsl.g:5187:2: ( (lv_elseStatement_6_0= ruleStatement ) )
        // InternalMyDsl.g:5188:1: (lv_elseStatement_6_0= ruleStatement )
        {
        // InternalMyDsl.g:5188:1: (lv_elseStatement_6_0= ruleStatement )
        // InternalMyDsl.g:5189:3: lv_elseStatement_6_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_elseStatement_6_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred154_InternalMyDsl

    // $ANTLR start synpred156_InternalMyDsl
    public final void synpred156_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token lv_lParen_3_0=null;
        Token lv_rparent_5_0=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_catchStatement_6_0 = null;


        // InternalMyDsl.g:5248:3: ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )
        // InternalMyDsl.g:5248:3: ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) )
        {
        // InternalMyDsl.g:5248:3: ( ( 'catch' )=>otherlv_2= 'catch' )
        // InternalMyDsl.g:5248:4: ( 'catch' )=>otherlv_2= 'catch'
        {
        otherlv_2=(Token)match(input,106,FOLLOW_17); if (state.failed) return ;

        }

        // InternalMyDsl.g:5253:2: ( (lv_lParen_3_0= RULE_LPAREN ) )
        // InternalMyDsl.g:5254:1: (lv_lParen_3_0= RULE_LPAREN )
        {
        // InternalMyDsl.g:5254:1: (lv_lParen_3_0= RULE_LPAREN )
        // InternalMyDsl.g:5255:3: lv_lParen_3_0= RULE_LPAREN
        {
        lv_lParen_3_0=(Token)match(input,RULE_LPAREN,FOLLOW_14); if (state.failed) return ;

        }


        }

        // InternalMyDsl.g:5271:2: ( (lv_parameters_4_0= ruleParameter ) )
        // InternalMyDsl.g:5272:1: (lv_parameters_4_0= ruleParameter )
        {
        // InternalMyDsl.g:5272:1: (lv_parameters_4_0= ruleParameter )
        // InternalMyDsl.g:5273:3: lv_parameters_4_0= ruleParameter
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
          	    
        }
        pushFollow(FOLLOW_19);
        lv_parameters_4_0=ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMyDsl.g:5289:2: ( (lv_rparent_5_0= RULE_RPAREN ) )
        // InternalMyDsl.g:5290:1: (lv_rparent_5_0= RULE_RPAREN )
        {
        // InternalMyDsl.g:5290:1: (lv_rparent_5_0= RULE_RPAREN )
        // InternalMyDsl.g:5291:3: lv_rparent_5_0= RULE_RPAREN
        {
        lv_rparent_5_0=(Token)match(input,RULE_RPAREN,FOLLOW_34); if (state.failed) return ;

        }


        }

        // InternalMyDsl.g:5307:2: ( (lv_catchStatement_6_0= ruleStatement ) )
        // InternalMyDsl.g:5308:1: (lv_catchStatement_6_0= ruleStatement )
        {
        // InternalMyDsl.g:5308:1: (lv_catchStatement_6_0= ruleStatement )
        // InternalMyDsl.g:5309:3: lv_catchStatement_6_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTry_statementAccess().getCatchStatementStatementParserRuleCall_2_4_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_catchStatement_6_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred156_InternalMyDsl

    // $ANTLR start synpred158_InternalMyDsl
    public final void synpred158_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        EObject lv_finallyStatement_8_0 = null;


        // InternalMyDsl.g:5325:5: ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )
        // InternalMyDsl.g:5325:5: ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) )
        {
        // InternalMyDsl.g:5325:5: ( ( 'finally' )=>otherlv_7= 'finally' )
        // InternalMyDsl.g:5325:6: ( 'finally' )=>otherlv_7= 'finally'
        {
        otherlv_7=(Token)match(input,107,FOLLOW_34); if (state.failed) return ;

        }

        // InternalMyDsl.g:5330:2: ( (lv_finallyStatement_8_0= ruleStatement ) )
        // InternalMyDsl.g:5331:1: (lv_finallyStatement_8_0= ruleStatement )
        {
        // InternalMyDsl.g:5331:1: (lv_finallyStatement_8_0= ruleStatement )
        // InternalMyDsl.g:5332:3: lv_finallyStatement_8_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTry_statementAccess().getFinallyStatementStatementParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_finallyStatement_8_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred158_InternalMyDsl

    // $ANTLR start synpred160_InternalMyDsl
    public final void synpred160_InternalMyDsl_fragment() throws RecognitionException {   
        Token kw=null;
        Token this_ID_1=null;

        // InternalMyDsl.g:5590:2: (kw= '.' this_ID_1= RULE_ID )
        // InternalMyDsl.g:5590:2: kw= '.' this_ID_1= RULE_ID
        {
        kw=(Token)match(input,94,FOLLOW_8); if (state.failed) return ;
        this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred160_InternalMyDsl

    // Delegated rules

    public final boolean synpred135_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred156_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred156_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred143_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred143_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred117_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred134_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred134_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred142_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred142_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred90_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred139_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred139_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred102_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred123_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred123_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred137_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred137_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred158_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred158_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred116_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred116_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred154_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred160_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred160_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA77 dfa77 = new DFA77(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\3\5\2\uffff";
    static final String dfa_3s = "\3\111\2\uffff";
    static final String dfa_4s = "\3\uffff\1\1\1\2";
    static final String dfa_5s = "\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\6\uffff\1\1\1\2\73\uffff\1\3",
            "\1\4\6\uffff\1\1\1\2\73\uffff\1\3",
            "\1\4\6\uffff\1\1\1\2\73\uffff\1\3",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "227:3: ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) )";
        }
    }
    static final String dfa_7s = "\24\uffff";
    static final String dfa_8s = "\16\6\1\12\1\6\3\uffff\1\6";
    static final String dfa_9s = "\3\127\11\115\1\136\1\115\1\116\1\6\3\uffff\1\136";
    static final String dfa_10s = "\20\uffff\1\2\1\1\1\3\1\uffff";
    static final String dfa_11s = "\24\uffff}>";
    static final String[] dfa_12s = {
            "\1\14\5\uffff\1\1\1\2\101\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
            "\1\14\5\uffff\1\1\1\2\101\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
            "\1\14\5\uffff\1\1\1\2\101\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
            "\1\16\106\uffff\1\15",
            "\1\16\106\uffff\1\15",
            "\1\16\106\uffff\1\15",
            "\1\16\106\uffff\1\15",
            "\1\16\106\uffff\1\15",
            "\1\16\106\uffff\1\15",
            "\1\16\106\uffff\1\15",
            "\1\16\106\uffff\1\15",
            "\1\16\106\uffff\1\15",
            "\1\16\3\uffff\1\20\102\uffff\1\15\20\uffff\1\17",
            "\1\16\106\uffff\1\15",
            "\1\22\74\uffff\2\21\2\uffff\1\21\1\uffff\2\21",
            "\1\23",
            "",
            "",
            "",
            "\1\16\106\uffff\1\15\20\uffff\1\17"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "591:3: ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) )";
        }
    }
    static final String dfa_13s = "\32\uffff";
    static final String dfa_14s = "\1\6\1\uffff\1\6\16\uffff\1\6\1\uffff\6\6\1\0";
    static final String dfa_15s = "\1\151\1\uffff\1\140\16\uffff\1\140\1\uffff\6\140\1\0";
    static final String dfa_16s = "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\uffff\1\15\7\uffff";
    static final String dfa_17s = "\31\uffff\1\0}>";
    static final String[] dfa_18s = {
            "\1\2\1\uffff\1\14\1\uffff\1\3\1\uffff\2\1\1\uffff\3\3\1\uffff\2\3\33\uffff\1\3\1\uffff\1\3\1\uffff\7\3\14\uffff\1\20\7\uffff\11\1\1\11\1\12\1\13\1\16\1\17\1\7\2\uffff\1\3\1\10\2\uffff\1\6\1\5\1\uffff\1\4\1\uffff\1\15",
            "",
            "\1\1\3\uffff\1\3\3\uffff\1\22\3\uffff\36\3\27\uffff\2\3\2\uffff\1\3\1\uffff\1\1\20\uffff\1\21\2\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\23\3\uffff\1\3\4\uffff\3\3\1\uffff\2\3\33\uffff\1\3\1\uffff\1\3\1\uffff\7\3\45\uffff\1\3",
            "",
            "\1\1\3\uffff\1\3\7\uffff\36\3\27\uffff\2\3\2\uffff\1\3\1\uffff\1\1\20\uffff\1\24\2\3",
            "\1\25\3\uffff\1\3\4\uffff\3\3\1\uffff\2\3\33\uffff\1\3\1\uffff\1\3\1\uffff\7\3\45\uffff\1\3",
            "\1\1\3\uffff\1\3\7\uffff\36\3\27\uffff\2\3\2\uffff\1\3\1\uffff\1\1\20\uffff\1\26\2\3",
            "\1\27\3\uffff\1\3\4\uffff\3\3\1\uffff\2\3\33\uffff\1\3\1\uffff\1\3\1\uffff\7\3\45\uffff\1\3",
            "\1\1\3\uffff\1\3\7\uffff\36\3\27\uffff\2\3\2\uffff\1\3\1\uffff\1\1\20\uffff\1\30\2\3",
            "\1\31\3\uffff\1\3\4\uffff\3\3\1\uffff\2\3\33\uffff\1\3\1\uffff\1\3\1\uffff\7\3\45\uffff\1\3",
            "\1\uffff"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1854:1: ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) | ( (lv_ifStatement_3_0= ruleIf_statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_statement ) ) | (otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) ) ) | ( () ( (lv_ret_13_0= 'return' ) ) ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';' ) | ( () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) | ( (lv_statementBlock_20_0= ruleStatement_block ) ) | ( (lv_tryStatement_21_0= ruleTry_statement ) ) | ( ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) ) ) | ( () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';' ) | ( () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';' ) | ( () otherlv_34= ';' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_25 = input.LA(1);

                         
                        int index43_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalMyDsl()) ) {s = 1;}

                        else if ( (synpred51_InternalMyDsl()) ) {s = 3;}

                         
                        input.seek(index43_25);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\15\uffff";
    static final String dfa_20s = "\1\6\1\uffff\1\6\2\uffff\7\6\1\0";
    static final String dfa_21s = "\1\140\1\uffff\1\140\2\uffff\7\140\1\0";
    static final String dfa_22s = "\1\uffff\1\1\1\uffff\1\2\1\3\10\uffff";
    static final String dfa_23s = "\14\uffff\1\0}>";
    static final String[] dfa_24s = {
            "\1\2\3\uffff\1\4\1\uffff\2\1\1\uffff\3\4\1\uffff\2\4\33\uffff\1\4\1\uffff\1\4\1\uffff\7\4\14\uffff\1\3\7\uffff\11\1\10\uffff\1\4",
            "",
            "\1\1\3\uffff\1\4\7\uffff\36\4\27\uffff\2\4\2\uffff\1\4\1\uffff\1\1\20\uffff\1\5\2\4",
            "",
            "",
            "\1\6\3\uffff\1\4\4\uffff\3\4\1\uffff\2\4\33\uffff\1\4\1\uffff\1\4\1\uffff\7\4\45\uffff\1\4",
            "\1\1\3\uffff\1\4\7\uffff\36\4\27\uffff\2\4\2\uffff\1\4\1\uffff\1\1\20\uffff\1\7\2\4",
            "\1\10\3\uffff\1\4\4\uffff\3\4\1\uffff\2\4\33\uffff\1\4\1\uffff\1\4\1\uffff\7\4\45\uffff\1\4",
            "\1\1\3\uffff\1\4\7\uffff\36\4\27\uffff\2\4\2\uffff\1\4\1\uffff\1\1\20\uffff\1\11\2\4",
            "\1\12\3\uffff\1\4\4\uffff\3\4\1\uffff\2\4\33\uffff\1\4\1\uffff\1\4\1\uffff\7\4\45\uffff\1\4",
            "\1\1\3\uffff\1\4\7\uffff\36\4\27\uffff\2\4\2\uffff\1\4\1\uffff\1\1\20\uffff\1\13\2\4",
            "\1\14\3\uffff\1\4\4\uffff\3\4\1\uffff\2\4\33\uffff\1\4\1\uffff\1\4\1\uffff\7\4\45\uffff\1\4",
            "\1\uffff"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "2337:1: ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | otherlv_3= ';' | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_12 = input.LA(1);

                         
                        int index44_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index44_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_25s = "\23\uffff";
    static final String dfa_26s = "\1\6\4\uffff\1\0\15\uffff";
    static final String dfa_27s = "\1\140\4\uffff\1\0\15\uffff";
    static final String dfa_28s = "\1\uffff\1\1\2\uffff\1\2\3\uffff\1\3\1\5\1\6\3\uffff\1\7\1\10\1\11\1\12\1\4";
    static final String dfa_29s = "\5\uffff\1\0\15\uffff}>";
    static final String[] dfa_30s = {
            "\1\21\3\uffff\1\5\4\uffff\1\16\1\17\1\20\1\uffff\2\1\33\uffff\1\12\1\uffff\1\12\1\uffff\2\12\1\11\1\10\3\4\45\uffff\1\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "2466:1: ( ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_5 = input.LA(1);

                         
                        int index47_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 4;}

                        else if ( (synpred78_InternalMyDsl()) ) {s = 18;}

                         
                        input.seek(index47_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_31s = "\63\uffff";
    static final String dfa_32s = "\1\45\62\uffff";
    static final String dfa_33s = "\1\11\44\0\16\uffff";
    static final String dfa_34s = "\1\140\44\0\16\uffff";
    static final String dfa_35s = "\45\uffff\1\16\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\13\1\11\1\10\1\12\1\14\1\15";
    static final String dfa_36s = "\1\uffff\1\30\1\4\1\24\1\33\1\15\1\0\1\23\1\25\1\13\1\27\1\42\1\16\1\22\1\43\1\6\1\35\1\32\1\5\1\11\1\26\1\41\1\14\1\36\1\31\1\7\1\17\1\37\1\2\1\34\1\10\1\40\1\12\1\20\1\1\1\3\1\21\16\uffff}>";
    static final String[] dfa_37s = {
            "\1\45\1\1\1\45\2\uffff\1\45\3\uffff\1\5\1\6\1\7\1\11\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\35\27\uffff\1\45\1\4\2\uffff\1\2\1\45\21\uffff\1\3\1\10\1\12",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_31;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "2868:1: ( ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) | ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) | ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) | ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) | ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) | ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) | (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) | ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) | ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) | ( ( ( (lv_logicOp_40_1= RULE_OR_LOGIC | lv_logicOp_40_2= RULE_AND ) ) ) ( (lv_logicExp_41_0= ruleExpression ) ) ) | () )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_6 = input.LA(1);

                         
                        int index57_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalMyDsl()) ) {s = 43;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_34 = input.LA(1);

                         
                        int index57_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred123_InternalMyDsl()) ) {s = 49;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_34);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA57_28 = input.LA(1);

                         
                        int index57_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalMyDsl()) ) {s = 46;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_28);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA57_35 = input.LA(1);

                         
                        int index57_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalMyDsl()) ) {s = 50;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_35);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA57_2 = input.LA(1);

                         
                        int index57_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalMyDsl()) ) {s = 39;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA57_18 = input.LA(1);

                         
                        int index57_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalMyDsl()) ) {s = 47;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_18);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA57_15 = input.LA(1);

                         
                        int index57_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 44;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_15);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA57_25 = input.LA(1);

                         
                        int index57_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalMyDsl()) ) {s = 46;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_25);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA57_30 = input.LA(1);

                         
                        int index57_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalMyDsl()) ) {s = 48;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_30);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA57_19 = input.LA(1);

                         
                        int index57_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalMyDsl()) ) {s = 47;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_19);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA57_32 = input.LA(1);

                         
                        int index57_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred123_InternalMyDsl()) ) {s = 49;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_32);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA57_9 = input.LA(1);

                         
                        int index57_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 44;}

                        else if ( (synpred119_InternalMyDsl()) ) {s = 45;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_9);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA57_22 = input.LA(1);

                         
                        int index57_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalMyDsl()) ) {s = 47;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_22);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA57_5 = input.LA(1);

                         
                        int index57_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalMyDsl()) ) {s = 42;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_5);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA57_12 = input.LA(1);

                         
                        int index57_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 44;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_12);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA57_26 = input.LA(1);

                         
                        int index57_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalMyDsl()) ) {s = 46;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_26);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA57_33 = input.LA(1);

                         
                        int index57_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred123_InternalMyDsl()) ) {s = 49;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_33);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA57_36 = input.LA(1);

                         
                        int index57_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalMyDsl()) ) {s = 50;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_36);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA57_13 = input.LA(1);

                         
                        int index57_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 44;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_13);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA57_7 = input.LA(1);

                         
                        int index57_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalMyDsl()) ) {s = 43;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_7);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA57_3 = input.LA(1);

                         
                        int index57_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalMyDsl()) ) {s = 40;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_3);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA57_8 = input.LA(1);

                         
                        int index57_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 44;}

                        else if ( (synpred119_InternalMyDsl()) ) {s = 45;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_8);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA57_20 = input.LA(1);

                         
                        int index57_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalMyDsl()) ) {s = 47;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_20);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA57_10 = input.LA(1);

                         
                        int index57_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 44;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_10);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalMyDsl()) ) {s = 38;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA57_24 = input.LA(1);

                         
                        int index57_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalMyDsl()) ) {s = 46;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_24);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA57_17 = input.LA(1);

                         
                        int index57_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 44;}

                        else if ( (synpred116_InternalMyDsl()) ) {s = 46;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_17);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA57_4 = input.LA(1);

                         
                        int index57_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalMyDsl()) ) {s = 41;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_4);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA57_29 = input.LA(1);

                         
                        int index57_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalMyDsl()) ) {s = 46;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA57_16 = input.LA(1);

                         
                        int index57_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 44;}

                        else if ( (synpred116_InternalMyDsl()) ) {s = 46;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_16);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA57_23 = input.LA(1);

                         
                        int index57_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalMyDsl()) ) {s = 47;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_23);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA57_27 = input.LA(1);

                         
                        int index57_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalMyDsl()) ) {s = 46;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_27);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA57_31 = input.LA(1);

                         
                        int index57_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred123_InternalMyDsl()) ) {s = 49;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_31);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA57_21 = input.LA(1);

                         
                        int index57_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalMyDsl()) ) {s = 47;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_21);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA57_11 = input.LA(1);

                         
                        int index57_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 44;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_11);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA57_14 = input.LA(1);

                         
                        int index57_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 44;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index57_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_38s = "\1\6\1\0\13\uffff";
    static final String dfa_39s = "\1\127\1\0\13\uffff";
    static final String dfa_40s = "\2\uffff\1\2\10\uffff\1\3\1\1";
    static final String dfa_41s = "\1\uffff\1\0\13\uffff}>";
    static final String[] dfa_42s = {
            "\1\1\3\uffff\1\13\104\uffff\11\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[][] dfa_42 = unpackEncodedStringArray(dfa_42s);

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "4230:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) | (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_InternalMyDsl()) ) {s = 12;}

                        else if ( (synpred142_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_43s = "\56\uffff";
    static final String dfa_44s = "\1\3\55\uffff";
    static final String dfa_45s = "\1\11\2\0\53\uffff";
    static final String dfa_46s = "\1\140\2\0\53\uffff";
    static final String dfa_47s = "\3\uffff\1\3\50\uffff\1\1\1\2";
    static final String dfa_48s = "\1\uffff\1\0\1\1\53\uffff}>";
    static final String[] dfa_49s = {
            "\3\3\2\uffff\1\3\3\uffff\36\3\27\uffff\2\3\2\uffff\1\1\1\3\1\2\20\uffff\3\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = dfa_43;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "4293:2: ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalMyDsl()) ) {s = 44;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred139_InternalMyDsl()) ) {s = 45;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index66_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_50s = "\1\uffff\1\1\20\uffff\1\2";
    static final String[] dfa_51s = {
            "\1\1\3\uffff\1\5\4\uffff\3\1\1\uffff\2\1\33\uffff\1\1\1\uffff\1\1\1\uffff\7\1\45\uffff\1\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[][] dfa_51 = unpackEncodedStringArray(dfa_51s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_50;
            this.special = dfa_29;
            this.transition = dfa_51;
        }
        public String getDescription() {
            return "4511:2: ( ( (lv_expression_1_0= ruleExpression ) ) | (this_LPAREN_2= RULE_LPAREN ( (lv_expression_3_0= ruleExpression ) ) this_RPAREN_4= RULE_RPAREN ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_5 = input.LA(1);

                         
                        int index69_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred143_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index69_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_52s = "\6\uffff";
    static final String dfa_53s = "\1\6\1\107\1\6\2\uffff\1\107";
    static final String dfa_54s = "\1\6\1\155\1\6\2\uffff\1\155";
    static final String dfa_55s = "\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_56s = "\6\uffff}>";
    static final String[] dfa_57s = {
            "\1\1",
            "\1\3\26\uffff\1\2\16\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\3\26\uffff\1\2\16\uffff\1\4"
    };

    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[][] dfa_57 = unpackEncodedStringArray(dfa_57s);

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_52;
            this.eof = dfa_52;
            this.min = dfa_53;
            this.max = dfa_54;
            this.accept = dfa_55;
            this.special = dfa_56;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "5373:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003032L,0x0000100000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003032L,0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003030L,0x0000000000000200L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003250L,0x0000000000FF8080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000003000L,0x0000000000000200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000180L,0x0000000000000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000003040L,0x0000000000FF8000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003050L,0x0000000000FF8000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000003840L,0x0000000000FF8000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000880L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000003040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x07F50000001B8540L,0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x07F50000001B8740L,0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000100L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x07F50000001BB740L,0x000002B33FFF8080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x07F50000001BB540L,0x000002B33FFF8080L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x07F50000001B8540L,0x0000000100000080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000080L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x07F50000001BB540L,0x0000000100FF8080L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x07F50000001B8D40L,0x0000000100000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000FFFFFFFC0400L,0x00000001C0000900L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0803000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0802000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000003440L,0x0000000000FF8000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x07F50000001BB740L,0x000002BF3FFF8080L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0001000000000000L});

}