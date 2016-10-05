grammar Java;

//---------------- Regras de Parse -------------------

start:	pck? imports* dec_classe; 

pck:	PACKAGE ID ('.' ID)* ';' ;

imports: IMPORT ID ('.' ID)* ';' ;

dec_classe: mod_classe? CLASS ID  (EXTENDS ID)? (IMPLEMENTS ID)? corpo_classe?;

mod_classe: (PUBLIC
			|PRIVATE
			|PROTECTED
			|FINAL
			|STATIC
			|ABSTRACT) ;
			

corpo_classe:	'{'dec_main|dec_var|dec_metodo |dec_classe|statement'}';

dec_main: 'public' STATIC VOID 'main' '(''String' '['']' ID  ')' corpo_main?;

corpo_main: 	'{' dec_var| statement '}';

dec_metodo:	MOD_METODO (VOID|TIPO) IDMETODO '(' (TIPO ID (',' TIPO ID)*)? ')' corpo_metodo? ;

corpo_metodo: '{' dec_var|statement  (RETURN expr ';')? '}';

dec_var: 	TIPO ID (',' ID)* ';'
			|atribuir;

atribuir: TIPO ID (',' ID)* OP_ATR (ID|INT|DOUBLE_FLOAT) ';';

statement: (cond_if
		|loop_for
		|loop_while
		|cond_switch
		|escreva
		|IDSTRING '=' expr ';'
		|'{'statement'}'
		|expr);
		
cond_if: IF '(' expr ')' statement (ELSE statement)?;

loop_for: FOR '(''int' ID '=' INT ';' ID('.' 'lenght')? ('<'|'>') (ID|INT) ';' ID('++'|'--') statement;

loop_while: WHILE '(' expr ')' statement ; 

cond_switch: SWITCH '(' expr ')' statement (CASE ID ':' statement BREAK';')* (DEFAULT statement)?;

escreva: 'System' '.' 'out' '.' ('print'|'printf'|'println') '(' ('"' ID* '"'|INT|DOUBLE_FLOAT) ')'';'  ;


expr: ( idexpr OP <assoc=right> idexpr
		|idexpr '.' ID '(' (idexpr (',' idexpr)*)?')'
		|ID_CLASSE IDSTRING '=' NEW TIPO ID '(' ID? ')' ';'
		|idexpr '.' ID
		|idexpr '[' idexpr ']'
		|idexpr '?' idexpr ':' idexpr
		|'!'idexpr
		|idexpr '++'
		|idexpr '--'
		|ID
		|INT
		|DOUBLE_FLOAT );

idexpr: ID
	|INT
	|DOUBLE_FLOAT;
	
	
	
	
// ------------------- TOKENS -------------------------------
				
PACKAGE:	'package';
IMPORT:		'import';
EXTENDS:	'extends';
PUBLIC: 	'public';
PRIVATE:	'private';
STATIC:		'static';
FINAL:		'final';
ABSTRACT:	'abstract';
PROTECTED:	'protected';
IMPLEMENTS:	'implements';
CLASS:		'class';
VOID: 		'void';
NULL: 		'null';
RETURN:		'return';
IF: 		'if';
ELSE: 		'else';
WHILE: 		'while';
FOR: 		'for';
SWITCH: 	'switch';
CASE: 		'case';
BREAK: 		'break';
NEW: 		'new';
DEFAULT: 	'default';
TRY: 		'try';
CATCH:		'catch';
SUPER:		'super';
THIS:		'this';
THROW:		'throw';
DO:			'do';
TRUE: 		'true';
FALSE:		'false';
INSTANCEOF: 'instanceof';



MOD_METODO: ('public'
			|'private'
			|'protected'
			|'static');
			
PONT: (','
	|':'
	|';');			
	
ID	: [A-Za-z_0-9*]*;


IDMETODO:[a-z]*;

TIPO: 	('int'
		|'double'
		|'String'
		|'char'
		|'float'
		|'boolean'
		|'long'
		|'short');
		

INT: '-'?[0-9]+;

STRING: [A-Za-z]+;

DOUBLE_FLOAT: '-'?[0-9]'.'[0.9]+;

OP:	('+'
	|'-'
	|'*'
	|'/'
	|'&&'
	|'||'
	|'>='
	|'<='
	|'>>'
	|'<<'
	|'%'
	|'!='
	|'=='
	|'<'	
	|'>');
	
OP_ATR: ('='
		|'+='
		|'-='
		|'*='
		|'/='
		|'%=');
		
SEPARADOR: ('{'
			|'}'
			|'('
			|')'
			|'['
			|']');

	
WS : [ \t\r\n]+ -> skip ;
