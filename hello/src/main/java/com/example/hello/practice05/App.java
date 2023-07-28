package com.example.hello.practice05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
		/*
		 # @Qualifier
		  - 주입 대상을 지정한다.
		   - @Qualifier 위치와 값을 변경하면서 실행 
		 */
	public static void main(String[] args) {
		

		System.out.println("===== Container : Start =====");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("\n===== Biz =====");
		Apple apple = context.getBean("apple", Apple.class);
		apple.printKind();
		
		Banana banana = context.getBean("ba", Banana.class);
		banana.printKind();
		
		System.out.println("\n===== Container : End =====");
		context.close();
	}
}
