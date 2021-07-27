package com.lnu.java2;

import org.junit.Test;

/**
 * String的使用
 *
 * @author LiYimin
 * @create 2021-07-20 14:48
 */
public class StringTest {

    @Test
    public void test4(){
        
    }

    @Test
    public void test3(){
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";//存于方法区的常量池中
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";//存于堆中
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false

    }


    @Test
    public void test1(){

        String s1 = "abc";//字面量的定义方式
        String s2 = "abc";//常量池中不会存两个相同内容的字符串
        //s1 = "hello";

        //对象用==比较的是地址值
        System.out.println(s1 == s2);//比较s1和s2的地址值
        System.out.println(s1);//hello
        System.out.println(s2);//abc

        String s4 = "abc";
        String s5 = s4.replace("a","m");
        String s6 = "NBA";
        String s7 = s6.replace("N","C");
        String s8 = s6.replace("BA","B");
        System.out.println(s5);
        System.out.println(s7);
        System.out.println(s8);

        System.out.println("s4" + " " + s4);
        System.out.println("s5" + " " + s5);
    }
}
