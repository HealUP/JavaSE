package com.viraha.DuoXianCheng.syn;

import java.util.concurrent.CopyOnWriteArrayList;//��Callableͬһ����

//����  CopyOnWriteArrayList �̰߳�ȫ�ļ���
public class TestJUC {
    public static void main(String[] args) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                copyOnWriteArrayList.add(Thread.currentThread().getName());
            }).start();
        }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(copyOnWriteArrayList.size());
        }
    }

