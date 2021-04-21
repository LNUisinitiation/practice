//20210420周二
package com.baidu.java;

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal a = new Animal();
//		a.name = "小白";
//		a.age = 1;
//		a.legs = 4; //The field Animal.legs is not visible
		
//		a.show();
//		System.out.println("******************************");
		
//		a.legs = -4; //不合理的赋值
//		a.show();
		
		a.setLegs(4);
		a.show();
		
//		a.legs = 3; //将legs声明为private私有的
//		a.show();
		
		System.out.println("******************************");
		
		System.out.println(a.getLegs());
		
		System.out.println("****以下为:调用方法，设置和获取name属性的值*****");
		
		//调用方法，设置name属性的值
		a.setName("小白");
		//调用方法，获取name属性的值
		System.out.println(a.getName());
//		a.show();
		//a.showName();
		
		System.out.println("******以下为:调用方法，设置和获取age属性的值******");
		
		//调用方法，设置age属性的值
		a.setAge(2);
		//调用方法，获取age属性的值
		System.out.println(a.getAge());
		
		
	}
}

class Animal{
	
	private String name;
	private int age;
	private int legs; //腿的个数
	
	//对legs属性的设置
	public void setLegs(int legs) { //谁调这个方法，就填个l，然后就把l赋值给调方法的对象的legs属性
		if(legs >= 0 && legs % 2 == 0) {
			this.legs = legs;
		}else {
			this.legs = 0;
//		    或抛出一个异常
		}
	}
	
	//对legs属性的获取
	public int getLegs() {
		return legs;
	}
	
	//对name属性的设置
	public void setName(String name) {
		this.name = name;
	}
	
	//对name属性的获取
	public String getName() {
		return name;
	}
	
	//对age属性的设置
	public void setAge(int age) {
		this.age = age;
	}
	
	//对age属性的获取
	public int getAge() {
		return age;
	}
//	public void eat() {
//		System.out.println("动物进食");
//	}
	
	public void show() {
		System.out.println("name: " + name + "\nage: " + age + "\nlegs: " + legs);
	}
	
//	public void showName() {
//		System.out.println("name: " + name);
//	}
}





















