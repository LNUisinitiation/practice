package com.baidu.java;

public class TriAngleTest {
	public static void main(String[] args) {
		
		TriAngle triAngle = new TriAngle();
		TriAngle t1 = new TriAngle(5.1,5.6);
		triAngle.setBase(2.0);
		triAngle.setHeight(2.4);
		
		double area = (triAngle.getBase() * triAngle.getHeight()) / 2;
		System.out.println(area);
		
		System.out.println("base ：" + t1.getBase() + " height :" + t1.getHeight());
		double area1 = (t1.getBase() * t1.getHeight()) / 2;
		System.out.println(area1);
	}
}
