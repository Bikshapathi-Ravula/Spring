package com.beanmapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.beanmapping.repo.BeanMappingInterface;
@SpringBootApplication
//@EnableJpaRepositories(basePackages = "beanmapping.main.repo")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
