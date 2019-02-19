package japhari.dev.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class RestApiController {
 
	@RequestMapping("/api/hi")
	public String hi() {
		return "Hello world! >>> Message from Japhari Rest With Spring Boot";
	}
}