package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);

		List<User> users = repository.getAllUsersHql();

		users.forEach(user -> {
			System.out.println(user);
		});

		System.out.println("##############################################");

		users = repository.getAllUsersSql();

		users.forEach(user -> {
			System.out.println(user);
		});
		
		System.out.println("##############################################");
		
		users = repository.getAllUsersByCountry("India");

		users.forEach(user -> {
			System.out.println(user);
		});
	}
}