package com.lnu.experiment4;
/**
 * 
 * @Description	1.创建公共类 KY4_1_P
 * 				2.创建子类
				 （1）程序功能：通过 KY4_1_P 类产生子类 KY4_2，其不仅具有父类的成员
					 变量 xm（姓名）、xh（学号），还定义了新成员变量 xy（学院）、xi（系）。
					 在程序中调用了父类的 print 方法，同时可以看出子类也具有该方法。
				 （2）编写 KY4_2.java 程序
 * @author LiYimin	Email:1589810996@qq.com
 * @version
 * @date 2021年6月2日下午12:17:20
 */
public class KY4_1_P {
	protected String xm; // 具有保护修饰符的成员变量
	protected int xh;

	void setdata(String m, int h) // 设置数据的方法
	{
		this.xm = m;
		this.xh = h;
	}
	
	public void print() // 输出数据的方法
	{
		System.out.println(xm + ", " + xh);
	}
	
}


