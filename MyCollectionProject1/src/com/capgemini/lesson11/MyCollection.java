package com.capgemini.lesson11;
import java.util.*;

public class MyCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set s=new HashSet();   // non generic collection u can add any type element object  . it is not typesafe
		Set s=new TreeSet();   // implementation of SortedSet and it will sort elements .
		/*s.add("Ram");
		s.add("Sham");
		s.add("Krishna");
		//s.add(null); // null accepted only once  .  
		s.add("Ganesh");
		//s.add(null);  // will not be added
		s.add("Ganesh");		// Duplicates can not be added and will not be considered as an error
		*/
		s.add(45);  // equivalent to s.add(new Integer(45)); //autoboxing
		s.add(22);  
		s.add(202);  
		s.add(100);  
		System.out.println(s);
		System.out.println("======================");
		System.out.println("Size of a collection = "+s.size());
		System.out.println("======================");
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Object o=i.next();   // up casting
			//System.out.println(o);
		//	String e=(String)o;   // type cast to sub type ie downcast
			Integer e=(Integer)o;
		//	System.out.println(e.toUpperCase());
			System.out.println(e);
		}
		System.out.println("======================");
		for(Object o:s)
			System.out.println(o);
		

	}

}


/*
 * HashSet -
 * = no duplicates are allowed, checks for duplicates using hashCode and equals method
 * = unordered -> does not maintain insertion order
 * = allows one null object , but while retrieving it may throw NullPonterException
 * = non generic HashSet allows any class type element , but while retrieving and type casting 
 * 		 it will throw    ClassCastException
 * 
 * TreeSet-
 * = no duplicates are allowed, checks for duplicates using compareTo() method, 
 * 			compareTo() method belongs to Comparable interface
 * = unordered -> does not maintain insertion order
 * = but it will sort all elements naturally by using compareTo method
 * = all elements in non generic TreeSet must be of same class type otherwise
 *     it will throw ClassCastException
 * =  null object can not be added it the TreeSet, otherwise it will throw NullPonterException
 * 
 * 
 * 
 * */





