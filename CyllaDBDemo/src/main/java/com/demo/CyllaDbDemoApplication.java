package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CyllaDbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CyllaDbDemoApplication.class, args);
		System.out.println("Application Landed..!");
	}

}
