package com.ctel.plans.ProductionEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Production_data")
public class ProductionData {
	@Id
	private String uuid;

	private String plan_id;
	private String plant_name;
	private String plant_code;
	private String line_no;
	private String plan_date;
	private String product_code;
	private String product_name;
	private String priority;
	private String pack_type;
	private String size_code;
	private String units_per_case;
	private String purpose;
	private String volume;
	private String mrp;
	private String mrp_batch;
	private String product_batch;
	private String is_coupon_apply;
	private String is_label_apply;
	private String machine_name;
	private String status;
	private String create_time;
	private String row_matrix;
	private String column_matrix;
	private String completed_count;

	// Getter Methods

	public String getUuid() {
		return uuid;
	}

	public String getPlan_id() {
		return plan_id;
	}

	public String getPlant_name() {
		return plant_name;
	}

	public String getPlant_code() {
		return plant_code;
	}

	public String getLine_no() {
		return line_no;
	}

	public String getPlan_date() {
		return plan_date;
	}

	public String getProduct_code() {
		return product_code;
	}

	public String getProduct_name() {
		return product_name;
	}

	public String getPriority() {
		return priority;
	}

	public String getPack_type() {
		return pack_type;
	}

	public String getSize_code() {
		return size_code;
	}

	public String getUnits_per_case() {
		return units_per_case;
	}

	public String getPurpose() {
		return purpose;
	}

	public String getVolume() {
		return volume;
	}

	public String getMrp() {
		return mrp;
	}

	public String getMrp_batch() {
		return mrp_batch;
	}

	public String getProduct_batch() {
		return product_batch;
	}

	public String getIs_coupon_apply() {
		return is_coupon_apply;
	}

	public String getIs_label_apply() {
		return is_label_apply;
	}

	public String getMachine_name() {
		return machine_name;
	}

	public String getStatus() {
		return status;
	}

	public String getCreate_time() {
		return create_time;
	}

	public String getRow_matrix() {
		return row_matrix;
	}

	public String getColumn_matrix() {
		return column_matrix;
	}

	public String getCompleted_count() {
		return completed_count;
	}

	// Setter Methods

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}

	public void setPlant_name(String plant_name) {
		this.plant_name = plant_name;
	}

	public void setPlant_code(String plant_code) {
		this.plant_code = plant_code;
	}

	public void setLine_no(String line_no) {
		this.line_no = line_no;
	}

	public void setPlan_date(String plan_date) {
		this.plan_date = plan_date;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public void setPack_type(String pack_type) {
		this.pack_type = pack_type;
	}

	public void setSize_code(String size_code) {
		this.size_code = size_code;
	}

	public void setUnits_per_case(String units_per_case) {
		this.units_per_case = units_per_case;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	public void setMrp_batch(String mrp_batch) {
		this.mrp_batch = mrp_batch;
	}

	public void setProduct_batch(String product_batch) {
		this.product_batch = product_batch;
	}

	public void setIs_coupon_apply(String is_coupon_apply) {
		this.is_coupon_apply = is_coupon_apply;
	}

	public void setIs_label_apply(String is_label_apply) {
		this.is_label_apply = is_label_apply;
	}

	public void setMachine_name(String machine_name) {
		this.machine_name = machine_name;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public void setRow_matrix(String row_matrix) {
		this.row_matrix = row_matrix;
	}

	public void setColumn_matrix(String column_matrix) {
		this.column_matrix = column_matrix;
	}

	public void setCompleted_count(String completed_count) {
		this.completed_count = completed_count;

	}
}
