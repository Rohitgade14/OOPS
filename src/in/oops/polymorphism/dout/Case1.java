package in.oops.polymorphism.dout;


class Parent{
	public void  show() {
    	System.out.println("show Method of Parent");
	
    }
    
    public  Object  hide() {
    	return "hello";
	
    }
    
}
class Child  extends Parent{
	public	void show() {
    	System.out.println("show Method of Child");
		
    }
	
	 public  String  hide() {
	    	return "112";
		
	    }
	
}
public class Case1 {
	
	public static void main(String[] args) {
		  Parent parent = new Parent();
		  parent.show();
		   System.out.println(parent.hide());
		  Child child = new Child();
		  child.show();
		  System.out.println(child.hide());
	}

}

// case 1 Covarient Return Type Object -> String 
// case 2 public -> default no access modifer not allowed
