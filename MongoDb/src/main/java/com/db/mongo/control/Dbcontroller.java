package com.db.mongo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.mongo.pojo.MongoDbEntity;
import com.db.mongo.repo.Repo;

@RestController
@RequestMapping("/Api")
public class Dbcontroller {
	@Autowired
	private Repo rr;

	@PostMapping("/all")
	private List<MongoDbEntity> fetchData(@RequestBody List<MongoDbEntity> entity) {
		List<MongoDbEntity> e = rr.saveAll(entity);
		return e;
	}

	@GetMapping("/getall")
	private List<MongoDbEntity> fetchData() {

		return rr.findAll();
	}

	@PostMapping("/update")
	private ResponseEntity<?> fetchData(@RequestBody MongoDbEntity id) {
		MongoDbEntity rrr = null;
		System.out.println(id.getId());
		List<MongoDbEntity> entity = rr.findAll();
		for (MongoDbEntity mongoDbEntity : entity) {
			if (mongoDbEntity.getId().equals(id.getId())) {
				rr.delete(mongoDbEntity);
				
				rr.insert(id);
				return ResponseEntity.status(HttpStatus.ACCEPTED).body(mongoDbEntity);
			}

		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found"	);
	}

}
