package com.viraha.IoDemo.InOutputDemo;

import java.io.FileWriter;
import java.io.IOException;

//�����д�����ݵ��ļ�
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter("Dest/fileWriter.txt" ,true);//�ɴ���true��׷������
//            String str = "����д�����";
            String str = "лл��";
            writer.write(str);//������д��
        } finally {
            if (writer != null){
                writer.close();
            }
        }
        System.out.println("�ѹر���Դ��");

    }
}
