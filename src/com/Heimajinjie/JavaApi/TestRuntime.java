package com.Heimajinjie.JavaApi;

import com.sun.xml.internal.fastinfoset.sax.Properties;

import java.io.IOException;

//RunTime类
/*
* 1、通过该类的实例对象来获取虚拟机的相关信息，只能通过getRuntime()*/
public class TestRuntime {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理机个数:"+rt.availableProcessors()+"个");
        System.out.println("空闲内存数量："+rt.freeMemory()/1024/1024+"M");//字节为单位的，换算成M
        System.out.println("最大可用内存数量："+rt.maxMemory()/1024/1024+"M");
        System.out.println("总可用内存数量："+rt.totalMemory()/1024/1024+"M");
        //打开记事本
      Process process =  rt.exec("Time.exe");//打开Time倒计时应用程序，自己写的 返回1个Process对象
        try {//睡觉3秒
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //杀掉
        process.destroy();
    }
}
