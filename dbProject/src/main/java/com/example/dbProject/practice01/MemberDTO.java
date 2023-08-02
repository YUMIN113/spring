package com.example.dbProject.practice01;

public class MemberDTO {

	private String id;
	private String password;
	private String name;
	private int age;
	private char sex;
	private String sexName;

	public MemberDTO() {

	}

	public MemberDTO(String id, String password, String name, int age, char sex) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public MemberDTO(String id, String password, String name, int age, char sex, String sexName) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.sexName = sexName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getSexName() {
		return sexName;
	}

	public void setSexName(String sexName) {
		this.sexName = sexName;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", sex=" + sex
				+ ", sexName=" + sexName + "]";
	}

}
