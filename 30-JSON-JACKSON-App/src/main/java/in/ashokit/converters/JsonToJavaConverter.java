package in.ashokit.converters;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.binding.Book;

public class JsonToJavaConverter {

	public static void main(String[] args) throws Exception {

		File jsonFile = new File("book.json");

		ObjectMapper mapper = new ObjectMapper();

		Book book = mapper.readValue(jsonFile, Book.class);

		System.out.println(book);

	}
}
