package com.viraha.IoDemo.InOutputDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//实现文件的复制  输入流和输出流一起使用
public class FileCopy {
    public static void main(String[] args) throws IOException {
        //创建一个文件的字节输入流
        FileInputStream in = new FileInputStream("Source/demo.txt");//选择复制的文件源
        //创建一个文件的字节输出流
        FileOutputStream out = new FileOutputStream("Dest/outDemo.txt");//选择目标（定义好文件名）
        //记住每次读取的一个字节
        int len = 0;
        //获取当前系统时间
        long startTime = System.currentTimeMillis();
        //读取，写入
        try {
            while ((len = in.read()) != -1) {
                out.write(len);//将读取到的字节写入
            }
        } finally {//finally代码块一定会执行！
            try {
                if (in != null){//关闭输入流
                    in.close();
                }
                if (out != null){//关闭输出流
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("已关闭资源！");
        }
        //获取当前系统时间
        long endTime = System.currentTimeMillis();
        System.out.println("复制文件消耗时间："+(endTime - startTime) + "ms");
    }
}

