package com.example.dbProject.practice03;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class UpdateMemberServiceImpl implements UpdateMemberService{
	
	private final UpdateMemberMapper updateMemberMapper;
	
	public UpdateMemberServiceImpl(UpdateMemberMapper updateMemberMapper) {
		this.updateMemberMapper = updateMemberMapper;
	}

	@Override
	public void updateMember(HashMap<String, String> map) {
		updateMemberMapper.updateMember(map);
	}

}
