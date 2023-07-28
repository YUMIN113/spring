package com.example.hello.practice02;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {


	public static void main(String[] args) {

		
		System.out.println("===== Container : Start =====");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("\n===== Biz =====");
		
		System.out.println("\n----- Americano -----");
		Americano ame = context.getBean("americano", Americano.class);
		ame.printMenu();
		ame.printInfo();
		
		System.out.println("\n----- CaffeLatte -----");
		CaffeLatte latte = context.getBean("caffeLatte", CaffeLatte.class);
		latte.printMenu();
		latte.printInfo();
		
		System.out.println("\n----- CaffeMocha -----");
		CaffeMocha mocha = context.getBean("mocha", CaffeMocha.class);
		mocha.printMenu();
		mocha.printInfo();


		
		System.out.println("\n===== Container : End =====");
		context.close();
	}

}
