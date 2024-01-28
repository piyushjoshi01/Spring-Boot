package com.example.piyush.NewProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class NewProjectApplication {


	public static void main(String[] args) {
		SpringApplication.run(NewProjectApplication.class, args);
	}
	@GetMapping("/")

	public String apiRoot(){
		return "Hello";
	}
}
