package com.yange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
	
@SpringBootApplication//(scanBasePackages= "{com.yange}")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
