package in.oops.Inheritance.human;

public class GrandParent  {
	
	
	private String name;
	private int id;
	GrandParent(){
		
		System.out.println("GrandParent class Constructor");
	}
	GrandParent(String name,int id){
		System.out.println(name);
		System.out.println(id);
		System.out.println("Grand Parent Para");
	}
//	
	 void GrandParentMethod(){
			System.out.println("GrandParent class method");
		}
	

}
