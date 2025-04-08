// Generated with VGen 2.0.0

package compiler.ast.statement;

import compiler.ast.expression.*;
import compiler.ast.definition.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import compiler.visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	loop: statement -> fromStatements:statement* expression:expression loopStatements:statement*
	statement -> 
	
	PHASE TypeChecking
	statement -> function:functionDefinition
*/
public class Loop extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// loop: statement -> fromStatements:statement* expression loopStatements:statement*
	private List<Statement> fromStatements;
	private Expression expression;
	private List<Statement> loopStatements;

    // ----------------------------------
    // Constructors

	public Loop(List<Statement> fromStatements, Expression expression, List<Statement> loopStatements) {
		super();

		if (fromStatements == null)
			fromStatements = new ArrayList<>();
		this.fromStatements = fromStatements;

		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

		if (loopStatements == null)
			loopStatements = new ArrayList<>();
		this.loopStatements = loopStatements;

		updatePositions(fromStatements, expression, loopStatements);
	}

	public Loop(Object fromStatements, Object expression, Object loopStatements) {
		super();

        this.fromStatements = castList(fromStatements, unwrapIfContext.andThen(Statement.class::cast));
        if (expression == null)
            throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = (Expression) expression;

        this.loopStatements = castList(loopStatements, unwrapIfContext.andThen(Statement.class::cast));
		updatePositions(fromStatements, expression, loopStatements);
	}


    // ----------------------------------
    // loop: statement -> fromStatements:statement* expression loopStatements:statement*

	// Child 'fromStatements:statement*' 

	public void setFromStatements(List<Statement> fromStatements) {
		if (fromStatements == null)
			fromStatements = new ArrayList<>();
		this.fromStatements = fromStatements;

	}

    public List<Statement> getFromStatements() {
        return fromStatements;
    }

    public Stream<Statement> fromStatements() {
        return fromStatements.stream();
    }


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
        return "Loop{" + " fromStatements=" + this.getFromStatements() + " expression=" + this.getExpression() + " loopStatements=" + this.getLoopStatements() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
