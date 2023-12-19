package com.ctel.entity;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PostRequest", namespace = "http://www.goap.hstracking.com/Service/")
@XmlAccessorType(XmlAccessType.FIELD)
public class PostRequest {

    @XmlElement(name = "ObjectType", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    private String objectType;

    @XmlElement(name = "LocationId", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    private String locationId;

    @XmlElement(name = "LocationType", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    private String locationType;

    @XmlElement(name = "SourceLocation", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    private String sourceLocation;

    @XmlElement(name = "DestinationLocation", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    private String destinationLocation;

    @XmlElement(name = "Payload", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    private String payload;

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getSourceLocation() {
		return sourceLocation;
	}

	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;
	}

	public String getDestinationLocation() {
		return destinationLocation;
	}

	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "PostRequest [objectType=" + objectType + ", locationId=" + locationId + ", locationType=" + locationType
				+ ", sourceLocation=" + sourceLocation + ", destinationLocation=" + destinationLocation + ", payload="
				+ payload + "]";
	}

	public PostRequest(String objectType, String locationId, String locationType, String sourceLocation,
			String destinationLocation, String payload) {
		super();
		this.objectType = objectType;
		this.locationId = locationId;
		this.locationType = locationType;
		this.sourceLocation = sourceLocation;
		this.destinationLocation = destinationLocation;
		this.payload = payload;
	}

	public PostRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

}


@XmlAccessorType(XmlAccessType.FIELD)
class Shipments {

    @XmlElement(name = "Shipment", namespace = "http://www.goap.hstracking.com/Service/")
    @JsonProperty("Shipment")
    private List<Shipment> shipmentList;

	public Shipments(List<Shipment> shipmentList) {
		super();
		this.shipmentList = shipmentList;
	}

	public Shipments() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Shipments [shipmentList=" + shipmentList + "]";
	}

	public List<Shipment> getShipmentList() {
		return shipmentList;
	}

	public void setShipmentList(List<Shipment> shipmentList) {
		this.shipmentList = shipmentList;
	}

}

@XmlAccessorType(XmlAccessType.FIELD)
class Shipment {

    @XmlElement(name = "ShipmentId", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("ShipmentId")
    private String shipmentId;

    @XmlElement(name = "ASNCode", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("ASNCode")
    private String asnCode;

    @XmlElement(name = "ASNStatus", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("ASNStatus")
    private String asnStatus;

    @XmlElement(name = "DepatureTime", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("DepatureTime")
    private String departureTime;

    @XmlElement(name = "SourceLocationId", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("SourceLocationId")
    private String sourceLocationId;

    @XmlElement(name = "SourceLocationName", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("SourceLocationName")
    private String sourceLocationName;

    @XmlElement(name = "DestinationLocationId", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("DestinationLocationId")
    private String destinationLocationId;

    @XmlElement(name = "DestinationLocationName", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("DestinationLocationName")
    private String destinationLocationName;

    @XmlElement(name = "ConsignmentType", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("ConsignmentType")
    private String consignmentType;

    @XmlElement(name = "InitiatorId", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("InitiatorId")
    private String initiatorId;

    @XmlElement(name = "InitiatorLocationId", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("InitiatorLocationId")
    private String initiatorLocationId;

    @XmlElement(name = "ApprovedOn", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("ApprovedOn")
    private String approvedOn;

    @XmlElement(name = "DepatureDate", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("DepatureDate")
    private String departureDate;

    @XmlElement(name = "Status", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("Status")
    private String status;

    @XmlElement(name = "CreatedBy", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("CreatedBy")
    private String createdBy;

    @XmlElement(name = "CreatedOn", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("CreatedOn")
    private String createdOn;

    @XmlElement(name = "UpdatedOn", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("UpdatedOn")
    private String updatedOn;

    @XmlElement(name = "AddressIdDist", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("AddressIdDist")
    private String addressIdDist;

    @XmlElement(name = "DestAddressIdDist", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("DestAddressIdDist")
    private String destAddressIdDist;

    @XmlElement(name = "ShipmentDetails", namespace = "http://www.goap.hstracking.com/Service/")
    @JsonProperty("ShipmentDetails")
    private List<ShipmentDetail> shipmentDetails;

    @XmlElement(name = "Cases", namespace = "http://www.goap.hstracking.com/Service/")
    @JsonProperty("Cases")
    private List<Case> cases;

    @XmlElement(name = "TransferPermits", namespace = "http://www.goap.hstracking.com/Service/")
    @JsonProperty("TransferPermits")
    private List<TransferPermit> transferPermits;

	public String getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getAsnCode() {
		return asnCode;
	}

	public void setAsnCode(String asnCode) {
		this.asnCode = asnCode;
	}

	public String getAsnStatus() {
		return asnStatus;
	}

	public void setAsnStatus(String asnStatus) {
		this.asnStatus = asnStatus;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getSourceLocationId() {
		return sourceLocationId;
	}

	public void setSourceLocationId(String sourceLocationId) {
		this.sourceLocationId = sourceLocationId;
	}

	public String getSourceLocationName() {
		return sourceLocationName;
	}

	public void setSourceLocationName(String sourceLocationName) {
		this.sourceLocationName = sourceLocationName;
	}

	public String getDestinationLocationId() {
		return destinationLocationId;
	}

	public void setDestinationLocationId(String destinationLocationId) {
		this.destinationLocationId = destinationLocationId;
	}

	public String getDestinationLocationName() {
		return destinationLocationName;
	}

	public void setDestinationLocationName(String destinationLocationName) {
		this.destinationLocationName = destinationLocationName;
	}

	public String getConsignmentType() {
		return consignmentType;
	}

	public void setConsignmentType(String consignmentType) {
		this.consignmentType = consignmentType;
	}

	public String getInitiatorId() {
		return initiatorId;
	}

	public void setInitiatorId(String initiatorId) {
		this.initiatorId = initiatorId;
	}

	public String getInitiatorLocationId() {
		return initiatorLocationId;
	}

	public void setInitiatorLocationId(String initiatorLocationId) {
		this.initiatorLocationId = initiatorLocationId;
	}

	public String getApprovedOn() {
		return approvedOn;
	}

	public void setApprovedOn(String approvedOn) {
		this.approvedOn = approvedOn;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getAddressIdDist() {
		return addressIdDist;
	}

	public void setAddressIdDist(String addressIdDist) {
		this.addressIdDist = addressIdDist;
	}

	public String getDestAddressIdDist() {
		return destAddressIdDist;
	}

	public void setDestAddressIdDist(String destAddressIdDist) {
		this.destAddressIdDist = destAddressIdDist;
	}

	public List<ShipmentDetail> getShipmentDetails() {
		return shipmentDetails;
	}

	public void setShipmentDetails(List<ShipmentDetail> shipmentDetails) {
		this.shipmentDetails = shipmentDetails;
	}

	public List<Case> getCases() {
		return cases;
	}

	public void setCases(List<Case> cases) {
		this.cases = cases;
	}

	public List<TransferPermit> getTransferPermits() {
		return transferPermits;
	}

	public void setTransferPermits(List<TransferPermit> transferPermits) {
		this.transferPermits = transferPermits;
	}

	@Override
	public String toString() {
		return "Shipment [shipmentId=" + shipmentId + ", asnCode=" + asnCode + ", asnStatus=" + asnStatus
				+ ", departureTime=" + departureTime + ", sourceLocationId=" + sourceLocationId
				+ ", sourceLocationName=" + sourceLocationName + ", destinationLocationId=" + destinationLocationId
				+ ", destinationLocationName=" + destinationLocationName + ", consignmentType=" + consignmentType
				+ ", initiatorId=" + initiatorId + ", initiatorLocationId=" + initiatorLocationId + ", approvedOn="
				+ approvedOn + ", departureDate=" + departureDate + ", status=" + status + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", addressIdDist=" + addressIdDist
				+ ", destAddressIdDist=" + destAddressIdDist + ", shipmentDetails=" + shipmentDetails + ", cases="
				+ cases + ", transferPermits=" + transferPermits + "]";
	}

	public Shipment(String shipmentId, String asnCode, String asnStatus, String departureTime, String sourceLocationId,
			String sourceLocationName, String destinationLocationId, String destinationLocationName,
			String consignmentType, String initiatorId, String initiatorLocationId, String approvedOn,
			String departureDate, String status, String createdBy, String createdOn, String updatedOn,
			String addressIdDist, String destAddressIdDist, List<ShipmentDetail> shipmentDetails, List<Case> cases,
			List<TransferPermit> transferPermits) {
		super();
		this.shipmentId = shipmentId;
		this.asnCode = asnCode;
		this.asnStatus = asnStatus;
		this.departureTime = departureTime;
		this.sourceLocationId = sourceLocationId;
		this.sourceLocationName = sourceLocationName;
		this.destinationLocationId = destinationLocationId;
		this.destinationLocationName = destinationLocationName;
		this.consignmentType = consignmentType;
		this.initiatorId = initiatorId;
		this.initiatorLocationId = initiatorLocationId;
		this.approvedOn = approvedOn;
		this.departureDate = departureDate;
		this.status = status;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.addressIdDist = addressIdDist;
		this.destAddressIdDist = destAddressIdDist;
		this.shipmentDetails = shipmentDetails;
		this.cases = cases;
		this.transferPermits = transferPermits;
	}

	public Shipment() {
		super();
		// TODO Auto-generated constructor stub
	}

}

@XmlAccessorType(XmlAccessType.FIELD)
class ShipmentDetails {

    @XmlElement(name = "ShipmentDetail", namespace = "http://www.goap.hstracking.com/Service/")
    @JsonProperty("ShipmentDetail")
    private List<ShipmentDetail> shipmentDetailList;

	public List<ShipmentDetail> getShipmentDetailList() {
		return shipmentDetailList;
	}

	public void setShipmentDetailList(List<ShipmentDetail> shipmentDetailList) {
		this.shipmentDetailList = shipmentDetailList;
	}

	@Override
	public String toString() {
		return "ShipmentDetails [shipmentDetailList=" + shipmentDetailList + "]";
	}

	public ShipmentDetails(List<ShipmentDetail> shipmentDetailList) {
		super();
		this.shipmentDetailList = shipmentDetailList;
	}

	public ShipmentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}

@XmlAccessorType(XmlAccessType.FIELD)
class ShipmentDetail {

    @XmlElement(name = "ShipmentDetailId", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("ShipmentDetailId")
    private String shipmentDetailId;

    @XmlElement(name = "OSFCode", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("OSFCode")
    private String osfCode;

    @XmlElement(name = "OSFNumber", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("OSFNumber")
    private String osfNumber;

    @XmlElement(name = "ProductCode", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("ProductCode")
    private String productCode;

    @XmlElement(name = "ProductName", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("ShipmentDetail")
    private String productName;

    @XmlElement(name = "SizeCode", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("SizeCode")
    private String sizeCode;

    @XmlElement(name = "PackType", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("PackType")
    private String packType;

    @XmlElement(name = "OFSQuantity", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("OFSQuantity")
    private String ofsQuantity;

    @XmlElement(name = "ShipmentQuatity", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("ShipmentQuatity")
    private String shipmentQuantity;

    @XmlElement(name = "PriceGroupId", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("PriceGroupId")
    private String priceGroupId;

	public String getShipmentDetailId() {
		return shipmentDetailId;
	}

	public void setShipmentDetailId(String shipmentDetailId) {
		this.shipmentDetailId = shipmentDetailId;
	}

	public String getOsfCode() {
		return osfCode;
	}

	public void setOsfCode(String osfCode) {
		this.osfCode = osfCode;
	}

	public String getOsfNumber() {
		return osfNumber;
	}

	public void setOsfNumber(String osfNumber) {
		this.osfNumber = osfNumber;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSizeCode() {
		return sizeCode;
	}

	public void setSizeCode(String sizeCode) {
		this.sizeCode = sizeCode;
	}

	public String getPackType() {
		return packType;
	}

	public void setPackType(String packType) {
		this.packType = packType;
	}

	public String getOfsQuantity() {
		return ofsQuantity;
	}

	public void setOfsQuantity(String ofsQuantity) {
		this.ofsQuantity = ofsQuantity;
	}

	public String getShipmentQuantity() {
		return shipmentQuantity;
	}

	public void setShipmentQuantity(String shipmentQuantity) {
		this.shipmentQuantity = shipmentQuantity;
	}

	public String getPriceGroupId() {
		return priceGroupId;
	}

	public void setPriceGroupId(String priceGroupId) {
		this.priceGroupId = priceGroupId;
	}

	@Override
	public String toString() {
		return "ShipmentDetail [shipmentDetailId=" + shipmentDetailId + ", osfCode=" + osfCode + ", osfNumber="
				+ osfNumber + ", productCode=" + productCode + ", productName=" + productName + ", sizeCode=" + sizeCode
				+ ", packType=" + packType + ", ofsQuantity=" + ofsQuantity + ", shipmentQuantity=" + shipmentQuantity
				+ ", priceGroupId=" + priceGroupId + "]";
	}

	public ShipmentDetail(String shipmentDetailId, String osfCode, String osfNumber, String productCode,
			String productName, String sizeCode, String packType, String ofsQuantity, String shipmentQuantity,
			String priceGroupId) {
		super();
		this.shipmentDetailId = shipmentDetailId;
		this.osfCode = osfCode;
		this.osfNumber = osfNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.sizeCode = sizeCode;
		this.packType = packType;
		this.ofsQuantity = ofsQuantity;
		this.shipmentQuantity = shipmentQuantity;
		this.priceGroupId = priceGroupId;
	}

	public ShipmentDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

}

@XmlAccessorType(XmlAccessType.FIELD)
class Cases {

    @XmlElement(name = "Case", namespace = "http://www.goap.hstracking.com/Service/", type=Case.class)
    private List<Case> caseList;

	public Cases(List<Case> caseList) {
		super();
		this.caseList = caseList;
	}

	public Cases() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Case> getCaseList() {
		return caseList;
	}

	public void setCaseList(List<Case> caseList) {
		this.caseList = caseList;
	}

	@Override
	public String toString() {
		return "Cases [caseList=" + caseList + "]";
	}

}

@XmlAccessorType(XmlAccessType.FIELD)
class Case {

    @XmlElement(name = "CaseCode", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("CaseCode")
    private String caseCode;

	public String getCaseCode() {
		return caseCode;
	}

	public void setCaseCode(String caseCode) {
		this.caseCode = caseCode;
	}

	@Override
	public String toString() {
		return "Case [caseCode=" + caseCode + "]";
	}

	public Case(String caseCode) {
		super();
		this.caseCode = caseCode;
	}

	public Case() {
		super();
		// TODO Auto-generated constructor stub
	}

}

@XmlAccessorType(XmlAccessType.FIELD)
class TransferPermits {

    @XmlElement(name = "TransferPermit", namespace = "http://www.goap.hstracking.com/Service/", type=TransferPermit.class)
    @JsonProperty("TransferPermit")
    private List<TransferPermit> transferPermitList;

	public List<TransferPermit> getTransferPermitList() {
		return transferPermitList;
	}

	public void setTransferPermitList(List<TransferPermit> transferPermitList) {
		this.transferPermitList = transferPermitList;
	}

	@Override
	public String toString() {
		return "TransferPermits [transferPermitList=" + transferPermitList + "]";
	}

	public TransferPermits(List<TransferPermit> transferPermitList) {
		super();
		this.transferPermitList = transferPermitList;
	}

	public TransferPermits() {
		super();
		// TODO Auto-generated constructor stub
	}

}

@XmlAccessorType(XmlAccessType.FIELD)
class TransferPermit {

    @XmlElement(name = "TransferPermitCode", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("TransferPermitCode")
    private String transferPermitCode;

    @XmlElement(name = "LRNumber", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("LRNumber")
    private String lrNumber;

    @XmlElement(name = "Transporter", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("Transporter")
    private String transporter;

    @XmlElement(name = "VehicleNumber", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("VehicleNumber")
    private String vehicleNumber;

    @XmlElement(name = "IssueDate", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("IssueDate")
    private String issueDate;

    @XmlElement(name = "IssueTime", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("IssueTime")
    private String issueTime;

    @XmlElement(name = "ValidityDate", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("ValidityDate")
    private String validityDate;

    @XmlElement(name = "ValidityTime", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("ValidityTime")
    private String validityTime;

    @XmlElement(name = "ValidityPeriod", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("ValidityPeriod")
    private String validityPeriod;

    @XmlElement(name = "Route", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("Route")
    private String route;

    @XmlElement(name = "Status", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("Status")
    private String status;

    @XmlElement(name = "CreatedBy", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("CreatedBy")
    private String createdBy;

    @XmlElement(name = "CreatedOn", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("CreatedOn")
    private String createdOn;

    @XmlElement(name = "ShipmentId", namespace = "http://www.goap.hstracking.com/Service/", type=String.class)
    @JsonProperty("ShipmentId")
    private String shipmentId;

    @XmlElement(name = "LRDate")
    @JsonProperty("LRDate")
    private String lrDate;

	public String getTransferPermitCode() {
		return transferPermitCode;
	}

	public void setTransferPermitCode(String transferPermitCode) {
		this.transferPermitCode = transferPermitCode;
	}

	public String getLrNumber() {
		return lrNumber;
	}

	public void setLrNumber(String lrNumber) {
		this.lrNumber = lrNumber;
	}

	public String getTransporter() {
		return transporter;
	}

	public void setTransporter(String transporter) {
		this.transporter = transporter;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getIssueTime() {
		return issueTime;
	}

	public void setIssueTime(String issueTime) {
		this.issueTime = issueTime;
	}

	public String getValidityDate() {
		return validityDate;
	}

	public void setValidityDate(String validityDate) {
		this.validityDate = validityDate;
	}

	public String getValidityTime() {
		return validityTime;
	}

	public void setValidityTime(String validityTime) {
		this.validityTime = validityTime;
	}

	public String getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getLrDate() {
		return lrDate;
	}

	public void setLrDate(String lrDate) {
		this.lrDate = lrDate;
	}

	@Override
	public String toString() {
		return "TransferPermit [transferPermitCode=" + transferPermitCode + ", lrNumber=" + lrNumber + ", transporter="
				+ transporter + ", vehicleNumber=" + vehicleNumber + ", issueDate=" + issueDate + ", issueTime="
				+ issueTime + ", validityDate=" + validityDate + ", validityTime=" + validityTime + ", validityPeriod="
				+ validityPeriod + ", route=" + route + ", status=" + status + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", shipmentId=" + shipmentId + ", lrDate=" + lrDate + "]";
	}

	public TransferPermit(String transferPermitCode, String lrNumber, String transporter, String vehicleNumber,
			String issueDate, String issueTime, String validityDate, String validityTime, String validityPeriod,
			String route, String status, String createdBy, String createdOn, String shipmentId, String lrDate) {
		super();
		this.transferPermitCode = transferPermitCode;
		this.lrNumber = lrNumber;
		this.transporter = transporter;
		this.vehicleNumber = vehicleNumber;
		this.issueDate = issueDate;
		this.issueTime = issueTime;
		this.validityDate = validityDate;
		this.validityTime = validityTime;
		this.validityPeriod = validityPeriod;
		this.route = route;
		this.status = status;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.shipmentId = shipmentId;
		this.lrDate = lrDate;
	}

	public TransferPermit() {
		super();
		// TODO Auto-generated constructor stub
	}

}
