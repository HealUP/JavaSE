package com.viraha.IoDemo.FileDemo;

import java.io.File;

//1 ��ȡĿ¼�µ��ļ� 2��ȡĿ¼��ָ�����ļ�
public class Demo03 {
    public static void main(String[] args) {
        File file1 = new File("D:\\Demo");
        //������ڸ�Ŀ¼�����ȡ��Ŀ¼�µ������ļ������֡�
        if (file1.isDirectory()){
            String[] name = file1.list();
            for (String s : name) {
                System.out.println(s);
            }
        }
    }
}
