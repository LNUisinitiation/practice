package com.lnu.java2;

import org.junit.Test;

/**
 * 涉及到String类与其他结构之间的转换
 *
 * @author LiYimin
 * @create 2021-07-21 22:19
 */
public class StringTest1 {

    /*
    复习：
    String 与基本数据类型、包装类之间的转换

    String -> 基本数据类型、包装类：调用包装类的静态方法：parseXxx(str)
    基本数据类型、包装类 -> String:调用String重载的静态方法valueOf(xxx)
     */

    @Test
    public void test1(){
        String str1 = "123";
//        int num = (int)str1;//错误的，只有有子父类关系的才可以强转
        int num = Integer.parseInt(str1);

        String str2 = String.valueOf(num);//"123"
        String str3 = num + "";//只要其中有一个是变量，结果就在堆中
        System.out.println(str1 == str3);

    }
}
