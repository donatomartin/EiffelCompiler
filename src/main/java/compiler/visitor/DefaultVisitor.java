// Generated with VGen 2.0.0

/**
* El objetivo de esta clase DefaultVisitor es ser la implementación base de la que
* deriven todos los demás visitor.
*
* Sus métodos visit recorren los hijos del nodo que se está visitando. Por tanto,
* todo visitor que derive de este ya tendrá implementado todo el código de
* recorrido del AST.
*
* Para crear nuevos visitor, en vez de modificar esta clase, se recomienda copiar
* 'SkeletonForNewVisitors.java' o, mejor aún, definir una nueva PHASE en la gramática
* y usar el visitor generado para la misma.
*/

package compiler.visitor;

import compiler.ast.*;
import compiler.ast.definition.*;
import compiler.ast.statement.*;
import compiler.ast.type.*;
import compiler.ast.expression.*;




public class DefaultVisitor implements Visitor {
	@Override
	public Object visit(Program program, Object param) {

		program.getGlobalSection().accept(this, param);
		program.getFunctionCreations().forEach(functionCreation -> functionCreation.accept(this, param));
		program.getFunctionDefinitions().forEach(functionDefinition -> functionDefinition.accept(this, param));
		program.getRun().accept(this, param);
		return null;
	}

	@Override
	public Object visit(GlobalSection globalSection, Object param) {

		globalSection.getStructDefinitions().forEach(structDefinition -> structDefinition.accept(this, param));
		globalSection.getVarDefinitions().forEach(varDefinition -> varDefinition.accept(this, param));
		return null;
	}

	@Override
	public Object visit(FunctionCreation functionCreation, Object param) {

		return null;
	}

	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		varDefinition.getType().accept(this, param);
		return null;
	}

	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		structDefinition.getFieldDefinitions().forEach(fieldDefinition -> fieldDefinition.accept(this, param));
		return null;
	}

	@Override
	public Object visit(FieldDefinition fieldDefinition, Object param) {

		fieldDefinition.getType().accept(this, param);
		return null;
	}

	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		functionDefinition.getParameters().forEach(varDefinition -> varDefinition.accept(this, param));
		functionDefinition.getType().ifPresent(type -> type.accept(this, param));
		functionDefinition.getLocals().forEach(varDefinition -> varDefinition.accept(this, param));
		functionDefinition.getStatements().forEach(statement -> statement.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Print print, Object param) {

		print.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Read read, Object param) {

		read.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(FunctionCallStatement functionCallStatement, Object param) {

		functionCallStatement.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Assignment assignment, Object param) {

		assignment.getLeft().accept(this, param);
		assignment.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Conditional conditional, Object param) {

		conditional.getExpression().accept(this, param);
		conditional.getIfStatements().forEach(statement -> statement.accept(this, param));
		conditional.getElseStatements().forEach(statement -> statement.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Loop loop, Object param) {

		loop.getFromStatements().forEach(statement -> statement.accept(this, param));
		loop.getExpression().accept(this, param);
		loop.getLoopStatements().forEach(statement -> statement.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Return returnValue, Object param) {

		returnValue.getExpression().ifPresent(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Run run, Object param) {

		run.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(IntType intType, Object param) {

		return null;
	}

	@Override
	public Object visit(RealType realType, Object param) {

		return null;
	}

	@Override
	public Object visit(CharType charType, Object param) {

		return null;
	}

	@Override
	public Object visit(ArrayType arrayType, Object param) {

		arrayType.getType().accept(this, param);
		return null;
	}

	@Override
	public Object visit(StructType structType, Object param) {

		return null;
	}

	@Override
	public Object visit(VoidType voidType, Object param) {

		return null;
	}

	@Override
	public Object visit(Variable variable, Object param) {

		return null;
	}

	@Override
	public Object visit(IntLiteral intLiteral, Object param) {

		return null;
	}

	@Override
	public Object visit(RealLiteral realLiteral, Object param) {

		return null;
	}

	@Override
	public Object visit(CharLiteral charLiteral, Object param) {

		return null;
	}

	@Override
	public Object visit(FunctionCallExpression functionCallExpression, Object param) {

		functionCallExpression.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(StructAccess structAccess, Object param) {

		structAccess.getExpr().accept(this, param);
		return null;
	}

	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		arrayAccess.getLeft().accept(this, param);
		arrayAccess.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Cast cast, Object param) {

		cast.getCastType().accept(this, param);
		cast.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(ArithmeticBinary arithmeticBinary, Object param) {

		arithmeticBinary.getLeft().accept(this, param);
		arithmeticBinary.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(ArithmeticUnary arithmeticUnary, Object param) {

		arithmeticUnary.getExpr().accept(this, param);
		return null;
	}

	@Override
	public Object visit(LogicBinary logicBinary, Object param) {

		logicBinary.getLeft().accept(this, param);
		logicBinary.getRight().accept(this, param);
		return null;
	}

	@Override
	public Object visit(LogicUnary logicUnary, Object param) {

		logicUnary.getExpr().accept(this, param);
		return null;
	}

	@Override
	public Object visit(RelationalBinary relationalBinary, Object param) {

		relationalBinary.getLeft().accept(this, param);
		relationalBinary.getRight().accept(this, param);
		return null;
	}


}
