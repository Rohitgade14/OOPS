package in.inner.Annonymous;

public class ShoopingCart {
	
	private double totalAmount;

	public ShoopingCart(double totalAmount) {
		
		this.totalAmount = totalAmount;
	}
	
     
	public void processPay(Payment payment) {
		payment.pay(totalAmount);
		
	}

}
