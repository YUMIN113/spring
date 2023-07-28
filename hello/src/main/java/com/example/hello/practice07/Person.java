package com.example.hello.practice07;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;
	private Language language;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(Language language) {
		this.language = language;
	}

	public Person(String name, Language language) {
		this.name = name;
		this.language = language;
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

	public void setLanguage(Language language) {
		this.language = language;
	}

	public void hello() {
		System.out.println("[" + name + "] " + language.hello());
	}

	// 빈 초기화 콜백 메서드
	@PostConstruct
	public void init() {
		System.out.println(this.getClass().getName() + ".init()::빈 초기화 콜백");
	}

	// 빈 소멸 콜백 메서드
	@PreDestroy
	public void close() {
		System.out.println(this.getClass().getName() + ".close()::빈 소멸 콜백");
	}
}