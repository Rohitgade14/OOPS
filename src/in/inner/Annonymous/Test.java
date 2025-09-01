package in.inner.Annonymous;

public class Test {
	
	public static void main(String[] args) {
		ShoopingCart shoopingCart = new ShoopingCart(1500);
		CreditCard creditCard = new CreditCard();
		shoopingCart.processPay(creditCard);
		
	}

}
