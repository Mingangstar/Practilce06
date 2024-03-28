package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User[] users = new User[3];
		// User 클래스와 하위 클래스를 모두 담을 수 있는 배열
		
		User u01 = new Customer("jws",
				"j1234", "정우성" , 1000); // 고객
		User u02 = new Customer("yjs",
				"y2345", "이효리", 2000); // 고객
		User u03 = new Employee("master",
				"m7788","운영자",5_000_000); // 운영자
		
		//	3명의 사용자를 배열에 등록
		// 참조 자료형의 배열은 참조 객체의 주소가 할당
	}

}
