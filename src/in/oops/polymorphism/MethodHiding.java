package in.oops.polymorphism;



class Parent {
    public void show() {
		System.out.println("this is parent class method");
	}
    
    public void great() {
		System.out.println("hiiii");
	}
    
    public static void name() {
			System.out.println("hiiii parent");
		}
}

class Child extends Parent{
	
	@Override
	public void show() {
		System.out.println("Child class show");
	}
}
public class MethodHiding {
	
	public static void main(String[] args) {
	
		Child child = new Child();
		child.show();
		child.great();
	}

}
