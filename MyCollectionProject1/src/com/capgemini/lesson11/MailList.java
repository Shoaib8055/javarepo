package com.capgemini.lesson11;

import java.util.*;



class MailList {
	public static void main(String args[]) {
		List<Address> ml = new LinkedList<Address>();

		// add elements to the linked list
		ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
		ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
		ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahome", "IL",
				"61853"));
		ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL",
				"61820"));

		Iterator<Address> itr = ml.iterator();
		while (itr.hasNext()) {
			Address element = itr.next();
			//Object element = itr.next();
			System.out.println(element.getCity());
			System.out.println(element + "\n");
			
		}
		System.out.println();
	}
}
