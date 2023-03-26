package in.ashokit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SendAppStartMail implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("logic executing to send email....");
	}
}
