package com.example.dbProject.practice01;

import java.util.List;

public interface SelectMemberService {

	public MemberDTO selectMemberById(String id);
	
	public MemberDTO selectMember(String id, String password);
	
	public List<MemberDTO> selectMemberByNameLike(String name);
	
	public List<MemberDTO> selectMemberBySex(char sex);
	
	public List<MemberDTO> selectMemberAll();
	}
