package com.example.hello.practice01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	/*
	 # 설정 파일
	- @Configuration이 붙은 클래스를 설정 파일로 사용
	- 설정 파일 내 @Bean이 붙은 메서드의 리턴 객체를 스프링 컨테이너에 등록
	- 이렇게 등록된 객체를 스프링 빈(bean)이라고 한다.
	- @Configuration에 의해 생성되는 스프링 빈은 싱글턴으로 관리된다.	

	# 어노테이션
	- @Configuration
		- @Configuration이 선언된 클래스 파일은 스프링 설정 파일로 사용
	- @Bean
		- @Bean이 선언된 메서드의 리턴값을 빈(bean) 객체로 사용
		- 빈 이름은 @Bean이 붙은 메서드 이름
			@Bean(name = "espana") 으로 사용자가 지정할 수 있다.
	 */

	public static void main(String[] args) {

		System.out.println("\n===== Container : Start =====");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LanguageConfig.class);

		System.out.println("\n===== Biz =====");
		// getBean(빈 이름, 타입) : 빈을 가져온다.

//		practice01
//		Person p1 = context.getBean("person", Person.class);
//		Korean korean = context.getBean("korean", Korean.class);
//		p1.setName("김모씨");
//		p1.setLanguage(korean);
//		p1.hello();
//		
//		Person p2 = context.getBean("personEnglish",Person.class);
//		p2.setName("James");
//		p2.hello();
//		
//		Person p3 = context.getBean("espana", Person.class);
//		p3.setName("Santiago");
//		p3.hello();

		Korean k1 = context.getBean("korean", Korean.class);
		Korean k2 = context.getBean("korean", Korean.class);
		
		System.out.println("k1 = " + k1);
		System.out.println("k2 = " + k2);
		
		System.out.println("\n===== Container : End =====");
		context.close();

	}

}
