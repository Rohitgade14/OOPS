package in.methods;

public class Test2 {
 
	  static int a=10;
	  static int b=20;
	  int c=30;
          
	  
	public static void main(String[] args) {
		sum();
		Test2 test2 = new Test2();
		test2.demo();
		System.out.println(test2.c);
		
	}
	
	
	public static void sum() {
		System.out.println(a);  
	
		
	}
	
	public void demo() {
		System.out.println("hi");
	}
	
}
