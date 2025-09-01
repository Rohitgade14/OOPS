package in.oops.polymorphism.dout;

class Animal{
	  public  void makeSound() {
        System.out.println("Animal make Sound");
}
	  public  void show() {
	        System.out.println("Animal show");
	}
	  
}	
class Cat extends Animal {
	 public  void makeSound() {
	        System.out.println("Cat make Sound");
	}
	  
	 public void catName() {
		 System.out.println("mani");
	 }
}
public class Test {
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeSound(); // Cat class overide Method
		cat.show(); // Animal class method
		cat.catName();//cat class method
//		
		
//		Animal animal = new Cat();
//		animal.makeSound();// make sound oveeride method
//		animal.show();// show of Animal
		//animal.catName(); not possible bcuz this method is child class
//		  so we have to downcast it
//		 Cat cat1=(Cat)animal;
//		 cat1.catName(); // catName method --cat class method
//		 cat1.makeSound();// make sound oveeride method 
//		 cat1.show(); // 
//		
		
	}
}


