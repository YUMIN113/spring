package com.example.core.practice01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/springMvc/hello")
	public String hello() {
		return "hello/hello";
	}
}
