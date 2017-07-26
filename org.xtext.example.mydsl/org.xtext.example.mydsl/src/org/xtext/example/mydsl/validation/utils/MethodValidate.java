package org.xtext.example.mydsl.validation.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xtex.example.mydsl.exceptions.MyDslException;
import org.xtext.example.mydsl.myDsl.Field_declaration;
import org.xtext.example.mydsl.myDsl.Method_declaration;
import org.xtext.example.mydsl.myDsl.Parameter;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.Variable_declarator;

public class MethodValidate {

	public Map<String, List<MethodObj>> methodValidateAll(List<Field_declaration> list, String typeName)
			throws MyDslException {
		Map<String, List<MethodObj>> allMethods = new HashMap<String, List<MethodObj>>();
		MyDslException excep = new MyDslException("Duplicate method ");

		for (Field_declaration field_declaration : list) {

			if (field_declaration.getMethodName() != null) {
				Method_declaration md = (Method_declaration)field_declaration.getMethodName();
				String methodReturnType = returnTypeToString(md);
				
				MethodObj newMethod = new MethodObj(md.getNameMethod(), methodReturnType, getAllParameters(md),
						md.getModifiersMethod().contains("abstract"), md);
				List<Statement> stm = md.getStatementMethod().getStatments();
				for ( Statement actualStatement : stm) {
					if(actualStatement.getVariableDeclaration() != null){
						Variable variable = null;
						try{
							variable = new Variable(actualStatement.getVariableDeclaration());
						}catch(Exception e){						
							excep = new MyDslException("Variable declaration error");
							excep.setNodeError(actualStatement.getVariableDeclaration());
							throw excep;
						}
						if(actualStatement.getVariableDeclaration().getNameVariable().getVari() != null &&
								actualStatement.getVariableDeclaration().getNameVariable().getVari().getExpression() != null){
							try{
								if(!Util.getTypeExp(actualStatement.getVariableDeclaration().getNameVariable().getVari().getExpression())
										.equals(variable.getType())){
									excep = new MyDslException(variable.getType()+" can not be converted in "+Util.getTypeExp(actualStatement.getVariableDeclaration().getNameVariable().getVari().getExpression())
									.equals(variable.getType()));
									excep.setNodeError(actualStatement.getVariableDeclaration());
									throw excep;
									
							}
							}catch(Exception e){
								excep = new MyDslException(e.getMessage());
								excep.setNodeError(actualStatement.getVariableDeclaration());
								throw excep;
							}
														
						}
						newMethod.setFields(variable);
						if(variable.getCountNames() > 0){
							for (Variable_declarator varDecl : actualStatement.getVariableDeclaration().getNames()) {
								variable.setName(varDecl.getNameVariable());
								newMethod.setFields(variable);
							}
						}
					}
				}
				if (!allMethods.containsKey(md.getNameMethod())) {
					allMethods.put(md.getNameMethod(), new ArrayList<MethodObj>());
				} else {
					for (MethodObj met : allMethods.get(md.getNameMethod())) {
						if (met.equals(newMethod)) {
							excep.setNodeError(met);
						}
					}
					if (excep.getNodeError().size() > 0) {
						excep.setNodeError(newMethod);
						throw excep;
					}
				}	
				allMethods.get(md.getNameMethod()).add(newMethod);
			}
			
		}

		return allMethods;

	}
	
	

	private String returnTypeToString(Method_declaration md) {
		String methodReturnType = md.getTypeMethod().getTypeSpecifier().getPrimitiveType() != null?md.getTypeMethod().getTypeSpecifier().getPrimitiveType():md.getTypeMethod().getTypeSpecifier().getClassName();
		if (md.getTypeMethod().getTypeVector() != null) {
			for (String vect : md.getTypeMethod().getTypeVector()) {
				methodReturnType += vect;
			}

		}
		return methodReturnType;
	}

	private List<String> getAllParameters(Method_declaration md) {
		List<Parameter> parameters = new ArrayList<Parameter>();
		if (md.getParameterListMethod() != null) {
			parameters.add(md.getParameterListMethod().getParameter());
			if (md.getParameterListMethod().getParameters() != null) {
				parameters.addAll(md.getParameterListMethod().getParameters());
			}
		}

		return filterTypeByParameters(parameters);
	}

	private List<String> filterTypeByParameters(List<Parameter> list) {
		List<String> paramsFiltered = new ArrayList<String>();
		String aux = "";
		for (Parameter param : list) {
			aux = param.getType().getTypeSpecifier().getPrimitiveType() != null?param.getType().getTypeSpecifier().getPrimitiveType():param.getType().getTypeSpecifier().getClassName();
			if (param.getType().getTypeVector().size()>0) {
				for (int i = 0; i < param.getType().getTypeVector().size();i++) {
					aux += param.getType().getTypeVector().get(i);
				}
			}
			paramsFiltered.add(aux);
		}
		return paramsFiltered;

	}
	
	

}
