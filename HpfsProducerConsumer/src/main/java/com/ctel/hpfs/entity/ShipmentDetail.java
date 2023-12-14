package com.ctel.hpfs.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("ShipmentDetail")
public class ShipmentDetail implements Serializable{
	@Id
	private String ShipmentDetailId;
	private String OSFCode;
	private String OSFNumber;
	private String ProductCode;
	private String ProductName;
	private String SizeCode;
	private String PackType;
	private String OFSQuantity;
	private String ShipmentQuantity;
	private String PriceGroupId;

	public void setShipmentDetailId(String ShipmentDetailId) {
		this.ShipmentDetailId = ShipmentDetailId;
	}

	public String getShipmentDetailId() {
		return ShipmentDetailId;
	}

	public void setOSFCode(String OSFCode) {
		this.OSFCode = OSFCode;
	}

	public String getOSFCode() {
		return OSFCode;
	}

	public void setOSFNumber(String OSFNumber) {
		this.OSFNumber = OSFNumber;
	}

	public String getOSFNumber() {
		return OSFNumber;
	}

	public void setProductCode(String ProductCode) {
		this.ProductCode = ProductCode;
	}

	public String getProductCode() {
		return ProductCode;
	}

	public void setProductName(String ProductName) {
		this.ProductName = ProductName;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setSizeCode(String SizeCode) {
		this.SizeCode = SizeCode;
	}

	public String getSizeCode() {
		return SizeCode;
	}

	public void setPackType(String PackType) {
		this.PackType = PackType;
	}

	public String getPackType() {
		return PackType;
	}

	public void setOFSQuantity(String OFSQuantity) {
		this.OFSQuantity = OFSQuantity;
	}

	public String getOFSQuantity() {
		return OFSQuantity;
	}

	public void setShipmentQuantity(String ShipmentQuantity) {
		this.ShipmentQuantity = ShipmentQuantity;
	}

	public String getShipmentQuantity() {
		return ShipmentQuantity;
	}

	public void setPriceGroupId(String PriceGroupId) {
		this.PriceGroupId = PriceGroupId;
	}

	public String getPriceGroupId() {
		return PriceGroupId;
	}

}