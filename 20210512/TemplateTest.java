package com.lnu.exer9;
/*
 * 抽象类的应用：模板方法的设计模式
 */
public class TemplateTest {
	public static void main(String[] args) {
		
		subTemplate t = new subTemplate();
		
		t.spendTime();
	}
	
}

//父类
abstract class Template{
	
	//计算执行某段代码花费的时间，什么代码，现在还不知道
	public void spendTime() {
		
		long start = System.currentTimeMillis();//1970年开始
		
		code();//方法里面调用code()方法   不确定的部分、易变的部分
		
		long end = System.currentTimeMillis();//调完code()方法之后的时间
		
		System.out.println("花费的时间为：" + (end - start));
		
	}
	
	//不确定的代码就把它写成abstract
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






































