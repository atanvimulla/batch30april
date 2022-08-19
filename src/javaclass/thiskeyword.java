package javaclass;

public class thiskeyword {
	
	int x;
	int y;
	
	int a=10;
			
			public void test()
			{
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
			}
			 public void testa()
			 {
				 int a=30;
				 System.out.println(a);
				 System.out.println(this.a);
			 }
			 public void sum(int x,int y)
			 {
				 this.x=x;
				 this.y=y;
				 System.out.println(x+y);
			 }
			 
			 public static void main(String[]args)
			 {
		       thiskeyword tk = new thiskeyword();
		       tk.test();
		       tk.testa();
		       tk.sum(50,50);
		       				 
			 }
		
			}