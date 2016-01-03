grammar Java;
options {backtrack=true; memoize=true;output=AST;}

tokens {
    VAL;
	LOC_VAL;
	START;
	CLASS_DECLARATION;
	CLASS_BODY;
	CLASS_MODIFIERS;
	CLASS_NAME;
	MODIFIERS;
	MEMBER_DECLARATION;
	MEMBER_MODIFIER;
	METHOD;
	METHOD_BODY;
	METHOD_NAME;
	TYPE_NAME;
	ASSIGN;
	FOR_BLOCK;
	WHILE_BLOCK;
	IF_BLOCK;
	CONTROL;
	BODY;
	PRINT;
	STATEMENT;
	THEN;
	ELSE;
	METHOD_INPUT;
	ASSIGN;
	INIT;
	UPDATE;
	BREAK;
	CASE;
	DEFAULT;
	SWITCH_BLOCK;
	SWITCH_KEY;
	SWITCH_BODY;
	CASE_KEY;
	CASE_BODY;
	LEFT_INC;
	RIGHT_INC;
	LEFT_DEC;
	RIGHT_DEC;
	MAIN_CLASS;
}

@lexer::members {
  protected boolean assertIsKeyword = true;
}

compilationUnit
    :  classOrInterfaceDeclaration* mainclass? compilation?
    ;
	
compilation
	: classOrInterfaceDeclaration+ compilation?
	| mainclass+ classOrInterfaceDeclaration* {System.out.println("error:multi_main_class");}
	;
	
mainclass
	: 'public' classDeclaration -> ^(MAIN_CLASS classDeclaration)
	;
	
classOrInterfaceDeclaration
    :   classOrInterfaceModifiers classDeclaration -> ^(CLASS_DECLARATION  classOrInterfaceModifiers classDeclaration)
    ;
    
classOrInterfaceModifiers
    :   classOrInterfaceModifier* -> ^(CLASS_MODIFIERS classOrInterfaceModifier*)
    ;

classOrInterfaceModifier
    :   'protected'  
    |   'private'   
    |   'abstract'   
    |   'static'    
    ;

modifiers
    :   modifier* -> ^(MODIFIERS modifier*)
    ;

classDeclaration
    :   'class' classname = Identifier typeParameters?
        '{' classBodyDeclaration* '}'
	->  ^(CLASS_NAME $classname)  ^(CLASS_BODY classBodyDeclaration*)
    ;
    
typeParameters
    :   '<' typeParameter (',' typeParameter)* '>'
    ;

typeParameter
    :   Identifier ('extends' typeBound)?
    ;
        
typeBound
    :   type ('&' type)*
    ;
    
typeList
    :   type (',' type)*
    ;

classBodyDeclaration
    :   ';'
    |   modifiers memberDecl -> ^(MEMBER_DECLARATION modifiers memberDecl)
    ;
    
memberDecl
    :   genericMethodOrConstructorDecl
    |   memberDeclaration
    |   Identifier constructorDeclaratorRest
    |   classDeclaration
    ;
    
memberDeclaration
    :   mtypename = mtype   method_name = Identifier   '(' formalParameterDecls? ')'   methodBody -> ^(TYPE_NAME $mtypename) ^(METHOD_NAME $method_name) ^(METHOD_INPUT formalParameterDecls?) ^(METHOD_BODY methodBody) 
	|	typename = type fieldDeclaration -> ^(TYPE_NAME $typename)^(VAL fieldDeclaration)
    ;

mtype
    :type
	|'void'
	;
	
genericMethodOrConstructorDecl
    :   typeParameters genericMethodOrConstructorRest
    ;
    
genericMethodOrConstructorRest
    :   (type | 'void') Identifier methodDeclaratorRest
    |   Identifier constructorDeclaratorRest
    ;

fieldDeclaration
    :   variableDeclarators ';'!
    ;
    
methodDeclaratorRest
    :   formalParameters ('[' ']')*
        (   methodBody
        |   ';'
        ) 
    ;
    
voidMethodDeclaratorRest
    :   formalParameters ('throws' qualifiedNameList)?
        (   methodBody
        |   ';'
        )
    ;
    
constructorDeclaratorRest
    :   formalParameters ('throws' qualifiedNameList)? constructorBody
    ;

constantDeclarator
    :   Identifier constantDeclaratorRest
    ;
    
variableDeclarators
    :   variableDeclarator (','! variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId (assign^ variableInitializer)? 
    ;

assign	:	'=' ;
    
constantDeclaratorsRest
    :   constantDeclaratorRest (',' constantDeclarator)*
    ;

constantDeclaratorRest
    :   ('[' ']')* '=' variableInitializer
    ;
    
variableDeclaratorId
    :   Identifier ('['']')*
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;
        
arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

modifier
    :   'public'
    |   'protected'
    |   'private'
    |   'static'
    |   'abstract'
    |   'final'
    |   'native'
    |   'synchronized'
    |   'transient'
    |   'volatile'
    |   'strictfp'
    ;

packageOrTypeName
    :   qualifiedName
    ;

typeName
    :   qualifiedName
    ;

type
	:primitiveType ('[]')*
	|classOrInterfaceType ('[]')* 
	;

classOrInterfaceType
	:Identifier typeArguments? ('.' Identifier typeArguments? )*
	;

primitiveType
    :   'boolean'
    |   'char'
    |   'byte'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    ;

variableModifier
    :   'final'
    ;

typeArguments
    :   '<' typeArgument (',' typeArgument)* '>'
    ;
    
typeArgument
    :   type
    |   '?' (('extends' | 'super') type)?
    ;
    
qualifiedNameList
    :   qualifiedName (',' qualifiedName)*
    ;

formalParameters
    :   '(' formalParameterDecls? ')' 
    ;
    
formalParameterDecls
    :   variableModifiers type formalParameterDeclsRest
    ;
    
formalParameterDeclsRest
    :   variableDeclaratorId (','! formalParameterDecls)?
    ;
    
methodBody
    :   block
    ;

constructorBody
    :   '{' explicitConstructorInvocation? blockStatement* '}'
    ;

explicitConstructorInvocation
    :   nonWildcardTypeArguments? ('this' | 'super') arguments ';'
    |   primary '.' nonWildcardTypeArguments? 'super' arguments ';'
    ;


qualifiedName
    :   Identifier ('.' Identifier)*
    ;
    
literal 
    :   integerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   booleanLiteral
    |   'null'
    ;

integerLiteral
    :   HexLiteral
    |   OctalLiteral
    |   DecimalLiteral
    ;

booleanLiteral
    :   'true'
    |   'false'
    ;

elementValuePairs
    :   elementValuePair (',' elementValuePair)*
    ;

elementValuePair
    :   Identifier '=' elementValue
    ;
    
elementValue
    :   conditionalExpression
    |   elementValueArrayInitializer
    ;
    
elementValueArrayInitializer
    :   '{' (elementValue (',' elementValue)*)? (',')? '}'
    ;
    
defaultValue
    :   'default' elementValue
    ;

// STATEMENTS / BLOCKS

block
    :   '{'! blockStatement* '}'!
    ;
    
blockStatement
    :   localVariableDeclarationStatement 
    |   classOrInterfaceDeclaration 
    |   statement
    ;
    
localVariableDeclarationStatement
    :    localVariableDeclaration ';'!
    ;

localVariableDeclaration
    :   variableModifiers type_name = type variableDeclarators
	-> ^(LOC_VAL $type_name variableDeclarators)
    ;
    
variableModifiers
    :   variableModifier*
    ;

statement
    : block  
    |   'if' parExpression statement (options {k=1;}:'else' else_statement)? ->^(IF_BLOCK ^(CONTROL parExpression) ^(THEN statement) ^(ELSE else_statement?))
    |   'for' '(' forControl ')' statement  ->^(FOR_BLOCK ^(CONTROL forControl) ^(BODY statement))
    |   'while' parExpression statement ->^(WHILE_BLOCK ^(CONTROL parExpression) ^(BODY statement))
    |   'switch' parExpression '{' switchBlockStatementGroups '}' ->^(SWITCH_BLOCK ^(SWITCH_KEY parExpression) ^(SWITCH_BODY switchBlockStatementGroups) )
    |   'return'^ expression? ';'!
    |   'break' ';'! 
    |   'continue' ';'!
    |   ';' 
    |   statementExpression ';'!
    ;

else_statement :statement;

formalParameter
    :   variableModifiers type variableDeclaratorId
    ;
        
switchBlockStatementGroups
    :   (switchBlockStatementGroup)*
    ;
	
switchBlockStatementGroup
    : switchLabel+ 
	| 'default' ':' blockStatement*  ->^(DEFAULT blockStatement*)
    ;
    
switchLabel
    :   'case' constantExpression ':' blockStatement* 'break;'->^(CASE ^(CASE_KEY constantExpression) ^(CASE_BODY blockStatement*))  
    ;
    
forControl
options {k=3;} 
    :   enhancedForControl
    |   forInit? ';' expression? ';' forUpdate? ->^(INIT forInit?) ^(CONTROL expression?) ^(UPDATE forUpdate?)
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;
    
enhancedForControl
    :   variableModifiers type Identifier ':' expression
    ;

forUpdate
    :   expressionList
    ;

// EXPRESSIONS

parExpression
    :   '('! expression ')'!
    ;
    
expressionList
    :   expression (',' expression)*
    ;

statementExpression
    :   expression
    ;
    
constantExpression
    :   expression
    ;
    
expression
    :   conditionalExpression assignmentOperator^ expression
	| conditionalExpression 
    ;
    
assignmentOperator
    :   '='
    |   '+='
    |   '-='
    |   '*='
    |   '/='
    |   '&='
    |   '|='
    |   '^='
    |   '%='
    |   ('<' '<' '=')=> t1='<' t2='<' t3='=' 
        { $t1.getLine() == $t2.getLine() &&
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && 
          $t2.getLine() == $t3.getLine() && 
          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() }?
    |   ('>' '>' '>' '=')=> t1='>' t2='>' t3='>' t4='='
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&
          $t2.getLine() == $t3.getLine() && 
          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() &&
          $t3.getLine() == $t4.getLine() && 
          $t3.getCharPositionInLine() + 1 == $t4.getCharPositionInLine() }?
    |   ('>' '>' '=')=> t1='>' t2='>' t3='='
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && 
          $t2.getLine() == $t3.getLine() && 
          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() }?
    ;

conditionalExpression
    :   conditionalOrExpression ( '?' conditionalExpression ':' conditionalExpression )?
    ;

conditionalOrExpression
    :   conditionalAndExpression ( '||'^ conditionalAndExpression )*
    ;

conditionalAndExpression
    :   inclusiveOrExpression ( '&&'^ inclusiveOrExpression )*
    ;

inclusiveOrExpression
    :   exclusiveOrExpression ( '|'^ exclusiveOrExpression )*
    ;

exclusiveOrExpression
    :   andExpression ( '^'^ andExpression )*
    ;

andExpression
    :   equalityExpression ( '&'^ equalityExpression )*
    ;

equalityExpression
    :   instanceOfExpression ( ('==' | '!=')^ instanceOfExpression )*
    ;

instanceOfExpression
    :   relationalExpression ('instanceof'^ type)?
    ;

relationalExpression
    :   shiftExpression ( relationalOp^ shiftExpression )*
    ;
    
relationalOp
    :   ('<' '=')=> t1='<' t2='=' 
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() }?
    |   ('>' '=')=> t1='>' t2='=' 
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() }?
    |   '<' 
    |   '>' 
    ;

shiftExpression
    :   additiveExpression ( shiftOp^ additiveExpression )*
    ;

shiftOp
    :   ('<' '<')=> t1='<' t2='<' 
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() }?
    |   ('>' '>' '>')=> t1='>' t2='>' t3='>' 
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&
          $t2.getLine() == $t3.getLine() && 
          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() }?
    |   ('>' '>')=> t1='>' t2='>'
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() }?
    ;


additiveExpression
    :   multiplicativeExpression ( ('+' | '-')^ multiplicativeExpression )*
    ;

multiplicativeExpression
    :   a=unaryExpression ( ( '*' | '/' | '%' )^ b=unaryExpression )*
    ;
    
unaryExpression
    :   '+' unaryExpression
    |   '-' unaryExpression
    |   '++' unaryExpression ->^(LEFT_INC unaryExpression)
    |   '--' unaryExpression ->^(LEFT_DEC unaryExpression)
    |   unaryExpressionNotPlusMinus
    ;

unaryExpressionNotPlusMinus
    :   '~'^ unaryExpression
    |   '!'^ unaryExpression
    |   castExpression
    |   primary selector* '++'  ->^(RIGHT_INC primary selector*)
	|	primary selector* '--'  ->^(RIGHT_DEC primary selector*)
	|   primary selector* 
    ;

castExpression
    :  '('! primitiveType ')'! unaryExpression
    |  '(' (type | expression) ')' unaryExpressionNotPlusMinus
    ;

primary
    :   parExpression
    |   'this' ('.' Identifier)* identifierSuffix?
    |   'super' superSuffix
    |   literal
    |   'new' creator
    |	'System.out.' ('println'|'print') arguments ->^(PRINT arguments)
    |   Identifier ('.' Identifier)* identifierSuffix? 
    |   primitiveType ('[' ']')* '.' 'class'
    |   'void' '.' 'class'
    ;

identifierSuffix
    :   ('[' ']')+ '.' 'class'
    |   ('[' expression ']')+ // can also be matched by selector, but do here
    |   arguments
    |   '.' 'class'
    |   '.' explicitGenericInvocation
    |   '.' 'this'
    |   '.' 'super' arguments
    |   '.' 'new' innerCreator
    ;

creator
    :   nonWildcardTypeArguments createdName classCreatorRest
    |   createdName (arrayCreatorRest | classCreatorRest)
    ;

createdName
    :   classOrInterfaceType
    |   primitiveType
    ;
    
innerCreator
    :   nonWildcardTypeArguments? Identifier classCreatorRest
    ;

arrayCreatorRest
    :   '['
        (   ']' ('[' ']')* arrayInitializer
        |   expression ']' ('[' expression ']')* ('[' ']')*
        )
    ;

classCreatorRest
    :   arguments ('{'classBodyDeclaration*'}')?
    ;
    
explicitGenericInvocation
    :   nonWildcardTypeArguments Identifier arguments
    ;
    
nonWildcardTypeArguments
    :   '<' typeList '>'
    ;
    
selector
    :   '.' Identifier arguments?
    |   '.' 'this'
    |   '.' 'super' superSuffix
    |   '.' 'new' innerCreator
    |   '[' expression ']'
    ;
    
superSuffix
    :   arguments
    |   '.' Identifier arguments?
    ;

arguments
    :   '('! expressionList? ')'!
    ;

// LEXER

HexLiteral : '0' ('x'|'X') HexDigit+ IntegerTypeSuffix? ;

DecimalLiteral : ('0' | '1'..'9' '0'..'9'*) IntegerTypeSuffix? ;

OctalLiteral : '0' ('0'..'7')+ IntegerTypeSuffix? ;

fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
IntegerTypeSuffix : ('l'|'L') ;

FloatingPointLiteral
    :   ('0'..'9')+ '.' ('0'..'9')* Exponent? FloatTypeSuffix?
    |   '.' ('0'..'9')+ Exponent? FloatTypeSuffix?
    |   ('0'..'9')+ Exponent FloatTypeSuffix?
    |   ('0'..'9')+ FloatTypeSuffix
    ;

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;

CharacterLiteral
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

StringLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
    
ASSERT
    :   'assert' {if (!assertIsKeyword) $type=Identifier;}
    ;
    
Identifier 
    :   Letter (Letter|JavaIDDigit)*
    ;

/**I found this char range in JavaCC's grammar, but Letter and Digit overlap.
   Still works, but...
 */
fragment
Letter
    :  '\u0024' |
       '\u0041'..'\u005a' |
       '\u005f' |
       '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' |
       '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' |
       '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' |
       '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' |
       '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;

fragment
JavaIDDigit
    :  '\u0030'..'\u0039' |
       '\u0660'..'\u0669' |
       '\u06f0'..'\u06f9' |
       '\u0966'..'\u096f' |
       '\u09e6'..'\u09ef' |
       '\u0a66'..'\u0a6f' |
       '\u0ae6'..'\u0aef' |
       '\u0b66'..'\u0b6f' |
       '\u0be7'..'\u0bef' |
       '\u0c66'..'\u0c6f' |
       '\u0ce6'..'\u0cef' |
       '\u0d66'..'\u0d6f' |
       '\u0e50'..'\u0e59' |
       '\u0ed0'..'\u0ed9' |
       '\u1040'..'\u1049'
   ;

WS  :  (' '|'\r'|'\t'|'\u000C'|'\n')+ {$channel=HIDDEN;}
    ;

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;