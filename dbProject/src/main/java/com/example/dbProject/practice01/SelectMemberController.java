package com.example.dbProject.practice01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SelectMemberController {
	
	@Autowired
	private SelectMemberService selectMemberService;

	@RequestMapping("/select/selectMemberByIdForm")
	public String selectMemberByIdForm() {
		return "practice01/idForm";
	}
	
	@RequestMapping("/select/selectMemberById")
	public String selectMemberById(
			@RequestParam String id,
			Model model) {
		MemberDTO memberDTO = selectMemberService.selectMemberById(id);
		
		model.addAttribute("member", memberDTO);
		return "practice01/selectMemberById";
	}
	
}
