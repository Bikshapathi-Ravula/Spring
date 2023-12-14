package com.ctel.hpfs.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Case")
public class Case implements Serializable{

	private String CaseCode;

	public void setCaseCode(String CaseCode) {
		this.CaseCode = CaseCode;
	}

	public String getCaseCode() {
		return CaseCode;
	}

}