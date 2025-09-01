package in.pratice;

public class Child extends Parent{
	

	public  static void show() {
		System.out.println("show of child");
	}
	
	public void name() {
		System.out.println("child name");
	}
	
	
	public static void main(String[] args) {
   
		 // Parent parent = new Child();
		 // parent.show();//child show
		 // parent.hide();// parent hide
		Parent.show();
		  
		  
//		  Child child =(Child)parent;
		//  child.show();// child show
		//  child.name();// child name
		 // child.hide();//parent hide
	}
	
	
}
