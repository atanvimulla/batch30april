package javaclass;

import java.util.ArrayList;
import java.util.Collections;

public class arraylistsorting {
	
	public static void main(String[]args)
	{
		
		//sorting the string
		ArrayList<String>cars=new ArrayList<String>();
		cars.add("swift");
		cars.add("audi");
		cars.add("bmw");
		cars.add("bullet");
		cars.add("pulsar");
		
		//list of cars before sorting
		System.out.println("Before sorting:-"+cars);
		Collections.sort(cars);  //ascending order
		
		//after sorting
		System.out.println("After sorting:-"+cars);
		
		//sorting cars in descending orders
	Collections.sort(cars,Collections.reverseOrder());
	System.out.println("After sorting in descending order:-"+cars);
	
	ArrayList<Integer>numbers=new ArrayList<Integer>();
	numbers.add(5);
	numbers.add(20);
	numbers.add(10);
	numbers.add(50);
	numbers.add(45);
	numbers.add(100);
	numbers.add(500);
	
	System.out.println("numbers");
	
	//ascending numbers
	Collections.sort(numbers);
	System.out.println(numbers);
	
	//descending order
	Collections.sort(numbers,Collections.reverseOrder());
	System.out.println(numbers);	
		
	}
	
}
