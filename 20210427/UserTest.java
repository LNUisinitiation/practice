package com.lnu.exer1;

public class UserTest {
	public static void main(String[] args) {
		Account acct = new Account(1122,20000,0.045);
		
		acct.withdraw(300000);
		System.out.println(acct.getBalance());
		System.out.println("***********************");
		
		acct.withdraw(2500);
		acct.deposit(3000);
		System.out.println("现在的余额为: " + acct.getBalance() + "\n" + "现在的月利率为: " + (acct.getMonthlyInterest()) * 100 + "%");
		
		
		
	}
}
