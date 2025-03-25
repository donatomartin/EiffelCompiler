// Generated with VGen 2.0.0

package compiler.ast;

import compiler.ast.definition.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import compiler.visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	globalSection -> structDefinitions:structDefinition* varDefinitions:varDefinition*
*/
public class GlobalSection extends AbstractAST  {

    // ----------------------------------
    // Instance Variables

	// globalSection -> structDefinition* varDefinition*
	private List<StructDefinition> structDefinitions;
	private List<VarDefinition> varDefinitions;

    // ----------------------------------
    // Constructors

	public GlobalSection(List<StructDefinition> structDefinitions, List<VarDefinition> varDefinitions) {
		super();

		if (structDefinitions == null)
			structDefinitions = new ArrayList<>();
		this.structDefinitions = structDefinitions;

		if (varDefinitions == null)
			varDefinitions = new ArrayList<>();
		this.varDefinitions = varDefinitions;

		updatePositions(structDefinitions, varDefinitions);
	}

	public GlobalSection(Object structDefinitions, Object varDefinitions) {
		super();

        this.structDefinitions = castList(structDefinitions, unwrapIfContext.andThen(StructDefinition.class::cast));
        this.varDefinitions = castList(varDefinitions, unwrapIfContext.andThen(VarDefinition.class::cast));
		updatePositions(structDefinitions, varDefinitions);
	}


    // ----------------------------------
    // globalSection -> structDefinition* varDefinition*

	// Child 'structDefinition*' 

	public void setStructDefinitions(List<StructDefinition> structDefinitions) {
		if (structDefinitions == null)
			structDefinitions = new ArrayList<>();
		this.structDefinitions = structDefinitions;

	}

    public List<StructDefinition> getStructDefinitions() {
        return structDefinitions;
    }

    public Stream<StructDefinition> structDefinitions() {
        return structDefinitions.stream();
    }


	// Child 'varDefinition*' 

	public void setVarDefinitions(List<VarDefinition> varDefinitions) {
		if (varDefinitions == null)
			varDefinitions = new ArrayList<>();
		this.varDefinitions = varDefinitions;

	}

    public List<VarDefinition> getVarDefinitions() {
        return varDefinitions;
    }

    public Stream<VarDefinition> varDefinitions() {
        return varDefinitions.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "GlobalSection{" + " structDefinitions=" + this.getStructDefinitions() + " varDefinitions=" + this.getVarDefinitions() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
