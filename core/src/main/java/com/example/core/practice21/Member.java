package com.example.core.practice21;

import java.util.List;

public class Member {

	private String id;
	private String password;
	private String sex;
	private String address;
	private List<String> favorite;

	public Member(String id, String password, String sex, String address, List<String> favorite) {
		this.id = id;
		this.password = password;
		this.sex = sex;
		this.address = address;
		this.favorite = favorite;
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
	public List<String> getFavorite() {
		return favorite;
	}
	public void setFavorite(List<String> favorite) {
		this.favorite = favorite;
	}
	
}
