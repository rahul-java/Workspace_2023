package in.ashokit.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

	public KafkaConfig() {
		System.out.println("KafkaConfig::Constructor");
	}

	// @Bean method for configuration
}
