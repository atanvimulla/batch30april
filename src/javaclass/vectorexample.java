package javaclass;

import java.util.ListIterator;
import java.util.Vector;

public class vectorexample {
	public static void main(String[]args) {
		 
		Vector vec=new Vector();
		
		//add the elements
	vec.add('A');
	vec.add("PQR");
	vec.add(2);
	vec.add("Delhi");
	vec.add("Pune");
	vec.add(200);
	
	System.out.println(vec);
	System.out.println(vec.capacity());
	
	vec.set(3, "XYZ");
	System.out.println(vec);
	
	vec.remove(5);
	System.out.println(vec);
	
	System.out.println("Checking the emptiness:-"+vec.isEmpty());
	System.out.println("Checking the size of the vector:-"+vec.size());
	
    System.out.println("The index of A:-"+vec.indexOf('A'));
    
    System.out.println("Contains method:-"+vec.contains(2));
    
    System.out.println("to check the index:-"+vec.get(1));
    
    // Iterator itr=vec.iterator();
    // while(its.hasNext())
    // {
    // System.out.println(itr.next());
    //}
    
    
    //Enumeration enum=vec.elements();
    //while(enum.hasMoreElements()){
   // System.out.println(enum.nextElements());
    // }
    
    ListIterator litr=vec.listIterator();
    while(litr.hasNext()) {
    	System.out.println(litr.next());
    }	
	}
	
}
