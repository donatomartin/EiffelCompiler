/**
 * MLang. Programming Language Design Tutorial
 *
 * @author Raúl Izquierdo (raul@uniovi.es)
 */
package compiler.semantic;

import compiler.ErrorManager;
import compiler.ast.*;
import compiler.ast.definition.*;
import compiler.ast.expression.*;
import compiler.ast.statement.*;
import compiler.ast.type.*;
import compiler.visitor.DefaultVisitor;
import java.util.List;

public class TypeChecking extends DefaultVisitor {

  private ErrorManager errorManager;

  public TypeChecking(ErrorManager errorManager) {
    this.errorManager = errorManager;
  }

  public void process(AST ast) {
    ast.accept(this, null);
  }

  // Visit Methods --------------------------------------------------------------

  // class FunctionDefinition(String name, List<VarDefinition> parameters,
  // Optional<Type> type,
  // List<VarDefinition> locals, List<Statement> statements)
  @Override
  public Object visit(FunctionDefinition functionDefinition, Object param) {

    for (Statement statement : functionDefinition.getStatements()) {
      statement.setFunction(functionDefinition);
    }

    if (!functionDefinition.getParameters().isEmpty()) {
      for (VarDefinition varDefinition : functionDefinition.getParameters()) {
        varDefinition.accept(this, param);
        predicate(
            isPrimitive(varDefinition.getType()),
            "Parameter must be of primitive type",
            varDefinition);
      }
    }

    if (functionDefinition.getType().isPresent()) {
      functionDefinition.getType().get().accept(this, param);
      predicate(
          isPrimitive(functionDefinition.getType().get()),
          "Return type must be of primitive type",
          functionDefinition);
    }

    super.visit(functionDefinition, param);

    return null;
  }

  // class Print(List<Expression> expressions)
  @Override
  public Object visit(Print print, Object param) {

    // print.getExpressions().forEach(expression -> expression.accept(this, param));
    super.visit(print, param);

    return null;
  }

  // class Read(List<Expression> expressions)
  @Override
  public Object visit(Read read, Object param) {

    // read.getExpressions().forEach(expression -> expression.accept(this, param));
    super.visit(read, param);

    return null;
  }

  // class Assignment(Expression left, Expression right)
  @Override
  public Object visit(Assignment assignment, Object param) {

    super.visit(assignment, param);

    Expression left = assignment.getLeft();
    Expression right = assignment.getRight();

    predicate(
        sameType(left.getType(), right.getType()),
        "Types of left and right expressions do not match",
        assignment);
    predicate(left.isLvalue(), "Left expression must be an lvalue", assignment);

    return null;
  }

  // class Conditional(Expression expression, List<Statement> ifStatements,
  // List<Statement>
  // elseStatements)
  @Override
  public Object visit(Conditional conditional, Object param) {

    Expression expression = conditional.getExpression();
    expression.accept(this, param);
    predicate(
        expression.getType() instanceof IntType, "Expression must be of int type", conditional);

    for (Statement statement : conditional.getIfStatements()) {
      statement.setFunction(conditional.getFunction());
      statement.accept(this, param);
    }

    for (Statement statement : conditional.getElseStatements()) {
      statement.setFunction(conditional.getFunction());
      statement.accept(this, param);
    }

    return null;
  }

  // class Loop(List<Statement> fromStatements, Expression expression,
  // List<Statement>
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

    super.visit(returnValue, param);

    if (returnValue.getExpression().isEmpty()) {
      predicate(
          returnValue.getFunction().getType() != null,
          "Return type does not match function empty return type",
          returnValue);
    } else {
      Expression expression = returnValue.getExpression().get();
      predicate(
          sameType(returnValue.getFunction().getType().get(), expression.getType()),
          "Return type does not match function return type",
          returnValue);
    }

    return null;
  }

  // class Run(String name, List<Expression> expressions)
  @Override
  public Object visit(Run run, Object param) {

    // run.getExpressions().forEach(expression -> expression.accept(this, param));
    super.visit(run, param);

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

    variable.setType(variable.getVarDefinition().getType());
    variable.setLvalue(true);

    return null;
  }

  // class IntLiteral(int intValue)
  @Override
  public Object visit(IntLiteral intLiteral, Object param) {

    intLiteral.setType(new IntType());
    intLiteral.setLvalue(false);

    return null;
  }

  // class RealLiteral(float floatValue)
  @Override
  public Object visit(RealLiteral realLiteral, Object param) {

    realLiteral.setType(new RealType());
    realLiteral.setLvalue(false);

    return null;
  }

  // class CharLiteral(char charValue)
  @Override
  public Object visit(CharLiteral charLiteral, Object param) {

    charLiteral.setType(new CharType());
    charLiteral.setLvalue(false);

    return null;
  }

  // class FunctionCallExpression(String name, List<Expression> expressions)
  @Override
  public Object visit(FunctionCallExpression functionCallExpression, Object param) {

    super.visit(functionCallExpression, param);

    functionCallExpression.setLvalue(false);

    if (functionCallExpression.getFunctionDefinition().getType().isPresent()) {
      functionCallExpression.setType(
          functionCallExpression.getFunctionDefinition().getType().get());
    }

    List<VarDefinition> parameters = functionCallExpression.getFunctionDefinition().getParameters();
    List<Expression> arguments = functionCallExpression.getExpressions();

    for (int i = 0; i < parameters.size(); i++) {
      predicate(
          sameType(parameters.get(i).getType(), arguments.get(i).getType()),
          "Argument must match parameter type",
          arguments.get(i));
    }

    return null;
  }

  // class FunctionCallStatement(String name, List<Expression> expressions)
  @Override
  public Object visit(FunctionCallStatement functionCallStatement, Object param) {

    super.visit(functionCallStatement, param);

    List<VarDefinition> parameters = functionCallStatement.getFunctionDefinition().getParameters();
    List<Expression> arguments = functionCallStatement.getExpressions();

    for (int i = 0; i < parameters.size(); i++) {
      predicate(
          sameType(parameters.get(i).getType(), arguments.get(i).getType()),
          "Argument must match parameter type",
          arguments.get(i));
    }

    return null;
  }

  // class StructAccess(Expression expr, String name)

  @Override
  public Object visit(StructAccess structAccess, Object param) {

    super.visit(structAccess, param);

    predicate(
        structAccess.getExpr().getType() instanceof StructType,
        "Expression must be of struct type",
        structAccess);

    if (structAccess.getExpr().getType() instanceof StructType) {
      StructType structType = (StructType) structAccess.getExpr().getType();
      for (FieldDefinition fieldDefinition :
          structType.getStructDefinition().getFieldDefinitions()) {
        if (fieldDefinition.getName().equals(structAccess.getName())) {
          structAccess.setType(fieldDefinition.getType());
        }
      }
    }

    structAccess.setLvalue(true);

    return null;
  }

  // class ArrayAccess(Expression left, Expression right)
  @Override
  public Object visit(ArrayAccess arrayAccess, Object param) {

    super.visit(arrayAccess, param);

    predicate(
        arrayAccess.getLeft().getType() instanceof ArrayType,
        "Expression must be of array type",
        arrayAccess);

    if (arrayAccess.getLeft().getType() instanceof ArrayType) {

      predicate(
          arrayAccess.getRight().getType() instanceof IntType,
          "Index must be of type IntType",
          arrayAccess);
      ArrayType arrayType = (ArrayType) arrayAccess.getLeft().getType();
      arrayAccess.setType(arrayType.getType());
    }

    arrayAccess.setLvalue(true);

    return null;
  }

  // class Cast(Type type, Expression expression)
  @Override
  public Object visit(Cast cast, Object param) {

    super.visit(cast, param);

    Type castType = cast.getCastType();
    Expression expression = cast.getExpression();

    predicate(
        !sameType(castType, expression.getType()),
        "Types of cast and expression already match",
        cast);

    cast.setType(cast.getCastType());
    cast.setLvalue(false);

    return null;
  }

  // class ArithmeticBinary(Expression left, String operator, Expression right)
  @Override
  public Object visit(ArithmeticBinary arithmetic, Object param) {

    super.visit(arithmetic, param);

    Expression left = arithmetic.getLeft();
    Expression right = arithmetic.getRight();

    if (arithmetic.getOperator().equals("%")) {
      predicate(
          left.getType() instanceof IntType,
          "Left operand of '%' operator must be of type IntType",
          arithmetic);
      predicate(
          right.getType() instanceof IntType,
          "Right operand of '%' operator must be of type IntType",
          arithmetic);
    } else {
      predicate(
          left.getType() instanceof IntType || left.getType() instanceof RealType,
          "Left operand of arithmetic operator must be of type IntType or FloatType",
          arithmetic);
      predicate(
          right.getType() instanceof IntType || right.getType() instanceof RealType,
          "Right operand of arithmetic operator must be of type IntType or FloatType",
          arithmetic);
    }

    arithmetic.setLvalue(false);
    arithmetic.setType(left.getType());

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

    super.visit(logicBinary, param);

    predicate(
        isNum(logicBinary.getLeft().getType()),
        "Left operand of logical binary operator must be of boolean type",
        logicBinary);
    predicate(
        isNum(logicBinary.getRight().getType()),
        "Right operand of logical binary operator must be of boolean type",
        logicBinary);

    logicBinary.setType(new IntType());
    logicBinary.setLvalue(false);

    return null;
  }

  // class LogicUnary(String operator, Expression expr)
  @Override
  public Object visit(LogicUnary logicUnary, Object param) {

    // logicUnary.getExpression().accept(this, param);
    super.visit(logicUnary, param);

    predicate(
        isNum(logicUnary.getExpr().getType()),
        "Operand of logical unary operator must be of boolean type",
        logicUnary);

    logicUnary.setType(new IntType());
    logicUnary.setLvalue(false);

    return null;
  }

  // class RelationalBinary(Expression left, String operator, Expression right)
  @Override
  public Object visit(RelationalBinary relationalBinary, Object param) {

    super.visit(relationalBinary, param);

    predicate(
        isNum(relationalBinary.getLeft().getType()),
        "Left operand of relationalBinary operator must be of numeric type",
        relationalBinary);
    predicate(
        isNum(relationalBinary.getRight().getType()),
        "Right operand of relationalBinary operator must be of numeric type",
        relationalBinary);

    relationalBinary.setType(new IntType());
    relationalBinary.setLvalue(false);

    return null;
  }

  // Visit Methods --------------------------------------------------------------

  private boolean sameType(Type typeA, Type typeB) {
    if (typeA == null || typeB == null) return false;

    return typeA.getClass().equals(typeB.getClass());
  }

  private boolean isNum(Type typeA) {
    return typeA instanceof IntType || typeA instanceof RealType;
  }

  private boolean isPrimitive(Type typeA) {
    return typeA instanceof IntType || typeA instanceof RealType || typeA instanceof CharType;
  }

  private void notifyError(String errorMessage, Position position) {
    errorManager.notify("Type Checking", errorMessage, position);
  }

  private boolean predicate(boolean condition, String errorMessage, Position position) {
    if (!condition) {
      notifyError(errorMessage, position);
      return false;
    }

    return true;
  }

  private boolean predicate(boolean condition, String errorMessage, AST node) {
    return predicate(condition, errorMessage, node.start());
  }
}
