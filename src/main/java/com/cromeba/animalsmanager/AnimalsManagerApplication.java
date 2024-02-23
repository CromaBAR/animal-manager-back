package com.cromeba.animalsmanager;

import com.cromeba.animalsmanager.application.ports.out.AnimalRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class AnimalsManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalsManagerApplication.class, args);

	}

	public void setInitialData(){
		CommandLineRunner commandLineRunner = new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {

			}
		};
	}
}
