package com.example.helloSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringApplication {

	@GetMapping
	String home() {
		return "Hello Spring!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
