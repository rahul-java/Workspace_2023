package in.ashokit.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WelcomeService {
	
	private String apiUrl = "http://localhost:8080";

	public void invokeWelcomeApi() {
		
		RestTemplate rt = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("admin", "admin@123");
		
		HttpEntity<String> reqEntity = new HttpEntity<>(headers);
		
		ResponseEntity<String> responseEntity = rt.exchange(apiUrl, HttpMethod.GET, reqEntity, String.class);
		
		String body = responseEntity.getBody();
		
		System.out.println(body);
	}
	
	
	public void invokeWelcome() {
		
		WebClient webClient = WebClient.create();
		
		String block = webClient.get()
					  		   .uri(apiUrl)
					  		   .headers(headers -> headers.setBasicAuth("admin", "admin@123"))
					  		   .retrieve()
					  		   .bodyToMono(String.class)
					  		   .block();
		
		System.out.println(block);
	}
	
}