package com.thu.java;

public class Boy {
	
	//属性
	private String name;
	private int age;
	
	//构造器
	public Boy() {
		
	}
	
	//公共方法
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	//方法
	public void marry(Girl girl) {
		System.out.println("我想娶" + girl.getName());
	}
	public void shout() {
		if(age >= 22) {
			System.out.println("你可以结婚了");
		}
	}
}



















