package com.ctel.plans.ProductionEntity;

import java.time.LocalDate;


public class BottleInspection {
private String uuid;
private String spool_barcode;
private String bottle_code;
private int prod_code;
private String plant_code;
private String line_uuid;
private LocalDate creation_time;
private int status;
public String getUuid() {
	return uuid;
}
public void setUuid(String uuid) {
	this.uuid = uuid;
}
public String getSpool_barcode() {
	return spool_barcode;
}
public void setSpool_barcode(String spool_barcode) {
	this.spool_barcode = spool_barcode;
}
public String getBottle_code() {
	return bottle_code;
}
public void setBottle_code(String bottle_code) {
	this.bottle_code = bottle_code;
}
public int getProd_code() {
	return prod_code;
}
public void setProd_code(int prod_code) {
	this.prod_code = prod_code;
}
public String getPlant_code() {
	return plant_code;
}
public void setPlant_code(String plant_code) {
	this.plant_code = plant_code;
}
public String getLine_uuid() {
	return line_uuid;
}
public void setLine_uuid(String line_uuid) {
	this.line_uuid = line_uuid;
}
public LocalDate getCreation_time() {
	return creation_time;
}
public void setCreation_time(LocalDate creation_time) {
	this.creation_time = creation_time;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}




}
