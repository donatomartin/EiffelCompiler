// Generated with VGen 2.0.0

/**
* Visitor del que derivar cuando se quiera que todo visit no redefinido lance
* una excepción si es invocado.
*
*/

package visitor;

import ast.*;
import ast.definition.*;
import ast.statement.*;
import ast.type.*;
import ast.expression.*;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------


public class ExceptionThrowerVisitor implements Visitor {
	@Override
	public Object visit(Program program, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Program)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(GlobalSection globalSection, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(GlobalSection)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(FunctionCreation functionCreation, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(FunctionCreation)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(VarDefinition)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(StructDefinition)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(FunctionDefinition)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Parameter parameter, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Parameter)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Print print, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Print)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Read read, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Read)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Call call, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Call)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Assignment assignment, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Assignment)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Conditional conditional, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Conditional)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Loop loop, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Loop)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Return returnValue, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Return)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Run run, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Run)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(IntType intType, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(IntType)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(RealType realType, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(RealType)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(CharType charType, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(CharType)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(ArrayType arrayType, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(ArrayType)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(StructType structType, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(StructType)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Variable variable, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Variable)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(IntLiteral intLiteral, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(IntLiteral)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(RealLiteral realLiteral, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(RealLiteral)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(CharLiteral charLiteral, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(CharLiteral)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(FunctionCall functionCall, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(FunctionCall)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(StructAccess structAccess, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(StructAccess)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(ArrayAccess)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(Cast cast, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(Cast)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(ArithmeticBinary arithmeticBinary, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(ArithmeticBinary)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(ArithmeticUnary arithmeticUnary, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(ArithmeticUnary)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(LogicBinary logicBinary, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(LogicBinary)' has been invoked but it has not been implemented.");
	}

	@Override
	public Object visit(LogicUnary logicUnary, Object param) {

        throw new UnsupportedOperationException("'ExceptionThrowerVisitor.visit(LogicUnary)' has been invoked but it has not been implemented.");
	}

    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
