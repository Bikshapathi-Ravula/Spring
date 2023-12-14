package com.ctel.hpfs.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("Shipment")
public class Shipment implements Serializable {
	@Id
	private String ShipmentId;

	private String ASNCode;

	private String ASNStatus;
	private Date DepatureTime;
	private String SourceLocationId;
	private String SourceLocationName;
	private String DestinationLocationId;
	private String DestinationLocationName;
	private String ConsignmentType;
	private String InitiatorId;
	private String InitiatorLocationId;
	private Date ApprovedOn;
	private Date DepatureDate;
	private String Status;
	private String CreatedBy;
	private Date CreatedOn;
	private Date UpdatedOn;
	private String AddressIdDist;
	private String DestAddressIdDist;
	private ShipmentDetails ShipmentDetails;
	private Cases Cases;
	private TransferPermits TransferPermits;

	public void setShipmentId(String ShipmentId) {
		this.ShipmentId = ShipmentId;
	}

	public String getShipmentId() {
		return ShipmentId;
	}

	public void setASNCode(String ASNCode) {
		this.ASNCode = ASNCode;
	}

	public String getASNCode() {
		return ASNCode;
	}

	public void setASNStatus(String ASNStatus) {
		this.ASNStatus = ASNStatus;
	}

	public String getASNStatus() {
		return ASNStatus;
	}

	public void setDepatureTime(Date DepatureTime) {
		this.DepatureTime = DepatureTime;
	}

	public Date getDepatureTime() {
		return DepatureTime;
	}

	public void setSourceLocationId(String SourceLocationId) {
		this.SourceLocationId = SourceLocationId;
	}

	public String getSourceLocationId() {
		return SourceLocationId;
	}

	public void setSourceLocationName(String SourceLocationName) {
		this.SourceLocationName = SourceLocationName;
	}

	public String getSourceLocationName() {
		return SourceLocationName;
	}

	public void setDestinationLocationId(String DestinationLocationId) {
		this.DestinationLocationId = DestinationLocationId;
	}

	public String getDestinationLocationId() {
		return DestinationLocationId;
	}

	public void setDestinationLocationName(String DestinationLocationName) {
		this.DestinationLocationName = DestinationLocationName;
	}

	public String getDestinationLocationName() {
		return DestinationLocationName;
	}

	public void setConsignmentType(String ConsignmentType) {
		this.ConsignmentType = ConsignmentType;
	}

	public String getConsignmentType() {
		return ConsignmentType;
	}

	public void setInitiatorId(String InitiatorId) {
		this.InitiatorId = InitiatorId;
	}

	public String getInitiatorId() {
		return InitiatorId;
	}

	public void setInitiatorLocationId(String InitiatorLocationId) {
		this.InitiatorLocationId = InitiatorLocationId;
	}

	public String getInitiatorLocationId() {
		return InitiatorLocationId;
	}

	public void setApprovedOn(Date ApprovedOn) {
		this.ApprovedOn = ApprovedOn;
	}

	public Date getApprovedOn() {
		return ApprovedOn;
	}

	public void setDepatureDate(Date DepatureDate) {
		this.DepatureDate = DepatureDate;
	}

	public Date getDepatureDate() {
		return DepatureDate;
	}

	public void setStatus(String Status) {
		this.Status = Status;
	}

	public String getStatus() {
		return Status;
	}

	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedOn(Date CreatedOn) {
		this.CreatedOn = CreatedOn;
	}

	public Date getCreatedOn() {
		return CreatedOn;
	}

	public void setUpdatedOn(Date UpdatedOn) {
		this.UpdatedOn = UpdatedOn;
	}

	public Date getUpdatedOn() {
		return UpdatedOn;
	}

	public void setAddressIdDist(String AddressIdDist) {
		this.AddressIdDist = AddressIdDist;
	}

	public String getAddressIdDist() {
		return AddressIdDist;
	}

	public void setDestAddressIdDist(String DestAddressIdDist) {
		this.DestAddressIdDist = DestAddressIdDist;
	}

	public String getDestAddressIdDist() {
		return DestAddressIdDist;
	}

	public void setShipmentDetails(ShipmentDetails ShipmentDetails) {
		this.ShipmentDetails = ShipmentDetails;
	}

	public ShipmentDetails getShipmentDetails() {
		return ShipmentDetails;
	}

	public void setCases(Cases Cases) {
		this.Cases = Cases;
	}

	public Cases getCases() {
		return Cases;
	}

	public void setTransferPermits(TransferPermits TransferPermits) {
		this.TransferPermits = TransferPermits;
	}

	public TransferPermits getTransferPermits() {
		return TransferPermits;
	}

}