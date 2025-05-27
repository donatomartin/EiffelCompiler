// Generated with VGen 2.0.0

package compiler.ast.expression;

import compiler.ast.*;
import compiler.ast.type.*;
import org.antlr.v4.runtime.Token;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	expression -> 
	
	PHASE TypeChecking
	expression -> lvalue:boolean
	expression -> expressionType:type
*/
public abstract class AbstractExpression extends AbstractAST implements Expression {

    // ----------------------------------
    // Instance Variables


    // PHASE TypeChecking
	private boolean lvalue;
	private Type expressionType;



    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'lvalue:boolean' 

	public void setLvalue(boolean lvalue) {
		this.lvalue = lvalue;

	}

    public boolean isLvalue() {
        return lvalue;
    }


	// Attribute 'expressionType:type' 

	public void setExpressionType(Type expressionType) {
		if (expressionType == null)
			throw new IllegalArgumentException("Parameter 'expressionType' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.expressionType = expressionType;

	}

    public Type getExpressionType() {
        return expressionType;
    }



    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
