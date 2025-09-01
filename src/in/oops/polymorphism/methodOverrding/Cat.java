package in.oops.polymorphism.methodOverrding;



public class Cat  extends Animal{
	
	@Override
	void makeSound() {
		System.out.println("meow");
	}

	
	void catName(){
		 System.out.println("Mani"); 
	 }
}

//Overridden methods → decision happens at runtime.

//Non-overridden methods → method is resolved at compile time.
