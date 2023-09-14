//package com.scyllaDB.control;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.cassandra.core.CassandraTemplate;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import com.scyllaDB.model.Model;
//import com.scyllaDB.ser.CassandraService;
//
//@Controller
//public class ScyllControl {
//	@Autowired
//	CassandraService cassandraService;
//
//	@GetMapping("/get")
//	List<Model> get() {
//		return cassandraService.getAllEntities();
//	}
//}
