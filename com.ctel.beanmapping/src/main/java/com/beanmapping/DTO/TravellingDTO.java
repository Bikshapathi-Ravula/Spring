package com.beanmapping.DTO;

import java.util.Date;

public class TravellingDTO {
	private String ticketNo;
//	private String pName;
//	private String gender;
//	private String pSource;
	private String pDestination;
	private String km;
	private String journeyDate;

	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	/*
	 * public String getpName() { return pName; }
	 * 
	 * public void setpName(String pName) { this.pName = pName; }
	 * 
	 * public String getGender() { return gender; }
	 * 
	 * public void setGender(String gender) { this.gender = gender; }
	 * 
	 * public String getpSource() { return pSource; }
	 * 
	 * public void setpSource(String pSource) { this.pSource = pSource; }
	 */
	public String getpDestination() {
		return pDestination;
	}

	public void setpDestination(String pDestination) {
		this.pDestination = pDestination;
	}

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}

	public String getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(String journeyDate) {
		this.journeyDate = "";
	}

}
