package com.example.core.practice07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamConversionController {

	/*
	  ===== 형변환 ===== 
	  - @RequestParam을 사용하면 요청 파라미터의 타입을 변환할 수 있다.
	  
	  - Syntax
	  		
	  		Type 1.
	  		@RequestParam("파라미터 이름") 자료형 변수명
	  		
	  		Type 2.
	  		@RequestParam 자료형 변수명
	  		- 요청 파라미터 이름과 변수명이 같은 경우에는 ("파라미터 이름") 생략 가능
	 */

	
	// ===== 숫자 타입 변환 =====
	
	// Form
	// 코딩


	// numberForm 화면 출력
	@RequestMapping("/requestParam/conversion/numForm")
	public String numForm() {
		return "practice07/numberForm";
	}
	
	// booleanForm 화면 출력
	@RequestMapping("/requestParam/conversion/booleanForm")
	public String booleanForm() {
		return "practice07/booleanForm";
	}
	
	@RequestMapping(value = "/requestParam/conversion/bizNumber")
	public String bizNumber(
			@RequestParam int age, 
			@RequestParam(name = "age") int intAge,
			@RequestParam(name = "age") Integer integerAge,
			@RequestParam(name = "age") float floatAge,
			@RequestParam(name = "age") String stringAge) {
		
		System.out.println("bizNumber() :: age= " + age);
		System.out.println("bizNumber() :: intAge= " + intAge);
		System.out.println("bizNumber() :: integerAge= " + integerAge);
		System.out.println("bizNumber() :: floatAge= " + floatAge);
		System.out.println("bizNumber() :: stringAge= " + stringAge);
		
		return "practice07/numberForm";
	}
	

	// ===== boolean 타입 변환 =====

	// Form
	// 코딩
		

	@RequestMapping(value = "/requestParam/conversion/bizBoolean")
	public String bizBoolean(			
			@RequestParam boolean agree, 
			@RequestParam(name = "agree") boolean booleanAgree,
			@RequestParam(name = "agree") Boolean BooleanAgree,
			@RequestParam(name = "agree") String stringAgree) {		
			
		System.out.println("bizBoolean() :: agree= " + agree);
		System.out.println("bizBoolean() :: booleanAgree= " + booleanAgree);
		System.out.println("bizBoolean() :: BooleanAgree= " + BooleanAgree);
		System.out.println("bizBoolean() :: stringAgree= " + stringAgree);			

		return "practice07/booleanForm";
	}

	
	@RequestMapping(value = "/requestParam/conversion/bizBoolean2")
	public String bizBoolean2(
			@RequestParam(defaultValue="false") boolean agree, 
			@RequestParam(name = "agree", defaultValue="false") boolean booleanAgree,
			@RequestParam(name = "agree", defaultValue="false") Boolean BooleanAgree,
			@RequestParam(name = "agree", defaultValue="false") String stringAgree
			) {		
		
		System.out.println("bizBoolean() :: agree= " + agree);
		System.out.println("bizBoolean() :: booleanAgree= " + booleanAgree);
		System.out.println("bizBoolean() :: BooleanAgree= " + BooleanAgree);
		System.out.println("bizBoolean() :: stringAgree= " + stringAgree);	
		
		return "practice07/booleanForm";
	}
}
