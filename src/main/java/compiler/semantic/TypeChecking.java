/**
 * MLang. Programming Language Design Tutorial
 *
 * @author Raúl Izquierdo (raul@uniovi.es)
 */
package compiler.semantic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import compiler.ErrorManager;
import compiler.ast.AST;
import compiler.ast.Position;
import compiler.ast.Run;
import compiler.ast.definition.FieldDefinition;
import compiler.ast.definition.FunctionDefinition;
import compiler.ast.definition.VarDefinition;
import compiler.ast.expression.ArithmeticBinary;
import compiler.ast.expression.ArithmeticUnary;
import compiler.ast.expression.ArrayAccess;
import compiler.ast.expression.Cast;
import compiler.ast.expression.CharLiteral;
import compiler.ast.expression.Expression;
import compiler.ast.expression.FunctionCallExpression;
import compiler.ast.expression.IntLiteral;
import compiler.ast.expression.LogicBinary;
import compiler.ast.expression.LogicUnary;
import compiler.ast.expression.RealLiteral;
import compiler.ast.expression.RelationalBinary;
import compiler.ast.expression.StructAccess;
import compiler.ast.expression.Variable;
import compiler.ast.statement.Assignment;
import compiler.ast.statement.Conditional;
import compiler.ast.statement.FunctionCallStatement;
import compiler.ast.statement.Loop;
import compiler.ast.statement.Print;
import compiler.ast.statement.Println;
import compiler.ast.statement.Read;
import compiler.ast.statement.Return;
import compiler.ast.statement.Statement;
import compiler.ast.type.ArrayType;
import compiler.ast.type.CharType;
import compiler.ast.type.IntType;
import compiler.ast.type.RealType;
import compiler.ast.type.StructType;
import compiler.ast.type.Type;
import compiler.ast.type.VoidType;
import compiler.visitor.DefaultVisitor;

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

    if (functionDefinition.getType().orElse(null) != null) {
      predicate(
          functionDefinition.isHasReturn(),
          "Function with return type must have a return statement",
          functionDefinition);
    }

    return null;
  }

  // class Print(List<Expression> expressions)
  @Override
  public Object visit(Print print, Object param) {

    super.visit(print, param);

    print
        .getExpressions()
        .forEach(
            expression -> {
              predicate(
                  isPrimitive(expression.getExpressionType()),
                  "Expression must be of primitive type",
                  expression);
              expression.setLvalue(false);
            });

    return null;
  }

  // class Println(List<Expression> expressions)
  @Override
  public Object visit(Println println, Object param) {

    // println.getExpressions().forEach(expression -> expression.accept(this, param));
    super.visit(println, param);

    println
        .getExpressions()
        .forEach(
            expression -> {
              predicate(
                  isPrimitive(expression.getExpressionType()),
                  "Expression must be of primitive type",
                  expression);
              expression.setLvalue(false);
            });

    return null;
  }

  // class Read(List<Expression> expressions)
  @Override
  public Object visit(Read read, Object param) {

    // read.getExpressions().forEach(expression -> expression.accept(this, param));
    super.visit(read, param);

    read.getExpressions()
        .forEach(
            expression -> {
              predicate(
                  isPrimitive(expression.getExpressionType()),
                  "Expression must be of primitive type",
                  expression);
              expression.setLvalue(false);
            });

    return null;
  }

  // class Assignment(Expression left, Expression right)
	@Override
	public Object visit(Assignment assignment, Object param) {
		super.visit(assignment, param);

		predicate(isPrimitive(assignment.getLeft().getExpressionType()),
				"Left expression must have a primitive type", assignment);

		predicate(sameTypeOrPromotable(assignment.getLeft().getExpressionType(), assignment.getRight().getExpressionType()),
				"Types do not match or no promotability available", assignment);

		predicate(assignment.getLeft().isLvalue(), "Left expression must be an LValue", assignment);
    
    if (sameTypeOrPromotable(assignment.getLeft().getExpressionType(), assignment.getRight().getExpressionType())) {
      
      if (assignment.getLeft().getExpressionType() instanceof RealType && assignment.getRight().getExpressionType() instanceof IntType) {
        Cast cast = new Cast(new RealType(), assignment.getRight());
        cast.setLvalue(false);
        cast.setExpressionType(new RealType());
        assignment.setRight(cast);
      }
      
      if (assignment.getLeft().getExpressionType() instanceof IntType && assignment.getRight().getExpressionType() instanceof CharType) {
        Cast cast = new Cast(new IntType(), assignment.getRight());
        cast.setLvalue(false);
        cast.setExpressionType(new IntType());
        assignment.setRight(cast);
      }
      
      if (assignment.getLeft().getExpressionType() instanceof RealType && assignment.getRight().getExpressionType() instanceof CharType) {
        Cast cast1 = new Cast(new IntType(), assignment.getRight());
        cast1.setLvalue(false);
        cast1.setExpressionType(new IntType());
        
        Cast cast2 = new Cast(new RealType(), cast1);
        cast2.setLvalue(false);
        cast2.setExpressionType(new RealType());
        
        assignment.setRight(cast2);
        
      }

    } 
		
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
        expression.getExpressionType() instanceof IntType,
        "Expression must be of int type",
        conditional);

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
  
  
	// class Loop(List<Statement> fromStatements, Expression expression, List<Statement> loopStatements)
	// phase TypeChecking { FunctionDefinition function }
	@Override
	public Object visit(Loop loop, Object param) {
    
    // No es necesario porque solo se pueden asignaciones
    for (Statement statement : loop.getFromStatements()) {
      statement.setFunction(loop.getFunction());
      statement.accept(this, param);
    }

    for (Statement statement : loop.getLoopStatements()) {
      statement.setFunction(loop.getFunction());
      statement.accept(this, param);
    }

		return null;
	}

  // class Return(Optional<Expression> expression)
  @Override
  public Object visit(Return returnValue, Object param) {

    super.visit(returnValue, param);

    returnValue.getFunction().setHasReturn(true);

    if (returnValue.getExpression().isEmpty()) {
      predicate(
          returnValue.getFunction().getType().orElse(new VoidType()) instanceof VoidType,
          "Return type does not match function empty return type",
          returnValue);
    } else {
      Expression expression = returnValue.getExpression().get();
      predicate(
          sameTypeOrPromotable(
              returnValue.getFunction().getType().orElse(null), expression.getExpressionType()),
          "Return type does not match function return type",
          returnValue);
      
          
    if (sameTypeOrPromotable(returnValue.getFunction().getType().get(), returnValue.getExpression().orElse(null).getExpressionType())) {
      
      if (returnValue.getFunction().getType().get() instanceof RealType && returnValue.getExpression().orElse(null).getExpressionType() instanceof IntType) {
        Cast cast = new Cast(new RealType(), returnValue.getExpression().orElse(null));
        cast.setLvalue(false);
        cast.setExpressionType(new RealType());
        returnValue.setExpression(Optional.of(cast));;
      }
      
      if (returnValue.getFunction().getType().get() instanceof IntType && returnValue.getExpression().orElse(null).getExpressionType() instanceof CharType) {
        Cast cast = new Cast(new IntType(), returnValue.getExpression().orElse(null));
        cast.setLvalue(false);
        cast.setExpressionType(new IntType());
        returnValue.setExpression(Optional.of(cast));;
      }
      
      if (returnValue.getFunction().getType().get() instanceof RealType && returnValue.getExpression().orElse(null).getExpressionType() instanceof CharType) {
        Cast cast1 = new Cast(new IntType(), returnValue.getExpression().orElse(null));
        cast1.setLvalue(false);
        cast1.setExpressionType(new IntType());
        
        Cast cast2 = new Cast(new RealType(), cast1);
        cast2.setLvalue(false);
        cast2.setExpressionType(new RealType());
        
        returnValue.setExpression(Optional.of(cast2));;
        
      }

    } 
    }

    return null;
  }

  // class Run(String name, List<Expression> expressions)
  @Override
  public Object visit(Run run, Object param) {

    // run.getExpressions().forEach(expression -> expression.accept(this, param));
    super.visit(run, param);
    
    List<VarDefinition> parameters = run.getFunctionDefinition().getParameters();
    List<Expression> arguments = run.getExpressions();
    for (int i = 0; i < parameters.size(); i++) {
      predicate(
          sameType(parameters.get(i).getType(), arguments.get(i).getExpressionType()),
          "Argument must match parameter type",
          arguments.get(i));
    }

    return null;

  }

  // class Variable(String name)
  // phase Identification { VarDefinition varDefinition }
  @Override
  public Object visit(Variable variable, Object param) {

    variable.setExpressionType(variable.getVarDefinition().getType());
    variable.setLvalue(true);

    return null;
  }

  // class IntLiteral(int intValue)
  @Override
  public Object visit(IntLiteral intLiteral, Object param) {

    intLiteral.setExpressionType(new IntType());
    intLiteral.setLvalue(false);

    return null;
  }

  // class RealLiteral(float floatValue)
  @Override
  public Object visit(RealLiteral realLiteral, Object param) {

    realLiteral.setExpressionType(new RealType());
    realLiteral.setLvalue(false);

    return null;
  }

  // class CharLiteral(char charValue)
  @Override
  public Object visit(CharLiteral charLiteral, Object param) {

    charLiteral.setExpressionType(new CharType());
    charLiteral.setLvalue(false);

    return null;
  }

  // class FunctionCallExpression(String name, List<Expression> expressions)
  @Override
  public Object visit(FunctionCallExpression functionCallExpression, Object param) {

    super.visit(functionCallExpression, param);

    functionCallExpression.setLvalue(false);

    if (functionCallExpression.getFunctionDefinition().getType().isPresent()) {
      functionCallExpression.setExpressionType(
          functionCallExpression.getFunctionDefinition().getType().orElse(new VoidType()));
    }

    List<VarDefinition> parameters = functionCallExpression.getFunctionDefinition().getParameters();
    List<Expression> arguments = functionCallExpression.getExpressions();

    for (int i = 0; i < parameters.size(); i++) {
      predicate(
          sameTypeOrPromotable(parameters.get(i).getType(), arguments.get(i).getExpressionType()),
          "Argument must match parameter type or be promotable to param",
          arguments.get(i));

      if (sameTypeOrPromotable(parameters.get(i).getType(), arguments.get(i).getExpressionType())) {
      
      if (parameters.get(i).getType() instanceof RealType && arguments.get(i).getExpressionType() instanceof IntType) {

        Cast cast = new Cast(new RealType(), arguments.get(i));
        cast.setLvalue(false);
        cast.setExpressionType(new RealType());
        
        List<Expression> newArguments = new ArrayList<>();
        for (int j = 0; j < arguments.size(); j++) {
            if (j != i) {
              newArguments.add(arguments.get(j));
            }
            else {
              newArguments.add(cast);
            }

        }

        functionCallExpression.setExpressions(newArguments);
        
      }
      
      if (parameters.get(i).getType() instanceof IntType && arguments.get(i).getExpressionType() instanceof CharType) {
        Cast cast = new Cast(new IntType(), arguments.get(i));
        cast.setLvalue(false);
        cast.setExpressionType(new IntType());
        List<Expression> newArguments = new ArrayList<>();
        for (int j = 0; j < arguments.size(); j++) {
            if (j != i) {
              newArguments.add(arguments.get(j));
            }
            else {
              newArguments.add(cast);
            }
          
        }

        functionCallExpression.setExpressions(newArguments);
      }
      
      if (parameters.get(i).getType() instanceof RealType && arguments.get(i).getExpressionType() instanceof CharType) {
        Cast cast1 = new Cast(new IntType(), arguments.get(i));
        cast1.setLvalue(false);
        cast1.setExpressionType(new IntType());
        
        Cast cast2 = new Cast(new RealType(), cast1);
        cast2.setLvalue(false);
        cast2.setExpressionType(new RealType());
        
        List<Expression> newArguments = new ArrayList<>();
        for (int j = 0; j < arguments.size(); j++) {
            if (j != i) {
              newArguments.add(arguments.get(j));
            }
            else {
              newArguments.add(cast2);
            }
          
        }

        functionCallExpression.setExpressions(newArguments);
        
      }

    }
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
          sameType(parameters.get(i).getType(), arguments.get(i).getExpressionType()),
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
        structAccess.getExpr().getExpressionType() instanceof StructType,
        "Expression must be of struct type",
        structAccess);

    boolean found = false;
    if (structAccess.getExpr().getExpressionType() instanceof StructType) {
      StructType structType = (StructType) structAccess.getExpr().getExpressionType();
      for (FieldDefinition fieldDefinition :
          structType.getStructDefinition().getFieldDefinitions()) {
        if (fieldDefinition.getName().equals(structAccess.getName())) {
          structAccess.setExpressionType(fieldDefinition.getType());
          structAccess.setFieldDefinition(fieldDefinition);
          found = true;
        }
      }
    }

    predicate(found, "Field '" + structAccess.getName() + "' not found in struct", structAccess);

    structAccess.setLvalue(true);

    return null;
  }

  // class ArrayAccess(Expression left, Expression right)
  @Override
  public Object visit(ArrayAccess arrayAccess, Object param) {
    super.visit(arrayAccess, param);
    
    // System.out.println("Visiting ArrayAccess: " + arrayAccess);
    // System.out.println("Left Expression: " + arrayAccess.getLeft() + 
    //                    " (Type: " + arrayAccess.getLeft().getExpressionType() + ")");
    // System.out.println("Right Expression: " + arrayAccess.getRight() +
    //                    " (Type: " + arrayAccess.getRight().getExpressionType() + ")");
    // System.out.println("Right type: " + arrayAccess.getRight().getExpressionType());
    // System.out.println();
    //

    Type type = arrayAccess.getLeft().getExpressionType();
    if (type instanceof ArrayType) {
      ArrayType at = (ArrayType) type;
      arrayAccess.setExpressionType(at.getType());
    } else if (isAccesible(arrayAccess) && arrayAccess.getRight() instanceof IntLiteral) {
      arrayAccess.setExpressionType(arrayAccess.getLeft().getExpressionType());
    }

    predicate(isAccesible(arrayAccess), "Left expression must be an array", arrayAccess);
    predicate(
        arrayAccess.getRight().getExpressionType() instanceof IntType, "Right expression must be an integer", arrayAccess);
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
        !sameType(castType, expression.getExpressionType()),
        "Types of cast and expression already match",
        cast);

    cast.setExpressionType(cast.getCastType());
    cast.setLvalue(false);

    return null;
  }

  // class ArithmeticBinary(Expression left, String operator, Expression right)
  @Override
  public Object visit(ArithmeticBinary arithmetic, Object param) {

    super.visit(arithmetic, param);

    Expression left = arithmetic.getLeft();
    Expression right = arithmetic.getRight();

    if (arithmetic.getOperator().equals("mod")) {
      predicate(
          left.getExpressionType() instanceof IntType,
          "Left operand of 'mod' operator must be of type IntType",
          arithmetic);
      predicate(
          right.getExpressionType() instanceof IntType,
          "Right operand of 'mod' operator must be of type IntType",
          arithmetic);
    } else {
      predicate(
          left.getExpressionType() instanceof IntType
              || left.getExpressionType() instanceof RealType,
          "Left operand of arithmetic operator must be of type IntType or FloatType",
          arithmetic);
      predicate(
          right.getExpressionType() instanceof IntType
              || right.getExpressionType() instanceof RealType,
          "Right operand of arithmetic operator must be of type IntType or FloatType",
          arithmetic);
    }

    arithmetic.setLvalue(false);
    arithmetic.setExpressionType(left.getExpressionType());

    return null;
  }

  // class ArithmeticUnary(String operator, Expression expr)
  @Override
  public Object visit(ArithmeticUnary arithmeticUnary, Object param) {

    // arithmeticUnary.getExpr().accept(this, param);
    super.visit(arithmeticUnary, param);
    

    predicate(arithmeticUnary.getExpr().getExpressionType() instanceof IntType
        || arithmeticUnary.getExpr().getExpressionType() instanceof RealType,
        "Operand of arithmetic unary operator must be of type IntType or FloatType",
        arithmeticUnary);

    arithmeticUnary.setLvalue(false);
    arithmeticUnary.setExpressionType(arithmeticUnary.getExpr().getExpressionType());

    return null;
  }

  // class LogicBinary(Expression left, String operator, Expression right)
  @Override
  public Object visit(LogicBinary logicBinary, Object param) {

    super.visit(logicBinary, param);

    predicate(
        logicBinary.getLeft().getExpressionType() instanceof IntType,
        "Left operand of logical binary operator must be of int type",
        logicBinary);
    predicate(
        logicBinary.getRight().getExpressionType() instanceof IntType,
        "Right operand of logical binary operator must be of int type",
        logicBinary);

    logicBinary.setExpressionType(new IntType());
    logicBinary.setLvalue(false);

    return null;
  }

  // class LogicUnary(String operator, Expression expr)
  @Override
  public Object visit(LogicUnary logicUnary, Object param) {

    // logicUnary.getExpression().accept(this, param);
    super.visit(logicUnary, param);

    predicate(
        logicUnary.getExpr().getExpressionType() instanceof IntType,
        "Operand of logical unary operator must be of int type",
        logicUnary);

    logicUnary.setExpressionType(new IntType());
    logicUnary.setLvalue(false);

    return null;
  }

  // class RelationalBinary(Expression left, String operator, Expression right)
  @Override
  public Object visit(RelationalBinary relationalBinary, Object param) {

    super.visit(relationalBinary, param);

    predicate(
        isNum(relationalBinary.getLeft().getExpressionType()),
        "Left operand of relationalBinary operator must be of numeric type",
        relationalBinary);
    predicate(
        isNum(relationalBinary.getRight().getExpressionType()),
        "Right operand of relationalBinary operator must be of numeric type",
        relationalBinary);

    relationalBinary.setExpressionType(new IntType());
    relationalBinary.setLvalue(false);

    return null;
  }

  // Visit Methods --------------------------------------------------------------

  private boolean sameType(Type typeA, Type typeB) {
    if (typeA == null || typeB == null) return false;

    return typeA.getClass().equals(typeB.getClass());
  }
  
  private boolean sameTypeOrPromotable(Type typeMajor, Type typeMinor) {

    if (typeMajor == null || typeMinor == null) return false;
    
    if (typeMajor.getClass().equals(typeMinor.getClass()))
      return true;
    
    if ( typeMajor instanceof IntType && typeMinor instanceof CharType )
      return true;
    
    if ( typeMajor instanceof RealType && typeMinor instanceof IntType )
      return true;
    
    if ( typeMajor instanceof RealType && typeMinor instanceof CharType )
      return true;
    
    return false;
    
  }

	private boolean isAccesible(ArrayAccess arrayAccess) {
		if (arrayAccess.getLeft().getExpressionType() instanceof ArrayType) {
			return true;
		}
		return false;
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