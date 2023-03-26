package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@Value("${messages.welcome}")
	private String welcomeMsg;

	@Value("${messages.greet}")
	private String greetMsg;

	@GetMapping("/welcome")
	public String welcomeMsg() {
		return welcomeMsg;
	}

	@GetMapping("/greet")
	public String greetMsg() {
		return greetMsg;
	}
}