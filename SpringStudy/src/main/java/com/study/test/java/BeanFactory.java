package com.study.test.java;

public class BeanFactory {
	
	public Object getBean(String beanName) {
		
		if(beanName.equals("Samsung")) {
			return new SamsungTv();
		} else if(beanName.equals("Lg")) {
			return new LgTv();
		}
		
		return null;
	}
}
