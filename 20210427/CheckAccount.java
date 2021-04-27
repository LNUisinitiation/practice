package com.lnu.exer1;

public class CheckAccount extends Account { //可透支的账户
	
	private double overdraft; //可透支限额
	
	public CheckAccount(int id,double balance,double annualInterestRate,double overdraft) {
		super(id,balance,annualInterestRate);
		this.overdraft = overdraft;
	}
	
	
	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	
	public void withdraw(double amount) { //取款
		if(getBalance() >= amount) { //余额就足够消费
//			//double balance = getBalance() - amount;
//			//setBalance(balance);
//			//方式一：
//			setBalance(getBalance() - amount);
			//方式二:
			super.withdraw(amount);
		}else if(overdraft >= amount - getBalance()) { //透支额度 + 余额，足够消费
			
			overdraft -= amount - getBalance();
			
//			setBalance(0);
			super.withdraw(getBalance()); //把余额取光
			
		}else {
			System.out.println("超过可透支限额");
		}
	}
	
}
