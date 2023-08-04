package com.example.dbProject.practice05;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DynamicIfController {
	
	private final DynamicIfService dynamicIfService;
	
	public DynamicIfController(DynamicIfService dynamicIfService) {
		this.dynamicIfService = dynamicIfService;
	}

	@RequestMapping("/dynamic/if/dynamicIfForm")
	public String ifForm() {
		return "practice05/if";
	}
	
	@RequestMapping("/dynamic/if/selectCustomerList")
	public String selectCustomerList(@RequestParam HashMap<String, String> paramMap, Model model) {
		List<CustomerDTO> customerDTOList = dynamicIfService.selectCustomerList(paramMap);
		model.addAttribute("customerDTOList", customerDTOList);
		System.out.println(customerDTOList.size());
		return "practice05/if";
	}
}
