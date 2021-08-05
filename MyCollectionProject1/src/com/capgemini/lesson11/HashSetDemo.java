package com.capgemini.lesson11;

import java.util.*;

class HashSetDemo {
	public static void main(String args[]) {
		// create a hash set   
		Set<String> hs = new HashSet<String>();     /// only Strings are allowed in a collection  // Generic
		// add elements to the hash set
		hs.add("Ram");
		hs.add("Sham");
		hs.add("Krishna");
		hs.add("Ganesh");
		hs.add("Durga");
		hs.add("Ganesh");
		hs.add("Diya");
		hs.add(null);
		//hs.add(100);   // new Integer(100); wrapper object
		System.out.println(hs);
		
		boolean ch=hs.remove("Ram");
		System.out.println(ch);
		
		System.out.println(hs);
		
	}
}
