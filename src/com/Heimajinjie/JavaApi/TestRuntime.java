package com.Heimajinjie.JavaApi;

import com.sun.xml.internal.fastinfoset.sax.Properties;

import java.io.IOException;

//RunTime��
/*
* 1��ͨ�������ʵ����������ȡ������������Ϣ��ֻ��ͨ��getRuntime()*/
public class TestRuntime {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        System.out.println("���������:"+rt.availableProcessors()+"��");
        System.out.println("�����ڴ�������"+rt.freeMemory()/1024/1024+"M");//�ֽ�Ϊ��λ�ģ������M
        System.out.println("�������ڴ�������"+rt.maxMemory()/1024/1024+"M");
        System.out.println("�ܿ����ڴ�������"+rt.totalMemory()/1024/1024+"M");
        //�򿪼��±�
      Process process =  rt.exec("Time.exe");//��Time����ʱӦ�ó����Լ�д�� ����1��Process����
        try {//˯��3��
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //ɱ��
        process.destroy();
    }
}
