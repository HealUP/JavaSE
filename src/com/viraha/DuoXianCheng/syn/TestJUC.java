package com.viraha.DuoXianCheng.syn;

import java.util.concurrent.CopyOnWriteArrayList;//和Callable同一个包

//并发  CopyOnWriteArrayList 线程安全的集合
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

