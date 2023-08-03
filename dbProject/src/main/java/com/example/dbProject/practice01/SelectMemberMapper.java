package com.example.dbProject.practice01;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SelectMemberMapper {

	public MemberDTO selectMemberById(@Param("id") String id);
	
	public MemberDTO selectMember(@Param("id") String id, @Param("password") String password);
	
	public List<MemberDTO> selectMemberByNameLike(@Param("name")String name);
	
	public List<MemberDTO> selectMemberBySex(@Param("sex")char sex);
	
	public List<MemberDTO> selectMemberAll();
}
