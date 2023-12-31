package com.example.core.practice28;

public class User {

	private String id;
	private int age;

	public User() {
	}

	public User(String id, int age) {
		this.id = id;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + "]";
	}

}
