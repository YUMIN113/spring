package com.example.core.practice03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestMappingMethodOptionController {
	
	
	// 입력 폼 화면
	@RequestMapping(value = "/requestMapping/method/option/form")
	public String form() {
		return "cp21_requestMapping/ep02_method/ep01_option/form";
	}
		
	// <form method="get">
	@RequestMapping(value = "/requestMapping/method/option/methodGet", method = RequestMethod.GET)
	public String methodGet() {
		return "cp21_requestMapping/ep02_method/ep01_option/methodGet";
	}

	// <form method="post">
	@RequestMapping(value = "/requestMapping/method/option/methodPost", method = RequestMethod.POST)
	public String methodPost() {
		return "cp21_requestMapping/ep02_method/ep01_option/methodPost";
	}

	// <form method="get">, <form method="post">
	//	- method 옵션을 사용하지 않음
	@RequestMapping(value = "/requestMapping/method/option/methodAll")
	public String methodAll() {
		return "cp21_requestMapping/ep02_method/ep01_option/methodAll";
	}

}
