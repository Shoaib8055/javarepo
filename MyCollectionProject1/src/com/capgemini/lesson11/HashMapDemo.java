package com.capgemini.lesson11;

import java.util.*;

class HashMapDemo {
	public static void main(String args[]) {
		// Create a hash map
		//Map<String, Double> hm = new HashMap<String, Double>();
		// one null key is allowed, keys are unique. no duplicate keys, value can be duplicate. unordered keys
		
	Map<String, Double> hm = new LinkedHashMap<String, Double>(); // insertion ordered of keys maintained
	//	Map<String, Double> hm = new TreeMap<String, Double>();  //keys sorted naturally // SortedMap is implemented
	//	 TreeMap does not accept null as key // runtime exception NullPointerException
		// Put elements to the map
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Tod Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));
		hm.put("Tod Hall", new Double(99.35));
	//	hm.put(null, 4454.78);   // internally new Double(4454.78);  // boxing

		// Get a set of the entries
		Set set = hm.entrySet();

		// Get an iterator
		Iterator i = set.iterator();

		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey() + ": " + me.getValue());
		}

		// Deposit 1000 into John Doe's account
		Double ob=(Double) hm.get("John Doe");// retrieves value for a key 
		double balance= ob.doubleValue();

		//double balance = ((Double) hm.get("John Doe")).doubleValue();
		
		// double balance= hm.get("John Doe");   // unboxing Double ---> double
		hm.put("John Doe", new Double(balance + 1000));
		System.out.println("John Doe's new balance: " + hm.get("John Doe"));
		System.out.println("=======================");
		
		Set<String>  keys=hm.keySet();
		
		System.out.println(keys);
		for(String key:keys) {
			System.out.println("key is "+key + " value "+ hm.get(key));
		}
		
		System.out.println("=======================");
		Collection<Double> vals = hm.values();
		System.out.println(vals);
			
		
		
		
	}
}




// HashMap use hashcode and equals method to check duplicates keys
// LinkedHashMap use hashcode and equals method to check duplicates keys
// TreeMap use compareTo method to check duplicate keys and sorting




