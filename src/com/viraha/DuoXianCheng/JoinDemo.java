package com.viraha.DuoXianCheng;
//ǿ��ִ��
public class JoinDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+i+"�߳����ˣ�");
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        //�����߳�
        JoinDemo joinDemo = new JoinDemo();
        Thread thread = new Thread(joinDemo,"vip");
        thread.start();

        //���߳�
        for (int i = 0; i < 500; i++) {
            if (i==300){
                thread.join();//vip�̲߳�� �׳��쳣
            }
            System.out.println("main"+i);//ֻ��vip�߳�ִ�����ˣ�main���̲߳ż���ִ�У�
        }
    }
}
