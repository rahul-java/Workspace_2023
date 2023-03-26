package in.ashokit;

import java.io.File;
import java.io.FileReader;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) throws Exception {

		Order order = new Order();
		order.setOrderId(101);
		order.setOrderedBy("Ramu");
		order.setOrderStatus("CONFIRMED");
		order.setBillAmt(1345.00);

		Gson gson = new Gson();
		String json = gson.toJson(order);
		System.out.println(json);

		Order od = gson.fromJson(new FileReader(new File("order.json")), Order.class);
		System.out.println(od);
	}

}
