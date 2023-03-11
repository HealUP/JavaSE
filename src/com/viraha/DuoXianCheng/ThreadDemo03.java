package com.viraha.DuoXianCheng;
//多个线程同时操作一个对象
public class ThreadDemo03 implements Runnable{
    private int ticketNumbers = 20;

    //发现的问题，多个线程操作同一个资源的情况下，线程不安全，数据紊乱，其实是一个并发问题。后面的案例会解决
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
    //主线程main()
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
