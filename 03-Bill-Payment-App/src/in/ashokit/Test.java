package in.ashokit;

public class Test {

	public static void main(String[] args) throws Exception {

		// dependent class obj
		CreditcardPayment ccd = new CreditcardPayment();

		// target class object
		BillCollector collector = new BillCollector();

		// injecting dependent cls obj into target cls obj
		collector.setPayment(ccd);

		collector.collectPayment(3000.00);

	}
}