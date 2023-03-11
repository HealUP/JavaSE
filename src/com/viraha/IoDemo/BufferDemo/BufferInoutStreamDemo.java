package com.viraha.IoDemo.BufferDemo;

import java.io.*;

//��ϰ��ʹ���ֽڻ������������ļ������췽���зֱ����InputStream��OutputStream���͵Ĳ�����Ϊ����
/*ʵ�ֹ��̣� Դ�豸->>�ֽ���->>�ֽڻ�����===>Ӧ�ó���===>�ֽڻ�����--->�ֽ���---->Ŀ���豸
* */
public class BufferInoutStreamDemo {
    public static void main(String[] args) throws IOException {
        //����һ������������������ �ڲ�������һ����СΪ8192���ֽڵ�����
        BufferedInputStream bfIn = new BufferedInputStream(new FileInputStream("Source/demo.txt"));//����ʹ������������

        //����һ����������������� �ڲ�������һ����СΪ8192���ֽڵ�����
        BufferedOutputStream bfOut = new BufferedOutputStream(new FileOutputStream("Dest/Bufferdemo.txt"));
        //����һ��int���͵ı�������¼��ǰ��ȡ���ֽ���
        int len  = 0;//���ﲻ�þ���ֵ?

        // ѭ����ȡ��try..finally..����try...catch
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
            System.out.println("�ѳɹ��ر���Դ��");
        }


    }
}
