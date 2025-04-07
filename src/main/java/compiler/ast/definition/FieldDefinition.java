// Generated with VGen 2.0.0

package compiler.ast.definition;

import compiler.ast.type.*;
import org.antlr.v4.runtime.Token;
import compiler.visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	fieldDefinition: definition -> name:string type:type
	definition -> 
	
	PHASE Identification
	fieldDefinition -> structDefinition:structDefinition
*/
public class FieldDefinition extends AbstractDefinition  {

    // ----------------------------------
    // Instance Variables

	// fieldDefinition: definition -> string type
	private String name;
	private Type type;

    // PHASE Identification
	private StructDefinition structDefinition;

    // ----------------------------------
    // Constructors

	public FieldDefinition(String name, Type type) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (type == null)
			throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = type;

		updatePositions(name, type);
	}

	public FieldDefinition(Object name, Object type) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        if (type == null)
            throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = (Type) type;

		updatePositions(name, type);
	}


    // ----------------------------------
    // fieldDefinition: definition -> string type

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
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



    // --------------------------------
    // PHASE Identification

	// Attribute 'structDefinition' 

	public void setStructDefinition(StructDefinition structDefinition) {
		if (structDefinition == null)
			throw new IllegalArgumentException("Parameter 'structDefinition' can't be null. Pass a non-null value or use 'structDefinition?' in the abstract grammar");
		this.structDefinition = structDefinition;

	}

    public StructDefinition getStructDefinition() {
        return structDefinition;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "FieldDefinition{" + " name=" + this.getName() + " type=" + this.getType() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
