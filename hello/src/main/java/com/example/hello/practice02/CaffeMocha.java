package com.example.hello.practice02;

import org.springframework.stereotype.Component;

@Component("mocha")
public class CaffeMocha implements Coffee{
	
	public CaffeMocha() {}

	@Override
	public void printMenu() {
		System.out.println("[Menu] CaffeMocha");
		
	}

	@Override
	public void printInfo() {
		System.out.println("[Info] CaffeMocha : 에스프레소, 스팀 밀크, 휘핑 크림, 초콜릿 모카 시럽");
		
	}

}
