package com.ctel.plans.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ctel.plans.ProductionEntity.NoData;
import com.ctel.plans.ProductionEntity.ProductionData;
import com.ctel.plans.ProductionEntity.ProductionListen;
import com.ctel.plans.Services.ProductionService;

@RestController
@RequestMapping("primary/v1/production/plain/details/")
public class ProductionController {
//	@Autowired
//	RestTemplate rest;
//	@Autowired
	ProductionService productionService;

	@GetMapping("/Data")
	public ResponseEntity<?> getProductionPlan(@RequestBody ProductionListen Pdata) {

		int status = 25;
		Optional<ProductionData> t = productionService.fetchProductionData(Pdata.getLocCode(),
				Pdata.getLineNo(), status);
		if (t.isPresent())
			return ResponseEntity.ok().body(t.get());
		else {
			NoData data = new NoData();
			data.setLocCode(Pdata.getLocCode());
			data.setLineNo(Pdata.getLineNo());
			return ResponseEntity.ok().body(data);
		}
	}
}
