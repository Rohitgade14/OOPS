package in.exception;

public class ArrayOutOfBound {

	 public static void main(String[] args) {
		int [] arr= {11,22,33,44};
		
		System.out.println(arr[0]);
	
		System.out.println(arr[3]);
		try {
			System.out.println(arr[4]);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}
