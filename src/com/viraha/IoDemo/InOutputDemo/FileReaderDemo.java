package com.viraha.IoDemo.InOutputDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//输入流读取文件中得内容
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("reader.txt");//创建一个字符输入流
        int ch = 0;//定义一个变量用于记录读取的字符
        //循环判断是否读取到文件的末尾
        try {
            while( (ch = reader.read()) != -1){
                System.out.println((char) ch);//read()返回的是int类型的值，想要获得字符就得强转
            }
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("已关闭资源！");
        }

    }
}
