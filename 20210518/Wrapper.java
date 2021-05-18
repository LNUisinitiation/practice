package com.lnu.exer13;

import org.junit.Test;

public class Wrapper {

	@Test
	public void test1() {
		Integer in1 = new Integer(12);
		Integer in2 = Integer.valueOf(1);
		int i1 = in1.intValue();
		int i2 = in2.intValue();
		
		Float f1 = 10f;
		Double d1 = 12.3;
		int i3 = in1;
		float f2 = f1;
		
		//基本数据类型、包装类--->String类型
		String str1 = String.valueOf(in1);
		String str2 = String.valueOf(in2);
		String str3 = String.valueOf(false);
		String str4 = String.valueOf(false);
		String str5 = String.valueOf(false);
		String str6 = String.valueOf(false);
		String str7 = String.valueOf(false);
		String str8 = String.valueOf(false);
		
		//String类型--->基本数据类型、包装类
		int i10 = Integer.parseInt(str8);
		int i20 = Integer.parseInt(str8);
		int i30 = Integer.parseInt(str8);
		int i40 = Integer.parseInt(str8);
		int i50 = Integer.parseInt(str8);
		Integer in10 = Integer.parseInt(str8);
		Float f10 = Float.parseFloat(str8);
		Double d10 = Double.parseDouble(str8);
		double d20 = Double.parseDouble(str8);
		Integer in20 = Integer.parseInt(str8);
		
	}
}




















