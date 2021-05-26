package com.lnu.java;

/**
 * 例子：创建三个窗口卖票，总票数为100张，使用实现Runnable接口的方式
 * 方式一：使用同步代码块的方式解决实现Runnable接口的线程安全问题：
 *            synchronized(同步监视器){
 *                //需要被同步的代码
 *            }
 * @author LiYimin
 * @create 2021-05-24 22:00
 */
class Window1 implements Runnable{

    private int ticket = 100;
//    Object obj = new Object();
    @Override
    public void run() {
        while (true) {
//            synchronized(obj) {
            synchronized(this) {//此时的this：唯一的Window1的对象
                if (ticket > 0) {

                    try {
                        Thread.sleep(0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }

    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        Thread t4 = new Thread(w);

        t1.setName("窗口1：");
        t2.setName("窗口2：");
        t3.setName("窗口3：");
        t4.setName("窗口4：");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

