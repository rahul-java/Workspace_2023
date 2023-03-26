package in.ashokit.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Product;

@RestController
public class ProductRestController {

	@GetMapping(
			value = "/product", 
			produces = { "application/json" }
	)
	public ResponseEntity<Product> getProduct() {

		Product productObj = new Product();
		productObj.setPid(101);
		productObj.setPname("Mouse");
		productObj.setPrice(450.00);

		return new ResponseEntity<>(productObj, HttpStatus.OK);
	}
	
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts(){
		
		Product p1 = new Product(101, "Monitor", 8000.00);
		Product p2 = new Product(102, "RAM", 6000.00);
		Product p3 = new Product(103, "CPU", 15000.00);
		
		List<Product> products = Arrays.asList(p1,p2,p3);
		
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
}
