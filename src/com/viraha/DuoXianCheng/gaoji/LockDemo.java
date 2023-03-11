package com.viraha.DuoXianCheng.gaoji;

import java.util.concurrent.locks.ReentrantLock;
//ReentrantLock��������
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
    //ȷ����ȫ������Lock��
    private final ReentrantLock lock = new ReentrantLock();

    //��Ʊ����
    @Override
    public void run() {

        while (true){
            try {
                lock.lock();//����  ʹ��try..finally��������
                if (tickerNumbers>0){
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"���˵�"+tickerNumbers--+"��Ʊ��");
                }else {
                    break;
                }
            }finally {
                lock.unlock();//����
            }
            }


    }
}