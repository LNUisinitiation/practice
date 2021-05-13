package com.lnu.exer10;
//
//public class InterfaceTest {
//	public static void main(String[] args) {
//		System.out.println(Flyable.MAX_SPEED);
//		System.out.println(Flyable.MIN_SPEED);
//		System.out.println(Flyable.MAX_SPEEDED);
//		
//		Plane plane = new Plane();
//		plane.fly();
//	}
//}
//
//interface Flyable{
//	
//	//全局常量 public static final
//	public static final int MAX_SPEED = 7900;
//	public static final int MIN_SPEED = 1;
//	public static final double SALARY = 12.3;
//	double INCOME = 12.1;
//	int MAX_SPEEDED = 14000;//省略了public static final
//	//抽象方法 public abstract
//	public abstract void fly();
//	public abstract void walk();
//	void run();
//	void stop();//省略了public abstract
//}
//
////类实现接口 implements
//class Plane implements Flyable{
//
//	@Override
//	public void fly() {
//		System.out.println("飞机通过引擎起飞");
//	}
//
//	@Override
//	public void walk() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void stop() {
//		System.out.println("驾驶员减速停止");
//	}
//	
//}
//
//abstract class Kite implements Flyable{
//
////	@Override
////	public void fly() {
////		// TODO Auto-generated method stub
////		
////	}
//
//	@Override
//	public void walk() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void stop() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}

public class InterfaceTest1{
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_INCOME);
		System.out.println(Flyable.MIN_SPEED);
		
		Plane plane = new Plane();
		plane.fly();
		plane.run();
		plane.stop();
		
	}
}

interface Flyable{
	//全局常量
	public static final int MAX_SPEED = 7900;
	public static final int MIN_SPEED = 1;
	public static final double SALARY = 12.1;
	public static final double INCOME = 12.2;
	int MAX_SALARY = 100;
	int MIN_SALARY = 1;
	double MAX_INCOME = 200;
	double MIN_INCOME = 2;
	
	//抽象方法
	public abstract void fly();
	public abstract int value1();
	public abstract double value2();
	void run();
	void stop();
	
}

interface Attackable{
	//全局常量
	
	//抽象方法
	void attack();
}

//类实现接口 implements
class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("飞机通过引擎起飞");
	}

	@Override
	public int value1() {
		return 01;
	}

	@Override
	public double value2() {
		return 02;
	}

	@Override
	public void run() {
		System.out.println("跑起来");
	}

	@Override
	public void stop() {
		System.out.println("驾驶员减速停止");
	}
	
}

abstract class Kite implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int value1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double value2() {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
	
}

class paper extends Kite {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class Bullet extends Object implements Flyable,Attackable,CC{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int value1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double value2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	
}

//************************
//接口和接口之间可以继承，而且可以多继承
interface  AA{
	void method1();
}

interface BB{
	void method2();
}

interface CC extends AA,BB{
	
}





























