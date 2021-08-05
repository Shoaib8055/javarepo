package com.capgemini.lesson11;

// Demonstrate ArrayList.
import java.util.*;

class ArrayListDemo {
	public static void main(String args[]) {
		// create an array list
		List<String> al = new ArrayList<String>();
		System.out.println("Initial size of al: " + al.size());
	//	List<List<String>> al1 = new ArrayList<>();
		// add elements to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add("B");
		
		System.out.println("Contents of al: " + al);
		al.add(1, "A2");

		System.out.println("Size of al after additions: " + al.size());

		// display the array list
		System.out.println("Contents of al: " + al);

		// Remove elements from the array list
		boolean r1=al.remove("F");
		System.out.println(r1);
		System.out.println("Contents of al: " + al);
		String r2=al.remove(2);
		System.out.println(r2);

		System.out.println("Size of al after deletions: " + al.size());
		System.out.println("Contents of al: " + al);
		System.out.println("===================");
		al.forEach(s->System.out.println(s));
		
	}
}
