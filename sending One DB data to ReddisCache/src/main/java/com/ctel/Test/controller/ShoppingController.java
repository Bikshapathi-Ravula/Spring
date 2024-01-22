package com.ctel.Test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctel.Test.model.Shopping;
import com.ctel.Test.service.MysqlService;
import com.ctel.Test.service.ReddicacheDao;

@RestController
@RequestMapping("/shoppingItems")
public class ShoppingController {

	@Autowired
	private ReddicacheDao shoppingdao;

	@Autowired
	MysqlService service;

	@PostMapping("insertMysql")
	public Shopping save(@RequestBody Shopping shopping) {
		return service.saveRecord(shopping);
	}

	@GetMapping("/getAll")
	public Map<Integer, Shopping> getAllProducts() {
		Map<Integer, Shopping> order = new TreeMap<>();
		order.putAll(shoppingdao.findAll());
		return order;
	}

	@GetMapping("/get")
	public Shopping findItems(@RequestParam int id) {
		System.out.println(id);
		return shoppingdao.findProductById((id));
	}

	@DeleteMapping("/remove")
	public Map<Integer, Shopping> remove(@RequestParam int id) {
		return shoppingdao.deleteProduct(id);
	}

	@GetMapping("fetchDataOfMysql/storeInReddisCahe")
	public Map<Integer, Shopping> fetchByIdMysql() {
//		      Map<Integer, Shopping> result1 = service.getFromMysql().stream().collect(
//                Collectors.toMap(Shopping::getId, Shopping::S));
//		return shoppingdao.saveAll(result1);
		Map<Integer, Shopping> map = new HashMap<Integer, Shopping>();
		service.getFromMysql().forEach(shopping -> {
			map.put(shopping.getId(), shopping);
		});
		shoppingdao.saveAll(map);
		return getAllProducts();

	}

	@PutMapping("/update")
	Shopping updateDate(@RequestBody Shopping data) {
		return shoppingdao.updateProduct(data);
	}
}
