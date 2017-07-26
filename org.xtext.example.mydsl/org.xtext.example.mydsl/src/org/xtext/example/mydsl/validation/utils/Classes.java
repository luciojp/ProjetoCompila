package org.xtext.example.mydsl.validation.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classes {	

	public Map<String,Heranca> classes;
	public Map<String, Heranca> interfaces;
	
	public Classes() {
		classes = new HashMap<String, Heranca>();
		interfaces = new HashMap<String, Heranca>();
		
	}

	
	public void addClass(String name, boolean isAbstract){
		Heranca aux = new Heranca(isAbstract);
		classes.put(name,aux);
	}
	public void addClass(String name, boolean isAbstract, String classHerdada){
		addClass(name,isAbstract);
		classes.get(name).addClass(classHerdada);
	}
	
	public void addInter(String name, boolean isAbstract){
		Heranca aux = new Heranca(isAbstract);
		interfaces.put(name,aux);
	}
	
	public void setInterfacesImple(List<String> inter, String className){
		for (String string : inter) {
			classes.get(className).addInterface(string);			
		}
		
	}
	
	public void setInterfacesImpleToInt(List<String> inter, String interName){
		for (String string : inter) {
			interfaces.get(interName).addInterface(string);			
		}
		
	}
	
	public List<ConstructorObj> getConstructors(String className) {
		Heranca actualCons = classes.get(className);
		return actualCons.getConstructors();
	}

	public void setConstructors(List<ConstructorObj> constructors, String className) {
		Heranca actualCons = classes.get(className);
		actualCons.setConstructors(constructors);
	}
	
	public boolean findClass(String className){
		return classes.containsKey(className);
	}
	
	public boolean findInterface(String interName){
		return interfaces.containsKey(interName);
	}
	
	public void setGlobalVar(Variable vari, String className){
		classes.get(className).setVar(vari);
	}
	
	public void setMethods(Map<String, List<MethodObj>> method, String className){
		classes.get(className).setMethod(method);
	}
	
	public void setMethodsInter(Map<String, List<MethodObj>> method, String className){
		interfaces.get(className).setMethod(method);
	}
	
	
	
	
	public class Heranca{
		private List<String> extendsClass;
		private List<String> implementsInterface;
		private List<Variable> globalVaribles;
		private List<ConstructorObj> constructors;
		private boolean isAbstract;

		private Map<String, List<MethodObj>> methodNames;
		
		
		public Heranca(boolean isAbs) {
			extendsClass = new ArrayList<String>();
			implementsInterface = new ArrayList<String>();
			globalVaribles = new ArrayList<Variable>();
			constructors = new ArrayList<ConstructorObj>();
			methodNames = new HashMap<String, List<MethodObj>>();
			this.isAbstract = isAbs;
			
		}
		
		public List<String> getExtends(){
			return extendsClass;
		}
		
		public List<String> getimplements(){
			return implementsInterface;
		}
		
		public void setMethod(Map<String, List<MethodObj>> methods) {
			methodNames = methods;
			
		}

		private boolean findMethod(String method){
			return methodNames.containsKey(method);			
		}
		
		public void setVar(Variable vari) {
			globalVaribles.add(vari);
			
		}

		public List<ConstructorObj> getConstructors() {
			return constructors;
		}


		public void setConstructors(List<ConstructorObj> constructors) {
			this.constructors = constructors;
		}
		
		
		public void addClass(String className){
			extendsClass.add(className);
		}
		
		public void addInterface(String intefaceName){
			implementsInterface.add(intefaceName);			
		}
		
		
	}
	
	

}
