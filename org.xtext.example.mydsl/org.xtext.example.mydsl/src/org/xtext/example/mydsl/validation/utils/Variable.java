package org.xtext.example.mydsl.validation.utils;

import java.util.ArrayList;
import java.util.List;

import org.xtext.example.mydsl.myDsl.Variable_declaration;

public class Variable {
	
	private String name;
	private List<String> modifiers;
	private String type;
	private int lenArray;
	private int countNames;
	
	public int getCountNames() {
		return countNames;
	}

	public void setCountNames(int countNames) {
		this.countNames = countNames;
	}

	public Variable(Variable_declaration vd) throws Exception{
		modifiers = new ArrayList<String>();
		if(vd.getNames() != null){
			this.setCountNames(vd.getNames().size());			
		}else{
			this.setCountNames(0);
		}
		this.type = returnTypeToString(vd);
		this.toVariable(vd);
		if(vd.getNameVariable().getLenVector() != null){
			this.setLenArray(vd.getNameVariable().getLenVector().size());
		}
	}
	
	private void toVariable(Variable_declaration vd) throws Exception{
		if( vd.getModifiersVariable() != null && vd.getModifiersVariable().size() != 0){
			for (String newModifier : vd.getModifiersVariable()) {
				modifiers.add(newModifier);
			}			
		}
		setName(vd.getNameVariable().getNameVariable());
		
	}


	public Variable(String name, List<String> modifiers,String type, int array){
		this.setName(name);
		this.setModifiers(modifiers);
		this.setType(type);
		this.setLenArray(array);
	}
	
	private String returnTypeToString(Variable_declaration md) {
		String methodReturnType = md.getType().getTypeSpecifier().getPrimitiveType() != null?md.getType().getTypeSpecifier().getPrimitiveType():md.getType().getTypeSpecifier().getClassName();
		if (md.getType().getTypeVector() != null) {
			for (String vect : md.getType().getTypeVector()) {
				methodReturnType += vect;
			}

		}
		return methodReturnType;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getModifiers() {
		return modifiers;
	}
	public void setModifiers(List<String> modifiers) {
		this.modifiers = modifiers;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLenArray() {
		return lenArray;
	}
	public void setLenArray(int lenArray) {
		this.lenArray = lenArray;
	}
	

}
