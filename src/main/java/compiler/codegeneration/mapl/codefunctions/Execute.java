// Generated with VGen 2.0.0

package compiler.codegeneration.mapl.codefunctions;

import compiler.ast.AST;
import compiler.ast.Position;
import compiler.ast.definition.FunctionDefinition;
import compiler.ast.definition.StructDefinition;
import compiler.ast.definition.VarDefinition;
import compiler.ast.statement.Assignment;
import compiler.ast.statement.Conditional;
import compiler.ast.statement.FunctionCallStatement;
import compiler.ast.statement.Loop;
import compiler.ast.statement.Print;
import compiler.ast.statement.Println;
import compiler.ast.statement.Read;
import compiler.ast.statement.Return;
import compiler.codegeneration.mapl.AbstractCodeFunction;
import compiler.codegeneration.mapl.MaplCodeSpecification;

public class Execute extends AbstractCodeFunction {
  
  private int labelCount;

  public Execute(MaplCodeSpecification specification) {
    super(specification);
    labelCount = 0;
  }

  @Override
  public Object visit(FunctionDefinition functionDefinition, Object param) {

    out(functionDefinition.getName() + ":");

    // Return type size
    int cte1 = 0;
    if (functionDefinition.getType().isPresent()) {
      cte1 = functionDefinition.getType().get().getSize();
    }

    // Local Variables size
    int cte2 = functionDefinition.locals().mapToInt(varDef -> varDef.getType().getSize()).sum();

    out("enter " + cte2);

    // Function parameters size
    int cte3 =
        functionDefinition.parameters().mapToInt(paramDef -> paramDef.getType().getSize()).sum();


    int[] cts = new int[] {cte1, cte2, cte3};
    execute(functionDefinition.statements(), cts);

    if (cte1 == 0) out("ret " + cte1 + "," + cte2 + "," + cte3);

    return null;
  }

  @Override
  public Object visit(StructDefinition structDefinition, Object param) {

    return null;
  }

  @Override
  public Object visit(VarDefinition varDefinition, Object param) {

    return null;
  }

  @Override
  public Object visit(compiler.ast.Run run, Object param) {

    out("main:");    
    out("call " + run.getName());
    out("ret 0,0,0");
    
    
    return null;
        
  }

  // class Print(List<Expression> expressions)
  // phase TypeChecking { FunctionDefinition function }
  @Override
  public Object visit(Print print, Object param) {
    
    if (print.getExpressions().isEmpty()) {
      out("pushb 0");
      out("outb");
      return null;
    }

    line(print);

		print.getExpressions().stream().forEach(x -> {
			value(x);
			out("out", x.getExpressionType());
		});

		return null;
  }

  // class Println(List<Expression> expressions)
  // phase TypeChecking { FunctionDefinition function }
  @Override
  public Object visit(Println println, Object param) {
    
    if (println.getExpressions().isEmpty()) {
      outLn();
      return null;
    }

    line(println);

		println.expressions().forEach(x -> {
			value(x);
			out("out", x.getExpressionType());
			outLn();
		});
	
		if(println.getExpressions().isEmpty()) {
			outLn();
		}
		
		return null;
  }

  // class Read(List<Expression> expressions)
  // phase TypeChecking { FunctionDefinition function }
  @Override
  public Object visit(Read read, Object param) {

    for (var expression : read.getExpressions()) {
      address(expression);
      out("in", expression.getExpressionType());
      out("store", expression.getExpressionType());
    }

    return null;
  }

  // class FunctionCallStatement(String name, List<Expression> expressions)
  // phase Identification { FunctionDefinition functionDefinition }
  // phase TypeChecking { FunctionDefinition function }
  @Override
  public Object visit(FunctionCallStatement functionCallStatement, Object param) {

    // value(functionCallStatement.expressions());
    // address(functionCallStatement.expressions());

		line(functionCallStatement);
		
		value(functionCallStatement);
		
		if(functionCallStatement.getFunctionDefinition().getType().isPresent()) {
			out("pop", functionCallStatement.getFunctionDefinition().getType().get());
		}

		return null;

  }

  // class Assignment(Expression left, Expression right)
  // phase TypeChecking { FunctionDefinition function }
  @Override
  public Object visit(Assignment assignment, Object param) {

    line(assignment);

		address(assignment.getLeft());
		value(assignment.getRight());
		out("store", assignment.getLeft().getExpressionType());

		return null;
  }

  // class Conditional(Expression expression, List<Statement> ifStatements, List<Statement>
  // elseStatements)
  // phase TypeChecking { FunctionDefinition function }
  @Override
  public Object visit(Conditional conditional, Object param) {

		String jzLabel = "label" + labelCount++;
		String jmpLabel = "label" + labelCount++;
		
		line(conditional.getExpression());

		value(conditional.getExpression());
		
		out("jz " + jzLabel);
		execute(conditional.ifStatements(), param);
		out("jmp " + jmpLabel);
		out(jzLabel + ":");
		execute(conditional.elseStatements(), param);
		out(jmpLabel + ":");
				
		return null;
  }

  // class Loop(List<Statement> fromStatements, Expression expression, List<Statement>
  // loopStatements)
  // phase TypeChecking { FunctionDefinition function }
  @Override
  public Object visit(Loop loop, Object param) {

    String exitLabel = "label" + labelCount++;
		String loopLabel = "label" + labelCount++;
		
		line(loop.getExpression());
		
		execute(loop.fromStatements(), param);

		out(loopLabel + ":");
		value(loop.getExpression());
		out("jnz " + exitLabel);
		
		execute(loop.loopStatements(), param);
		
		out("jmp " + loopLabel);
		out(exitLabel + ":");

		return null;
  }

  // class Return(Optional<Expression> expression)
  // phase TypeChecking { FunctionDefinition function }
  @Override
  public Object visit(Return returnValue, Object param) {


		int[] ctes = (int[]) param;
		line(returnValue);

		if(ctes[0] != 0) {
			value(returnValue.getExpression());
			out("ret " + ctes[0] + "," + ctes[1] + "," + ctes[2]);
		}
	
		return null;

  }

  private void outLn() {
    int ln = '\n';
    out("pushb " + ln);
    out("outb");
  }

  private void line(AST node) {
    line(node.end());
  }

  private void line(Position pos) {
    if (pos != null) out("\n#line " + pos.getLine());
    else
      System.out.println(
          "#line no generado. Se ha pasado una Position null. Falta información en el AST");
  }
}