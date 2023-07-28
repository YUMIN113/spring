package com.example.hello.practice05;

import org.springframework.stereotype.Component;

@Component("ba")
public class Banana implements Fruit {

	@Override
	public void printKind() {
		System.out.println("[Kind] Banana");
		
	}
	
	
}
