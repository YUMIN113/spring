package com.example.hello.practice;

public class Person {
	
	private String name;
	private Language language;
	
	public Person(String name, Language language) {
		this.name = name;
		this.language = language;
	}

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}
	
	public Person(Language language) {
		super();
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
}
