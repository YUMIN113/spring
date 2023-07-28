package com.example.hello.practice02;

import org.springframework.stereotype.Component;

@Component
public class CaffeLatte implements Coffee{
	
	public CaffeLatte() {}

	@Override
	public void printMenu() {
		System.out.println("[Menu] CaffeLatte");
		
	}

	@Override
	public void printInfo() {
		System.out.println("[Info] CaffeLatte : 에스프레소, 스팀 밀크, 우유 거품");
		
	}

}
