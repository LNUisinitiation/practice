package com.lnu.java;

/**
 * 测试Thread中的常用方法
 *
 * @author LiYimin
 * @create 2021-05-24 18:55
 */
class HelloThread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {

//                try { //sleep()是静态方法，可以用Thread直接调用
//                    sleep(10);//这个sleep()，是Thread类中的方法，因为继承，所以可以直接调用
//                } catch (InterruptedException e) { //sleep()直接让系统强制阻塞
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + " " + i);
            }

            if (i % 20 == 0) {
                this.yield();
//                this.stop();
            }
        }
    }

    public HelloThread(String name){
        super(name);
    }
}
public class ThreadMethodTest {

    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("分线程一：");
//        h1.setName("线程一：");

        //设置分线程的优先级
        h1.setPriority(Thread.MAX_PRIORITY);

        h1.start();

        //给主线程命名
        Thread.currentThread().setName("主线程：");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + " " + i);
            }

//            if (i == 20) {
//                try {
//                    h1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }

//        System.out.println(h1.isAlive());
    }
}