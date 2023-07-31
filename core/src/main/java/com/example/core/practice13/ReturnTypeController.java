package com.example.core.practice13;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReturnTypeController {

	@RequestMapping("/returnType/model")
	public String bizStringModel(Model model) {
		model.addAttribute("message", "안녕하세요");
		model.addAttribute("season", "봄 여름 가을 겨울");
		
		return "practice13/bizStringModel";
	}
	
	@RequestMapping("/returnType/modelandview")
	public ModelAndView bisStringModelAndView() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("practice13/bizStringModelAndView");
		mv.addObject("message", "안녕하세요");
		
		return mv;
		
	}
}
