package com.viraha.IoDemo.InOutputDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//ʹ�û����� ��ʵ���ļ��ĸ���
public class FileCopy02 {
    public static void main(String[] args) throws IOException {
        //����һ���ֽ�������
        FileInputStream in = new FileInputStream("Source/demo.txt");

        //����һ���ֽ������
        FileOutputStream out = new FileOutputStream("Dest/out01demo.txt");
        //���û�������д�ļ�������һ���ֽ�����
        byte[] buff = new byte[1024];

        //����һ��int���͵ı��� ����ס��ȡ���뻺�������ֽ���
        int len = 0;
        //��ȡϵͳ��ǰʱ��
        long startTime = System.currentTimeMillis();

        //whileѭ�� ���ж��Ƿ����ĩβ ����-1  д��
        try {
            while ((len = in.read(buff))!= -1){//read��ȡ���Ǵ��������������ֽ�
                out.write(buff,0,len);//�ӵ�һ���ֽڿ�ʼ����0��д�볤��Ϊlen�ĳ���
            }
        } finally {//�ر���Դ
            try {
                if (in !=null){
                    in.close();
                }
                if (out != null){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("�ѹر���Դ��");
        }
        //��ȡ��ǰϵͳʱ��
        long endTime = System.currentTimeMillis();
        //��� ����ʱ��
        System.out.println("����ʱ���ǣ�"+ (endTime - startTime) + "ms" );

//      try...finally  {try...catch..}  �ر���Դ

    }
}
