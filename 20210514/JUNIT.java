package com.lnu.exer11;

import java.util.Scanner;

import org.junit.Test;

public class JUNIT {
	
	@Test
	public void test1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int num1 = scan.nextInt();
		System.out.println("num1:" + num1);
	}
	
	@Test
	public void test2() {
		System.out.println("JUnit测试");
	}
}
