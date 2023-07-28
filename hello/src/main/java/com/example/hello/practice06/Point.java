package com.example.hello.practice06;

import org.springframework.stereotype.Component;

@Component
public class Point {

	private int balance;
	private int count;

	public Point() {
		count = count + 1;
		System.out.println("Bank()");
	}

	public Point(int balance) {
		count = count + 1;
		this.balance = balance;
		System.out.println("Bank(int balance)");
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public int getRandom() {
		double random100 = Math.random() * 100;
		return (int) random100;
	}

}
