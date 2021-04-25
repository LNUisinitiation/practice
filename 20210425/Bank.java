package com.lnu.exe3;

public class Bank {
	
	//属性
	private Customer[] customers; //存放多个客户的数组
	private int numberOfCustomers; //记录客户的个数
	
	//构造器
	public Bank() {
		customers = new Customer[10]; //在构造器中new一个数组
	}
	
	//公共方法
	//获取客户的个数
	public int getNumOfCustomers() {
		return numberOfCustomers;
	}
	//获取指定位置上的客户
	public Customer getCustomer(int index) {
		if(index >= 0 && index < numberOfCustomers) {
			return customers[index];
		}else {
			return null;
		}
	}
	
	//方法
	//添加客户
	public void addCustomer(String f, String l) {
		Customer cust = new Customer(f,l);
		customers[numberOfCustomers] = cust;
		this.numberOfCustomers++;
	}
}











