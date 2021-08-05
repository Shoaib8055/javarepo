package com.capgemini.lesson12;
import java.util.*;
public class MyGeneric1 {
	//public static void printList(List<Employee> el)
	public static void printList(List<? extends Employee> el)
	//public static void printList(List<? super Employee> el)
	{
		System.out.println(el);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> elist=new ArrayList<Employee>();
		elist.add(new Employee());
		elist.add(new Manager());
		elist.add(new Director());
		//for(Employee e:elist)  { System.out.println(e);}
		printList(elist);
		
		List<Manager> mlist=new ArrayList<>();
			mlist.add(new Manager());
			mlist.add(new Director());
			//mlist.add(new Employee)); error
			printList(mlist);	
			
		List<Director> dlist=new ArrayList<>();
			//dlist.add(new Manager());
			dlist.add(new Director());
			printList(dlist);
			
			//elist=mlist;  //error
			List<? extends Employee> eml=mlist;   // super class list points to subclass list
			eml=elist;
			eml=dlist;
			
		List<Object>  olist=new ArrayList<>();
			olist.add(new Object());
			olist.add(new Integer(33));
			//printList(olist);
			//olist=mlist;
			
			
			List<Integer>  iii=new ArrayList<>();
			iii.add(100);
			
			//olist=iii; //error
			
			List<? extends Object> ia=iii;
			
			ia=mlist;
			ia=dlist;
			ia=elist;
				
			//elist=olst;  // error
			List<? super Employee> eol=olist;   // sub class list can point to super class list
			eol=elist;
				
			List<?> el1=elist;
				el1=mlist;
				el1=dlist;
				el1=olist;
	}

}
