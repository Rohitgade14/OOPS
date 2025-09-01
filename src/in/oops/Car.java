package in.oops;

public class Car {
	
	private String color;
	private	String brand;
	private String model;
	private	int speed;
  	private int year;
	
      
	public Car(String color, String brand, String model, int speed, int year) {
		super();
		this.color = color;
		this.brand = brand;
		this.model = model;
		this.speed = speed;
		this.year = year;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getModel() {
		return model;
	}


//    if  you dont want change the model so you can remove set method
//	public void setModel(String model) {
//		this.model = model;
//	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public int getYear() {
		return year;
	}



//	public void setYear(int year) {
//		this.year = year;
//	}



	public void accelerate (int incremnet) {
		
		speed+=incremnet;
	
	}
	
	
	
	public void brake (int decrement) {
		
		speed-=decrement;
		System.out.println(speed);
	}



	@Override
	public String toString() {
		return "Car [color=" + color + ", brand=" + brand + ", model=" + model + ", speed=" + speed + ", year=" + year
				+ "]";
	}
	
	
	

}
