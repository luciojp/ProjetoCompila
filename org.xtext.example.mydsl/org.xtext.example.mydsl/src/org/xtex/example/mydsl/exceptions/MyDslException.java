package org.xtex.example.mydsl.exceptions;

import java.util.ArrayList;
import java.util.List;

public class MyDslException extends Exception{
	
	private List<Object> nodeError;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyDslException(String msg) {
		super(msg);
		nodeError = new ArrayList<Object>();
		
	}

	public List<Object> getNodeError() {
		return nodeError;
	}

	public void setNodeError(Object nodeError) {
		this.nodeError.add(nodeError);
	}
	

	
	
	
	
	
	

}
