package com.lnu.item2;

public class Score{
	public static void main(String[] args) {
		
		Person s = new Person();
		
//		s.name = "tom";
//		s.age = 20;
		s.setName("jane");
		s.getName();
		System.out.println(s.getName());
		
		System.out.println(s);
//		System.out.println(s.name);
//		System.out.println(s.age);
	}
	
//	private String name;
//	private int age;
//	
//	public Score() {
//		
//	}
////	public Score(String name,int age) {
////		
////	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getAge() {
//		return age;
//	}
//	
//	public void score() {
//		System.out.println("tom的分数考上了辽宁大学");
//	}
}
 
class Person{
	private String name;
	private int age;
	
	public Person() {
		
	}
//	public Score(String name,int age) {
//		
//	}
	
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
	
	public void score() {
		System.out.println("tom的分数考上了辽宁大学");
	}
}
 

