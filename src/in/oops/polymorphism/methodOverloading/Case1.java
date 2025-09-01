package in.oops.polymorphism.methodOverloading;


public class Case1  {
	
	void show(int a) {
		System.out.println("jhhh");
		System.out.println(a); // print the aski value .... automatic promation is happen there 
	}
void show(String a) {
		System.out.println("hiii");
		System.out.println(a);
	}
public static void main(String[] args) {
	
	
	Case1 case1 = new Case1();
	case1.show('a');
	
}
	

	

}

