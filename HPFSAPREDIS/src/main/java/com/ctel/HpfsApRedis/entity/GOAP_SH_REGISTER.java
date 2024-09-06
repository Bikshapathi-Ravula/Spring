package com.ctel.HpfsApRedis.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name = "GOAP_SH_REGISTER")
public class GOAP_SH_REGISTER implements Serializable{

	@Id
	@Column(name = "SH_CODE", nullable = false, length = 30)
	private String shCode;

	@Column(name = "PRODUCT_CODE", length = 50)
	private String productCode;

	@Column(name = "SUPPLIER_CODE", length = 30)
	private String supplierCode;

	@Column(name = "BATCH_NUMBER", length = 50)
	private String batchNumber;

	@Column(name = "LOT_NUMBER", length = 50)
	private String lotNumber;

	@Column(name = "CE_NUMBER", length = 50)
	private String ceNumber;

	@Override
	public String toString() {
		return "GOAP_SH_REGISTER [shCode=" + shCode + ", productCode=" + productCode + ", supplierCode=" + supplierCode
				+ ", batchNumber=" + batchNumber + ", lotNumber=" + lotNumber + ", ceNumber=" + ceNumber + ", mfgDate="
				+ mfgDate + ", disposalDate=" + disposalDate + ", mrp=" + mrp + ", expiryDate=" + expiryDate
				+ ", mfgLocId=" + mfgLocId + ", depotLocId=" + depotLocId + ", vendorRegNo=" + vendorRegNo
				+ ", currentLocId=" + currentLocId + ", caseBarcode=" + caseBarcode + ", packType=" + packType
				+ ", productName=" + productName + ", previousCaseBarcode=" + previousCaseBarcode + ", status=" + status
				+ ", statusText=" + statusText + ", allocationId=" + allocationId + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + ", mfgName="
				+ mfgName + ", depotName=" + depotName + ", vendorLocId=" + vendorLocId + ", vendorLocName="
				+ vendorLocName + ", soldOn=" + soldOn + ", spoolBarcode=" + spoolBarcode + ", purpose=" + purpose
				+ ", intendedState=" + intendedState + ", verificationId=" + verificationId + ", brandNumber="
				+ brandNumber + ", importPermitId=" + importPermitId + ", sizeCode=" + sizeCode + ", dcId=" + dcId
				+ ", challanIndentId=" + challanIndentId + ", grnId=" + grnId + "]";
	}

	@Column(name = "MFG_DATE")
	@Temporal(TemporalType.DATE)
	private Date mfgDate;

	@Column(name = "DISPOSAL_DATE")
	@Temporal(TemporalType.DATE)
	private Date disposalDate;

	@Column(name = "MRP",precision = 8,scale = 2)
	private BigDecimal mrp;

	@Column(name = "EXPIRY_DATE")
	@Temporal(TemporalType.DATE)
	private Date expiryDate;

	@Column(name = "MFG_LOC_ID", length = 30)
	private String mfgLocId;

	@Column(name = "DEPOT_LOC_ID", length = 30)
	private String depotLocId;

	@Column(name = "VENDOR_REG_NO", length = 25)
	private String vendorRegNo;

	@Column(name = "CURRENT_LOC_ID", length = 30)
	private String currentLocId;

	@Column(name = "CASE_BARCODE", length = 80)
	private String caseBarcode;

	@Column(name = "PACK_TYPE", length = 50)
	private String packType;

	@Column(name = "PRODUCT_NAME", length = 100)
	private String productName;

	@Column(name = "PREVIOUS_CASE_BARCODE", length = 80)
	private String previousCaseBarcode;

	@Column(name = "STATUS", length = 50)
	private String status;

	@Column(name = "STATUS_TEXT", length = 50)
	private String statusText;

	@Column(name = "ALLOCATION_ID", length = 30)
	private String allocationId;

	@Column(name = "CREATED_BY", length = 30)
	private String createdBy;

	@Column(name = "CREATED_ON")
	@Temporal(TemporalType.DATE)
	private Date createdOn;

	@Column(name = "UPDATED_BY", length = 30)
	private String updatedBy;

	@Column(name = "UPDATED_ON")
	@Temporal(TemporalType.DATE)
	private Date updatedOn;

	@Column(name = "MFG_NAME", length = 100)
	private String mfgName;

	@Column(name = "DEPOT_NAME", length = 60)
	private String depotName;

	@Column(name = "VENDOR_LOC_ID", length = 30)
	private String vendorLocId;

	@Column(name = "VENDOR_LOC_NAME", length = 60)
	private String vendorLocName;

	@Column(name = "SOLD_ON")
	@Temporal(TemporalType.DATE)
	private Date soldOn;

	@Column(name = "SPOOL_BARCODE", length = 50)
	private String spoolBarcode;

	@Column(name = "PURPOSE", length = 30)
	private String purpose;

	@Column(name = "INTENDED_STATE", length = 30)
	private String intendedState;

	@Column(name = "VERIFICATION_ID", length = 30)
	private String verificationId;

	@Column(name = "BRAND_NUMBER", length = 50)
	private String brandNumber;

	@Column(name = "IMPORT_PERMIT_ID", length = 30)
	private String importPermitId;

	@Column(name = "SIZE_CODE", length = 30)
	private String sizeCode;

	@Column(name = "DC_ID", length = 30)
	private String dcId;

	@Column(name = "CHALLAN_INDENT_ID", length = 30)
	private String challanIndentId;

	@Column(name = "GRN_ID", length = 50)
	private String grnId;

	// Getters and Setters
	// (You can use an IDE to auto-generate these)

	public String getShCode() {
		return shCode;
	}

	public void setShCode(String shCode) {
		this.shCode = shCode;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

	public String getCeNumber() {
		return ceNumber;
	}

	public void setCeNumber(String ceNumber) {
		this.ceNumber = ceNumber;
	}

	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	public Date getDisposalDate() {
		return disposalDate;
	}

	public void setDisposalDate(Date disposalDate) {
		this.disposalDate = disposalDate;
	}

	public BigDecimal getMrp() {
		return mrp;
	}

	public void setMrp(BigDecimal mrp) {
		this.mrp = mrp;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getMfgLocId() {
		return mfgLocId;
	}

	public void setMfgLocId(String mfgLocId) {
		this.mfgLocId = mfgLocId;
	}

	public String getDepotLocId() {
		return depotLocId;
	}

	public void setDepotLocId(String depotLocId) {
		this.depotLocId = depotLocId;
	}

	public String getVendorRegNo() {
		return vendorRegNo;
	}

	public void setVendorRegNo(String vendorRegNo) {
		this.vendorRegNo = vendorRegNo;
	}

	public String getCurrentLocId() {
		return currentLocId;
	}

	public void setCurrentLocId(String currentLocId) {
		this.currentLocId = currentLocId;
	}

	public String getCaseBarcode() {
		return caseBarcode;
	}

	public void setCaseBarcode(String caseBarcode) {
		this.caseBarcode = caseBarcode;
	}

	public String getPackType() {
		return packType;
	}

	public void setPackType(String packType) {
		this.packType = packType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPreviousCaseBarcode() {
		return previousCaseBarcode;
	}

	public void setPreviousCaseBarcode(String previousCaseBarcode) {
		this.previousCaseBarcode = previousCaseBarcode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusText() {
		return statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	public String getAllocationId() {
		return allocationId;
	}

	public void setAllocationId(String allocationId) {
		this.allocationId = allocationId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getMfgName() {
		return mfgName;
	}

	public void setMfgName(String mfgName) {
		this.mfgName = mfgName;
	}

	public String getDepotName() {
		return depotName;
	}

	public void setDepotName(String depotName) {
		this.depotName = depotName;
	}

	public String getVendorLocId() {
		return vendorLocId;
	}

	public void setVendorLocId(String vendorLocId) {
		this.vendorLocId = vendorLocId;
	}

	public String getVendorLocName() {
		return vendorLocName;
	}

	public void setVendorLocName(String vendorLocName) {
		this.vendorLocName = vendorLocName;
	}

	public Date getSoldOn() {
		return soldOn;
	}

	public void setSoldOn(Date soldOn) {
		this.soldOn = soldOn;
	}

	public String getSpoolBarcode() {
		return spoolBarcode;
	}

	public void setSpoolBarcode(String spoolBarcode) {
		this.spoolBarcode = spoolBarcode;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getIntendedState() {
		return intendedState;
	}

	public void setIntendedState(String intendedState) {
		this.intendedState = intendedState;
	}

	public String getVerificationId() {
		return verificationId;
	}

	public void setVerificationId(String verificationId) {
		this.verificationId = verificationId;
	}

	public String getBrandNumber() {
		return brandNumber;
	}

	public void setBrandNumber(String brandNumber) {
		this.brandNumber = brandNumber;
	}

	public String getImportPermitId() {
		return importPermitId;
	}

	public void setImportPermitId(String importPermitId) {
		this.importPermitId = importPermitId;
	}

	public String getSizeCode() {
		return sizeCode;
	}

	public void setSizeCode(String sizeCode) {
		this.sizeCode = sizeCode;
	}

	public String getDcId() {
		return dcId;
	}

	public void setDcId(String dcId) {
		this.dcId = dcId;
	}

	public String getChallanIndentId() {
		return challanIndentId;
	}

	public void setChallanIndentId(String challanIndentId) {
		this.challanIndentId = challanIndentId;
	}

	public String getGrnId() {
		return grnId;
	}

	public void setGrnId(String grnId) {
		this.grnId = grnId;
	}

	// Add getters and setters for other fields similarly
}
