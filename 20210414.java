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
package com.lnu.java;

public class Test1{
	public static void main(String[] args) {
		//声明Student类型的数组
		Student1[] stus = new Student1[20];
		
		for(int i = 0;i < stus.length;i++) {
			//给数组元素赋值
			stus[i] = new Student1();
			//给Student对象的属性赋值
			stus[i].number = (i + 1);
			//年级:[1,6]
			stus[i].state = (int)(Math.random() * 6 + 1);
			//成绩:[0-100]
			stus[i].score = (int)(Math.random() * (100 - 0 + 1));
		}
		
		Test1 test = new Test1();
		
		//遍历学生数组
		test.print(stus);
		
		System.out.println("****************************************");
		
		//打印出3年级的学生信息
		test.searchState(stus, 3);
		
		System.out.println("****************************************");
		
		//使用冒泡排序按学生成绩排序，并遍历所有学生信息
		test.sort(stus);
		
		//遍历学生数组
		test.print(stus);
	}		
	
	/**
	 * 
	 * @Description 遍历Student1[]数组的操作
	 * @author LiYimin	Email:1589810996@qq.com
	 * @date 2021年4月14日下午9:05:18
	 * @param stus
	 */
	public void print(Student1[] stus) { //方法
		for(int i = 0;i < stus.length;i++) {
			System.out.println(stus[i].info());
		}
	}
	/**
	 * 
	 * @Description 查找Student数组中指定年级的学生信息
	 * @author LiYimin	Email:1589810996@qq.com
	 * @date 2021年4月14日下午8:59:00
	 * @param stus 要查找的数组
	 * @param state 要查找的年级
	 */
	public void searchState(Student1[] stus,int state) {
		for(int i = 0;i < stus.length;i++) {
			if(stus[i].state == 3) {
				System.out.println(stus[i].info());
			}
		}
	}
	
	/**
	 * 
	 * @Description 给Student1[]这个数组进行冒泡排序
	 * @author LiYimin	Email:1589810996@qq.com
	 * @date 2021年4月14日下午9:03:38
	 * @param stus 要排序的数组
	 */
	public void sort(Student1[] stus) {
		for(int i = 0;i < stus.length - 1;i++) {
			for(int j = 0;j < stus.length - 1 - i;j++) {
				if(stus[j].score > stus[j + 1].score) {
					Student1 temp = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = temp;
				}
			}
		}
	}
	
	
}

class Student1{
	int number; //学号
	int state; //年级
	int score; //成绩
	
	//显示学生信息的方法
	public String info() {
		return "学号:" + number + ",年纪:" + state + ",成绩:" + score; 
	}
}






