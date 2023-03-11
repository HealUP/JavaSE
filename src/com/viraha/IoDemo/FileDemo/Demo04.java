package com.viraha.IoDemo.FileDemo;

import java.io.File;
import java.io.FilenameFilter;

//2��ȡĿ¼��ָ�����ļ�
public class Demo04 {
    public static void main(String[] args) {
        //�����ļ�����
        File file = new File("D:/Demo");
        //��������������
        FilenameFilter filenameFilter = new FilenameFilter() {//ʵ�ֽӿڵĳ��󷽷�
            @Override
            public boolean accept(File dir, String name) {
                File currentFile = new File(dir,name);
                //����ļ���.txt��β����true,���򷵻�false
                if (currentFile.isFile()&&name.endsWith(".txt")){
                    return true;
                }
                return false;
            }
        };
        if (file.exists()){//���ļ������Ӧ��Ŀ¼����
            String[] list = file.list(filenameFilter);//��list��������ֵ���ַ����ļ���  ������String����
            for (String s : list) {
                System.out.println(s);
            }

        }
    }
}
