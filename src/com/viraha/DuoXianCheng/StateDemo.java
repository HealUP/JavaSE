package com.viraha.DuoXianCheng;

public class StateDemo {
    public static void main(String[] args) throws InterruptedException {
        //lambda���ʽ
        Thread thread = new Thread(()->{
            //����forѭ���������ǣ��ȴ�5�� ��Ϊÿһ��ѭ�����ȴ�1��  5s���߳���ֹ��
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1200);//sleep��Ҫ�����쳣
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("�߳���ֹ�ˣ�////////");

        });
        //1���۲�״̬
        Thread.State state = thread.getState();
        System.out.println(state);//�մ����ǻ�  ��NEW

        //2���۲�������state��״̬  ��ӡ����
        thread.start();//�����߳�

        state = thread.getState();
        System.out.println(state);//�߳������� ����RUNNABLE��˵�������ˣ�Ȼ���߳̿�ʼ�ȴ�5���ӣ�һֱ��ȡ��ǰ״̬����һֱ���TIMED_WAITING

        while (state!=Thread.State.TERMINATED){
            //ֻҪ�̲߳���ֹ����һֱ���״̬
            Thread.sleep(1000);//�����߳���ʱ����Ҫ���߳�ͬʱִ�У� ���߳���ִ�У�ȷ��һ��ʼ��ӡ��������1��2
            state = thread.getState();//�����߳�״̬
            System.out.println(state);//���ȴ���TIMED_WAITING
        }
        System.out.println("���߳�Ҳ��ֹ�ˣ���Ϊ��һ��state��TERMINATED��������while�ˣ�");
        //�߳�ֻ������һ�Σ�ֹ֮ͣ�������������  ���ܼ�������thread.start()��


    }
}

