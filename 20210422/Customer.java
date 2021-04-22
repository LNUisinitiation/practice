package com.thu.java;

public class Customer {
	
	//属性
	private String firstName;
	private String lastName;
	private Account account; //这里的account属性存放的是acct这个对象实体的地址
	
	//构造器
	public Customer(String f,String l) {
		this.firstName = f;
		this.lastName = l;
	}

	//公共方法
	public String getFirstName() {
		return firstName;
	}

//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}

	public String getLastName() {
		return lastName;
	}

//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) { //值传递机制
		this.account = account; //这里的this.account存放的是地址
	}
	
}
