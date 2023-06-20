
/** Taken from "The Definitive ANTLR 4 Reference" by Terence Parr */

// Derived from http://json.org
grammar JSON;

json
   : value EOF
   ;

obj
// TODO enforce if a helper and next is pair, it should handle `,` is
   : '{' helperOrPair (','? helperOrPair)* '}'
   | '{' pair (',' pair)* '}'
   | '{' '}'
   ;


helperOrPair
    : pair
    | helperPair
    ;

pair
   : STRING ':' pairValue
   ;

helperPair
    : START_HELPER_BLOCK_2 ','? helperIncompleteObj ','? ELSE_BLOCK_2 ','? helperIncompleteObj ','? END_HELPER_BLOCK_2
    | START_HELPER_BLOCK_2 ','? helperIncompleteObj ','? END_HELPER_BLOCK_2
    ;

helperIncompleteObj
    : helperOrPair (','? helperOrPair)*
    ;

pairValue
    : value
    | helper
    ;

arr
   : '[' helperOrValue (','? helperOrValue)*  ']'
   | '[' ']'
   ;

helperOrValue
    : value
    | helper
    ;
//TODO define special unless helper
//TODO nested if else(s)
helper
    : START_HELPER_BLOCK_2 (','? (value | helper))* ','? (ELSE_BLOCK_2 (','? (value | helper))* ','?)* END_HELPER_BLOCK_2
    ;

value
   : STRING
   | NUMBER
   | obj
   | arr
   | 'true'
   | 'false'
   | 'null'
   | ONE_CLAUSE_HELPER
   | TEMPLATE_HELPER
   ;

TEMPLATE_HELPER
    : L_CURLY_3 'template' (WS|SAFE_HELPER_CODE_POINT)* R_CURLY_3
    ;

ONE_CLAUSE_HELPER
    : L_CURLY_2 HELPER_NAME WS (SAFE_HELPER_CODE_POINT | WS)+ R_CURLY_2
    | L_CURLY_3 SAFE_HELPER_CODE_POINT (SAFE_HELPER_CODE_POINT | WS)* R_CURLY_3
    ;

START_HELPER_BLOCK_2
    : L_CURLY_2 '#' (SAFE_HELPER_CODE_POINT)+ (WS)* (SAFE_HELPER_CODE_POINT | WS)* R_CURLY_2
    ;

ELSE_BLOCK_2
    : L_CURLY_2 'else' R_CURLY_2
    | L_CURLY_2 'else' WS+ 'if' WS+
    (SAFE_HELPER_CODE_POINT | WS)* R_CURLY_2
    ;

END_HELPER_BLOCK_2
    : L_CURLY_2 '/' (SAFE_HELPER_CODE_POINT)+ R_CURLY_2
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
   : '"' (ESC | SAFE_CODE_POINT)* '"'
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

HELPER_NAME
    : 'math'
    ;

fragment SAFE_HELPER_CODE_POINT
    : [a-zA-Z0-9]  | '(' | ')' | '.' | '\\' | '|'
    | '+' | '"' | '=' | '_' | '@' | '[' | ']'
    | '-' | '\'' | ':' | '/' | ',' | ';' |'%'
    | '<' | '>'
    ;

fragment SAFE_CODE_POINT
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
