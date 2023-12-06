package com.users.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EntityScan(basePackages = "com.users.entities")
@EnableJpaRepositories(basePackages = "com.users.repositories")
@ComponentScan(basePackages = { "com.users.controllers" })
public class UsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}

	@GetMapping("/hello")
	public String helloGateway() {
		return "Hello Gateway";
	}

}
