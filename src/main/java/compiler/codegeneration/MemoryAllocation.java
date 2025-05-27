package compiler.codegeneration;

import compiler.ast.*;
import compiler.ast.definition.FunctionDefinition;
import compiler.ast.definition.StructDefinition;
import compiler.ast.definition.VarDefinition;
import compiler.visitor.DefaultVisitor;

// This class will be implemented in memory allocation phase

public class MemoryAllocation extends DefaultVisitor {
  
  public void process(AST ast) {
    ast.accept(this, null);
  };

  @Override
  public Object visit(GlobalSection globalSection, Object param) {

    int address = 0;

    for (StructDefinition structDefinition : globalSection.getStructDefinitions()) {
      structDefinition.accept(this, param);
    }

    for (VarDefinition varDefinition : globalSection.getVarDefinitions()) {
      varDefinition.setAddress(address);
      address += varDefinition.getType().getSize();
    }

    return null;
  }

  @Override
  public Object visit(FunctionDefinition functionDefinition, Object param) {

    super.visit(functionDefinition, param);

    int paramOffset = 4;

    for (var parameter : functionDefinition.getParameters()) {
      parameter.setAddress(paramOffset);
      paramOffset += parameter.getType().getSize();
    }

    int localVariablesOffset = 0;

    for (var localVariable : functionDefinition.getLocals()) {
      localVariable.setAddress(localVariablesOffset);
      localVariablesOffset -= localVariable.getType().getSize();
      localVariable.accept(this, param);
    }

    return null;
  }

  @Override
  public Object visit(StructDefinition structDefinition, Object param) {

    super.visit(structDefinition, param);

    int offset = 0;

    for (var fieldDefinition : structDefinition.getFieldDefinitions()) {
      fieldDefinition.setAddress(offset);
      offset += fieldDefinition.getType().getSize();
    }

    return null;
  }
}
