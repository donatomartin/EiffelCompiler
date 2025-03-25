// Generated with VGen 2.0.0

/**
* Este interfaz es el resultado de la aplicación del patrón Visitor a los nodos del AST.
*/

package compiler.visitor;

import compiler.ast.*;
import compiler.ast.definition.*;
import compiler.ast.statement.*;
import compiler.ast.type.*;
import compiler.ast.expression.*;




public interface Visitor {
	public Object visit(Program program, Object param);

	public Object visit(GlobalSection globalSection, Object param);

	public Object visit(FunctionCreation functionCreation, Object param);

	public Object visit(VarDefinition varDefinition, Object param);

	public Object visit(StructDefinition structDefinition, Object param);

	public Object visit(FunctionDefinition functionDefinition, Object param);

	public Object visit(Parameter parameter, Object param);

	public Object visit(Print print, Object param);

	public Object visit(Read read, Object param);

	public Object visit(Call call, Object param);

	public Object visit(Assignment assignment, Object param);

	public Object visit(Conditional conditional, Object param);

	public Object visit(Loop loop, Object param);

	public Object visit(Return returnValue, Object param);

	public Object visit(Run run, Object param);

	public Object visit(IntType intType, Object param);

	public Object visit(RealType realType, Object param);

	public Object visit(CharType charType, Object param);

	public Object visit(ArrayType arrayType, Object param);

	public Object visit(StructType structType, Object param);

	public Object visit(VoidType voidType, Object param);

	public Object visit(Variable variable, Object param);

	public Object visit(IntLiteral intLiteral, Object param);

	public Object visit(RealLiteral realLiteral, Object param);

	public Object visit(CharLiteral charLiteral, Object param);

	public Object visit(FunctionCall functionCall, Object param);

	public Object visit(StructAccess structAccess, Object param);

	public Object visit(ArrayAccess arrayAccess, Object param);

	public Object visit(Cast cast, Object param);

	public Object visit(ArithmeticBinary arithmeticBinary, Object param);

	public Object visit(ArithmeticUnary arithmeticUnary, Object param);

	public Object visit(LogicBinary logicBinary, Object param);

	public Object visit(LogicUnary logicUnary, Object param);


}
