package com.viraha.DuoXianCheng;

//�����̷߳�ʽһ���̳�Thread�࣬��дrun��������,����strat()�����߳�
public class ThreadDemo extends Thread{
    @Override
    public void run() {
        //run�������߳���
        for (int i = 0; i < 25; i++) {
            System.out.println("��������"+i);
        }
    }

    public static void main(String[] args) {
        //���߳� main
        //����һ���̶߳���
        ThreadDemo threadDemo = new ThreadDemo();
        //����strat()���������̣߳�����ִ�е�
        //������run���������ǰ�˳��ִ��
        threadDemo.start();
//      threadDemo.run();���߳�
        for (int i = 0; i < 100; i++) {
            System.out.println("���̰߳���"+i);
        }
    }
}
