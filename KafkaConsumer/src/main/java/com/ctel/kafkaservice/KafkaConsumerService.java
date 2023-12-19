package com.ctel.kafkaservice;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.ctel.entity.ShipmentData;
//import com.ctel.service.ShipmentDataService;
import com.ctel.service.XMLParserService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Service
public class KafkaConsumerService {

//	@Autowired
//	private ShipmentDataService shipmentDataService;
	
	@Autowired
	private XMLParserService xMLParserService;
	
	

	public KafkaConsumerService(/* ShipmentDataService shipmentDataService, */ XMLParserService xMLParserService) {
		super();
//		this.shipmentDataService = shipmentDataService;
		this.xMLParserService = xMLParserService;
	}

	private static final Logger log = LoggerFactory.getLogger(KafkaConsumerService.class);

	@KafkaListener(topics = "${kafka.topic.name}"
//			, groupId = "group_user", containerFactory = "kafkaListenerContainerFactory"
				   )
	public void consumerservice(@Payload String data) throws IOException {

		System.out.println("Listening");
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.registerModule(new JavaTimeModule());

		System.out.println(data);
		
		ShipmentData obtainedShipmentData = xMLParserService.convertXmlToJava(data);
		
		log.info("Message Subscribed Successfully");
	}
}
