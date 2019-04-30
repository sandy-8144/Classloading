package com.programming.loading;


public class Class4 {

	
	

	private static Class4 instance=new Class4();

	public static Class4 getInstance() {
		
	return instance;
		
	
		
	}
	
	static {
		
		System.out.println("Class4 static init");
	}
	
	private Class4() {
		System.out.println("constructor called.");
	}
	
	
	
	
}
