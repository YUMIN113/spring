package com.example.hello.practice02;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

	/*
	- @ComponentScan이 선언된 클래스와 동일 패키지 및 그 하위 패키지에서 
	아래 애노테이션이 붙은 클래스의 객체는 자동으로 스프링 컨테이너에 빈으로 등록된다.
	- 대상 애노테이션 : @Component, @Controller, @Service, @Repository
	- @Configuration에는 @Component가 선언되어 있으므로 빈으로 등록된다.
	*/

	
}