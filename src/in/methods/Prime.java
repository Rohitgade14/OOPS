package in.methods;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enterr the num");
//		int num = sc.nextInt();
//		 boolean isPrime=   isPrime(num);
//		 System.out.println(isPrime ?num+ " is Prime":num+"not prime");
		System.out.println(isPrime(11));
	}
	
	public static boolean isPrime(int num) {
		if (num<=1) return false;
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
