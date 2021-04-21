package com.baidu.java;

public class PersonTest {
	public static void main(String[] args) {
		Being p = new Being();
		Being p1 = new Being("张三");
		Being p2 = new Being("Tom",20);
		//p1.setName("李四");
		System.out.println(p1.getName());
		//p.eat();
		System.out.println(p2.getName() + "\t" + p2.getAge());
		
	}
}

class Being{ //属性后面写构造器然后写方法
	
	//属性
	private String name;
	private int age;
	
	//构造器
	public Being() {
		System.out.println("这是构造器");
	}
	
	public Being(String name) {
		this.name = name;
	}
	
	public Being(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//方法
	public void eat() {
		System.out.println("人吃饭");
	}
	
	public void study() {
		System.out.println("人会学习");
	}
	
	//setName方法
	public void setName(String name) {
		this.name = name;
	}
	//getName方法
	public String getName() {
		return name;
	}
	
	//setAge方法
	public void setAge(int age) {
		this.age = age;
	}
	//getAge方法
	public int getAge() {
		return age;
	}
}