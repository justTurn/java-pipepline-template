package com.example.springbootcitemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCiTemplateApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello About Creating a template .gitlab-ci.yml file for deploying applications";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCiTemplateApplication.class, args);
	}

}
