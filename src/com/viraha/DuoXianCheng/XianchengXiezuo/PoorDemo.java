package com.viraha.DuoXianCheng.XianchengXiezuo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//线程池测试
// 执行部分：可以用 execute 或者submit ,execute 放入的时Ruannable接口的实现类，没有返回值   submit放入的是Callable的实现类 有返回值
public class PoorDemo {
    public static void main(String[] args) {
//        1.创建服务，创建线程池 newFixedThreadPool(10);//池子大小
        ExecutorService service = Executors.newFixedThreadPool(10);//池子大小
//        2、执行Runnalbe接口的实现类 放入到excute
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());

//        3、关闭服务
        service.shutdown();
    }

}

class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}