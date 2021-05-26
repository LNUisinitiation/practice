package com.lnu.java1;

/**
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 *
 * @author LiYimin
 * @create 2021-05-26 19:06
 */
public class BankTest {
}

class Bank {
    //public static boolean isFlag = true; 自己写的方式
    private Bank() {

    }

    private static Bank instance = null;

    public static Bank getInstance() {//此时的同步监视器是:Bank.class
        //方式一：效率稍差
//        synchronized (Bank.class) {
//            if (instance == null) {
//
//                instance = new Bank();
//            }
//            return instance;
//         }
        //方式二：效率更高
        if (instance == null) {

            synchronized (Bank.class) {
                if (instance == null) {

                    instance = new Bank();
                }
            }
        }
        return instance;
        //自己写的方式：
//        if (isFlag) {
//            synchronized (Bank.class) {
//                if (instance == null) {
//                    instance = new Bank();
//                    isFlag = false;
//                    return instance;
//                }
//            }
//
//        }else{
//            return instance;
//        }

    }
}