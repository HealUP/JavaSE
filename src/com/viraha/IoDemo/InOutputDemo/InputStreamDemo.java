package com.viraha.IoDemo.InOutputDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//�½�һ���ļ������ж�ȡ
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("demoinputStream.txt");
        int b = 0;//��סÿ�ζ�ȡ��һ���ֽ�
        try {
            while (true){
                b = in.read();//��ȡ8λ���ֽڣ���������  Ӣ�ĺ�����ռһ���ֽ�
                if (b == -1) break;
                System.out.println(b);//����b
            }
        } finally {//��֤�����ر�
            in.close();
            System.out.println("�ѹر���Դ��");
        }
    }
}
