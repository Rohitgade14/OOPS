package in.methods;

import java.util.Scanner;

public class Prime1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th num");
		int num = sc.nextInt();
		 boolean prime = isPrime(num);
		 System.out.println(prime);
		System.err.println(isPrime(15));
	}
	public static boolean isPrime(int num) {
	
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}

}
