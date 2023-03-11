package com.viraha.IoDemo.FileDemo;

import java.io.File;

//1 获取目录下的文件 2获取目录下指定的文件
public class Demo03 {
    public static void main(String[] args) {
        File file1 = new File("D:\\Demo");
        //如果存在该目录，则获取该目录下的所有文件的名字、
        if (file1.isDirectory()){
            String[] name = file1.list();
            for (String s : name) {
                System.out.println(s);
            }
        }
    }
}
