package in.innerClasses;

public class Car {
	
	private String model;
	private boolean isEngineOn;
	
	Car(String model){
		this.model=model;
		this.isEngineOn=false;
		System.err.println(model);
	}

	class Engine{
		  
		void start() {
			if(!isEngineOn) {
				isEngineOn=true;
				System.out.println(model+" Engine is get Started");
			}
			else {
				System.out.println(" Engine is Alreday Started");
			}
		}
		
		void stop() {
			if(isEngineOn) {
				isEngineOn=false;
				System.out.println(model+" engine is stooped");
			}
			else {
				System.out.println(model+" engine is Alreday stooped");
			}
		}
	}
}
