package com.lnu.exer;

public class CylinderTest {
	public static void main(String[] args) {
		
		Cylinder cy = new Cylinder();
		
		cy.setRadius(2.1);
		cy.setLength(3.4);
		double area = cy.findArea();
		double volume = cy.findVolume();
		System.out.println("圆的面积为: " + area + "\n圆柱的体积为: " + volume);
	}
}
