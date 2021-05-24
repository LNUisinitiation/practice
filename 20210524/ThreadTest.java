package com.lnu.java;

/**
 * 多线程的创建
 *
 * @author LiYimin
 * @create 2021-05-24 16:45
 */
public class ThreadTest {
    public static void main(String[] args) {

    }

}

class MyThread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
