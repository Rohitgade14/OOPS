package in.methods;

public class Recursion1 {
	public static void main(String[] args) {
		System.out.println(sumOfNaturalNumber(5));
	}
	
   public static int 	sumOfNaturalNumber(int num){
	   if(num==1) {
		   return 1;
	   }
		return num+ sumOfNaturalNumber(num-1);
	}

}
