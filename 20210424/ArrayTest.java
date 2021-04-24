package com.lnu.exer2;

public class ArrayTest {
	public static void main(String[] args) {
		int i;
		i = 10;
		int j;
		j = 9; 

		//下面这种情况Duplicate local variable j 重复局部变量j
//		int j;
//		int j = 9;
		
		System.out.println(i);
		System.out.println(j);
	}
}
