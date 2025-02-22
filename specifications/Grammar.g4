grammar Grammar;

import Tokenizer;

program
	: 'class' IDENT ';' global? create featureDefinition* run EOF
	;

global
  : 'global' types vars
  ;

create
  : 'create' 
  ;

featureDefinition
  : 
  ;

run
  : 'run' IDENT '(' '')'
  ;
