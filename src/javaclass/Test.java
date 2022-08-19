package javaclass;

public class Test {
	public static void main(String[]args) {
		Father f=new Father();
		f.home();
		f.money();
		f.car();
		
		System.out.println("...........");
		
		Son s=new Son();
		s.bike();
		s.car();
		s.home();
		s.money();
		
		//upcasting
		
		System.out.println("...........");
		
		Father f1=new Son();
		f1.home ();
		f1.car();
		f1.money();
		
		
		//downcasting
		
		Son s1=(Son)new Father();
		s1.home();
		s1.bike();
		s1.money();
		s1.car();
	}
		
		
		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
