package com.lnu.exer;

public class ManKind {
	
	//属性
	private int sex; //性别
	private int salary; //薪资
	
	//构造器
	public ManKind() {
		
	}
	public ManKind(int sex, int salary) {
		this.sex = sex;
		this.salary = salary;
	}

	//方法
	public void manOrWoman() {
		if(sex == 1) {
			System.out.println("man");
		}else if(sex == 0) {
			System.out.println("woman");
		}
	}
	public void employeed() {
//		if(salary == 0) {
//			System.out.println("no job");
//		}else {
//			System.out.println("job");
//		}
		//三元运算符
		String jobInfo = (salary == 0) ? "no job" : "job";
		System.out.println(jobInfo);
	}
	
	//公共方法
		public void setSex(int sex) {
			this.sex = sex;
		}
		public int getSex() {
			return sex;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getSalary() {
			return salary;
		}
		
}
