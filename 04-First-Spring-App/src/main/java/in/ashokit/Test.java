package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");

		BillCollector bc = context.getBean("billCollector", BillCollector.class);
		bc.collectPayment(1400.00);
	}
}