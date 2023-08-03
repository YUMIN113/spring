package com.example.dbProject.practice01;

import java.util.List;

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

	@Override
	public MemberDTO selectMember(String id, String password) {
		return selectMemberMapper.selectMember(id, password);
	}

	@Override
	public List<MemberDTO> selectMemberByNameLike(String name) {
		return selectMemberMapper.selectMemberByNameLike(name);
	}

	@Override
	public List<MemberDTO> selectMemberBySex(char sex) {
		return selectMemberMapper.selectMemberBySex(sex);
	}

	@Override
	public List<MemberDTO> selectMemberAll() {
		return selectMemberMapper.selectMemberAll();
	}

}
