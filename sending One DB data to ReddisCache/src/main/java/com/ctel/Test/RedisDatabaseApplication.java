package com.ctel.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import com.ctel.Test.model.Shopping;
import com.ctel.Test.service.ReddicacheDao;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.ctel.Test.repo")
public class RedisDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisDatabaseApplication.class, args);
	}

}
