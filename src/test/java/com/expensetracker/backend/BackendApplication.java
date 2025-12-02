package com.expensetracker.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class BackendApplication {
	
	 
	public static void main(String[] args) {
		
		// Load .env file
        Dotenv dotenv = Dotenv.load();
        // Set environment variables for Spring Boot
        System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
        System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
        System.setProperty("DB_URL", dotenv.get("DB_URL"));
        
		SpringApplication.run(BackendApplication.class, args);
	}

}
