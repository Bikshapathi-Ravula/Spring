package com.ctel.Test.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import com.ctel.Test.model.Shopping;

@Repository
public class ReddicacheDao {

	
	
	public static final String HASH_KEY = "Shopping";
	@Resource(name = "redis") // 'redisTemplate' is defined as a Bean in AppConfig.java
	private HashOperations<String, Integer, Shopping> hashOperations;

	public Shopping save(Shopping shopping) {
		hashOperations.putIfAbsent(HASH_KEY, shopping.getId(), shopping);
		return shopping;
	}

	public Map<Integer, Shopping> findAll() {
		return hashOperations.entries(HASH_KEY);
	}

	public Shopping findProductById(int id) {
		return hashOperations.get(HASH_KEY, id);
	}

	public Map<Integer, Shopping> deleteProduct(int id) { 

		hashOperations.delete(HASH_KEY, id);
		return findAll();
	}

	public Shopping updateProduct(Shopping data) {

		deleteProduct(data.getId());

		return save(data);
	}

	public Map<Integer, Shopping> saveAll(Map<Integer, Shopping> shopping) {

		hashOperations.putAll(HASH_KEY, shopping);
		return findAll();

	}
}
