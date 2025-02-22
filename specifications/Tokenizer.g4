lexer grammar Tokenizer;

INT_LITERAL
	: [0-9]+
	;

LINE_COMMENT
	: '/*' .*? ('\n' | EOF) -> skip
	;

REAL_CONSTANT
	:[0-9]+ '.' [0-9]+
	;

MULTILINE_COMMENT
	: '//*' .*? '*//' -> skip
	;

WHITESPACE
	: [ \t\r\n]+ -> skip
	;
	
CHAR_CONSTANT
	:'\'' ~[\t\r\n] '\''
	|'\'\\n\''
  ;
	
IDENT
	:[a-zA-Z][a-zA-Z0-9_]*
	;
