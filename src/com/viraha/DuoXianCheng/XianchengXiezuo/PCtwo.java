package com.viraha.DuoXianCheng.XianchengXiezuo;
//测试生产者消费者问题 通过标志位解决 信号灯法：就是设置了一个flag  标志位！
public class PCtwo {
    public static void main(String[] args) {
        Tv tv = new Tv();
        new Player(tv).start();
        new Watcher(tv).start();

    }

}
//两个子线程
//生产者 演员
class Player extends  Thread{
    Tv tv ;//生产者和消费者都需要创建一个TV的对象，来调用Tv的方法、属性
    //构造方法
    public Player(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if(i%2==0){
                this.tv.play("新闻联播正在播放中.....");
            }else {
                this.tv.play("广告播放中：今年过节不收礼呀，收礼就收老白金！");
            }
        }
    }
}


//消费者 观众
class Watcher extends Thread{
    Tv tv ;
    //构造方法
    public Watcher(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            tv.watch();//观众只管看
        }
    }
}

//产品 节目
class Tv {
    //演员表演，观众等待
    //观众观看，演员等待
    String voice;//表演的节目
    boolean flag = true;//标志位 初始化为true

    //表演
    public synchronized void play(String voice){
        if (!flag){//若为假，此时观众正在观看，演员要等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("演员:"+voice);
        //演员表演完，通知观众观看
        this.notifyAll();//通知唤醒
        this.voice = voice;//更新
        this.flag = !this.flag;//取反

    }

    //观看
    public synchronized void watch(){
        if (flag){//若为真，此时演员正在表演，观众要等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("观众观看:"+voice);
            //观看完，通知演员表演
            this.notifyAll();
            this.flag = !this.flag;//取反 更新标志位



    }

}