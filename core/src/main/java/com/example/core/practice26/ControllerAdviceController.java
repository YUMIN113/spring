package com.example.core.practice26;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerAdviceController {

	@RequestMapping("/exception/exceptionHandler/bizControllerAdvice")
	public String biz() {
		String msg = null;
		if(msg.equals("hello")) {
			
		}
		return "practice25/exceptionHandler";
	}
	
}
