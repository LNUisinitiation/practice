package com.lnu.exer8;
/*
 * 饿汉式
 */
//public class Bank {
//	
//	//1.私有化类的构造器
//	private Bank() {
//		
//	}
//	
//	//2.内部创建类的对象
//	//4.要求此对象也必须声明为静态的
//	private static Bank instance = new Bank();
//	
//	//3.提供公共的静态的方法，返回类的对象
//	public static Bank getInstance() {
//		return instance;
//	}
//}
//public class Bank{
//	
//	private Bank() {
//		
//	}
//	
//	private static Bank instance = new Bank();
//	
//	public static Bank getInstance() {
//		return instance;
//	}
//}
//public class Bank{
//	
//	private Bank() {
//		
//	}
//	
//	private static Bank instance = new Bank();
//	
//	public static Bank getInstance() {
//		return instance;
//	}
//}
//public class Bank{
//	
//	private Bank() {
//		
//	}
//	
//	private static Bank instance = new Bank();
//	
//	public static Bank getInstance() {
//		return instance;
//	}
//}
//public class Bank{
//	
//	private Bank() {
//		
//	}
//	
//	private static Bank instance = new Bank();
//	
//	public static Bank getInstance() {
//		return instance;
//	}
//}
//public class Bank{
//	public static void main(String[] args) {
//		
//		Bank bank = instance;
//		System.out.println(bank);
//		System.out.println(Bank.getInstance());
//	}
//	private Bank() {
//		
//	}
//	
//	private static Bank instance = new Bank();
//	
//	public static Bank getInstance() {
//		return instance;
//	}
//}
//public class Bank{
//	
//	private Bank() {
//		
//	}
//	
//	private static Bank instance = new Bank();
//	
//	public static Bank getInstance() {
//		return instance;
//	}
//}
//public class Bank{
//	
//	private Bank() {
//		
//	}
//	
//	private static Bank instance = new Bank();
//	
//	public static Bank getInstance() {
//		return instance;
//	}
//}

//饿汉式
public class Bank{
	
	private Bank() {
		
	}
	
	private static Bank instance = null;
	
	//静态代码块，随着类的加载而加载
	static {
		instance = new Bank();
	}
	
	public static Bank getInstance() {
		
		return instance;
	}
}
















