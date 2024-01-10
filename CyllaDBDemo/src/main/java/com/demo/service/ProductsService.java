package com.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Products;
import com.demo.repo.ProductsRepo;

@Service
public class ProductsService {

	@Autowired
	private ProductsRepo productsRepo;

	public List<Products> getAllProducts() {
		System.out.println("ProductsService.getAllProducts()");
		return productsRepo.findAll();
	}

	public Products insert(Products products1) {
		System.out.println("ProductsService.insert()");

		return productsRepo.save(products1);

	}

	public void insertBulk() {
		System.out.println("ProductsService.insert()");
		for (int i = 1; i <= 5000; ++i) {
			System.out.println(i);
			Products products = new Products();
			products.setId(UUID.randomUUID());
			products.setProdCode("00" + 1);
			products.setProdName(null);
			productsRepo.save(products);
		}

	}

	public Products getProdCode(String prodCode) {
		System.out.println("ProductsService.getProdCode()");

		return productsRepo.findByProdCode(prodCode);

	}
}
