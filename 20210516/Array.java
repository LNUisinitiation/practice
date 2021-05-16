package com.lnu.exer13;

public class Array {
	
	public static void main(String[] args) {
		
		int[] a1 = new int[3];
		double[] d1 = new double[] {1.3,3.3,3.2};
		
		method(a1, d1);
		
		Array a = new Array();
		a.method(d1);
		
		AA.eat();
		int value = AA.MAX_SPEED;
		System.out.println(value);
		
		
	}
	
	public static void method(int[] i, double[] d) {
		
		for(int j = 0;j < i.length;j++) {
			System.out.println(i[j]);
		}
	}
	
	public void method(double[] d) {
		
		for(int i = 0;i < d.length;i++) {
			System.out.println(d[i]);
		}
	}
	
}

interface AA{
	
	//全局常量
	public static final int MAX_SPEED = 7900;
	//抽象方法
	public abstract void run();
	//静态方法
	public static void eat() {
		System.out.println("这是静态方法");
	}
	//默认方法
	public default void walk() {
		System.out.println("这是默认方法");
	}
	default void sleep() {
		System.out.println("这也是默认方法");
	}
}

class B implements AA{

	@Override
	public void run() {
		System.out.println("实现类实现接口中的抽象方法");
	}
	
	public void method() {
		
		AA.super.walk();
	}
}
