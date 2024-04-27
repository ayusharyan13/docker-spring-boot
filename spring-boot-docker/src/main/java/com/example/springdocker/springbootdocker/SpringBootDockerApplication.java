package com.example.springdocker.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SpringBootDockerApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Your application is running on Docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
