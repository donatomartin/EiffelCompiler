// Generated with VGen 2.0.0

package ast.expression;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	logicUnary: expression -> opeartor:string e:expression
	expression -> 
*/
public class LogicUnary extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// logicUnary: expression -> opeartor:string e:expression
	private String opeartor;
	private Expression e;

    // ----------------------------------
    // Constructors

	public LogicUnary(String opeartor, Expression e) {
		super();

		if (opeartor == null)
			throw new IllegalArgumentException("Parameter 'opeartor' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.opeartor = opeartor;

		if (e == null)
			throw new IllegalArgumentException("Parameter 'e' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e = e;

		updatePositions(opeartor, e);
	}

	public LogicUnary(Object opeartor, Object e) {
		super();

        if (opeartor == null)
            throw new IllegalArgumentException("Parameter 'opeartor' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.opeartor = (opeartor instanceof Token) ? ((Token) opeartor).getText() : (String) opeartor;

        if (e == null)
            throw new IllegalArgumentException("Parameter 'e' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e = (Expression) e;

		updatePositions(opeartor, e);
	}


    // ----------------------------------
    // logicUnary: expression -> opeartor:string e:expression

	// Child 'opeartor:string' 

	public void setOpeartor(String opeartor) {
		if (opeartor == null)
			throw new IllegalArgumentException("Parameter 'opeartor' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.opeartor = opeartor;

	}

    public String getOpeartor() {
        return opeartor;
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
        return "LogicUnary{" + " opeartor=" + this.getOpeartor() + " e=" + this.getE() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
