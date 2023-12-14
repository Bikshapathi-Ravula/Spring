package com.ctel.hpfs.entity;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("TransferPermits")
public class TransferPermits implements Serializable {

	private List<TransferPermit> TransferPermit;

	public void setTransferPermit(List<TransferPermit> TransferPermit) {
		this.TransferPermit = TransferPermit;
	}

	public List<TransferPermit> getTransferPermit() {
		return TransferPermit;
	}

}