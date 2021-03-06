package com.lnu.exer7;
/*
 * 单例模式：饿汉式
 */
public class SingletonTest1 {
	public static void main(String[] args) {
		
		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		
		System.out.println(bank1 == bank2);
	}
}

class Bank{
	
	//1.私有化类的构造器
	private Bank() {
		
	}
	
	//2.内部创建类的对象
	//4.要求此对象也必须声明为静态的
	private static Bank instance = new Bank();
	
	//3.提供公共的静态方法，返回类的对象
	public static Bank getInstance() {
		return instance; //静态的方法中只能调静态的结构；因为get方法是静态的，随着类的加载而加载
	}
}