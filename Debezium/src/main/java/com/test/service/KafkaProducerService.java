package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class KafkaProducerService {

	//@Autowired
	//private KafkaTemplate<String, String> kafkaTemplate;

	//@Autowired
	ObjectMapper objectMapper;

	public void sendMessage(String key, Object value) throws JsonProcessingException {

		//kafkaTemplate.send("hwEquipments", key, objectMapper.writeValueAsString(value));
	}

}
