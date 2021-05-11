package com.lnu.exer8;

public class TemplateTest {
	public static void main(String[] args) {
		
		subTemplate t = new subTemplate();
		
		t.spendTime();
		System.out.println("***************");
		
		
	}

}

abstract class Template{
	
	//计算某段代码执行所需花费的时间
	public void spendTime() {
			
		long start = System.currentTimeMillis();//1970年到现在的时间数
		
		code();//不确定的部分、易变的部分 this.code()
		
		long end = System.currentTimeMillis();
	
		System.out.println("花费的时间为： " +  (end - start));
	}
		
	public abstract void code();
	
	
}

class subTemplate extends Template{

	@Override
	public void code() {
		
		for(int i = 2;i <= 1000;i++) {
			boolean isFlag = true;
			for(int j = 2;j <= Math.sqrt(i);j++) {
				
				if(i % j == 0) {
					isFlag = false;
					break;
				}
			}
			if(isFlag) {
				System.out.println(i);
			}
		}
	}
	
	
}













