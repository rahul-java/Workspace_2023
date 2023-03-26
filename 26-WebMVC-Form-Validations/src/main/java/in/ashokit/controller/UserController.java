package in.ashokit.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.User;

@Controller
public class UserController {

	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/")
	public String getForm(Model model) {
		logger.info("*** getForm() method execution start ***");
		User userObj = new User();
		model.addAttribute("user", userObj);
		logger.info("*** getForm() method execution end ***");
		return "index";
	}

	@PostMapping("/register")
	public String handleRegisterBtn(@Valid User userForm, BindingResult result, Model model) {
		logger.info("*** handleRegisterBtn() method execution start ***");
		if (result.hasErrors()) {
			logger.error("*** Reg Form Validations Failed ***");
			return "index";
		}
		System.out.println(userForm);
		// logic to store form data in db
		model.addAttribute("msg", "Your Registration Successful...!!");
		logger.info("*** handleRegisterBtn() method execution end ***");

		return "success";
	}

	@GetMapping("/test")
	public String test(Model model) {
		logger.info("*** test() method execution start ***");
		User userObj = new User();
		model.addAttribute("user", userObj);
		int i = 10 / 0;
		logger.info("*** test() method execution end ***");
		return "index";
	}

}
