// Generated with VGen 2.0.0

package compiler.codegeneration.mapl.codefunctions;

import compiler.ast.Program;
import compiler.ast.definition.FieldDefinition;
import compiler.ast.definition.FunctionDefinition;
import compiler.ast.definition.StructDefinition;
import compiler.ast.definition.VarDefinition;
import compiler.ast.type.ArrayType;
import compiler.ast.type.CharType;
import compiler.ast.type.IntType;
import compiler.ast.type.RealType;
import compiler.ast.type.StructType;
import compiler.ast.type.Type;
import compiler.ast.type.VoidType;
import compiler.codegeneration.mapl.AbstractCodeFunction;
import compiler.codegeneration.mapl.MaplCodeSpecification;


public class Metadata extends AbstractCodeFunction {

    public Metadata(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Program(String name, GlobalSection globalSection, List<FunctionCreation> functionCreations, List<FunctionDefinition> functionDefinitions, Run run)
	@Override
	public Object visit(Program program, Object param) {

		out("#source \"" + getSpecification().getSourceFile() + "\"");

		metadata(program.definitions());
        metadata(program.functionDefinitions());
		metadata(program.getRun());

		return null;
	}

	// class VarDefinition(String name, Type type)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		String scope = varDefinition.getScope() == 1? "#global " : "#local ";

		out(scope + varDefinition.getName() + ":" + getTypeName(varDefinition.getType()));

		return null;
	}

	// class StructDefinition(String name, List<FieldDefinition> fieldDefinitions)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

    	out("#type " + structDefinition.getName() + ": {");
    	
    	metadata(structDefinition.fieldDefinitions());
    	
    	out("}");
    	
		return null;
	}

	// class FieldDefinition(String name, Type type)
	// phase Identification { StructDefinition structDefinition }
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(FieldDefinition fieldDefinition, Object param) {

		out("\t" + fieldDefinition.getName() + ":" + getTypeName(fieldDefinition.getType()));
    	
		return null;
	}

	// class FunctionDefinition(String name, List<VarDefinition> parameters, Optional<Type> type, List<VarDefinition> locals, List<Statement> statements)
	// phase TypeChecking { boolean hasReturn }
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

        out("#func " + functionDefinition.getName());
        functionDefinition.parameters().forEach(x -> {
        	out("#param " + x.getName() + ":" + getTypeName(x.getType()));
        });
        metadata(functionDefinition.locals());
        out("#ret " + getTypeName(functionDefinition.getType().orElse(new VoidType())));

		return null;
	}
	
	// class Run(String name)
	@Override
	public Object visit(compiler.ast.Run run, Object param) {
		out("#func main");
		out("#ret void");
		return null;
	}
	
    //# ------------------------------------------------------------------
    //# Auxiliary methods

    private String getTypeName(Type type) {
        if (type instanceof IntType)
            return "int";
        if (type instanceof RealType)
            return "float";
        if(type instanceof CharType)
        	return "char";
		if(type instanceof VoidType)
			return "void";
        if(type instanceof ArrayType) {
        	ArrayType arrType = (ArrayType) type;
        	return arrType.getIntValue()  + " * " + getTypeName(arrType.getType());
        }
        if(type instanceof StructType) {
        	StructType stType = (StructType) type;
        	return stType.getName();
        }

        // Sealed classes + pattern matching would avoid this situation. Those features were not
        // finished when this code was implemented
        throw new IllegalArgumentException("Unknown Type: " + type);
    }

}
