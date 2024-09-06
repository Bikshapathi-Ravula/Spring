package com.ctel.HpfsApRedis.configuration;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import com.ctel.HpfsApRedis.entity.GOAP_SH_REGISTER;

@Configuration
public class RedisConfig {

	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		RedisProperties properties = redisProperties();
	
		RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();
		configuration.setHostName("10.10.10.68");
		configuration.setPort(6379);
		configuration.setPassword("Hpfs@123$$");

		return new JedisConnectionFactory(configuration);
	}

	@Bean("redis")
	public RedisTemplate<String, GOAP_SH_REGISTER> redisTemplate() {
		RedisTemplate<String, GOAP_SH_REGISTER> template = new RedisTemplate<>();
		template.setConnectionFactory(jedisConnectionFactory());

		return template;
	}

	@Bean
	@Primary
	public RedisProperties redisProperties() {
		return new RedisProperties();
	}

}
