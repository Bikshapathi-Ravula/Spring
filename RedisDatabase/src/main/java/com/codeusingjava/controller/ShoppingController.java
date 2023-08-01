package com.codeusingjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeusingjava.model.Shopping;
import com.codeusingjava.repo.ShoppingDao;

@RestController
@RequestMapping("/shoppingItems")
public class ShoppingController {
	
    @Autowired
    private ShoppingDao shoppingdao;

    @PostMapping("redis/url/inject/record")
    public Shopping save(@RequestBody Shopping shopping) {
        return shoppingdao.save(shopping);
    }

    @GetMapping
    public List<Shopping> getAllProducts() {
        return shoppingdao.findAll();
    }

    @GetMapping("/{id}")
    public Shopping findItems(@PathVariable int id) {
        return shoppingdao.findProductById(id);
    }
    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id)   {
    	return shoppingdao.deleteProduct(id);
	}



}
