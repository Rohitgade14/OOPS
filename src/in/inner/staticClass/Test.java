package in.inner.staticClass;

import in.inner.staticClass.Computer.USB;

public class Test {
	
	public static void main(String[] args) {
		
		Computer computer = new Computer("HP", "Hp-elite", "Linux");
		computer.getOs().displayInfo();
		
		Computer.USB usb = new Computer.USB("TYpe C");
		usb.displayInfo();
	    
	}

}
