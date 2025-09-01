package in.methods;

public class Test1 {
	
	public static void main(String[] args) {
		int sum = sum(11,22,99);
		System.out.println(sum);
		System.out.println(sum(10,20,30));
	
	}

	private static int sum(int ... a) {
		int sum=0;
		for(int i:a) {
		   sum+=i;	
		}
		return sum;
	}
}
