package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/kitty")
	public String kittyMethod() {
		return "Greetings from Spring Boot!";
	}

}
