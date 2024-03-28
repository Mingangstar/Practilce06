package com.javaex.ex04;

public class Customer extends User { // 상속 (확장)
	// 필드
	private int point;
	
	// 생성자
	// 기본 생성자
	public Customer() {
		
	}
	// id, [assword, name, point 설정
	public Customer(String id,
			String password,
			String name,
			int point) {
		// 부모 먼저 초기화
		super(id, password, name);
		this.point = point;
	}
	
	// getters/setters
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public void showInfo() {
		System.out.println(
				"#이름:" + name +
				"#비밀번호:" + password +
				"#이름:" + name +
				", #포인트:" + point);
	}
}
