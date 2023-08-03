package com.example.dbProject.practice04;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dbProject.practice01.MemberDTO;
import com.example.dbProject.practice01.SelectMemberService;

@Controller
public class DeleteMemberController {

	private final DeleteMemberService deleteMemberService;
	private final SelectMemberService selectMemberService;
	
	public DeleteMemberController(DeleteMemberService deleteMemberService, SelectMemberService selectMemberService) {
		this.deleteMemberService = deleteMemberService;
		this.selectMemberService = selectMemberService;
	}
	
	@RequestMapping("/delete/deleteMember")
	public String deleteMember(@RequestParam String id, Model model) {
		deleteMemberService.deleteMember(id);
		List<MemberDTO> memberList = selectMemberService.selectMemberAll();
		model.addAttribute("memberList", memberList);
		return "practice01/selectMemberAll";
	}
}
