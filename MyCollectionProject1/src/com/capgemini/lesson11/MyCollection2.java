package com.capgemini.lesson11;
import java.util.*;

public class MyCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generic collection
	//	List<String> s=new ArrayList<String>();  /// internally it uses array. Faster for searching. Slower for insertion and removal  
	//	List<String> s=new LinkedList<String>(); // internally it uses linkedlist. Fatser for insertion and removal. slower for searching
		LinkedList<String> s=new LinkedList<String>();  // can use as a list as well as as a queue
		s.add("Ram");  // 0
		s.add("Sham");  //1
		s.add("Krishna");
		s.add(null); // null accepted
		s.add("Ganesh");
		s.add(null); // null accepted 
		s.add("Ganesh");		// Duplicates can be added
		//s.add(45);  // equivalent to s.add(new Integer(45)); //autoboxing
		System.out.println(s);
		System.out.println("======================");
		System.out.println("Size of a collection = "+s.size());
		System.out.println("======================");
		Iterator<String> i=s.iterator();
		while(i.hasNext())
		{
			String o=i.next();
			System.out.println(o);
			//String e=(String)o; // not required
			//System.out.println(e);
		}
		System.out.println("======================");
		for(String o:s)
			System.out.println(o);
		
		System.out.println("======================");
		String el=s.get(0);
		System.out.println("Element at 0 index is "+el);
		System.out.println(s);
		s.set(3,"Cap Gemini");  
		
		System.out.println("After replacing element at third index");
		System.out.println(s);
		s.add(2,"Raja");
		System.out.println("After inserting at 2 index "+s);
		boolean removed= s.remove("Raja");
		System.out.println("Raja is removed "+removed);
		System.out.println("After removing Raja list is ");
		System.out.println(s);
		String rmel=s.remove(2);
		System.out.println("Removed element is "+ rmel);
		System.out.println(s);
		
		System.out.println("======================");
		
		// Queue methods
		String el1=s.peek();   // retirives fist elemet
		System.out.println(s);
		System.out.println(el1);
		System.out.println("After peek"+s);
		el1=s.peek();
		System.out.println(s);
		System.out.println(el1);
		System.out.println("After peek"+s);
		
		
		
		String el2=s.poll();   // removes first element
		System.out.println(el2);
		System.out.println("After poll "+s);
		el2=s.poll();
		System.out.println(el2);
		System.out.println("After poll "+s);
		
		boolean check=s.offer("xxxxxx");  // add the element at the last
		System.out.println("Offer element "+check);
		System.out.println(s);
		    
	}

}
