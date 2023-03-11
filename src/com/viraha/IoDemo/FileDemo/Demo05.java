package com.viraha.IoDemo.FileDemo;

import java.io.File;
import java.io.FilenameFilter;

//����Ŀ¼�µ��ļ�
/*1����Ŀ¼��û����Ŀ¼�ˣ���list()��������ȡ��Ŀ¼�����е��ļ������֣�����һ����������
* 2������Ŀ¼�����б����Ŀ¼����Ŀ¼��Ҳ���ܴ����ļ��������Ҫ��ȡһ��Ŀ¼��ָ�����ļ��������ص�list(FilenameFilter)����������Ҫ����һ������FilenameFilter���˲���Ϊ�ӿ�
* Ҫʵ�ָýӿ��µ����еĳ��󷽷�������һ���������飬�ýӿڳ��󷽷�ֻ��һ����accept() ���ԣ�Ҫ��д�ó��󷽷�*/
public class Demo05 {
    public static void test01(){
        //����File�ļ�����
        File file = new File("D:/Demo");
        if (file.isDirectory()){//�ж�File�����Ӧ��Ŀ¼�Ƿ���ڣ��������ھ�����
            //��ø�Ŀ¼���ļ��������ļ���  String����
            String[] list = file.list();
            for (String s : list) {
                System.out.println(s);
    }
        }
    }

    public static void test02(){
        //����File ����
        File file = new File("D:/Demo/demo");


        //��������������
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File currentFile = new File(dir,name);
                if (currentFile.isFile()&&name.endsWith(".java")){//�Ǹ��ļ�����.java��β
                    return true;
                }
                return false;
            }
        };

        //�жϸ��ļ��Ƿ����
        if (file.exists()){
            String[] list = file.list(filter);
            for (String s : list) {
                System.out.println(s);
            }
        }

    }
    public static void main(String[] args) {
//            test01();
        test02();

    }
}
