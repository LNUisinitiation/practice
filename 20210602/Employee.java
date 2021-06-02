package com.lnu.experiment4;

/**
 * 
 * @Description		类的多态性－覆盖
 * @author LiYimin	Email:1589810996@qq.com
 * @version
 * @date 2021年6月2日下午12:26:55
 */
//1．创建父类 Employee(文件 Employee.java)
public class Employee {
	private int id;
	private String name;
	protected float basesalary;

	Employee(int _id, String _name, float _salary) {
		this.id = _id;
		this.name = _name;
		this.basesalary = _salary;
	}

	public float getSalary(int month) {
		return month * basesalary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

	