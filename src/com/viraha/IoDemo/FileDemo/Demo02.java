package com.viraha.IoDemo.FileDemo;

import java.io.File;
import java.io.IOException;

//��ʱ�ļ��Ĵ���
public class Demo02 {
    public static void main(String[] args) throws IOException {
        File deng = File.createTempFile("deng", ".java");
        deng.deleteOnExit();//JVM�˳�����ɾ��
        System.out.println(deng.isFile());//�жϸö����Ƿ����ļ�
        System.out.println(deng.getPath());//��ȡ·��


    }
}
