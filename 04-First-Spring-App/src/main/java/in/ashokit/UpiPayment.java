package in.ashokit;

public class UpiPayment implements IPayment {
	
	public UpiPayment() {
		System.out.println("UpiPayment::Constructor");
	}

	public String pay(double amount) {
		// logic for upi payment
		return "Payment succesful thorugh UPI";
	}
}