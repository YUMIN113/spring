package com.example.dbProject.practice02;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbProject.practice01.MemberDTO;

@Service
public class InsertMemberServiceImpl implements InsertMemberService{

	@Autowired
	private InsertMemberMapper insertMemberMapper; 
	
	@Override
	public int insertMemberByDTOWithResult(MemberDTO memberDTO) {
		return insertMemberMapper.insertMemberByDTOWithResult(memberDTO);
	}

	@Override
	public void insertMemberByDTO(MemberDTO memberDTO) {
		insertMemberMapper.insertMemberByDTO(memberDTO);
		
	}

	@Override
	public void insertMemberByHashMap(HashMap<String, String> map) {
		
		insertMemberMapper.insertMemberByHashMap(map);
	}


}
