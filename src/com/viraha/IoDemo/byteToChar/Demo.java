package com.viraha.IoDemo.byteToChar;

import java.io.*;

//���ֽ���ת��Ϊ�ַ���  ֻ������ı�תת��  �ı�ת�����ݻᶪʧ
/*�������Ƶ�ļ���ͼƬ�������������ֽ����õ㣬
����ǹ�ϵ������(�ı�)�ģ����ַ����õ�*/
public class Demo {
    //�ֽ���ת��Ϊ�ַ���

    public static void main(String[] args) throws IOException {
        //���ֽ�������ת��Ϊ�ַ�������
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("random.txt"));
        //�����ַ������������󻺳���
        BufferedReader br = new BufferedReader(inputStreamReader);

        //���ֽ������ת��Ϊ�ַ������
        OutputStreamWriter outputStreamWriter =new OutputStreamWriter(new FileOutputStream("Dest/random03.txt"));
        //�����ַ�����������󻺳���
        BufferedWriter bw = new BufferedWriter(outputStreamWriter);

        String str;
        try {
            while ((str = br.readLine())!=null){
                bw.write(str);//�����ȡ�����ļ�����
            }
        } finally {
            try {
                if (br != null){
                    br.close();
                }
                if (bw !=null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("�ѹر���Դ!");
        }


    }
}
