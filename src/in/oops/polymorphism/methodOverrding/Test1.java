package in.oops.polymorphism.methodOverrding;



public class Test1 {
	
	public static void main(String[] args) {
		Animal animal1 = new Cat();
		  animal1.makeSound(); //meow call at rumtime 
		  animal1.AnimlaLocation();//jungle // call at compile time
		  // instaneof menans Parent class take object of child class 
		  if(animal1 instanceof Cat) {
			  Cat cat=(Cat)animal1;
			  cat.catName();//Mani  // this call at Compile time bczt not overriden
			  cat.AnimlaLocation();//jungle // call at  call at Compile time bczt not overriden
		  }
		     
		  Animal animal2 = new Dog();
		  animal2.makeSound();//woof call at rumtime
		  animal2.AnimlaLocation();//jungle call at compile time
		  
		  if(animal2 instanceof Dog) {
			  Dog dog =(Dog)animal2;
			  dog.dogName();//Golya //compile time
			  dog.AnimlaLocation();//jumgle compile time
		  }
		  // overriden method call at rumtime
		  // nonoverrriden call at complie time
		  
		  
		  
		  Cat cat1 = new Cat();
		  cat1.makeSound();
		  cat1.AnimlaLocation();
		  cat1.catName();
		  
		  
	    
	}

}
