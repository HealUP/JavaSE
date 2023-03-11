package com.viraha.IoDemo.InOutputDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//ʵ���ļ��ĸ���  �������������һ��ʹ��
public class FileCopy {
    public static void main(String[] args) throws IOException {
        //����һ���ļ����ֽ�������
        FileInputStream in = new FileInputStream("Source/demo.txt");//ѡ���Ƶ��ļ�Դ
        //����һ���ļ����ֽ������
        FileOutputStream out = new FileOutputStream("Dest/outDemo.txt");//ѡ��Ŀ�꣨������ļ�����
        //��סÿ�ζ�ȡ��һ���ֽ�
        int len = 0;
        //��ȡ��ǰϵͳʱ��
        long startTime = System.currentTimeMillis();
        //��ȡ��д��
        try {
            while ((len = in.read()) != -1) {
                out.write(len);//����ȡ�����ֽ�д��
            }
        } finally {//finally�����һ����ִ�У�
            try {
                if (in != null){//�ر�������
                    in.close();
                }
                if (out != null){//�ر������
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("�ѹر���Դ��");
        }
        //��ȡ��ǰϵͳʱ��
        long endTime = System.currentTimeMillis();
        System.out.println("�����ļ�����ʱ�䣺"+(endTime - startTime) + "ms");
    }
}

