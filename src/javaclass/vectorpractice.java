package javaclass;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vectorpractice {
	
	public static void main(String[]args) {
		Vector v=new Vector();
		
	    //Adding the values inside the arraylist 
		
	v.add(15);    //0
	v.add("ABC"); //1
	v.add('A');   //2
	v.add(25);    //3
	
	  System.out.println(v);
	  
	 //modifying arraylist
	  
	 v.add(2,'B');
	 System.out.println(v);
	 
	 //Data replace
	 
	 v.set(2,"XYZ");
	 System.out.println(v);
	 
	 //Data remove
	 
	 v.remove(4);
	 System.out.println(v);
	 
	 v.add(null);
	 v.add(null);
	 v.add(null);
	 
	 //finding the capacity
	 System.out.println("The capacity of vector is:-"+v.capacity());
	 System.out.println("The size of vector is:-"+v.size());
	 
	 //changing the emptiness
	 System.out.println(v.isEmpty());
	 
	 //size
	 System.out.println(v.size());
	 
	 //location of information==>index
	 System.out.println(v.indexOf(15));
	 System.out.println(v.lastIndexOf(15));
	 
	 //contains==>check availability of data 
	 System.out.println("PQR");
	 
	 //get==>will help you to find data at particular index
	 System.out.println(v.get(1));
	 System.out.println(v.get(2));
	 
	 //to read full arraylist==>regular expression
	 for(int i=0;i<v.size();i++) {
		 System.out.print(v.get(i)+ "");
		 
	 }
	 System.out.println();
	 
	 //advanced for loop
	 for(Object value:v) {
		 
		System.out.print(value+"");
		
	 }
	 System.out.println();
	 
	 //iterator=>scope==>full collection interface
	 Iterator itr=v.iterator();
	 while(itr.hasNext())
	 {
		 System.out.print(itr.next()+"");
	 }
	 System.out.println();
	 
	 //list iterator=>scope==>list interface
	 ListIterator litr=v.listIterator();
	 while(litr.hasNext())
	 {
		 System.out.println(litr.next()+"");
	 }
	 System.out.println("This is from enumerator");
	 
	 Enumeration en=v.elements();
	 while(en.hasMoreElements()) {
		 System.out.print(en.nextElement()+"");
	 }
	 
	System.out.println();
	
	//reverse order
	Collections.reverse(v);
	System.out.print(v+"");
	System.out.println();
	 
	 Iterator itr1=v.iterator();
	 while(itr1.hasNext())
	 {
	System.out.print(itr1.next()+"");
	 }

	}
}
