package in.interfacedemo;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("Cat is eating");
		
	}
	

	@Override
	public void sleep() {
		System.out.println("cat is sleeping");
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Animal.super.run();
		System.out.println("cat is running");
	}

}
