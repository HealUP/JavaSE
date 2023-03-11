package com.viraha.IoDemo.InOutputDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//使用缓冲区 来实现文件的复制
public class FileCopy02 {
    public static void main(String[] args) throws IOException {
        //创建一个字节输入流
        FileInputStream in = new FileInputStream("Source/demo.txt");

        //创建一个字节输出流
        FileOutputStream out = new FileOutputStream("Dest/out01demo.txt");
        //采用缓冲区读写文件，定义一个字节数组
        byte[] buff = new byte[1024];

        //定义一个int类型的变量 来记住读取读入缓冲区的字节数
        int len = 0;
        //获取系统当前时间
        long startTime = System.currentTimeMillis();

        //while循环 并判断是否读到末尾 即：-1  写入
        try {
            while ((len = in.read(buff))!= -1){//read读取的是存放在数组里面的字节
                out.write(buff,0,len);//从第一个字节开始，即0，写入长度为len的长度
            }
        } finally {//关闭资源
            try {
                if (in !=null){
                    in.close();
                }
                if (out != null){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("已关闭资源！");
        }
        //获取当前系统时间
        long endTime = System.currentTimeMillis();
        //输出 消耗时间
        System.out.println("消耗时间是："+ (endTime - startTime) + "ms" );

//      try...finally  {try...catch..}  关闭资源

    }
}
