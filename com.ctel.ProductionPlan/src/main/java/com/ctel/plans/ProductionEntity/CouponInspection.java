package com.ctel.plans.ProductionEntity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "coupon_inspection")
public class CouponInspection {
	@Id
	private String uuid;
	private String coupon_code;
	private String coupon_size;
	private String line_uuid;
	private String lot_code;
	private String plant_code;
	private LocalDate creation_time;
	private int status;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getCoupon_code() {
		return coupon_code;
	}

	public void setCoupon_code(String coupon_code) {
		this.coupon_code = coupon_code;
	}

	public String getCoupon_size() {
		return coupon_size;
	}

	public void setCoupon_size(String coupon_size) {
		this.coupon_size = coupon_size;
	}

	public String getLine_uuid() {
		return line_uuid;
	}

	public void setLine_uuid(String line_uuid) {
		this.line_uuid = line_uuid;
	}

	public String getLot_code() {
		return lot_code;
	}

	public void setLot_code(String lot_code) {
		this.lot_code = lot_code;
	}

	public String getPlant_code() {
		return plant_code;
	}

	public void setPlant_code(String plant_code) {
		this.plant_code = plant_code;
	}

	public LocalDate getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(LocalDate creation_time) {
		this.creation_time = creation_time;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
