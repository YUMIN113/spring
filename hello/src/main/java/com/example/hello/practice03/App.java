package com.example.hello.practice03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
		/*
		 # @Autowired
		 - Person 클래스에서 @Autowired를 이용하여 Language를 주입한다.
		 	- Language 객체 : korean
		 	- @Autowired 위치 : 생성자, setter, 필드
		 	
		 	1. @Autowired를 생성자에 사용
			- 호출 생성자/메서드 : Person(Language language)
			
			2. @Autowired를 setter에 사용
			- 호출 생성자/메서드 : Person(), setLanguage()
			
			3. @Autowired를 field에 사용
			- 호출 생성자/메서드 : Person()
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
