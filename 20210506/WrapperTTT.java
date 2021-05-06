package com.lnu.exer3;

import org.junit.Test;

public class WrapperTTT {
	@Test
	public void test2() {
		Integer in1 = new Integer(12); //The constructor Integer(int) is deprecated since version 9
		
		int i1 = in1.intValue();
		System.out.println(i1 + 1);
		
		Integer in2 = Integer.valueOf(100); //替换Integer in1 = new Integer(100);
		System.out.println(in2);
		
		Float f1 = new Float(12.3);
		float f2 = f1.floatValue();
		System.out.println(f2 + 1);
		
		
	}
	
	public void test3() {
		Integer in2 = new Integer(12);
		int i2 = in2.intValue();
		System.out.println(i2 + 1);
		
		Float f1 = new Float(12.3);
		float f2 = f1.floatValue();
		System.out.println(f2 + 1);
	}
	
	@Test
	public void test4() {
		Integer int1 = new Integer(100);
		
		int1.byteValue();
		
		System.out.println(int1);
		System.out.println(int1.toString());
		
		int i1 = int1.intValue();
		System.out.println(i1);
		
		Integer int2 = Integer.valueOf(i1);
		System.out.println(int2.toString());
		System.out.println(int2);
		int i2 = int2.intValue();
		System.out.println(i2);
		
		Float f1 = new Float(12.3);
		Float f2 = Float.valueOf(12.3f);
		Double d1 = Double.valueOf(12.3);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(d1);
		float f3 = f1.floatValue();
		float f4 = f2.floatValue();
		double d2 = d1.doubleValue();
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(d2);
	
		
		}
	@Test
	public void test6() {
		Integer in1 = new Integer(12);
		
		Integer in2 = Integer.valueOf(12);
		
		int i1 = in1.intValue();
		System.out.println(i1);
		
	}
	
	public void test7() {
		
		Integer in1 = new Integer(12);	
		Integer in2 = Integer.valueOf(12);	
		int i1 = in1.intValue();
		System.out.println(i1);
		
		Integer in1 = new Integer(12);
		Integer in2 = Integer.valueOf(12);
		int i1 = in1.intValue();
		System.out.println(i1);
		
		Integer in3 = new Integer(12);
		Integer in4 = Integer.valueOf(12);
		int i2 = in3.intValue();
		System.out.println(i2);
		
		Float f1 = new Float(12.3);
		Float f2 = Float.valueOf(12.3f);
		float f3 = f2.floatValue();
		
		Float f4 = new Float(12.3);
		Float f5 = Float.valueOf(12.3f);
		float f4 = f4.floatValue();
		
		Float f6 = new Float(12.3);
		Float f7 = Float.valueOf(12.3f);
		float f8 = f7.floatValue();
		
		Integer in1 = new Integer(12);
		Integer in2 = Integer.valueOf(12);
		int i1 = in2.intValue();
		
	}
	
	
}


































