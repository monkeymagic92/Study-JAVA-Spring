package com.study.test.java;

public class LgTv implements Tv {
	
	public LgTv() {
		System.out.println("===> LgTv 생성");
	}
	
	public void powerOn()  {
		System.out.println("LgTv를 켠다");
	}
	
	public void powerOff() {
		System.out.println("LgTv를 끈다.");
	}
	
	public void volumeUp() {
		System.out.println("LgTv 볼륨 업!");
	}
	
	public void volumeDown() {
		System.out.println("LgTv 볼륨 다운!");
	}

}
