package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DebeziumApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebeziumApplication.class, args);
		System.out.println("\n <----- Application Landed ----->");

	}
}
