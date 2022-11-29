package com.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

	@GetMapping("/calculate1")
	public int calculate() {
		int a = 5;
		int b = 0;
		int result = a / b;

		return result;
	}
}
