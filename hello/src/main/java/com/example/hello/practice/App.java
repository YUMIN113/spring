package com.example.hello.practice;

public class App {

	public static void main(String[] args) {

//		생성자 주입
//		Language korean = new Korean();
//		Person p1 = new Person("김모씨", korean);
//		p1.hello();
//		
//		Language english = new English();
//		Person p2 = new Person("James", english);
//		p2.hello();

//		setter 주입
//		Person p1 = new Person();
//		p1.setName("김모씨");
//		p1.setLanguage(new Korean());
//		p1.hello();
//		
//		Person p2 = new Person();
//		p2.setName("James");
//		p2.setLanguage(new English());
//		p2.hello();
		
		LanguageConfig languageConfig = new LanguageConfig();
		
		Person p1 = languageConfig.person();
		p1.setName("김모씨");
		p1.setLanguage(languageConfig.korean());
		p1.hello();
		
		Person p2 = languageConfig.person();
		p2.setName("James");
		p2.setLanguage(languageConfig.english());
		p2.hello();
		
		Person p3 = languageConfig.person();
		p3.setName("Santiago");
		p3.setLanguage(languageConfig.spanish());
		p3.hello();

		Person p4 = languageConfig.personKorean();
		p4.setName("이모씨");
		p4.hello();
		
		Person p5 = languageConfig.personEnglish();
		p5.setName("Victoria");
		p5.hello();
		
		
		Person p6 = languageConfig.personSpanish();
		p6.setName("Alba");
		p6.hello();
	
	}

}
