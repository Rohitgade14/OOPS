package in.oops.encapsulation;

public class BankAccount {
	
	private long accountNumber;
	private double balance;
	
	 public void deposit(int amount) {
			if(amount >0) {
				  balance+=amount;
				  System.out.println(balance);
			}
			else {
				System.out.println("invalid amount");
			}
		}
	 
	 public void withdraw(int amount) {
			if(amount >0 && amount <=balance) {
				balance-=amount;
				System.out.println("withdraw :"+amount);
			}
			else {
				System.out.println("insufficenent  fund");
			}
		}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	
	

}
