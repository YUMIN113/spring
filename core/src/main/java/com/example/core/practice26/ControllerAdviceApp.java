package com.example.core.practice26;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdviceApp {
	
	@ExceptionHandler(Exception.class)
	public String bizNullPointerException(Exception e) {
		System.out.println("bizNullPointerException() :: e.getClass()=" + e.getClass() + " | e.getMessage()=" + e.getMessage());
		return "practice25/exceptionHandler";
	}

}
