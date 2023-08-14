package com.beanmapping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beanmapping.DTO.TravellingDTO;
import com.beanmapping.Enity.Travelling;
import com.beanmapping.service.MappingService;

@RestController
@RequestMapping("/Api")
public class Api {
	@Autowired
	MappingService mappingService;
	@PostMapping("/booking")
	ResponseEntity<TravellingDTO> getInfo(@RequestBody Travelling data) {
	//	mappingService.book(data);
	return ResponseEntity.ok(mappingService.book(data));
	}
}
