package com.lnu.exer;

public class Circle {
	
	//属性
	private double radius; //半径
	
	//构造器
	public Circle() {
		this.radius = 1.0;
	}
	
	//公共方法
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	//方法
	public double findArea() {
		return Math.PI * radius * radius;
	}
	
	public Object info() {
		return null;
	}
	
	
}
