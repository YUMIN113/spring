package com.example.hello.practice05;

import org.springframework.stereotype.Component;

@Component
public class Apple implements Fruit {

	@Override
	public void printKind() {
		System.out.println("[Kind] Apple");
		
	}
	
	
}
