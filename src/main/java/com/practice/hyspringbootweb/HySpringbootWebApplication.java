package com.practice.hyspringbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HySpringbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HySpringbootWebApplication.class, args);
	}

}
