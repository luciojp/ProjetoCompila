package org.xtext.example.mydsl.validation.utils;

import java.util.List;

import org.xtext.example.mydsl.myDsl.Constructor_declaration;

public class ConstructorObj {
	
	private String name;
	private List<String> parameters;
	private Constructor_declaration cd;
	
	public ConstructorObj(String name, List<String> parameters, Constructor_declaration cd) {
		this.name = name;
		this.parameters = parameters;
		this.cd = cd;
		
	}
	
	public Constructor_declaration getMd() {
		return cd;
	}

	public void setMd(Constructor_declaration md) {
		this.cd = md;
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
		if(obj instanceof ConstructorObj){
			ConstructorObj newObj = (ConstructorObj) obj;
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
