package com.example.diamondstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiamondstoreApplication {

	public String POST= System.getenv("POST");
	public static void main(String[] args) {
		SpringApplication.run(DiamondstoreApplication.class, args);
	}

}
