package com.sservice.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Sservice")
public class SControl {
	@GetMapping("v2/api")
	public String requestMethodName() {
		return "{ \"msg\":\" Hello this is seconcd Service\"}";
	}

}
