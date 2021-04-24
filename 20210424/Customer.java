package com.lnu.exer2;

public class Customer {
	
	//属性
	private String firstName;
	private String lastName;
	private Account account;
	
	//构造器
	public Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	//setter、getter方法
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account acct) {
		this.account = acct; //这里acct是地址，也就是说this.account存储的是acct这个对象的地址
	}
}























