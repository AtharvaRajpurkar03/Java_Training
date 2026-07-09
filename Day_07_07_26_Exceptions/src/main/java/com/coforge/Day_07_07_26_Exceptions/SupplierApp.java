package com.coforge.Day_07_07_26_Exceptions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class Item{
	private int id;
	private String name;
	public Item() {
		super();
	}
	public Item(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
}	

public class SupplierApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Supplier<Integer> supplier=()->(int)(Math.round(Math.random()*10000));
//		System.out.println(supplier.get());
		
//		Supplier<Integer> supplier=()->(int)(Math.round(Math.random()*10000));
//		Supplier<LocalDateTime>timeSupplier=()->LocalDateTime.now();
//		System.out.println(timeSupplier.get());

//		List<Item> itemList=new ArrayList<Item>();
//		itemList.add(new Item(123,"Laptop"));
//		itemList.add(new Item(124,"Mouse"));
//		itemList.add(new Item(125,"Printer"));
//		itemList.add(new Item(126,"Pen"));

		
		Supplier<Item>itemSupplier=()->new Item(123,"Laptop");
		System.out.println(itemSupplier.get());
	}

}		
