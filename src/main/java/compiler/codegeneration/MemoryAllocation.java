package compiler.codegeneration;

import compiler.ast.*;
import compiler.visitor.DefaultVisitor;

// This class will be implemented in memory allocation phase

public class MemoryAllocation extends DefaultVisitor {

  public void process(AST ast) {
    ast.accept(this, null);
  }
}
