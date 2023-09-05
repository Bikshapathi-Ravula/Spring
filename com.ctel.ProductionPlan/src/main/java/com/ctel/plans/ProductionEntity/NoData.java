package com.ctel.plans.ProductionEntity;

import java.util.Date;

public class NoData {
	private String locCode;
	private String lineNo;
	private String message;
	private String creation_time;

	public String getLocCode() {
		return locCode;
	}

	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = "No Data Found!!!";
	}

	public String getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Date creation_time) {
		this.creation_time = new Date().toString().substring(0, 11);
	}

}
