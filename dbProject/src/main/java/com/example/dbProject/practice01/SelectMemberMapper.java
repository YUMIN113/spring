package com.example.dbProject.practice01;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SelectMemberMapper {

	public MemberDTO selectMemberById(@Param("id") String id);
}
