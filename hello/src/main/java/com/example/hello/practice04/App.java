package com.example.hello.practice04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
		/*
		 # @Qualifier
		  - 주입 대상을 지정한다.
		   - @Qualifier 위치와 값을 변경하면서 실행 
		 */
	public static void main(String[] args) {
		

		System.out.println("===== Container : Start =====");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LanguageConfig.class);

		System.out.println("\n===== Biz =====");
		Person p1 = context.getBean("person", Person.class);
		p1.hello();

		System.out.println("\n===== Container : End =====");
		context.close();
	}
}
