package com.viraha.IoDemo.BufferDemo;
//使用缓冲流实现文本的复制
/*一个重要的方法：readLine()用于一次读取一行文本,构造方法中分别接收FileReader和FileWriter类型的参数作为对象
* */
import java.io.*;

public class BufferReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bfReader = new BufferedReader(new FileReader("random.txt"));
        BufferedWriter bfWriter = new BufferedWriter(new FileWriter("Dest/radomDeom.txt"));

        String str;//记录读取的str
        //每次读取一行，循环判断是否读到末尾
        try {
            while ((str = bfReader.readLine()) !=null){
                bfWriter.write(str);
                bfWriter.newLine();//换行符
            }
        } finally {

            try {
                if (bfReader != null){
                    bfReader.close();
                }
                if (bfWriter != null){
                    bfWriter.close();//一定要close()关闭资源，否则会导致在缓冲区的数据没有被写入！！
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("已关闭资源！");
        }
    }
}
