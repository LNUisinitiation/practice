package com.lnu.java2;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author LiYimin
 * @create 2021-07-20 15:56
 */
public class Person implements Comparable{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //指明人比较大小的方式：按照年龄从低到高排序
    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person person = (Person)o;

            if(this.age > person.age){
                return 1;//返回1的作用是什么？
            }else if(this.age < person.age){
                return -1;
            }else{
//                return 0;
                return this.name.compareTo(person.name);//这一步的原理是什么？
//                return -this.name.compareTo(person.name);//加负号为什么可以按名字从高到低排序？
            }
        }

        throw new RuntimeException("传入的数据类型不一致");//运行时异常
    }


}
