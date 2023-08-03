package com.example.dbProject.practice02;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.example.dbProject.practice01.MemberDTO;

@Mapper
public interface InsertMemberMapper {
	
	public int insertMemberByDTOWithResult(MemberDTO memberDTO);

	public void insertMemberByDTO(MemberDTO memberDTO);
	
	public void insertMemberByHashMap(HashMap<String, String> map);
}
