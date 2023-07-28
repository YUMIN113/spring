package com.example.hello.practice04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;
	
	// 위치 3. 필드
//	@Autowired	
//	@Qualifier("korean")
	private Language language;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	// 위치 1. 생성자
	@Autowired	
//	public Person(@Qualifier("korean") Language language) {
//	public Person(@Qualifier("english") Language language) {
	public Person(@Qualifier("spanish") Language language) {
		//	public Person(Language language) {	
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
	
	// 위치 2. setter
//	@Autowired	
//	@Qualifier("korean")
	public void setLanguage(Language language) {
		this.language = language;
	}

	public void hello() {
		System.out.println(language.hello());
	}

}
