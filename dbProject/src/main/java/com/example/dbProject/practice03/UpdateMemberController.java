package com.example.dbProject.practice03;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dbProject.practice01.MemberDTO;
import com.example.dbProject.practice01.SelectMemberService;

@Controller
public class UpdateMemberController {

	@Autowired
	private SelectMemberService selectMemberSerivce;
	
	@Autowired
	private UpdateMemberService updateMemberService;

	@RequestMapping("/update/updateMemberByIdForm")
	public String updateMemberByIdForm() {
		return "practice03/selectMemberByIdForm";
	}
	
	@RequestMapping("/update/updateMemberById")
	public String updateMemberById(@RequestParam String id, Model model) {
		MemberDTO memberDTO = selectMemberSerivce.selectMemberById(id);
		model.addAttribute("member", memberDTO);
	
		return "practice03/updateMemberByIdForm";
	}
	
	@RequestMapping("/update/updateMember")
	public String updateMember(@RequestParam HashMap<String, String> paramMap, Model model) {
		updateMemberService.updateMember(paramMap);
		MemberDTO member = selectMemberSerivce.selectMemberById(paramMap.get("id"));
		model.addAttribute("member", member);
		return "practice03/updateMemberByIdForm";
	}
	
}
