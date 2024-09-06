package com.ctel.HpfsApRedis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@EnableRedisRepositories(basePackages = { "com.ctel.HpfsApRedis.configuration.RedisConfig",
		"com.ctel.HpfsApRedis.configuration.ReddicacheDao" })
//@EnableJpaRepositories(basePackages = "com.ctel.HpfsApRedis.repositary.*")
@SpringBootApplication
public class HpfsapredisApplication {

	public static void main(String[] args) {
		SpringApplication.run(HpfsapredisApplication.class, args);
	}

}

