package com.ctel.plans.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import com.ctel.plans.ProductionEntity.ProductionData;
import com.ctel.plans.Repositary.ProductionRepositary;

@Service
public class ProductionService {
	@Autowired

	ProductionRepositary productionRepositary;

	public Optional<ProductionData> fetchProductionData(String plantCode, String lineno, int status) {
		return productionRepositary.findById(plantCode);
	}

}
