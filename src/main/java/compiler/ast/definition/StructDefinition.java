// Generated with VGen 2.0.0

package compiler.ast.definition;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import compiler.visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	structDefinition: definition -> name:string fieldDefinitions:fieldDefinition*
	definition -> 
	
	PHASE MemoryAllocation
	structDefinition -> address:int
*/
public class StructDefinition extends AbstractDefinition  {

    // ----------------------------------
    // Instance Variables

	// structDefinition: definition -> string fieldDefinition*
	private String name;
	private List<FieldDefinition> fieldDefinitions;

    // PHASE MemoryAllocation
	private int address;

    // ----------------------------------
    // Constructors

	public StructDefinition(String name, List<FieldDefinition> fieldDefinitions) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		if (fieldDefinitions == null)
			fieldDefinitions = new ArrayList<>();
		this.fieldDefinitions = fieldDefinitions;

		updatePositions(name, fieldDefinitions);
	}

	public StructDefinition(Object name, Object fieldDefinitions) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        this.fieldDefinitions = castList(fieldDefinitions, unwrapIfContext.andThen(FieldDefinition.class::cast));
		updatePositions(name, fieldDefinitions);
	}


    // ----------------------------------
    // structDefinition: definition -> string fieldDefinition*

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


	// Child 'fieldDefinition*' 

	public void setFieldDefinitions(List<FieldDefinition> fieldDefinitions) {
		if (fieldDefinitions == null)
			fieldDefinitions = new ArrayList<>();
		this.fieldDefinitions = fieldDefinitions;

	}

    public List<FieldDefinition> getFieldDefinitions() {
        return fieldDefinitions;
    }

    public Stream<FieldDefinition> fieldDefinitions() {
        return fieldDefinitions.stream();
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
        return "StructDefinition{" + " name=" + this.getName() + " fieldDefinitions=" + this.getFieldDefinitions() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
