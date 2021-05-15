package com.lnu.exer12;

public class TaxiTest{
	public static void main(String[] args) {
		
		//继承Taxi类的匿名子类的对象
		Taxi t1 = new Taxi() {

			@Override
			public void run() {
				System.out.println("实现抽象类中的抽象方法");
			}
			
		};
		
		t1.run();
		
		Taxi t2 = new Taxi() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		Taxi t3 = new Taxi() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		
	}
	public void eat() {
		System.out.println("静态方法：吃");
	}
}

abstract class Taxi{
	
	public abstract void run();
}

class Pig extends TaxiTest{
	
	public void eat() {
		System.out.println("静态方法：吃");
	}
}