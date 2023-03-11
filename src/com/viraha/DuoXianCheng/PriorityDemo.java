package com.viraha.DuoXianCheng;
//�����̵߳����ȼ�  getPriority()��ȡ���ȼ�   setPriority() �������ȼ�
//���߳����������ȼ�����һ��CPU���ȵ��ã�ֻ�����ȼ��ߵ������еĸ��ʴ�
//���ܵ��ã��������ȼ��͵ı����ȼ��ߵĶ���ȵ�����
public class PriorityDemo {
        public static void main(String[] args) {
                //��ӡ���̵߳����ȼ�
                System.out.println(Thread.currentThread().getName()+"���ȼ���"+Thread.currentThread().getPriority());
                //�����ӿڵ�ʵ����Ķ���
                MyPriority myPriority = new MyPriority();

                Thread t0 = new Thread(myPriority);
                Thread t1 = new Thread(myPriority);
                Thread t2 = new Thread(myPriority);
                Thread t3 = new Thread(myPriority);
                Thread t4 = new Thread(myPriority);
                //���������ȼ�,������
                t0.start();//Ĭ��

                t1.setPriority(1);
                t1.start();

                t2.setPriority(2);
                t2.start();

                t3.setPriority(3);
                t3.start();

                t4.setPriority(Thread.MAX_PRIORITY);//Ĭ��MAX_PRIORITY=10
                t4.start();

        }

        }

class MyPriority implements Runnable{
        @Override
        public void run() {
                System.out.println(Thread.currentThread().getName()+"���ȼ���"+Thread.currentThread().getPriority());//��ȡ�̵߳����ֺ����ȼ�����ӡ
        }
}