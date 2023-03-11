package com.viraha.DuoXianCheng;
//守护线程  用户线程和守护线程（main,gc垃圾回收线程）
//案例：太阳永远照射着地球
//三个独立的类
public class daemonDemo {
    public static void main(String[] args) {
        //创建接口的实现类的对象
        Sun sun = new Sun();
        Earth earth = new Earth();
        //传入接口的实现类的对象
        Thread t1 = new Thread(sun);
        t1.setDaemon(true);//通过setDaemon(true)，设置守护线程  默认是false，为用户线程
        t1.start();//太阳守护线程启动


        /*Thread t2 = new Thread(earth);
        t2.start();*/
        //简化写为
        new Thread(earth).start();//地球用户线程启动
    }

}


    //太阳
 class Sun implements Runnable {
    @Override
    public void run() {
        while (true)
            System.out.println("太阳散发着光芒！！");
    }
}


    //地球
    class Earth implements Runnable {
        @Override
        public void run() {
            //地球始终也会毁灭！设置一个时间
            for (int i = 0; i < 10; i++) {
                System.out.println("地球转了" + i + "万亿年");
            }
            System.out.println("==========地球毁灭===========");
        }
    }
//守护进程：虚拟机不用等待守护进程执行完毕，用户进程执行完毕，虚拟机就会关闭了。
// 最后守护进程还执行了一会，是因为虚拟机关闭也需要一定的时间！

