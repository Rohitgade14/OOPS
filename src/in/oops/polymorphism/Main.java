package in.oops.polymorphism;

class Parent1 {
    public int add(int a, int b) {
    	return a + b; 
    	
    	}
}

 class Child1 extends Parent1  {

	public int add(int a, int b) {
		return a+b+10;
		
	}
  
	
	
}

public class Main{
	public static void main(String[] args) {
		Child1 child = new Child1();
		int sum = child.add(10, 10);
		System.out.println(sum);
	}
}
