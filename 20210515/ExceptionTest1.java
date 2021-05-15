package com.lnu.exer12;

import java.util.Scanner;

import org.junit.Test;

public class ExceptionTest1 {

	@Test
	public void test1() {
		
		try {
			//可能出现异常的代码
		}catch(NullPointerException e) {
			//处理异常的方式1
		}//catch() {
			//处理异常的方式2
		//}
		
		finally {
			//一定会执行的代码
		}
		
	}
	
	@Test
	public void test2() {
	
		try {
			int cont = 0;
			System.out.println("请输入一个成绩等级:");
			Scanner scan = new Scanner(System.in);
			String str = scan.next();
			
//		char c1 = str.charAt(0); //获取字符串的第0个位置的字符
			
			char grade = str.charAt(0);
			
			switch(grade) {
			case 'A': //case后面只能是常量
				System.out.println("90~100");
				cont ++;
				break;
			case 'B':
				System.out.println("80~89");
				cont ++;
				break;
			case 'C':
				System.out.println("70~79");
				cont ++;
				break;
			case 'D':
				System.out.println("60~69");
				cont ++;
				break;
			case 'E':
				System.out.println("<60");
				cont ++;
				break;
				default:
					System.out.println("输入错误，请重新输入");		
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	}
}


















