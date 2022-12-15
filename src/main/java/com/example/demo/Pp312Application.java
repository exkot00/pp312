package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
@EnableJpaRepositories("com.example.demo.*")
@ComponentScan(basePackages = { "com.example.demo.*" })
@EntityScan("com.example.demo.*")
@SpringBootApplication

public class Pp312Application {

	public static void main(String[] args) {
		SpringApplication.run(Pp312Application.class, args);
	}

}
