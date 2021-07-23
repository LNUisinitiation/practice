package com.lnu.exer;

/**
 * 一道面试题
 *
 * @author LiYimin
 * @create 2021-07-20 20:36
 */
public class StringTest {

    String str = new String("good");
    char[] ch = {'t','e','s','t'};

    public void change(String str, char ch[]){
        str = "test ok";
        ch[0] = 'b';
        System.out.println(str);
    }

    public static void main(String[] args){
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);
        System.out.println(ex.ch);
        ex.change(ex.str, ex.ch);
    }
}
