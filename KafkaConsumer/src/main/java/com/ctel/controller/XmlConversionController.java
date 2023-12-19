package com.ctel.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctel.entity.ShipmentData;
import com.ctel.service.XMLParserService;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/shipment-data")
public class XmlConversionController {

    private final XMLParserService xMLParserService;

    public XmlConversionController(XMLParserService xMLParserService) {
		super();
		this.xMLParserService = xMLParserService;
	}
    
    @PostMapping("/convert-to-java")
    public ResponseEntity<ShipmentData> createShipmentData(@RequestBody String xmlData) throws JsonGenerationException, JsonProcessingException {
        ShipmentData obtainedShipmentData = xMLParserService.convertXmlToJava(xmlData);
        return ResponseEntity.ok().body(obtainedShipmentData);
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
