package com.study.test.java;

import java.util.Random;

class UserVO {
	private int age;
	private String nm;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	@Override
	public String toString() {
		return this.age + "\n" + this.nm;
	}

}

public class Test {

	public static void main(String[] args) {
		
		/*
		Random ran = new Random();
		int ranBox[] = new int[30];
		
		
		for(int i=0; i<ranBox.length; i++) {
			
			int random = ran.nextInt(31);
			ranBox[i] = random;
			
			for(int j=0; j<i; j++) {
				
				if (ranBox[i] < ranBox[j]) {
					int temp = ranBox[j];
					ranBox[j] = ranBox[i];
					ranBox[i] = temp;
					
				} else if (ranBox[i] == ranBox[j]) {
					i--;
				}
			}
		}
		*/
		/*
		Random ran2 = new Random();
		
		long lock = ran2.nextInt(100000000);
		
		for(long i=0; i<1000000000; i++) {
			
			long a = ran2.nextInt(100000000);
			if(lock == a) {
				System.out.println(i + "번째 맞춤");
				System.out.println("lock : " + lock);
				System.out.println("a : " + a);
				return;
			}
		}
		*/
		
	}

}

