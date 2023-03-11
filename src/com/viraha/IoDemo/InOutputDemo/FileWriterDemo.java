package com.viraha.IoDemo.InOutputDemo;

import java.io.FileWriter;
import java.io.IOException;

//输出流写入内容到文件
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter("Dest/fileWriter.txt" ,true);//可传入true，追加内容
//            String str = "把我写进书里！";
            String str = "谢谢！";
            writer.write(str);//将数据写入
        } finally {
            if (writer != null){
                writer.close();
            }
        }
        System.out.println("已关闭资源！");

    }
}
