package com.ctel.plans.Repositary;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctel.plans.ProductionEntity.CouponInspection;

@MapperScan("com.ctel.plan.Repositary")
 interface CouponRepositary extends JpaRepository<CouponInspection, String> {

}
