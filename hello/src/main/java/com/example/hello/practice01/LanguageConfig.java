package com.example.hello.practice01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LanguageConfig {

	@Bean
	public Language korean() {
		return new Korean();
	}
	
	@Bean
	public Language english() {
		return new English();
	}
	
	@Bean
	public Language spanish() {
		return new Spanish();
	}
	
	@Bean
	public Person person() {
		return new Person();
	}
	
	@Bean
	public Person personKorean() {
		return new Person(korean());
	}
	
	@Bean
	public Person personEnglish() {
		return new Person(english());
	}
	
	@Bean(name="espana")
	public Person personSpanish() {
		return new Person(spanish());
	}
	
}
