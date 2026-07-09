package com.coforge.Day_07_07_26_Exceptions;

/**
 * Hello world!
 */



public class App {
	
	public static void div(int a,int b) {
		if(b==0)
			throw new ArithmeticException();
		else
			System.out.println();
	}

	
    public static void main(String[] args) {
//    	int a=78,b[]=null,c=0; String s=null;
//    	try {
// 		for(int i=0;i<=b.length;i++)
//  			c=a/b[i];
//    		System.out.println(s.charAt(0));
//    	}
//    	catch(NullPointerException n) {
//    		//n.printStackTrace();
//    		//System.out.println(n.getMessage());
//    		System.out.println("Exception Occured "+n);
//    	}
//    	catch(ArrayIndexOutOfBoundsException ae) {
//    		ae.printStackTrace();
//    	}
//    	catch(ArithmeticException e) {
//    		e.printStackTrace();
//    	}
//    	finally {
//    		System.out.println("After try catch");
//    	}
//    	catch(RuntimeException e) {
//    		e.printStackTrace();
//    	} 	
//    	catch(Exception e) {
//    		e.printStackTrace();
//   	}
//    	System.out.println(c);
//    	
    	try {
    	div(5,0);
    	} catch(Exception e) {
    		
    	}
    	System.out.println("program completed");
    	    }
}
