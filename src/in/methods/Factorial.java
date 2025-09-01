package in.methods;

public class Factorial {
	
	public static void main(String[] args) {
		//5*4*3*2*1;
		int factorial = factorial(5);
		System.out.println(factorial);
		  
	}
	
	  public static int factorial(int num) {
		  int fact=1;
		  for(int i=1;i<=num;i++) {
			  fact*=i;
		  }
		  return fact;
	  }

}
