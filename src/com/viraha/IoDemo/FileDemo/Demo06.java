package com.viraha.IoDemo.FileDemo;

import java.io.File;

//����Ŀ¼�µ������ļ�������һ��Ŀ¼�¿����б����Ŀ¼������Ŀ¼�����п����б���ļ���Ҫ����������ļ�����listFile()����һ��File�������飬֮���ٵݹ�
public class Demo06 {
    public static void main(String[] args) {
        File file = new File("D:/Demo");
        fileDir(file);//����fileDir����

    }

    public static void fileDir(File dir){//�βδ����ļ�����
        File[] files = dir.listFiles();//����һ��File��������
        for (File file : files) {
            if (file.isDirectory()){//�������һ��Ŀ¼
                fileDir(file);//�ݹ���ã����ж�
            }else System.out.println(file.getAbsoluteFile());//���ļ��������·�� �������ļ��ı�����
        }
    }
}
