package com.baidu.java;

public class TriAngle {
	
	//属性
	private double base; //底边长
	private double height; //高
	
	//构造器
	public TriAngle() {
		
	}
	public TriAngle(double base,double height) {
		this.base = base;
		this.height = height;
	}
	
	//base公共方法
	public void setBase(double base) {
		this.base = base;
	}
	public double getBase() {
		return base;
	}
	
	//height公共方法
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
}
