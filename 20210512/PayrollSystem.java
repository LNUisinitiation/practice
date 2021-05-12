package com.lnu.exer9;

import java.util.Scanner;

public class PayrollSystem {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入本月月份:");
		int month = scan.nextInt();
		//创建Employee变量数组并初始化，该数组存放各类雇员对象的引用
//		Employee[] employee = new Employee[] {new SalariedEmployee("Tom",1001,new MyDate(1996,05,01)),new SalariedEmployee("Amy",1002,new MyDate(1998,06,01))};
		Employee[] employee = new Employee[2];
		
//		SalariedEmployee s1 = new SalariedEmployee("Tom",1001,new MyDate(1996,05,01));
		HourlyEmployee h1 = new HourlyEmployee("Amy",1001,new MyDate(1998,06,01),60,240);
	
		employee[0] = new SalariedEmployee("Tom",1001,new MyDate(1996,05,01),10000);
		employee[1] = h1;
		
		//利用循环结构遍历数组元素
		for(int i = 0;i < employee.length;i++) {
			System.out.println(employee[i]);
			double salary = employee[i].earnings();
			System.out.println("月工资为：" + salary);
			
			if(month == employee[i].getBirthday().getMonth()) {
				System.out.println("给" + employee[i].getName() + "增加100元工资");
			}
		}
		//输出各个对象的类型，name,number,birthday,以及该对象生日。
		
		//当键盘输入本月月份时，如果本月是某个Employee对象的生日，还要输出增加100元工资的信息。
	
	}
}
