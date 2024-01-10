package com.route;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataSourceRountingReadWriteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataSourceRountingReadWriteApplication.class, args);
		System.out.println("\n <---- Application Landed ---->");
	}

}
