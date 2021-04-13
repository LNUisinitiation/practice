//20210412周二
//package com.lnu.java;
//
////测试类
//public class Test {
//	public static void main(String[] args) {
//		
//		//new一个teacher对象
//		teacher tea1 = new teacher();
//		//调用属性
//		tea1.name = "张三";
//		//调用方法
//		System.out.println(tea1.name);
//		
//		//new一个student对象
//		student stu1 = new student();
//		//调用属性
//		stu1.age = 30;
//		//调用方法
//		System.out.println(stu1.say());
//		stu1.info();
//	}
//}
//
////教师类
//class teacher{
//	
//	//属性
//	String name;
//	int age;
//	int teachAge;
//	String course;
//	
//	//方法
//	public String say() {
//		return name;
//	}
//	
//}
//学生类
//class student{
//	
//	//属性
//	String name = "李四";
//	int age = 10;
//	String major = "软件工程";
//	String interests = "打篮球，rap，唱跳";
//	
//	//方法
//	public int say() {
//		return age;
//	}
//	public void info() {
//		System.out.println(name + age + major + interests);
//	}
//}
//package com.lnu.java;
//
//public class Test{
//	public static void main(String[] args) {
//		//创建一个Person类的对象
//		Person p1 = new Person();
//		//设置该对象的name、age和sex属性
//		p1.name = "Tom";
//		p1.age = 18;
//		p1.sex = 1; //在Person类中使用了文档注释
//		//对象调用方法
//		p1.study();
//		p1.showAge(); //Ctrl+鼠标 Alt+左右方向键
//		int newAge = p1.addAge(2);
//		System.out.println(p1.name + "的新年龄:" + newAge);
//		
//		Person p2 = new Person();
//		p2.name = "张三";
//		p2.age = 12;
//		p2.sex = 0;
//		p2.study();
//		p2.showAge();
//		int afterAge = p2.addAge(5);
//		System.out.println(afterAge);
//		System.out.println(p2.age);
//		
//	}
//}
//
//class Person{
//	
//	//属性
//	String name;
//	int age;
//	/**
//	 * sex:1表明是男性
//	 * sex:0表明是女性
//	 */
//	int sex;
//	
//	//方法
//	public void study() {
//		System.out.println("syudying");
//	}
//	
//	public void showAge() {
//		System.out.println("age:" + age);
//	}
//	
//	public int addAge(int i) {
//		age += i;
//		return age;
//	}
//}
package com.lnu.java;

//测试类
public class Test{
	public static void main(String[] args) {
		
		//new一个Circle类的对象
		Circle cir1 = new Circle();
		
		//对象调用属性
		cir1.radius = 2.1;
		
		//对象调用方法
		//方式一:
		//double area =cir1.findArea();
//		System.out.println(cir1.findArea());
		//方式二:	
		cir1.findArea(3.14);
		
	}
}

//Circle类
class Circle{
	
	//属性 radius半径
	double radius;
	
	//方法 求圆的面积
	//方式一:
//	public double findArea() {
//		double area = Math.PI * radius * radius;
//		return area;
//	}
	//方式二:
	public void findArea(double a) {
		double area = a * radius * radius; //这里的area是局部变量
		System.out.println(area); //因为没有返回值，所以输出语句直接写在这个方法里面
	}
}









