package com.lnu.exer8;

public class Manager extends Employee{
		
		private double bonus;//奖金
		
		public Manager(double bonus) {
			super();
			this.bonus = bonus;
		}
		
		public Manager(String name, int id, double salary, double bonus) {
			super(name, id, salary);
			this.bonus = bonus;
		}

		public double getBonus() {
			return bonus;
		}

		public void setBonus(double bonus) {
			this.bonus = bonus;
		}

		@Override
		public void work() {
			System.out.println("管理员工，提高公司运行效率");
		} 
		
		
}

