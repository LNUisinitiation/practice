package com.lnu.java;

/**
 * 例子：创建三个窗口卖票，总票数为100张，使用继承Thread类的方式
 * 方式一：使用同步代码块的方式解决继承Thread类的线程安全问题：
     *      synchronized(同步监视器){
     *          //需要被同步的代码
     *      }
 * @author LiYimin
 * @create 2021-05-26 16:32
 */
class Window2 extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {

        while (true) {

            synchronized (Window2.class) {//类也是对象
                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(this.getName() + ":卖票，票号为:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }

        }
    }
}
public class WindowTest2 {

    public static void main(String[] args) {

        Window2 w1 = new Window2();
        Window2 w2 = new Window2();
        Window2 w3 = new Window2();

        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();

    }


}

