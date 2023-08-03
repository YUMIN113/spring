package com.example.dbProject.practice03;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateMemberServiceImpl implements UpdateMemberService{
	
	@Autowired
	private UpdateMemberMapper updateMemberMapper;
	
	@Override
	public void updateMember(HashMap<String, String> map) {
		updateMemberMapper.updateMember(map);
	}

}
