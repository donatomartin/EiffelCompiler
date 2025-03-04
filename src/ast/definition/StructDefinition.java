// Generated with VGen 2.0.0

package ast.definition;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	structDefinition: definition -> name:string varDefinitions:varDefinition*
	definition -> 
*/
public class StructDefinition extends AbstractDefinition  {

    // ----------------------------------
    // Instance Variables

	// structDefinition: definition -> string varDefinition*
	private String name;
	private List<VarDefinition> varDefinitions;

    // ----------------------------------
    // Constructors

	public StructDefinition(String name, List<VarDefinition> varDefinitions) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (varDefinitions == null)
			varDefinitions = new ArrayList<>();
		this.varDefinitions = varDefinitions;

		updatePositions(name, varDefinitions);
	}

	public StructDefinition(Object name, Object varDefinitions) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.varDefinitions = castList(varDefinitions, unwrapIfContext.andThen(VarDefinition.class::cast));
		updatePositions(name, varDefinitions);
	}


    // ----------------------------------
    // structDefinition: definition -> string varDefinition*

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
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
        return "StructDefinition{" + " name=" + this.getName() + " varDefinitions=" + this.getVarDefinitions() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
