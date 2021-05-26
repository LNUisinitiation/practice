package com.lnu.java;

/**例子：创建三个窗口卖票，总票数为100张，使用继承Thread类的方式
 * 方式二：使用同步方法解决继承Thread类的线程安全问题：
 *           public synchronized void run(){//此时的同步监视器是this
 *
 *           }
 * @author LiYimin
 * @create 2021-05-26 18:38
 */
class Window4 extends Thread {
    private static int ticket = 1000;

    @Override
    public void run() {

        while (true) {

            show();

            if (ticket <= 0) {
                break;
            }

        }
    }

    private static synchronized void show(){//这里的同步监视器不是this(静态里面也不能调this)，是Window4.class
    //private synchronized void show(){//这里的同步监视器是this 不是同一个对象，分别是w1,w2,w3 此种解决方式是错误的
        if (ticket > 0) {

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":卖票，票号为:" + ticket);
            ticket--;
        }
    }
}
public class WindowTest4 {

    public static void main(String[] args) {

        Window4 w1 = new Window4();
        Window4 w2 = new Window4();
        Window4 w3 = new Window4();

        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();

    }


}
