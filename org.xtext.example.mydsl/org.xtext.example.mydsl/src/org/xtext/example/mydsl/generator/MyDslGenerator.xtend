package org.xtext.example.mydsl.generator;

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xtext.example.mydsl.myDsl.Class_declaration
import org.xtext.example.mydsl.myDsl.Expression
import org.xtext.example.mydsl.myDsl.Field_declaration
import org.xtext.example.mydsl.myDsl.Interface_declaration
import org.xtext.example.mydsl.myDsl.Method_declaration
import org.xtext.example.mydsl.myDsl.Statement
import org.xtext.example.mydsl.myDsl.Statement_block
import org.xtext.example.mydsl.myDsl.Variable_declaration
import org.xtext.example.mydsl.myDsl.Variable_declarator
import org.xtext.example.mydsl.myDsl.While_Statement

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator implements IGenerator {

	Integer countVar = 1;
	Integer countaddr = 0;

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		countVar = 1;
		countaddr = 0;
		for (e : resource.allContents.toIterable.filter(Class_declaration)) {
			fsa.generateFile(e.className.toString() + ".txt", e.genClass)
		}
		for (e : resource.allContents.toIterable.filter(Interface_declaration)) {
			fsa.generateFile(e.interfaceName.toString() + ".txt", e.genInterface)
		}
	}

	def genClass(Class_declaration cd) '''
		«countaddr»: LD SP, 1000
		«nextAddress»
		«FOR f : cd.fieldsDeclaration»
			«f.genField»
		«ENDFOR»
	'''

	def genInterface(Interface_declaration cd) '''
		«countaddr»LD SP, 1000
		«nextAddress»
		«FOR f : cd.fieldsDeclaration»
			«f.genField»
		«ENDFOR»
	'''

	def genField(Field_declaration declaration) '''
		«IF declaration.variableDeclaration instanceof Variable_declaration»
			«(declaration.variableDeclaration as Variable_declaration).genVariable»
		«ELSEIF declaration.methodName instanceof Method_declaration»
			«(declaration.methodName as Method_declaration).genMethod»
		«ENDIF»		
	'''

	def genMethod(Method_declaration declaration) '''
		«IF declaration.statementMethod != null»
			«declaration.nameMethod»:
			«genStatementBlock(declaration.statementMethod)»
		«ENDIF»
		
	'''

	def genStatementBlock(Statement_block block) '''
		«IF block.statments != null»
			«genStatements(block.statments)»
		«ENDIF»
	'''

	def genStatements(EList<Statement> listStatements) '''
		«FOR actualStatment : listStatements»
			«genStatement(actualStatment)»
		«ENDFOR»
	'''

	def genStatement(Statement statement) '''
		«IF statement.variableDeclaration != null»
			«genVariable(statement.variableDeclaration)»
		«ELSEIF statement.variableDeclaration != null && statement.variableDeclaration.nameVariable != null»
			«genDeclarator(statement.variableDeclaration.nameVariable)»
		«ELSEIF statement.whileStatement != null»
			«genWhileStatement(statement.whileStatement)»
		«ELSEIF statement.ret != null»
			«genReturnStatement(statement.ret)»
		«ELSEIF statement.expressionStatement != null && statement.expressionStatement.size > 0»
			«FOR exp : statement.expressionStatement»
				«genExpression(exp)»
			«ENDFOR»
		«ELSEIF statement.statementBlock != null»
			«genStatementBlock(statement.statementBlock)»
		«ENDIF»
	'''

	def genReturnStatement(String statement) '''
		«countaddr»: BR *0(SP)
		«nextAddress»
	'''

	def genWhileStatement(While_Statement whileStatement) '''
		#StartWHILE:
		«IF whileStatement.expression != null»
			«genSimpleLogical(whileStatement.expression)»
		«ENDIF»
		«IF whileStatement.whileStatement != null»
			«genStatement(whileStatement.whileStatement)»
		«ENDIF»
		«countaddr.toString()»: BR #StartWHILE
		«nextAddress»
		
		#EndWHILE:
	'''

	def genExpression(Expression expression) '''
		«IF expression.literalExpression != null»	
			«IF expression.aux.aux == null && expression.aux.exp1 == null»
				«IF expression.literalExpression.string != null»
					«genStringExpression(expression)»
				«ENDIF»
			«ELSE»
				«IF expression.aux.testingSign == null»				
					«genIntLiteralExpression(expression)»
				«ENDIF»
			«ENDIF»
			«ELSEIF expression.logicalExpression != null»
			«genFullLogicalExpression(expression,"")»
			«ELSEIF expression.numericExpression3 != null»
			«genNumericExpression(expression)»
		«ELSEIF expression.name != null»
			«IF expression.aux != null»
				«countaddr.toString()»: ADD SP, SP, #methodSize
				«nextAddress»
				«countaddr.toString()»: ST *SP, «countaddr+16»
				«nextAddress»
				«countaddr»: BR «expression.name»
				«nextAddress»
				«countaddr.toString()»: SUB SP, SP, #methodSize
				«nextAddress»
			«ELSE»
				«countaddr.toString()»: LD R«countVar.toString», *«expression.name»
				«increment»
				«nextAddress»
			«ENDIF»	
		«ENDIF»
	'''

	def genNumericExpression(Expression expression) '''
		«IF expression.numericExpression3 != null»
			«countaddr.toString()»: LD R«countVar.toString», «expression.numericExpression3.expression.name»
			«nextAddress»
			«IF expression.numericExpression3.sinal_numeric.equals("++")»
				«countaddr.toString()»: ADD R«countVar.toString», R«countVar.toString», #1
				«nextAddress»
			«ELSEIF expression.numericExpression3.sinal_numeric.equals("--")»
				«countaddr.toString()»: SUB R«countVar.toString», R«countVar.toString», #1
				«nextAddress»
			«ENDIF»
			«increment»
		«ENDIF»
	'''

	def genVariable(Variable_declaration declaration) '''
		«IF declaration.nameVariable != null»
			«genDeclarator(declaration.nameVariable)»
		«ENDIF»
		
	'''

	def genDeclarator(Variable_declarator declarator) '''
		«IF declarator.vari != null»
			«IF declarator.vari.expression.literalExpression != null»	
				«IF declarator.vari.expression.aux.aux == null && declarator.vari.expression.aux.exp1 == null»
					«IF declarator.vari.expression.literalExpression.string != null»
						«genString(declarator)»
					«ELSE»
						«countaddr.toString()»: ST «declarator.nameVariable», #«declarator.vari.expression.literalExpression.exp1»
						«nextAddress»
					«ENDIF»
				«ELSE»
					«IF declarator.vari.expression.aux.testingSign == null»				
						«genIntLiteral(declarator)»
					«ENDIF»
				«ENDIF»
			«ELSEIF declarator.vari.expression.logicalExpression != null»
				«genSimpleLogical(declarator)»
			«ENDIF»
		«ENDIF»
	'''

	def void increment() {
		countVar++;
	}

	def void nextAddress() {
		countaddr = countaddr + 8;
	}



	

	def genString(Variable_declarator declarator) '''
		«countaddr.toString()»: LD R«countVar.toString()», "«declarator.vari.expression.literalExpression.string»"
		«increment»
		«nextAddress»
		«countaddr.toString()»: ST «declarator.nameVariable», R«new Integer(countVar-1).toString()»
		«nextAddress»
	'''

	def genStringExpression(
		Expression expression
	) '''
		«countaddr.toString()»: LD R«countVar.toString()», "«expression.literalExpression.string»"
		«increment»
		«nextAddress»
	'''

	def genSimpleLogical(Variable_declarator declarator) '''
		«IF declarator.vari.expression.logicalExpression != null && declarator.vari.expression.logicalExpression.^true != null»
			«countaddr.toString()»: LD R«countVar.toString()», TRUE
			«increment»
			«nextAddress»			
		«ELSEIF declarator.vari.expression.logicalExpression != null && declarator.vari.expression.logicalExpression.^false != null»
			«countaddr.toString()»: LD R«countVar.toString()», FALSE
			«increment»
			«nextAddress»
		«ENDIF»
		«IF declarator.vari.expression.logicalExpression.expression != null»
			«genFullLogicalExpression(declarator.vari.expression.logicalExpression.expression, "")»
		«ELSEIF declarator.vari.expression.aux.logicExp != null»
			«genFullLogicalExpression(declarator.vari.expression.aux.logicExp, declarator.vari.expression.aux.logicOp)»
		«ENDIF»
		«countaddr.toString()»: ST «declarator.nameVariable», R«new Integer(countVar-1).toString()»
		«nextAddress»
		
	'''
	
	def genSimpleLogical(Expression declarator) '''
		«IF declarator.logicalExpression != null && declarator.logicalExpression.^true != null»
			«countaddr.toString()»: LD R«countVar.toString()», TRUE
			«increment»
			«nextAddress»			
		«ELSEIF declarator.logicalExpression != null && declarator.logicalExpression.^false != null»
			«countaddr.toString()»: LD R«countVar.toString()», FALSE
			«increment»
			«nextAddress»
		«ENDIF»
		«IF declarator.logicalExpression != null && declarator.logicalExpression.expression != null»
			«genFullLogicalExpression(declarator.logicalExpression.expression, "")»
		«ELSEIF declarator.aux.logicExp != null»
			«genFullLogicalExpression(declarator.aux.logicExp, declarator.aux.logicOp)»
		«ENDIF»
		«countaddr.toString()»: BRF R«(countVar-1).toString()», #EndWHILE
		«nextAddress»
		
		
	'''

	def genFullLogicalExpression(Expression expression, String op) '''
		«IF expression.logicalExpression != null && expression.logicalExpression.^true != null»
			«IF op.equals("&&")»
				«countaddr.toString()»: AND R«(countVar-1).toString()», TRUE
			«ELSE»
				«countaddr.toString()»: OR R«(countVar-1).toString()», TRUE
			«ENDIF»			
			«nextAddress»
		«ELSEIF expression.logicalExpression != null && expression.logicalExpression.^false != null»
			«IF op.equals("&&")»
				«countaddr.toString()»: AND R«(countVar-1).toString()», FALSE
			«ELSE»
				«countaddr.toString()»: OR R«(countVar-1).toString()», FALSE
			«ENDIF»			
			«nextAddress»
		«ENDIF»
		«IF expression.logicalExpression.expression != null»
			«genFullLogicalExpression(expression.logicalExpression.expression, op)»
		«ENDIF»
		«IF expression.aux.logicExp != null»
			«genFullLogicalExpression(expression.aux.logicExp, expression.aux.logicOp)»
		«ENDIF»
	'''

	def genIntLiteral(Variable_declarator declarator) '''
		«countaddr.toString()»: LD R«countVar.toString()», #«declarator.vari.expression.literalExpression.exp1»
		«increment»
		«nextAddress»
		«countaddr.toString()»: LD R«countVar.toString()», #«declarator.vari.expression.aux.exp2.literalExpression.exp1»
		«increment»
		«nextAddress»
		«IF declarator.vari.expression.aux.numericSign.equals("+")»
			«countaddr.toString()»: ADD R«new Integer(countVar-2).toString()», R«new Integer(countVar-1).toString()» , R«new Integer(countVar-2).toString()»
			«nextAddress»
		«ELSEIF declarator.vari.expression.aux.numericSign.equals("*")»
			«countaddr.toString()»: MUL R«new Integer(countVar-2).toString()», R«new Integer(countVar-1).toString()» , R«new Integer(countVar-2).toString()»
			«nextAddress»
		«ELSEIF declarator.vari.expression.aux.numericSign.equals("/")»
			«countaddr.toString()»: DIV R«new Integer(countVar-2).toString()», R«new Integer(countVar-1).toString()» , R«new Integer(countVar-2).toString()»
			«nextAddress»
		«ELSEIF declarator.vari.expression.aux.numericSign.equals("-")»
			«countaddr.toString()»: SUB R«new Integer(countVar-2).toString()», R«new Integer(countVar-1).toString()» , R«new Integer(countVar-2).toString()»
			«nextAddress»
		«ENDIF»
		«countaddr.toString()»: ST «declarator.nameVariable», R«new Integer(countVar-2).toString()»
		«nextAddress»
		«increment»
	'''

	def genIntLiteralExpression(Expression expression) '''
		«countaddr.toString()»: LD R«countVar.toString()», #«expression.literalExpression.exp1»
		«increment»
		«nextAddress»
		«countaddr.toString()»: LD R«countVar.toString()», #«expression.aux.exp2.literalExpression.exp1»
		«increment»
		«nextAddress»
		«IF expression.aux.numericSign.equals("+")»
			«countaddr.toString()»: ADD R«new Integer(countVar-2).toString()», R«new Integer(countVar-1).toString()» , R«new Integer(countVar-2).toString()»
			«nextAddress»
		«ELSEIF expression.aux.numericSign.equals("*")»
			«countaddr.toString()»: MUL R«new Integer(countVar-2).toString()», R«new Integer(countVar-1).toString()» , R«new Integer(countVar-2).toString()»
			«nextAddress»
		«ELSEIF expression.aux.numericSign.equals("/")»
			«countaddr.toString()»: DIV R«new Integer(countVar-2).toString()», R«new Integer(countVar-1).toString()» , R«new Integer(countVar-2).toString()»
			«nextAddress»
		«ELSEIF expression.aux.numericSign.equals("-")»
			«countaddr.toString()»: SUB R«new Integer(countVar-2).toString()», R«new Integer(countVar-1).toString()» , R«new Integer(countVar-2).toString()»
			«nextAddress»
		«ENDIF»
		«increment»
	'''

	

}
