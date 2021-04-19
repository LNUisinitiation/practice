package com.lnu.java;

public class PassObject {
	
	public static void main(String[] args) {
		
		PassObject p = new PassObject();
		//Circle c = new Circle();
		p.printAreas(new Circle(),5); //可以使用匿名对象 new Circle()
		System.out.println("now radius is: " + new Circle().radius); //输出结果为0.0
		System.out.println("******");
		System.out.println(p.f(10));
		p.show(1,2,3,-4,10,-12,23,-45,343,-256); //可变形参
		p.show(new int[] {1,3,5,7,9}); //可变形参
	}
	
	public void printAreas(Circle c,int time) {
		System.out.println("Radius\t\tArea");
		for(int i = 1;i <= time;i++) {	
			c.radius = i;
			System.out.println(c.radius + "\t\t" + c.findArea());
		}
		c.radius ++;
		System.out.println("匿名对象:" + c.radius); //输出结果为6.0
	}
	
	//递归
	public int f(int n) {
		if(n == 0) {
			return 1;
		}else if(n == 1) {
			return 4;
		}else {
			return 2 * f(n - 1) + f(n - 2);
		}
	}
	
	public void show(int ... i1) {
		System.out.println("可变形参");
		int max = i1[0]; //最大值
		for(int i = 0;i < i1.length;i++) {
			if(i1[i] > max) {
				max = i1[i];
			}
		}
		System.out.println("最大值为:" + max);
		
		int min = i1[0]; //最小值
		for(int i = 0;i < i1.length;i++) {
			if(i1[i] < min) {
				min = i1[i];
			}
		}
		System.out.println("最小值为:" + min);
	}
}
