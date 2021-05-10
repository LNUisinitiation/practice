package com.lnu.exer7;
/*
 * main()方法的使用说明
 * 
 */
public class MainTest {
	public static void main(String[] args) {
		
//		Integer in1 = new Integer(12);
//		Integer in2 = Integer.valueOf(13);
//		
//		//自动装箱、自动拆箱
//		Integer in3 = 14;
//		int i2 = in2;
//		
//		int i1 = in1.intValue();
//		
//		System.out.println(i1);
//		
//		//基本数据类型、包装类--->String  valueOf(Xxx xx);
//		String str1 = String.valueOf(12.3);
//		//String--->基本数据类型、包装类   Double d10 = Double.parseDouble(str3);
//		double d1 = Double.parseDouble("12.3");
//		float f1 = Float.parseFloat(str1);
//		int i4 = Integer.parseInt(str1);
//		int i5 = Integer.parseInt(str1);
//		float f2 = Float.parseFloat(str1);
//		double d2 = Double.parseDouble(str1);
//		
		Person p1 = new Person();
		Person p2 = new Student();//多态
		
		//向下转型
		if(p2 instanceof Student) {
			Student s1 = (Student)p2;
			System.out.println(s1.getClass());
		}
	
		System.out.println("*****************");
		System.out.println(p1.getClass());
		System.out.println(p2.getClass());
	}
}

//class IntegerDemo{
//	
//	public static void main(String[] args) {
//		
//		Integer in1 = new Integer(12);
//		int i1 = in1.intValue();
//		System.out.println(i1);
//		//基本数据类型、包装类--->String
//		
//		//String--->基本数据类型、包装类
//		
//	}
//	
//}

class Person{
	
	int NUM = 0;//Ctrl + Shift + x 将小写变为大写
	String name;
	int age;
	
	public void eat() {
		System.out.println("人吃东西");
	}
}

class Student extends Person{
	
	public void study() {
		System.out.println("学生会学习");
	}
	
	@Override
	public void eat() {
		System.out.println("学生喜欢吃巧克力");
	}
}