package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
	@Override
    public void execute(String str){
        
    	
        // str -> 은악 : MusicPhine에서 처리
    	// 		기본 처리 : Phone
    	// 			앱 : 본 클래스에서 앱실행 코드 처리
        if (str.equals("앱")) {
        	runApp();
        } else {
        	// 나머지는 부모 메서드에 위임
        	super.execute(str);
        }
    }
 
    //메소드작성
	@Override
	public void playMusic() {
		System.out.println("다운로드해서 재생");
	}
    //메소드작성
    public void runApp() {
    	System.out.println("앱실행");
    }
    
    
}
