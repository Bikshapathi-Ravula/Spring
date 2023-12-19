package com.ctel.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctel.entity.ShipmentData;
import com.ctel.kafkaservice.KafkaProducerService;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class XmlService {

    @Autowired
    private KafkaProducerService kafkaService;

    ObjectMapper om = new ObjectMapper();

    public ShipmentData sendXmlToKafka(String xmlData) throws JsonGenerationException, JsonProcessingException {
        // You can add any specific business logic or validation before saving
    	
//    	ShipmentData xmlShipmentData = om.readValue(om.writeValueAsString(xmlData), ShipmentData.class);
//    	System.out.println(om.writeValueAsString(shipmentData));
    	
    	kafkaService.sendData(xmlData);
    	
        return null;
    }
    
//    public List<ShipmentData> getAllShipments() {
//        return shipmentDataRepository.findAll();
//    }
//
//    public ShipmentData getShipmentById(String id) {
//        return shipmentDataRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("ShipmentData with id " + id + " not found"));
//    }
//
//    public ShipmentData updateShipment(String id, ShipmentData updatedShipmentData) {
//        getShipmentById(id); // Check if the entity exists
//        updatedShipmentData.setId(id);
//        return shipmentDataRepository.save(updatedShipmentData);
//    }
//
//    public void deleteShipment(String id) {
//        shipmentDataRepository.deleteById(id);
//    }
}
