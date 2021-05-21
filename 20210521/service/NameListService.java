package com.lnu.team.service;

import com.lnu.team.domain.*;


import static com.lnu.team.service.Data.*;//Data下的所有静态结构，所以是import static
/**
 * 
 * @Description 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 * @author LiYimin	Email:1589810996@qq.com
 * @version v1.0
 * @date 2021年5月17日下午7:56:58
 */
public class NameListService{
	private Employee[] employees;
	
	public NameListService() {
		employees = new Employee[EMPLOYEES.length];
		
		for(int i = 0;i < employees.length;i++) {
			//获得通用的属性
			int type = Integer.parseInt(EMPLOYEES[i][0]);
			int id = Integer.parseInt(EMPLOYEES[i][0]);
			String name = EMPLOYEES[i][2];
			int age = Integer.parseInt(EMPLOYEES[i][3]);
			double salary = Double.parseDouble(EMPLOYEES[i][4]);
			
			switch(type) {
			case EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary);
				break;
			case PROGRAMMER:
				
				break;
			case DESIGNER:
				
				break;
			case ARCHITECT:
				
				break;
			}
		}
	}
	
	private Equipment creatEquipment(int index) {
		int type = Integer.parseInt(EQUIPMENTS[index][0]);
		switch(type) {
		case PC:
			return new PC(EQUIPMENTS[index][1],EQUIPMENTS[index][2]);
		case NOTEBOOK:
			int price = Integer.parseInt(EQUIPMENTS[index][2]);
			return new NoteBook(EQUIPMENTS[index][1],price);
		}
	}
}



































































































