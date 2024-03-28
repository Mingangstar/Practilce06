package com.javaex.ex06;

public class BaseApp {
	// 수정 x
    public static void main(String[] args) {

        Base base = new MyBase();
        base.service("낮");
        base.service("밤");
        base.service("오후");
    }

}
