package com.example.hello.practice02;

import org.springframework.stereotype.Component;

@Component
public class Americano implements Coffee{
	
	public Americano() {}

	@Override
	public void printMenu() {
		System.out.println("[Menu] Americano");
		
	}

	@Override
	public void printInfo() {
		System.out.println("[Info] Americano : 에스프레소, 뜨거운 물");
		
	}

}
