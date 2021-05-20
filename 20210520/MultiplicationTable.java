package com.lnu.java;

public class MultiplicationTable {
	public static void main(String[] args) {
		//九九乘法表:嵌套循环的应用
		for(int i = 1;i <= 9;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "	");				
			}
			System.out.println();
		}
	}
}
