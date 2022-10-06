package com.example.git.actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoGitActionsApplication {

	@GetMapping("/hello")
	public String helloWorld(String nome){
		return "hello world: " + nome;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoGitActionsApplication.class, args);
	}

}
