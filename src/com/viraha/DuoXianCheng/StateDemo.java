package com.viraha.DuoXianCheng;

public class StateDemo {
    public static void main(String[] args) throws InterruptedException {
        //lambda表达式
        Thread thread = new Thread(()->{
            //这里for循环的作用是，等待5秒 因为每一次循环都等待1秒  5s后，线程终止了
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1200);//sleep都要捕获异常
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("线程终止了！////////");

        });
        //1、观察状态
        Thread.State state = thread.getState();
        System.out.println(state);//刚创建那会  即NEW

        //2、观察启动后state的状态  打印出来
        thread.start();//启动线程

        state = thread.getState();
        System.out.println(state);//线程运行了 先是RUNNABLE，说明启动了，然后线程开始等待5秒钟，一直获取当前状态，且一直输出TIMED_WAITING

        while (state!=Thread.State.TERMINATED){
            //只要线程不终止，就一直输出状态
            Thread.sleep(1000);//让主线程延时，不要跟线程同时执行， 让线程先执行，确保一开始打印出来的是1、2
            state = thread.getState();//更新线程状态
            System.out.println(state);//即等待：TIMED_WAITING
        }
        System.out.println("主线程也终止了！因为上一个state是TERMINATED，不进入while了！");
        //线程只能启动一次，停止之后就启动不了了  不能继续运行thread.start()了


    }
}

