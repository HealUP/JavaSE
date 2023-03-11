package com.viraha.DuoXianCheng;
//����߳�ͬʱ����һ������
public class ThreadDemo03 implements Runnable{
    private int ticketNumbers = 20;

    //���ֵ����⣬����̲߳���ͬһ����Դ������£��̲߳���ȫ���������ң���ʵ��һ���������⡣����İ�������
    @Override
    public void run() {
        while (true){
            if (ticketNumbers<=0){
                break;
            }
            //ģ����ʱ ����try catch�����쳣
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->>�����˵�"+ticketNumbers--+"Ʊ��");//currentThread()��ȡ��ǰ�̵߳�����.getName()
        }
    }
    //���߳�main()
    public static void main(String[] args) {
        //����һ���ӿ�ʵ����Ķ���
        ThreadDemo03 ticket = new ThreadDemo03();
        //����ӿ�ʵ����Ķ���Thread�ĵڶ������������߳�������
        new Thread(ticket,"��ţ1").start();
        new Thread(ticket,"��ţ2").start();
        new Thread(ticket,"��ţ3").start();
        new Thread(ticket,"��ţ4").start();
    }
}