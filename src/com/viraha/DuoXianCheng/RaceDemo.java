package com.viraha.DuoXianCheng;
//模拟龟兔赛跑
public class RaceDemo implements Runnable {
    //胜利者只有一个，用static
    private static String winner;
    //重写run()
    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            //当前线程是兔子的时候，每10步让他休息会，让乌龟线程先跑
            if (Thread.currentThread().getName().equals("兔子")&&i%10==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //判断比赛是否结束
            Boolean flag = gameOver(i);
            if (flag){//为true则比赛结束了,退出程序
                break;
            }
            System.out.println(Thread.currentThread().getName()+"-->>跑了"+i+"步");
        }
    }
    //判断是否完成比赛
    private boolean gameOver(int steps) {
        //判断胜利者是否存在

        if (winner != null) {//说明存在胜利者了
            return true;
        }
        {
            if (steps >= 100) {
                winner = Thread.currentThread().getName();//获取当前线程的名字
                System.out.println("winner is " + winner);
                return true;
            }
        }
        return false;
    }


    //main()主线程
    public static void main(String[] args) {
        RaceDemo raceDemo = new RaceDemo();
        new Thread(raceDemo,"兔子").start();
        new Thread(raceDemo,"乌龟").start();
    }
}
