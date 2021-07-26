package com.lnu.java2;

import org.junit.Test;

/**
 * @author LiYimin
 * @create 2021-07-20 20:55
 */
public class StringMethodTest {

    @Test
    public void test2(){
        String s1 = "HelloWorld";//ctrl+shift+u 将大写转换为小写
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "abc";
        String s4 = new String ("abe");
        System.out.println(s3.compareTo(s4));

        String s5 = "辽宁大学信息学院";
        String s6 = s5.substring(4);
        System.out.println(s5);
        System.out.println(s6);

        String s7 = "辽宁大学信息学院";
        String s8 = s7.substring(2, 4);//左闭右开
        System.out.println(s8);

    }

    @Test
    public void test1(){
        String s1 = "helloworld";
        System.out.println(s1.length());//返回字符串的长度（返回的是底层的数组的长度）
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(9));
//        System.out.println(s1.charAt(10));

        System.out.println(s1.isEmpty());

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
    }
}
