package com.example.FirstMicroserviceJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class FirstMicroserviceJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstMicroserviceJpaApplication.class, args);
		System.out.println(SpringVersion.getVersion());
	}

}
