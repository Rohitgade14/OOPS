package in.innerClasses;

import in.innerClasses.Car.Engine;

public class Test {
	
	public static void main(String[] args) {
		Car car = new Car("TATA Safari");
		 Car.Engine engine= car.new Engine();
		 engine.start();
		 engine.stop();
		 
		 
		 
		
	}

}
