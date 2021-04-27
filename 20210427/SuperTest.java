package com.lnu.exer1;

public class SuperTest {
	public static void main(String[] args) {
		Student stu = new Student("s");
		
		stu.walk();
		stu.study();
		stu.name = "李四";
		System.out.println(stu.name);
	}
}
