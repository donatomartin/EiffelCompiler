// Generated with VGen 2.0.0

package compiler.ast.type;

import compiler.visitor.Visitor;

// %% User Declarations -------------

// Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	charType: type -> 
	type -> 
*/
public class CharType extends AbstractType  {



    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "CharType{" + "}";
    }


  // %% User Members -------------------------

  // Methods/attributes in this section will be preserved. Delete if not needed

  public int getSize() {
    return 1;
  }

  // %% --------------------------------------
}
