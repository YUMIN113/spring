package com.example.core.practice12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String form() {
		return "practice12/index";
	}
	
	@RequestMapping("/register/registerForm")
	public String registerForm() {
		return "practice12/register";
	}
	
	@RequestMapping("/register/register")
	public String registerMember(@ModelAttribute Member member) {
		
		System.out.println();
		System.out.println("memberReg() :: id=" + member.getId());
		System.out.println("memberReg() :: password=" + member.getPassword());
		System.out.println("memberReg() :: sex=" + member.getSex());
		System.out.println("memberReg() :: address=" + member.getAddress());
		
		String str = "";
		for(int i = 0; i < member.getFavorite().size(); i++) {
			str += member.getFavorite().get(i) + ",";
		}
		str = str.substring(0, str.length() - 1);
		System.out.print("memberReg() :: favorite=" + str);
		
		return "practice12/registerSuccess";

	}
	
	@RequestMapping("/login/loginForm")
	public String loginForm() {
		return "practice12/loginForm";
	}
	
	@RequestMapping("/login/loginSuccess")
	public String loginMember(
			@RequestParam String id,
			@RequestParam String password
			) {
		
		System.out.println();
		System.out.println("login() :: id =" + id);
		System.out.println("login() :: password=" + password);
		
		return "practice12/loginSuccess";
	}
}
