package com.db.mongo.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "Mongo")
public class MongoDbEntity {
	@Id	
private String id;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
}
