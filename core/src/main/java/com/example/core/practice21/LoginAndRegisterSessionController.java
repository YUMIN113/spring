package com.example.core.practice21;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginAndRegisterSessionController {

	@RequestMapping("/session/index")
	public String form() {
		return "practice21/index";
	}
	
	@RequestMapping("/session/registerForm")
	public String registerForm() {
		return "practice21/register";
	}
	
	@RequestMapping("/session/register")
	public String registerMember(@ModelAttribute Member member, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		session.setAttribute("member", member);
		
		return "practice21/registerSuccess";

	}
	
	@RequestMapping("/session/loginForm")
	public String loginForm() {
		return "practice21/loginForm";
	}
	
	@RequestMapping("/session/loginSuccess")
	public String loginMember(@ModelAttribute LoginUser loginUser, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		session.setAttribute("loginUser", loginUser);
		
		return "practice21/loginSuccess";
	}
}
