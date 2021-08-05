package com.capgemini.lesson11;

import java.util.*;

class Emp implements Comparable 
{
	int EmpID;
	String Ename;
	double Sal;
	static int i;

	public Emp() {
		EmpID = i++;
		Ename = "Unknown";
		Sal = 0.0;
	}

	public Emp(String ename, double sal) {
		EmpID = i++;
		Ename = ename;
		Sal = sal;
	}

	public String toString() {
		return "EmpID : " + EmpID + "\t" + "Ename : " + Ename + "\t" + "Sal : "
				+ Sal;
	}

	public int compareTo(Object o) {
		if (this.Sal == ((Emp) o).Sal)
			return 0;
		else if (this.Sal > ((Emp) o).Sal)
			return 1;
		else
			return -1;
	}
	
}

class NameComparator implements Comparator{
	@Override
	public int compare(Object arg0, Object arg1) {
		Emp e1=(Emp)arg0;
		Emp e2=(Emp)arg1;
		String name1=e1.Ename;
		String name2=e2.Ename;
		return name1.compareTo(name2);
	}     }
class ComparatorDemo {
	public static void main(String[] args) {
		Comparator nc=new NameComparator();
		Set<Emp> ts1 = new TreeSet<Emp>(); // natural sorting by salary using comparable
		//Set<Emp> ts1 = new TreeSet<Emp>(nc);  // custom sorting by name using comparator
		//List<Emp> ts1 = new ArrayList<Emp>();
		ts1.add(new Emp("harry", 40000.00));
		ts1.add(new Emp("Mary", 20000.00));
		ts1.add(new Emp("Peter", 50000.00));
	
				
		//Collections.sort(ts1 );  // natural order executes compareTo of Emp with Comparable
		//Collections.sort(ts1 ,nc); //customize order executes compare of NameComparaotr
		
		Iterator itr = ts1.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element + "\n");
		}
		System.out.println();

	}
}
