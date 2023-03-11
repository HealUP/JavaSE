package com.viraha.IoDemo.BufferDemo;

import java.io.*;

//练习：使用字节缓冲流来复制文件：构造方法中分别接收InputStream和OutputStream类型的参数作为对象
/*实现过程： 源设备->>字节流->>字节缓冲流===>应用程序===>字节缓冲流--->字节流---->目标设备
* */
public class BufferInoutStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建一个带缓冲区的输入流 内部定义了一个大小为8192个字节的数组
        BufferedInputStream bfIn = new BufferedInputStream(new FileInputStream("Source/demo.txt"));//这里使用了匿名对象

        //创建一个带缓冲区的输出流 内部定义了一个大小为8192个字节的数组
        BufferedOutputStream bfOut = new BufferedOutputStream(new FileOutputStream("Dest/Bufferdemo.txt"));
        //定义一个int类型的变量，记录当前读取的字节数
        int len  = 0;//这里不用具体值?

        // 循环读取，try..finally..包裹try...catch
        try {
            while ((len = bfIn.read()) != -1){
                bfOut.write(len);
            }
        } finally {
            try {
                if (bfIn != null){
                    bfIn.close();
                }
                if (bfOut != null){
                    bfOut.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("已成功关闭资源！");
        }


    }
}
