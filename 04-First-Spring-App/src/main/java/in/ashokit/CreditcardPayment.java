package in.ashokit;

public class CreditcardPayment implements IPayment {

	public CreditcardPayment() {
		System.out.println("CreditcardPayment::Constructor");
	}

	public String pay(double amount) {
		// logic for credit card payment
		return "Payment successful through Credit Card";
	}
}
