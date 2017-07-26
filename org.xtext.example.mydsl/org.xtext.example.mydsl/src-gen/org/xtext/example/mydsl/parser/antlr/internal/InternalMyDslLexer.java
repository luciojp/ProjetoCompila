package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
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

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( ';' )
            // InternalMyDsl.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( ',' )
            // InternalMyDsl.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'class' )
            // InternalMyDsl.g:13:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'implements' )
            // InternalMyDsl.g:14:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( '[' )
            // InternalMyDsl.g:15:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( ']' )
            // InternalMyDsl.g:16:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( '[]' )
            // InternalMyDsl.g:17:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( '=' )
            // InternalMyDsl.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'boolean' )
            // InternalMyDsl.g:19:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( 'byte' )
            // InternalMyDsl.g:20:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( 'char' )
            // InternalMyDsl.g:21:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( 'short' )
            // InternalMyDsl.g:22:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( 'int' )
            // InternalMyDsl.g:23:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( 'float' )
            // InternalMyDsl.g:24:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( 'long' )
            // InternalMyDsl.g:25:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( 'double' )
            // InternalMyDsl.g:26:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( 'void' )
            // InternalMyDsl.g:27:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( 'synchronized(' )
            // InternalMyDsl.g:28:9: 'synchronized('
            {
            match("synchronized("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( 'return' )
            // InternalMyDsl.g:29:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( 'throw' )
            // InternalMyDsl.g:30:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( 'break' )
            // InternalMyDsl.g:31:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( 'continue' )
            // InternalMyDsl.g:32:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( 'for' )
            // InternalMyDsl.g:33:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( '.' )
            // InternalMyDsl.g:34:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( '+' )
            // InternalMyDsl.g:35:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( '-' )
            // InternalMyDsl.g:36:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( 'switch' )
            // InternalMyDsl.g:37:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( 'case' )
            // InternalMyDsl.g:38:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( 'default' )
            // InternalMyDsl.g:39:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:8: ( 'while(' )
            // InternalMyDsl.g:40:10: 'while('
            {
            match("while("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:41:8: ( 'do' )
            // InternalMyDsl.g:41:10: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:42:8: ( 'while' )
            // InternalMyDsl.g:42:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:43:8: ( 'if' )
            // InternalMyDsl.g:43:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:44:8: ( 'else' )
            // InternalMyDsl.g:44:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:45:8: ( 'try' )
            // InternalMyDsl.g:45:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:46:8: ( 'catch' )
            // InternalMyDsl.g:46:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:47:8: ( 'finally' )
            // InternalMyDsl.g:47:10: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:48:8: ( 'import' )
            // InternalMyDsl.g:48:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:49:8: ( '.*;' )
            // InternalMyDsl.g:49:10: '.*;'
            {
            match(".*;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:50:8: ( 'package' )
            // InternalMyDsl.g:50:10: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "RULE_INTERFACE"
    public final void mRULE_INTERFACE() throws RecognitionException {
        try {
            int _type = RULE_INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5644:16: ( 'interface' )
            // InternalMyDsl.g:5644:18: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTERFACE"

    // $ANTLR start "RULE_EXTENDS"
    public final void mRULE_EXTENDS() throws RecognitionException {
        try {
            int _type = RULE_EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5646:14: ( 'extends' )
            // InternalMyDsl.g:5646:16: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTENDS"

    // $ANTLR start "RULE_R_CURLY_BRACE"
    public final void mRULE_R_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = RULE_R_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5648:20: ( '{' )
            // InternalMyDsl.g:5648:22: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_R_CURLY_BRACE"

    // $ANTLR start "RULE_L_CURLY_BRACE"
    public final void mRULE_L_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = RULE_L_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5650:20: ( '}' )
            // InternalMyDsl.g:5650:22: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_L_CURLY_BRACE"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5652:11: ( '\\'' . '\\'' )
            // InternalMyDsl.g:5652:13: '\\'' . '\\''
            {
            match('\''); 
            matchAny(); 
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_STATIC"
    public final void mRULE_STATIC() throws RecognitionException {
        try {
            int _type = RULE_STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5654:13: ( 'static' )
            // InternalMyDsl.g:5654:15: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATIC"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5656:11: ( 'NULL' )
            // InternalMyDsl.g:5656:13: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_THIS"
    public final void mRULE_THIS() throws RecognitionException {
        try {
            int _type = RULE_THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5658:11: ( 'this' )
            // InternalMyDsl.g:5658:13: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THIS"

    // $ANTLR start "RULE_SUPER"
    public final void mRULE_SUPER() throws RecognitionException {
        try {
            int _type = RULE_SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5660:12: ( 'super' )
            // InternalMyDsl.g:5660:14: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUPER"

    // $ANTLR start "RULE_INSTANCEOF"
    public final void mRULE_INSTANCEOF() throws RecognitionException {
        try {
            int _type = RULE_INSTANCEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5662:17: ( 'instanceof' )
            // InternalMyDsl.g:5662:19: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INSTANCEOF"

    // $ANTLR start "RULE_OR_LOGIC"
    public final void mRULE_OR_LOGIC() throws RecognitionException {
        try {
            int _type = RULE_OR_LOGIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5664:15: ( '||' )
            // InternalMyDsl.g:5664:17: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_LOGIC"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5666:10: ( '&&' )
            // InternalMyDsl.g:5666:12: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_L_SHIFT"
    public final void mRULE_L_SHIFT() throws RecognitionException {
        try {
            int _type = RULE_L_SHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5668:14: ( '<<' )
            // InternalMyDsl.g:5668:16: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_L_SHIFT"

    // $ANTLR start "RULE_R_SHIFT"
    public final void mRULE_R_SHIFT() throws RecognitionException {
        try {
            int _type = RULE_R_SHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5670:14: ( '>>' )
            // InternalMyDsl.g:5670:16: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_R_SHIFT"

    // $ANTLR start "RULE_SUPER_SHIFT"
    public final void mRULE_SUPER_SHIFT() throws RecognitionException {
        try {
            int _type = RULE_SUPER_SHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5672:18: ( '>>>' )
            // InternalMyDsl.g:5672:20: '>>>'
            {
            match(">>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUPER_SHIFT"

    // $ANTLR start "RULE_R_SHIFT_EQUAL"
    public final void mRULE_R_SHIFT_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_R_SHIFT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5674:20: ( '>>=' )
            // InternalMyDsl.g:5674:22: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_R_SHIFT_EQUAL"

    // $ANTLR start "RULE_DOUBLE_OR_EQUAL"
    public final void mRULE_DOUBLE_OR_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5676:22: ( '||=' )
            // InternalMyDsl.g:5676:24: '||='
            {
            match("||="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_OR_EQUAL"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5678:9: ( '|' )
            // InternalMyDsl.g:5678:11: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_OR_EQUAL"
    public final void mRULE_OR_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5680:15: ( '|=' )
            // InternalMyDsl.g:5680:17: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_EQUAL"

    // $ANTLR start "RULE_EXP"
    public final void mRULE_EXP() throws RecognitionException {
        try {
            int _type = RULE_EXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5682:10: ( '^' )
            // InternalMyDsl.g:5682:12: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXP"

    // $ANTLR start "RULE_EXP_EQUAL"
    public final void mRULE_EXP_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EXP_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5684:16: ( '^=' )
            // InternalMyDsl.g:5684:18: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXP_EQUAL"

    // $ANTLR start "RULE_DOUBLE_EQUAL"
    public final void mRULE_DOUBLE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5686:19: ( '==' )
            // InternalMyDsl.g:5686:21: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_EQUAL"

    // $ANTLR start "RULE_DIFFERENT"
    public final void mRULE_DIFFERENT() throws RecognitionException {
        try {
            int _type = RULE_DIFFERENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5688:16: ( '!=' )
            // InternalMyDsl.g:5688:18: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIFFERENT"

    // $ANTLR start "RULE_BT"
    public final void mRULE_BT() throws RecognitionException {
        try {
            int _type = RULE_BT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5690:9: ( '>' )
            // InternalMyDsl.g:5690:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BT"

    // $ANTLR start "RULE_ST"
    public final void mRULE_ST() throws RecognitionException {
        try {
            int _type = RULE_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5692:9: ( '<' )
            // InternalMyDsl.g:5692:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ST"

    // $ANTLR start "RULE_BE"
    public final void mRULE_BE() throws RecognitionException {
        try {
            int _type = RULE_BE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5694:9: ( '>=' )
            // InternalMyDsl.g:5694:11: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BE"

    // $ANTLR start "RULE_SE"
    public final void mRULE_SE() throws RecognitionException {
        try {
            int _type = RULE_SE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5696:9: ( '<=' )
            // InternalMyDsl.g:5696:11: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SE"

    // $ANTLR start "RULE_DIVIDE"
    public final void mRULE_DIVIDE() throws RecognitionException {
        try {
            int _type = RULE_DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5698:13: ( '/' )
            // InternalMyDsl.g:5698:15: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIVIDE"

    // $ANTLR start "RULE_DIVIDE_EQUAL"
    public final void mRULE_DIVIDE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_DIVIDE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5700:19: ( '/=' )
            // InternalMyDsl.g:5700:21: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIVIDE_EQUAL"

    // $ANTLR start "RULE_MODULE"
    public final void mRULE_MODULE() throws RecognitionException {
        try {
            int _type = RULE_MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5702:13: ( '%' )
            // InternalMyDsl.g:5702:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MODULE"

    // $ANTLR start "RULE_MODULE_EQUAL"
    public final void mRULE_MODULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_MODULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5704:19: ( '%=' )
            // InternalMyDsl.g:5704:21: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MODULE_EQUAL"

    // $ANTLR start "RULE_PLUS_EQUAL"
    public final void mRULE_PLUS_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_PLUS_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5706:17: ( '+=' )
            // InternalMyDsl.g:5706:19: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS_EQUAL"

    // $ANTLR start "RULE_MINUS_EQUAL"
    public final void mRULE_MINUS_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_MINUS_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5708:18: ( '-=' )
            // InternalMyDsl.g:5708:20: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS_EQUAL"

    // $ANTLR start "RULE_MULTIPLY"
    public final void mRULE_MULTIPLY() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5710:15: ( '*' )
            // InternalMyDsl.g:5710:17: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLY"

    // $ANTLR start "RULE_MULTIPLY_EQUAL"
    public final void mRULE_MULTIPLY_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLY_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5712:21: ( '*=' )
            // InternalMyDsl.g:5712:23: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLY_EQUAL"

    // $ANTLR start "RULE_WAT"
    public final void mRULE_WAT() throws RecognitionException {
        try {
            int _type = RULE_WAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5714:10: ( '?' )
            // InternalMyDsl.g:5714:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WAT"

    // $ANTLR start "RULE_AMPERSAND"
    public final void mRULE_AMPERSAND() throws RecognitionException {
        try {
            int _type = RULE_AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5716:16: ( 'ampersand' )
            // InternalMyDsl.g:5716:18: 'ampersand'
            {
            match("ampersand"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AMPERSAND"

    // $ANTLR start "RULE_EXPONENTIAL"
    public final void mRULE_EXPONENTIAL() throws RecognitionException {
        try {
            int _type = RULE_EXPONENTIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5718:18: ( ( 'e' | 'e+' | 'e-' ) )
            // InternalMyDsl.g:5718:20: ( 'e' | 'e+' | 'e-' )
            {
            // InternalMyDsl.g:5718:20: ( 'e' | 'e+' | 'e-' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='e') ) {
                switch ( input.LA(2) ) {
                case '+':
                    {
                    alt1=2;
                    }
                    break;
                case '-':
                    {
                    alt1=3;
                    }
                    break;
                default:
                    alt1=1;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:5718:21: 'e'
                    {
                    match('e'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5718:25: 'e+'
                    {
                    match("e+"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:5718:30: 'e-'
                    {
                    match("e-"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENTIAL"

    // $ANTLR start "RULE_LONG"
    public final void mRULE_LONG() throws RecognitionException {
        try {
            int _type = RULE_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5720:11: ( 'l' )
            // InternalMyDsl.g:5720:13: 'l'
            {
            match('l'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONG"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5722:13: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // InternalMyDsl.g:5722:15: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // InternalMyDsl.g:5722:19: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\"') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:5722:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5724:12: ( ':' )
            // InternalMyDsl.g:5724:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_NEW"
    public final void mRULE_NEW() throws RecognitionException {
        try {
            int _type = RULE_NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5726:10: ( 'new' )
            // InternalMyDsl.g:5726:12: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEW"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5728:10: ( '~' )
            // InternalMyDsl.g:5728:12: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_EXCLAMATION"
    public final void mRULE_EXCLAMATION() throws RecognitionException {
        try {
            int _type = RULE_EXCLAMATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5730:18: ( '!' )
            // InternalMyDsl.g:5730:20: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXCLAMATION"

    // $ANTLR start "RULE_FALSE"
    public final void mRULE_FALSE() throws RecognitionException {
        try {
            int _type = RULE_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5732:12: ( 'false' )
            // InternalMyDsl.g:5732:14: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FALSE"

    // $ANTLR start "RULE_TRUE"
    public final void mRULE_TRUE() throws RecognitionException {
        try {
            int _type = RULE_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5734:11: ( 'true' )
            // InternalMyDsl.g:5734:13: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRUE"

    // $ANTLR start "RULE_DECREMENT"
    public final void mRULE_DECREMENT() throws RecognitionException {
        try {
            int _type = RULE_DECREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5736:16: ( '--' )
            // InternalMyDsl.g:5736:18: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECREMENT"

    // $ANTLR start "RULE_INCREMENT"
    public final void mRULE_INCREMENT() throws RecognitionException {
        try {
            int _type = RULE_INCREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5738:16: ( '++' )
            // InternalMyDsl.g:5738:18: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INCREMENT"

    // $ANTLR start "RULE_HEXA"
    public final void mRULE_HEXA() throws RecognitionException {
        try {
            int _type = RULE_HEXA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5740:11: ( '0' 'x' ( '0' .. '9' 'a' .. 'f' )* )
            // InternalMyDsl.g:5740:13: '0' 'x' ( '0' .. '9' 'a' .. 'f' )*
            {
            match('0'); 
            match('x'); 
            // InternalMyDsl.g:5740:21: ( '0' .. '9' 'a' .. 'f' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:5740:22: '0' .. '9' 'a' .. 'f'
            	    {
            	    matchRange('0','9'); 
            	    matchRange('a','f'); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXA"

    // $ANTLR start "RULE_DECIMAL_DIGITS"
    public final void mRULE_DECIMAL_DIGITS() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_DIGITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5742:21: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:5742:23: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:5742:23: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:5742:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_DIGITS"

    // $ANTLR start "RULE_OCTAL_LITERAL"
    public final void mRULE_OCTAL_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_OCTAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5744:20: ( '0' ( '0' .. '7' )+ ( RULE_INTEGER_TYPE_SUFFIX )? )
            // InternalMyDsl.g:5744:22: '0' ( '0' .. '7' )+ ( RULE_INTEGER_TYPE_SUFFIX )?
            {
            match('0'); 
            // InternalMyDsl.g:5744:26: ( '0' .. '7' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='7')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:5744:27: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalMyDsl.g:5744:38: ( RULE_INTEGER_TYPE_SUFFIX )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='L'||LA6_0=='l') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:5744:38: RULE_INTEGER_TYPE_SUFFIX
                    {
                    mRULE_INTEGER_TYPE_SUFFIX(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_LITERAL"

    // $ANTLR start "RULE_FLOAT_TYPE_SUFIX"
    public final void mRULE_FLOAT_TYPE_SUFIX() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_TYPE_SUFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5746:23: ( ( 'f' | 'd' ) )
            // InternalMyDsl.g:5746:25: ( 'f' | 'd' )
            {
            if ( input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_TYPE_SUFIX"

    // $ANTLR start "RULE_INTEGER_TYPE_SUFFIX"
    public final void mRULE_INTEGER_TYPE_SUFFIX() throws RecognitionException {
        try {
            // InternalMyDsl.g:5748:35: ( ( 'l' | 'L' ) )
            // InternalMyDsl.g:5748:37: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_TYPE_SUFFIX"

    // $ANTLR start "RULE_FLOATING_POINT_LITERAL"
    public final void mRULE_FLOATING_POINT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_FLOATING_POINT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5750:29: ( ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_FLOAT_TYPE_SUFFIX ) )
            // InternalMyDsl.g:5750:31: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_FLOAT_TYPE_SUFFIX )
            {
            // InternalMyDsl.g:5750:31: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_FLOAT_TYPE_SUFFIX )
            int alt17=4;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:5750:32: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    // InternalMyDsl.g:5750:32: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:5750:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    match('.'); 
                    // InternalMyDsl.g:5750:48: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:5750:49: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // InternalMyDsl.g:5750:60: ( RULE_EXPONENT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:5750:60: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:5750:75: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='D'||LA10_0=='F'||LA10_0=='d'||LA10_0=='f') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyDsl.g:5750:75: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5750:99: '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    match('.'); 
                    // InternalMyDsl.g:5750:103: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:5750:104: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    // InternalMyDsl.g:5750:115: ( RULE_EXPONENT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyDsl.g:5750:115: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:5750:130: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='D'||LA13_0=='F'||LA13_0=='d'||LA13_0=='f') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:5750:130: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:5750:154: ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    // InternalMyDsl.g:5750:154: ( '0' .. '9' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:5750:155: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    mRULE_EXPONENT(); 
                    // InternalMyDsl.g:5750:180: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='D'||LA15_0=='F'||LA15_0=='d'||LA15_0=='f') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMyDsl.g:5750:180: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:5750:204: ( '0' .. '9' )+ RULE_FLOAT_TYPE_SUFFIX
                    {
                    // InternalMyDsl.g:5750:204: ( '0' .. '9' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMyDsl.g:5750:205: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    mRULE_FLOAT_TYPE_SUFFIX(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOATING_POINT_LITERAL"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalMyDsl.g:5752:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // InternalMyDsl.g:5752:26: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:5752:36: ( '+' | '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='+'||LA18_0=='-') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalMyDsl.g:5752:47: ( '0' .. '9' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:5752:48: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_FLOAT_TYPE_SUFFIX"
    public final void mRULE_FLOAT_TYPE_SUFFIX() throws RecognitionException {
        try {
            // InternalMyDsl.g:5754:33: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // InternalMyDsl.g:5754:35: ( 'f' | 'F' | 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_TYPE_SUFFIX"

    // $ANTLR start "RULE_CHARACTER_LITERAL"
    public final void mRULE_CHARACTER_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_CHARACTER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5756:24: ( '\\'' ( RULE_ESCAPE_SEQUENCE | ~ ( ( '\\'' | '\\\\' ) ) ) '\\'' )
            // InternalMyDsl.g:5756:26: '\\'' ( RULE_ESCAPE_SEQUENCE | ~ ( ( '\\'' | '\\\\' ) ) ) '\\''
            {
            match('\''); 
            // InternalMyDsl.g:5756:31: ( RULE_ESCAPE_SEQUENCE | ~ ( ( '\\'' | '\\\\' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\\') ) {
                alt20=1;
            }
            else if ( ((LA20_0>='\u0000' && LA20_0<='&')||(LA20_0>='(' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:5756:32: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5756:53: ~ ( ( '\\'' | '\\\\' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHARACTER_LITERAL"

    // $ANTLR start "RULE_ESCAPE_SEQUENCE"
    public final void mRULE_ESCAPE_SEQUENCE() throws RecognitionException {
        try {
            // InternalMyDsl.g:5758:31: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_OCTAL_ESCAPE ) )
            // InternalMyDsl.g:5758:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_OCTAL_ESCAPE )
            {
            // InternalMyDsl.g:5758:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_OCTAL_ESCAPE )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\\') ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1=='\"'||LA21_1=='\''||LA21_1=='\\'||LA21_1=='b'||LA21_1=='f'||LA21_1=='n'||LA21_1=='r'||LA21_1=='t') ) {
                    alt21=1;
                }
                else if ( ((LA21_1>='0' && LA21_1<='7')) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:5758:34: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5758:75: RULE_OCTAL_ESCAPE
                    {
                    mRULE_OCTAL_ESCAPE(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPE_SEQUENCE"

    // $ANTLR start "RULE_OCTAL_ESCAPE"
    public final void mRULE_OCTAL_ESCAPE() throws RecognitionException {
        try {
            // InternalMyDsl.g:5760:28: ( ( '\\\\' '0' .. '3' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' ) )
            // InternalMyDsl.g:5760:30: ( '\\\\' '0' .. '3' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' )
            {
            // InternalMyDsl.g:5760:30: ( '\\\\' '0' .. '3' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\\') ) {
                int LA22_1 = input.LA(2);

                if ( ((LA22_1>='0' && LA22_1<='3')) ) {
                    int LA22_2 = input.LA(3);

                    if ( ((LA22_2>='0' && LA22_2<='7')) ) {
                        int LA22_4 = input.LA(4);

                        if ( ((LA22_4>='0' && LA22_4<='7')) ) {
                            alt22=1;
                        }
                        else {
                            alt22=2;}
                    }
                    else {
                        alt22=3;}
                }
                else if ( ((LA22_1>='4' && LA22_1<='7')) ) {
                    int LA22_3 = input.LA(3);

                    if ( ((LA22_3>='0' && LA22_3<='7')) ) {
                        alt22=2;
                    }
                    else {
                        alt22=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:5760:31: '\\\\' '0' .. '3' '0' .. '7' '0' .. '7'
                    {
                    match('\\'); 
                    matchRange('0','3'); 
                    matchRange('0','7'); 
                    matchRange('0','7'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5760:63: '\\\\' '0' .. '7' '0' .. '7'
                    {
                    match('\\'); 
                    matchRange('0','7'); 
                    matchRange('0','7'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:5760:86: '\\\\' '0' .. '7'
                    {
                    match('\\'); 
                    matchRange('0','7'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_ESCAPE"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5762:13: ( ')' )
            // InternalMyDsl.g:5762:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5764:13: ( '(' )
            // InternalMyDsl.g:5764:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_MOD"
    public final void mRULE_MOD() throws RecognitionException {
        try {
            int _type = RULE_MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5766:10: ( ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' ) )
            // InternalMyDsl.g:5766:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )
            {
            // InternalMyDsl.g:5766:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )
            int alt23=9;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:5766:13: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5766:22: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:5766:32: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:5766:44: 'final'
                    {
                    match("final"); 


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:5766:52: 'native'
                    {
                    match("native"); 


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:5766:61: 'synchronized'
                    {
                    match("synchronized"); 


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:5766:76: 'abstract'
                    {
                    match("abstract"); 


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:5766:87: 'threadsafe'
                    {
                    match("threadsafe"); 


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:5766:100: 'transient'
                    {
                    match("transient"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MOD"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5768:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )* )
            // InternalMyDsl.g:5768:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:5768:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='$'||(LA24_0>='0' && LA24_0<='9')||(LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||(LA24_0>='a' && LA24_0<='z')||(LA24_0>='\u00C0' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5770:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:5770:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:5770:24: ( options {greedy=false; } : . )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='*') ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1=='/') ) {
                        alt25=2;
                    }
                    else if ( ((LA25_1>='\u0000' && LA25_1<='.')||(LA25_1>='0' && LA25_1<='\uFFFF')) ) {
                        alt25=1;
                    }


                }
                else if ( ((LA25_0>='\u0000' && LA25_0<=')')||(LA25_0>='+' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:5770:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5772:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:5772:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:5772:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\u0000' && LA26_0<='\t')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:5772:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalMyDsl.g:5772:40: ( ( '\\r' )? '\\n' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\n'||LA28_0=='\r') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:5772:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:5772:41: ( '\\r' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='\r') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalMyDsl.g:5772:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5774:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // InternalMyDsl.g:5774:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_DOC_COMMENT"
    public final void mRULE_DOC_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_DOC_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:5776:18: ( '/**' )
            // InternalMyDsl.g:5776:20: '/**'
            {
            match("/**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOC_COMMENT"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | RULE_INTERFACE | RULE_EXTENDS | RULE_R_CURLY_BRACE | RULE_L_CURLY_BRACE | RULE_CHAR | RULE_STATIC | RULE_NULL | RULE_THIS | RULE_SUPER | RULE_INSTANCEOF | RULE_OR_LOGIC | RULE_AND | RULE_L_SHIFT | RULE_R_SHIFT | RULE_SUPER_SHIFT | RULE_R_SHIFT_EQUAL | RULE_DOUBLE_OR_EQUAL | RULE_OR | RULE_OR_EQUAL | RULE_EXP | RULE_EXP_EQUAL | RULE_DOUBLE_EQUAL | RULE_DIFFERENT | RULE_BT | RULE_ST | RULE_BE | RULE_SE | RULE_DIVIDE | RULE_DIVIDE_EQUAL | RULE_MODULE | RULE_MODULE_EQUAL | RULE_PLUS_EQUAL | RULE_MINUS_EQUAL | RULE_MULTIPLY | RULE_MULTIPLY_EQUAL | RULE_WAT | RULE_AMPERSAND | RULE_EXPONENTIAL | RULE_LONG | RULE_STRING | RULE_COLON | RULE_NEW | RULE_NOT | RULE_EXCLAMATION | RULE_FALSE | RULE_TRUE | RULE_DECREMENT | RULE_INCREMENT | RULE_HEXA | RULE_DECIMAL_DIGITS | RULE_OCTAL_LITERAL | RULE_FLOAT_TYPE_SUFIX | RULE_FLOATING_POINT_LITERAL | RULE_CHARACTER_LITERAL | RULE_RPAREN | RULE_LPAREN | RULE_MOD | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_DOC_COMMENT )
        int alt29=102;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // InternalMyDsl.g:1:10: T__71
                {
                mT__71(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__72
                {
                mT__72(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__73
                {
                mT__73(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__74
                {
                mT__74(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__75
                {
                mT__75(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__76
                {
                mT__76(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__77
                {
                mT__77(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__78
                {
                mT__78(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__79
                {
                mT__79(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__80
                {
                mT__80(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__81
                {
                mT__81(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__82
                {
                mT__82(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__83
                {
                mT__83(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__84
                {
                mT__84(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__85
                {
                mT__85(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__86
                {
                mT__86(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__87
                {
                mT__87(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__88
                {
                mT__88(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__89
                {
                mT__89(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__90
                {
                mT__90(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__91
                {
                mT__91(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__92
                {
                mT__92(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__93
                {
                mT__93(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__94
                {
                mT__94(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__95
                {
                mT__95(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__96
                {
                mT__96(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__97
                {
                mT__97(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__98
                {
                mT__98(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__99
                {
                mT__99(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__100
                {
                mT__100(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:191: T__101
                {
                mT__101(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:198: T__102
                {
                mT__102(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:205: T__103
                {
                mT__103(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:212: T__104
                {
                mT__104(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:219: T__105
                {
                mT__105(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:226: T__106
                {
                mT__106(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:233: T__107
                {
                mT__107(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:240: T__108
                {
                mT__108(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:247: T__109
                {
                mT__109(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:254: T__110
                {
                mT__110(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:261: RULE_INTERFACE
                {
                mRULE_INTERFACE(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:276: RULE_EXTENDS
                {
                mRULE_EXTENDS(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:289: RULE_R_CURLY_BRACE
                {
                mRULE_R_CURLY_BRACE(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:308: RULE_L_CURLY_BRACE
                {
                mRULE_L_CURLY_BRACE(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:327: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:337: RULE_STATIC
                {
                mRULE_STATIC(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:349: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:359: RULE_THIS
                {
                mRULE_THIS(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:369: RULE_SUPER
                {
                mRULE_SUPER(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:380: RULE_INSTANCEOF
                {
                mRULE_INSTANCEOF(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:396: RULE_OR_LOGIC
                {
                mRULE_OR_LOGIC(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:410: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:419: RULE_L_SHIFT
                {
                mRULE_L_SHIFT(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:432: RULE_R_SHIFT
                {
                mRULE_R_SHIFT(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:445: RULE_SUPER_SHIFT
                {
                mRULE_SUPER_SHIFT(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:462: RULE_R_SHIFT_EQUAL
                {
                mRULE_R_SHIFT_EQUAL(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:481: RULE_DOUBLE_OR_EQUAL
                {
                mRULE_DOUBLE_OR_EQUAL(); 

                }
                break;
            case 58 :
                // InternalMyDsl.g:1:502: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 59 :
                // InternalMyDsl.g:1:510: RULE_OR_EQUAL
                {
                mRULE_OR_EQUAL(); 

                }
                break;
            case 60 :
                // InternalMyDsl.g:1:524: RULE_EXP
                {
                mRULE_EXP(); 

                }
                break;
            case 61 :
                // InternalMyDsl.g:1:533: RULE_EXP_EQUAL
                {
                mRULE_EXP_EQUAL(); 

                }
                break;
            case 62 :
                // InternalMyDsl.g:1:548: RULE_DOUBLE_EQUAL
                {
                mRULE_DOUBLE_EQUAL(); 

                }
                break;
            case 63 :
                // InternalMyDsl.g:1:566: RULE_DIFFERENT
                {
                mRULE_DIFFERENT(); 

                }
                break;
            case 64 :
                // InternalMyDsl.g:1:581: RULE_BT
                {
                mRULE_BT(); 

                }
                break;
            case 65 :
                // InternalMyDsl.g:1:589: RULE_ST
                {
                mRULE_ST(); 

                }
                break;
            case 66 :
                // InternalMyDsl.g:1:597: RULE_BE
                {
                mRULE_BE(); 

                }
                break;
            case 67 :
                // InternalMyDsl.g:1:605: RULE_SE
                {
                mRULE_SE(); 

                }
                break;
            case 68 :
                // InternalMyDsl.g:1:613: RULE_DIVIDE
                {
                mRULE_DIVIDE(); 

                }
                break;
            case 69 :
                // InternalMyDsl.g:1:625: RULE_DIVIDE_EQUAL
                {
                mRULE_DIVIDE_EQUAL(); 

                }
                break;
            case 70 :
                // InternalMyDsl.g:1:643: RULE_MODULE
                {
                mRULE_MODULE(); 

                }
                break;
            case 71 :
                // InternalMyDsl.g:1:655: RULE_MODULE_EQUAL
                {
                mRULE_MODULE_EQUAL(); 

                }
                break;
            case 72 :
                // InternalMyDsl.g:1:673: RULE_PLUS_EQUAL
                {
                mRULE_PLUS_EQUAL(); 

                }
                break;
            case 73 :
                // InternalMyDsl.g:1:689: RULE_MINUS_EQUAL
                {
                mRULE_MINUS_EQUAL(); 

                }
                break;
            case 74 :
                // InternalMyDsl.g:1:706: RULE_MULTIPLY
                {
                mRULE_MULTIPLY(); 

                }
                break;
            case 75 :
                // InternalMyDsl.g:1:720: RULE_MULTIPLY_EQUAL
                {
                mRULE_MULTIPLY_EQUAL(); 

                }
                break;
            case 76 :
                // InternalMyDsl.g:1:740: RULE_WAT
                {
                mRULE_WAT(); 

                }
                break;
            case 77 :
                // InternalMyDsl.g:1:749: RULE_AMPERSAND
                {
                mRULE_AMPERSAND(); 

                }
                break;
            case 78 :
                // InternalMyDsl.g:1:764: RULE_EXPONENTIAL
                {
                mRULE_EXPONENTIAL(); 

                }
                break;
            case 79 :
                // InternalMyDsl.g:1:781: RULE_LONG
                {
                mRULE_LONG(); 

                }
                break;
            case 80 :
                // InternalMyDsl.g:1:791: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 81 :
                // InternalMyDsl.g:1:803: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 82 :
                // InternalMyDsl.g:1:814: RULE_NEW
                {
                mRULE_NEW(); 

                }
                break;
            case 83 :
                // InternalMyDsl.g:1:823: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 84 :
                // InternalMyDsl.g:1:832: RULE_EXCLAMATION
                {
                mRULE_EXCLAMATION(); 

                }
                break;
            case 85 :
                // InternalMyDsl.g:1:849: RULE_FALSE
                {
                mRULE_FALSE(); 

                }
                break;
            case 86 :
                // InternalMyDsl.g:1:860: RULE_TRUE
                {
                mRULE_TRUE(); 

                }
                break;
            case 87 :
                // InternalMyDsl.g:1:870: RULE_DECREMENT
                {
                mRULE_DECREMENT(); 

                }
                break;
            case 88 :
                // InternalMyDsl.g:1:885: RULE_INCREMENT
                {
                mRULE_INCREMENT(); 

                }
                break;
            case 89 :
                // InternalMyDsl.g:1:900: RULE_HEXA
                {
                mRULE_HEXA(); 

                }
                break;
            case 90 :
                // InternalMyDsl.g:1:910: RULE_DECIMAL_DIGITS
                {
                mRULE_DECIMAL_DIGITS(); 

                }
                break;
            case 91 :
                // InternalMyDsl.g:1:930: RULE_OCTAL_LITERAL
                {
                mRULE_OCTAL_LITERAL(); 

                }
                break;
            case 92 :
                // InternalMyDsl.g:1:949: RULE_FLOAT_TYPE_SUFIX
                {
                mRULE_FLOAT_TYPE_SUFIX(); 

                }
                break;
            case 93 :
                // InternalMyDsl.g:1:971: RULE_FLOATING_POINT_LITERAL
                {
                mRULE_FLOATING_POINT_LITERAL(); 

                }
                break;
            case 94 :
                // InternalMyDsl.g:1:999: RULE_CHARACTER_LITERAL
                {
                mRULE_CHARACTER_LITERAL(); 

                }
                break;
            case 95 :
                // InternalMyDsl.g:1:1022: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 96 :
                // InternalMyDsl.g:1:1034: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 97 :
                // InternalMyDsl.g:1:1046: RULE_MOD
                {
                mRULE_MOD(); 

                }
                break;
            case 98 :
                // InternalMyDsl.g:1:1055: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 99 :
                // InternalMyDsl.g:1:1063: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 100 :
                // InternalMyDsl.g:1:1079: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 101 :
                // InternalMyDsl.g:1:1095: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 102 :
                // InternalMyDsl.g:1:1103: RULE_DOC_COMMENT
                {
                mRULE_DOC_COMMENT(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA17_eotS =
        "\6\uffff";
    static final String DFA17_eofS =
        "\6\uffff";
    static final String DFA17_minS =
        "\2\56\4\uffff";
    static final String DFA17_maxS =
        "\1\71\1\146\4\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\1\1\4\1\3";
    static final String DFA17_specialS =
        "\6\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\12\uffff\1\4\1\5\1\4\35\uffff\1\4\1\5\1\4",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "5750:31: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_FLOAT_TYPE_SUFFIX )";
        }
    }
    static final String DFA23_eotS =
        "\15\uffff";
    static final String DFA23_eofS =
        "\15\uffff";
    static final String DFA23_minS =
        "\1\141\1\162\4\uffff\1\150\1\uffff\1\151\4\uffff";
    static final String DFA23_maxS =
        "\1\164\1\165\4\uffff\1\162\1\uffff\1\157\4\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\4\1\5\1\6\1\7\1\uffff\1\1\1\uffff\1\10\1\11\1\2\1\3";
    static final String DFA23_specialS =
        "\15\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\5\4\uffff\1\2\7\uffff\1\3\1\uffff\1\1\2\uffff\1\4\1\6",
            "\1\10\2\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\11\11\uffff\1\12",
            "",
            "\1\13\5\uffff\1\14",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "5766:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )";
        }
    }
    static final String DFA29_eotS =
        "\3\uffff\2\55\1\67\1\uffff\1\71\2\55\1\106\1\110\1\106\3\55\1\121\1\124\1\127\1\55\1\133\1\55\3\uffff\1\55\1\145\1\uffff\1\150\1\153\1\155\1\157\1\163\1\165\1\167\1\uffff\1\55\2\uffff\1\55\1\uffff\2\176\4\uffff\6\55\1\u0087\4\uffff\14\55\1\uffff\1\55\1\uffff\1\u0096\5\55\11\uffff\3\55\1\uffff\3\55\3\uffff\1\55\1\u00ab\5\uffff\1\u00ae\16\uffff\4\55\1\uffff\1\176\1\uffff\6\55\1\u00be\1\55\1\uffff\11\55\1\u00c9\4\55\1\uffff\5\55\1\u00d4\11\55\1\141\2\uffff\1\55\5\uffff\1\u00df\1\uffff\2\55\1\u00e2\1\55\1\uffff\1\55\1\u00e5\1\55\1\u00e7\4\55\1\uffff\2\55\1\u00ee\7\55\1\uffff\2\55\1\u00f8\2\55\1\u00fb\3\55\1\u00ff\1\uffff\1\u0100\2\55\1\u0103\5\55\1\u0109\1\uffff\2\55\1\uffff\1\55\1\u010d\1\uffff\1\55\1\uffff\1\u010f\5\55\1\uffff\1\u0115\1\u0116\3\55\1\u011a\1\u011b\1\u011d\1\u011e\1\uffff\2\55\1\uffff\1\55\1\u0122\1\55\2\uffff\1\55\1\u0126\1\uffff\5\55\1\uffff\3\55\1\uffff\1\55\1\uffff\1\55\1\u0131\3\55\2\uffff\1\55\1\u0136\1\u0137\2\uffff\1\55\2\uffff\1\u0139\1\55\1\u013b\1\uffff\2\55\2\uffff\2\55\1\u011d\4\55\1\u011d\2\55\1\uffff\2\55\1\u0148\1\55\2\uffff\1\u014a\1\uffff\1\u014b\1\uffff\2\55\1\u014e\1\u014f\1\u011d\3\55\1\u0153\3\55\1\uffff\1\55\2\uffff\2\55\2\uffff\2\55\1\u011d\1\uffff\1\55\1\u015d\3\55\2\u011d\1\u0161\1\u0162\1\uffff\1\u0163\1\55\1\u011d\3\uffff\1\55\1\u011d\1\uffff";
    static final String DFA29_eofS =
        "\u0167\uffff";
    static final String DFA29_minS =
        "\1\11\2\uffff\1\141\1\146\1\135\1\uffff\1\75\1\157\1\150\3\44\1\157\1\145\1\150\1\52\1\53\1\55\1\150\1\44\1\141\2\uffff\1\0\1\125\1\75\1\uffff\1\74\3\75\1\52\2\75\1\uffff\1\142\2\uffff\1\141\1\uffff\2\56\4\uffff\2\141\1\156\1\163\1\160\1\163\1\44\4\uffff\1\157\1\164\1\145\1\157\1\156\1\151\1\141\1\160\1\157\1\162\1\156\1\154\1\uffff\1\156\1\uffff\1\44\1\146\1\151\1\164\1\151\1\141\11\uffff\1\151\1\163\1\164\1\uffff\1\143\1\142\1\151\1\42\1\47\1\uffff\1\114\1\75\5\uffff\1\75\7\uffff\1\0\6\uffff\1\160\1\163\1\167\1\164\1\uffff\1\56\1\uffff\1\163\1\162\1\164\1\145\1\143\1\154\1\44\1\164\1\uffff\1\154\1\145\1\141\1\162\1\143\2\164\1\145\1\141\1\44\1\141\1\163\1\147\1\142\1\uffff\1\141\1\144\1\165\1\145\1\163\1\44\1\145\1\156\1\154\2\145\1\153\1\154\1\166\1\164\1\47\2\uffff\1\114\5\uffff\1\0\1\uffff\1\145\1\164\1\44\1\151\1\uffff\1\163\1\44\1\151\1\44\1\150\1\145\2\162\1\uffff\1\141\1\145\1\44\1\153\1\164\1\150\1\143\1\151\1\162\1\164\1\uffff\1\154\1\145\1\44\1\154\1\165\1\44\1\162\1\167\1\141\1\44\1\uffff\1\44\1\163\1\145\1\44\1\156\1\141\1\151\1\141\1\145\1\44\1\uffff\2\162\1\uffff\1\166\1\44\1\uffff\1\156\1\uffff\1\44\1\155\1\164\1\146\1\156\1\141\1\uffff\2\44\1\162\1\150\1\143\4\44\1\uffff\1\145\1\154\1\uffff\1\156\1\44\1\144\2\uffff\1\151\1\44\1\uffff\1\144\1\147\1\143\1\164\1\143\1\uffff\1\163\1\141\1\145\1\uffff\1\165\1\uffff\1\145\1\44\1\141\1\143\1\156\2\uffff\1\157\2\44\2\uffff\1\171\2\uffff\1\44\1\164\1\44\1\uffff\1\163\1\145\2\uffff\1\163\1\145\1\44\1\145\1\164\1\141\1\143\1\44\1\145\1\156\1\uffff\1\143\1\145\1\44\1\156\2\uffff\1\44\1\uffff\1\44\1\uffff\1\141\1\156\3\44\1\145\1\156\1\164\1\44\1\164\1\145\1\157\1\uffff\1\151\2\uffff\1\146\1\164\2\uffff\2\144\1\44\1\uffff\1\163\1\44\1\146\1\172\1\145\4\44\1\uffff\1\44\1\145\1\44\3\uffff\1\144\1\44\1\uffff";
    static final String DFA29_maxS =
        "\1\176\2\uffff\1\157\1\156\1\135\1\uffff\1\75\2\171\3\uffff\1\157\1\145\1\162\1\71\2\75\1\150\1\uffff\1\165\2\uffff\1\uffff\1\125\1\174\1\uffff\1\75\1\76\5\75\1\uffff\1\155\2\uffff\1\145\1\uffff\1\170\1\146\4\uffff\2\141\1\156\1\164\1\160\1\164\1\uffff\4\uffff\1\157\1\164\1\145\1\157\1\156\1\151\1\141\1\160\1\157\1\162\1\156\1\154\1\uffff\1\156\1\uffff\1\uffff\1\146\1\151\1\164\1\162\1\171\11\uffff\1\151\1\163\1\164\1\uffff\1\143\1\142\1\157\1\164\1\47\1\uffff\1\114\1\75\5\uffff\1\76\7\uffff\1\uffff\6\uffff\1\160\1\163\1\167\1\164\1\uffff\1\154\1\uffff\1\163\1\162\1\164\1\145\1\143\1\157\1\uffff\1\164\1\uffff\1\154\1\145\1\141\1\162\1\143\2\164\1\145\1\141\1\uffff\1\141\1\163\1\147\1\142\1\uffff\1\141\1\144\1\165\1\157\1\163\1\uffff\1\145\1\156\1\154\2\145\1\153\1\154\1\166\1\164\1\47\2\uffff\1\114\5\uffff\1\uffff\1\uffff\1\145\1\164\1\uffff\1\151\1\uffff\1\163\1\uffff\1\151\1\uffff\1\150\1\145\2\162\1\uffff\1\141\1\145\1\uffff\1\153\1\164\1\150\1\143\1\151\1\162\1\164\1\uffff\1\154\1\145\1\uffff\1\154\1\165\1\uffff\1\162\1\167\1\141\1\uffff\1\uffff\1\uffff\1\163\1\145\1\uffff\1\156\1\141\1\151\1\141\1\145\1\uffff\1\uffff\2\162\1\uffff\1\166\1\uffff\1\uffff\1\156\1\uffff\1\uffff\1\155\1\164\1\146\1\156\1\141\1\uffff\2\uffff\1\162\1\150\1\143\4\uffff\1\uffff\1\145\1\154\1\uffff\1\156\1\uffff\1\144\2\uffff\1\151\1\uffff\1\uffff\1\144\1\147\1\143\1\164\1\143\1\uffff\1\163\1\141\1\145\1\uffff\1\165\1\uffff\1\145\1\uffff\1\141\1\143\1\156\2\uffff\1\157\2\uffff\2\uffff\1\171\2\uffff\1\uffff\1\164\1\uffff\1\uffff\1\163\1\145\2\uffff\1\163\1\145\1\uffff\1\145\1\164\1\141\1\143\1\uffff\1\145\1\156\1\uffff\1\143\1\145\1\uffff\1\156\2\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\141\1\156\3\uffff\1\145\1\156\1\164\1\uffff\1\164\1\145\1\157\1\uffff\1\151\2\uffff\1\146\1\164\2\uffff\2\144\1\uffff\1\uffff\1\163\1\uffff\1\146\1\172\1\145\4\uffff\1\uffff\1\uffff\1\145\1\uffff\3\uffff\1\144\1\uffff\1\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\6\17\uffff\1\53\1\54\3\uffff\1\64\7\uffff\1\114\1\uffff\1\120\1\121\1\uffff\1\123\2\uffff\1\137\1\140\1\142\1\145\7\uffff\1\7\1\5\1\76\1\10\14\uffff\1\134\1\uffff\1\117\6\uffff\1\47\1\135\1\30\1\110\1\130\1\31\1\111\1\127\1\32\3\uffff\1\116\5\uffff\1\55\2\uffff\1\73\1\72\1\65\1\103\1\101\1\uffff\1\102\1\100\1\75\1\74\1\77\1\124\1\105\1\uffff\1\144\1\104\1\107\1\106\1\113\1\112\4\uffff\1\131\1\uffff\1\132\10\uffff\1\41\16\uffff\1\37\20\uffff\1\136\1\55\1\uffff\1\71\1\63\1\67\1\70\1\66\1\uffff\1\143\4\uffff\1\133\10\uffff\1\15\12\uffff\1\27\12\uffff\1\43\12\uffff\1\146\2\uffff\1\122\2\uffff\1\13\1\uffff\1\34\6\uffff\1\12\11\uffff\1\17\2\uffff\1\21\3\uffff\1\60\1\126\2\uffff\1\42\5\uffff\1\57\3\uffff\1\3\1\uffff\1\44\5\uffff\1\25\1\14\3\uffff\1\61\1\16\1\uffff\1\141\1\125\3\uffff\1\24\2\uffff\1\36\1\40\12\uffff\1\46\4\uffff\1\33\1\56\1\uffff\1\20\1\uffff\1\23\14\uffff\1\11\1\uffff\1\45\1\35\2\uffff\1\52\1\50\3\uffff\1\26\11\uffff\1\51\3\uffff\1\115\1\4\1\62\2\uffff\1\22";
    static final String DFA29_specialS =
        "\30\uffff\1\2\130\uffff\1\0\75\uffff\1\1\u00b7\uffff}>";
    static final String[] DFA29_transitionS = {
            "\2\56\2\uffff\1\56\22\uffff\1\56\1\37\1\45\1\uffff\1\55\1\41\1\33\1\30\1\54\1\53\1\42\1\21\1\2\1\22\1\20\1\40\1\51\11\52\1\46\1\1\1\34\1\7\1\35\1\43\1\uffff\15\55\1\31\14\55\1\5\1\uffff\1\6\1\36\1\55\1\uffff\1\44\1\10\1\3\1\14\1\24\1\12\2\55\1\4\2\55\1\13\1\55\1\47\1\55\1\25\1\55\1\16\1\11\1\17\1\55\1\15\1\23\3\55\1\26\1\32\1\27\1\50",
            "",
            "",
            "\1\62\6\uffff\1\60\3\uffff\1\57\2\uffff\1\61",
            "\1\65\6\uffff\1\63\1\64",
            "\1\66",
            "",
            "\1\70",
            "\1\72\2\uffff\1\74\6\uffff\1\73",
            "\1\75\13\uffff\1\100\1\101\1\uffff\1\77\1\uffff\1\76",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\1\105\7\55\1\104\2\55\1\102\2\55\1\103\13\55\105\uffff\uff40\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\107\13\55\105\uffff\uff40\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\112\11\55\1\111\13\55\105\uffff\uff40\55",
            "\1\113",
            "\1\114",
            "\1\115\11\uffff\1\116",
            "\1\117\5\uffff\12\120",
            "\1\123\21\uffff\1\122",
            "\1\126\17\uffff\1\125",
            "\1\130",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\131\13\55\1\132\2\55\105\uffff\uff40\55",
            "\1\134\20\uffff\1\136\2\uffff\1\135",
            "",
            "",
            "\47\140\1\141\64\140\1\137\uffa3\140",
            "\1\142",
            "\1\144\76\uffff\1\143",
            "",
            "\1\146\1\147",
            "\1\152\1\151",
            "\1\154",
            "\1\156",
            "\1\161\4\uffff\1\162\15\uffff\1\160",
            "\1\164",
            "\1\166",
            "",
            "\1\171\12\uffff\1\170",
            "",
            "",
            "\1\173\3\uffff\1\172",
            "",
            "\1\120\1\uffff\10\175\2\52\12\uffff\3\120\35\uffff\3\120\21\uffff\1\174",
            "\1\120\1\uffff\12\52\12\uffff\3\120\35\uffff\3\120",
            "",
            "",
            "",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082\1\u0083",
            "\1\u0084",
            "\1\u0086\1\u0085",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "",
            "",
            "",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u0095\5\55\105\uffff\uff40\55",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009b\10\uffff\1\u009a",
            "\1\u009e\23\uffff\1\u009d\3\uffff\1\u009c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4\5\uffff\1\u00a5",
            "\1\u00a7\4\uffff\1\u00a6\10\uffff\10\u00a7\44\uffff\1\u00a7\5\uffff\1\u00a7\3\uffff\1\u00a7\7\uffff\1\u00a7\3\uffff\1\u00a7\1\uffff\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ad\1\u00ac",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\u00b0\1\u00af\uffd5\u00b0",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "\1\120\1\uffff\10\175\2\52\12\uffff\3\120\5\uffff\1\u00b5\27\uffff\3\120\5\uffff\1\u00b5",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb\2\uffff\1\u00bc",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00bd\25\55\105\uffff\uff40\55",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d2\11\uffff\1\u00d1",
            "\1\u00d3",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00a7",
            "",
            "",
            "\1\u00de",
            "",
            "",
            "",
            "",
            "",
            "\0\u00b0",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u00e6",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u00f9",
            "\1\u00fa",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u0101",
            "\1\u0102",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "",
            "\1\u010a",
            "\1\u010b",
            "",
            "\1\u010c",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "",
            "\1\u010e",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u011c\16\55\105\uffff\uff40\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "",
            "\1\u011f",
            "\1\u0120",
            "",
            "\1\u0121",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u0123",
            "",
            "",
            "\1\u0124",
            "\1\55\3\uffff\1\u0125\7\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "",
            "\1\u012f",
            "",
            "\1\u0130",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "",
            "",
            "\1\u0135",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "",
            "",
            "\1\u0138",
            "",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u013a",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "",
            "\1\u013c",
            "\1\u013d",
            "",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u0144",
            "\1\u0145",
            "",
            "\1\u0146",
            "\1\u0147",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u0149",
            "",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "",
            "\1\u014c",
            "\1\u014d",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "",
            "\1\u0157",
            "",
            "",
            "\1\u0158",
            "\1\u0159",
            "",
            "",
            "\1\u015a",
            "\1\u015b",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "",
            "\1\u015c",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "\1\u0164",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            "",
            "",
            "",
            "\1\u0165",
            "\1\55\3\uffff\1\u0166\7\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff\uff40\55",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | RULE_INTERFACE | RULE_EXTENDS | RULE_R_CURLY_BRACE | RULE_L_CURLY_BRACE | RULE_CHAR | RULE_STATIC | RULE_NULL | RULE_THIS | RULE_SUPER | RULE_INSTANCEOF | RULE_OR_LOGIC | RULE_AND | RULE_L_SHIFT | RULE_R_SHIFT | RULE_SUPER_SHIFT | RULE_R_SHIFT_EQUAL | RULE_DOUBLE_OR_EQUAL | RULE_OR | RULE_OR_EQUAL | RULE_EXP | RULE_EXP_EQUAL | RULE_DOUBLE_EQUAL | RULE_DIFFERENT | RULE_BT | RULE_ST | RULE_BE | RULE_SE | RULE_DIVIDE | RULE_DIVIDE_EQUAL | RULE_MODULE | RULE_MODULE_EQUAL | RULE_PLUS_EQUAL | RULE_MINUS_EQUAL | RULE_MULTIPLY | RULE_MULTIPLY_EQUAL | RULE_WAT | RULE_AMPERSAND | RULE_EXPONENTIAL | RULE_LONG | RULE_STRING | RULE_COLON | RULE_NEW | RULE_NOT | RULE_EXCLAMATION | RULE_FALSE | RULE_TRUE | RULE_DECREMENT | RULE_INCREMENT | RULE_HEXA | RULE_DECIMAL_DIGITS | RULE_OCTAL_LITERAL | RULE_FLOAT_TYPE_SUFIX | RULE_FLOATING_POINT_LITERAL | RULE_CHARACTER_LITERAL | RULE_RPAREN | RULE_LPAREN | RULE_MOD | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_DOC_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_113 = input.LA(1);

                        s = -1;
                        if ( (LA29_113=='*') ) {s = 175;}

                        else if ( ((LA29_113>='\u0000' && LA29_113<=')')||(LA29_113>='+' && LA29_113<='\uFFFF')) ) {s = 176;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_175 = input.LA(1);

                        s = -1;
                        if ( ((LA29_175>='\u0000' && LA29_175<='\uFFFF')) ) {s = 176;}

                        else s = 223;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_24 = input.LA(1);

                        s = -1;
                        if ( (LA29_24=='\\') ) {s = 95;}

                        else if ( ((LA29_24>='\u0000' && LA29_24<='&')||(LA29_24>='(' && LA29_24<='[')||(LA29_24>=']' && LA29_24<='\uFFFF')) ) {s = 96;}

                        else if ( (LA29_24=='\'') ) {s = 97;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}