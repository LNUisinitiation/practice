package com.lnu.team.service;

import com.lnu.team.domain.Employee;
import static com.lnu.team.service.Data.*;//Data下的所有静态结构，所以是import static
/**
 * 
 * @Description 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 * @author LiYimin	Email:1589810996@qq.com
 * @version v1.0
 * @date 2021年5月17日下午7:56:58
 */
public class NameListService {

	private Employee[] employees;
	/**
	 * 给employees及数组元素进行初始化
	 */
	public NameListService() {
		employees = new Employee[EMPLOYEES.length];
		
		for(int i = 0;i < employees.length;i++) {
			int type = Integer.parseInt(EMPLOYEES[i][0]);
			switch(type) {
			case EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary)
				break;
			case PROGRAMMER:
				break;
			case ARCHITECT:
				break;
			}
		}
	}
	
	public Employee[] getAllEmployees() {
		return null;
	}
	
	public Employee getEmployee(int id) {
		return null;
	}
	
}
