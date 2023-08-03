package com.example.dbProject.practice04;

import org.springframework.stereotype.Service;

@Service
public class DeleteMemberServiceImpl implements DeleteMemberService{

	private final DeleteMemberMapper deleteMemberMapper;
	
	
	public DeleteMemberServiceImpl(DeleteMemberMapper deleteMemberMapper) {
		this.deleteMemberMapper = deleteMemberMapper;
	}


	@Override
	public void deleteMember(String id) {
		deleteMemberMapper.deleteMember(id);
	}

}
