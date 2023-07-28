package com.example.hello.practice03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;

	// 위치 3. 필드
//	@Autowired
	private Language language;

	public Person() {
		System.out.println("Person()");
	}

	public Person(String name) {
		this.name = name;
		System.out.println("Person(String name)");
	}

	// 위치 1. 생성자
	@Autowired
	public Person(Language language) {
		this.language = language;
		System.out.println("Person(Language language)");
	}

	public Person(String name, Language language) {
		this.name = name;
		this.language = language;
		System.out.println("Person(String name, Language language)");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Language getLanguage() {
		return language;
	}

	// 위치 2. setter
//	@Autowired
	public void setLanguage(Language language) {
		this.language = language;
		System.out.println("setLanguage()");
	}

	public void hello() {
		System.out.println(language.hello());
	}

}
