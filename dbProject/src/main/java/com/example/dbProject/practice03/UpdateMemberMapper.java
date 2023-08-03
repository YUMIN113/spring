package com.example.dbProject.practice03;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UpdateMemberMapper {

	public void updateMember(HashMap<String, String> map); 
}
