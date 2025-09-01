package in.oops.polymorphism.dout;

class Parent1{
	public void  show() {
    	System.out.println("show Method of Parent");
	
    }
     
    
}
class Child1  extends Parent{
//		void show() {
//    	System.out.println("show Method of Child");
//	//	  this error deu to default accessmodfier in the Child class 
//    }
	
	 
	
}
public class Case2 {
	public static void main(String[] args) {
		  Parent1 parent1 = new Parent1();
		  parent1.show();
		  Child1 child1 = new Child1();
		  child1.show();
		 
	}

}
