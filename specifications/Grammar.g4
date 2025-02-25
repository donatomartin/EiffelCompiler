grammar Grammar;

import Tokenizer;

// PROGRAM

program
	: 'class' IDENT ';' globalSection? createSection featureDefinition* 'end' run EOF
	;

// GLOBAL

globalSection
  : 'global' (globalTypesSection? globalVarsSection?)
  ;

globalTypesSection
  : 'types' typeDefinition*
  ;

typeDefinition
  : 'deftuple' IDENT 'as' varDefinition* 'end'
  ;

globalVarsSection
  : 'vars' varDefinition*
  ;

// CREATE

createSection
  : 'create' featureCreations
  ;

featureCreations
  : (IDENT ';')*
  ;

featureDefinition
  : 'feature' IDENT ('(' IDENT ':' type (',' IDENT ':' type)* ')')? (':' type)? 'is' localVarsSection? 'do' statement* 'end'
  ;

localVarsSection
  : 'local' varDefinition*
  ;

// RUN

run
  : 'run' IDENT '(' (expression (',' expression)*)? ')' ';'
  ;

// Expression
expression
  : IDENT
	| INT_LITERAL
	| REAL_LITERAL
	| CHAR_LITERAL
	| IDENT '(' (expression (',' expression)*)? ')'
	| left=expression '[' right=expression ']'
	| e=expression '.' IDENT
  | '-' expression
	| '(' expression ')'
	| '!' e=expression
	| 'to' '<' type '>' '(' expression ')'
	| left=expression operator=('*'|'/'|'%') right=expression
	| left=expression operator=('+'|'-') right=expression
	| left=expression operator=('<'|'>'|'<='|'>=') right=expression
	| left=expression operator=('!='|'==') right=expression
	| left=expression 'and' right=expression
	| left=expression 'or' right=expression
	;

// Statement

statement
  : ('print' | 'println') expression ';'
	| 'read' expression ';'
	| e=expression ';'
	| left=expression ':=' right=expression ';'
	| 'if' '(' e=expression ')' '{' ifStatements+=statement* '}' 'else' '{' elseStatements+=statement* '}'
	| 'if' '(' e=expression ')' '{' ifStatements+=statement* '}' 
	| 'while' '(' e=expression ')' '{' loopStatements+=statement* '}'
	| 'return' e=expression ';'
	| 'return' ';'
	;

// VarDefinition

varDefinition
  : IDENT (',' IDENT)* ':' type ';'
  ;

// Type
type
	: 'INTEGER'
	| 'DOUBLE'
	| 'CHARACTER'
	| '[' INT_LITERAL ']' type
	| IDENT
	;
