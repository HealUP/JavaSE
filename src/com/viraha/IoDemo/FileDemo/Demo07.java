package com.viraha.IoDemo.FileDemo;

import java.io.File;

//删除目录  两种情况：
/*1、该目录下仅仅只有文件，没有子目录
* 2、该目录下存在文件及别的子目录  采用递归 参照Demo06*/
public class Demo07 {
    public static void main(String[] args) {
//       test02();
       test01();

    }

    public static void test02(){
        File file = new File("D:/deleteDemo");
        deleteDir(file);//调用方法
    }

    //写一个静态删除方法
    public static void deleteDir(File dir){
        File[] files = dir.listFiles();
        //涉及删除，就要判断它存不存在
//自己加了一个捕获异常 “
        try {
            if (dir.exists()) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        deleteDir(file);//如果是个目录，递归调用
                    } else {
                        file.delete();//是文件，直接删除
                    }
                }
                //把所有文件删掉了，再删除目录(因为此时只剩下了空目录对象，)
                dir.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void test01(){//该目录仅仅包含文件
        File file = new File("D:/Demo");
        if (file.isFile()){//delete()方法，只能删除指定的文件  如果是目录删除不了 ，不允许直接删除目录：要采用递归的方式将所有文件删除后，再删除目录！
            file.delete();
        }else {
            System.out.println("包含子目录，不可删除！！");
        }

    }
}
