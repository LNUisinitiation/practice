package com.lnu.exer6;

public class CircleTest {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		Circle c2 = new Circle();
		
		Circle c3 = new Circle(12.3);
		
		System.out.println("c1的id: " + c1.getId());
		System.out.println("c2的id: " + c2.getId());
		System.out.println("c3的id: " + c3.getId());
		System.out.println("c3的半径: " + c3.getRadius());
		
		System.out.println("创建圆的个数为：" + Circle.getTotal());
	}
}

class Circle{
	
	private double radius;
	private int id;//id自动赋值
	
	private static int total;//记录创建圆的个数
	private static int init = 1001;//static声明的属性被所有对象所共享
	
	public Circle() {
		id = init++;
		total++;
	}
	
	public Circle(double radius) {
		this();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public int getId() {
		return id;
	}
	public static int getTotal() {
		return total;
	}
	
	public double findArea() {
		return Math.PI * radius * radius;
	}
}
