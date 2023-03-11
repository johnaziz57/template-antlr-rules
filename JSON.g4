
/** Taken from "The Definitive ANTLR 4 Reference" by Terence Parr */

// Derived from http://json.org
grammar JSON;

json
   : value EOF
   ;

obj
   : '{' pair (',' pair)* '}'
   | '{' '}'
   | '{' objExtended '}'
   | '{' pair (',' objExtended)* '}'
   ;


objExtended
    : pair
    | templateOperatorExpression
    ;

pair
   : STRING ':' value
   ;

arr
   : '[' value (',' value)* ']'
   | '[' ']'
   ;

templateOperatorExpression
    : START_BLOCK_2 value END_BLOCK_2
    | START_BLOCK_2 pair END_BLOCK_2
    ;

value
   : templateOperatorExpression
   | T_EXPRESSION
   | STRING
   | NUMBER
   | obj
   | arr
   | 'true'
   | 'false'
   | 'null'
   ;

START_BLOCK_2
    : L_OPERATOR_2 '#' (SAFECODEPOINT)+ [WS]* R_OPERATOR_2
    ;

END_BLOCK_2
    : L_OPERATOR_2 '/' (SAFECODEPOINT)+ [WS]* R_OPERATOR_2
    ;

L_OPERATOR_2
    : '{{'
    ;

R_OPERATOR_2
    : '}}'
    ;

// TODO define operators with 3 curly braces `{{{`

T_EXPRESSION
    : L_OPERATOR_2 [WS]* (SAFECODEPOINT)+ [WS]* R_OPERATOR_2
    ;

STRING
   : '"' (ESC | SAFECODEPOINT)* '"'
   ;



fragment ESC
   : '\\' (["\\/bfnrt] | UNICODE)
   ;


fragment UNICODE
   : 'u' HEX HEX HEX HEX
   ;


fragment HEX
   : [0-9a-fA-F]
   ;


fragment SAFECODEPOINT
   : ~ ["\\\u0000-\u001F]
   ;


NUMBER
   : '-'? INT ('.' [0-9] +)? EXP?
   ;


fragment INT
   : '0' | [1-9] [0-9]*
   ;

// no leading zeros

fragment EXP
   : [Ee] [+\-]? INT
   ;

// \- since - means "range" inside [...]

WS
   : [ \t\n\r] + -> skip
   ;
