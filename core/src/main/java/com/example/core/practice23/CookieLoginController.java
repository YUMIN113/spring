package com.example.core.practice23;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CookieLoginController {

	@RequestMapping("/cookie/login/loginForm")
	public String form(@CookieValue(value = "loginId", required = false) Cookie cookie, Model model) {
		if(cookie !=null) {
			model.addAttribute("loginId", cookie.getValue());
		} else {
			model.addAttribute("loginId", "");
		}
		return "practice23/loginForm";
	}
	
	@RequestMapping("/cookie/login/loginSuccess")
	public String login(
			@RequestParam String id,
			@RequestParam String password,
			@RequestParam(defaultValue="false") String agree,
			HttpServletResponse response,
			Model model
			) {
		
		model.addAttribute("id", id);
		model.addAttribute("password", password);
		
		if(agree.equals("true")) {
			Cookie cookie = new Cookie("loginId", id);
			
			cookie.setMaxAge(60);
			cookie.setPath("/");
			response.addCookie(cookie);
		}
		
		return "practice23/loginSuccess";
	}
}
