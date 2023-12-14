package com.ctel.hpfs.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("TransferPermit")
public class TransferPermit implements Serializable{
	@Id
	private String TransferPermitCode;
	private String LRNumber;
	private String Transporter;
	private String VehicleNumber;
	private Date IssueDate;
	private String IssueTime;
	private Date ValidityDate;
	private String ValidityTime;
	private String ValidityPeriod;
	private String Route;
	private String Status;
	private String CreatedBy;
	private Date CreatedOn;
	private String ShipmentId;
	private Date LRDate;

	public void setTransferPermitCode(String TransferPermitCode) {
		this.TransferPermitCode = TransferPermitCode;
	}

	public String getTransferPermitCode() {
		return TransferPermitCode;
	}

	public void setLRNumber(String LRNumber) {
		this.LRNumber = LRNumber;
	}

	public String getLRNumber() {
		return LRNumber;
	}

	public void setTransporter(String Transporter) {
		this.Transporter = Transporter;
	}

	public String getTransporter() {
		return Transporter;
	}

	public void setVehicleNumber(String VehicleNumber) {
		this.VehicleNumber = VehicleNumber;
	}

	public String getVehicleNumber() {
		return VehicleNumber;
	}

	public void setIssueDate(Date IssueDate) {
		this.IssueDate = IssueDate;
	}

	public Date getIssueDate() {
		return IssueDate;
	}

	public void setIssueTime(String IssueTime) {
		this.IssueTime = IssueTime;
	}

	public String getIssueTime() {
		return IssueTime;
	}

	public void setValidityDate(Date ValidityDate) {
		this.ValidityDate = ValidityDate;
	}

	public Date getValidityDate() {
		return ValidityDate;
	}

	public void setValidityTime(String ValidityTime) {
		this.ValidityTime = ValidityTime;
	}

	public String getValidityTime() {
		return ValidityTime;
	}

	public void setValidityPeriod(String ValidityPeriod) {
		this.ValidityPeriod = ValidityPeriod;
	}

	public String getValidityPeriod() {
		return ValidityPeriod;
	}

	public void setRoute(String Route) {
		this.Route = Route;
	}

	public String getRoute() {
		return Route;
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

	public void setShipmentId(String ShipmentId) {
		this.ShipmentId = ShipmentId;
	}

	public String getShipmentId() {
		return ShipmentId;
	}

	public void setLRDate(Date LRDate) {
		this.LRDate = LRDate;
	}

	public Date getLRDate() {
		return LRDate;
	}

}