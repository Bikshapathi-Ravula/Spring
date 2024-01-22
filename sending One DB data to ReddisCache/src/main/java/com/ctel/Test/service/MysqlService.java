package com.ctel.Test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctel.Test.model.Shopping;
import com.ctel.Test.repo.Jpa;

@Service
public class MysqlService {

	@Autowired
	Jpa mysqlRepositary;

	public List<Shopping> getFromMysql() {
		return mysqlRepositary.findAll();
	}

	public Optional<Shopping> getById(Integer id) {
		return mysqlRepositary.findById(id);
	}

	public Shopping saveRecord(Shopping data) {
		return mysqlRepositary.save(data);
	}
}
