package com.beanmapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.beanmapping.DTO.TravellingDTO;
import com.beanmapping.Enity.Travelling;
import com.beanmapping.mapper.AutoUserMapper;
import com.beanmapping.repo.BeanMappingInterface;

@Service
public class MappingService {
//	@Autowired
//	BeanMappingInterface beanMappingInterface;
	@Autowired
	AutoUserMapper m;

	public TravellingDTO book(Travelling a) {
		// return beanMappingInterface.save(a).getpName();
		return m.get(a);
	}
}
