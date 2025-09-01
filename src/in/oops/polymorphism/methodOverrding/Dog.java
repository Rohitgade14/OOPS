package in.oops.polymorphism.methodOverrding;



public class Dog extends Animal {
	
	@Override
	void makeSound() {
		System.out.println("woof");
	}
	
	void dogName() {
		System.out.println("Golya");
	}

}
// 1 will be check at compile time
// the Relationship is Required either parent or child or child or parent