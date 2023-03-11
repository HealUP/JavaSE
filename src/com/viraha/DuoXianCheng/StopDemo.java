package com.viraha.DuoXianCheng;

//线程停止 测试stop
public class StopDemo implements Runnable {
//1、设置一个标识位
    private boolean flag = true;
//重写的run()方法只管增加i,需要停止的话，先写一个stop方法，在main()方法中设置停止
    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println("running...Thread"+i++);
        }
    }
//2、设置一个公开的方法，转换标识位

    public void stop(){
        this.flag = false;
    }
//main主线程
    public static void main(String[] args) {
        StopDemo stopDemo = new StopDemo();
        new Thread(stopDemo).start();//这里只要flag为true就会一直循环，不断增加i
        //设定i为500时，线程调用stop()方法，该表标识位  线程停止
        //因为时线程，for语句和new Thread(stopDemo).start()会同时运行
        for (int i = 0; i < 1000; i++) {
            System.out.println("mian的i="+i);
            if (i==500){
                stopDemo.stop();
                System.out.println("该线程停止了！");
            }
        }

    }
}
