package com.lnu.exer11;

public class Test {
	public static void main(String[] args) {
		
		B b = new B();
		b.eat();
		System.out.println(A.MAX_SPEED);
		
		System.out.println(B.MAX_SPEED);
		int i1 = B.age;
		int i2 = b.MAX_SPEED;
		A.walk();//接口A
//		B.walk();//类B
//		b.walk();//类B的对象
		
		//类中定义的静态方法，可以用类或类的对象调用;接口中定义的静态方法，
		//只能通过接口来调用，接口的实现类和实现类的对象无法调用。
		B.run();
		b.run();
	}
	
}

interface A{
	
	//全局常量
	public static final int MAX_SPEED = 7900;
	//抽象方法
	public abstract void fly();
	//静态方法
	public static void walk() {
		System.out.println("走路");
	}
	//默认方法
	public default void eat() {
		System.out.println("吃东西");
	}
}

class B implements A{

	static int age = 10;
	static final int time = 12;
	
	@Override
	public void fly() {
		System.out.println("飞翔");
	}
	
	public static void run() {
		System.out.println("跑步");
	}
	
}