package com.javaex.ex04;

public class User {
	// 필드
	protected String id;
	protected String password;
	protected String name;
	
	// 기본 생성자
	public User() {
		
	}
	
	// 전체 필드 생성자
	public User(String id, String password,
			String name) {
		this.id = id;
		this.password = password;
		this.name = name;
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
	
	// 메서드
	public void showInfo() {
		System.out.println(
				"#id:" + id + ",#password:" + password + ",#name:" +name);
	}
	
}
