package com.lnu.experiment6;

import java.util.*;
/**
 * 
 * @Description	编写一个职员类，创建其对象，并运用 ArrayList 对其进行存储和遍历。
 * @author LiYimin	Email:1589810996@qq.com
 * @version
 * @date 2021年6月15日下午3:13:11
 */
public class Demo1 {
	public static void main(String[] args) {
		ArrayList<Clerk> al = new ArrayList<Clerk>();
//创建一个职员
		Clerk clerk1 = new Clerk("王冰冰", 20, 100000);
		Clerk clerk2 = new Clerk("冰冰", 25, 120000);
		al.add(clerk1);
		al.add(clerk2);
//遍历 al 所有的对象(数据)
		for (int i = 0; i < al.size(); i++) {
			Clerk temp = (Clerk) al.get(i);
			System.out.println("名字：" + temp.getName() + "年龄：" + temp.getAge() + "薪水：" + temp.getSal());
		}
	}
}

class Clerk {
	private String name;
	private int age;
	private float sal;

	public Clerk(String name, int age, float sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
}
