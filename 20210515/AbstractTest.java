package com.lnu.exer12;

public abstract class AbstractTest extends Person implements AA{
	public static void main(String[] args) {
		AbstractTest.run();//用类名调用static关键字修饰的方法
		SubClass sub1 = new SubClass();
		sub1.name = "Tom";
		System.out.println(sub1.name);
		sub1.eat();
		sub1.study();
		
	}
	
	String name;
	int age;
	
	public abstract void eat();
	
	public static void run() {
		System.out.println("跑步");
	}
}

class SubClass extends AbstractTest implements AA{

	@Override
	public void eat() {
		System.out.println("子类实现父类的抽象方法");
	}

	@Override
	public void walk() {
		System.out.println("实现接口的抽象方法");
	}
	
}

interface AA{
	//全局常量
	public static final int MAX_SPEED = 7900;
	//抽象方法
	public abstract void walk();
	//静态方法
	public static void run() {
		System.out.println("静态方法：跑步");
	}
	//默认方法
	public default void fly() {
		System.out.println("飞机会飞");
	}
	default void sleep() {
		System.out.println("动物会睡觉");
	}
}

class Person extends Being{
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.play();
	}
	String name;
	int age;
	int id;
	
	public void study() {
		System.out.println("人会学习");
	}
}

abstract class Being{
	
	String name;
	int age;
	
	public void play() {
		System.out.println("生物也会玩");
	}
}