package com.viraha.IoDemo.FileDemo;

import java.io.File;
import java.io.IOException;

//File ��ĳ��÷�����ϰ
public class Demo01 {
    public static void main(String[] args) throws IOException {
        //�����д����ļ�
        File file = new File("D:\\demo01.txt");//ʹ�þ���·��
        //�����������ļ���ɾ�����򴴽�
        if (file.exists()){
            file.delete();
        }else {
            System.out.println(file.createNewFile()+"�Ѵ���demo01.txt�ļ���");//�Զ��׳��쳣
        }

        // �ڴ����д���һ��Ŀ¼����Ŀ¼�д����ļ�
        File file1 = new File("D:\\Demo\\demo03.txt");
        //�ж���Ҫ������Ŀ¼�Ƿ���ڣ������ڲŴ���
        if (!(file1.getParentFile().exists())){
            file1.getParentFile().mkdir();//������Ŀ¼
        }if (file1.exists()){
            file1.delete();
        }else {
            System.out.println(file1.createNewFile()+"�Ѵ���demo01.txt�ļ���");
        }

    }
}
