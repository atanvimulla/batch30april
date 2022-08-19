package javaclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arraylistprogram {
	
	public static void main(String[]args) {
		
		//declaring the arraylist
		ArrayList al=new ArrayList();
		
	    //arraylist are accepting heterogeneous data.
		al.add(15); //0
		al.add("ABC");//1
		al.add('A'); //2
		al.add(15); //3
		System.out.println(al);
		
		//add the elements based on existing index
		al.add(2,'B');  //it will shift the data from mentioned index
		System.out.println(al);
		
		al.set(3, "XYZ"); //set method for replacement
		System.out.println(al);
		
		al.remove(4); //to remove the element from respective position
		System.out.println(al);
		
		System.out.println("Checking the emptiness:-"+al.isEmpty());
		System.out.println("Checking the size of arraylist:-"+al.size());
		
		System.out.println("the index of B:-"+al.indexOf('B'));
		
		System.out.println("Contains Method:-"+al.contains(15));
		System.out.println("to check the index:-"+al.get(1));
		
		//reading the arraylist
		//1.regular for loop
		//2.enhanced for loop(advanced for loop)
		//3.Iterator
		//4.List Iterator
		
		//1.regular for loop
		//for(int i=0;i<al.size();i++){
		//System.out.println(""+al.get(i));
		//}
		
		//2.advanced for loop
		//for(Object value:a){
		//System.out.println("value");
		//}
		
		//3.Iterator
		//declaring the iterator
		//for any class in collection
		// Iterator itr=al.iterator();
		//while(itr.hasNext()) {
		//System.out.println(itr.next());
		//}
		
		//4.ListIterator
		//is for only list interface classes.
		//ListIterator=al.listIterator();
		// while(litr.hasNext()){
		//  System.out.printlnlitr.next());
		// }
		
		//reverse the arraylist
		Collections.reverse(al);
		System.out.println(al);
		 Iterator itr=al.iterator();
		 while(itr.hasNext()) {
			System.out.println(itr.next());
		 }
		 }
}
	
	
	
	
	
	
	
	
	
	


