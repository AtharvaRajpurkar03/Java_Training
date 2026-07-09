package com.coforge.Day6_07_26_CollectionPrj;

import java.util.HashSet;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>hset=new HashSet<Integer>();
		hset.add(67);
		hset.add(12);
		hset.add(45);
		hset.add(1);
		hset.add(56);
		hset.add(12);
		hset.add(60);
		hset.add(12); //No insertion order, no duplicates
		hset.add(null);
		
		System.out.println(hset);
		
		HashSet<Integer> hset1=new HashSet<Integer>();
		hset1.add(65);
		hset1.add(85);
		hset1.add(13);
		hset1.add(1);
		hset1.add(89);
		hset1.add(121);
		hset1.add(56);
		
		System.out.println(hset1);
		
		hset.retainAll(hset1); //common elements are only going to exist in hset
		System.out.println(hset);
		
		Object[] obj=hset.toArray();
		
		for(Object i:obj)
			System.out.println(i);
		
		Integer[] arr=hset.toArray(new Integer[0]);
		
		for(Integer i:arr)
			System.out.println(i);
	}

}
