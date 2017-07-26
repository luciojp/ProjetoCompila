package org.xtext.example.mydsl.validation.utils;

import java.util.ArrayList;
import java.util.List;

import org.xtex.example.mydsl.exceptions.MyDslException;
import org.xtext.example.mydsl.myDsl.Constructor_declaration;
import org.xtext.example.mydsl.myDsl.Field_declaration;
import org.xtext.example.mydsl.myDsl.Parameter;

public class ContructorValidate {
	public List<ConstructorObj> constructorValidateAll(List<Field_declaration> list, String typeName)
			throws MyDslException {
		List<ConstructorObj> constructors = new ArrayList<ConstructorObj>();
		MyDslException excep;

		for (Field_declaration field_declaration : list) {

			if (field_declaration.getContructorName() != null) {
				Constructor_declaration cd = (Constructor_declaration) field_declaration.getContructorName();
				if (!(cd.getNameConstructor().equals(typeName))) {
					excep = new MyDslException("Return type for the method is missing");
					excep.setNodeError(new ConstructorObj(cd.getNameConstructor(), null, cd));
					throw excep;
				}
				excep = new MyDslException("Duplicate method ");
				ConstructorObj newConstructor = new ConstructorObj(cd.getNameConstructor(), getAllParameters(cd), cd);
				
				for (ConstructorObj constructor : constructors) {
					if (constructor.equals(newConstructor)) {
						excep.setNodeError(constructor);
					}
				}
				if (excep.getNodeError().size() > 0) {
					excep.setNodeError(newConstructor);
					throw excep;
				}
				constructors.add(newConstructor);

			}
		}

		return constructors;

	}

	private List<String> getAllParameters(Constructor_declaration cd) {
		List<Parameter> parameters = new ArrayList<Parameter>();
		if (cd.getParameterListConstructor() != null) {
			parameters.add(cd.getParameterListConstructor().getParameter());
			if (cd.getParameterListConstructor().getParameters() != null) {
				parameters.addAll(cd.getParameterListConstructor().getParameters());
			}
		}

		return filterTypeByParameters(parameters);
	}

	private List<String> filterTypeByParameters(List<Parameter> list) {
		List<String> paramsFiltered = new ArrayList<String>();
		String aux = "";
		for (Parameter param : list) {
			aux = param.getType().getTypeSpecifier().getPrimitiveType() != null?param.getType().getTypeSpecifier().getPrimitiveType():param.getType().getTypeSpecifier().getClassName();
			if (param.getType().getTypeVector().size() > 0) {
				for (int i = 0; i < param.getType().getTypeVector().size(); i++) {
					aux += param.getType().getTypeVector().get(i);
				}
			}
			paramsFiltered.add(aux);
		}
		return paramsFiltered;

	}
}
