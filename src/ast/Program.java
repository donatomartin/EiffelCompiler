// Generated with VGen 2.0.0

package ast;

import ast.definition.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	program -> name:string globalSection:globalSection functionCreations:functionCreation* functionDefinitions:functionDefinition* run:run
*/
public class Program extends AbstractAST  {

    // ----------------------------------
    // Instance Variables

	// program -> string globalSection functionCreation* functionDefinition* run
	private String name;
	private GlobalSection globalSection;
	private List<FunctionCreation> functionCreations;
	private List<FunctionDefinition> functionDefinitions;
	private Run run;

    // ----------------------------------
    // Constructors

	public Program(String name, GlobalSection globalSection, List<FunctionCreation> functionCreations, List<FunctionDefinition> functionDefinitions, Run run) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (globalSection == null)
			throw new IllegalArgumentException("Parameter 'globalSection' can't be null. Pass a non-null value or use 'globalSection?' in the abstract grammar");
		this.globalSection = globalSection;

		if (functionCreations == null)
			functionCreations = new ArrayList<>();
		this.functionCreations = functionCreations;

		if (functionDefinitions == null)
			functionDefinitions = new ArrayList<>();
		this.functionDefinitions = functionDefinitions;

		if (run == null)
			throw new IllegalArgumentException("Parameter 'run' can't be null. Pass a non-null value or use 'run?' in the abstract grammar");
		this.run = run;

		updatePositions(name, globalSection, functionCreations, functionDefinitions, run);
	}

	public Program(Object name, Object globalSection, Object functionCreations, Object functionDefinitions, Object run) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        if (globalSection == null)
            throw new IllegalArgumentException("Parameter 'globalSection' can't be null. Pass a non-null value or use 'globalSection?' in the abstract grammar");
		this.globalSection = (GlobalSection) globalSection;

        this.functionCreations = castList(functionCreations, unwrapIfContext.andThen(FunctionCreation.class::cast));
        this.functionDefinitions = castList(functionDefinitions, unwrapIfContext.andThen(FunctionDefinition.class::cast));
        if (run == null)
            throw new IllegalArgumentException("Parameter 'run' can't be null. Pass a non-null value or use 'run?' in the abstract grammar");
		this.run = (Run) run;

		updatePositions(name, globalSection, functionCreations, functionDefinitions, run);
	}


    // ----------------------------------
    // program -> string globalSection functionCreation* functionDefinition* run

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


	// Child 'globalSection' 

	public void setGlobalSection(GlobalSection globalSection) {
		if (globalSection == null)
			throw new IllegalArgumentException("Parameter 'globalSection' can't be null. Pass a non-null value or use 'globalSection?' in the abstract grammar");
		this.globalSection = globalSection;

	}

    public GlobalSection getGlobalSection() {
        return globalSection;
    }


	// Child 'functionCreation*' 

	public void setFunctionCreations(List<FunctionCreation> functionCreations) {
		if (functionCreations == null)
			functionCreations = new ArrayList<>();
		this.functionCreations = functionCreations;

	}

    public List<FunctionCreation> getFunctionCreations() {
        return functionCreations;
    }

    public Stream<FunctionCreation> functionCreations() {
        return functionCreations.stream();
    }


	// Child 'functionDefinition*' 

	public void setFunctionDefinitions(List<FunctionDefinition> functionDefinitions) {
		if (functionDefinitions == null)
			functionDefinitions = new ArrayList<>();
		this.functionDefinitions = functionDefinitions;

	}

    public List<FunctionDefinition> getFunctionDefinitions() {
        return functionDefinitions;
    }

    public Stream<FunctionDefinition> functionDefinitions() {
        return functionDefinitions.stream();
    }


	// Child 'run' 

	public void setRun(Run run) {
		if (run == null)
			throw new IllegalArgumentException("Parameter 'run' can't be null. Pass a non-null value or use 'run?' in the abstract grammar");
		this.run = run;

	}

    public Run getRun() {
        return run;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Program{" + " name=" + this.getName() + " globalSection=" + this.getGlobalSection() + " functionCreations=" + this.getFunctionCreations() + " functionDefinitions=" + this.getFunctionDefinitions() + " run=" + this.getRun() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
