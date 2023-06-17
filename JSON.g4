
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
    : value
    | helper
    ;

arr
   : '[' value (',' value)* ']'
   | '[' ']'
   | '[' (helperOrValue)+ ']'
   ;

helperOrValue
    : value
    | helper
    ;
//TODO define special unless helper
//TODO nested if else(s)
helper
    : START_HELPER_BLOCK_2 (value | helper)+ ELSE_BLOCK_2 (value | helper)+ END_HELPER_BLOCK_2
    | START_HELPER_BLOCK_2 (value | helper)+ END_HELPER_BLOCK_2
    ;

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
    : L_CURLY_3 'template' (SAFECODEPOINT)* R_CURLY_3
    ;

START_HELPER_BLOCK_2
    : L_CURLY_2 '#' (SAFEHELPERCODE)+ (WS)* (SAFEHELPERCODE | WS)* R_CURLY_2
    ;

ELSE_BLOCK_2
    : L_CURLY_2 'else' R_CURLY_2
    ;

END_HELPER_BLOCK_2
    : L_CURLY_2 '/' (SAFEHELPERCODE)+ R_CURLY_2
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

fragment SAFEHELPERCODE
    : [a-zA-Z0-9]  | '(' | ')' | '.' | '\\' | '|' | '+' | '"' | '=' | '_' | '@' | '[' | ']'
    ;

fragment SAFECODEPOINT
   : ~ ["\\\u0000-\u001F]
   ;


NUMBER
   : '-'? INT ('.' [0-9] +)? EXP?
   ;


fragment INT
   // integer part forbis leading 0s (e.g. `01`)
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
