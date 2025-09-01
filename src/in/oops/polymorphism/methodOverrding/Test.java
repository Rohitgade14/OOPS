package in.oops.polymorphism.methodOverrding;



public class Test {
	
	public static void main(String[] args) {
	
		// ref variable we call only overrdin method inside child class , 
		//and we alos call the methods who doesnot override
		Animal animal1= new Cat();
		animal1.makeSound();//meow // overriden  (runtime: Cat)
		animal1.AnimlaLocation(); //call goes into Animal class at compile time //in jungle
		
		Cat cat=(Cat)animal1;
		cat.catName(); //Mani
		cat.AnimlaLocation();//  but with child class ref we can call parent class method 
		//also which is doesnot overiden  this call at compile time
//		 i.e Overriden method call at rumtime
//		and non-Overriden call at complie time
		
		 Animal animal2 = new Dog();
		 animal2.makeSound();//woof //overriden  (runtime: Dog)
		 animal2.AnimlaLocation();//call goes into Animal class at compile time //in jungle
		 
		 Dog dog=(Dog)animal2;
		 dog.dogName();//Golya
		  


		
	
		
	                                

		
		
	}
	


}
