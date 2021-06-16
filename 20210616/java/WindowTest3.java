package com.lnu.java;

/**
 * 例子：创建三个窗口卖票，总票数为100张，使用实现Runnable接口的方式
 *方式二：使用同步方法解决实现Runnable接口的线程安全问题：
 *          public synchronized void run(){//此时的同步监视器是this
 *
 *          }
 * @author LiYimin
 * @create 2021-05-26 18:16
 */
class Window3 implements Runnable{

    private int ticket = 1000;

    @Override
    public void run() {
        while (true) {

            show();

            if (ticket <= 0) {
                break;
            }
        }
    }
    private synchronized void show(){//同步监视器:this
        if (ticket > 0) {

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket--;
        }

    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        Window3 w = new Window3();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1：");
        t2.setName("窗口2：");
        t3.setName("窗口3：");

        t1.start();
        t2.start();
        t3.start();

    }
}