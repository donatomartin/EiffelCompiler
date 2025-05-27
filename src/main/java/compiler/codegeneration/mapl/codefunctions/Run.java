// Generated with VGen 2.0.0

package compiler.codegeneration.mapl.codefunctions;

import compiler.ast.*;
import compiler.codegeneration.mapl.*;


public class Run extends AbstractCodeFunction {

    public Run(MaplCodeSpecification specification) {
        super(specification);
    }

	// class Program(String name, GlobalSection globalSection, List<FunctionCreation> functionCreations, List<FunctionDefinition> functionDefinitions, Run run)
	@Override
	public Object visit(Program program, Object param) {

		metadata(program);
		out("call main");
		out("halt");
		
		execute(program.getGlobalSection().structDefinitions());
		execute(program.getGlobalSection().varDefinitions());
		execute(program.functionDefinitions());
		execute(program.getRun());

		return null;
	}

}
