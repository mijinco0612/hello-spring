package com.example.helloSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class HelloSpringApplication {

	@GetMapping
	String getHelloMessage() {
		return "Hello Spring!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
