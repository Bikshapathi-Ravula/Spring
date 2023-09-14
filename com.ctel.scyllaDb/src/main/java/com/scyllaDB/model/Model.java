//package com.scyllaDB.model;
//
//import java.util.UUID;
//
//import org.springframework.data.cassandra.core.mapping.Column;
//import org.springframework.data.cassandra.core.mapping.PrimaryKey;
//import org.springframework.data.cassandra.core.mapping.Table;
//
//@Table("my_table")
//public class Model {
//
//	@PrimaryKey
//	private UUID id;
//	@Column("age")
//	private int age;
//	@Column("name")
//	private String name;
//	public UUID getId() {
//		return id;
//	}
//	public void setId(UUID id) {
//		this.id = id;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	// Getter and setter methods
//}
