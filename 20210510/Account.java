package com.lnu.exer7;

public class Account {
	
	//非静态属性   （实例变量）
	private int id;
	private String passWord = "000000";
	private double balance;
	
	//静态属性（类变量）
	private static double interestRate;
	private static double minBalance = 1.0;
	private static int init = 1001;//用于自动生成id使用
	
	public Account() {
		id = init++;
	}
	
	public Account(String passWord,double balance) {
		this();
		this.passWord = passWord;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public double getBalance() {
		return balance;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(double interestRate) {
		Account.interestRate = interestRate;//this表示当前对象的 super表示当前对象的父类
	}
	public static double getMinBalance() {
		return minBalance;
	}
	public static void setMinBalance(double minBalance) {
		Account.minBalance = minBalance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", passWord=" + passWord + ", balance=" + balance + "]";
	}
	
	
	
}























