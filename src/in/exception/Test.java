package in.exception;

public class Test {
	public static void main(String[] args) {
		
	
		
		try {
		int a=10;
		int b=0;
		int c=a/b;
		
		System.out.println(c);
		}
		
		catch(ArithmeticException ae) {
			
			ae.printStackTrace();//Mostly in development / debugging.
			System.out.println(ae);//in production
			System.out.println(ae.getMessage());//user-friendly logs or messages i
//			Logger logger = Logger.getLogger(ae.getMessage());
//			System.err.println(logger.getName());
			Thread.currentThread().interrupt();// in realtime Production
		}
		catch(RuntimeException re) {
			System.out.println(re);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
