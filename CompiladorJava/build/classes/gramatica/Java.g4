grammar Java;

//---------------- Regras de Parse -------------------

start:	pck? imports* dec_classe; 

pck:	PACKAGE nomes ;

imports: IMPORT nomes ;

nomes: ID ('.' ID)* ';';

dec_classe: mod_classe? CLASS identificador (EXTENDS identificador)? (IMPLEMENTS identificador)? corpo_classe?;

identificador: ID;

dec_met_main: mod_classe STATIC VOID identificador param corpo_classe ;

param : '('dec_var_main ')';

mod_classe: (PUBLIC
			|PRIVATE
			|PROTECTED
			|FINAL
			|STATIC
			|ABSTRACT) ;
			

corpo_classe:	'{' dec_corpo_classe* '}';

dec_corpo_classe: dec_metodo|dec_classe|bloco ;

corpo_main: 	'{' dec_var| bloco '}';

dec_metodo:	mod_metodo (VOID|tipo) identificador '(' (tipo identificador (',' tipo identificador)*)? ')' corpo_metodo?
                |dec_met_main ;

mod_metodo: ('PUBLIC'
             |'PRIVATE'
             |'PROTECTED'
             |'STATIC');

corpo_metodo: '{' dec_var|bloco  (RETURN expr ';')? '}';

dec_var: 	tipo identificador (',' identificador)* ';'
                |tipo identificador ('['']')*';'
		|expr;

dec_var_main: tipo identificador ('['']')*
              |tipo ('['']')* identificador  ;

atribuir: tipo identificador (',' identificador)* op_atr (identificador|INT|DOUBLE_FLOAT) ';'
          |tipo identificador op_atr (identificador|INT|DOUBLE_FLOAT) ';'
          |identificador op_atr (identificador|INT|DOUBLE_FLOAT) ';'
          |tipo? identificador op_atr expr  ;

bloco: (dec_var
       | cond_if
       |loop_for
       |loop_while
       |cond_switch
       |saida
       |'{'bloco'}'
       |expr);
		
cond_if: IF '(' expr ')' bloco (ELSE bloco)?;

loop_for: FOR '(''int' identificador '=' INT ';' identificador('.' 'lenght')? ('<'|'>') literal ';' ID('++'|'--') bloco;

loop_while: WHILE '(' expr ')' bloco ; 

cond_switch: SWITCH '(' expr ')' bloco (CASE identificador ':' bloco BREAK';')* (DEFAULT bloco)?;

saida: 'System' '.' OUT '.' tipo_print ';'  ;

tipo_print: print
            |printf;

print:  PRINT|PRINTLN '(' ('"' literal* '"' |literal) (('+' '"' literal* '"'|literal)* )')' ;

printf: PRINTF '(' '"' MASCARA* '"' (',' identificador)*  ')' ;

expr:  expr op_A term ';'?
        |literal '.' identificador '(' (literal (',' literal)*)?')'
	|identificador '=' NEW tipo identificador '(' identificador? ')' ';'
	|literal '.' identificador
	|literal '[' literal ']'
	|literal '?' literal ':' literal
	|'!'literal
	|literal '++'
	|literal '--'
	|identificador
        |term
        |literal
        |atribuir
	|INT
	|DOUBLE_FLOAT ;

term:  literal op_B expr
        |literal ; 

literal: ID
	|INT
	|DOUBLE_FLOAT;
	
tipo: 	INTEIRO
	|DOUBLE
	|STRING
	|CHAR
	|FLOAT
	|BOOLEAN
	|LONG
	|SHORT ;	

op_A: MAIS
    |MENOS
    |E
    |OU
    |MAIOR_IG
    |MENOR_IG
    |DIF
    |IG
    |MAIOR
    |MENOR ;
    
op_B:MULT
    |DIV
    |SHIFTR
    |SHIFTL
    |MOD ;	

op_atr: ATR
        |MAIS_ATR
        |MENOS_ATR
        |MULT_ATR
        |DIV_ATR
        |MOD_ATR ;
	
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
DO:		'do';
TRUE: 		'true';
FALSE:		'false';
INSTANCEOF: 'instanceof';
INTEIRO:        'int';
DOUBLE:         'double';
FLOAT:          'float';
STRING:         'String';
CHAR:           'char';
LONG:           'long';
BOOLEAN:        'boolean';
SHORT:          'short';
PRINT:          'print';
PRINTLN:        'println';
PRINTF:         'printf';
OUT:            'out';
			
PONT: (','
	|':'
	|';');			
	
ID: [A-Za-z_*!]+
    |IDCLASSE
    |IDVAR;

fragment IDCLASSE: [A-Z][a-z]+;

fragment IDVAR: [a-z_]+;
 
TIPO: 	'int'
	|'double'
	|'String'
	|'char'
	|'float'
	|'boolean'
	|'long'
	|'short';

MASCARA: '%d'
         |'%s'
         |'%f' ;

INT: [0-9]*
     |INT_NEG;

fragment INT_NEG : '-'[0-9]* ;

DOUBLE_FLOAT: [0-9]'.'[0.9]*
            |DOUBLE_FLOAT_NEG;

fragment DOUBLE_FLOAT_NEG: '-'[0-9]'.'[0.9]* ;


MAIS:   '+';
MENOS:  '-';
MULT:   '*';
DIV:    '/';
E:      '&&';
OU:     '||';
MAIOR_IG:   '>=';
MENOR_IG:   '<=';
SHIFTR: '>>';
SHIFTL: '<<';
MOD:    '%';
DIF:    '!=';
IG:     '==';
MAIOR:  '>';
MENOR:  '<';

ATR:    '=';
MAIS_ATR: '+=';
MENOS_ATR: '-=';
MULT_ATR: '*=';
DIV_ATR: '/=';
MOD_ATR: '%=';

		
SEPARADOR: ('{'
			|'}'
			|'('
			|')'
			|'['
			|']');

	
WS : [ \t\r\n]+ -> skip ;

COMENTARIO: '/*' .*? '*/' -> skip ;

COMENTARIO_LINHA: '//' ~[\r\n]* -> skip ;