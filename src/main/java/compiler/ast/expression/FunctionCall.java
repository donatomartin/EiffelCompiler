// Generated with VGen 2.0.0

package compiler.ast.expression;

import compiler.ast.definition.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import compiler.visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	functionCall: expression -> name:string expressions:expression*
	expression -> 
	
	PHASE Identification
	functionCall -> functionDefinition:functionDefinition
*/
public class FunctionCall extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// functionCall: expression -> string expression*
	private String name;
	private List<Expression> expressions;

    // PHASE Identification
	private FunctionDefinition functionDefinition;

    // ----------------------------------
    // Constructors

	public FunctionCall(String name, List<Expression> expressions) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (expressions == null)
			expressions = new ArrayList<>();
		this.expressions = expressions;

		updatePositions(name, expressions);
	}

	public FunctionCall(Object name, Object expressions) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.expressions = castList(expressions, unwrapIfContext.andThen(Expression.class::cast));
		updatePositions(name, expressions);
	}


    // ----------------------------------
    // functionCall: expression -> string expression*

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


	// Child 'expression*' 

	public void setExpressions(List<Expression> expressions) {
		if (expressions == null)
			expressions = new ArrayList<>();
		this.expressions = expressions;

	}

    public List<Expression> getExpressions() {
        return expressions;
    }

    public Stream<Expression> expressions() {
        return expressions.stream();
    }



    // --------------------------------
    // PHASE Identification

	// Attribute 'functionDefinition' 

	public void setFunctionDefinition(FunctionDefinition functionDefinition) {
		if (functionDefinition == null)
			throw new IllegalArgumentException("Parameter 'functionDefinition' can't be null. Pass a non-null value or use 'functionDefinition?' in the abstract grammar");
		this.functionDefinition = functionDefinition;

	}

    public FunctionDefinition getFunctionDefinition() {
        return functionDefinition;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "FunctionCall{" + " name=" + this.getName() + " expressions=" + this.getExpressions() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
