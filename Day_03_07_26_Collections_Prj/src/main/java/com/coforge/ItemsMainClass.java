package com.coforge;
import java.util.ArrayList;
import java.util.Collections;

public class ItemsMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Item> itemList=new ArrayList<Item>();
		Item laptop=new Item("Dell",12345,65000);
		Item mouse=new Item("Logitech",6754,1000);
		Item printer=new Item("Canon",5432,7500);
		
		itemList.add(laptop);
		itemList.add(mouse);
		itemList.add(printer);
		
		System.out.println(itemList);
		Collections.sort(itemList); //not simple collection, it is collection of objects
		// cannot apply naturally sorting order, as item contains multiple properties
		// it cant understand on which property to apply sort on
		
		//comparable,comparator interfaces has to be implemented
		for(Item i : itemList)
			System.out.println(i);
	}

}
