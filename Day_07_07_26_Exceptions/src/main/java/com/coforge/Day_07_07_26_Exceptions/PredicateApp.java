package com.coforge.Day_07_07_26_Exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateApp {
	public static void main(String[] args) {
		Integer arr[]= {23,12,23,45,78,90,56,66,86};
		List<Integer>list=Arrays.asList(arr);
		Predicate<Integer> predicate=(n)->n%2==0;
		for(Integer n:list)
			if(predicate.test(n))
				System.out.println(n);
		System.out.println("*******************");
		predicate=(n)->n>30;
		for(Integer n:list)
			if(predicate.test(n))
		System.out.println(n);
		
		String[] names= {"Atharva","Shivranjan","Sahil","Ayush","Mani","Yash","Nayan"};
		List<String> namesList=Arrays.asList(names);
		Predicate<String> predicate1=(n)->n.charAt(0)=='s';
		for(String name:namesList)
			if(predicate1.test(name))
				System.out.println(name);
	}
}
