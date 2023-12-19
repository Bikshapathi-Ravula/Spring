//package com.ctel.repo;
//
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import com.ctel.entity.ShipmentData;
//
//@Repository
//public interface ShipmentDataRepo extends MongoRepository<ShipmentData, Integer> {
//
////    ShipmentData findFirstByShipments_ShipmentIn_ShipmentId(String shipmentId);
//	
////    ShipmentData findByShipments_Shipment_ShipmentId(String shipmentId);
//
////	@Query("{ 'shipments.shipment[0].shipmentId': ?0 }")
//	@Query("{ 'shipments.shipment.shipmentId' : ?0 }")
//	ShipmentData findFirstByShipmentId(String shipmentId);
//
//}
