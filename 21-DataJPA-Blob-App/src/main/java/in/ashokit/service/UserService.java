package in.ashokit.service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public void saveUser() throws Exception {

		String imagePath = "C:\\Users\\ashok\\OneDrive\\Documents\\Certificates\\DOCKER.jpg";

		User user = new User();
		user.setUserName("Suresh");
		user.setUserEmail("suresh@gmail.com");

		long size = Files.size(Paths.get(imagePath));

		byte[] arr = new byte[(int) size];
		FileInputStream fis = new FileInputStream(new File(imagePath));
		fis.read(arr);
		fis.close();

		user.setUserImage(arr);

		userRepo.save(user);
	}
}
