package com.lnu.exer1;

public class OrderTest {
	public static void main(String[] args) {
		
		Order o1 = new Order(202001,"上学");
		Order o2 = new Order(202002,"放学");
		
		Order o3 = new Order(202001,"上学");
		Order o4 = new Order(202001,"上学");
		
		boolean b1 = o1.equals(o2);
		System.out.println(b1); //false
		
		boolean b2 = o3.equals(o4);
		System.out.println(b2); //true
	}
}
