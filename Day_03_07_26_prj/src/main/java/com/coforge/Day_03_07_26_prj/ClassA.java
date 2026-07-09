package com.coforge.Day_03_07_26_prj;

public class ClassA implements interface1,interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a=new ClassA();
		interface1 i1=new ClassA();
		interface1 i2=new ClassA();
		i1.sayHello();
		i2.sayHello();
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello.....");
	}

}
