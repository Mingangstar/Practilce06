package com.javaex.ex01;

public class Customer extends Person{
	// 필드
	private int cNo;
	private int point;
	
	// 생성자
	public Customer() {
		System.out.println("Customer 생성자 (0) 호출");
	}
	public Customer(String name, String hp,
			int cNo, int point) {
		// 부모 생성자 호출
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
		System.out.println("Customer 생성자 (4) 호출");
	}
	
	// getters/setters
	public int getCNo() {
		return cNo;
	}
	
	public void setCNo(int cNo) {
		this.cNo = cNo;
	}
	
	public void showInfo() {
		System.out.println("#이름:" + super.getName() +
				", 핸드폰:" + super.getHp() + ",#고객번호:" + this.cNo + 
				", #포인트 점수:" + this.point);
	}
	
}
