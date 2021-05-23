package com.chinasofti.entity;

import java.util.Date;

public class Emp {
	private int empId;
	private String empName;
	private double salary;
	private String inDate;
	private int deptId;
	private String deptName;
	public Emp() {
		super();
	}
	public Emp(int empId, String empName, double salary, String inDate, int deptId, String deptName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.inDate = inDate;
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getInDate() {
		return inDate;
	}
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}
