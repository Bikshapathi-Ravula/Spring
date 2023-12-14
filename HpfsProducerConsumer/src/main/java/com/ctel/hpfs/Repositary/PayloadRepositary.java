package com.ctel.hpfs.Repositary;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ctel.hpfs.entity.Shipments;

public interface PayloadRepositary extends MongoRepository<Shipments,String> {

}
