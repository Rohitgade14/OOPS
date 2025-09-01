package in.innerWithoutClasses;

public class Test {
	
	public static void main(String[] args) {
		Car car = new  Car("Safari");
		Engine engine = new  Engine(car);
		engine.start();
		engine.stop();
	}

}
