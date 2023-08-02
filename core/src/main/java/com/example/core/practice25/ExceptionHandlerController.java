package com.example.core.practice25;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionHandlerController {

	@RequestMapping("/exception/exceptionHandler/biz")
	public String biz() {
		String msg = null;
		if(msg.equals("hello")) {
			
		}
		return "practice25/exceptionHandler";
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String bizNullPointerException(Exception e) {
		System.out.println("bizNullPointerException() :: e.getClass()=" + e.getClass() + " | e.getMessage()=" + e.getMessage());
		return "practice25/exceptionHandler";
	}
}
