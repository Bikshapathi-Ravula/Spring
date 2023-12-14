package com.ctel.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ctel.entity.ShipmentData;

@Repository
public interface ShipmentDataRepo extends MongoRepository<ShipmentData,Integer>{

}
