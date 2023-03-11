package com.viraha.IoDemo.InOutputDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//新建一个文件，进行读取
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("demoinputStream.txt");
        int b = 0;//记住每次读取的一个字节
        try {
            while (true){
                b = in.read();//读取8位的字节，返回整数  英文和数字占一个字节
                if (b == -1) break;
                System.out.println(b);//读出b
            }
        } finally {//保证正常关闭
            in.close();
            System.out.println("已关闭资源！");
        }
    }
}
