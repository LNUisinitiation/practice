package com.lnu.exer9;


//实现按小时计算工资的员工处理
public class HourlyEmployee extends Employee{

	private int wage;//每小时的工资
	private int hour;//月工作的小时数
	
	public HourlyEmployee(String name, int number, MyDate birthday) {
		super(name, number, birthday);
	}
	
	public HourlyEmployee(String name, int number, MyDate birthday,int wage,int hour) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
	}
	
	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public double earnings() {
		return wage * hour;
	}
	
	@Override
	public String toString() {
		return "HourlyEmployee [" + super.toString() + "]";
	}
	
}
