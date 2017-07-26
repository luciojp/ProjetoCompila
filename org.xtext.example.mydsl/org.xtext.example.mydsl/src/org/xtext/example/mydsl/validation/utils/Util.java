package org.xtext.example.mydsl.validation.utils;

import org.xtext.example.mydsl.myDsl.Expression;

public class Util {
	
	
	public static String getTypeExp(Expression exp) throws Exception{
		if (exp.getName() == null && exp.getLiteralExpression() == null && exp.getLogicalExpression() == null) {
			throw new Exception("Invalid expression");
		}
		if (exp.getLiteralExpression() != null) {
			if (exp.getLiteralExpression().getExp2() != null) {
				return "float";
			} else if (exp.getLiteralExpression().getString() != null) {
				return "String";
			} else if (exp.getLiteralExpression().getCharLit() != null) {
				return "char";
			} else {
				return "int";
			}
		}else if(exp.getLogicalExpression() != null){
			if(exp.getLogicalExpression().getTrue() != null || exp.getLogicalExpression().getFalse() != null){
				return "boolean";
			}else{
				if(exp.getLogicalExpression().getExpression() != null) return getTypeExp(exp.getLogicalExpression().getExpression());
			}
		} 
		else if (exp.getName() != null) {
			return exp.getName();
		}
		return null;
	}

}
