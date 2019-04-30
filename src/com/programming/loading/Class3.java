package com.programming.loading;



public class Class3 {

	static {
		System.out.println("Class3 is init");
	}
private static class InstanceHolder {
		
		private static Class3 INSTANCE = new Class3();
		
		static {
			System.out.println("InstanceHolder is init");
		}
		
	}
	
	private Class3() {
		System.out.println("class3 cons is init");
	}
	
	public static Class3 getInstance() {
		return InstanceHolder.INSTANCE;
	}
	
}
