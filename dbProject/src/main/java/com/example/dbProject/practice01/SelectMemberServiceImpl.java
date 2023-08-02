package com.example.dbProject.practice01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectMemberServiceImpl implements SelectMemberService{

	@Autowired
	private SelectMemberMapper selectMemberMapper;
	
	@Override
	public MemberDTO selectMemberById(String id) {
		return selectMemberMapper.selectMemberById(id);
	}

}
