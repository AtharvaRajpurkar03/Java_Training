package com.coforge.Day_03_07_26_prj;

public class Demo { //final class cannot be extended, Inheritance is not possible
	final static String name="Ayush";  //final properties are constants
	
	public String sayHello(String name) { //No overriding here because of the final keyword
//		this.name="Atharva";
		return "Hello"+name;
	}
	public static String getName() {
		return name;
	}
}
