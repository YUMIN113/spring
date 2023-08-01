package com.example.core.practice17;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginAndRegisterController {

	@RequestMapping("/mainHome")
	public String form() {
		return "practice17/index";
	}
	
	@RequestMapping("/registerForm")
	public String registerForm() {
		return "practice17/register";
	}
	
	@RequestMapping("/register")
	public String registerMember(@ModelAttribute Member member) {
		
		System.out.println();
		System.out.println("memberReg() :: id=" + member.getId());
		System.out.println("memberReg() :: password=" + member.getPassword());
		System.out.println("memberReg() :: sex=" + member.getSex());
		System.out.println("memberReg() :: address=" + member.getAddress());
		
		String str = "";
		if(member.getFavorite() == null) {
			System.out.print("memberReg() :: favorite=" + "null");
		} else {
			for(int i = 0; i < member.getFavorite().size(); i++) {
				str += member.getFavorite().get(i) + ",";
			}
			str = str.substring(0, str.length() - 1);
			System.out.print("memberReg() :: favorite=" + str);
		}
	
		return "practice17/registerSuccess";

	}
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "practice17/loginForm";
	}
	
	@RequestMapping("/loginSuccess")
	public String loginMember(@ModelAttribute LoginUser loginUser) {
		return "practice17/loginSuccess";
	}
}
