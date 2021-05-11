package com.lnu.exer8;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Manager manager = new Manager("库克", 1001, 5000, 50000);
		manager.work();
		
//		//多态
//		Employee employee = new Manager("库克", 1001, 5000, 50000);
//		employee.work();//实际调用的是子类重写父类的方法
//		//employee.getBonus();//错误
//		if(employee instanceof Manager) {
//			Manager m = (Manager)employee;
//			m.getBonus();
//			System.out.println(m.getBonus());
//		}
		
	}
}
