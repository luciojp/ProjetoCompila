/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.validation

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.validation.Check
import org.xtex.example.mydsl.exceptions.MyDslException
import org.xtext.example.mydsl.myDsl.Class_declaration
import org.xtext.example.mydsl.myDsl.Expression
import org.xtext.example.mydsl.myDsl.Field_declaration
import org.xtext.example.mydsl.myDsl.Interface_declaration
import org.xtext.example.mydsl.myDsl.Method_declaration
import org.xtext.example.mydsl.myDsl.MyDslPackage
import org.xtext.example.mydsl.myDsl.Type_declaration
import org.xtext.example.mydsl.myDsl.Variable_declaration
import org.xtext.example.mydsl.myDsl.Variable_declarator
import org.xtext.example.mydsl.validation.utils.Classes
import org.xtext.example.mydsl.validation.utils.ConstructorObj
import org.xtext.example.mydsl.validation.utils.ContructorValidate
import org.xtext.example.mydsl.validation.utils.ExpressionValidate
import org.xtext.example.mydsl.validation.utils.MethodObj
import org.xtext.example.mydsl.validation.utils.MethodValidate
import org.xtext.example.mydsl.validation.utils.ModifiersValidate
import org.xtext.example.mydsl.validation.utils.Util
import org.xtext.example.mydsl.validation.utils.Variable
import org.xtext.example.mydsl.myDsl.While_Statement

//import org.eclipse.xtext.validation.Check
/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MyDslValidator extends AbstractMyDslValidator {

	private final String CLASS = "class";
	private final String INTERFACE = "interface";
	private final String METHOD = "method";
	private final String VARIABLE = "variable";
	private final String CONSTRUCTOR = "constructor";

	public Classes allClasses = new Classes();

	@Check
	def validaTypeDeclaration(Type_declaration td) {
		if (td.classDec instanceof Class_declaration) {
			var Class_declaration cd = td.classDec as Class_declaration;
			if (!allClasses.findClass(cd.className)) {
			}
			if (cd.classHerdada != null) {
				allClasses.addClass(cd.className, new ArrayList<String>(cd.modifiers).contains("abstract"),
					cd.classHerdada);
			} else {
				allClasses.addClass(cd.className, new ArrayList<String>(cd.modifiers).contains("abstract"));
			}

			if (cd.interfaceImplementada != null) {
				var List<String> aux = new ArrayList<String>();
				aux.add(cd.interfaceImplementada);
				if (cd.interfacesImplementadas.size > 0) {
					for (String interfaces : cd.interfacesImplementadas) {
						aux.add(interfaces);
					}
				}
				allClasses.setInterfacesImple(aux, cd.className);
			}
			validaClass(cd, cd.className);
			validaFieldDeclaration(cd.fieldsDeclaration, METHOD, cd.className, true);
			validaFieldDeclaration(cd.fieldsDeclaration, CONSTRUCTOR, cd.className, true);
			validaFieldDeclaration(cd.fieldsDeclaration, VARIABLE, cd.className, true);
			for (String key : allClasses.classes.keySet) {
				if (allClasses.classes.get(key).getExtends().size() > 0 && allClasses.classes.size() > 0) {
					if (!allClasses.classes.containsKey(allClasses.classes.get(key).getExtends().get(0))) {
						error("Class " + allClasses.classes.get(key).getExtends().get(0) + " in extend not exist!", cd,
							MyDslPackage.Literals.CLASS_DECLARATION__CLASS_HERDADA);
					}
				}
				if (allClasses.classes.get(key).getimplements().size() > 0 && allClasses.classes.size() > 0) {
					for (String inter : allClasses.classes.get(key).getimplements()) {
						if (!allClasses.interfaces.containsKey(inter)) {
							error("Interface " + inter + " in implements not exist!", cd,
								MyDslPackage.Literals.CLASS_DECLARATION__CLASS_HERDADA);
						}
					}

				}
			}

		} else {
			var Interface_declaration id = td.interfaceDec as Interface_declaration;
			if (!allClasses.findInterface(id.interfaceName)) {
				allClasses.addInter(id.interfaceName, new ArrayList<String>(id.modifiers).contains("abstract"));

				if (id.interfaceHerdada != null) {
					var List<String> aux = new ArrayList<String>();
					aux.add(id.interfaceHerdada);
					if (id.interfacesHerdadas.size > 0) {
						for (String interfaces : id.interfacesHerdadas) {
							aux.add(interfaces);
						}
					}
					allClasses.setInterfacesImpleToInt(aux, id.interfaceName);
				}
			}
			validaInterface(id, id.interfaceName);
			validaFieldDeclaration(id.fieldsDeclaration, METHOD, id.interfaceName, false);
			for (String key : allClasses.interfaces.keySet) {
				if (allClasses.interfaces.get(key).getimplements().size() > 0 && allClasses.interfaces.size() > 0) {
					for (String inter : allClasses.interfaces.get(key).getimplements()) {
						if (!allClasses.interfaces.containsKey(inter)) {
							error("Interface " + inter + " in implements not exist!", id,
								MyDslPackage.Literals.INTERFACE_DECLARATION__INTERFACE_HERDADA);
						}
					}

				}
			}
		}

	}
	
	@Check
	def whileValid(While_Statement whileStm){
		if(whileStm.expression != null && whileStm.expression.logicalExpression == null){
			error("Only boolean type is permited", whileStm.expression, MyDslPackage.Literals.EXPRESSION__LOGICAL_EXPRESSION);
		}
	}

	@Check
	def validExpression(Expression exp) {
		var ExpressionValidate ev = new ExpressionValidate();
		try {
			ev.validate(exp);
		} catch (Exception e) {
			error(e.message, exp, MyDslPackage.Literals.EXPRESSION__LOGICAL_EXPRESSION);
		}
	}

	def validaMethods(EList<Field_declaration> list, String typeName, boolean isClass) {
		var MethodValidate mv = new MethodValidate();
		try {
			if (isClass) {
				allClasses.setMethods(mv.methodValidateAll(list, typeName), typeName);
			} else {
				allClasses.setMethodsInter(mv.methodValidateAll(list, typeName), typeName);
			}

		} catch (MyDslException e) {
			if (e.nodeError instanceof Variable_declaration) {
				var Variable_declaration vd = e.nodeError as Variable_declaration;
				error(e.message, vd, MyDslPackage.Literals.VARIABLE_DECLARATION__MODIFIERS_VARIABLE);
			}else if(e.nodeError.size == 1){
				var Variable_declaration vd = e.nodeError.get(0) as Variable_declaration;
				error(e.message, vd.type, MyDslPackage.Literals.TYPE__TYPE_SPECIFIER);
			} else {
				var MethodObj metAux;
				for (Object methodsError : e.nodeError) {
					metAux = methodsError as MethodObj;
					error(e.message + (metAux.toString) + " in Type " + typeName, metAux.md,
						MyDslPackage.Literals.METHOD_DECLARATION__NAME_METHOD);
				}
			}

		}

	}

	def validaClass(Class_declaration declaration, String typeName) {
		try {
			validaModifiers(declaration.modifiers, CLASS, typeName);
		} catch (Exception e) {
			error(e.message, declaration, MyDslPackage.Literals.CLASS_DECLARATION__CLASS_NAME);
		}

		var EList<String> interfaces = declaration.interfacesImplementadas;
		interfaces.add(declaration.interfaceImplementada);
	}

	def validaInterface(Interface_declaration declaration, String typeName) {
		try {
			validaModifiers(declaration.modifiers, INTERFACE, typeName);
		} catch (Exception e) {
			error(e.message, declaration, MyDslPackage.Literals.INTERFACE_DECLARATION__INTERFACE_NAME);

		}

	}

	def validaFieldDeclaration(EList<Field_declaration> declaration, String fieldType, String typeName,
		boolean isClass) {
		if (fieldType.equals(METHOD)) {
			validaMethods(declaration, typeName, isClass);
		} else if (fieldType.equals(CONSTRUCTOR)) {
			validaContructor(declaration, typeName);
		} else if (fieldType.equals(VARIABLE)) {
			validaVariables(declaration, typeName);
		}

	}

	def validaVariables(EList<Field_declaration> list, String typeName) {
		for (Field_declaration fd : list) {
			if (fd.variableDeclaration != null) {
				var Variable variable = null;
				try {
					variable = new Variable(fd.getVariableDeclaration());
				} catch (Exception e) {
				}

				if (fd.variableDeclaration.type.typeSpecifier.className != null &&
					!allClasses.classes.keySet.contains(variable.type) &&
					!allClasses.interfaces.keySet.contains(variable.type)) {

					error("Identifier " + fd.variableDeclaration.type.typeSpecifier.className + " not found.",
						fd.variableDeclaration.type, MyDslPackage.Literals.TYPE__TYPE_SPECIFIER);
				}

				if (fd.variableDeclaration.nameVariable.vari != null &&
					fd.variableDeclaration.nameVariable.vari.expression != null) {
					try {
						if (!Util.getTypeExp(fd.variableDeclaration.nameVariable.vari.expression).equals(
							variable.type)) {
							error(
								variable.type + " can not be converted in " +
									Util.getTypeExp(fd.variableDeclaration.nameVariable.vari.expression),
								fd.variableDeclaration.nameVariable,
								MyDslPackage.Literals.VARIABLE_DECLARATOR__NAME_VARIABLE
							);
						}
					} catch (Exception e) {
						error(e.message, fd.variableDeclaration.nameVariable.vari.expression.getAux(),
							MyDslPackage.Literals.EXPRESSION_AUX__ARG_LIST);
					}

				}
				allClasses.setGlobalVar(variable, typeName);
				if (variable.getCountNames() > 0) {
					for (Variable_declarator varDecl : fd.getVariableDeclaration().getNames()) {
						variable.setName(varDecl.getNameVariable());
						allClasses.setGlobalVar(variable, typeName);
					}
				}

			}

		}

	}

	def validaContructor(EList<Field_declaration> list, String typeName) {
		var ContructorValidate cv = new ContructorValidate();
		try {
			allClasses.setConstructors(cv.constructorValidateAll(list, typeName), typeName);
		} catch (MyDslException e) {
			var ConstructorObj constAux;
			if (e.nodeError.size() == 1) {
				constAux = e.nodeError.get(0) as ConstructorObj;
				error(e.message, constAux.md, MyDslPackage.Literals.CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR);
			}

			for (Object constError : e.nodeError) {
				constAux = constError as ConstructorObj;
				error(e.message + (constAux	) + " in Type " + typeName, constAux.md,
					MyDslPackage.Literals.CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR);
			}
		}

	}

	def validaModifiers(EList<String> list, String type, String typeName) throws Exception{
		var ModifiersValidate modValidate = new ModifiersValidate();
		var int size = list.size();
		var String firstModifier;
		if (size > 0) {
			firstModifier = list.get(0);
		}
		try {
			if (type.equals(CLASS)) {
				modValidate.classValidate(size, firstModifier, typeName, list);
			} else if (type.equals(INTERFACE)) {
				modValidate.interfaceValidate(size, firstModifier, typeName, list);
			}

		} catch (Exception e) {
			throw e;
		}

	}

	@Check
	def checkMethodDeclaration(Method_declaration md) {

		var ModifiersValidate modValidate = new ModifiersValidate();
		var EList<String> methodMods = md.modifiersMethod;
		var int size = methodMods.size();
		try {
			modValidate.methodValidate(size, md.nameMethod, methodMods, "", "", md.statementMethod != null);
		} catch (Exception e) {
			error(e.message, md, MyDslPackage.Literals.METHOD_DECLARATION__NAME_METHOD);
		}

	}

	@Check
	def variableDeclaration(Variable_declarator vd) {
		var String name = vd.nameVariable;
		var List<Variable> global;

	}

}
