package com.ctel.HpfsApRedis.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Model implements Serializable {

    private String shCode;
    private String productCode;
    private String supplierCode;
    private String batchNumber;
    private String lotNumber;
    private String ceNumber;
    private Date mfgDate;
    private Date disposalDate;
    private BigDecimal mrp;
    private Date expiryDate;
    private String mfgLocId;
    private String depotLocId;
    private String vendorRegNo;
    private String currentLocId;
    private String caseBarcode;
    private String packType;
    private String productName;
    private String previousCaseBarcode;
    private String status;
    private String statusText;
    private String allocationId;
    private String createdBy;
    private Date createdOn;
    private String updatedBy;
    private Date updatedOn;
    private String mfgName;
    private String depotName;
    private String vendorLocId;
    private String vendorLocName;
    private Date soldOn;
    private String spoolBarcode;
    private String purpose;
    private String intendedState;
    private String verificationId;
    private String brandNumber;
    private String importPermitId;
    private String sizeCode;
    private String dcId;
    private String challanIndentId;
    private String grnId;

    // Getters and Setters

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
}
