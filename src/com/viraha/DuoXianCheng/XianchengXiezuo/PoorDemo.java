package com.viraha.DuoXianCheng.XianchengXiezuo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//�̳߳ز���
// ִ�в��֣������� execute ����submit ,execute �����ʱRuannable�ӿڵ�ʵ���࣬û�з���ֵ   submit�������Callable��ʵ���� �з���ֵ
public class PoorDemo {
    public static void main(String[] args) {
//        1.�������񣬴����̳߳� newFixedThreadPool(10);//���Ӵ�С
        ExecutorService service = Executors.newFixedThreadPool(10);//���Ӵ�С
//        2��ִ��Runnalbe�ӿڵ�ʵ���� ���뵽excute
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());

//        3���رշ���
        service.shutdown();
    }

}

class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}