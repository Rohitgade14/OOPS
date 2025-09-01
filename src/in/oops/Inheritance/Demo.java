package in.oops.Inheritance;

class GrandParent1 {
	void hide(){
		System.out.println("hi GrandParent1");
	}
	
	void show(){
		System.out.println("hi show GrandParent1");
	}
}
class Parent1  extends GrandParent1 {
	void show(){
		System.out.println("hi");
	}
}

class Child1 extends Parent1  {


}
public class Demo {
	
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.show();
		child1.hide();
	}

}
