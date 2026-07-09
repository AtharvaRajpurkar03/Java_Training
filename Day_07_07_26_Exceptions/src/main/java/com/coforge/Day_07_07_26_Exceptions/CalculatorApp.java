package com.coforge.Day_07_07_26_Exceptions;

//public class CalculatorApp implements CalculatorInterface {
public class CalculatorApp {

	public static void main(String[] args) {
		
//		CalculatorInterface ci=()->{
//			int a=10,b=5;
//			System.out.println(a/b);
//		};
//		
//		CalculatorInterface ci=(a,b)->a+b; //possible only when there is one return
//		System.out.println(ci.add(5, 6));

//		CalculatorInterface ci=()->{
//			int a=6,b=3;
//			return a-b;
//		};
//    	System.out.println(ci.sub());

		CalculatorInterface ci=(a,b)->{
			System.out.println(a*b);
		};
		ci.mul(5,6);;
		
//		ci.div();
		
		
//		CalculatorInterface ci=new CalculatorApp();
	
//		ci.div();
	}

//	@Override
//	public int div() {
//		// TODO Auto-generated method stub
//		int a=10, b=5;
//		System.out.println(a/b);
//	}

//	@Override
//	public void mul(int a, int b) {
//		// TODO Auto-generated method stub
//		System.out.println(a*b);;
//	}

//	@Override
//	public int add(int a, int b) {
//		// TODO Auto-generated method stub
//		return a+b;
//	}

//	@Override
//	public int sub() {
//		// TODO Auto-generated method stub
//		int a=67,b=34;
//		return a-b;
//	}

	
}
