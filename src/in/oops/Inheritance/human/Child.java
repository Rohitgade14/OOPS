package in.oops.Inheritance.human;

public class Child extends Parent{
	
	Child(){
		System.out.println("Child class Constructor");
	}
	  public static void main(String[] args) {
		Child child = new Child();
		child.childMethod();
	}
    void childMethod(){
    
		System.out.println("Child class method");
		super.ParentMethod();
		
	}
    
    

}
