package com.viraha.IoDemo.InOutputDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*ʹ��FileOutputStreamд�ļ�
* 1�����ԭ�����ݣ�д�ļ�
* 2��׷���ļ�����*/
public class outputStreamDemo {
    public static void main(String[] args) throws IOException {
        //����һ���ļ��ֽ������
        FileOutputStream out = new FileOutputStream("demo.txt",true);//append����Ϊtrue������׷��ģʽ
        String str = "����һ�����׷�������ˣ�";
        //һ�����ֽ�д
        byte[] bytes = str.getBytes();//��ȡ�ַ������ֽڸ���������һ���ֽ����͵�����
        try {
            for (int i = 0; i < bytes.length; i++) {
                out.write(bytes[i]);
            }
        } finally {
            try {
                if (out != null)//out��Ϊ�գ���ر���Դ
                    out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("��ʾ���ѹرգ�");
        }


    }
}
