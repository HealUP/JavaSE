package com.viraha.IoDemo.FileDemo;

import java.io.File;
import java.io.IOException;

//File 类的常用方法练习
public class Demo01 {
    public static void main(String[] args) throws IOException {
        //磁盘中创建文件
        File file = new File("D:\\demo01.txt");//使用绝对路径
        //如果存在这个文件就删除否则创建
        if (file.exists()){
            file.delete();
        }else {
            System.out.println(file.createNewFile()+"已创建demo01.txt文件！");//自动抛出异常
        }

        // 在磁盘中创建一层目录，在目录中创建文件
        File file1 = new File("D:\\Demo\\demo03.txt");
        //判断所要创建的目录是否存在，不存在才创建
        if (!(file1.getParentFile().exists())){
            file1.getParentFile().mkdir();//创建该目录
        }if (file1.exists()){
            file1.delete();
        }else {
            System.out.println(file1.createNewFile()+"已创建demo01.txt文件！");
        }

    }
}
