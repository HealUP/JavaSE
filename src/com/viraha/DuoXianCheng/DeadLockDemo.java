package com.viraha.DuoXianCheng;

import com.viraha.oop.TeXing.B;

//死锁：多个线程互相抱着对方需要的资源，形成僵持
public class DeadLockDemo {
    public static void main(String[] args) {
        Eating eating = new Eating(0,"条条");
        Eating eating2 = new Eating(1,"二泡");
        eating.start();
        eating2.start();
    }
}


//筷子
class Chopsticks{

}

//碗
class Bowl{

}

//吃饭
class Eating extends Thread {
    //需要的资源只有一份，static保证只有一份
    static Chopsticks chopsticks = new Chopsticks();
    static Bowl bowl = new Bowl();

    int choice;//选择
    String peopleName;//吃饭的人

    //构造方法
    Eating(int choice, String peopleName) {
        this.choice = choice;
        this.peopleName = peopleName;
    }
    //重写run（）方法

//重写run()，放入吃饭的方法 toEat()
    @Override
    public void run() {
        try {//捕获异常
            toEat();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

        //吃饭的方法 抛出异常
    public void toEat() throws InterruptedException {
        //吃饭，互相持有对方的锁
        if (choice == 0) {
            synchronized (chopsticks) {//获得筷子的锁
                System.out.println(this.peopleName + "获得筷子的锁了！");
                //1秒后，想获得碗的锁
                Thread.sleep(1000);
            /*    synchronized (bowl) {//获得碗的锁
                    System.out.println(this.peopleName + "获得碗的锁了！");
                }  取出外面来*/
            }
            synchronized (bowl) {//获得碗的锁
                System.out.println(this.peopleName + "获得碗的锁了！");
            }

        } else{
            synchronized (bowl){
                System.out.println(this.peopleName + "获得碗的锁了！");
                //2秒后，想获得碗的锁
                Thread.sleep(2000);
                /*synchronized (chopsticks) {//获得碗的锁
                    System.out.println(this.peopleName + "获得筷子的锁了！");
                }*/
            }
            synchronized (chopsticks) {//获得碗的锁
                System.out.println(this.peopleName + "获得筷子的锁了！");
            }
        }
    }
    }

    //避免了死锁的原理： 条条获得筷子的锁之后，释放筷子，再等待二泡把碗释放，条条再获得碗，二泡就获得筷子了