package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.*")
@EnableAutoConfiguration
public class SpringMvnCrudOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvnCrudOperationsApplication.class, args);
	}

}
