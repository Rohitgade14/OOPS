package in.AutoBoxing;

public class Test {
	public static void main(String[] args) {
		int a=10;  //store in the stack
		Integer b=20;	
		       int intValue = b.intValue();
		       System.out.println(intValue);
		// store in the Heap 
		// this used automatically
		Integer c= Integer.valueOf(30); // autoboxing
		
		
	}

}


// convert primtive varible convert into object  autoboxing
// convert object into primtive i.e autounboxing