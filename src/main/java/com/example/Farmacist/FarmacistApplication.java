package com.example.Farmacist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class FarmacistApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmacistApplication.class, args);
	}

}
