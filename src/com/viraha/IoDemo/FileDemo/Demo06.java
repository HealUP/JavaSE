package com.viraha.IoDemo.FileDemo;

import java.io.File;

//遍历目录下的所有文件：由于一个目录下可能有别的子目录，而子目录下又有可能有别的文件，要想遍历所有文件，用listFile()返回一个File对象数组，之后再递归
public class Demo06 {
    public static void main(String[] args) {
        File file = new File("D:/Demo");
        fileDir(file);//调用fileDir方法

    }

    public static void fileDir(File dir){//形参传入文件对象
        File[] files = dir.listFiles();//返回一个File对象数组
        for (File file : files) {
            if (file.isDirectory()){//如果这是一个目录
                fileDir(file);//递归调用，再判断
            }else System.out.println(file.getAbsoluteFile());//是文件就输出其路径 当作对文件的遍历了
        }
    }
}
