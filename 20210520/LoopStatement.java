package com.lnu.java;

/*
 * 循环语句练习
♦ 程序功能：分别采用 for 循环、while 循环和 do…while 循环输出 100～
200 之间不能被 3 整除的数。
 */

public class LoopStatement {
	public static void main(String[] args) {
		
		//使用for循环
		System.out.println("100~200之间不能被3整除的数:");
		int cont = 0;
		for(int i = 100;i <= 200;i++) {
			if(i % 3 != 0) {								
				System.out.print(i + " ");
				cont++;
				if(cont == 5) {
					System.out.println();
					cont = 0;
				}
			}
		}
		
//		//使用while循环
//		System.out.println("100~200之间不能被3整除的数:");
//		int cont = 0;
//		int i = 100;
//		while(i <= 200) {
//			if(i % 3 != 0) {								
//				System.out.print(i + " ");
//				cont++;
//				if(cont == 5) {
//					System.out.println();
//					cont = 0;
//				}
//			}
//			i++;
//		}
//		
//		//使用do-while循环
//		System.out.println("100~200之间不能被3整除的数:");
//		int cont = 0;
//		int i = 100;
//		do{
//			if(i % 3 != 0) {								
//				System.out.print(i + " ");
//				cont++;
//				if(cont == 5) {
//					System.out.println();
//					cont = 0;
//				}
//			}
//			i++;
//		}while(i <= 200);
	}
}
