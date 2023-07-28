package com.example.core.practice05;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamBasicController {
	
	// ===== request.getParameter() =====
	
	// Form
	@RequestMapping(value = "/requestParam/basic/nameForm")
	public String nameForm() {
		return "practice05/nameForm";
	}
	
	@RequestMapping(value = "/requestParam/basic/bizName")
	public String bizName(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		System.out.println("bizName() :: name= " + name);	//	화면에서 아무것도 입력하지 않으면, 빈 값이 출력된다.

		return "practice05/nameForm";
	}
		
	// ===== 자동 매핑 =====
	// - 요청 파라미터 이름과 메서드 파라미터 이름이 동일할 경우, 
	//		요청 파라미터의 값이 메서드 파라미터에 설정됨
	
	// Form
	@RequestMapping(value = "/requestParam/basic/addressForm")
	public String addressForm() {
		return "practice05/addressForm";
	}

	@RequestMapping(value = "/requestParam/basic/bizAddress")
	public String bizAddress(
			String address,
			String message) {
		System.out.println("bizId() :: address=" + address);
		System.out.println("bizId() :: message=" + message);
		
		return "practice05/addressForm";
	}	
	

	/*
	===== @RequestParam =====
	- @RequestParam을 사용하여 좀 더 명확하게 요청 파라미터 이름을 처리할 수 있다.
		
	Type 1.	
	@RequestParam String id
	
	Type 2.
	@RequestParam("id") String id
		
	Type 3.
	@RequestParam(name = "id")
		- name 속성 값이 요청 파라미터 이름. <input ... name="id"...> 
		- 메서드의 입력 파라미터 이름을 요청 파라미터와 다르게 할 수 있다.
	 		예) @RequestParam(name = "id") String myId	
	 		요청 파라미터명 : id
	 		메서드 파라미터명 : myId
	*/
	
	// Form
	@RequestMapping(value = "/requestParam/basic/idForm")
	public String idForm() {
		return "practice05/idForm";
	}
	
	@RequestMapping(value = "/requestParam/basic/bizId")
	public String bizId(
			@RequestParam String id, 
			@RequestParam("id") String id2,
			@RequestParam(name = "id") String id3,
			@RequestParam(value = "id") String id4, Model model) {
		System.out.println("bizId() :: id=" + id);	
		System.out.println("bizId() :: id2=" + id2);	
		System.out.println("bizId() :: id3=" + id3);
		System.out.println("bizId() :: id4=" + id4);
		
		return "practice05/idForm";
	}	
		
}