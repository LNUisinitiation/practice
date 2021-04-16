//20210413周二
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
//package com.lnu.java;
//
////测试类
//public class Test{
//	public static void main(String[] args) {
//		
//		//new一个Circle类的对象
//		Circle cir1 = new Circle();
//		
//		//对象调用属性
//		cir1.radius = 2.1;
//		
//		//对象调用方法
//		//方式一:
//		//double area =cir1.findArea();
////		System.out.println(cir1.findArea());
//		//方式二:	
//		cir1.findArea(3.14);
//		
//	}
//}
//
////Circle类
//class Circle{
//	
//	//属性 radius半径
//	double radius;
//	
//	//方法 求圆的面积
//	//方式一:
////	public double findArea() {
////		double area = Math.PI * radius * radius;
////		return area;
////	}
//	//方式二:
//	public void findArea(double a) {
//		double area = a * radius * radius; //这里的area是局部变量
//		System.out.println(area); //因为没有返回值，所以输出语句直接写在这个方法里面
//	}
//}
//20210414周三
//package com.lnu.java;
//
//public class Test{
//	public static void main(String[] args) {
//		//声明Student类型的数组
//		Student[] stus = new Student[20];
//		
//		for(int i = 0;i < stus.length;i++) {
//			//给数组元素赋值
//			stus[i] = new Student();
//			//给Student对象的属性赋值
//			stus[i].number = (i + 1);
//			//年级:[1,6]
//			stus[i].state = (int)(Math.random() * 6 + 1);
//			//成绩:[0-100]
//			stus[i].score = (int)(Math.random() * (100 - 0 + 1));
//		}
//		
//		//遍历学生数组
//		for(int i = 0;i < stus.length;i++) {
//			System.out.println(stus[i].info());
//		}
//		
//		System.out.println("****************************************");
//		
//		//打印出3年级的学生信息
//		for(int i = 0;i < stus.length;i++) {
//			if(stus[i].state == 3) {
//				System.out.println(stus[i].info());
//			}
//		}
//		
//		System.out.println("****************************************");
//		
//		//使用冒泡排序按学生成绩排序，并遍历所有学生信息
//		for(int i = 0;i < stus.length - 1;i++) {
//			for(int j = 0;j < stus.length - 1 - i;j++) {
//				if(stus[j].score > stus[j + 1].score) {
//					Student temp = stus[j];
//					stus[j] = stus[j + 1];
//					stus[j + 1] = temp;
//				}
//			}
//		}
//		for(int i = 0;i < stus.length;i++) {
//			System.out.println(stus[i].info());
//		}
//	}
//}
//
//class Student{
//	int number; //学号
//	int state; //年级
//	int score; //成绩
//	
//	//显示学生信息的方法
//	public String info() {
//		return "学号:" + number + ",年纪:" + state + ",成绩:" + score; 
//	}
//}
//20210415周四
//package com.lnu.java;
//
//public class Test{
//	public static void main(String[] args) {
//		
//		Phone p = new Phone(); //这里创建了一个具体的手机类的对象p——华为手机
//		
//		//p.sendEmail();
//		
//		//匿名对象
////		new Phone().sendEmail();
////		new Phone().playGame();
//		new Phone().price = 1999;
//		new Phone().showPrice(); //0.0
//		new Phone().playGame();
//		System.out.println("*************************");
//		phoneMall mall = new phoneMall(); //创建一个万达商场
//		mall.show(new Phone()); //匿名对象的使用
//		System.out.println("*************************");
//		mall.show(p);
//	}
//}
//
//class phoneMall{ //这是一个商场类（商场中会售卖手机）  万达商场是一个商场类的对象，华为手机是一个手机类的对象
//	
//	public void show(Phone phone) { //这个show方法的使用:创建一个phoneMall类的对象——万达商场，在万达商场中
//		phone.sendEmail();			//展示手机的功能
//		phone.playGame();
//	}
//}
//
//class Phone{ //这是一个手机类
//	//属性
//	double price;
//	
//	//方法
//	public void sendEmail() {
//		System.out.println("发送邮件");
//	}
//	public void playGame() {
//		System.out.println("玩电子游戏");
//	}
//	public void showPrice() {
//		System.out.println("手机价格为:" + price);
//	}
//}
//package com.lnu.java;
//
//public class Test{
//	public static void main(String[] args) {
//		
//		Phone p = new Phone();
//		p.price = 1999;
////		p.playGame();
////		p.sendEmail();
//		p.showPrice(1997);
//		
//		//匿名对象
//		new Phone().sendEmail();
//		new Phone().playGame();
//		new Phone().showPrice(1998);
//		System.out.println("******************");
//		
//		phoneMall mall = new phoneMall();
//		mall.show(p);
//		mall.show(new Phone()); //匿名对象的使用
//	}
//}
//
//class phoneMall{
//	
//	//方法
//	public void show(Phone phone) { //phoneMall类中的方法调用Phone类中的方法
//		phone.sendEmail();
//		phone.playGame();
//	}
//}
//
//
//class Phone{
//	
//	double price;
//	
//	public void sendEmail() {
//		System.out.println("发送邮件");
//	}
//	public void playGame() {
//		System.out.println("玩电子游戏");
//	}
//	public void showPrice(int price) {
//		System.out.println("手机价格为:" + price + "	" + this.price);
//	}
//}
//package com.lnu.java;
//
//public class Test{
//	public static void main(String[] args) {
//		
//		Student[] stus = new Student[20];
//		
//		for(int i = 0;i < stus.length;i++) {
//			
//			stus[i] = new Student();
//			stus[i].number = (i + 1);
//			stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
//			stus[i].score = (int)(Math.random() * (100 - 0 + 1));
//			
//		}
//		for(int i = 0;i < stus.length;i++) {
//			System.out.println(stus[i].info());
//		}
//	}
//	
//	//todo
//	//遍历并打印学生数组信息
//
//}
//
//class Student{
//	
//	//属性
//	int number; //学号
//	int state;  //年级
//	int score;  //成绩
//	
//	//方法
//	public String info() {
//		return "学号:" + number + ",年级:" + state + ",成绩:" + score;
//	}
//}
//20210416周五
package com.lnu.java;

public class Test{
	public static void main(String[] args) {
		Test t = new Test();
		t.getSum(1,2,3);
		t.getSum(1,2);
		t.getSum(1.0,3.0);
		t.getSum("111",1);
	}
	
	public void getSum(int i,int j) {
		System.out.println("1");
	}
	public void getSum(double d1,double d2) {
		System.out.println("2");
	}
	public void getSum(String s,int i) {
		System.out.println("3");
	}
	public void getSum(int ... i) {
		System.out.println("4");
	}
}































