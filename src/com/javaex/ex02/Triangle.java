package com.javaex.ex02;

public class Triangle extends Shape{
	// 필드
	private int width;
	private int height;
	
	public Triangle () {
		System.out.println("생성자 Triangle (0) 호출");		
	}
	
	public Triangle(int width, int height) {
		super("검정", "빨강");
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle (2) 호출");
	}
	
	public Triangle(String fillColor,
			String lineColor,
			int width,
			int height) {
		// 부모 초기화
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle (4) 호출");
	}
}


