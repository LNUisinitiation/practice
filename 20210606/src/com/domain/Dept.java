package com.domain;

public class Dept {
	private int deptId;
	private String deptName;
	private int empNum;
	public Dept() {
		super();
	}
	public Dept(int deptId, String deptName, int empNum) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.empNum = empNum;
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
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	
}
