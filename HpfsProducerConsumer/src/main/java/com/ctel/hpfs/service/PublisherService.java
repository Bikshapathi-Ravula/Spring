package com.ctel.hpfs.service;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.ctel.hpfs.response.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PublisherService {
	@Value("${spring.kafka.topic}")
	private String topic;
//	@Value("${spring.kafka.host")
//	private String host;
	@Autowired
	KafkaTemplate<String, String> publish;
	@Autowired
	ObjectMapper objectMapper;
	Set<String> set;

	public Response<?> producePayLoad(String payload) {
		String results = "";
		Response<?> response = new Response<>();

			try {
				set = new HashSet<>();
			//	results = objectMapper.writeValueAsString(payload);
				publish.send(topic, payload).get(5, TimeUnit.SECONDS);
				response.setMessage("Published");
				set.add(results);
				return response;
			}  catch (InterruptedException e) {

				response.setMessage("TOPIC NOT EXISTED");
			} catch (ExecutionException | TimeoutException e) {
				response.setMessage("Kafka Ip Not Ping ");
				return response;
			}
			
		

		return null;
	}
}
