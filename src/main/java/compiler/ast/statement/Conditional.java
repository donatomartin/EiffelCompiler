// Generated with VGen 2.0.0

package compiler.ast.statement;

import compiler.ast.expression.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import compiler.visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	conditional: statement -> expression:expression ifStatements:statement* elseStatements:statement*
	statement -> 
*/
public class Conditional extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// conditional: statement -> expression ifStatements:statement* elseStatements:statement*
	private Expression expression;
	private List<Statement> ifStatements;
	private List<Statement> elseStatements;

    // ----------------------------------
    // Constructors

	public Conditional(Expression expression, List<Statement> ifStatements, List<Statement> elseStatements) {
		super();

		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

		if (ifStatements == null)
			ifStatements = new ArrayList<>();
		this.ifStatements = ifStatements;

		if (elseStatements == null)
			elseStatements = new ArrayList<>();
		this.elseStatements = elseStatements;

		updatePositions(expression, ifStatements, elseStatements);
	}

	public Conditional(Object expression, Object ifStatements, Object elseStatements) {
		super();

        if (expression == null)
            throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = (Expression) expression;

        this.ifStatements = castList(ifStatements, unwrapIfContext.andThen(Statement.class::cast));
        this.elseStatements = castList(elseStatements, unwrapIfContext.andThen(Statement.class::cast));
		updatePositions(expression, ifStatements, elseStatements);
	}


    // ----------------------------------
    // conditional: statement -> expression ifStatements:statement* elseStatements:statement*

	// Child 'expression' 

	public void setExpression(Expression expression) {
		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

	}

    public Expression getExpression() {
        return expression;
    }


	// Child 'ifStatements:statement*' 

	public void setIfStatements(List<Statement> ifStatements) {
		if (ifStatements == null)
			ifStatements = new ArrayList<>();
		this.ifStatements = ifStatements;

	}

    public List<Statement> getIfStatements() {
        return ifStatements;
    }

    public Stream<Statement> ifStatements() {
        return ifStatements.stream();
    }


	// Child 'elseStatements:statement*' 

	public void setElseStatements(List<Statement> elseStatements) {
		if (elseStatements == null)
			elseStatements = new ArrayList<>();
		this.elseStatements = elseStatements;

	}

    public List<Statement> getElseStatements() {
        return elseStatements;
    }

    public Stream<Statement> elseStatements() {
        return elseStatements.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Conditional{" + " expression=" + this.getExpression() + " ifStatements=" + this.getIfStatements() + " elseStatements=" + this.getElseStatements() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
