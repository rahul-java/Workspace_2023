package in.ashokit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Book;

@Controller
public class BookController {

	private static Logger logger = LoggerFactory.getLogger(BookController.class);

	@GetMapping("/")
	public String displayForm(Model model) {
		logger.info("*** displayForm () method execution start ***");
		Book bookObj = new Book();
		model.addAttribute("book", bookObj);
		logger.info("*** displayForm () method execution end ***");
		return "index";
	}

	@PostMapping("/book")
	public String saveBook(Book book, Model model) {
		logger.info("*** saveBook () method execution start ***");
		System.out.println(book);
		model.addAttribute("msg", "Book Saved Successfully");
		logger.info("*** saveBook () method execution end ***");
		return "success";
	}

	@GetMapping("/viewBooks")
	public String viewBooks(Model model) {
		logger.info("*** viewBooks () method execution start ***");
		int i = 10 / 0;
		logger.info("*** viewBooks () method execution end***");
		return "success";
	}
}
