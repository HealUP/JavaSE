package com.viraha.DuoXianCheng;
//线程休眠（需要捕获异常），解决ThreadDemo03发现的问题

public class SleepDemo implements Runnable {
    private int ticketNumbers = 20;
    @Override
    public void run() {
        while (true){
            if (ticketNumbers<=0){
                break;
            }
            //模拟延时 添加try catch捕获异常
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->>抢到了第"+ticketNumbers--+"票！");//currentThread()获取当前线程的名字.getName()
        }
    }

    public static void main(String[] args) {
        //创建一个接口实现类的对象
        ThreadDemo03 ticket = new ThreadDemo03();
        //传入接口实现类的对象，Thread的第二个参数，给线程起名字
        new Thread(ticket,"黄牛1").start();
        new Thread(ticket,"黄牛2").start();
        new Thread(ticket,"黄牛3").start();
        new Thread(ticket,"黄牛4").start();
    }
}
