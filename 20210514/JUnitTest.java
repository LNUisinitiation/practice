package com.lnu.exer11;

public class JUnitTest {
	public static void main(String[] args) {
		JUnitTest j1 = new JUnitTest();
		System.out.println(j1.getComparable());//j1.getComparable();
		int i1 = j1.getComparable().compareTo(j1);
		System.out.println(i1);
		
		
	}
	public Comparable getComparable() {
		
		class MyComparable implements Comparable{

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 2;
			}

			public void eat() {
				System.out.println("吃东西");
			}
			
		}
		return new MyComparable();
	}
	
	@Test
	public void test1() {
		
	}
}

