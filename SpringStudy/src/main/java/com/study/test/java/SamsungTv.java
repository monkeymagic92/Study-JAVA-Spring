package com.study.test.java;

public class SamsungTv implements Tv {
	
	private Speaker speaker;
	private int price;
	
	public SamsungTv() {
		System.out.println("==> SamsungTv 객체 생성");
	}
	
	public SamsungTv(Speaker speaker) {
		System.out.println("===> SamsungTv(2) 객체 생성");
		this.speaker = speaker;
	}
	
	public SamsungTv(Speaker speaker, int price) {
		System.out.println("===> SamsungTv(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}

	public void powerOn()  {
		System.out.println("SamsungTv를 켠다 (가격 : " + price + ")");
	}
	
	public void powerOff() {
		System.out.println("SamsungTv를 끈다.");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
}
