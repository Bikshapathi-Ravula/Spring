//package com.ctel.Test.model;
//
//import java.io.Serializable;
//
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.redis.core.RedisHash;
//
//@SuppressWarnings("serial")
//@RedisHash(value = "ShoppingEntity")
//public class ShoppingEntity implements Serializable {
//	@Id
//	private int id;
//	private String name;
//	private long price;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public long getPrice() {
//		return price;
//	}
//
//	public void setPrice(long price) {
//		this.price = price;
//	}
//}
