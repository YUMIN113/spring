package com.example.dbProject.practice05;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DynamicIfServiceImpl implements DynamicIfService{
	
	private final DynamicIfMapper dynamicIfMapper;

	public DynamicIfServiceImpl(DynamicIfMapper dynamicIfMapper) {
		this.dynamicIfMapper = dynamicIfMapper;
	}

	@Override
	public List<CustomerDTO> selectCustomerList(HashMap<String, String> map) {
		return dynamicIfMapper.selectCustomerList(map);
	}

}
