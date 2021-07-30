package com.lnu.java2;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author LiYimin
 * @create 2021-07-24 22:13
 */
public class CompareToTest {

    @Test
    public void test1(){
        Person[] p1 = new Person[3];
        p1[0] = new Person("Tom",10);
        p1[1] = new Person("Amy",15);
        p1[2] = new Person("Mike",13);

        Arrays.sort(p1);

        System.out.println(Arrays.toString(p1));;
    }
}
