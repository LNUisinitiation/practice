package com.lnu.exe3;

public class BankTest {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.addCustomer("Jane", "Smith");
		
		bank.getCustomer(0).setAccount(new Account(2000));
		
		System.out.println(bank.getCustomer(0).getAccount().getBalance());
		
		bank.getCustomer(0).getAccount().deposit(10000);
		
		bank.getCustomer(0).getAccount().withdraw(200);
		
		double balance = bank.getCustomer(0).getAccount().getBalance();
		System.out.println(balance);
	}
}
