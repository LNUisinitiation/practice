package com.lnu.exer6;

public class InstanceofTest {
	public static void main(String[] args) {
		
//		Student s = new Student();
//		
//		s.age = 20;
//		
//		System.out.println("student的年龄为 " + s.age);
		
		Person p = new Student();
		
		p.eat();
//		p.study();
		
		if(p instanceof Student) {
			Student s = (Student)p;
			
			s.study();
			p.eat();
		}
		
		System.out.println("**********************");
		
		if(p instanceof Person) { //多态？
			Person person = (Person)p;
//			person.study();
			person.age = 30;
			person.name = "tom";
			person.eat();
			System.out.println("person的name: " + person.name + "\n" + "person的age: " + person.age);
		}
		
	}
}


