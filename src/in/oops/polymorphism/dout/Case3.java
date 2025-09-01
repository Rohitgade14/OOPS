package in.oops.polymorphism.dout;

class Parent3{
	public void  show()  throws Exception
	{
    	System.out.println("show Method of Parent");
	
    }
    
    
}
class Child3  extends Parent3{
//	public	void show() throws ArithmeticException
//	 {
//	    code will run
//    	System.out.println("show Method of Child");
//		
//    }
	public	void show() 
	 {
   	System.out.println("show Method of Child");
		
   }
	 
	
}
public class Case3 {
	
	public static void main(String[] args) throws Exception {
		  Parent3 parent3 = new Parent3();
		  parent3.show();
		
		  Child3 child3 = new Child3();
		  child3.show();
		 
	}

}
