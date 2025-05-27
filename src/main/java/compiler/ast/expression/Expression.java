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
public interface Expression extends AST {




    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'lvalue:boolean' 

	public void setLvalue(boolean lvalue);
	public boolean isLvalue();

	// Attribute 'expressionType:type' 

	public void setExpressionType(Type expressionType);
	public Type getExpressionType();


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
