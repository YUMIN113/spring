package com.example.dbProject.practice02;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.example.dbProject.practice01.MemberDTO;

@Service
public class InsertMemberServiceImpl implements InsertMemberService{

	private final InsertMemberMapper insertMemberMapper; 

	public InsertMemberServiceImpl(InsertMemberMapper insertMemberMapper) {
		this.insertMemberMapper = insertMemberMapper;
	}

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
