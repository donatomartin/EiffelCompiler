// Generated with VGen 2.0.0

package compiler.ast.definition;

import compiler.ast.type.*;
import compiler.ast.statement.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Optional;
import org.antlr.v4.runtime.Token;
import compiler.visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	functionDefinition: definition -> name:string parameters:varDefinition* type:type? locals:varDefinition* statements:statement*
	definition -> 
	
	PHASE TypeChecking
	functionDefinition -> hasReturn:boolean
	
	PHASE MemoryAllocation
	functionDefinition -> address:int
*/
public class FunctionDefinition extends AbstractDefinition  {

    // ----------------------------------
    // Instance Variables

	// functionDefinition: definition -> string parameters:varDefinition* type? locals:varDefinition* statement*
	private String name;
	private List<VarDefinition> parameters;
	private Optional<Type> type;
	private List<VarDefinition> locals;
	private List<Statement> statements;

    // PHASE TypeChecking
	private boolean hasReturn;

    // PHASE MemoryAllocation
	private int address;

    // ----------------------------------
    // Constructors

	public FunctionDefinition(String name, List<VarDefinition> parameters, Optional<Type> type, List<VarDefinition> locals, List<Statement> statements) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (parameters == null)
			parameters = new ArrayList<>();
		this.parameters = parameters;

		if (type == null)
			type = Optional.empty();
		this.type = type;

		if (locals == null)
			locals = new ArrayList<>();
		this.locals = locals;

		if (statements == null)
			statements = new ArrayList<>();
		this.statements = statements;

		updatePositions(name, parameters, type, locals, statements);
	}

	public FunctionDefinition(Object name, Object parameters, Object type, Object locals, Object statements) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.parameters = castList(parameters, unwrapIfContext.andThen(VarDefinition.class::cast));
        this.type = castOptional(type, Type.class);
        this.locals = castList(locals, unwrapIfContext.andThen(VarDefinition.class::cast));
        this.statements = castList(statements, unwrapIfContext.andThen(Statement.class::cast));
		updatePositions(name, parameters, type, locals, statements);
	}


    // ----------------------------------
    // functionDefinition: definition -> string parameters:varDefinition* type? locals:varDefinition* statement*

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


	// Child 'parameters:varDefinition*' 

	public void setParameters(List<VarDefinition> parameters) {
		if (parameters == null)
			parameters = new ArrayList<>();
		this.parameters = parameters;

	}

    public List<VarDefinition> getParameters() {
        return parameters;
    }

    public Stream<VarDefinition> parameters() {
        return parameters.stream();
    }


	// Child 'type?' 

	public void setType(Optional<Type> type) {
		if (type == null)
			type = Optional.empty();
		this.type = type;

	}

    public Optional<Type> getType() {
        return type;
    }


	// Child 'locals:varDefinition*' 

	public void setLocals(List<VarDefinition> locals) {
		if (locals == null)
			locals = new ArrayList<>();
		this.locals = locals;

	}

    public List<VarDefinition> getLocals() {
        return locals;
    }

    public Stream<VarDefinition> locals() {
        return locals.stream();
    }


	// Child 'statement*' 

	public void setStatements(List<Statement> statements) {
		if (statements == null)
			statements = new ArrayList<>();
		this.statements = statements;

	}

    public List<Statement> getStatements() {
        return statements;
    }

    public Stream<Statement> statements() {
        return statements.stream();
    }



    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'hasReturn:boolean' 

	public void setHasReturn(boolean hasReturn) {
		this.hasReturn = hasReturn;

	}

    public boolean isHasReturn() {
        return hasReturn;
    }



    // --------------------------------
    // PHASE MemoryAllocation

	// Attribute 'address:int' 

	public void setAddress(int address) {
		this.address = address;

	}

    public int getAddress() {
        return address;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "FunctionDefinition{" + " name=" + this.getName() + " parameters=" + this.getParameters() + " type=" + this.getType() + " locals=" + this.getLocals() + " statements=" + this.getStatements() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
