package com.example.core.practice22;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {

	@RequestMapping("/cookie/createCookie")
	public String createCookie(HttpServletResponse response) {
		Cookie cookie = new Cookie("loginId", "james");
		
		cookie.setMaxAge(60);
		cookie.setPath("/");
		response.addCookie(cookie);
		
		return "redirect:/cookie/getCookie";
	}
	
	@RequestMapping("/cookie/getCookie")
	public String getCookie(@CookieValue(value = "loginId", required = false) Cookie cookie, Model model) {
		if(cookie !=null) {
			model.addAttribute("loginId", cookie.getValue());
		}
		return "practice22/cookieForm";
	}
}
