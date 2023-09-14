//package com.scyllaDB.ser;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.cassandra.core.CassandraTemplate;
//import org.springframework.stereotype.Service;
//
//import com.scyllaDB.model.Model;
//
//@Service
//public class CassandraService {
//
//    private final CassandraTemplate cassandraTemplate;
//
//    @Autowired
//    public CassandraService(CassandraTemplate cassandraTemplate) {
//        this.cassandraTemplate = cassandraTemplate;
//    }
//
//    public List<Model> getAllEntities() {
//        return cassandraTemplate.select("SELECT * FROM my_table", Model.class);
//    }
//}
