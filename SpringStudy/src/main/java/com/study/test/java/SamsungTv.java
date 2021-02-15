package com.study.test.java;

public class SamsungTv implements Tv {
	
	private int a = 123;
	private int b = 456;
	
	
	public SamsungTv() {
		System.out.println("==> SamsungTv 객체 생성");
		this.a = 0;
		this.b = 0;
	}

	public SamsungTv(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	
	public void powerOn()  {
		System.out.println("SamsungTv를 켠다");
	}
	
	public void powerOff() {
		System.out.println("SamsungTv를 끈다.");
	}
	
	public void volumeUp() {
		System.out.println("SamsungTv 볼륨 업!");
	}
	
	public void volumeDown() {
		System.out.println("SamsungTv 볼륨 다운!");
	}
}
