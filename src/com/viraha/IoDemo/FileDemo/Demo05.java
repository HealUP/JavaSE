package com.viraha.IoDemo.FileDemo;

import java.io.File;
import java.io.FilenameFilter;

//遍历目录下的文件
/*1、该目录下没有子目录了，用list()方法，获取该目录下所有的文件的名字，返回一个名字数组
* 2、若该目录下仍有别的子目录，子目录下也可能存在文件，如果需要获取一个目录下指定的文件，用重载的list(FilenameFilter)方法，就需要传入一个参数FilenameFilter，此参数为接口
* 要实现该接口下的所有的抽象方法，返回一个名字数组，该接口抽象方法只有一个，accept() 所以，要重写该抽象方法*/
public class Demo05 {
    public static void test01(){
        //创建File文件对象
        File file = new File("D:/Demo");
        if (file.isDirectory()){//判断File对象对应的目录是否存在，即：存在就运行
            //获得该目录下文件的所以文件名  String接收
            String[] list = file.list();
            for (String s : list) {
                System.out.println(s);
    }
        }
    }

    public static void test02(){
        //创建File 对象
        File file = new File("D:/Demo/demo");


        //创建过滤器对象
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File currentFile = new File(dir,name);
                if (currentFile.isFile()&&name.endsWith(".java")){//是个文件且以.java结尾
                    return true;
                }
                return false;
            }
        };

        //判断该文件是否存在
        if (file.exists()){
            String[] list = file.list(filter);
            for (String s : list) {
                System.out.println(s);
            }
        }

    }
    public static void main(String[] args) {
//            test01();
        test02();

    }
}
