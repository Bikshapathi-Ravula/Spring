package com.ctel.kafkaservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class KafkaProducerService {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	 @Value("${kafka.topic.name}")
     private String topic;

	private static final Logger log = LoggerFactory.getLogger(KafkaProducerService.class);

	public void sendData(String data) throws JsonProcessingException, JsonGenerationException {

		kafkaTemplate.send(topic, data);

		log.info("Message Published To Kafka..........!!!!!!!!");
	}
}
