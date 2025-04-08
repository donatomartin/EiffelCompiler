// Generated with VGen 2.0.0

package compiler.ast.expression;

import compiler.ast.type.*;
import org.antlr.v4.runtime.Token;
import compiler.visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	logicUnary: expression -> operator:string expr:expression
	expression -> 
	
	PHASE TypeChecking
	expression -> lvalue:boolean
	expression -> type:type
*/
public class LogicUnary extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// logicUnary: expression -> operator:string expr:expression
	private String operator;
	private Expression expr;

    // ----------------------------------
    // Constructors

	public LogicUnary(String operator, Expression expr) {
		super();

		if (operator == null)
			throw new IllegalArgumentException("Parameter 'operator' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operator = operator;

		if (expr == null)
			throw new IllegalArgumentException("Parameter 'expr' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expr = expr;

		updatePositions(operator, expr);
	}

	public LogicUnary(Object operator, Object expr) {
		super();

        if (operator == null)
            throw new IllegalArgumentException("Parameter 'operator' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operator = (operator instanceof Token) ? ((Token) operator).getText() : (String) operator;

        if (expr == null)
            throw new IllegalArgumentException("Parameter 'expr' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expr = (Expression) expr;

		updatePositions(operator, expr);
	}


    // ----------------------------------
    // logicUnary: expression -> operator:string expr:expression

	// Child 'operator:string' 

	public void setOperator(String operator) {
		if (operator == null)
			throw new IllegalArgumentException("Parameter 'operator' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operator = operator;

	}

    public String getOperator() {
        return operator;
    }


	// Child 'expr:expression' 

	public void setExpr(Expression expr) {
		if (expr == null)
			throw new IllegalArgumentException("Parameter 'expr' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expr = expr;

	}

    public Expression getExpr() {
        return expr;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "LogicUnary{" + " operator=" + this.getOperator() + " expr=" + this.getExpr() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
