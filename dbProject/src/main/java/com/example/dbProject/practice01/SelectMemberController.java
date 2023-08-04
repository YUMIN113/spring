package com.example.dbProject.practice01;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SelectMemberController {
	
	private final SelectMemberService selectMemberService;
	
	public SelectMemberController(SelectMemberService selectMemberService) {
		this.selectMemberService = selectMemberService;
	}

	@RequestMapping("/select/selectMemberByIdForm")
	public String selectMemberByIdForm() {
		return "practice01/loginForm";
	}
	
	@RequestMapping("/select/selectMemberById")
	public String selectMemberById(
			@RequestParam String id,
			Model model) {
		MemberDTO memberDTO = selectMemberService.selectMemberById(id);
		
		model.addAttribute("member", memberDTO);
		return "practice01/selectMemberById";
	}
	
	@RequestMapping("/select/selectMemberByIdAndPasswordForm")
	public String selectMemberByIdAndPasswordForm() {
		return "practice01/loginPasswordForm";
	}
	
	@RequestMapping("/select/selectMemberByIdAndPassword")
	public String selectMemberByIdAndPassword(@RequestParam String id, @RequestParam String password, Model model) {
		MemberDTO memberDTO = selectMemberService.selectMember(id, password);
		model.addAttribute("member", memberDTO);
		return "practice01/selectMemberByIdAndPassword";
	}
	
	@RequestMapping("/select/selectMemberLikeForm")
	public String selectMemberLikeForm() {
		return "practice01/likeMemberForm";
	}
	
	@RequestMapping("/select/selectMemberByNameLike")
	public String selectMemberByNameLike(@RequestParam String name, Model model) {
		List<MemberDTO> memberDTOList = selectMemberService.selectMemberByNameLike(name);
		model.addAttribute("memberList", memberDTOList);
		return "practice01/selectMemberByNameLike";
	}
	
	@RequestMapping("/select/selectMemberByGenderForm")
	public String selectMemberByGenderForm() {
		return "practice01/selectByGenderForm";
	}
	
	@RequestMapping("/select/selectMemberBySex")
	public String selectMemberBySex(@RequestParam char sex, Model model) {
		List<MemberDTO> memberDTOList = selectMemberService.selectMemberBySex(sex);
		model.addAttribute("memberList", memberDTOList);
		return "practice01/selectMemberBySex";
	}
	
	@RequestMapping("/select/selectMemberAllForm")
	public String selectMemberAllForm() {
		return "practice01/selectMemberAllForm";
	}
	
	@RequestMapping("/select/selectMemberAll")
	public String selectMemberAll(Model model) {
		List<MemberDTO> memberDTOList = selectMemberService.selectMemberAll();
		model.addAttribute("memberList", memberDTOList);
		return "practice01/selectMemberAll";
	}
	
}
