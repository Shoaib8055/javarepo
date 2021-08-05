package com.capgemini.lesson11;
import java.util.*;
public class VectorExample {
	public static void main(String[] args) {
		Vector<Address> ml = new Vector<Address>();  // all methods are synchronized ie thread safe usage is before jdk1.5
		// hence called legacy class . it is a list

		// add elements to the vector
		ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
		ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
		ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahome", "IL",
				"61853"));
		ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL",
				"61820"));
		ml.add(null);
		Enumeration en=ml.elements();  // It is same like Iterator
		while(en.hasMoreElements()) {
			Address ad=(Address)en.nextElement();
			System.out.println(ad);
			System.out.println("===================");
		}
		
		

	}
}
