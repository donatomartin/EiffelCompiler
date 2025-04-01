// Generated with VGen 2.0.0

grammar Grammar;

@header {
	    import compiler.ast.expression.*;
	    import compiler.ast.definition.*;
	    import compiler.ast.statement.*;
	    import compiler.ast.type.*;
	    import compiler.ast.*;
}

program returns[Program ast]
    : name=IDENT globalSection functionCreations+=functionCreation* functionDefinitions+=functionDefinition* run { $ast = new Program($name, $globalSection.ast, $functionCreations, $functionDefinitions, $run.ast); }
	;

globalSection returns[GlobalSection ast]
    : structDefinitions+=structDefinition* varDefinitions+=varDefinition* { $ast = new GlobalSection($structDefinitions, $varDefinitions); }
	;

structDefinition returns[StructDefinition ast]
    : name=IDENT fieldDefinitions+=fieldDefinition* { $ast = new StructDefinition($name, $fieldDefinitions); }
	;

fieldDefinition returns[FieldDefinition ast]
    : name=IDENT type                     { $ast = new FieldDefinition($name, $type.ast); }      
	;

type returns[Type ast]
    :                                     { $ast = new IntType(); }                              
    |                                     { $ast = new RealType(); }                             
    |                                     { $ast = new CharType(); }                             
    | INT_LITERAL type                    { $ast = new ArrayType($INT_LITERAL, $type.ast); }     
    | name=IDENT                          { $ast = new StructType($name); }                      
    |                                     { $ast = new VoidType(); }                             
	;

varDefinition returns[VarDefinition ast]
    : name=IDENT type                     { $ast = new VarDefinition($name, $type.ast); }        
	;

functionCreation returns[FunctionCreation ast]
    : name=IDENT                          { $ast = new FunctionCreation($name); }                
	;

functionDefinition returns[FunctionDefinition ast]
    : name=IDENT parameters+=varDefinition* type? locals+=varDefinition* statements+=statement* { $ast = new FunctionDefinition($name, $parameters, ($type.ctx == null) ? null : $type.ast, $locals, $statements); }
	;

statement returns[Statement ast]
    : expressions+=expression*            { $ast = new Print($expressions); }                    
    | expression                          { $ast = new Read($expression.ast); }                  
    | expression                          { $ast = new Call($expression.ast); }                  
    | left=expression right=expression    { $ast = new Assignment($left.ast, $right.ast); }      
    | expression ifStatements+=statement* elseStatements+=statement* { $ast = new Conditional($expression.ast, $ifStatements, $elseStatements); }
    | fromStatements+=statement* expression loopStatements+=statement* { $ast = new Loop($fromStatements, $expression.ast, $loopStatements); }
    | expression?                         { $ast = new Return(($expression.ctx == null) ? null : $expression.ast); }
	;

expression returns[Expression ast]
    : name=IDENT                          { $ast = new Variable($name); }                        
    | INT_LITERAL                         { $ast = new IntLiteral($INT_LITERAL); }               
    | FLOAT_LITERAL                       { $ast = new RealLiteral($FLOAT_LITERAL); }            
    | CHAR_LITERAL                        { $ast = new CharLiteral($CHAR_LITERAL); }             
    | name=IDENT expressions+=expression* { $ast = new FunctionCall($name, $expressions); }      
    | expression name=IDENT               { $ast = new StructAccess($expression.ast, $name); }   
    | left=expression right=expression    { $ast = new ArrayAccess($left.ast, $right.ast); }     
    | type expression                     { $ast = new Cast($type.ast, $expression.ast); }       
    | left=expression operator=IDENT right=expression { $ast = new ArithmeticBinary($left.ast, $operator, $right.ast); }
    | operator=IDENT expression           { $ast = new ArithmeticUnary($operator, $expression.ast); }
    | left=expression operator=IDENT right=expression { $ast = new LogicBinary($left.ast, $operator, $right.ast); }
    | operator=IDENT expression           { $ast = new LogicUnary($operator, $expression.ast); } 
    | left=expression operator=IDENT right=expression { $ast = new RelationalBinary($left.ast, $operator, $right.ast); }
	;

run returns[Run ast]
    : name=IDENT expressions+=expression* { $ast = new Run($name, $expressions); }               
	;


// ---------------------------------------------------------------
// Tokens

IDENT: [a-zA-Z_][a-zA-Z0-9_]*;
FLOAT_LITERAL: [0-9]+ '.' [0-9]+;
INT_LITERAL: [0-9]+;
CHAR_LITERAL: '\'' ~[\t\r\n] '\'' | '\'\\n\'';
