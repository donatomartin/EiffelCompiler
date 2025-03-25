// Generated with VGen 2.0.0

package compiler.ast.expression;

import org.antlr.v4.runtime.Token;
import compiler.visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	arithmeticUnary: expression -> operator:string e:expression
	expression -> 
*/
public class ArithmeticUnary extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// arithmeticUnary: expression -> operator:string e:expression
	private String operator;
	private Expression e;

    // ----------------------------------
    // Constructors

	public ArithmeticUnary(String operator, Expression e) {
		super();

		if (operator == null)
			throw new IllegalArgumentException("Parameter 'operator' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operator = operator;

		if (e == null)
			throw new IllegalArgumentException("Parameter 'e' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e = e;

		updatePositions(operator, e);
	}

	public ArithmeticUnary(Object operator, Object e) {
		super();

        if (operator == null)
            throw new IllegalArgumentException("Parameter 'operator' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operator = (operator instanceof Token) ? ((Token) operator).getText() : (String) operator;

        if (e == null)
            throw new IllegalArgumentException("Parameter 'e' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e = (Expression) e;

		updatePositions(operator, e);
	}


    // ----------------------------------
    // arithmeticUnary: expression -> operator:string e:expression

	// Child 'operator:string' 

	public void setOperator(String operator) {
		if (operator == null)
			throw new IllegalArgumentException("Parameter 'operator' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operator = operator;

	}

    public String getOperator() {
        return operator;
    }


	// Child 'e:expression' 

	public void setE(Expression e) {
		if (e == null)
			throw new IllegalArgumentException("Parameter 'e' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e = e;

	}

    public Expression getE() {
        return e;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "ArithmeticUnary{" + " operator=" + this.getOperator() + " e=" + this.getE() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
