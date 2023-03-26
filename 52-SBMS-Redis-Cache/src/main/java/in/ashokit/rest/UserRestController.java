package in.ashokit.rest;

import java.util.List;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.User;

@RestController
public class UserRestController {

	private HashOperations<String, Integer, User> hashOps;

	public UserRestController(RedisTemplate<String, User> redisTemplate) {
		hashOps = redisTemplate.opsForHash();
	}

	@PostMapping("/user")
	public String storeData(@RequestBody User user) {
		hashOps.put("PERSONS", user.getUid(), user);
		return "success";
	}

	@GetMapping("/user/{uid}")
	public User getData(@PathVariable Integer uid) {
		User value = (User) hashOps.get("PERSONS", uid);
		return value;
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return hashOps.values("PERSONS");
	}
	
	@DeleteMapping("/user/{uid}")
	public String deleteUser(@PathVariable Integer uid) {
		hashOps.delete("PERSONS", uid);
		return "User Deleted";
	}
}
