
/** Taken from "The Definitive ANTLR 4 Reference" by Terence Parr */

// Derived from http://json.org
grammar JSON;

json
   : value EOF
   ;

obj
   : '{' pair (',' pair)* '}'
   | '{' '}'
   | '{' helperOrPair (',' helperOrPair)* '}'
//   | '{' pair (',' objPair)* '}'
   ;


helperOrPair
    : pair
    | helperPair
    ;

pair
   : STRING ':' pairValue
   ;

helperPair
    : START_HELPER_BLOCK_2 helperIncompleteObj ELSE_BLOCK_2 helperIncompleteObj END_HELPER_BLOCK_2
    | START_HELPER_BLOCK_2 helperIncompleteObj END_HELPER_BLOCK_2
    ;

helperIncompleteObj
    : helperOrPair (',' helperOrPair)*
    ;

pairValue
    : helper
    | value
    ;

arr
   : '[' (helper)+ ']'
   | '[' value (',' value)* ']'
   | '[' ']'
   ;

helper
    : START_HELPER_BLOCK_2 (value | helper)+ ELSE_BLOCK_2 (value | helper)+ END_HELPER_BLOCK_2
    | START_HELPER_BLOCK_2 (value | helper)+ END_HELPER_BLOCK_2
    ;



// TODO try later to include helper inside value
value
   : STRING
   | NUMBER
   | obj
   | arr
   | 'true'
   | 'false'
   | 'null'
   | TEMPLATE_HELPER
   ;

TEMPLATE_HELPER
    : L_CURLY_3 'template' (SAFECODEPOINT | WS)* R_CURLY_3
    ;

START_HELPER_BLOCK_2
    : L_CURLY_2 '#' (SAFECODEPOINT)+ [WS]* R_CURLY_2
    ;

ELSE_BLOCK_2
    : L_CURLY_2 'else' R_CURLY_2
    ;

END_HELPER_BLOCK_2
    : L_CURLY_2 '/' (SAFECODEPOINT)+ [WS]* R_CURLY_2
    ;

L_CURLY_2
    : '{{'
    ;

R_CURLY_2
    : '}}'
    ;

L_CURLY_3
    : '{{{'
    ;

R_CURLY_3
    : '}}}'
    ;



// TODO define operators with 3 curly braces `{{{`
// Not used
T_EXPRESSION
    : L_CURLY_2 [WS]* (SAFECODEPOINT)+ [WS]* R_CURLY_2
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
