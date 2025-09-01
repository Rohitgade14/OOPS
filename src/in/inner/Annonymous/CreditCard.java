package in.inner.Annonymous;

public class CreditCard implements Payment{

	@Override
	public void pay(Double amount) {
		
		System.out.println("Paid"+amount+"using Creadit card");
	}
	

}
