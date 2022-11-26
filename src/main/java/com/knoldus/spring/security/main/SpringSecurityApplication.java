package com.knoldus.spring.security.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.knoldus.spring.security.config" })
public class SpringSecurityApplication {

	public static void main(String[] args) throws Throwable {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

}