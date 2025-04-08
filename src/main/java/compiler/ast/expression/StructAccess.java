// Generated with VGen 2.0.0

package compiler.ast.expression;

import compiler.ast.type.*;
import org.antlr.v4.runtime.Token;
import compiler.visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	structAccess: expression -> expr:expression name:string
	expression -> 
	
	PHASE TypeChecking
	expression -> lvalue:boolean
	expression -> type:type
*/
public class StructAccess extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// structAccess: expression -> expr:expression string
	private Expression expr;
	private String name;

    // ----------------------------------
    // Constructors

	public StructAccess(Expression expr, String name) {
		super();

		if (expr == null)
			throw new IllegalArgumentException("Parameter 'expr' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expr = expr;

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		updatePositions(expr, name);
	}

	public StructAccess(Object expr, Object name) {
		super();

        if (expr == null)
            throw new IllegalArgumentException("Parameter 'expr' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expr = (Expression) expr;

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

		updatePositions(expr, name);
	}


    // ----------------------------------
    // structAccess: expression -> expr:expression string

	// Child 'expr:expression' 

	public void setExpr(Expression expr) {
		if (expr == null)
			throw new IllegalArgumentException("Parameter 'expr' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expr = expr;

	}

    public Expression getExpr() {
        return expr;
    }


	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "StructAccess{" + " expr=" + this.getExpr() + " name=" + this.getName() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
