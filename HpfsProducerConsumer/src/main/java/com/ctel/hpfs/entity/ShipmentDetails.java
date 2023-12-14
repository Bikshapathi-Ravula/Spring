package com.ctel.hpfs.entity;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
@Document("ShipmentDetails")
public class ShipmentDetails implements Serializable{

	private List<ShipmentDetail> ShipmentDetail;

	public void setShipmentDetail(List<ShipmentDetail> ShipmentDetail) {
		this.ShipmentDetail = ShipmentDetail;
	}

	public List<ShipmentDetail> getShipmentDetail() {
		return ShipmentDetail;
	}

}