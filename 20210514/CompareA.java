package com.lnu.exer11;
/*
 * 静态方法可以直接使用接口来调用
 */
public interface CompareA {

	//静态方法 有方法体了子类、实现类就不用重写了
	public static void method1() {
		System.out.println("CompareA:北京");
	}
	
	//默认方法
	public default void method2() {
		System.out.println("CompareA:上海");
	}
	default void method3() {
		System.out.println("CompareA:上海");
	}
}
