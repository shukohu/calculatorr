package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public Application(CalculatorService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	private final CalculatorService service;
}
