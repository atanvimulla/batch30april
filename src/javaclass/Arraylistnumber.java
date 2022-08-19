package javaclass;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistnumber {
	
	public static void main(String[]args) {
    
	//Arraylist declaration
	
	ArrayList<Integer>num=new ArrayList<Integer>();
	ArrayList<String>str=new ArrayList<String>();
	
	//adding values
	
	num.add(20);
	num.add(25);
	num.add(200);
	num.add(150);
	num.add(185);
	num.add(52);
	num.add(450);
	num.add(105);
	
	str.add("30th April");
	str.add("Zeke");
	
	System.out.println("Arraylist before soting:- "+num);
	
	
	//sort the arraylist in ascending order
	
	Collections.sort(num);
	System.out.println("Arraylist after sorting"+num);
	
	//sort the arraylist in decending order
	
	Collections.sort(num,Collections.reverseOrder());
	System.out.println("Arraylist after sorting"+num);

			
	}
	

}
