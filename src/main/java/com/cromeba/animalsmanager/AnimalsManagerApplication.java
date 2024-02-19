package com.cromeba.animalsmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class AnimalsManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalsManagerApplication.class, args);
	}
}
