package com.route.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.route.dto.Users;
import com.route.service.UsersService;

@RestController
public class UsersController {

	@Autowired
	private UsersService usersService;

	@RequestMapping("/save")
	public Users saveService(@RequestBody Users users) {
		System.out.println("UsersController.saveService()");
		return usersService.save(users);
	}

	@RequestMapping("/get")
	public Optional<Users> getById(@RequestBody Users users) {
		System.out.println("UsersController.getById()");
		return usersService.getById(users);
	}

}
