grammar ilq;

options
{
  language=CSharp3;     
  output=AST; 
}

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
    
OPEN_BRACKET 
	:	'[';
CLOSED_BRACKET
	:	']';
OPEN_PAR
	:	'{';
CLOSED_PAR
	:	'}';

constant_values
	: 	STRING | INT | FLOAT | 'null' | 'false' | 'true' | ID^ '('! constant_values ')'!
	;

comparison_operator
	:	'$eq' | '$gt' | '$gte' | '$in' | '$lt' | '$lte' | '$ne' | '$nin'
	;

aux_operator
	:	'$options'	
	;
	
logical_operator
	:	'$and' | '$not' | '$nor' | '$or'
	;

evaluation_operator
	:	'$regex'
	;

comparison_exp
	:	OPEN_PAR! comparison_operator^ ':'! (constant_values | bracket_exp) CLOSED_PAR!
	;
	
logical_exp
	:	OPEN_PAR! logical_operator^ ':'! bracket_exp CLOSED_PAR!
	;

evaluation_exp
	:	OPEN_PAR! evaluation_operator^ ':'! STRING CLOSED_PAR!
	;

property_exp
	:	OPEN_PAR! (ID | STRING)^ ':'!  exp_term CLOSED_PAR!
	;

bracket_exp
	: OPEN_BRACKET! exp_term (','! exp_term)* CLOSED_BRACKET!
	;
	
comma_exp
	:	
	;

exp_term
	:	property_exp
	|	comparison_exp
	|	logical_exp
	|	evaluation_exp
	|	STRING | ID | FLOAT | INT | bracket_exp
	;

exp
	: 
	| property_exp
	| logical_exp
	;

start_rule
	:	exp;
