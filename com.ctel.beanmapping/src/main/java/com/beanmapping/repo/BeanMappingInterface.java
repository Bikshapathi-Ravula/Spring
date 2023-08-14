package com.beanmapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beanmapping.Enity.Travelling;

@Repository
public interface BeanMappingInterface extends JpaRepository<Travelling, String> {

	//Travelling save(TravellingDTO travellingDTO);

}
