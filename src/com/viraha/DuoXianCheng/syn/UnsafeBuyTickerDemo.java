package com.viraha.DuoXianCheng.syn;

//案例：1 不安全的买票
public class UnsafeBuyTickerDemo {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        //多个线程访问同一个对象
        new Thread(buyTicket,"黄牛1").start();
        new Thread(buyTicket,"黄牛2").start();
        new Thread(buyTicket,"黄牛3").start();
    }
}

//买票接口实现类
class BuyTicket implements Runnable{
    //定义票的数量
    private int numbers = 10;
    boolean flag = true;//停止标识
    @Override
    public void run() {
        //重写run方法，调用买票方法
        while (flag){
            try {//这里调用了主动抛出异常的方法 buy()，所以要捕获  使用try...catch
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //定义买票方法
    private synchronized void buy() throws InterruptedException {
        //先判断 numbers，是否还有票
        if (numbers<=0){
            flag = false;
            return;
        }
        //模拟延时
        Thread.sleep(10000);
        //买票
        System.out.println(Thread.currentThread().getName()+"抢到第"+numbers--+"张票！");

    }
}
