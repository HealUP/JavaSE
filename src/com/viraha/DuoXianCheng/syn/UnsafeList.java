package com.viraha.DuoXianCheng.syn;

import java.util.ArrayList;
import java.util.List;

//线程不安全的集合 List
public class UnsafeList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10000; i++) {//同一瞬间，存到list了，被覆盖了，所以不够10000
            //创建线程
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

// 把线程的名字存起来
//打印线程的个数  应该为10000
// 下一节，讲怎么变得安全  本案例已经让该线程变得安全，添加了 synchronized块