package in.oops.polymorphism.methodOverloading;



public class Test {
	
	
	public int sum(int a,int b) {
		return a+b;
		
	}
	public int sum(int a,int b,int c) {
		return a+b+c;
		
	}
	public float sum(int a,float c ,int b) {
		return a+b+c;
		
	}
	public double sum(int a,float b,double c) {
		return a+b+c;
		
	}
	public	double sum(double a,double b) {
		return a+b;
		
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.sum(10, 20));// 1 call int a,int b
		System.out.println(test.sum(10, 20,30));// 2 call int a,int b
		System.out.println(test.sum(10, 20.22f,30));// 3 call int a,float b
		System.out.println(test.sum(10, 20.22f,30.88));// 4 call int a,float b, double c
		System.out.println(test.sum( 20.22,30.88));// 5 call double a,double b
		
		
		
		
	}

}
