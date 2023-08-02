package com.example.core.practice27;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AopController {

	@RequestMapping("/aop/bizAop")
	public String bizAop() {
		/*
		  # 실행 
		  Type 1.
		   - 아래 Exception 을 주석 처리한 후 실행 
		   - 목적 : 정상 동작 시 실행되는 Aop 메서드 확인
		  
		  Type 2.
		   - 아래 Exception 을 주석 해제한 후 실행 
		   - 목적 : Exception 발생시 실행되는 Aop 메서드 확인
		  
		 */

		System.out.println("bizAop() :: START");

		// ===== Exception : Start =====
		// - AspectApp.afterThrowingAdvice() 테스트용 강제 Exception
		int[] array = { 1, 2, 3 };
		int i = array[5];
		// ===== Exception : End =====

		System.out.println("bizAop() :: END");
		return "practice27/bizAop";
	}

}
