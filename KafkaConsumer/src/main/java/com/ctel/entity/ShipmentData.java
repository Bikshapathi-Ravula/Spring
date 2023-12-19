package com.ctel.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipmentData {

	@JsonProperty("Shipments")
    private Shipments shipments;

    public Shipments getShipments() {
        return shipments;
    }

    public void setShipments(Shipments shipments) {
        this.shipments = shipments;
    }

    public static class Shipments {

    	@JsonProperty("Shipment")
        private List<Shipment> shipment;

        public List<Shipment> getShipment() {
            return shipment;
        }

        public void setShipment(List<Shipment> shipment) {
            this.shipment = shipment;
        }

		@Override
		public String toString() {
			return "Shipments [shipment=" + shipment + "]";
		}
    }

    public static class Shipment {

        @JsonProperty("ShipmentId")
        private String shipmentId;

        @JsonProperty("ASNCode")
        private String asnCode;

        @JsonProperty("ASNStatus")
        private String asnStatus;

        @JsonProperty("DepatureTime")
        private String depatureTime;

        @JsonProperty("SourceLocationId")
        private String sourceLocationId;

        @JsonProperty("SourceLocationName")
        private String sourceLocationName;

        @JsonProperty("DestinationLocationId")
        private String destinationLocationId;

        @JsonProperty("DestinationLocationName")
        private String destinationLocationName;

        @JsonProperty("ConsignmentType")
        private String consignmentType;

        @JsonProperty("InitiatorId")
        private String initiatorId;

        @JsonProperty("InitiatorLocationId")
        private String initiatorLocationId;

        @JsonProperty("ApprovedOn")
        private String approvedOn;

        @JsonProperty("DepatureDate")
        private String depatureDate;

        @JsonProperty("Status")
        private String status;

        @JsonProperty("CreatedBy")
        private String createdBy;

        @JsonProperty("CreatedOn")
        private String createdOn;

        @JsonProperty("UpdatedOn")
        private String updatedOn;

        @JsonProperty("AddressIdDist")
        private String addressIdDist;

        @JsonProperty("DestAddressIdDist")
        private String destAddressIdDist;

        @JsonProperty("ShipmentDetails")
        private ShipmentDetails shipmentDetails;

        @JsonProperty("Cases")
        private Cases cases;

        @JsonProperty("TransferPermits")
        private TransferPermits transferPermits;

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

		public String getDepatureTime() {
			return depatureTime;
		}

		public void setDepatureTime(String depatureTime) {
			this.depatureTime = depatureTime;
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

		public String getDepatureDate() {
			return depatureDate;
		}

		public void setDepatureDate(String depatureDate) {
			this.depatureDate = depatureDate;
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

		public ShipmentDetails getShipmentDetails() {
			return shipmentDetails;
		}

		public void setShipmentDetails(ShipmentDetails shipmentDetails) {
			this.shipmentDetails = shipmentDetails;
		}

		public Cases getCases() {
			return cases;
		}

		public void setCases(Cases cases) {
			this.cases = cases;
		}

		public TransferPermits getTransferPermits() {
			return transferPermits;
		}

		public void setTransferPermits(TransferPermits transferPermits) {
			this.transferPermits = transferPermits;
		}

		public Shipment(String shipmentId, String asnCode, String asnStatus, String depatureTime,
				String sourceLocationId, String sourceLocationName, String destinationLocationId,
				String destinationLocationName, String consignmentType, String initiatorId, String initiatorLocationId,
				String approvedOn, String depatureDate, String status, String createdBy, String createdOn,
				String updatedOn, String addressIdDist, String destAddressIdDist, ShipmentDetails shipmentDetails,
				Cases cases, TransferPermits transferPermits) {
			super();
			this.shipmentId = shipmentId;
			this.asnCode = asnCode;
			this.asnStatus = asnStatus;
			this.depatureTime = depatureTime;
			this.sourceLocationId = sourceLocationId;
			this.sourceLocationName = sourceLocationName;
			this.destinationLocationId = destinationLocationId;
			this.destinationLocationName = destinationLocationName;
			this.consignmentType = consignmentType;
			this.initiatorId = initiatorId;
			this.initiatorLocationId = initiatorLocationId;
			this.approvedOn = approvedOn;
			this.depatureDate = depatureDate;
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

		public static class ShipmentDetails {

			@JsonProperty("ShipmentDetail")
            private List<ShipmentDetail> shipmentDetail;

            public List<ShipmentDetail> getShipmentDetail() {
                return shipmentDetail;
            }

            public void setShipmentDetail(List<ShipmentDetail> shipmentDetail) {
                this.shipmentDetail = shipmentDetail;
            }

			public ShipmentDetails(List<ShipmentDetail> shipmentDetail) {
				super();
				this.shipmentDetail = shipmentDetail;
			}

			public ShipmentDetails() {
				super();
				// TODO Auto-generated constructor stub
			}

			@Override
			public String toString() {
				return "ShipmentDetails [shipmentDetail=" + shipmentDetail + "]";
			}
			
        }

        public static class Cases {

        	@JsonProperty("Case")
            private List<Case> _case;

            public List<Case> getCase() {
                return _case;
            }

            public void setCase(List<Case> _case) {
                this._case = _case;
            }

			public Cases(List<Case> _case) {
				super();
				this._case = _case;
			}

			public Cases() {
				super();
				// TODO Auto-generated constructor stub
			}

			@Override
			public String toString() {
				return "Cases [_case=" + _case + "]";
			}
			
        }

        public static class TransferPermits {

        	@JsonProperty("TransferPermit")
            private List<TransferPermit> transferPermit;

            public List<TransferPermit> getTransferPermit() {
                return transferPermit;
            }

            public void setTransferPermit(List<TransferPermit> transferPermit) {
                this.transferPermit = transferPermit;
            }

			public TransferPermits(List<TransferPermit> transferPermit) {
				super();
				this.transferPermit = transferPermit;
			}

			public TransferPermits() {
				super();
				// TODO Auto-generated constructor stub
			}

			@Override
			public String toString() {
				return "TransferPermits [transferPermit=" + transferPermit + "]";
			}

        }

		@Override
		public String toString() {
			return "Shipment [shipmentId=" + shipmentId + ", asnCode=" + asnCode + ", asnStatus=" + asnStatus
					+ ", depatureTime=" + depatureTime + ", sourceLocationId=" + sourceLocationId
					+ ", sourceLocationName=" + sourceLocationName + ", destinationLocationId=" + destinationLocationId
					+ ", destinationLocationName=" + destinationLocationName + ", consignmentType=" + consignmentType
					+ ", initiatorId=" + initiatorId + ", initiatorLocationId=" + initiatorLocationId + ", approvedOn="
					+ approvedOn + ", depatureDate=" + depatureDate + ", status=" + status + ", createdBy=" + createdBy
					+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", addressIdDist=" + addressIdDist
					+ ", destAddressIdDist=" + destAddressIdDist + ", shipmentDetails=" + shipmentDetails + ", cases="
					+ cases + ", transferPermits=" + transferPermits + "]";
		}
        
    }

    public static class ShipmentDetail {

        @JsonProperty("ShipmentDetailId")
        private String shipmentDetailId;

        @JsonProperty("OSFCode")
        private String osfCode;

        @JsonProperty("OSFNumber")
        private String osfNumber;

        @JsonProperty("ProductCode")
        private String productCode;

        @JsonProperty("ProductName")
        private String productName;

        @JsonProperty("SizeCode")
        private String sizeCode;

        @JsonProperty("PackType")
        private String packType;

        @JsonProperty("OFSQuantity")
        private String ofsQuantity;

        @JsonProperty("ShipmentQuantity")
        private String shipmentQuantity;

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

		@Override
		public String toString() {
			return "ShipmentDetail [shipmentDetailId=" + shipmentDetailId + ", osfCode=" + osfCode + ", osfNumber="
					+ osfNumber + ", productCode=" + productCode + ", productName=" + productName + ", sizeCode="
					+ sizeCode + ", packType=" + packType + ", ofsQuantity=" + ofsQuantity + ", shipmentQuantity="
					+ shipmentQuantity + ", priceGroupId=" + priceGroupId + "]";
		}

    }

    public static class Case {

        @JsonProperty("CaseCode")
        private String caseCode;

		public String getCaseCode() {
			return caseCode;
		}

		public void setCaseCode(String caseCode) {
			this.caseCode = caseCode;
		}

		public Case(String caseCode) {
			super();
			this.caseCode = caseCode;
		}

		public Case() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Case [caseCode=" + caseCode + "]";
		}
		
    }

    public static class TransferPermit {

        @JsonProperty("TransferPermitCode")
        private String transferPermitCode;

        @JsonProperty("LRNumber")
        private String lrNumber;

        @JsonProperty("Transporter")
        private String transporter;

        @JsonProperty("VehicleNumber")
        private String vehicleNumber;

        @JsonProperty("IssueDate")
        private String issueDate;

        @JsonProperty("IssueTime")
        private String issueTime;

        @JsonProperty("ValidityDate")
        private String validityDate;

        @JsonProperty("ValidityTime")
        private String validityTime;

        @JsonProperty("ValidityPeriod")
        private String validityPeriod;

        @JsonProperty("Route")
        private String route;

        @JsonProperty("Status")
        private String status;

        @JsonProperty("CreatedBy")
        private String createdBy;

        @JsonProperty("CreatedOn")
        private String createdOn;

        @JsonProperty("ShipmentId")
        private String shipmentId;

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

		@Override
		public String toString() {
			return "TransferPermit [transferPermitCode=" + transferPermitCode + ", lrNumber=" + lrNumber
					+ ", transporter=" + transporter + ", vehicleNumber=" + vehicleNumber + ", issueDate=" + issueDate
					+ ", issueTime=" + issueTime + ", validityDate=" + validityDate + ", validityTime=" + validityTime
					+ ", validityPeriod=" + validityPeriod + ", route=" + route + ", status=" + status + ", createdBy="
					+ createdBy + ", createdOn=" + createdOn + ", shipmentId=" + shipmentId + ", lrDate=" + lrDate
					+ "]";
		}

    }

	@Override
	public String toString() {
		return "ShipmentData [shipments=" + shipments + "]";
	}

}
