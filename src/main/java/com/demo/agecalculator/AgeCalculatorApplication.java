package com.demo.agecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo")
public class AgeCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgeCalculatorApplication.class, args);
	}

}
