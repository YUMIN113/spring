package com.example.dbProject.practice05;

public class CustomerDTO {

	private String gb;				// 고객 구분. 정식회원 : R, 무료회원 : F
	private String id;					// 아이디
	private String name;			// 이름
	private int age;					// 나이
	private String sex; 				// 성별. F: 여, M : 남
	private String address; 		// 주소. 예) 서울, 부산
	private String regdate; 		// 등록일. 형식 : YYYY.MM.DD. 예) 2000.07.01	

	public CustomerDTO() {
	}

	public CustomerDTO(String gb, String id, String name, int age, String sex, String address, String regdate) {
		this.gb = gb;
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
		this.regdate = regdate;
	}

	public String getGb() {
		return gb;
	}

	public void setGb(String gb) {
		this.gb = gb;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Customer [gb=" + gb + ", id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", address="
				+ address + ", regdate=" + regdate + "]";
	}	
}
