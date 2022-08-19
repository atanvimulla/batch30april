package javaclass;

import java.util.LinkedHashSet;

public class linkedhashsetprogram {
	
	public static void main(String[]args) {
		
		LinkedHashSet<String>sh=new LinkedHashSet<String>();
		
		//adding the elements inside linked hashset
		sh.add("A");
		sh.add("B");
		sh.add("C");
		sh.add("D");
		sh.add("E");
		sh.add("F");
		sh.add("X");
		sh.add("Z");
		sh.add("T");
		
		System.out.println(sh);
		
		//adding the duplicate data
		sh.add("C");
		sh.add("D");
		System.out.println(sh);
		
		//finding the number of elements present in linked hashset
		System.out.println("the size of linked hashset:-"+sh.size());
		
		//checking the presence of element
		System.out.println("Checkinh the presence of element:-"+sh.contains("Z"));
		
		//removing the element:-1.Direct removal 2.removal with status
		sh.remove("D");
		System.out.println(sh);
		
		System.out.println(sh.remove("B"));
		System.out.println(sh);
		
	}

}
