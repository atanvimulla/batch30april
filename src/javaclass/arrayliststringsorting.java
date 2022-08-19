package javaclass;

import java.util.ArrayList;
import java.util.Collections;

public class arrayliststringsorting {
	
	public static void main(String[]args) {
	
	//arraylist declaration
	ArrayList<String>list=new ArrayList<String>();
	
	//adding the elements
	
	list.add("Audi");
	list.add("Activa");
	list.add("Swift");
	list.add("Maruti800");
	list.add("BMW");
	list.add("Bullet");
	list.add("Nano");
	list.add("Innova");
	
	System.out.println("Arraylist before sorting:- "+list);
	
	//sorting the arraylist in ascending order
	//Activa Audi BMW Bullet Innova Maruti800 Nano Swift
	
	Collections.sort(list);
	System.out.println("Arraylist after sorting:- "+list);
	
	//sorting the arraylist in descending order
	
	Collections.sort(list,Collections.reverseOrder());
	
	System.out.println("Arraylist after sorting in descending:- "+list);
			
		
	}
	

}
