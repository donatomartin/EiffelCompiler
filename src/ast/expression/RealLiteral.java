// Generated with VGen 2.0.0

package ast.expression;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	realLiteral: expression -> floatValue:float
	expression -> 
*/
public class RealLiteral extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// realLiteral: expression -> float
	private float floatValue;

    // ----------------------------------
    // Constructors

	public RealLiteral(float floatValue) {
		super();

		this.floatValue = floatValue;

		updatePositions(floatValue);
	}

	public RealLiteral(Object floatValue) {
		super();

        if (floatValue == null)
            throw new IllegalArgumentException("Parameter 'floatValue' can't be null. Pass a non-null value or use 'float?' in the abstract grammar");
        var floatValue_temp = floatValue;
        if (floatValue_temp instanceof Token)
            floatValue_temp = ((Token) floatValue_temp).getText();
        if (floatValue_temp instanceof String)
            floatValue_temp = Float.valueOf((String) floatValue_temp);
        this.floatValue = (float) floatValue_temp;

		updatePositions(floatValue);
	}


    // ----------------------------------
    // realLiteral: expression -> float

	// Child 'float' 

	public void setFloatValue(float floatValue) {
		this.floatValue = floatValue;

	}

    public float getFloatValue() {
        return floatValue;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "RealLiteral{" + " floatValue=" + this.getFloatValue() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
