package org.xtext.example.mydsl.validation.utils;

import java.util.HashSet;
import java.util.List;

public class ModifiersValidate {
	

	public void classValidate(int size, String firstModifier, String typeName, List<String> list) throws Exception {
		if (size > 0 && !((firstModifier).equals("public") || firstModifier.equals("final")
				|| firstModifier.equals("abstract"))) {
			throw new Exception(
					"Illegal modifier for the class " + typeName + "; only public, abstract & final are permitted");
		} else if (new HashSet<String>(list).size() != size) {
			throw new Exception("Duplicate modifier for the type " + typeName);
		} else if (size > 1 && countInList(list, "final") >= 1 && countInList(list, "abstract") >= 1) {
			throw new Exception("The class " + typeName + " can be either abstract or final, not both");
		}
	}

	public void interfaceValidate(int size, String firstModifier, String typeName, List<String> list) throws Exception {
		if (size > 0 && !(firstModifier.equals("public") || firstModifier.equals("abstract"))) {
			throw new Exception(
					"Illegal modifier for the interface " + typeName + "; only public & abstract are permitted");
		} else if (new HashSet<String>(list).size() != size) {
			throw new Exception("Duplicate modifier for the type " + typeName);
		}

	}
	
	public void methodValidate(int size, String methodName, List<String> list, String typeName, String typeAbstract, boolean hasStmBlock ) throws Exception{
		if(size > 0){
			if (new HashSet<String>(list).size() != size) {
				throw new Exception("Duplicate modifier for the method "+methodName+" in type "+typeName);
				
			}else if(list.contains("abstract")){
				
				if(!typeAbstract.equals("true")){
					throw new Exception("The abstract method "+methodName+" in type "+typeName+" can only be defined by an abstract class");
				}else if (hasStmBlock) {
					throw new Exception("Abstract methods do not specify a body");
				}else{				
					if(list.contains("private") || list.contains("final")){
						throw new Exception("The abstract method "+methodName+" in type "+typeName+" can only set a visibility modifier, one of public or protected");
					}else if(list.contains("static")){
						throw new Exception("illegal combination of modifiers: abstract and static");
					}
				}
			}
		}
	}

	private int countInList(List<String> listSearch, String find) {
		int cont = 0;
		for (String value : listSearch) {
			if (value.equals(find))
				cont++;
		}
		return cont;
	}
	
	

}
