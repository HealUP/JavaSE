package com.viraha.DuoXianCheng.syn;

import java.util.ArrayList;
import java.util.List;

//�̲߳���ȫ�ļ��� List
public class UnsafeList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10000; i++) {//ͬһ˲�䣬�浽list�ˣ��������ˣ����Բ���10000
            //�����߳�
            new Thread(() -> {
                synchronized (list) {
                    list.add(Thread.currentThread().getName());
                }
            }).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}

// ���̵߳����ִ�����
//��ӡ�̵߳ĸ���  Ӧ��Ϊ10000
// ��һ�ڣ�����ô��ð�ȫ  �������Ѿ��ø��̱߳�ð�ȫ������� synchronized��