package com.ctel.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctel.entity.ShipmentData;
import com.ctel.repo.ShipmentDataRepo;

@Service
public class ShipmentDataService {

    private final ShipmentDataRepo shipmentDataRepository;

    @Autowired
    public ShipmentDataService(ShipmentDataRepo shipmentDataRepository) {
        this.shipmentDataRepository = shipmentDataRepository;
    }

    public List<ShipmentData> getAllShipments() {
        return shipmentDataRepository.findAll();
    }

//    public ShipmentData getShipmentById(String id) {
//        return shipmentDataRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("ShipmentData with id " + id + " not found"));
//    }

    public ShipmentData createShipment(ShipmentData shipmentData) {
        // You can add any specific business logic or validation before saving
        return shipmentDataRepository.save(shipmentData);
    }

//    public ShipmentData updateShipment(String id, ShipmentData updatedShipmentData) {
//        getShipmentById(id); // Check if the entity exists
//        updatedShipmentData.setId(id);
//        return shipmentDataRepository.save(updatedShipmentData);
//    }

//    public void deleteShipment(String id) {
//        shipmentDataRepository.deleteById(id);
//    }
}
