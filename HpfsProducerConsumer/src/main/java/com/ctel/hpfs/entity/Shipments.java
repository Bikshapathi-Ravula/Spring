package com.ctel.hpfs.entity;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Shipments")
public class Shipments implements Serializable {
	@Id
	private String id;

	public String getUUID() {
		return id;
	}

	public void setUUID(UUID uUID) {
		id = uUID.toString().replace('-', ' ');
	}

	private List<Shipment> Shipment;

	public void setShipment(List<Shipment> Shipment) {
		this.Shipment = Shipment;
	}

	public List<Shipment> getShipment() {
		return Shipment;
	}

}