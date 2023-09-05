package com.ctel.plans.ProductionEntity;

import java.util.ArrayList;

public class PayLoad {

 public ArrayList<ProductionData> getData() {
		return data;
	}

	public void setData(ArrayList<ProductionData> data) {
		this.data = data;
	}

private String type;
 private String name;
 private String database;
 ArrayList < ProductionData > data = new ArrayList < ProductionData > ();


 // Getter Methods 

 public String getType() {
  return type;
 }

 public String getName() {
  return name;
 }

 public String getDatabase() {
  return database;
 }

 // Setter Methods 

 public void setType(String type) {
  this.type = type;
 }

 public void setName(String name) {
  this.name = name;
 }

 public void setDatabase(String database) {
  this.database = database;
 }

}
