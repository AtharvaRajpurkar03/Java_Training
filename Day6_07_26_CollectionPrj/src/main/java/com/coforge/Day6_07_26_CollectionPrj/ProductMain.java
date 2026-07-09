package com.coforge.Day6_07_26_CollectionPrj;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeSet<Product>productTreeSet=new TreeSet<Product>();
//		
//
//		productTreeSet.add(new Product(101, "Laptop", 65000.0, 15));
//		productTreeSet.add(new Product(102, "Mobile", 25000.0, 30));
//		productTreeSet.add(new Product(103, "Tablet", 18000.0, 20));
//		productTreeSet.add(new Product(104, "Monitor", 12000.0, 12));
//		productTreeSet.add(new Product(105, "Keyboard", 1500.0, 50));
//		productTreeSet.add(new Product(106, "Mouse", 800.0, 75));
//		productTreeSet.add(new Product(107, "Printer", 9500.0, 10));
//		productTreeSet.add(new Product(108, "Speaker", 3500.0, 25));
//		productTreeSet.add(new Product(109, "Headphone", 2200.0, 40));
//		productTreeSet.add(new Product(110, "Webcam", 2800.0, 18));
//		
//		for(Product p:productTreeSet)
//			System.out.println(p);

		TreeSet<Integer>tree=new TreeSet<Integer>();
		tree.add(67);
		tree.add(56);
		tree.add(90);
		tree.add(12);
		tree.add(19);
		tree.add(99);
		tree.add(78);
//		System.out.println(tree);
//		
//		Set<Integer> set=tree.descendingSet();
//		System.out.println(set);
//		
//		Iterator<Integer> itr=tree.descendingIterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		
		System.out.println(tree.ceiling(28)); //returns nearest large element of given element
		System.out.println(tree.floor(28)); //returns nearest smaller value
		System.out.println(tree.lower(28));
		System.out.println(tree.higher(28));
		
	}

}
