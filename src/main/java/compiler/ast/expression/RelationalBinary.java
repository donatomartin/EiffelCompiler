// Generated with VGen 2.0.0

package compiler.ast.expression;

import compiler.ast.type.*;
import org.antlr.v4.runtime.Token;
import compiler.visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	relationalBinary: expression -> left:expression operator:string right:expression
	expression -> 
	
	PHASE TypeChecking
	expression -> lvalue:boolean
	expression -> expressionType:type
*/
public class RelationalBinary extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// relationalBinary: expression -> left:expression operator:string right:expression
	private Expression left;
	private String operator;
	private Expression right;

    // ----------------------------------
    // Constructors

	public RelationalBinary(Expression left, String operator, Expression right) {
		super();

		if (left == null)
			throw new IllegalArgumentException("Parameter 'left' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.left = left;

		if (operator == null)
			throw new IllegalArgumentException("Parameter 'operator' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operator = operator;

		if (right == null)
			throw new IllegalArgumentException("Parameter 'right' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.right = right;

		updatePositions(left, operator, right);
	}

	public RelationalBinary(Object left, Object operator, Object right) {
		super();

        if (left == null)
            throw new IllegalArgumentException("Parameter 'left' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.left = (Expression) left;

        if (operator == null)
            throw new IllegalArgumentException("Parameter 'operator' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operator = (operator instanceof Token) ? ((Token) operator).getText() : (String) operator;

        if (right == null)
            throw new IllegalArgumentException("Parameter 'right' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.right = (Expression) right;

		updatePositions(left, operator, right);
	}


    // ----------------------------------
    // relationalBinary: expression -> left:expression operator:string right:expression

	// Child 'left:expression' 

	public void setLeft(Expression left) {
		if (left == null)
			throw new IllegalArgumentException("Parameter 'left' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.left = left;

	}

    public Expression getLeft() {
        return left;
    }


	// Child 'operator:string' 

	public void setOperator(String operator) {
		if (operator == null)
			throw new IllegalArgumentException("Parameter 'operator' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.operator = operator;

	}

    public String getOperator() {
        return operator;
    }


	// Child 'right:expression' 

	public void setRight(Expression right) {
		if (right == null)
			throw new IllegalArgumentException("Parameter 'right' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.right = right;

	}

    public Expression getRight() {
        return right;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "RelationalBinary{" + " left=" + this.getLeft() + " operator=" + this.getOperator() + " right=" + this.getRight() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
