package com.example.core.practice14;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewRequestController {

	@RequestMapping("/view/request/bizUser")
	public String bizUser(Model model) {
		model.addAttribute("hello", "안녕하세요");
		
		User user = new User("james", "1234", "제임스");
		model.addAttribute("user", user);
		 
		return "practice14/bizUser";
	}
	
	@RequestMapping("/view/request/bizUserEl")
	public String bizUserEl(Model model) {
		model.addAttribute("hello", "안녕하세요");
		
		User user = new User("james", "1234", "제임스");
		model.addAttribute("user", user);
		 
		return "practice14/bizUserEl";
	}
}
