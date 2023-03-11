package com.Heimajinjie.javaIo.demo;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class CopyOfFile {
    public static void main(String[] args) throws Exception{
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(new File("豪哥.jpg")));
        BufferedOutputStream bos = new BufferedOutputStream(new
                FileOutputStream(
                new File("豪哥.jpg")));
        byte[] b=new byte[1024];
        int len=-1;
        while((len=bis.read(b))!=-1){
            bos.write(b, 0, len);
        }
        bos.close();
        bis.close();
        System.out.print("文件复制成功！");
    }
}

