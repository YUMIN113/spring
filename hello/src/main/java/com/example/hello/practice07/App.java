package com.example.hello.practice07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		/**
		# 생명주기(Life Cycle)
		- 스프링 빈은 생명주기(Life Cycle)를 갖는다.
		- 생명주기 순서
			1. 스프링 컨테이너 생성
			2. 빈 생성
			3. 의존관계 주입
			4. 초기화 콜백 : 빈이 생성되고 빈의 의존관계 주입이 완료된 후 호출된다.
			5. 사용
			6. 소멸 전 콜백 : 빈이 소멸되기 직전에 호출된다.
			7. 스프링 종료 
			
		# 콜백 사용 : 애노테이션(@PostConstruct, @PreDestroy)
		 */
		
		System.out.println("===== Container : Start =====");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		
		System.out.println("\n===== Biz =====");
		Language l1 = context.getBean("korean", Korean.class);
		Person p1 = context.getBean("person", Person.class);
		p1.setName("김모씨");
		p1.setLanguage(l1);
		p1.hello();

		
		System.out.println("\n===== Container : End =====");
		context.close();
	}

}
