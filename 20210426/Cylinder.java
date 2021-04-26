package com.lnu.exer;

public class Cylinder extends Circle{
	
	//属性
	double length; //圆柱高度
	
	//构造器
	public Cylinder() {
		this.length = 1.0;
	}
	
	//公共方法
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	
	//方法
	//计算圆柱体积
	public double findVolume() {
		return length * findArea();
	}
	public double findArea() { //重写
		return  2.0;
	}
	
	public String info() { //重写
		return null;
	}
}
