package com.lnu.exer1;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	
//	public Account() {
//		
//	}
	public Account(int id,double balance,double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	//返回月利率
	public double getMonthlyInterest() {
		return annualInterestRate / 12;
	}
	
	public void withdraw(double amount) { //取款
		if(balance >= amount) {
			balance -= amount;
//			System.out.println("取款成功，现在的余额为: " + balance + "元");
		}else {
			System.out.println("余额不足");
		}
	}
	public void deposit(double amount) { //存款
		if(amount > 0) {
			balance += amount;
//			System.out.println("存款成功，现在的余额为: " + balance + " 元");
		}
	}
	
}
