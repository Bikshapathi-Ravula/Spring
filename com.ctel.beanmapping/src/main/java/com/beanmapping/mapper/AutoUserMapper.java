package com.beanmapping.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.beanmapping.DTO.TravellingDTO;
import com.beanmapping.Enity.Travelling;

@Mapper(componentModel = "spring")
public interface AutoUserMapper {
	AutoUserMapper Mapper = Mappers.getMapper(AutoUserMapper.class);

	// @Mapping(source = "",target = "")
	TravellingDTO get(Travelling travel);
}
