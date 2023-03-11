package com.Heimajinjie.JavaApi.Calendar;

import java.util.Calendar;
/*
*
* 2、*/
public class Demo01 {
    public static void main(String[] args) {

demo02();

    }
    private static void demo01() {
        /*public int get (int field)
       参数：传递指定的日历字段（YEAR,MONTH...）
       返回值：返回给定日历字段的值*/


        //        使用getInstance()方法获取Calendar对象
        Calendar c=Calendar.getInstance();//父类引用指向子类对象  多态

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month+1);

        int date = c.get(Calendar.DATE);
        System.out.println(date);

        int min=c.get(Calendar.MINUTE);
        System.out.println(min);



    }

    private static void demo02() {
/*public int set (int field,int value)
      将给定的日历字段设置为定值
      int field ： 传递指定的日历字段
       int value : 给指定字段设置的值*/
        Calendar c=Calendar.getInstance();
       /* c.set(Calendar.YEAR,2022);
        c.set(Calendar.DATE,9);
        c.set(Calendar.MONTH,11);
        c.set(Calendar.MINUTE,05);*/
//    同时设置年月日，set的重载方法 方法名字一样，参数列表不一样
        c.set(2021,18,17);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month+1);

        int date = c.get(Calendar.DATE);
        System.out.println(date);

        int min=c.get(Calendar.MINUTE);
        System.out.println(min);
    }

//    同时设置年月日，方法的重载


}
