package com.viraha.DuoXianCheng;

//创建线程方式一：继承Thread类，重写run（）方法,调用strat()开启线程
public class ThreadDemo extends Thread{
    @Override
    public void run() {
        //run方法的线程体
        for (int i = 0; i < 25; i++) {
            System.out.println("正在运行"+i);
        }
    }

    public static void main(String[] args) {
        //主线程 main
        //创建一个线程对象
        ThreadDemo threadDemo = new ThreadDemo();
        //调用strat()方法开启线程，交替执行的
        //若调用run方法，则是按顺序执行
        threadDemo.start();
//      threadDemo.run();主线程
        for (int i = 0; i < 100; i++) {
            System.out.println("多线程案例"+i);
        }
    }
}
