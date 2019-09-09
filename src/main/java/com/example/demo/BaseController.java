package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BaseController {
	
	@GetMapping("/hello/hs")
	public String jobExecutions() {
		return "Hellow world";
	}

}
