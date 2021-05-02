package com.lnu.java;
import java.util.Scanner;
/*
 * 使用 if...else 语句
♦ 程序功能：使用 if...else 语句构造多分支，判断某一年是否为闰年。闰
年的条件是符合下面二者之一：年份能被 4 整除，但不能被 100 整
除；年份能被 400 整除。
 */

//public class SelectStatement {
//	public static void main(String[] args) {
//		
//		System.out.println("请输入一个年份，年份为正整数:");
//		Scanner scan = new Scanner(System.in);
//		int year = scan.nextInt(); //从控制台获取一个整型值，判断是否为正整数
//		//System.out.println(year);
//		if(year >= 0) {
//			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//				System.out.println(year + "是闰年");
//			}else {
//				System.out.println(year + "不是闰年");
//			}
//		}else {
//			System.out.println(year + "不是正整数，请输入正整数哦");
//		}
//	}
//}

/*
 * 2．使用 switch 语句
♦ 程序功能：根据考试成绩的等级打印出百分制分数段，即‘A’为‘90～
100’，‘B’为‘80～89’，‘C’为‘70～79’，‘D’为‘60～69’, ‘E’为‘<60‘。
 */

public class SelectStatement{
	public static void main(String[] args) {
		
		int cont = 0; //记录一共输入了多少个学生的成绩
		int studentNumber = 60; //学生总数
		for(;cont < studentNumber;) { //输入正确的学生等级个数小于等于学生总数
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
		}
		System.out.println("共输入" + cont + "个人的等级");
	}
}















