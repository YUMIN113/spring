package com.example.core.practice02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMappingMethodAnnotationController {

	@RequestMapping("/requestMapping/form")
	public String form() {
		return "practice02/practice02";
	}
	
	@GetMapping("/requestMapping/methodGet")
	public String methodGet() {
		return "practice02/methodGet";
	}
	
	@PostMapping("/requestMapping/methodPost")
	public String methodPost() {
		return "practice02/methodPost";
	}
}
