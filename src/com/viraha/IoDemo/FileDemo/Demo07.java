package com.viraha.IoDemo.FileDemo;

import java.io.File;

//ɾ��Ŀ¼  ���������
/*1����Ŀ¼�½���ֻ���ļ���û����Ŀ¼
* 2����Ŀ¼�´����ļ��������Ŀ¼  ���õݹ� ����Demo06*/
public class Demo07 {
    public static void main(String[] args) {
//       test02();
       test01();

    }

    public static void test02(){
        File file = new File("D:/deleteDemo");
        deleteDir(file);//���÷���
    }

    //дһ����̬ɾ������
    public static void deleteDir(File dir){
        File[] files = dir.listFiles();
        //�漰ɾ������Ҫ�ж����治����
//�Լ�����һ�������쳣 ��
        try {
            if (dir.exists()) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        deleteDir(file);//����Ǹ�Ŀ¼���ݹ����
                    } else {
                        file.delete();//���ļ���ֱ��ɾ��
                    }
                }
                //�������ļ�ɾ���ˣ���ɾ��Ŀ¼(��Ϊ��ʱֻʣ���˿�Ŀ¼����)
                dir.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void test01(){//��Ŀ¼���������ļ�
        File file = new File("D:/Demo");
        if (file.isFile()){//delete()������ֻ��ɾ��ָ�����ļ�  �����Ŀ¼ɾ������ ��������ֱ��ɾ��Ŀ¼��Ҫ���õݹ�ķ�ʽ�������ļ�ɾ������ɾ��Ŀ¼��
            file.delete();
        }else {
            System.out.println("������Ŀ¼������ɾ������");
        }

    }
}
