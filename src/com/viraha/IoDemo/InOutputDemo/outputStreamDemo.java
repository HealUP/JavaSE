package com.viraha.IoDemo.InOutputDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*使用FileOutputStream写文件
* 1、清空原有内容，写文件
* 2、追加文件内容*/
public class outputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建一个文件字节输出流
        FileOutputStream out = new FileOutputStream("demo.txt",true);//append设置为true，启用追加模式
        String str = "在上一句后面追加内容了！";
        //一个个字节写
        byte[] bytes = str.getBytes();//获取字符串的字节个数，创建一个字节类型的数组
        try {
            for (int i = 0; i < bytes.length; i++) {
                out.write(bytes[i]);
            }
        } finally {
            try {
                if (out != null)//out不为空，则关闭资源
                    out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("提示：已关闭！");
        }


    }
}
