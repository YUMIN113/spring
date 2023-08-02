package com.example.core.practice28;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReturnTypeResponseBodyController {

	/*
	 ===== @ResponseBody ===== 
	 - 뷰 대신 데이터를 전달한다. 
	 - REST API 개발에 주로 사용
	 
	 # 데이터
	  - String : 문자열로 전달
	   - Object : JSON 형식으로 전달
	 */

	@ResponseBody
	@RequestMapping(value = "/returnType/responseBody/bizString")
	public String bizRbString() {		
		
		String message = "Hello World !!!";
		
		return message;
	}

	@ResponseBody
	@RequestMapping(value = "/returnType/responseBody/bizObject")
	public User bizRbObject() {		
		
		User user = new User("james", 35);
		
		return user;
	}
	
	@ResponseBody
	@RequestMapping(value = "/returnType/responseBody/bizObjectList")
	public List<User> bizRbObjectList() {		
		
		List<User> userList = new ArrayList<>();
		userList.add(new User("james35", 35));
		userList.add(new User("james25", 25));
		userList.add(new User("james15", 15));
		
		return userList;
	}
}
