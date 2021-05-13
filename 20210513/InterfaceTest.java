package com.lnu.exer10;

public class InterfaceTest {
	public static void main(String[] args) {
		
		ComparableCircle c1 = new ComparableCircle(3.4);
		ComparableCircle c2 = new ComparableCircle(3.6);
		
		int compareValue = c1.compareTo(c2);
		if(compareValue > 0) {
			System.out.println("c1对象大");
		}else if(compareValue < 0) {
			System.out.println("c2对象大");
		}else {
			System.out.println("c1和c2一样大");
		}
	}
	
}
