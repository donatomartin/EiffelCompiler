// Generated with VGen 2.0.0

package ast.statement;

import ast.expression.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	while: statement -> expression:expression loopStatements:statement*
	statement -> 
*/
public class While extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// while: statement -> expression loopStatements:statement*
	private Expression expression;
	private List<Statement> loopStatements;

    // ----------------------------------
    // Constructors

	public While(Expression expression, List<Statement> loopStatements) {
		super();

		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

		if (loopStatements == null)
			loopStatements = new ArrayList<>();
		this.loopStatements = loopStatements;

		updatePositions(expression, loopStatements);
	}

	public While(Object expression, Object loopStatements) {
		super();

        if (expression == null)
            throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = (Expression) expression;

        this.loopStatements = castList(loopStatements, unwrapIfContext.andThen(Statement.class::cast));
		updatePositions(expression, loopStatements);
	}


    // ----------------------------------
    // while: statement -> expression loopStatements:statement*

	// Child 'expression' 

	public void setExpression(Expression expression) {
		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

	}

    public Expression getExpression() {
        return expression;
    }


	// Child 'loopStatements:statement*' 

	public void setLoopStatements(List<Statement> loopStatements) {
		if (loopStatements == null)
			loopStatements = new ArrayList<>();
		this.loopStatements = loopStatements;

	}

    public List<Statement> getLoopStatements() {
        return loopStatements;
    }

    public Stream<Statement> loopStatements() {
        return loopStatements.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "While{" + " expression=" + this.getExpression() + " loopStatements=" + this.getLoopStatements() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
