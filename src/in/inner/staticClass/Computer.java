package in.inner.staticClass;

public class Computer {
	
	private String brand;
	private String model;
	private OperatingSystem os;
	
	
	 Computer(String brand,String model,String osName) {
		this.brand=brand;
		this.model=model;
		this.os=new OperatingSystem(osName);
	}
	 
	 public OperatingSystem getOs() {
			return os;
		}
	 
	 static class USB{
		private String type;	

		public USB(String type){
			this.type=type;
			System.out.println(type);
		}
		
	
		public	void displayInfo(){
			System.out.println("USB TYpe"+type);
		}
	 }

	 class OperatingSystem{
		 private String osName;
		 
		 OperatingSystem(String osName){
			 this.osName=osName;
		 }
		 
		 public void displayInfo() {
			System.out.println("Computer Model:"+model+"osName:"+osName);
		}
		 
		
	 }
	

}
