package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Products;
import com.demo.service.ProductsService;

@RestController
public class UsersController {

	@Autowired
	private ProductsService productsService;

	@RequestMapping("/get/all")
	private ResponseEntity<?> get() {
		System.out.println("UsersController.get()");

		List<Products> products = productsService.getAllProducts();

		return ResponseEntity.ok(products);
	}

	@RequestMapping("/insert")
	private ResponseEntity<?> insert(@RequestBody Products products) {
		System.out.println("UsersController.insert()");

		Products prod = productsService.insert(products);
		return ResponseEntity.ok(prod);
	}

	@RequestMapping("/insert/all")
	private void insertAll() {
		System.out.println("UsersController.insert()");

		productsService.insertBulk();

	}

	@RequestMapping("/getby/prodcode")
	private ResponseEntity<?> getById(@RequestParam String prodCode) {
		 System.out.println("UsersController.getById()");

		Products prod = productsService.getProdCode(prodCode);
		System.out.println(prod);
		return ResponseEntity.ok(prod);
	}
}
