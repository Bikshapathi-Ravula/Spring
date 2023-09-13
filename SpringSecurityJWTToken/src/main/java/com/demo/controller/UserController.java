package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.UserRequest;
import com.demo.bean.UserResponse;
import com.demo.config.JWTUtil;
import com.demo.dto.Users;
import com.demo.service.UsersService;

@RestController
@RequestMapping("/user/")
public class UserController {

	@Autowired
	private UsersService usersService;

	@Autowired
	private JWTUtil jwtUtil;

	@Autowired
	private AuthenticationManager authenticationManager;

	@RequestMapping("save")
	public ResponseEntity<?> saveUser(@RequestBody Users usersData) {
		System.out.println("UserController.saveUser()");
		Users users = usersService.saveUser(usersData);
		return ResponseEntity.ok(users);
	}

	@RequestMapping("login")
	public ResponseEntity<?> loginUser(@RequestBody UserRequest request) {

		System.out.println("UserController.loginUser()");

		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword()));

		String token = jwtUtil.generateToken(request.getUserName());

		System.out.println("Token :" + token);

		return ResponseEntity.ok(new UserResponse(token, "Token generated Successfully"));
	}

	@RequestMapping("access")
	public ResponseEntity<?> accessData() {
		System.out.println("UserController.accessData()");
		return ResponseEntity.ok("Successfully Fetched Details");
	}
}
