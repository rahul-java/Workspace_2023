package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Player;
import in.ashokit.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		PlayerRepository playerRepository = context.getBean(PlayerRepository.class);

		Player p1 = new Player();
		p1.setPlayerId(102);
		p1.setPlayerName("Sehwag");
		p1.setPlayerAge(46);
		p1.setLocation("Delhi");

		playerRepository.save(p1); //upsert method
		
		System.out.println("Record Inserted............");

	}
}