package com.Heimajinjie.JavaApi.Date;
/*一个空构造  一个含参数构造 一个*/

import java.util.Date;

public class Demo02 {
    public static void main(String[] args) {
        Demo001();
        Demo002();
        Demo003();

    }


    //带参数  把毫秒值转化成日期
    private static void Demo002() {
        Date dar = new Date(0L);
        System.out.println(dar);
    }

    //空参数   返回当前的
    private static void Demo001() {
        Date date = new Date();
        System.out.println(date);
    }

    //    getTime           把日期转换成毫秒   返回1970 年到现在多少毫秒
    private static void Demo003() {
        Date da = new Date();
        long time = da.getTime();//time 是long类型的
        System.out.println(time);

    }
}
//空参数  返回当前
//带参数  从1970 1.1.  00:00开始