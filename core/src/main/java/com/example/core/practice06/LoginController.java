package com.example.core.practice06;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login/")
@Controller
public class LoginController {

	@GetMapping("form")
	public String form() {
		return "login/form";
	}
	
	@PostMapping("success")
	public String loginSuccess(HttpServletRequest request) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		System.out.println("login() :: id=" + id);
		System.out.println("login() :: password=" + password);
		return "login/success";
	}
}
