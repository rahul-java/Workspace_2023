package in.ashokit;

public class UpiPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// logic for upi payment
		return "Payment succesful thorugh UPI";
	}
}