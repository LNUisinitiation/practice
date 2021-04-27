package com.lnu.exer1;

public class Student  extends Person{
	
	String major;
	
//	public Student() {
//		//super();
//	}
	
	public Student(String major,int age) {
		this(major);
	}
	
	public Student(int age,String major) {
		
	}
	
	public Student(String major) {
		this.major = major;
	}
	
	@Override
	public void eat() {
		System.out.println("学生多吃有营养的食物");
	}
	
	public void study() {
		System.out.println("学生学习知识");
		super.walk();
	}
	
	public void walk() {
		System.out.println("学生走路");
	}
	public void show() {
		System.out.println("name = " + name + " ,age = " + age);
	}
}
