//package com.ctel.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.aggregation.Aggregation;
//import org.springframework.data.mongodb.core.aggregation.MatchOperation;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.stereotype.Service;
//
//import com.ctel.entity.ShipmentData;
//import com.ctel.repo.ShipmentDataRepo;
//
//@Service
//public class ShipmentDataService {
//
//	private final ShipmentDataRepo shipmentDataRepository;
//
//	private final MongoTemplate mongoTemplate;
//
//	@Autowired
//	public ShipmentDataService(ShipmentDataRepo shipmentDataRepository, MongoTemplate mongoTemplate) {
//		this.shipmentDataRepository = shipmentDataRepository;
//		this.mongoTemplate = mongoTemplate;
//	}
//
//	public List<ShipmentData> getAllShipments() {
//		return shipmentDataRepository.findAll();
//	}
//
//	public ShipmentData getByShipmentId(String shipmentId) {
//		ShipmentData sd=shipmentDataRepository.findFirstByShipmentId(shipmentId);
//		
////		ShipmentData sd=shipmentDataRepository.findByShipments_Shipment_ShipmentId(shipmentId);
////		System.out.println(sd.getShipments().toString());
//		return shipmentDataRepository.findFirstByShipmentId(shipmentId);
//		
////		return shipmentDataRepository.findByShipments_Shipment_ShipmentId(shipmentId);
//		
//	}
//
//	public ShipmentData createShipment(ShipmentData shipmentData) {
//		// You can add any specific business logic or validation before saving
//		return shipmentDataRepository.save(shipmentData);
//	}
//// 	  6300 + 4000 + 6000 + [ 500(sweets) + 400(toGnt) + 1000(nonveg-home) + 500(food) + 100(auto) + 500(tochurch)]
////    public ShipmentData updateShipment(String id, ShipmentData updatedShipmentData) {
////        getShipmentById(id); // Check if the entity exists
////        updatedShipmentData.setId(id);
////        return shipmentDataRepository.save(updatedShipmentData);
////    }
//
////    public void deleteShipment(String id) {
////        shipmentDataRepository.deleteById(id);
////    }
//}
