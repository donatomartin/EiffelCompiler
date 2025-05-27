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
  private Map<String, StructDefinition> structDefinitions = new HashMap<>();
  private Map<String, FieldDefinition> fieldDefinitions = new HashMap<>();
  private Map<String, FunctionDefinition> functionDefinitions = new HashMap<>();

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

    if (varDefinitions.getFromTop(varDefinition.getName()) != null) {
      notifyError("Variable " + varDefinition.getName() + " already defined", varDefinition);
      return null;
    }

    if (varDefinition.getType() != null) {
      varDefinition.getType().accept(this, param);
    }

    varDefinitions.put(varDefinition.getName(), varDefinition);
    varDefinition.setScope(varDefinitions.getCurrentScope());

    return null;
  }

  // class Variable(String name)
  @Override
  public Object visit(Variable variable, Object param) {

    VarDefinition varDefinition = varDefinitions.getFromAny(variable.getName());

    if (varDefinition == null) {
      notifyError("Variable " + variable.getName() + " not defined", variable);
      return null;
    }

    variable.setVarDefinition(varDefinition);

    return null;
  }

  // class StructDefinition(String name, List<FieldDefinition> fieldDefinitions)
  @Override
  public Object visit(StructDefinition structDefinition, Object param) {

    if (structDefinitions.get(structDefinition.getName()) != null) {
      notifyError("Struct " + structDefinition.getName() + " already defined", structDefinition);
      return null;
    }

    structDefinitions.put(structDefinition.getName(), structDefinition);

    structDefinition
        .getFieldDefinitions()
        .forEach(field -> field.setStructDefinition(structDefinition));
    structDefinition.getFieldDefinitions().forEach(field -> field.accept(this, param));

    return null;
  }

  // class StructType(String name)
  @Override
  public Object visit(StructType structType, Object param) {

    StructDefinition structDefinition = structDefinitions.get(structType.getName());

    if (structDefinition == null) {
      notifyError("Struct " + structType.getName() + " not defined", structType);
      return null;
    }

    structType.setStructDefinition(structDefinition);

    return null;
  }

  // class FieldDefinition(String name, Type type)
  @Override
  public Object visit(FieldDefinition fieldDefinition, Object param) {

    if (fieldDefinitions.get(
            fieldDefinition.getStructDefinition().getName() + fieldDefinition.getName())
        != null) {

      notifyError(
          String.format(
              "Field %s already defined in %s",
              fieldDefinition.getName(), fieldDefinition.getStructDefinition().getName()),
          fieldDefinition);

      return null;
    }

    fieldDefinition.getType().accept(this, param);

    fieldDefinitions.put(
        fieldDefinition.getStructDefinition().getName() + fieldDefinition.getName(),
        fieldDefinition);

    return null;
  }

  // class FunctionDefinition(String name, List<VarDefinition> varDefinitions, Optional<Type> type,
  // List<Definition> definitions, List<Statement> statements)
  @Override
  public Object visit(FunctionDefinition functionDefinition, Object param) {

    varDefinitions.set();

    if (functionDefinitions.get(functionDefinition.getName()) != null) {
      notifyError(
          "Function " + functionDefinition.getName() + " already defined", functionDefinition);
      varDefinitions.reset();
      return null;
    }

    functionDefinitions.put(functionDefinition.getName(), functionDefinition);

    functionDefinition.getParameters().forEach(varDefinition -> varDefinition.accept(this, param));
    functionDefinition.getType().ifPresent(type -> type.accept(this, param));
    functionDefinition.getLocals().forEach(definition -> definition.accept(this, param));
    functionDefinition.getStatements().forEach(statement -> statement.accept(this, param));

    varDefinitions.reset();

    return null;
  }

  // class FunctionCallStatement(String name, List<Expression> expressions)
  @Override
  public Object visit(FunctionCallStatement functionCallStatement, Object param) {

    FunctionDefinition functionDefinition =
        functionDefinitions.get(functionCallStatement.getName());

    if (functionDefinition == null) {
      notifyError(
          "Function " + functionCallStatement.getName() + " not defined", functionCallStatement);
      return null;
    }

    functionCallStatement.setFunctionDefinition(functionDefinition);

    functionCallStatement.getExpressions().forEach(expression -> expression.accept(this, param));

    return null;
  }

  // class FunctionCallExpression(String name, List<Expression> expressions)
  // phase Identification { FunctionDefinition functionDefinition }
  @Override
  public Object visit(FunctionCallExpression functionCallExpression, Object param) {

    FunctionDefinition functionDefinition =
        functionDefinitions.get(functionCallExpression.getName());

    if (functionDefinition == null) {
      notifyError(
          "Function " + functionCallExpression.getName() + " not defined", functionCallExpression);
      return null;
    }

    functionCallExpression.setFunctionDefinition(functionDefinition);

    functionCallExpression.getExpressions().forEach(expression -> expression.accept(this, param));

    return null;
  }

  // Auxiliary Methods --------------------------------------------------------------

  private void notifyError(String msg, AST node) {
    notifyError(msg, node.start());
  }

  private void notifyError(String msg, Position position) {
    errorManager.notify("Identification", msg, position);
  }
}
