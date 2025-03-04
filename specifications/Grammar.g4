grammar Grammar;

import Tokenizer;

// PROGRAM

program returns [Program ast]
	: 'class' IDENT ';' globalSection? createSection featureDefinitions+=featureDefinition* 'end' run EOF
  {$ast = new Program($IDENT, $globalSection.ast, $createSection.list, $featureDefinitions, $run.ast); }
	;

// GLOBAL

globalSection returns [GlobalSection ast]
  : 'global' (globalTypesSection? globalVarsSection?) { $ast = new GlobalSection($globalTypesSection.list, $globalVarsSection.list); }
  ;

globalTypesSection returns [List<StructDefinition> list = new ArrayList<StructDefinition>()]
  : 'types' (typeDefinition { $list.add($typeDefinition.ast)}; )*
  ;

typeDefinition returns [StructDefinition ast]
  : 'deftuple' IDENT 'as' varDefinitions 'end' { $ast = new StructDefinition($IDENT, $varDefinitions.list); }
  ;

globalVarsSection returns [List<VarDefinition> list = new ArrayList<VarDefinition>()]
  : 'vars' varDefinitions { $list = $varDefinitions.list; }
  ;

// CREATE

createSection returns [List<FunctionDefinition> list = new ArrayList<FunctionCreation>()]
  : 'create' featureCreations { $list = featureCreations.list; }
  ;

featureCreations returns [List<FunctionDefinition> list = new ArrayList<FunctionCreation>()]
  : (IDENT { $list.add(new FunctionCreation($IDENT)); } ';')*
  ;

featureDefinition returns [FunctionDefinition ast]
  : 'feature' IDENT  (':' type)? 'is' localVarsSection? 'do' statement* 'end'
  { $ast = new FunctionDefinition($IDENT) }
  ;

localVarsSection returns [List<VarDefinition> list = new ArrayList<VarDefition>()]
  : 'local' varDefinitions { $list = varDefinitions.list; }
  ;

parameters returns [List<Parameter> list = new ArrayList<Parameter>()]
  : ('(' i1=IDENT ':' t1=type { $list.add(new Parameter($i1.getText(), $t1.ast)); } (',' i2=IDENT ':' t2=type { $list.add(new Parameter($i2.getText(), $t2.ast)); } )* ')')?
  ;

// VarDefinition

varDefinitions returns [List<VarDefinition> list = new ArrayList<VarDefinition>()]
    : (varDefinition ';' { $list.add($varDef.ast); })*
    ;

varDefinition returns [VarDefinition ast]
    : ids+=IDENT (',' ids+=IDENT)* ':' type 
      { 
          List<String> variableNames = new ArrayList<>();
          for (Token id : $ids) {
              variableNames.add(id.getText());
          }
          $ast = new VarDefinition(variableNames, $type.ast); 
      }
    ;

run returns [Run ast]
  : 'run' IDENT '(' arguments ')' ';' { $ast = new Run($IDENT, arguments.list); }
  ;

// Expression
expression returns [Expression ast]
  : IDENT { $ast = new Variable($IDENT); }
	| INT_LITERAL { $ast = new IntLiteral($INT_LITERAL); }
	| REAL_LITERAL { $ast = new RealLiteral($REAL_LITERAL); }
	| CHAR_LITERAL { $ast = new CharLiteral($CHAR_LITERAL); }
	| IDENT '(' arguments ')' { $ast = new FunctionCall($IDENT, $arguments.list); }
	| left=expression '[' right=expression ']' { $ast = new ArrayAccess($left.ast, $right.ast); }
	| e=expression '.' IDENT { $ast = new StructAccess($e.ast, $IDENT); }
  | operator='-' e=expression { $ast = new ArithmeticUnary($operator, $e.ast); }
	| '(' e=expression ')' { $ast = $e.ast; }
	| opeartor='!' e=expression { $ast = new LogicUnary($operator, $e.ast); }
	| 'to' '<' type '>' '(' expression ')' { $ast = new Cast($type.ast, $expression.ast); }
	| left=expression operator=('*'|'/'|'%') right=expression { $ast = new ArithmeticBinary($left.ast, $operator, $right.ast); }
	| left=expression operator=('+'|'-') right=expression { $ast = new ArithmeticBinary($left.ast, $operator, $right.ast); }
	| left=expression operator=('<'|'>'|'<='|'>=') right=expression { $ast = new LogicBinary($left.ast, $operator, $right.ast); }
	| left=expression operator=('!='|'==') right=expression { $ast = new LogicBinary($left.ast, $operator, $right.ast); }
	| left=expression 'and' right=expression { $ast = new LogicBinary($left.ast, $operator, $right.ast); }
	| left=expression 'or' right=expression { $ast = new LogicBinary($left.ast, $operator, $right.ast); }
	;

arguments returns [List<Expression> list = new ArrayList<Expression>()]
  : (e1=expression { $list.add($e1.ast); } (',' e2=expression { $list.add($e2.ast); } )*)?
  ;

// Statement

statement returns [Statement ast]
  : ('print' | 'println') expression ';' { $ast = new Print($expression.ast); }
	| 'read' expression ';' { $ast = new Read($expression.ast); }
	| e=expression ';' { $ast = new Call($e.ast); }
	| left=expression ':=' right=expression ';' { $ast = new Assignment($left.ast, $right.ast); }
	| 'if' '(' e=expression ')' '{' ifStatements+=statement* '}' 'else' '{' elseStatements+=statement* '}'  { $ast = new Conditional($e.ast, $ifStatements, $elseStatements); }
	| 'if' '(' e=expression ')' '{' ifStatements+=statement* '}' { $ast = new Conditional($e.ast, $ifStatements, null); }
	| 'while' '(' e=expression ')' '{' loopStatements+=statement* '}' { $ast = new While($e.ast, $loopStatements); }
	| 'return' e=expression ';' { $ast = new Return($e.ast); }
	| 'return' ';' { $ast = new Return(null); }
	;

// Type
type returns [Type ast]
	: 'INTEGER' { $ast = new IntType(); }
	| 'REAL' { $ast = new RealType(); }
	| 'CHARACTER' { $ast = new CharType(); }
	| '[' INT_LITERAL ']' type { $ast = new ArrayType($INT_LITERAL, $type.ast); }
	| IDENT { $ast = new StructType($IDENT); }
	;
