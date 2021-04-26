package com.lnu.exer;

public class Kids extends ManKind {
	
	//属性
	private int yearsOld;
	
	//构造器
	public Kids(int yearsOld) {
		this.yearsOld = yearsOld;
	}
	public Kids() {
	}

	//方法
	public void printAge() {
		System.out.println("I am " + yearsOld + " years old.");
	}
	
	//公共方法
	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}
	public int getYearsOld() {
		return yearsOld;
	}
}
