package com.viraha.DuoXianCheng.gaoji;

import java.util.concurrent.locks.ReentrantLock;
//ReentrantLock可重入锁
public class LockDemo {
    public static void main(String[] args) {
        Lock2 lock2 =new Lock2();
        new Thread(lock2,"h1").start();
        new Thread(lock2,"h2").start();
        new Thread(lock2,"h3").start();
    }
}
class  Lock2 implements Runnable{
    int tickerNumbers = 100;
    //确保安全，定义Lock锁
    private final ReentrantLock lock = new ReentrantLock();

    //买票方法
    @Override
    public void run() {

        while (true){
            try {
                lock.lock();//加锁  使用try..finally代码块包裹
                if (tickerNumbers>0){
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"抢了第"+tickerNumbers--+"张票！");
                }else {
                    break;
                }
            }finally {
                lock.unlock();//解锁
            }
            }


    }
}