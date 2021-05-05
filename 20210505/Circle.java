package com.lnu.exer2;

public class Circle extends GeometricObject {
	
	private double radius;

	public Circle() {
		//super();
//		color = "white";
//		weight = 1.0; //因为有super(); 父类中已经初始化了color和weight
		this.radius = 1.0;
	}
	public Circle(double radius) {
		this.radius = radius;
//		color = "white";
//		weight = 1.0; //因为有super(); 父类中已经初始化了color和weight
	}
	public Circle(double radius,String color,double weight) {
		super(color,weight);
		this.radius = radius;

	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//求圆的面积
	public double findArea() {
		return Math.PI * radius * radius;
	}
	
	//比较两个圆的半径是否相等，如相等，返回true
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) { //如果当前对象和形参对象的引用地址一样，那么就是true
			return true;
		}
		
		if(obj instanceof Circle) {
			Circle c = (Circle)obj;
			return this.radius == c.radius;
		}
		
		return false;
		
	}
	
	public String toString() {
		return "半径为: " + radius;
	}
	
	
}
