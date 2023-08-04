package com.example.dbProject.practice03;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dbProject.practice01.MemberDTO;
import com.example.dbProject.practice01.SelectMemberService;

@Controller
public class UpdateMemberController {

	private final SelectMemberService selectMemberSerivce;
	private final UpdateMemberService updateMemberService;
	
	public UpdateMemberController(SelectMemberService selectMemberSerivce, UpdateMemberService updateMemberService) {
		this.selectMemberSerivce = selectMemberSerivce;
		this.updateMemberService = updateMemberService;
	}

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
		List<MemberDTO> memberList = selectMemberSerivce.selectMemberAll();
		model.addAttribute("memberList", memberList);
		return "practice01/selectMemberAll";
	}
	
}
