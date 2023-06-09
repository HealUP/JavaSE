package com.viraha.reflection;

import java.lang.annotation.ElementType;

//所有类型的Class
public class Test03 {
    public static void main(String[] args) {
        Class c1 = Object.class;//类
        Class c2 = String[].class;//一维数组
        Class c3 = Class.class;//类
        Class c4 = int[][].class;//二维数组
        Class c5 = ElementType.class;//枚举
        Class c6 = Override.class;//注解
        Class c7 = void.class;//空
        Class c8 = Comparable.class;//接口
        Class c9 = Integer.class;//基本数据类型

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

        //创建两个不同的数组，只要元素类型是一样的，就是同一个Class
        int a [] = new  int [100];
        int b [] = new  int [10];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());

    }
}
