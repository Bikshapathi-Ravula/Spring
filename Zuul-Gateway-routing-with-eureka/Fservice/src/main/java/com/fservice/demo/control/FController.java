package com.fservice.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("Fservice")
public class FController {
	@GetMapping("/api")
	public String requestMethodName() {
		System.out.println("**********************FirstService routed");
		return "Hello this first service";
	}
}
