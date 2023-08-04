package com.example.dbProject.practice02;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dbProject.practice01.MemberDTO;
import com.example.dbProject.practice01.SelectMemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class InsertMemberController {
	
	private final InsertMemberService insertMemberService;
	private final SelectMemberService selectMemberService;
	
	public InsertMemberController(InsertMemberService insertMemberService, SelectMemberService selectMemberService) {
		this.insertMemberService = insertMemberService;
		this.selectMemberService = selectMemberService;
	}

	@RequestMapping("/insert/insertMemberForm")
	public String insertMemberForm() {
		return "practice02/insertMemberForm";
	}
	
	@RequestMapping("/insert/insertMemberByDTO")
	public String insertMember(
			@ModelAttribute MemberDTO memberDTO,
			@RequestParam String id,
			Model model) {
		insertMemberService.insertMemberByDTO(memberDTO);                                                    
		return "practice02/insertMemberForm";
	}
	
	@RequestMapping("/insert/insertMemberWithResultForm")
	public String insertMemberWithResultForm() {
		return "practice02/insertMemberWithResultForm";
	}
	
	@RequestMapping("/insert/insertMemberByDTOWithResult")
	public String insertMemberByDTOWithResult(
			@ModelAttribute MemberDTO memberDTO,
			Model model) {
		int resultCnt = insertMemberService.insertMemberByDTOWithResult(memberDTO);    
		MemberDTO member = selectMemberService.selectMemberById(memberDTO.getId());
		model.addAttribute("member", member);
		model.addAttribute("resultCnt", resultCnt);
		
		return "practice02/insertMemberByDTOWithResultSuccess";
	}
	
	@RequestMapping("/insert/insertMemberByHashMapForm")
	public String insertMemberByHashMapForm() {
		return "practice02/insertMemberByHashMapForm";
	}
	
	@RequestMapping("/insert/insertMemberByHashMap")
	public String insertMemberByHashMap(@RequestParam HashMap<String, String> paramMap) {
		insertMemberService.insertMemberByHashMap(paramMap);                                                    
		return "practice02/insertMemberByHashMapForm";
	}
}
