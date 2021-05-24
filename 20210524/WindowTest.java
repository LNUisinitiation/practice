package com.lnu.java;

/**
 * 例子：创建三个窗口卖票，总票数为100张
 *
 * 存在线程的安全问题，待解决
 *
 * @author LiYimin
 * @create 2021-05-24 20:24
 */
class Window {

    private static int ticket = 100;//票的数量

//    public static int i = 0;
    @Override
    public void run() {

        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                ticket--;
//                i++;
//                System.out.println(Thread.currentThread().getName() + i + "***");
            }else{
                break;
            }
        }
    }
}
public class WindowTest {
    public static void main(String[] args) {
//        Window t1 = new Window();
//        t1.start();
//        Window t2 = new Window();
//        Window t3 = new Window();
//        t2.start();
//        t3.start();
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();

        t1.setName("窗口1：");
        t2.setName("窗口2：");
        t3.setName("窗口3：");

        t1.start();
        t2.start();
        t3.start();


    }
}
