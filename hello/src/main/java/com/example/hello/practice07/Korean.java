package com.example.hello.practice07;

import org.springframework.stereotype.Component;

@Component
public class Korean implements Language {

	@Override
	public String hello() {
		String message = "안녕하세요";
		return message;
	}

}