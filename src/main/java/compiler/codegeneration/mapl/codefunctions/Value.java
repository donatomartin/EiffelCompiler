// Generated with VGen 2.0.0

package compiler.codegeneration.mapl.codefunctions;

import compiler.ast.expression.ArithmeticBinary;
import compiler.ast.expression.ArithmeticUnary;
import compiler.ast.expression.ArrayAccess;
import compiler.ast.expression.Cast;
import compiler.ast.expression.CharLiteral;
import compiler.ast.expression.FunctionCallExpression;
import compiler.ast.expression.IntLiteral;
import compiler.ast.expression.LogicBinary;
import compiler.ast.expression.LogicUnary;
import compiler.ast.expression.RealLiteral;
import compiler.ast.expression.RelationalBinary;
import compiler.ast.expression.StructAccess;
import compiler.ast.expression.Variable;
import compiler.codegeneration.mapl.AbstractCodeFunction;
import compiler.codegeneration.mapl.MaplCodeSpecification;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Value extends AbstractCodeFunction {

  public Map<String, String> logicOperators = new HashMap<String, String>();
  public Map<String, String> arithmeticOperators = new HashMap<String, String>();
  public Map<String, String> relationalOperators = new HashMap<String, String>();

  public Value(MaplCodeSpecification specification) {
    super(specification);

    relationalOperators.put(">=", "ge");
    relationalOperators.put("<=", "le");
    relationalOperators.put(">", "gt");
    relationalOperators.put("<", "lt");
    relationalOperators.put("=", "eq");
    relationalOperators.put("<>", "ne");

    logicOperators.put("and", "and");
    logicOperators.put("or", "or");

    arithmeticOperators.put("+", "add");
    arithmeticOperators.put("-", "sub");
    arithmeticOperators.put("*", "mul");
    arithmeticOperators.put("/", "div");
  }

  // class Variable(String name)
  // phase Identification { VarDefinition varDefinition }
  // phase TypeChecking { boolean lvalue, Type type }
  @Override
  public Object visit(Variable variable, Object param) {

    address(variable);
    out("load", variable.getType());

    return null;
  }

  // class IntLiteral(int intValue)
  // phase TypeChecking { boolean lvalue, Type type }
  @Override
  public Object visit(IntLiteral intLiteral, Object param) {

    out("pushi " + intLiteral.getIntValue());

    return null;
  }

  // class RealLiteral(float floatValue)
  // phase TypeChecking { boolean lvalue, Type type }
  @Override
  public Object visit(RealLiteral realLiteral, Object param) {

    out("pushf " + realLiteral.getFloatValue());

    return null;
  }

  // class CharLiteral(char charValue)
  // phase TypeChecking { boolean lvalue, Type type }
  @Override
  public Object visit(CharLiteral charLiteral, Object param) {

    char character = charLiteral.getCharValue();
    out("pushb " + (int) character);

    return null;
  }

  // class FunctionCallExpression(String name, List<Expression> expressions)
  // phase Identification { FunctionDefinition functionDefinition }
  // phase TypeChecking { boolean lvalue, Type type }
  @Override
  public Object visit(FunctionCallExpression functionCallExpression, Object param) {

    value(functionCallExpression.expressions());

    out("call " + functionCallExpression.getName());

    return null;
  }

  // class StructAccess(Expression expr, String name)
  // phase TypeChecking { boolean lvalue, Type type }
  @Override
  public Object visit(StructAccess structAccess, Object param) {

    out("load", structAccess.getType());

    return null;
  }

  // class ArrayAccess(Expression left, Expression right)
  // phase TypeChecking { boolean lvalue, Type type }
  @Override
  public Object visit(ArrayAccess arrayAccess, Object param) {

    address(arrayAccess);
    out("load", arrayAccess.getType());

    return null;
  }

  // class Cast(Type castType, Expression expression)
  // phase TypeChecking { boolean lvalue, Type type }
  @Override
  public Object visit(Cast cast, Object param) {

    value(cast.getExpression());

    if (!Objects.equals(cast.getType().getClass(), cast.getExpression().getType().getClass())) {
      out(suffixFor(cast.getExpression().getType()) + "2" + suffixFor(cast.getType()));
    }

    return null;
  }

  // class ArithmeticBinary(Expression left, String operator, Expression right)
  // phase TypeChecking { boolean lvalue, Type type }
  @Override
  public Object visit(ArithmeticBinary arithmeticBinary, Object param) {

    value(arithmeticBinary.getLeft());
    value(arithmeticBinary.getRight());
    out(arithmeticOperators.get(arithmeticBinary.getOperator()), arithmeticBinary.getType());

    return null;
  }

  // class ArithmeticUnary(String operator, Expression expr)
  // phase TypeChecking { boolean lvalue, Type type }
  @Override
  public Object visit(ArithmeticUnary arithmeticUnary, Object param) {

	value(arithmeticUnary.getExpr());
	out("-");

    return null;
  }

  // class LogicBinary(Expression left, String operator, Expression right)
  // phase TypeChecking { boolean lvalue, Type type }
  @Override
  public Object visit(LogicBinary logicBinary, Object param) {

    value(logicBinary.getLeft());
    value(logicBinary.getRight());

    String operator = logicBinary.getOperator();

    out(logicOperators.get(operator));

    return null;
  }

  // class LogicUnary(String operator, Expression expr)
  // phase TypeChecking { boolean lvalue, Type type }
  @Override
  public Object visit(LogicUnary logicUnary, Object param) {

	value(logicUnary.getExpr());
	out("not");

    return null;
  }

  // class RelationalBinary(Expression left, String operator, Expression right)
  // phase TypeChecking { boolean lvalue, Type type }
  @Override
  public Object visit(RelationalBinary relationalBinary, Object param) {

    value(relationalBinary.getLeft());
    value(relationalBinary.getRight());

    String operator = relationalBinary.getOperator();

    out(relationalOperators.get(operator));

    return null;

  }
}