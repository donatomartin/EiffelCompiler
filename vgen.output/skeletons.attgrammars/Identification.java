// Generated with VGen 2.0.0

/*

Este fichero es un esqueleto para facilitar la implementación de una gramática atribuida
('ATTRIBUTE GRAMMAR' de VGen). Para usarlo hay que realizar dos pasos:
1. Ubicar este código.
2. Completar cada método visit.

## Paso 1. Ubicación de este Código

Este esqueleto será SOBREESCRITO la próxima vez que se ejecuta VGen. Por ello, se debe
copiar su contenido antes de hacer cualquier cambio.

Hay dos opciones:

1) Si ya se tiene hecha una clase para el visitor, basta con copiar a dicha clase los
   métodos visit de este esqueleto (y los import) ignorando el resto.

2) Si no se tiene hecha aún la clase, este esqueleto vale como tal si se mueve a la
   carpeta deseada del proyecto y se le pone el package correspondiente a dicha
   ubicación.

Una vez hecho esto, ya se tendría un visitor que compilaría sin errores y que, al
ejecutarlo, recorrería todo el árbol (aunque sin hacer nada en cada nodo).


## Paso 2 Completar cada Método Visit

El visit generado para cada nodo se limita a recorrer sus hijos. El código de recorrido
se encuentra en la llamada a 'super.visit'. Los 'accept' comentados encima de cada
'super.visit' son sólo un recordatorio de lo que hace dicho método (son una copia de su
implementación, que se hereda de DefaultVisitor).

Por tanto, hay tres opciones a la hora de implementar cada visit:

1. Si en el visit de un nodo SÓLO SE NECESITA RECORRER sus hijos, se puede borrar
   completamente dicho visit de esta clase. Al no estar el método, se heredará de
   DefaultVisitor la misma implementación que se acaba de borrar. Es decir, en esta
   clase sólo será necesario dejar los visit que tengan alguna acción que realizar.

2. Si se necesita hacer alguna tarea adicional ANTES o DESPUÉS de recorrer todos los
   hijos, se debe añadir su código antes o después de la llamada a 'super.visit' (y se
   pueden borrar los 'accept' comentados).

3. Y, finalmente, si se necesita hacer alguna tarea INTERCALADA en el recorrido de los
   hijos (por ejemplo, comprobar su tipo), se debe borrar el 'super.visit' y descomentar
   los 'accept'. Así se tendría ya implementado el recorrido de los hijos, que es la
   estructura donde se intecalará el código de las acciones adicionales.

NOTA 1. En los visit en los que haya que inicializar atributos heredados de los hijos
antes de recorrerlos, se han añadido recordatorios en los puntos en los que es
aconsejable hacerlo.

NOTA 2. En los visit de los nodos que tengan atributos sintetizados, se han añadido
recordatorios de que se deben inicializar dichos atributos.

*/

// TODO: write package name
// package ...;

import compiler.visitor.DefaultVisitor;
import compiler.ast.*;
import compiler.ast.definition.*;
import compiler.ast.statement.*;
import compiler.ast.type.*;
import compiler.ast.expression.*;


public class Identification extends DefaultVisitor {

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // Visit Methods --------------------------------------------------------------

	// class Program(String name, GlobalSection globalSection, List<FunctionCreation> functionCreations, List<FunctionDefinition> functionDefinitions, Run run)
	@Override
	public Object visit(Program program, Object param) {

		// program.getGlobalSection().accept(this, param);
		// program.getFunctionCreations().forEach(functionCreation -> functionCreation.accept(this, param));
		// program.getFunctionDefinitions().forEach(functionDefinition -> functionDefinition.accept(this, param));
		// program.getRun().accept(this, param);
		super.visit(program, param);

		return null;
	}

	// class GlobalSection(List<StructDefinition> structDefinitions, List<VarDefinition> varDefinitions)
	@Override
	public Object visit(GlobalSection globalSection, Object param) {

		// globalSection.getStructDefinitions().forEach(structDefinition -> structDefinition.accept(this, param));
		// globalSection.getVarDefinitions().forEach(varDefinition -> varDefinition.accept(this, param));
		super.visit(globalSection, param);

		return null;
	}

	// class FunctionCreation(String name)
	@Override
	public Object visit(FunctionCreation functionCreation, Object param) {

		return null;
	}

	// class VarDefinition(String name, Type type)
	@Override
	public Object visit(VarDefinition varDefinition, Object param) {

		// varDefinition.getType().accept(this, param);
		super.visit(varDefinition, param);

		return null;
	}

	// class StructDefinition(String name, List<FieldDefinition> fieldDefinitions)
	@Override
	public Object visit(StructDefinition structDefinition, Object param) {

		// structDefinition.getFieldDefinitions().forEach(fieldDefinition -> fieldDefinition.accept(this, param));
		super.visit(structDefinition, param);

		return null;
	}

	// class FieldDefinition(String name, Type type)
	// phase Identification { StructDefinition structDefinition }
	@Override
	public Object visit(FieldDefinition fieldDefinition, Object param) {

		// fieldDefinition.getType().accept(this, param);
		super.visit(fieldDefinition, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// fieldDefinition.setStructDefinition(?);
		return null;
	}

	// class FunctionDefinition(String name, List<VarDefinition> parameters, Optional<Type> type, List<VarDefinition> locals, List<Statement> statements)
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		// functionDefinition.getParameters().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getType().ifPresent(type -> type.accept(this, param));
		// functionDefinition.getLocals().forEach(varDefinition -> varDefinition.accept(this, param));
		// functionDefinition.getStatements().forEach(statement -> statement.accept(this, param));
		super.visit(functionDefinition, param);

		return null;
	}

	// class Print(List<Expression> expressions)
	@Override
	public Object visit(Print print, Object param) {

		// print.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(print, param);

		return null;
	}

	// class Read(List<Expression> expressions)
	@Override
	public Object visit(Read read, Object param) {

		// read.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(read, param);

		return null;
	}

	// class FunctionCallStatement(String name, List<Expression> expressions)
	// phase Identification { FunctionDefinition functionDefinition }
	@Override
	public Object visit(FunctionCallStatement functionCallStatement, Object param) {

		// functionCallStatement.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(functionCallStatement, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// functionCallStatement.setFunctionDefinition(?);
		return null;
	}

	// class Assignment(Expression left, Expression right)
	@Override
	public Object visit(Assignment assignment, Object param) {

		// assignment.getLeft().accept(this, param);
		// assignment.getRight().accept(this, param);
		super.visit(assignment, param);

		return null;
	}

	// class Conditional(Expression expression, List<Statement> ifStatements, List<Statement> elseStatements)
	@Override
	public Object visit(Conditional conditional, Object param) {

		// conditional.getExpression().accept(this, param);
		// conditional.getIfStatements().forEach(statement -> statement.accept(this, param));
		// conditional.getElseStatements().forEach(statement -> statement.accept(this, param));
		super.visit(conditional, param);

		return null;
	}

	// class Loop(List<Statement> fromStatements, Expression expression, List<Statement> loopStatements)
	@Override
	public Object visit(Loop loop, Object param) {

		// loop.getFromStatements().forEach(statement -> statement.accept(this, param));
		// loop.getExpression().accept(this, param);
		// loop.getLoopStatements().forEach(statement -> statement.accept(this, param));
		super.visit(loop, param);

		return null;
	}

	// class Return(Optional<Expression> expression)
	@Override
	public Object visit(Return returnValue, Object param) {

		// returnValue.getExpression().ifPresent(expression -> expression.accept(this, param));
		super.visit(returnValue, param);

		return null;
	}

	// class Run(String name, List<Expression> expressions)
	@Override
	public Object visit(Run run, Object param) {

		// run.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(run, param);

		return null;
	}

	// class IntType()
	@Override
	public Object visit(IntType intType, Object param) {

		return null;
	}

	// class RealType()
	@Override
	public Object visit(RealType realType, Object param) {

		return null;
	}

	// class CharType()
	@Override
	public Object visit(CharType charType, Object param) {

		return null;
	}

	// class ArrayType(int intValue, Type type)
	@Override
	public Object visit(ArrayType arrayType, Object param) {

		// arrayType.getType().accept(this, param);
		super.visit(arrayType, param);

		return null;
	}

	// class StructType(String name)
	// phase Identification { StructDefinition structDefinition }
	@Override
	public Object visit(StructType structType, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// structType.setStructDefinition(?);
		return null;
	}

	// class VoidType()
	@Override
	public Object visit(VoidType voidType, Object param) {

		return null;
	}

	// class Variable(String name)
	// phase Identification { VarDefinition varDefinition }
	@Override
	public Object visit(Variable variable, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// variable.setVarDefinition(?);
		return null;
	}

	// class IntLiteral(int intValue)
	@Override
	public Object visit(IntLiteral intLiteral, Object param) {

		return null;
	}

	// class RealLiteral(float floatValue)
	@Override
	public Object visit(RealLiteral realLiteral, Object param) {

		return null;
	}

	// class CharLiteral(char charValue)
	@Override
	public Object visit(CharLiteral charLiteral, Object param) {

		return null;
	}

	// class FunctionCallExpression(String name, List<Expression> expressions)
	// phase Identification { FunctionDefinition functionDefinition }
	@Override
	public Object visit(FunctionCallExpression functionCallExpression, Object param) {

		// functionCallExpression.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(functionCallExpression, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// functionCallExpression.setFunctionDefinition(?);
		return null;
	}

	// class StructAccess(Expression expr, String name)
	@Override
	public Object visit(StructAccess structAccess, Object param) {

		// structAccess.getExpr().accept(this, param);
		super.visit(structAccess, param);

		return null;
	}

	// class ArrayAccess(Expression left, Expression right)
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		// arrayAccess.getLeft().accept(this, param);
		// arrayAccess.getRight().accept(this, param);
		super.visit(arrayAccess, param);

		return null;
	}

	// class Cast(Type type, Expression expression)
	@Override
	public Object visit(Cast cast, Object param) {

		// cast.getType().accept(this, param);
		// cast.getExpression().accept(this, param);
		super.visit(cast, param);

		return null;
	}

	// class ArithmeticBinary(Expression left, String operator, Expression right)
	@Override
	public Object visit(ArithmeticBinary arithmeticBinary, Object param) {

		// arithmeticBinary.getLeft().accept(this, param);
		// arithmeticBinary.getRight().accept(this, param);
		super.visit(arithmeticBinary, param);

		return null;
	}

	// class ArithmeticUnary(String operator, Expression expr)
	@Override
	public Object visit(ArithmeticUnary arithmeticUnary, Object param) {

		// arithmeticUnary.getExpr().accept(this, param);
		super.visit(arithmeticUnary, param);

		return null;
	}

	// class LogicBinary(Expression left, String operator, Expression right)
	@Override
	public Object visit(LogicBinary logicBinary, Object param) {

		// logicBinary.getLeft().accept(this, param);
		// logicBinary.getRight().accept(this, param);
		super.visit(logicBinary, param);

		return null;
	}

	// class LogicUnary(String operator, Expression expr)
	@Override
	public Object visit(LogicUnary logicUnary, Object param) {

		// logicUnary.getExpr().accept(this, param);
		super.visit(logicUnary, param);

		return null;
	}

	// class RelationalBinary(Expression left, String operator, Expression right)
	@Override
	public Object visit(RelationalBinary relationalBinary, Object param) {

		// relationalBinary.getLeft().accept(this, param);
		// relationalBinary.getRight().accept(this, param);
		super.visit(relationalBinary, param);

		return null;
	}

}
