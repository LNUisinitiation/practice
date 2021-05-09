package com.lnu.exer6;

import org.junit.Test;

public class TheSecondInstanceofTest {
	
	@Test
	public void test1() {
		Being b = new Animal();
		method(b);
	}
	public void method(Object obj) {
		
		if(obj instanceof Pig) { //生物类的对象b 是 猪类 的一个对象吗
			Pig p = (Pig)obj;
			p.sleep();
			((Pig) obj).run();
			System.out.println("1");
//			return 1;
		}
		if(obj instanceof Animal) { //生物类的对象b 是 动物类 的一个对象吗
			Animal animal = (Animal)obj;
			((Animal) obj).run();
			animal.run();
			System.out.println("2");
//			return 2;
		}
		if(obj instanceof Being) {//生物类的对象b 是 生物类 的一个对象吗
			Being being = (Being)obj; 
			being.weight = 12.3;
			being.eat();
			((Animal) being).run();//多态之后，不能用父类引用调用子类方法，所以要向下转型，这是为了调用子类的方法
			((Animal) obj).run();
			System.out.println("3");
//			return 3;
		}
//		else {
//			return 4;
//		}
	}
}
