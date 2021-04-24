package com.lnu.exer2;

public class BankTest {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.addCustomer("Jane", "Smith");
		
		bank.getCustomer(0).setAccount(new Account(1000));
		
		bank.getCustomer(0).getAccount().withdraw(500);
		
		double balance = bank.getCustomer(0).getAccount().getBalance();
		
		System.out.println("客户:" + bank.getCustomer(0).getFirstName() + ", " + bank.getCustomer(0).getLastName() + "的账户余额为:" +balance);
	}
}
