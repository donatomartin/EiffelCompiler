// Generated with VGen 2.0.0

package compiler.ast.expression;

import org.antlr.v4.runtime.Token;
import compiler.visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	structAccess: expression -> e:expression name:string
	expression -> 
*/
public class StructAccess extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// structAccess: expression -> e:expression string
	private Expression e;
	private String name;

    // ----------------------------------
    // Constructors

	public StructAccess(Expression e, String name) {
		super();

		if (e == null)
			throw new IllegalArgumentException("Parameter 'e' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e = e;

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		updatePositions(e, name);
	}

	public StructAccess(Object e, Object name) {
		super();

        if (e == null)
            throw new IllegalArgumentException("Parameter 'e' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e = (Expression) e;

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

		updatePositions(e, name);
	}


    // ----------------------------------
    // structAccess: expression -> e:expression string

	// Child 'e:expression' 

	public void setE(Expression e) {
		if (e == null)
			throw new IllegalArgumentException("Parameter 'e' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e = e;

	}

    public Expression getE() {
        return e;
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
        return "StructAccess{" + " e=" + this.getE() + " name=" + this.getName() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
