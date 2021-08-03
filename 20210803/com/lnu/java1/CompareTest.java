package com.lnu.java1;

import org.junit.Test;

import java.util.Arrays;

/**
 * 一、说明：Java中的对象，正常情况下，只能进行比较： == 或 ！= 。不能使用 > 或 < 的
 *          但是在开发场景中，我们需要对多个对象进行排序，言外之意，就需要比较对象的大小。
 *          如何实现？使用两个接口中的任何一个：Comparable 或 Comparator
 * 二、
 * @author LiYimin
 * @create 2021-08-03 21:02
 */
public class CompareTest {
    /*
    Comparable接口的使用举例：自然排序
    1.像String、包装类等实现了Comparable接口，重写了compareTo(obj)方法，给出了比较两个对象大小的方式。
    2.像String、包装类重写compareTo()方法以后，进行了从小到大的排列
    3.重写compareTo(obj)的规则：
        如果当前对象this大于形参obj，则返回正整数，
        如果当前对象this小于形参对象obj,则返回负整数，
        如果当前对象this等于形参对象obj，则返回零。
    4.对于自定义类来说，如果需要排序，我们可以让自定义类实现Comparable接口，重写compareTo(obj)方法。
    在compareTo(obj)方法中指明如何排序
     */
    @Test
    public void test1(){
        String[] arr = new String[]{"AA","CC","KK","MM","GG","JJ","DD"};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        String[] arr1 = new String[]{"a","b","c","d","f","e"};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = new String[]{"b","a","f"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = new String[]{"c","z","b","a","f"};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    @Test
    public void test2(){
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("联想鼠标",34);
        arr[1] = new Goods("戴尔鼠标",43);
        arr[2] = new Goods("小米鼠标",12);
        arr[3] = new Goods("华为鼠标",65);
        arr[4] = new Goods("微软鼠标",43);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
