package com.javaex.ex06;

public class MyBase extends Base{

    @Override
    public void service(String state) {
    	if (state.equals("오후")) {
    		afternoon();
    	} else {
    		super.service(state);
    	}
    }
    
    @Override
    public void day() {
    	System.out.println("낮에는 열심히 수업듣자");
    }
    
    public void afternoon() {
    	System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
    
}
