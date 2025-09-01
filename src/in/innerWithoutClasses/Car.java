package in.innerWithoutClasses;

public class Car {
	
	private String model;
	private boolean isEngineOn=false;
	
	Car(String model){
		this.model=model;
		this.isEngineOn=false;
	}

	public String getModel() {
		return model;
	}



	public boolean isEngineOn() {
		return isEngineOn;
	}

	public void setEngineOn(boolean isEngineOn) {
		this.isEngineOn = isEngineOn;
	}
	

}
