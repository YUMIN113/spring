package com.example.hello.practice07;

import org.springframework.stereotype.Component;

@Component
public class English implements Language {

	@Override
	public String hello() {
		String message = "Hello";
		return message;
	}

}
