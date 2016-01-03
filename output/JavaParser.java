// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/zhengzhedong/Desktop/minijava3/Java.g 2015-12-25 16:54:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class JavaParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAL", "LOC_VAL", "START", "CLASS_DECLARATION", "CLASS_BODY", "CLASS_MODIFIERS", "CLASS_NAME", "MODIFIERS", "MEMBER_DECLARATION", "MEMBER_MODIFIER", "METHOD", "METHOD_BODY", "METHOD_NAME", "TYPE_NAME", "ASSIGN", "FOR_BLOCK", "WHILE_BLOCK", "IF_BLOCK", "CONTROL", "BODY", "PRINT", "STATEMENT", "THEN", "ELSE", "METHOD_INPUT", "INIT", "UPDATE", "BREAK", "CASE", "DEFAULT", "SWITCH_BLOCK", "SWITCH_KEY", "SWITCH_BODY", "CASE_KEY", "CASE_BODY", "LEFT_INC", "RIGHT_INC", "LEFT_DEC", "RIGHT_DEC", "MAIN_CLASS", "Identifier", "FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "HexLiteral", "OctalLiteral", "DecimalLiteral", "HexDigit", "IntegerTypeSuffix", "Exponent", "FloatTypeSuffix", "EscapeSequence", "UnicodeEscape", "OctalEscape", "ASSERT", "Letter", "JavaIDDigit", "WS", "COMMENT", "LINE_COMMENT", "'public'", "'protected'", "'private'", "'abstract'", "'static'", "'class'", "'{'", "'}'", "'<'", "','", "'>'", "'extends'", "'&'", "';'", "'('", "')'", "'void'", "'['", "']'", "'throws'", "'='", "'final'", "'native'", "'synchronized'", "'transient'", "'volatile'", "'strictfp'", "'[]'", "'.'", "'boolean'", "'char'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'?'", "'super'", "'this'", "'null'", "'true'", "'false'", "'default'", "'if'", "'else'", "'for'", "'while'", "'switch'", "'return'", "'break'", "'continue'", "':'", "'case'", "'break;'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'||'", "'&&'", "'|'", "'^'", "'=='", "'!='", "'instanceof'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'~'", "'!'", "'new'", "'System.out.'", "'println'", "'print'"
    };
    public static final int FloatTypeSuffix=54;
    public static final int OctalLiteral=49;
    public static final int CASE=32;
    public static final int EOF=-1;
    public static final int BREAK=31;
    public static final int Identifier=44;
    public static final int CASE_KEY=37;
    public static final int STATEMENT=25;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int CLASS_MODIFIERS=9;
    public static final int LOC_VAL=5;
    public static final int SWITCH_BLOCK=34;
    public static final int WHILE_BLOCK=20;
    public static final int VAL=4;
    public static final int BODY=23;
    public static final int MAIN_CLASS=43;
    public static final int COMMENT=62;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int SWITCH_BODY=36;
    public static final int T__81=81;
    public static final int CONTROL=22;
    public static final int T__82=82;
    public static final int LEFT_DEC=41;
    public static final int T__83=83;
    public static final int LINE_COMMENT=63;
    public static final int METHOD_INPUT=28;
    public static final int IntegerTypeSuffix=52;
    public static final int ELSE=27;
    public static final int T__85=85;
    public static final int T__141=141;
    public static final int RIGHT_DEC=42;
    public static final int T__84=84;
    public static final int T__142=142;
    public static final int ASSERT=58;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__140=140;
    public static final int T__89=89;
    public static final int T__145=145;
    public static final int T__88=88;
    public static final int T__146=146;
    public static final int IF_BLOCK=21;
    public static final int METHOD_NAME=16;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=61;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__129=129;
    public static final int T__70=70;
    public static final int METHOD_BODY=15;
    public static final int FloatingPointLiteral=45;
    public static final int JavaIDDigit=60;
    public static final int SWITCH_KEY=35;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int INIT=29;
    public static final int T__74=74;
    public static final int T__130=130;
    public static final int Letter=59;
    public static final int EscapeSequence=55;
    public static final int T__73=73;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__79=79;
    public static final int T__133=133;
    public static final int T__78=78;
    public static final int T__134=134;
    public static final int T__77=77;
    public static final int T__135=135;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int FOR_BLOCK=19;
    public static final int T__118=118;
    public static final int CharacterLiteral=46;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int UPDATE=30;
    public static final int T__123=123;
    public static final int Exponent=53;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int HexDigit=51;
    public static final int MEMBER_DECLARATION=12;
    public static final int MODIFIERS=11;
    public static final int THEN=26;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int TYPE_NAME=17;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int MEMBER_MODIFIER=13;
    public static final int HexLiteral=48;
    public static final int CASE_BODY=38;
    public static final int CLASS_NAME=10;
    public static final int RIGHT_INC=40;
    public static final int LEFT_INC=39;
    public static final int DEFAULT=33;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int DecimalLiteral=50;
    public static final int CLASS_BODY=8;
    public static final int PRINT=24;
    public static final int StringLiteral=47;
    public static final int CLASS_DECLARATION=7;
    public static final int UnicodeEscape=56;
    public static final int ASSIGN=18;
    public static final int START=6;
    public static final int OctalEscape=57;
    public static final int METHOD=14;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "forUpdate", "synpred133_Java", "synpred82_Java", 
        "synpred25_Java", "synpred67_Java", "synpred14_Java", "synpred208_Java", 
        "synpred88_Java", "synpred132_Java", "synpred127_Java", "classDeclaration", 
        "constantDeclarator", "synpred168_Java", "synpred31_Java", "blockStatement", 
        "synpred54_Java", "synpred109_Java", "memberDeclaration", "synpred119_Java", 
        "synpred33_Java", "synpred173_Java", "synpred56_Java", "synpred131_Java", 
        "synpred177_Java", "synpred74_Java", "variableModifier", "synpred91_Java", 
        "statement", "elementValue", "compilation", "identifierSuffix", 
        "synpred84_Java", "exclusiveOrExpression", "synpred179_Java", "synpred140_Java", 
        "synpred106_Java", "synpred163_Java", "synpred144_Java", "synpred79_Java", 
        "synpred118_Java", "qualifiedName", "synpred146_Java", "packageOrTypeName", 
        "synpred139_Java", "inclusiveOrExpression", "synpred53_Java", "arrayCreatorRest", 
        "synpred22_Java", "formalParameters", "variableInitializer", "synpred70_Java", 
        "synpred83_Java", "synpred143_Java", "synpred107_Java", "synpred103_Java", 
        "synpred52_Java", "conditionalAndExpression", "synpred86_Java", 
        "synpred96_Java", "synpred40_Java", "typeParameters", "synpred176_Java", 
        "typeArguments", "synpred16_Java", "synpred115_Java", "synpred50_Java", 
        "statementExpression", "synpred80_Java", "synpred59_Java", "synpred6_Java", 
        "synpred7_Java", "synpred64_Java", "synpred148_Java", "synpred203_Java", 
        "synpred93_Java", "constructorDeclaratorRest", "constructorBody", 
        "synpred192_Java", "synpred30_Java", "synpred89_Java", "synpred111_Java", 
        "synpred165_Java", "synpred2_Java", "qualifiedNameList", "variableModifiers", 
        "synpred63_Java", "synpred77_Java", "synpred169_Java", "equalityExpression", 
        "synpred72_Java", "mtype", "synpred43_Java", "synpred100_Java", 
        "classBodyDeclaration", "compilationUnit", "synpred134_Java", "synpred145_Java", 
        "synpred121_Java", "synpred162_Java", "createdName", "synpred15_Java", 
        "variableDeclarators", "synpred29_Java", "formalParameterDeclsRest", 
        "synpred193_Java", "synpred1_Java", "synpred11_Java", "typeBound", 
        "synpred124_Java", "synpred95_Java", "nonWildcardTypeArguments", 
        "synpred200_Java", "synpred189_Java", "synpred157_Java", "synpred167_Java", 
        "synpred123_Java", "classOrInterfaceModifiers", "synpred65_Java", 
        "synpred112_Java", "expressionList", "creator", "synpred190_Java", 
        "additiveExpression", "expression", "synpred35_Java", "synpred129_Java", 
        "else_statement", "andExpression", "shiftOp", "switchLabel", "synpred117_Java", 
        "switchBlockStatementGroup", "synpred73_Java", "synpred171_Java", 
        "synpred85_Java", "synpred161_Java", "synpred138_Java", "synpred149_Java", 
        "synpred153_Java", "synpred110_Java", "typeArgument", "synpred116_Java", 
        "synpred49_Java", "synpred199_Java", "synpred207_Java", "synpred155_Java", 
        "elementValueArrayInitializer", "synpred164_Java", "synpred150_Java", 
        "synpred8_Java", "conditionalExpression", "synpred24_Java", "synpred130_Java", 
        "synpred5_Java", "synpred187_Java", "genericMethodOrConstructorDecl", 
        "synpred12_Java", "synpred184_Java", "typeParameter", "synpred194_Java", 
        "synpred206_Java", "castExpression", "synpred76_Java", "relationalOp", 
        "modifiers", "selector", "multiplicativeExpression", "enhancedForControl", 
        "synpred44_Java", "fieldDeclaration", "variableDeclarator", "primary", 
        "synpred135_Java", "synpred61_Java", "synpred81_Java", "classCreatorRest", 
        "typeList", "synpred90_Java", "synpred126_Java", "synpred45_Java", 
        "genericMethodOrConstructorRest", "synpred9_Java", "synpred191_Java", 
        "synpred113_Java", "synpred28_Java", "synpred183_Java", "synpred166_Java", 
        "synpred201_Java", "synpred195_Java", "synpred175_Java", "synpred142_Java", 
        "synpred108_Java", "synpred62_Java", "synpred19_Java", "formalParameter", 
        "synpred20_Java", "switchBlockStatementGroups", "synpred57_Java", 
        "synpred154_Java", "synpred152_Java", "synpred120_Java", "synpred174_Java", 
        "synpred92_Java", "explicitConstructorInvocation", "synpred181_Java", 
        "unaryExpressionNotPlusMinus", "shiftExpression", "assignmentOperator", 
        "synpred18_Java", "synpred98_Java", "synpred42_Java", "classOrInterfaceDeclaration", 
        "superSuffix", "synpred147_Java", "synpred41_Java", "classOrInterfaceModifier", 
        "synpred34_Java", "synpred158_Java", "synpred137_Java", "synpred99_Java", 
        "synpred170_Java", "modifier", "primitiveType", "synpred141_Java", 
        "mainclass", "conditionalOrExpression", "parExpression", "arguments", 
        "synpred128_Java", "synpred122_Java", "synpred23_Java", "synpred39_Java", 
        "forInit", "constantDeclaratorRest", "synpred46_Java", "synpred51_Java", 
        "synpred60_Java", "typeName", "synpred32_Java", "synpred101_Java", 
        "synpred97_Java", "synpred66_Java", "synpred94_Java", "synpred125_Java", 
        "synpred160_Java", "synpred68_Java", "synpred27_Java", "synpred21_Java", 
        "assign", "synpred156_Java", "literal", "forControl", "constantExpression", 
        "synpred58_Java", "integerLiteral", "innerCreator", "synpred185_Java", 
        "synpred114_Java", "synpred75_Java", "synpred69_Java", "booleanLiteral", 
        "synpred10_Java", "formalParameterDecls", "synpred178_Java", "arrayInitializer", 
        "localVariableDeclaration", "synpred196_Java", "synpred102_Java", 
        "voidMethodDeclaratorRest", "elementValuePairs", "type", "variableDeclaratorId", 
        "synpred159_Java", "synpred172_Java", "synpred180_Java", "synpred204_Java", 
        "defaultValue", "synpred87_Java", "block", "constantDeclaratorsRest", 
        "synpred38_Java", "synpred205_Java", "synpred197_Java", "synpred188_Java", 
        "synpred202_Java", "synpred104_Java", "memberDecl", "synpred182_Java", 
        "unaryExpression", "synpred36_Java", "synpred26_Java", "methodDeclaratorRest", 
        "synpred55_Java", "synpred37_Java", "elementValuePair", "synpred78_Java", 
        "synpred136_Java", "synpred48_Java", "explicitGenericInvocation", 
        "synpred17_Java", "synpred151_Java", "relationalExpression", "instanceOfExpression", 
        "synpred47_Java", "synpred105_Java", "synpred3_Java", "synpred198_Java", 
        "synpred71_Java", "synpred13_Java", "methodBody", "synpred4_Java", 
        "synpred186_Java", "localVariableDeclarationStatement", "classOrInterfaceType"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public JavaParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public JavaParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[314+1];
             
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public JavaParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);
        this.state.ruleMemo = new HashMap[314+1];
         
         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return JavaParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/zhengzhedong/Desktop/minijava3/Java.g"; }


    public static class compilationUnit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:52:1: compilationUnit : ( classOrInterfaceDeclaration )* ( mainclass )? ( compilation )? ;
    public final JavaParser.compilationUnit_return compilationUnit() throws RecognitionException {
        JavaParser.compilationUnit_return retval = new JavaParser.compilationUnit_return();
        retval.start = input.LT(1);
        int compilationUnit_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.classOrInterfaceDeclaration_return classOrInterfaceDeclaration1 = null;

        JavaParser.mainclass_return mainclass2 = null;

        JavaParser.compilation_return compilation3 = null;



        try { dbg.enterRule(getGrammarFileName(), "compilationUnit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:53:5: ( ( classOrInterfaceDeclaration )* ( mainclass )? ( compilation )? )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:53:8: ( classOrInterfaceDeclaration )* ( mainclass )? ( compilation )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(53,8);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:53:8: ( classOrInterfaceDeclaration )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=65 && LA1_0<=68)) ) {
                    int LA1_2 = input.LA(2);

                    if ( (synpred1_Java()) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==69) ) {
                    int LA1_3 = input.LA(2);

                    if ( (synpred1_Java()) ) {
                        alt1=1;
                    }


                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: classOrInterfaceDeclaration
            	    {
            	    dbg.location(53,8);
            	    pushFollow(FOLLOW_classOrInterfaceDeclaration_in_compilationUnit212);
            	    classOrInterfaceDeclaration1=classOrInterfaceDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceDeclaration1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(53,37);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:53:37: ( mainclass )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==64) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred2_Java()) ) {
                    alt2=1;
                }
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: mainclass
                    {
                    dbg.location(53,37);
                    pushFollow(FOLLOW_mainclass_in_compilationUnit215);
                    mainclass2=mainclass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mainclass2.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(53,48);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:53:48: ( compilation )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3);

            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=64 && LA3_0<=69)) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: compilation
                    {
                    dbg.location(53,48);
                    pushFollow(FOLLOW_compilation_in_compilationUnit218);
                    compilation3=compilation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compilation3.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, compilationUnit_StartIndex); }
        }
        dbg.location(54, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "compilationUnit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "compilationUnit"

    public static class compilation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilation"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:56:1: compilation : ( ( classOrInterfaceDeclaration )+ ( compilation )? | ( mainclass )+ ( classOrInterfaceDeclaration )* );
    public final JavaParser.compilation_return compilation() throws RecognitionException {
        JavaParser.compilation_return retval = new JavaParser.compilation_return();
        retval.start = input.LT(1);
        int compilation_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.classOrInterfaceDeclaration_return classOrInterfaceDeclaration4 = null;

        JavaParser.compilation_return compilation5 = null;

        JavaParser.mainclass_return mainclass6 = null;

        JavaParser.classOrInterfaceDeclaration_return classOrInterfaceDeclaration7 = null;



        try { dbg.enterRule(getGrammarFileName(), "compilation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:57:2: ( ( classOrInterfaceDeclaration )+ ( compilation )? | ( mainclass )+ ( classOrInterfaceDeclaration )* )
            int alt8=2;
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=65 && LA8_0<=69)) ) {
                alt8=1;
            }
            else if ( (LA8_0==64) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:57:4: ( classOrInterfaceDeclaration )+ ( compilation )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(57,4);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:57:4: ( classOrInterfaceDeclaration )+
                    int cnt4=0;
                    try { dbg.enterSubRule(4);

                    loop4:
                    do {
                        int alt4=2;
                        try { dbg.enterDecision(4);

                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=65 && LA4_0<=68)) ) {
                            int LA4_1 = input.LA(2);

                            if ( (synpred4_Java()) ) {
                                alt4=1;
                            }


                        }
                        else if ( (LA4_0==69) ) {
                            int LA4_2 = input.LA(2);

                            if ( (synpred4_Java()) ) {
                                alt4=1;
                            }


                        }


                        } finally {dbg.exitDecision(4);}

                        switch (alt4) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: classOrInterfaceDeclaration
                    	    {
                    	    dbg.location(57,4);
                    	    pushFollow(FOLLOW_classOrInterfaceDeclaration_in_compilation234);
                    	    classOrInterfaceDeclaration4=classOrInterfaceDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceDeclaration4.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt4++;
                    } while (true);
                    } finally {dbg.exitSubRule(4);}

                    dbg.location(57,33);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:57:33: ( compilation )?
                    int alt5=2;
                    try { dbg.enterSubRule(5);
                    try { dbg.enterDecision(5);

                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=64 && LA5_0<=69)) ) {
                        alt5=1;
                    }
                    } finally {dbg.exitDecision(5);}

                    switch (alt5) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: compilation
                            {
                            dbg.location(57,33);
                            pushFollow(FOLLOW_compilation_in_compilation237);
                            compilation5=compilation();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, compilation5.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(5);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:58:4: ( mainclass )+ ( classOrInterfaceDeclaration )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(58,4);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:58:4: ( mainclass )+
                    int cnt6=0;
                    try { dbg.enterSubRule(6);

                    loop6:
                    do {
                        int alt6=2;
                        try { dbg.enterDecision(6);

                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==64) ) {
                            alt6=1;
                        }


                        } finally {dbg.exitDecision(6);}

                        switch (alt6) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: mainclass
                    	    {
                    	    dbg.location(58,4);
                    	    pushFollow(FOLLOW_mainclass_in_compilation243);
                    	    mainclass6=mainclass();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mainclass6.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt6++;
                    } while (true);
                    } finally {dbg.exitSubRule(6);}

                    dbg.location(58,15);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:58:15: ( classOrInterfaceDeclaration )*
                    try { dbg.enterSubRule(7);

                    loop7:
                    do {
                        int alt7=2;
                        try { dbg.enterDecision(7);

                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=65 && LA7_0<=69)) ) {
                            alt7=1;
                        }


                        } finally {dbg.exitDecision(7);}

                        switch (alt7) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: classOrInterfaceDeclaration
                    	    {
                    	    dbg.location(58,15);
                    	    pushFollow(FOLLOW_classOrInterfaceDeclaration_in_compilation246);
                    	    classOrInterfaceDeclaration7=classOrInterfaceDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceDeclaration7.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(7);}

                    dbg.location(58,44);
                    if ( state.backtracking==0 ) {
                      System.out.println("error:multi_main_class");
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, compilation_StartIndex); }
        }
        dbg.location(59, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "compilation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "compilation"

    public static class mainclass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mainclass"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:61:1: mainclass : 'public' classDeclaration -> ^( MAIN_CLASS classDeclaration ) ;
    public final JavaParser.mainclass_return mainclass() throws RecognitionException {
        JavaParser.mainclass_return retval = new JavaParser.mainclass_return();
        retval.start = input.LT(1);
        int mainclass_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal8=null;
        JavaParser.classDeclaration_return classDeclaration9 = null;


        Object string_literal8_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_classDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule classDeclaration");
        try { dbg.enterRule(getGrammarFileName(), "mainclass");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:62:2: ( 'public' classDeclaration -> ^( MAIN_CLASS classDeclaration ) )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:62:4: 'public' classDeclaration
            {
            dbg.location(62,4);
            string_literal8=(Token)match(input,64,FOLLOW_64_in_mainclass261); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_64.add(string_literal8);

            dbg.location(62,13);
            pushFollow(FOLLOW_classDeclaration_in_mainclass263);
            classDeclaration9=classDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classDeclaration.add(classDeclaration9.getTree());


            // AST REWRITE
            // elements: classDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 62:30: -> ^( MAIN_CLASS classDeclaration )
            {
                dbg.location(62,33);
                // /Users/zhengzhedong/Desktop/minijava3/Java.g:62:33: ^( MAIN_CLASS classDeclaration )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(62,35);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MAIN_CLASS, "MAIN_CLASS"), root_1);

                dbg.location(62,46);
                adaptor.addChild(root_1, stream_classDeclaration.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, mainclass_StartIndex); }
        }
        dbg.location(63, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mainclass");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mainclass"

    public static class classOrInterfaceDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classOrInterfaceDeclaration"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:65:1: classOrInterfaceDeclaration : classOrInterfaceModifiers classDeclaration -> ^( CLASS_DECLARATION classOrInterfaceModifiers classDeclaration ) ;
    public final JavaParser.classOrInterfaceDeclaration_return classOrInterfaceDeclaration() throws RecognitionException {
        JavaParser.classOrInterfaceDeclaration_return retval = new JavaParser.classOrInterfaceDeclaration_return();
        retval.start = input.LT(1);
        int classOrInterfaceDeclaration_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.classOrInterfaceModifiers_return classOrInterfaceModifiers10 = null;

        JavaParser.classDeclaration_return classDeclaration11 = null;


        RewriteRuleSubtreeStream stream_classDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule classDeclaration");
        RewriteRuleSubtreeStream stream_classOrInterfaceModifiers=new RewriteRuleSubtreeStream(adaptor,"rule classOrInterfaceModifiers");
        try { dbg.enterRule(getGrammarFileName(), "classOrInterfaceDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:66:5: ( classOrInterfaceModifiers classDeclaration -> ^( CLASS_DECLARATION classOrInterfaceModifiers classDeclaration ) )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:66:9: classOrInterfaceModifiers classDeclaration
            {
            dbg.location(66,9);
            pushFollow(FOLLOW_classOrInterfaceModifiers_in_classOrInterfaceDeclaration288);
            classOrInterfaceModifiers10=classOrInterfaceModifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classOrInterfaceModifiers.add(classOrInterfaceModifiers10.getTree());
            dbg.location(66,35);
            pushFollow(FOLLOW_classDeclaration_in_classOrInterfaceDeclaration290);
            classDeclaration11=classDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classDeclaration.add(classDeclaration11.getTree());


            // AST REWRITE
            // elements: classDeclaration, classOrInterfaceModifiers
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:52: -> ^( CLASS_DECLARATION classOrInterfaceModifiers classDeclaration )
            {
                dbg.location(66,55);
                // /Users/zhengzhedong/Desktop/minijava3/Java.g:66:55: ^( CLASS_DECLARATION classOrInterfaceModifiers classDeclaration )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(66,57);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CLASS_DECLARATION, "CLASS_DECLARATION"), root_1);

                dbg.location(66,76);
                adaptor.addChild(root_1, stream_classOrInterfaceModifiers.nextTree());
                dbg.location(66,102);
                adaptor.addChild(root_1, stream_classDeclaration.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, classOrInterfaceDeclaration_StartIndex); }
        }
        dbg.location(67, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classOrInterfaceDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "classOrInterfaceDeclaration"

    public static class classOrInterfaceModifiers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classOrInterfaceModifiers"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:69:1: classOrInterfaceModifiers : ( classOrInterfaceModifier )* -> ^( CLASS_MODIFIERS ( classOrInterfaceModifier )* ) ;
    public final JavaParser.classOrInterfaceModifiers_return classOrInterfaceModifiers() throws RecognitionException {
        JavaParser.classOrInterfaceModifiers_return retval = new JavaParser.classOrInterfaceModifiers_return();
        retval.start = input.LT(1);
        int classOrInterfaceModifiers_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.classOrInterfaceModifier_return classOrInterfaceModifier12 = null;


        RewriteRuleSubtreeStream stream_classOrInterfaceModifier=new RewriteRuleSubtreeStream(adaptor,"rule classOrInterfaceModifier");
        try { dbg.enterRule(getGrammarFileName(), "classOrInterfaceModifiers");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(69, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:70:5: ( ( classOrInterfaceModifier )* -> ^( CLASS_MODIFIERS ( classOrInterfaceModifier )* ) )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:70:9: ( classOrInterfaceModifier )*
            {
            dbg.location(70,9);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:70:9: ( classOrInterfaceModifier )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9);

                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=65 && LA9_0<=68)) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: classOrInterfaceModifier
            	    {
            	    dbg.location(70,9);
            	    pushFollow(FOLLOW_classOrInterfaceModifier_in_classOrInterfaceModifiers324);
            	    classOrInterfaceModifier12=classOrInterfaceModifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classOrInterfaceModifier.add(classOrInterfaceModifier12.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}



            // AST REWRITE
            // elements: classOrInterfaceModifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 70:35: -> ^( CLASS_MODIFIERS ( classOrInterfaceModifier )* )
            {
                dbg.location(70,38);
                // /Users/zhengzhedong/Desktop/minijava3/Java.g:70:38: ^( CLASS_MODIFIERS ( classOrInterfaceModifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(70,40);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CLASS_MODIFIERS, "CLASS_MODIFIERS"), root_1);

                dbg.location(70,56);
                // /Users/zhengzhedong/Desktop/minijava3/Java.g:70:56: ( classOrInterfaceModifier )*
                while ( stream_classOrInterfaceModifier.hasNext() ) {
                    dbg.location(70,56);
                    adaptor.addChild(root_1, stream_classOrInterfaceModifier.nextTree());

                }
                stream_classOrInterfaceModifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, classOrInterfaceModifiers_StartIndex); }
        }
        dbg.location(71, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classOrInterfaceModifiers");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "classOrInterfaceModifiers"

    public static class classOrInterfaceModifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classOrInterfaceModifier"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:73:1: classOrInterfaceModifier : ( 'protected' | 'private' | 'abstract' | 'static' );
    public final JavaParser.classOrInterfaceModifier_return classOrInterfaceModifier() throws RecognitionException {
        JavaParser.classOrInterfaceModifier_return retval = new JavaParser.classOrInterfaceModifier_return();
        retval.start = input.LT(1);
        int classOrInterfaceModifier_StartIndex = input.index();
        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "classOrInterfaceModifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:74:5: ( 'protected' | 'private' | 'abstract' | 'static' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(74,5);
            set13=(Token)input.LT(1);
            if ( (input.LA(1)>=65 && input.LA(1)<=68) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set13));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, classOrInterfaceModifier_StartIndex); }
        }
        dbg.location(78, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classOrInterfaceModifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "classOrInterfaceModifier"

    public static class modifiers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifiers"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:80:1: modifiers : ( modifier )* -> ^( MODIFIERS ( modifier )* ) ;
    public final JavaParser.modifiers_return modifiers() throws RecognitionException {
        JavaParser.modifiers_return retval = new JavaParser.modifiers_return();
        retval.start = input.LT(1);
        int modifiers_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.modifier_return modifier14 = null;


        RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
        try { dbg.enterRule(getGrammarFileName(), "modifiers");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:81:5: ( ( modifier )* -> ^( MODIFIERS ( modifier )* ) )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:81:9: ( modifier )*
            {
            dbg.location(81,9);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:81:9: ( modifier )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10);

                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=64 && LA10_0<=68)||(LA10_0>=85 && LA10_0<=90)) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: modifier
            	    {
            	    dbg.location(81,9);
            	    pushFollow(FOLLOW_modifier_in_modifiers414);
            	    modifier14=modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_modifier.add(modifier14.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}



            // AST REWRITE
            // elements: modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 81:19: -> ^( MODIFIERS ( modifier )* )
            {
                dbg.location(81,22);
                // /Users/zhengzhedong/Desktop/minijava3/Java.g:81:22: ^( MODIFIERS ( modifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(81,24);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODIFIERS, "MODIFIERS"), root_1);

                dbg.location(81,34);
                // /Users/zhengzhedong/Desktop/minijava3/Java.g:81:34: ( modifier )*
                while ( stream_modifier.hasNext() ) {
                    dbg.location(81,34);
                    adaptor.addChild(root_1, stream_modifier.nextTree());

                }
                stream_modifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, modifiers_StartIndex); }
        }
        dbg.location(82, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "modifiers");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "modifiers"

    public static class classDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDeclaration"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:84:1: classDeclaration : 'class' classname= Identifier ( typeParameters )? '{' ( classBodyDeclaration )* '}' -> ^( CLASS_NAME $classname) ^( CLASS_BODY ( classBodyDeclaration )* ) ;
    public final JavaParser.classDeclaration_return classDeclaration() throws RecognitionException {
        JavaParser.classDeclaration_return retval = new JavaParser.classDeclaration_return();
        retval.start = input.LT(1);
        int classDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token classname=null;
        Token string_literal15=null;
        Token char_literal17=null;
        Token char_literal19=null;
        JavaParser.typeParameters_return typeParameters16 = null;

        JavaParser.classBodyDeclaration_return classBodyDeclaration18 = null;


        Object classname_tree=null;
        Object string_literal15_tree=null;
        Object char_literal17_tree=null;
        Object char_literal19_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_typeParameters=new RewriteRuleSubtreeStream(adaptor,"rule typeParameters");
        RewriteRuleSubtreeStream stream_classBodyDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule classBodyDeclaration");
        try { dbg.enterRule(getGrammarFileName(), "classDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:85:5: ( 'class' classname= Identifier ( typeParameters )? '{' ( classBodyDeclaration )* '}' -> ^( CLASS_NAME $classname) ^( CLASS_BODY ( classBodyDeclaration )* ) )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:85:9: 'class' classname= Identifier ( typeParameters )? '{' ( classBodyDeclaration )* '}'
            {
            dbg.location(85,9);
            string_literal15=(Token)match(input,69,FOLLOW_69_in_classDeclaration443); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_69.add(string_literal15);

            dbg.location(85,27);
            classname=(Token)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration449); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(classname);

            dbg.location(85,40);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:85:40: ( typeParameters )?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==72) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: typeParameters
                    {
                    dbg.location(85,40);
                    pushFollow(FOLLOW_typeParameters_in_classDeclaration451);
                    typeParameters16=typeParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParameters.add(typeParameters16.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(86,9);
            char_literal17=(Token)match(input,70,FOLLOW_70_in_classDeclaration462); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_70.add(char_literal17);

            dbg.location(86,13);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:86:13: ( classBodyDeclaration )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==Identifier||(LA12_0>=64 && LA12_0<=69)||LA12_0==72||LA12_0==77||LA12_0==80||(LA12_0>=85 && LA12_0<=90)||(LA12_0>=93 && LA12_0<=100)) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: classBodyDeclaration
            	    {
            	    dbg.location(86,13);
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classDeclaration464);
            	    classBodyDeclaration18=classBodyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classBodyDeclaration.add(classBodyDeclaration18.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}

            dbg.location(86,35);
            char_literal19=(Token)match(input,71,FOLLOW_71_in_classDeclaration467); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(char_literal19);



            // AST REWRITE
            // elements: classname, classBodyDeclaration
            // token labels: classname
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_classname=new RewriteRuleTokenStream(adaptor,"token classname",classname);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 87:2: -> ^( CLASS_NAME $classname) ^( CLASS_BODY ( classBodyDeclaration )* )
            {
                dbg.location(87,6);
                // /Users/zhengzhedong/Desktop/minijava3/Java.g:87:6: ^( CLASS_NAME $classname)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(87,8);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CLASS_NAME, "CLASS_NAME"), root_1);

                dbg.location(87,19);
                adaptor.addChild(root_1, stream_classname.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(87,32);
                // /Users/zhengzhedong/Desktop/minijava3/Java.g:87:32: ^( CLASS_BODY ( classBodyDeclaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(87,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CLASS_BODY, "CLASS_BODY"), root_1);

                dbg.location(87,45);
                // /Users/zhengzhedong/Desktop/minijava3/Java.g:87:45: ( classBodyDeclaration )*
                while ( stream_classBodyDeclaration.hasNext() ) {
                    dbg.location(87,45);
                    adaptor.addChild(root_1, stream_classBodyDeclaration.nextTree());

                }
                stream_classBodyDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, classDeclaration_StartIndex); }
        }
        dbg.location(88, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "classDeclaration"

    public static class typeParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeParameters"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:90:1: typeParameters : '<' typeParameter ( ',' typeParameter )* '>' ;
    public final JavaParser.typeParameters_return typeParameters() throws RecognitionException {
        JavaParser.typeParameters_return retval = new JavaParser.typeParameters_return();
        retval.start = input.LT(1);
        int typeParameters_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal20=null;
        Token char_literal22=null;
        Token char_literal24=null;
        JavaParser.typeParameter_return typeParameter21 = null;

        JavaParser.typeParameter_return typeParameter23 = null;


        Object char_literal20_tree=null;
        Object char_literal22_tree=null;
        Object char_literal24_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "typeParameters");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(90, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:91:5: ( '<' typeParameter ( ',' typeParameter )* '>' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:91:9: '<' typeParameter ( ',' typeParameter )* '>'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(91,9);
            char_literal20=(Token)match(input,72,FOLLOW_72_in_typeParameters509); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal20_tree = (Object)adaptor.create(char_literal20);
            adaptor.addChild(root_0, char_literal20_tree);
            }
            dbg.location(91,13);
            pushFollow(FOLLOW_typeParameter_in_typeParameters511);
            typeParameter21=typeParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameter21.getTree());
            dbg.location(91,27);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:91:27: ( ',' typeParameter )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==73) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:91:28: ',' typeParameter
            	    {
            	    dbg.location(91,28);
            	    char_literal22=(Token)match(input,73,FOLLOW_73_in_typeParameters514); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal22_tree = (Object)adaptor.create(char_literal22);
            	    adaptor.addChild(root_0, char_literal22_tree);
            	    }
            	    dbg.location(91,32);
            	    pushFollow(FOLLOW_typeParameter_in_typeParameters516);
            	    typeParameter23=typeParameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameter23.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}

            dbg.location(91,48);
            char_literal24=(Token)match(input,74,FOLLOW_74_in_typeParameters520); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal24_tree = (Object)adaptor.create(char_literal24);
            adaptor.addChild(root_0, char_literal24_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, typeParameters_StartIndex); }
        }
        dbg.location(92, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeParameters");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeParameters"

    public static class typeParameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeParameter"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:94:1: typeParameter : Identifier ( 'extends' typeBound )? ;
    public final JavaParser.typeParameter_return typeParameter() throws RecognitionException {
        JavaParser.typeParameter_return retval = new JavaParser.typeParameter_return();
        retval.start = input.LT(1);
        int typeParameter_StartIndex = input.index();
        Object root_0 = null;

        Token Identifier25=null;
        Token string_literal26=null;
        JavaParser.typeBound_return typeBound27 = null;


        Object Identifier25_tree=null;
        Object string_literal26_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "typeParameter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(94, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:95:5: ( Identifier ( 'extends' typeBound )? )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:95:9: Identifier ( 'extends' typeBound )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(95,9);
            Identifier25=(Token)match(input,Identifier,FOLLOW_Identifier_in_typeParameter539); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier25_tree = (Object)adaptor.create(Identifier25);
            adaptor.addChild(root_0, Identifier25_tree);
            }
            dbg.location(95,20);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:95:20: ( 'extends' typeBound )?
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==75) ) {
                alt14=1;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:95:21: 'extends' typeBound
                    {
                    dbg.location(95,21);
                    string_literal26=(Token)match(input,75,FOLLOW_75_in_typeParameter542); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal26_tree = (Object)adaptor.create(string_literal26);
                    adaptor.addChild(root_0, string_literal26_tree);
                    }
                    dbg.location(95,31);
                    pushFollow(FOLLOW_typeBound_in_typeParameter544);
                    typeBound27=typeBound();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeBound27.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(14);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, typeParameter_StartIndex); }
        }
        dbg.location(96, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeParameter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeParameter"

    public static class typeBound_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeBound"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:98:1: typeBound : type ( '&' type )* ;
    public final JavaParser.typeBound_return typeBound() throws RecognitionException {
        JavaParser.typeBound_return retval = new JavaParser.typeBound_return();
        retval.start = input.LT(1);
        int typeBound_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal29=null;
        JavaParser.type_return type28 = null;

        JavaParser.type_return type30 = null;


        Object char_literal29_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "typeBound");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:99:5: ( type ( '&' type )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:99:9: type ( '&' type )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(99,9);
            pushFollow(FOLLOW_type_in_typeBound573);
            type28=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type28.getTree());
            dbg.location(99,14);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:99:14: ( '&' type )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15);

                int LA15_0 = input.LA(1);

                if ( (LA15_0==76) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:99:15: '&' type
            	    {
            	    dbg.location(99,15);
            	    char_literal29=(Token)match(input,76,FOLLOW_76_in_typeBound576); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal29_tree = (Object)adaptor.create(char_literal29);
            	    adaptor.addChild(root_0, char_literal29_tree);
            	    }
            	    dbg.location(99,19);
            	    pushFollow(FOLLOW_type_in_typeBound578);
            	    type30=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type30.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, typeBound_StartIndex); }
        }
        dbg.location(100, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeBound");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeBound"

    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeList"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:102:1: typeList : type ( ',' type )* ;
    public final JavaParser.typeList_return typeList() throws RecognitionException {
        JavaParser.typeList_return retval = new JavaParser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal32=null;
        JavaParser.type_return type31 = null;

        JavaParser.type_return type33 = null;


        Object char_literal32_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "typeList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:103:5: ( type ( ',' type )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:103:9: type ( ',' type )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(103,9);
            pushFollow(FOLLOW_type_in_typeList603);
            type31=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type31.getTree());
            dbg.location(103,14);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:103:14: ( ',' type )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16);

                int LA16_0 = input.LA(1);

                if ( (LA16_0==73) ) {
                    alt16=1;
                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:103:15: ',' type
            	    {
            	    dbg.location(103,15);
            	    char_literal32=(Token)match(input,73,FOLLOW_73_in_typeList606); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal32_tree = (Object)adaptor.create(char_literal32);
            	    adaptor.addChild(root_0, char_literal32_tree);
            	    }
            	    dbg.location(103,19);
            	    pushFollow(FOLLOW_type_in_typeList608);
            	    type33=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type33.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);
            } finally {dbg.exitSubRule(16);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, typeList_StartIndex); }
        }
        dbg.location(104, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeList"

    public static class classBodyDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBodyDeclaration"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:106:1: classBodyDeclaration : ( ';' | modifiers memberDecl -> ^( MEMBER_DECLARATION modifiers memberDecl ) );
    public final JavaParser.classBodyDeclaration_return classBodyDeclaration() throws RecognitionException {
        JavaParser.classBodyDeclaration_return retval = new JavaParser.classBodyDeclaration_return();
        retval.start = input.LT(1);
        int classBodyDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal34=null;
        JavaParser.modifiers_return modifiers35 = null;

        JavaParser.memberDecl_return memberDecl36 = null;


        Object char_literal34_tree=null;
        RewriteRuleSubtreeStream stream_memberDecl=new RewriteRuleSubtreeStream(adaptor,"rule memberDecl");
        RewriteRuleSubtreeStream stream_modifiers=new RewriteRuleSubtreeStream(adaptor,"rule modifiers");
        try { dbg.enterRule(getGrammarFileName(), "classBodyDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:107:5: ( ';' | modifiers memberDecl -> ^( MEMBER_DECLARATION modifiers memberDecl ) )
            int alt17=2;
            try { dbg.enterDecision(17);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==77) ) {
                alt17=1;
            }
            else if ( (LA17_0==Identifier||(LA17_0>=64 && LA17_0<=69)||LA17_0==72||LA17_0==80||(LA17_0>=85 && LA17_0<=90)||(LA17_0>=93 && LA17_0<=100)) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:107:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(107,9);
                    char_literal34=(Token)match(input,77,FOLLOW_77_in_classBodyDeclaration629); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:108:9: modifiers memberDecl
                    {
                    dbg.location(108,9);
                    pushFollow(FOLLOW_modifiers_in_classBodyDeclaration639);
                    modifiers35=modifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiers.add(modifiers35.getTree());
                    dbg.location(108,19);
                    pushFollow(FOLLOW_memberDecl_in_classBodyDeclaration641);
                    memberDecl36=memberDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_memberDecl.add(memberDecl36.getTree());


                    // AST REWRITE
                    // elements: memberDecl, modifiers
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:30: -> ^( MEMBER_DECLARATION modifiers memberDecl )
                    {
                        dbg.location(108,33);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:108:33: ^( MEMBER_DECLARATION modifiers memberDecl )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(108,35);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MEMBER_DECLARATION, "MEMBER_DECLARATION"), root_1);

                        dbg.location(108,54);
                        adaptor.addChild(root_1, stream_modifiers.nextTree());
                        dbg.location(108,64);
                        adaptor.addChild(root_1, stream_memberDecl.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, classBodyDeclaration_StartIndex); }
        }
        dbg.location(109, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classBodyDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "classBodyDeclaration"

    public static class memberDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memberDecl"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:111:1: memberDecl : ( genericMethodOrConstructorDecl | memberDeclaration | Identifier constructorDeclaratorRest | classDeclaration );
    public final JavaParser.memberDecl_return memberDecl() throws RecognitionException {
        JavaParser.memberDecl_return retval = new JavaParser.memberDecl_return();
        retval.start = input.LT(1);
        int memberDecl_StartIndex = input.index();
        Object root_0 = null;

        Token Identifier39=null;
        JavaParser.genericMethodOrConstructorDecl_return genericMethodOrConstructorDecl37 = null;

        JavaParser.memberDeclaration_return memberDeclaration38 = null;

        JavaParser.constructorDeclaratorRest_return constructorDeclaratorRest40 = null;

        JavaParser.classDeclaration_return classDeclaration41 = null;


        Object Identifier39_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "memberDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(111, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:112:5: ( genericMethodOrConstructorDecl | memberDeclaration | Identifier constructorDeclaratorRest | classDeclaration )
            int alt18=4;
            try { dbg.enterDecision(18);

            switch ( input.LA(1) ) {
            case 72:
                {
                alt18=1;
                }
                break;
            case 80:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                {
                alt18=2;
                }
                break;
            case Identifier:
                {
                int LA18_3 = input.LA(2);

                if ( (LA18_3==78) ) {
                    alt18=3;
                }
                else if ( (LA18_3==Identifier||LA18_3==72||(LA18_3>=91 && LA18_3<=92)) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 69:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:112:9: genericMethodOrConstructorDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(112,9);
                    pushFollow(FOLLOW_genericMethodOrConstructorDecl_in_memberDecl674);
                    genericMethodOrConstructorDecl37=genericMethodOrConstructorDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericMethodOrConstructorDecl37.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:113:9: memberDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(113,9);
                    pushFollow(FOLLOW_memberDeclaration_in_memberDecl684);
                    memberDeclaration38=memberDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, memberDeclaration38.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:114:9: Identifier constructorDeclaratorRest
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(114,9);
                    Identifier39=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberDecl694); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier39_tree = (Object)adaptor.create(Identifier39);
                    adaptor.addChild(root_0, Identifier39_tree);
                    }
                    dbg.location(114,20);
                    pushFollow(FOLLOW_constructorDeclaratorRest_in_memberDecl696);
                    constructorDeclaratorRest40=constructorDeclaratorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constructorDeclaratorRest40.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:115:9: classDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(115,9);
                    pushFollow(FOLLOW_classDeclaration_in_memberDecl706);
                    classDeclaration41=classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration41.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, memberDecl_StartIndex); }
        }
        dbg.location(116, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "memberDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "memberDecl"

    public static class memberDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memberDeclaration"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:118:1: memberDeclaration : (mtypename= mtype method_name= Identifier '(' ( formalParameterDecls )? ')' methodBody -> ^( TYPE_NAME $mtypename) ^( METHOD_NAME $method_name) ^( METHOD_INPUT ( formalParameterDecls )? ) ^( METHOD_BODY methodBody ) | typename= type fieldDeclaration -> ^( TYPE_NAME $typename) ^( VAL fieldDeclaration ) );
    public final JavaParser.memberDeclaration_return memberDeclaration() throws RecognitionException {
        JavaParser.memberDeclaration_return retval = new JavaParser.memberDeclaration_return();
        retval.start = input.LT(1);
        int memberDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token method_name=null;
        Token char_literal42=null;
        Token char_literal44=null;
        JavaParser.mtype_return mtypename = null;

        JavaParser.type_return typename = null;

        JavaParser.formalParameterDecls_return formalParameterDecls43 = null;

        JavaParser.methodBody_return methodBody45 = null;

        JavaParser.fieldDeclaration_return fieldDeclaration46 = null;


        Object method_name_tree=null;
        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_methodBody=new RewriteRuleSubtreeStream(adaptor,"rule methodBody");
        RewriteRuleSubtreeStream stream_formalParameterDecls=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterDecls");
        RewriteRuleSubtreeStream stream_fieldDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule fieldDeclaration");
        RewriteRuleSubtreeStream stream_mtype=new RewriteRuleSubtreeStream(adaptor,"rule mtype");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "memberDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:119:5: (mtypename= mtype method_name= Identifier '(' ( formalParameterDecls )? ')' methodBody -> ^( TYPE_NAME $mtypename) ^( METHOD_NAME $method_name) ^( METHOD_INPUT ( formalParameterDecls )? ) ^( METHOD_BODY methodBody ) | typename= type fieldDeclaration -> ^( TYPE_NAME $typename) ^( VAL fieldDeclaration ) )
            int alt20=2;
            try { dbg.enterDecision(20);

            switch ( input.LA(1) ) {
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                {
                int LA20_1 = input.LA(2);

                if ( (synpred25_Java()) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case Identifier:
                {
                int LA20_2 = input.LA(2);

                if ( (synpred25_Java()) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 80:
                {
                alt20=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:119:9: mtypename= mtype method_name= Identifier '(' ( formalParameterDecls )? ')' methodBody
                    {
                    dbg.location(119,19);
                    pushFollow(FOLLOW_mtype_in_memberDeclaration733);
                    mtypename=mtype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_mtype.add(mtypename.getTree());
                    dbg.location(119,41);
                    method_name=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberDeclaration741); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(method_name);

                    dbg.location(119,56);
                    char_literal42=(Token)match(input,78,FOLLOW_78_in_memberDeclaration745); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_78.add(char_literal42);

                    dbg.location(119,60);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:119:60: ( formalParameterDecls )?
                    int alt19=2;
                    try { dbg.enterSubRule(19);
                    try { dbg.enterDecision(19);

                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==Identifier||LA19_0==85||(LA19_0>=93 && LA19_0<=100)) ) {
                        alt19=1;
                    }
                    } finally {dbg.exitDecision(19);}

                    switch (alt19) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: formalParameterDecls
                            {
                            dbg.location(119,60);
                            pushFollow(FOLLOW_formalParameterDecls_in_memberDeclaration747);
                            formalParameterDecls43=formalParameterDecls();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formalParameterDecls.add(formalParameterDecls43.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(19);}

                    dbg.location(119,82);
                    char_literal44=(Token)match(input,79,FOLLOW_79_in_memberDeclaration750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_79.add(char_literal44);

                    dbg.location(119,88);
                    pushFollow(FOLLOW_methodBody_in_memberDeclaration754);
                    methodBody45=methodBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_methodBody.add(methodBody45.getTree());


                    // AST REWRITE
                    // elements: methodBody, method_name, mtypename, formalParameterDecls
                    // token labels: method_name
                    // rule labels: retval, mtypename
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_method_name=new RewriteRuleTokenStream(adaptor,"token method_name",method_name);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_mtypename=new RewriteRuleSubtreeStream(adaptor,"rule mtypename",mtypename!=null?mtypename.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 119:99: -> ^( TYPE_NAME $mtypename) ^( METHOD_NAME $method_name) ^( METHOD_INPUT ( formalParameterDecls )? ) ^( METHOD_BODY methodBody )
                    {
                        dbg.location(119,102);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:119:102: ^( TYPE_NAME $mtypename)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(119,104);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_NAME, "TYPE_NAME"), root_1);

                        dbg.location(119,114);
                        adaptor.addChild(root_1, stream_mtypename.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        dbg.location(119,126);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:119:126: ^( METHOD_NAME $method_name)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(119,128);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD_NAME, "METHOD_NAME"), root_1);

                        dbg.location(119,140);
                        adaptor.addChild(root_1, stream_method_name.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        dbg.location(119,154);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:119:154: ^( METHOD_INPUT ( formalParameterDecls )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(119,156);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD_INPUT, "METHOD_INPUT"), root_1);

                        dbg.location(119,169);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:119:169: ( formalParameterDecls )?
                        if ( stream_formalParameterDecls.hasNext() ) {
                            dbg.location(119,169);
                            adaptor.addChild(root_1, stream_formalParameterDecls.nextTree());

                        }
                        stream_formalParameterDecls.reset();

                        adaptor.addChild(root_0, root_1);
                        }
                        dbg.location(119,192);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:119:192: ^( METHOD_BODY methodBody )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(119,194);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD_BODY, "METHOD_BODY"), root_1);

                        dbg.location(119,206);
                        adaptor.addChild(root_1, stream_methodBody.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:120:4: typename= type fieldDeclaration
                    {
                    dbg.location(120,13);
                    pushFollow(FOLLOW_type_in_memberDeclaration793);
                    typename=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(typename.getTree());
                    dbg.location(120,20);
                    pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration795);
                    fieldDeclaration46=fieldDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldDeclaration.add(fieldDeclaration46.getTree());


                    // AST REWRITE
                    // elements: fieldDeclaration, typename
                    // token labels: 
                    // rule labels: retval, typename
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename",typename!=null?typename.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 120:37: -> ^( TYPE_NAME $typename) ^( VAL fieldDeclaration )
                    {
                        dbg.location(120,40);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:120:40: ^( TYPE_NAME $typename)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(120,42);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_NAME, "TYPE_NAME"), root_1);

                        dbg.location(120,52);
                        adaptor.addChild(root_1, stream_typename.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        dbg.location(120,62);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:120:62: ^( VAL fieldDeclaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(120,64);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAL, "VAL"), root_1);

                        dbg.location(120,68);
                        adaptor.addChild(root_1, stream_fieldDeclaration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, memberDeclaration_StartIndex); }
        }
        dbg.location(121, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "memberDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "memberDeclaration"

    public static class mtype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mtype"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:123:1: mtype : ( type | 'void' );
    public final JavaParser.mtype_return mtype() throws RecognitionException {
        JavaParser.mtype_return retval = new JavaParser.mtype_return();
        retval.start = input.LT(1);
        int mtype_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal48=null;
        JavaParser.type_return type47 = null;


        Object string_literal48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mtype");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:124:5: ( type | 'void' )
            int alt21=2;
            try { dbg.enterDecision(21);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==Identifier||(LA21_0>=93 && LA21_0<=100)) ) {
                alt21=1;
            }
            else if ( (LA21_0==80) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:124:6: type
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(124,6);
                    pushFollow(FOLLOW_type_in_mtype825);
                    type47=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type47.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:125:3: 'void'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(125,3);
                    string_literal48=(Token)match(input,80,FOLLOW_80_in_mtype829); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal48_tree = (Object)adaptor.create(string_literal48);
                    adaptor.addChild(root_0, string_literal48_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, mtype_StartIndex); }
        }
        dbg.location(126, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mtype");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mtype"

    public static class genericMethodOrConstructorDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "genericMethodOrConstructorDecl"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:128:1: genericMethodOrConstructorDecl : typeParameters genericMethodOrConstructorRest ;
    public final JavaParser.genericMethodOrConstructorDecl_return genericMethodOrConstructorDecl() throws RecognitionException {
        JavaParser.genericMethodOrConstructorDecl_return retval = new JavaParser.genericMethodOrConstructorDecl_return();
        retval.start = input.LT(1);
        int genericMethodOrConstructorDecl_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.typeParameters_return typeParameters49 = null;

        JavaParser.genericMethodOrConstructorRest_return genericMethodOrConstructorRest50 = null;



        try { dbg.enterRule(getGrammarFileName(), "genericMethodOrConstructorDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:129:5: ( typeParameters genericMethodOrConstructorRest )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:129:9: typeParameters genericMethodOrConstructorRest
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(129,9);
            pushFollow(FOLLOW_typeParameters_in_genericMethodOrConstructorDecl846);
            typeParameters49=typeParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParameters49.getTree());
            dbg.location(129,24);
            pushFollow(FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl848);
            genericMethodOrConstructorRest50=genericMethodOrConstructorRest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, genericMethodOrConstructorRest50.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, genericMethodOrConstructorDecl_StartIndex); }
        }
        dbg.location(130, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "genericMethodOrConstructorDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "genericMethodOrConstructorDecl"

    public static class genericMethodOrConstructorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "genericMethodOrConstructorRest"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:132:1: genericMethodOrConstructorRest : ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest );
    public final JavaParser.genericMethodOrConstructorRest_return genericMethodOrConstructorRest() throws RecognitionException {
        JavaParser.genericMethodOrConstructorRest_return retval = new JavaParser.genericMethodOrConstructorRest_return();
        retval.start = input.LT(1);
        int genericMethodOrConstructorRest_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal52=null;
        Token Identifier53=null;
        Token Identifier55=null;
        JavaParser.type_return type51 = null;

        JavaParser.methodDeclaratorRest_return methodDeclaratorRest54 = null;

        JavaParser.constructorDeclaratorRest_return constructorDeclaratorRest56 = null;


        Object string_literal52_tree=null;
        Object Identifier53_tree=null;
        Object Identifier55_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "genericMethodOrConstructorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(132, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:133:5: ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest )
            int alt23=2;
            try { dbg.enterDecision(23);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==80||(LA23_0>=93 && LA23_0<=100)) ) {
                alt23=1;
            }
            else if ( (LA23_0==Identifier) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==78) ) {
                    alt23=2;
                }
                else if ( (LA23_2==Identifier||LA23_2==72||(LA23_2>=91 && LA23_2<=92)) ) {
                    alt23=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:133:9: ( type | 'void' ) Identifier methodDeclaratorRest
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(133,9);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:133:9: ( type | 'void' )
                    int alt22=2;
                    try { dbg.enterSubRule(22);
                    try { dbg.enterDecision(22);

                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==Identifier||(LA22_0>=93 && LA22_0<=100)) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==80) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(22);}

                    switch (alt22) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:133:10: type
                            {
                            dbg.location(133,10);
                            pushFollow(FOLLOW_type_in_genericMethodOrConstructorRest872);
                            type51=type();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, type51.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:133:17: 'void'
                            {
                            dbg.location(133,17);
                            string_literal52=(Token)match(input,80,FOLLOW_80_in_genericMethodOrConstructorRest876); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal52_tree = (Object)adaptor.create(string_literal52);
                            adaptor.addChild(root_0, string_literal52_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(22);}

                    dbg.location(133,25);
                    Identifier53=(Token)match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest879); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier53_tree = (Object)adaptor.create(Identifier53);
                    adaptor.addChild(root_0, Identifier53_tree);
                    }
                    dbg.location(133,36);
                    pushFollow(FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest881);
                    methodDeclaratorRest54=methodDeclaratorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaratorRest54.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:134:9: Identifier constructorDeclaratorRest
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(134,9);
                    Identifier55=(Token)match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest891); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier55_tree = (Object)adaptor.create(Identifier55);
                    adaptor.addChild(root_0, Identifier55_tree);
                    }
                    dbg.location(134,20);
                    pushFollow(FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest893);
                    constructorDeclaratorRest56=constructorDeclaratorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constructorDeclaratorRest56.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, genericMethodOrConstructorRest_StartIndex); }
        }
        dbg.location(135, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "genericMethodOrConstructorRest");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "genericMethodOrConstructorRest"

    public static class fieldDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDeclaration"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:137:1: fieldDeclaration : variableDeclarators ';' ;
    public final JavaParser.fieldDeclaration_return fieldDeclaration() throws RecognitionException {
        JavaParser.fieldDeclaration_return retval = new JavaParser.fieldDeclaration_return();
        retval.start = input.LT(1);
        int fieldDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal58=null;
        JavaParser.variableDeclarators_return variableDeclarators57 = null;


        Object char_literal58_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fieldDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:138:5: ( variableDeclarators ';' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:138:9: variableDeclarators ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(138,9);
            pushFollow(FOLLOW_variableDeclarators_in_fieldDeclaration912);
            variableDeclarators57=variableDeclarators();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarators57.getTree());
            dbg.location(138,32);
            char_literal58=(Token)match(input,77,FOLLOW_77_in_fieldDeclaration914); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, fieldDeclaration_StartIndex); }
        }
        dbg.location(139, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fieldDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fieldDeclaration"

    public static class methodDeclaratorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDeclaratorRest"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:141:1: methodDeclaratorRest : formalParameters ( '[' ']' )* ( methodBody | ';' ) ;
    public final JavaParser.methodDeclaratorRest_return methodDeclaratorRest() throws RecognitionException {
        JavaParser.methodDeclaratorRest_return retval = new JavaParser.methodDeclaratorRest_return();
        retval.start = input.LT(1);
        int methodDeclaratorRest_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal60=null;
        Token char_literal61=null;
        Token char_literal63=null;
        JavaParser.formalParameters_return formalParameters59 = null;

        JavaParser.methodBody_return methodBody62 = null;


        Object char_literal60_tree=null;
        Object char_literal61_tree=null;
        Object char_literal63_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "methodDeclaratorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(141, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:142:5: ( formalParameters ( '[' ']' )* ( methodBody | ';' ) )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:142:9: formalParameters ( '[' ']' )* ( methodBody | ';' )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(142,9);
            pushFollow(FOLLOW_formalParameters_in_methodDeclaratorRest938);
            formalParameters59=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters59.getTree());
            dbg.location(142,26);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:142:26: ( '[' ']' )*
            try { dbg.enterSubRule(24);

            loop24:
            do {
                int alt24=2;
                try { dbg.enterDecision(24);

                int LA24_0 = input.LA(1);

                if ( (LA24_0==81) ) {
                    alt24=1;
                }


                } finally {dbg.exitDecision(24);}

                switch (alt24) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:142:27: '[' ']'
            	    {
            	    dbg.location(142,27);
            	    char_literal60=(Token)match(input,81,FOLLOW_81_in_methodDeclaratorRest941); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal60_tree = (Object)adaptor.create(char_literal60);
            	    adaptor.addChild(root_0, char_literal60_tree);
            	    }
            	    dbg.location(142,31);
            	    char_literal61=(Token)match(input,82,FOLLOW_82_in_methodDeclaratorRest943); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal61_tree = (Object)adaptor.create(char_literal61);
            	    adaptor.addChild(root_0, char_literal61_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);
            } finally {dbg.exitSubRule(24);}

            dbg.location(143,9);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:143:9: ( methodBody | ';' )
            int alt25=2;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==70) ) {
                alt25=1;
            }
            else if ( (LA25_0==77) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:143:13: methodBody
                    {
                    dbg.location(143,13);
                    pushFollow(FOLLOW_methodBody_in_methodDeclaratorRest959);
                    methodBody62=methodBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody62.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:144:13: ';'
                    {
                    dbg.location(144,13);
                    char_literal63=(Token)match(input,77,FOLLOW_77_in_methodDeclaratorRest973); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal63_tree = (Object)adaptor.create(char_literal63);
                    adaptor.addChild(root_0, char_literal63_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, methodDeclaratorRest_StartIndex); }
        }
        dbg.location(146, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "methodDeclaratorRest");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "methodDeclaratorRest"

    public static class voidMethodDeclaratorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "voidMethodDeclaratorRest"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:148:1: voidMethodDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' ) ;
    public final JavaParser.voidMethodDeclaratorRest_return voidMethodDeclaratorRest() throws RecognitionException {
        JavaParser.voidMethodDeclaratorRest_return retval = new JavaParser.voidMethodDeclaratorRest_return();
        retval.start = input.LT(1);
        int voidMethodDeclaratorRest_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal65=null;
        Token char_literal68=null;
        JavaParser.formalParameters_return formalParameters64 = null;

        JavaParser.qualifiedNameList_return qualifiedNameList66 = null;

        JavaParser.methodBody_return methodBody67 = null;


        Object string_literal65_tree=null;
        Object char_literal68_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "voidMethodDeclaratorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:149:5: ( formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' ) )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:149:9: formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(149,9);
            pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest1007);
            formalParameters64=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters64.getTree());
            dbg.location(149,26);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:149:26: ( 'throws' qualifiedNameList )?
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==83) ) {
                alt26=1;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:149:27: 'throws' qualifiedNameList
                    {
                    dbg.location(149,27);
                    string_literal65=(Token)match(input,83,FOLLOW_83_in_voidMethodDeclaratorRest1010); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal65_tree = (Object)adaptor.create(string_literal65);
                    adaptor.addChild(root_0, string_literal65_tree);
                    }
                    dbg.location(149,36);
                    pushFollow(FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest1012);
                    qualifiedNameList66=qualifiedNameList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList66.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(26);}

            dbg.location(150,9);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:150:9: ( methodBody | ';' )
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==70) ) {
                alt27=1;
            }
            else if ( (LA27_0==77) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:150:13: methodBody
                    {
                    dbg.location(150,13);
                    pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest1028);
                    methodBody67=methodBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody67.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:151:13: ';'
                    {
                    dbg.location(151,13);
                    char_literal68=(Token)match(input,77,FOLLOW_77_in_voidMethodDeclaratorRest1042); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal68_tree = (Object)adaptor.create(char_literal68);
                    adaptor.addChild(root_0, char_literal68_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, voidMethodDeclaratorRest_StartIndex); }
        }
        dbg.location(153, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "voidMethodDeclaratorRest");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "voidMethodDeclaratorRest"

    public static class constructorDeclaratorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructorDeclaratorRest"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:155:1: constructorDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? constructorBody ;
    public final JavaParser.constructorDeclaratorRest_return constructorDeclaratorRest() throws RecognitionException {
        JavaParser.constructorDeclaratorRest_return retval = new JavaParser.constructorDeclaratorRest_return();
        retval.start = input.LT(1);
        int constructorDeclaratorRest_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal70=null;
        JavaParser.formalParameters_return formalParameters69 = null;

        JavaParser.qualifiedNameList_return qualifiedNameList71 = null;

        JavaParser.constructorBody_return constructorBody72 = null;


        Object string_literal70_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "constructorDeclaratorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:156:5: ( formalParameters ( 'throws' qualifiedNameList )? constructorBody )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:156:9: formalParameters ( 'throws' qualifiedNameList )? constructorBody
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(156,9);
            pushFollow(FOLLOW_formalParameters_in_constructorDeclaratorRest1075);
            formalParameters69=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters69.getTree());
            dbg.location(156,26);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:156:26: ( 'throws' qualifiedNameList )?
            int alt28=2;
            try { dbg.enterSubRule(28);
            try { dbg.enterDecision(28);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==83) ) {
                alt28=1;
            }
            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:156:27: 'throws' qualifiedNameList
                    {
                    dbg.location(156,27);
                    string_literal70=(Token)match(input,83,FOLLOW_83_in_constructorDeclaratorRest1078); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal70_tree = (Object)adaptor.create(string_literal70);
                    adaptor.addChild(root_0, string_literal70_tree);
                    }
                    dbg.location(156,36);
                    pushFollow(FOLLOW_qualifiedNameList_in_constructorDeclaratorRest1080);
                    qualifiedNameList71=qualifiedNameList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedNameList71.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(28);}

            dbg.location(156,56);
            pushFollow(FOLLOW_constructorBody_in_constructorDeclaratorRest1084);
            constructorBody72=constructorBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constructorBody72.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, constructorDeclaratorRest_StartIndex); }
        }
        dbg.location(157, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constructorDeclaratorRest");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constructorDeclaratorRest"

    public static class constantDeclarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantDeclarator"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:159:1: constantDeclarator : Identifier constantDeclaratorRest ;
    public final JavaParser.constantDeclarator_return constantDeclarator() throws RecognitionException {
        JavaParser.constantDeclarator_return retval = new JavaParser.constantDeclarator_return();
        retval.start = input.LT(1);
        int constantDeclarator_StartIndex = input.index();
        Object root_0 = null;

        Token Identifier73=null;
        JavaParser.constantDeclaratorRest_return constantDeclaratorRest74 = null;


        Object Identifier73_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "constantDeclarator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(159, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:160:5: ( Identifier constantDeclaratorRest )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:160:9: Identifier constantDeclaratorRest
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(160,9);
            Identifier73=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantDeclarator1103); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier73_tree = (Object)adaptor.create(Identifier73);
            adaptor.addChild(root_0, Identifier73_tree);
            }
            dbg.location(160,20);
            pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclarator1105);
            constantDeclaratorRest74=constantDeclaratorRest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclaratorRest74.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, constantDeclarator_StartIndex); }
        }
        dbg.location(161, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constantDeclarator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constantDeclarator"

    public static class variableDeclarators_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarators"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:163:1: variableDeclarators : variableDeclarator ( ',' variableDeclarator )* ;
    public final JavaParser.variableDeclarators_return variableDeclarators() throws RecognitionException {
        JavaParser.variableDeclarators_return retval = new JavaParser.variableDeclarators_return();
        retval.start = input.LT(1);
        int variableDeclarators_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal76=null;
        JavaParser.variableDeclarator_return variableDeclarator75 = null;

        JavaParser.variableDeclarator_return variableDeclarator77 = null;


        Object char_literal76_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variableDeclarators");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(163, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:164:5: ( variableDeclarator ( ',' variableDeclarator )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:164:9: variableDeclarator ( ',' variableDeclarator )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(164,9);
            pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1128);
            variableDeclarator75=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarator75.getTree());
            dbg.location(164,28);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:164:28: ( ',' variableDeclarator )*
            try { dbg.enterSubRule(29);

            loop29:
            do {
                int alt29=2;
                try { dbg.enterDecision(29);

                int LA29_0 = input.LA(1);

                if ( (LA29_0==73) ) {
                    alt29=1;
                }


                } finally {dbg.exitDecision(29);}

                switch (alt29) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:164:29: ',' variableDeclarator
            	    {
            	    dbg.location(164,32);
            	    char_literal76=(Token)match(input,73,FOLLOW_73_in_variableDeclarators1131); if (state.failed) return retval;
            	    dbg.location(164,34);
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1134);
            	    variableDeclarator77=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarator77.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);
            } finally {dbg.exitSubRule(29);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, variableDeclarators_StartIndex); }
        }
        dbg.location(165, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableDeclarators");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variableDeclarators"

    public static class variableDeclarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarator"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:167:1: variableDeclarator : variableDeclaratorId ( assign variableInitializer )? ;
    public final JavaParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        JavaParser.variableDeclarator_return retval = new JavaParser.variableDeclarator_return();
        retval.start = input.LT(1);
        int variableDeclarator_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.variableDeclaratorId_return variableDeclaratorId78 = null;

        JavaParser.assign_return assign79 = null;

        JavaParser.variableInitializer_return variableInitializer80 = null;



        try { dbg.enterRule(getGrammarFileName(), "variableDeclarator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(167, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:168:5: ( variableDeclaratorId ( assign variableInitializer )? )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:168:9: variableDeclaratorId ( assign variableInitializer )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(168,9);
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator1155);
            variableDeclaratorId78=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId78.getTree());
            dbg.location(168,30);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:168:30: ( assign variableInitializer )?
            int alt30=2;
            try { dbg.enterSubRule(30);
            try { dbg.enterDecision(30);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==84) ) {
                alt30=1;
            }
            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:168:31: assign variableInitializer
                    {
                    dbg.location(168,37);
                    pushFollow(FOLLOW_assign_in_variableDeclarator1158);
                    assign79=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assign79.getTree(), root_0);
                    dbg.location(168,39);
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator1161);
                    variableInitializer80=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer80.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(30);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, variableDeclarator_StartIndex); }
        }
        dbg.location(169, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableDeclarator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variableDeclarator"

    public static class assign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assign"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:171:1: assign : '=' ;
    public final JavaParser.assign_return assign() throws RecognitionException {
        JavaParser.assign_return retval = new JavaParser.assign_return();
        retval.start = input.LT(1);
        int assign_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal81=null;

        Object char_literal81_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assign");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:171:8: ( '=' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:171:10: '='
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(171,10);
            char_literal81=(Token)match(input,84,FOLLOW_84_in_assign1177); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal81_tree = (Object)adaptor.create(char_literal81);
            adaptor.addChild(root_0, char_literal81_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, assign_StartIndex); }
        }
        dbg.location(171, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assign");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assign"

    public static class constantDeclaratorsRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantDeclaratorsRest"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:173:1: constantDeclaratorsRest : constantDeclaratorRest ( ',' constantDeclarator )* ;
    public final JavaParser.constantDeclaratorsRest_return constantDeclaratorsRest() throws RecognitionException {
        JavaParser.constantDeclaratorsRest_return retval = new JavaParser.constantDeclaratorsRest_return();
        retval.start = input.LT(1);
        int constantDeclaratorsRest_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal83=null;
        JavaParser.constantDeclaratorRest_return constantDeclaratorRest82 = null;

        JavaParser.constantDeclarator_return constantDeclarator84 = null;


        Object char_literal83_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "constantDeclaratorsRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(173, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:174:5: ( constantDeclaratorRest ( ',' constantDeclarator )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:174:9: constantDeclaratorRest ( ',' constantDeclarator )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(174,9);
            pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest1196);
            constantDeclaratorRest82=constantDeclaratorRest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclaratorRest82.getTree());
            dbg.location(174,32);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:174:32: ( ',' constantDeclarator )*
            try { dbg.enterSubRule(31);

            loop31:
            do {
                int alt31=2;
                try { dbg.enterDecision(31);

                int LA31_0 = input.LA(1);

                if ( (LA31_0==73) ) {
                    alt31=1;
                }


                } finally {dbg.exitDecision(31);}

                switch (alt31) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:174:33: ',' constantDeclarator
            	    {
            	    dbg.location(174,33);
            	    char_literal83=(Token)match(input,73,FOLLOW_73_in_constantDeclaratorsRest1199); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal83_tree = (Object)adaptor.create(char_literal83);
            	    adaptor.addChild(root_0, char_literal83_tree);
            	    }
            	    dbg.location(174,37);
            	    pushFollow(FOLLOW_constantDeclarator_in_constantDeclaratorsRest1201);
            	    constantDeclarator84=constantDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclarator84.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);
            } finally {dbg.exitSubRule(31);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, constantDeclaratorsRest_StartIndex); }
        }
        dbg.location(175, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constantDeclaratorsRest");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constantDeclaratorsRest"

    public static class constantDeclaratorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantDeclaratorRest"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:177:1: constantDeclaratorRest : ( '[' ']' )* '=' variableInitializer ;
    public final JavaParser.constantDeclaratorRest_return constantDeclaratorRest() throws RecognitionException {
        JavaParser.constantDeclaratorRest_return retval = new JavaParser.constantDeclaratorRest_return();
        retval.start = input.LT(1);
        int constantDeclaratorRest_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal85=null;
        Token char_literal86=null;
        Token char_literal87=null;
        JavaParser.variableInitializer_return variableInitializer88 = null;


        Object char_literal85_tree=null;
        Object char_literal86_tree=null;
        Object char_literal87_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "constantDeclaratorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(177, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:178:5: ( ( '[' ']' )* '=' variableInitializer )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:178:9: ( '[' ']' )* '=' variableInitializer
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(178,9);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:178:9: ( '[' ']' )*
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=2;
                try { dbg.enterDecision(32);

                int LA32_0 = input.LA(1);

                if ( (LA32_0==81) ) {
                    alt32=1;
                }


                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:178:10: '[' ']'
            	    {
            	    dbg.location(178,10);
            	    char_literal85=(Token)match(input,81,FOLLOW_81_in_constantDeclaratorRest1223); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal85_tree = (Object)adaptor.create(char_literal85);
            	    adaptor.addChild(root_0, char_literal85_tree);
            	    }
            	    dbg.location(178,14);
            	    char_literal86=(Token)match(input,82,FOLLOW_82_in_constantDeclaratorRest1225); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal86_tree = (Object)adaptor.create(char_literal86);
            	    adaptor.addChild(root_0, char_literal86_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);
            } finally {dbg.exitSubRule(32);}

            dbg.location(178,20);
            char_literal87=(Token)match(input,84,FOLLOW_84_in_constantDeclaratorRest1229); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal87_tree = (Object)adaptor.create(char_literal87);
            adaptor.addChild(root_0, char_literal87_tree);
            }
            dbg.location(178,24);
            pushFollow(FOLLOW_variableInitializer_in_constantDeclaratorRest1231);
            variableInitializer88=variableInitializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer88.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, constantDeclaratorRest_StartIndex); }
        }
        dbg.location(179, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constantDeclaratorRest");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constantDeclaratorRest"

    public static class variableDeclaratorId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaratorId"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:181:1: variableDeclaratorId : Identifier ( '[' ']' )* ;
    public final JavaParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        JavaParser.variableDeclaratorId_return retval = new JavaParser.variableDeclaratorId_return();
        retval.start = input.LT(1);
        int variableDeclaratorId_StartIndex = input.index();
        Object root_0 = null;

        Token Identifier89=null;
        Token char_literal90=null;
        Token char_literal91=null;

        Object Identifier89_tree=null;
        Object char_literal90_tree=null;
        Object char_literal91_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variableDeclaratorId");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(181, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:182:5: ( Identifier ( '[' ']' )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:182:9: Identifier ( '[' ']' )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(182,9);
            Identifier89=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclaratorId1254); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier89_tree = (Object)adaptor.create(Identifier89);
            adaptor.addChild(root_0, Identifier89_tree);
            }
            dbg.location(182,20);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:182:20: ( '[' ']' )*
            try { dbg.enterSubRule(33);

            loop33:
            do {
                int alt33=2;
                try { dbg.enterDecision(33);

                int LA33_0 = input.LA(1);

                if ( (LA33_0==81) ) {
                    alt33=1;
                }


                } finally {dbg.exitDecision(33);}

                switch (alt33) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:182:21: '[' ']'
            	    {
            	    dbg.location(182,21);
            	    char_literal90=(Token)match(input,81,FOLLOW_81_in_variableDeclaratorId1257); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal90_tree = (Object)adaptor.create(char_literal90);
            	    adaptor.addChild(root_0, char_literal90_tree);
            	    }
            	    dbg.location(182,24);
            	    char_literal91=(Token)match(input,82,FOLLOW_82_in_variableDeclaratorId1258); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal91_tree = (Object)adaptor.create(char_literal91);
            	    adaptor.addChild(root_0, char_literal91_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);
            } finally {dbg.exitSubRule(33);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, variableDeclaratorId_StartIndex); }
        }
        dbg.location(183, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableDeclaratorId");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variableDeclaratorId"

    public static class variableInitializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableInitializer"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:185:1: variableInitializer : ( arrayInitializer | expression );
    public final JavaParser.variableInitializer_return variableInitializer() throws RecognitionException {
        JavaParser.variableInitializer_return retval = new JavaParser.variableInitializer_return();
        retval.start = input.LT(1);
        int variableInitializer_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.arrayInitializer_return arrayInitializer92 = null;

        JavaParser.expression_return expression93 = null;



        try { dbg.enterRule(getGrammarFileName(), "variableInitializer");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(185, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:186:5: ( arrayInitializer | expression )
            int alt34=2;
            try { dbg.enterDecision(34);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==70) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=Identifier && LA34_0<=DecimalLiteral)||LA34_0==78||LA34_0==80||(LA34_0>=93 && LA34_0<=100)||(LA34_0>=102 && LA34_0<=106)||(LA34_0>=134 && LA34_0<=135)||(LA34_0>=139 && LA34_0<=144)) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:186:9: arrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(186,9);
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer1279);
                    arrayInitializer92=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer92.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:187:9: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(187,9);
                    pushFollow(FOLLOW_expression_in_variableInitializer1289);
                    expression93=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression93.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, variableInitializer_StartIndex); }
        }
        dbg.location(188, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableInitializer");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variableInitializer"

    public static class arrayInitializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayInitializer"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:190:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' ;
    public final JavaParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
        JavaParser.arrayInitializer_return retval = new JavaParser.arrayInitializer_return();
        retval.start = input.LT(1);
        int arrayInitializer_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal94=null;
        Token char_literal96=null;
        Token char_literal98=null;
        Token char_literal99=null;
        JavaParser.variableInitializer_return variableInitializer95 = null;

        JavaParser.variableInitializer_return variableInitializer97 = null;


        Object char_literal94_tree=null;
        Object char_literal96_tree=null;
        Object char_literal98_tree=null;
        Object char_literal99_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arrayInitializer");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(190, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:191:5: ( '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:191:9: '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(191,9);
            char_literal94=(Token)match(input,70,FOLLOW_70_in_arrayInitializer1316); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal94_tree = (Object)adaptor.create(char_literal94);
            adaptor.addChild(root_0, char_literal94_tree);
            }
            dbg.location(191,13);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:191:13: ( variableInitializer ( ',' variableInitializer )* ( ',' )? )?
            int alt37=2;
            try { dbg.enterSubRule(37);
            try { dbg.enterDecision(37);

            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=Identifier && LA37_0<=DecimalLiteral)||LA37_0==70||LA37_0==78||LA37_0==80||(LA37_0>=93 && LA37_0<=100)||(LA37_0>=102 && LA37_0<=106)||(LA37_0>=134 && LA37_0<=135)||(LA37_0>=139 && LA37_0<=144)) ) {
                alt37=1;
            }
            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:191:14: variableInitializer ( ',' variableInitializer )* ( ',' )?
                    {
                    dbg.location(191,14);
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1319);
                    variableInitializer95=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer95.getTree());
                    dbg.location(191,34);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:191:34: ( ',' variableInitializer )*
                    try { dbg.enterSubRule(35);

                    loop35:
                    do {
                        int alt35=2;
                        try { dbg.enterDecision(35);

                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==73) ) {
                            int LA35_1 = input.LA(2);

                            if ( ((LA35_1>=Identifier && LA35_1<=DecimalLiteral)||LA35_1==70||LA35_1==78||LA35_1==80||(LA35_1>=93 && LA35_1<=100)||(LA35_1>=102 && LA35_1<=106)||(LA35_1>=134 && LA35_1<=135)||(LA35_1>=139 && LA35_1<=144)) ) {
                                alt35=1;
                            }


                        }


                        } finally {dbg.exitDecision(35);}

                        switch (alt35) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:191:35: ',' variableInitializer
                    	    {
                    	    dbg.location(191,35);
                    	    char_literal96=(Token)match(input,73,FOLLOW_73_in_arrayInitializer1322); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal96_tree = (Object)adaptor.create(char_literal96);
                    	    adaptor.addChild(root_0, char_literal96_tree);
                    	    }
                    	    dbg.location(191,39);
                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1324);
                    	    variableInitializer97=variableInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer97.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(35);}

                    dbg.location(191,61);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:191:61: ( ',' )?
                    int alt36=2;
                    try { dbg.enterSubRule(36);
                    try { dbg.enterDecision(36);

                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==73) ) {
                        alt36=1;
                    }
                    } finally {dbg.exitDecision(36);}

                    switch (alt36) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:191:62: ','
                            {
                            dbg.location(191,62);
                            char_literal98=(Token)match(input,73,FOLLOW_73_in_arrayInitializer1329); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal98_tree = (Object)adaptor.create(char_literal98);
                            adaptor.addChild(root_0, char_literal98_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(36);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(37);}

            dbg.location(191,71);
            char_literal99=(Token)match(input,71,FOLLOW_71_in_arrayInitializer1336); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal99_tree = (Object)adaptor.create(char_literal99);
            adaptor.addChild(root_0, char_literal99_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, arrayInitializer_StartIndex); }
        }
        dbg.location(192, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arrayInitializer");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arrayInitializer"

    public static class modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:194:1: modifier : ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' );
    public final JavaParser.modifier_return modifier() throws RecognitionException {
        JavaParser.modifier_return retval = new JavaParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        Object root_0 = null;

        Token set100=null;

        Object set100_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "modifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:195:5: ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(195,5);
            set100=(Token)input.LT(1);
            if ( (input.LA(1)>=64 && input.LA(1)<=68)||(input.LA(1)>=85 && input.LA(1)<=90) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set100));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, modifier_StartIndex); }
        }
        dbg.location(206, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "modifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "modifier"

    public static class packageOrTypeName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "packageOrTypeName"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:208:1: packageOrTypeName : qualifiedName ;
    public final JavaParser.packageOrTypeName_return packageOrTypeName() throws RecognitionException {
        JavaParser.packageOrTypeName_return retval = new JavaParser.packageOrTypeName_return();
        retval.start = input.LT(1);
        int packageOrTypeName_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.qualifiedName_return qualifiedName101 = null;



        try { dbg.enterRule(getGrammarFileName(), "packageOrTypeName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(208, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:209:5: ( qualifiedName )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:209:9: qualifiedName
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(209,9);
            pushFollow(FOLLOW_qualifiedName_in_packageOrTypeName1474);
            qualifiedName101=qualifiedName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName101.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, packageOrTypeName_StartIndex); }
        }
        dbg.location(210, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "packageOrTypeName");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "packageOrTypeName"

    public static class typeName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeName"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:212:1: typeName : qualifiedName ;
    public final JavaParser.typeName_return typeName() throws RecognitionException {
        JavaParser.typeName_return retval = new JavaParser.typeName_return();
        retval.start = input.LT(1);
        int typeName_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.qualifiedName_return qualifiedName102 = null;



        try { dbg.enterRule(getGrammarFileName(), "typeName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(212, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:213:5: ( qualifiedName )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:213:9: qualifiedName
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(213,9);
            pushFollow(FOLLOW_qualifiedName_in_typeName1493);
            qualifiedName102=qualifiedName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName102.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, typeName_StartIndex); }
        }
        dbg.location(214, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeName");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeName"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:216:1: type : ( primitiveType ( '[]' )* | classOrInterfaceType ( '[]' )* );
    public final JavaParser.type_return type() throws RecognitionException {
        JavaParser.type_return retval = new JavaParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal104=null;
        Token string_literal106=null;
        JavaParser.primitiveType_return primitiveType103 = null;

        JavaParser.classOrInterfaceType_return classOrInterfaceType105 = null;


        Object string_literal104_tree=null;
        Object string_literal106_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(216, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:217:2: ( primitiveType ( '[]' )* | classOrInterfaceType ( '[]' )* )
            int alt40=2;
            try { dbg.enterDecision(40);

            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=93 && LA40_0<=100)) ) {
                alt40=1;
            }
            else if ( (LA40_0==Identifier) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(40);}

            switch (alt40) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:217:3: primitiveType ( '[]' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(217,3);
                    pushFollow(FOLLOW_primitiveType_in_type1506);
                    primitiveType103=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType103.getTree());
                    dbg.location(217,17);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:217:17: ( '[]' )*
                    try { dbg.enterSubRule(38);

                    loop38:
                    do {
                        int alt38=2;
                        try { dbg.enterDecision(38);

                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==91) ) {
                            alt38=1;
                        }


                        } finally {dbg.exitDecision(38);}

                        switch (alt38) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:217:18: '[]'
                    	    {
                    	    dbg.location(217,18);
                    	    string_literal104=(Token)match(input,91,FOLLOW_91_in_type1509); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal104_tree = (Object)adaptor.create(string_literal104);
                    	    adaptor.addChild(root_0, string_literal104_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(38);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:218:3: classOrInterfaceType ( '[]' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(218,3);
                    pushFollow(FOLLOW_classOrInterfaceType_in_type1515);
                    classOrInterfaceType105=classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceType105.getTree());
                    dbg.location(218,24);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:218:24: ( '[]' )*
                    try { dbg.enterSubRule(39);

                    loop39:
                    do {
                        int alt39=2;
                        try { dbg.enterDecision(39);

                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==91) ) {
                            alt39=1;
                        }


                        } finally {dbg.exitDecision(39);}

                        switch (alt39) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:218:25: '[]'
                    	    {
                    	    dbg.location(218,25);
                    	    string_literal106=(Token)match(input,91,FOLLOW_91_in_type1518); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal106_tree = (Object)adaptor.create(string_literal106);
                    	    adaptor.addChild(root_0, string_literal106_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(39);}


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, type_StartIndex); }
        }
        dbg.location(219, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type"

    public static class classOrInterfaceType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classOrInterfaceType"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:221:1: classOrInterfaceType : Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* ;
    public final JavaParser.classOrInterfaceType_return classOrInterfaceType() throws RecognitionException {
        JavaParser.classOrInterfaceType_return retval = new JavaParser.classOrInterfaceType_return();
        retval.start = input.LT(1);
        int classOrInterfaceType_StartIndex = input.index();
        Object root_0 = null;

        Token Identifier107=null;
        Token char_literal109=null;
        Token Identifier110=null;
        JavaParser.typeArguments_return typeArguments108 = null;

        JavaParser.typeArguments_return typeArguments111 = null;


        Object Identifier107_tree=null;
        Object char_literal109_tree=null;
        Object Identifier110_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "classOrInterfaceType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(221, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:222:2: ( Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:222:3: Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(222,3);
            Identifier107=(Token)match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType1531); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier107_tree = (Object)adaptor.create(Identifier107);
            adaptor.addChild(root_0, Identifier107_tree);
            }
            dbg.location(222,14);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:222:14: ( typeArguments )?
            int alt41=2;
            try { dbg.enterSubRule(41);
            try { dbg.enterDecision(41);

            int LA41_0 = input.LA(1);

            if ( (LA41_0==72) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==Identifier||(LA41_1>=93 && LA41_1<=101)) ) {
                    alt41=1;
                }
            }
            } finally {dbg.exitDecision(41);}

            switch (alt41) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: typeArguments
                    {
                    dbg.location(222,14);
                    pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType1533);
                    typeArguments108=typeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArguments108.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(41);}

            dbg.location(222,29);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:222:29: ( '.' Identifier ( typeArguments )? )*
            try { dbg.enterSubRule(43);

            loop43:
            do {
                int alt43=2;
                try { dbg.enterDecision(43);

                int LA43_0 = input.LA(1);

                if ( (LA43_0==92) ) {
                    alt43=1;
                }


                } finally {dbg.exitDecision(43);}

                switch (alt43) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:222:30: '.' Identifier ( typeArguments )?
            	    {
            	    dbg.location(222,30);
            	    char_literal109=(Token)match(input,92,FOLLOW_92_in_classOrInterfaceType1537); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal109_tree = (Object)adaptor.create(char_literal109);
            	    adaptor.addChild(root_0, char_literal109_tree);
            	    }
            	    dbg.location(222,34);
            	    Identifier110=(Token)match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType1539); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Identifier110_tree = (Object)adaptor.create(Identifier110);
            	    adaptor.addChild(root_0, Identifier110_tree);
            	    }
            	    dbg.location(222,45);
            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:222:45: ( typeArguments )?
            	    int alt42=2;
            	    try { dbg.enterSubRule(42);
            	    try { dbg.enterDecision(42);

            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==72) ) {
            	        int LA42_1 = input.LA(2);

            	        if ( (LA42_1==Identifier||(LA42_1>=93 && LA42_1<=101)) ) {
            	            alt42=1;
            	        }
            	    }
            	    } finally {dbg.exitDecision(42);}

            	    switch (alt42) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: typeArguments
            	            {
            	            dbg.location(222,45);
            	            pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType1541);
            	            typeArguments111=typeArguments();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArguments111.getTree());

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(42);}


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);
            } finally {dbg.exitSubRule(43);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, classOrInterfaceType_StartIndex); }
        }
        dbg.location(223, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classOrInterfaceType");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "classOrInterfaceType"

    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:225:1: primitiveType : ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' );
    public final JavaParser.primitiveType_return primitiveType() throws RecognitionException {
        JavaParser.primitiveType_return retval = new JavaParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token set112=null;

        Object set112_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "primitiveType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(225, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:226:5: ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(226,5);
            set112=(Token)input.LT(1);
            if ( (input.LA(1)>=93 && input.LA(1)<=100) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set112));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, primitiveType_StartIndex); }
        }
        dbg.location(234, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primitiveType");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class variableModifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableModifier"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:236:1: variableModifier : 'final' ;
    public final JavaParser.variableModifier_return variableModifier() throws RecognitionException {
        JavaParser.variableModifier_return retval = new JavaParser.variableModifier_return();
        retval.start = input.LT(1);
        int variableModifier_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal113=null;

        Object string_literal113_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variableModifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(236, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:237:5: ( 'final' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:237:9: 'final'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(237,9);
            string_literal113=(Token)match(input,85,FOLLOW_85_in_variableModifier1650); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal113_tree = (Object)adaptor.create(string_literal113);
            adaptor.addChild(root_0, string_literal113_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, variableModifier_StartIndex); }
        }
        dbg.location(238, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableModifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variableModifier"

    public static class typeArguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeArguments"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:240:1: typeArguments : '<' typeArgument ( ',' typeArgument )* '>' ;
    public final JavaParser.typeArguments_return typeArguments() throws RecognitionException {
        JavaParser.typeArguments_return retval = new JavaParser.typeArguments_return();
        retval.start = input.LT(1);
        int typeArguments_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal114=null;
        Token char_literal116=null;
        Token char_literal118=null;
        JavaParser.typeArgument_return typeArgument115 = null;

        JavaParser.typeArgument_return typeArgument117 = null;


        Object char_literal114_tree=null;
        Object char_literal116_tree=null;
        Object char_literal118_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "typeArguments");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(240, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:241:5: ( '<' typeArgument ( ',' typeArgument )* '>' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:241:9: '<' typeArgument ( ',' typeArgument )* '>'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(241,9);
            char_literal114=(Token)match(input,72,FOLLOW_72_in_typeArguments1669); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal114_tree = (Object)adaptor.create(char_literal114);
            adaptor.addChild(root_0, char_literal114_tree);
            }
            dbg.location(241,13);
            pushFollow(FOLLOW_typeArgument_in_typeArguments1671);
            typeArgument115=typeArgument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArgument115.getTree());
            dbg.location(241,26);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:241:26: ( ',' typeArgument )*
            try { dbg.enterSubRule(44);

            loop44:
            do {
                int alt44=2;
                try { dbg.enterDecision(44);

                int LA44_0 = input.LA(1);

                if ( (LA44_0==73) ) {
                    alt44=1;
                }


                } finally {dbg.exitDecision(44);}

                switch (alt44) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:241:27: ',' typeArgument
            	    {
            	    dbg.location(241,27);
            	    char_literal116=(Token)match(input,73,FOLLOW_73_in_typeArguments1674); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal116_tree = (Object)adaptor.create(char_literal116);
            	    adaptor.addChild(root_0, char_literal116_tree);
            	    }
            	    dbg.location(241,31);
            	    pushFollow(FOLLOW_typeArgument_in_typeArguments1676);
            	    typeArgument117=typeArgument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArgument117.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);
            } finally {dbg.exitSubRule(44);}

            dbg.location(241,46);
            char_literal118=(Token)match(input,74,FOLLOW_74_in_typeArguments1680); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal118_tree = (Object)adaptor.create(char_literal118);
            adaptor.addChild(root_0, char_literal118_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, typeArguments_StartIndex); }
        }
        dbg.location(242, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeArguments");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeArguments"

    public static class typeArgument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeArgument"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:244:1: typeArgument : ( type | '?' ( ( 'extends' | 'super' ) type )? );
    public final JavaParser.typeArgument_return typeArgument() throws RecognitionException {
        JavaParser.typeArgument_return retval = new JavaParser.typeArgument_return();
        retval.start = input.LT(1);
        int typeArgument_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal120=null;
        Token set121=null;
        JavaParser.type_return type119 = null;

        JavaParser.type_return type122 = null;


        Object char_literal120_tree=null;
        Object set121_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "typeArgument");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(244, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:245:5: ( type | '?' ( ( 'extends' | 'super' ) type )? )
            int alt46=2;
            try { dbg.enterDecision(46);

            int LA46_0 = input.LA(1);

            if ( (LA46_0==Identifier||(LA46_0>=93 && LA46_0<=100)) ) {
                alt46=1;
            }
            else if ( (LA46_0==101) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(46);}

            switch (alt46) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:245:9: type
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(245,9);
                    pushFollow(FOLLOW_type_in_typeArgument1703);
                    type119=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type119.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:246:9: '?' ( ( 'extends' | 'super' ) type )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(246,9);
                    char_literal120=(Token)match(input,101,FOLLOW_101_in_typeArgument1713); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal120_tree = (Object)adaptor.create(char_literal120);
                    adaptor.addChild(root_0, char_literal120_tree);
                    }
                    dbg.location(246,13);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:246:13: ( ( 'extends' | 'super' ) type )?
                    int alt45=2;
                    try { dbg.enterSubRule(45);
                    try { dbg.enterDecision(45);

                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==75||LA45_0==102) ) {
                        alt45=1;
                    }
                    } finally {dbg.exitDecision(45);}

                    switch (alt45) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:246:14: ( 'extends' | 'super' ) type
                            {
                            dbg.location(246,14);
                            set121=(Token)input.LT(1);
                            if ( input.LA(1)==75||input.LA(1)==102 ) {
                                input.consume();
                                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set121));
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                dbg.recognitionException(mse);
                                throw mse;
                            }

                            dbg.location(246,36);
                            pushFollow(FOLLOW_type_in_typeArgument1724);
                            type122=type();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, type122.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(45);}


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, typeArgument_StartIndex); }
        }
        dbg.location(247, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeArgument");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeArgument"

    public static class qualifiedNameList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualifiedNameList"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:249:1: qualifiedNameList : qualifiedName ( ',' qualifiedName )* ;
    public final JavaParser.qualifiedNameList_return qualifiedNameList() throws RecognitionException {
        JavaParser.qualifiedNameList_return retval = new JavaParser.qualifiedNameList_return();
        retval.start = input.LT(1);
        int qualifiedNameList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal124=null;
        JavaParser.qualifiedName_return qualifiedName123 = null;

        JavaParser.qualifiedName_return qualifiedName125 = null;


        Object char_literal124_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "qualifiedNameList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(249, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:250:5: ( qualifiedName ( ',' qualifiedName )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:250:9: qualifiedName ( ',' qualifiedName )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(250,9);
            pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList1749);
            qualifiedName123=qualifiedName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName123.getTree());
            dbg.location(250,23);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:250:23: ( ',' qualifiedName )*
            try { dbg.enterSubRule(47);

            loop47:
            do {
                int alt47=2;
                try { dbg.enterDecision(47);

                int LA47_0 = input.LA(1);

                if ( (LA47_0==73) ) {
                    alt47=1;
                }


                } finally {dbg.exitDecision(47);}

                switch (alt47) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:250:24: ',' qualifiedName
            	    {
            	    dbg.location(250,24);
            	    char_literal124=(Token)match(input,73,FOLLOW_73_in_qualifiedNameList1752); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal124_tree = (Object)adaptor.create(char_literal124);
            	    adaptor.addChild(root_0, char_literal124_tree);
            	    }
            	    dbg.location(250,28);
            	    pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList1754);
            	    qualifiedName125=qualifiedName();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedName125.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);
            } finally {dbg.exitSubRule(47);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, qualifiedNameList_StartIndex); }
        }
        dbg.location(251, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "qualifiedNameList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "qualifiedNameList"

    public static class formalParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:253:1: formalParameters : '(' ( formalParameterDecls )? ')' ;
    public final JavaParser.formalParameters_return formalParameters() throws RecognitionException {
        JavaParser.formalParameters_return retval = new JavaParser.formalParameters_return();
        retval.start = input.LT(1);
        int formalParameters_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal126=null;
        Token char_literal128=null;
        JavaParser.formalParameterDecls_return formalParameterDecls127 = null;


        Object char_literal126_tree=null;
        Object char_literal128_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "formalParameters");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(253, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:254:5: ( '(' ( formalParameterDecls )? ')' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:254:9: '(' ( formalParameterDecls )? ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(254,9);
            char_literal126=(Token)match(input,78,FOLLOW_78_in_formalParameters1775); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal126_tree = (Object)adaptor.create(char_literal126);
            adaptor.addChild(root_0, char_literal126_tree);
            }
            dbg.location(254,13);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:254:13: ( formalParameterDecls )?
            int alt48=2;
            try { dbg.enterSubRule(48);
            try { dbg.enterDecision(48);

            int LA48_0 = input.LA(1);

            if ( (LA48_0==Identifier||LA48_0==85||(LA48_0>=93 && LA48_0<=100)) ) {
                alt48=1;
            }
            } finally {dbg.exitDecision(48);}

            switch (alt48) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: formalParameterDecls
                    {
                    dbg.location(254,13);
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameters1777);
                    formalParameterDecls127=formalParameterDecls();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameterDecls127.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(48);}

            dbg.location(254,35);
            char_literal128=(Token)match(input,79,FOLLOW_79_in_formalParameters1780); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal128_tree = (Object)adaptor.create(char_literal128);
            adaptor.addChild(root_0, char_literal128_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, formalParameters_StartIndex); }
        }
        dbg.location(255, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formalParameters");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class formalParameterDecls_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameterDecls"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:257:1: formalParameterDecls : variableModifiers type formalParameterDeclsRest ;
    public final JavaParser.formalParameterDecls_return formalParameterDecls() throws RecognitionException {
        JavaParser.formalParameterDecls_return retval = new JavaParser.formalParameterDecls_return();
        retval.start = input.LT(1);
        int formalParameterDecls_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.variableModifiers_return variableModifiers129 = null;

        JavaParser.type_return type130 = null;

        JavaParser.formalParameterDeclsRest_return formalParameterDeclsRest131 = null;



        try { dbg.enterRule(getGrammarFileName(), "formalParameterDecls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(257, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:258:5: ( variableModifiers type formalParameterDeclsRest )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:258:9: variableModifiers type formalParameterDeclsRest
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(258,9);
            pushFollow(FOLLOW_variableModifiers_in_formalParameterDecls1804);
            variableModifiers129=variableModifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifiers129.getTree());
            dbg.location(258,27);
            pushFollow(FOLLOW_type_in_formalParameterDecls1806);
            type130=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type130.getTree());
            dbg.location(258,32);
            pushFollow(FOLLOW_formalParameterDeclsRest_in_formalParameterDecls1808);
            formalParameterDeclsRest131=formalParameterDeclsRest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameterDeclsRest131.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, formalParameterDecls_StartIndex); }
        }
        dbg.location(259, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formalParameterDecls");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formalParameterDecls"

    public static class formalParameterDeclsRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameterDeclsRest"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:261:1: formalParameterDeclsRest : variableDeclaratorId ( ',' formalParameterDecls )? ;
    public final JavaParser.formalParameterDeclsRest_return formalParameterDeclsRest() throws RecognitionException {
        JavaParser.formalParameterDeclsRest_return retval = new JavaParser.formalParameterDeclsRest_return();
        retval.start = input.LT(1);
        int formalParameterDeclsRest_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal133=null;
        JavaParser.variableDeclaratorId_return variableDeclaratorId132 = null;

        JavaParser.formalParameterDecls_return formalParameterDecls134 = null;


        Object char_literal133_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "formalParameterDeclsRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(261, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:262:5: ( variableDeclaratorId ( ',' formalParameterDecls )? )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:262:9: variableDeclaratorId ( ',' formalParameterDecls )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(262,9);
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest1831);
            variableDeclaratorId132=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId132.getTree());
            dbg.location(262,30);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:262:30: ( ',' formalParameterDecls )?
            int alt49=2;
            try { dbg.enterSubRule(49);
            try { dbg.enterDecision(49);

            int LA49_0 = input.LA(1);

            if ( (LA49_0==73) ) {
                alt49=1;
            }
            } finally {dbg.exitDecision(49);}

            switch (alt49) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:262:31: ',' formalParameterDecls
                    {
                    dbg.location(262,34);
                    char_literal133=(Token)match(input,73,FOLLOW_73_in_formalParameterDeclsRest1834); if (state.failed) return retval;
                    dbg.location(262,36);
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDeclsRest1837);
                    formalParameterDecls134=formalParameterDecls();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameterDecls134.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(49);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, formalParameterDeclsRest_StartIndex); }
        }
        dbg.location(263, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formalParameterDeclsRest");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formalParameterDeclsRest"

    public static class methodBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodBody"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:265:1: methodBody : block ;
    public final JavaParser.methodBody_return methodBody() throws RecognitionException {
        JavaParser.methodBody_return retval = new JavaParser.methodBody_return();
        retval.start = input.LT(1);
        int methodBody_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.block_return block135 = null;



        try { dbg.enterRule(getGrammarFileName(), "methodBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(265, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:266:5: ( block )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:266:9: block
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(266,9);
            pushFollow(FOLLOW_block_in_methodBody1862);
            block135=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block135.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, methodBody_StartIndex); }
        }
        dbg.location(267, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "methodBody");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "methodBody"

    public static class constructorBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructorBody"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:269:1: constructorBody : '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' ;
    public final JavaParser.constructorBody_return constructorBody() throws RecognitionException {
        JavaParser.constructorBody_return retval = new JavaParser.constructorBody_return();
        retval.start = input.LT(1);
        int constructorBody_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal136=null;
        Token char_literal139=null;
        JavaParser.explicitConstructorInvocation_return explicitConstructorInvocation137 = null;

        JavaParser.blockStatement_return blockStatement138 = null;


        Object char_literal136_tree=null;
        Object char_literal139_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "constructorBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(269, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:270:5: ( '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:270:9: '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(270,9);
            char_literal136=(Token)match(input,70,FOLLOW_70_in_constructorBody1881); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal136_tree = (Object)adaptor.create(char_literal136);
            adaptor.addChild(root_0, char_literal136_tree);
            }
            dbg.location(270,13);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:270:13: ( explicitConstructorInvocation )?
            int alt50=2;
            try { dbg.enterSubRule(50);
            try { dbg.enterDecision(50);

            try {
                isCyclicDecision = true;
                alt50 = dfa50.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(50);}

            switch (alt50) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: explicitConstructorInvocation
                    {
                    dbg.location(270,13);
                    pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody1883);
                    explicitConstructorInvocation137=explicitConstructorInvocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitConstructorInvocation137.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(50);}

            dbg.location(270,44);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:270:44: ( blockStatement )*
            try { dbg.enterSubRule(51);

            loop51:
            do {
                int alt51=2;
                try { dbg.enterDecision(51);

                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=Identifier && LA51_0<=DecimalLiteral)||(LA51_0>=65 && LA51_0<=70)||(LA51_0>=77 && LA51_0<=78)||LA51_0==80||LA51_0==85||(LA51_0>=93 && LA51_0<=100)||(LA51_0>=102 && LA51_0<=106)||LA51_0==108||(LA51_0>=110 && LA51_0<=115)||(LA51_0>=134 && LA51_0<=135)||(LA51_0>=139 && LA51_0<=144)) ) {
                    alt51=1;
                }


                } finally {dbg.exitDecision(51);}

                switch (alt51) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: blockStatement
            	    {
            	    dbg.location(270,44);
            	    pushFollow(FOLLOW_blockStatement_in_constructorBody1886);
            	    blockStatement138=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement138.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);
            } finally {dbg.exitSubRule(51);}

            dbg.location(270,60);
            char_literal139=(Token)match(input,71,FOLLOW_71_in_constructorBody1889); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal139_tree = (Object)adaptor.create(char_literal139);
            adaptor.addChild(root_0, char_literal139_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, constructorBody_StartIndex); }
        }
        dbg.location(271, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constructorBody");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constructorBody"

    public static class explicitConstructorInvocation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicitConstructorInvocation"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:273:1: explicitConstructorInvocation : ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' );
    public final JavaParser.explicitConstructorInvocation_return explicitConstructorInvocation() throws RecognitionException {
        JavaParser.explicitConstructorInvocation_return retval = new JavaParser.explicitConstructorInvocation_return();
        retval.start = input.LT(1);
        int explicitConstructorInvocation_StartIndex = input.index();
        Object root_0 = null;

        Token set141=null;
        Token char_literal143=null;
        Token char_literal145=null;
        Token string_literal147=null;
        Token char_literal149=null;
        JavaParser.nonWildcardTypeArguments_return nonWildcardTypeArguments140 = null;

        JavaParser.arguments_return arguments142 = null;

        JavaParser.primary_return primary144 = null;

        JavaParser.nonWildcardTypeArguments_return nonWildcardTypeArguments146 = null;

        JavaParser.arguments_return arguments148 = null;


        Object set141_tree=null;
        Object char_literal143_tree=null;
        Object char_literal145_tree=null;
        Object string_literal147_tree=null;
        Object char_literal149_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "explicitConstructorInvocation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(273, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:274:5: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' )
            int alt54=2;
            try { dbg.enterDecision(54);

            try {
                isCyclicDecision = true;
                alt54 = dfa54.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(54);}

            switch (alt54) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:274:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(274,9);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:274:9: ( nonWildcardTypeArguments )?
                    int alt52=2;
                    try { dbg.enterSubRule(52);
                    try { dbg.enterDecision(52);

                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==72) ) {
                        alt52=1;
                    }
                    } finally {dbg.exitDecision(52);}

                    switch (alt52) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: nonWildcardTypeArguments
                            {
                            dbg.location(274,9);
                            pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation1908);
                            nonWildcardTypeArguments140=nonWildcardTypeArguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments140.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(52);}

                    dbg.location(274,35);
                    set141=(Token)input.LT(1);
                    if ( (input.LA(1)>=102 && input.LA(1)<=103) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set141));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(274,54);
                    pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1919);
                    arguments142=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments142.getTree());
                    dbg.location(274,64);
                    char_literal143=(Token)match(input,77,FOLLOW_77_in_explicitConstructorInvocation1921); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal143_tree = (Object)adaptor.create(char_literal143);
                    adaptor.addChild(root_0, char_literal143_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:275:9: primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(275,9);
                    pushFollow(FOLLOW_primary_in_explicitConstructorInvocation1931);
                    primary144=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary144.getTree());
                    dbg.location(275,17);
                    char_literal145=(Token)match(input,92,FOLLOW_92_in_explicitConstructorInvocation1933); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal145_tree = (Object)adaptor.create(char_literal145);
                    adaptor.addChild(root_0, char_literal145_tree);
                    }
                    dbg.location(275,21);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:275:21: ( nonWildcardTypeArguments )?
                    int alt53=2;
                    try { dbg.enterSubRule(53);
                    try { dbg.enterDecision(53);

                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==72) ) {
                        alt53=1;
                    }
                    } finally {dbg.exitDecision(53);}

                    switch (alt53) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: nonWildcardTypeArguments
                            {
                            dbg.location(275,21);
                            pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation1935);
                            nonWildcardTypeArguments146=nonWildcardTypeArguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments146.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(53);}

                    dbg.location(275,47);
                    string_literal147=(Token)match(input,102,FOLLOW_102_in_explicitConstructorInvocation1938); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal147_tree = (Object)adaptor.create(string_literal147);
                    adaptor.addChild(root_0, string_literal147_tree);
                    }
                    dbg.location(275,55);
                    pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation1940);
                    arguments148=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments148.getTree());
                    dbg.location(275,65);
                    char_literal149=(Token)match(input,77,FOLLOW_77_in_explicitConstructorInvocation1942); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal149_tree = (Object)adaptor.create(char_literal149);
                    adaptor.addChild(root_0, char_literal149_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, explicitConstructorInvocation_StartIndex); }
        }
        dbg.location(276, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "explicitConstructorInvocation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "explicitConstructorInvocation"

    public static class qualifiedName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualifiedName"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:279:1: qualifiedName : Identifier ( '.' Identifier )* ;
    public final JavaParser.qualifiedName_return qualifiedName() throws RecognitionException {
        JavaParser.qualifiedName_return retval = new JavaParser.qualifiedName_return();
        retval.start = input.LT(1);
        int qualifiedName_StartIndex = input.index();
        Object root_0 = null;

        Token Identifier150=null;
        Token char_literal151=null;
        Token Identifier152=null;

        Object Identifier150_tree=null;
        Object char_literal151_tree=null;
        Object Identifier152_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "qualifiedName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(279, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:280:5: ( Identifier ( '.' Identifier )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:280:9: Identifier ( '.' Identifier )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(280,9);
            Identifier150=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName1962); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier150_tree = (Object)adaptor.create(Identifier150);
            adaptor.addChild(root_0, Identifier150_tree);
            }
            dbg.location(280,20);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:280:20: ( '.' Identifier )*
            try { dbg.enterSubRule(55);

            loop55:
            do {
                int alt55=2;
                try { dbg.enterDecision(55);

                int LA55_0 = input.LA(1);

                if ( (LA55_0==92) ) {
                    alt55=1;
                }


                } finally {dbg.exitDecision(55);}

                switch (alt55) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:280:21: '.' Identifier
            	    {
            	    dbg.location(280,21);
            	    char_literal151=(Token)match(input,92,FOLLOW_92_in_qualifiedName1965); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal151_tree = (Object)adaptor.create(char_literal151);
            	    adaptor.addChild(root_0, char_literal151_tree);
            	    }
            	    dbg.location(280,25);
            	    Identifier152=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName1967); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Identifier152_tree = (Object)adaptor.create(Identifier152);
            	    adaptor.addChild(root_0, Identifier152_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);
            } finally {dbg.exitSubRule(55);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, qualifiedName_StartIndex); }
        }
        dbg.location(281, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "qualifiedName");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "qualifiedName"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:283:1: literal : ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' );
    public final JavaParser.literal_return literal() throws RecognitionException {
        JavaParser.literal_return retval = new JavaParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        Object root_0 = null;

        Token FloatingPointLiteral154=null;
        Token CharacterLiteral155=null;
        Token StringLiteral156=null;
        Token string_literal158=null;
        JavaParser.integerLiteral_return integerLiteral153 = null;

        JavaParser.booleanLiteral_return booleanLiteral157 = null;


        Object FloatingPointLiteral154_tree=null;
        Object CharacterLiteral155_tree=null;
        Object StringLiteral156_tree=null;
        Object string_literal158_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "literal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(283, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:284:5: ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' )
            int alt56=6;
            try { dbg.enterDecision(56);

            switch ( input.LA(1) ) {
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
                {
                alt56=1;
                }
                break;
            case FloatingPointLiteral:
                {
                alt56=2;
                }
                break;
            case CharacterLiteral:
                {
                alt56=3;
                }
                break;
            case StringLiteral:
                {
                alt56=4;
                }
                break;
            case 105:
            case 106:
                {
                alt56=5;
                }
                break;
            case 104:
                {
                alt56=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(56);}

            switch (alt56) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:284:9: integerLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(284,9);
                    pushFollow(FOLLOW_integerLiteral_in_literal1993);
                    integerLiteral153=integerLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteral153.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:285:9: FloatingPointLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(285,9);
                    FloatingPointLiteral154=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal2003); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FloatingPointLiteral154_tree = (Object)adaptor.create(FloatingPointLiteral154);
                    adaptor.addChild(root_0, FloatingPointLiteral154_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:286:9: CharacterLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(286,9);
                    CharacterLiteral155=(Token)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal2013); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CharacterLiteral155_tree = (Object)adaptor.create(CharacterLiteral155);
                    adaptor.addChild(root_0, CharacterLiteral155_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:287:9: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(287,9);
                    StringLiteral156=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2023); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral156_tree = (Object)adaptor.create(StringLiteral156);
                    adaptor.addChild(root_0, StringLiteral156_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:288:9: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(288,9);
                    pushFollow(FOLLOW_booleanLiteral_in_literal2033);
                    booleanLiteral157=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral157.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:289:9: 'null'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(289,9);
                    string_literal158=(Token)match(input,104,FOLLOW_104_in_literal2043); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal158_tree = (Object)adaptor.create(string_literal158);
                    adaptor.addChild(root_0, string_literal158_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, literal_StartIndex); }
        }
        dbg.location(290, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "literal");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "literal"

    public static class integerLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerLiteral"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:292:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
    public final JavaParser.integerLiteral_return integerLiteral() throws RecognitionException {
        JavaParser.integerLiteral_return retval = new JavaParser.integerLiteral_return();
        retval.start = input.LT(1);
        int integerLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token set159=null;

        Object set159_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integerLiteral");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(292, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:293:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(293,5);
            set159=(Token)input.LT(1);
            if ( (input.LA(1)>=HexLiteral && input.LA(1)<=DecimalLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set159));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, integerLiteral_StartIndex); }
        }
        dbg.location(296, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "integerLiteral");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "integerLiteral"

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteral"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:298:1: booleanLiteral : ( 'true' | 'false' );
    public final JavaParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        JavaParser.booleanLiteral_return retval = new JavaParser.booleanLiteral_return();
        retval.start = input.LT(1);
        int booleanLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token set160=null;

        Object set160_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "booleanLiteral");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(298, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:299:5: ( 'true' | 'false' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(299,5);
            set160=(Token)input.LT(1);
            if ( (input.LA(1)>=105 && input.LA(1)<=106) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set160));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, booleanLiteral_StartIndex); }
        }
        dbg.location(301, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "booleanLiteral");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "booleanLiteral"

    public static class elementValuePairs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementValuePairs"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:303:1: elementValuePairs : elementValuePair ( ',' elementValuePair )* ;
    public final JavaParser.elementValuePairs_return elementValuePairs() throws RecognitionException {
        JavaParser.elementValuePairs_return retval = new JavaParser.elementValuePairs_return();
        retval.start = input.LT(1);
        int elementValuePairs_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal162=null;
        JavaParser.elementValuePair_return elementValuePair161 = null;

        JavaParser.elementValuePair_return elementValuePair163 = null;


        Object char_literal162_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "elementValuePairs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(303, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:304:5: ( elementValuePair ( ',' elementValuePair )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:304:9: elementValuePair ( ',' elementValuePair )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(304,9);
            pushFollow(FOLLOW_elementValuePair_in_elementValuePairs2130);
            elementValuePair161=elementValuePair();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValuePair161.getTree());
            dbg.location(304,26);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:304:26: ( ',' elementValuePair )*
            try { dbg.enterSubRule(57);

            loop57:
            do {
                int alt57=2;
                try { dbg.enterDecision(57);

                int LA57_0 = input.LA(1);

                if ( (LA57_0==73) ) {
                    alt57=1;
                }


                } finally {dbg.exitDecision(57);}

                switch (alt57) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:304:27: ',' elementValuePair
            	    {
            	    dbg.location(304,27);
            	    char_literal162=(Token)match(input,73,FOLLOW_73_in_elementValuePairs2133); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal162_tree = (Object)adaptor.create(char_literal162);
            	    adaptor.addChild(root_0, char_literal162_tree);
            	    }
            	    dbg.location(304,31);
            	    pushFollow(FOLLOW_elementValuePair_in_elementValuePairs2135);
            	    elementValuePair163=elementValuePair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValuePair163.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);
            } finally {dbg.exitSubRule(57);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, elementValuePairs_StartIndex); }
        }
        dbg.location(305, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elementValuePairs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "elementValuePairs"

    public static class elementValuePair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementValuePair"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:307:1: elementValuePair : Identifier '=' elementValue ;
    public final JavaParser.elementValuePair_return elementValuePair() throws RecognitionException {
        JavaParser.elementValuePair_return retval = new JavaParser.elementValuePair_return();
        retval.start = input.LT(1);
        int elementValuePair_StartIndex = input.index();
        Object root_0 = null;

        Token Identifier164=null;
        Token char_literal165=null;
        JavaParser.elementValue_return elementValue166 = null;


        Object Identifier164_tree=null;
        Object char_literal165_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "elementValuePair");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(307, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:308:5: ( Identifier '=' elementValue )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:308:9: Identifier '=' elementValue
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(308,9);
            Identifier164=(Token)match(input,Identifier,FOLLOW_Identifier_in_elementValuePair2156); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier164_tree = (Object)adaptor.create(Identifier164);
            adaptor.addChild(root_0, Identifier164_tree);
            }
            dbg.location(308,20);
            char_literal165=(Token)match(input,84,FOLLOW_84_in_elementValuePair2158); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal165_tree = (Object)adaptor.create(char_literal165);
            adaptor.addChild(root_0, char_literal165_tree);
            }
            dbg.location(308,24);
            pushFollow(FOLLOW_elementValue_in_elementValuePair2160);
            elementValue166=elementValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue166.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, elementValuePair_StartIndex); }
        }
        dbg.location(309, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elementValuePair");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "elementValuePair"

    public static class elementValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementValue"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:311:1: elementValue : ( conditionalExpression | elementValueArrayInitializer );
    public final JavaParser.elementValue_return elementValue() throws RecognitionException {
        JavaParser.elementValue_return retval = new JavaParser.elementValue_return();
        retval.start = input.LT(1);
        int elementValue_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.conditionalExpression_return conditionalExpression167 = null;

        JavaParser.elementValueArrayInitializer_return elementValueArrayInitializer168 = null;



        try { dbg.enterRule(getGrammarFileName(), "elementValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(311, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:312:5: ( conditionalExpression | elementValueArrayInitializer )
            int alt58=2;
            try { dbg.enterDecision(58);

            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=Identifier && LA58_0<=DecimalLiteral)||LA58_0==78||LA58_0==80||(LA58_0>=93 && LA58_0<=100)||(LA58_0>=102 && LA58_0<=106)||(LA58_0>=134 && LA58_0<=135)||(LA58_0>=139 && LA58_0<=144)) ) {
                alt58=1;
            }
            else if ( (LA58_0==70) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(58);}

            switch (alt58) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:312:9: conditionalExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(312,9);
                    pushFollow(FOLLOW_conditionalExpression_in_elementValue2183);
                    conditionalExpression167=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression167.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:313:9: elementValueArrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(313,9);
                    pushFollow(FOLLOW_elementValueArrayInitializer_in_elementValue2193);
                    elementValueArrayInitializer168=elementValueArrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValueArrayInitializer168.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, elementValue_StartIndex); }
        }
        dbg.location(314, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elementValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "elementValue"

    public static class elementValueArrayInitializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementValueArrayInitializer"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:316:1: elementValueArrayInitializer : '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' ;
    public final JavaParser.elementValueArrayInitializer_return elementValueArrayInitializer() throws RecognitionException {
        JavaParser.elementValueArrayInitializer_return retval = new JavaParser.elementValueArrayInitializer_return();
        retval.start = input.LT(1);
        int elementValueArrayInitializer_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal169=null;
        Token char_literal171=null;
        Token char_literal173=null;
        Token char_literal174=null;
        JavaParser.elementValue_return elementValue170 = null;

        JavaParser.elementValue_return elementValue172 = null;


        Object char_literal169_tree=null;
        Object char_literal171_tree=null;
        Object char_literal173_tree=null;
        Object char_literal174_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "elementValueArrayInitializer");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(316, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:317:5: ( '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:317:9: '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(317,9);
            char_literal169=(Token)match(input,70,FOLLOW_70_in_elementValueArrayInitializer2216); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal169_tree = (Object)adaptor.create(char_literal169);
            adaptor.addChild(root_0, char_literal169_tree);
            }
            dbg.location(317,13);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:317:13: ( elementValue ( ',' elementValue )* )?
            int alt60=2;
            try { dbg.enterSubRule(60);
            try { dbg.enterDecision(60);

            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=Identifier && LA60_0<=DecimalLiteral)||LA60_0==70||LA60_0==78||LA60_0==80||(LA60_0>=93 && LA60_0<=100)||(LA60_0>=102 && LA60_0<=106)||(LA60_0>=134 && LA60_0<=135)||(LA60_0>=139 && LA60_0<=144)) ) {
                alt60=1;
            }
            } finally {dbg.exitDecision(60);}

            switch (alt60) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:317:14: elementValue ( ',' elementValue )*
                    {
                    dbg.location(317,14);
                    pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer2219);
                    elementValue170=elementValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue170.getTree());
                    dbg.location(317,27);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:317:27: ( ',' elementValue )*
                    try { dbg.enterSubRule(59);

                    loop59:
                    do {
                        int alt59=2;
                        try { dbg.enterDecision(59);

                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==73) ) {
                            int LA59_1 = input.LA(2);

                            if ( ((LA59_1>=Identifier && LA59_1<=DecimalLiteral)||LA59_1==70||LA59_1==78||LA59_1==80||(LA59_1>=93 && LA59_1<=100)||(LA59_1>=102 && LA59_1<=106)||(LA59_1>=134 && LA59_1<=135)||(LA59_1>=139 && LA59_1<=144)) ) {
                                alt59=1;
                            }


                        }


                        } finally {dbg.exitDecision(59);}

                        switch (alt59) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:317:28: ',' elementValue
                    	    {
                    	    dbg.location(317,28);
                    	    char_literal171=(Token)match(input,73,FOLLOW_73_in_elementValueArrayInitializer2222); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal171_tree = (Object)adaptor.create(char_literal171);
                    	    adaptor.addChild(root_0, char_literal171_tree);
                    	    }
                    	    dbg.location(317,32);
                    	    pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer2224);
                    	    elementValue172=elementValue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue172.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(59);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(60);}

            dbg.location(317,49);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:317:49: ( ',' )?
            int alt61=2;
            try { dbg.enterSubRule(61);
            try { dbg.enterDecision(61);

            int LA61_0 = input.LA(1);

            if ( (LA61_0==73) ) {
                alt61=1;
            }
            } finally {dbg.exitDecision(61);}

            switch (alt61) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:317:50: ','
                    {
                    dbg.location(317,50);
                    char_literal173=(Token)match(input,73,FOLLOW_73_in_elementValueArrayInitializer2231); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal173_tree = (Object)adaptor.create(char_literal173);
                    adaptor.addChild(root_0, char_literal173_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(61);}

            dbg.location(317,56);
            char_literal174=(Token)match(input,71,FOLLOW_71_in_elementValueArrayInitializer2235); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal174_tree = (Object)adaptor.create(char_literal174);
            adaptor.addChild(root_0, char_literal174_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, elementValueArrayInitializer_StartIndex); }
        }
        dbg.location(318, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elementValueArrayInitializer");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "elementValueArrayInitializer"

    public static class defaultValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultValue"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:320:1: defaultValue : 'default' elementValue ;
    public final JavaParser.defaultValue_return defaultValue() throws RecognitionException {
        JavaParser.defaultValue_return retval = new JavaParser.defaultValue_return();
        retval.start = input.LT(1);
        int defaultValue_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal175=null;
        JavaParser.elementValue_return elementValue176 = null;


        Object string_literal175_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "defaultValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(320, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:321:5: ( 'default' elementValue )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:321:9: 'default' elementValue
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(321,9);
            string_literal175=(Token)match(input,107,FOLLOW_107_in_defaultValue2258); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal175_tree = (Object)adaptor.create(string_literal175);
            adaptor.addChild(root_0, string_literal175_tree);
            }
            dbg.location(321,19);
            pushFollow(FOLLOW_elementValue_in_defaultValue2260);
            elementValue176=elementValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elementValue176.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, defaultValue_StartIndex); }
        }
        dbg.location(322, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defaultValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defaultValue"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:326:1: block : '{' ( blockStatement )* '}' ;
    public final JavaParser.block_return block() throws RecognitionException {
        JavaParser.block_return retval = new JavaParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal177=null;
        Token char_literal179=null;
        JavaParser.blockStatement_return blockStatement178 = null;


        Object char_literal177_tree=null;
        Object char_literal179_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(326, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:327:5: ( '{' ( blockStatement )* '}' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:327:9: '{' ( blockStatement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(327,12);
            char_literal177=(Token)match(input,70,FOLLOW_70_in_block2281); if (state.failed) return retval;
            dbg.location(327,14);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:327:14: ( blockStatement )*
            try { dbg.enterSubRule(62);

            loop62:
            do {
                int alt62=2;
                try { dbg.enterDecision(62);

                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=Identifier && LA62_0<=DecimalLiteral)||(LA62_0>=65 && LA62_0<=70)||(LA62_0>=77 && LA62_0<=78)||LA62_0==80||LA62_0==85||(LA62_0>=93 && LA62_0<=100)||(LA62_0>=102 && LA62_0<=106)||LA62_0==108||(LA62_0>=110 && LA62_0<=115)||(LA62_0>=134 && LA62_0<=135)||(LA62_0>=139 && LA62_0<=144)) ) {
                    alt62=1;
                }


                } finally {dbg.exitDecision(62);}

                switch (alt62) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: blockStatement
            	    {
            	    dbg.location(327,14);
            	    pushFollow(FOLLOW_blockStatement_in_block2284);
            	    blockStatement178=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockStatement178.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);
            } finally {dbg.exitSubRule(62);}

            dbg.location(327,33);
            char_literal179=(Token)match(input,71,FOLLOW_71_in_block2287); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, block_StartIndex); }
        }
        dbg.location(328, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "block"

    public static class blockStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockStatement"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:330:1: blockStatement : ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement );
    public final JavaParser.blockStatement_return blockStatement() throws RecognitionException {
        JavaParser.blockStatement_return retval = new JavaParser.blockStatement_return();
        retval.start = input.LT(1);
        int blockStatement_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement180 = null;

        JavaParser.classOrInterfaceDeclaration_return classOrInterfaceDeclaration181 = null;

        JavaParser.statement_return statement182 = null;



        try { dbg.enterRule(getGrammarFileName(), "blockStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(330, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:331:5: ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement )
            int alt63=3;
            try { dbg.enterDecision(63);

            try {
                isCyclicDecision = true;
                alt63 = dfa63.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(63);}

            switch (alt63) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:331:9: localVariableDeclarationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(331,9);
                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement2311);
                    localVariableDeclarationStatement180=localVariableDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclarationStatement180.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:332:9: classOrInterfaceDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(332,9);
                    pushFollow(FOLLOW_classOrInterfaceDeclaration_in_blockStatement2322);
                    classOrInterfaceDeclaration181=classOrInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceDeclaration181.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:333:9: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(333,9);
                    pushFollow(FOLLOW_statement_in_blockStatement2333);
                    statement182=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement182.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, blockStatement_StartIndex); }
        }
        dbg.location(334, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "blockStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "blockStatement"

    public static class localVariableDeclarationStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localVariableDeclarationStatement"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:336:1: localVariableDeclarationStatement : localVariableDeclaration ';' ;
    public final JavaParser.localVariableDeclarationStatement_return localVariableDeclarationStatement() throws RecognitionException {
        JavaParser.localVariableDeclarationStatement_return retval = new JavaParser.localVariableDeclarationStatement_return();
        retval.start = input.LT(1);
        int localVariableDeclarationStatement_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal184=null;
        JavaParser.localVariableDeclaration_return localVariableDeclaration183 = null;


        Object char_literal184_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "localVariableDeclarationStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(336, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:337:5: ( localVariableDeclaration ';' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:337:10: localVariableDeclaration ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(337,10);
            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement2357);
            localVariableDeclaration183=localVariableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration183.getTree());
            dbg.location(337,38);
            char_literal184=(Token)match(input,77,FOLLOW_77_in_localVariableDeclarationStatement2359); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, localVariableDeclarationStatement_StartIndex); }
        }
        dbg.location(338, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "localVariableDeclarationStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "localVariableDeclarationStatement"

    public static class localVariableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localVariableDeclaration"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:340:1: localVariableDeclaration : variableModifiers type_name= type variableDeclarators -> ^( LOC_VAL $type_name variableDeclarators ) ;
    public final JavaParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        JavaParser.localVariableDeclaration_return retval = new JavaParser.localVariableDeclaration_return();
        retval.start = input.LT(1);
        int localVariableDeclaration_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.type_return type_name = null;

        JavaParser.variableModifiers_return variableModifiers185 = null;

        JavaParser.variableDeclarators_return variableDeclarators186 = null;


        RewriteRuleSubtreeStream stream_variableModifiers=new RewriteRuleSubtreeStream(adaptor,"rule variableModifiers");
        RewriteRuleSubtreeStream stream_variableDeclarators=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarators");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "localVariableDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(340, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:341:5: ( variableModifiers type_name= type variableDeclarators -> ^( LOC_VAL $type_name variableDeclarators ) )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:341:9: variableModifiers type_name= type variableDeclarators
            {
            dbg.location(341,9);
            pushFollow(FOLLOW_variableModifiers_in_localVariableDeclaration2379);
            variableModifiers185=variableModifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableModifiers.add(variableModifiers185.getTree());
            dbg.location(341,37);
            pushFollow(FOLLOW_type_in_localVariableDeclaration2385);
            type_name=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type_name.getTree());
            dbg.location(341,44);
            pushFollow(FOLLOW_variableDeclarators_in_localVariableDeclaration2387);
            variableDeclarators186=variableDeclarators();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarators.add(variableDeclarators186.getTree());


            // AST REWRITE
            // elements: type_name, variableDeclarators
            // token labels: 
            // rule labels: retval, type_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name",type_name!=null?type_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 342:2: -> ^( LOC_VAL $type_name variableDeclarators )
            {
                dbg.location(342,5);
                // /Users/zhengzhedong/Desktop/minijava3/Java.g:342:5: ^( LOC_VAL $type_name variableDeclarators )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(342,7);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOC_VAL, "LOC_VAL"), root_1);

                dbg.location(342,15);
                adaptor.addChild(root_1, stream_type_name.nextTree());
                dbg.location(342,26);
                adaptor.addChild(root_1, stream_variableDeclarators.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, localVariableDeclaration_StartIndex); }
        }
        dbg.location(343, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "localVariableDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "localVariableDeclaration"

    public static class variableModifiers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableModifiers"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:345:1: variableModifiers : ( variableModifier )* ;
    public final JavaParser.variableModifiers_return variableModifiers() throws RecognitionException {
        JavaParser.variableModifiers_return retval = new JavaParser.variableModifiers_return();
        retval.start = input.LT(1);
        int variableModifiers_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.variableModifier_return variableModifier187 = null;



        try { dbg.enterRule(getGrammarFileName(), "variableModifiers");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(345, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:346:5: ( ( variableModifier )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:346:9: ( variableModifier )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(346,9);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:346:9: ( variableModifier )*
            try { dbg.enterSubRule(64);

            loop64:
            do {
                int alt64=2;
                try { dbg.enterDecision(64);

                int LA64_0 = input.LA(1);

                if ( (LA64_0==85) ) {
                    alt64=1;
                }


                } finally {dbg.exitDecision(64);}

                switch (alt64) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: variableModifier
            	    {
            	    dbg.location(346,9);
            	    pushFollow(FOLLOW_variableModifier_in_variableModifiers2422);
            	    variableModifier187=variableModifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifier187.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);
            } finally {dbg.exitSubRule(64);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, variableModifiers_StartIndex); }
        }
        dbg.location(347, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableModifiers");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variableModifiers"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:349:1: statement : ( block | 'if' parExpression statement ( options {k=1; } : 'else' else_statement )? -> ^( IF_BLOCK ^( CONTROL parExpression ) ^( THEN statement ) ^( ELSE ( else_statement )? ) ) | 'for' '(' forControl ')' statement -> ^( FOR_BLOCK ^( CONTROL forControl ) ^( BODY statement ) ) | 'while' parExpression statement -> ^( WHILE_BLOCK ^( CONTROL parExpression ) ^( BODY statement ) ) | 'switch' parExpression '{' switchBlockStatementGroups '}' -> ^( SWITCH_BLOCK ^( SWITCH_KEY parExpression ) ^( SWITCH_BODY switchBlockStatementGroups ) ) | 'return' ( expression )? ';' | 'break' ';' | 'continue' ';' | ';' | statementExpression ';' );
    public final JavaParser.statement_return statement() throws RecognitionException {
        JavaParser.statement_return retval = new JavaParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal189=null;
        Token string_literal192=null;
        Token string_literal194=null;
        Token char_literal195=null;
        Token char_literal197=null;
        Token string_literal199=null;
        Token string_literal202=null;
        Token char_literal204=null;
        Token char_literal206=null;
        Token string_literal207=null;
        Token char_literal209=null;
        Token string_literal210=null;
        Token char_literal211=null;
        Token string_literal212=null;
        Token char_literal213=null;
        Token char_literal214=null;
        Token char_literal216=null;
        JavaParser.block_return block188 = null;

        JavaParser.parExpression_return parExpression190 = null;

        JavaParser.statement_return statement191 = null;

        JavaParser.else_statement_return else_statement193 = null;

        JavaParser.forControl_return forControl196 = null;

        JavaParser.statement_return statement198 = null;

        JavaParser.parExpression_return parExpression200 = null;

        JavaParser.statement_return statement201 = null;

        JavaParser.parExpression_return parExpression203 = null;

        JavaParser.switchBlockStatementGroups_return switchBlockStatementGroups205 = null;

        JavaParser.expression_return expression208 = null;

        JavaParser.statementExpression_return statementExpression215 = null;


        Object string_literal189_tree=null;
        Object string_literal192_tree=null;
        Object string_literal194_tree=null;
        Object char_literal195_tree=null;
        Object char_literal197_tree=null;
        Object string_literal199_tree=null;
        Object string_literal202_tree=null;
        Object char_literal204_tree=null;
        Object char_literal206_tree=null;
        Object string_literal207_tree=null;
        Object char_literal209_tree=null;
        Object string_literal210_tree=null;
        Object char_literal211_tree=null;
        Object string_literal212_tree=null;
        Object char_literal213_tree=null;
        Object char_literal214_tree=null;
        Object char_literal216_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_parExpression=new RewriteRuleSubtreeStream(adaptor,"rule parExpression");
        RewriteRuleSubtreeStream stream_switchBlockStatementGroups=new RewriteRuleSubtreeStream(adaptor,"rule switchBlockStatementGroups");
        RewriteRuleSubtreeStream stream_else_statement=new RewriteRuleSubtreeStream(adaptor,"rule else_statement");
        RewriteRuleSubtreeStream stream_forControl=new RewriteRuleSubtreeStream(adaptor,"rule forControl");
        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(349, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:350:5: ( block | 'if' parExpression statement ( options {k=1; } : 'else' else_statement )? -> ^( IF_BLOCK ^( CONTROL parExpression ) ^( THEN statement ) ^( ELSE ( else_statement )? ) ) | 'for' '(' forControl ')' statement -> ^( FOR_BLOCK ^( CONTROL forControl ) ^( BODY statement ) ) | 'while' parExpression statement -> ^( WHILE_BLOCK ^( CONTROL parExpression ) ^( BODY statement ) ) | 'switch' parExpression '{' switchBlockStatementGroups '}' -> ^( SWITCH_BLOCK ^( SWITCH_KEY parExpression ) ^( SWITCH_BODY switchBlockStatementGroups ) ) | 'return' ( expression )? ';' | 'break' ';' | 'continue' ';' | ';' | statementExpression ';' )
            int alt67=10;
            try { dbg.enterDecision(67);

            switch ( input.LA(1) ) {
            case 70:
                {
                alt67=1;
                }
                break;
            case 108:
                {
                alt67=2;
                }
                break;
            case 110:
                {
                alt67=3;
                }
                break;
            case 111:
                {
                alt67=4;
                }
                break;
            case 112:
                {
                alt67=5;
                }
                break;
            case 113:
                {
                alt67=6;
                }
                break;
            case 114:
                {
                alt67=7;
                }
                break;
            case 115:
                {
                alt67=8;
                }
                break;
            case 77:
                {
                alt67=9;
                }
                break;
            case Identifier:
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case 78:
            case 80:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 134:
            case 135:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
                {
                alt67=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(67);}

            switch (alt67) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:350:7: block
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(350,7);
                    pushFollow(FOLLOW_block_in_statement2440);
                    block188=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block188.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:351:9: 'if' parExpression statement ( options {k=1; } : 'else' else_statement )?
                    {
                    dbg.location(351,9);
                    string_literal189=(Token)match(input,108,FOLLOW_108_in_statement2452); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_108.add(string_literal189);

                    dbg.location(351,14);
                    pushFollow(FOLLOW_parExpression_in_statement2454);
                    parExpression190=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression190.getTree());
                    dbg.location(351,28);
                    pushFollow(FOLLOW_statement_in_statement2456);
                    statement191=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement191.getTree());
                    dbg.location(351,38);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:351:38: ( options {k=1; } : 'else' else_statement )?
                    int alt65=2;
                    try { dbg.enterSubRule(65);
                    try { dbg.enterDecision(65);

                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==109) ) {
                        int LA65_1 = input.LA(2);

                        if ( (synpred98_Java()) ) {
                            alt65=1;
                        }
                    }
                    } finally {dbg.exitDecision(65);}

                    switch (alt65) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:351:54: 'else' else_statement
                            {
                            dbg.location(351,54);
                            string_literal192=(Token)match(input,109,FOLLOW_109_in_statement2466); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_109.add(string_literal192);

                            dbg.location(351,61);
                            pushFollow(FOLLOW_else_statement_in_statement2468);
                            else_statement193=else_statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_statement.add(else_statement193.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(65);}



                    // AST REWRITE
                    // elements: parExpression, else_statement, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 351:78: -> ^( IF_BLOCK ^( CONTROL parExpression ) ^( THEN statement ) ^( ELSE ( else_statement )? ) )
                    {
                        dbg.location(351,80);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:351:80: ^( IF_BLOCK ^( CONTROL parExpression ) ^( THEN statement ) ^( ELSE ( else_statement )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(351,82);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF_BLOCK, "IF_BLOCK"), root_1);

                        dbg.location(351,91);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:351:91: ^( CONTROL parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(351,93);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONTROL, "CONTROL"), root_2);

                        dbg.location(351,101);
                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(351,116);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:351:116: ^( THEN statement )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(351,118);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);

                        dbg.location(351,123);
                        adaptor.addChild(root_2, stream_statement.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(351,134);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:351:134: ^( ELSE ( else_statement )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(351,136);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);

                        dbg.location(351,141);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:351:141: ( else_statement )?
                        if ( stream_else_statement.hasNext() ) {
                            dbg.location(351,141);
                            adaptor.addChild(root_2, stream_else_statement.nextTree());

                        }
                        stream_else_statement.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:352:9: 'for' '(' forControl ')' statement
                    {
                    dbg.location(352,9);
                    string_literal194=(Token)match(input,110,FOLLOW_110_in_statement2504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_110.add(string_literal194);

                    dbg.location(352,15);
                    char_literal195=(Token)match(input,78,FOLLOW_78_in_statement2506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_78.add(char_literal195);

                    dbg.location(352,19);
                    pushFollow(FOLLOW_forControl_in_statement2508);
                    forControl196=forControl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forControl.add(forControl196.getTree());
                    dbg.location(352,30);
                    char_literal197=(Token)match(input,79,FOLLOW_79_in_statement2510); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_79.add(char_literal197);

                    dbg.location(352,34);
                    pushFollow(FOLLOW_statement_in_statement2512);
                    statement198=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement198.getTree());


                    // AST REWRITE
                    // elements: forControl, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 352:45: -> ^( FOR_BLOCK ^( CONTROL forControl ) ^( BODY statement ) )
                    {
                        dbg.location(352,47);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:352:47: ^( FOR_BLOCK ^( CONTROL forControl ) ^( BODY statement ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(352,49);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR_BLOCK, "FOR_BLOCK"), root_1);

                        dbg.location(352,59);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:352:59: ^( CONTROL forControl )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(352,61);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONTROL, "CONTROL"), root_2);

                        dbg.location(352,69);
                        adaptor.addChild(root_2, stream_forControl.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(352,81);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:352:81: ^( BODY statement )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(352,83);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                        dbg.location(352,88);
                        adaptor.addChild(root_2, stream_statement.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:353:9: 'while' parExpression statement
                    {
                    dbg.location(353,9);
                    string_literal199=(Token)match(input,111,FOLLOW_111_in_statement2540); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_111.add(string_literal199);

                    dbg.location(353,17);
                    pushFollow(FOLLOW_parExpression_in_statement2542);
                    parExpression200=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression200.getTree());
                    dbg.location(353,31);
                    pushFollow(FOLLOW_statement_in_statement2544);
                    statement201=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement201.getTree());


                    // AST REWRITE
                    // elements: statement, parExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 353:41: -> ^( WHILE_BLOCK ^( CONTROL parExpression ) ^( BODY statement ) )
                    {
                        dbg.location(353,43);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:353:43: ^( WHILE_BLOCK ^( CONTROL parExpression ) ^( BODY statement ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(353,45);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE_BLOCK, "WHILE_BLOCK"), root_1);

                        dbg.location(353,57);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:353:57: ^( CONTROL parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(353,59);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONTROL, "CONTROL"), root_2);

                        dbg.location(353,67);
                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(353,82);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:353:82: ^( BODY statement )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(353,84);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                        dbg.location(353,89);
                        adaptor.addChild(root_2, stream_statement.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:354:9: 'switch' parExpression '{' switchBlockStatementGroups '}'
                    {
                    dbg.location(354,9);
                    string_literal202=(Token)match(input,112,FOLLOW_112_in_statement2571); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(string_literal202);

                    dbg.location(354,18);
                    pushFollow(FOLLOW_parExpression_in_statement2573);
                    parExpression203=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression203.getTree());
                    dbg.location(354,32);
                    char_literal204=(Token)match(input,70,FOLLOW_70_in_statement2575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(char_literal204);

                    dbg.location(354,36);
                    pushFollow(FOLLOW_switchBlockStatementGroups_in_statement2577);
                    switchBlockStatementGroups205=switchBlockStatementGroups();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_switchBlockStatementGroups.add(switchBlockStatementGroups205.getTree());
                    dbg.location(354,63);
                    char_literal206=(Token)match(input,71,FOLLOW_71_in_statement2579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_71.add(char_literal206);



                    // AST REWRITE
                    // elements: parExpression, switchBlockStatementGroups
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 354:67: -> ^( SWITCH_BLOCK ^( SWITCH_KEY parExpression ) ^( SWITCH_BODY switchBlockStatementGroups ) )
                    {
                        dbg.location(354,69);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:354:69: ^( SWITCH_BLOCK ^( SWITCH_KEY parExpression ) ^( SWITCH_BODY switchBlockStatementGroups ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(354,71);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SWITCH_BLOCK, "SWITCH_BLOCK"), root_1);

                        dbg.location(354,84);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:354:84: ^( SWITCH_KEY parExpression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(354,86);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SWITCH_KEY, "SWITCH_KEY"), root_2);

                        dbg.location(354,97);
                        adaptor.addChild(root_2, stream_parExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(354,112);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:354:112: ^( SWITCH_BODY switchBlockStatementGroups )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(354,114);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SWITCH_BODY, "SWITCH_BODY"), root_2);

                        dbg.location(354,126);
                        adaptor.addChild(root_2, stream_switchBlockStatementGroups.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:355:9: 'return' ( expression )? ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(355,17);
                    string_literal207=(Token)match(input,113,FOLLOW_113_in_statement2607); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal207_tree = (Object)adaptor.create(string_literal207);
                    root_0 = (Object)adaptor.becomeRoot(string_literal207_tree, root_0);
                    }
                    dbg.location(355,19);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:355:19: ( expression )?
                    int alt66=2;
                    try { dbg.enterSubRule(66);
                    try { dbg.enterDecision(66);

                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=Identifier && LA66_0<=DecimalLiteral)||LA66_0==78||LA66_0==80||(LA66_0>=93 && LA66_0<=100)||(LA66_0>=102 && LA66_0<=106)||(LA66_0>=134 && LA66_0<=135)||(LA66_0>=139 && LA66_0<=144)) ) {
                        alt66=1;
                    }
                    } finally {dbg.exitDecision(66);}

                    switch (alt66) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: expression
                            {
                            dbg.location(355,19);
                            pushFollow(FOLLOW_expression_in_statement2610);
                            expression208=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression208.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(66);}

                    dbg.location(355,34);
                    char_literal209=(Token)match(input,77,FOLLOW_77_in_statement2613); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:356:9: 'break' ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(356,9);
                    string_literal210=(Token)match(input,114,FOLLOW_114_in_statement2624); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal210_tree = (Object)adaptor.create(string_literal210);
                    adaptor.addChild(root_0, string_literal210_tree);
                    }
                    dbg.location(356,20);
                    char_literal211=(Token)match(input,77,FOLLOW_77_in_statement2626); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:357:9: 'continue' ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(357,9);
                    string_literal212=(Token)match(input,115,FOLLOW_115_in_statement2638); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal212_tree = (Object)adaptor.create(string_literal212);
                    adaptor.addChild(root_0, string_literal212_tree);
                    }
                    dbg.location(357,23);
                    char_literal213=(Token)match(input,77,FOLLOW_77_in_statement2640); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:358:9: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(358,9);
                    char_literal214=(Token)match(input,77,FOLLOW_77_in_statement2651); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal214_tree = (Object)adaptor.create(char_literal214);
                    adaptor.addChild(root_0, char_literal214_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:359:9: statementExpression ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(359,9);
                    pushFollow(FOLLOW_statementExpression_in_statement2662);
                    statementExpression215=statementExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementExpression215.getTree());
                    dbg.location(359,32);
                    char_literal216=(Token)match(input,77,FOLLOW_77_in_statement2664); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, statement_StartIndex); }
        }
        dbg.location(360, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statement"

    public static class else_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "else_statement"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:362:1: else_statement : statement ;
    public final JavaParser.else_statement_return else_statement() throws RecognitionException {
        JavaParser.else_statement_return retval = new JavaParser.else_statement_return();
        retval.start = input.LT(1);
        int else_statement_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.statement_return statement217 = null;



        try { dbg.enterRule(getGrammarFileName(), "else_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(362, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:362:16: ( statement )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:362:17: statement
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(362,17);
            pushFollow(FOLLOW_statement_in_else_statement2677);
            statement217=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement217.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, else_statement_StartIndex); }
        }
        dbg.location(362, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "else_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "else_statement"

    public static class formalParameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameter"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:364:1: formalParameter : variableModifiers type variableDeclaratorId ;
    public final JavaParser.formalParameter_return formalParameter() throws RecognitionException {
        JavaParser.formalParameter_return retval = new JavaParser.formalParameter_return();
        retval.start = input.LT(1);
        int formalParameter_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.variableModifiers_return variableModifiers218 = null;

        JavaParser.type_return type219 = null;

        JavaParser.variableDeclaratorId_return variableDeclaratorId220 = null;



        try { dbg.enterRule(getGrammarFileName(), "formalParameter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(364, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:365:5: ( variableModifiers type variableDeclaratorId )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:365:9: variableModifiers type variableDeclaratorId
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(365,9);
            pushFollow(FOLLOW_variableModifiers_in_formalParameter2691);
            variableModifiers218=variableModifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifiers218.getTree());
            dbg.location(365,27);
            pushFollow(FOLLOW_type_in_formalParameter2693);
            type219=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type219.getTree());
            dbg.location(365,32);
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameter2695);
            variableDeclaratorId220=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaratorId220.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, formalParameter_StartIndex); }
        }
        dbg.location(366, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formalParameter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formalParameter"

    public static class switchBlockStatementGroups_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchBlockStatementGroups"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:368:1: switchBlockStatementGroups : ( switchBlockStatementGroup )* ;
    public final JavaParser.switchBlockStatementGroups_return switchBlockStatementGroups() throws RecognitionException {
        JavaParser.switchBlockStatementGroups_return retval = new JavaParser.switchBlockStatementGroups_return();
        retval.start = input.LT(1);
        int switchBlockStatementGroups_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.switchBlockStatementGroup_return switchBlockStatementGroup221 = null;



        try { dbg.enterRule(getGrammarFileName(), "switchBlockStatementGroups");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(368, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:369:5: ( ( switchBlockStatementGroup )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:369:9: ( switchBlockStatementGroup )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(369,9);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:369:9: ( switchBlockStatementGroup )*
            try { dbg.enterSubRule(68);

            loop68:
            do {
                int alt68=2;
                try { dbg.enterDecision(68);

                int LA68_0 = input.LA(1);

                if ( (LA68_0==107||LA68_0==117) ) {
                    alt68=1;
                }


                } finally {dbg.exitDecision(68);}

                switch (alt68) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:369:10: switchBlockStatementGroup
            	    {
            	    dbg.location(369,10);
            	    pushFollow(FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups2723);
            	    switchBlockStatementGroup221=switchBlockStatementGroup();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlockStatementGroup221.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);
            } finally {dbg.exitSubRule(68);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, switchBlockStatementGroups_StartIndex); }
        }
        dbg.location(370, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "switchBlockStatementGroups");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "switchBlockStatementGroups"

    public static class switchBlockStatementGroup_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchBlockStatementGroup"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:372:1: switchBlockStatementGroup : ( ( switchLabel )+ | 'default' ':' ( blockStatement )* -> ^( DEFAULT ( blockStatement )* ) );
    public final JavaParser.switchBlockStatementGroup_return switchBlockStatementGroup() throws RecognitionException {
        JavaParser.switchBlockStatementGroup_return retval = new JavaParser.switchBlockStatementGroup_return();
        retval.start = input.LT(1);
        int switchBlockStatementGroup_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal223=null;
        Token char_literal224=null;
        JavaParser.switchLabel_return switchLabel222 = null;

        JavaParser.blockStatement_return blockStatement225 = null;


        Object string_literal223_tree=null;
        Object char_literal224_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_blockStatement=new RewriteRuleSubtreeStream(adaptor,"rule blockStatement");
        try { dbg.enterRule(getGrammarFileName(), "switchBlockStatementGroup");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(372, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:373:5: ( ( switchLabel )+ | 'default' ':' ( blockStatement )* -> ^( DEFAULT ( blockStatement )* ) )
            int alt71=2;
            try { dbg.enterDecision(71);

            int LA71_0 = input.LA(1);

            if ( (LA71_0==117) ) {
                alt71=1;
            }
            else if ( (LA71_0==107) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(71);}

            switch (alt71) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:373:7: ( switchLabel )+
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(373,7);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:373:7: ( switchLabel )+
                    int cnt69=0;
                    try { dbg.enterSubRule(69);

                    loop69:
                    do {
                        int alt69=2;
                        try { dbg.enterDecision(69);

                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==117) ) {
                            int LA69_2 = input.LA(2);

                            if ( (synpred109_Java()) ) {
                                alt69=1;
                            }


                        }


                        } finally {dbg.exitDecision(69);}

                        switch (alt69) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: switchLabel
                    	    {
                    	    dbg.location(373,7);
                    	    pushFollow(FOLLOW_switchLabel_in_switchBlockStatementGroup2743);
                    	    switchLabel222=switchLabel();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchLabel222.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt69 >= 1 ) break loop69;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(69, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt69++;
                    } while (true);
                    } finally {dbg.exitSubRule(69);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:374:4: 'default' ':' ( blockStatement )*
                    {
                    dbg.location(374,4);
                    string_literal223=(Token)match(input,107,FOLLOW_107_in_switchBlockStatementGroup2750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(string_literal223);

                    dbg.location(374,14);
                    char_literal224=(Token)match(input,116,FOLLOW_116_in_switchBlockStatementGroup2752); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_116.add(char_literal224);

                    dbg.location(374,18);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:374:18: ( blockStatement )*
                    try { dbg.enterSubRule(70);

                    loop70:
                    do {
                        int alt70=2;
                        try { dbg.enterDecision(70);

                        int LA70_0 = input.LA(1);

                        if ( ((LA70_0>=Identifier && LA70_0<=DecimalLiteral)||(LA70_0>=65 && LA70_0<=70)||(LA70_0>=77 && LA70_0<=78)||LA70_0==80||LA70_0==85||(LA70_0>=93 && LA70_0<=100)||(LA70_0>=102 && LA70_0<=106)||LA70_0==108||(LA70_0>=110 && LA70_0<=115)||(LA70_0>=134 && LA70_0<=135)||(LA70_0>=139 && LA70_0<=144)) ) {
                            alt70=1;
                        }


                        } finally {dbg.exitDecision(70);}

                        switch (alt70) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: blockStatement
                    	    {
                    	    dbg.location(374,18);
                    	    pushFollow(FOLLOW_blockStatement_in_switchBlockStatementGroup2754);
                    	    blockStatement225=blockStatement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_blockStatement.add(blockStatement225.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(70);}



                    // AST REWRITE
                    // elements: blockStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 374:35: -> ^( DEFAULT ( blockStatement )* )
                    {
                        dbg.location(374,37);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:374:37: ^( DEFAULT ( blockStatement )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(374,39);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFAULT, "DEFAULT"), root_1);

                        dbg.location(374,47);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:374:47: ( blockStatement )*
                        while ( stream_blockStatement.hasNext() ) {
                            dbg.location(374,47);
                            adaptor.addChild(root_1, stream_blockStatement.nextTree());

                        }
                        stream_blockStatement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, switchBlockStatementGroup_StartIndex); }
        }
        dbg.location(375, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "switchBlockStatementGroup");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "switchBlockStatementGroup"

    public static class switchLabel_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchLabel"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:377:1: switchLabel : 'case' constantExpression ':' ( blockStatement )* 'break;' -> ^( CASE ^( CASE_KEY constantExpression ) ^( CASE_BODY ( blockStatement )* ) ) ;
    public final JavaParser.switchLabel_return switchLabel() throws RecognitionException {
        JavaParser.switchLabel_return retval = new JavaParser.switchLabel_return();
        retval.start = input.LT(1);
        int switchLabel_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal226=null;
        Token char_literal228=null;
        Token string_literal230=null;
        JavaParser.constantExpression_return constantExpression227 = null;

        JavaParser.blockStatement_return blockStatement229 = null;


        Object string_literal226_tree=null;
        Object char_literal228_tree=null;
        Object string_literal230_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_constantExpression=new RewriteRuleSubtreeStream(adaptor,"rule constantExpression");
        RewriteRuleSubtreeStream stream_blockStatement=new RewriteRuleSubtreeStream(adaptor,"rule blockStatement");
        try { dbg.enterRule(getGrammarFileName(), "switchLabel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(377, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:378:5: ( 'case' constantExpression ':' ( blockStatement )* 'break;' -> ^( CASE ^( CASE_KEY constantExpression ) ^( CASE_BODY ( blockStatement )* ) ) )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:378:9: 'case' constantExpression ':' ( blockStatement )* 'break;'
            {
            dbg.location(378,9);
            string_literal226=(Token)match(input,117,FOLLOW_117_in_switchLabel2787); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_117.add(string_literal226);

            dbg.location(378,16);
            pushFollow(FOLLOW_constantExpression_in_switchLabel2789);
            constantExpression227=constantExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_constantExpression.add(constantExpression227.getTree());
            dbg.location(378,35);
            char_literal228=(Token)match(input,116,FOLLOW_116_in_switchLabel2791); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_116.add(char_literal228);

            dbg.location(378,39);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:378:39: ( blockStatement )*
            try { dbg.enterSubRule(72);

            loop72:
            do {
                int alt72=2;
                try { dbg.enterDecision(72);

                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=Identifier && LA72_0<=DecimalLiteral)||(LA72_0>=65 && LA72_0<=70)||(LA72_0>=77 && LA72_0<=78)||LA72_0==80||LA72_0==85||(LA72_0>=93 && LA72_0<=100)||(LA72_0>=102 && LA72_0<=106)||LA72_0==108||(LA72_0>=110 && LA72_0<=115)||(LA72_0>=134 && LA72_0<=135)||(LA72_0>=139 && LA72_0<=144)) ) {
                    alt72=1;
                }


                } finally {dbg.exitDecision(72);}

                switch (alt72) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: blockStatement
            	    {
            	    dbg.location(378,39);
            	    pushFollow(FOLLOW_blockStatement_in_switchLabel2793);
            	    blockStatement229=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockStatement.add(blockStatement229.getTree());

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);
            } finally {dbg.exitSubRule(72);}

            dbg.location(378,55);
            string_literal230=(Token)match(input,118,FOLLOW_118_in_switchLabel2796); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_118.add(string_literal230);



            // AST REWRITE
            // elements: blockStatement, constantExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 378:63: -> ^( CASE ^( CASE_KEY constantExpression ) ^( CASE_BODY ( blockStatement )* ) )
            {
                dbg.location(378,65);
                // /Users/zhengzhedong/Desktop/minijava3/Java.g:378:65: ^( CASE ^( CASE_KEY constantExpression ) ^( CASE_BODY ( blockStatement )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(378,67);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CASE, "CASE"), root_1);

                dbg.location(378,72);
                // /Users/zhengzhedong/Desktop/minijava3/Java.g:378:72: ^( CASE_KEY constantExpression )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(378,74);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CASE_KEY, "CASE_KEY"), root_2);

                dbg.location(378,83);
                adaptor.addChild(root_2, stream_constantExpression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(378,103);
                // /Users/zhengzhedong/Desktop/minijava3/Java.g:378:103: ^( CASE_BODY ( blockStatement )* )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(378,105);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CASE_BODY, "CASE_BODY"), root_2);

                dbg.location(378,115);
                // /Users/zhengzhedong/Desktop/minijava3/Java.g:378:115: ( blockStatement )*
                while ( stream_blockStatement.hasNext() ) {
                    dbg.location(378,115);
                    adaptor.addChild(root_2, stream_blockStatement.nextTree());

                }
                stream_blockStatement.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, switchLabel_StartIndex); }
        }
        dbg.location(379, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "switchLabel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "switchLabel"

    public static class forControl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forControl"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:381:1: forControl options {k=3; } : ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? -> ^( INIT ( forInit )? ) ^( CONTROL ( expression )? ) ^( UPDATE ( forUpdate )? ) );
    public final JavaParser.forControl_return forControl() throws RecognitionException {
        JavaParser.forControl_return retval = new JavaParser.forControl_return();
        retval.start = input.LT(1);
        int forControl_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal233=null;
        Token char_literal235=null;
        JavaParser.enhancedForControl_return enhancedForControl231 = null;

        JavaParser.forInit_return forInit232 = null;

        JavaParser.expression_return expression234 = null;

        JavaParser.forUpdate_return forUpdate236 = null;


        Object char_literal233_tree=null;
        Object char_literal235_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_forInit=new RewriteRuleSubtreeStream(adaptor,"rule forInit");
        RewriteRuleSubtreeStream stream_forUpdate=new RewriteRuleSubtreeStream(adaptor,"rule forUpdate");
        try { dbg.enterRule(getGrammarFileName(), "forControl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(381, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:383:5: ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? -> ^( INIT ( forInit )? ) ^( CONTROL ( expression )? ) ^( UPDATE ( forUpdate )? ) )
            int alt76=2;
            try { dbg.enterDecision(76);

            try {
                isCyclicDecision = true;
                alt76 = dfa76.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(76);}

            switch (alt76) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:383:9: enhancedForControl
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(383,9);
                    pushFollow(FOLLOW_enhancedForControl_in_forControl2846);
                    enhancedForControl231=enhancedForControl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enhancedForControl231.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:384:9: ( forInit )? ';' ( expression )? ';' ( forUpdate )?
                    {
                    dbg.location(384,9);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:384:9: ( forInit )?
                    int alt73=2;
                    try { dbg.enterSubRule(73);
                    try { dbg.enterDecision(73);

                    int LA73_0 = input.LA(1);

                    if ( ((LA73_0>=Identifier && LA73_0<=DecimalLiteral)||LA73_0==78||LA73_0==80||LA73_0==85||(LA73_0>=93 && LA73_0<=100)||(LA73_0>=102 && LA73_0<=106)||(LA73_0>=134 && LA73_0<=135)||(LA73_0>=139 && LA73_0<=144)) ) {
                        alt73=1;
                    }
                    } finally {dbg.exitDecision(73);}

                    switch (alt73) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: forInit
                            {
                            dbg.location(384,9);
                            pushFollow(FOLLOW_forInit_in_forControl2856);
                            forInit232=forInit();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forInit.add(forInit232.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(73);}

                    dbg.location(384,18);
                    char_literal233=(Token)match(input,77,FOLLOW_77_in_forControl2859); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_77.add(char_literal233);

                    dbg.location(384,22);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:384:22: ( expression )?
                    int alt74=2;
                    try { dbg.enterSubRule(74);
                    try { dbg.enterDecision(74);

                    int LA74_0 = input.LA(1);

                    if ( ((LA74_0>=Identifier && LA74_0<=DecimalLiteral)||LA74_0==78||LA74_0==80||(LA74_0>=93 && LA74_0<=100)||(LA74_0>=102 && LA74_0<=106)||(LA74_0>=134 && LA74_0<=135)||(LA74_0>=139 && LA74_0<=144)) ) {
                        alt74=1;
                    }
                    } finally {dbg.exitDecision(74);}

                    switch (alt74) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: expression
                            {
                            dbg.location(384,22);
                            pushFollow(FOLLOW_expression_in_forControl2861);
                            expression234=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression234.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(74);}

                    dbg.location(384,34);
                    char_literal235=(Token)match(input,77,FOLLOW_77_in_forControl2864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_77.add(char_literal235);

                    dbg.location(384,38);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:384:38: ( forUpdate )?
                    int alt75=2;
                    try { dbg.enterSubRule(75);
                    try { dbg.enterDecision(75);

                    int LA75_0 = input.LA(1);

                    if ( ((LA75_0>=Identifier && LA75_0<=DecimalLiteral)||LA75_0==78||LA75_0==80||(LA75_0>=93 && LA75_0<=100)||(LA75_0>=102 && LA75_0<=106)||(LA75_0>=134 && LA75_0<=135)||(LA75_0>=139 && LA75_0<=144)) ) {
                        alt75=1;
                    }
                    } finally {dbg.exitDecision(75);}

                    switch (alt75) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: forUpdate
                            {
                            dbg.location(384,38);
                            pushFollow(FOLLOW_forUpdate_in_forControl2866);
                            forUpdate236=forUpdate();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_forUpdate.add(forUpdate236.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(75);}



                    // AST REWRITE
                    // elements: forInit, expression, forUpdate
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 384:49: -> ^( INIT ( forInit )? ) ^( CONTROL ( expression )? ) ^( UPDATE ( forUpdate )? )
                    {
                        dbg.location(384,51);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:384:51: ^( INIT ( forInit )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(384,53);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_1);

                        dbg.location(384,58);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:384:58: ( forInit )?
                        if ( stream_forInit.hasNext() ) {
                            dbg.location(384,58);
                            adaptor.addChild(root_1, stream_forInit.nextTree());

                        }
                        stream_forInit.reset();

                        adaptor.addChild(root_0, root_1);
                        }
                        dbg.location(384,68);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:384:68: ^( CONTROL ( expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(384,70);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONTROL, "CONTROL"), root_1);

                        dbg.location(384,78);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:384:78: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            dbg.location(384,78);
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }
                        dbg.location(384,91);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:384:91: ^( UPDATE ( forUpdate )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(384,93);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UPDATE, "UPDATE"), root_1);

                        dbg.location(384,100);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:384:100: ( forUpdate )?
                        if ( stream_forUpdate.hasNext() ) {
                            dbg.location(384,100);
                            adaptor.addChild(root_1, stream_forUpdate.nextTree());

                        }
                        stream_forUpdate.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, forControl_StartIndex); }
        }
        dbg.location(385, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "forControl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "forControl"

    public static class forInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInit"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:387:1: forInit : ( localVariableDeclaration | expressionList );
    public final JavaParser.forInit_return forInit() throws RecognitionException {
        JavaParser.forInit_return retval = new JavaParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.localVariableDeclaration_return localVariableDeclaration237 = null;

        JavaParser.expressionList_return expressionList238 = null;



        try { dbg.enterRule(getGrammarFileName(), "forInit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(387, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:388:5: ( localVariableDeclaration | expressionList )
            int alt77=2;
            try { dbg.enterDecision(77);

            try {
                isCyclicDecision = true;
                alt77 = dfa77.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(77);}

            switch (alt77) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:388:9: localVariableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(388,9);
                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit2908);
                    localVariableDeclaration237=localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclaration237.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:389:9: expressionList
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(389,9);
                    pushFollow(FOLLOW_expressionList_in_forInit2918);
                    expressionList238=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList238.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, forInit_StartIndex); }
        }
        dbg.location(390, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "forInit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "forInit"

    public static class enhancedForControl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enhancedForControl"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:392:1: enhancedForControl : variableModifiers type Identifier ':' expression ;
    public final JavaParser.enhancedForControl_return enhancedForControl() throws RecognitionException {
        JavaParser.enhancedForControl_return retval = new JavaParser.enhancedForControl_return();
        retval.start = input.LT(1);
        int enhancedForControl_StartIndex = input.index();
        Object root_0 = null;

        Token Identifier241=null;
        Token char_literal242=null;
        JavaParser.variableModifiers_return variableModifiers239 = null;

        JavaParser.type_return type240 = null;

        JavaParser.expression_return expression243 = null;


        Object Identifier241_tree=null;
        Object char_literal242_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "enhancedForControl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(392, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:393:5: ( variableModifiers type Identifier ':' expression )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:393:9: variableModifiers type Identifier ':' expression
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(393,9);
            pushFollow(FOLLOW_variableModifiers_in_enhancedForControl2941);
            variableModifiers239=variableModifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableModifiers239.getTree());
            dbg.location(393,27);
            pushFollow(FOLLOW_type_in_enhancedForControl2943);
            type240=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type240.getTree());
            dbg.location(393,32);
            Identifier241=(Token)match(input,Identifier,FOLLOW_Identifier_in_enhancedForControl2945); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier241_tree = (Object)adaptor.create(Identifier241);
            adaptor.addChild(root_0, Identifier241_tree);
            }
            dbg.location(393,43);
            char_literal242=(Token)match(input,116,FOLLOW_116_in_enhancedForControl2947); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal242_tree = (Object)adaptor.create(char_literal242);
            adaptor.addChild(root_0, char_literal242_tree);
            }
            dbg.location(393,47);
            pushFollow(FOLLOW_expression_in_enhancedForControl2949);
            expression243=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression243.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, enhancedForControl_StartIndex); }
        }
        dbg.location(394, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "enhancedForControl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "enhancedForControl"

    public static class forUpdate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forUpdate"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:396:1: forUpdate : expressionList ;
    public final JavaParser.forUpdate_return forUpdate() throws RecognitionException {
        JavaParser.forUpdate_return retval = new JavaParser.forUpdate_return();
        retval.start = input.LT(1);
        int forUpdate_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.expressionList_return expressionList244 = null;



        try { dbg.enterRule(getGrammarFileName(), "forUpdate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(396, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:397:5: ( expressionList )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:397:9: expressionList
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(397,9);
            pushFollow(FOLLOW_expressionList_in_forUpdate2968);
            expressionList244=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList244.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, forUpdate_StartIndex); }
        }
        dbg.location(398, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "forUpdate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "forUpdate"

    public static class parExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:402:1: parExpression : '(' expression ')' ;
    public final JavaParser.parExpression_return parExpression() throws RecognitionException {
        JavaParser.parExpression_return retval = new JavaParser.parExpression_return();
        retval.start = input.LT(1);
        int parExpression_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal245=null;
        Token char_literal247=null;
        JavaParser.expression_return expression246 = null;


        Object char_literal245_tree=null;
        Object char_literal247_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "parExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(402, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:403:5: ( '(' expression ')' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:403:9: '(' expression ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(403,12);
            char_literal245=(Token)match(input,78,FOLLOW_78_in_parExpression2989); if (state.failed) return retval;
            dbg.location(403,14);
            pushFollow(FOLLOW_expression_in_parExpression2992);
            expression246=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression246.getTree());
            dbg.location(403,28);
            char_literal247=(Token)match(input,79,FOLLOW_79_in_parExpression2994); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, parExpression_StartIndex); }
        }
        dbg.location(404, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "parExpression"

    public static class expressionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:406:1: expressionList : expression ( ',' expression )* ;
    public final JavaParser.expressionList_return expressionList() throws RecognitionException {
        JavaParser.expressionList_return retval = new JavaParser.expressionList_return();
        retval.start = input.LT(1);
        int expressionList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal249=null;
        JavaParser.expression_return expression248 = null;

        JavaParser.expression_return expression250 = null;


        Object char_literal249_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expressionList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(406, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:407:5: ( expression ( ',' expression )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:407:9: expression ( ',' expression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(407,9);
            pushFollow(FOLLOW_expression_in_expressionList3018);
            expression248=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression248.getTree());
            dbg.location(407,20);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:407:20: ( ',' expression )*
            try { dbg.enterSubRule(78);

            loop78:
            do {
                int alt78=2;
                try { dbg.enterDecision(78);

                int LA78_0 = input.LA(1);

                if ( (LA78_0==73) ) {
                    alt78=1;
                }


                } finally {dbg.exitDecision(78);}

                switch (alt78) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:407:21: ',' expression
            	    {
            	    dbg.location(407,21);
            	    char_literal249=(Token)match(input,73,FOLLOW_73_in_expressionList3021); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal249_tree = (Object)adaptor.create(char_literal249);
            	    adaptor.addChild(root_0, char_literal249_tree);
            	    }
            	    dbg.location(407,25);
            	    pushFollow(FOLLOW_expression_in_expressionList3023);
            	    expression250=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression250.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);
            } finally {dbg.exitSubRule(78);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, expressionList_StartIndex); }
        }
        dbg.location(408, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expressionList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expressionList"

    public static class statementExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:410:1: statementExpression : expression ;
    public final JavaParser.statementExpression_return statementExpression() throws RecognitionException {
        JavaParser.statementExpression_return retval = new JavaParser.statementExpression_return();
        retval.start = input.LT(1);
        int statementExpression_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.expression_return expression251 = null;



        try { dbg.enterRule(getGrammarFileName(), "statementExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(410, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:411:5: ( expression )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:411:9: expression
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(411,9);
            pushFollow(FOLLOW_expression_in_statementExpression3044);
            expression251=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression251.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, statementExpression_StartIndex); }
        }
        dbg.location(412, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statementExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statementExpression"

    public static class constantExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:414:1: constantExpression : expression ;
    public final JavaParser.constantExpression_return constantExpression() throws RecognitionException {
        JavaParser.constantExpression_return retval = new JavaParser.constantExpression_return();
        retval.start = input.LT(1);
        int constantExpression_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.expression_return expression252 = null;



        try { dbg.enterRule(getGrammarFileName(), "constantExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(414, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:415:5: ( expression )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:415:9: expression
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(415,9);
            pushFollow(FOLLOW_expression_in_constantExpression3067);
            expression252=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression252.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, constantExpression_StartIndex); }
        }
        dbg.location(416, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constantExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constantExpression"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:418:1: expression : ( conditionalExpression assignmentOperator expression | conditionalExpression );
    public final JavaParser.expression_return expression() throws RecognitionException {
        JavaParser.expression_return retval = new JavaParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.conditionalExpression_return conditionalExpression253 = null;

        JavaParser.assignmentOperator_return assignmentOperator254 = null;

        JavaParser.expression_return expression255 = null;

        JavaParser.conditionalExpression_return conditionalExpression256 = null;



        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(418, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:419:5: ( conditionalExpression assignmentOperator expression | conditionalExpression )
            int alt79=2;
            try { dbg.enterDecision(79);

            try {
                isCyclicDecision = true;
                alt79 = dfa79.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(79);}

            switch (alt79) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:419:9: conditionalExpression assignmentOperator expression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(419,9);
                    pushFollow(FOLLOW_conditionalExpression_in_expression3090);
                    conditionalExpression253=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression253.getTree());
                    dbg.location(419,49);
                    pushFollow(FOLLOW_assignmentOperator_in_expression3092);
                    assignmentOperator254=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignmentOperator254.getTree(), root_0);
                    dbg.location(419,51);
                    pushFollow(FOLLOW_expression_in_expression3095);
                    expression255=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression255.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:420:4: conditionalExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(420,4);
                    pushFollow(FOLLOW_conditionalExpression_in_expression3100);
                    conditionalExpression256=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression256.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, expression_StartIndex); }
        }
        dbg.location(421, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"

    public static class assignmentOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentOperator"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:423:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}? | ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}? | ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?);
    public final JavaParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        JavaParser.assignmentOperator_return retval = new JavaParser.assignmentOperator_return();
        retval.start = input.LT(1);
        int assignmentOperator_StartIndex = input.index();
        Object root_0 = null;

        Token t1=null;
        Token t2=null;
        Token t3=null;
        Token t4=null;
        Token char_literal257=null;
        Token string_literal258=null;
        Token string_literal259=null;
        Token string_literal260=null;
        Token string_literal261=null;
        Token string_literal262=null;
        Token string_literal263=null;
        Token string_literal264=null;
        Token string_literal265=null;

        Object t1_tree=null;
        Object t2_tree=null;
        Object t3_tree=null;
        Object t4_tree=null;
        Object char_literal257_tree=null;
        Object string_literal258_tree=null;
        Object string_literal259_tree=null;
        Object string_literal260_tree=null;
        Object string_literal261_tree=null;
        Object string_literal262_tree=null;
        Object string_literal263_tree=null;
        Object string_literal264_tree=null;
        Object string_literal265_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assignmentOperator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(423, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:424:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}? | ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}? | ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?)
            int alt80=12;
            try { dbg.enterDecision(80);

            try {
                isCyclicDecision = true;
                alt80 = dfa80.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(80);}

            switch (alt80) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:424:9: '='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(424,9);
                    char_literal257=(Token)match(input,84,FOLLOW_84_in_assignmentOperator3124); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal257_tree = (Object)adaptor.create(char_literal257);
                    adaptor.addChild(root_0, char_literal257_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:425:9: '+='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(425,9);
                    string_literal258=(Token)match(input,119,FOLLOW_119_in_assignmentOperator3134); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal258_tree = (Object)adaptor.create(string_literal258);
                    adaptor.addChild(root_0, string_literal258_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:426:9: '-='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(426,9);
                    string_literal259=(Token)match(input,120,FOLLOW_120_in_assignmentOperator3144); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal259_tree = (Object)adaptor.create(string_literal259);
                    adaptor.addChild(root_0, string_literal259_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:427:9: '*='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(427,9);
                    string_literal260=(Token)match(input,121,FOLLOW_121_in_assignmentOperator3154); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal260_tree = (Object)adaptor.create(string_literal260);
                    adaptor.addChild(root_0, string_literal260_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:428:9: '/='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(428,9);
                    string_literal261=(Token)match(input,122,FOLLOW_122_in_assignmentOperator3164); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal261_tree = (Object)adaptor.create(string_literal261);
                    adaptor.addChild(root_0, string_literal261_tree);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:429:9: '&='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(429,9);
                    string_literal262=(Token)match(input,123,FOLLOW_123_in_assignmentOperator3174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal262_tree = (Object)adaptor.create(string_literal262);
                    adaptor.addChild(root_0, string_literal262_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:430:9: '|='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(430,9);
                    string_literal263=(Token)match(input,124,FOLLOW_124_in_assignmentOperator3184); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal263_tree = (Object)adaptor.create(string_literal263);
                    adaptor.addChild(root_0, string_literal263_tree);
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:431:9: '^='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(431,9);
                    string_literal264=(Token)match(input,125,FOLLOW_125_in_assignmentOperator3194); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal264_tree = (Object)adaptor.create(string_literal264);
                    adaptor.addChild(root_0, string_literal264_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:432:9: '%='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(432,9);
                    string_literal265=(Token)match(input,126,FOLLOW_126_in_assignmentOperator3204); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal265_tree = (Object)adaptor.create(string_literal265);
                    adaptor.addChild(root_0, string_literal265_tree);
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:433:9: ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(433,27);
                    t1=(Token)match(input,72,FOLLOW_72_in_assignmentOperator3225); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = (Object)adaptor.create(t1);
                    adaptor.addChild(root_0, t1_tree);
                    }
                    dbg.location(433,34);
                    t2=(Token)match(input,72,FOLLOW_72_in_assignmentOperator3229); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = (Object)adaptor.create(t2);
                    adaptor.addChild(root_0, t2_tree);
                    }
                    dbg.location(433,41);
                    t3=(Token)match(input,84,FOLLOW_84_in_assignmentOperator3233); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t3_tree = (Object)adaptor.create(t3);
                    adaptor.addChild(root_0, t3_tree);
                    }
                    dbg.location(434,9);
                    if ( !(evalPredicate( t1.getLine() == t2.getLine() &&
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() && 
                              t2.getLine() == t3.getLine() && 
                              t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() ," $t1.getLine() == $t2.getLine() &&\n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && \n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ")) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "assignmentOperator", " $t1.getLine() == $t2.getLine() &&\n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && \n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ");
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:438:9: ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(438,31);
                    t1=(Token)match(input,74,FOLLOW_74_in_assignmentOperator3267); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = (Object)adaptor.create(t1);
                    adaptor.addChild(root_0, t1_tree);
                    }
                    dbg.location(438,38);
                    t2=(Token)match(input,74,FOLLOW_74_in_assignmentOperator3271); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = (Object)adaptor.create(t2);
                    adaptor.addChild(root_0, t2_tree);
                    }
                    dbg.location(438,45);
                    t3=(Token)match(input,74,FOLLOW_74_in_assignmentOperator3275); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t3_tree = (Object)adaptor.create(t3);
                    adaptor.addChild(root_0, t3_tree);
                    }
                    dbg.location(438,52);
                    t4=(Token)match(input,84,FOLLOW_84_in_assignmentOperator3279); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t4_tree = (Object)adaptor.create(t4);
                    adaptor.addChild(root_0, t4_tree);
                    }
                    dbg.location(439,9);
                    if ( !(evalPredicate( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() &&
                              t2.getLine() == t3.getLine() && 
                              t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() &&
                              t3.getLine() == t4.getLine() && 
                              t3.getCharPositionInLine() + 1 == t4.getCharPositionInLine() ," $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&\n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() &&\n          $t3.getLine() == $t4.getLine() && \n          $t3.getCharPositionInLine() + 1 == $t4.getCharPositionInLine() ")) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "assignmentOperator", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&\n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() &&\n          $t3.getLine() == $t4.getLine() && \n          $t3.getCharPositionInLine() + 1 == $t4.getCharPositionInLine() ");
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:445:9: ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(445,27);
                    t1=(Token)match(input,74,FOLLOW_74_in_assignmentOperator3310); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = (Object)adaptor.create(t1);
                    adaptor.addChild(root_0, t1_tree);
                    }
                    dbg.location(445,34);
                    t2=(Token)match(input,74,FOLLOW_74_in_assignmentOperator3314); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = (Object)adaptor.create(t2);
                    adaptor.addChild(root_0, t2_tree);
                    }
                    dbg.location(445,41);
                    t3=(Token)match(input,84,FOLLOW_84_in_assignmentOperator3318); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t3_tree = (Object)adaptor.create(t3);
                    adaptor.addChild(root_0, t3_tree);
                    }
                    dbg.location(446,9);
                    if ( !(evalPredicate( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() && 
                              t2.getLine() == t3.getLine() && 
                              t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() ," $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && \n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ")) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "assignmentOperator", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && \n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ");
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, assignmentOperator_StartIndex); }
        }
        dbg.location(450, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignmentOperator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignmentOperator"

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:452:1: conditionalExpression : conditionalOrExpression ( '?' conditionalExpression ':' conditionalExpression )? ;
    public final JavaParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        JavaParser.conditionalExpression_return retval = new JavaParser.conditionalExpression_return();
        retval.start = input.LT(1);
        int conditionalExpression_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal267=null;
        Token char_literal269=null;
        JavaParser.conditionalOrExpression_return conditionalOrExpression266 = null;

        JavaParser.conditionalExpression_return conditionalExpression268 = null;

        JavaParser.conditionalExpression_return conditionalExpression270 = null;


        Object char_literal267_tree=null;
        Object char_literal269_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(452, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:453:5: ( conditionalOrExpression ( '?' conditionalExpression ':' conditionalExpression )? )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:453:9: conditionalOrExpression ( '?' conditionalExpression ':' conditionalExpression )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(453,9);
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression3347);
            conditionalOrExpression266=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression266.getTree());
            dbg.location(453,33);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:453:33: ( '?' conditionalExpression ':' conditionalExpression )?
            int alt81=2;
            try { dbg.enterSubRule(81);
            try { dbg.enterDecision(81);

            int LA81_0 = input.LA(1);

            if ( (LA81_0==101) ) {
                alt81=1;
            }
            } finally {dbg.exitDecision(81);}

            switch (alt81) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:453:35: '?' conditionalExpression ':' conditionalExpression
                    {
                    dbg.location(453,35);
                    char_literal267=(Token)match(input,101,FOLLOW_101_in_conditionalExpression3351); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal267_tree = (Object)adaptor.create(char_literal267);
                    adaptor.addChild(root_0, char_literal267_tree);
                    }
                    dbg.location(453,39);
                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression3353);
                    conditionalExpression268=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression268.getTree());
                    dbg.location(453,61);
                    char_literal269=(Token)match(input,116,FOLLOW_116_in_conditionalExpression3355); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal269_tree = (Object)adaptor.create(char_literal269);
                    adaptor.addChild(root_0, char_literal269_tree);
                    }
                    dbg.location(453,65);
                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression3357);
                    conditionalExpression270=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression270.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(81);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, conditionalExpression_StartIndex); }
        }
        dbg.location(454, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conditionalExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "conditionalExpression"

    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalOrExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:456:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
    public final JavaParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        JavaParser.conditionalOrExpression_return retval = new JavaParser.conditionalOrExpression_return();
        retval.start = input.LT(1);
        int conditionalOrExpression_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal272=null;
        JavaParser.conditionalAndExpression_return conditionalAndExpression271 = null;

        JavaParser.conditionalAndExpression_return conditionalAndExpression273 = null;


        Object string_literal272_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalOrExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(456, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:457:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:457:9: conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(457,9);
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression3379);
            conditionalAndExpression271=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression271.getTree());
            dbg.location(457,34);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:457:34: ( '||' conditionalAndExpression )*
            try { dbg.enterSubRule(82);

            loop82:
            do {
                int alt82=2;
                try { dbg.enterDecision(82);

                int LA82_0 = input.LA(1);

                if ( (LA82_0==127) ) {
                    alt82=1;
                }


                } finally {dbg.exitDecision(82);}

                switch (alt82) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:457:36: '||' conditionalAndExpression
            	    {
            	    dbg.location(457,40);
            	    string_literal272=(Token)match(input,127,FOLLOW_127_in_conditionalOrExpression3383); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal272_tree = (Object)adaptor.create(string_literal272);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal272_tree, root_0);
            	    }
            	    dbg.location(457,42);
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression3386);
            	    conditionalAndExpression273=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression273.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);
            } finally {dbg.exitSubRule(82);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, conditionalOrExpression_StartIndex); }
        }
        dbg.location(458, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conditionalOrExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "conditionalOrExpression"

    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalAndExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:460:1: conditionalAndExpression : inclusiveOrExpression ( '&&' inclusiveOrExpression )* ;
    public final JavaParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        JavaParser.conditionalAndExpression_return retval = new JavaParser.conditionalAndExpression_return();
        retval.start = input.LT(1);
        int conditionalAndExpression_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal275=null;
        JavaParser.inclusiveOrExpression_return inclusiveOrExpression274 = null;

        JavaParser.inclusiveOrExpression_return inclusiveOrExpression276 = null;


        Object string_literal275_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conditionalAndExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(460, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:461:5: ( inclusiveOrExpression ( '&&' inclusiveOrExpression )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:461:9: inclusiveOrExpression ( '&&' inclusiveOrExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(461,9);
            pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression3408);
            inclusiveOrExpression274=inclusiveOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusiveOrExpression274.getTree());
            dbg.location(461,31);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:461:31: ( '&&' inclusiveOrExpression )*
            try { dbg.enterSubRule(83);

            loop83:
            do {
                int alt83=2;
                try { dbg.enterDecision(83);

                int LA83_0 = input.LA(1);

                if ( (LA83_0==128) ) {
                    alt83=1;
                }


                } finally {dbg.exitDecision(83);}

                switch (alt83) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:461:33: '&&' inclusiveOrExpression
            	    {
            	    dbg.location(461,37);
            	    string_literal275=(Token)match(input,128,FOLLOW_128_in_conditionalAndExpression3412); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal275_tree = (Object)adaptor.create(string_literal275);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal275_tree, root_0);
            	    }
            	    dbg.location(461,39);
            	    pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression3415);
            	    inclusiveOrExpression276=inclusiveOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusiveOrExpression276.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);
            } finally {dbg.exitSubRule(83);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, conditionalAndExpression_StartIndex); }
        }
        dbg.location(462, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conditionalAndExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "conditionalAndExpression"

    public static class inclusiveOrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inclusiveOrExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:464:1: inclusiveOrExpression : exclusiveOrExpression ( '|' exclusiveOrExpression )* ;
    public final JavaParser.inclusiveOrExpression_return inclusiveOrExpression() throws RecognitionException {
        JavaParser.inclusiveOrExpression_return retval = new JavaParser.inclusiveOrExpression_return();
        retval.start = input.LT(1);
        int inclusiveOrExpression_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal278=null;
        JavaParser.exclusiveOrExpression_return exclusiveOrExpression277 = null;

        JavaParser.exclusiveOrExpression_return exclusiveOrExpression279 = null;


        Object char_literal278_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inclusiveOrExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(464, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:465:5: ( exclusiveOrExpression ( '|' exclusiveOrExpression )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:465:9: exclusiveOrExpression ( '|' exclusiveOrExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(465,9);
            pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression3437);
            exclusiveOrExpression277=exclusiveOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusiveOrExpression277.getTree());
            dbg.location(465,31);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:465:31: ( '|' exclusiveOrExpression )*
            try { dbg.enterSubRule(84);

            loop84:
            do {
                int alt84=2;
                try { dbg.enterDecision(84);

                int LA84_0 = input.LA(1);

                if ( (LA84_0==129) ) {
                    alt84=1;
                }


                } finally {dbg.exitDecision(84);}

                switch (alt84) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:465:33: '|' exclusiveOrExpression
            	    {
            	    dbg.location(465,36);
            	    char_literal278=(Token)match(input,129,FOLLOW_129_in_inclusiveOrExpression3441); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal278_tree = (Object)adaptor.create(char_literal278);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal278_tree, root_0);
            	    }
            	    dbg.location(465,38);
            	    pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression3444);
            	    exclusiveOrExpression279=exclusiveOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusiveOrExpression279.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);
            } finally {dbg.exitSubRule(84);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, inclusiveOrExpression_StartIndex); }
        }
        dbg.location(466, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inclusiveOrExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inclusiveOrExpression"

    public static class exclusiveOrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exclusiveOrExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:468:1: exclusiveOrExpression : andExpression ( '^' andExpression )* ;
    public final JavaParser.exclusiveOrExpression_return exclusiveOrExpression() throws RecognitionException {
        JavaParser.exclusiveOrExpression_return retval = new JavaParser.exclusiveOrExpression_return();
        retval.start = input.LT(1);
        int exclusiveOrExpression_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal281=null;
        JavaParser.andExpression_return andExpression280 = null;

        JavaParser.andExpression_return andExpression282 = null;


        Object char_literal281_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exclusiveOrExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(468, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:469:5: ( andExpression ( '^' andExpression )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:469:9: andExpression ( '^' andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(469,9);
            pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression3466);
            andExpression280=andExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression280.getTree());
            dbg.location(469,23);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:469:23: ( '^' andExpression )*
            try { dbg.enterSubRule(85);

            loop85:
            do {
                int alt85=2;
                try { dbg.enterDecision(85);

                int LA85_0 = input.LA(1);

                if ( (LA85_0==130) ) {
                    alt85=1;
                }


                } finally {dbg.exitDecision(85);}

                switch (alt85) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:469:25: '^' andExpression
            	    {
            	    dbg.location(469,28);
            	    char_literal281=(Token)match(input,130,FOLLOW_130_in_exclusiveOrExpression3470); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal281_tree = (Object)adaptor.create(char_literal281);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal281_tree, root_0);
            	    }
            	    dbg.location(469,30);
            	    pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression3473);
            	    andExpression282=andExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression282.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);
            } finally {dbg.exitSubRule(85);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, exclusiveOrExpression_StartIndex); }
        }
        dbg.location(470, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exclusiveOrExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exclusiveOrExpression"

    public static class andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:472:1: andExpression : equalityExpression ( '&' equalityExpression )* ;
    public final JavaParser.andExpression_return andExpression() throws RecognitionException {
        JavaParser.andExpression_return retval = new JavaParser.andExpression_return();
        retval.start = input.LT(1);
        int andExpression_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal284=null;
        JavaParser.equalityExpression_return equalityExpression283 = null;

        JavaParser.equalityExpression_return equalityExpression285 = null;


        Object char_literal284_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "andExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(472, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:473:5: ( equalityExpression ( '&' equalityExpression )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:473:9: equalityExpression ( '&' equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(473,9);
            pushFollow(FOLLOW_equalityExpression_in_andExpression3495);
            equalityExpression283=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression283.getTree());
            dbg.location(473,28);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:473:28: ( '&' equalityExpression )*
            try { dbg.enterSubRule(86);

            loop86:
            do {
                int alt86=2;
                try { dbg.enterDecision(86);

                int LA86_0 = input.LA(1);

                if ( (LA86_0==76) ) {
                    alt86=1;
                }


                } finally {dbg.exitDecision(86);}

                switch (alt86) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:473:30: '&' equalityExpression
            	    {
            	    dbg.location(473,33);
            	    char_literal284=(Token)match(input,76,FOLLOW_76_in_andExpression3499); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal284_tree = (Object)adaptor.create(char_literal284);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal284_tree, root_0);
            	    }
            	    dbg.location(473,35);
            	    pushFollow(FOLLOW_equalityExpression_in_andExpression3502);
            	    equalityExpression285=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression285.getTree());

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);
            } finally {dbg.exitSubRule(86);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, andExpression_StartIndex); }
        }
        dbg.location(474, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "andExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "andExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:476:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
    public final JavaParser.equalityExpression_return equalityExpression() throws RecognitionException {
        JavaParser.equalityExpression_return retval = new JavaParser.equalityExpression_return();
        retval.start = input.LT(1);
        int equalityExpression_StartIndex = input.index();
        Object root_0 = null;

        Token set287=null;
        JavaParser.instanceOfExpression_return instanceOfExpression286 = null;

        JavaParser.instanceOfExpression_return instanceOfExpression288 = null;


        Object set287_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "equalityExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(476, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:477:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:477:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(477,9);
            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression3524);
            instanceOfExpression286=instanceOfExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression286.getTree());
            dbg.location(477,30);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:477:30: ( ( '==' | '!=' ) instanceOfExpression )*
            try { dbg.enterSubRule(87);

            loop87:
            do {
                int alt87=2;
                try { dbg.enterDecision(87);

                int LA87_0 = input.LA(1);

                if ( ((LA87_0>=131 && LA87_0<=132)) ) {
                    alt87=1;
                }


                } finally {dbg.exitDecision(87);}

                switch (alt87) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:477:32: ( '==' | '!=' ) instanceOfExpression
            	    {
            	    dbg.location(477,32);
            	    set287=(Token)input.LT(1);
            	    set287=(Token)input.LT(1);
            	    if ( (input.LA(1)>=131 && input.LA(1)<=132) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set287), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(477,47);
            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression3537);
            	    instanceOfExpression288=instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression288.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);
            } finally {dbg.exitSubRule(87);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, equalityExpression_StartIndex); }
        }
        dbg.location(478, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equalityExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class instanceOfExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceOfExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:480:1: instanceOfExpression : relationalExpression ( 'instanceof' type )? ;
    public final JavaParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
        JavaParser.instanceOfExpression_return retval = new JavaParser.instanceOfExpression_return();
        retval.start = input.LT(1);
        int instanceOfExpression_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal290=null;
        JavaParser.relationalExpression_return relationalExpression289 = null;

        JavaParser.type_return type291 = null;


        Object string_literal290_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "instanceOfExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(480, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:481:5: ( relationalExpression ( 'instanceof' type )? )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:481:9: relationalExpression ( 'instanceof' type )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(481,9);
            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression3559);
            relationalExpression289=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression289.getTree());
            dbg.location(481,30);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:481:30: ( 'instanceof' type )?
            int alt88=2;
            try { dbg.enterSubRule(88);
            try { dbg.enterDecision(88);

            int LA88_0 = input.LA(1);

            if ( (LA88_0==133) ) {
                alt88=1;
            }
            } finally {dbg.exitDecision(88);}

            switch (alt88) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:481:31: 'instanceof' type
                    {
                    dbg.location(481,43);
                    string_literal290=(Token)match(input,133,FOLLOW_133_in_instanceOfExpression3562); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal290_tree = (Object)adaptor.create(string_literal290);
                    root_0 = (Object)adaptor.becomeRoot(string_literal290_tree, root_0);
                    }
                    dbg.location(481,45);
                    pushFollow(FOLLOW_type_in_instanceOfExpression3565);
                    type291=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type291.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(88);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, instanceOfExpression_StartIndex); }
        }
        dbg.location(482, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "instanceOfExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "instanceOfExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:484:1: relationalExpression : shiftExpression ( relationalOp shiftExpression )* ;
    public final JavaParser.relationalExpression_return relationalExpression() throws RecognitionException {
        JavaParser.relationalExpression_return retval = new JavaParser.relationalExpression_return();
        retval.start = input.LT(1);
        int relationalExpression_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.shiftExpression_return shiftExpression292 = null;

        JavaParser.relationalOp_return relationalOp293 = null;

        JavaParser.shiftExpression_return shiftExpression294 = null;



        try { dbg.enterRule(getGrammarFileName(), "relationalExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(484, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:485:5: ( shiftExpression ( relationalOp shiftExpression )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:485:9: shiftExpression ( relationalOp shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(485,9);
            pushFollow(FOLLOW_shiftExpression_in_relationalExpression3586);
            shiftExpression292=shiftExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression292.getTree());
            dbg.location(485,25);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:485:25: ( relationalOp shiftExpression )*
            try { dbg.enterSubRule(89);

            loop89:
            do {
                int alt89=2;
                try { dbg.enterDecision(89);

                int LA89_0 = input.LA(1);

                if ( (LA89_0==72) ) {
                    int LA89_2 = input.LA(2);

                    if ( ((LA89_2>=Identifier && LA89_2<=DecimalLiteral)||LA89_2==78||LA89_2==80||LA89_2==84||(LA89_2>=93 && LA89_2<=100)||(LA89_2>=102 && LA89_2<=106)||(LA89_2>=134 && LA89_2<=135)||(LA89_2>=139 && LA89_2<=144)) ) {
                        alt89=1;
                    }


                }
                else if ( (LA89_0==74) ) {
                    int LA89_3 = input.LA(2);

                    if ( ((LA89_3>=Identifier && LA89_3<=DecimalLiteral)||LA89_3==78||LA89_3==80||LA89_3==84||(LA89_3>=93 && LA89_3<=100)||(LA89_3>=102 && LA89_3<=106)||(LA89_3>=134 && LA89_3<=135)||(LA89_3>=139 && LA89_3<=144)) ) {
                        alt89=1;
                    }


                }


                } finally {dbg.exitDecision(89);}

                switch (alt89) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:485:27: relationalOp shiftExpression
            	    {
            	    dbg.location(485,39);
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression3590);
            	    relationalOp293=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(relationalOp293.getTree(), root_0);
            	    dbg.location(485,41);
            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression3593);
            	    shiftExpression294=shiftExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression294.getTree());

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);
            } finally {dbg.exitSubRule(89);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, relationalExpression_StartIndex); }
        }
        dbg.location(486, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relationalExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class relationalOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalOp"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:488:1: relationalOp : ( ( '<' '=' )=>t1= '<' t2= '=' {...}? | ( '>' '=' )=>t1= '>' t2= '=' {...}? | '<' | '>' );
    public final JavaParser.relationalOp_return relationalOp() throws RecognitionException {
        JavaParser.relationalOp_return retval = new JavaParser.relationalOp_return();
        retval.start = input.LT(1);
        int relationalOp_StartIndex = input.index();
        Object root_0 = null;

        Token t1=null;
        Token t2=null;
        Token char_literal295=null;
        Token char_literal296=null;

        Object t1_tree=null;
        Object t2_tree=null;
        Object char_literal295_tree=null;
        Object char_literal296_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "relationalOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(488, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:489:5: ( ( '<' '=' )=>t1= '<' t2= '=' {...}? | ( '>' '=' )=>t1= '>' t2= '=' {...}? | '<' | '>' )
            int alt90=4;
            try { dbg.enterDecision(90);

            int LA90_0 = input.LA(1);

            if ( (LA90_0==72) ) {
                int LA90_1 = input.LA(2);

                if ( (LA90_1==84) && (synpred142_Java())) {
                    alt90=1;
                }
                else if ( ((LA90_1>=Identifier && LA90_1<=DecimalLiteral)||LA90_1==78||LA90_1==80||(LA90_1>=93 && LA90_1<=100)||(LA90_1>=102 && LA90_1<=106)||(LA90_1>=134 && LA90_1<=135)||(LA90_1>=139 && LA90_1<=144)) ) {
                    alt90=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA90_0==74) ) {
                int LA90_2 = input.LA(2);

                if ( (LA90_2==84) && (synpred143_Java())) {
                    alt90=2;
                }
                else if ( ((LA90_2>=Identifier && LA90_2<=DecimalLiteral)||LA90_2==78||LA90_2==80||(LA90_2>=93 && LA90_2<=100)||(LA90_2>=102 && LA90_2<=106)||(LA90_2>=134 && LA90_2<=135)||(LA90_2>=139 && LA90_2<=144)) ) {
                    alt90=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(90);}

            switch (alt90) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:489:9: ( '<' '=' )=>t1= '<' t2= '=' {...}?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(489,23);
                    t1=(Token)match(input,72,FOLLOW_72_in_relationalOp3628); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = (Object)adaptor.create(t1);
                    adaptor.addChild(root_0, t1_tree);
                    }
                    dbg.location(489,30);
                    t2=(Token)match(input,84,FOLLOW_84_in_relationalOp3632); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = (Object)adaptor.create(t2);
                    adaptor.addChild(root_0, t2_tree);
                    }
                    dbg.location(490,9);
                    if ( !(evalPredicate( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() ," $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ")) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "relationalOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:492:9: ( '>' '=' )=>t1= '>' t2= '=' {...}?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(492,23);
                    t1=(Token)match(input,74,FOLLOW_74_in_relationalOp3662); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = (Object)adaptor.create(t1);
                    adaptor.addChild(root_0, t1_tree);
                    }
                    dbg.location(492,30);
                    t2=(Token)match(input,84,FOLLOW_84_in_relationalOp3666); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = (Object)adaptor.create(t2);
                    adaptor.addChild(root_0, t2_tree);
                    }
                    dbg.location(493,9);
                    if ( !(evalPredicate( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() ," $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ")) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "relationalOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:495:9: '<'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(495,9);
                    char_literal295=(Token)match(input,72,FOLLOW_72_in_relationalOp3687); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal295_tree = (Object)adaptor.create(char_literal295);
                    adaptor.addChild(root_0, char_literal295_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:496:9: '>'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(496,9);
                    char_literal296=(Token)match(input,74,FOLLOW_74_in_relationalOp3698); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal296_tree = (Object)adaptor.create(char_literal296);
                    adaptor.addChild(root_0, char_literal296_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, relationalOp_StartIndex); }
        }
        dbg.location(497, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relationalOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relationalOp"

    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:499:1: shiftExpression : additiveExpression ( shiftOp additiveExpression )* ;
    public final JavaParser.shiftExpression_return shiftExpression() throws RecognitionException {
        JavaParser.shiftExpression_return retval = new JavaParser.shiftExpression_return();
        retval.start = input.LT(1);
        int shiftExpression_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.additiveExpression_return additiveExpression297 = null;

        JavaParser.shiftOp_return shiftOp298 = null;

        JavaParser.additiveExpression_return additiveExpression299 = null;



        try { dbg.enterRule(getGrammarFileName(), "shiftExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(499, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:500:5: ( additiveExpression ( shiftOp additiveExpression )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:500:9: additiveExpression ( shiftOp additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(500,9);
            pushFollow(FOLLOW_additiveExpression_in_shiftExpression3718);
            additiveExpression297=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression297.getTree());
            dbg.location(500,28);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:500:28: ( shiftOp additiveExpression )*
            try { dbg.enterSubRule(91);

            loop91:
            do {
                int alt91=2;
                try { dbg.enterDecision(91);

                int LA91_0 = input.LA(1);

                if ( (LA91_0==72) ) {
                    int LA91_1 = input.LA(2);

                    if ( (LA91_1==72) ) {
                        int LA91_4 = input.LA(3);

                        if ( ((LA91_4>=Identifier && LA91_4<=DecimalLiteral)||LA91_4==78||LA91_4==80||(LA91_4>=93 && LA91_4<=100)||(LA91_4>=102 && LA91_4<=106)||(LA91_4>=134 && LA91_4<=135)||(LA91_4>=139 && LA91_4<=144)) ) {
                            alt91=1;
                        }


                    }


                }
                else if ( (LA91_0==74) ) {
                    int LA91_2 = input.LA(2);

                    if ( (LA91_2==74) ) {
                        int LA91_5 = input.LA(3);

                        if ( (LA91_5==74) ) {
                            int LA91_7 = input.LA(4);

                            if ( ((LA91_7>=Identifier && LA91_7<=DecimalLiteral)||LA91_7==78||LA91_7==80||(LA91_7>=93 && LA91_7<=100)||(LA91_7>=102 && LA91_7<=106)||(LA91_7>=134 && LA91_7<=135)||(LA91_7>=139 && LA91_7<=144)) ) {
                                alt91=1;
                            }


                        }
                        else if ( ((LA91_5>=Identifier && LA91_5<=DecimalLiteral)||LA91_5==78||LA91_5==80||(LA91_5>=93 && LA91_5<=100)||(LA91_5>=102 && LA91_5<=106)||(LA91_5>=134 && LA91_5<=135)||(LA91_5>=139 && LA91_5<=144)) ) {
                            alt91=1;
                        }


                    }


                }


                } finally {dbg.exitDecision(91);}

                switch (alt91) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:500:30: shiftOp additiveExpression
            	    {
            	    dbg.location(500,37);
            	    pushFollow(FOLLOW_shiftOp_in_shiftExpression3722);
            	    shiftOp298=shiftOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(shiftOp298.getTree(), root_0);
            	    dbg.location(500,39);
            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression3725);
            	    additiveExpression299=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression299.getTree());

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);
            } finally {dbg.exitSubRule(91);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, shiftExpression_StartIndex); }
        }
        dbg.location(501, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "shiftExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "shiftExpression"

    public static class shiftOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftOp"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:503:1: shiftOp : ( ( '<' '<' )=>t1= '<' t2= '<' {...}? | ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}? | ( '>' '>' )=>t1= '>' t2= '>' {...}?);
    public final JavaParser.shiftOp_return shiftOp() throws RecognitionException {
        JavaParser.shiftOp_return retval = new JavaParser.shiftOp_return();
        retval.start = input.LT(1);
        int shiftOp_StartIndex = input.index();
        Object root_0 = null;

        Token t1=null;
        Token t2=null;
        Token t3=null;

        Object t1_tree=null;
        Object t2_tree=null;
        Object t3_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "shiftOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(503, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:504:5: ( ( '<' '<' )=>t1= '<' t2= '<' {...}? | ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}? | ( '>' '>' )=>t1= '>' t2= '>' {...}?)
            int alt92=3;
            try { dbg.enterDecision(92);

            try {
                isCyclicDecision = true;
                alt92 = dfa92.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(92);}

            switch (alt92) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:504:9: ( '<' '<' )=>t1= '<' t2= '<' {...}?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(504,23);
                    t1=(Token)match(input,72,FOLLOW_72_in_shiftOp3756); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = (Object)adaptor.create(t1);
                    adaptor.addChild(root_0, t1_tree);
                    }
                    dbg.location(504,30);
                    t2=(Token)match(input,72,FOLLOW_72_in_shiftOp3760); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = (Object)adaptor.create(t2);
                    adaptor.addChild(root_0, t2_tree);
                    }
                    dbg.location(505,9);
                    if ( !(evalPredicate( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() ," $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ")) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:507:9: ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(507,27);
                    t1=(Token)match(input,74,FOLLOW_74_in_shiftOp3792); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = (Object)adaptor.create(t1);
                    adaptor.addChild(root_0, t1_tree);
                    }
                    dbg.location(507,34);
                    t2=(Token)match(input,74,FOLLOW_74_in_shiftOp3796); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = (Object)adaptor.create(t2);
                    adaptor.addChild(root_0, t2_tree);
                    }
                    dbg.location(507,41);
                    t3=(Token)match(input,74,FOLLOW_74_in_shiftOp3800); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t3_tree = (Object)adaptor.create(t3);
                    adaptor.addChild(root_0, t3_tree);
                    }
                    dbg.location(508,9);
                    if ( !(evalPredicate( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() &&
                              t2.getLine() == t3.getLine() && 
                              t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() ," $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&\n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ")) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&\n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ");
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:512:9: ( '>' '>' )=>t1= '>' t2= '>' {...}?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(512,23);
                    t1=(Token)match(input,74,FOLLOW_74_in_shiftOp3830); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t1_tree = (Object)adaptor.create(t1);
                    adaptor.addChild(root_0, t1_tree);
                    }
                    dbg.location(512,30);
                    t2=(Token)match(input,74,FOLLOW_74_in_shiftOp3834); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    t2_tree = (Object)adaptor.create(t2);
                    adaptor.addChild(root_0, t2_tree);
                    }
                    dbg.location(513,9);
                    if ( !(evalPredicate( t1.getLine() == t2.getLine() && 
                              t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() ," $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ")) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, shiftOp_StartIndex); }
        }
        dbg.location(515, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "shiftOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "shiftOp"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:518:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final JavaParser.additiveExpression_return additiveExpression() throws RecognitionException {
        JavaParser.additiveExpression_return retval = new JavaParser.additiveExpression_return();
        retval.start = input.LT(1);
        int additiveExpression_StartIndex = input.index();
        Object root_0 = null;

        Token set301=null;
        JavaParser.multiplicativeExpression_return multiplicativeExpression300 = null;

        JavaParser.multiplicativeExpression_return multiplicativeExpression302 = null;


        Object set301_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "additiveExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(518, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:519:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:519:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(519,9);
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3864);
            multiplicativeExpression300=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression300.getTree());
            dbg.location(519,34);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:519:34: ( ( '+' | '-' ) multiplicativeExpression )*
            try { dbg.enterSubRule(93);

            loop93:
            do {
                int alt93=2;
                try { dbg.enterDecision(93);

                int LA93_0 = input.LA(1);

                if ( ((LA93_0>=134 && LA93_0<=135)) ) {
                    alt93=1;
                }


                } finally {dbg.exitDecision(93);}

                switch (alt93) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:519:36: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    dbg.location(519,36);
            	    set301=(Token)input.LT(1);
            	    set301=(Token)input.LT(1);
            	    if ( (input.LA(1)>=134 && input.LA(1)<=135) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set301), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(519,49);
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3877);
            	    multiplicativeExpression302=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression302.getTree());

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);
            } finally {dbg.exitSubRule(93);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, additiveExpression_StartIndex); }
        }
        dbg.location(520, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "additiveExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:522:1: multiplicativeExpression : a= unaryExpression ( ( '*' | '/' | '%' ) b= unaryExpression )* ;
    public final JavaParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        JavaParser.multiplicativeExpression_return retval = new JavaParser.multiplicativeExpression_return();
        retval.start = input.LT(1);
        int multiplicativeExpression_StartIndex = input.index();
        Object root_0 = null;

        Token set303=null;
        JavaParser.unaryExpression_return a = null;

        JavaParser.unaryExpression_return b = null;


        Object set303_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "multiplicativeExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(522, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:523:5: (a= unaryExpression ( ( '*' | '/' | '%' ) b= unaryExpression )* )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:523:9: a= unaryExpression ( ( '*' | '/' | '%' ) b= unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(523,10);
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3901);
            a=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());
            dbg.location(523,27);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:523:27: ( ( '*' | '/' | '%' ) b= unaryExpression )*
            try { dbg.enterSubRule(94);

            loop94:
            do {
                int alt94=2;
                try { dbg.enterDecision(94);

                int LA94_0 = input.LA(1);

                if ( ((LA94_0>=136 && LA94_0<=138)) ) {
                    alt94=1;
                }


                } finally {dbg.exitDecision(94);}

                switch (alt94) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:523:29: ( '*' | '/' | '%' ) b= unaryExpression
            	    {
            	    dbg.location(523,29);
            	    set303=(Token)input.LT(1);
            	    set303=(Token)input.LT(1);
            	    if ( (input.LA(1)>=136 && input.LA(1)<=138) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set303), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(523,51);
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3922);
            	    b=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, b.getTree());

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);
            } finally {dbg.exitSubRule(94);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, multiplicativeExpression_StartIndex); }
        }
        dbg.location(524, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multiplicativeExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:526:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression -> ^( LEFT_INC unaryExpression ) | '--' unaryExpression -> ^( LEFT_DEC unaryExpression ) | unaryExpressionNotPlusMinus );
    public final JavaParser.unaryExpression_return unaryExpression() throws RecognitionException {
        JavaParser.unaryExpression_return retval = new JavaParser.unaryExpression_return();
        retval.start = input.LT(1);
        int unaryExpression_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal304=null;
        Token char_literal306=null;
        Token string_literal308=null;
        Token string_literal310=null;
        JavaParser.unaryExpression_return unaryExpression305 = null;

        JavaParser.unaryExpression_return unaryExpression307 = null;

        JavaParser.unaryExpression_return unaryExpression309 = null;

        JavaParser.unaryExpression_return unaryExpression311 = null;

        JavaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus312 = null;


        Object char_literal304_tree=null;
        Object char_literal306_tree=null;
        Object string_literal308_tree=null;
        Object string_literal310_tree=null;
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try { dbg.enterRule(getGrammarFileName(), "unaryExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(526, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:527:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression -> ^( LEFT_INC unaryExpression ) | '--' unaryExpression -> ^( LEFT_DEC unaryExpression ) | unaryExpressionNotPlusMinus )
            int alt95=5;
            try { dbg.enterDecision(95);

            switch ( input.LA(1) ) {
            case 134:
                {
                alt95=1;
                }
                break;
            case 135:
                {
                alt95=2;
                }
                break;
            case 139:
                {
                alt95=3;
                }
                break;
            case 140:
                {
                alt95=4;
                }
                break;
            case Identifier:
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case 78:
            case 80:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 141:
            case 142:
            case 143:
            case 144:
                {
                alt95=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(95);}

            switch (alt95) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:527:9: '+' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(527,9);
                    char_literal304=(Token)match(input,134,FOLLOW_134_in_unaryExpression3948); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal304_tree = (Object)adaptor.create(char_literal304);
                    adaptor.addChild(root_0, char_literal304_tree);
                    }
                    dbg.location(527,13);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression3950);
                    unaryExpression305=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression305.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:528:9: '-' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(528,9);
                    char_literal306=(Token)match(input,135,FOLLOW_135_in_unaryExpression3960); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal306_tree = (Object)adaptor.create(char_literal306);
                    adaptor.addChild(root_0, char_literal306_tree);
                    }
                    dbg.location(528,13);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression3962);
                    unaryExpression307=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression307.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:529:9: '++' unaryExpression
                    {
                    dbg.location(529,9);
                    string_literal308=(Token)match(input,139,FOLLOW_139_in_unaryExpression3972); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_139.add(string_literal308);

                    dbg.location(529,14);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression3974);
                    unaryExpression309=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression309.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 529:30: -> ^( LEFT_INC unaryExpression )
                    {
                        dbg.location(529,32);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:529:32: ^( LEFT_INC unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(529,34);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LEFT_INC, "LEFT_INC"), root_1);

                        dbg.location(529,43);
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:530:9: '--' unaryExpression
                    {
                    dbg.location(530,9);
                    string_literal310=(Token)match(input,140,FOLLOW_140_in_unaryExpression3991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_140.add(string_literal310);

                    dbg.location(530,14);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression3993);
                    unaryExpression311=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression311.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 530:30: -> ^( LEFT_DEC unaryExpression )
                    {
                        dbg.location(530,32);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:530:32: ^( LEFT_DEC unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(530,34);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LEFT_DEC, "LEFT_DEC"), root_1);

                        dbg.location(530,43);
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:531:9: unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(531,9);
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression4010);
                    unaryExpressionNotPlusMinus312=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus312.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 92, unaryExpression_StartIndex); }
        }
        dbg.location(532, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unaryExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpressionNotPlusMinus"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:534:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* '++' -> ^( RIGHT_INC primary ( selector )* ) | primary ( selector )* '--' -> ^( RIGHT_DEC primary ( selector )* ) | primary ( selector )* );
    public final JavaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        JavaParser.unaryExpressionNotPlusMinus_return retval = new JavaParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);
        int unaryExpressionNotPlusMinus_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal313=null;
        Token char_literal315=null;
        Token string_literal320=null;
        Token string_literal323=null;
        JavaParser.unaryExpression_return unaryExpression314 = null;

        JavaParser.unaryExpression_return unaryExpression316 = null;

        JavaParser.castExpression_return castExpression317 = null;

        JavaParser.primary_return primary318 = null;

        JavaParser.selector_return selector319 = null;

        JavaParser.primary_return primary321 = null;

        JavaParser.selector_return selector322 = null;

        JavaParser.primary_return primary324 = null;

        JavaParser.selector_return selector325 = null;


        Object char_literal313_tree=null;
        Object char_literal315_tree=null;
        Object string_literal320_tree=null;
        Object string_literal323_tree=null;
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        try { dbg.enterRule(getGrammarFileName(), "unaryExpressionNotPlusMinus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(534, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:535:5: ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* '++' -> ^( RIGHT_INC primary ( selector )* ) | primary ( selector )* '--' -> ^( RIGHT_DEC primary ( selector )* ) | primary ( selector )* )
            int alt99=6;
            try { dbg.enterDecision(99);

            try {
                isCyclicDecision = true;
                alt99 = dfa99.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(99);}

            switch (alt99) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:535:9: '~' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(535,12);
                    char_literal313=(Token)match(input,141,FOLLOW_141_in_unaryExpressionNotPlusMinus4029); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal313_tree = (Object)adaptor.create(char_literal313);
                    root_0 = (Object)adaptor.becomeRoot(char_literal313_tree, root_0);
                    }
                    dbg.location(535,14);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4032);
                    unaryExpression314=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression314.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:536:9: '!' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(536,12);
                    char_literal315=(Token)match(input,142,FOLLOW_142_in_unaryExpressionNotPlusMinus4042); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal315_tree = (Object)adaptor.create(char_literal315);
                    root_0 = (Object)adaptor.becomeRoot(char_literal315_tree, root_0);
                    }
                    dbg.location(536,14);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4045);
                    unaryExpression316=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression316.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:537:9: castExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(537,9);
                    pushFollow(FOLLOW_castExpression_in_unaryExpressionNotPlusMinus4055);
                    castExpression317=castExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpression317.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:538:9: primary ( selector )* '++'
                    {
                    dbg.location(538,9);
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus4065);
                    primary318=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary.add(primary318.getTree());
                    dbg.location(538,17);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:538:17: ( selector )*
                    try { dbg.enterSubRule(96);

                    loop96:
                    do {
                        int alt96=2;
                        try { dbg.enterDecision(96);

                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==81||LA96_0==92) ) {
                            alt96=1;
                        }


                        } finally {dbg.exitDecision(96);}

                        switch (alt96) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: selector
                    	    {
                    	    dbg.location(538,17);
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus4067);
                    	    selector319=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_selector.add(selector319.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(96);}

                    dbg.location(538,27);
                    string_literal320=(Token)match(input,139,FOLLOW_139_in_unaryExpressionNotPlusMinus4070); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_139.add(string_literal320);



                    // AST REWRITE
                    // elements: selector, primary
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 538:33: -> ^( RIGHT_INC primary ( selector )* )
                    {
                        dbg.location(538,35);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:538:35: ^( RIGHT_INC primary ( selector )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(538,37);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RIGHT_INC, "RIGHT_INC"), root_1);

                        dbg.location(538,47);
                        adaptor.addChild(root_1, stream_primary.nextTree());
                        dbg.location(538,55);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:538:55: ( selector )*
                        while ( stream_selector.hasNext() ) {
                            dbg.location(538,55);
                            adaptor.addChild(root_1, stream_selector.nextTree());

                        }
                        stream_selector.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:539:4: primary ( selector )* '--'
                    {
                    dbg.location(539,4);
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus4086);
                    primary321=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary.add(primary321.getTree());
                    dbg.location(539,12);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:539:12: ( selector )*
                    try { dbg.enterSubRule(97);

                    loop97:
                    do {
                        int alt97=2;
                        try { dbg.enterDecision(97);

                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==81||LA97_0==92) ) {
                            alt97=1;
                        }


                        } finally {dbg.exitDecision(97);}

                        switch (alt97) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: selector
                    	    {
                    	    dbg.location(539,12);
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus4088);
                    	    selector322=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_selector.add(selector322.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(97);}

                    dbg.location(539,22);
                    string_literal323=(Token)match(input,140,FOLLOW_140_in_unaryExpressionNotPlusMinus4091); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_140.add(string_literal323);



                    // AST REWRITE
                    // elements: primary, selector
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 539:28: -> ^( RIGHT_DEC primary ( selector )* )
                    {
                        dbg.location(539,30);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:539:30: ^( RIGHT_DEC primary ( selector )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(539,32);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RIGHT_DEC, "RIGHT_DEC"), root_1);

                        dbg.location(539,42);
                        adaptor.addChild(root_1, stream_primary.nextTree());
                        dbg.location(539,50);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:539:50: ( selector )*
                        while ( stream_selector.hasNext() ) {
                            dbg.location(539,50);
                            adaptor.addChild(root_1, stream_selector.nextTree());

                        }
                        stream_selector.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:540:6: primary ( selector )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(540,6);
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus4109);
                    primary324=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary324.getTree());
                    dbg.location(540,14);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:540:14: ( selector )*
                    try { dbg.enterSubRule(98);

                    loop98:
                    do {
                        int alt98=2;
                        try { dbg.enterDecision(98);

                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==81||LA98_0==92) ) {
                            alt98=1;
                        }


                        } finally {dbg.exitDecision(98);}

                        switch (alt98) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: selector
                    	    {
                    	    dbg.location(540,14);
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus4111);
                    	    selector325=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector325.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop98;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(98);}


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, unaryExpressionNotPlusMinus_StartIndex); }
        }
        dbg.location(541, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unaryExpressionNotPlusMinus");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"

    public static class castExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "castExpression"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:543:1: castExpression : ( '(' primitiveType ')' unaryExpression | '(' ( type | expression ) ')' unaryExpressionNotPlusMinus );
    public final JavaParser.castExpression_return castExpression() throws RecognitionException {
        JavaParser.castExpression_return retval = new JavaParser.castExpression_return();
        retval.start = input.LT(1);
        int castExpression_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal326=null;
        Token char_literal328=null;
        Token char_literal330=null;
        Token char_literal333=null;
        JavaParser.primitiveType_return primitiveType327 = null;

        JavaParser.unaryExpression_return unaryExpression329 = null;

        JavaParser.type_return type331 = null;

        JavaParser.expression_return expression332 = null;

        JavaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus334 = null;


        Object char_literal326_tree=null;
        Object char_literal328_tree=null;
        Object char_literal330_tree=null;
        Object char_literal333_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "castExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(543, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:544:5: ( '(' primitiveType ')' unaryExpression | '(' ( type | expression ) ')' unaryExpressionNotPlusMinus )
            int alt101=2;
            try { dbg.enterDecision(101);

            int LA101_0 = input.LA(1);

            if ( (LA101_0==78) ) {
                int LA101_1 = input.LA(2);

                if ( (synpred166_Java()) ) {
                    alt101=1;
                }
                else if ( (true) ) {
                    alt101=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(101);}

            switch (alt101) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:544:8: '(' primitiveType ')' unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(544,11);
                    char_literal326=(Token)match(input,78,FOLLOW_78_in_castExpression4131); if (state.failed) return retval;
                    dbg.location(544,13);
                    pushFollow(FOLLOW_primitiveType_in_castExpression4134);
                    primitiveType327=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType327.getTree());
                    dbg.location(544,30);
                    char_literal328=(Token)match(input,79,FOLLOW_79_in_castExpression4136); if (state.failed) return retval;
                    dbg.location(544,32);
                    pushFollow(FOLLOW_unaryExpression_in_castExpression4139);
                    unaryExpression329=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression329.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:545:8: '(' ( type | expression ) ')' unaryExpressionNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(545,8);
                    char_literal330=(Token)match(input,78,FOLLOW_78_in_castExpression4148); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal330_tree = (Object)adaptor.create(char_literal330);
                    adaptor.addChild(root_0, char_literal330_tree);
                    }
                    dbg.location(545,12);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:545:12: ( type | expression )
                    int alt100=2;
                    try { dbg.enterSubRule(100);
                    try { dbg.enterDecision(100);

                    switch ( input.LA(1) ) {
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                        {
                        int LA100_1 = input.LA(2);

                        if ( (LA100_1==79||LA100_1==91) ) {
                            alt100=1;
                        }
                        else if ( (LA100_1==81||LA100_1==92) ) {
                            alt100=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 100, 1, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                        }
                        break;
                    case Identifier:
                        {
                        int LA100_2 = input.LA(2);

                        if ( (synpred167_Java()) ) {
                            alt100=1;
                        }
                        else if ( (true) ) {
                            alt100=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 100, 2, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                        }
                        break;
                    case FloatingPointLiteral:
                    case CharacterLiteral:
                    case StringLiteral:
                    case HexLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case 78:
                    case 80:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 134:
                    case 135:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case 144:
                        {
                        alt100=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(100);}

                    switch (alt100) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:545:13: type
                            {
                            dbg.location(545,13);
                            pushFollow(FOLLOW_type_in_castExpression4151);
                            type331=type();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, type331.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:545:20: expression
                            {
                            dbg.location(545,20);
                            pushFollow(FOLLOW_expression_in_castExpression4155);
                            expression332=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression332.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(100);}

                    dbg.location(545,32);
                    char_literal333=(Token)match(input,79,FOLLOW_79_in_castExpression4158); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal333_tree = (Object)adaptor.create(char_literal333);
                    adaptor.addChild(root_0, char_literal333_tree);
                    }
                    dbg.location(545,36);
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_castExpression4160);
                    unaryExpressionNotPlusMinus334=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus334.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, castExpression_StartIndex); }
        }
        dbg.location(546, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "castExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "castExpression"

    public static class primary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:548:1: primary : ( parExpression | 'this' ( '.' Identifier )* ( identifierSuffix )? | 'super' superSuffix | literal | 'new' creator | 'System.out.' ( 'println' | 'print' ) arguments -> ^( PRINT arguments ) | Identifier ( '.' Identifier )* ( identifierSuffix )? | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' );
    public final JavaParser.primary_return primary() throws RecognitionException {
        JavaParser.primary_return retval = new JavaParser.primary_return();
        retval.start = input.LT(1);
        int primary_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal336=null;
        Token char_literal337=null;
        Token Identifier338=null;
        Token string_literal340=null;
        Token string_literal343=null;
        Token string_literal345=null;
        Token string_literal346=null;
        Token string_literal347=null;
        Token Identifier349=null;
        Token char_literal350=null;
        Token Identifier351=null;
        Token char_literal354=null;
        Token char_literal355=null;
        Token char_literal356=null;
        Token string_literal357=null;
        Token string_literal358=null;
        Token char_literal359=null;
        Token string_literal360=null;
        JavaParser.parExpression_return parExpression335 = null;

        JavaParser.identifierSuffix_return identifierSuffix339 = null;

        JavaParser.superSuffix_return superSuffix341 = null;

        JavaParser.literal_return literal342 = null;

        JavaParser.creator_return creator344 = null;

        JavaParser.arguments_return arguments348 = null;

        JavaParser.identifierSuffix_return identifierSuffix352 = null;

        JavaParser.primitiveType_return primitiveType353 = null;


        Object string_literal336_tree=null;
        Object char_literal337_tree=null;
        Object Identifier338_tree=null;
        Object string_literal340_tree=null;
        Object string_literal343_tree=null;
        Object string_literal345_tree=null;
        Object string_literal346_tree=null;
        Object string_literal347_tree=null;
        Object Identifier349_tree=null;
        Object char_literal350_tree=null;
        Object Identifier351_tree=null;
        Object char_literal354_tree=null;
        Object char_literal355_tree=null;
        Object char_literal356_tree=null;
        Object string_literal357_tree=null;
        Object string_literal358_tree=null;
        Object char_literal359_tree=null;
        Object string_literal360_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try { dbg.enterRule(getGrammarFileName(), "primary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(548, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:549:5: ( parExpression | 'this' ( '.' Identifier )* ( identifierSuffix )? | 'super' superSuffix | literal | 'new' creator | 'System.out.' ( 'println' | 'print' ) arguments -> ^( PRINT arguments ) | Identifier ( '.' Identifier )* ( identifierSuffix )? | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' )
            int alt108=9;
            try { dbg.enterDecision(108);

            switch ( input.LA(1) ) {
            case 78:
                {
                alt108=1;
                }
                break;
            case 103:
                {
                alt108=2;
                }
                break;
            case 102:
                {
                alt108=3;
                }
                break;
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case 104:
            case 105:
            case 106:
                {
                alt108=4;
                }
                break;
            case 143:
                {
                alt108=5;
                }
                break;
            case 144:
                {
                alt108=6;
                }
                break;
            case Identifier:
                {
                alt108=7;
                }
                break;
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                {
                alt108=8;
                }
                break;
            case 80:
                {
                alt108=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(108);}

            switch (alt108) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:549:9: parExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(549,9);
                    pushFollow(FOLLOW_parExpression_in_primary4179);
                    parExpression335=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression335.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:550:9: 'this' ( '.' Identifier )* ( identifierSuffix )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(550,9);
                    string_literal336=(Token)match(input,103,FOLLOW_103_in_primary4189); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal336_tree = (Object)adaptor.create(string_literal336);
                    adaptor.addChild(root_0, string_literal336_tree);
                    }
                    dbg.location(550,16);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:550:16: ( '.' Identifier )*
                    try { dbg.enterSubRule(102);

                    loop102:
                    do {
                        int alt102=2;
                        try { dbg.enterDecision(102);

                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==92) ) {
                            int LA102_2 = input.LA(2);

                            if ( (LA102_2==Identifier) ) {
                                int LA102_3 = input.LA(3);

                                if ( (synpred169_Java()) ) {
                                    alt102=1;
                                }


                            }


                        }


                        } finally {dbg.exitDecision(102);}

                        switch (alt102) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:550:17: '.' Identifier
                    	    {
                    	    dbg.location(550,17);
                    	    char_literal337=(Token)match(input,92,FOLLOW_92_in_primary4192); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal337_tree = (Object)adaptor.create(char_literal337);
                    	    adaptor.addChild(root_0, char_literal337_tree);
                    	    }
                    	    dbg.location(550,21);
                    	    Identifier338=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary4194); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Identifier338_tree = (Object)adaptor.create(Identifier338);
                    	    adaptor.addChild(root_0, Identifier338_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(102);}

                    dbg.location(550,34);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:550:34: ( identifierSuffix )?
                    int alt103=2;
                    try { dbg.enterSubRule(103);
                    try { dbg.enterDecision(103);

                    try {
                        isCyclicDecision = true;
                        alt103 = dfa103.predict(input);
                    }
                    catch (NoViableAltException nvae) {
                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(103);}

                    switch (alt103) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: identifierSuffix
                            {
                            dbg.location(550,34);
                            pushFollow(FOLLOW_identifierSuffix_in_primary4198);
                            identifierSuffix339=identifierSuffix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierSuffix339.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(103);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:551:9: 'super' superSuffix
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(551,9);
                    string_literal340=(Token)match(input,102,FOLLOW_102_in_primary4209); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal340_tree = (Object)adaptor.create(string_literal340);
                    adaptor.addChild(root_0, string_literal340_tree);
                    }
                    dbg.location(551,17);
                    pushFollow(FOLLOW_superSuffix_in_primary4211);
                    superSuffix341=superSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superSuffix341.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:552:9: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(552,9);
                    pushFollow(FOLLOW_literal_in_primary4221);
                    literal342=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal342.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:553:9: 'new' creator
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(553,9);
                    string_literal343=(Token)match(input,143,FOLLOW_143_in_primary4231); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal343_tree = (Object)adaptor.create(string_literal343);
                    adaptor.addChild(root_0, string_literal343_tree);
                    }
                    dbg.location(553,15);
                    pushFollow(FOLLOW_creator_in_primary4233);
                    creator344=creator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, creator344.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:554:7: 'System.out.' ( 'println' | 'print' ) arguments
                    {
                    dbg.location(554,7);
                    string_literal345=(Token)match(input,144,FOLLOW_144_in_primary4241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_144.add(string_literal345);

                    dbg.location(554,21);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:554:21: ( 'println' | 'print' )
                    int alt104=2;
                    try { dbg.enterSubRule(104);
                    try { dbg.enterDecision(104);

                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==145) ) {
                        alt104=1;
                    }
                    else if ( (LA104_0==146) ) {
                        alt104=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 104, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(104);}

                    switch (alt104) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:554:22: 'println'
                            {
                            dbg.location(554,22);
                            string_literal346=(Token)match(input,145,FOLLOW_145_in_primary4244); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_145.add(string_literal346);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:554:32: 'print'
                            {
                            dbg.location(554,32);
                            string_literal347=(Token)match(input,146,FOLLOW_146_in_primary4246); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_146.add(string_literal347);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(104);}

                    dbg.location(554,41);
                    pushFollow(FOLLOW_arguments_in_primary4249);
                    arguments348=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arguments.add(arguments348.getTree());


                    // AST REWRITE
                    // elements: arguments
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 554:51: -> ^( PRINT arguments )
                    {
                        dbg.location(554,53);
                        // /Users/zhengzhedong/Desktop/minijava3/Java.g:554:53: ^( PRINT arguments )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(554,55);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRINT, "PRINT"), root_1);

                        dbg.location(554,61);
                        adaptor.addChild(root_1, stream_arguments.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:555:9: Identifier ( '.' Identifier )* ( identifierSuffix )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(555,9);
                    Identifier349=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary4266); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier349_tree = (Object)adaptor.create(Identifier349);
                    adaptor.addChild(root_0, Identifier349_tree);
                    }
                    dbg.location(555,20);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:555:20: ( '.' Identifier )*
                    try { dbg.enterSubRule(105);

                    loop105:
                    do {
                        int alt105=2;
                        try { dbg.enterDecision(105);

                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==92) ) {
                            int LA105_2 = input.LA(2);

                            if ( (LA105_2==Identifier) ) {
                                int LA105_3 = input.LA(3);

                                if ( (synpred177_Java()) ) {
                                    alt105=1;
                                }


                            }


                        }


                        } finally {dbg.exitDecision(105);}

                        switch (alt105) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:555:21: '.' Identifier
                    	    {
                    	    dbg.location(555,21);
                    	    char_literal350=(Token)match(input,92,FOLLOW_92_in_primary4269); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal350_tree = (Object)adaptor.create(char_literal350);
                    	    adaptor.addChild(root_0, char_literal350_tree);
                    	    }
                    	    dbg.location(555,25);
                    	    Identifier351=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary4271); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Identifier351_tree = (Object)adaptor.create(Identifier351);
                    	    adaptor.addChild(root_0, Identifier351_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(105);}

                    dbg.location(555,38);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:555:38: ( identifierSuffix )?
                    int alt106=2;
                    try { dbg.enterSubRule(106);
                    try { dbg.enterDecision(106);

                    try {
                        isCyclicDecision = true;
                        alt106 = dfa106.predict(input);
                    }
                    catch (NoViableAltException nvae) {
                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(106);}

                    switch (alt106) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: identifierSuffix
                            {
                            dbg.location(555,38);
                            pushFollow(FOLLOW_identifierSuffix_in_primary4275);
                            identifierSuffix352=identifierSuffix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierSuffix352.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(106);}


                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:556:9: primitiveType ( '[' ']' )* '.' 'class'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(556,9);
                    pushFollow(FOLLOW_primitiveType_in_primary4287);
                    primitiveType353=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType353.getTree());
                    dbg.location(556,23);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:556:23: ( '[' ']' )*
                    try { dbg.enterSubRule(107);

                    loop107:
                    do {
                        int alt107=2;
                        try { dbg.enterDecision(107);

                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==81) ) {
                            alt107=1;
                        }


                        } finally {dbg.exitDecision(107);}

                        switch (alt107) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:556:24: '[' ']'
                    	    {
                    	    dbg.location(556,24);
                    	    char_literal354=(Token)match(input,81,FOLLOW_81_in_primary4290); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal354_tree = (Object)adaptor.create(char_literal354);
                    	    adaptor.addChild(root_0, char_literal354_tree);
                    	    }
                    	    dbg.location(556,28);
                    	    char_literal355=(Token)match(input,82,FOLLOW_82_in_primary4292); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal355_tree = (Object)adaptor.create(char_literal355);
                    	    adaptor.addChild(root_0, char_literal355_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop107;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(107);}

                    dbg.location(556,34);
                    char_literal356=(Token)match(input,92,FOLLOW_92_in_primary4296); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal356_tree = (Object)adaptor.create(char_literal356);
                    adaptor.addChild(root_0, char_literal356_tree);
                    }
                    dbg.location(556,38);
                    string_literal357=(Token)match(input,69,FOLLOW_69_in_primary4298); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal357_tree = (Object)adaptor.create(string_literal357);
                    adaptor.addChild(root_0, string_literal357_tree);
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:557:9: 'void' '.' 'class'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(557,9);
                    string_literal358=(Token)match(input,80,FOLLOW_80_in_primary4308); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal358_tree = (Object)adaptor.create(string_literal358);
                    adaptor.addChild(root_0, string_literal358_tree);
                    }
                    dbg.location(557,16);
                    char_literal359=(Token)match(input,92,FOLLOW_92_in_primary4310); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal359_tree = (Object)adaptor.create(char_literal359);
                    adaptor.addChild(root_0, char_literal359_tree);
                    }
                    dbg.location(557,20);
                    string_literal360=(Token)match(input,69,FOLLOW_69_in_primary4312); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal360_tree = (Object)adaptor.create(string_literal360);
                    adaptor.addChild(root_0, string_literal360_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, primary_StartIndex); }
        }
        dbg.location(558, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primary");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "primary"

    public static class identifierSuffix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifierSuffix"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:560:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' innerCreator );
    public final JavaParser.identifierSuffix_return identifierSuffix() throws RecognitionException {
        JavaParser.identifierSuffix_return retval = new JavaParser.identifierSuffix_return();
        retval.start = input.LT(1);
        int identifierSuffix_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal361=null;
        Token char_literal362=null;
        Token char_literal363=null;
        Token string_literal364=null;
        Token char_literal365=null;
        Token char_literal367=null;
        Token char_literal369=null;
        Token string_literal370=null;
        Token char_literal371=null;
        Token char_literal373=null;
        Token string_literal374=null;
        Token char_literal375=null;
        Token string_literal376=null;
        Token char_literal378=null;
        Token string_literal379=null;
        JavaParser.expression_return expression366 = null;

        JavaParser.arguments_return arguments368 = null;

        JavaParser.explicitGenericInvocation_return explicitGenericInvocation372 = null;

        JavaParser.arguments_return arguments377 = null;

        JavaParser.innerCreator_return innerCreator380 = null;


        Object char_literal361_tree=null;
        Object char_literal362_tree=null;
        Object char_literal363_tree=null;
        Object string_literal364_tree=null;
        Object char_literal365_tree=null;
        Object char_literal367_tree=null;
        Object char_literal369_tree=null;
        Object string_literal370_tree=null;
        Object char_literal371_tree=null;
        Object char_literal373_tree=null;
        Object string_literal374_tree=null;
        Object char_literal375_tree=null;
        Object string_literal376_tree=null;
        Object char_literal378_tree=null;
        Object string_literal379_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "identifierSuffix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(560, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:561:5: ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' innerCreator )
            int alt111=8;
            try { dbg.enterDecision(111);

            try {
                isCyclicDecision = true;
                alt111 = dfa111.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(111);}

            switch (alt111) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:561:9: ( '[' ']' )+ '.' 'class'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(561,9);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:561:9: ( '[' ']' )+
                    int cnt109=0;
                    try { dbg.enterSubRule(109);

                    loop109:
                    do {
                        int alt109=2;
                        try { dbg.enterDecision(109);

                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==81) ) {
                            alt109=1;
                        }


                        } finally {dbg.exitDecision(109);}

                        switch (alt109) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:561:10: '[' ']'
                    	    {
                    	    dbg.location(561,10);
                    	    char_literal361=(Token)match(input,81,FOLLOW_81_in_identifierSuffix4332); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal361_tree = (Object)adaptor.create(char_literal361);
                    	    adaptor.addChild(root_0, char_literal361_tree);
                    	    }
                    	    dbg.location(561,14);
                    	    char_literal362=(Token)match(input,82,FOLLOW_82_in_identifierSuffix4334); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal362_tree = (Object)adaptor.create(char_literal362);
                    	    adaptor.addChild(root_0, char_literal362_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt109 >= 1 ) break loop109;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(109, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt109++;
                    } while (true);
                    } finally {dbg.exitSubRule(109);}

                    dbg.location(561,20);
                    char_literal363=(Token)match(input,92,FOLLOW_92_in_identifierSuffix4338); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal363_tree = (Object)adaptor.create(char_literal363);
                    adaptor.addChild(root_0, char_literal363_tree);
                    }
                    dbg.location(561,24);
                    string_literal364=(Token)match(input,69,FOLLOW_69_in_identifierSuffix4340); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal364_tree = (Object)adaptor.create(string_literal364);
                    adaptor.addChild(root_0, string_literal364_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:562:9: ( '[' expression ']' )+
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(562,9);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:562:9: ( '[' expression ']' )+
                    int cnt110=0;
                    try { dbg.enterSubRule(110);

                    loop110:
                    do {
                        int alt110=2;
                        try { dbg.enterDecision(110);

                        try {
                            isCyclicDecision = true;
                            alt110 = dfa110.predict(input);
                        }
                        catch (NoViableAltException nvae) {
                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                        } finally {dbg.exitDecision(110);}

                        switch (alt110) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:562:10: '[' expression ']'
                    	    {
                    	    dbg.location(562,10);
                    	    char_literal365=(Token)match(input,81,FOLLOW_81_in_identifierSuffix4351); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal365_tree = (Object)adaptor.create(char_literal365);
                    	    adaptor.addChild(root_0, char_literal365_tree);
                    	    }
                    	    dbg.location(562,14);
                    	    pushFollow(FOLLOW_expression_in_identifierSuffix4353);
                    	    expression366=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression366.getTree());
                    	    dbg.location(562,25);
                    	    char_literal367=(Token)match(input,82,FOLLOW_82_in_identifierSuffix4355); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal367_tree = (Object)adaptor.create(char_literal367);
                    	    adaptor.addChild(root_0, char_literal367_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt110 >= 1 ) break loop110;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(110, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt110++;
                    } while (true);
                    } finally {dbg.exitSubRule(110);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:563:9: arguments
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(563,9);
                    pushFollow(FOLLOW_arguments_in_identifierSuffix4368);
                    arguments368=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments368.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:564:9: '.' 'class'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(564,9);
                    char_literal369=(Token)match(input,92,FOLLOW_92_in_identifierSuffix4378); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal369_tree = (Object)adaptor.create(char_literal369);
                    adaptor.addChild(root_0, char_literal369_tree);
                    }
                    dbg.location(564,13);
                    string_literal370=(Token)match(input,69,FOLLOW_69_in_identifierSuffix4380); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal370_tree = (Object)adaptor.create(string_literal370);
                    adaptor.addChild(root_0, string_literal370_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:565:9: '.' explicitGenericInvocation
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(565,9);
                    char_literal371=(Token)match(input,92,FOLLOW_92_in_identifierSuffix4390); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal371_tree = (Object)adaptor.create(char_literal371);
                    adaptor.addChild(root_0, char_literal371_tree);
                    }
                    dbg.location(565,13);
                    pushFollow(FOLLOW_explicitGenericInvocation_in_identifierSuffix4392);
                    explicitGenericInvocation372=explicitGenericInvocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitGenericInvocation372.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:566:9: '.' 'this'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(566,9);
                    char_literal373=(Token)match(input,92,FOLLOW_92_in_identifierSuffix4402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal373_tree = (Object)adaptor.create(char_literal373);
                    adaptor.addChild(root_0, char_literal373_tree);
                    }
                    dbg.location(566,13);
                    string_literal374=(Token)match(input,103,FOLLOW_103_in_identifierSuffix4404); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal374_tree = (Object)adaptor.create(string_literal374);
                    adaptor.addChild(root_0, string_literal374_tree);
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:567:9: '.' 'super' arguments
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(567,9);
                    char_literal375=(Token)match(input,92,FOLLOW_92_in_identifierSuffix4414); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal375_tree = (Object)adaptor.create(char_literal375);
                    adaptor.addChild(root_0, char_literal375_tree);
                    }
                    dbg.location(567,13);
                    string_literal376=(Token)match(input,102,FOLLOW_102_in_identifierSuffix4416); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal376_tree = (Object)adaptor.create(string_literal376);
                    adaptor.addChild(root_0, string_literal376_tree);
                    }
                    dbg.location(567,21);
                    pushFollow(FOLLOW_arguments_in_identifierSuffix4418);
                    arguments377=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments377.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:568:9: '.' 'new' innerCreator
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(568,9);
                    char_literal378=(Token)match(input,92,FOLLOW_92_in_identifierSuffix4428); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal378_tree = (Object)adaptor.create(char_literal378);
                    adaptor.addChild(root_0, char_literal378_tree);
                    }
                    dbg.location(568,13);
                    string_literal379=(Token)match(input,143,FOLLOW_143_in_identifierSuffix4430); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal379_tree = (Object)adaptor.create(string_literal379);
                    adaptor.addChild(root_0, string_literal379_tree);
                    }
                    dbg.location(568,19);
                    pushFollow(FOLLOW_innerCreator_in_identifierSuffix4432);
                    innerCreator380=innerCreator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, innerCreator380.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 96, identifierSuffix_StartIndex); }
        }
        dbg.location(569, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "identifierSuffix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "identifierSuffix"

    public static class creator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "creator"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:571:1: creator : ( nonWildcardTypeArguments createdName classCreatorRest | createdName ( arrayCreatorRest | classCreatorRest ) );
    public final JavaParser.creator_return creator() throws RecognitionException {
        JavaParser.creator_return retval = new JavaParser.creator_return();
        retval.start = input.LT(1);
        int creator_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.nonWildcardTypeArguments_return nonWildcardTypeArguments381 = null;

        JavaParser.createdName_return createdName382 = null;

        JavaParser.classCreatorRest_return classCreatorRest383 = null;

        JavaParser.createdName_return createdName384 = null;

        JavaParser.arrayCreatorRest_return arrayCreatorRest385 = null;

        JavaParser.classCreatorRest_return classCreatorRest386 = null;



        try { dbg.enterRule(getGrammarFileName(), "creator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(571, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:572:5: ( nonWildcardTypeArguments createdName classCreatorRest | createdName ( arrayCreatorRest | classCreatorRest ) )
            int alt113=2;
            try { dbg.enterDecision(113);

            int LA113_0 = input.LA(1);

            if ( (LA113_0==72) ) {
                alt113=1;
            }
            else if ( (LA113_0==Identifier||(LA113_0>=93 && LA113_0<=100)) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(113);}

            switch (alt113) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:572:9: nonWildcardTypeArguments createdName classCreatorRest
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(572,9);
                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_creator4451);
                    nonWildcardTypeArguments381=nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments381.getTree());
                    dbg.location(572,34);
                    pushFollow(FOLLOW_createdName_in_creator4453);
                    createdName382=createdName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, createdName382.getTree());
                    dbg.location(572,46);
                    pushFollow(FOLLOW_classCreatorRest_in_creator4455);
                    classCreatorRest383=classCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest383.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:573:9: createdName ( arrayCreatorRest | classCreatorRest )
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(573,9);
                    pushFollow(FOLLOW_createdName_in_creator4465);
                    createdName384=createdName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, createdName384.getTree());
                    dbg.location(573,21);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:573:21: ( arrayCreatorRest | classCreatorRest )
                    int alt112=2;
                    try { dbg.enterSubRule(112);
                    try { dbg.enterDecision(112);

                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==81) ) {
                        alt112=1;
                    }
                    else if ( (LA112_0==78) ) {
                        alt112=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(112);}

                    switch (alt112) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:573:22: arrayCreatorRest
                            {
                            dbg.location(573,22);
                            pushFollow(FOLLOW_arrayCreatorRest_in_creator4468);
                            arrayCreatorRest385=arrayCreatorRest();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayCreatorRest385.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:573:41: classCreatorRest
                            {
                            dbg.location(573,41);
                            pushFollow(FOLLOW_classCreatorRest_in_creator4472);
                            classCreatorRest386=classCreatorRest();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest386.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(112);}


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, creator_StartIndex); }
        }
        dbg.location(574, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "creator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "creator"

    public static class createdName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "createdName"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:576:1: createdName : ( classOrInterfaceType | primitiveType );
    public final JavaParser.createdName_return createdName() throws RecognitionException {
        JavaParser.createdName_return retval = new JavaParser.createdName_return();
        retval.start = input.LT(1);
        int createdName_StartIndex = input.index();
        Object root_0 = null;

        JavaParser.classOrInterfaceType_return classOrInterfaceType387 = null;

        JavaParser.primitiveType_return primitiveType388 = null;



        try { dbg.enterRule(getGrammarFileName(), "createdName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(576, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:577:5: ( classOrInterfaceType | primitiveType )
            int alt114=2;
            try { dbg.enterDecision(114);

            int LA114_0 = input.LA(1);

            if ( (LA114_0==Identifier) ) {
                alt114=1;
            }
            else if ( ((LA114_0>=93 && LA114_0<=100)) ) {
                alt114=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(114);}

            switch (alt114) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:577:9: classOrInterfaceType
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(577,9);
                    pushFollow(FOLLOW_classOrInterfaceType_in_createdName4492);
                    classOrInterfaceType387=classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceType387.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:578:9: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(578,9);
                    pushFollow(FOLLOW_primitiveType_in_createdName4502);
                    primitiveType388=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType388.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 98, createdName_StartIndex); }
        }
        dbg.location(579, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "createdName");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "createdName"

    public static class innerCreator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "innerCreator"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:581:1: innerCreator : ( nonWildcardTypeArguments )? Identifier classCreatorRest ;
    public final JavaParser.innerCreator_return innerCreator() throws RecognitionException {
        JavaParser.innerCreator_return retval = new JavaParser.innerCreator_return();
        retval.start = input.LT(1);
        int innerCreator_StartIndex = input.index();
        Object root_0 = null;

        Token Identifier390=null;
        JavaParser.nonWildcardTypeArguments_return nonWildcardTypeArguments389 = null;

        JavaParser.classCreatorRest_return classCreatorRest391 = null;


        Object Identifier390_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "innerCreator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(581, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:582:5: ( ( nonWildcardTypeArguments )? Identifier classCreatorRest )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:582:9: ( nonWildcardTypeArguments )? Identifier classCreatorRest
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(582,9);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:582:9: ( nonWildcardTypeArguments )?
            int alt115=2;
            try { dbg.enterSubRule(115);
            try { dbg.enterDecision(115);

            int LA115_0 = input.LA(1);

            if ( (LA115_0==72) ) {
                alt115=1;
            }
            } finally {dbg.exitDecision(115);}

            switch (alt115) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: nonWildcardTypeArguments
                    {
                    dbg.location(582,9);
                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_innerCreator4525);
                    nonWildcardTypeArguments389=nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments389.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(115);}

            dbg.location(582,35);
            Identifier390=(Token)match(input,Identifier,FOLLOW_Identifier_in_innerCreator4528); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier390_tree = (Object)adaptor.create(Identifier390);
            adaptor.addChild(root_0, Identifier390_tree);
            }
            dbg.location(582,46);
            pushFollow(FOLLOW_classCreatorRest_in_innerCreator4530);
            classCreatorRest391=classCreatorRest();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest391.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, innerCreator_StartIndex); }
        }
        dbg.location(583, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "innerCreator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "innerCreator"

    public static class arrayCreatorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayCreatorRest"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:585:1: arrayCreatorRest : '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* ) ;
    public final JavaParser.arrayCreatorRest_return arrayCreatorRest() throws RecognitionException {
        JavaParser.arrayCreatorRest_return retval = new JavaParser.arrayCreatorRest_return();
        retval.start = input.LT(1);
        int arrayCreatorRest_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal392=null;
        Token char_literal393=null;
        Token char_literal394=null;
        Token char_literal395=null;
        Token char_literal398=null;
        Token char_literal399=null;
        Token char_literal401=null;
        Token char_literal402=null;
        Token char_literal403=null;
        JavaParser.arrayInitializer_return arrayInitializer396 = null;

        JavaParser.expression_return expression397 = null;

        JavaParser.expression_return expression400 = null;


        Object char_literal392_tree=null;
        Object char_literal393_tree=null;
        Object char_literal394_tree=null;
        Object char_literal395_tree=null;
        Object char_literal398_tree=null;
        Object char_literal399_tree=null;
        Object char_literal401_tree=null;
        Object char_literal402_tree=null;
        Object char_literal403_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arrayCreatorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(585, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:586:5: ( '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* ) )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:586:9: '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(586,9);
            char_literal392=(Token)match(input,81,FOLLOW_81_in_arrayCreatorRest4549); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal392_tree = (Object)adaptor.create(char_literal392);
            adaptor.addChild(root_0, char_literal392_tree);
            }
            dbg.location(587,9);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:587:9: ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* )
            int alt119=2;
            try { dbg.enterSubRule(119);
            try { dbg.enterDecision(119);

            int LA119_0 = input.LA(1);

            if ( (LA119_0==82) ) {
                alt119=1;
            }
            else if ( ((LA119_0>=Identifier && LA119_0<=DecimalLiteral)||LA119_0==78||LA119_0==80||(LA119_0>=93 && LA119_0<=100)||(LA119_0>=102 && LA119_0<=106)||(LA119_0>=134 && LA119_0<=135)||(LA119_0>=139 && LA119_0<=144)) ) {
                alt119=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(119);}

            switch (alt119) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:587:13: ']' ( '[' ']' )* arrayInitializer
                    {
                    dbg.location(587,13);
                    char_literal393=(Token)match(input,82,FOLLOW_82_in_arrayCreatorRest4563); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal393_tree = (Object)adaptor.create(char_literal393);
                    adaptor.addChild(root_0, char_literal393_tree);
                    }
                    dbg.location(587,17);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:587:17: ( '[' ']' )*
                    try { dbg.enterSubRule(116);

                    loop116:
                    do {
                        int alt116=2;
                        try { dbg.enterDecision(116);

                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==81) ) {
                            alt116=1;
                        }


                        } finally {dbg.exitDecision(116);}

                        switch (alt116) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:587:18: '[' ']'
                    	    {
                    	    dbg.location(587,18);
                    	    char_literal394=(Token)match(input,81,FOLLOW_81_in_arrayCreatorRest4566); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal394_tree = (Object)adaptor.create(char_literal394);
                    	    adaptor.addChild(root_0, char_literal394_tree);
                    	    }
                    	    dbg.location(587,22);
                    	    char_literal395=(Token)match(input,82,FOLLOW_82_in_arrayCreatorRest4568); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal395_tree = (Object)adaptor.create(char_literal395);
                    	    adaptor.addChild(root_0, char_literal395_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(116);}

                    dbg.location(587,28);
                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest4572);
                    arrayInitializer396=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer396.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:588:13: expression ']' ( '[' expression ']' )* ( '[' ']' )*
                    {
                    dbg.location(588,13);
                    pushFollow(FOLLOW_expression_in_arrayCreatorRest4586);
                    expression397=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression397.getTree());
                    dbg.location(588,24);
                    char_literal398=(Token)match(input,82,FOLLOW_82_in_arrayCreatorRest4588); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal398_tree = (Object)adaptor.create(char_literal398);
                    adaptor.addChild(root_0, char_literal398_tree);
                    }
                    dbg.location(588,28);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:588:28: ( '[' expression ']' )*
                    try { dbg.enterSubRule(117);

                    loop117:
                    do {
                        int alt117=2;
                        try { dbg.enterDecision(117);

                        try {
                            isCyclicDecision = true;
                            alt117 = dfa117.predict(input);
                        }
                        catch (NoViableAltException nvae) {
                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                        } finally {dbg.exitDecision(117);}

                        switch (alt117) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:588:29: '[' expression ']'
                    	    {
                    	    dbg.location(588,29);
                    	    char_literal399=(Token)match(input,81,FOLLOW_81_in_arrayCreatorRest4591); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal399_tree = (Object)adaptor.create(char_literal399);
                    	    adaptor.addChild(root_0, char_literal399_tree);
                    	    }
                    	    dbg.location(588,33);
                    	    pushFollow(FOLLOW_expression_in_arrayCreatorRest4593);
                    	    expression400=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression400.getTree());
                    	    dbg.location(588,44);
                    	    char_literal401=(Token)match(input,82,FOLLOW_82_in_arrayCreatorRest4595); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal401_tree = (Object)adaptor.create(char_literal401);
                    	    adaptor.addChild(root_0, char_literal401_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(117);}

                    dbg.location(588,50);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:588:50: ( '[' ']' )*
                    try { dbg.enterSubRule(118);

                    loop118:
                    do {
                        int alt118=2;
                        try { dbg.enterDecision(118);

                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==81) ) {
                            int LA118_2 = input.LA(2);

                            if ( (LA118_2==82) ) {
                                alt118=1;
                            }


                        }


                        } finally {dbg.exitDecision(118);}

                        switch (alt118) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:588:51: '[' ']'
                    	    {
                    	    dbg.location(588,51);
                    	    char_literal402=(Token)match(input,81,FOLLOW_81_in_arrayCreatorRest4600); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal402_tree = (Object)adaptor.create(char_literal402);
                    	    adaptor.addChild(root_0, char_literal402_tree);
                    	    }
                    	    dbg.location(588,55);
                    	    char_literal403=(Token)match(input,82,FOLLOW_82_in_arrayCreatorRest4602); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal403_tree = (Object)adaptor.create(char_literal403);
                    	    adaptor.addChild(root_0, char_literal403_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(118);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(119);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 100, arrayCreatorRest_StartIndex); }
        }
        dbg.location(590, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arrayCreatorRest");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arrayCreatorRest"

    public static class classCreatorRest_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classCreatorRest"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:592:1: classCreatorRest : arguments ( '{' ( classBodyDeclaration )* '}' )? ;
    public final JavaParser.classCreatorRest_return classCreatorRest() throws RecognitionException {
        JavaParser.classCreatorRest_return retval = new JavaParser.classCreatorRest_return();
        retval.start = input.LT(1);
        int classCreatorRest_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal405=null;
        Token char_literal407=null;
        JavaParser.arguments_return arguments404 = null;

        JavaParser.classBodyDeclaration_return classBodyDeclaration406 = null;


        Object char_literal405_tree=null;
        Object char_literal407_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "classCreatorRest");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(592, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:593:5: ( arguments ( '{' ( classBodyDeclaration )* '}' )? )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:593:9: arguments ( '{' ( classBodyDeclaration )* '}' )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(593,9);
            pushFollow(FOLLOW_arguments_in_classCreatorRest4633);
            arguments404=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments404.getTree());
            dbg.location(593,19);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:593:19: ( '{' ( classBodyDeclaration )* '}' )?
            int alt121=2;
            try { dbg.enterSubRule(121);
            try { dbg.enterDecision(121);

            int LA121_0 = input.LA(1);

            if ( (LA121_0==70) ) {
                alt121=1;
            }
            } finally {dbg.exitDecision(121);}

            switch (alt121) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:593:20: '{' ( classBodyDeclaration )* '}'
                    {
                    dbg.location(593,20);
                    char_literal405=(Token)match(input,70,FOLLOW_70_in_classCreatorRest4636); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal405_tree = (Object)adaptor.create(char_literal405);
                    adaptor.addChild(root_0, char_literal405_tree);
                    }
                    dbg.location(593,23);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:593:23: ( classBodyDeclaration )*
                    try { dbg.enterSubRule(120);

                    loop120:
                    do {
                        int alt120=2;
                        try { dbg.enterDecision(120);

                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==Identifier||(LA120_0>=64 && LA120_0<=69)||LA120_0==72||LA120_0==77||LA120_0==80||(LA120_0>=85 && LA120_0<=90)||(LA120_0>=93 && LA120_0<=100)) ) {
                            alt120=1;
                        }


                        } finally {dbg.exitDecision(120);}

                        switch (alt120) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: classBodyDeclaration
                    	    {
                    	    dbg.location(593,23);
                    	    pushFollow(FOLLOW_classBodyDeclaration_in_classCreatorRest4637);
                    	    classBodyDeclaration406=classBodyDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBodyDeclaration406.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop120;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(120);}

                    dbg.location(593,44);
                    char_literal407=(Token)match(input,71,FOLLOW_71_in_classCreatorRest4639); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal407_tree = (Object)adaptor.create(char_literal407);
                    adaptor.addChild(root_0, char_literal407_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(121);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, classCreatorRest_StartIndex); }
        }
        dbg.location(594, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classCreatorRest");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "classCreatorRest"

    public static class explicitGenericInvocation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicitGenericInvocation"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:596:1: explicitGenericInvocation : nonWildcardTypeArguments Identifier arguments ;
    public final JavaParser.explicitGenericInvocation_return explicitGenericInvocation() throws RecognitionException {
        JavaParser.explicitGenericInvocation_return retval = new JavaParser.explicitGenericInvocation_return();
        retval.start = input.LT(1);
        int explicitGenericInvocation_StartIndex = input.index();
        Object root_0 = null;

        Token Identifier409=null;
        JavaParser.nonWildcardTypeArguments_return nonWildcardTypeArguments408 = null;

        JavaParser.arguments_return arguments410 = null;


        Object Identifier409_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "explicitGenericInvocation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(596, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:597:5: ( nonWildcardTypeArguments Identifier arguments )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:597:9: nonWildcardTypeArguments Identifier arguments
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(597,9);
            pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation4664);
            nonWildcardTypeArguments408=nonWildcardTypeArguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments408.getTree());
            dbg.location(597,34);
            Identifier409=(Token)match(input,Identifier,FOLLOW_Identifier_in_explicitGenericInvocation4666); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier409_tree = (Object)adaptor.create(Identifier409);
            adaptor.addChild(root_0, Identifier409_tree);
            }
            dbg.location(597,45);
            pushFollow(FOLLOW_arguments_in_explicitGenericInvocation4668);
            arguments410=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments410.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 102, explicitGenericInvocation_StartIndex); }
        }
        dbg.location(598, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "explicitGenericInvocation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "explicitGenericInvocation"

    public static class nonWildcardTypeArguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nonWildcardTypeArguments"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:600:1: nonWildcardTypeArguments : '<' typeList '>' ;
    public final JavaParser.nonWildcardTypeArguments_return nonWildcardTypeArguments() throws RecognitionException {
        JavaParser.nonWildcardTypeArguments_return retval = new JavaParser.nonWildcardTypeArguments_return();
        retval.start = input.LT(1);
        int nonWildcardTypeArguments_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal411=null;
        Token char_literal413=null;
        JavaParser.typeList_return typeList412 = null;


        Object char_literal411_tree=null;
        Object char_literal413_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nonWildcardTypeArguments");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(600, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:601:5: ( '<' typeList '>' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:601:9: '<' typeList '>'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(601,9);
            char_literal411=(Token)match(input,72,FOLLOW_72_in_nonWildcardTypeArguments4691); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal411_tree = (Object)adaptor.create(char_literal411);
            adaptor.addChild(root_0, char_literal411_tree);
            }
            dbg.location(601,13);
            pushFollow(FOLLOW_typeList_in_nonWildcardTypeArguments4693);
            typeList412=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList412.getTree());
            dbg.location(601,22);
            char_literal413=(Token)match(input,74,FOLLOW_74_in_nonWildcardTypeArguments4695); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal413_tree = (Object)adaptor.create(char_literal413);
            adaptor.addChild(root_0, char_literal413_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 103, nonWildcardTypeArguments_StartIndex); }
        }
        dbg.location(602, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nonWildcardTypeArguments");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nonWildcardTypeArguments"

    public static class selector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:604:1: selector : ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' innerCreator | '[' expression ']' );
    public final JavaParser.selector_return selector() throws RecognitionException {
        JavaParser.selector_return retval = new JavaParser.selector_return();
        retval.start = input.LT(1);
        int selector_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal414=null;
        Token Identifier415=null;
        Token char_literal417=null;
        Token string_literal418=null;
        Token char_literal419=null;
        Token string_literal420=null;
        Token char_literal422=null;
        Token string_literal423=null;
        Token char_literal425=null;
        Token char_literal427=null;
        JavaParser.arguments_return arguments416 = null;

        JavaParser.superSuffix_return superSuffix421 = null;

        JavaParser.innerCreator_return innerCreator424 = null;

        JavaParser.expression_return expression426 = null;


        Object char_literal414_tree=null;
        Object Identifier415_tree=null;
        Object char_literal417_tree=null;
        Object string_literal418_tree=null;
        Object char_literal419_tree=null;
        Object string_literal420_tree=null;
        Object char_literal422_tree=null;
        Object string_literal423_tree=null;
        Object char_literal425_tree=null;
        Object char_literal427_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "selector");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(604, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:605:5: ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' innerCreator | '[' expression ']' )
            int alt123=5;
            try { dbg.enterDecision(123);

            int LA123_0 = input.LA(1);

            if ( (LA123_0==92) ) {
                switch ( input.LA(2) ) {
                case Identifier:
                    {
                    alt123=1;
                    }
                    break;
                case 103:
                    {
                    alt123=2;
                    }
                    break;
                case 102:
                    {
                    alt123=3;
                    }
                    break;
                case 143:
                    {
                    alt123=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 123, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

            }
            else if ( (LA123_0==81) ) {
                alt123=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(123);}

            switch (alt123) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:605:9: '.' Identifier ( arguments )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(605,9);
                    char_literal414=(Token)match(input,92,FOLLOW_92_in_selector4718); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal414_tree = (Object)adaptor.create(char_literal414);
                    adaptor.addChild(root_0, char_literal414_tree);
                    }
                    dbg.location(605,13);
                    Identifier415=(Token)match(input,Identifier,FOLLOW_Identifier_in_selector4720); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier415_tree = (Object)adaptor.create(Identifier415);
                    adaptor.addChild(root_0, Identifier415_tree);
                    }
                    dbg.location(605,24);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:605:24: ( arguments )?
                    int alt122=2;
                    try { dbg.enterSubRule(122);
                    try { dbg.enterDecision(122);

                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==78) ) {
                        alt122=1;
                    }
                    } finally {dbg.exitDecision(122);}

                    switch (alt122) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: arguments
                            {
                            dbg.location(605,24);
                            pushFollow(FOLLOW_arguments_in_selector4722);
                            arguments416=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments416.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(122);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:606:9: '.' 'this'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(606,9);
                    char_literal417=(Token)match(input,92,FOLLOW_92_in_selector4733); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal417_tree = (Object)adaptor.create(char_literal417);
                    adaptor.addChild(root_0, char_literal417_tree);
                    }
                    dbg.location(606,13);
                    string_literal418=(Token)match(input,103,FOLLOW_103_in_selector4735); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal418_tree = (Object)adaptor.create(string_literal418);
                    adaptor.addChild(root_0, string_literal418_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:607:9: '.' 'super' superSuffix
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(607,9);
                    char_literal419=(Token)match(input,92,FOLLOW_92_in_selector4745); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal419_tree = (Object)adaptor.create(char_literal419);
                    adaptor.addChild(root_0, char_literal419_tree);
                    }
                    dbg.location(607,13);
                    string_literal420=(Token)match(input,102,FOLLOW_102_in_selector4747); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal420_tree = (Object)adaptor.create(string_literal420);
                    adaptor.addChild(root_0, string_literal420_tree);
                    }
                    dbg.location(607,21);
                    pushFollow(FOLLOW_superSuffix_in_selector4749);
                    superSuffix421=superSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superSuffix421.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:608:9: '.' 'new' innerCreator
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(608,9);
                    char_literal422=(Token)match(input,92,FOLLOW_92_in_selector4759); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal422_tree = (Object)adaptor.create(char_literal422);
                    adaptor.addChild(root_0, char_literal422_tree);
                    }
                    dbg.location(608,13);
                    string_literal423=(Token)match(input,143,FOLLOW_143_in_selector4761); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal423_tree = (Object)adaptor.create(string_literal423);
                    adaptor.addChild(root_0, string_literal423_tree);
                    }
                    dbg.location(608,19);
                    pushFollow(FOLLOW_innerCreator_in_selector4763);
                    innerCreator424=innerCreator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, innerCreator424.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:609:9: '[' expression ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(609,9);
                    char_literal425=(Token)match(input,81,FOLLOW_81_in_selector4773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal425_tree = (Object)adaptor.create(char_literal425);
                    adaptor.addChild(root_0, char_literal425_tree);
                    }
                    dbg.location(609,13);
                    pushFollow(FOLLOW_expression_in_selector4775);
                    expression426=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression426.getTree());
                    dbg.location(609,24);
                    char_literal427=(Token)match(input,82,FOLLOW_82_in_selector4777); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal427_tree = (Object)adaptor.create(char_literal427);
                    adaptor.addChild(root_0, char_literal427_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 104, selector_StartIndex); }
        }
        dbg.location(610, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "selector");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "selector"

    public static class superSuffix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "superSuffix"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:612:1: superSuffix : ( arguments | '.' Identifier ( arguments )? );
    public final JavaParser.superSuffix_return superSuffix() throws RecognitionException {
        JavaParser.superSuffix_return retval = new JavaParser.superSuffix_return();
        retval.start = input.LT(1);
        int superSuffix_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal429=null;
        Token Identifier430=null;
        JavaParser.arguments_return arguments428 = null;

        JavaParser.arguments_return arguments431 = null;


        Object char_literal429_tree=null;
        Object Identifier430_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "superSuffix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(612, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:613:5: ( arguments | '.' Identifier ( arguments )? )
            int alt125=2;
            try { dbg.enterDecision(125);

            int LA125_0 = input.LA(1);

            if ( (LA125_0==78) ) {
                alt125=1;
            }
            else if ( (LA125_0==92) ) {
                alt125=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(125);}

            switch (alt125) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:613:9: arguments
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(613,9);
                    pushFollow(FOLLOW_arguments_in_superSuffix4800);
                    arguments428=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments428.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:614:9: '.' Identifier ( arguments )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(614,9);
                    char_literal429=(Token)match(input,92,FOLLOW_92_in_superSuffix4810); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal429_tree = (Object)adaptor.create(char_literal429);
                    adaptor.addChild(root_0, char_literal429_tree);
                    }
                    dbg.location(614,13);
                    Identifier430=(Token)match(input,Identifier,FOLLOW_Identifier_in_superSuffix4812); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier430_tree = (Object)adaptor.create(Identifier430);
                    adaptor.addChild(root_0, Identifier430_tree);
                    }
                    dbg.location(614,24);
                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:614:24: ( arguments )?
                    int alt124=2;
                    try { dbg.enterSubRule(124);
                    try { dbg.enterDecision(124);

                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==78) ) {
                        alt124=1;
                    }
                    } finally {dbg.exitDecision(124);}

                    switch (alt124) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: arguments
                            {
                            dbg.location(614,24);
                            pushFollow(FOLLOW_arguments_in_superSuffix4814);
                            arguments431=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments431.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(124);}


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 105, superSuffix_StartIndex); }
        }
        dbg.location(615, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "superSuffix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "superSuffix"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // /Users/zhengzhedong/Desktop/minijava3/Java.g:617:1: arguments : '(' ( expressionList )? ')' ;
    public final JavaParser.arguments_return arguments() throws RecognitionException {
        JavaParser.arguments_return retval = new JavaParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal432=null;
        Token char_literal434=null;
        JavaParser.expressionList_return expressionList433 = null;


        Object char_literal432_tree=null;
        Object char_literal434_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arguments");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(617, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:618:5: ( '(' ( expressionList )? ')' )
            dbg.enterAlt(1);

            // /Users/zhengzhedong/Desktop/minijava3/Java.g:618:9: '(' ( expressionList )? ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(618,12);
            char_literal432=(Token)match(input,78,FOLLOW_78_in_arguments4834); if (state.failed) return retval;
            dbg.location(618,14);
            // /Users/zhengzhedong/Desktop/minijava3/Java.g:618:14: ( expressionList )?
            int alt126=2;
            try { dbg.enterSubRule(126);
            try { dbg.enterDecision(126);

            int LA126_0 = input.LA(1);

            if ( ((LA126_0>=Identifier && LA126_0<=DecimalLiteral)||LA126_0==78||LA126_0==80||(LA126_0>=93 && LA126_0<=100)||(LA126_0>=102 && LA126_0<=106)||(LA126_0>=134 && LA126_0<=135)||(LA126_0>=139 && LA126_0<=144)) ) {
                alt126=1;
            }
            } finally {dbg.exitDecision(126);}

            switch (alt126) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: expressionList
                    {
                    dbg.location(618,14);
                    pushFollow(FOLLOW_expressionList_in_arguments4837);
                    expressionList433=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList433.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(126);}

            dbg.location(618,33);
            char_literal434=(Token)match(input,79,FOLLOW_79_in_arguments4840); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 106, arguments_StartIndex); }
        }
        dbg.location(619, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arguments");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arguments"

    // $ANTLR start synpred1_Java
    public final void synpred1_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:53:8: ( classOrInterfaceDeclaration )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:53:8: classOrInterfaceDeclaration
        {
        dbg.location(53,8);
        pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred1_Java212);
        classOrInterfaceDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Java

    // $ANTLR start synpred2_Java
    public final void synpred2_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:53:37: ( mainclass )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:53:37: mainclass
        {
        dbg.location(53,37);
        pushFollow(FOLLOW_mainclass_in_synpred2_Java215);
        mainclass();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Java

    // $ANTLR start synpred4_Java
    public final void synpred4_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:57:4: ( classOrInterfaceDeclaration )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:57:4: classOrInterfaceDeclaration
        {
        dbg.location(57,4);
        pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred4_Java234);
        classOrInterfaceDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Java

    // $ANTLR start synpred25_Java
    public final void synpred25_Java_fragment() throws RecognitionException {   
        Token method_name=null;
        JavaParser.mtype_return mtypename = null;


        // /Users/zhengzhedong/Desktop/minijava3/Java.g:119:9: (mtypename= mtype method_name= Identifier '(' ( formalParameterDecls )? ')' methodBody )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:119:9: mtypename= mtype method_name= Identifier '(' ( formalParameterDecls )? ')' methodBody
        {
        dbg.location(119,19);
        pushFollow(FOLLOW_mtype_in_synpred25_Java733);
        mtypename=mtype();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(119,41);
        method_name=(Token)match(input,Identifier,FOLLOW_Identifier_in_synpred25_Java741); if (state.failed) return ;
        dbg.location(119,56);
        match(input,78,FOLLOW_78_in_synpred25_Java745); if (state.failed) return ;
        dbg.location(119,60);
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:119:60: ( formalParameterDecls )?
        int alt129=2;
        try { dbg.enterSubRule(129);
        try { dbg.enterDecision(129);

        int LA129_0 = input.LA(1);

        if ( (LA129_0==Identifier||LA129_0==85||(LA129_0>=93 && LA129_0<=100)) ) {
            alt129=1;
        }
        } finally {dbg.exitDecision(129);}

        switch (alt129) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: formalParameterDecls
                {
                dbg.location(119,60);
                pushFollow(FOLLOW_formalParameterDecls_in_synpred25_Java747);
                formalParameterDecls();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(129);}

        dbg.location(119,82);
        match(input,79,FOLLOW_79_in_synpred25_Java750); if (state.failed) return ;
        dbg.location(119,88);
        pushFollow(FOLLOW_methodBody_in_synpred25_Java754);
        methodBody();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_Java

    // $ANTLR start synpred73_Java
    public final void synpred73_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:270:13: ( explicitConstructorInvocation )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:270:13: explicitConstructorInvocation
        {
        dbg.location(270,13);
        pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred73_Java1883);
        explicitConstructorInvocation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_Java

    // $ANTLR start synpred77_Java
    public final void synpred77_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:274:9: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:274:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
        {
        dbg.location(274,9);
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:274:9: ( nonWildcardTypeArguments )?
        int alt135=2;
        try { dbg.enterSubRule(135);
        try { dbg.enterDecision(135);

        int LA135_0 = input.LA(1);

        if ( (LA135_0==72) ) {
            alt135=1;
        }
        } finally {dbg.exitDecision(135);}

        switch (alt135) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: nonWildcardTypeArguments
                {
                dbg.location(274,9);
                pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred77_Java1908);
                nonWildcardTypeArguments();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(135);}

        dbg.location(274,35);
        if ( (input.LA(1)>=102 && input.LA(1)<=103) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            dbg.recognitionException(mse);
            throw mse;
        }

        dbg.location(274,54);
        pushFollow(FOLLOW_arguments_in_synpred77_Java1919);
        arguments();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(274,64);
        match(input,77,FOLLOW_77_in_synpred77_Java1921); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_Java

    // $ANTLR start synpred94_Java
    public final void synpred94_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:331:9: ( localVariableDeclarationStatement )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:331:9: localVariableDeclarationStatement
        {
        dbg.location(331,9);
        pushFollow(FOLLOW_localVariableDeclarationStatement_in_synpred94_Java2311);
        localVariableDeclarationStatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_Java

    // $ANTLR start synpred98_Java
    public final void synpred98_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:351:54: ( 'else' else_statement )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:351:54: 'else' else_statement
        {
        dbg.location(351,54);
        match(input,109,FOLLOW_109_in_synpred98_Java2466); if (state.failed) return ;
        dbg.location(351,61);
        pushFollow(FOLLOW_else_statement_in_synpred98_Java2468);
        else_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred98_Java

    // $ANTLR start synpred109_Java
    public final void synpred109_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:373:7: ( switchLabel )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:373:7: switchLabel
        {
        dbg.location(373,7);
        pushFollow(FOLLOW_switchLabel_in_synpred109_Java2743);
        switchLabel();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred109_Java

    // $ANTLR start synpred113_Java
    public final void synpred113_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:383:9: ( enhancedForControl )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:383:9: enhancedForControl
        {
        dbg.location(383,9);
        pushFollow(FOLLOW_enhancedForControl_in_synpred113_Java2846);
        enhancedForControl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred113_Java

    // $ANTLR start synpred117_Java
    public final void synpred117_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:388:9: ( localVariableDeclaration )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:388:9: localVariableDeclaration
        {
        dbg.location(388,9);
        pushFollow(FOLLOW_localVariableDeclaration_in_synpred117_Java2908);
        localVariableDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred117_Java

    // $ANTLR start synpred119_Java
    public final void synpred119_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:419:9: ( conditionalExpression assignmentOperator expression )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:419:9: conditionalExpression assignmentOperator expression
        {
        dbg.location(419,9);
        pushFollow(FOLLOW_conditionalExpression_in_synpred119_Java3090);
        conditionalExpression();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(419,31);
        pushFollow(FOLLOW_assignmentOperator_in_synpred119_Java3092);
        assignmentOperator();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(419,51);
        pushFollow(FOLLOW_expression_in_synpred119_Java3095);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_Java

    // $ANTLR start synpred129_Java
    public final void synpred129_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:433:9: ( '<' '<' '=' )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:433:10: '<' '<' '='
        {
        dbg.location(433,10);
        match(input,72,FOLLOW_72_in_synpred129_Java3215); if (state.failed) return ;
        dbg.location(433,14);
        match(input,72,FOLLOW_72_in_synpred129_Java3217); if (state.failed) return ;
        dbg.location(433,18);
        match(input,84,FOLLOW_84_in_synpred129_Java3219); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred129_Java

    // $ANTLR start synpred130_Java
    public final void synpred130_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:438:9: ( '>' '>' '>' '=' )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:438:10: '>' '>' '>' '='
        {
        dbg.location(438,10);
        match(input,74,FOLLOW_74_in_synpred130_Java3255); if (state.failed) return ;
        dbg.location(438,14);
        match(input,74,FOLLOW_74_in_synpred130_Java3257); if (state.failed) return ;
        dbg.location(438,18);
        match(input,74,FOLLOW_74_in_synpred130_Java3259); if (state.failed) return ;
        dbg.location(438,22);
        match(input,84,FOLLOW_84_in_synpred130_Java3261); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred130_Java

    // $ANTLR start synpred131_Java
    public final void synpred131_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:445:9: ( '>' '>' '=' )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:445:10: '>' '>' '='
        {
        dbg.location(445,10);
        match(input,74,FOLLOW_74_in_synpred131_Java3300); if (state.failed) return ;
        dbg.location(445,14);
        match(input,74,FOLLOW_74_in_synpred131_Java3302); if (state.failed) return ;
        dbg.location(445,18);
        match(input,84,FOLLOW_84_in_synpred131_Java3304); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred131_Java

    // $ANTLR start synpred142_Java
    public final void synpred142_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:489:9: ( '<' '=' )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:489:10: '<' '='
        {
        dbg.location(489,10);
        match(input,72,FOLLOW_72_in_synpred142_Java3620); if (state.failed) return ;
        dbg.location(489,14);
        match(input,84,FOLLOW_84_in_synpred142_Java3622); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred142_Java

    // $ANTLR start synpred143_Java
    public final void synpred143_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:492:9: ( '>' '=' )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:492:10: '>' '='
        {
        dbg.location(492,10);
        match(input,74,FOLLOW_74_in_synpred143_Java3654); if (state.failed) return ;
        dbg.location(492,14);
        match(input,84,FOLLOW_84_in_synpred143_Java3656); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred143_Java

    // $ANTLR start synpred146_Java
    public final void synpred146_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:504:9: ( '<' '<' )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:504:10: '<' '<'
        {
        dbg.location(504,10);
        match(input,72,FOLLOW_72_in_synpred146_Java3748); if (state.failed) return ;
        dbg.location(504,14);
        match(input,72,FOLLOW_72_in_synpred146_Java3750); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred146_Java

    // $ANTLR start synpred147_Java
    public final void synpred147_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:507:9: ( '>' '>' '>' )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:507:10: '>' '>' '>'
        {
        dbg.location(507,10);
        match(input,74,FOLLOW_74_in_synpred147_Java3782); if (state.failed) return ;
        dbg.location(507,14);
        match(input,74,FOLLOW_74_in_synpred147_Java3784); if (state.failed) return ;
        dbg.location(507,18);
        match(input,74,FOLLOW_74_in_synpred147_Java3786); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred147_Java

    // $ANTLR start synpred148_Java
    public final void synpred148_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:512:9: ( '>' '>' )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:512:10: '>' '>'
        {
        dbg.location(512,10);
        match(input,74,FOLLOW_74_in_synpred148_Java3822); if (state.failed) return ;
        dbg.location(512,14);
        match(input,74,FOLLOW_74_in_synpred148_Java3824); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred148_Java

    // $ANTLR start synpred160_Java
    public final void synpred160_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:537:9: ( castExpression )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:537:9: castExpression
        {
        dbg.location(537,9);
        pushFollow(FOLLOW_castExpression_in_synpred160_Java4055);
        castExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred160_Java

    // $ANTLR start synpred162_Java
    public final void synpred162_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:538:9: ( primary ( selector )* '++' )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:538:9: primary ( selector )* '++'
        {
        dbg.location(538,9);
        pushFollow(FOLLOW_primary_in_synpred162_Java4065);
        primary();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(538,17);
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:538:17: ( selector )*
        try { dbg.enterSubRule(140);

        loop140:
        do {
            int alt140=2;
            try { dbg.enterDecision(140);

            int LA140_0 = input.LA(1);

            if ( (LA140_0==81||LA140_0==92) ) {
                alt140=1;
            }


            } finally {dbg.exitDecision(140);}

            switch (alt140) {
        	case 1 :
        	    dbg.enterAlt(1);

        	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: selector
        	    {
        	    dbg.location(538,17);
        	    pushFollow(FOLLOW_selector_in_synpred162_Java4067);
        	    selector();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop140;
            }
        } while (true);
        } finally {dbg.exitSubRule(140);}

        dbg.location(538,27);
        match(input,139,FOLLOW_139_in_synpred162_Java4070); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred162_Java

    // $ANTLR start synpred164_Java
    public final void synpred164_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:539:4: ( primary ( selector )* '--' )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:539:4: primary ( selector )* '--'
        {
        dbg.location(539,4);
        pushFollow(FOLLOW_primary_in_synpred164_Java4086);
        primary();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(539,12);
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:539:12: ( selector )*
        try { dbg.enterSubRule(141);

        loop141:
        do {
            int alt141=2;
            try { dbg.enterDecision(141);

            int LA141_0 = input.LA(1);

            if ( (LA141_0==81||LA141_0==92) ) {
                alt141=1;
            }


            } finally {dbg.exitDecision(141);}

            switch (alt141) {
        	case 1 :
        	    dbg.enterAlt(1);

        	    // /Users/zhengzhedong/Desktop/minijava3/Java.g:0:0: selector
        	    {
        	    dbg.location(539,12);
        	    pushFollow(FOLLOW_selector_in_synpred164_Java4088);
        	    selector();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop141;
            }
        } while (true);
        } finally {dbg.exitSubRule(141);}

        dbg.location(539,22);
        match(input,140,FOLLOW_140_in_synpred164_Java4091); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred164_Java

    // $ANTLR start synpred166_Java
    public final void synpred166_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:544:8: ( '(' primitiveType ')' unaryExpression )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:544:8: '(' primitiveType ')' unaryExpression
        {
        dbg.location(544,8);
        match(input,78,FOLLOW_78_in_synpred166_Java4131); if (state.failed) return ;
        dbg.location(544,13);
        pushFollow(FOLLOW_primitiveType_in_synpred166_Java4134);
        primitiveType();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(544,27);
        match(input,79,FOLLOW_79_in_synpred166_Java4136); if (state.failed) return ;
        dbg.location(544,32);
        pushFollow(FOLLOW_unaryExpression_in_synpred166_Java4139);
        unaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred166_Java

    // $ANTLR start synpred167_Java
    public final void synpred167_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:545:13: ( type )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:545:13: type
        {
        dbg.location(545,13);
        pushFollow(FOLLOW_type_in_synpred167_Java4151);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred167_Java

    // $ANTLR start synpred169_Java
    public final void synpred169_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:550:17: ( '.' Identifier )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:550:17: '.' Identifier
        {
        dbg.location(550,17);
        match(input,92,FOLLOW_92_in_synpred169_Java4192); if (state.failed) return ;
        dbg.location(550,21);
        match(input,Identifier,FOLLOW_Identifier_in_synpred169_Java4194); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred169_Java

    // $ANTLR start synpred170_Java
    public final void synpred170_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:550:34: ( identifierSuffix )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:550:34: identifierSuffix
        {
        dbg.location(550,34);
        pushFollow(FOLLOW_identifierSuffix_in_synpred170_Java4198);
        identifierSuffix();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred170_Java

    // $ANTLR start synpred177_Java
    public final void synpred177_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:555:21: ( '.' Identifier )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:555:21: '.' Identifier
        {
        dbg.location(555,21);
        match(input,92,FOLLOW_92_in_synpred177_Java4269); if (state.failed) return ;
        dbg.location(555,25);
        match(input,Identifier,FOLLOW_Identifier_in_synpred177_Java4271); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred177_Java

    // $ANTLR start synpred178_Java
    public final void synpred178_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:555:38: ( identifierSuffix )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:555:38: identifierSuffix
        {
        dbg.location(555,38);
        pushFollow(FOLLOW_identifierSuffix_in_synpred178_Java4275);
        identifierSuffix();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred178_Java

    // $ANTLR start synpred184_Java
    public final void synpred184_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:562:10: ( '[' expression ']' )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:562:10: '[' expression ']'
        {
        dbg.location(562,10);
        match(input,81,FOLLOW_81_in_synpred184_Java4351); if (state.failed) return ;
        dbg.location(562,14);
        pushFollow(FOLLOW_expression_in_synpred184_Java4353);
        expression();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(562,25);
        match(input,82,FOLLOW_82_in_synpred184_Java4355); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred184_Java

    // $ANTLR start synpred197_Java
    public final void synpred197_Java_fragment() throws RecognitionException {   
        // /Users/zhengzhedong/Desktop/minijava3/Java.g:588:29: ( '[' expression ']' )
        dbg.enterAlt(1);

        // /Users/zhengzhedong/Desktop/minijava3/Java.g:588:29: '[' expression ']'
        {
        dbg.location(588,29);
        match(input,81,FOLLOW_81_in_synpred197_Java4591); if (state.failed) return ;
        dbg.location(588,33);
        pushFollow(FOLLOW_expression_in_synpred197_Java4593);
        expression();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(588,44);
        match(input,82,FOLLOW_82_in_synpred197_Java4595); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred197_Java

    // Delegated rules

    public final boolean synpred98_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred98_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred166_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred166_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred178_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred178_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred167_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred167_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred1_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred177_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred177_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred119_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred129_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred129_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred113_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred113_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred117_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred117_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred148_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred148_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred25_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred2_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred162_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred162_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred4_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred94_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred130_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred130_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred147_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred147_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred184_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred184_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred142_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred142_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred143_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred143_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred170_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred170_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred77_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred197_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred197_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred169_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred169_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred73_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred131_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred131_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred146_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred146_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred160_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred160_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred109_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred109_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred164_Java() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred164_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA50 dfa50 = new DFA50(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA99 dfa99 = new DFA99(this);
    protected DFA103 dfa103 = new DFA103(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA111 dfa111 = new DFA111(this);
    protected DFA110 dfa110 = new DFA110(this);
    protected DFA117 dfa117 = new DFA117(this);
    static final String DFA50_eotS =
        "\43\uffff";
    static final String DFA50_eofS =
        "\43\uffff";
    static final String DFA50_minS =
        "\1\54\1\uffff\16\0\23\uffff";
    static final String DFA50_maxS =
        "\1\u0090\1\uffff\16\0\23\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\16\uffff\1\2\22\uffff";
    static final String DFA50_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\23\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\15\1\6\1\7\1\10\3\5\16\uffff\7\20\1\1\4\uffff\1\20\1\3\1"+
            "\uffff\1\17\4\uffff\1\20\7\uffff\10\16\1\uffff\1\4\1\2\1\12"+
            "\2\11\1\uffff\1\20\1\uffff\6\20\22\uffff\2\20\3\uffff\4\20\1"+
            "\13\1\14",
            "",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "270:13: ( explicitConstructorInvocation )?";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_2 = input.LA(1);

                         
                        int index50_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index50_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_3 = input.LA(1);

                         
                        int index50_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index50_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_4 = input.LA(1);

                         
                        int index50_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index50_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA50_5 = input.LA(1);

                         
                        int index50_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index50_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA50_6 = input.LA(1);

                         
                        int index50_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index50_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA50_7 = input.LA(1);

                         
                        int index50_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index50_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA50_8 = input.LA(1);

                         
                        int index50_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index50_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA50_9 = input.LA(1);

                         
                        int index50_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index50_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA50_10 = input.LA(1);

                         
                        int index50_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index50_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA50_11 = input.LA(1);

                         
                        int index50_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index50_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA50_12 = input.LA(1);

                         
                        int index50_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index50_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA50_13 = input.LA(1);

                         
                        int index50_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index50_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA50_14 = input.LA(1);

                         
                        int index50_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index50_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA50_15 = input.LA(1);

                         
                        int index50_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index50_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\20\uffff";
    static final String DFA54_eofS =
        "\20\uffff";
    static final String DFA54_minS =
        "\1\54\1\uffff\1\0\1\uffff\1\0\13\uffff";
    static final String DFA54_maxS =
        "\1\u0090\1\uffff\1\0\1\uffff\1\0\13\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\14\uffff";
    static final String DFA54_specialS =
        "\2\uffff\1\0\1\uffff\1\1\13\uffff}>";
    static final String[] DFA54_transitionS = {
            "\7\3\25\uffff\1\1\5\uffff\1\3\1\uffff\1\3\14\uffff\10\3\1\uffff"+
            "\1\4\1\2\3\3\44\uffff\2\3",
            "",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "273:1: explicitConstructorInvocation : ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index54_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_4 = input.LA(1);

                         
                        int index54_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index54_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\41\uffff";
    static final String DFA63_eofS =
        "\41\uffff";
    static final String DFA63_minS =
        "\1\54\1\uffff\2\0\35\uffff";
    static final String DFA63_maxS =
        "\1\u0090\1\uffff\2\0\35\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3\32\uffff";
    static final String DFA63_specialS =
        "\2\uffff\1\0\1\1\35\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\3\6\6\16\uffff\5\4\1\6\6\uffff\2\6\1\uffff\1\6\4\uffff\1"+
            "\1\7\uffff\10\2\1\uffff\5\6\1\uffff\1\6\1\uffff\6\6\22\uffff"+
            "\2\6\3\uffff\6\6",
            "",
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
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "330:1: blockStatement : ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_2 = input.LA(1);

                         
                        int index63_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index63_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_3 = input.LA(1);

                         
                        int index63_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index63_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\160\uffff";
    static final String DFA76_eofS =
        "\160\uffff";
    static final String DFA76_minS =
        "\4\54\23\uffff\3\54\2\uffff\1\54\1\111\1\54\4\uffff\1\54\23\uffff"+
        "\1\54\1\111\3\uffff\13\0\5\uffff\1\0\7\uffff\3\0\22\uffff\2\0\5"+
        "\uffff";
    static final String DFA76_maxS =
        "\1\u0090\1\144\1\134\1\u008c\23\uffff\1\133\1\134\1\144\2\uffff"+
        "\1\133\1\164\1\u008f\4\uffff\1\u0090\23\uffff\1\133\1\164\3\uffff"+
        "\13\0\5\uffff\1\0\7\uffff\3\0\22\uffff\2\0\5\uffff";
    static final String DFA76_acceptS =
        "\4\uffff\1\2\102\uffff\1\1\50\uffff";
    static final String DFA76_specialS =
        "\74\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\5\uffff"+
        "\1\13\7\uffff\1\14\1\15\1\16\22\uffff\1\17\1\20\5\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\3\6\4\32\uffff\2\4\1\uffff\1\4\4\uffff\1\1\7\uffff\10\2\1"+
            "\uffff\5\4\33\uffff\2\4\3\uffff\6\4",
            "\1\30\50\uffff\1\31\7\uffff\10\27",
            "\1\35\44\uffff\1\4\11\uffff\1\34\1\4",
            "\1\70\33\uffff\1\43\2\4\1\uffff\3\4\2\uffff\1\4\2\uffff\1\4"+
            "\6\uffff\1\67\1\36\10\uffff\1\4\21\uffff\26\4",
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
            "\1\75\56\uffff\1\74",
            "\1\101\33\uffff\1\76\22\uffff\1\100\1\77",
            "\1\103\50\uffff\1\104\7\uffff\10\102",
            "",
            "",
            "\1\105\56\uffff\1\106",
            "\1\4\3\uffff\1\4\3\uffff\1\4\2\uffff\1\4\37\uffff\1\107",
            "\1\114\30\uffff\1\4\2\uffff\1\4\35\uffff\2\4\47\uffff\1\4",
            "",
            "",
            "",
            "",
            "\1\125\6\4\25\uffff\1\4\5\uffff\1\4\1\uffff\1\4\3\uffff\1\4"+
            "\10\uffff\10\124\1\126\5\4\33\uffff\2\4\3\uffff\6\4",
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
            "\1\151\56\uffff\1\152",
            "\1\4\3\uffff\1\4\3\uffff\1\4\2\uffff\1\4\37\uffff\1\107",
            "",
            "",
            "",
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
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "381:1: forControl options {k=3; } : ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? -> ^( INIT ( forInit )? ) ^( CONTROL ( expression )? ) ^( UPDATE ( forUpdate )? ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_60 = input.LA(1);

                         
                        int index76_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_60);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_61 = input.LA(1);

                         
                        int index76_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_61);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_62 = input.LA(1);

                         
                        int index76_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_62);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA76_63 = input.LA(1);

                         
                        int index76_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_63);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA76_64 = input.LA(1);

                         
                        int index76_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_64);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA76_65 = input.LA(1);

                         
                        int index76_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_65);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA76_66 = input.LA(1);

                         
                        int index76_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_66);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA76_67 = input.LA(1);

                         
                        int index76_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_67);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA76_68 = input.LA(1);

                         
                        int index76_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_68);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA76_69 = input.LA(1);

                         
                        int index76_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_69);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA76_70 = input.LA(1);

                         
                        int index76_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_70);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA76_76 = input.LA(1);

                         
                        int index76_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_76);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA76_84 = input.LA(1);

                         
                        int index76_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_84);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA76_85 = input.LA(1);

                         
                        int index76_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_85);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA76_86 = input.LA(1);

                         
                        int index76_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_86);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA76_105 = input.LA(1);

                         
                        int index76_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_105);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA76_106 = input.LA(1);

                         
                        int index76_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Java()) ) {s = 71;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index76_106);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA77_eotS =
        "\26\uffff";
    static final String DFA77_eofS =
        "\26\uffff";
    static final String DFA77_minS =
        "\1\54\1\uffff\2\0\22\uffff";
    static final String DFA77_maxS =
        "\1\u0090\1\uffff\2\0\22\uffff";
    static final String DFA77_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\21\uffff";
    static final String DFA77_specialS =
        "\2\uffff\1\0\1\1\22\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\3\6\4\33\uffff\1\4\1\uffff\1\4\4\uffff\1\1\7\uffff\10\2\1"+
            "\uffff\5\4\33\uffff\2\4\3\uffff\6\4",
            "",
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
            ""
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "387:1: forInit : ( localVariableDeclaration | expressionList );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_2 = input.LA(1);

                         
                        int index77_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index77_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA77_3 = input.LA(1);

                         
                        int index77_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_Java()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index77_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA79_eotS =
        "\27\uffff";
    static final String DFA79_eofS =
        "\27\uffff";
    static final String DFA79_minS =
        "\1\54\24\0\2\uffff";
    static final String DFA79_maxS =
        "\1\u0090\24\0\2\uffff";
    static final String DFA79_acceptS =
        "\25\uffff\1\1\1\2";
    static final String DFA79_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\2\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\22\1\13\1\14\1\15\3\12\33\uffff\1\7\1\uffff\1\24\14\uffff"+
            "\10\23\1\uffff\1\11\1\10\1\17\2\16\33\uffff\1\1\1\2\3\uffff"+
            "\1\3\1\4\1\5\1\6\1\20\1\21",
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
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "418:1: expression : ( conditionalExpression assignmentOperator expression | conditionalExpression );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_2 = input.LA(1);

                         
                        int index79_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_3 = input.LA(1);

                         
                        int index79_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA79_4 = input.LA(1);

                         
                        int index79_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA79_5 = input.LA(1);

                         
                        int index79_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA79_6 = input.LA(1);

                         
                        int index79_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA79_7 = input.LA(1);

                         
                        int index79_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA79_8 = input.LA(1);

                         
                        int index79_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA79_9 = input.LA(1);

                         
                        int index79_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA79_10 = input.LA(1);

                         
                        int index79_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA79_11 = input.LA(1);

                         
                        int index79_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA79_12 = input.LA(1);

                         
                        int index79_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA79_13 = input.LA(1);

                         
                        int index79_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA79_14 = input.LA(1);

                         
                        int index79_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA79_15 = input.LA(1);

                         
                        int index79_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA79_16 = input.LA(1);

                         
                        int index79_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA79_17 = input.LA(1);

                         
                        int index79_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA79_18 = input.LA(1);

                         
                        int index79_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA79_19 = input.LA(1);

                         
                        int index79_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA79_20 = input.LA(1);

                         
                        int index79_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Java()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index79_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA80_eotS =
        "\17\uffff";
    static final String DFA80_eofS =
        "\17\uffff";
    static final String DFA80_minS =
        "\1\110\12\uffff\2\112\2\uffff";
    static final String DFA80_maxS =
        "\1\176\12\uffff\1\112\1\124\2\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\13"+
        "\1\14";
    static final String DFA80_specialS =
        "\1\0\13\uffff\1\1\2\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\12\1\uffff\1\13\11\uffff\1\1\42\uffff\1\2\1\3\1\4\1\5\1\6"+
            "\1\7\1\10\1\11",
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
            "\1\14",
            "\1\15\11\uffff\1\16",
            "",
            ""
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "423:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}? | ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}? | ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?);";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_0 = input.LA(1);

                         
                        int index80_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA80_0==84) ) {s = 1;}

                        else if ( (LA80_0==119) ) {s = 2;}

                        else if ( (LA80_0==120) ) {s = 3;}

                        else if ( (LA80_0==121) ) {s = 4;}

                        else if ( (LA80_0==122) ) {s = 5;}

                        else if ( (LA80_0==123) ) {s = 6;}

                        else if ( (LA80_0==124) ) {s = 7;}

                        else if ( (LA80_0==125) ) {s = 8;}

                        else if ( (LA80_0==126) ) {s = 9;}

                        else if ( (LA80_0==72) && (synpred129_Java())) {s = 10;}

                        else if ( (LA80_0==74) ) {s = 11;}

                         
                        input.seek(index80_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA80_12 = input.LA(1);

                         
                        int index80_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA80_12==74) && (synpred130_Java())) {s = 13;}

                        else if ( (LA80_12==84) && (synpred131_Java())) {s = 14;}

                         
                        input.seek(index80_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA92_eotS =
        "\31\uffff";
    static final String DFA92_eofS =
        "\31\uffff";
    static final String DFA92_minS =
        "\1\110\1\uffff\1\112\1\54\25\uffff";
    static final String DFA92_maxS =
        "\1\112\1\uffff\1\112\1\u0090\25\uffff";
    static final String DFA92_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\24\3";
    static final String DFA92_specialS =
        "\1\0\2\uffff\1\1\25\uffff}>";
    static final String[] DFA92_transitionS = {
            "\1\1\1\uffff\1\2",
            "",
            "\1\3",
            "\1\26\1\17\1\20\1\21\3\16\27\uffff\1\4\3\uffff\1\13\1\uffff"+
            "\1\30\14\uffff\10\27\1\uffff\1\15\1\14\1\23\2\22\33\uffff\1"+
            "\5\1\6\3\uffff\1\7\1\10\1\11\1\12\1\24\1\25",
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

    static final short[] DFA92_eot = DFA.unpackEncodedString(DFA92_eotS);
    static final short[] DFA92_eof = DFA.unpackEncodedString(DFA92_eofS);
    static final char[] DFA92_min = DFA.unpackEncodedStringToUnsignedChars(DFA92_minS);
    static final char[] DFA92_max = DFA.unpackEncodedStringToUnsignedChars(DFA92_maxS);
    static final short[] DFA92_accept = DFA.unpackEncodedString(DFA92_acceptS);
    static final short[] DFA92_special = DFA.unpackEncodedString(DFA92_specialS);
    static final short[][] DFA92_transition;

    static {
        int numStates = DFA92_transitionS.length;
        DFA92_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA92_transition[i] = DFA.unpackEncodedString(DFA92_transitionS[i]);
        }
    }

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = DFA92_eot;
            this.eof = DFA92_eof;
            this.min = DFA92_min;
            this.max = DFA92_max;
            this.accept = DFA92_accept;
            this.special = DFA92_special;
            this.transition = DFA92_transition;
        }
        public String getDescription() {
            return "503:1: shiftOp : ( ( '<' '<' )=>t1= '<' t2= '<' {...}? | ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}? | ( '>' '>' )=>t1= '>' t2= '>' {...}?);";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA92_0 = input.LA(1);

                         
                        int index92_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA92_0==72) && (synpred146_Java())) {s = 1;}

                        else if ( (LA92_0==74) ) {s = 2;}

                         
                        input.seek(index92_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA92_3 = input.LA(1);

                         
                        int index92_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA92_3==74) && (synpred147_Java())) {s = 4;}

                        else if ( (LA92_3==134) && (synpred148_Java())) {s = 5;}

                        else if ( (LA92_3==135) && (synpred148_Java())) {s = 6;}

                        else if ( (LA92_3==139) && (synpred148_Java())) {s = 7;}

                        else if ( (LA92_3==140) && (synpred148_Java())) {s = 8;}

                        else if ( (LA92_3==141) && (synpred148_Java())) {s = 9;}

                        else if ( (LA92_3==142) && (synpred148_Java())) {s = 10;}

                        else if ( (LA92_3==78) && (synpred148_Java())) {s = 11;}

                        else if ( (LA92_3==103) && (synpred148_Java())) {s = 12;}

                        else if ( (LA92_3==102) && (synpred148_Java())) {s = 13;}

                        else if ( ((LA92_3>=HexLiteral && LA92_3<=DecimalLiteral)) && (synpred148_Java())) {s = 14;}

                        else if ( (LA92_3==FloatingPointLiteral) && (synpred148_Java())) {s = 15;}

                        else if ( (LA92_3==CharacterLiteral) && (synpred148_Java())) {s = 16;}

                        else if ( (LA92_3==StringLiteral) && (synpred148_Java())) {s = 17;}

                        else if ( ((LA92_3>=105 && LA92_3<=106)) && (synpred148_Java())) {s = 18;}

                        else if ( (LA92_3==104) && (synpred148_Java())) {s = 19;}

                        else if ( (LA92_3==143) && (synpred148_Java())) {s = 20;}

                        else if ( (LA92_3==144) && (synpred148_Java())) {s = 21;}

                        else if ( (LA92_3==Identifier) && (synpred148_Java())) {s = 22;}

                        else if ( ((LA92_3>=93 && LA92_3<=100)) && (synpred148_Java())) {s = 23;}

                        else if ( (LA92_3==80) && (synpred148_Java())) {s = 24;}

                         
                        input.seek(index92_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 92, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA99_eotS =
        "\25\uffff";
    static final String DFA99_eofS =
        "\25\uffff";
    static final String DFA99_minS =
        "\1\54\2\uffff\16\0\4\uffff";
    static final String DFA99_maxS =
        "\1\u0090\2\uffff\16\0\4\uffff";
    static final String DFA99_acceptS =
        "\1\uffff\1\1\1\2\16\uffff\1\3\1\4\1\5\1\6";
    static final String DFA99_specialS =
        "\3\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\4\uffff}>";
    static final String[] DFA99_transitionS = {
            "\1\16\1\7\1\10\1\11\3\6\33\uffff\1\3\1\uffff\1\20\14\uffff\10"+
            "\17\1\uffff\1\5\1\4\1\13\2\12\42\uffff\1\1\1\2\1\14\1\15",
            "",
            "",
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
            ""
    };

    static final short[] DFA99_eot = DFA.unpackEncodedString(DFA99_eotS);
    static final short[] DFA99_eof = DFA.unpackEncodedString(DFA99_eofS);
    static final char[] DFA99_min = DFA.unpackEncodedStringToUnsignedChars(DFA99_minS);
    static final char[] DFA99_max = DFA.unpackEncodedStringToUnsignedChars(DFA99_maxS);
    static final short[] DFA99_accept = DFA.unpackEncodedString(DFA99_acceptS);
    static final short[] DFA99_special = DFA.unpackEncodedString(DFA99_specialS);
    static final short[][] DFA99_transition;

    static {
        int numStates = DFA99_transitionS.length;
        DFA99_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA99_transition[i] = DFA.unpackEncodedString(DFA99_transitionS[i]);
        }
    }

    class DFA99 extends DFA {

        public DFA99(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 99;
            this.eot = DFA99_eot;
            this.eof = DFA99_eof;
            this.min = DFA99_min;
            this.max = DFA99_max;
            this.accept = DFA99_accept;
            this.special = DFA99_special;
            this.transition = DFA99_transition;
        }
        public String getDescription() {
            return "534:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* '++' -> ^( RIGHT_INC primary ( selector )* ) | primary ( selector )* '--' -> ^( RIGHT_DEC primary ( selector )* ) | primary ( selector )* );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA99_3 = input.LA(1);

                         
                        int index99_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred160_Java()) ) {s = 17;}

                        else if ( (synpred162_Java()) ) {s = 18;}

                        else if ( (synpred164_Java()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index99_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA99_4 = input.LA(1);

                         
                        int index99_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Java()) ) {s = 18;}

                        else if ( (synpred164_Java()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index99_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA99_5 = input.LA(1);

                         
                        int index99_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Java()) ) {s = 18;}

                        else if ( (synpred164_Java()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index99_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA99_6 = input.LA(1);

                         
                        int index99_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Java()) ) {s = 18;}

                        else if ( (synpred164_Java()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index99_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA99_7 = input.LA(1);

                         
                        int index99_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Java()) ) {s = 18;}

                        else if ( (synpred164_Java()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index99_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA99_8 = input.LA(1);

                         
                        int index99_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Java()) ) {s = 18;}

                        else if ( (synpred164_Java()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index99_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA99_9 = input.LA(1);

                         
                        int index99_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Java()) ) {s = 18;}

                        else if ( (synpred164_Java()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index99_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA99_10 = input.LA(1);

                         
                        int index99_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Java()) ) {s = 18;}

                        else if ( (synpred164_Java()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index99_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA99_11 = input.LA(1);

                         
                        int index99_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Java()) ) {s = 18;}

                        else if ( (synpred164_Java()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index99_11);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA99_12 = input.LA(1);

                         
                        int index99_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Java()) ) {s = 18;}

                        else if ( (synpred164_Java()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index99_12);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA99_13 = input.LA(1);

                         
                        int index99_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Java()) ) {s = 18;}

                        else if ( (synpred164_Java()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index99_13);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA99_14 = input.LA(1);

                         
                        int index99_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Java()) ) {s = 18;}

                        else if ( (synpred164_Java()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index99_14);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA99_15 = input.LA(1);

                         
                        int index99_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Java()) ) {s = 18;}

                        else if ( (synpred164_Java()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index99_15);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA99_16 = input.LA(1);

                         
                        int index99_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Java()) ) {s = 18;}

                        else if ( (synpred164_Java()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index99_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 99, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA103_eotS =
        "\42\uffff";
    static final String DFA103_eofS =
        "\1\4\41\uffff";
    static final String DFA103_minS =
        "\1\107\1\0\1\uffff\1\0\36\uffff";
    static final String DFA103_maxS =
        "\1\u008c\1\0\1\uffff\1\0\36\uffff";
    static final String DFA103_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\35\uffff";
    static final String DFA103_specialS =
        "\1\uffff\1\0\1\uffff\1\1\36\uffff}>";
    static final String[] DFA103_transitionS = {
            "\4\4\1\uffff\2\4\1\2\1\4\1\uffff\1\1\1\4\1\uffff\1\4\7\uffff"+
            "\1\3\10\uffff\1\4\16\uffff\1\4\2\uffff\26\4",
            "\1\uffff",
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

    static final short[] DFA103_eot = DFA.unpackEncodedString(DFA103_eotS);
    static final short[] DFA103_eof = DFA.unpackEncodedString(DFA103_eofS);
    static final char[] DFA103_min = DFA.unpackEncodedStringToUnsignedChars(DFA103_minS);
    static final char[] DFA103_max = DFA.unpackEncodedStringToUnsignedChars(DFA103_maxS);
    static final short[] DFA103_accept = DFA.unpackEncodedString(DFA103_acceptS);
    static final short[] DFA103_special = DFA.unpackEncodedString(DFA103_specialS);
    static final short[][] DFA103_transition;

    static {
        int numStates = DFA103_transitionS.length;
        DFA103_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA103_transition[i] = DFA.unpackEncodedString(DFA103_transitionS[i]);
        }
    }

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = DFA103_eot;
            this.eof = DFA103_eof;
            this.min = DFA103_min;
            this.max = DFA103_max;
            this.accept = DFA103_accept;
            this.special = DFA103_special;
            this.transition = DFA103_transition;
        }
        public String getDescription() {
            return "550:34: ( identifierSuffix )?";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA103_1 = input.LA(1);

                         
                        int index103_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Java()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index103_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA103_3 = input.LA(1);

                         
                        int index103_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Java()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index103_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 103, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA106_eotS =
        "\42\uffff";
    static final String DFA106_eofS =
        "\1\4\41\uffff";
    static final String DFA106_minS =
        "\1\107\1\0\1\uffff\1\0\36\uffff";
    static final String DFA106_maxS =
        "\1\u008c\1\0\1\uffff\1\0\36\uffff";
    static final String DFA106_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\35\uffff";
    static final String DFA106_specialS =
        "\1\uffff\1\0\1\uffff\1\1\36\uffff}>";
    static final String[] DFA106_transitionS = {
            "\4\4\1\uffff\2\4\1\2\1\4\1\uffff\1\1\1\4\1\uffff\1\4\7\uffff"+
            "\1\3\10\uffff\1\4\16\uffff\1\4\2\uffff\26\4",
            "\1\uffff",
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

    static final short[] DFA106_eot = DFA.unpackEncodedString(DFA106_eotS);
    static final short[] DFA106_eof = DFA.unpackEncodedString(DFA106_eofS);
    static final char[] DFA106_min = DFA.unpackEncodedStringToUnsignedChars(DFA106_minS);
    static final char[] DFA106_max = DFA.unpackEncodedStringToUnsignedChars(DFA106_maxS);
    static final short[] DFA106_accept = DFA.unpackEncodedString(DFA106_acceptS);
    static final short[] DFA106_special = DFA.unpackEncodedString(DFA106_specialS);
    static final short[][] DFA106_transition;

    static {
        int numStates = DFA106_transitionS.length;
        DFA106_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA106_transition[i] = DFA.unpackEncodedString(DFA106_transitionS[i]);
        }
    }

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = DFA106_eot;
            this.eof = DFA106_eof;
            this.min = DFA106_min;
            this.max = DFA106_max;
            this.accept = DFA106_accept;
            this.special = DFA106_special;
            this.transition = DFA106_transition;
        }
        public String getDescription() {
            return "555:38: ( identifierSuffix )?";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA106_1 = input.LA(1);

                         
                        int index106_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_Java()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index106_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA106_3 = input.LA(1);

                         
                        int index106_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_Java()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index106_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 106, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA111_eotS =
        "\13\uffff";
    static final String DFA111_eofS =
        "\13\uffff";
    static final String DFA111_minS =
        "\1\116\1\54\1\uffff\1\105\7\uffff";
    static final String DFA111_maxS =
        "\1\134\1\u0090\1\uffff\1\u008f\7\uffff";
    static final String DFA111_acceptS =
        "\2\uffff\1\3\1\uffff\1\1\1\2\1\4\1\6\1\7\1\10\1\5";
    static final String DFA111_specialS =
        "\13\uffff}>";
    static final String[] DFA111_transitionS = {
            "\1\2\2\uffff\1\1\12\uffff\1\3",
            "\7\5\33\uffff\1\5\1\uffff\1\5\1\uffff\1\4\12\uffff\10\5\1\uffff"+
            "\5\5\33\uffff\2\5\3\uffff\6\5",
            "",
            "\1\6\2\uffff\1\12\35\uffff\1\10\1\7\47\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA111_eot = DFA.unpackEncodedString(DFA111_eotS);
    static final short[] DFA111_eof = DFA.unpackEncodedString(DFA111_eofS);
    static final char[] DFA111_min = DFA.unpackEncodedStringToUnsignedChars(DFA111_minS);
    static final char[] DFA111_max = DFA.unpackEncodedStringToUnsignedChars(DFA111_maxS);
    static final short[] DFA111_accept = DFA.unpackEncodedString(DFA111_acceptS);
    static final short[] DFA111_special = DFA.unpackEncodedString(DFA111_specialS);
    static final short[][] DFA111_transition;

    static {
        int numStates = DFA111_transitionS.length;
        DFA111_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA111_transition[i] = DFA.unpackEncodedString(DFA111_transitionS[i]);
        }
    }

    class DFA111 extends DFA {

        public DFA111(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 111;
            this.eot = DFA111_eot;
            this.eof = DFA111_eof;
            this.min = DFA111_min;
            this.max = DFA111_max;
            this.accept = DFA111_accept;
            this.special = DFA111_special;
            this.transition = DFA111_transition;
        }
        public String getDescription() {
            return "560:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' innerCreator );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA110_eotS =
        "\42\uffff";
    static final String DFA110_eofS =
        "\1\1\41\uffff";
    static final String DFA110_minS =
        "\1\107\1\uffff\1\0\37\uffff";
    static final String DFA110_maxS =
        "\1\u008c\1\uffff\1\0\37\uffff";
    static final String DFA110_acceptS =
        "\1\uffff\1\2\37\uffff\1\1";
    static final String DFA110_specialS =
        "\2\uffff\1\0\37\uffff}>";
    static final String[] DFA110_transitionS = {
            "\4\1\1\uffff\2\1\1\uffff\1\1\1\uffff\1\2\1\1\1\uffff\1\1\7\uffff"+
            "\1\1\10\uffff\1\1\16\uffff\1\1\2\uffff\26\1",
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

    static final short[] DFA110_eot = DFA.unpackEncodedString(DFA110_eotS);
    static final short[] DFA110_eof = DFA.unpackEncodedString(DFA110_eofS);
    static final char[] DFA110_min = DFA.unpackEncodedStringToUnsignedChars(DFA110_minS);
    static final char[] DFA110_max = DFA.unpackEncodedStringToUnsignedChars(DFA110_maxS);
    static final short[] DFA110_accept = DFA.unpackEncodedString(DFA110_acceptS);
    static final short[] DFA110_special = DFA.unpackEncodedString(DFA110_specialS);
    static final short[][] DFA110_transition;

    static {
        int numStates = DFA110_transitionS.length;
        DFA110_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA110_transition[i] = DFA.unpackEncodedString(DFA110_transitionS[i]);
        }
    }

    class DFA110 extends DFA {

        public DFA110(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 110;
            this.eot = DFA110_eot;
            this.eof = DFA110_eof;
            this.min = DFA110_min;
            this.max = DFA110_max;
            this.accept = DFA110_accept;
            this.special = DFA110_special;
            this.transition = DFA110_transition;
        }
        public String getDescription() {
            return "()+ loopback of 562:9: ( '[' expression ']' )+";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA110_2 = input.LA(1);

                         
                        int index110_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred184_Java()) ) {s = 33;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index110_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 110, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA117_eotS =
        "\42\uffff";
    static final String DFA117_eofS =
        "\1\2\41\uffff";
    static final String DFA117_minS =
        "\1\107\1\0\40\uffff";
    static final String DFA117_maxS =
        "\1\u008c\1\0\40\uffff";
    static final String DFA117_acceptS =
        "\2\uffff\1\2\36\uffff\1\1";
    static final String DFA117_specialS =
        "\1\uffff\1\0\40\uffff}>";
    static final String[] DFA117_transitionS = {
            "\4\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\1\1\2\1\uffff\1\2\7\uffff"+
            "\1\2\10\uffff\1\2\16\uffff\1\2\2\uffff\26\2",
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
            ""
    };

    static final short[] DFA117_eot = DFA.unpackEncodedString(DFA117_eotS);
    static final short[] DFA117_eof = DFA.unpackEncodedString(DFA117_eofS);
    static final char[] DFA117_min = DFA.unpackEncodedStringToUnsignedChars(DFA117_minS);
    static final char[] DFA117_max = DFA.unpackEncodedStringToUnsignedChars(DFA117_maxS);
    static final short[] DFA117_accept = DFA.unpackEncodedString(DFA117_acceptS);
    static final short[] DFA117_special = DFA.unpackEncodedString(DFA117_specialS);
    static final short[][] DFA117_transition;

    static {
        int numStates = DFA117_transitionS.length;
        DFA117_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA117_transition[i] = DFA.unpackEncodedString(DFA117_transitionS[i]);
        }
    }

    class DFA117 extends DFA {

        public DFA117(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 117;
            this.eot = DFA117_eot;
            this.eof = DFA117_eof;
            this.min = DFA117_min;
            this.max = DFA117_max;
            this.accept = DFA117_accept;
            this.special = DFA117_special;
            this.transition = DFA117_transition;
        }
        public String getDescription() {
            return "()* loopback of 588:28: ( '[' expression ']' )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA117_1 = input.LA(1);

                         
                        int index117_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred197_Java()) ) {s = 33;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index117_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 117, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_compilationUnit212 = new BitSet(new long[]{0x0000000000000002L,0x000000000000003FL});
    public static final BitSet FOLLOW_mainclass_in_compilationUnit215 = new BitSet(new long[]{0x0000000000000002L,0x000000000000003FL});
    public static final BitSet FOLLOW_compilation_in_compilationUnit218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_compilation234 = new BitSet(new long[]{0x0000000000000002L,0x000000000000003FL});
    public static final BitSet FOLLOW_compilation_in_compilation237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mainclass_in_compilation243 = new BitSet(new long[]{0x0000000000000002L,0x000000000000003FL});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_compilation246 = new BitSet(new long[]{0x0000000000000002L,0x000000000000003EL});
    public static final BitSet FOLLOW_64_in_mainclass261 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_classDeclaration_in_mainclass263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceModifiers_in_classOrInterfaceDeclaration288 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_classDeclaration_in_classOrInterfaceDeclaration290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceModifier_in_classOrInterfaceModifiers324 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001EL});
    public static final BitSet FOLLOW_set_in_classOrInterfaceModifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_modifiers414 = new BitSet(new long[]{0x0000000000000002L,0x0000000007E0001FL});
    public static final BitSet FOLLOW_69_in_classDeclaration443 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_classDeclaration449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_typeParameters_in_classDeclaration451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_classDeclaration462 = new BitSet(new long[]{0x0000000000000000L,0x0000000007E0209FL});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classDeclaration464 = new BitSet(new long[]{0x0000000000000000L,0x0000000007E0209FL});
    public static final BitSet FOLLOW_71_in_classDeclaration467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_typeParameters509 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_typeParameters514 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_74_in_typeParameters520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_typeParameter539 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_typeParameter542 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_typeBound_in_typeParameter544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeBound573 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_typeBound576 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_type_in_typeBound578 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_type_in_typeList603 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_typeList606 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_type_in_typeList608 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_77_in_classBodyDeclaration629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_classBodyDeclaration639 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE001013EL});
    public static final BitSet FOLLOW_memberDecl_in_classBodyDeclaration641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericMethodOrConstructorDecl_in_memberDecl674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberDeclaration_in_memberDecl684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_memberDecl694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_constructorDeclaratorRest_in_memberDecl696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_memberDecl706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mtype_in_memberDeclaration733 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_memberDeclaration741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_memberDeclaration745 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0208000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_memberDeclaration747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_memberDeclaration750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_methodBody_in_memberDeclaration754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_memberDeclaration793 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_mtype825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_mtype829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParameters_in_genericMethodOrConstructorDecl846 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0010000L});
    public static final BitSet FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_genericMethodOrConstructorRest872 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_80_in_genericMethodOrConstructorRest876 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarators_in_fieldDeclaration912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_fieldDeclaration914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaratorRest938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000022040L});
    public static final BitSet FOLLOW_81_in_methodDeclaratorRest941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_methodDeclaratorRest943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000022040L});
    public static final BitSet FOLLOW_methodBody_in_methodDeclaratorRest959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_methodDeclaratorRest973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest1007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000082040L});
    public static final BitSet FOLLOW_83_in_voidMethodDeclaratorRest1010 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest1012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_voidMethodDeclaratorRest1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_constructorDeclaratorRest1075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080040L});
    public static final BitSet FOLLOW_83_in_constructorDeclaratorRest1078 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_qualifiedNameList_in_constructorDeclaratorRest1080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080040L});
    public static final BitSet FOLLOW_constructorBody_in_constructorDeclaratorRest1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_constantDeclarator1103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000120000L});
    public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclarator1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1128 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_variableDeclarators1131 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator1155 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_assign_in_variableDeclarator1158 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_assign1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest1196 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_constantDeclaratorsRest1199 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_constantDeclarator_in_constantDeclaratorsRest1201 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_81_in_constantDeclaratorRest1223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_constantDeclaratorRest1225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000120000L});
    public static final BitSet FOLLOW_84_in_constantDeclaratorRest1229 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_variableInitializer_in_constantDeclaratorRest1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclaratorId1254 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_variableDeclaratorId1257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_variableDeclaratorId1258 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_arrayInitializer1316 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE00140C0L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_73_in_arrayInitializer1322 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_73_in_arrayInitializer1329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_arrayInitializer1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_packageOrTypeName1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_typeName1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1506 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_type1509 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_type1515 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_type1518 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType1531 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000100L});
    public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType1533 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_classOrInterfaceType1537 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType1539 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000100L});
    public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType1541 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_variableModifier1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_typeArguments1669 = new BitSet(new long[]{0x0000100000000000L,0x0000003FE0000000L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments1671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_typeArguments1674 = new BitSet(new long[]{0x0000100000000000L,0x0000003FE0000000L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments1676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_74_in_typeArguments1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeArgument1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_typeArgument1713 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000800L});
    public static final BitSet FOLLOW_set_in_typeArgument1716 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_type_in_typeArgument1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList1749 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_qualifiedNameList1752 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList1754 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_78_in_formalParameters1775 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0208000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters1777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_formalParameters1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_formalParameterDecls1804 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_type_in_formalParameterDecls1806 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_formalParameterDeclsRest_in_formalParameterDecls1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest1831 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_formalParameterDeclsRest1834 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0200000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDeclsRest1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_methodBody1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_constructorBody1881 = new BitSet(new long[]{0x0007F00000000000L,0x000FD7DFE02161FEL,0x000000000001F8C0L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody1883 = new BitSet(new long[]{0x0007F00000000000L,0x000FD7DFE02160FEL,0x000000000001F8C0L});
    public static final BitSet FOLLOW_blockStatement_in_constructorBody1886 = new BitSet(new long[]{0x0007F00000000000L,0x000FD7DFE02160FEL,0x000000000001F8C0L});
    public static final BitSet FOLLOW_71_in_constructorBody1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation1908 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_set_in_explicitConstructorInvocation1911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_explicitConstructorInvocation1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_explicitConstructorInvocation1931 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_explicitConstructorInvocation1933 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000100L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation1935 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_explicitConstructorInvocation1938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation1940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_explicitConstructorInvocation1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName1962 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_qualifiedName1965 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName1967 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_integerLiteral_in_literal1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_literal2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_literal2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_literal2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs2130 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_elementValuePairs2133 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs2135 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_Identifier_in_elementValuePair2156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_elementValuePair2158 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_elementValue_in_elementValuePair2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_elementValue2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementValueArrayInitializer_in_elementValue2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_elementValueArrayInitializer2216 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE00142C0L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer2219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_73_in_elementValueArrayInitializer2222 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer2224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_73_in_elementValueArrayInitializer2231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_elementValueArrayInitializer2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_defaultValue2258 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_elementValue_in_defaultValue2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_block2281 = new BitSet(new long[]{0x0007F00000000000L,0x000FD7DFE02160FEL,0x000000000001F8C0L});
    public static final BitSet FOLLOW_blockStatement_in_block2284 = new BitSet(new long[]{0x0007F00000000000L,0x000FD7DFE02160FEL,0x000000000001F8C0L});
    public static final BitSet FOLLOW_71_in_block2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_blockStatement2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement2357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_localVariableDeclarationStatement2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_localVariableDeclaration2379 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration2385 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_variableDeclarators_in_localVariableDeclaration2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifier_in_variableModifiers2422 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_statement2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_statement2452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_parExpression_in_statement2454 = new BitSet(new long[]{0x0007F00000000000L,0x000FD7DFE021607EL,0x000000000001F8C0L});
    public static final BitSet FOLLOW_statement_in_statement2456 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_statement2466 = new BitSet(new long[]{0x0007F00000000000L,0x000FD7DFE021607EL,0x000000000001F8C0L});
    public static final BitSet FOLLOW_else_statement_in_statement2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_statement2504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_statement2506 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0216040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_forControl_in_statement2508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_statement2510 = new BitSet(new long[]{0x0007F00000000000L,0x000FD7DFE021607EL,0x000000000001F8C0L});
    public static final BitSet FOLLOW_statement_in_statement2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_statement2540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_parExpression_in_statement2542 = new BitSet(new long[]{0x0007F00000000000L,0x000FD7DFE021607EL,0x000000000001F8C0L});
    public static final BitSet FOLLOW_statement_in_statement2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_statement2571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_parExpression_in_statement2573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_statement2575 = new BitSet(new long[]{0x0000000000000000L,0x0020080000000080L});
    public static final BitSet FOLLOW_switchBlockStatementGroups_in_statement2577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_statement2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_statement2607 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0016040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_expression_in_statement2610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_statement2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_statement2624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_statement2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_statement2638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_statement2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_statement2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementExpression_in_statement2662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_statement2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_else_statement2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_formalParameter2691 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_type_in_formalParameter2693 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameter2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups2723 = new BitSet(new long[]{0x0000000000000002L,0x0020080000000000L});
    public static final BitSet FOLLOW_switchLabel_in_switchBlockStatementGroup2743 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_107_in_switchBlockStatementGroup2750 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_switchBlockStatementGroup2752 = new BitSet(new long[]{0x0007F00000000002L,0x000FD7DFE021607EL,0x000000000001F8C0L});
    public static final BitSet FOLLOW_blockStatement_in_switchBlockStatementGroup2754 = new BitSet(new long[]{0x0007F00000000002L,0x000FD7DFE021607EL,0x000000000001F8C0L});
    public static final BitSet FOLLOW_117_in_switchLabel2787 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_constantExpression_in_switchLabel2789 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_switchLabel2791 = new BitSet(new long[]{0x0007F00000000000L,0x004FD7DFE021607EL,0x000000000001F8C0L});
    public static final BitSet FOLLOW_blockStatement_in_switchLabel2793 = new BitSet(new long[]{0x0007F00000000000L,0x004FD7DFE021607EL,0x000000000001F8C0L});
    public static final BitSet FOLLOW_118_in_switchLabel2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enhancedForControl_in_forControl2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInit_in_forControl2856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_forControl2859 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0016040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_expression_in_forControl2861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_forControl2864 = new BitSet(new long[]{0x0007F00000000002L,0x000007DFE0214040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_forUpdate_in_forControl2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_enhancedForControl2941 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_type_in_enhancedForControl2943 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_enhancedForControl2945 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_enhancedForControl2947 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_expression_in_enhancedForControl2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forUpdate2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_parExpression2989 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_expression_in_parExpression2992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_parExpression2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList3018 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_expressionList3021 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_expression_in_expressionList3023 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_expression_in_statementExpression3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_constantExpression3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression3090 = new BitSet(new long[]{0x0000000000000000L,0x7F80000000100500L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression3092 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_expression_in_expression3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_assignmentOperator3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_assignmentOperator3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_assignmentOperator3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_assignmentOperator3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_assignmentOperator3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_assignmentOperator3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_assignmentOperator3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_assignmentOperator3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_assignmentOperator3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_assignmentOperator3225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_assignmentOperator3229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_assignmentOperator3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_assignmentOperator3267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_assignmentOperator3271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_assignmentOperator3275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_assignmentOperator3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_assignmentOperator3310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_assignmentOperator3314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_assignmentOperator3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression3347 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_conditionalExpression3351 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression3353 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_conditionalExpression3355 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression3379 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_conditionalOrExpression3383 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression3386 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression3408 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_conditionalAndExpression3412 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression3415 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression3437 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_inclusiveOrExpression3441 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression3444 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression3466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_exclusiveOrExpression3470 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression3473 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression3495 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_andExpression3499 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression3502 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression3524 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_set_in_equalityExpression3528 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression3537 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression3559 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_instanceOfExpression3562 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3586 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000500L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression3590 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3593 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000500L});
    public static final BitSet FOLLOW_72_in_relationalOp3628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_relationalOp3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_relationalOp3662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_relationalOp3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_relationalOp3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_relationalOp3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3718 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000500L});
    public static final BitSet FOLLOW_shiftOp_in_shiftExpression3722 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3725 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000500L});
    public static final BitSet FOLLOW_72_in_shiftOp3756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_shiftOp3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_shiftOp3792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_shiftOp3796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_shiftOp3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_shiftOp3830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_shiftOp3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3864 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_set_in_additiveExpression3868 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3877 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression3905 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3922 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_134_in_unaryExpression3948 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_unaryExpression3960 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_unaryExpression3972 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_unaryExpression3991 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_unaryExpressionNotPlusMinus4029 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_unaryExpressionNotPlusMinus4042 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_unaryExpressionNotPlusMinus4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus4065 = new BitSet(new long[]{0x0000000000000000L,0x0000000010020000L,0x0000000000000800L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus4067 = new BitSet(new long[]{0x0000000000000000L,0x0000000010020000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_unaryExpressionNotPlusMinus4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus4086 = new BitSet(new long[]{0x0000000000000000L,0x0000000010020000L,0x0000000000001000L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus4088 = new BitSet(new long[]{0x0000000000000000L,0x0000000010020000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_unaryExpressionNotPlusMinus4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus4109 = new BitSet(new long[]{0x0000000000000002L,0x0000000010020000L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus4111 = new BitSet(new long[]{0x0000000000000002L,0x0000000010020000L});
    public static final BitSet FOLLOW_78_in_castExpression4131 = new BitSet(new long[]{0x0000000000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_primitiveType_in_castExpression4134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_castExpression4136 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_unaryExpression_in_castExpression4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_castExpression4148 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_type_in_castExpression4151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_expression_in_castExpression4155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_castExpression4158 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_castExpression4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_primary4189 = new BitSet(new long[]{0x0000000000000002L,0x0000000010024000L});
    public static final BitSet FOLLOW_92_in_primary4192 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_primary4194 = new BitSet(new long[]{0x0000000000000002L,0x0000000010024000L});
    public static final BitSet FOLLOW_identifierSuffix_in_primary4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_primary4209 = new BitSet(new long[]{0x0000000000000000L,0x0000000010004000L});
    public static final BitSet FOLLOW_superSuffix_in_primary4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary4221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_primary4231 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0000100L});
    public static final BitSet FOLLOW_creator_in_primary4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_primary4241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_145_in_primary4244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_146_in_primary4246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_arguments_in_primary4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_primary4266 = new BitSet(new long[]{0x0000000000000002L,0x0000000010024000L});
    public static final BitSet FOLLOW_92_in_primary4269 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_primary4271 = new BitSet(new long[]{0x0000000000000002L,0x0000000010024000L});
    public static final BitSet FOLLOW_identifierSuffix_in_primary4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_primary4287 = new BitSet(new long[]{0x0000000000000000L,0x0000000010020000L});
    public static final BitSet FOLLOW_81_in_primary4290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_primary4292 = new BitSet(new long[]{0x0000000000000000L,0x0000000010020000L});
    public static final BitSet FOLLOW_92_in_primary4296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_primary4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_primary4308 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_primary4310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_primary4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_identifierSuffix4332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_identifierSuffix4334 = new BitSet(new long[]{0x0000000000000000L,0x0000000010020000L});
    public static final BitSet FOLLOW_92_in_identifierSuffix4338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_identifierSuffix4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_identifierSuffix4351 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_expression_in_identifierSuffix4353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_identifierSuffix4355 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_identifierSuffix4378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_identifierSuffix4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_identifierSuffix4390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_explicitGenericInvocation_in_identifierSuffix4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_identifierSuffix4402 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_identifierSuffix4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_identifierSuffix4414 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_identifierSuffix4416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_identifierSuffix4428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_identifierSuffix4430 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_innerCreator_in_identifierSuffix4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_creator4451 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0000100L});
    public static final BitSet FOLLOW_createdName_in_creator4453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createdName_in_creator4465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000024000L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_createdName4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_innerCreator4525 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_innerCreator4528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_classCreatorRest_in_innerCreator4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_arrayCreatorRest4549 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0054040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_82_in_arrayCreatorRest4563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_81_in_arrayCreatorRest4566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_arrayCreatorRest4568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest4586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_arrayCreatorRest4588 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_arrayCreatorRest4591 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest4593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_arrayCreatorRest4595 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_arrayCreatorRest4600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_arrayCreatorRest4602 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest4633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_classCreatorRest4636 = new BitSet(new long[]{0x0000000000000000L,0x0000000007E0209FL});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classCreatorRest4637 = new BitSet(new long[]{0x0000000000000000L,0x0000000007E0209FL});
    public static final BitSet FOLLOW_71_in_classCreatorRest4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation4664 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_explicitGenericInvocation4666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_arguments_in_explicitGenericInvocation4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_nonWildcardTypeArguments4691 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_typeList_in_nonWildcardTypeArguments4693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_nonWildcardTypeArguments4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_selector4718 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_selector4720 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_arguments_in_selector4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_selector4733 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_selector4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_selector4745 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_selector4747 = new BitSet(new long[]{0x0000000000000000L,0x0000000010004000L});
    public static final BitSet FOLLOW_superSuffix_in_selector4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_selector4759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_selector4761 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_innerCreator_in_selector4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_selector4773 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_expression_in_selector4775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_selector4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_superSuffix4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_superSuffix4810 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_superSuffix4812 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_arguments_in_superSuffix4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_arguments4834 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE021C040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_expressionList_in_arguments4837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_arguments4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred1_Java212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mainclass_in_synpred2_Java215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred4_Java234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mtype_in_synpred25_Java733 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_synpred25_Java741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_synpred25_Java745 = new BitSet(new long[]{0x0000100000000000L,0x0000001FE0208000L});
    public static final BitSet FOLLOW_formalParameterDecls_in_synpred25_Java747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_synpred25_Java750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_methodBody_in_synpred25_Java754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred73_Java1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred77_Java1908 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_set_in_synpred77_Java1911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_arguments_in_synpred77_Java1919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_synpred77_Java1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_synpred94_Java2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_synpred98_Java2466 = new BitSet(new long[]{0x0007F00000000000L,0x000FD7DFE021607EL,0x000000000001F8C0L});
    public static final BitSet FOLLOW_else_statement_in_synpred98_Java2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchLabel_in_synpred109_Java2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enhancedForControl_in_synpred113_Java2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_synpred117_Java2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_synpred119_Java3090 = new BitSet(new long[]{0x0000000000000000L,0x7F80000000100500L});
    public static final BitSet FOLLOW_assignmentOperator_in_synpred119_Java3092 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_expression_in_synpred119_Java3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred129_Java3215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_synpred129_Java3217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_synpred129_Java3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred130_Java3255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred130_Java3257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred130_Java3259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_synpred130_Java3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred131_Java3300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred131_Java3302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_synpred131_Java3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred142_Java3620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_synpred142_Java3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred143_Java3654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_synpred143_Java3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred146_Java3748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_synpred146_Java3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred147_Java3782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred147_Java3784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred147_Java3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred148_Java3822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred148_Java3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_synpred160_Java4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_synpred162_Java4065 = new BitSet(new long[]{0x0000000000000000L,0x0000000010020000L,0x0000000000000800L});
    public static final BitSet FOLLOW_selector_in_synpred162_Java4067 = new BitSet(new long[]{0x0000000000000000L,0x0000000010020000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_synpred162_Java4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_synpred164_Java4086 = new BitSet(new long[]{0x0000000000000000L,0x0000000010020000L,0x0000000000001000L});
    public static final BitSet FOLLOW_selector_in_synpred164_Java4088 = new BitSet(new long[]{0x0000000000000000L,0x0000000010020000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_synpred164_Java4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred166_Java4131 = new BitSet(new long[]{0x0000000000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_primitiveType_in_synpred166_Java4134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_synpred166_Java4136 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014000L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_unaryExpression_in_synpred166_Java4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred167_Java4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_synpred169_Java4192 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_synpred169_Java4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_synpred170_Java4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_synpred177_Java4269 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_synpred177_Java4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_synpred178_Java4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_synpred184_Java4351 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_expression_in_synpred184_Java4353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_synpred184_Java4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_synpred197_Java4591 = new BitSet(new long[]{0x0007F00000000000L,0x000007DFE0014040L,0x000000000001F8C0L});
    public static final BitSet FOLLOW_expression_in_synpred197_Java4593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_synpred197_Java4595 = new BitSet(new long[]{0x0000000000000002L});

}