package com.study.test.java;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker 객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("AppleSpeaker 소리 올린다.");
	}
	
	public void volumeDown() {
		System.out.println("AppleSpeaker 소리내린다.");
	}
}