// Generated with VGen 2.0.0

package compiler.codegeneration.mapl.codefunctions;

import compiler.ast.expression.*;
import compiler.codegeneration.mapl.*;


public class Address extends AbstractCodeFunction {

    public Address(MaplCodeSpecification specification) {
        super(specification);
    }

	// class Variable(String name)
	// phase Identification { VarDefinition varDefinition }
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(Variable variable, Object param) {

		if(variable.getVarDefinition().getScope() == 1) {
			out("push " + variable.getVarDefinition().getAddress());
		} else {
			out("push bp");
			out("push " + variable.getVarDefinition().getAddress());
			out("addi");
		}
		
		return null;
	}

	// class StructAccess(Expression expr, String name)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(StructAccess structAccess, Object param) {

		// value(fieldAccess.getExpr());
		address(structAccess.getExpr());

		out("pushi " + structAccess.getFieldDefinition().getAddress());
		out("addi");

		return null;
	}

	// class ArrayAccess(Expression left, Expression right)
	// phase TypeChecking { boolean lvalue, Type type }
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		// value(arrayAccess.getExpr1());
		address(arrayAccess.getLeft());

		// value(arrayAccess.getExpr2());
		value(arrayAccess.getRight());

		out("pushi " + arrayAccess.getExpressionType().getSize());
		out("muli");
		out("addi");

		return null;
	}

}
