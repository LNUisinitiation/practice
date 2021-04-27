package com.lnu.exer1;

public class Person {
	String name;
	int age;
	
	public Person() {
		//super();
	}
	
	public Person(String name) {
		//super();
		this.name = name;
	}
	
	public Person(String name,int age) {
		this(name);
		this.age = age;
	}
	
	public void eat() {
		System.out.println("人吃饭");
	}
	
	public void walk() {
		System.out.println("人走路");
	}
}
