package com.ctel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctel.entity.ShipmentData;
import com.ctel.service.XmlService;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/shipment-data")
public class XmlDataController {

	
	@Autowired
    private XmlService xmlService;
	
    @PostMapping("/send-xml-to-kafka")
    public ResponseEntity<?> createShipmentData(@RequestBody String xmlData) throws JsonGenerationException, JsonProcessingException {
//        ShipmentData obtainedShipmentData = 
        		xmlService.sendXmlToKafka(xmlData);
        return ResponseEntity.ok().body("sent to kafka");
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<ShipmentData> updateShipmentData(@PathVariable String id, @RequestBody ShipmentData updatedShipmentData) {
//        ShipmentData result = shipmentDataService.updateShipment(id, updatedShipmentData);
//        return ResponseEntity.ok(result);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteShipmentData(@PathVariable String id) {
//        shipmentDataService.deleteShipment(id);
//        return ResponseEntity.noContent().build();
//    }
}
