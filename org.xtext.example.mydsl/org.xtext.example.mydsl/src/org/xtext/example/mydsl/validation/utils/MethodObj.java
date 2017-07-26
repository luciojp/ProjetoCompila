package org.xtext.example.mydsl.validation.utils;

import java.util.ArrayList;
import java.util.List;

import org.xtext.example.mydsl.myDsl.Method_declaration;

public class MethodObj {
	
	private String name;
	private String returnType;
	private List<String> parameters;
	private boolean isAbstract;
	private Method_declaration md;
	private List<Variable> fields;
	
	
	public MethodObj(String name, String returnType, List<String> parameters, boolean isAbstract, Method_declaration md) {
		this.name = name;
		this.returnType = returnType;
		this.parameters = parameters;
		this.isAbstract= isAbstract;
		this.md = md;
		this.fields = new ArrayList<Variable>();
		
	}
	
	public List<Variable> getFields() {
		return fields;
	}

	public void setFields(Variable fields) {
		this.fields.add(fields);
	}
	
	public Method_declaration getMd() {
		return md;
	}

	public void setMd(Method_declaration md) {
		this.md = md;
	}

	public boolean isAbstract() {
		return isAbstract;
	}

	public void setAbstract(boolean isAbstract) {
		this.isAbstract = isAbstract;
	}

	public boolean isEqualsParameters(List<String> otherParamters){
		if(otherParamters.size() != this.getParameters().size())return false;
		for (int i = 0; i < otherParamters.size(); i++) {
			if (!(this.getParameters().get(i).equals(otherParamters.get(i)))) {
				return false;
			}			
		}
		return true;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MethodObj){
			MethodObj newObj = (MethodObj) obj;
			if(newObj.getName().equals(this.name) && isEqualsParameters(newObj.getParameters())){
				return true;
			}
		}
		return false;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getReturnType() {
		return returnType;
	}


	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}


	public List<String> getParameters() {
		return parameters;
	}


	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}
	
	@Override
	public String toString() {
		String ret = this.getName()+"(";
		int cont = 0, size = parameters.size();
		for (String string : parameters) {
			ret += string;
			if(cont < size-1){
				ret += ",";
			}
		}
		ret += ")";		
		return ret;
	}
	
	

}
