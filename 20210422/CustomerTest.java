package com.thu.java;

public class CustomerTest {
	public static void main(String[] args) {
		Customer cust = new Customer("Jane","Smith");
		
		Account acct = new Account(1000,2000,0.0123);
		
		cust.setAccount(acct);//具体的客户对象需要有一个具体的账户
		
		cust.getAccount().deposit(100); //返回cust对象实体中的account属性，这里的account存放的是acct这个对象的地址
		cust.getAccount().withdraw(960);
		cust.getAccount().withdraw(2000);
		
		//acct.deposit(100); //存钱
		//acct.withdraw(960); //取钱
		//acct.withdraw(2000);
		
		System.out.println("Customer [" + cust.getFirstName() + "," + cust.getLastName() + "] has a account: " + "id is " + acct.getId() +", annualInterestRate is " + cust.getAccount().getAnnualInterestRate() * 100 + "%,balance is " + cust.getAccount().getBalance());
	}
}
