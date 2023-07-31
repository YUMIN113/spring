package com.example.core.practice08;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamOptionController {

	/*
	===== option =====
	# required
	- 해당 파라미터 필수여부. 값 : true(기본), false
	- true
		> 요청 파라미터가 있을 경우 : 정상
		> 요청 파라미터가 없을 경우 : Exception 발생.
	- false 	
		> 요청 파라미터가 있을 경우 : 정상
		> 요청 파라미터가 없을 경우 : null
	
	# defaultValue
	- 디폴트 값 설정.
		> 요청 파라미터는 있으나 값이 없을 경우, 메서드 변수는 디폴트 값을 갖는다.
	 */
	
	// Form
	// 코딩	

	@RequestMapping("/requestParam/option/form")
	public String form() {
		return "practice08/optionForm";
	}
	
	@RequestMapping(value = "/requestParam/option/bizIdAge")
	public String bizIdAge(
			@RequestParam(required = true) String id,
			@RequestParam(required = false, defaultValue = "10") int age,
			@RequestParam(required = false) String name){
		
		System.out.println("bizIdAge() :: id= " + id);
		System.out.println("bizIdAge() :: age = " + age);
		System.out.println("bizIdAge() :: name = " + name);

		return "idAgeForm";
	}
	
}
