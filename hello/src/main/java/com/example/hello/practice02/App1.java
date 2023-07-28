package com.example.hello.practice02;

public class App1 {

	public static void main(String[] args) {

		System.out.println("\n----- Americano -----");
		Americano ame = new Americano();
		ame.printMenu();
		ame.printInfo();
		
		System.out.println("\n----- CaffeLatte -----");
		CaffeLatte latte = new CaffeLatte();
		latte.printMenu();
		latte.printInfo();
		
		System.out.println("\n----- CaffeMocha -----");
		CaffeMocha mocha = new CaffeMocha();
		mocha.printMenu();
		mocha.printInfo();
	}

}
