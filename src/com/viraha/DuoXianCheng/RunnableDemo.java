package com.viraha.DuoXianCheng;

//创建线程方式2 实现runnable接口
public class RunnableDemo implements Runnable{
//    重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            System.out.println("正在运行中"+i);
        }
    }
//main主线程
    public static void main(String[] args) {
//思路：执行线程先创建runnable实现类的对象，继续创建一个Thread对象，放入runnable接口实现类，再调用start方法
        RunnableDemo runnableDemo = new RunnableDemo();//先创建runnable实现类的对象
        Thread thread = new Thread(runnableDemo);//继续创建一个Thread对象，放入runnable接口实现类
        thread.start();//再调用start方法
        /*以上两行代码可以简写为：
        new Thread(runnableDemo).start();
         */

        for (int i = 0; i < 100; i++) {
            System.out.println("多线程"+i);
        }

    }
}
