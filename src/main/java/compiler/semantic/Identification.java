package compiler.semantic;

import compiler.ErrorManager;
import compiler.ast.*;
import compiler.ast.definition.*;
import compiler.ast.expression.*;
import compiler.ast.statement.*;
import compiler.ast.type.*;
import compiler.visitor.DefaultVisitor;
import java.util.HashMap;
import java.util.Map;

public class Identification extends DefaultVisitor {

  private ErrorManager errorManager;

  private ContextMap<VarDefinition> varDefinitions = new ContextMap<>();
  private Map<String, FieldDefinition> fieldDefinitions = new HashMap<>();
  private Map<String, FunctionDefinition> functionDefinitions = new HashMap<>();
  private Map<String, StructDefinition> structDefinitions = new HashMap<>();

  public Identification(ErrorManager errorManager) {
    this.errorManager = errorManager;
  }

  public void process(AST ast) {
    ast.accept(this, null);
  }

  // Visit Methods --------------------------------------------------------------

  // class FunctionCreation(String name)
  @Override
  public Object visit(FunctionCreation functionCreation, Object param) {

    return null;
  }

  // class VarDefinition(String name, Type type)
  @Override
  public Object visit(VarDefinition varDefinition, Object param) {

    // varDefinition.getType().accept(this, param);
    super.visit(varDefinition, param);

    return null;
  }

  // class StructDefinition(String name, List<FieldDefinition> fieldDefinitions)
  @Override
  public Object visit(StructDefinition structDefinition, Object param) {

    // structDefinition.getFieldDefinitions().forEach(fieldDefinition ->
    // fieldDefinition.accept(this, param));
    super.visit(structDefinition, param);

    return null;
  }

  // class FieldDefinition(String name, Type type)
  @Override
  public Object visit(FieldDefinition fieldDefinition, Object param) {

    // fieldDefinition.getType().accept(this, param);
    super.visit(fieldDefinition, param);

    return null;
  }

  // class FunctionDefinition(String name, List<VarDefinition> parameters, Optional<Type> type,
  // List<VarDefinition> locals, List<Statement> statements)
  @Override
  public Object visit(FunctionDefinition functionDefinition, Object param) {

    // functionDefinition.getParameters().forEach(varDefinition -> varDefinition.accept(this,
    // param));
    // functionDefinition.getType().ifPresent(type -> type.accept(this, param));
    // functionDefinition.getLocals().forEach(varDefinition -> varDefinition.accept(this, param));
    // functionDefinition.getStatements().forEach(statement -> statement.accept(this, param));
    super.visit(functionDefinition, param);

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

  // class StructAccess(Expression expr, String name)
  @Override
  public Object visit(StructAccess structAccess, Object param) {

    // structAccess.getExpr().accept(this, param);
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

  // class ArithmeticUnary(String operator, Expression expr)
  @Override
  public Object visit(ArithmeticUnary arithmeticUnary, Object param) {

    // arithmeticUnary.getExpr().accept(this, param);
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

  // class LogicUnary(String operator, Expression expr)
  @Override
  public Object visit(LogicUnary logicUnary, Object param) {

    // logicUnary.getExpr().accept(this, param);
    super.visit(logicUnary, param);

    return null;
  }

  // class RelationalBinary(Expression left, String operator, Expression right)
  @Override
  public Object visit(RelationalBinary relationalBinary, Object param) {

    // relationalBinary.getLeft().accept(this, param);
    // relationalBinary.getRight().accept(this, param);
    super.visit(relationalBinary, param);

    return null;
  }
}
