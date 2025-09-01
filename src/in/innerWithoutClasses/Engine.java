package in.innerWithoutClasses;

public class Engine {
	
	 private Car car;
	 
	 Engine(Car car){
		 this.car=car;
	 }
	 
	 
	void start(){
		 if(!car.isEngineOn()) {
			 car.setEngineOn(true);
			 System.out.println("car is get Started");
		 }
		 else {
			 System.out.println("car is Allreday started");
		 }
	 }
	
	void stop(){
		 if(car.isEngineOn()) {
			 car.setEngineOn(false);
			 System.out.println("car is get Stooped");
		 }
		 else {
			 System.out.println("car is Allreday Stooped");
		 }
	 }

}
