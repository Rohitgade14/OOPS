package in.oops.Inheritance.human;

public class Parent extends GrandParent {
	
	Parent(){
		super("rohit",22);
		System.out.println("Parent class Constructor");
	
	}
	
	
	 void ParentMethod(){
	
			System.out.println("Parent class method");
			 super.GrandParentMethod();
		}

}
