package com.viraha.DuoXianCheng;

import java.text.SimpleDateFormat;
import java.util.Date;

//案例演示 案例一：模拟倒计时
public class SleepDemo02{
    public static void tenDown() throws InterruptedException {//sleep主动抛出异常
      /*  //时间数 10
        int num = 10;
        while (true){
            Thread.sleep(1000);
            System.out.println(num--);
            if (num<=0) break;
        }
*/
    }

    //main()主线程
    public static void main(String[] args) {
        //将tenDown设为静态static,可以直接调用方法，而不需要通过创建对象来调用
        //捕获一下抛出的异常
       /* 案例1：
       try {
            tenDown();//调用方法
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Date startTime = new Date(System.currentTimeMillis());//获取当前系统时间
        while(true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));//打印时间，时间格式化工厂:SimpleDateFormat("HH:mm:ss")
                startTime = new Date(System.currentTimeMillis());//再次获取当前系统时间，即更新时间 当前系统时间是会不断改变的，如果不加这一句，就每隔一秒打印一次第一次获取的系统时间了
                } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
