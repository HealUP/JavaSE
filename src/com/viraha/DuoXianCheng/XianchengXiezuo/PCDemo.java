package com.viraha.DuoXianCheng.XianchengXiezuo;
//测试：生产者消费者模型
//解决1：缓冲区：管程法
public class PCDemo {
    public static void main(String[] args) {//写法不太懂
        SynContainer synContainer = new SynContainer();
        new Producer(synContainer).start();
        new Consumer(synContainer).start();
    }

}

//生产者
class  Producer extends Thread{
    SynContainer container;//需要一个容器
    //构造器
    public Producer(SynContainer container){
        this.container = container;
    }
    //生产方法

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("生产了"+i+"只鸡！");
            container.push(new Chicken(i));//生产鸡，传入构造器，编号为id
        }
    }
}

//消费者
class Consumer extends  Thread{
    SynContainer container;//需要一个容器
    //构造器
    public Consumer(SynContainer container){
        this.container = container;
    }
    //消费
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了"+container.pop().id+"只鸡");
        }
    }
}

//产品
class Chicken {
        int id;//产品的编号
        //构造方法
        public Chicken(int id){
            this.id = id;
        }

}

//缓冲区：
class  SynContainer{
    //缓冲区大小
    Chicken[] chickens = new Chicken[10];
    //计数
    int count = 0;//放入产品的时候，用来计算鸡的数目

    //生产者放入产品，同步方法 synchronized
    public synchronized void push(Chicken chicken){
        //放入前判断容器有没有满  满了要等待消费者消费
        while (count == chickens.length){////避免脏判断，不用if 用while
            //通知消费者消费，生产等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            //如果没有满，需要放入产品，即鸡
            chickens[count] = chicken;
            count++;

            //一有鸡，马上通知消费者消费
            this.notifyAll();

    }
    //消费者消费产品
    public synchronized Chicken pop(){
        //判断能否消费，即要判断容器是否没鸡，即是否为空
        while (count == 0){//避免脏判断，不用if
            //等待生产者生产，消费者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果可以消费，
        count--;
        Chicken chicken = chickens[count];
        //消费完了，通知生产者生产
        this.notifyAll();
        return chicken;//返回的是一个鸡的对象，包含一个鸡的id
        //

    }

}


