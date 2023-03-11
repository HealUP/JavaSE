package com.viraha.IoDemo.FileDemo;

import java.io.File;
import java.io.FilenameFilter;

//2获取目录下指定的文件
public class Demo04 {
    public static void main(String[] args) {
        //创建文件对象
        File file = new File("D:/Demo");
        //创建过滤器对象
        FilenameFilter filenameFilter = new FilenameFilter() {//实现接口的抽象方法
            @Override
            public boolean accept(File dir, String name) {
                File currentFile = new File(dir,name);
                //如果文件以.txt结尾返回true,否则返回false
                if (currentFile.isFile()&&name.endsWith(".txt")){
                    return true;
                }
                return false;
            }
        };
        if (file.exists()){//该文件对象对应的目录存在
            String[] list = file.list(filenameFilter);//该list方法返回值是字符串文件名  所以用String接收
            for (String s : list) {
                System.out.println(s);
            }

        }
    }
}
