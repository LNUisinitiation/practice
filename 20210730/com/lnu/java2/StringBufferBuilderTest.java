package com.lnu.java2;

import org.junit.Test;

/**
 * 关于StringBuffer和StringBuilder的使用
 *
 * @author LiYimin
 * @create 2021-07-22 17:22
 */
public class StringBufferBuilderTest {

    @Test
    public void test2(){
        StringBuffer s1 = new StringBuffer();
        s1.append(1);
        s1.append('1');
        s1.append("1");
        System.out.println(s1);

        StringBuffer s2 = new StringBuffer("abcd");
        s2.append(111);
        s2.append("1");
        StringBuffer delete = s2.delete(0, 2);//左闭右开
        System.out.println(s2);
        System.out.println(delete);

        StringBuffer s3 = new StringBuffer("abcd");
        s3.replace(0,3,"goo");//左闭右开
        System.out.println(s3);
    }



    /*
    String、StringBuffer、StringBuilder三者的异同？
    String:不可变的字符序列；底层使用char[]存储
    StringBuffer:可变的字符序列；线程安全的，效率低；底层使用char[]存储
    StringBuilder:可变的字符序列；jdk5.0新增的，线程不安全的，效率高；底层使用char[]存储

    源码分析：
    String str = new String();//空参构造器，底层实际上是char[] value = new char[0]; 长度是0
    String str1 = new String("abc");//char[] value = new char[]{'a','b','c'};

    StringBuffer sb1 = new StringBuffer();//char[] value = new char[16]; 底层创建了一个长度是16的数组
    sb1.append('a');//相当于value[0] = 'a';
    sb1.append('b');//相当于value[1] = 'b';

    StringBuffer sb2 = new StringBuffer("abc");//char[] value = new char["abc".length() + 16];


     */

    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
//        StringBuffer reverse = sb1.reverse();
//        System.out.println(reverse);

        sb1.setCharAt(0,'m');//无返回值
        System.out.println(sb1);

        char[] value = new char["abc".length() + 16];
        String str1 = new String("abc");
        str1.length();
        System.out.println(str1.length());
    }
}
