package com.baidu.java;

public class Student {
	public static void main(String[] args) {
		
		Student s1 = new Student("张一",20);
		System.out.println("name:" + s1.name + "\n" + "age:" + s1.age);
		
		System.out.println("******************************");
		
		Student s2 = new Student("张二",21,"育才中学");
		System.out.println("name:" + s2.name + "\n" + "age:" + s2.age + "\n" + "school:" + s2.school);
		
		System.out.println("******************************");
		
		Student s3 = new Student("张三",22,"辽宁大学","软件工程");
		System.out.println("name:" + s3.name + "\n" + "age:" + s3.age + "\n" + "school:" + s3.school + "\n" + "major:" + s3.major);
	}
	
	//属性
	String name;
	int age;
	String school;
	String major;
	
	//构造器
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public Student(String name,int age,String school) {
		this.name = name;
		this.age = age;
		this.school = school;
	}
	public Student(String name,int age,String school,String major) {
		this.name = name;
		this.age = age;
		this.school = school;
		this.major = major;
	}
	
}
