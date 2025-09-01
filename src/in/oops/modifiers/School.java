package in.oops.modifiers;

public class School {
	
	private static School instance;
	
	private School() {
		
	}
	
	public static School getInstance() {
		if(instance ==null) {
			instance=	new School();
			System.out.println(instance);
		}
		return instance;
	}
	// instance menas just ref variable which hold the variable

}
