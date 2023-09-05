package com.ctel.plans.Repositary;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ctel.plans.ProductionEntity.BottleInspection;

@Mapper
 interface BottleRepositary extends JpaRepository<BottleInspection, String>{

}
