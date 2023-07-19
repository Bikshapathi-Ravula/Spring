package com.db.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.db.mongo.pojo.MongoDbEntity;

public interface Repo extends MongoRepository<MongoDbEntity, String> {

}
