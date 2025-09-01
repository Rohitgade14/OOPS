package in.oops;

class Test1 {
	public   static  void m1() {
		System.out.println("hi");
	}
}
public class Demo extends Test1 {
	
	 public   static  void m1() {
	    System.out.println("hii child");
	}
	public static void main(String[] args) {
		 //  Test1 test = new Demo();
		Demo.m1();
		   
		   //demo.m1();
	     // Demo demo1= new Test1();
	}

}
