package com.lnu.exe3;

public class Student extends Person {
	
	public static void main(String[] args) {
		
		Student stu1 = new Student();
		Person p1 = new Person();
		
		p1.name = "李四";
		stu1.name = "张三";
		System.out.println(stu1.name);
		System.out.println(p1.name);
		stu1.eat();
	}
	
}


