grammar Minijava;

goal 
	: (classDeclaration)* mainClass (classDeclaration)* EOF
	;

	
mainClass
	: 'public''class' Identifier '{' 
		(classBody)*  (mainMethod)? (classBody)* 
	'}'
	;

classDeclaration  //other class except mainClass
	: (classOrInterfaceModifier)* 'class' Identifier ( 'extends'Identifier)? '{' 
		(classBody)*
		'}'
	;

classBody
	:varDeclaration';'
	|methodDeclaration
	|conMethod
	;
	
varDeclaration
	: type  initial
	;

initial
	:Identifier ('=' initial_value)? 
	|initial ',' initial
	;

initial_value
    :'{'expression (','expression)* '}'  //array_inital
	|expression
	;	
	
mainMethod
	:'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier')' 
	'{'statement*'}'
	;

conMethod //construct
	:'public' Identifier '(' ( type Identifier ( ',' type Identifier )* )? ')' 
	'{' ( statement )* '}'
	;
	
methodDeclaration
	: (methodModifier)* mtype Identifier '(' ( type Identifier ( ',' type Identifier )* )? ')' 
	'{' ( statement )*'}'
	;

statement
	: varDeclaration ';'
	|'{' ( statement )* '}'
	| 'if' '(' expression ')' statement ('elseif' '(' expression ')' statement)* ('else' statement)?
	| 'while' '(' expression ')' statement
	| 'switch' '('Identifier')' '{'(case_statement)* default_statement'}'
	| 'for' '(' varDeclaration? | expression? ';'expression';'expression ')' statement
	| 'System.out.println' '(' expression ')' ';'
	| Identifier '=' expression ';'  
	| 'this' '.' Identifier '=' expression ';' 
	| Identifier '[' expression ']' '=' expression ';'  //array
	| Identifier '('param')' ';' //void method
	| expression ';'
	| 'return' expression ';'
	;
	
case_statement
	:'case' expression ':' (statement)*
	;

default_statement
	:'default:' (statement)*
	;

		
expression  //value + void method + new Identifier
	:   primary
    |   '('type')' expression
	|   expression '.' Identifier
	|   expression '.' Identifier '(' param ')'
	|   Identifier '(' param ')'  //method return value
    |   expression ('++' | '--')
    |   ('+'|'-'|'++'|'--') expression
    |   ('~'|'!') expression
    |   expression ('*'|'/'|'%') expression
    |   expression ('+'|'-') expression
    |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    |   expression ('<=' | '>=' | '>' | '<'|'='|'!=') expression
    |   expression 'instanceof' type
    |   expression ('==' | '!=') expression
    |   expression '&' expression
    |   expression '^' expression
    |   expression '|' expression
    |   expression '&&' expression
    |   expression '||' expression
    |   expression '?' expression ':' expression
	|	'new' 'int' '[' expression']'
	|	'new' Identifier '(' param ')'
	|	'!' expression
	|	'(' expression ')'
	;
		
array
	:	Identifier '[' expression ']'
	;
	
param
	:	(expression ( ','expression )* )?
	;
		
mtype
	:	type
	|	'void'
	;

primary
    :   '(' expression ')'
    |   'this'
    |   'super'
    |   literal
	|   array
    |   Identifier
    ;
		
type
	: type '[' ']'
	| 'boolean'
	| 'int'
	| 'float'
	| 'double'
	| 'char'
	| 'String'
	| Identifier
	;
	
classOrInterfaceModifier
    : ('public'     // class or interface
    |   'protected'  // class or interface
    |   'private'    // class or interface
    |   'static'     // class or interface
    |   'abstract'   // class or interface
    |   'final'      // class only -- does not apply to interfaces
    |   'strictfp'   // class or interface
    )
    ;

methodModifier
    : ('public'     // class or interface
    |   'protected'  // class or interface
    |   'private'    // class or interface
    |   'static'     // class or interface
    |   'abstract'   // class or interface
    |   'final'      // class only -- does not apply to interfaces
    |   'strictfp'   // class or interface
    )
    ;
		
literal
    : Digit
	| HDigit
	| FDigit
	| Boolean
	| Cliteral
	| Sliteral
	| Nullliteral
	;
	

//------------int,float,double
Nullliteral
	:'null'
	;
	
Boolean
	:'true'
	|'false'
	;	
	
Digit
    :[0-9]+
	;
	
HDigit  //16
	: '0' [xX] [0-9a-fA-F]+
	;
	
FDigit
    :   Digit '.' Digit? ExponentPart? [fdFD]?
    |   '.' Digit ExponentPart? [fdFD]?
    |   Digit ExponentPart [fdFD]?
    |   Digit [fdFD]?
    ;
	
fragment
ExponentPart
    :   [eE][+-]? Digit
    ;
//------------char
Cliteral
    : '\''SingleCharacter'\''
    ;

fragment
SingleCharacter
    :   ~['\\]
	|EscapeSequence
    ;
	
//--------------String
Sliteral
    :   '"' (StringCharacter+)? '"'
    ;
	
fragment		
StringCharacter
    :   ~["\\]
	|EscapeSequence
	;
	
fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   OctalEscape
    |   UnicodeEscape
    ;

fragment
OctalEscape
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
ZeroToThree
    :   [0-3]
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
HexDigit
    :   [0-9a-fA-F]
    ;

//------------Identifier
Identifier
	:JavaLetter JavaLetterOrDigit*
	;

fragment	
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierStart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;
	
	
//
// Whitespace and comments
//

WS  
	:  [ \t\r\n\u000C]+ -> skip
	;

COMMENT
    :   '/*' .*? '*/' -> skip
	;	

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;