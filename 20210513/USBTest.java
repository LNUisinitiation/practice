package com.lnu.exer10;

/*
 * 接口的使用
 * 1.接口使用上也满足多态性
 * 
 * USB usb 这是接口的声明，方便用来多态
 */
public class USBTest {
	public static void main(String[] args) {
		
		Computer com = new Computer();
		//1.创建了接口的非匿名实现类的非匿名对象
		Flash flash = new Flash();
		com.transferData(flash);
		//2.创建了接口的非匿名实现类的匿名对象
		com.transferData(new Printer());
		//3.创建了接口的匿名实现类的非匿名对象
		USB phone = new USB() {

			@Override
			public void start() {
				System.out.println("手机开始工作");
			}

			@Override
			public void stop() {
				System.out.println("手机结束工作");
			}
			
		};
		com.transferData(phone);
		//4.创建了接口的匿名实现类的匿名对象
		com.transferData(new USB() {

			@Override
			public void start() {
				System.out.println("PS5开始工作");
			}

			@Override
			public void stop() {
				System.out.println("PS5结束工作");
			}
			
		});
		
	}
}

class Computer{
	
	public void transferData(USB usb) {//USB usb = new Flash();
		usb.start();
		
		System.out.println("具体的传输数据的细节");
		
		usb.stop();
	}
	
}

interface USB{//接口实际上就是定义了一种规范
	//在USB接口中没有具体的方法体，所以只提供抽象方法
	void start();
	
	void stop();
}

class Flash implements USB{

	@Override
	public void start() {
		System.out.println("U盘开启工作");
	}

	@Override
	public void stop() {
		System.out.println("U盘结束工作");
	}
	
}

class Printer implements USB{

	@Override
	public void start() {
		System.out.println("打印机开启工作");
	}

	@Override
	public void stop() {
		System.out.println("打印机结束工作");
	}
	
}




























