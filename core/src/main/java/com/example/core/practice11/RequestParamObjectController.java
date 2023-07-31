package com.example.core.practice11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestParamObjectController {

	@RequestMapping("/cmd/form")
	public String form() {
		return "practice11/cmdObjectForm";
	}
	
	@RequestMapping("/cmd/cmdObject")
	public String bizCmdObject(@ModelAttribute User user) {
		System.out.println("bizCmdObject() :: id=" + user.getId());
		System.out.println("bizCmdObject() :: id=" + user.getPassword());
		System.out.println("bizCmdObject() :: id=" + user.getName());
		System.out.println("bizCmdObject() :: id=" + user.getAge());
		
		return "practice11/cmdObjectForm";
	}
}
