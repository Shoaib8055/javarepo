package com.capgemini.lesson11;
import java.util.*;

public class MyCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generic collection , type safe collection
		Set<String> s=new HashSet<String>();    // Generic only Strings are allowed , HashSet is no duplicates and unordered collection
		//TreeSet sorts elements in natural sorting order 
		//Set<String> s=new TreeSet<>();    // diamond jdk 1.7 onwards  // elements are sorted in natural order and unordred does not maintain insertion order and no duplicates
		//Set<String> s=new LinkedHashSet<>(); // stores insertion order , no duplicates, null is allowed , unique but ordered collection
		 
		s.add("Ram");
		s.add("Sham");
		s.add("Krishna");
	//	s.add(null); // null accepted only once // throws NullPointerException for TreeSet
		s.add("Ganesh");
//		s.add(null); // not accepted
		s.add("Ganesh");		// Duplicates can not be added
		//s.add(45);  // equivalent to s.add(new Integer(45)); //autoboxing
		System.out.println(s);
		System.out.println("======================");
		System.out.println("Size of a collection = "+s.size());
		System.out.println("======================");
		Iterator<String> i=s.iterator();
		while(i.hasNext())
		{
			//Object o=i.next();   // up casting  not required
			String o=i.next();
			//System.out.println(o.toUpperCase());
			System.out.println(o);
			//String e=(String)o; // not required
			//System.out.println(e);
		}
		System.out.println("======================");
		for(String o:s)
			System.out.println(o);
		

	}

}


//  HashSet checks for duplicates by executing hashcode and equals method
// LinkedHashSet  checks for duplicates by executing hashcode and equals method
// TreeSet checks for dulicates and sorts  elements by executing compareTo method








