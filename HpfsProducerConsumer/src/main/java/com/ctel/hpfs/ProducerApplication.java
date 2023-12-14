package com.ctel.hpfs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;

import com.ctel.hpfs.Repositary.PayloadRepositary;
import com.ctel.hpfs.entity.Shipments;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//@EnableMongoRepositories
@SpringBootApplication
public class ProducerApplication implements CommandLineRunner {
	@Autowired
	PayloadRepositary s;
	@Autowired
	ObjectMapper objectMapper;

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}

	@KafkaListener(topics = "javatesting")
	public void listeningPayLoad(@Payload String message) throws JsonMappingException, JsonProcessingException {
		Shipments data = objectMapper.readValue(message, Shipments.class);
		System.out.println("Received Message: " + s.insert(data));

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}
