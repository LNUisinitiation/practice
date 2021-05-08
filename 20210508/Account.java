package com.lnu.exer5;

public class Account {
	
	private int id;
	private String passWord = "000000";
	private double balance;
	
	private static double interestRate;
	private static double minBalance = 1.0;
	private static int init = 1001;//用于自动生成id使用的
	
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
		Account.interestRate = interestRate;
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
