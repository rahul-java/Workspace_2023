package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ashokit.security.AppSecurity;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig::Constructor");
	}

	@Bean
	public AppSecurity createInstance() {
		AppSecurity as = new AppSecurity();
		// custom logic to secure our functionality
		return as;
	}
}
