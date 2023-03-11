package com.Heimajinjie.Jihe.Map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//���ϵģ��̰߳�ȫ��Map��ʵ���࣬����������,ʵ����Properties��дjdbc.properties�����ļ�
//Hashtable:������ʹ�ã�
//        -----Properties�����������ļ�����ֵ����String
//������ʾ���������ݿ⣬�������ļ���ȡ�û���������  �漰��io��
public class TestHashTable {
    public void test06() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("jdbc.properties")));//�����ļ� Ҫ���ļ��ŵ�������
       String user =  properties.getProperty("user");
        System.out.println(user);
        String password = properties.getProperty("password");
        System.out.println(password);
    }


    //������
    public static void main(String[] args) {
        try {
            new TestHashTable().test06();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
