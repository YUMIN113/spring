package com.example.dbProject.practice05;

import java.util.HashMap;
import java.util.List;

public interface DynamicIfService {
	
	public List<CustomerDTO> selectCustomerList(HashMap<String, String> map);
	
}
