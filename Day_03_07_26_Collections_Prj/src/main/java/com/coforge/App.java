package com.coforge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        ArrayList alist=new ArrayList();
//        alist.add(10);
//        alist.add("Atharva");
//        alist.add(56.78f);   //56.78f ----> converted to float object
//        alist.add(10.06);
//        alist.add(true);
//        alist.add(null);  //null values are allowed
//        alist.add(10);
//        alist.add(10);    //duplicates are allowed
//        alist.add(10);
//        alist.add(null);
//        alist.add(null);
//        System.out.println("ArrayList Elements are: ");
//        for (int i=0;i<alist.size();i++)
//        	System.out.println(alist.get(i));
    	
    	
    	ArrayList<Integer>iList=new ArrayList<Integer>();
    	iList.add(34);
    	iList.add(89);
    	iList.add(32);
    	
    	iList.add(89);
    	iList.add(34);
    	iList.add(89);
    	iList.add(34);
    	
//    	iList.add(null);
//    	iList.add(null);
//    	iList.add(null);
    	
    	System.out.println("ArrayList Elements are: ");
        for (int i=0;i<iList.size();i++)
        	System.out.println(iList.get(i));
    	
    	
        iList.add(3,78);     //to add element at particular index. iList.add(index,element)
        System.out.println("ArrayList Elements are: ");
        for (int i=0;i<iList.size();i++)
        	System.out.println(iList.get(i));
        
        
        ArrayList<Integer>alist=new ArrayList<Integer>();
        alist.add(78);
        alist.add(66);
        alist.add(59);
        
        iList.addAll(4,alist);
        System.out.println("ArrayList Elements are: ");
        for (int i=0;i<iList.size();i++)
        	System.out.println(iList.get(i));
        
        System.out.println(iList.contains(1));
        System.out.println("enhanced for loop");
        System.out.println("*******************");
        for(Integer i:iList)
        	System.out.println(i);
        System.out.println("******************************");
        
        System.out.println(iList.containsAll(alist));
        System.out.println("******************************");
        System.out.println(iList.remove(0));   //remove operation is done then it displays that element meaning removed
//        Integer rem=34;
//        System.out.println(iList.remove(rem));
        System.out.println(iList.remove(Integer.valueOf(34)));
        System.out.println("******************************");
        System.out.println(iList.removeAll(alist));
        System.out.println("******************************");
        for(Integer i:iList)
        	System.out.println(i);
        System.out.println("******************************");
        iList.ensureCapacity(35);
        System.out.println("******************************");
        iList.forEach(i->System.out.println(i));   
        System.out.println("******************************");
//        List<Integer>list=iList.reversed();
//        iList.forEach(i->System.out.println(i));
//        System.out.println("******************************");
//        iList.addFirst(67);
//        iList.addLast(90);
//        iList.forEach(i->System.out.println(i));
//        System.out.println("******************************");
        
//        Iterator<Integer>itr=iList.iterator();
//        while(itr.hasNext()) {
//        	int value=itr.next();
//        	if(value==32)
//        		itr.remove();
//        	System.out.println(value);
//        }
//        System.out.println(iList);
        
        ListIterator<Integer>itr=iList.listIterator();
        while(itr.hasNext())
        	System.out.println(itr.next());
        System.out.println("*************************");
        System.out.println("Reversed List");
        while(itr.hasPrevious())
        	System.out.println(itr.previous());
        
        
        System.out.println("Clone ArrayList");
        System.out.println("*************************");
        ArrayList<Integer>clonedList=(ArrayList<Integer>) iList.clone();
        System.out.println(iList.hashCode());
        System.out.println(clonedList.hashCode());
//        clonedList.add(700);
        iList.add(500);
        System.out.println(iList.hashCode());
        System.out.println(clonedList.hashCode());
        
        iList.sort(null);
    }
}
