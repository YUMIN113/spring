package com.example.dbProject.practice02;

import java.util.HashMap;

import com.example.dbProject.practice01.MemberDTO;

public interface InsertMemberService {
	
	public int insertMemberByDTOWithResult(MemberDTO memberDTO);

	public void insertMemberByDTO(MemberDTO memberDTO);
	
	public void insertMemberByHashMap(HashMap<String, String> map);

}
