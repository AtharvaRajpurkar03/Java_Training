package com.coforge.Day6_07_26_CollectionPrj;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		// stack follows LIFO
		Stack<Integer> stack= new Stack<Integer>();
		for(int i=1;i<=10;i++)
//			stack.add((int)(Math.round(Math.random()*100)));
			stack.push(i*3);
		System.out.println(stack);
		
		System.out.println(stack.search(15));  //will not return index, will return a number 
	//	System.out.println(stack.pop());  //last element is the top most element
	}

}
