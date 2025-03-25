package compiler.codegeneration.mapl;

import compiler.ast.AST;
import java.io.*;

// This class will be implemented in code generation phase

public class MaplCodeSpecification {

  private String sourceFile;
  private PrintWriter printWriter;

  public MaplCodeSpecification(String sourceFile, Writer writer) {

    this.sourceFile = sourceFile;
    this.printWriter = new PrintWriter(writer);
  }

  public void process(AST ast) {
    // 📅 TODO: Implement this method

  }
}
