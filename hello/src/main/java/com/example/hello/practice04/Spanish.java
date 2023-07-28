package com.example.hello.practice04;

import org.springframework.stereotype.Component;

@Component
public class Spanish implements Language {

	@Override
	public String hello() {
		String message = "Hola";
		return message;
	}

}
