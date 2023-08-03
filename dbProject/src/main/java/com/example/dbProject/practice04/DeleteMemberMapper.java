package com.example.dbProject.practice04;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeleteMemberMapper {

	public void deleteMember(String id);
}
