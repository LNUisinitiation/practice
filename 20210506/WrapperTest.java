package com.lnu.exer3;

import org.junit.Test;

/*
 * 包装类的使用
 * 
 */
public class WrapperTest {

	//包装类转换为基本数据类型
	@Test
	public void test2() {
		Integer in1 = new Integer(12);
		
		int i1 = in1.intValue();
		System.out.println(i1 + 1);
		
		Float f1 = new Float(12.3);
		float f2 = f1.floatValue();
		System.out.println(f2 + 1);
	}
	
	//基本数据类型转为对应的包装类:调用包装类的构造器
	@Test
	public void test1() {
		
		int num1 = 10;
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());
		System.out.println(in1);
		
		Integer in2 = new Integer("123");
		System.out.println(in2.toString());
		System.out.println(in2); //本质上也是123
		
		//报异常
//		Integer in3 = new Integer("123abc"); //加上abc就不可以了
//		System.out.println(in3);
		
		Float f1 = new Float(12.3); //double
		Float f2 = new Float(12.3f); //加f之后，是float
		Float f3 = new Float("12.3");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true");
		Boolean b3 = new Boolean("true123");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3); //false
	}
}
