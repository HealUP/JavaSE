package com.Heimajinjie.JavaApi.Date.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
练习：计算一个人从出生到现在活了多少天
思路：1、 使用Scanner类中的next方法，获取当前的出生日期
2、使用DateFormat类中的方法parse方法，把字符串的出生日期解析为Date格式的出生日期
3、把出Date格式的出生日期转换成毫秒值  使用getTime方法
4、获取当前系统的日期，转换为毫秒值
5、当前日期的毫秒值-出生日期的毫秒值
6、把毫秒值转化成天数
！*/
public class Practice {
    public static void main(String[] args) throws ParseException {
//      1、 使用Scanner类中的next方法，获取当前的出生日期

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期：yyyy-MM-dd");
        String birthDayString=sc.next();
//        2、使用DateFormat类中的方法parse方法，把字符串的出生日期解析为Date格式的出生日期
//        使用SimpleDateFormat子类创建对象sf，进而调用parse方法
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate=sf.parse(birthDayString);//有异常，给他声明出去alt+enter
//        3、把出Date格式的出生日期转换成毫秒值  使用getTime方法
        long birthdayDateTime=birthdayDate.getTime();
//        4、获取当前系统的日期，转换为毫秒值
//     或者   long todayTime=new Date().getTime();
        Date date = new Date();
        long todayTime=date.getTime();
//        5、当前日期的毫秒值-出生日期的毫秒值
        long Time=todayTime-birthdayDateTime;

//        6、把毫秒值转化成天数
        System.out.println("你从出生到现在活了"+Time/1000/60/60/24+"天！");
    }
}
