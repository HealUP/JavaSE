package com.viraha.DuoXianCheng;
//测试线程的优先级  getPriority()获取优先级   setPriority() 设置优先级
//给线程设置了优先级，不一定CPU就先调用，只是优先级高的先运行的概率大
//性能倒置：就是优先级低的比优先级高的多的先调用了
public class PriorityDemo {
        public static void main(String[] args) {
                //打印主线程的优先级
                System.out.println(Thread.currentThread().getName()+"优先级："+Thread.currentThread().getPriority());
                //创建接口的实现类的对象
                MyPriority myPriority = new MyPriority();

                Thread t0 = new Thread(myPriority);
                Thread t1 = new Thread(myPriority);
                Thread t2 = new Thread(myPriority);
                Thread t3 = new Thread(myPriority);
                Thread t4 = new Thread(myPriority);
                //先设置优先级,再启动
                t0.start();//默认

                t1.setPriority(1);
                t1.start();

                t2.setPriority(2);
                t2.start();

                t3.setPriority(3);
                t3.start();

                t4.setPriority(Thread.MAX_PRIORITY);//默认MAX_PRIORITY=10
                t4.start();

        }

        }

class MyPriority implements Runnable{
        @Override
        public void run() {
                System.out.println(Thread.currentThread().getName()+"优先级："+Thread.currentThread().getPriority());//获取线程的名字和优先级并打印
        }
}