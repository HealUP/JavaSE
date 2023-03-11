package com.viraha.IoDemo.byteToChar;

import java.io.*;

//将字节流转换为字符流  只能针对文本转转换  文本转换数据会丢失
/*如果是音频文件、图片、歌曲，就用字节流好点，
如果是关系到中文(文本)的，用字符流好点*/
public class Demo {
    //字节流转换为字符流

    public static void main(String[] args) throws IOException {
        //将字节输入流转换为字符输入流
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("random.txt"));
        //赋予字符流输入流对象缓冲区
        BufferedReader br = new BufferedReader(inputStreamReader);

        //将字节输出流转换为字符输出流
        OutputStreamWriter outputStreamWriter =new OutputStreamWriter(new FileOutputStream("Dest/random03.txt"));
        //赋予字符流输出流对象缓冲区
        BufferedWriter bw = new BufferedWriter(outputStreamWriter);

        String str;
        try {
            while ((str = br.readLine())!=null){
                bw.write(str);//输出读取到的文件内容
            }
        } finally {
            try {
                if (br != null){
                    br.close();
                }
                if (bw !=null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("已关闭资源!");
        }


    }
}
