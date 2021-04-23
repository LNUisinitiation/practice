package com.lnu.exer1;

public class Account {
	
	//属性 
	private double balance;
	
	//构造器
	public Account(double init_balance) {
		this.balance = init_balance;
	}
	
	//公共方法
	public double getBalance() {
		return balance;
	}
	
	//方法
	public void deposit(double amt) { //存款
		if(amt > 0) {
			balance += amt;
			System.out.println("存钱成功");
		}
	}
	public void withdraw(double amt) { //提款
		if(balance >= amt) {
			balance -= amt;
			System.out.println("取钱成功");
			//break;
		}else {
			System.out.println("余额不足");
		}
	}
}
