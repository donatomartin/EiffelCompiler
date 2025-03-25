package compiler.semantic;

import compiler.ErrorManager;
import compiler.ast.*;
import compiler.ast.definition.*;
import compiler.ast.expression.*;
import compiler.ast.statement.*;
import compiler.ast.type.*;
import compiler.visitor.DefaultVisitor;

public class Identification extends DefaultVisitor {

  public Identification(ErrorManager errorManager) {}

  public void process(AST ast) {
    ast.accept(this, null);
  }

  // Visit Methods --------------------------------------------------------------

  // class Program(String name, GlobalSection globalSection, List<FunctionCreation>
  // functionCreations, List<FunctionDefinition> functionDefinitions, Run run)
  @Override
  public Object visit(Program program, Object param) {

    // program.getGlobalSection().accept(this, param);
    // program.getFunctionCreations().forEach(functionCreation -> functionCreation.accept(this,
    // param));
    // program.getFunctionDefinitions().forEach(functionDefinition ->
    // functionDefinition.accept(this, param));
    // program.getRun().accept(this, param);
    super.visit(program, param);

    return null;
  }

  // class GlobalSection(List<StructDefinition> structDefinitions, List<VarDefinition>
  // varDefinitions)
  @Override
  public Object visit(GlobalSection globalSection, Object param) {

    // globalSection.getStructDefinitions().forEach(structDefinition ->
    // structDefinition.accept(this, param));
    // globalSection.getVarDefinitions().forEach(varDefinition -> varDefinition.accept(this,
    // param));
    super.visit(globalSection, param);

    return null;
  }

  // class FunctionCreation(String name)
  @Override
  public Object visit(FunctionCreation functionCreation, Object param) {

    return null;
  }

  // class VarDefinition(List<String> strings, Type type)
  @Override
  public Object visit(VarDefinition varDefinition, Object param) {

    // varDefinition.getType().accept(this, param);
    super.visit(varDefinition, param);

    return null;
  }

  // class StructDefinition(String name, List<VarDefinition> varDefinitions)
  @Override
  public Object visit(StructDefinition structDefinition, Object param) {

    // structDefinition.getVarDefinitions().forEach(varDefinition -> varDefinition.accept(this,
    // param));
    super.visit(structDefinition, param);

    return null;
  }

  // class FunctionDefinition(String name, List<Parameter> parameters, Optional<Type> type,
  // List<Definition> definitions, List<Statement> statements)
  @Override
  public Object visit(FunctionDefinition functionDefinition, Object param) {

    // functionDefinition.getParameters().forEach(parameter -> parameter.accept(this, param));
    // functionDefinition.getType().ifPresent(type -> type.accept(this, param));
    // functionDefinition.getDefinitions().forEach(definition -> definition.accept(this, param));
    // functionDefinition.getStatements().forEach(statement -> statement.accept(this, param));
    super.visit(functionDefinition, param);

    return null;
  }

  // class Parameter(String name, Type type)
  @Override
  public Object visit(Parameter parameter, Object param) {

    // parameter.getType().accept(this, param);
    super.visit(parameter, param);

    return null;
  }

  // class Print(List<Expression> expressions)
  @Override
  public Object visit(Print print, Object param) {

    // print.getExpressions().forEach(expression -> expression.accept(this, param));
    super.visit(print, param);

    return null;
  }

  // class Read(Expression expression)
  @Override
  public Object visit(Read read, Object param) {

    // read.getExpression().accept(this, param);
    super.visit(read, param);

    return null;
  }

  // class Call(Expression expression)
  @Override
  public Object visit(Call call, Object param) {

    // call.getExpression().accept(this, param);
    super.visit(call, param);

    return null;
  }

  // class Assignment(Expression left, Expression right)
  @Override
  public Object visit(Assignment assignment, Object param) {

    // assignment.getLeft().accept(this, param);
    // assignment.getRight().accept(this, param);
    super.visit(assignment, param);

    return null;
  }

  // class Conditional(Expression expression, List<Statement> ifStatements, List<Statement>
  // elseStatements)
  @Override
  public Object visit(Conditional conditional, Object param) {

    // conditional.getExpression().accept(this, param);
    // conditional.getIfStatements().forEach(statement -> statement.accept(this, param));
    // conditional.getElseStatements().forEach(statement -> statement.accept(this, param));
    super.visit(conditional, param);

    return null;
  }

  // class Loop(List<Statement> fromStatements, Expression expression, List<Statement>
  // loopStatements)
  @Override
  public Object visit(Loop loop, Object param) {

    // loop.getFromStatements().forEach(statement -> statement.accept(this, param));
    // loop.getExpression().accept(this, param);
    // loop.getLoopStatements().forEach(statement -> statement.accept(this, param));
    super.visit(loop, param);

    return null;
  }

  // class Return(Optional<Expression> expression)
  @Override
  public Object visit(Return returnValue, Object param) {

    // returnValue.getExpression().ifPresent(expression -> expression.accept(this, param));
    super.visit(returnValue, param);

    return null;
  }

  // class Run(String name, List<Expression> expressions)
  @Override
  public Object visit(Run run, Object param) {

    // run.getExpressions().forEach(expression -> expression.accept(this, param));
    super.visit(run, param);

    return null;
  }

  // class IntType()
  @Override
  public Object visit(IntType intType, Object param) {

    return null;
  }

  // class RealType()
  @Override
  public Object visit(RealType realType, Object param) {

    return null;
  }

  // class CharType()
  @Override
  public Object visit(CharType charType, Object param) {

    return null;
  }

  // class ArrayType(int intValue, Type type)
  @Override
  public Object visit(ArrayType arrayType, Object param) {

    // arrayType.getType().accept(this, param);
    super.visit(arrayType, param);

    return null;
  }

  // class StructType(String name)
  // phase Identification { StructDefinition structDefinition }
  @Override
  public Object visit(StructType structType, Object param) {

    // TODO: Remember to initialize SYNTHESIZED attributes <-----
    // structType.setStructDefinition(?);
    return null;
  }

  // class VoidType()
  @Override
  public Object visit(VoidType voidType, Object param) {

    return null;
  }

  // class Variable(String name)
  // phase Identification { VarDefinition varDefinition }
  @Override
  public Object visit(Variable variable, Object param) {

    // TODO: Remember to initialize SYNTHESIZED attributes <-----
    // variable.setVarDefinition(?);
    return null;
  }

  // class IntLiteral(int intValue)
  @Override
  public Object visit(IntLiteral intLiteral, Object param) {

    return null;
  }

  // class RealLiteral(float floatValue)
  @Override
  public Object visit(RealLiteral realLiteral, Object param) {

    return null;
  }

  // class CharLiteral(char charValue)
  @Override
  public Object visit(CharLiteral charLiteral, Object param) {

    return null;
  }

  // class FunctionCall(String name, List<Expression> expressions)
  // phase Identification { FunctionDefinition functionDefinition }
  @Override
  public Object visit(FunctionCall functionCall, Object param) {

    // functionCall.getExpressions().forEach(expression -> expression.accept(this, param));
    super.visit(functionCall, param);

    // TODO: Remember to initialize SYNTHESIZED attributes <-----
    // functionCall.setFunctionDefinition(?);
    return null;
  }

  // class StructAccess(Expression e, String name)
  @Override
  public Object visit(StructAccess structAccess, Object param) {

    // structAccess.getE().accept(this, param);
    super.visit(structAccess, param);

    return null;
  }

  // class ArrayAccess(Expression left, Expression right)
  @Override
  public Object visit(ArrayAccess arrayAccess, Object param) {

    // arrayAccess.getLeft().accept(this, param);
    // arrayAccess.getRight().accept(this, param);
    super.visit(arrayAccess, param);

    return null;
  }

  // class Cast(Type type, Expression expression)
  @Override
  public Object visit(Cast cast, Object param) {

    // cast.getType().accept(this, param);
    // cast.getExpression().accept(this, param);
    super.visit(cast, param);

    return null;
  }

  // class ArithmeticBinary(Expression left, String operator, Expression right)
  @Override
  public Object visit(ArithmeticBinary arithmeticBinary, Object param) {

    // arithmeticBinary.getLeft().accept(this, param);
    // arithmeticBinary.getRight().accept(this, param);
    super.visit(arithmeticBinary, param);

    return null;
  }

  // class ArithmeticUnary(String operator, Expression e)
  @Override
  public Object visit(ArithmeticUnary arithmeticUnary, Object param) {

    // arithmeticUnary.getE().accept(this, param);
    super.visit(arithmeticUnary, param);

    return null;
  }

  // class LogicBinary(Expression left, String operator, Expression right)
  @Override
  public Object visit(LogicBinary logicBinary, Object param) {

    // logicBinary.getLeft().accept(this, param);
    // logicBinary.getRight().accept(this, param);
    super.visit(logicBinary, param);

    return null;
  }

  // class LogicUnary(String opeartor, Expression e)
  @Override
  public Object visit(LogicUnary logicUnary, Object param) {

    // logicUnary.getE().accept(this, param);
    super.visit(logicUnary, param);

    return null;
  }
}
