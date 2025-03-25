// Generated with VGen 2.0.0

package compiler.ast.definition;

import compiler.ast.type.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import compiler.visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	varDefinition: definition -> strings:string* type:type
	definition -> 
*/
public class VarDefinition extends AbstractDefinition  {

    // ----------------------------------
    // Instance Variables

	// varDefinition: definition -> string* type
	private List<String> strings;
	private Type type;

    // ----------------------------------
    // Constructors

	public VarDefinition(List<String> strings, Type type) {
		super();

		if (strings == null)
			strings = new ArrayList<>();
		this.strings = strings;

		if (type == null)
			throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = type;

		updatePositions(strings, type);
	}

	public VarDefinition(Object strings, Object type) {
		super();

        this.strings = castList(strings,
            unwrapIfContext
            .andThen(unwrapIfToken)
            .andThen(String.class::cast));

        if (type == null)
            throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = (Type) type;

		updatePositions(strings, type);
	}


    // ----------------------------------
    // varDefinition: definition -> string* type

	// Child 'string*' 

	public void setStrings(List<String> strings) {
		if (strings == null)
			strings = new ArrayList<>();
		this.strings = strings;

	}

    public List<String> getStrings() {
        return strings;
    }

    public Stream<String> strings() {
        return strings.stream();
    }


	// Child 'type' 

	public void setType(Type type) {
		if (type == null)
			throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = type;

	}

    public Type getType() {
        return type;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "VarDefinition{" + " strings=" + this.getStrings() + " type=" + this.getType() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
