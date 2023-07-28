package com.example.hello.practice;

public class LanguageConfig {

	public Language korean() {
		return new Korean();
	}
	
	public Language english() {
		return new English();
	}
	
	public Language spanish() {
		return new Spanish();
	}
	
	public Person person() {
		return new Person();
	}
	
	public Person personKorean() {
		return new Person(korean());
	}
	
	public Person personEnglish() {
		return new Person(english());
	}
	
	public Person personSpanish() {
		return new Person(spanish());
	}
	
}
