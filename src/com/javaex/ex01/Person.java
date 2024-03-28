package com.javaex.ex01;

public class Person {
	// 필드
	private String name;
	private String hp;
	
	// 생성자
	public Person() {
		System.out.println("생성자 Person(0) 호출");
	}
	
	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
		System.out.println("생성자 Person(2) 호출");
	}
	
	// getters/setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return this.hp;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public void showInfo() {
		System.out.println("#이름:" + name + ", #핸드폰:" + hp);
	}
	
	
}
