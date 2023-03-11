package com.viraha.DuoXianCheng;
//强制执行
public class JoinDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+i+"线程来了！");
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        //启动线程
        JoinDemo joinDemo = new JoinDemo();
        Thread thread = new Thread(joinDemo,"vip");
        thread.start();

        //主线程
        for (int i = 0; i < 500; i++) {
            if (i==300){
                thread.join();//vip线程插队 抛出异常
            }
            System.out.println("main"+i);//只有vip线程执行完了，main主线程才继续执行！
        }
    }
}
