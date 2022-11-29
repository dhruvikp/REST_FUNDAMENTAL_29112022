package com.simplilearn.config;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Component
@RestControllerAdvice
public class ExceptionConfig {

	@ExceptionHandler(Exception.class)
	public String handleException() {
		return "Exception occurred, please contact administrator.";
	}

	@ExceptionHandler(ArithmeticException.class)
	public String handleArithmaticException() {
		return "Arithmatic Exception occurred, please contact administrator.";
	}
}
