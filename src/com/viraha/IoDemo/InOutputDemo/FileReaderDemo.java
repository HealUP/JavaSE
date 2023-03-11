package com.viraha.IoDemo.InOutputDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//��������ȡ�ļ��е�����
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("reader.txt");//����һ���ַ�������
        int ch = 0;//����һ���������ڼ�¼��ȡ���ַ�
        //ѭ���ж��Ƿ��ȡ���ļ���ĩβ
        try {
            while( (ch = reader.read()) != -1){
                System.out.println((char) ch);//read()���ص���int���͵�ֵ����Ҫ����ַ��͵�ǿת
            }
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("�ѹر���Դ��");
        }

    }
}
