package com.ctel.kafkaservice;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.ctel.entity.ShipmentData;
import com.ctel.service.ShipmentDataService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Service
public class KafkaConsumerService {

	@Autowired
	private ShipmentDataService shipmentDataService;

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
		
		ShipmentData mappedShipmentData = mapper.readValue(data, ShipmentData.class);

//		if (couponreportdata.getTable().equals("bpcl_coupon_report_data")) {
//
//			if (couponreportdata.getOp().equals("c")) {
//				log.info("Table Name is <<<<<<<<<<<<<<< bpcl_coupon_report_data >>>>>>>>>>>>>");
//				CouponReportData result = couponReportDataservice.createCouponReportData(couponreportdata);
//				System.out.println(result);
//			} else if (couponreportdata.getOp().equals("u")) {
//				CouponReportData result = couponReportDataservice.updateCouponReportData(null, couponreportdata);
//				System.out.println(result);
//			} else {
//				System.out.println("Operation Not Supported");
//			}
//		} else
//			System.out.println("Not available in the given Tables");

		ShipmentData savedShipmentData=shipmentDataService.createShipment(mappedShipmentData);
		System.out.println(savedShipmentData);
		
		log.info("Message Subscribed Successfully");
	}
}
