//20210412周一
package com.lnu.java;

//测试类
public class PersonTest {
	public static void main(String[] args) {
		//创建person类的对象
		Person p1 = new Person();
		//Scanner scan = new Scanner(System.in);
		
		//调用对象的结构: 结构体现为属性和方法
		//调用属性: 对象.属性
		p1.name = "Tom";
		p1.isMale = false;
		p1.age = 20;
		System.out.println(p1.name); //对于变量的操作主要体现在两方面:给其赋值，调用它的值
		
		//调用方法: 对象.方法
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");
		
	}
}

class Person{
	
	//属性
		String name;
		int age;
		boolean isMale;
		
		//方法
		public void eat() {
			System.out.println("人可以吃饭");
		}
		
		public void sleep() {
			System.out.println("人可以睡觉");
		}
		
		public void talk(String language) {
			System.out.println("人可以说话，使用的是:" + language);
		}
		
}
//类的实例化，就是创建类的对象













