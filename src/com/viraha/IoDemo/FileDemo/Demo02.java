package com.viraha.IoDemo.FileDemo;

import java.io.File;
import java.io.IOException;

//临时文件的创建
public class Demo02 {
    public static void main(String[] args) throws IOException {
        File deng = File.createTempFile("deng", ".java");
        deng.deleteOnExit();//JVM退出，则删除
        System.out.println(deng.isFile());//判断该对象是否事文件
        System.out.println(deng.getPath());//获取路径


    }
}
