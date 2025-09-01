package in.methods;

public class Test {
	public static void main(String[] args) {
		int [] a= {11,22,33};
		int res1= sumOfArray(a);
		 System.out.println(res1);
		int [] b={11,22,33,66};
	     int  res2= sumOfArray(b);
	     System.out.println(res2);
	     System.err.println(sumOfArray(b));
	      String res3=   upperCase(" rohit ");
	      System.out.println(res3);
	      System.out.println(sum(20, 30));
	      int x=10;
	      System.out.println(multiplayBy10(x));//100
	      System.out.println(x);//10
		 
		
	}
	
	public static int sumOfArray(int [] arr) {
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		
		return  sum;
	}
	
	private static String upperCase(String str) {
		return str.trim().toUpperCase();
		// trim method remove intial and ending space
	}
	
	private static int sum(int a,int b) {
		return a+b;
	}
  // method Overloading menas method name must be same ,pasramter must be diff 
	
	private static int multiplayBy10(int x) {
		return x=x*10;
	}
	
}
