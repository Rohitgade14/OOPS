package in.oops.encapsulation;

public class BankTest {
   public static void main(String[] args) {
	  BankAccount account = new BankAccount();
	  account.setAccountNumber(112);
	  account.deposit(-10);
	  account.withdraw(10);
	  account.deposit(100);
	  account.withdraw(70);
	   System.out.println(account.getBalance());
	   System.out.println(account);
	
}
}
